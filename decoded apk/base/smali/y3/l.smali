.class public Ly3/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly3/f;
.implements Ly3/e;


# instance fields
.field private final a:Ly3/f;

.field private final b:Ljava/lang/Object;

.field private volatile c:Ly3/e;

.field private volatile d:Ly3/e;

.field private e:Ly3/f$a;

.field private f:Ly3/f$a;

.field private g:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ly3/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ly3/f$a;->CLEARED:Ly3/f$a;

    iput-object v0, p0, Ly3/l;->e:Ly3/f$a;

    iput-object v0, p0, Ly3/l;->f:Ly3/f$a;

    iput-object p1, p0, Ly3/l;->b:Ljava/lang/Object;

    iput-object p2, p0, Ly3/l;->a:Ly3/f;

    return-void
.end method

.method private k()Z
    .locals 1

    iget-object v0, p0, Ly3/l;->a:Ly3/f;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Ly3/f;->b(Ly3/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private l()Z
    .locals 1

    iget-object v0, p0, Ly3/l;->a:Ly3/f;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Ly3/f;->i(Ly3/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private m()Z
    .locals 1

    iget-object v0, p0, Ly3/l;->a:Ly3/f;

    if-eqz v0, :cond_1

    invoke-interface {v0, p0}, Ly3/f;->f(Ly3/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method


# virtual methods
.method public a()Z
    .locals 2

    iget-object v0, p0, Ly3/l;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly3/l;->d:Ly3/e;

    invoke-interface {v1}, Ly3/e;->a()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Ly3/l;->c:Ly3/e;

    invoke-interface {v1}, Ly3/e;->a()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b(Ly3/e;)Z
    .locals 2

    iget-object v0, p0, Ly3/l;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Ly3/l;->k()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ly3/l;->c:Ly3/e;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ly3/l;->e:Ly3/f$a;

    sget-object v1, Ly3/f$a;->PAUSED:Ly3/f$a;

    if-eq p1, v1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public c(Ly3/e;)V
    .locals 2

    iget-object v0, p0, Ly3/l;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly3/l;->d:Ly3/e;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Ly3/f$a;->SUCCESS:Ly3/f$a;

    iput-object p1, p0, Ly3/l;->f:Ly3/f$a;

    monitor-exit v0

    return-void

    :cond_0
    sget-object p1, Ly3/f$a;->SUCCESS:Ly3/f$a;

    iput-object p1, p0, Ly3/l;->e:Ly3/f$a;

    iget-object p1, p0, Ly3/l;->a:Ly3/f;

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Ly3/f;->c(Ly3/e;)V

    :cond_1
    iget-object p1, p0, Ly3/l;->f:Ly3/f$a;

    invoke-virtual {p1}, Ly3/f$a;->b()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Ly3/l;->d:Ly3/e;

    invoke-interface {p1}, Ly3/e;->clear()V

    :cond_2
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public clear()V
    .locals 2

    iget-object v0, p0, Ly3/l;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, Ly3/l;->g:Z

    sget-object v1, Ly3/f$a;->CLEARED:Ly3/f$a;

    iput-object v1, p0, Ly3/l;->e:Ly3/f$a;

    iput-object v1, p0, Ly3/l;->f:Ly3/f$a;

    iget-object v1, p0, Ly3/l;->d:Ly3/e;

    invoke-interface {v1}, Ly3/e;->clear()V

    iget-object v1, p0, Ly3/l;->c:Ly3/e;

    invoke-interface {v1}, Ly3/e;->clear()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public d(Ly3/e;)V
    .locals 2

    iget-object v0, p0, Ly3/l;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly3/l;->c:Ly3/e;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    sget-object p1, Ly3/f$a;->FAILED:Ly3/f$a;

    iput-object p1, p0, Ly3/l;->f:Ly3/f$a;

    monitor-exit v0

    return-void

    :cond_0
    sget-object p1, Ly3/f$a;->FAILED:Ly3/f$a;

    iput-object p1, p0, Ly3/l;->e:Ly3/f$a;

    iget-object p1, p0, Ly3/l;->a:Ly3/f;

    if-eqz p1, :cond_1

    invoke-interface {p1, p0}, Ly3/f;->d(Ly3/e;)V

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public e()Z
    .locals 3

    iget-object v0, p0, Ly3/l;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly3/l;->e:Ly3/f$a;

    sget-object v2, Ly3/f$a;->CLEARED:Ly3/f$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public f(Ly3/e;)Z
    .locals 2

    iget-object v0, p0, Ly3/l;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Ly3/l;->m()Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Ly3/l;->c:Ly3/e;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ly3/l;->e:Ly3/f$a;

    sget-object v1, Ly3/f$a;->SUCCESS:Ly3/f$a;

    if-eq p1, v1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public g()Z
    .locals 3

    iget-object v0, p0, Ly3/l;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly3/l;->e:Ly3/f$a;

    sget-object v2, Ly3/f$a;->SUCCESS:Ly3/f$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public getRoot()Ly3/f;
    .locals 2

    iget-object v0, p0, Ly3/l;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly3/l;->a:Ly3/f;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ly3/f;->getRoot()Ly3/f;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, p0

    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public h(Ly3/e;)Z
    .locals 3

    instance-of v0, p1, Ly3/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Ly3/l;

    iget-object v0, p0, Ly3/l;->c:Ly3/e;

    if-nez v0, :cond_0

    iget-object v0, p1, Ly3/l;->c:Ly3/e;

    if-nez v0, :cond_2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ly3/l;->c:Ly3/e;

    iget-object v2, p1, Ly3/l;->c:Ly3/e;

    invoke-interface {v0, v2}, Ly3/e;->h(Ly3/e;)Z

    move-result v0

    if-eqz v0, :cond_2

    :goto_0
    iget-object v0, p0, Ly3/l;->d:Ly3/e;

    if-nez v0, :cond_1

    iget-object p1, p1, Ly3/l;->d:Ly3/e;

    if-nez p1, :cond_2

    goto :goto_1

    :cond_1
    iget-object v0, p0, Ly3/l;->d:Ly3/e;

    iget-object p1, p1, Ly3/l;->d:Ly3/e;

    invoke-interface {v0, p1}, Ly3/e;->h(Ly3/e;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_1
    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public i(Ly3/e;)Z
    .locals 2

    iget-object v0, p0, Ly3/l;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Ly3/l;->l()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ly3/l;->c:Ly3/e;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ly3/l;->a()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    monitor-exit v0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public isRunning()Z
    .locals 3

    iget-object v0, p0, Ly3/l;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly3/l;->e:Ly3/f$a;

    sget-object v2, Ly3/f$a;->RUNNING:Ly3/f$a;

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public j()V
    .locals 4

    iget-object v0, p0, Ly3/l;->b:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Ly3/l;->g:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v1, 0x0

    :try_start_1
    iget-object v2, p0, Ly3/l;->e:Ly3/f$a;

    sget-object v3, Ly3/f$a;->SUCCESS:Ly3/f$a;

    if-eq v2, v3, :cond_0

    iget-object v2, p0, Ly3/l;->f:Ly3/f$a;

    sget-object v3, Ly3/f$a;->RUNNING:Ly3/f$a;

    if-eq v2, v3, :cond_0

    iput-object v3, p0, Ly3/l;->f:Ly3/f$a;

    iget-object v2, p0, Ly3/l;->d:Ly3/e;

    invoke-interface {v2}, Ly3/e;->j()V

    :cond_0
    iget-boolean v2, p0, Ly3/l;->g:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Ly3/l;->e:Ly3/f$a;

    sget-object v3, Ly3/f$a;->RUNNING:Ly3/f$a;

    if-eq v2, v3, :cond_1

    iput-object v3, p0, Ly3/l;->e:Ly3/f$a;

    iget-object v2, p0, Ly3/l;->c:Ly3/e;

    invoke-interface {v2}, Ly3/e;->j()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_1
    :try_start_2
    iput-boolean v1, p0, Ly3/l;->g:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v2

    iput-boolean v1, p0, Ly3/l;->g:Z

    throw v2

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method

.method public n(Ly3/e;Ly3/e;)V
    .locals 0

    iput-object p1, p0, Ly3/l;->c:Ly3/e;

    iput-object p2, p0, Ly3/l;->d:Ly3/e;

    return-void
.end method

.method public pause()V
    .locals 2

    iget-object v0, p0, Ly3/l;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ly3/l;->f:Ly3/f$a;

    invoke-virtual {v1}, Ly3/f$a;->b()Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Ly3/f$a;->PAUSED:Ly3/f$a;

    iput-object v1, p0, Ly3/l;->f:Ly3/f$a;

    iget-object v1, p0, Ly3/l;->d:Ly3/e;

    invoke-interface {v1}, Ly3/e;->pause()V

    :cond_0
    iget-object v1, p0, Ly3/l;->e:Ly3/f$a;

    invoke-virtual {v1}, Ly3/f$a;->b()Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Ly3/f$a;->PAUSED:Ly3/f$a;

    iput-object v1, p0, Ly3/l;->e:Ly3/f$a;

    iget-object v1, p0, Ly3/l;->c:Ly3/e;

    invoke-interface {v1}, Ly3/e;->pause()V

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
