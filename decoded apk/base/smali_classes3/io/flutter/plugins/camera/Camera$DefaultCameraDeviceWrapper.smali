.class Lio/flutter/plugins/camera/Camera$DefaultCameraDeviceWrapper;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/camera/CameraDeviceWrapper;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/camera/Camera;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DefaultCameraDeviceWrapper"
.end annotation


# instance fields
.field private final cameraDevice:Landroid/hardware/camera2/CameraDevice;

.field final synthetic this$0:Lio/flutter/plugins/camera/Camera;


# direct methods
.method constructor <init>(Lio/flutter/plugins/camera/Camera;Landroid/hardware/camera2/CameraDevice;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/Camera$DefaultCameraDeviceWrapper;->this$0:Lio/flutter/plugins/camera/Camera;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/flutter/plugins/camera/Camera$DefaultCameraDeviceWrapper;->cameraDevice:Landroid/hardware/camera2/CameraDevice;

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera$DefaultCameraDeviceWrapper;->cameraDevice:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v0}, Landroid/hardware/camera2/CameraDevice;->close()V

    return-void
.end method

.method public createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera$DefaultCameraDeviceWrapper;->cameraDevice:Landroid/hardware/camera2/CameraDevice;

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraDevice;->createCaptureRequest(I)Landroid/hardware/camera2/CaptureRequest$Builder;

    move-result-object p1

    return-object p1
.end method

.method public createCaptureSession(Landroid/hardware/camera2/params/SessionConfiguration;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera$DefaultCameraDeviceWrapper;->cameraDevice:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v0, p1}, Landroidx/camera/camera2/internal/compat/l0;->a(Landroid/hardware/camera2/CameraDevice;Landroid/hardware/camera2/params/SessionConfiguration;)V

    return-void
.end method

.method public createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    .locals 1
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

    iget-object p3, p0, Lio/flutter/plugins/camera/Camera$DefaultCameraDeviceWrapper;->cameraDevice:Landroid/hardware/camera2/CameraDevice;

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera$DefaultCameraDeviceWrapper;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object v0, v0, Lio/flutter/plugins/camera/Camera;->backgroundHandler:Landroid/os/Handler;

    invoke-virtual {p3, p1, p2, v0}, Landroid/hardware/camera2/CameraDevice;->createCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    return-void
.end method
