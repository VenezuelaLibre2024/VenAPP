.class final Landroidx/camera/camera2/internal/p3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroidx/camera/camera2/internal/u;

.field private final b:Landroidx/lifecycle/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/r<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Z

.field private final d:Ljava/util/concurrent/Executor;

.field private e:Z

.field f:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field g:Z


# direct methods
.method constructor <init>(Landroidx/camera/camera2/internal/u;Landroidx/camera/camera2/internal/compat/d0;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/camera/camera2/internal/p3;->a:Landroidx/camera/camera2/internal/u;

    iput-object p3, p0, Landroidx/camera/camera2/internal/p3;->d:Ljava/util/concurrent/Executor;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p3, Landroidx/camera/camera2/internal/l0;

    invoke-direct {p3, p2}, Landroidx/camera/camera2/internal/l0;-><init>(Landroidx/camera/camera2/internal/compat/d0;)V

    invoke-static {p3}, Lt/g;->a(Lt/c;)Z

    move-result p2

    iput-boolean p2, p0, Landroidx/camera/camera2/internal/p3;->c:Z

    new-instance p2, Landroidx/lifecycle/r;

    const/4 p3, 0x0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-direct {p2, p3}, Landroidx/lifecycle/r;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Landroidx/camera/camera2/internal/p3;->b:Landroidx/lifecycle/r;

    new-instance p2, Landroidx/camera/camera2/internal/n3;

    invoke-direct {p2, p0}, Landroidx/camera/camera2/internal/n3;-><init>(Landroidx/camera/camera2/internal/p3;)V

    invoke-virtual {p1, p2}, Landroidx/camera/camera2/internal/u;->t(Landroidx/camera/camera2/internal/u$c;)V

    return-void
.end method

.method public static synthetic a(Landroidx/camera/camera2/internal/p3;Landroidx/concurrent/futures/c$a;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/p3;->g(Landroidx/concurrent/futures/c$a;Z)V

    return-void
.end method

.method public static synthetic b(Landroidx/camera/camera2/internal/p3;Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/p3;->i(Landroid/hardware/camera2/TotalCaptureResult;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Landroidx/camera/camera2/internal/p3;ZLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/camera2/internal/p3;->h(ZLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic g(Landroidx/concurrent/futures/c$a;Z)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Landroidx/camera/camera2/internal/p3;->e(Landroidx/concurrent/futures/c$a;Z)V

    return-void
.end method

.method private synthetic h(ZLandroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/p3;->d:Ljava/util/concurrent/Executor;

    new-instance v1, Landroidx/camera/camera2/internal/o3;

    invoke-direct {v1, p0, p2, p1}, Landroidx/camera/camera2/internal/o3;-><init>(Landroidx/camera/camera2/internal/p3;Landroidx/concurrent/futures/c$a;Z)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "enableTorch: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private synthetic i(Landroid/hardware/camera2/TotalCaptureResult;)Z
    .locals 2

    iget-object v0, p0, Landroidx/camera/camera2/internal/p3;->f:Landroidx/concurrent/futures/c$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Landroid/hardware/camera2/CaptureResult;->getRequest()Landroid/hardware/camera2/CaptureRequest;

    move-result-object p1

    sget-object v0, Landroid/hardware/camera2/CaptureRequest;->FLASH_MODE:Landroid/hardware/camera2/CaptureRequest$Key;

    invoke-virtual {p1, v0}, Landroid/hardware/camera2/CaptureRequest;->get(Landroid/hardware/camera2/CaptureRequest$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v0, 0x2

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v1

    :goto_0
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/p3;->g:Z

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Landroidx/camera/camera2/internal/p3;->f:Landroidx/concurrent/futures/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    iput-object v0, p0, Landroidx/camera/camera2/internal/p3;->f:Landroidx/concurrent/futures/c$a;

    :cond_1
    return v1
.end method

.method private k(Landroidx/lifecycle/r;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/r<",
            "TT;>;TT;)V"
        }
    .end annotation

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, Landroidx/lifecycle/r;->setValue(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p2}, Landroidx/lifecycle/r;->postValue(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method


# virtual methods
.method d(Z)Lcom/google/common/util/concurrent/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/p3;->c:Z

    if-nez v0, :cond_0

    const-string p1, "TorchControl"

    const-string v0, "Unable to enableTorch due to there is no flash unit."

    invoke-static {p1, v0}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "No flash unit"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/p3;->b:Landroidx/lifecycle/r;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Landroidx/camera/camera2/internal/p3;->k(Landroidx/lifecycle/r;Ljava/lang/Object;)V

    new-instance v0, Landroidx/camera/camera2/internal/m3;

    invoke-direct {v0, p0, p1}, Landroidx/camera/camera2/internal/m3;-><init>(Landroidx/camera/camera2/internal/p3;Z)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method e(Landroidx/concurrent/futures/c$a;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;Z)V"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/p3;->c:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "No flash unit"

    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_0
    return-void

    :cond_1
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/p3;->e:Z

    if-nez v0, :cond_3

    iget-object p2, p0, Landroidx/camera/camera2/internal/p3;->b:Landroidx/lifecycle/r;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Landroidx/camera/camera2/internal/p3;->k(Landroidx/lifecycle/r;Ljava/lang/Object;)V

    if-eqz p1, :cond_2

    new-instance p2, Lw/j$a;

    const-string v0, "Camera is not active."

    invoke-direct {p2, v0}, Lw/j$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_2
    return-void

    :cond_3
    iput-boolean p2, p0, Landroidx/camera/camera2/internal/p3;->g:Z

    iget-object v0, p0, Landroidx/camera/camera2/internal/p3;->a:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v0, p2}, Landroidx/camera/camera2/internal/u;->w(Z)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/p3;->b:Landroidx/lifecycle/r;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {p0, v0, p2}, Landroidx/camera/camera2/internal/p3;->k(Landroidx/lifecycle/r;Ljava/lang/Object;)V

    iget-object p2, p0, Landroidx/camera/camera2/internal/p3;->f:Landroidx/concurrent/futures/c$a;

    if-eqz p2, :cond_4

    new-instance v0, Lw/j$a;

    const-string v1, "There is a new enableTorch being set"

    invoke-direct {v0, v1}, Lw/j$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :cond_4
    iput-object p1, p0, Landroidx/camera/camera2/internal/p3;->f:Landroidx/concurrent/futures/c$a;

    return-void
.end method

.method f()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/camera2/internal/p3;->b:Landroidx/lifecycle/r;

    return-object v0
.end method

.method j(Z)V
    .locals 2

    iget-boolean v0, p0, Landroidx/camera/camera2/internal/p3;->e:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Landroidx/camera/camera2/internal/p3;->e:Z

    if-nez p1, :cond_2

    iget-boolean p1, p0, Landroidx/camera/camera2/internal/p3;->g:Z

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/camera/camera2/internal/p3;->g:Z

    iget-object v0, p0, Landroidx/camera/camera2/internal/p3;->a:Landroidx/camera/camera2/internal/u;

    invoke-virtual {v0, p1}, Landroidx/camera/camera2/internal/u;->w(Z)V

    iget-object v0, p0, Landroidx/camera/camera2/internal/p3;->b:Landroidx/lifecycle/r;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Landroidx/camera/camera2/internal/p3;->k(Landroidx/lifecycle/r;Ljava/lang/Object;)V

    :cond_1
    iget-object p1, p0, Landroidx/camera/camera2/internal/p3;->f:Landroidx/concurrent/futures/c$a;

    if-eqz p1, :cond_2

    new-instance v0, Lw/j$a;

    const-string v1, "Camera is not active."

    invoke-direct {v0, v1}, Lw/j$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/camera/camera2/internal/p3;->f:Landroidx/concurrent/futures/c$a;

    :cond_2
    return-void
.end method
