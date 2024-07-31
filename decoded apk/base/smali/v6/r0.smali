.class public Lv6/r0;
.super Lk7/r;
.source "SourceFile"

# interfaces
.implements Lt8/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv6/r0$b;,
        Lv6/r0$c;
    }
.end annotation


# instance fields
.field private final O0:Landroid/content/Context;

.field private final P0:Lv6/u$a;

.field private final Q0:Lv6/v;

.field private R0:I

.field private S0:Z

.field private T0:Lt6/u1;

.field private U0:Lt6/u1;

.field private V0:J

.field private W0:Z

.field private X0:Z

.field private Y0:Z

.field private Z0:Z

.field private a1:Lt6/q3$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lk7/l$b;Lk7/t;ZLandroid/os/Handler;Lv6/u;Lv6/v;)V
    .locals 6

    const/4 v1, 0x1

    const v5, 0x472c4400    # 44100.0f

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lk7/r;-><init>(ILk7/l$b;Lk7/t;ZF)V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lv6/r0;->O0:Landroid/content/Context;

    iput-object p7, p0, Lv6/r0;->Q0:Lv6/v;

    new-instance p1, Lv6/u$a;

    invoke-direct {p1, p5, p6}, Lv6/u$a;-><init>(Landroid/os/Handler;Lv6/u;)V

    iput-object p1, p0, Lv6/r0;->P0:Lv6/u$a;

    new-instance p1, Lv6/r0$c;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lv6/r0$c;-><init>(Lv6/r0;Lv6/r0$a;)V

    invoke-interface {p7, p1}, Lv6/v;->f(Lv6/v$c;)V

    return-void
.end method

.method private static A1(Ljava/lang/String;)Z
    .locals 2

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x18

    if-ge v0, v1, :cond_1

    const-string v0, "OMX.SEC.aac.dec"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    const-string p0, "samsung"

    sget-object v0, Lt8/r0;->c:Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Lt8/r0;->b:Ljava/lang/String;

    const-string v0, "zeroflte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "herolte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "heroqlte"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 p0, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static B1()Z
    .locals 2

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x17

    if-ne v0, v1, :cond_1

    sget-object v0, Lt8/r0;->d:Ljava/lang/String;

    const-string v1, "ZTE B2017G"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "AXON 7 mini"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private C1(Lk7/p;Lt6/u1;)I
    .locals 1

    const-string v0, "OMX.google.raw.decoder"

    iget-object p1, p1, Lk7/p;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget p1, Lt8/r0;->a:I

    const/16 v0, 0x18

    if-ge p1, v0, :cond_1

    const/16 v0, 0x17

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lv6/r0;->O0:Landroid/content/Context;

    invoke-static {p1}, Lt8/r0;->x0(Landroid/content/Context;)Z

    move-result p1

    if-nez p1, :cond_1

    :cond_0
    const/4 p1, -0x1

    return p1

    :cond_1
    iget p1, p2, Lt6/u1;->x:I

    return p1
.end method

.method private static E1(Lk7/t;Lt6/u1;ZLv6/v;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk7/t;",
            "Lt6/u1;",
            "Z",
            "Lv6/v;",
            ")",
            "Ljava/util/List<",
            "Lk7/p;",
            ">;"
        }
    .end annotation

    iget-object v0, p1, Lt6/u1;->w:Ljava/lang/String;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p3, p1}, Lv6/v;->a(Lt6/u1;)Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-static {}, Lk7/c0;->v()Lk7/p;

    move-result-object p3

    if-eqz p3, :cond_1

    invoke-static {p3}, Lcom/google/common/collect/w;->w(Ljava/lang/Object;)Lcom/google/common/collect/w;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p3, 0x0

    invoke-interface {p0, v0, p2, p3}, Lk7/t;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Lk7/c0;->m(Lt6/u1;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-static {v0}, Lcom/google/common/collect/w;->r(Ljava/util/Collection;)Lcom/google/common/collect/w;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-interface {p0, p1, p2, p3}, Lk7/t;->a(Ljava/lang/String;ZZ)Ljava/util/List;

    move-result-object p0

    invoke-static {}, Lcom/google/common/collect/w;->p()Lcom/google/common/collect/w$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/google/common/collect/w$a;->j(Ljava/lang/Iterable;)Lcom/google/common/collect/w$a;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/common/collect/w$a;->j(Ljava/lang/Iterable;)Lcom/google/common/collect/w$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/common/collect/w$a;->k()Lcom/google/common/collect/w;

    move-result-object p0

    return-object p0
.end method

.method private H1()V
    .locals 4

    iget-object v0, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-virtual {p0}, Lv6/r0;->e()Z

    move-result v1

    invoke-interface {v0, v1}, Lv6/v;->q(Z)J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    iget-boolean v2, p0, Lv6/r0;->X0:Z

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lv6/r0;->V0:J

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :goto_0
    iput-wide v0, p0, Lv6/r0;->V0:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Lv6/r0;->X0:Z

    :cond_1
    return-void
.end method

.method static synthetic y1(Lv6/r0;)Lv6/u$a;
    .locals 0

    iget-object p0, p0, Lv6/r0;->P0:Lv6/u$a;

    return-object p0
.end method

.method static synthetic z1(Lv6/r0;)Lt6/q3$a;
    .locals 0

    iget-object p0, p0, Lv6/r0;->a1:Lt6/q3$a;

    return-object p0
.end method


# virtual methods
.method protected B0(Lk7/t;Lt6/u1;Z)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk7/t;",
            "Lt6/u1;",
            "Z)",
            "Ljava/util/List<",
            "Lk7/p;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-static {p1, p2, p3, v0}, Lv6/r0;->E1(Lk7/t;Lt6/u1;ZLv6/v;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1, p2}, Lk7/c0;->u(Ljava/util/List;Lt6/u1;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method protected D0(Lk7/p;Lt6/u1;Landroid/media/MediaCrypto;F)Lk7/l$a;
    .locals 2

    invoke-virtual {p0}, Lt6/l;->M()[Lt6/u1;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0}, Lv6/r0;->D1(Lk7/p;Lt6/u1;[Lt6/u1;)I

    move-result v0

    iput v0, p0, Lv6/r0;->R0:I

    iget-object v0, p1, Lk7/p;->a:Ljava/lang/String;

    invoke-static {v0}, Lv6/r0;->A1(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lv6/r0;->S0:Z

    iget-object v0, p1, Lk7/p;->c:Ljava/lang/String;

    iget v1, p0, Lv6/r0;->R0:I

    invoke-virtual {p0, p2, v0, v1, p4}, Lv6/r0;->F1(Lt6/u1;Ljava/lang/String;IF)Landroid/media/MediaFormat;

    move-result-object p4

    iget-object v0, p1, Lk7/p;->b:Ljava/lang/String;

    const-string v1, "audio/raw"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p2, Lt6/u1;->w:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    move-object v0, p2

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iput-object v0, p0, Lv6/r0;->U0:Lt6/u1;

    invoke-static {p1, p4, p2, p3}, Lk7/l$a;->a(Lk7/p;Landroid/media/MediaFormat;Lt6/u1;Landroid/media/MediaCrypto;)Lk7/l$a;

    move-result-object p1

    return-object p1
.end method

.method protected D1(Lk7/p;Lt6/u1;[Lt6/u1;)I
    .locals 5

    invoke-direct {p0, p1, p2}, Lv6/r0;->C1(Lk7/p;Lt6/u1;)I

    move-result v0

    array-length v1, p3

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    return v0

    :cond_0
    array-length v1, p3

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, p3, v2

    invoke-virtual {p1, p2, v3}, Lk7/p;->f(Lt6/u1;Lt6/u1;)Lw6/i;

    move-result-object v4

    iget v4, v4, Lw6/i;->d:I

    if-eqz v4, :cond_1

    invoke-direct {p0, p1, v3}, Lv6/r0;->C1(Lk7/p;Lt6/u1;)I

    move-result v3

    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public E()Lt8/u;
    .locals 0

    return-object p0
.end method

.method protected F1(Lt6/u1;Ljava/lang/String;IF)Landroid/media/MediaFormat;
    .locals 2

    new-instance v0, Landroid/media/MediaFormat;

    invoke-direct {v0}, Landroid/media/MediaFormat;-><init>()V

    const-string v1, "mime"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setString(Ljava/lang/String;Ljava/lang/String;)V

    iget p2, p1, Lt6/u1;->J:I

    const-string v1, "channel-count"

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string p2, "sample-rate"

    iget v1, p1, Lt6/u1;->K:I

    invoke-virtual {v0, p2, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    iget-object p2, p1, Lt6/u1;->y:Ljava/util/List;

    invoke-static {v0, p2}, Lt8/v;->e(Landroid/media/MediaFormat;Ljava/util/List;)V

    const-string p2, "max-input-size"

    invoke-static {v0, p2, p3}, Lt8/v;->d(Landroid/media/MediaFormat;Ljava/lang/String;I)V

    sget p2, Lt8/r0;->a:I

    const/16 p3, 0x17

    if-lt p2, p3, :cond_0

    const-string p3, "priority"

    const/4 v1, 0x0

    invoke-virtual {v0, p3, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const/high16 p3, -0x40800000    # -1.0f

    cmpl-float p3, p4, p3

    if-eqz p3, :cond_0

    invoke-static {}, Lv6/r0;->B1()Z

    move-result p3

    if-nez p3, :cond_0

    const-string p3, "operating-rate"

    invoke-virtual {v0, p3, p4}, Landroid/media/MediaFormat;->setFloat(Ljava/lang/String;F)V

    :cond_0
    const/16 p3, 0x1c

    if-gt p2, p3, :cond_1

    const-string p3, "audio/ac4"

    iget-object p4, p1, Lt6/u1;->w:Ljava/lang/String;

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_1

    const-string p3, "ac4-is-sync"

    const/4 p4, 0x1

    invoke-virtual {v0, p3, p4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_1
    const/16 p3, 0x18

    if-lt p2, p3, :cond_2

    iget-object p3, p0, Lv6/r0;->Q0:Lv6/v;

    iget p4, p1, Lt6/u1;->J:I

    iget p1, p1, Lt6/u1;->K:I

    const/4 v1, 0x4

    invoke-static {v1, p4, p1}, Lt8/r0;->d0(III)Lt6/u1;

    move-result-object p1

    invoke-interface {p3, p1}, Lv6/v;->l(Lt6/u1;)I

    move-result p1

    const/4 p3, 0x2

    if-ne p1, p3, :cond_2

    const-string p1, "pcm-encoding"

    invoke-virtual {v0, p1, v1}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_2
    const/16 p1, 0x20

    if-lt p2, p1, :cond_3

    const-string p1, "max-output-channel-count"

    const/16 p2, 0x63

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_3
    return-object v0
.end method

.method protected G1()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv6/r0;->X0:Z

    return-void
.end method

.method protected O()V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, Lv6/r0;->Y0:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lv6/r0;->T0:Lt6/u1;

    :try_start_0
    iget-object v0, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {v0}, Lv6/v;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-super {p0}, Lk7/r;->O()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object v0, p0, Lv6/r0;->P0:Lv6/u$a;

    iget-object v1, p0, Lk7/r;->J0:Lw6/e;

    invoke-virtual {v0, v1}, Lv6/u$a;->o(Lw6/e;)V

    return-void

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lv6/r0;->P0:Lv6/u$a;

    iget-object v2, p0, Lk7/r;->J0:Lw6/e;

    invoke-virtual {v1, v2}, Lv6/u$a;->o(Lw6/e;)V

    throw v0

    :catchall_1
    move-exception v0

    :try_start_2
    invoke-super {p0}, Lk7/r;->O()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    iget-object v1, p0, Lv6/r0;->P0:Lv6/u$a;

    iget-object v2, p0, Lk7/r;->J0:Lw6/e;

    invoke-virtual {v1, v2}, Lv6/u$a;->o(Lw6/e;)V

    throw v0

    :catchall_2
    move-exception v0

    iget-object v1, p0, Lv6/r0;->P0:Lv6/u$a;

    iget-object v2, p0, Lk7/r;->J0:Lw6/e;

    invoke-virtual {v1, v2}, Lv6/u$a;->o(Lw6/e;)V

    throw v0
.end method

.method protected P(ZZ)V
    .locals 0

    invoke-super {p0, p1, p2}, Lk7/r;->P(ZZ)V

    iget-object p1, p0, Lv6/r0;->P0:Lv6/u$a;

    iget-object p2, p0, Lk7/r;->J0:Lw6/e;

    invoke-virtual {p1, p2}, Lv6/u$a;->p(Lw6/e;)V

    invoke-virtual {p0}, Lt6/l;->I()Lt6/s3;

    move-result-object p1

    iget-boolean p1, p1, Lt6/s3;->a:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {p1}, Lv6/v;->u()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {p1}, Lv6/v;->j()V

    :goto_0
    iget-object p1, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-virtual {p0}, Lt6/l;->L()Lu6/m3;

    move-result-object p2

    invoke-interface {p1, p2}, Lv6/v;->k(Lu6/m3;)V

    return-void
.end method

.method protected Q(JZ)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Lk7/r;->Q(JZ)V

    iget-boolean p3, p0, Lv6/r0;->Z0:Z

    if-eqz p3, :cond_0

    iget-object p3, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {p3}, Lv6/v;->n()V

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {p3}, Lv6/v;->flush()V

    :goto_0
    iput-wide p1, p0, Lv6/r0;->V0:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv6/r0;->W0:Z

    iput-boolean p1, p0, Lv6/r0;->X0:Z

    return-void
.end method

.method protected Q0(Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "MediaCodecAudioRenderer"

    const-string v1, "Audio codec error"

    invoke-static {v0, v1, p1}, Lt8/s;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, p0, Lv6/r0;->P0:Lv6/u$a;

    invoke-virtual {v0, p1}, Lv6/u$a;->k(Ljava/lang/Exception;)V

    return-void
.end method

.method protected R()V
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-super {p0}, Lk7/r;->R()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v1, p0, Lv6/r0;->Y0:Z

    if-eqz v1, :cond_0

    iput-boolean v0, p0, Lv6/r0;->Y0:Z

    iget-object v0, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {v0}, Lv6/v;->reset()V

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    iget-boolean v2, p0, Lv6/r0;->Y0:Z

    if-eqz v2, :cond_1

    iput-boolean v0, p0, Lv6/r0;->Y0:Z

    iget-object v0, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {v0}, Lv6/v;->reset()V

    :cond_1
    throw v1
.end method

.method protected R0(Ljava/lang/String;Lk7/l$a;JJ)V
    .locals 6

    iget-object v0, p0, Lv6/r0;->P0:Lv6/u$a;

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    invoke-virtual/range {v0 .. v5}, Lv6/u$a;->m(Ljava/lang/String;JJ)V

    return-void
.end method

.method protected S()V
    .locals 1

    invoke-super {p0}, Lk7/r;->S()V

    iget-object v0, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {v0}, Lv6/v;->d()V

    return-void
.end method

.method protected S0(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lv6/r0;->P0:Lv6/u$a;

    invoke-virtual {v0, p1}, Lv6/u$a;->n(Ljava/lang/String;)V

    return-void
.end method

.method protected T()V
    .locals 1

    invoke-direct {p0}, Lv6/r0;->H1()V

    iget-object v0, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {v0}, Lv6/v;->pause()V

    invoke-super {p0}, Lk7/r;->T()V

    return-void
.end method

.method protected T0(Lt6/v1;)Lw6/i;
    .locals 2

    iget-object v0, p1, Lt6/v1;->b:Lt6/u1;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/u1;

    iput-object v0, p0, Lv6/r0;->T0:Lt6/u1;

    invoke-super {p0, p1}, Lk7/r;->T0(Lt6/v1;)Lw6/i;

    move-result-object p1

    iget-object v0, p0, Lv6/r0;->P0:Lv6/u$a;

    iget-object v1, p0, Lv6/r0;->T0:Lt6/u1;

    invoke-virtual {v0, v1, p1}, Lv6/u$a;->q(Lt6/u1;Lw6/i;)V

    return-object p1
.end method

.method protected U0(Lt6/u1;Landroid/media/MediaFormat;)V
    .locals 5

    iget-object v0, p0, Lv6/r0;->U0:Lt6/u1;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move-object p1, v0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {p0}, Lk7/r;->w0()Lk7/l;

    move-result-object v0

    if-nez v0, :cond_1

    goto/16 :goto_2

    :cond_1
    iget-object v0, p1, Lt6/u1;->w:Ljava/lang/String;

    const-string v3, "audio/raw"

    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget v0, p1, Lt6/u1;->L:I

    goto :goto_0

    :cond_2
    sget v0, Lt8/r0;->a:I

    const/16 v4, 0x18

    if-lt v0, v4, :cond_3

    const-string v0, "pcm-encoding"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    goto :goto_0

    :cond_3
    const-string v0, "v-bits-per-sample"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lt8/r0;->c0(I)I

    move-result v0

    goto :goto_0

    :cond_4
    const/4 v0, 0x2

    :goto_0
    new-instance v4, Lt6/u1$b;

    invoke-direct {v4}, Lt6/u1$b;-><init>()V

    invoke-virtual {v4, v3}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v3

    invoke-virtual {v3, v0}, Lt6/u1$b;->a0(I)Lt6/u1$b;

    move-result-object v0

    iget v3, p1, Lt6/u1;->M:I

    invoke-virtual {v0, v3}, Lt6/u1$b;->P(I)Lt6/u1$b;

    move-result-object v0

    iget v3, p1, Lt6/u1;->N:I

    invoke-virtual {v0, v3}, Lt6/u1$b;->Q(I)Lt6/u1$b;

    move-result-object v0

    const-string v3, "channel-count"

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v0, v3}, Lt6/u1$b;->J(I)Lt6/u1$b;

    move-result-object v0

    const-string v3, "sample-rate"

    invoke-virtual {p2, v3}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {v0, p2}, Lt6/u1$b;->h0(I)Lt6/u1$b;

    move-result-object p2

    invoke-virtual {p2}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object p2

    iget-boolean v0, p0, Lv6/r0;->S0:Z

    if-eqz v0, :cond_5

    iget v0, p2, Lt6/u1;->J:I

    const/4 v3, 0x6

    if-ne v0, v3, :cond_5

    iget v0, p1, Lt6/u1;->J:I

    if-ge v0, v3, :cond_5

    new-array v2, v0, [I

    move v0, v1

    :goto_1
    iget v3, p1, Lt6/u1;->J:I

    if-ge v0, v3, :cond_5

    aput v0, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    move-object p1, p2

    :goto_2
    :try_start_0
    iget-object p2, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {p2, p1, v1, v2}, Lv6/v;->o(Lt6/u1;I[I)V
    :try_end_0
    .catch Lv6/v$a; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    iget-object p2, p1, Lv6/v$a;->a:Lt6/u1;

    const/16 v0, 0x1389

    invoke-virtual {p0, p1, p2, v0}, Lt6/l;->G(Ljava/lang/Throwable;Lt6/u1;I)Lt6/x;

    move-result-object p1

    throw p1
.end method

.method protected V0(J)V
    .locals 1

    iget-object v0, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {v0, p1, p2}, Lv6/v;->r(J)V

    return-void
.end method

.method protected X0()V
    .locals 1

    invoke-super {p0}, Lk7/r;->X0()V

    iget-object v0, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {v0}, Lv6/v;->s()V

    return-void
.end method

.method protected Y0(Lw6/g;)V
    .locals 4

    iget-boolean v0, p0, Lv6/r0;->W0:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lw6/a;->r()Z

    move-result v0

    if-nez v0, :cond_1

    iget-wide v0, p1, Lw6/g;->e:J

    iget-wide v2, p0, Lv6/r0;->V0:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/32 v2, 0x7a120

    cmp-long v0, v0, v2

    if-lez v0, :cond_0

    iget-wide v0, p1, Lw6/g;->e:J

    iput-wide v0, p0, Lv6/r0;->V0:J

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lv6/r0;->W0:Z

    :cond_1
    return-void
.end method

.method protected a0(Lk7/p;Lt6/u1;Lt6/u1;)Lw6/i;
    .locals 8

    invoke-virtual {p1, p2, p3}, Lk7/p;->f(Lt6/u1;Lt6/u1;)Lw6/i;

    move-result-object v0

    iget v1, v0, Lw6/i;->e:I

    invoke-direct {p0, p1, p3}, Lv6/r0;->C1(Lk7/p;Lt6/u1;)I

    move-result v2

    iget v3, p0, Lv6/r0;->R0:I

    if-le v2, v3, :cond_0

    or-int/lit8 v1, v1, 0x40

    :cond_0
    move v7, v1

    new-instance v1, Lw6/i;

    iget-object v3, p1, Lk7/p;->a:Ljava/lang/String;

    if-eqz v7, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    iget p1, v0, Lw6/i;->d:I

    :goto_0
    move v6, p1

    move-object v2, v1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v2 .. v7}, Lw6/i;-><init>(Ljava/lang/String;Lt6/u1;Lt6/u1;II)V

    return-object v1
.end method

.method protected a1(JJLk7/l;Ljava/nio/ByteBuffer;IIIJZZLt6/u1;)Z
    .locals 0

    invoke-static {p6}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lv6/r0;->U0:Lt6/u1;

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-eqz p1, :cond_0

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_0

    invoke-static {p5}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk7/l;

    invoke-interface {p1, p7, p3}, Lk7/l;->m(IZ)V

    return p2

    :cond_0
    if-eqz p12, :cond_2

    if-eqz p5, :cond_1

    invoke-interface {p5, p7, p3}, Lk7/l;->m(IZ)V

    :cond_1
    iget-object p1, p0, Lk7/r;->J0:Lw6/e;

    iget p3, p1, Lw6/e;->f:I

    add-int/2addr p3, p9

    iput p3, p1, Lw6/e;->f:I

    iget-object p1, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {p1}, Lv6/v;->s()V

    return p2

    :cond_2
    :try_start_0
    iget-object p1, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {p1, p6, p10, p11, p9}, Lv6/v;->m(Ljava/nio/ByteBuffer;JI)Z

    move-result p1
    :try_end_0
    .catch Lv6/v$b; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lv6/v$e; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_4

    if-eqz p5, :cond_3

    invoke-interface {p5, p7, p3}, Lk7/l;->m(IZ)V

    :cond_3
    iget-object p1, p0, Lk7/r;->J0:Lw6/e;

    iget p3, p1, Lw6/e;->e:I

    add-int/2addr p3, p9

    iput p3, p1, Lw6/e;->e:I

    return p2

    :cond_4
    return p3

    :catch_0
    move-exception p1

    iget-boolean p2, p1, Lv6/v$e;->b:Z

    const/16 p3, 0x138a

    invoke-virtual {p0, p1, p14, p2, p3}, Lt6/l;->H(Ljava/lang/Throwable;Lt6/u1;ZI)Lt6/x;

    move-result-object p1

    throw p1

    :catch_1
    move-exception p1

    iget-object p2, p0, Lv6/r0;->T0:Lt6/u1;

    iget-boolean p3, p1, Lv6/v$b;->b:Z

    const/16 p4, 0x1389

    invoke-virtual {p0, p1, p2, p3, p4}, Lt6/l;->H(Ljava/lang/Throwable;Lt6/u1;ZI)Lt6/x;

    move-result-object p1

    throw p1
.end method

.method public b(Lt6/i3;)V
    .locals 1

    iget-object v0, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {v0, p1}, Lv6/v;->b(Lt6/i3;)V

    return-void
.end method

.method public c()Lt6/i3;
    .locals 1

    iget-object v0, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {v0}, Lv6/v;->c()Lt6/i3;

    move-result-object v0

    return-object v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {v0}, Lv6/v;->g()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0}, Lk7/r;->d()Z

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

.method public e()Z
    .locals 1

    invoke-super {p0}, Lk7/r;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {v0}, Lv6/v;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected f1()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {v0}, Lv6/v;->p()V
    :try_end_0
    .catch Lv6/v$e; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, v0, Lv6/v$e;->c:Lt6/u1;

    iget-boolean v2, v0, Lv6/v$e;->b:Z

    const/16 v3, 0x138a

    invoke-virtual {p0, v0, v1, v2, v3}, Lt6/l;->H(Ljava/lang/Throwable;Lt6/u1;ZI)Lt6/x;

    move-result-object v0

    throw v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "MediaCodecAudioRenderer"

    return-object v0
.end method

.method public p(ILjava/lang/Object;)V
    .locals 1

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x6

    if-eq p1, v0, :cond_0

    packed-switch p1, :pswitch_data_0

    invoke-super {p0, p1, p2}, Lt6/l;->p(ILjava/lang/Object;)V

    goto :goto_0

    :pswitch_0
    sget p1, Lt8/r0;->a:I

    const/16 v0, 0x17

    if-lt p1, v0, :cond_3

    iget-object p1, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-static {p1, p2}, Lv6/r0$b;->a(Lv6/v;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    check-cast p2, Lt6/q3$a;

    iput-object p2, p0, Lv6/r0;->a1:Lt6/q3$a;

    goto :goto_0

    :pswitch_2
    iget-object p1, p0, Lv6/r0;->Q0:Lv6/v;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-interface {p1, p2}, Lv6/v;->h(I)V

    goto :goto_0

    :pswitch_3
    iget-object p1, p0, Lv6/r0;->Q0:Lv6/v;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-interface {p1, p2}, Lv6/v;->v(Z)V

    goto :goto_0

    :cond_0
    check-cast p2, Lv6/y;

    iget-object p1, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {p1, p2}, Lv6/v;->i(Lv6/y;)V

    goto :goto_0

    :cond_1
    check-cast p2, Lv6/e;

    iget-object p1, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {p1, p2}, Lv6/v;->t(Lv6/e;)V

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lv6/r0;->Q0:Lv6/v;

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    invoke-interface {p1, p2}, Lv6/v;->setVolume(F)V

    :cond_3
    :goto_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method protected s1(Lt6/u1;)Z
    .locals 1

    iget-object v0, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {v0, p1}, Lv6/v;->a(Lt6/u1;)Z

    move-result p1

    return p1
.end method

.method protected t1(Lk7/t;Lt6/u1;)I
    .locals 10

    iget-object v0, p2, Lt6/u1;->w:Ljava/lang/String;

    invoke-static {v0}, Lt8/w;->o(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {v1}, Lt6/r3;->o(I)I

    move-result p1

    return p1

    :cond_0
    sget v0, Lt8/r0;->a:I

    const/16 v2, 0x15

    if-lt v0, v2, :cond_1

    const/16 v0, 0x20

    goto :goto_0

    :cond_1
    move v0, v1

    :goto_0
    iget v2, p2, Lt6/u1;->R:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    invoke-static {p2}, Lk7/r;->u1(Lt6/u1;)Z

    move-result v4

    const/16 v5, 0x8

    const/4 v6, 0x4

    if-eqz v4, :cond_4

    iget-object v7, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {v7, p2}, Lv6/v;->a(Lt6/u1;)Z

    move-result v7

    if-eqz v7, :cond_4

    if-eqz v2, :cond_3

    invoke-static {}, Lk7/c0;->v()Lk7/p;

    move-result-object v2

    if-eqz v2, :cond_4

    :cond_3
    invoke-static {v6, v5, v0}, Lt6/r3;->v(III)I

    move-result p1

    return p1

    :cond_4
    const-string v2, "audio/raw"

    iget-object v7, p2, Lt6/u1;->w:Ljava/lang/String;

    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-interface {v2, p2}, Lv6/v;->a(Lt6/u1;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-static {v3}, Lt6/r3;->o(I)I

    move-result p1

    return p1

    :cond_5
    iget-object v2, p0, Lv6/r0;->Q0:Lv6/v;

    iget v7, p2, Lt6/u1;->J:I

    iget v8, p2, Lt6/u1;->K:I

    const/4 v9, 0x2

    invoke-static {v9, v7, v8}, Lt8/r0;->d0(III)Lt6/u1;

    move-result-object v7

    invoke-interface {v2, v7}, Lv6/v;->a(Lt6/u1;)Z

    move-result v2

    if-nez v2, :cond_6

    invoke-static {v3}, Lt6/r3;->o(I)I

    move-result p1

    return p1

    :cond_6
    iget-object v2, p0, Lv6/r0;->Q0:Lv6/v;

    invoke-static {p1, p2, v1, v2}, Lv6/r0;->E1(Lk7/t;Lt6/u1;ZLv6/v;)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-static {v3}, Lt6/r3;->o(I)I

    move-result p1

    return p1

    :cond_7
    if-nez v4, :cond_8

    invoke-static {v9}, Lt6/r3;->o(I)I

    move-result p1

    return p1

    :cond_8
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk7/p;

    invoke-virtual {v2, p2}, Lk7/p;->o(Lt6/u1;)Z

    move-result v4

    if-nez v4, :cond_a

    move v7, v3

    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_a

    invoke-interface {p1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lk7/p;

    invoke-virtual {v8, p2}, Lk7/p;->o(Lt6/u1;)Z

    move-result v9

    if-eqz v9, :cond_9

    move p1, v1

    move-object v2, v8

    goto :goto_3

    :cond_9
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_a
    move p1, v3

    move v3, v4

    :goto_3
    if-eqz v3, :cond_b

    goto :goto_4

    :cond_b
    const/4 v6, 0x3

    :goto_4
    if-eqz v3, :cond_c

    invoke-virtual {v2, p2}, Lk7/p;->r(Lt6/u1;)Z

    move-result p2

    if-eqz p2, :cond_c

    const/16 v5, 0x10

    :cond_c
    iget-boolean p2, v2, Lk7/p;->h:Z

    if-eqz p2, :cond_d

    const/16 p2, 0x40

    goto :goto_5

    :cond_d
    move p2, v1

    :goto_5
    if-eqz p1, :cond_e

    const/16 v1, 0x80

    :cond_e
    invoke-static {v6, v5, v0, p2, v1}, Lt6/r3;->l(IIIII)I

    move-result p1

    return p1
.end method

.method public w()J
    .locals 2

    invoke-virtual {p0}, Lt6/l;->getState()I

    move-result v0

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lv6/r0;->H1()V

    :cond_0
    iget-wide v0, p0, Lv6/r0;->V0:J

    return-wide v0
.end method

.method protected z0(FLt6/u1;[Lt6/u1;)F
    .locals 4

    array-length p2, p3

    const/4 v0, -0x1

    const/4 v1, 0x0

    move v2, v0

    :goto_0
    if-ge v1, p2, :cond_1

    aget-object v3, p3, v1

    iget v3, v3, Lt6/u1;->K:I

    if-eq v3, v0, :cond_0

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    if-ne v2, v0, :cond_2

    const/high16 p1, -0x40800000    # -1.0f

    goto :goto_1

    :cond_2
    int-to-float p2, v2

    mul-float/2addr p1, p2

    :goto_1
    return p1
.end method
