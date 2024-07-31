.class final Landroidx/camera/camera2/internal/u$a;
.super Landroidx/camera/core/impl/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/camera2/internal/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/camera/core/impl/k;",
            ">;"
        }
    .end annotation
.end field

.field b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/camera/core/impl/k;",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/camera/core/impl/k;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/u$a;->a:Ljava/util/Set;

    new-instance v0, Landroid/util/ArrayMap;

    invoke-direct {v0}, Landroid/util/ArrayMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/u$a;->b:Ljava/util/Map;

    return-void
.end method

.method public static synthetic d(Landroidx/camera/core/impl/k;Landroidx/camera/core/impl/s;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/camera2/internal/u$a;->i(Landroidx/camera/core/impl/k;Landroidx/camera/core/impl/s;)V

    return-void
.end method

.method public static synthetic e(Landroidx/camera/core/impl/k;)V
    .locals 0

    invoke-static {p0}, Landroidx/camera/camera2/internal/u$a;->h(Landroidx/camera/core/impl/k;)V

    return-void
.end method

.method public static synthetic f(Landroidx/camera/core/impl/k;Landroidx/camera/core/impl/m;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/camera2/internal/u$a;->j(Landroidx/camera/core/impl/k;Landroidx/camera/core/impl/m;)V

    return-void
.end method

.method private static synthetic h(Landroidx/camera/core/impl/k;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/impl/k;->a()V

    return-void
.end method

.method private static synthetic i(Landroidx/camera/core/impl/k;Landroidx/camera/core/impl/s;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/impl/k;->b(Landroidx/camera/core/impl/s;)V

    return-void
.end method

.method private static synthetic j(Landroidx/camera/core/impl/k;Landroidx/camera/core/impl/m;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/impl/k;->c(Landroidx/camera/core/impl/m;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/u$a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/k;

    :try_start_0
    iget-object v2, p0, Landroidx/camera/camera2/internal/u$a;->b:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Executor;

    new-instance v3, Landroidx/camera/camera2/internal/s;

    invoke-direct {v3, v1}, Landroidx/camera/camera2/internal/s;-><init>(Landroidx/camera/core/impl/k;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Camera2CameraControlImp"

    const-string v3, "Executor rejected to invoke onCaptureCancelled."

    invoke-static {v2, v3, v1}, Lw/o0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Landroidx/camera/core/impl/s;)V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/u$a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/k;

    :try_start_0
    iget-object v2, p0, Landroidx/camera/camera2/internal/u$a;->b:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Executor;

    new-instance v3, Landroidx/camera/camera2/internal/t;

    invoke-direct {v3, v1, p1}, Landroidx/camera/camera2/internal/t;-><init>(Landroidx/camera/core/impl/k;Landroidx/camera/core/impl/s;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Camera2CameraControlImp"

    const-string v3, "Executor rejected to invoke onCaptureCompleted."

    invoke-static {v2, v3, v1}, Lw/o0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Landroidx/camera/core/impl/m;)V
    .locals 4

    iget-object v0, p0, Landroidx/camera/camera2/internal/u$a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/k;

    :try_start_0
    iget-object v2, p0, Landroidx/camera/camera2/internal/u$a;->b:Ljava/util/Map;

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Executor;

    new-instance v3, Landroidx/camera/camera2/internal/r;

    invoke-direct {v3, v1, p1}, Landroidx/camera/camera2/internal/r;-><init>(Landroidx/camera/core/impl/k;Landroidx/camera/core/impl/m;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const-string v2, "Camera2CameraControlImp"

    const-string v3, "Executor rejected to invoke onCaptureFailed."

    invoke-static {v2, v3, v1}, Lw/o0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method g(Ljava/util/concurrent/Executor;Landroidx/camera/core/impl/k;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/camera2/internal/u$a;->a:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Landroidx/camera/camera2/internal/u$a;->b:Ljava/util/Map;

    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
