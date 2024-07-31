.class public Landroidx/camera/core/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/g1;


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:I

.field private c:Z

.field private final d:Landroidx/camera/core/impl/g1;

.field private final e:Landroid/view/Surface;

.field private f:Landroidx/camera/core/e$a;

.field private final g:Landroidx/camera/core/e$a;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/g1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/t;->a:Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/camera/core/t;->b:I

    iput-boolean v0, p0, Landroidx/camera/core/t;->c:Z

    new-instance v0, Lw/v0;

    invoke-direct {v0, p0}, Lw/v0;-><init>(Landroidx/camera/core/t;)V

    iput-object v0, p0, Landroidx/camera/core/t;->g:Landroidx/camera/core/e$a;

    iput-object p1, p0, Landroidx/camera/core/t;->d:Landroidx/camera/core/impl/g1;

    invoke-interface {p1}, Landroidx/camera/core/impl/g1;->getSurface()Landroid/view/Surface;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/t;->e:Landroid/view/Surface;

    return-void
.end method

.method public static synthetic a(Landroidx/camera/core/t;Landroidx/camera/core/impl/g1$a;Landroidx/camera/core/impl/g1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/core/t;->k(Landroidx/camera/core/impl/g1$a;Landroidx/camera/core/impl/g1;)V

    return-void
.end method

.method public static synthetic h(Landroidx/camera/core/t;Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/t;->j(Landroidx/camera/core/o;)V

    return-void
.end method

.method private synthetic j(Landroidx/camera/core/o;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Landroidx/camera/core/t;->b:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, Landroidx/camera/core/t;->b:I

    iget-boolean v2, p0, Landroidx/camera/core/t;->c:Z

    if-eqz v2, :cond_0

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/t;->close()V

    :cond_0
    iget-object v1, p0, Landroidx/camera/core/t;->f:Landroidx/camera/core/e$a;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_1

    invoke-interface {v1, p1}, Landroidx/camera/core/e$a;->a(Landroidx/camera/core/o;)V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method private synthetic k(Landroidx/camera/core/impl/g1$a;Landroidx/camera/core/impl/g1;)V
    .locals 0

    invoke-interface {p1, p0}, Landroidx/camera/core/impl/g1$a;->a(Landroidx/camera/core/impl/g1;)V

    return-void
.end method

.method private n(Landroidx/camera/core/o;)Landroidx/camera/core/o;
    .locals 1

    if-eqz p1, :cond_0

    iget v0, p0, Landroidx/camera/core/t;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroidx/camera/core/t;->b:I

    new-instance v0, Landroidx/camera/core/v;

    invoke-direct {v0, p1}, Landroidx/camera/core/v;-><init>(Landroidx/camera/core/o;)V

    iget-object p1, p0, Landroidx/camera/core/t;->g:Landroidx/camera/core/e$a;

    invoke-virtual {v0, p1}, Landroidx/camera/core/e;->a(Landroidx/camera/core/e$a;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public b()Landroidx/camera/core/o;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/t;->d:Landroidx/camera/core/impl/g1;

    invoke-interface {v1}, Landroidx/camera/core/impl/g1;->b()Landroidx/camera/core/o;

    move-result-object v1

    invoke-direct {p0, v1}, Landroidx/camera/core/t;->n(Landroidx/camera/core/o;)Landroidx/camera/core/o;

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

.method public c()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/t;->d:Landroidx/camera/core/impl/g1;

    invoke-interface {v1}, Landroidx/camera/core/impl/g1;->c()I

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

.method public close()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/t;->e:Landroid/view/Surface;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/view/Surface;->release()V

    :cond_0
    iget-object v1, p0, Landroidx/camera/core/t;->d:Landroidx/camera/core/impl/g1;

    invoke-interface {v1}, Landroidx/camera/core/impl/g1;->close()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public d()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/t;->d:Landroidx/camera/core/impl/g1;

    invoke-interface {v1}, Landroidx/camera/core/impl/g1;->d()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public e()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/t;->d:Landroidx/camera/core/impl/g1;

    invoke-interface {v1}, Landroidx/camera/core/impl/g1;->e()I

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

.method public f(Landroidx/camera/core/impl/g1$a;Ljava/util/concurrent/Executor;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/t;->d:Landroidx/camera/core/impl/g1;

    new-instance v2, Lw/w0;

    invoke-direct {v2, p0, p1}, Lw/w0;-><init>(Landroidx/camera/core/t;Landroidx/camera/core/impl/g1$a;)V

    invoke-interface {v1, v2, p2}, Landroidx/camera/core/impl/g1;->f(Landroidx/camera/core/impl/g1$a;Ljava/util/concurrent/Executor;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public g()Landroidx/camera/core/o;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/t;->d:Landroidx/camera/core/impl/g1;

    invoke-interface {v1}, Landroidx/camera/core/impl/g1;->g()Landroidx/camera/core/o;

    move-result-object v1

    invoke-direct {p0, v1}, Landroidx/camera/core/t;->n(Landroidx/camera/core/o;)Landroidx/camera/core/o;

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

.method public getHeight()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/t;->d:Landroidx/camera/core/impl/g1;

    invoke-interface {v1}, Landroidx/camera/core/impl/g1;->getHeight()I

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

.method public getSurface()Landroid/view/Surface;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/t;->d:Landroidx/camera/core/impl/g1;

    invoke-interface {v1}, Landroidx/camera/core/impl/g1;->getSurface()Landroid/view/Surface;

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

.method public getWidth()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/t;->d:Landroidx/camera/core/impl/g1;

    invoke-interface {v1}, Landroidx/camera/core/impl/g1;->getWidth()I

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

.method public i()I
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/t;->d:Landroidx/camera/core/impl/g1;

    invoke-interface {v1}, Landroidx/camera/core/impl/g1;->e()I

    move-result v1

    iget v2, p0, Landroidx/camera/core/t;->b:I

    sub-int/2addr v1, v2

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public l()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/t;->a:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Landroidx/camera/core/t;->c:Z

    iget-object v1, p0, Landroidx/camera/core/t;->d:Landroidx/camera/core/impl/g1;

    invoke-interface {v1}, Landroidx/camera/core/impl/g1;->d()V

    iget v1, p0, Landroidx/camera/core/t;->b:I

    if-nez v1, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/t;->close()V

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

.method public m(Landroidx/camera/core/e$a;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/t;->f:Landroidx/camera/core/e$a;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
