package io.flutter.plugins.camera;

import android.os.Handler;
import android.text.TextUtils;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.camera.features.autofocus.FocusMode;
import io.flutter.plugins.camera.features.exposurelock.ExposureMode;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class DartMessenger {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    MethodChannel cameraChannel;
    MethodChannel deviceChannel;
    private final Handler handler;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum CameraEventType {
        ERROR("error"),
        CLOSING("camera_closing"),
        INITIALIZED("initialized");

        final String method;

        CameraEventType(String str) {
            this.method = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public enum DeviceEventType {
        ORIENTATION_CHANGED("orientation_changed");

        final String method;

        DeviceEventType(String str) {
            this.method = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DartMessenger(BinaryMessenger binaryMessenger, long j10, Handler handler) {
        this.cameraChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/camera_android/camera" + j10);
        this.deviceChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/camera_android/fromPlatform");
        this.handler = handler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$send$0(DeviceEventType deviceEventType, Map map) {
        this.deviceChannel.invokeMethod(deviceEventType.method, map);
    }

    private void send(CameraEventType cameraEventType) {
        send(cameraEventType, new HashMap());
    }

    private void send(final CameraEventType cameraEventType, final Map<String, Object> map) {
        if (this.cameraChannel == null) {
            return;
        }
        this.handler.post(new Runnable() { // from class: io.flutter.plugins.camera.DartMessenger.4
            @Override // java.lang.Runnable
            public void run() {
                DartMessenger.this.cameraChannel.invokeMethod(cameraEventType.method, map);
            }
        });
    }

    private void send(DeviceEventType deviceEventType) {
        send(deviceEventType, new HashMap());
    }

    private void send(final DeviceEventType deviceEventType, final Map<String, Object> map) {
        if (this.deviceChannel == null) {
            return;
        }
        this.handler.post(new Runnable() { // from class: io.flutter.plugins.camera.y
            @Override // java.lang.Runnable
            public final void run() {
                DartMessenger.this.lambda$send$0(deviceEventType, map);
            }
        });
    }

    public void error(final MethodChannel.Result result, final String str, final String str2, final Object obj) {
        this.handler.post(new Runnable() { // from class: io.flutter.plugins.camera.a0
            @Override // java.lang.Runnable
            public final void run() {
                MethodChannel.Result.this.error(str, str2, obj);
            }
        });
    }

    public void finish(final MethodChannel.Result result, final Object obj) {
        this.handler.post(new Runnable() { // from class: io.flutter.plugins.camera.z
            @Override // java.lang.Runnable
            public final void run() {
                MethodChannel.Result.this.success(obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendCameraClosingEvent() {
        send(CameraEventType.CLOSING);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendCameraErrorEvent(String str) {
        send(CameraEventType.ERROR, new HashMap<String, Object>(str) { // from class: io.flutter.plugins.camera.DartMessenger.3
            final /* synthetic */ String val$description;

            {
                this.val$description = str;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                put("description", str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void sendCameraInitializedEvent(Integer num, Integer num2, ExposureMode exposureMode, FocusMode focusMode, Boolean bool, Boolean bool2) {
        send(CameraEventType.INITIALIZED, new HashMap<String, Object>(num, num2, exposureMode, focusMode, bool, bool2) { // from class: io.flutter.plugins.camera.DartMessenger.2
            final /* synthetic */ ExposureMode val$exposureMode;
            final /* synthetic */ Boolean val$exposurePointSupported;
            final /* synthetic */ FocusMode val$focusMode;
            final /* synthetic */ Boolean val$focusPointSupported;
            final /* synthetic */ Integer val$previewHeight;
            final /* synthetic */ Integer val$previewWidth;

            {
                this.val$previewWidth = num;
                this.val$previewHeight = num2;
                this.val$exposureMode = exposureMode;
                this.val$focusMode = focusMode;
                this.val$exposurePointSupported = bool;
                this.val$focusPointSupported = bool2;
                put("previewWidth", Double.valueOf(num.doubleValue()));
                put("previewHeight", Double.valueOf(num2.doubleValue()));
                put("exposureMode", exposureMode.toString());
                put("focusMode", focusMode.toString());
                put("exposurePointSupported", bool);
                put("focusPointSupported", bool2);
            }
        });
    }

    public void sendDeviceOrientationChangeEvent(PlatformChannel.DeviceOrientation deviceOrientation) {
        send(DeviceEventType.ORIENTATION_CHANGED, new HashMap<String, Object>(deviceOrientation) { // from class: io.flutter.plugins.camera.DartMessenger.1
            final /* synthetic */ PlatformChannel.DeviceOrientation val$orientation;

            {
                this.val$orientation = deviceOrientation;
                put("orientation", CameraUtils.serializeDeviceOrientation(deviceOrientation));
            }
        });
    }
}
