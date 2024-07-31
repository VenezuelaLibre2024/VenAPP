.class Lio/grpc/internal/y1$w$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/y1$w;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/y1$b0;

.field final synthetic b:Lio/grpc/internal/y1$w;


# direct methods
.method constructor <init>(Lio/grpc/internal/y1$w;Lio/grpc/internal/y1$b0;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/y1$w$a;->b:Lio/grpc/internal/y1$w;

    iput-object p2, p0, Lio/grpc/internal/y1$w$a;->a:Lio/grpc/internal/y1$b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lio/grpc/internal/y1$w$a;->b:Lio/grpc/internal/y1$w;

    iget-object v0, v0, Lio/grpc/internal/y1$w;->b:Lio/grpc/internal/y1;

    invoke-static {v0}, Lio/grpc/internal/y1;->W(Lio/grpc/internal/y1;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/y1$w$a;->b:Lio/grpc/internal/y1$w;

    iget-object v1, v1, Lio/grpc/internal/y1$w;->a:Lio/grpc/internal/y1$u;

    invoke-virtual {v1}, Lio/grpc/internal/y1$u;->a()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lio/grpc/internal/y1$w$a;->b:Lio/grpc/internal/y1$w;

    iget-object v1, v1, Lio/grpc/internal/y1$w;->b:Lio/grpc/internal/y1;

    invoke-static {v1}, Lio/grpc/internal/y1;->P(Lio/grpc/internal/y1;)Lio/grpc/internal/y1$z;

    move-result-object v3

    iget-object v4, p0, Lio/grpc/internal/y1$w$a;->a:Lio/grpc/internal/y1$b0;

    invoke-virtual {v3, v4}, Lio/grpc/internal/y1$z;->a(Lio/grpc/internal/y1$b0;)Lio/grpc/internal/y1$z;

    move-result-object v3

    invoke-static {v1, v3}, Lio/grpc/internal/y1;->R(Lio/grpc/internal/y1;Lio/grpc/internal/y1$z;)Lio/grpc/internal/y1$z;

    iget-object v1, p0, Lio/grpc/internal/y1$w$a;->b:Lio/grpc/internal/y1$w;

    iget-object v1, v1, Lio/grpc/internal/y1$w;->b:Lio/grpc/internal/y1;

    invoke-static {v1}, Lio/grpc/internal/y1;->P(Lio/grpc/internal/y1;)Lio/grpc/internal/y1$z;

    move-result-object v3

    invoke-static {v1, v3}, Lio/grpc/internal/y1;->X(Lio/grpc/internal/y1;Lio/grpc/internal/y1$z;)Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/grpc/internal/y1$w$a;->b:Lio/grpc/internal/y1$w;

    iget-object v1, v1, Lio/grpc/internal/y1$w;->b:Lio/grpc/internal/y1;

    invoke-static {v1}, Lio/grpc/internal/y1;->Y(Lio/grpc/internal/y1;)Lio/grpc/internal/y1$c0;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/grpc/internal/y1$w$a;->b:Lio/grpc/internal/y1$w;

    iget-object v1, v1, Lio/grpc/internal/y1$w;->b:Lio/grpc/internal/y1;

    invoke-static {v1}, Lio/grpc/internal/y1;->Y(Lio/grpc/internal/y1;)Lio/grpc/internal/y1$c0;

    move-result-object v1

    invoke-virtual {v1}, Lio/grpc/internal/y1$c0;->a()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    iget-object v1, p0, Lio/grpc/internal/y1$w$a;->b:Lio/grpc/internal/y1$w;

    iget-object v1, v1, Lio/grpc/internal/y1$w;->b:Lio/grpc/internal/y1;

    new-instance v2, Lio/grpc/internal/y1$u;

    invoke-static {v1}, Lio/grpc/internal/y1;->W(Lio/grpc/internal/y1;)Ljava/lang/Object;

    move-result-object v4

    invoke-direct {v2, v4}, Lio/grpc/internal/y1$u;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lio/grpc/internal/y1$w$a;->b:Lio/grpc/internal/y1$w;

    iget-object v1, v1, Lio/grpc/internal/y1$w;->b:Lio/grpc/internal/y1;

    invoke-static {v1}, Lio/grpc/internal/y1;->P(Lio/grpc/internal/y1;)Lio/grpc/internal/y1$z;

    move-result-object v4

    invoke-virtual {v4}, Lio/grpc/internal/y1$z;->d()Lio/grpc/internal/y1$z;

    move-result-object v4

    invoke-static {v1, v4}, Lio/grpc/internal/y1;->R(Lio/grpc/internal/y1;Lio/grpc/internal/y1$z;)Lio/grpc/internal/y1$z;

    iget-object v1, p0, Lio/grpc/internal/y1$w$a;->b:Lio/grpc/internal/y1$w;

    iget-object v1, v1, Lio/grpc/internal/y1$w;->b:Lio/grpc/internal/y1;

    :goto_0
    invoke-static {v1, v2}, Lio/grpc/internal/y1;->Z(Lio/grpc/internal/y1;Lio/grpc/internal/y1$u;)Lio/grpc/internal/y1$u;

    move v1, v3

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_3

    iget-object v0, p0, Lio/grpc/internal/y1$w$a;->a:Lio/grpc/internal/y1$b0;

    iget-object v0, v0, Lio/grpc/internal/y1$b0;->a:Lio/grpc/internal/q;

    sget-object v1, Lvi/g1;->g:Lvi/g1;

    const-string v2, "Unneeded hedging"

    invoke-virtual {v1, v2}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/grpc/internal/q;->c(Lvi/g1;)V

    return-void

    :cond_3
    if-eqz v2, :cond_4

    iget-object v0, p0, Lio/grpc/internal/y1$w$a;->b:Lio/grpc/internal/y1$w;

    iget-object v0, v0, Lio/grpc/internal/y1$w;->b:Lio/grpc/internal/y1;

    invoke-static {v0}, Lio/grpc/internal/y1;->r(Lio/grpc/internal/y1;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lio/grpc/internal/y1$w;

    iget-object v3, p0, Lio/grpc/internal/y1$w$a;->b:Lio/grpc/internal/y1$w;

    iget-object v3, v3, Lio/grpc/internal/y1$w;->b:Lio/grpc/internal/y1;

    invoke-direct {v1, v3, v2}, Lio/grpc/internal/y1$w;-><init>(Lio/grpc/internal/y1;Lio/grpc/internal/y1$u;)V

    iget-object v3, p0, Lio/grpc/internal/y1$w$a;->b:Lio/grpc/internal/y1$w;

    iget-object v3, v3, Lio/grpc/internal/y1$w;->b:Lio/grpc/internal/y1;

    invoke-static {v3}, Lio/grpc/internal/y1;->a0(Lio/grpc/internal/y1;)Lio/grpc/internal/s0;

    move-result-object v3

    iget-wide v3, v3, Lio/grpc/internal/s0;->b:J

    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    invoke-virtual {v2, v0}, Lio/grpc/internal/y1$u;->c(Ljava/util/concurrent/Future;)V

    :cond_4
    iget-object v0, p0, Lio/grpc/internal/y1$w$a;->b:Lio/grpc/internal/y1$w;

    iget-object v0, v0, Lio/grpc/internal/y1$w;->b:Lio/grpc/internal/y1;

    iget-object v1, p0, Lio/grpc/internal/y1$w$a;->a:Lio/grpc/internal/y1$b0;

    invoke-static {v0, v1}, Lio/grpc/internal/y1;->t(Lio/grpc/internal/y1;Lio/grpc/internal/y1$b0;)V

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method
