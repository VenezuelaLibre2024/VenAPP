.class Lio/flutter/plugins/camera/CameraCaptureCallback;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/camera/CameraCaptureCallback$CameraCaptureStateListener;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "CameraCaptureCallback"


# instance fields
.field aeStateKey:Landroid/hardware/camera2/CaptureResult$Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/hardware/camera2/CaptureResult$Key<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field afStateKey:Landroid/hardware/camera2/CaptureResult$Key;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/hardware/camera2/CaptureResult$Key<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private cameraState:Lio/flutter/plugins/camera/CameraState;

.field private final cameraStateListener:Lio/flutter/plugins/camera/CameraCaptureCallback$CameraCaptureStateListener;

.field private final captureProps:Lio/flutter/plugins/camera/types/CameraCaptureProperties;

.field private final captureTimeouts:Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;


# direct methods
.method private constructor <init>(Lio/flutter/plugins/camera/CameraCaptureCallback$CameraCaptureStateListener;Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;Lio/flutter/plugins/camera/types/CameraCaptureProperties;)V
    .locals 1

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AE_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    iput-object v0, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->aeStateKey:Landroid/hardware/camera2/CaptureResult$Key;

    sget-object v0, Landroid/hardware/camera2/CaptureResult;->CONTROL_AF_STATE:Landroid/hardware/camera2/CaptureResult$Key;

    iput-object v0, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->afStateKey:Landroid/hardware/camera2/CaptureResult$Key;

    sget-object v0, Lio/flutter/plugins/camera/CameraState;->STATE_PREVIEW:Lio/flutter/plugins/camera/CameraState;

    iput-object v0, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->cameraState:Lio/flutter/plugins/camera/CameraState;

    iput-object p1, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->cameraStateListener:Lio/flutter/plugins/camera/CameraCaptureCallback$CameraCaptureStateListener;

    iput-object p2, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->captureTimeouts:Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;

    iput-object p3, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->captureProps:Lio/flutter/plugins/camera/types/CameraCaptureProperties;

    return-void
.end method

.method public static create(Lio/flutter/plugins/camera/CameraCaptureCallback$CameraCaptureStateListener;Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;Lio/flutter/plugins/camera/types/CameraCaptureProperties;)Lio/flutter/plugins/camera/CameraCaptureCallback;
    .locals 1

    new-instance v0, Lio/flutter/plugins/camera/CameraCaptureCallback;

    invoke-direct {v0, p0, p1, p2}, Lio/flutter/plugins/camera/CameraCaptureCallback;-><init>(Lio/flutter/plugins/camera/CameraCaptureCallback$CameraCaptureStateListener;Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;Lio/flutter/plugins/camera/types/CameraCaptureProperties;)V

    return-object v0
.end method

.method private handleWaitingFocusState(Ljava/lang/Integer;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->cameraStateListener:Lio/flutter/plugins/camera/CameraCaptureCallback$CameraCaptureStateListener;

    invoke-interface {p1}, Lio/flutter/plugins/camera/CameraCaptureCallback$CameraCaptureStateListener;->onPrecapture()V

    goto :goto_1

    :cond_1
    :goto_0
    iget-object p1, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->cameraStateListener:Lio/flutter/plugins/camera/CameraCaptureCallback$CameraCaptureStateListener;

    invoke-interface {p1}, Lio/flutter/plugins/camera/CameraCaptureCallback$CameraCaptureStateListener;->onConverged()V

    :goto_1
    return-void
.end method

.method private process(Landroid/hardware/camera2/CaptureResult;)V
    .locals 6

    iget-object v0, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->aeStateKey:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    iget-object v1, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->afStateKey:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, v1}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    instance-of v2, p1, Landroid/hardware/camera2/TotalCaptureResult;

    if-eqz v2, :cond_0

    sget-object v2, Landroid/hardware/camera2/CaptureResult;->LENS_APERTURE:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, v2}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Float;

    sget-object v3, Landroid/hardware/camera2/CaptureResult;->SENSOR_EXPOSURE_TIME:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, v3}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    sget-object v4, Landroid/hardware/camera2/CaptureResult;->SENSOR_SENSITIVITY:Landroid/hardware/camera2/CaptureResult$Key;

    invoke-virtual {p1, v4}, Landroid/hardware/camera2/CaptureResult;->get(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    iget-object v4, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->captureProps:Lio/flutter/plugins/camera/types/CameraCaptureProperties;

    invoke-virtual {v4, v2}, Lio/flutter/plugins/camera/types/CameraCaptureProperties;->setLastLensAperture(Ljava/lang/Float;)V

    iget-object v2, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->captureProps:Lio/flutter/plugins/camera/types/CameraCaptureProperties;

    invoke-virtual {v2, v3}, Lio/flutter/plugins/camera/types/CameraCaptureProperties;->setLastSensorExposureTime(Ljava/lang/Long;)V

    iget-object v2, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->captureProps:Lio/flutter/plugins/camera/types/CameraCaptureProperties;

    invoke-virtual {v2, p1}, Lio/flutter/plugins/camera/types/CameraCaptureProperties;->setLastSensorSensitivity(Ljava/lang/Integer;)V

    :cond_0
    iget-object p1, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->cameraState:Lio/flutter/plugins/camera/CameraState;

    sget-object v2, Lio/flutter/plugins/camera/CameraState;->STATE_PREVIEW:Lio/flutter/plugins/camera/CameraState;

    const-string v3, "CameraCaptureCallback"

    if-eq p1, v2, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "CameraCaptureCallback | state: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->cameraState:Lio/flutter/plugins/camera/CameraState;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " | afState: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " | aeState: "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    sget-object p1, Lio/flutter/plugins/camera/CameraCaptureCallback$1;->$SwitchMap$io$flutter$plugins$camera$CameraState:[I

    iget-object v2, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->cameraState:Lio/flutter/plugins/camera/CameraState;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget p1, p1, v2

    const/4 v2, 0x2

    const/4 v4, 0x5

    const/4 v5, 0x4

    if-eq p1, v2, :cond_8

    const/4 v1, 0x3

    if-eq p1, v1, :cond_5

    if-eq p1, v5, :cond_2

    goto/16 :goto_3

    :cond_2
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p1, v4, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->captureTimeouts:Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;->getPreCaptureMetering()Lio/flutter/plugins/camera/types/Timeout;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/camera/types/Timeout;->getIsExpired()Z

    move-result p1

    if-eqz p1, :cond_c

    const-string p1, "Metering timeout waiting for pre-capture to finish, moving on with capture"

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_0
    iget-object p1, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->cameraStateListener:Lio/flutter/plugins/camera/CameraCaptureCallback$CameraCaptureStateListener;

    invoke-interface {p1}, Lio/flutter/plugins/camera/CameraCaptureCallback$CameraCaptureStateListener;->onConverged()V

    goto :goto_3

    :cond_5
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p1, v2, :cond_7

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p1, v4, :cond_7

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v5, :cond_6

    goto :goto_1

    :cond_6
    iget-object p1, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->captureTimeouts:Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;->getPreCaptureMetering()Lio/flutter/plugins/camera/types/Timeout;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/camera/types/Timeout;->getIsExpired()Z

    move-result p1

    if-eqz p1, :cond_c

    const-string p1, "Metering timeout waiting for pre-capture to start, moving on with capture"

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_7
    :goto_1
    sget-object p1, Lio/flutter/plugins/camera/CameraState;->STATE_WAITING_PRECAPTURE_DONE:Lio/flutter/plugins/camera/CameraState;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/camera/CameraCaptureCallback;->setCameraState(Lio/flutter/plugins/camera/CameraState;)V

    goto :goto_3

    :cond_8
    if-nez v1, :cond_9

    return-void

    :cond_9
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq p1, v5, :cond_b

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v4, :cond_a

    goto :goto_2

    :cond_a
    iget-object p1, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->captureTimeouts:Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;

    invoke-virtual {p1}, Lio/flutter/plugins/camera/types/CaptureTimeoutsWrapper;->getPreCaptureFocusing()Lio/flutter/plugins/camera/types/Timeout;

    move-result-object p1

    invoke-virtual {p1}, Lio/flutter/plugins/camera/types/Timeout;->getIsExpired()Z

    move-result p1

    if-eqz p1, :cond_c

    const-string p1, "Focus timeout, moving on with capture"

    invoke-static {v3, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_b
    :goto_2
    invoke-direct {p0, v0}, Lio/flutter/plugins/camera/CameraCaptureCallback;->handleWaitingFocusState(Ljava/lang/Integer;)V

    :cond_c
    :goto_3
    return-void
.end method


# virtual methods
.method public getCameraState()Lio/flutter/plugins/camera/CameraState;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->cameraState:Lio/flutter/plugins/camera/CameraState;

    return-object v0
.end method

.method public onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 0

    invoke-direct {p0, p3}, Lio/flutter/plugins/camera/CameraCaptureCallback;->process(Landroid/hardware/camera2/CaptureResult;)V

    return-void
.end method

.method public onCaptureProgressed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureResult;)V
    .locals 0

    invoke-direct {p0, p3}, Lio/flutter/plugins/camera/CameraCaptureCallback;->process(Landroid/hardware/camera2/CaptureResult;)V

    return-void
.end method

.method public setCameraState(Lio/flutter/plugins/camera/CameraState;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/CameraCaptureCallback;->cameraState:Lio/flutter/plugins/camera/CameraState;

    return-void
.end method
