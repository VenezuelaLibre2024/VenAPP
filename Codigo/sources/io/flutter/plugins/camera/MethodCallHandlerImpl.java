package io.flutter.plugins.camera;

import android.app.Activity;
import android.hardware.camera2.CameraAccessException;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.camera.CameraPermissions;
import io.flutter.plugins.camera.features.CameraFeatureFactoryImpl;
import io.flutter.plugins.camera.features.Point;
import io.flutter.plugins.camera.features.autofocus.FocusMode;
import io.flutter.plugins.camera.features.exposurelock.ExposureMode;
import io.flutter.plugins.camera.features.flash.FlashMode;
import io.flutter.plugins.camera.features.resolution.ResolutionPreset;
import io.flutter.view.TextureRegistry;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class MethodCallHandlerImpl implements MethodChannel.MethodCallHandler {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final Activity activity;
    private Camera camera;
    private final CameraPermissions cameraPermissions;
    private final EventChannel imageStreamChannel;
    private final BinaryMessenger messenger;
    private final MethodChannel methodChannel;
    private final CameraPermissions.PermissionsRegistry permissionsRegistry;
    private final TextureRegistry textureRegistry;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MethodCallHandlerImpl(Activity activity, BinaryMessenger binaryMessenger, CameraPermissions cameraPermissions, CameraPermissions.PermissionsRegistry permissionsRegistry, TextureRegistry textureRegistry) {
        this.activity = activity;
        this.messenger = binaryMessenger;
        this.cameraPermissions = cameraPermissions;
        this.permissionsRegistry = permissionsRegistry;
        this.textureRegistry = textureRegistry;
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/camera_android");
        this.methodChannel = methodChannel;
        this.imageStreamChannel = new EventChannel(binaryMessenger, "plugins.flutter.io/camera_android/imageStream");
        methodChannel.setMethodCallHandler(this);
    }

    private void handleException(Exception exc, MethodChannel.Result result) {
        if (!(exc instanceof CameraAccessException)) {
            throw ((RuntimeException) exc);
        }
        result.error("CameraAccess", exc.getMessage(), null);
    }

    private void instantiateCamera(MethodCall methodCall, MethodChannel.Result result) {
        String str = (String) methodCall.argument("cameraName");
        String str2 = (String) methodCall.argument("resolutionPreset");
        boolean booleanValue = ((Boolean) methodCall.argument("enableAudio")).booleanValue();
        TextureRegistry.SurfaceTextureEntry createSurfaceTexture = this.textureRegistry.createSurfaceTexture();
        this.camera = new Camera(this.activity, createSurfaceTexture, new CameraFeatureFactoryImpl(), new DartMessenger(this.messenger, createSurfaceTexture.id(), new Handler(Looper.getMainLooper())), new CameraPropertiesImpl(str, CameraUtils.getCameraManager(this.activity)), ResolutionPreset.valueOf(str2), booleanValue);
        HashMap hashMap = new HashMap();
        hashMap.put("cameraId", Long.valueOf(createSurfaceTexture.id()));
        result.success(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMethodCall$0(MethodCall methodCall, MethodChannel.Result result, String str, String str2) {
        if (str != null) {
            result.error(str, str2, null);
            return;
        }
        try {
            instantiateCamera(methodCall, result);
        } catch (Exception e10) {
            handleException(e10, result);
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(final MethodCall methodCall, final MethodChannel.Result result) {
        Double d10;
        Double d11;
        String str = methodCall.method;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -2037208347:
                if (str.equals("availableCameras")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1982465099:
                if (str.equals("getMinZoomLevel")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1849130371:
                if (str.equals("getExposureOffsetStepSize")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1783353674:
                if (str.equals("getMinExposureOffset")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1352294148:
                if (str.equals("create")) {
                    c10 = 4;
                    break;
                }
                break;
            case -1313121483:
                if (str.equals("lockCaptureOrientation")) {
                    c10 = 5;
                    break;
                }
                break;
            case -1157944680:
                if (str.equals("prepareForVideoRecording")) {
                    c10 = 6;
                    break;
                }
                break;
            case -1151868548:
                if (str.equals("setExposureOffset")) {
                    c10 = 7;
                    break;
                }
                break;
            case -1127151527:
                if (str.equals("setFocusMode")) {
                    c10 = '\b';
                    break;
                }
                break;
            case -1120721617:
                if (str.equals("setZoomLevel")) {
                    c10 = '\t';
                    break;
                }
                break;
            case -1077837554:
                if (str.equals("unlockCaptureOrientation")) {
                    c10 = '\n';
                    break;
                }
                break;
            case -579183206:
                if (str.equals("setFocusPoint")) {
                    c10 = 11;
                    break;
                }
                break;
            case 109225283:
                if (str.equals("resumeVideoRecording")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 186649688:
                if (str.equals("stopVideoRecording")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 196568648:
                if (str.equals("getMaxExposureOffset")) {
                    c10 = 14;
                    break;
                }
                break;
            case 391927665:
                if (str.equals("setFlashMode")) {
                    c10 = 15;
                    break;
                }
                break;
            case 770486092:
                if (str.equals("pauseVideoRecording")) {
                    c10 = 16;
                    break;
                }
                break;
            case 871091088:
                if (str.equals("initialize")) {
                    c10 = 17;
                    break;
                }
                break;
            case 888134860:
                if (str.equals("setExposureMode")) {
                    c10 = 18;
                    break;
                }
                break;
            case 888641243:
                if (str.equals("resumePreview")) {
                    c10 = 19;
                    break;
                }
                break;
            case 954656505:
                if (str.equals("startImageStream")) {
                    c10 = 20;
                    break;
                }
                break;
            case 1018096247:
                if (str.equals("takePicture")) {
                    c10 = 21;
                    break;
                }
                break;
            case 1120116920:
                if (str.equals("startVideoRecording")) {
                    c10 = 22;
                    break;
                }
                break;
            case 1422316786:
                if (str.equals("pausePreview")) {
                    c10 = 23;
                    break;
                }
                break;
            case 1656321690:
                if (str.equals("setDescriptionWhileRecording")) {
                    c10 = 24;
                    break;
                }
                break;
            case 1671767583:
                if (str.equals("dispose")) {
                    c10 = 25;
                    break;
                }
                break;
            case 1672159065:
                if (str.equals("stopImageStream")) {
                    c10 = 26;
                    break;
                }
                break;
            case 1765152647:
                if (str.equals("setExposurePoint")) {
                    c10 = 27;
                    break;
                }
                break;
            case 1838076131:
                if (str.equals("getMaxZoomLevel")) {
                    c10 = 28;
                    break;
                }
                break;
        }
        Double d12 = null;
        Double d13 = null;
        try {
            switch (c10) {
                case 0:
                    result.success(CameraUtils.getAvailableCameras(this.activity));
                    return;
                case 1:
                    result.success(Float.valueOf(this.camera.getMinZoomLevel()));
                    return;
                case 2:
                    result.success(Double.valueOf(this.camera.getExposureOffsetStepSize()));
                    return;
                case 3:
                    result.success(Double.valueOf(this.camera.getMinExposureOffset()));
                    return;
                case 4:
                    Camera camera = this.camera;
                    if (camera != null) {
                        camera.close();
                    }
                    this.cameraPermissions.requestPermissions(this.activity, this.permissionsRegistry, ((Boolean) methodCall.argument("enableAudio")).booleanValue(), new CameraPermissions.ResultCallback() { // from class: io.flutter.plugins.camera.b0
                        @Override // io.flutter.plugins.camera.CameraPermissions.ResultCallback
                        public final void onResult(String str2, String str3) {
                            MethodCallHandlerImpl.this.lambda$onMethodCall$0(methodCall, result, str2, str3);
                        }
                    });
                    return;
                case 5:
                    this.camera.lockCaptureOrientation(CameraUtils.deserializeDeviceOrientation((String) methodCall.argument("orientation")));
                    result.success(null);
                    return;
                case 6:
                    break;
                case 7:
                    this.camera.setExposureOffset(result, ((Double) methodCall.argument("offset")).doubleValue());
                    return;
                case '\b':
                    String str2 = (String) methodCall.argument("mode");
                    FocusMode valueForString = FocusMode.getValueForString(str2);
                    if (valueForString != null) {
                        this.camera.setFocusMode(result, valueForString);
                        return;
                    }
                    result.error("setFocusModeFailed", "Unknown focus mode " + str2, null);
                    return;
                case '\t':
                    Double d14 = (Double) methodCall.argument("zoom");
                    if (d14 == null) {
                        result.error("ZOOM_ERROR", "setZoomLevel is called without specifying a zoom level.", null);
                        return;
                    } else {
                        this.camera.setZoomLevel(result, d14.floatValue());
                        return;
                    }
                case '\n':
                    this.camera.unlockCaptureOrientation();
                    result.success(null);
                    return;
                case 11:
                    Boolean bool = (Boolean) methodCall.argument("reset");
                    if (bool == null || !bool.booleanValue()) {
                        d12 = (Double) methodCall.argument("x");
                        d10 = (Double) methodCall.argument("y");
                    } else {
                        d10 = null;
                    }
                    this.camera.setFocusPoint(result, new Point(d12, d10));
                    return;
                case '\f':
                    this.camera.resumeVideoRecording(result);
                    return;
                case '\r':
                    this.camera.stopVideoRecording(result);
                    return;
                case 14:
                    result.success(Double.valueOf(this.camera.getMaxExposureOffset()));
                    return;
                case 15:
                    String str3 = (String) methodCall.argument("mode");
                    FlashMode valueForString2 = FlashMode.getValueForString(str3);
                    if (valueForString2 != null) {
                        this.camera.setFlashMode(result, valueForString2);
                        return;
                    }
                    result.error("setFlashModeFailed", "Unknown flash mode " + str3, null);
                    return;
                case 16:
                    this.camera.pauseVideoRecording(result);
                    return;
                case 17:
                    Camera camera2 = this.camera;
                    if (camera2 == null) {
                        result.error("cameraNotFound", "Camera not found. Please call the 'create' method before calling 'initialize'.", null);
                        return;
                    } else {
                        camera2.open((String) methodCall.argument("imageFormatGroup"));
                        result.success(null);
                        return;
                    }
                case 18:
                    String str4 = (String) methodCall.argument("mode");
                    ExposureMode valueForString3 = ExposureMode.getValueForString(str4);
                    if (valueForString3 != null) {
                        this.camera.setExposureMode(result, valueForString3);
                        return;
                    }
                    result.error("setExposureModeFailed", "Unknown exposure mode " + str4, null);
                    return;
                case 19:
                    this.camera.resumePreview();
                    break;
                case 20:
                    this.camera.startPreviewWithImageStream(this.imageStreamChannel);
                    result.success(null);
                    return;
                case 21:
                    this.camera.takePicture(result);
                    return;
                case 22:
                    this.camera.startVideoRecording(result, Objects.equals(methodCall.argument("enableStream"), Boolean.TRUE) ? this.imageStreamChannel : null);
                    return;
                case 23:
                    this.camera.pausePreview();
                    result.success(null);
                    return;
                case 24:
                    this.camera.setDescriptionWhileRecording(result, new CameraPropertiesImpl((String) methodCall.argument("cameraName"), CameraUtils.getCameraManager(this.activity)));
                    return;
                case 25:
                    Camera camera3 = this.camera;
                    if (camera3 != null) {
                        camera3.dispose();
                        break;
                    }
                    break;
                case 26:
                    this.camera.startPreview();
                    result.success(null);
                    return;
                case 27:
                    Boolean bool2 = (Boolean) methodCall.argument("reset");
                    if (bool2 == null || !bool2.booleanValue()) {
                        d13 = (Double) methodCall.argument("x");
                        d11 = (Double) methodCall.argument("y");
                    } else {
                        d11 = null;
                    }
                    this.camera.setExposurePoint(result, new Point(d13, d11));
                    return;
                case 28:
                    result.success(Float.valueOf(this.camera.getMaxZoomLevel()));
                    return;
                default:
                    result.notImplemented();
                    return;
            }
            result.success(null);
        } catch (Exception e10) {
            handleException(e10, result);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void stopListening() {
        this.methodChannel.setMethodCallHandler(null);
    }
}
