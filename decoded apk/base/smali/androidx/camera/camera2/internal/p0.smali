.class Landroidx/camera/camera2/internal/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/l0$b;


# static fields
.field static final a:Landroidx/camera/camera2/internal/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/camera2/internal/p0;

    invoke-direct {v0}, Landroidx/camera/camera2/internal/p0;-><init>()V

    sput-object v0, Landroidx/camera/camera2/internal/p0;->a:Landroidx/camera/camera2/internal/p0;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/l0$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Landroidx/camera/core/impl/l0$a;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroidx/camera/core/impl/k2;->s(Landroidx/camera/core/impl/l0;)Landroidx/camera/core/impl/l0;

    move-result-object v0

    invoke-static {}, Landroidx/camera/core/impl/p1;->X()Landroidx/camera/core/impl/p1;

    move-result-object v1

    invoke-static {}, Landroidx/camera/core/impl/l0;->a()Landroidx/camera/core/impl/l0;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/camera/core/impl/l0;->h()I

    move-result v2

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/impl/l0;->h()I

    move-result v2

    invoke-virtual {v0}, Landroidx/camera/core/impl/l0;->b()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroidx/camera/core/impl/l0$a;->a(Ljava/util/Collection;)V

    invoke-virtual {v0}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v1

    :cond_0
    invoke-virtual {p2, v1}, Landroidx/camera/core/impl/l0$a;->q(Landroidx/camera/core/impl/n0;)V

    new-instance v0, Lq/a;

    invoke-direct {v0, p1}, Lq/a;-><init>(Landroidx/camera/core/impl/n0;)V

    invoke-virtual {v0, v2}, Lq/a;->a0(I)I

    move-result p1

    invoke-virtual {p2, p1}, Landroidx/camera/core/impl/l0$a;->r(I)V

    invoke-static {}, Landroidx/camera/camera2/internal/o0;->c()Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p1

    invoke-virtual {v0, p1}, Lq/a;->d0(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p1

    invoke-static {p1}, Landroidx/camera/camera2/internal/s1;->d(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroidx/camera/camera2/internal/s1;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/camera/core/impl/l0$a;->c(Landroidx/camera/core/impl/k;)V

    invoke-virtual {v0}, Lq/a;->Y()Lv/j;

    move-result-object p1

    invoke-virtual {p2, p1}, Landroidx/camera/core/impl/l0$a;->e(Landroidx/camera/core/impl/n0;)V

    return-void
.end method
