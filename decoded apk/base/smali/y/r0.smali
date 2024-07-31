.class public Ly/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/e$a;
.implements Ly/v0$a;


# instance fields
.field final a:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Ly/v0;",
            ">;"
        }
    .end annotation
.end field

.field final b:Ly/q;

.field c:Ly/r;

.field private d:Ly/i0;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly/i0;",
            ">;"
        }
    .end annotation
.end field

.field f:Z


# direct methods
.method public constructor <init>(Ly/q;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayDeque;

    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    iput-object v0, p0, Ly/r0;->a:Ljava/util/Deque;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly/r0;->f:Z

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iput-object p1, p0, Ly/r0;->b:Ly/q;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ly/r0;->e:Ljava/util/List;

    return-void
.end method

.method public static synthetic c(Ly/r0;Ly/i0;)V
    .locals 0

    invoke-direct {p0, p1}, Ly/r0;->i(Ly/i0;)V

    return-void
.end method

.method public static synthetic d(Ly/r0;)V
    .locals 0

    invoke-direct {p0}, Ly/r0;->h()V

    return-void
.end method

.method private synthetic h()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ly/r0;->d:Ly/i0;

    invoke-virtual {p0}, Ly/r0;->g()V

    return-void
.end method

.method private synthetic i(Ly/i0;)V
    .locals 1

    iget-object v0, p0, Ly/r0;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private m(Ly/j;)Lcom/google/common/util/concurrent/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly/j;",
            ")",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/r0;->b:Ly/q;

    invoke-interface {v0}, Ly/q;->b()V

    iget-object v0, p0, Ly/r0;->b:Ly/q;

    invoke-virtual {p1}, Ly/j;->a()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ly/q;->a(Ljava/util/List;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    new-instance v1, Ly/r0$a;

    invoke-direct {v1, p0, p1}, Ly/r0$a;-><init>(Ly/r0;Ly/j;)V

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    invoke-static {v0, v1, p1}, La0/f;->b(Lcom/google/common/util/concurrent/f;La0/c;Ljava/util/concurrent/Executor;)V

    return-object v0
.end method

.method private n(Ly/i0;)V
    .locals 3

    invoke-virtual {p0}, Ly/r0;->f()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Landroidx/core/util/h;->m(Z)V

    iput-object p1, p0, Ly/r0;->d:Ly/i0;

    invoke-virtual {p1}, Ly/i0;->l()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    new-instance v1, Ly/o0;

    invoke-direct {v1, p0}, Ly/o0;-><init>(Ly/r0;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object v0, p0, Ly/r0;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p1}, Ly/i0;->m()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    new-instance v1, Ly/p0;

    invoke-direct {v1, p0, p1}, Ly/p0;-><init>(Ly/r0;Ly/i0;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/o;)V
    .locals 1

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    new-instance v0, Ly/q0;

    invoke-direct {v0, p0}, Ly/q0;-><init>(Ly/r0;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Ly/v0;)V
    .locals 2

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    const-string v0, "TakePictureManager"

    const-string v1, "Add a new request for retrying."

    invoke-static {v0, v1}, Lw/o0;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Ly/r0;->a:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->addFirst(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ly/r0;->g()V

    return-void
.end method

.method public e()V
    .locals 4

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    new-instance v0, Lw/g0;

    const-string v1, "Camera is closed."

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v0, v3, v1, v2}, Lw/g0;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    iget-object v1, p0, Ly/r0;->a:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly/v0;

    invoke-virtual {v2, v0}, Ly/v0;->r(Lw/g0;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ly/r0;->a:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Collection;->clear()V

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Ly/r0;->e:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly/i0;

    invoke-virtual {v2, v0}, Ly/i0;->i(Lw/g0;)V

    goto :goto_1

    :cond_1
    return-void
.end method

.method f()Z
    .locals 1

    iget-object v0, p0, Ly/r0;->d:Ly/i0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method g()V
    .locals 4

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    const-string v0, "Issue the next TakePictureRequest."

    const-string v1, "TakePictureManager"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Ly/r0;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "There is already a request in-flight."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-boolean v0, p0, Ly/r0;->f:Z

    if-eqz v0, :cond_1

    const-string v0, "The class is paused."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    iget-object v0, p0, Ly/r0;->c:Ly/r;

    invoke-virtual {v0}, Ly/r;->h()I

    move-result v0

    if-nez v0, :cond_2

    const-string v0, "Too many acquire images. Close image to be able to process next."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_2
    iget-object v0, p0, Ly/r0;->a:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly/v0;

    if-nez v0, :cond_3

    const-string v0, "No new request."

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_3
    new-instance v1, Ly/i0;

    invoke-direct {v1, v0, p0}, Ly/i0;-><init>(Ly/v0;Ly/v0$a;)V

    invoke-direct {p0, v1}, Ly/r0;->n(Ly/i0;)V

    iget-object v2, p0, Ly/r0;->c:Ly/r;

    invoke-virtual {v1}, Ly/i0;->l()Lcom/google/common/util/concurrent/f;

    move-result-object v3

    invoke-virtual {v2, v0, v1, v3}, Ly/r;->e(Ly/v0;Ly/n0;Lcom/google/common/util/concurrent/f;)Landroidx/core/util/d;

    move-result-object v0

    iget-object v2, v0, Landroidx/core/util/d;->a:Ljava/lang/Object;

    check-cast v2, Ly/j;

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v0, Landroidx/core/util/d;->b:Ljava/lang/Object;

    check-cast v0, Ly/f0;

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Ly/r0;->c:Ly/r;

    invoke-virtual {v3, v0}, Ly/r;->l(Ly/f0;)V

    invoke-direct {p0, v2}, Ly/r0;->m(Ly/j;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    invoke-virtual {v1, v0}, Ly/i0;->r(Lcom/google/common/util/concurrent/f;)V

    return-void
.end method

.method public j()V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Ly/r0;->f:Z

    iget-object v0, p0, Ly/r0;->d:Ly/i0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly/i0;->j()V

    :cond_0
    return-void
.end method

.method public k()V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ly/r0;->f:Z

    invoke-virtual {p0}, Ly/r0;->g()V

    return-void
.end method

.method public l(Ly/r;)V
    .locals 0

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iput-object p1, p0, Ly/r0;->c:Ly/r;

    invoke-virtual {p1, p0}, Ly/r;->k(Landroidx/camera/core/e$a;)V

    return-void
.end method
