.class public Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;
.super Lio/flutter/plugins/camera/features/CameraFeature;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/flutter/plugins/camera/features/CameraFeature<",
        "Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;",
        ">;"
    }
.end annotation


# instance fields
.field private currentSetting:Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/camera/CameraProperties;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/camera/features/CameraFeature;-><init>(Lio/flutter/plugins/camera/CameraProperties;)V

    sget-object p1, Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;->auto:Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;

    iput-object p1, p0, Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;->currentSetting:Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;

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

    const-string v0, "ExposureLockFeature"

    return-object v0
.end method

.method public getValue()Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;->currentSetting:Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;

    return-object v0
.end method

.method public bridge synthetic getValue()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;->getValue()Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;

    move-result-object v0

    return-object v0
.end method

.method public setValue(Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;->currentSetting:Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;

    return-void
.end method

.method public bridge synthetic setValue(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;->setValue(Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;)V

    return-void
.end method

.method public updateBuilder(Landroid/hardware/camera2/CaptureRequest$Builder;)V
    .locals 3

    invoke-virtual {p0}, Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;->checkIsSupported()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_LOCK:Landroid/hardware/camera2/CaptureRequest$Key;

    iget-object v1, p0, Lio/flutter/plugins/camera/features/exposurelock/ExposureLockFeature;->currentSetting:Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;

    sget-object v2, Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;->locked:Lio/flutter/plugins/camera/features/exposurelock/ExposureMode;

    if-ne v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/hardware/camera2/CaptureRequest$Builder;->set(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)V

    return-void
.end method
