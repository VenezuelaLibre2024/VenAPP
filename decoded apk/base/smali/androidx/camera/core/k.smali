.class final Landroidx/camera/core/k;
.super Landroidx/camera/core/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/k$b;
    }
.end annotation


# instance fields
.field final t:Ljava/util/concurrent/Executor;

.field private final u:Ljava/lang/Object;

.field v:Landroidx/camera/core/o;

.field private w:Landroidx/camera/core/k$b;


# direct methods
.method constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Landroidx/camera/core/i;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/k;->u:Ljava/lang/Object;

    iput-object p1, p0, Landroidx/camera/core/k;->t:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method d(Landroidx/camera/core/impl/g1;)Landroidx/camera/core/o;
    .locals 0

    invoke-interface {p1}, Landroidx/camera/core/impl/g1;->b()Landroidx/camera/core/o;

    move-result-object p1

    return-object p1
.end method

.method g()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/k;->u:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/k;->v:Landroidx/camera/core/o;

    if-eqz v1, :cond_0

    invoke-interface {v1}, Landroidx/camera/core/o;->close()V

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/camera/core/k;->v:Landroidx/camera/core/o;

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

.method o(Landroidx/camera/core/o;)V
    .locals 5

    iget-object v0, p0, Landroidx/camera/core/k;->u:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Landroidx/camera/core/i;->s:Z

    if-nez v1, :cond_0

    invoke-interface {p1}, Landroidx/camera/core/o;->close()V

    monitor-exit v0

    return-void

    :cond_0
    iget-object v1, p0, Landroidx/camera/core/k;->w:Landroidx/camera/core/k$b;

    if-eqz v1, :cond_3

    invoke-interface {p1}, Landroidx/camera/core/o;->e1()Lw/h0;

    move-result-object v1

    invoke-interface {v1}, Lw/h0;->c()J

    move-result-wide v1

    iget-object v3, p0, Landroidx/camera/core/k;->w:Landroidx/camera/core/k$b;

    invoke-virtual {v3}, Landroidx/camera/core/e;->e1()Lw/h0;

    move-result-object v3

    invoke-interface {v3}, Lw/h0;->c()J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-gtz v1, :cond_1

    invoke-interface {p1}, Landroidx/camera/core/o;->close()V

    goto :goto_0

    :cond_1
    iget-object v1, p0, Landroidx/camera/core/k;->v:Landroidx/camera/core/o;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Landroidx/camera/core/o;->close()V

    :cond_2
    iput-object p1, p0, Landroidx/camera/core/k;->v:Landroidx/camera/core/o;

    :goto_0
    monitor-exit v0

    return-void

    :cond_3
    new-instance v1, Landroidx/camera/core/k$b;

    invoke-direct {v1, p1, p0}, Landroidx/camera/core/k$b;-><init>(Landroidx/camera/core/o;Landroidx/camera/core/k;)V

    iput-object v1, p0, Landroidx/camera/core/k;->w:Landroidx/camera/core/k$b;

    invoke-virtual {p0, v1}, Landroidx/camera/core/i;->e(Landroidx/camera/core/o;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    new-instance v2, Landroidx/camera/core/k$a;

    invoke-direct {v2, p0, v1}, Landroidx/camera/core/k$a;-><init>(Landroidx/camera/core/k;Landroidx/camera/core/k$b;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {p1, v2, v1}, La0/f;->b(Lcom/google/common/util/concurrent/f;La0/c;Ljava/util/concurrent/Executor;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method z()V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/k;->u:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Landroidx/camera/core/k;->w:Landroidx/camera/core/k$b;

    iget-object v2, p0, Landroidx/camera/core/k;->v:Landroidx/camera/core/o;

    if-eqz v2, :cond_0

    iput-object v1, p0, Landroidx/camera/core/k;->v:Landroidx/camera/core/o;

    invoke-virtual {p0, v2}, Landroidx/camera/core/k;->o(Landroidx/camera/core/o;)V

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
