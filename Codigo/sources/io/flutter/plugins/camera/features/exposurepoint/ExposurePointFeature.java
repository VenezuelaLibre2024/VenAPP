package io.flutter.plugins.camera.features.exposurepoint;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Size;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.plugins.camera.CameraProperties;
import io.flutter.plugins.camera.CameraRegionUtils;
import io.flutter.plugins.camera.features.CameraFeature;
import io.flutter.plugins.camera.features.Point;
import io.flutter.plugins.camera.features.sensororientation.SensorOrientationFeature;

/* loaded from: classes3.dex */
public class ExposurePointFeature extends CameraFeature<Point> {
    private Size cameraBoundaries;
    public MeteringRectangle[] defaultRegions;
    private boolean defaultRegionsHasBeenSet;
    private Point exposurePoint;
    private MeteringRectangle exposureRectangle;
    private final SensorOrientationFeature sensorOrientationFeature;

    public ExposurePointFeature(CameraProperties cameraProperties, SensorOrientationFeature sensorOrientationFeature) {
        super(cameraProperties);
        this.defaultRegionsHasBeenSet = false;
        this.sensorOrientationFeature = sensorOrientationFeature;
    }

    private void buildExposureRectangle() {
        MeteringRectangle convertPointToMeteringRectangle;
        if (this.cameraBoundaries == null) {
            throw new AssertionError("The cameraBoundaries should be set (using `ExposurePointFeature.setCameraBoundaries(Size)`) before updating the exposure point.");
        }
        if (this.exposurePoint == null) {
            convertPointToMeteringRectangle = null;
        } else {
            PlatformChannel.DeviceOrientation lockedCaptureOrientation = this.sensorOrientationFeature.getLockedCaptureOrientation();
            if (lockedCaptureOrientation == null) {
                lockedCaptureOrientation = this.sensorOrientationFeature.getDeviceOrientationManager().getLastUIOrientation();
            }
            convertPointToMeteringRectangle = CameraRegionUtils.convertPointToMeteringRectangle(this.cameraBoundaries, this.exposurePoint.f17916x.doubleValue(), this.exposurePoint.f17917y.doubleValue(), lockedCaptureOrientation);
        }
        this.exposureRectangle = convertPointToMeteringRectangle;
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public boolean checkIsSupported() {
        Integer controlMaxRegionsAutoExposure = this.cameraProperties.getControlMaxRegionsAutoExposure();
        return controlMaxRegionsAutoExposure != null && controlMaxRegionsAutoExposure.intValue() > 0;
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public String getDebugName() {
        return "ExposurePointFeature";
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.flutter.plugins.camera.features.CameraFeature
    public Point getValue() {
        return this.exposurePoint;
    }

    public void setCameraBoundaries(Size size) {
        this.cameraBoundaries = size;
        buildExposureRectangle();
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public void setValue(Point point) {
        if (point == null || point.f17916x == null || point.f17917y == null) {
            point = null;
        }
        this.exposurePoint = point;
        buildExposureRectangle();
    }

    @Override // io.flutter.plugins.camera.features.CameraFeature
    public void updateBuilder(CaptureRequest.Builder builder) {
        if (checkIsSupported()) {
            if (!this.defaultRegionsHasBeenSet) {
                this.defaultRegions = (MeteringRectangle[]) builder.get(CaptureRequest.CONTROL_AE_REGIONS);
                this.defaultRegionsHasBeenSet = true;
            }
            MeteringRectangle meteringRectangle = this.exposureRectangle;
            if (meteringRectangle != null) {
                builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{meteringRectangle});
            } else {
                builder.set(CaptureRequest.CONTROL_AE_REGIONS, this.defaultRegions);
            }
        }
    }
}
