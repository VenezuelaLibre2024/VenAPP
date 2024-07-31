.class final Landroidx/camera/camera2/internal/j3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/j3$b;,
        Landroidx/camera/camera2/internal/j3$a;
    }
.end annotation


# instance fields
.field private final a:Landroidx/camera/camera2/internal/j3$b;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/j3$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/j3;->a:Landroidx/camera/camera2/internal/j3$b;

    return-void
.end method


# virtual methods
.method a(ILjava/util/List;Landroidx/camera/camera2/internal/x2$a;)Lr/w;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Lr/f;",
            ">;",
            "Landroidx/camera/camera2/internal/x2$a;",
            ")",
            "Lr/w;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/j3;->a:Landroidx/camera/camera2/internal/j3$b;

    invoke-interface {v0, p1, p2, p3}, Landroidx/camera/camera2/internal/j3$b;->i(ILjava/util/List;Landroidx/camera/camera2/internal/x2$a;)Lr/w;

    move-result-object p1

    return-object p1
.end method

.method public b()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j3;->a:Landroidx/camera/camera2/internal/j3$b;

    invoke-interface {v0}, Landroidx/camera/camera2/internal/j3$b;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    return-object v0
.end method

.method c(Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;)Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/CameraDevice;",
            "Lr/w;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/r0;",
            ">;)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/j3;->a:Landroidx/camera/camera2/internal/j3$b;

    invoke-interface {v0, p1, p2, p3}, Landroidx/camera/camera2/internal/j3$b;->n(Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method d(Ljava/util/List;J)Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/r0;",
            ">;J)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/j3;->a:Landroidx/camera/camera2/internal/j3$b;

    invoke-interface {v0, p1, p2, p3}, Landroidx/camera/camera2/internal/j3$b;->j(Ljava/util/List;J)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method e()Z
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/j3;->a:Landroidx/camera/camera2/internal/j3$b;

    invoke-interface {v0}, Landroidx/camera/camera2/internal/j3$b;->stop()Z

    move-result v0

    return v0
.end method
