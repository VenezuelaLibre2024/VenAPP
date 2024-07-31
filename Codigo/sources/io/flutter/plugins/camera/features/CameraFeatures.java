package io.flutter.plugins.camera.features;

import android.app.Activity;
import io.flutter.plugins.camera.CameraProperties;
import io.flutter.plugins.camera.DartMessenger;
import io.flutter.plugins.camera.features.autofocus.AutoFocusFeature;
import io.flutter.plugins.camera.features.exposurelock.ExposureLockFeature;
import io.flutter.plugins.camera.features.exposureoffset.ExposureOffsetFeature;
import io.flutter.plugins.camera.features.exposurepoint.ExposurePointFeature;
import io.flutter.plugins.camera.features.flash.FlashFeature;
import io.flutter.plugins.camera.features.focuspoint.FocusPointFeature;
import io.flutter.plugins.camera.features.fpsrange.FpsRangeFeature;
import io.flutter.plugins.camera.features.noisereduction.NoiseReductionFeature;
import io.flutter.plugins.camera.features.resolution.ResolutionFeature;
import io.flutter.plugins.camera.features.resolution.ResolutionPreset;
import io.flutter.plugins.camera.features.sensororientation.SensorOrientationFeature;
import io.flutter.plugins.camera.features.zoomlevel.ZoomLevelFeature;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public class CameraFeatures {
    private static final String AUTO_FOCUS = "AUTO_FOCUS";
    private static final String EXPOSURE_LOCK = "EXPOSURE_LOCK";
    private static final String EXPOSURE_OFFSET = "EXPOSURE_OFFSET";
    private static final String EXPOSURE_POINT = "EXPOSURE_POINT";
    private static final String FLASH = "FLASH";
    private static final String FOCUS_POINT = "FOCUS_POINT";
    private static final String FPS_RANGE = "FPS_RANGE";
    private static final String NOISE_REDUCTION = "NOISE_REDUCTION";
    private static final String REGION_BOUNDARIES = "REGION_BOUNDARIES";
    private static final String RESOLUTION = "RESOLUTION";
    private static final String SENSOR_ORIENTATION = "SENSOR_ORIENTATION";
    private static final String ZOOM_LEVEL = "ZOOM_LEVEL";
    private final Map<String, CameraFeature<?>> featureMap = new HashMap();

    public static CameraFeatures init(CameraFeatureFactory cameraFeatureFactory, CameraProperties cameraProperties, Activity activity, DartMessenger dartMessenger, ResolutionPreset resolutionPreset) {
        CameraFeatures cameraFeatures = new CameraFeatures();
        cameraFeatures.setAutoFocus(cameraFeatureFactory.createAutoFocusFeature(cameraProperties, false));
        cameraFeatures.setExposureLock(cameraFeatureFactory.createExposureLockFeature(cameraProperties));
        cameraFeatures.setExposureOffset(cameraFeatureFactory.createExposureOffsetFeature(cameraProperties));
        SensorOrientationFeature createSensorOrientationFeature = cameraFeatureFactory.createSensorOrientationFeature(cameraProperties, activity, dartMessenger);
        cameraFeatures.setSensorOrientation(createSensorOrientationFeature);
        cameraFeatures.setExposurePoint(cameraFeatureFactory.createExposurePointFeature(cameraProperties, createSensorOrientationFeature));
        cameraFeatures.setFlash(cameraFeatureFactory.createFlashFeature(cameraProperties));
        cameraFeatures.setFocusPoint(cameraFeatureFactory.createFocusPointFeature(cameraProperties, createSensorOrientationFeature));
        cameraFeatures.setFpsRange(cameraFeatureFactory.createFpsRangeFeature(cameraProperties));
        cameraFeatures.setNoiseReduction(cameraFeatureFactory.createNoiseReductionFeature(cameraProperties));
        cameraFeatures.setResolution(cameraFeatureFactory.createResolutionFeature(cameraProperties, resolutionPreset, cameraProperties.getCameraName()));
        cameraFeatures.setZoomLevel(cameraFeatureFactory.createZoomLevelFeature(cameraProperties));
        return cameraFeatures;
    }

    public Collection<CameraFeature<?>> getAllFeatures() {
        return this.featureMap.values();
    }

    public AutoFocusFeature getAutoFocus() {
        return (AutoFocusFeature) this.featureMap.get(AUTO_FOCUS);
    }

    public ExposureLockFeature getExposureLock() {
        return (ExposureLockFeature) this.featureMap.get(EXPOSURE_LOCK);
    }

    public ExposureOffsetFeature getExposureOffset() {
        CameraFeature<?> cameraFeature = this.featureMap.get(EXPOSURE_OFFSET);
        Objects.requireNonNull(cameraFeature);
        return (ExposureOffsetFeature) cameraFeature;
    }

    public ExposurePointFeature getExposurePoint() {
        CameraFeature<?> cameraFeature = this.featureMap.get(EXPOSURE_POINT);
        Objects.requireNonNull(cameraFeature);
        return (ExposurePointFeature) cameraFeature;
    }

    public FlashFeature getFlash() {
        CameraFeature<?> cameraFeature = this.featureMap.get(FLASH);
        Objects.requireNonNull(cameraFeature);
        return (FlashFeature) cameraFeature;
    }

    public FocusPointFeature getFocusPoint() {
        CameraFeature<?> cameraFeature = this.featureMap.get(FOCUS_POINT);
        Objects.requireNonNull(cameraFeature);
        return (FocusPointFeature) cameraFeature;
    }

    public FpsRangeFeature getFpsRange() {
        CameraFeature<?> cameraFeature = this.featureMap.get(FPS_RANGE);
        Objects.requireNonNull(cameraFeature);
        return (FpsRangeFeature) cameraFeature;
    }

    public NoiseReductionFeature getNoiseReduction() {
        CameraFeature<?> cameraFeature = this.featureMap.get(NOISE_REDUCTION);
        Objects.requireNonNull(cameraFeature);
        return (NoiseReductionFeature) cameraFeature;
    }

    public ResolutionFeature getResolution() {
        CameraFeature<?> cameraFeature = this.featureMap.get(RESOLUTION);
        Objects.requireNonNull(cameraFeature);
        return (ResolutionFeature) cameraFeature;
    }

    public SensorOrientationFeature getSensorOrientation() {
        CameraFeature<?> cameraFeature = this.featureMap.get(SENSOR_ORIENTATION);
        Objects.requireNonNull(cameraFeature);
        return (SensorOrientationFeature) cameraFeature;
    }

    public ZoomLevelFeature getZoomLevel() {
        CameraFeature<?> cameraFeature = this.featureMap.get(ZOOM_LEVEL);
        Objects.requireNonNull(cameraFeature);
        return (ZoomLevelFeature) cameraFeature;
    }

    public void setAutoFocus(AutoFocusFeature autoFocusFeature) {
        this.featureMap.put(AUTO_FOCUS, autoFocusFeature);
    }

    public void setExposureLock(ExposureLockFeature exposureLockFeature) {
        this.featureMap.put(EXPOSURE_LOCK, exposureLockFeature);
    }

    public void setExposureOffset(ExposureOffsetFeature exposureOffsetFeature) {
        this.featureMap.put(EXPOSURE_OFFSET, exposureOffsetFeature);
    }

    public void setExposurePoint(ExposurePointFeature exposurePointFeature) {
        this.featureMap.put(EXPOSURE_POINT, exposurePointFeature);
    }

    public void setFlash(FlashFeature flashFeature) {
        this.featureMap.put(FLASH, flashFeature);
    }

    public void setFocusPoint(FocusPointFeature focusPointFeature) {
        this.featureMap.put(FOCUS_POINT, focusPointFeature);
    }

    public void setFpsRange(FpsRangeFeature fpsRangeFeature) {
        this.featureMap.put(FPS_RANGE, fpsRangeFeature);
    }

    public void setNoiseReduction(NoiseReductionFeature noiseReductionFeature) {
        this.featureMap.put(NOISE_REDUCTION, noiseReductionFeature);
    }

    public void setResolution(ResolutionFeature resolutionFeature) {
        this.featureMap.put(RESOLUTION, resolutionFeature);
    }

    public void setSensorOrientation(SensorOrientationFeature sensorOrientationFeature) {
        this.featureMap.put(SENSOR_ORIENTATION, sensorOrientationFeature);
    }

    public void setZoomLevel(ZoomLevelFeature zoomLevelFeature) {
        this.featureMap.put(ZOOM_LEVEL, zoomLevelFeature);
    }
}
