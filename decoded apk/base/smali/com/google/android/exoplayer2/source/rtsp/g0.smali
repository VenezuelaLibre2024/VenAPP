.class final Lcom/google/android/exoplayer2/source/rtsp/g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/exoplayer2/source/rtsp/b;


# instance fields
.field private final a:Ls8/n0;

.field private b:Lcom/google/android/exoplayer2/source/rtsp/g0;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ls8/n0;

    const/16 v1, 0x7d0

    invoke-static {p1, p2}, Lhb/e;->d(J)I

    move-result p1

    invoke-direct {v0, v1, p1}, Ls8/n0;-><init>(II)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/g0;->a:Ls8/n0;

    return-void
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lcom/google/android/exoplayer2/source/rtsp/g0;->c()I

    move-result v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-static {v1}, Lt8/a;->g(Z)V

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    add-int/2addr v0, v3

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v1, v3

    const-string v0, "RTP/AVP;unicast;client_port=%d-%d"

    invoke-static {v0, v1}, Lt8/r0;->C(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/g0;->a:Ls8/n0;

    invoke-virtual {v0}, Ls8/n0;->c()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    move v0, v1

    :cond_0
    return v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/g0;->a:Ls8/n0;

    invoke-virtual {v0}, Ls8/n0;->close()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/g0;->b:Lcom/google/android/exoplayer2/source/rtsp/g0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/rtsp/g0;->close()V

    :cond_0
    return-void
.end method

.method public getUri()Landroid/net/Uri;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/g0;->a:Ls8/n0;

    invoke-virtual {v0}, Ls8/n0;->getUri()Landroid/net/Uri;

    move-result-object v0

    return-object v0
.end method

.method public h(Lcom/google/android/exoplayer2/source/rtsp/g0;)V
    .locals 1

    if-eq p0, p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->a(Z)V

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/g0;->b:Lcom/google/android/exoplayer2/source/rtsp/g0;

    return-void
.end method

.method public j()Lcom/google/android/exoplayer2/source/rtsp/s$b;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public l(Ls8/m0;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/g0;->a:Ls8/n0;

    invoke-virtual {v0, p1}, Ls8/f;->l(Ls8/m0;)V

    return-void
.end method

.method public o(Ls8/n;)J
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/g0;->a:Ls8/n0;

    invoke-virtual {v0, p1}, Ls8/n0;->o(Ls8/n;)J

    move-result-wide v0

    return-wide v0
.end method

.method public read([BII)I
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/g0;->a:Ls8/n0;

    invoke-virtual {v0, p1, p2, p3}, Ls8/n0;->read([BII)I

    move-result p1
    :try_end_0
    .catch Ls8/n0$a; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    move-exception p1

    iget p2, p1, Ls8/k;->a:I

    const/16 p3, 0x7d2

    if-ne p2, p3, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    throw p1
.end method
