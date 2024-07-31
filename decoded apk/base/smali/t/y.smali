.class public Lt/y;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt/y$b;,
        Lt/y$c;
    }
.end annotation


# instance fields
.field private final a:Z

.field private final b:Ljava/lang/Object;

.field private final c:Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field d:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private e:Z

.field private final f:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/t1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lt/y;->b:Ljava/lang/Object;

    new-instance v0, Lt/y$a;

    invoke-direct {v0, p0}, Lt/y$a;-><init>(Lt/y;)V

    iput-object v0, p0, Lt/y;->f:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    const-class v0, Ls/i;

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/t1;->a(Ljava/lang/Class;)Z

    move-result p1

    iput-boolean p1, p0, Lt/y;->a:Z

    invoke-virtual {p0}, Lt/y;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lt/w;

    invoke-direct {p1, p0}, Lt/w;-><init>(Lt/y;)V

    invoke-static {p1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1}, La0/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lt/y;->c:Lcom/google/common/util/concurrent/f;

    return-void
.end method

.method public static synthetic a(Lt/y;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lt/y;->d(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lt/y$b;Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;Ljava/util/List;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lt/y;->e(Lt/y$b;Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;Ljava/util/List;)Lcom/google/common/util/concurrent/f;

    move-result-object p0

    return-object p0
.end method

.method private synthetic d(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lt/y;->d:Landroidx/concurrent/futures/c$a;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "WaitForRepeatingRequestStart["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic e(Lt/y$b;Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;Ljava/util/List;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-interface {p0, p1, p2, p3}, Lt/y$b;->a(Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;)Lcom/google/common/util/concurrent/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public c()Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lt/y;->c:Lcom/google/common/util/concurrent/f;

    invoke-static {v0}, La0/f;->j(Lcom/google/common/util/concurrent/f;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0
.end method

.method public f()V
    .locals 3

    iget-object v0, p0, Lt/y;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lt/y;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lt/y;->e:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lt/y;->c:Lcom/google/common/util/concurrent/f;

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public g(Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;Ljava/util/List;Lt/y$b;)Lcom/google/common/util/concurrent/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/hardware/camera2/CameraDevice;",
            "Lr/w;",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/r0;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/camera/camera2/internal/x2;",
            ">;",
            "Lt/y$b;",
            ")",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/camera2/internal/x2;

    invoke-interface {v1}, Landroidx/camera/camera2/internal/x2;->m()Lcom/google/common/util/concurrent/f;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, La0/f;->n(Ljava/util/Collection;)Lcom/google/common/util/concurrent/f;

    move-result-object p4

    invoke-static {p4}, La0/d;->a(Lcom/google/common/util/concurrent/f;)La0/d;

    move-result-object p4

    new-instance v0, Lt/x;

    invoke-direct {v0, p5, p1, p2, p3}, Lt/x;-><init>(Lt/y$b;Landroid/hardware/camera2/CameraDevice;Lr/w;Ljava/util/List;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-virtual {p4, v0, p1}, La0/d;->e(La0/a;Ljava/util/concurrent/Executor;)La0/d;

    move-result-object p1

    return-object p1
.end method

.method public h(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;Lt/y$c;)I
    .locals 4

    iget-object v0, p0, Lt/y;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lt/y;->i()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x2

    new-array v1, v1, [Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    iget-object v2, p0, Lt/y;->f:Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-static {v1}, Landroidx/camera/camera2/internal/o0;->b([Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;

    move-result-object p2

    iput-boolean v2, p0, Lt/y;->e:Z

    :cond_0
    invoke-interface {p3, p1, p2}, Lt/y$c;->a(Landroid/hardware/camera2/CaptureRequest;Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)I

    move-result p1

    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public i()Z
    .locals 1

    iget-boolean v0, p0, Lt/y;->a:Z

    return v0
.end method
