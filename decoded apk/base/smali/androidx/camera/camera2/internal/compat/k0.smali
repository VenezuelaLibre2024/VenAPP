.class Landroidx/camera/camera2/internal/compat/k0;
.super Landroidx/camera/camera2/internal/compat/j0;
.source "SourceFile"


# direct methods
.method constructor <init>(Landroid/hardware/camera2/CameraDevice;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/compat/j0;-><init>(Landroid/hardware/camera2/CameraDevice;Ljava/lang/Object;)V

    return-void
.end method

.method static e(Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;)Landroidx/camera/camera2/internal/compat/k0;
    .locals 2

    new-instance v0, Landroidx/camera/camera2/internal/compat/k0;

    new-instance v1, Landroidx/camera/camera2/internal/compat/n0$a;

    invoke-direct {v1, p1}, Landroidx/camera/camera2/internal/compat/n0$a;-><init>(Landroid/os/Handler;)V

    invoke-direct {v0, p0, v1}, Landroidx/camera/camera2/internal/compat/k0;-><init>(Landroid/hardware/camera2/CameraDevice;Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public a(Lr/w;)V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/compat/n0;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v0, p1}, Landroidx/camera/camera2/internal/compat/n0;->c(Landroid/hardware/camera2/CameraDevice;Lr/w;)V

    new-instance v0, Landroidx/camera/camera2/internal/compat/i$c;

    invoke-virtual {p1}, Lr/w;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-virtual {p1}, Lr/w;->e()Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroidx/camera/camera2/internal/compat/i$c;-><init>(Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    invoke-virtual {p1}, Lr/w;->c()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/compat/n0;->b:Ljava/lang/Object;

    check-cast v2, Landroidx/camera/camera2/internal/compat/n0$a;

    invoke-static {v2}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/camera2/internal/compat/n0$a;

    iget-object v2, v2, Landroidx/camera/camera2/internal/compat/n0$a;->a:Landroid/os/Handler;

    invoke-virtual {p1}, Lr/w;->b()Lr/e;

    move-result-object v3

    if-eqz v3, :cond_0

    :try_start_0
    invoke-virtual {v3}, Lr/e;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/params/InputConfiguration;

    invoke-static {p1}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Landroidx/camera/camera2/internal/compat/n0;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v1}, Lr/w;->h(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v3, p1, v1, v0, v2}, Landroid/hardware/camera2/CameraDevice;->createReprocessableCaptureSessionByConfigurations(Landroid/hardware/camera2/params/InputConfiguration;Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lr/w;->d()I

    move-result p1

    const/4 v3, 0x1

    if-ne p1, v3, :cond_1

    iget-object p1, p0, Landroidx/camera/camera2/internal/compat/n0;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v1}, Landroidx/camera/camera2/internal/compat/n0;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v1, v0, v2}, Landroid/hardware/camera2/CameraDevice;->createConstrainedHighSpeedCaptureSession(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/compat/n0;->a:Landroid/hardware/camera2/CameraDevice;

    invoke-static {v1}, Lr/w;->h(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p1, v1, v0, v2}, Landroid/hardware/camera2/CameraDevice;->createCaptureSessionByOutputConfigurations(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/os/Handler;)V
    :try_end_0
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception p1

    invoke-static {p1}, Landroidx/camera/camera2/internal/compat/h;->e(Landroid/hardware/camera2/CameraAccessException;)Landroidx/camera/camera2/internal/compat/h;

    move-result-object p1

    throw p1
.end method
