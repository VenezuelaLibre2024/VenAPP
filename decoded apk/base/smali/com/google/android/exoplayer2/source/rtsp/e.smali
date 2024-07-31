.class final Lcom/google/android/exoplayer2/source/rtsp/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/k;


# instance fields
.field private final a:Ld8/e;

.field private final b:Lt8/e0;

.field private final c:Lt8/e0;

.field private final d:I

.field private final e:Ljava/lang/Object;

.field private final f:Lcom/google/android/exoplayer2/source/rtsp/g;

.field private g:Ly6/m;

.field private h:Z

.field private volatile i:J

.field private volatile j:I

.field private k:Z

.field private l:J

.field private m:J


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/source/rtsp/h;I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->d:I

    new-instance p2, Ld8/a;

    invoke-direct {p2}, Ld8/a;-><init>()V

    invoke-virtual {p2, p1}, Ld8/a;->a(Lcom/google/android/exoplayer2/source/rtsp/h;)Ld8/e;

    move-result-object p1

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld8/e;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->a:Ld8/e;

    new-instance p1, Lt8/e0;

    const p2, 0xffe3

    invoke-direct {p1, p2}, Lt8/e0;-><init>(I)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->b:Lt8/e0;

    new-instance p1, Lt8/e0;

    invoke-direct {p1}, Lt8/e0;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->c:Lt8/e0;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->e:Ljava/lang/Object;

    new-instance p1, Lcom/google/android/exoplayer2/source/rtsp/g;

    invoke-direct {p1}, Lcom/google/android/exoplayer2/source/rtsp/g;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->f:Lcom/google/android/exoplayer2/source/rtsp/g;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->i:J

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->j:I

    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->l:J

    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->m:J

    return-void
.end method

.method private static c(J)J
    .locals 2

    const-wide/16 v0, 0x1e

    sub-long/2addr p0, v0

    return-wide p0
.end method


# virtual methods
.method public a(JJ)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->l:J

    iput-wide p3, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->m:J

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Ly6/m;)V
    .locals 3

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->a:Ld8/e;

    iget v1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->d:I

    invoke-interface {v0, p1, v1}, Ld8/e;->c(Ly6/m;I)V

    invoke-interface {p1}, Ly6/m;->q()V

    new-instance v0, Ly6/z$b;

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v1, v2}, Ly6/z$b;-><init>(J)V

    invoke-interface {p1, v0}, Ly6/m;->p(Ly6/z;)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->g:Ly6/m;

    return-void
.end method

.method public d()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->h:Z

    return v0
.end method

.method public e(Ly6/l;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "RTP packets are transmitted in a packet stream do not support sniffing."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Ly6/l;Ly6/y;)I
    .locals 12

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->g:Ly6/m;

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->b:Lt8/e0;

    invoke-virtual {p2}, Lt8/e0;->e()[B

    move-result-object p2

    const v0, 0xffe3

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1, v0}, Ly6/l;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    return p2

    :cond_0
    if-nez p1, :cond_1

    return v1

    :cond_1
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->b:Lt8/e0;

    invoke-virtual {v0, v1}, Lt8/e0;->U(I)V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->b:Lt8/e0;

    invoke-virtual {v0, p1}, Lt8/e0;->T(I)V

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->b:Lt8/e0;

    invoke-static {p1}, Lc8/a;->d(Lt8/e0;)Lc8/a;

    move-result-object p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/google/android/exoplayer2/source/rtsp/e;->c(J)J

    move-result-wide v4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->f:Lcom/google/android/exoplayer2/source/rtsp/g;

    invoke-virtual {v0, p1, v2, v3}, Lcom/google/android/exoplayer2/source/rtsp/g;->e(Lc8/a;J)Z

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->f:Lcom/google/android/exoplayer2/source/rtsp/g;

    invoke-virtual {p1, v4, v5}, Lcom/google/android/exoplayer2/source/rtsp/g;->f(J)Lc8/a;

    move-result-object p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->h:Z

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_6

    iget-wide v6, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->i:J

    cmp-long v0, v6, v2

    if-nez v0, :cond_4

    iget-wide v6, p1, Lc8/a;->h:J

    iput-wide v6, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->i:J

    :cond_4
    iget v0, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->j:I

    if-ne v0, p2, :cond_5

    iget p2, p1, Lc8/a;->g:I

    iput p2, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->j:I

    :cond_5
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->a:Ld8/e;

    iget-wide v6, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->i:J

    iget v0, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->j:I

    invoke-interface {p2, v6, v7, v0}, Ld8/e;->d(JI)V

    const/4 p2, 0x1

    iput-boolean p2, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->h:Z

    :cond_6
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->e:Ljava/lang/Object;

    monitor-enter p2

    :try_start_0
    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->k:Z

    if-eqz v0, :cond_7

    iget-wide v4, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->l:J

    cmp-long p1, v4, v2

    if-eqz p1, :cond_8

    iget-wide v4, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->m:J

    cmp-long p1, v4, v2

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->f:Lcom/google/android/exoplayer2/source/rtsp/g;

    invoke-virtual {p1}, Lcom/google/android/exoplayer2/source/rtsp/g;->g()V

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->a:Ld8/e;

    iget-wide v4, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->l:J

    iget-wide v6, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->m:J

    invoke-interface {p1, v4, v5, v6, v7}, Ld8/e;->a(JJ)V

    iput-boolean v1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->k:Z

    iput-wide v2, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->l:J

    iput-wide v2, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->m:J

    goto :goto_0

    :cond_7
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->c:Lt8/e0;

    iget-object v2, p1, Lc8/a;->k:[B

    invoke-virtual {v0, v2}, Lt8/e0;->R([B)V

    iget-object v6, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->a:Ld8/e;

    iget-object v7, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->c:Lt8/e0;

    iget-wide v8, p1, Lc8/a;->h:J

    iget v10, p1, Lc8/a;->g:I

    iget-boolean v11, p1, Lc8/a;->e:Z

    invoke-interface/range {v6 .. v11}, Ld8/e;->b(Lt8/e0;JIZ)V

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->f:Lcom/google/android/exoplayer2/source/rtsp/g;

    invoke-virtual {p1, v4, v5}, Lcom/google/android/exoplayer2/source/rtsp/g;->f(J)Lc8/a;

    move-result-object p1

    if-nez p1, :cond_7

    :cond_8
    :goto_0
    monitor-exit p2

    return v1

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public g()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->e:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->k:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public h(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->j:I

    return-void
.end method

.method public i(J)V
    .locals 0

    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/rtsp/e;->i:J

    return-void
.end method

.method public release()V
    .locals 0

    return-void
.end method
