.class public interface abstract Lio/flutter/plugins/camera/CameraProperties;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract getAvailableNoiseReductionModes()[I
.end method

.method public abstract getCameraName()Ljava/lang/String;
.end method

.method public abstract getControlAutoExposureAvailableTargetFpsRanges()[Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()[",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getControlAutoExposureCompensationRange()Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getControlAutoExposureCompensationStep()D
.end method

.method public abstract getControlAutoFocusAvailableModes()[I
.end method

.method public abstract getControlMaxRegionsAutoExposure()Ljava/lang/Integer;
.end method

.method public abstract getControlMaxRegionsAutoFocus()Ljava/lang/Integer;
.end method

.method public abstract getDistortionCorrectionAvailableModes()[I
.end method

.method public abstract getFlashInfoAvailable()Ljava/lang/Boolean;
.end method

.method public abstract getHardwareLevel()I
.end method

.method public abstract getLensFacing()I
.end method

.method public abstract getLensInfoMinimumFocusDistance()Ljava/lang/Float;
.end method

.method public abstract getScalerAvailableMaxDigitalZoom()Ljava/lang/Float;
.end method

.method public abstract getScalerMaxZoomRatio()Ljava/lang/Float;
.end method

.method public abstract getScalerMinZoomRatio()Ljava/lang/Float;
.end method

.method public abstract getSensorInfoActiveArraySize()Landroid/graphics/Rect;
.end method

.method public abstract getSensorInfoPixelArraySize()Landroid/util/Size;
.end method

.method public abstract getSensorInfoPreCorrectionActiveArraySize()Landroid/graphics/Rect;
.end method

.method public abstract getSensorOrientation()I
.end method
