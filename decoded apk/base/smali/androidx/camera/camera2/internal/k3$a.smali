.class Landroidx/camera/camera2/internal/k3$a;
.super Landroidx/camera/camera2/internal/x2$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/k3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation


# instance fields
.field private final a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;


# direct methods
.method constructor <init>(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/x2$a;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/k3$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    return-void
.end method

.method constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;",
            ">;)V"
        }
    .end annotation

    invoke-static {p1}, Landroidx/camera/camera2/internal/m1;->a(Ljava/util/List;)Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object p1

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/k3$a;-><init>(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/camera2/internal/x2;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/k3$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/x2;->l()Landroidx/camera/camera2/internal/compat/i;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/compat/i;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onActive(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public o(Landroidx/camera/camera2/internal/x2;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/k3$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/x2;->l()Landroidx/camera/camera2/internal/compat/i;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/compat/i;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-static {v0, p1}, Landroidx/camera/camera2/internal/compat/e;->b(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public p(Landroidx/camera/camera2/internal/x2;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/k3$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/x2;->l()Landroidx/camera/camera2/internal/compat/i;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/compat/i;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onClosed(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public q(Landroidx/camera/camera2/internal/x2;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/k3$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/x2;->l()Landroidx/camera/camera2/internal/compat/i;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/compat/i;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onConfigureFailed(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public r(Landroidx/camera/camera2/internal/x2;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/k3$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/x2;->l()Landroidx/camera/camera2/internal/compat/i;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/compat/i;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onConfigured(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method public s(Landroidx/camera/camera2/internal/x2;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/k3$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/x2;->l()Landroidx/camera/camera2/internal/compat/i;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/compat/i;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/hardware/camera2/CameraCaptureSession$StateCallback;->onReady(Landroid/hardware/camera2/CameraCaptureSession;)V

    return-void
.end method

.method t(Landroidx/camera/camera2/internal/x2;)V
    .locals 0

    return-void
.end method

.method public u(Landroidx/camera/camera2/internal/x2;Landroid/view/Surface;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/k3$a;->a:Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/x2;->l()Landroidx/camera/camera2/internal/compat/i;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/compat/i;->c()Landroid/hardware/camera2/CameraCaptureSession;

    move-result-object p1

    invoke-static {v0, p1, p2}, Landroidx/camera/camera2/internal/compat/b;->a(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;Landroid/hardware/camera2/CameraCaptureSession;Landroid/view/Surface;)V

    return-void
.end method
