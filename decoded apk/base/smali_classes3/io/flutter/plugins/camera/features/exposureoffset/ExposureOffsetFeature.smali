.class public Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;
.super Lio/flutter/plugins/camera/features/CameraFeature;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/flutter/plugins/camera/features/CameraFeature<",
        "Ljava/lang/Double;",
        ">;"
    }
.end annotation


# instance fields
.field private currentSetting:D


# direct methods
.method public constructor <init>(Lio/flutter/plugins/camera/CameraProperties;)V
    .locals 2

    invoke-direct {p0, p1}, Lio/flutter/plugins/camera/features/CameraFeature;-><init>(Lio/flutter/plugins/camera/CameraProperties;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->currentSetting:D

    return-void
.end method


# virtual methods
.method public checkIsSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getDebugName()Ljava/lang/String;
    .locals 1

    const-string v0, "ExposureOffsetFeature"

    return-object v0
.end method

.method public getExposureOffsetStepSize()D
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeature;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    invoke-interface {v0}, Lio/flutter/plugins/camera/CameraProperties;->getControlAutoExposureCompensationStep()D

    move-result-wide v0

    return-wide v0
.end method

.method public getMaxExposureOffset()D
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeature;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    invoke-interface {v0}, Lio/flutter/plugins/camera/CameraProperties;->getControlAutoExposureCompensationRange()Landroid/util/Range;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v0, v0

    :goto_0
    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->getExposureOffsetStepSize()D

    move-result-wide v2

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method public getMinExposureOffset()D
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeature;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    invoke-interface {v0}, Lio/flutter/plugins/camera/CameraProperties;->getControlAutoExposureCompensationRange()Landroid/util/Range;

    move-result-object v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-double v0, v0

    :goto_0
    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->getExposureOffsetStepSize()D

    move-result-wide v2

    mul-double/2addr v0, v2

    return-wide v0
.end method

.method public getValue()Ljava/lang/Double;
    .locals 2

    iget-wide v0, p0, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->currentSetting:D

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->getValue()Ljava/lang/Double;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Ljava/lang/Double;)V
    .locals 4

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->getExposureOffsetStepSize()D

    move-result-wide v0

    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    div-double/2addr v2, v0

    iput-wide v2, p0, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->currentSetting:D

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Double;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->setValue(Ljava/lang/Double;)V

    return-void
.end method

.method public updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 3

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->checkIsSupported()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_EXPOSURE_COMPENSATION:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-wide v1, p0, Lio/flutter/plugins/camera/features/exposureoffset/ExposureOffsetFeature;->currentSetting:D

    double-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void
.end method
