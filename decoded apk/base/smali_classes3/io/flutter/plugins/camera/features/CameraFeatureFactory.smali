.class public interface abstract Lio/flutter/plugins/camera/features/CameraFeatureFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract createAutoFocusFeature(Lio/flutter/plugins/camera/CameraProperties;Z)Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;
.end method

.method public abstract createExposureLockFeature(Lio/flutter/plugins/camera/CameraProperties;)Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;
.end method

.method public abstract createExposureOffsetFeature(Lio/flutter/plugins/camera/CameraProperties;)Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;
.end method

.method public abstract createExposurePointFeature(Lio/flutter/plugins/camera/CameraProperties;Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;)Lio/flutter/plugins/camera/features/exposurepoint/ExposurePointFeature;
.end method

.method public abstract createFlashFeature(Lio/flutter/plugins/camera/CameraProperties;)Lio/flutter/plugins/camera/features/flash/FlashFeature;
.end method

.method public abstract createFocusPointFeature(Lio/flutter/plugins/camera/CameraProperties;Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;)Lio/flutter/plugins/camera/features/focuspoint/FocusPointFeature;
.end method

.method public abstract createFpsRangeFeature(Lio/flutter/plugins/camera/CameraProperties;)Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;
.end method

.method public abstract createNoiseReductionFeature(Lio/flutter/plugins/camera/CameraProperties;)Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;
.end method

.method public abstract createResolutionFeature(Lio/flutter/plugins/camera/CameraProperties;Lio/flutter/plugins/camera/features/resolution/ResolutionPreset;Ljava/lang/String;)Lio/flutter/plugins/camera/features/resolution/ResolutionFeature;
.end method

.method public abstract createSensorOrientationFeature(Lio/flutter/plugins/camera/CameraProperties;Landroid/app/Activity;Lio/flutter/plugins/camera/DartMessenger;)Lio/flutter/plugins/camera/features/sensororientation/SensorOrientationFeature;
.end method

.method public abstract createZoomLevelFeature(Lio/flutter/plugins/camera/CameraProperties;)Lio/flutter/plugins/camera/features/zoomlevel/ZoomLevelFeature;
.end method
