.class public abstract Lcom/arthenica/ffmpegkit/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/arthenica/ffmpegkit/x;


# static fields
.field protected static final n:Ljava/util/concurrent/atomic/AtomicLong;


# instance fields
.field protected final a:J

.field protected final b:Lcom/arthenica/ffmpegkit/o;

.field protected final c:Ljava/util/Date;

.field protected d:Ljava/util/Date;

.field protected e:Ljava/util/Date;

.field protected final f:[Ljava/lang/String;

.field protected final g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/arthenica/ffmpegkit/n;",
            ">;"
        }
    .end annotation
.end field

.field protected final h:Ljava/lang/Object;

.field protected i:Ljava/util/concurrent/Future;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Future<",
            "*>;"
        }
    .end annotation
.end field

.field protected j:Lcom/arthenica/ffmpegkit/y;

.field protected k:Lcom/arthenica/ffmpegkit/w;

.field protected l:Ljava/lang/String;

.field protected final m:Lcom/arthenica/ffmpegkit/p;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    const-wide/16 v1, 0x1

    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    sput-object v0, Lcom/arthenica/ffmpegkit/b;->n:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

.method protected constructor <init>([Ljava/lang/String;Lcom/arthenica/ffmpegkit/o;Lcom/arthenica/ffmpegkit/p;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/arthenica/ffmpegkit/b;->n:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/arthenica/ffmpegkit/b;->a:J

    iput-object p2, p0, Lcom/arthenica/ffmpegkit/b;->b:Lcom/arthenica/ffmpegkit/o;

    new-instance p2, Ljava/util/Date;

    invoke-direct {p2}, Ljava/util/Date;-><init>()V

    iput-object p2, p0, Lcom/arthenica/ffmpegkit/b;->c:Ljava/util/Date;

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/arthenica/ffmpegkit/b;->d:Ljava/util/Date;

    iput-object p2, p0, Lcom/arthenica/ffmpegkit/b;->e:Ljava/util/Date;

    iput-object p1, p0, Lcom/arthenica/ffmpegkit/b;->f:[Ljava/lang/String;

    new-instance p1, Ljava/util/LinkedList;

    invoke-direct {p1}, Ljava/util/LinkedList;-><init>()V

    iput-object p1, p0, Lcom/arthenica/ffmpegkit/b;->g:Ljava/util/List;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/arthenica/ffmpegkit/b;->h:Ljava/lang/Object;

    iput-object p2, p0, Lcom/arthenica/ffmpegkit/b;->i:Ljava/util/concurrent/Future;

    sget-object p1, Lcom/arthenica/ffmpegkit/y;->CREATED:Lcom/arthenica/ffmpegkit/y;

    iput-object p1, p0, Lcom/arthenica/ffmpegkit/b;->j:Lcom/arthenica/ffmpegkit/y;

    iput-object p2, p0, Lcom/arthenica/ffmpegkit/b;->k:Lcom/arthenica/ffmpegkit/w;

    iput-object p2, p0, Lcom/arthenica/ffmpegkit/b;->l:Ljava/lang/String;

    iput-object p3, p0, Lcom/arthenica/ffmpegkit/b;->m:Lcom/arthenica/ffmpegkit/p;

    invoke-static {p0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->b(Lcom/arthenica/ffmpegkit/x;)V

    return-void
.end method


# virtual methods
.method public a(I)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0, p1}, Lcom/arthenica/ffmpegkit/b;->x(I)V

    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    iget-wide v0, p0, Lcom/arthenica/ffmpegkit/b;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p1, v1

    const-string v0, "getAllLogsAsString was called to return all logs but there are still logs being transmitted for session id %d."

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "ffmpeg-kit"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->u()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public b()Z
    .locals 2

    iget-wide v0, p0, Lcom/arthenica/ffmpegkit/b;->a:J

    invoke-static {v0, v1}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->messagesInTransmit(J)I

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c(I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Lcom/arthenica/ffmpegkit/n;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lcom/arthenica/ffmpegkit/b;->x(I)V

    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->b()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    new-array p1, p1, [Ljava/lang/Object;

    iget-wide v0, p0, Lcom/arthenica/ffmpegkit/b;->a:J

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v0, p1, v1

    const-string v0, "getAllLogs was called to return all logs but there are still logs being transmitted for session id %d."

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "ffmpeg-kit"

    invoke-static {v0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->m()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public d()Lcom/arthenica/ffmpegkit/p;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/b;->m:Lcom/arthenica/ffmpegkit/p;

    return-object v0
.end method

.method public e()Lcom/arthenica/ffmpegkit/o;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/b;->b:Lcom/arthenica/ffmpegkit/o;

    return-object v0
.end method

.method public f()J
    .locals 2

    iget-wide v0, p0, Lcom/arthenica/ffmpegkit/b;->a:J

    return-wide v0
.end method

.method public getDuration()J
    .locals 5

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/b;->d:Ljava/util/Date;

    iget-object v1, p0, Lcom/arthenica/ffmpegkit/b;->e:Ljava/util/Date;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    sub-long/2addr v1, v3

    return-wide v1

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public getState()Lcom/arthenica/ffmpegkit/y;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/b;->j:Lcom/arthenica/ffmpegkit/y;

    return-object v0
.end method

.method public h()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/b;->d:Ljava/util/Date;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/b;->f:[Ljava/lang/String;

    invoke-static {v0}, Lcom/arthenica/ffmpegkit/FFmpegKitConfig;->c([Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public j()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/b;->c:Ljava/util/Date;

    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/b;->l:Ljava/lang/String;

    return-object v0
.end method

.method public l()Ljava/util/Date;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/b;->e:Ljava/util/Date;

    return-object v0
.end method

.method public m()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/arthenica/ffmpegkit/n;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/b;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/LinkedList;

    iget-object v2, p0, Lcom/arthenica/ffmpegkit/b;->g:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public o(Lcom/arthenica/ffmpegkit/n;)V
    .locals 2

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/b;->h:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/arthenica/ffmpegkit/b;->g:Ljava/util/List;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public q()Lcom/arthenica/ffmpegkit/w;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/b;->k:Lcom/arthenica/ffmpegkit/w;

    return-object v0
.end method

.method r(Lcom/arthenica/ffmpegkit/w;)V
    .locals 0

    iput-object p1, p0, Lcom/arthenica/ffmpegkit/b;->k:Lcom/arthenica/ffmpegkit/w;

    sget-object p1, Lcom/arthenica/ffmpegkit/y;->COMPLETED:Lcom/arthenica/ffmpegkit/y;

    iput-object p1, p0, Lcom/arthenica/ffmpegkit/b;->j:Lcom/arthenica/ffmpegkit/y;

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    iput-object p1, p0, Lcom/arthenica/ffmpegkit/b;->e:Ljava/util/Date;

    return-void
.end method

.method s(Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p1}, Lu2/a;->a(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/arthenica/ffmpegkit/b;->l:Ljava/lang/String;

    sget-object p1, Lcom/arthenica/ffmpegkit/y;->FAILED:Lcom/arthenica/ffmpegkit/y;

    iput-object p1, p0, Lcom/arthenica/ffmpegkit/b;->j:Lcom/arthenica/ffmpegkit/y;

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    iput-object p1, p0, Lcom/arthenica/ffmpegkit/b;->e:Ljava/util/Date;

    return-void
.end method

.method public t()[Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/b;->f:[Ljava/lang/String;

    return-object v0
.end method

.method public u()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/arthenica/ffmpegkit/b;->h:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lcom/arthenica/ffmpegkit/b;->g:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/arthenica/ffmpegkit/n;

    invoke-virtual {v3}, Lcom/arthenica/ffmpegkit/n;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method v(Ljava/util/concurrent/Future;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Future<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/arthenica/ffmpegkit/b;->i:Ljava/util/concurrent/Future;

    return-void
.end method

.method w()V
    .locals 1

    sget-object v0, Lcom/arthenica/ffmpegkit/y;->RUNNING:Lcom/arthenica/ffmpegkit/y;

    iput-object v0, p0, Lcom/arthenica/ffmpegkit/b;->j:Lcom/arthenica/ffmpegkit/y;

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iput-object v0, p0, Lcom/arthenica/ffmpegkit/b;->d:Ljava/util/Date;

    return-void
.end method

.method protected x(I)V
    .locals 6

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    :goto_0
    invoke-virtual {p0}, Lcom/arthenica/ffmpegkit/b;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    int-to-long v4, p1

    add-long/2addr v4, v0

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    monitor-enter p0

    const-wide/16 v2, 0x64

    :try_start_0
    invoke-virtual {p0, v2, v3}, Ljava/lang/Object;->wait(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :catch_0
    :goto_1
    :try_start_1
    monitor-exit p0

    goto :goto_0

    :goto_2
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_0
    return-void
.end method
