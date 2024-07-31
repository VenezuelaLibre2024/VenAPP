package io.flutter.plugins.camera.features.exposureoffset;

import android.hardware.camera2.CaptureRequest;
import io.flutter.plugins.camera.CameraProperties;
import io.flutter.plugins.camera.features.CameraFeature;

/* loaded from: classes3.dex */
public class ExposureOffsetFeature extends CameraFeature<Double> {
    private double currentSetting;

    public ExposureOffsetFeature(CameraProperties cameraProperties) {
        super(cameraProperties);
        this.currentSetting = 0.0d;
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public boolean checkIsSupported() {
        return true;
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public String getDebugName() {
        return "ExposureOffsetFeature";
    }

    public double getExposureOffsetStepSize() {
        return this.cameraProperties.getControlAutoExposureCompensationStep();
    }

    public double getMaxExposureOffset() {
        return (this.cameraProperties.getControlAutoExposureCompensationRange() == null ? 0.0d : r0.getUpper().intValue()) * getExposureOffsetStepSize();
    }

    public double getMinExposureOffset() {
        return (this.cameraProperties.getControlAutoExposureCompensationRange() == null ? 0.0d : r0.getLower().intValue()) * getExposureOffsetStepSize();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.flutter.plugins.camera.features.CameraFeature
    public Double getValue() {
        return Double.valueOf(this.currentSetting);
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public void setValue(Double d10) {
        this.currentSetting = d10.doubleValue() / getExposureOffsetStepSize();
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public void updateBuilder(CaptureRequest.Builder builder) {
        if (checkIsSupported()) {
            builder.set(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, Integer.valueOf((int) this.currentSetting));
        }
    }
}
