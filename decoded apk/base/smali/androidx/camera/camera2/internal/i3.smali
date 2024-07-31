.class Landroidx/camera/camera2/internal/i3;
.super Landroidx/camera/camera2/internal/d3;
.source "SourceFile"


# instance fields
.field private final o:Ljava/lang/Object;

.field private p:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/r0;",
            ">;"
        }
    .end annotation
.end field

.field q:Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Lt/i;

.field private final s:Lt/y;

.field private final t:Lt/h;


# direct methods
.method constructor <init>(Landroidx/camera/core/impl/t1;Landroidx/camera/core/impl/t1;Landroidx/camera/camera2/internal/a2;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0, p3, p4, p5, p6}, Landroidx/camera/camera2/internal/d3;-><init>(Landroidx/camera/camera2/internal/a2;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Landroid/os/Handler;)V

    new-instance p3, Ljava/lang/Object;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Landroidx/camera/camera2/internal/i3;->o:Ljava/lang/Object;

    new-instance p3, Lt/i;

    invoke-direct {p3, p1, p2}, Lt/i;-><init>(Landroidx/camera/core/impl/t1;Landroidx/camera/core/impl/t1;)V

    iput-object p3, p0, Landroidx/camera/camera2/internal/i3;->r:Lt/i;

    new-instance p3, Lt/y;

    invoke-direct {p3, p1}, Lt/y;-><init>(Landroidx/camera/core/impl/t1;)V

    iput-object p3, p0, Landroidx/camera/camera2/internal/i3;->s:Lt/y;

    new-instance p1, Lt/h;

    invoke-direct {p1, p2}, Lt/h;-><init>(Landroidx/camera/core/impl/t1;)V

    iput-object p1, p0, Landroidx/camera/camera2/internal/i3;->t:Lt/h;

    return-void
.end method

.method public static synthetic J(Landroidx/camera/camera2/internal/i3;)V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/camera2/internal/i3;->O()V

    return-void
.end method

.method public static synthetic K(Landroidx/camera/camera2/internal/i3;Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/i3;->Q(Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;)Lcom/google/common/util/concurrent/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Landroidx/camera/camera2/internal/i3;Landroidx/camera/camera2/internal/x2;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/i3;->P(Landroidx/camera/camera2/internal/x2;)V

    return-void
.end method

.method public static synthetic M(Landroidx/camera/camera2/internal/i3;Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/i3;->R(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p0

    return p0
.end method

.method private synthetic O()V
    .locals 1

    const-string v0, "Session call super.close()"

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/i3;->N(Ljava/lang/String;)V

    invoke-super {p0}, Landroidx/camera/camera2/internal/d3;->close()V

    return-void
.end method

.method private synthetic P(Landroidx/camera/camera2/internal/x2;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/camera/camera2/internal/d3;->r(Landroidx/camera/camera2/internal/x2;)V

    return-void
.end method

.method private synthetic Q(Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-super {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/d3;->n(Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method private synthetic R(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 0

    invoke-super {p0, p1, p2}, Landroidx/camera/camera2/internal/d3;->h(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    return p1
.end method


# virtual methods
.method N(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SyncCaptureSessionImpl"

    invoke-static {v0, p1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public close()V
    .locals 3

    const-string v0, "Session call close()"

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/i3;->N(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/i3;->s:Lt/y;

    invoke-virtual {v0}, Lt/y;->f()V

    iget-object v0, p0, Landroidx/camera/camera2/internal/i3;->s:Lt/y;

    invoke-virtual {v0}, Lt/y;->c()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    new-instance v1, Landroidx/camera/camera2/internal/f3;

    invoke-direct {v1, p0}, Landroidx/camera/camera2/internal/f3;-><init>(Landroidx/camera/camera2/internal/i3;)V

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/d3;->b()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public h(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/i3;->s:Lt/y;

    new-instance v1, Landroidx/camera/camera2/internal/e3;

    invoke-direct {v1, p0}, Landroidx/camera/camera2/internal/e3;-><init>(Landroidx/camera/camera2/internal/i3;)V

    invoke-virtual {v0, p1, p2, v1}, Lt/y;->h(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Lt/y$c;)I

    move-result p1

    return p1
.end method

.method public j(Ljava/util/List;J)Lcom/google/common/util/concurrent/f;
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

    iget-object v0, p0, Landroidx/camera/camera2/internal/i3;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/camera2/internal/i3;->p:Ljava/util/List;

    invoke-super {p0, p1, p2, p3}, Landroidx/camera/camera2/internal/d3;->j(Ljava/util/List;J)Lcom/google/common/util/concurrent/f;

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

.method public m()Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/i3;->s:Lt/y;

    invoke-virtual {v0}, Lt/y;->c()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0
.end method

.method public n(Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;)Lcom/google/common/util/concurrent/f;
    .locals 7
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

    iget-object v0, p0, Landroidx/camera/camera2/internal/i3;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/i3;->s:Lt/y;

    iget-object v2, p0, Landroidx/camera/camera2/internal/d3;->b:Landroidx/camera/camera2/internal/a2;

    invoke-virtual {v2}, Landroidx/camera/camera2/internal/a2;->e()Ljava/util/List;

    move-result-object v5

    new-instance v6, Landroidx/camera/camera2/internal/g3;

    invoke-direct {v6, p0}, Landroidx/camera/camera2/internal/g3;-><init>(Landroidx/camera/camera2/internal/i3;)V

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-virtual/range {v1 .. v6}, Lt/y;->g(Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;Ljava/util/List;Lt/y$b;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/i3;->q:Lcom/google/common/util/concurrent/f;

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

.method public p(Landroidx/camera/camera2/internal/x2;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/i3;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/i3;->r:Lt/i;

    iget-object v2, p0, Landroidx/camera/camera2/internal/i3;->p:Ljava/util/List;

    invoke-virtual {v1, v2}, Lt/i;->a(Ljava/util/List;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v0, "onClosed()"

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/i3;->N(Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/camera/camera2/internal/d3;->p(Landroidx/camera/camera2/internal/x2;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public r(Landroidx/camera/camera2/internal/x2;)V
    .locals 4

    const-string v0, "Session onConfigured()"

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/i3;->N(Ljava/lang/String;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/i3;->t:Lt/h;

    iget-object v1, p0, Landroidx/camera/camera2/internal/d3;->b:Landroidx/camera/camera2/internal/a2;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/a2;->f()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/d3;->b:Landroidx/camera/camera2/internal/a2;

    invoke-virtual {v2}, Landroidx/camera/camera2/internal/a2;->d()Ljava/util/List;

    move-result-object v2

    new-instance v3, Landroidx/camera/camera2/internal/h3;

    invoke-direct {v3, p0}, Landroidx/camera/camera2/internal/h3;-><init>(Landroidx/camera/camera2/internal/i3;)V

    invoke-virtual {v0, p1, v1, v2, v3}, Lt/h;->c(Landroidx/camera/camera2/internal/x2;Ljava/util/List;Ljava/util/List;Lt/h$a;)V

    return-void
.end method

.method public stop()Z
    .locals 3

    iget-object v0, p0, Landroidx/camera/camera2/internal/i3;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Landroidx/camera/camera2/internal/d3;->C()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroidx/camera/camera2/internal/i3;->r:Lt/i;

    iget-object v2, p0, Landroidx/camera/camera2/internal/i3;->p:Ljava/util/List;

    invoke-virtual {v1, v2}, Lt/i;->a(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/i3;->q:Lcom/google/common/util/concurrent/f;

    if-eqz v1, :cond_1

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_1
    :goto_0
    invoke-super {p0}, Landroidx/camera/camera2/internal/d3;->stop()Z

    move-result v1

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
