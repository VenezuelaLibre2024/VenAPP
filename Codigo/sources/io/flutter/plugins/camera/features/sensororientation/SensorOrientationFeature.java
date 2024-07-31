package io.flutter.plugins.camera.features.sensororientation;

import android.app.Activity;
import android.hardware.camera2.CaptureRequest;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.plugins.camera.CameraProperties;
import io.flutter.plugins.camera.DartMessenger;
import io.flutter.plugins.camera.features.CameraFeature;

/* loaded from: classes3.dex */
public class SensorOrientationFeature extends CameraFeature<Integer> {
    private Integer currentSetting;
    private final DeviceOrientationManager deviceOrientationListener;
    private PlatformChannel.DeviceOrientation lockedCaptureOrientation;

    public SensorOrientationFeature(CameraProperties cameraProperties, Activity activity, DartMessenger dartMessenger) {
        super(cameraProperties);
        this.currentSetting = 0;
        setValue(Integer.valueOf(cameraProperties.getSensorOrientation()));
        DeviceOrientationManager create = DeviceOrientationManager.create(activity, dartMessenger, cameraProperties.getLensFacing() == 0, this.currentSetting.intValue());
        this.deviceOrientationListener = create;
        create.start();
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public boolean checkIsSupported() {
        return true;
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public String getDebugName() {
        return "SensorOrientationFeature";
    }

    public DeviceOrientationManager getDeviceOrientationManager() {
        return this.deviceOrientationListener;
    }

    public PlatformChannel.DeviceOrientation getLockedCaptureOrientation() {
        return this.lockedCaptureOrientation;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.flutter.plugins.camera.features.CameraFeature
    public Integer getValue() {
        return this.currentSetting;
    }

    public void lockCaptureOrientation(PlatformChannel.DeviceOrientation deviceOrientation) {
        this.lockedCaptureOrientation = deviceOrientation;
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public void setValue(Integer num) {
        this.currentSetting = num;
    }

    public void unlockCaptureOrientation() {
        this.lockedCaptureOrientation = null;
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public void updateBuilder(CaptureRequest.Builder builder) {
    }
}
