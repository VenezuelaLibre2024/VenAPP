.class Lio/flutter/plugins/camera/Camera$2;
.super Landroid/hardware/camera2/CameraCaptureSession$StateCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugins/camera/Camera;->createCaptureSession(ILjava/lang/Runnable;[Landroid/view/Surface;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field captureSessionClosed:Z

.field final synthetic this$0:Lio/flutter/plugins/camera/Camera;

.field final synthetic val$onSuccessCallback:Ljava/lang/Runnable;


# direct methods
.method constructor <init>(Lio/flutter/plugins/camera/Camera;Ljava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugins/camera/Camera$2;->this$0:Lio/flutter/plugins/camera/Camera;

    iput-object p2, p0, Lio/flutter/plugins/camera/Camera$2;->val$onSuccessCallback:Ljava/lang/Runnable;

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lio/flutter/plugins/camera/Camera$2;->captureSessionClosed:Z

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugins/camera/Camera$2;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugins/camera/Camera$2;->lambda$onConfigured$0(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private synthetic lambda$onConfigured$0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$2;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object p1, p1, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    invoke-virtual {p1, p2}, Lio/flutter/plugins/camera/DartMessenger;->sendCameraErrorEvent(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onClosed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 1

    const-string p1, "Camera"

    const-string v0, "CameraCaptureSession onClosed"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/flutter/plugins/camera/Camera$2;->captureSessionClosed:Z

    return-void
.end method

.method public onConfigureFailed(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 1

    const-string p1, "Camera"

    const-string v0, "CameraCaptureSession onConfigureFailed"

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$2;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object p1, p1, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    const-string v0, "Failed to configure camera session."

    invoke-virtual {p1, v0}, Lio/flutter/plugins/camera/DartMessenger;->sendCameraErrorEvent(Ljava/lang/String;)V

    return-void
.end method

.method public onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V
    .locals 3

    const-string v0, "CameraCaptureSession onConfigured"

    const-string v1, "Camera"

    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera$2;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object v2, v0, Lio/flutter/plugins/camera/Camera;->cameraDevice:Lio/flutter/plugins/camera/CameraDeviceWrapper;

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lio/flutter/plugins/camera/Camera$2;->captureSessionClosed:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iput-object p1, v0, Lio/flutter/plugins/camera/Camera;->captureSession:Landroid/hardware/camera2/CameraCaptureSession;

    const-string p1, "Updating builder settings"

    invoke-static {v1, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$2;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object v0, p1, Lio/flutter/plugins/camera/Camera;->previewRequestBuilder:Landroid/hardware/camera2/CaptureRequest$Builder;

    invoke-virtual {p1, v0}, Lio/flutter/plugins/camera/Camera;->updateBuilderSettings(Landroid/hardware/camera2/CaptureRequest$Builder;)V

    iget-object p1, p0, Lio/flutter/plugins/camera/Camera$2;->this$0:Lio/flutter/plugins/camera/Camera;

    iget-object v0, p0, Lio/flutter/plugins/camera/Camera$2;->val$onSuccessCallback:Ljava/lang/Runnable;

    new-instance v1, Lio/flutter/plugins/camera/q;

    invoke-direct {v1, p0}, Lio/flutter/plugins/camera/q;-><init>(Lio/flutter/plugins/camera/Camera$2;)V

    invoke-virtual {p1, v0, v1}, Lio/flutter/plugins/camera/Camera;->refreshPreviewCaptureSession(Ljava/lang/Runnable;Lio/flutter/plugins/camera/ErrorCallback;)V

    return-void

    :cond_1
    :goto_0
    iget-object p1, v0, Lio/flutter/plugins/camera/Camera;->dartMessenger:Lio/flutter/plugins/camera/DartMessenger;

    const-string v0, "The camera was closed during configuration."

    invoke-virtual {p1, v0}, Lio/flutter/plugins/camera/DartMessenger;->sendCameraErrorEvent(Ljava/lang/String;)V

    return-void
.end method
