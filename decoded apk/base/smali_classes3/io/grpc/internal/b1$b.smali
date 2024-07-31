.class Lio/grpc/internal/b1$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/b1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/b1;


# direct methods
.method constructor <init>(Lio/grpc/internal/b1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/b1$b;->a:Lio/grpc/internal/b1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 11

    iget-object v0, p0, Lio/grpc/internal/b1$b;->a:Lio/grpc/internal/b1;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/b1$b;->a:Lio/grpc/internal/b1;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lio/grpc/internal/b1;->d(Lio/grpc/internal/b1;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;

    iget-object v1, p0, Lio/grpc/internal/b1$b;->a:Lio/grpc/internal/b1;

    invoke-static {v1}, Lio/grpc/internal/b1;->a(Lio/grpc/internal/b1;)Lio/grpc/internal/b1$e;

    move-result-object v1

    sget-object v2, Lio/grpc/internal/b1$e;->PING_SCHEDULED:Lio/grpc/internal/b1$e;

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lio/grpc/internal/b1$b;->a:Lio/grpc/internal/b1;

    sget-object v2, Lio/grpc/internal/b1$e;->PING_SENT:Lio/grpc/internal/b1$e;

    invoke-static {v1, v2}, Lio/grpc/internal/b1;->b(Lio/grpc/internal/b1;Lio/grpc/internal/b1$e;)Lio/grpc/internal/b1$e;

    iget-object v1, p0, Lio/grpc/internal/b1$b;->a:Lio/grpc/internal/b1;

    invoke-static {v1}, Lio/grpc/internal/b1;->h(Lio/grpc/internal/b1;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    iget-object v3, p0, Lio/grpc/internal/b1$b;->a:Lio/grpc/internal/b1;

    invoke-static {v3}, Lio/grpc/internal/b1;->f(Lio/grpc/internal/b1;)Ljava/lang/Runnable;

    move-result-object v3

    iget-object v4, p0, Lio/grpc/internal/b1$b;->a:Lio/grpc/internal/b1;

    invoke-static {v4}, Lio/grpc/internal/b1;->g(Lio/grpc/internal/b1;)J

    move-result-wide v4

    sget-object v6, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v2, v3, v4, v5, v6}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v2

    invoke-static {v1, v2}, Lio/grpc/internal/b1;->e(Lio/grpc/internal/b1;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lio/grpc/internal/b1$b;->a:Lio/grpc/internal/b1;

    invoke-static {v1}, Lio/grpc/internal/b1;->a(Lio/grpc/internal/b1;)Lio/grpc/internal/b1$e;

    move-result-object v1

    sget-object v3, Lio/grpc/internal/b1$e;->PING_DELAYED:Lio/grpc/internal/b1$e;

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lio/grpc/internal/b1$b;->a:Lio/grpc/internal/b1;

    invoke-static {v1}, Lio/grpc/internal/b1;->h(Lio/grpc/internal/b1;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v3

    iget-object v4, p0, Lio/grpc/internal/b1$b;->a:Lio/grpc/internal/b1;

    invoke-static {v4}, Lio/grpc/internal/b1;->i(Lio/grpc/internal/b1;)Ljava/lang/Runnable;

    move-result-object v4

    iget-object v5, p0, Lio/grpc/internal/b1$b;->a:Lio/grpc/internal/b1;

    invoke-static {v5}, Lio/grpc/internal/b1;->j(Lio/grpc/internal/b1;)J

    move-result-wide v5

    iget-object v7, p0, Lio/grpc/internal/b1$b;->a:Lio/grpc/internal/b1;

    invoke-static {v7}, Lio/grpc/internal/b1;->k(Lio/grpc/internal/b1;)Leb/t;

    move-result-object v7

    sget-object v8, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v7, v8}, Leb/t;->d(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v9

    sub-long/2addr v5, v9

    invoke-interface {v3, v4, v5, v6, v8}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v3

    invoke-static {v1, v3}, Lio/grpc/internal/b1;->d(Lio/grpc/internal/b1;Ljava/util/concurrent/ScheduledFuture;)Ljava/util/concurrent/ScheduledFuture;

    iget-object v1, p0, Lio/grpc/internal/b1$b;->a:Lio/grpc/internal/b1;

    invoke-static {v1, v2}, Lio/grpc/internal/b1;->b(Lio/grpc/internal/b1;Lio/grpc/internal/b1$e;)Lio/grpc/internal/b1$e;

    :cond_1
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_2

    iget-object v0, p0, Lio/grpc/internal/b1$b;->a:Lio/grpc/internal/b1;

    invoke-static {v0}, Lio/grpc/internal/b1;->c(Lio/grpc/internal/b1;)Lio/grpc/internal/b1$d;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/b1$d;->a()V

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
