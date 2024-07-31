.class public Lio/flutter/plugins/camera/features/CameraFeatures;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final AUTO_FOCUS:Ljava/lang/String; = "AUTO_FOCUS"

.field private static final EXPOSURE_LOCK:Ljava/lang/String; = "EXPOSURE_LOCK"

.field private static final EXPOSURE_OFFSET:Ljava/lang/String; = "EXPOSURE_OFFSET"

.field private static final EXPOSURE_POINT:Ljava/lang/String; = "EXPOSURE_POINT"

.field private static final FLASH:Ljava/lang/String; = "FLASH"

.field private static final FOCUS_POINT:Ljava/lang/String; = "FOCUS_POINT"

.field private static final FPS_RANGE:Ljava/lang/String; = "FPS_RANGE"

.field private static final NOISE_REDUCTION:Ljava/lang/String; = "NOISE_REDUCTION"

.field private static final REGION_BOUNDARIES:Ljava/lang/String; = "REGION_BOUNDARIES"

.field private static final RESOLUTION:Ljava/lang/String; = "RESOLUTION"

.field private static final SENSOR_ORIENTATION:Ljava/lang/String; = "SENSOR_ORIENTATION"

.field private static final ZOOM_LEVEL:Ljava/lang/String; = "ZOOM_LEVEL"


# instance fields
.field private final featureMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/flutter/plugins/camera/features/CameraFeature<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    return-void
.end method

.method public static init(Lio/flutter/plugins/camera/features/CameraFeatureFactory;Lio/flutter/plugins/camera/CameraProperties;Landroid/app/Activity;Lio/flutter/plugins/camera/DartMessenger;Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;)Lio/flutter/plugins/camera/features/CameraFeatures;
    .locals 2

    new-instance v0, Lio/flutter/plugins/camera/features/CameraFeatures;

    invoke-direct {v0}, Lio/flutter/plugins/camera/features/CameraFeatures;-><init>()V

    const/4 v1, 0x0

    invoke-interface {p0, p1, v1}, Lio/flutter/plugins/camera/features/CameraFeatureFactory;->createAutoFocusFeature(Lio/flutter/plugins/camera/CameraProperties;Z)Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/camera/features/CameraFeatures;->setAutoFocus(Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;)V

    invoke-interface {p0, p1}, Lio/flutter/plugins/camera/features/CameraFeatureFactory;->createExposureLockFeature(Lio/flutter/plugins/camera/CameraProperties;)Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/camera/features/CameraFeatures;->setExposureLock(Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;)V

    invoke-interface {p0, p1}, Lio/flutter/plugins/camera/features/CameraFeatureFactory;->createExposureOffsetFeature(Lio/flutter/plugins/camera/CameraProperties;)Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugins/camera/features/CameraFeatures;->setExposureOffset(Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;)V

    invoke-interface {p0, p1, p2, p3}, Lio/flutter/plugins/camera/features/CameraFeatureFactory;->createSensorOrientationFeature(Lio/flutter/plugins/camera/CameraProperties;Landroid/app/Activity;Lio/flutter/plugins/camera/DartMessenger;)Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;

    move-result-object p2

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/CameraFeatures;->setSensorOrientation(Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;)V

    invoke-interface {p0, p1, p2}, Lio/flutter/plugins/camera/features/CameraFeatureFactory;->createExposurePointFeature(Lio/flutter/plugins/camera/CameraProperties;Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;)Lio/flutter/plugins/camera/features/exposurepoint/ExposurePointFeature;

    move-result-object p3

    invoke-virtual {v0, p3}, Lio/flutter/plugins/camera/features/CameraFeatures;->setExposurePoint(Lio/flutter/plugins/camera/features/exposurepoint/ExposurePointFeature;)V

    invoke-interface {p0, p1}, Lio/flutter/plugins/camera/features/CameraFeatureFactory;->createFlashFeature(Lio/flutter/plugins/camera/CameraProperties;)Lio/flutter/plugins/camera/features/flash/FlashFeature;

    move-result-object p3

    invoke-virtual {v0, p3}, Lio/flutter/plugins/camera/features/CameraFeatures;->setFlash(Lio/flutter/plugins/camera/features/flash/FlashFeature;)V

    invoke-interface {p0, p1, p2}, Lio/flutter/plugins/camera/features/CameraFeatureFactory;->createFocusPointFeature(Lio/flutter/plugins/camera/CameraProperties;Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;)Lio/flutter/plugins/camera/features/focuspoint/FocusPointFeature;

    move-result-object p2

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/CameraFeatures;->setFocusPoint(Lio/flutter/plugins/camera/features/focuspoint/FocusPointFeature;)V

    invoke-interface {p0, p1}, Lio/flutter/plugins/camera/features/CameraFeatureFactory;->createFpsRangeFeature(Lio/flutter/plugins/camera/CameraProperties;)Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;

    move-result-object p2

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/CameraFeatures;->setFpsRange(Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;)V

    invoke-interface {p0, p1}, Lio/flutter/plugins/camera/features/CameraFeatureFactory;->createNoiseReductionFeature(Lio/flutter/plugins/camera/CameraProperties;)Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;

    move-result-object p2

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/CameraFeatures;->setNoiseReduction(Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;)V

    invoke-interface {p1}, Lio/flutter/plugins/camera/CameraProperties;->getCameraName()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p0, p1, p4, p2}, Lio/flutter/plugins/camera/features/CameraFeatureFactory;->createResolutionFeature(Lio/flutter/plugins/camera/CameraProperties;Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;Ljava/lang/String;)Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;

    move-result-object p2

    invoke-virtual {v0, p2}, Lio/flutter/plugins/camera/features/CameraFeatures;->setResolution(Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;)V

    invoke-interface {p0, p1}, Lio/flutter/plugins/camera/features/CameraFeatureFactory;->createZoomLevelFeature(Lio/flutter/plugins/camera/CameraProperties;)Lio/flutter/plugins/camera/features/zoomlevel/ZoomLevelFeature;

    move-result-object p0

    invoke-virtual {v0, p0}, Lio/flutter/plugins/camera/features/CameraFeatures;->setZoomLevel(Lio/flutter/plugins/camera/features/zoomlevel/ZoomLevelFeature;)V

    return-object v0
.end method


# virtual methods
.method public getAllFeatures()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lio/flutter/plugins/camera/features/CameraFeature<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method

.method public getAutoFocus()Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "AUTO_FOCUS"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;

    return-object v0
.end method

.method public getExposureLock()Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "EXPOSURE_LOCK"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;

    return-object v0
.end method

.method public getExposureOffset()Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "EXPOSURE_OFFSET"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/camera/features/CameraFeature;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;

    return-object v0
.end method

.method public getExposurePoint()Lio/flutter/plugins/camera/features/exposurepoint/ExposurePointFeature;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "EXPOSURE_POINT"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/camera/features/CameraFeature;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/camera/features/exposurepoint/ExposurePointFeature;

    return-object v0
.end method

.method public getFlash()Lio/flutter/plugins/camera/features/flash/FlashFeature;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "FLASH"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/camera/features/CameraFeature;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/camera/features/flash/FlashFeature;

    return-object v0
.end method

.method public getFocusPoint()Lio/flutter/plugins/camera/features/focuspoint/FocusPointFeature;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "FOCUS_POINT"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/camera/features/CameraFeature;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/camera/features/focuspoint/FocusPointFeature;

    return-object v0
.end method

.method public getFpsRange()Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "FPS_RANGE"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/camera/features/CameraFeature;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;

    return-object v0
.end method

.method public getNoiseReduction()Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "NOISE_REDUCTION"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/camera/features/CameraFeature;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;

    return-object v0
.end method

.method public getResolution()Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "RESOLUTION"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/camera/features/CameraFeature;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;

    return-object v0
.end method

.method public getSensorOrientation()Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "SENSOR_ORIENTATION"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/camera/features/CameraFeature;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;

    return-object v0
.end method

.method public getZoomLevel()Lio/flutter/plugins/camera/features/zoomlevel/ZoomLevelFeature;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "ZOOM_LEVEL"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/camera/features/CameraFeature;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Lio/flutter/plugins/camera/features/zoomlevel/ZoomLevelFeature;

    return-object v0
.end method

.method public setAutoFocus(Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "AUTO_FOCUS"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setExposureLock(Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "EXPOSURE_LOCK"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setExposureOffset(Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "EXPOSURE_OFFSET"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setExposurePoint(Lio/flutter/plugins/camera/features/exposurepoint/ExposurePointFeature;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "EXPOSURE_POINT"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setFlash(Lio/flutter/plugins/camera/features/flash/FlashFeature;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "FLASH"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setFocusPoint(Lio/flutter/plugins/camera/features/focuspoint/FocusPointFeature;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "FOCUS_POINT"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setFpsRange(Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "FPS_RANGE"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setNoiseReduction(Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "NOISE_REDUCTION"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setResolution(Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "RESOLUTION"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setSensorOrientation(Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "SENSOR_ORIENTATION"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setZoomLevel(Lio/flutter/plugins/camera/features/zoomlevel/ZoomLevelFeature;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeatures;->featureMap:Ljava/util/Map;

    const-string v1, "ZOOM_LEVEL"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
