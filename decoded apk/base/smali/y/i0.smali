.class Ly/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/n0;


# instance fields
.field private final a:Ly/v0;

.field private final b:Ly/v0$a;

.field private final c:Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private e:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private f:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private g:Z

.field private h:Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ly/v0;Ly/v0$a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly/i0;->g:Z

    iput-object p1, p0, Ly/i0;->a:Ly/v0;

    iput-object p2, p0, Ly/i0;->b:Ly/v0$a;

    new-instance p1, Ly/g0;

    invoke-direct {p1, p0}, Ly/g0;-><init>(Ly/i0;)V

    invoke-static {p1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    iput-object p1, p0, Ly/i0;->c:Lcom/google/common/util/concurrent/f;

    new-instance p1, Ly/h0;

    invoke-direct {p1, p0}, Ly/h0;-><init>(Ly/i0;)V

    invoke-static {p1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    iput-object p1, p0, Ly/i0;->d:Lcom/google/common/util/concurrent/f;

    return-void
.end method

.method public static synthetic f(Ly/i0;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Ly/i0;->o(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ly/i0;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Ly/i0;->n(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private h(Lw/g0;)V
    .locals 2

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly/i0;->g:Z

    iget-object v1, p0, Ly/i0;->h:Lcom/google/common/util/concurrent/f;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Lcom/google/common/util/concurrent/f;

    invoke-interface {v1, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    iget-object v0, p0, Ly/i0;->e:Landroidx/concurrent/futures/c$a;

    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    iget-object p1, p0, Ly/i0;->f:Landroidx/concurrent/futures/c$a;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method private k()V
    .locals 2

    iget-object v0, p0, Ly/i0;->c:Lcom/google/common/util/concurrent/f;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    const-string v1, "onImageCaptured() must be called before onFinalResult()"

    invoke-static {v0, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    return-void
.end method

.method private synthetic n(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    iput-object p1, p0, Ly/i0;->e:Landroidx/concurrent/futures/c$a;

    const-string p1, "CaptureCompleteFuture"

    return-object p1
.end method

.method private synthetic o(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    iput-object p1, p0, Ly/i0;->f:Landroidx/concurrent/futures/c$a;

    const-string p1, "RequestCompleteFuture"

    return-object p1
.end method

.method private p()V
    .locals 2

    iget-object v0, p0, Ly/i0;->d:Lcom/google/common/util/concurrent/f;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "The callback can only complete once."

    invoke-static {v0, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iget-object v0, p0, Ly/i0;->f:Landroidx/concurrent/futures/c$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method private q(Lw/g0;)V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/i0;->a:Ly/v0;

    invoke-virtual {v0, p1}, Ly/v0;->r(Lw/g0;)V

    return-void
.end method


# virtual methods
.method public a(Lw/g0;)V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-boolean v0, p0, Ly/i0;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Ly/i0;->k()V

    invoke-direct {p0}, Ly/i0;->p()V

    invoke-direct {p0, p1}, Ly/i0;->q(Lw/g0;)V

    return-void
.end method

.method public b(Landroidx/camera/core/n$h;)V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-boolean v0, p0, Ly/i0;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Ly/i0;->k()V

    invoke-direct {p0}, Ly/i0;->p()V

    iget-object v0, p0, Ly/i0;->a:Ly/v0;

    invoke-virtual {v0, p1}, Ly/v0;->s(Landroidx/camera/core/n$h;)V

    return-void
.end method

.method public c(Landroidx/camera/core/o;)V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-boolean v0, p0, Ly/i0;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Ly/i0;->k()V

    invoke-direct {p0}, Ly/i0;->p()V

    iget-object v0, p0, Ly/i0;->a:Ly/v0;

    invoke-virtual {v0, p1}, Ly/v0;->t(Landroidx/camera/core/o;)V

    return-void
.end method

.method public d()V
    .locals 2

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-boolean v0, p0, Ly/i0;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ly/i0;->e:Landroidx/concurrent/futures/c$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    return-void
.end method

.method public e(Lw/g0;)V
    .locals 2

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-boolean v0, p0, Ly/i0;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ly/i0;->a:Ly/v0;

    invoke-virtual {v0}, Ly/v0;->d()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Ly/i0;->q(Lw/g0;)V

    :cond_1
    invoke-direct {p0}, Ly/i0;->p()V

    iget-object v1, p0, Ly/i0;->e:Landroidx/concurrent/futures/c$a;

    invoke-virtual {v1, p1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    if-eqz v0, :cond_2

    iget-object p1, p0, Ly/i0;->b:Ly/v0$a;

    iget-object v0, p0, Ly/i0;->a:Ly/v0;

    invoke-interface {p1, v0}, Ly/v0$a;->b(Ly/v0;)V

    :cond_2
    return-void
.end method

.method i(Lw/g0;)V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/i0;->d:Lcom/google/common/util/concurrent/f;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0, p1}, Ly/i0;->h(Lw/g0;)V

    invoke-direct {p0, p1}, Ly/i0;->q(Lw/g0;)V

    return-void
.end method

.method public isAborted()Z
    .locals 1

    iget-boolean v0, p0, Ly/i0;->g:Z

    return v0
.end method

.method j()V
    .locals 4

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/i0;->d:Lcom/google/common/util/concurrent/f;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lw/g0;

    const-string v1, "The request is aborted silently and retried."

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v0, v3, v1, v2}, Lw/g0;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {p0, v0}, Ly/i0;->h(Lw/g0;)V

    iget-object v0, p0, Ly/i0;->b:Ly/v0$a;

    iget-object v1, p0, Ly/i0;->a:Ly/v0;

    invoke-interface {v0, v1}, Ly/v0$a;->b(Ly/v0;)V

    return-void
.end method

.method l()Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/i0;->c:Lcom/google/common/util/concurrent/f;

    return-object v0
.end method

.method m()Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/i0;->d:Lcom/google/common/util/concurrent/f;

    return-object v0
.end method

.method public r(Lcom/google/common/util/concurrent/f;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/i0;->h:Lcom/google/common/util/concurrent/f;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "CaptureRequestFuture can only be set once."

    invoke-static {v0, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iput-object p1, p0, Ly/i0;->h:Lcom/google/common/util/concurrent/f;

    return-void
.end method
