.class final Landroidx/camera/camera2/internal/u3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/u3$b;
    }
.end annotation


# instance fields
.field private final a:Landroidx/camera/camera2/internal/u;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Landroidx/camera/camera2/internal/v3;

.field private final d:Landroidx/lifecycle/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/r<",
            "Lw/k1;",
            ">;"
        }
    .end annotation
.end field

.field final e:Landroidx/camera/camera2/internal/u3$b;

.field private f:Z

.field private g:Landroidx/camera/camera2/internal/u$c;


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/u;Landroidx/camera/camera2/internal/compat/d0;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/camera2/internal/u3;->f:Z

    new-instance v0, Landroidx/camera/camera2/internal/u3$a;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/u3$a;-><init>(Landroidx/camera/camera2/internal/u3;)V

    iput-object v0, p0, Landroidx/camera/camera2/internal/u3;->g:Landroidx/camera/camera2/internal/u$c;

    iput-object p1, p0, Landroidx/camera/camera2/internal/u3;->a:Landroidx/camera/camera2/internal/u;

    iput-object p3, p0, Landroidx/camera/camera2/internal/u3;->b:Ljava/util/concurrent/Executor;

    invoke-static {p2}, Landroidx/camera/camera2/internal/u3;->f(Landroidx/camera/camera2/internal/compat/d0;)Landroidx/camera/camera2/internal/u3$b;

    move-result-object p2

    iput-object p2, p0, Landroidx/camera/camera2/internal/u3;->e:Landroidx/camera/camera2/internal/u3$b;

    new-instance p3, Landroidx/camera/camera2/internal/v3;

    invoke-interface {p2}, Landroidx/camera/camera2/internal/u3$b;->f()F

    move-result v0

    invoke-interface {p2}, Landroidx/camera/camera2/internal/u3$b;->d()F

    move-result p2

    invoke-direct {p3, v0, p2}, Landroidx/camera/camera2/internal/v3;-><init>(FF)V

    iput-object p3, p0, Landroidx/camera/camera2/internal/u3;->c:Landroidx/camera/camera2/internal/v3;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-virtual {p3, p2}, Landroidx/camera/camera2/internal/v3;->h(F)V

    new-instance p2, Landroidx/lifecycle/r;

    invoke-static {p3}, Lb0/f;->f(Lw/k1;)Lw/k1;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/lifecycle/r;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/u3;->d:Landroidx/lifecycle/r;

    iget-object p2, p0, Landroidx/camera/camera2/internal/u3;->g:Landroidx/camera/camera2/internal/u$c;

    invoke-virtual {p1, p2}, Landroidx/camera/camera2/internal/u;->t(Landroidx/camera/camera2/internal/u$c;)V

    return-void
.end method

.method public static synthetic a(Landroidx/camera/camera2/internal/u3;Landroidx/concurrent/futures/c$a;Lw/k1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/u3;->m(Landroidx/concurrent/futures/c$a;Lw/k1;)V

    return-void
.end method

.method public static synthetic b(Landroidx/camera/camera2/internal/u3;Lw/k1;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/u3;->n(Lw/k1;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/camera/camera2/internal/u3;Lw/k1;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/u3;->l(Lw/k1;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/camera/camera2/internal/u3;Landroidx/concurrent/futures/c$a;Lw/k1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/u3;->k(Landroidx/concurrent/futures/c$a;Lw/k1;)V

    return-void
.end method

.method private static f(Landroidx/camera/camera2/internal/compat/d0;)Landroidx/camera/camera2/internal/u3$b;
    .locals 1

    invoke-static {p0}, Landroidx/camera/camera2/internal/u3;->j(Landroidx/camera/camera2/internal/compat/d0;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroidx/camera/camera2/internal/c;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/c;-><init>(Landroidx/camera/camera2/internal/compat/d0;)V

    return-object v0

    :cond_0
    new-instance v0, Landroidx/camera/camera2/internal/b2;

    invoke-direct {v0, p0}, Landroidx/camera/camera2/internal/b2;-><init>(Landroidx/camera/camera2/internal/compat/d0;)V

    return-object v0
.end method

.method static g(Landroidx/camera/camera2/internal/compat/d0;)Lw/k1;
    .locals 2

    invoke-static {p0}, Landroidx/camera/camera2/internal/u3;->f(Landroidx/camera/camera2/internal/compat/d0;)Landroidx/camera/camera2/internal/u3$b;

    move-result-object p0

    new-instance v0, Landroidx/camera/camera2/internal/v3;

    invoke-interface {p0}, Landroidx/camera/camera2/internal/u3$b;->f()F

    move-result v1

    invoke-interface {p0}, Landroidx/camera/camera2/internal/u3$b;->d()F

    move-result p0

    invoke-direct {v0, v1, p0}, Landroidx/camera/camera2/internal/v3;-><init>(FF)V

    const/high16 p0, 0x3f800000    # 1.0f

    invoke-virtual {v0, p0}, Landroidx/camera/camera2/internal/v3;->h(F)V

    invoke-static {v0}, Lb0/f;->f(Lw/k1;)Lw/k1;

    move-result-object p0

    return-object p0
.end method

.method private static h(Landroidx/camera/camera2/internal/compat/d0;)Landroid/util/Range;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/camera2/internal/compat/d0;",
            ")",
            "Landroid/util/Range<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    :try_start_0
    invoke-static {}, Landroidx/camera/camera2/internal/a;->a()Landroid/hardware/camera2/CameraCharacteristics$Key;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/compat/d0;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/util/Range;
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const-string v0, "ZoomControl"

    const-string v1, "AssertionError, fail to get camera characteristic."

    invoke-static {v0, v1, p0}, Lw/o0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method static j(Landroidx/camera/camera2/internal/compat/d0;)Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    invoke-static {p0}, Landroidx/camera/camera2/internal/u3;->h(Landroidx/camera/camera2/internal/compat/d0;)Landroid/util/Range;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private synthetic k(Landroidx/concurrent/futures/c$a;Lw/k1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/u3;->r(Landroidx/concurrent/futures/c$a;Lw/k1;)V

    return-void
.end method

.method private synthetic l(Lw/k1;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/u3;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/s3;

    invoke-direct {v1, p0, p2, p1}, Landroidx/camera/camera2/internal/s3;-><init>(Landroidx/camera/camera2/internal/u3;Landroidx/concurrent/futures/c$a;Lw/k1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "setLinearZoom"

    return-object p1
.end method

.method private synthetic m(Landroidx/concurrent/futures/c$a;Lw/k1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/u3;->r(Landroidx/concurrent/futures/c$a;Lw/k1;)V

    return-void
.end method

.method private synthetic n(Lw/k1;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/u3;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/t3;

    invoke-direct {v1, p0, p2, p1}, Landroidx/camera/camera2/internal/t3;-><init>(Landroidx/camera/camera2/internal/u3;Landroidx/concurrent/futures/c$a;Lw/k1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string p1, "setZoomRatio"

    return-object p1
.end method

.method private r(Landroidx/concurrent/futures/c$a;Lw/k1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;",
            "Lw/k1;",
            ")V"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/u3;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/u3;->c:Landroidx/camera/camera2/internal/v3;

    monitor-enter v0

    :try_start_0
    iget-object p2, p0, Landroidx/camera/camera2/internal/u3;->c:Landroidx/camera/camera2/internal/v3;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p2, v1}, Landroidx/camera/camera2/internal/v3;->h(F)V

    iget-object p2, p0, Landroidx/camera/camera2/internal/u3;->c:Landroidx/camera/camera2/internal/v3;

    invoke-static {p2}, Lb0/f;->f(Lw/k1;)Lw/k1;

    move-result-object p2

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0, p2}, Landroidx/camera/camera2/internal/u3;->s(Lw/k1;)V

    new-instance p2, Lw/j$a;

    const-string v0, "Camera is not active."

    invoke-direct {p2, v0}, Lw/j$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    invoke-direct {p0, p2}, Landroidx/camera/camera2/internal/u3;->s(Lw/k1;)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/u3;->e:Landroidx/camera/camera2/internal/u3$b;

    invoke-interface {p2}, Lw/k1;->d()F

    move-result p2

    invoke-interface {v0, p2, p1}, Landroidx/camera/camera2/internal/u3$b;->b(FLandroidx/concurrent/futures/c$a;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/u3;->a:Landroidx/camera/camera2/internal/u;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/u;->f0()J

    return-void
.end method

.method private s(Lw/k1;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Landroidx/camera/camera2/internal/u3;->d:Landroidx/lifecycle/r;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/r;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/u3;->d:Landroidx/lifecycle/r;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/r;->postValue(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method e(Lq/a$a;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/u3;->e:Landroidx/camera/camera2/internal/u3$b;

    invoke-interface {v0, p1}, Landroidx/camera/camera2/internal/u3$b;->c(Lq/a$a;)V

    return-void
.end method

.method i()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Lw/k1;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/u3;->d:Landroidx/lifecycle/r;

    return-object v0
.end method

.method o(Z)V
    .locals 2

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/u3;->f:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/u3;->f:Z

    if-nez p1, :cond_1

    iget-object p1, p0, Landroidx/camera/camera2/internal/u3;->c:Landroidx/camera/camera2/internal/v3;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/u3;->c:Landroidx/camera/camera2/internal/v3;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, Landroidx/camera/camera2/internal/v3;->h(F)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/u3;->c:Landroidx/camera/camera2/internal/v3;

    invoke-static {v0}, Lb0/f;->f(Lw/k1;)Lw/k1;

    move-result-object v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0, v0}, Landroidx/camera/camera2/internal/u3;->s(Lw/k1;)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/u3;->e:Landroidx/camera/camera2/internal/u3$b;

    invoke-interface {p1}, Landroidx/camera/camera2/internal/u3$b;->e()V

    iget-object p1, p0, Landroidx/camera/camera2/internal/u3;->a:Landroidx/camera/camera2/internal/u;

    invoke-virtual {p1}, Landroidx/camera/camera2/internal/u;->f0()J

    goto :goto_0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-void
.end method

.method p(F)Lcom/google/common/util/concurrent/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/u3;->c:Landroidx/camera/camera2/internal/v3;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/u3;->c:Landroidx/camera/camera2/internal/v3;

    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/v3;->g(F)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/u3;->c:Landroidx/camera/camera2/internal/v3;

    invoke-static {p1}, Lb0/f;->f(Lw/k1;)Lw/k1;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/u3;->s(Lw/k1;)V

    new-instance v0, Landroidx/camera/camera2/internal/r3;

    invoke-direct {v0, p0, p1}, Landroidx/camera/camera2/internal/r3;-><init>(Landroidx/camera/camera2/internal/u3;Lw/k1;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method q(F)Lcom/google/common/util/concurrent/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(F)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/u3;->c:Landroidx/camera/camera2/internal/v3;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/u3;->c:Landroidx/camera/camera2/internal/v3;

    invoke-virtual {v1, p1}, Landroidx/camera/camera2/internal/v3;->h(F)V

    iget-object p1, p0, Landroidx/camera/camera2/internal/u3;->c:Landroidx/camera/camera2/internal/v3;

    invoke-static {p1}, Lb0/f;->f(Lw/k1;)Lw/k1;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/u3;->s(Lw/k1;)V

    new-instance v0, Landroidx/camera/camera2/internal/q3;

    invoke-direct {v0, p0, p1}, Landroidx/camera/camera2/internal/q3;-><init>(Landroidx/camera/camera2/internal/u3;Lw/k1;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :catch_0
    move-exception p1

    :try_start_2
    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    monitor-exit v0

    return-object p1

    :goto_0
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method
