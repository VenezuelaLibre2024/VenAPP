.class interface abstract Lio/flutter/plugins/camera/CameraDeviceWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract close()V
.end method

.method public abstract createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;
.end method

.method public abstract createCaptureSession(Landroid/hardware/camera2/params/SessionConfiguration;)V
.end method

.method public abstract createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;",
            "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;",
            "Landroid/os/Handler;",
            ")V"
        }
    .end annotation
.end method
