.class public Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;
.super Lio/flutter/plugins/camera/features/CameraFeature;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/flutter/plugins/camera/features/CameraFeature<",
        "Lio/flutter/plugins/camera/features/autofocus/FocusMode;",
        ">;"
    }
.end annotation


# instance fields
.field private currentSetting:Lio/flutter/plugins/camera/features/autofocus/FocusMode;

.field private final recordingVideo:Z


# direct methods
.method public constructor <init>(Lio/flutter/plugins/camera/CameraProperties;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/camera/features/CameraFeature;-><init>(Lio/flutter/plugins/camera/CameraProperties;)V

    sget-object p1, Lio/flutter/plugins/camera/features/autofocus/FocusMode;->auto:Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    iput-object p1, p0, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;->currentSetting:Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    iput-boolean p2, p0, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;->recordingVideo:Z

    return-void
.end method


# virtual methods
.method public checkIsSupported()Z
    .locals 5

    iget-object v0, p0, Lio/flutter/plugins/camera/features/CameraFeature;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    invoke-interface {v0}, Lio/flutter/plugins/camera/CameraProperties;->getControlAutoFocusAvailableModes()[I

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugins/camera/features/CameraFeature;->cameraProperties:Lio/flutter/plugins/camera/CameraProperties;

    invoke-interface {v1}, Lio/flutter/plugins/camera/CameraProperties;->getLensInfoMinimumFocusDistance()Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const/4 v4, 0x0

    cmpl-float v1, v1, v4

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v3

    :goto_1
    if-nez v1, :cond_3

    array-length v1, v0

    if-eqz v1, :cond_3

    array-length v1, v0

    if-ne v1, v3, :cond_2

    aget v0, v0, v2

    if-eqz v0, :cond_3

    :cond_2
    move v2, v3

    :cond_3
    return v2
.end method

.method public getDebugName()Ljava/lang/String;
    .locals 1

    const-string v0, "AutoFocusFeature"

    return-object v0
.end method

.method public getValue()Lio/flutter/plugins/camera/features/autofocus/FocusMode;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;->currentSetting:Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;->getValue()Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Lio/flutter/plugins/camera/features/autofocus/FocusMode;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;->currentSetting:Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;->setValue(Lio/flutter/plugins/camera/features/autofocus/FocusMode;)V

    return-void
.end method

.method public updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 2

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;->checkIsSupported()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature$1;->$SwitchMap$io$flutter$plugins$camera$features$autofocus$FocusMode:[I

    iget-object v1, p0, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;->currentSetting:Lio/flutter/plugins/camera/features/autofocus/FocusMode;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    goto :goto_1

    :cond_1
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-boolean v1, p0, Lio/flutter/plugins/camera/features/autofocus/AutoFocusFeature;->recordingVideo:Z

    if-eqz v1, :cond_2

    const/4 v1, 0x3

    goto :goto_0

    :cond_2
    const/4 v1, 0x4

    goto :goto_0

    :cond_3
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AF_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    :goto_0
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
