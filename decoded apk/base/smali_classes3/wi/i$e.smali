.class Lwi/i$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxi/b$a;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwi/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private final a:Lwi/j;

.field b:Lxi/b;

.field c:Z

.field final synthetic d:Lwi/i;


# direct methods
.method constructor <init>(Lwi/i;Lxi/b;)V
    .locals 2

    iput-object p1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lwi/j;

    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-class v1, Lwi/i;

    invoke-direct {p1, v0, v1}, Lwi/j;-><init>(Ljava/util/logging/Level;Ljava/lang/Class;)V

    iput-object p1, p0, Lwi/i$e;->a:Lwi/j;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lwi/i$e;->c:Z

    iput-object p2, p0, Lwi/i$e;->b:Lxi/b;

    return-void
.end method

.method private a(Ljava/util/List;)I
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lxi/d;",
            ">;)I"
        }
    .end annotation

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxi/d;

    iget-object v4, v3, Lxi/d;->a:Ldm/e;

    invoke-virtual {v4}, Ldm/e;->B()I

    move-result v4

    add-int/lit8 v4, v4, 0x20

    iget-object v3, v3, Lxi/d;->b:Ldm/e;

    invoke-virtual {v3}, Ldm/e;->B()I

    move-result v3

    add-int/2addr v4, v3

    int-to-long v3, v4

    add-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const-wide/32 v2, 0x7fffffff

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int p1, v0

    return p1
.end method


# virtual methods
.method public d(IJ)V
    .locals 7

    iget-object v0, p0, Lwi/i$e;->a:Lwi/j;

    sget-object v1, Lwi/j$a;->INBOUND:Lwi/j$a;

    invoke-virtual {v0, v1, p1, p2, p3}, Lwi/j;->k(Lwi/j$a;IJ)V

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_1

    const-string p2, "Received 0 flow control window increment."

    if-nez p1, :cond_0

    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    sget-object p3, Lxi/a;->PROTOCOL_ERROR:Lxi/a;

    invoke-static {p1, p3, p2}, Lwi/i;->A(Lwi/i;Lxi/a;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lwi/i$e;->d:Lwi/i;

    sget-object p3, Lvi/g1;->t:Lvi/g1;

    invoke-virtual {p3, p2}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v2

    sget-object v3, Lio/grpc/internal/r$a;->PROCESSED:Lio/grpc/internal/r$a;

    const/4 v4, 0x0

    sget-object v5, Lxi/a;->PROTOCOL_ERROR:Lxi/a;

    const/4 v6, 0x0

    move v1, p1

    invoke-virtual/range {v0 .. v6}, Lwi/i;->U(ILvi/g1;Lio/grpc/internal/r$a;ZLxi/a;Lvi/w0;)V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v0}, Lwi/i;->j(Lwi/i;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    if-nez p1, :cond_2

    :try_start_0
    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p1}, Lwi/i;->w(Lwi/i;)Lwi/q;

    move-result-object p1

    const/4 v1, 0x0

    long-to-int p2, p2

    invoke-virtual {p1, v1, p2}, Lwi/q;->g(Lwi/q$c;I)I

    monitor-exit v0

    return-void

    :cond_2
    iget-object v1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v1}, Lwi/i;->F(Lwi/i;)Ljava/util/Map;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwi/h;

    if-eqz v1, :cond_3

    iget-object v2, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v2}, Lwi/i;->w(Lwi/i;)Lwi/q;

    move-result-object v2

    invoke-virtual {v1}, Lwi/h;->M()Lwi/h$b;

    move-result-object v1

    invoke-virtual {v1}, Lwi/h$b;->b0()Lwi/q$c;

    move-result-object v1

    long-to-int p2, p2

    invoke-virtual {v2, v1, p2}, Lwi/q;->g(Lwi/q$c;I)I

    goto :goto_1

    :cond_3
    iget-object p2, p0, Lwi/i$e;->d:Lwi/i;

    invoke-virtual {p2, p1}, Lwi/i;->c0(I)Z

    move-result p2

    if-nez p2, :cond_4

    const/4 p2, 0x1

    goto :goto_2

    :cond_4
    :goto_1
    const/4 p2, 0x0

    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_5

    iget-object p2, p0, Lwi/i$e;->d:Lwi/i;

    sget-object p3, Lxi/a;->PROTOCOL_ERROR:Lxi/a;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Received window_update for unknown stream: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p3, p1}, Lwi/i;->A(Lwi/i;Lxi/a;Ljava/lang/String;)V

    :cond_5
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public h(ZII)V
    .locals 9

    int-to-long v0, p2

    const/16 v2, 0x20

    shl-long/2addr v0, v2

    int-to-long v2, p3

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    iget-object v2, p0, Lwi/i$e;->a:Lwi/j;

    sget-object v3, Lwi/j$a;->INBOUND:Lwi/j$a;

    invoke-virtual {v2, v3, v0, v1}, Lwi/j;->e(Lwi/j$a;J)V

    const/4 v2, 0x1

    if-nez p1, :cond_0

    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p1}, Lwi/i;->j(Lwi/i;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v0}, Lwi/i;->z(Lwi/i;)Lwi/b;

    move-result-object v0

    invoke-virtual {v0, v2, p2, p3}, Lwi/b;->h(ZII)V

    monitor-exit p1

    goto :goto_1

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    :cond_0
    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p1}, Lwi/i;->j(Lwi/i;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_1
    iget-object p2, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p2}, Lwi/i;->G(Lwi/i;)Lio/grpc/internal/u0;

    move-result-object p2

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    iget-object p2, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p2}, Lwi/i;->G(Lwi/i;)Lio/grpc/internal/u0;

    move-result-object p2

    invoke-virtual {p2}, Lio/grpc/internal/u0;->h()J

    move-result-wide v3

    cmp-long p2, v3, v0

    if-nez p2, :cond_1

    iget-object p2, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p2}, Lwi/i;->G(Lwi/i;)Lio/grpc/internal/u0;

    move-result-object p2

    iget-object v0, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v0, p3}, Lwi/i;->H(Lwi/i;Lio/grpc/internal/u0;)Lio/grpc/internal/u0;

    move-object p3, p2

    goto :goto_0

    :cond_1
    invoke-static {}, Lwi/i;->y()Ljava/util/logging/Logger;

    move-result-object p2

    sget-object v3, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v5, "Received unexpected ping ack. Expecting %d, got %d"

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    iget-object v7, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v7}, Lwi/i;->G(Lwi/i;)Lio/grpc/internal/u0;

    move-result-object v7

    invoke-virtual {v7}, Lio/grpc/internal/u0;->h()J

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v6, v8

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v6, v2

    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    invoke-static {}, Lwi/i;->y()Ljava/util/logging/Logger;

    move-result-object p2

    const-string v0, "Received unexpected ping ack. No ping outstanding"

    invoke-virtual {p2, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    :goto_0
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz p3, :cond_3

    invoke-virtual {p3}, Lio/grpc/internal/u0;->d()Z

    :cond_3
    :goto_1
    return-void

    :catchall_1
    move-exception p2

    :try_start_2
    monitor-exit p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p2
.end method

.method public i(ZILdm/d;I)V
    .locals 6

    iget-object v0, p0, Lwi/i$e;->a:Lwi/j;

    sget-object v1, Lwi/j$a;->INBOUND:Lwi/j$a;

    invoke-interface {p3}, Ldm/d;->c()Ldm/b;

    move-result-object v3

    move v2, p2

    move v4, p4

    move v5, p1

    invoke-virtual/range {v0 .. v5}, Lwi/j;->b(Lwi/j$a;ILdm/b;IZ)V

    iget-object v0, p0, Lwi/i$e;->d:Lwi/i;

    invoke-virtual {v0, p2}, Lwi/i;->Z(I)Lwi/h;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-virtual {p1, p2}, Lwi/i;->c0(I)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p1}, Lwi/i;->j(Lwi/i;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v0}, Lwi/i;->z(Lwi/i;)Lwi/b;

    move-result-object v0

    sget-object v1, Lxi/a;->STREAM_CLOSED:Lxi/a;

    invoke-virtual {v0, p2, v1}, Lwi/b;->s(ILxi/a;)V

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long p1, p4

    invoke-interface {p3, p1, p2}, Ldm/d;->skip(J)V

    goto :goto_0

    :catchall_0
    move-exception p2

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p2

    :cond_0
    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    sget-object p3, Lxi/a;->PROTOCOL_ERROR:Lxi/a;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Received data for unknown stream: "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p3, p2}, Lwi/i;->A(Lwi/i;Lxi/a;Ljava/lang/String;)V

    return-void

    :cond_1
    int-to-long v1, p4

    invoke-interface {p3, v1, v2}, Ldm/d;->q0(J)V

    new-instance p2, Ldm/b;

    invoke-direct {p2}, Ldm/b;-><init>()V

    invoke-interface {p3}, Ldm/d;->c()Ldm/b;

    move-result-object p3

    invoke-virtual {p2, p3, v1, v2}, Ldm/b;->K0(Ldm/b;J)V

    const-string p3, "OkHttpClientTransport$ClientFrameHandler.data"

    invoke-virtual {v0}, Lwi/h;->M()Lwi/h$b;

    move-result-object v1

    invoke-virtual {v1}, Lwi/h$b;->h0()Lcj/d;

    move-result-object v1

    invoke-static {p3, v1}, Lcj/c;->c(Ljava/lang/String;Lcj/d;)V

    iget-object p3, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p3}, Lwi/i;->j(Lwi/i;)Ljava/lang/Object;

    move-result-object p3

    monitor-enter p3

    :try_start_2
    invoke-virtual {v0}, Lwi/h;->M()Lwi/h$b;

    move-result-object v0

    invoke-virtual {v0, p2, p1}, Lwi/h$b;->i0(Ldm/b;Z)V

    monitor-exit p3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :goto_0
    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p1, p4}, Lwi/i;->D(Lwi/i;I)I

    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p1}, Lwi/i;->B(Lwi/i;)I

    move-result p1

    int-to-float p1, p1

    iget-object p2, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p2}, Lwi/i;->J(Lwi/i;)I

    move-result p2

    int-to-float p2, p2

    const/high16 p3, 0x3f000000    # 0.5f

    mul-float/2addr p2, p3

    cmpl-float p1, p1, p2

    if-ltz p1, :cond_2

    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p1}, Lwi/i;->j(Lwi/i;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    :try_start_3
    iget-object p2, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p2}, Lwi/i;->z(Lwi/i;)Lwi/b;

    move-result-object p2

    iget-object p3, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p3}, Lwi/i;->B(Lwi/i;)I

    move-result p3

    int-to-long p3, p3

    const/4 v0, 0x0

    invoke-virtual {p2, v0, p3, p4}, Lwi/b;->d(IJ)V

    monitor-exit p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p1, v0}, Lwi/i;->C(Lwi/i;I)I

    goto :goto_1

    :catchall_1
    move-exception p2

    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p2

    :cond_2
    :goto_1
    return-void

    :catchall_2
    move-exception p1

    :try_start_5
    monitor-exit p3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1
.end method

.method public j(IILjava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/List<",
            "Lxi/d;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lwi/i$e;->a:Lwi/j;

    sget-object v1, Lwi/j$a;->INBOUND:Lwi/j$a;

    invoke-virtual {v0, v1, p1, p2, p3}, Lwi/j;->g(Lwi/j$a;IILjava/util/List;)V

    iget-object p2, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p2}, Lwi/i;->j(Lwi/i;)Ljava/lang/Object;

    move-result-object p2

    monitor-enter p2

    :try_start_0
    iget-object p3, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p3}, Lwi/i;->z(Lwi/i;)Lwi/b;

    move-result-object p3

    sget-object v0, Lxi/a;->PROTOCOL_ERROR:Lxi/a;

    invoke-virtual {p3, p1, v0}, Lwi/b;->s(ILxi/a;)V

    monitor-exit p2

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public k()V
    .locals 0

    return-void
.end method

.method public l(IIIZ)V
    .locals 0

    return-void
.end method

.method public run()V
    .locals 7

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    const-string v2, "OkHttpClientTransport"

    invoke-virtual {v1, v2}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    :cond_0
    :goto_0
    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lwi/i$e;->b:Lxi/b;

    invoke-interface {v2, p0}, Lxi/b;->p1(Lxi/b$a;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v2}, Lwi/i;->v(Lwi/i;)Lio/grpc/internal/b1;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v2}, Lwi/i;->v(Lwi/i;)Lio/grpc/internal/b1;

    move-result-object v2

    invoke-virtual {v2}, Lio/grpc/internal/b1;->l()V

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v2}, Lwi/i;->j(Lwi/i;)Ljava/lang/Object;

    move-result-object v2

    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v3, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v3}, Lwi/i;->x(Lwi/i;)Lvi/g1;

    move-result-object v3

    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v3, :cond_2

    :try_start_2
    sget-object v2, Lvi/g1;->u:Lvi/g1;

    const-string v3, "End of stream or IOException"

    invoke-virtual {v2, v3}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v3

    :cond_2
    iget-object v2, p0, Lwi/i$e;->d:Lwi/i;

    sget-object v4, Lxi/a;->INTERNAL_ERROR:Lxi/a;

    invoke-static {v2, v1, v4, v3}, Lwi/i;->m(Lwi/i;ILxi/a;Lvi/g1;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-object v1, p0, Lwi/i$e;->b:Lxi/b;

    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_2

    :catch_0
    move-exception v1

    goto :goto_1

    :catchall_0
    move-exception v3

    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v2

    :try_start_6
    iget-object v3, p0, Lwi/i$e;->d:Lwi/i;

    sget-object v4, Lxi/a;->PROTOCOL_ERROR:Lxi/a;

    sget-object v5, Lvi/g1;->t:Lvi/g1;

    const-string v6, "error in frame handler"

    invoke-virtual {v5, v6}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v5

    invoke-virtual {v5, v2}, Lvi/g1;->q(Ljava/lang/Throwable;)Lvi/g1;

    move-result-object v2

    invoke-static {v3, v1, v4, v2}, Lwi/i;->m(Lwi/i;ILxi/a;Lvi/g1;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    iget-object v1, p0, Lwi/i$e;->b:Lxi/b;

    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_1

    goto :goto_2

    :catch_1
    move-exception v1

    :goto_1
    invoke-static {}, Lwi/i;->y()Ljava/util/logging/Logger;

    move-result-object v2

    sget-object v3, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    const-string v4, "Exception closing frame reader"

    invoke-virtual {v2, v3, v4, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    iget-object v1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v1}, Lwi/i;->i(Lwi/i;)Lio/grpc/internal/j1$a;

    move-result-object v1

    invoke-interface {v1}, Lio/grpc/internal/j1$a;->c()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    return-void

    :catchall_2
    move-exception v1

    :try_start_8
    iget-object v2, p0, Lwi/i$e;->b:Lxi/b;

    invoke-interface {v2}, Ljava/io/Closeable;->close()V
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2

    goto :goto_3

    :catch_2
    move-exception v2

    invoke-static {}, Lwi/i;->y()Ljava/util/logging/Logger;

    move-result-object v3

    sget-object v4, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    const-string v5, "Exception closing frame reader"

    invoke-virtual {v3, v4, v5, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    iget-object v2, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v2}, Lwi/i;->i(Lwi/i;)Lio/grpc/internal/j1$a;

    move-result-object v2

    invoke-interface {v2}, Lio/grpc/internal/j1$a;->c()V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Thread;->setName(Ljava/lang/String;)V

    throw v1
.end method

.method public s(ILxi/a;)V
    .locals 9

    iget-object v0, p0, Lwi/i$e;->a:Lwi/j;

    sget-object v1, Lwi/j$a;->INBOUND:Lwi/j$a;

    invoke-virtual {v0, v1, p1, p2}, Lwi/j;->h(Lwi/j$a;ILxi/a;)V

    invoke-static {p2}, Lwi/i;->p0(Lxi/a;)Lvi/g1;

    move-result-object v0

    const-string v1, "Rst Stream"

    invoke-virtual {v0, v1}, Lvi/g1;->f(Ljava/lang/String;)Lvi/g1;

    move-result-object v4

    invoke-virtual {v4}, Lvi/g1;->n()Lvi/g1$b;

    move-result-object v0

    sget-object v1, Lvi/g1$b;->CANCELLED:Lvi/g1$b;

    if-eq v0, v1, :cond_1

    invoke-virtual {v4}, Lvi/g1;->n()Lvi/g1$b;

    move-result-object v0

    sget-object v1, Lvi/g1$b;->DEADLINE_EXCEEDED:Lvi/g1$b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    move v6, v0

    iget-object v0, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v0}, Lwi/i;->j(Lwi/i;)Ljava/lang/Object;

    move-result-object v0

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v1}, Lwi/i;->F(Lwi/i;)Ljava/util/Map;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwi/h;

    if-eqz v1, :cond_3

    const-string v2, "OkHttpClientTransport$ClientFrameHandler.rstStream"

    invoke-virtual {v1}, Lwi/h;->M()Lwi/h$b;

    move-result-object v1

    invoke-virtual {v1}, Lwi/h$b;->h0()Lcj/d;

    move-result-object v1

    invoke-static {v2, v1}, Lcj/c;->c(Ljava/lang/String;Lcj/d;)V

    iget-object v2, p0, Lwi/i$e;->d:Lwi/i;

    sget-object v1, Lxi/a;->REFUSED_STREAM:Lxi/a;

    if-ne p2, v1, :cond_2

    sget-object p2, Lio/grpc/internal/r$a;->REFUSED:Lio/grpc/internal/r$a;

    goto :goto_2

    :cond_2
    sget-object p2, Lio/grpc/internal/r$a;->PROCESSED:Lio/grpc/internal/r$a;

    :goto_2
    move-object v5, p2

    const/4 v7, 0x0

    const/4 v8, 0x0

    move v3, p1

    invoke-virtual/range {v2 .. v8}, Lwi/i;->U(ILvi/g1;Lio/grpc/internal/r$a;ZLxi/a;Lvi/w0;)V

    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public t(ZZIILjava/util/List;Lxi/e;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZII",
            "Ljava/util/List<",
            "Lxi/d;",
            ">;",
            "Lxi/e;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Lwi/i$e;->a:Lwi/j;

    sget-object p4, Lwi/j$a;->INBOUND:Lwi/j$a;

    invoke-virtual {p1, p4, p3, p5, p2}, Lwi/j;->d(Lwi/j$a;ILjava/util/List;Z)V

    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p1}, Lwi/i;->E(Lwi/i;)I

    move-result p1

    const p4, 0x7fffffff

    const/4 p6, 0x1

    const/4 v0, 0x0

    if-eq p1, p4, :cond_1

    invoke-direct {p0, p5}, Lwi/i$e;->a(Ljava/util/List;)I

    move-result p1

    iget-object p4, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p4}, Lwi/i;->E(Lwi/i;)I

    move-result p4

    if-le p1, p4, :cond_1

    sget-object p4, Lvi/g1;->o:Lvi/g1;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "Response %s metadata larger than %d: %d"

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    if-eqz p2, :cond_0

    const-string v4, "trailer"

    goto :goto_0

    :cond_0
    const-string v4, "header"

    :goto_0
    aput-object v4, v3, v0

    iget-object v4, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v4}, Lwi/i;->E(Lwi/i;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, p6

    const/4 v4, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v3, v4

    invoke-static {v1, v2, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iget-object p4, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p4}, Lwi/i;->j(Lwi/i;)Ljava/lang/Object;

    move-result-object p4

    monitor-enter p4

    :try_start_0
    iget-object v1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v1}, Lwi/i;->F(Lwi/i;)Ljava/util/Map;

    move-result-object v1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwi/h;

    if-nez v1, :cond_2

    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-virtual {p1, p3}, Lwi/i;->c0(I)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p1}, Lwi/i;->z(Lwi/i;)Lwi/b;

    move-result-object p1

    sget-object p2, Lxi/a;->STREAM_CLOSED:Lxi/a;

    invoke-virtual {p1, p3, p2}, Lwi/b;->s(ILxi/a;)V

    goto :goto_2

    :cond_2
    if-nez p1, :cond_3

    const-string p1, "OkHttpClientTransport$ClientFrameHandler.headers"

    invoke-virtual {v1}, Lwi/h;->M()Lwi/h$b;

    move-result-object p6

    invoke-virtual {p6}, Lwi/h$b;->h0()Lcj/d;

    move-result-object p6

    invoke-static {p1, p6}, Lcj/c;->c(Ljava/lang/String;Lcj/d;)V

    invoke-virtual {v1}, Lwi/h;->M()Lwi/h$b;

    move-result-object p1

    invoke-virtual {p1, p5, p2}, Lwi/h$b;->j0(Ljava/util/List;Z)V

    goto :goto_2

    :cond_3
    if-nez p2, :cond_4

    iget-object p2, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p2}, Lwi/i;->z(Lwi/i;)Lwi/b;

    move-result-object p2

    sget-object p5, Lxi/a;->CANCEL:Lxi/a;

    invoke-virtual {p2, p3, p5}, Lwi/b;->s(ILxi/a;)V

    :cond_4
    invoke-virtual {v1}, Lwi/h;->M()Lwi/h$b;

    move-result-object p2

    new-instance p5, Lvi/w0;

    invoke-direct {p5}, Lvi/w0;-><init>()V

    invoke-virtual {p2, p1, v0, p5}, Lio/grpc/internal/a$c;->N(Lvi/g1;ZLvi/w0;)V

    :goto_2
    move p6, v0

    :cond_5
    monitor-exit p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p6, :cond_6

    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    sget-object p2, Lxi/a;->PROTOCOL_ERROR:Lxi/a;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    const-string p5, "Received header for unknown stream: "

    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-static {p1, p2, p3}, Lwi/i;->A(Lwi/i;Lxi/a;Ljava/lang/String;)V

    :cond_6
    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public u(ZLxi/i;)V
    .locals 3

    iget-object p1, p0, Lwi/i$e;->a:Lwi/j;

    sget-object v0, Lwi/j$a;->INBOUND:Lwi/j$a;

    invoke-virtual {p1, v0, p2}, Lwi/j;->i(Lwi/j$a;Lxi/i;)V

    iget-object p1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p1}, Lwi/i;->j(Lwi/i;)Ljava/lang/Object;

    move-result-object p1

    monitor-enter p1

    const/4 v0, 0x4

    :try_start_0
    invoke-static {p2, v0}, Lwi/m;->b(Lxi/i;I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {p2, v0}, Lwi/m;->a(Lxi/i;I)I

    move-result v0

    iget-object v1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v1, v0}, Lwi/i;->t(Lwi/i;I)I

    :cond_0
    const/4 v0, 0x7

    invoke-static {p2, v0}, Lwi/m;->b(Lxi/i;I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-static {p2, v0}, Lwi/m;->a(Lxi/i;I)I

    move-result v0

    iget-object v1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v1}, Lwi/i;->w(Lwi/i;)Lwi/q;

    move-result-object v1

    invoke-virtual {v1, v0}, Lwi/q;->f(I)Z

    move-result v0

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    iget-boolean v1, p0, Lwi/i$e;->c:Z

    if-eqz v1, :cond_2

    iget-object v1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v1}, Lwi/i;->i(Lwi/i;)Lio/grpc/internal/j1$a;

    move-result-object v1

    invoke-interface {v1}, Lio/grpc/internal/j1$a;->a()V

    iput-boolean v2, p0, Lwi/i$e;->c:Z

    :cond_2
    iget-object v1, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v1}, Lwi/i;->z(Lwi/i;)Lwi/b;

    move-result-object v1

    invoke-virtual {v1, p2}, Lwi/b;->o1(Lxi/i;)V

    if-eqz v0, :cond_3

    iget-object p2, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p2}, Lwi/i;->w(Lwi/i;)Lwi/q;

    move-result-object p2

    invoke-virtual {p2}, Lwi/q;->h()V

    :cond_3
    iget-object p2, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {p2}, Lwi/i;->u(Lwi/i;)Z

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public v(ILxi/a;Ldm/e;)V
    .locals 5

    iget-object v0, p0, Lwi/i$e;->a:Lwi/j;

    sget-object v1, Lwi/j$a;->INBOUND:Lwi/j$a;

    invoke-virtual {v0, v1, p1, p2, p3}, Lwi/j;->c(Lwi/j$a;ILxi/a;Ldm/e;)V

    sget-object v0, Lxi/a;->ENHANCE_YOUR_CALM:Lxi/a;

    if-ne p2, v0, :cond_0

    invoke-virtual {p3}, Ldm/e;->F()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lwi/i;->y()Ljava/util/logging/Logger;

    move-result-object v1

    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object p0, v3, v4

    const/4 v4, 0x1

    aput-object v0, v3, v4

    const-string v4, "%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    const-string v1, "too_many_pings"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwi/i$e;->d:Lwi/i;

    invoke-static {v0}, Lwi/i;->I(Lwi/i;)Ljava/lang/Runnable;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    iget p2, p2, Lxi/a;->httpCode:I

    int-to-long v0, p2

    invoke-static {v0, v1}, Lio/grpc/internal/q0$h;->m(J)Lvi/g1;

    move-result-object p2

    const-string v0, "Received Goaway"

    invoke-virtual {p2, v0}, Lvi/g1;->f(Ljava/lang/String;)Lvi/g1;

    move-result-object p2

    invoke-virtual {p3}, Ldm/e;->B()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p3}, Ldm/e;->F()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Lvi/g1;->f(Ljava/lang/String;)Lvi/g1;

    move-result-object p2

    :cond_1
    iget-object p3, p0, Lwi/i$e;->d:Lwi/i;

    const/4 v0, 0x0

    invoke-static {p3, p1, v0, p2}, Lwi/i;->m(Lwi/i;ILxi/a;Lvi/g1;)V

    return-void
.end method
