.class final Landroidx/camera/camera2/internal/r1;
.super Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/camera/core/impl/k;


# direct methods
.method constructor <init>(Landroidx/camera/core/impl/k;)V
    .locals 1

    invoke-direct {p0}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;-><init>()V

    if-eqz p1, :cond_0

    iput-object p1, p0, Landroidx/camera/camera2/internal/r1;->a:Landroidx/camera/core/impl/k;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "cameraCaptureCallback is null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureCompleted(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/TotalCaptureResult;)V

    invoke-virtual {p2}, Landroid/hardware/camera2/CaptureRequest;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of p2, p1, Landroidx/camera/core/impl/f2;

    const-string v0, "The tagBundle object from the CaptureResult is not a TagBundle object."

    invoke-static {p2, v0}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    check-cast p1, Landroidx/camera/core/impl/f2;

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/camera/core/impl/f2;->b()Landroidx/camera/core/impl/f2;

    move-result-object p1

    :goto_0
    iget-object p2, p0, Landroidx/camera/camera2/internal/r1;->a:Landroidx/camera/core/impl/k;

    new-instance v0, Landroidx/camera/camera2/internal/g;

    invoke-direct {v0, p1, p3}, Landroidx/camera/camera2/internal/g;-><init>(Landroidx/camera/core/impl/f2;Landroid/hardware/camera2/CaptureResult;)V

    invoke-virtual {p2, v0}, Landroidx/camera/core/impl/k;->b(Landroidx/camera/core/impl/s;)V

    return-void
.end method

.method public onCaptureFailed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;->onCaptureFailed(Landroid/hardware/camera2/CameraCaptureSession;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CaptureFailure;)V

    new-instance p1, Landroidx/camera/core/impl/m;

    sget-object p2, Landroidx/camera/core/impl/m$a;->ERROR:Landroidx/camera/core/impl/m$a;

    invoke-direct {p1, p2}, Landroidx/camera/core/impl/m;-><init>(Landroidx/camera/core/impl/m$a;)V

    iget-object p2, p0, Landroidx/camera/camera2/internal/r1;->a:Landroidx/camera/core/impl/k;

    invoke-virtual {p2, p1}, Landroidx/camera/core/impl/k;->c(Landroidx/camera/core/impl/m;)V

    return-void
.end method
