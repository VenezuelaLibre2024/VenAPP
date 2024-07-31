.class public Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;
.super Lio/flutter/plugins/camera/features/CameraFeature;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/flutter/plugins/camera/features/CameraFeature<",
        "Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;",
        ">;"
    }
.end annotation


# instance fields
.field private final NOISE_REDUCTION_MODES:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private currentSetting:Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/camera/CameraProperties;)V
    .locals 3

    invoke-direct {p0, p1}, Lio/flutter/plugins/camera/features/CameraFeature;-><init>(Lio/flutter/plugins/camera/CameraProperties;)V

    sget-object p1, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;->fast:Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;

    iput-object p1, p0, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;->currentSetting:Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;->NOISE_REDUCTION_MODES:Ljava/util/HashMap;

    sget-object v1, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;->off:Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;->highQuality:Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lio/flutter/plugins/camera/SdkCapabilityChecker;->supportsMarshmallowNoiseReductionModes()Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;->minimal:Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;->zeroShutterLag:Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;

    const/4 v1, 0x4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public checkIsSupported()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeature;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    invoke-interface {v0}, Lio/flutter/plugins/camera/CameraProperties;->getAvailableNoiseReductionModes()[I

    move-result-object v0

    if-eqz v0, :cond_0

    array-length v0, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getDebugName()Ljava/lang/String;
    .locals 1

    const-string v0, "NoiseReductionFeature"

    return-object v0
.end method

.method public getValue()Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;->currentSetting:Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;->getValue()Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;->currentSetting:Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;->setValue(Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;)V

    return-void
.end method

.method public updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 3

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;->checkIsSupported()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->NOISE_REDUCTION_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v1, p0, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;->NOISE_REDUCTION_MODES:Ljava/util/HashMap;

    iget-object v2, p0, Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionFeature;->currentSetting:Lio/flutter/plugins/camera/features/noisereduction/NoiseReductionMode;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void
.end method
