.class public Lio/flutter/plugins/camera/features/flash/FlashFeature;
.super Lio/flutter/plugins/camera/features/CameraFeature;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/flutter/plugins/camera/features/CameraFeature<",
        "Lio/flutter/plugins/camera/features/flash/FlashMode;",
        ">;"
    }
.end annotation


# instance fields
.field private currentSetting:Lio/flutter/plugins/camera/features/flash/FlashMode;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/camera/CameraProperties;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/camera/features/CameraFeature;-><init>(Lio/flutter/plugins/camera/CameraProperties;)V

    sget-object p1, Lio/flutter/plugins/camera/features/flash/FlashMode;->auto:Lio/flutter/plugins/camera/features/flash/FlashMode;

    iput-object p1, p0, Lio/flutter/plugins/camera/features/flash/FlashFeature;->currentSetting:Lio/flutter/plugins/camera/features/flash/FlashMode;

    return-void
.end method


# virtual methods
.method public checkIsSupported()Z
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeature;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    invoke-interface {v0}, Lio/flutter/plugins/camera/CameraProperties;->getFlashInfoAvailable()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public getDebugName()Ljava/lang/String;
    .locals 1

    const-string v0, "FlashFeature"

    return-object v0
.end method

.method public getValue()Lio/flutter/plugins/camera/features/flash/FlashMode;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/flash/FlashFeature;->currentSetting:Lio/flutter/plugins/camera/features/flash/FlashMode;

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/flash/FlashFeature;->getValue()Lio/flutter/plugins/camera/features/flash/FlashMode;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Lio/flutter/plugins/camera/features/flash/FlashMode;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/features/flash/FlashFeature;->currentSetting:Lio/flutter/plugins/camera/features/flash/FlashMode;

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lio/flutter/plugins/camera/features/flash/FlashMode;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/camera/features/flash/FlashFeature;->setValue(Lio/flutter/plugins/camera/features/flash/FlashMode;)V

    return-void
.end method

.method public updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 5

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/flash/FlashFeature;->checkIsSupported()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lio/flutter/plugins/camera/features/flash/FlashFeature$1;->$SwitchMap$io$flutter$plugins$camera$features$flash$FlashMode:[I

    iget-object v1, p0, Lio/flutter/plugins/camera/features/flash/FlashFeature;->currentSetting:Lio/flutter/plugins/camera/features/flash/FlashMode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_4

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eq v0, v4, :cond_3

    if-eq v0, v3, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    goto :goto_2

    :cond_1
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_2
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_1

    :cond_3
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    goto :goto_0

    :cond_4
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_0
    invoke-virtual {p1, v0, v2}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    :goto_1
    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :goto_2
    return-void
.end method
