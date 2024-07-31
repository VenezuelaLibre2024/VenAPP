.class public Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;
.super Lio/flutter/plugins/camera/features/CameraFeature;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/flutter/plugins/camera/features/CameraFeature<",
        "Landroid/util/Range<",
        "Ljava/lang/Integer;",
        ">;>;"
    }
.end annotation


# static fields
.field private static final MAX_PIXEL4A_RANGE:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private currentSetting:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Landroid/util/Range;

    const/16 v1, 0x1e

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1, v1}, Landroid/util/Range;-><init>(Ljava/lang/Comparable;Ljava/lang/Comparable;)V

    sput-object v0, Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;->MAX_PIXEL4A_RANGE:Landroid/util/Range;

    return-void
.end method

.method public constructor <init>(Lio/flutter/plugins/camera/CameraProperties;)V
    .locals 5

    invoke-direct {p0, p1}, Lio/flutter/plugins/camera/features/CameraFeature;-><init>(Lio/flutter/plugins/camera/CameraProperties;)V

    invoke-direct {p0}, Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;->isPixel4A()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;->MAX_PIXEL4A_RANGE:Landroid/util/Range;

    iput-object p1, p0, Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;->currentSetting:Landroid/util/Range;

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Lio/flutter/plugins/camera/CameraProperties;->getControlAutoExposureAvailableTargetFpsRanges()[Landroid/util/Range;

    move-result-object p1

    if-eqz p1, :cond_3

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_3

    aget-object v2, p1, v1

    invoke-virtual {v2}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0xa

    if-lt v3, v4, :cond_2

    iget-object v4, p0, Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;->currentSetting:Landroid/util/Range;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-le v3, v4, :cond_2

    :cond_1
    iput-object v2, p0, Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;->currentSetting:Landroid/util/Range;

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method private isPixel4A()Z
    .locals 3

    invoke-static {}, Lio/flutter/plugins/camera/DeviceInfo;->getBrand()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lio/flutter/plugins/camera/DeviceInfo;->getModel()Ljava/lang/String;

    move-result-object v1

    if-eqz v0, :cond_0

    const-string v2, "google"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    const-string v0, "Pixel 4a"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method


# virtual methods
.method public checkIsSupported()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public getDebugName()Ljava/lang/String;
    .locals 1

    const-string v0, "FpsRangeFeature"

    return-object v0
.end method

.method public getValue()Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;->currentSetting:Landroid/util/Range;

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;->getValue()Landroid/util/Range;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Landroid/util/Range;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;->currentSetting:Landroid/util/Range;

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/util/Range;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;->setValue(Landroid/util/Range;)V

    return-void
.end method

.method public updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 2

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;->checkIsSupported()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v1, p0, Lio/flutter/plugins/camera/features/fpsrange/FpsRangeFeature;->currentSetting:Landroid/util/Range;

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void
.end method
