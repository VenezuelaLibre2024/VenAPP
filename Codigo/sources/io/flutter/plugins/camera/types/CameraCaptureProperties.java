package io.flutter.plugins.camera.types;

/* loaded from: classes3.dex */
public class CameraCaptureProperties {
    private Float lastLensAperture;
    private Long lastSensorExposureTime;
    private Integer lastSensorSensitivity;

    public Float getLastLensAperture() {
        return this.lastLensAperture;
    }

    public Long getLastSensorExposureTime() {
        return this.lastSensorExposureTime;
    }

    public Integer getLastSensorSensitivity() {
        return this.lastSensorSensitivity;
    }

    public void setLastLensAperture(Float f10) {
        this.lastLensAperture = f10;
    }

    public void setLastSensorExposureTime(Long l10) {
        this.lastSensorExposureTime = l10;
    }

    public void setLastSensorSensitivity(Integer num) {
        this.lastSensorSensitivity = num;
    }
}
