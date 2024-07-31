.class final Landroidx/camera/camera2/internal/j1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/y1$d;


# static fields
.field static final a:Landroidx/camera/camera2/internal/j1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/camera2/internal/j1;

    invoke-direct {v0}, Landroidx/camera/camera2/internal/j1;-><init>()V

    sput-object v0, Landroidx/camera/camera2/internal/j1;->a:Landroidx/camera/camera2/internal/j1;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/util/Size;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/y1$b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Landroidx/camera/core/impl/y1$b;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p2, v0}, Landroidx/camera/core/impl/k2;->o(Landroidx/camera/core/impl/y1;)Landroidx/camera/core/impl/y1;

    move-result-object v1

    invoke-static {}, Landroidx/camera/core/impl/p1;->X()Landroidx/camera/core/impl/p1;

    move-result-object v2

    invoke-static {}, Landroidx/camera/core/impl/y1;->a()Landroidx/camera/core/impl/y1;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/camera/core/impl/y1;->l()I

    move-result v3

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->l()I

    move-result v3

    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->b()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroidx/camera/core/impl/y1$b;->a(Ljava/util/Collection;)Landroidx/camera/core/impl/y1$b;

    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->i()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroidx/camera/core/impl/y1$b;->c(Ljava/util/List;)Landroidx/camera/core/impl/y1$b;

    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->g()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p3, v2}, Landroidx/camera/core/impl/y1$b;->b(Ljava/util/Collection;)Landroidx/camera/core/impl/y1$b;

    invoke-virtual {v1}, Landroidx/camera/core/impl/y1;->d()Landroidx/camera/core/impl/n0;

    move-result-object v2

    :cond_0
    invoke-virtual {p3, v2}, Landroidx/camera/core/impl/y1$b;->r(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/y1$b;

    instance-of v1, p2, Landroidx/camera/core/impl/r1;

    if-eqz v1, :cond_1

    invoke-static {p1, p3}, Lt/p;->b(Landroid/util/Size;Landroidx/camera/core/impl/y1$b;)V

    :cond_1
    new-instance p1, Lq/a;

    invoke-direct {p1, p2}, Lq/a;-><init>(Landroidx/camera/core/impl/n0;)V

    invoke-virtual {p1, v3}, Lq/a;->a0(I)I

    move-result p2

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/y1$b;->t(I)Landroidx/camera/core/impl/y1$b;

    invoke-static {}, Landroidx/camera/camera2/internal/n1;->b()Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq/a;->b0(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroid/hardware/camera2/CameraDevice$StateCallback;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/y1$b;->e(Landroid/hardware/camera2/CameraDevice$StateCallback;)Landroidx/camera/core/impl/y1$b;

    invoke-static {}, Landroidx/camera/camera2/internal/m1;->b()Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq/a;->e0(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroid/hardware/camera2/CameraCaptureSession$StateCallback;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/y1$b;->k(Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroidx/camera/core/impl/y1$b;

    invoke-static {}, Landroidx/camera/camera2/internal/o0;->c()Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq/a;->d0(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p2

    invoke-static {p2}, Landroidx/camera/camera2/internal/s1;->d(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroidx/camera/camera2/internal/s1;

    move-result-object p2

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/y1$b;->d(Landroidx/camera/core/impl/k;)Landroidx/camera/core/impl/y1$b;

    invoke-static {}, Landroidx/camera/core/impl/m1;->a0()Landroidx/camera/core/impl/m1;

    move-result-object p2

    sget-object v1, Lq/a;->M:Landroidx/camera/core/impl/n0$a;

    invoke-static {}, Lq/c;->e()Lq/c;

    move-result-object v2

    invoke-virtual {p1, v2}, Lq/a;->X(Lq/c;)Lq/c;

    move-result-object v2

    invoke-virtual {p2, v1, v2}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    sget-object v1, Lq/a;->O:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {p1, v0}, Lq/a;->c0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v1, v0}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    sget-object v0, Lq/a;->I:Landroidx/camera/core/impl/n0$a;

    const-wide/16 v1, -0x1

    invoke-virtual {p1, v1, v2}, Lq/a;->f0(J)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/y1$b;->g(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/y1$b;

    invoke-virtual {p1}, Lq/a;->Y()Lv/j;

    move-result-object p1

    invoke-virtual {p3, p1}, Landroidx/camera/core/impl/y1$b;->g(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/y1$b;

    return-void
.end method
