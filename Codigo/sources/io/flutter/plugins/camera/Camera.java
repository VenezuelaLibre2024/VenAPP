package io.flutter.plugins.camera;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.media.Image;
import android.media.ImageReader;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Size;
import android.view.Display;
import android.view.Surface;
import com.google.android.libraries.barhopper.RecognitionOptions;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.camera.Camera;
import io.flutter.plugins.camera.CameraCaptureCallback;
import io.flutter.plugins.camera.ImageSaver;
import io.flutter.plugins.camera.features.CameraFeature;
import io.flutter.plugins.camera.features.CameraFeatureFactory;
import io.flutter.plugins.camera.features.CameraFeatures;
import io.flutter.plugins.camera.features.Point;
import io.flutter.plugins.camera.features.autofocus.AutoFocusFeature;
import io.flutter.plugins.camera.features.autofocus.FocusMode;
import io.flutter.plugins.camera.features.exposurelock.ExposureLockFeature;
import io.flutter.plugins.camera.features.exposurelock.ExposureMode;
import io.flutter.plugins.camera.features.exposureoffset.ExposureOffsetFeature;
import io.flutter.plugins.camera.features.exposurepoint.ExposurePointFeature;
import io.flutter.plugins.camera.features.flash.FlashFeature;
import io.flutter.plugins.camera.features.flash.FlashMode;
import io.flutter.plugins.camera.features.focuspoint.FocusPointFeature;
import io.flutter.plugins.camera.features.resolution.ResolutionFeature;
import io.flutter.plugins.camera.features.resolution.ResolutionPreset;
import io.flutter.plugins.camera.features.sensororientation.DeviceOrientationManager;
import io.flutter.plugins.camera.features.zoomlevel.ZoomLevelFeature;
import io.flutter.plugins.camera.media.ImageStreamReader;
import io.flutter.plugins.camera.media.MediaRecorderBuilder;
import io.flutter.plugins.camera.types.CameraCaptureProperties;
import io.flutter.plugins.camera.types.CaptureTimeoutsWrapper;
import io.flutter.view.TextureRegistry;
import java.io.File;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public class Camera implements CameraCaptureCallback.CameraCaptureStateListener, ImageReader.OnImageAvailableListener {
    private static final String TAG = "Camera";
    private static final HashMap<String, Integer> supportedImageFormats;
    private final Activity activity;
    private final Context applicationContext;
    Handler backgroundHandler;
    private HandlerThread backgroundHandlerThread;
    private final CameraCaptureCallback cameraCaptureCallback;
    CameraDeviceWrapper cameraDevice;
    private final CameraFeatureFactory cameraFeatureFactory;
    CameraFeatures cameraFeatures;
    private CameraProperties cameraProperties;
    private File captureFile;
    private CameraCaptureProperties captureProps;
    CameraCaptureSession captureSession;
    private CaptureTimeoutsWrapper captureTimeouts;
    final DartMessenger dartMessenger;
    private final boolean enableAudio;
    MethodChannel.Result flutterResult;
    private final TextureRegistry.SurfaceTextureEntry flutterTexture;
    private String imageFormatGroup;
    ImageStreamReader imageStreamReader;
    private int initialCameraFacing;
    private MediaRecorder mediaRecorder;
    private boolean pausedPreview;
    private ImageReader pictureImageReader;
    CaptureRequest.Builder previewRequestBuilder;
    boolean recordingVideo;
    private final ResolutionPreset resolutionPreset;
    private VideoRenderer videoRenderer;

    /* renamed from: io.flutter.plugins.camera.Camera$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 extends CameraDevice.StateCallback {
        final /* synthetic */ ResolutionFeature val$resolutionFeature;

        AnonymousClass1(ResolutionFeature resolutionFeature) {
            r2 = resolutionFeature;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Log.i(Camera.TAG, "open | onClosed");
            Camera camera = Camera.this;
            camera.cameraDevice = null;
            camera.closeCaptureSession();
            Camera.this.dartMessenger.sendCameraClosingEvent();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Log.i(Camera.TAG, "open | onDisconnected");
            Camera.this.close();
            Camera.this.dartMessenger.sendCameraErrorEvent("The camera was disconnected.");
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            Log.i(Camera.TAG, "open | onError");
            Camera.this.close();
            Camera.this.dartMessenger.sendCameraErrorEvent(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Unknown camera error" : "The camera service has encountered a fatal error." : "The camera device has encountered a fatal error" : "The camera device could not be opened due to a device policy." : "Max cameras in use" : "The camera device is in use already.");
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Camera camera = Camera.this;
            camera.cameraDevice = new DefaultCameraDeviceWrapper(cameraDevice);
            try {
                Camera.this.startPreview();
                Camera camera2 = Camera.this;
                if (camera2.recordingVideo) {
                    return;
                }
                camera2.dartMessenger.sendCameraInitializedEvent(Integer.valueOf(r2.getPreviewSize().getWidth()), Integer.valueOf(r2.getPreviewSize().getHeight()), Camera.this.cameraFeatures.getExposureLock().getValue(), Camera.this.cameraFeatures.getAutoFocus().getValue(), Boolean.valueOf(Camera.this.cameraFeatures.getExposurePoint().checkIsSupported()), Boolean.valueOf(Camera.this.cameraFeatures.getFocusPoint().checkIsSupported()));
            } catch (Exception e10) {
                Camera.this.dartMessenger.sendCameraErrorEvent(e10.getMessage());
                Camera.this.close();
            }
        }
    }

    /* renamed from: io.flutter.plugins.camera.Camera$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 extends CameraCaptureSession.StateCallback {
        boolean captureSessionClosed = false;
        final /* synthetic */ Runnable val$onSuccessCallback;

        AnonymousClass2(Runnable runnable) {
            this.val$onSuccessCallback = runnable;
        }

        public /* synthetic */ void lambda$onConfigured$0(String str, String str2) {
            Camera.this.dartMessenger.sendCameraErrorEvent(str2);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            Log.i(Camera.TAG, "CameraCaptureSession onClosed");
            this.captureSessionClosed = true;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            Log.i(Camera.TAG, "CameraCaptureSession onConfigureFailed");
            Camera.this.dartMessenger.sendCameraErrorEvent("Failed to configure camera session.");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            Log.i(Camera.TAG, "CameraCaptureSession onConfigured");
            Camera camera = Camera.this;
            if (camera.cameraDevice == null || this.captureSessionClosed) {
                camera.dartMessenger.sendCameraErrorEvent("The camera was closed during configuration.");
                return;
            }
            camera.captureSession = cameraCaptureSession;
            Log.i(Camera.TAG, "Updating builder settings");
            Camera camera2 = Camera.this;
            camera2.updateBuilderSettings(camera2.previewRequestBuilder);
            Camera.this.refreshPreviewCaptureSession(this.val$onSuccessCallback, new ErrorCallback() { // from class: io.flutter.plugins.camera.q
                public /* synthetic */ q() {
                }

                @Override // io.flutter.plugins.camera.ErrorCallback
                public final void onError(String str, String str2) {
                    Camera.AnonymousClass2.this.lambda$onConfigured$0(str, str2);
                }
            });
        }
    }

    /* renamed from: io.flutter.plugins.camera.Camera$3 */
    /* loaded from: classes3.dex */
    public class AnonymousClass3 extends CameraCaptureSession.CaptureCallback {
        AnonymousClass3() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            Camera.this.unlockAutoFocus();
        }
    }

    /* renamed from: io.flutter.plugins.camera.Camera$4 */
    /* loaded from: classes3.dex */
    class AnonymousClass4 implements ImageSaver.Callback {
        AnonymousClass4() {
        }

        @Override // io.flutter.plugins.camera.ImageSaver.Callback
        public void onComplete(String str) {
            Camera camera = Camera.this;
            camera.dartMessenger.finish(camera.flutterResult, str);
        }

        @Override // io.flutter.plugins.camera.ImageSaver.Callback
        public void onError(String str, String str2) {
            Camera camera = Camera.this;
            camera.dartMessenger.error(camera.flutterResult, str, str2, null);
        }
    }

    /* renamed from: io.flutter.plugins.camera.Camera$5 */
    /* loaded from: classes3.dex */
    public class AnonymousClass5 implements EventChannel.StreamHandler {
        AnonymousClass5() {
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onCancel(Object obj) {
            Camera camera = Camera.this;
            ImageStreamReader imageStreamReader = camera.imageStreamReader;
            if (imageStreamReader == null) {
                return;
            }
            imageStreamReader.removeListener(camera.backgroundHandler);
        }

        @Override // io.flutter.plugin.common.EventChannel.StreamHandler
        public void onListen(Object obj, EventChannel.EventSink eventSink) {
            Camera.this.setImageStreamImageAvailableListener(eventSink);
        }
    }

    /* renamed from: io.flutter.plugins.camera.Camera$6 */
    /* loaded from: classes3.dex */
    public class AnonymousClass6 implements Thread.UncaughtExceptionHandler {
        AnonymousClass6() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            Camera.this.dartMessenger.sendCameraErrorEvent("Failed to process frames after camera was flipped.");
        }
    }

    /* renamed from: io.flutter.plugins.camera.Camera$7 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass7 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$camera$features$autofocus$FocusMode;

        static {
            int[] iArr = new int[FocusMode.values().length];
            $SwitchMap$io$flutter$plugins$camera$features$autofocus$FocusMode = iArr;
            try {
                iArr[FocusMode.locked.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$camera$features$autofocus$FocusMode[FocusMode.auto.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    private class DefaultCameraDeviceWrapper implements CameraDeviceWrapper {
        private final CameraDevice cameraDevice;

        DefaultCameraDeviceWrapper(CameraDevice cameraDevice) {
            this.cameraDevice = cameraDevice;
        }

        @Override // io.flutter.plugins.camera.CameraDeviceWrapper
        public void close() {
            this.cameraDevice.close();
        }

        @Override // io.flutter.plugins.camera.CameraDeviceWrapper
        public CaptureRequest.Builder createCaptureRequest(int i10) {
            return this.cameraDevice.createCaptureRequest(i10);
        }

        @Override // io.flutter.plugins.camera.CameraDeviceWrapper
        public void createCaptureSession(SessionConfiguration sessionConfiguration) {
            this.cameraDevice.createCaptureSession(sessionConfiguration);
        }

        @Override // io.flutter.plugins.camera.CameraDeviceWrapper
        public void createCaptureSession(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler) {
            this.cameraDevice.createCaptureSession(list, stateCallback, Camera.this.backgroundHandler);
        }
    }

    /* loaded from: classes3.dex */
    public static class HandlerFactory {
        HandlerFactory() {
        }

        public static Handler create(Looper looper) {
            return new Handler(looper);
        }
    }

    /* loaded from: classes3.dex */
    public static class HandlerThreadFactory {
        HandlerThreadFactory() {
        }

        public static HandlerThread create(String str) {
            return new HandlerThread(str);
        }
    }

    static {
        HashMap<String, Integer> hashMap = new HashMap<>();
        supportedImageFormats = hashMap;
        hashMap.put("yuv420", 35);
        hashMap.put("jpeg", Integer.valueOf(RecognitionOptions.QR_CODE));
        hashMap.put("nv21", 17);
    }

    public Camera(Activity activity, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, CameraFeatureFactory cameraFeatureFactory, DartMessenger dartMessenger, CameraProperties cameraProperties, ResolutionPreset resolutionPreset, boolean z10) {
        if (activity == null) {
            throw new IllegalStateException("No activity available!");
        }
        this.activity = activity;
        this.enableAudio = z10;
        this.flutterTexture = surfaceTextureEntry;
        this.dartMessenger = dartMessenger;
        this.applicationContext = activity.getApplicationContext();
        this.cameraProperties = cameraProperties;
        this.cameraFeatureFactory = cameraFeatureFactory;
        this.resolutionPreset = resolutionPreset;
        this.cameraFeatures = CameraFeatures.init(cameraFeatureFactory, cameraProperties, activity, dartMessenger, resolutionPreset);
        this.captureTimeouts = new CaptureTimeoutsWrapper(3000L, 3000L);
        CameraCaptureProperties cameraCaptureProperties = new CameraCaptureProperties();
        this.captureProps = cameraCaptureProperties;
        this.cameraCaptureCallback = CameraCaptureCallback.create(this, this.captureTimeouts, cameraCaptureProperties);
        startBackgroundThread();
    }

    private void closeRenderer() {
        VideoRenderer videoRenderer = this.videoRenderer;
        if (videoRenderer != null) {
            videoRenderer.close();
            this.videoRenderer = null;
        }
    }

    private void createCaptureSession(int i10, Runnable runnable, Surface... surfaceArr) {
        this.captureSession = null;
        this.previewRequestBuilder = this.cameraDevice.createCaptureRequest(i10);
        ResolutionFeature resolution = this.cameraFeatures.getResolution();
        SurfaceTexture surfaceTexture = this.flutterTexture.surfaceTexture();
        surfaceTexture.setDefaultBufferSize(resolution.getPreviewSize().getWidth(), resolution.getPreviewSize().getHeight());
        Surface surface = new Surface(surfaceTexture);
        this.previewRequestBuilder.addTarget(surface);
        List<Surface> asList = Arrays.asList(surfaceArr);
        if (i10 != 1) {
            Surface surface2 = this.pictureImageReader.getSurface();
            for (Surface surface3 : asList) {
                if (surface3 != surface2) {
                    this.previewRequestBuilder.addTarget(surface3);
                }
            }
        }
        Size cameraBoundaries = CameraRegionUtils.getCameraBoundaries(this.cameraProperties, this.previewRequestBuilder);
        this.cameraFeatures.getExposurePoint().setCameraBoundaries(cameraBoundaries);
        this.cameraFeatures.getFocusPoint().setCameraBoundaries(cameraBoundaries);
        CameraCaptureSession.StateCallback anonymousClass2 = new AnonymousClass2(runnable);
        if (!SdkCapabilityChecker.supportsSessionConfiguration()) {
            List<Surface> arrayList = new ArrayList<>();
            arrayList.add(surface);
            arrayList.addAll(asList);
            createCaptureSession(arrayList, anonymousClass2);
            return;
        }
        List<OutputConfiguration> arrayList2 = new ArrayList<>();
        arrayList2.add(new OutputConfiguration(surface));
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new OutputConfiguration((Surface) it.next()));
        }
        createCaptureSessionWithSessionConfig(arrayList2, anonymousClass2);
    }

    private void createCaptureSession(List<Surface> list, CameraCaptureSession.StateCallback stateCallback) {
        this.cameraDevice.createCaptureSession(list, stateCallback, this.backgroundHandler);
    }

    private void createCaptureSessionWithSessionConfig(List<OutputConfiguration> list, CameraCaptureSession.StateCallback stateCallback) {
        this.cameraDevice.createCaptureSession(new SessionConfiguration(0, list, Executors.newSingleThreadExecutor(), stateCallback));
    }

    private Display getDefaultDisplay() {
        return this.activity.getWindowManager().getDefaultDisplay();
    }

    public /* synthetic */ void lambda$resumePreview$15(String str, String str2) {
        this.dartMessenger.sendCameraErrorEvent(str2);
    }

    public /* synthetic */ void lambda$runPrecaptureSequence$1(String str, String str2) {
        this.dartMessenger.error(this.flutterResult, "cameraAccess", str2, null);
    }

    public static /* synthetic */ void lambda$setExposureOffset$11(MethodChannel.Result result, ExposureOffsetFeature exposureOffsetFeature) {
        result.success(exposureOffsetFeature.getValue());
    }

    public /* synthetic */ void lambda$startCapture$0() {
        this.mediaRecorder.start();
    }

    public /* synthetic */ void lambda$unlockAutoFocus$2(String str, String str2) {
        this.dartMessenger.error(this.flutterResult, str, str2, null);
    }

    private void lockAutoFocus() {
        Log.i(TAG, "lockAutoFocus");
        if (this.captureSession == null) {
            Log.i(TAG, "[unlockAutoFocus] captureSession null, returning");
            return;
        }
        this.previewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        try {
            this.captureSession.capture(this.previewRequestBuilder.build(), null, this.backgroundHandler);
        } catch (CameraAccessException e10) {
            this.dartMessenger.sendCameraErrorEvent(e10.getMessage());
        }
    }

    private void prepareMediaRecorder(String str) {
        Log.i(TAG, "prepareMediaRecorder");
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder != null) {
            mediaRecorder.release();
        }
        closeRenderer();
        PlatformChannel.DeviceOrientation lockedCaptureOrientation = this.cameraFeatures.getSensorOrientation().getLockedCaptureOrientation();
        this.mediaRecorder = ((!SdkCapabilityChecker.supportsEncoderProfiles() || getRecordingProfile() == null) ? new MediaRecorderBuilder(getRecordingProfileLegacy(), str) : new MediaRecorderBuilder(getRecordingProfile(), str)).setEnableAudio(this.enableAudio).setMediaOrientation(lockedCaptureOrientation == null ? getDeviceOrientationManager().getVideoOrientation() : getDeviceOrientationManager().getVideoOrientation(lockedCaptureOrientation)).build();
    }

    private void prepareVideoRenderer() {
        if (this.videoRenderer != null) {
            return;
        }
        ResolutionFeature resolution = this.cameraFeatures.getResolution();
        this.videoRenderer = new VideoRenderer(this.mediaRecorder.getSurface(), resolution.getCaptureSize().getWidth(), resolution.getCaptureSize().getHeight(), new Thread.UncaughtExceptionHandler() { // from class: io.flutter.plugins.camera.Camera.6
            AnonymousClass6() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th2) {
                Camera.this.dartMessenger.sendCameraErrorEvent("Failed to process frames after camera was flipped.");
            }
        });
    }

    private void runPictureAutoFocus() {
        Log.i(TAG, "runPictureAutoFocus");
        this.cameraCaptureCallback.setCameraState(CameraState.STATE_WAITING_FOCUS);
        lockAutoFocus();
    }

    private void runPrecaptureSequence() {
        Log.i(TAG, "runPrecaptureSequence");
        try {
            this.previewRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 0);
            this.captureSession.capture(this.previewRequestBuilder.build(), this.cameraCaptureCallback, this.backgroundHandler);
            refreshPreviewCaptureSession(null, new ErrorCallback() { // from class: io.flutter.plugins.camera.p
                public /* synthetic */ p() {
                }

                @Override // io.flutter.plugins.camera.ErrorCallback
                public final void onError(String str, String str2) {
                    Camera.this.lambda$runPrecaptureSequence$1(str, str2);
                }
            });
            this.cameraCaptureCallback.setCameraState(CameraState.STATE_WAITING_PRECAPTURE_START);
            this.previewRequestBuilder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
            this.captureSession.capture(this.previewRequestBuilder.build(), this.cameraCaptureCallback, this.backgroundHandler);
        } catch (CameraAccessException e10) {
            e10.printStackTrace();
        }
    }

    private void setStreamHandler(EventChannel eventChannel) {
        eventChannel.setStreamHandler(new EventChannel.StreamHandler() { // from class: io.flutter.plugins.camera.Camera.5
            AnonymousClass5() {
            }

            @Override // io.flutter.plugin.common.EventChannel.StreamHandler
            public void onCancel(Object obj) {
                Camera camera = Camera.this;
                ImageStreamReader imageStreamReader = camera.imageStreamReader;
                if (imageStreamReader == null) {
                    return;
                }
                imageStreamReader.removeListener(camera.backgroundHandler);
            }

            @Override // io.flutter.plugin.common.EventChannel.StreamHandler
            public void onListen(Object obj, EventChannel.EventSink eventSink) {
                Camera.this.setImageStreamImageAvailableListener(eventSink);
            }
        });
    }

    private void startCapture(boolean z10, boolean z11) {
        o oVar;
        ImageStreamReader imageStreamReader;
        ArrayList arrayList = new ArrayList();
        if (z10) {
            arrayList.add(this.mediaRecorder.getSurface());
            oVar = new Runnable() { // from class: io.flutter.plugins.camera.o
                public /* synthetic */ o() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Camera.this.lambda$startCapture$0();
                }
            };
        } else {
            oVar = null;
        }
        if (z11 && (imageStreamReader = this.imageStreamReader) != null) {
            arrayList.add(imageStreamReader.getSurface());
        }
        arrayList.add(this.pictureImageReader.getSurface());
        createCaptureSession(3, oVar, (Surface[]) arrayList.toArray(new Surface[0]));
    }

    private void startPreviewWithVideoRendererStream() {
        if (this.videoRenderer == null) {
            return;
        }
        PlatformChannel.DeviceOrientation lockedCaptureOrientation = this.cameraFeatures.getSensorOrientation().getLockedCaptureOrientation();
        DeviceOrientationManager deviceOrientationManager = this.cameraFeatures.getSensorOrientation().getDeviceOrientationManager();
        int videoOrientation = deviceOrientationManager != null ? lockedCaptureOrientation == null ? deviceOrientationManager.getVideoOrientation() : deviceOrientationManager.getVideoOrientation(lockedCaptureOrientation) : 0;
        if (this.cameraProperties.getLensFacing() != this.initialCameraFacing) {
            videoOrientation = (videoOrientation + 180) % 360;
        }
        this.videoRenderer.setRotation(videoOrientation);
        createCaptureSession(3, this.videoRenderer.getInputSurface());
    }

    private void startRegularPreview() {
        ImageReader imageReader = this.pictureImageReader;
        if (imageReader == null || imageReader.getSurface() == null) {
            return;
        }
        Log.i(TAG, "startPreview");
        createCaptureSession(1, this.pictureImageReader.getSurface());
    }

    private void stopAndReleaseCamera() {
        CameraDeviceWrapper cameraDeviceWrapper = this.cameraDevice;
        if (cameraDeviceWrapper == null) {
            closeCaptureSession();
            return;
        }
        cameraDeviceWrapper.close();
        this.cameraDevice = null;
        this.captureSession = null;
    }

    private void takePictureAfterPrecapture() {
        Log.i(TAG, "captureStillPicture");
        this.cameraCaptureCallback.setCameraState(CameraState.STATE_CAPTURING);
        CameraDeviceWrapper cameraDeviceWrapper = this.cameraDevice;
        if (cameraDeviceWrapper == null) {
            return;
        }
        try {
            CaptureRequest.Builder createCaptureRequest = cameraDeviceWrapper.createCaptureRequest(2);
            createCaptureRequest.addTarget(this.pictureImageReader.getSurface());
            CaptureRequest.Key key = CaptureRequest.SCALER_CROP_REGION;
            createCaptureRequest.set(key, (Rect) this.previewRequestBuilder.get(key));
            updateBuilderSettings(createCaptureRequest);
            PlatformChannel.DeviceOrientation lockedCaptureOrientation = this.cameraFeatures.getSensorOrientation().getLockedCaptureOrientation();
            createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(lockedCaptureOrientation == null ? getDeviceOrientationManager().getPhotoOrientation() : getDeviceOrientationManager().getPhotoOrientation(lockedCaptureOrientation)));
            AnonymousClass3 anonymousClass3 = new CameraCaptureSession.CaptureCallback() { // from class: io.flutter.plugins.camera.Camera.3
                AnonymousClass3() {
                }

                @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
                public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    Camera.this.unlockAutoFocus();
                }
            };
            try {
                Log.i(TAG, "sending capture request");
                this.captureSession.capture(createCaptureRequest.build(), anonymousClass3, this.backgroundHandler);
            } catch (CameraAccessException e10) {
                this.dartMessenger.error(this.flutterResult, "cameraAccess", e10.getMessage(), null);
            }
        } catch (CameraAccessException e11) {
            this.dartMessenger.error(this.flutterResult, "cameraAccess", e11.getMessage(), null);
        }
    }

    public void close() {
        Log.i(TAG, "close");
        stopAndReleaseCamera();
        ImageReader imageReader = this.pictureImageReader;
        if (imageReader != null) {
            imageReader.close();
            this.pictureImageReader = null;
        }
        ImageStreamReader imageStreamReader = this.imageStreamReader;
        if (imageStreamReader != null) {
            imageStreamReader.close();
            this.imageStreamReader = null;
        }
        MediaRecorder mediaRecorder = this.mediaRecorder;
        if (mediaRecorder != null) {
            mediaRecorder.reset();
            this.mediaRecorder.release();
            this.mediaRecorder = null;
        }
        stopBackgroundThread();
    }

    void closeCaptureSession() {
        if (this.captureSession != null) {
            Log.i(TAG, "closeCaptureSession");
            this.captureSession.close();
            this.captureSession = null;
        }
    }

    void createCaptureSession(int i10, Surface... surfaceArr) {
        createCaptureSession(i10, null, surfaceArr);
    }

    public void dispose() {
        Log.i(TAG, "dispose");
        close();
        this.flutterTexture.release();
        getDeviceOrientationManager().stop();
    }

    DeviceOrientationManager getDeviceOrientationManager() {
        return this.cameraFeatures.getSensorOrientation().getDeviceOrientationManager();
    }

    public double getExposureOffsetStepSize() {
        return this.cameraFeatures.getExposureOffset().getExposureOffsetStepSize();
    }

    public double getMaxExposureOffset() {
        return this.cameraFeatures.getExposureOffset().getMaxExposureOffset();
    }

    public float getMaxZoomLevel() {
        return this.cameraFeatures.getZoomLevel().getMaximumZoomLevel();
    }

    public double getMinExposureOffset() {
        return this.cameraFeatures.getExposureOffset().getMinExposureOffset();
    }

    public float getMinZoomLevel() {
        return this.cameraFeatures.getZoomLevel().getMinimumZoomLevel();
    }

    EncoderProfiles getRecordingProfile() {
        return this.cameraFeatures.getResolution().getRecordingProfile();
    }

    CamcorderProfile getRecordingProfileLegacy() {
        return this.cameraFeatures.getResolution().getRecordingProfileLegacy();
    }

    public void lockCaptureOrientation(PlatformChannel.DeviceOrientation deviceOrientation) {
        this.cameraFeatures.getSensorOrientation().lockCaptureOrientation(deviceOrientation);
    }

    @Override // io.flutter.plugins.camera.CameraCaptureCallback.CameraCaptureStateListener
    public void onConverged() {
        takePictureAfterPrecapture();
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public void onImageAvailable(ImageReader imageReader) {
        Log.i(TAG, "onImageAvailable");
        Image acquireNextImage = imageReader.acquireNextImage();
        if (acquireNextImage == null) {
            return;
        }
        this.backgroundHandler.post(new ImageSaver(acquireNextImage, this.captureFile, new ImageSaver.Callback() { // from class: io.flutter.plugins.camera.Camera.4
            AnonymousClass4() {
            }

            @Override // io.flutter.plugins.camera.ImageSaver.Callback
            public void onComplete(String str) {
                Camera camera = Camera.this;
                camera.dartMessenger.finish(camera.flutterResult, str);
            }

            @Override // io.flutter.plugins.camera.ImageSaver.Callback
            public void onError(String str, String str2) {
                Camera camera = Camera.this;
                camera.dartMessenger.error(camera.flutterResult, str, str2, null);
            }
        }));
        this.cameraCaptureCallback.setCameraState(CameraState.STATE_PREVIEW);
    }

    @Override // io.flutter.plugins.camera.CameraCaptureCallback.CameraCaptureStateListener
    public void onPrecapture() {
        runPrecaptureSequence();
    }

    public void open(String str) {
        this.imageFormatGroup = str;
        ResolutionFeature resolution = this.cameraFeatures.getResolution();
        if (!resolution.checkIsSupported()) {
            this.dartMessenger.sendCameraErrorEvent("Camera with name \"" + this.cameraProperties.getCameraName() + "\" is not supported by this plugin.");
            return;
        }
        this.pictureImageReader = ImageReader.newInstance(resolution.getCaptureSize().getWidth(), resolution.getCaptureSize().getHeight(), RecognitionOptions.QR_CODE, 1);
        Integer num = supportedImageFormats.get(str);
        if (num == null) {
            Log.w(TAG, "The selected imageFormatGroup is not supported by Android. Defaulting to yuv420");
            num = 35;
        }
        this.imageStreamReader = new ImageStreamReader(resolution.getPreviewSize().getWidth(), resolution.getPreviewSize().getHeight(), num.intValue(), 1);
        CameraUtils.getCameraManager(this.activity).openCamera(this.cameraProperties.getCameraName(), new CameraDevice.StateCallback() { // from class: io.flutter.plugins.camera.Camera.1
            final /* synthetic */ ResolutionFeature val$resolutionFeature;

            AnonymousClass1(ResolutionFeature resolution2) {
                r2 = resolution2;
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onClosed(CameraDevice cameraDevice) {
                Log.i(Camera.TAG, "open | onClosed");
                Camera camera = Camera.this;
                camera.cameraDevice = null;
                camera.closeCaptureSession();
                Camera.this.dartMessenger.sendCameraClosingEvent();
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onDisconnected(CameraDevice cameraDevice) {
                Log.i(Camera.TAG, "open | onDisconnected");
                Camera.this.close();
                Camera.this.dartMessenger.sendCameraErrorEvent("The camera was disconnected.");
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onError(CameraDevice cameraDevice, int i10) {
                Log.i(Camera.TAG, "open | onError");
                Camera.this.close();
                Camera.this.dartMessenger.sendCameraErrorEvent(i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "Unknown camera error" : "The camera service has encountered a fatal error." : "The camera device has encountered a fatal error" : "The camera device could not be opened due to a device policy." : "Max cameras in use" : "The camera device is in use already.");
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onOpened(CameraDevice cameraDevice) {
                Camera camera = Camera.this;
                camera.cameraDevice = new DefaultCameraDeviceWrapper(cameraDevice);
                try {
                    Camera.this.startPreview();
                    Camera camera2 = Camera.this;
                    if (camera2.recordingVideo) {
                        return;
                    }
                    camera2.dartMessenger.sendCameraInitializedEvent(Integer.valueOf(r2.getPreviewSize().getWidth()), Integer.valueOf(r2.getPreviewSize().getHeight()), Camera.this.cameraFeatures.getExposureLock().getValue(), Camera.this.cameraFeatures.getAutoFocus().getValue(), Boolean.valueOf(Camera.this.cameraFeatures.getExposurePoint().checkIsSupported()), Boolean.valueOf(Camera.this.cameraFeatures.getFocusPoint().checkIsSupported()));
                } catch (Exception e10) {
                    Camera.this.dartMessenger.sendCameraErrorEvent(e10.getMessage());
                    Camera.this.close();
                }
            }
        }, this.backgroundHandler);
    }

    public void pausePreview() {
        if (this.pausedPreview) {
            return;
        }
        this.pausedPreview = true;
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.stopRepeating();
        }
    }

    public void pauseVideoRecording(MethodChannel.Result result) {
        if (!this.recordingVideo) {
            result.success(null);
            return;
        }
        try {
            if (!SdkCapabilityChecker.supportsVideoPause()) {
                result.error("videoRecordingFailed", "pauseVideoRecording requires Android API +24.", null);
            } else {
                this.mediaRecorder.pause();
                result.success(null);
            }
        } catch (IllegalStateException e10) {
            result.error("videoRecordingFailed", e10.getMessage(), null);
        }
    }

    void prepareRecording(MethodChannel.Result result) {
        try {
            File createTempFile = File.createTempFile("REC", ".mp4", this.applicationContext.getCacheDir());
            this.captureFile = createTempFile;
            try {
                prepareMediaRecorder(createTempFile.getAbsolutePath());
                this.cameraFeatures.setAutoFocus(this.cameraFeatureFactory.createAutoFocusFeature(this.cameraProperties, true));
            } catch (IOException e10) {
                this.recordingVideo = false;
                this.captureFile = null;
                result.error("videoRecordingFailed", e10.getMessage(), null);
            }
        } catch (IOException | SecurityException e11) {
            result.error("cannotCreateFile", e11.getMessage(), null);
        }
    }

    void refreshPreviewCaptureSession(Runnable runnable, ErrorCallback errorCallback) {
        String str;
        Log.i(TAG, "refreshPreviewCaptureSession");
        CameraCaptureSession cameraCaptureSession = this.captureSession;
        if (cameraCaptureSession == null) {
            Log.i(TAG, "refreshPreviewCaptureSession: captureSession not yet initialized, skipping preview capture session refresh.");
            return;
        }
        try {
            if (!this.pausedPreview) {
                cameraCaptureSession.setRepeatingRequest(this.previewRequestBuilder.build(), this.cameraCaptureCallback, this.backgroundHandler);
            }
            if (runnable != null) {
                runnable.run();
            }
        } catch (CameraAccessException e10) {
            str = e10.getMessage();
            errorCallback.onError("cameraAccess", str);
        } catch (IllegalStateException e11) {
            str = "Camera is closed: " + e11.getMessage();
            errorCallback.onError("cameraAccess", str);
        }
    }

    public void resumePreview() {
        this.pausedPreview = false;
        refreshPreviewCaptureSession(null, new ErrorCallback() { // from class: io.flutter.plugins.camera.f
            public /* synthetic */ f() {
            }

            @Override // io.flutter.plugins.camera.ErrorCallback
            public final void onError(String str, String str2) {
                Camera.this.lambda$resumePreview$15(str, str2);
            }
        });
    }

    public void resumeVideoRecording(MethodChannel.Result result) {
        if (!this.recordingVideo) {
            result.success(null);
            return;
        }
        try {
            if (!SdkCapabilityChecker.supportsVideoPause()) {
                result.error("videoRecordingFailed", "resumeVideoRecording requires Android API +24.", null);
            } else {
                this.mediaRecorder.resume();
                result.success(null);
            }
        } catch (IllegalStateException e10) {
            result.error("videoRecordingFailed", e10.getMessage(), null);
        }
    }

    public void setDescriptionWhileRecording(MethodChannel.Result result, CameraProperties cameraProperties) {
        String str;
        if (!this.recordingVideo) {
            str = "Device was not recording";
        } else {
            if (SdkCapabilityChecker.supportsEglRecordableAndroid()) {
                stopAndReleaseCamera();
                prepareVideoRenderer();
                this.cameraProperties = cameraProperties;
                CameraFeatures init = CameraFeatures.init(this.cameraFeatureFactory, cameraProperties, this.activity, this.dartMessenger, this.resolutionPreset);
                this.cameraFeatures = init;
                init.setAutoFocus(this.cameraFeatureFactory.createAutoFocusFeature(this.cameraProperties, true));
                try {
                    open(this.imageFormatGroup);
                } catch (CameraAccessException e10) {
                    result.error("setDescriptionWhileRecordingFailed", e10.getMessage(), null);
                }
                result.success(null);
                return;
            }
            str = "Device does not support switching the camera while recording";
        }
        result.error("setDescriptionWhileRecordingFailed", str, null);
    }

    public void setExposureMode(MethodChannel.Result result, ExposureMode exposureMode) {
        ExposureLockFeature exposureLock = this.cameraFeatures.getExposureLock();
        exposureLock.setValue(exposureMode);
        exposureLock.updateBuilder(this.previewRequestBuilder);
        refreshPreviewCaptureSession(new Runnable() { // from class: io.flutter.plugins.camera.m
            public /* synthetic */ m() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MethodChannel.Result.this.success(null);
            }
        }, new ErrorCallback() { // from class: io.flutter.plugins.camera.n
            public /* synthetic */ n() {
            }

            @Override // io.flutter.plugins.camera.ErrorCallback
            public final void onError(String str, String str2) {
                MethodChannel.Result.this.error("setExposureModeFailed", "Could not set exposure mode.", null);
            }
        });
    }

    public void setExposureOffset(MethodChannel.Result result, double d10) {
        ExposureOffsetFeature exposureOffset = this.cameraFeatures.getExposureOffset();
        exposureOffset.setValue(Double.valueOf(d10));
        exposureOffset.updateBuilder(this.previewRequestBuilder);
        refreshPreviewCaptureSession(new Runnable() { // from class: io.flutter.plugins.camera.i

            /* renamed from: b */
            public final /* synthetic */ ExposureOffsetFeature f17921b;

            public /* synthetic */ i(ExposureOffsetFeature exposureOffset2) {
                r2 = exposureOffset2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Camera.lambda$setExposureOffset$11(MethodChannel.Result.this, r2);
            }
        }, new ErrorCallback() { // from class: io.flutter.plugins.camera.j
            public /* synthetic */ j() {
            }

            @Override // io.flutter.plugins.camera.ErrorCallback
            public final void onError(String str, String str2) {
                MethodChannel.Result.this.error("setExposureOffsetFailed", "Could not set exposure offset.", null);
            }
        });
    }

    public void setExposurePoint(MethodChannel.Result result, Point point) {
        ExposurePointFeature exposurePoint = this.cameraFeatures.getExposurePoint();
        exposurePoint.setValue(point);
        exposurePoint.updateBuilder(this.previewRequestBuilder);
        refreshPreviewCaptureSession(new Runnable() { // from class: io.flutter.plugins.camera.b
            public /* synthetic */ b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MethodChannel.Result.this.success(null);
            }
        }, new ErrorCallback() { // from class: io.flutter.plugins.camera.c
            public /* synthetic */ c() {
            }

            @Override // io.flutter.plugins.camera.ErrorCallback
            public final void onError(String str, String str2) {
                MethodChannel.Result.this.error("setExposurePointFailed", "Could not set exposure point.", null);
            }
        });
    }

    public void setFlashMode(MethodChannel.Result result, FlashMode flashMode) {
        FlashFeature flash = this.cameraFeatures.getFlash();
        flash.setValue(flashMode);
        flash.updateBuilder(this.previewRequestBuilder);
        refreshPreviewCaptureSession(new Runnable() { // from class: io.flutter.plugins.camera.a
            public /* synthetic */ a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MethodChannel.Result.this.success(null);
            }
        }, new ErrorCallback() { // from class: io.flutter.plugins.camera.h
            public /* synthetic */ h() {
            }

            @Override // io.flutter.plugins.camera.ErrorCallback
            public final void onError(String str, String str2) {
                MethodChannel.Result.this.error("setFlashModeFailed", "Could not set flash mode.", null);
            }
        });
    }

    public void setFocusMode(MethodChannel.Result result, FocusMode focusMode) {
        AutoFocusFeature autoFocus = this.cameraFeatures.getAutoFocus();
        autoFocus.setValue(focusMode);
        autoFocus.updateBuilder(this.previewRequestBuilder);
        if (!this.pausedPreview) {
            int i10 = AnonymousClass7.$SwitchMap$io$flutter$plugins$camera$features$autofocus$FocusMode[focusMode.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    unlockAutoFocus();
                }
            } else {
                if (this.captureSession == null) {
                    Log.i(TAG, "[unlockAutoFocus] captureSession null, returning");
                    return;
                }
                lockAutoFocus();
                this.previewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                try {
                    this.captureSession.setRepeatingRequest(this.previewRequestBuilder.build(), null, this.backgroundHandler);
                } catch (CameraAccessException e10) {
                    if (result != null) {
                        result.error("setFocusModeFailed", "Error setting focus mode: " + e10.getMessage(), null);
                        return;
                    }
                    return;
                }
            }
        }
        if (result != null) {
            result.success(null);
        }
    }

    public void setFocusPoint(MethodChannel.Result result, Point point) {
        FocusPointFeature focusPoint = this.cameraFeatures.getFocusPoint();
        focusPoint.setValue(point);
        focusPoint.updateBuilder(this.previewRequestBuilder);
        refreshPreviewCaptureSession(new Runnable() { // from class: io.flutter.plugins.camera.d
            public /* synthetic */ d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MethodChannel.Result.this.success(null);
            }
        }, new ErrorCallback() { // from class: io.flutter.plugins.camera.e
            public /* synthetic */ e() {
            }

            @Override // io.flutter.plugins.camera.ErrorCallback
            public final void onError(String str, String str2) {
                MethodChannel.Result.this.error("setFocusPointFailed", "Could not set focus point.", null);
            }
        });
        setFocusMode(null, this.cameraFeatures.getAutoFocus().getValue());
    }

    void setImageStreamImageAvailableListener(EventChannel.EventSink eventSink) {
        ImageStreamReader imageStreamReader = this.imageStreamReader;
        if (imageStreamReader == null) {
            return;
        }
        imageStreamReader.subscribeListener(this.captureProps, eventSink, this.backgroundHandler);
    }

    public void setZoomLevel(MethodChannel.Result result, float f10) {
        ZoomLevelFeature zoomLevel = this.cameraFeatures.getZoomLevel();
        float maximumZoomLevel = zoomLevel.getMaximumZoomLevel();
        float minimumZoomLevel = zoomLevel.getMinimumZoomLevel();
        if (f10 > maximumZoomLevel || f10 < minimumZoomLevel) {
            result.error("ZOOM_ERROR", String.format(Locale.ENGLISH, "Zoom level out of bounds (zoom level should be between %f and %f).", Float.valueOf(minimumZoomLevel), Float.valueOf(maximumZoomLevel)), null);
            return;
        }
        zoomLevel.setValue(Float.valueOf(f10));
        zoomLevel.updateBuilder(this.previewRequestBuilder);
        refreshPreviewCaptureSession(new Runnable() { // from class: io.flutter.plugins.camera.k
            public /* synthetic */ k() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                MethodChannel.Result.this.success(null);
            }
        }, new ErrorCallback() { // from class: io.flutter.plugins.camera.l
            public /* synthetic */ l() {
            }

            @Override // io.flutter.plugins.camera.ErrorCallback
            public final void onError(String str, String str2) {
                MethodChannel.Result.this.error("setZoomLevelFailed", "Could not set zoom level.", null);
            }
        });
    }

    public void startBackgroundThread() {
        if (this.backgroundHandlerThread != null) {
            return;
        }
        HandlerThread create = HandlerThreadFactory.create("CameraBackground");
        this.backgroundHandlerThread = create;
        try {
            create.start();
        } catch (IllegalThreadStateException unused) {
        }
        this.backgroundHandler = HandlerFactory.create(this.backgroundHandlerThread.getLooper());
    }

    public void startPreview() {
        if (this.recordingVideo) {
            startPreviewWithVideoRendererStream();
        } else {
            startRegularPreview();
        }
    }

    public void startPreviewWithImageStream(EventChannel eventChannel) {
        setStreamHandler(eventChannel);
        startCapture(false, true);
        Log.i(TAG, "startPreviewWithImageStream");
    }

    public void startVideoRecording(MethodChannel.Result result, EventChannel eventChannel) {
        prepareRecording(result);
        if (eventChannel != null) {
            setStreamHandler(eventChannel);
        }
        this.initialCameraFacing = this.cameraProperties.getLensFacing();
        this.recordingVideo = true;
        try {
            startCapture(true, eventChannel != null);
            result.success(null);
        } catch (CameraAccessException e10) {
            this.recordingVideo = false;
            this.captureFile = null;
            result.error("videoRecordingFailed", e10.getMessage(), null);
        }
    }

    public void stopBackgroundThread() {
        HandlerThread handlerThread = this.backgroundHandlerThread;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        this.backgroundHandlerThread = null;
        this.backgroundHandler = null;
    }

    public void stopVideoRecording(MethodChannel.Result result) {
        if (!this.recordingVideo) {
            result.success(null);
            return;
        }
        this.cameraFeatures.setAutoFocus(this.cameraFeatureFactory.createAutoFocusFeature(this.cameraProperties, false));
        this.recordingVideo = false;
        try {
            closeRenderer();
            this.captureSession.abortCaptures();
            this.mediaRecorder.stop();
        } catch (CameraAccessException | IllegalStateException unused) {
        }
        this.mediaRecorder.reset();
        try {
            startPreview();
            result.success(this.captureFile.getAbsolutePath());
            this.captureFile = null;
        } catch (CameraAccessException | IllegalStateException | InterruptedException e10) {
            result.error("videoRecordingFailed", e10.getMessage(), null);
        }
    }

    public void takePicture(MethodChannel.Result result) {
        if (this.cameraCaptureCallback.getCameraState() != CameraState.STATE_PREVIEW) {
            result.error("captureAlreadyActive", "Picture is currently already being captured", null);
            return;
        }
        this.flutterResult = result;
        try {
            this.captureFile = File.createTempFile("CAP", ".jpg", this.applicationContext.getCacheDir());
            this.captureTimeouts.reset();
            this.pictureImageReader.setOnImageAvailableListener(this, this.backgroundHandler);
            AutoFocusFeature autoFocus = this.cameraFeatures.getAutoFocus();
            if (autoFocus.checkIsSupported() && autoFocus.getValue() == FocusMode.auto) {
                runPictureAutoFocus();
            } else {
                runPrecaptureSequence();
            }
        } catch (IOException | SecurityException e10) {
            this.dartMessenger.error(this.flutterResult, "cannotCreateFile", e10.getMessage(), null);
        }
    }

    void unlockAutoFocus() {
        Log.i(TAG, "unlockAutoFocus");
        if (this.captureSession == null) {
            Log.i(TAG, "[unlockAutoFocus] captureSession null, returning");
            return;
        }
        try {
            this.previewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            this.captureSession.capture(this.previewRequestBuilder.build(), null, this.backgroundHandler);
            this.previewRequestBuilder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
            this.captureSession.capture(this.previewRequestBuilder.build(), null, this.backgroundHandler);
            refreshPreviewCaptureSession(null, new ErrorCallback() { // from class: io.flutter.plugins.camera.g
                public /* synthetic */ g() {
                }

                @Override // io.flutter.plugins.camera.ErrorCallback
                public final void onError(String str, String str2) {
                    Camera.this.lambda$unlockAutoFocus$2(str, str2);
                }
            });
        } catch (CameraAccessException e10) {
            this.dartMessenger.sendCameraErrorEvent(e10.getMessage());
        }
    }

    public void unlockCaptureOrientation() {
        this.cameraFeatures.getSensorOrientation().unlockCaptureOrientation();
    }

    void updateBuilderSettings(CaptureRequest.Builder builder) {
        Iterator<CameraFeature<?>> it = this.cameraFeatures.getAllFeatures().iterator();
        while (it.hasNext()) {
            it.next().updateBuilder(builder);
        }
    }
}
