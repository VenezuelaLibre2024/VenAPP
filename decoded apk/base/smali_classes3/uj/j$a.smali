.class final Luj/j$a;
.super Ldj/r$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Luj/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:Ljava/util/concurrent/ScheduledExecutorService;

.field final b:Lgj/a;

.field volatile c:Z


# direct methods
.method constructor <init>(Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0

    invoke-direct {p0}, Ldj/r$b;-><init>()V

    iput-object p1, p0, Luj/j$a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p1, Lgj/a;

    invoke-direct {p1}, Lgj/a;-><init>()V

    iput-object p1, p0, Luj/j$a;->b:Lgj/a;

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Lgj/b;
    .locals 3

    iget-boolean v0, p0, Luj/j$a;->c:Z

    if-eqz v0, :cond_0

    sget-object p1, Lkj/c;->INSTANCE:Lkj/c;

    return-object p1

    :cond_0
    invoke-static {p1}, Lyj/a;->s(Ljava/lang/Runnable;)Ljava/lang/Runnable;

    move-result-object p1

    new-instance v0, Luj/h;

    iget-object v1, p0, Luj/j$a;->b:Lgj/a;

    invoke-direct {v0, p1, v1}, Luj/h;-><init>(Ljava/lang/Runnable;Lkj/a;)V

    iget-object p1, p0, Luj/j$a;->b:Lgj/a;

    invoke-virtual {p1, v0}, Lgj/a;->b(Lgj/b;)Z

    const-wide/16 v1, 0x0

    cmp-long p1, p2, v1

    if-gtz p1, :cond_1

    :try_start_0
    iget-object p1, p0, Luj/j$a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Luj/j$a;->a:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p1, v0, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    :goto_0
    invoke-virtual {v0, p1}, Luj/h;->a(Ljava/util/concurrent/Future;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Luj/j$a;->dispose()V

    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    sget-object p1, Lkj/c;->INSTANCE:Lkj/c;

    return-object p1
.end method

.method public dispose()V
    .locals 1

    iget-boolean v0, p0, Luj/j$a;->c:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Luj/j$a;->c:Z

    iget-object v0, p0, Luj/j$a;->b:Lgj/a;

    invoke-virtual {v0}, Lgj/a;->dispose()V

    :cond_0
    return-void
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Luj/j$a;->c:Z

    return v0
.end method
