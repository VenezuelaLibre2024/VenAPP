.class public final Lsh/i;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:Ljava/lang/String;

.field private final d:Lio/flutter/plugin/common/MethodChannel;

.field private final e:Lio/flutter/plugin/common/MethodChannel$Result;

.field private final f:Lsh/e;

.field private final g:Landroid/content/Context;

.field private h:Landroid/media/MediaCodec;

.field private i:Landroid/media/MediaExtractor;

.field private j:J

.field private k:F

.field private l:F

.field private volatile m:Z

.field private final n:Ljava/util/concurrent/CountDownLatch;

.field private o:Z

.field private p:I

.field private q:I

.field private r:I

.field private s:J

.field private t:J

.field private u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private v:J

.field private w:D


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Lio/flutter/plugin/common/MethodChannel;Lio/flutter/plugin/common/MethodChannel$Result;Lsh/e;Landroid/content/Context;)V
    .locals 1

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "key"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "methodChannel"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extractorCallBack"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh/i;->a:Ljava/lang/String;

    iput p2, p0, Lsh/i;->b:I

    iput-object p3, p0, Lsh/i;->c:Ljava/lang/String;

    iput-object p4, p0, Lsh/i;->d:Lio/flutter/plugin/common/MethodChannel;

    iput-object p5, p0, Lsh/i;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    iput-object p6, p0, Lsh/i;->f:Lsh/e;

    iput-object p7, p0, Lsh/i;->g:Landroid/content/Context;

    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object p1, p0, Lsh/i;->n:Ljava/util/concurrent/CountDownLatch;

    iput p2, p0, Lsh/i;->q:I

    const/16 p1, 0x10

    iput p1, p0, Lsh/i;->r:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lsh/i;->u:Ljava/util/ArrayList;

    return-void
.end method

.method public static final synthetic a(Lsh/i;)J
    .locals 2

    iget-wide v0, p0, Lsh/i;->j:J

    return-wide v0
.end method

.method public static final synthetic b(Lsh/i;)I
    .locals 0

    iget p0, p0, Lsh/i;->b:I

    return p0
.end method

.method public static final synthetic c(Lsh/i;)Landroid/media/MediaExtractor;
    .locals 0

    iget-object p0, p0, Lsh/i;->i:Landroid/media/MediaExtractor;

    return-object p0
.end method

.method public static final synthetic d(Lsh/i;)Ljava/util/concurrent/CountDownLatch;
    .locals 0

    iget-object p0, p0, Lsh/i;->n:Ljava/util/concurrent/CountDownLatch;

    return-object p0
.end method

.method public static final synthetic e(Lsh/i;)Z
    .locals 0

    iget-boolean p0, p0, Lsh/i;->o:Z

    return p0
.end method

.method public static final synthetic f(Lsh/i;)I
    .locals 0

    iget p0, p0, Lsh/i;->r:I

    return p0
.end method

.method public static final synthetic g(Lsh/i;)Lio/flutter/plugin/common/MethodChannel$Result;
    .locals 0

    iget-object p0, p0, Lsh/i;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    return-object p0
.end method

.method public static final synthetic h(Lsh/i;)I
    .locals 0

    iget p0, p0, Lsh/i;->p:I

    return p0
.end method

.method public static final synthetic i(Lsh/i;)J
    .locals 2

    iget-wide v0, p0, Lsh/i;->s:J

    return-wide v0
.end method

.method public static final synthetic j(Lsh/i;ILjava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lsh/i;->u(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public static final synthetic k(Lsh/i;ILjava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lsh/i;->v(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public static final synthetic l(Lsh/i;ILjava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lsh/i;->w(ILjava/nio/ByteBuffer;)V

    return-void
.end method

.method public static final synthetic m(Lsh/i;I)V
    .locals 0

    iput p1, p0, Lsh/i;->q:I

    return-void
.end method

.method public static final synthetic n(Lsh/i;Z)V
    .locals 0

    iput-boolean p1, p0, Lsh/i;->o:Z

    return-void
.end method

.method public static final synthetic o(Lsh/i;I)V
    .locals 0

    iput p1, p0, Lsh/i;->r:I

    return-void
.end method

.method public static final synthetic p(Lsh/i;J)V
    .locals 0

    iput-wide p1, p0, Lsh/i;->t:J

    return-void
.end method

.method public static final synthetic q(Lsh/i;I)V
    .locals 0

    iput p1, p0, Lsh/i;->p:I

    return-void
.end method

.method public static final synthetic r(Lsh/i;J)V
    .locals 0

    iput-wide p1, p0, Lsh/i;->s:J

    return-void
.end method

.method private final s(Ljava/lang/String;)Landroid/media/MediaFormat;
    .locals 8

    new-instance v0, Landroid/media/MediaExtractor;

    invoke-direct {v0}, Landroid/media/MediaExtractor;-><init>()V

    iput-object v0, p0, Lsh/i;->i:Landroid/media/MediaExtractor;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    iget-object v1, p0, Lsh/i;->g:Landroid/content/Context;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/media/MediaExtractor;->setDataSource(Landroid/content/Context;Landroid/net/Uri;Ljava/util/Map;)V

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->getTrackCount()I

    move-result p1

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    if-ge v3, p1, :cond_2

    invoke-virtual {v0, v3}, Landroid/media/MediaExtractor;->getTrackFormat(I)Landroid/media/MediaFormat;

    move-result-object v4

    const-string v5, "getTrackFormat(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "mime"

    invoke-virtual {v4, v5}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_0

    const-string v5, ""

    :cond_0
    invoke-static {v5}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    const-string v6, "audio"

    const/4 v7, 0x2

    invoke-static {v5, v6, v1, v7, v2}, Lxk/g;->J(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const-string p1, "durationUs"

    invoke-virtual {v4, p1}, Landroid/media/MediaFormat;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    const/16 p1, 0x3e8

    int-to-long v5, p1

    div-long/2addr v1, v5

    iput-wide v1, p0, Lsh/i;->j:J

    invoke-virtual {v0, v3}, Landroid/media/MediaExtractor;->selectTrack(I)V

    return-object v4

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v2
.end method

.method private final u(ILjava/nio/ByteBuffer;)V
    .locals 4

    iget v0, p0, Lsh/i;->q:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    div-int/2addr p1, v0

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v2, v3

    int-to-float v2, v2

    const v3, 0x46fffe00    # 32767.0f

    div-float/2addr v2, v3

    iget v3, p0, Lsh/i;->q:I

    if-ne v3, v1, :cond_1

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    :cond_1
    invoke-direct {p0, v2}, Lsh/i;->x(F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method private final v(ILjava/nio/ByteBuffer;)V
    .locals 12

    iget v0, p0, Lsh/i;->q:I

    const/16 v1, 0x8

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x4

    :goto_0
    div-int/2addr p1, v0

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    int-to-long v3, v3

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v5

    int-to-long v5, v5

    shl-long/2addr v5, v1

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v7

    int-to-long v7, v7

    const/16 v9, 0x10

    shl-long/2addr v7, v9

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v9

    int-to-long v9, v9

    const/16 v11, 0x18

    shl-long/2addr v9, v11

    or-long/2addr v3, v5

    or-long/2addr v3, v7

    or-long/2addr v3, v9

    long-to-float v3, v3

    const/high16 v4, 0x4f000000

    div-float/2addr v3, v4

    iget v4, p0, Lsh/i;->q:I

    if-ne v4, v2, :cond_1

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    :cond_1
    invoke-direct {p0, v3}, Lsh/i;->x(F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method private final w(ILjava/nio/ByteBuffer;)V
    .locals 4

    iget v0, p0, Lsh/i;->q:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    div-int/2addr p1, v0

    const/4 v0, 0x0

    :goto_1
    if-ge v0, p1, :cond_2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x43000000    # 128.0f

    div-float/2addr v2, v3

    iget v3, p0, Lsh/i;->q:I

    if-ne v3, v1, :cond_1

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->get()B

    :cond_1
    invoke-direct {p0, v2}, Lsh/i;->x(F)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method private final x(F)V
    .locals 6

    iget-wide v0, p0, Lsh/i;->v:J

    iget-wide v2, p0, Lsh/i;->t:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    iget v0, p0, Lsh/i;->l:F

    const/high16 v1, 0x3f800000    # 1.0f

    add-float/2addr v0, v1

    iput v0, p0, Lsh/i;->l:F

    iget v4, p0, Lsh/i;->b:I

    int-to-float v4, v4

    div-float/2addr v0, v4

    iput v0, p0, Lsh/i;->k:F

    cmpl-float v0, v0, v1

    if-lez v0, :cond_0

    invoke-virtual {p0}, Lsh/i;->z()V

    return-void

    :cond_0
    iget-wide v0, p0, Lsh/i;->w:D

    long-to-double v2, v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    iget-object v2, p0, Lsh/i;->u:Ljava/util/ArrayList;

    double-to-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, Lsh/i;->f:Lsh/e;

    iget v1, p0, Lsh/i;->k:F

    invoke-interface {v0, v1}, Lsh/e;->a(F)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lsh/i;->v:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lsh/i;->w:D

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "waveformData"

    iget-object v2, p0, Lsh/i;->u:Ljava/util/ArrayList;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, p0, Lsh/i;->k:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const-string v2, "progress"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "playerKey"

    iget-object v2, p0, Lsh/i;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lsh/i;->d:Lio/flutter/plugin/common/MethodChannel;

    const-string v2, "onCurrentExtractedWaveformData"

    invoke-virtual {v1, v2, v0}, Lio/flutter/plugin/common/MethodChannel;->invokeMethod(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_1
    iget-wide v0, p0, Lsh/i;->v:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lsh/i;->v:J

    iget-wide v0, p0, Lsh/i;->w:D

    float-to-double v2, p1

    const-wide/high16 v4, 0x4000000000000000L    # 2.0

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v2

    add-double/2addr v0, v2

    iput-wide v0, p0, Lsh/i;->w:D

    return-void
.end method


# virtual methods
.method public final t()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lsh/i;->u:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final y()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lsh/i;->a:Ljava/lang/String;

    invoke-direct {p0, v0}, Lsh/i;->s(Ljava/lang/String;)Landroid/media/MediaFormat;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v1, "mime"

    invoke-virtual {v0, v1}, Landroid/media/MediaFormat;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Landroid/media/MediaCodec;->createDecoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v1, v0, v3, v3, v2}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    new-instance v0, Lsh/i$a;

    invoke-direct {v0, p0}, Lsh/i$a;-><init>(Lsh/i;)V

    invoke-virtual {v1, v0}, Landroid/media/MediaCodec;->setCallback(Landroid/media/MediaCodec$Callback;)V

    invoke-virtual {v1}, Landroid/media/MediaCodec;->start()V

    iput-object v1, p0, Lsh/i;->h:Landroid/media/MediaCodec;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No MIME type found"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No audio format found"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lsh/i;->e:Lio/flutter/plugin/common/MethodChannel$Result;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    const-string v2, "An error is thrown before decoding the audio file"

    const-string v3, "AudioWaveforms"

    invoke-interface {v1, v3, v0, v2}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public final z()V
    .locals 1

    iget-boolean v0, p0, Lsh/i;->m:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lsh/i;->m:Z

    iget-object v0, p0, Lsh/i;->h:Landroid/media/MediaCodec;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    :cond_1
    iget-object v0, p0, Lsh/i;->h:Landroid/media/MediaCodec;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    :cond_2
    iget-object v0, p0, Lsh/i;->i:Landroid/media/MediaExtractor;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->release()V

    :cond_3
    iget-object v0, p0, Lsh/i;->n:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method
