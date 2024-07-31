.class final Lcom/google/android/exoplayer2/source/rtsp/n$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/exoplayer2/source/rtsp/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field public final a:Lcom/google/android/exoplayer2/source/rtsp/n$d;

.field private final b:Ls8/e0;

.field private final c:Lv7/u0;

.field private d:Z

.field private e:Z

.field final synthetic f:Lcom/google/android/exoplayer2/source/rtsp/n;


# direct methods
.method public constructor <init>(Lcom/google/android/exoplayer2/source/rtsp/n;Lcom/google/android/exoplayer2/source/rtsp/r;ILcom/google/android/exoplayer2/source/rtsp/b$a;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->f:Lcom/google/android/exoplayer2/source/rtsp/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/google/android/exoplayer2/source/rtsp/n$d;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/google/android/exoplayer2/source/rtsp/n$d;-><init>(Lcom/google/android/exoplayer2/source/rtsp/n;Lcom/google/android/exoplayer2/source/rtsp/r;ILcom/google/android/exoplayer2/source/rtsp/b$a;)V

    iput-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->a:Lcom/google/android/exoplayer2/source/rtsp/n$d;

    new-instance p2, Ls8/e0;

    new-instance p4, Ljava/lang/StringBuilder;

    const/16 v0, 0x37

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v0, "ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ls8/e0;-><init>(Ljava/lang/String;)V

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->b:Ls8/e0;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/n;->D(Lcom/google/android/exoplayer2/source/rtsp/n;)Ls8/b;

    move-result-object p2

    invoke-static {p2}, Lv7/u0;->l(Ls8/b;)Lv7/u0;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->c:Lv7/u0;

    invoke-static {p1}, Lcom/google/android/exoplayer2/source/rtsp/n;->E(Lcom/google/android/exoplayer2/source/rtsp/n;)Lcom/google/android/exoplayer2/source/rtsp/n$b;

    move-result-object p1

    invoke-virtual {p2, p1}, Lv7/u0;->d0(Lv7/u0$d;)V

    return-void
.end method

.method static synthetic a(Lcom/google/android/exoplayer2/source/rtsp/n$e;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->d:Z

    return p0
.end method

.method static synthetic b(Lcom/google/android/exoplayer2/source/rtsp/n$e;)Lv7/u0;
    .locals 0

    iget-object p0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->c:Lv7/u0;

    return-object p0
.end method


# virtual methods
.method public c()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->a:Lcom/google/android/exoplayer2/source/rtsp/n$d;

    invoke-static {v0}, Lcom/google/android/exoplayer2/source/rtsp/n$d;->b(Lcom/google/android/exoplayer2/source/rtsp/n$d;)Lcom/google/android/exoplayer2/source/rtsp/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/rtsp/d;->c()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->d:Z

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->f:Lcom/google/android/exoplayer2/source/rtsp/n;

    invoke-static {v0}, Lcom/google/android/exoplayer2/source/rtsp/n;->F(Lcom/google/android/exoplayer2/source/rtsp/n;)V

    :cond_0
    return-void
.end method

.method public d()J
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->c:Lv7/u0;

    invoke-virtual {v0}, Lv7/u0;->z()J

    move-result-wide v0

    return-wide v0
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->c:Lv7/u0;

    iget-boolean v1, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->d:Z

    invoke-virtual {v0, v1}, Lv7/u0;->K(Z)Z

    move-result v0

    return v0
.end method

.method public f(Lt6/v1;Lw6/g;I)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->c:Lv7/u0;

    iget-boolean v1, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->d:Z

    invoke-virtual {v0, p1, p2, p3, v1}, Lv7/u0;->S(Lt6/v1;Lw6/g;IZ)I

    move-result p1

    return p1
.end method

.method public g()V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->e:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->b:Ls8/e0;

    invoke-virtual {v0}, Ls8/e0;->l()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->c:Lv7/u0;

    invoke-virtual {v0}, Lv7/u0;->T()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->e:Z

    return-void
.end method

.method public h(J)V
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->a:Lcom/google/android/exoplayer2/source/rtsp/n$d;

    invoke-static {v0}, Lcom/google/android/exoplayer2/source/rtsp/n$d;->b(Lcom/google/android/exoplayer2/source/rtsp/n$d;)Lcom/google/android/exoplayer2/source/rtsp/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/exoplayer2/source/rtsp/d;->e()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->c:Lv7/u0;

    invoke-virtual {v0}, Lv7/u0;->V()V

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->c:Lv7/u0;

    invoke-virtual {v0, p1, p2}, Lv7/u0;->b0(J)V

    :cond_0
    return-void
.end method

.method public i(J)I
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->c:Lv7/u0;

    iget-boolean v1, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->d:Z

    invoke-virtual {v0, p1, p2, v1}, Lv7/u0;->E(JZ)I

    move-result p1

    iget-object p2, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->c:Lv7/u0;

    invoke-virtual {p2, p1}, Lv7/u0;->e0(I)V

    return p1
.end method

.method public j()V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->b:Ls8/e0;

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->a:Lcom/google/android/exoplayer2/source/rtsp/n$d;

    invoke-static {v1}, Lcom/google/android/exoplayer2/source/rtsp/n$d;->b(Lcom/google/android/exoplayer2/source/rtsp/n$d;)Lcom/google/android/exoplayer2/source/rtsp/d;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/exoplayer2/source/rtsp/n$e;->f:Lcom/google/android/exoplayer2/source/rtsp/n;

    invoke-static {v2}, Lcom/google/android/exoplayer2/source/rtsp/n;->E(Lcom/google/android/exoplayer2/source/rtsp/n;)Lcom/google/android/exoplayer2/source/rtsp/n$b;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Ls8/e0;->n(Ls8/e0$e;Ls8/e0$b;I)J

    return-void
.end method
