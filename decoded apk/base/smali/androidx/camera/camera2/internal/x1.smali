.class final Landroidx/camera/camera2/internal/x1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/camera2/internal/y1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/x1$e;,
        Landroidx/camera/camera2/internal/x1$f;
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Object;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

.field private final d:Landroidx/camera/camera2/internal/x1$f;

.field e:Landroidx/camera/camera2/internal/j3;

.field f:Landroidx/camera/camera2/internal/x2;

.field g:Landroidx/camera/core/impl/y1;

.field h:Landroidx/camera/core/impl/n0;

.field i:Lq/c;

.field private final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/r0;",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/r0;",
            ">;"
        }
    .end annotation
.end field

.field l:Landroidx/camera/camera2/internal/x1$e;

.field m:Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field n:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/r0;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field final p:Lt/r;

.field final q:Lt/u;

.field private final r:Lr/b;


# direct methods
.method constructor <init>(Lr/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/x1;->b:Ljava/util/List;

    new-instance v0, Landroidx/camera/camera2/internal/x1$a;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/x1$a;-><init>(Landroidx/camera/camera2/internal/x1;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/x1;->c:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    invoke-static {}, Landroidx/camera/core/impl/p1;->X()Landroidx/camera/core/impl/p1;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/x1;->h:Landroidx/camera/core/impl/n0;

    invoke-static {}, Lq/c;->e()Lq/c;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/x1;->i:Lq/c;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/x1;->j:Ljava/util/Map;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/x1;->k:Ljava/util/List;

    sget-object v0, Landroidx/camera/camera2/internal/x1$e;->UNINITIALIZED:Landroidx/camera/camera2/internal/x1$e;

    iput-object v0, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/x1;->o:Ljava/util/Map;

    new-instance v0, Lt/r;

    invoke-direct {v0}, Lt/r;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/x1;->p:Lt/r;

    new-instance v0, Lt/u;

    invoke-direct {v0}, Lt/u;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/x1;->q:Lt/u;

    sget-object v0, Landroidx/camera/camera2/internal/x1$e;->INITIALIZED:Landroidx/camera/camera2/internal/x1$e;

    iput-object v0, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    iput-object p1, p0, Landroidx/camera/camera2/internal/x1;->r:Lr/b;

    new-instance p1, Landroidx/camera/camera2/internal/x1$f;

    invoke-direct {p1, p0}, Landroidx/camera/camera2/internal/x1$f;-><init>(Landroidx/camera/camera2/internal/x1;)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/x1;->d:Landroidx/camera/camera2/internal/x1$f;

    return-void
.end method

.method public static synthetic i(Landroidx/camera/camera2/internal/x1;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/x1;->u(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Landroidx/camera/camera2/internal/x1;Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Ljava/util/List;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/x1;->t(Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Ljava/util/List;)Lcom/google/common/util/concurrent/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Landroidx/camera/camera2/internal/x1;Landroid/hardware/camera2/CameraCaptureSession;IZ)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/x1;->s(Landroid/hardware/camera2/CameraCaptureSession;IZ)V

    return-void
.end method

.method private varargs l(Ljava/util/List;[Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/k;",
            ">;[",
            "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;",
            ")",
            "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    array-length v2, p2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/k;

    invoke-static {v1}, Landroidx/camera/camera2/internal/t1;->a(Landroidx/camera/core/impl/k;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0, p2}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    invoke-static {v0}, Landroidx/camera/camera2/internal/o0;->a(Ljava/util/List;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p1

    return-object p1
.end method

.method private n(Landroidx/camera/core/impl/y1$e;Ljava/util/Map;Ljava/lang/String;)Lr/f;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/y1$e;",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/r0;",
            "Landroid/view/Surface;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lr/f;"
        }
    .end annotation

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$e;->e()Landroidx/camera/core/impl/r0;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Surface;

    const-string v1, "Surface in OutputConfig not found in configuredSurfaceMap."

    invoke-static {v0, v1}, Landroidx/core/util/h;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lr/f;

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$e;->f()I

    move-result v3

    invoke-direct {v2, v3, v0}, Lr/f;-><init>(ILandroid/view/Surface;)V

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$e;->c()Ljava/lang/String;

    move-result-object p3

    :goto_0
    invoke-virtual {v2, p3}, Lr/f;->f(Ljava/lang/String;)V

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$e;->d()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-nez p3, :cond_1

    invoke-virtual {v2}, Lr/f;->b()V

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$e;->d()Ljava/util/List;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/r0;

    invoke-interface {p2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/Surface;

    invoke-static {v0, v1}, Landroidx/core/util/h;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2, v0}, Lr/f;->a(Landroid/view/Surface;)V

    goto :goto_1

    :cond_1
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p3, 0x21

    if-lt p2, p3, :cond_3

    iget-object p2, p0, Landroidx/camera/camera2/internal/x1;->r:Lr/b;

    invoke-virtual {p2}, Lr/b;->d()Landroid/hardware/camera2/params/DynamicRangeProfiles;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$e;->b()Lw/y;

    move-result-object p1

    invoke-static {p1, p2}, Lr/a;->a(Lw/y;Landroid/hardware/camera2/params/DynamicRangeProfiles;)Ljava/lang/Long;

    move-result-object p2

    if-nez p2, :cond_2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "CaptureSession"

    invoke-static {p2, p1}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    goto :goto_3

    :cond_3
    :goto_2
    const-wide/16 p1, 0x1

    :goto_3
    invoke-virtual {v2, p1, p2}, Lr/f;->e(J)V

    return-object v2
.end method

.method private o(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lr/f;",
            ">;)",
            "Ljava/util/List<",
            "Lr/f;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr/f;

    invoke-virtual {v2}, Lr/f;->d()Landroid/view/Surface;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lr/f;->d()Landroid/view/Surface;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method private synthetic s(Landroid/hardware/camera2/CameraCaptureSession;IZ)V
    .locals 0

    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    iget-object p2, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    sget-object p3, Landroidx/camera/camera2/internal/x1$e;->OPENED:Landroidx/camera/camera2/internal/x1$e;

    if-ne p2, p3, :cond_0

    iget-object p2, p0, Landroidx/camera/camera2/internal/x1;->g:Landroidx/camera/core/impl/y1;

    invoke-virtual {p0, p2}, Landroidx/camera/camera2/internal/x1;->r(Landroidx/camera/core/impl/y1;)I

    :cond_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method private synthetic t(Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Ljava/util/List;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-direct {p0, p3, p1, p2}, Landroidx/camera/camera2/internal/x1;->w(Ljava/util/List;Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method private synthetic u(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->n:Landroidx/concurrent/futures/c$a;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "Release completer expected to be null"

    invoke-static {v1, v2}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/x1;->n:Landroidx/concurrent/futures/c$a;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Release[session="

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private static v(Ljava/util/List;)Landroidx/camera/core/impl/n0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;)",
            "Landroidx/camera/core/impl/n0;"
        }
    .end annotation

    invoke-static {}, Landroidx/camera/core/impl/m1;->a0()Landroidx/camera/core/impl/m1;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/l0;

    invoke-virtual {v1}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v1

    invoke-interface {v1}, Landroidx/camera/core/impl/n0;->e()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/n0$a;

    const/4 v4, 0x0

    invoke-interface {v1, v3, v4}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v0, v3}, Landroidx/camera/core/impl/p1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v0, v3, v4}, Landroidx/camera/core/impl/p1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v4, v5}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Detect conflicting option "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Landroidx/camera/core/impl/n0$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " : "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " != "

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v4, "CaptureSession"

    invoke-static {v4, v3}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v3, v5}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method private w(Ljava/util/List;Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;)Lcom/google/common/util/concurrent/f;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/view/Surface;",
            ">;",
            "Landroidx/camera/core/impl/y1;",
            "Landroid/hardware/camera2/CameraDevice;",
            ")",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/camera/camera2/internal/x1$d;->a:[I

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_7

    const/4 v3, 0x2

    if-eq v1, v3, :cond_7

    const/4 v4, 0x3

    const/4 v5, 0x5

    if-eq v1, v4, :cond_0

    if-eq v1, v5, :cond_7

    new-instance p1, Ljava/util/concurrent/CancellationException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "openCaptureSession() not execute in state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->j:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->clear()V

    const/4 v1, 0x0

    move v4, v1

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    if-ge v4, v6, :cond_1

    iget-object v6, p0, Landroidx/camera/camera2/internal/x1;->j:Ljava/util/Map;

    iget-object v7, p0, Landroidx/camera/camera2/internal/x1;->k:Ljava/util/List;

    invoke-interface {v7, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/camera/core/impl/r0;

    invoke-interface {p1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/view/Surface;

    invoke-interface {v6, v7, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    sget-object p1, Landroidx/camera/camera2/internal/x1$e;->OPENING:Landroidx/camera/camera2/internal/x1$e;

    iput-object p1, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    const-string p1, "CaptureSession"

    const-string v4, "Opening capture session."

    invoke-static {p1, v4}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-array p1, v3, [Landroidx/camera/camera2/internal/x2$a;

    iget-object v3, p0, Landroidx/camera/camera2/internal/x1;->d:Landroidx/camera/camera2/internal/x1$f;

    aput-object v3, p1, v1

    new-instance v3, Landroidx/camera/camera2/internal/k3$a;

    invoke-virtual {p2}, Landroidx/camera/core/impl/y1;->i()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, Landroidx/camera/camera2/internal/k3$a;-><init>(Ljava/util/List;)V

    aput-object v3, p1, v2

    invoke-static {p1}, Landroidx/camera/camera2/internal/k3;->v([Landroidx/camera/camera2/internal/x2$a;)Landroidx/camera/camera2/internal/x2$a;

    move-result-object p1

    new-instance v2, Lq/a;

    invoke-virtual {p2}, Landroidx/camera/core/impl/y1;->d()Landroidx/camera/core/impl/n0;

    move-result-object v3

    invoke-direct {v2, v3}, Lq/a;-><init>(Landroidx/camera/core/impl/n0;)V

    invoke-static {}, Lq/c;->e()Lq/c;

    move-result-object v3

    invoke-virtual {v2, v3}, Lq/a;->X(Lq/c;)Lq/c;

    move-result-object v3

    iput-object v3, p0, Landroidx/camera/camera2/internal/x1;->i:Lq/c;

    invoke-virtual {v3}, Lq/c;->d()Lq/c$a;

    move-result-object v3

    invoke-virtual {v3}, Lq/c$a;->d()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p2}, Landroidx/camera/core/impl/y1;->h()Landroidx/camera/core/impl/l0;

    move-result-object v4

    invoke-static {v4}, Landroidx/camera/core/impl/l0$a;->k(Landroidx/camera/core/impl/l0;)Landroidx/camera/core/impl/l0$a;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/camera/core/impl/l0;

    invoke-virtual {v6}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroidx/camera/core/impl/l0$a;->e(Landroidx/camera/core/impl/n0;)V

    goto :goto_1

    :cond_2
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v6, 0x0

    invoke-virtual {v2, v6}, Lq/a;->c0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Landroidx/camera/core/impl/y1;->f()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/camera/core/impl/y1$e;

    iget-object v8, p0, Landroidx/camera/camera2/internal/x1;->j:Ljava/util/Map;

    invoke-direct {p0, v7, v8, v2}, Landroidx/camera/camera2/internal/x1;->n(Landroidx/camera/core/impl/y1$e;Ljava/util/Map;Ljava/lang/String;)Lr/f;

    move-result-object v8

    iget-object v9, p0, Landroidx/camera/camera2/internal/x1;->o:Ljava/util/Map;

    invoke-virtual {v7}, Landroidx/camera/core/impl/y1$e;->e()Landroidx/camera/core/impl/r0;

    move-result-object v10

    invoke-interface {v9, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3

    iget-object v9, p0, Landroidx/camera/camera2/internal/x1;->o:Ljava/util/Map;

    invoke-virtual {v7}, Landroidx/camera/core/impl/y1$e;->e()Landroidx/camera/core/impl/r0;

    move-result-object v7

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Long;

    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Lr/f;->g(J)V

    :cond_3
    invoke-interface {v3, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    invoke-direct {p0, v3}, Landroidx/camera/camera2/internal/x1;->o(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/camera2/internal/x1;->e:Landroidx/camera/camera2/internal/j3;

    invoke-virtual {v3, v1, v2, p1}, Landroidx/camera/camera2/internal/j3;->a(ILjava/util/List;Landroidx/camera/camera2/internal/x2$a;)Lr/w;

    move-result-object p1

    invoke-virtual {p2}, Landroidx/camera/core/impl/y1;->l()I

    move-result v1

    if-ne v1, v5, :cond_5

    invoke-virtual {p2}, Landroidx/camera/core/impl/y1;->e()Landroid/hardware/camera2/params/InputConfiguration;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {p2}, Landroidx/camera/core/impl/y1;->e()Landroid/hardware/camera2/params/InputConfiguration;

    move-result-object p2

    invoke-static {p2}, Lr/e;->b(Ljava/lang/Object;)Lr/e;

    move-result-object p2

    invoke-virtual {p1, p2}, Lr/w;->f(Lr/e;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    :try_start_1
    invoke-virtual {v4}, Landroidx/camera/core/impl/l0$a;->h()Landroidx/camera/core/impl/l0;

    move-result-object p2

    invoke-static {p2, p3}, Landroidx/camera/camera2/internal/f1;->d(Landroidx/camera/core/impl/l0;Landroid/hardware/camera2/CameraDevice;)Landroid/hardware/camera2/CaptureRequest;

    move-result-object p2

    if-eqz p2, :cond_6

    invoke-virtual {p1, p2}, Lr/w;->g(Landroid/hardware/camera2/CaptureRequest;)V
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_6
    :try_start_2
    iget-object p2, p0, Landroidx/camera/camera2/internal/x1;->e:Landroidx/camera/camera2/internal/j3;

    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->k:Ljava/util/List;

    invoke-virtual {p2, p3, p1, v1}, Landroidx/camera/camera2/internal/j3;->c(Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catch_0
    move-exception p1

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "openCaptureSession() should not be possible in state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/camera/camera2/internal/x1$d;->a:[I

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot issue capture request on a closed/released session."

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/x1;->q()V

    goto :goto_0

    :pswitch_2
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->b:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :pswitch_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "issueCaptureRequests() should not be possible in state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public b()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1;->b:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1;->b:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->clear()V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/l0;

    invoke-virtual {v1}, Landroidx/camera/core/impl/l0;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/k;

    invoke-virtual {v2}, Landroidx/camera/core/impl/k;->a()V

    goto :goto_1

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public c(Z)Lcom/google/common/util/concurrent/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/camera/camera2/internal/x1$d;->a:[I

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->f:Landroidx/camera/camera2/internal/x2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    if-eqz p1, :cond_0

    :try_start_1
    invoke-interface {v1}, Landroidx/camera/camera2/internal/x2;->f()V
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    const-string v1, "CaptureSession"

    const-string v2, "Unable to abort captures."

    invoke-static {v1, v2, p1}, Lw/o0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->f:Landroidx/camera/camera2/internal/x2;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/x2;->close()V

    :cond_1
    :pswitch_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->i:Lq/c;

    invoke-virtual {p1}, Lq/c;->d()Lq/c$a;

    move-result-object p1

    invoke-virtual {p1}, Lq/c$a;->a()V

    sget-object p1, Landroidx/camera/camera2/internal/x1$e;->RELEASING:Landroidx/camera/camera2/internal/x1$e;

    iput-object p1, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->e:Landroidx/camera/camera2/internal/j3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The Opener shouldn\'t null in state:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Landroidx/core/util/h;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->e:Landroidx/camera/camera2/internal/j3;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/j3;->e()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/x1;->m()V

    goto :goto_1

    :cond_2
    :pswitch_2
    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->m:Lcom/google/common/util/concurrent/f;

    if-nez p1, :cond_3

    new-instance p1, Landroidx/camera/camera2/internal/w1;

    invoke-direct {p1, p0}, Landroidx/camera/camera2/internal/w1;-><init>(Landroidx/camera/camera2/internal/x1;)V

    invoke-static {p1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/x1;->m:Lcom/google/common/util/concurrent/f;

    :cond_3
    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->m:Lcom/google/common/util/concurrent/f;

    monitor-exit v0

    return-object p1

    :pswitch_3
    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->e:Landroidx/camera/camera2/internal/j3;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The Opener shouldn\'t null in state:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1}, Landroidx/core/util/h;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->e:Landroidx/camera/camera2/internal/j3;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/j3;->e()Z

    :pswitch_4
    sget-object p1, Landroidx/camera/camera2/internal/x1$e;->RELEASED:Landroidx/camera/camera2/internal/x1$e;

    iput-object p1, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    goto :goto_1

    :pswitch_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "release() should not be possible in state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_1
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/4 p1, 0x0

    invoke-static {p1}, La0/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public close()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/camera/camera2/internal/x1$d;->a:[I

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_4

    const/4 v2, 0x2

    if-eq v1, v2, :cond_3

    const/4 v2, 0x3

    if-eq v1, v2, :cond_2

    const/4 v2, 0x4

    if-eq v1, v2, :cond_1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->g:Landroidx/camera/core/impl/y1;

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->i:Lq/c;

    invoke-virtual {v1}, Lq/c;->d()Lq/c$a;

    move-result-object v1

    invoke-virtual {v1}, Lq/c$a;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    :try_start_1
    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/x1;->x(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroidx/camera/camera2/internal/x1;->a(Ljava/util/List;)V
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    const-string v2, "CaptureSession"

    const-string v3, "Unable to issue the request before close the capture session"

    invoke-static {v2, v3, v1}, Lw/o0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->e:Landroidx/camera/camera2/internal/j3;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The Opener shouldn\'t null in state:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/core/util/h;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->e:Landroidx/camera/camera2/internal/j3;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/j3;->e()Z

    sget-object v1, Landroidx/camera/camera2/internal/x1$e;->CLOSED:Landroidx/camera/camera2/internal/x1$e;

    iput-object v1, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/camera/camera2/internal/x1;->g:Landroidx/camera/core/impl/y1;

    goto :goto_1

    :cond_2
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->e:Landroidx/camera/camera2/internal/j3;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "The Opener shouldn\'t null in state:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/core/util/h;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->e:Landroidx/camera/camera2/internal/j3;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/j3;->e()Z

    :cond_3
    sget-object v1, Landroidx/camera/camera2/internal/x1$e;->RELEASED:Landroidx/camera/camera2/internal/x1$e;

    iput-object v1, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    :goto_1
    monitor-exit v0

    return-void

    :cond_4
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "close() should not be possible in state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method public d()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->b:Ljava/util/List;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public e()Landroidx/camera/core/impl/y1;
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->g:Landroidx/camera/core/impl/y1;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public f(Landroidx/camera/core/impl/y1;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/camera/camera2/internal/x1$d;->a:[I

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Session configuration cannot be set on a closed/released session."

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_1
    iput-object p1, p0, Landroidx/camera/camera2/internal/x1;->g:Landroidx/camera/core/impl/y1;

    if-nez p1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->j:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "CaptureSession"

    const-string v1, "Does not have the proper configured lists"

    invoke-static {p1, v1}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v0

    return-void

    :cond_1
    const-string p1, "CaptureSession"

    const-string v1, "Attempting to submit CaptureRequest after setting"

    invoke-static {p1, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->g:Landroidx/camera/core/impl/y1;

    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/x1;->r(Landroidx/camera/core/impl/y1;)I

    goto :goto_0

    :pswitch_2
    iput-object p1, p0, Landroidx/camera/camera2/internal/x1;->g:Landroidx/camera/core/impl/y1;

    goto :goto_0

    :pswitch_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "setSessionConfig() should not be possible in state: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public g(Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;Landroidx/camera/camera2/internal/j3;)Lcom/google/common/util/concurrent/f;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/y1;",
            "Landroid/hardware/camera2/CameraDevice;",
            "Landroidx/camera/camera2/internal/j3;",
            ")",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/camera/camera2/internal/x1$d;->a:[I

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_0

    const-string p1, "CaptureSession"

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Open not allowed in state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "open() should not allow the state: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p3, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :cond_0
    sget-object v1, Landroidx/camera/camera2/internal/x1$e;->GET_SURFACE:Landroidx/camera/camera2/internal/x1$e;

    iput-object v1, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v2, p0, Landroidx/camera/camera2/internal/x1;->k:Ljava/util/List;

    iput-object p3, p0, Landroidx/camera/camera2/internal/x1;->e:Landroidx/camera/camera2/internal/j3;

    const-wide/16 v3, 0x1388

    invoke-virtual {p3, v2, v3, v4}, Landroidx/camera/camera2/internal/j3;->d(Ljava/util/List;J)Lcom/google/common/util/concurrent/f;

    move-result-object p3

    invoke-static {p3}, La0/d;->a(Lcom/google/common/util/concurrent/f;)La0/d;

    move-result-object p3

    new-instance v1, Landroidx/camera/camera2/internal/v1;

    invoke-direct {v1, p0, p1, p2}, Landroidx/camera/camera2/internal/v1;-><init>(Landroidx/camera/camera2/internal/x1;Landroidx/camera/core/impl/y1;Landroid/hardware/camera2/CameraDevice;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->e:Landroidx/camera/camera2/internal/j3;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/j3;->b()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {p3, v1, p1}, La0/d;->e(La0/a;Ljava/util/concurrent/Executor;)La0/d;

    move-result-object p1

    new-instance p2, Landroidx/camera/camera2/internal/x1$b;

    invoke-direct {p2, p0}, Landroidx/camera/camera2/internal/x1$b;-><init>(Landroidx/camera/camera2/internal/x1;)V

    iget-object p3, p0, Landroidx/camera/camera2/internal/x1;->e:Landroidx/camera/camera2/internal/j3;

    invoke-virtual {p3}, Landroidx/camera/camera2/internal/j3;->b()Ljava/util/concurrent/Executor;

    move-result-object p3

    invoke-static {p1, p2, p3}, La0/f;->b(Lcom/google/common/util/concurrent/f;La0/c;Ljava/util/concurrent/Executor;)V

    invoke-static {p1}, La0/f;->j(Lcom/google/common/util/concurrent/f;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public h(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/r0;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/camera2/internal/x1;->o:Ljava/util/Map;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method m()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    sget-object v1, Landroidx/camera/camera2/internal/x1$e;->RELEASED:Landroidx/camera/camera2/internal/x1$e;

    if-ne v0, v1, :cond_0

    const-string v0, "CaptureSession"

    const-string v1, "Skipping finishClose due to being state RELEASED."

    invoke-static {v0, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iput-object v1, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/camera2/internal/x1;->f:Landroidx/camera/camera2/internal/x2;

    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->n:Landroidx/concurrent/futures/c$a;

    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    iput-object v0, p0, Landroidx/camera/camera2/internal/x1;->n:Landroidx/concurrent/futures/c$a;

    :cond_1
    return-void
.end method

.method p(Ljava/util/List;)I
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;)I"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    sget-object v2, Landroidx/camera/camera2/internal/x1$e;->OPENED:Landroidx/camera/camera2/internal/x1$e;

    const/4 v3, -0x1

    if-eq v1, v2, :cond_0

    const-string p1, "CaptureSession"

    const-string v1, "Skipping issueBurstCaptureRequest due to session closed"

    invoke-static {p1, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v0

    return v3

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return v3

    :cond_1
    :try_start_1
    new-instance v1, Landroidx/camera/camera2/internal/l1;

    invoke-direct {v1}, Landroidx/camera/camera2/internal/l1;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const-string v4, "CaptureSession"

    const-string v5, "Issuing capture request."

    invoke-static {v4, v5}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/camera/core/impl/l0;

    invoke-virtual {v6}, Landroidx/camera/core/impl/l0;->f()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_2

    const-string v6, "CaptureSession"

    const-string v7, "Skipping issuing empty capture request."

    invoke-static {v6, v7}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-virtual {v6}, Landroidx/camera/core/impl/l0;->f()Ljava/util/List;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/camera/core/impl/r0;

    iget-object v10, p0, Landroidx/camera/camera2/internal/x1;->j:Ljava/util/Map;

    invoke-interface {v10, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    const-string v8, "CaptureSession"

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Skipping capture request with invalid surface: "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v8, v4

    goto :goto_1

    :cond_4
    move v8, v7

    :goto_1
    if-nez v8, :cond_5

    goto :goto_0

    :cond_5
    invoke-virtual {v6}, Landroidx/camera/core/impl/l0;->h()I

    move-result v8

    const/4 v9, 0x2

    if-ne v8, v9, :cond_6

    move v5, v7

    :cond_6
    invoke-static {v6}, Landroidx/camera/core/impl/l0$a;->k(Landroidx/camera/core/impl/l0;)Landroidx/camera/core/impl/l0$a;

    move-result-object v7

    invoke-virtual {v6}, Landroidx/camera/core/impl/l0;->h()I

    move-result v8

    const/4 v9, 0x5

    if-ne v8, v9, :cond_7

    invoke-virtual {v6}, Landroidx/camera/core/impl/l0;->c()Landroidx/camera/core/impl/s;

    move-result-object v8

    if-eqz v8, :cond_7

    invoke-virtual {v6}, Landroidx/camera/core/impl/l0;->c()Landroidx/camera/core/impl/s;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroidx/camera/core/impl/l0$a;->o(Landroidx/camera/core/impl/s;)V

    :cond_7
    iget-object v8, p0, Landroidx/camera/camera2/internal/x1;->g:Landroidx/camera/core/impl/y1;

    if-eqz v8, :cond_8

    invoke-virtual {v8}, Landroidx/camera/core/impl/y1;->h()Landroidx/camera/core/impl/l0;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroidx/camera/core/impl/l0$a;->e(Landroidx/camera/core/impl/n0;)V

    :cond_8
    iget-object v8, p0, Landroidx/camera/camera2/internal/x1;->h:Landroidx/camera/core/impl/n0;

    invoke-virtual {v7, v8}, Landroidx/camera/core/impl/l0$a;->e(Landroidx/camera/core/impl/n0;)V

    invoke-virtual {v6}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v8

    invoke-virtual {v7, v8}, Landroidx/camera/core/impl/l0$a;->e(Landroidx/camera/core/impl/n0;)V

    invoke-virtual {v7}, Landroidx/camera/core/impl/l0$a;->h()Landroidx/camera/core/impl/l0;

    move-result-object v7

    iget-object v8, p0, Landroidx/camera/camera2/internal/x1;->f:Landroidx/camera/camera2/internal/x2;

    invoke-interface {v8}, Landroidx/camera/camera2/internal/x2;->g()Landroid/hardware/camera2/CameraDevice;

    move-result-object v8

    iget-object v9, p0, Landroidx/camera/camera2/internal/x1;->j:Ljava/util/Map;

    invoke-static {v7, v8, v9}, Landroidx/camera/camera2/internal/f1;->c(Landroidx/camera/core/impl/l0;Landroid/hardware/camera2/CameraDevice;Ljava/util/Map;)Landroid/hardware/camera2/CaptureRequest;

    move-result-object v7

    if-nez v7, :cond_9

    const-string p1, "CaptureSession"

    const-string v1, "Skipping issuing request without surface."

    invoke-static {p1, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return v3

    :cond_9
    :try_start_3
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v6}, Landroidx/camera/core/impl/l0;->b()Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroidx/camera/core/impl/k;

    invoke-static {v9, v8}, Landroidx/camera/camera2/internal/t1;->b(Landroidx/camera/core/impl/k;Ljava/util/List;)V

    goto :goto_2

    :cond_a
    invoke-virtual {v1, v7, v8}, Landroidx/camera/camera2/internal/l1;->a(Landroid/hardware/camera2/CaptureRequest;Ljava/util/List;)V

    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_b
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_e

    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->p:Lt/r;

    invoke-virtual {p1, v2, v5}, Lt/r;->a(Ljava/util/List;Z)Z

    move-result p1

    if-eqz p1, :cond_c

    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->f:Landroidx/camera/camera2/internal/x2;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/x2;->d()V

    new-instance p1, Landroidx/camera/camera2/internal/u1;

    invoke-direct {p1, p0}, Landroidx/camera/camera2/internal/u1;-><init>(Landroidx/camera/camera2/internal/x1;)V

    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/l1;->c(Landroidx/camera/camera2/internal/l1$a;)V

    :cond_c
    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->q:Lt/u;

    invoke-virtual {p1, v2, v5}, Lt/u;->b(Ljava/util/List;Z)Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    sub-int/2addr p1, v7

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/hardware/camera2/CaptureRequest;

    new-instance v4, Landroidx/camera/camera2/internal/x1$c;

    invoke-direct {v4, p0}, Landroidx/camera/camera2/internal/x1$c;-><init>(Landroidx/camera/camera2/internal/x1;)V

    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1, p1, v4}, Landroidx/camera/camera2/internal/l1;->a(Landroid/hardware/camera2/CaptureRequest;Ljava/util/List;)V

    :cond_d
    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->f:Landroidx/camera/camera2/internal/x2;

    invoke-interface {p1, v2, v1}, Landroidx/camera/camera2/internal/x2;->k(Ljava/util/List;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1
    :try_end_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return p1

    :cond_e
    :try_start_5
    const-string p1, "CaptureSession"

    const-string v1, "Skipping issuing burst request due to no valid request elements"

    invoke-static {p1, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_5
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_3

    :catch_0
    move-exception p1

    :try_start_6
    const-string v1, "CaptureSession"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to access camera: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->dumpStack()V

    :goto_3
    monitor-exit v0

    return v3

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method q()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->b:Ljava/util/List;

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/x1;->p(Ljava/util/List;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Landroidx/camera/camera2/internal/x1;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    throw v0
.end method

.method r(Landroidx/camera/core/impl/y1;)I
    .locals 6

    iget-object v0, p0, Landroidx/camera/camera2/internal/x1;->a:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, -0x1

    if-nez p1, :cond_0

    :try_start_0
    const-string p1, "CaptureSession"

    const-string v2, "Skipping issueRepeatingCaptureRequests for no configuration case."

    invoke-static {p1, v2}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v0

    return v1

    :cond_0
    iget-object v2, p0, Landroidx/camera/camera2/internal/x1;->l:Landroidx/camera/camera2/internal/x1$e;

    sget-object v3, Landroidx/camera/camera2/internal/x1$e;->OPENED:Landroidx/camera/camera2/internal/x1$e;

    if-eq v2, v3, :cond_1

    const-string p1, "CaptureSession"

    const-string v2, "Skipping issueRepeatingCaptureRequests due to session closed"

    invoke-static {p1, v2}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    monitor-exit v0

    return v1

    :cond_1
    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->h()Landroidx/camera/core/impl/l0;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/impl/l0;->f()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    const-string p1, "CaptureSession"

    const-string v2, "Skipping issueRepeatingCaptureRequests for no surface."

    invoke-static {p1, v2}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/x1;->f:Landroidx/camera/camera2/internal/x2;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/x2;->d()V
    :try_end_1
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    const-string v2, "CaptureSession"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to access camera: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->dumpStack()V

    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return v1

    :cond_2
    :try_start_3
    const-string v2, "CaptureSession"

    const-string v3, "Issuing request for session."

    invoke-static {v2, v3}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/camera/core/impl/l0$a;->k(Landroidx/camera/core/impl/l0;)Landroidx/camera/core/impl/l0$a;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/camera2/internal/x1;->i:Lq/c;

    invoke-virtual {v3}, Lq/c;->d()Lq/c$a;

    move-result-object v3

    invoke-virtual {v3}, Lq/c$a;->e()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Landroidx/camera/camera2/internal/x1;->v(Ljava/util/List;)Landroidx/camera/core/impl/n0;

    move-result-object v3

    iput-object v3, p0, Landroidx/camera/camera2/internal/x1;->h:Landroidx/camera/core/impl/n0;

    invoke-virtual {v2, v3}, Landroidx/camera/core/impl/l0$a;->e(Landroidx/camera/core/impl/n0;)V

    invoke-virtual {v2}, Landroidx/camera/core/impl/l0$a;->h()Landroidx/camera/core/impl/l0;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/camera2/internal/x1;->f:Landroidx/camera/camera2/internal/x2;

    invoke-interface {v3}, Landroidx/camera/camera2/internal/x2;->g()Landroid/hardware/camera2/CameraDevice;

    move-result-object v3

    iget-object v4, p0, Landroidx/camera/camera2/internal/x1;->j:Ljava/util/Map;

    invoke-static {v2, v3, v4}, Landroidx/camera/camera2/internal/f1;->c(Landroidx/camera/core/impl/l0;Landroid/hardware/camera2/CameraDevice;Ljava/util/Map;)Landroid/hardware/camera2/CaptureRequest;

    move-result-object v2

    if-nez v2, :cond_3

    const-string p1, "CaptureSession"

    const-string v2, "Skipping issuing empty request for session."

    invoke-static {p1, v2}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_3
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    monitor-exit v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return v1

    :cond_3
    :try_start_5
    invoke-virtual {p1}, Landroidx/camera/core/impl/l0;->b()Ljava/util/List;

    move-result-object p1

    const/4 v3, 0x1

    new-array v3, v3, [Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    iget-object v4, p0, Landroidx/camera/camera2/internal/x1;->c:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-direct {p0, p1, v3}, Landroidx/camera/camera2/internal/x1;->l(Ljava/util/List;[Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p1

    iget-object v3, p0, Landroidx/camera/camera2/internal/x1;->f:Landroidx/camera/camera2/internal/x2;

    invoke-interface {v3, v2, p1}, Landroidx/camera/camera2/internal/x2;->h(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1
    :try_end_5
    .catch Landroid/hardware/camera2/CameraAccessException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    monitor-exit v0

    return p1

    :catch_1
    move-exception p1

    const-string v2, "CaptureSession"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unable to access camera: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v2, p1}, Lw/o0;->c(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/Thread;->dumpStack()V

    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p1
.end method

.method x(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;)",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l0;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/l0;

    invoke-static {v1}, Landroidx/camera/core/impl/l0$a;->k(Landroidx/camera/core/impl/l0;)Landroidx/camera/core/impl/l0$a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/l0$a;->r(I)V

    iget-object v2, p0, Landroidx/camera/camera2/internal/x1;->g:Landroidx/camera/core/impl/y1;

    invoke-virtual {v2}, Landroidx/camera/core/impl/y1;->h()Landroidx/camera/core/impl/l0;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/camera/core/impl/l0;->f()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/r0;

    invoke-virtual {v1, v3}, Landroidx/camera/core/impl/l0$a;->f(Landroidx/camera/core/impl/r0;)V

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Landroidx/camera/core/impl/l0$a;->h()Landroidx/camera/core/impl/l0;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method
