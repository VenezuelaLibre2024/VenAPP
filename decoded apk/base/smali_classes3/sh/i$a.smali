.class public final Lsh/i$a;
.super Landroid/media/MediaCodec$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsh/i;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lsh/i;


# direct methods
.method constructor <init>(Lsh/i;)V
    .locals 0

    iput-object p1, p0, Lsh/i$a;->a:Lsh/i;

    invoke-direct {p0}, Landroid/media/MediaCodec$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Landroid/media/MediaCodec;Landroid/media/MediaCodec$CodecException;)V
    .locals 2

    const-string v0, "codec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "e"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lsh/i$a;->a:Lsh/i;

    invoke-static {p1}, Lsh/i;->g(Lsh/i;)Lio/flutter/plugin/common/MethodChannel$Result;

    move-result-object p1

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string v0, "An error is thrown while decoding the audio file"

    const-string v1, "AudioWaveforms"

    invoke-interface {p1, v1, p2, v0}, Lio/flutter/plugin/common/MethodChannel$Result;->error(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, Lsh/i$a;->a:Lsh/i;

    invoke-static {p1}, Lsh/i;->d(Lsh/i;)Ljava/util/concurrent/CountDownLatch;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method public onInputBufferAvailable(Landroid/media/MediaCodec;I)V
    .locals 9

    const-string v0, "codec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lsh/i$a;->a:Lsh/i;

    invoke-static {v0}, Lsh/i;->e(Lsh/i;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lsh/i$a;->a:Lsh/i;

    invoke-static {v0}, Lsh/i;->c(Lsh/i;)Landroid/media/MediaExtractor;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    invoke-virtual {p1, p2}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v2

    if-eqz v2, :cond_3

    iget-object v8, p0, Lsh/i$a;->a:Lsh/i;

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/media/MediaExtractor;->readSampleData(Ljava/nio/ByteBuffer;I)I

    move-result v4

    if-lez v4, :cond_2

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->getSampleTime()J

    move-result-wide v5

    const/4 v7, 0x0

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v1 .. v7}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    invoke-virtual {v0}, Landroid/media/MediaExtractor;->advance()Z

    goto :goto_0

    :cond_2
    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x4

    move-object v1, p1

    move v2, p2

    invoke-virtual/range {v1 .. v7}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    const/4 v0, 0x1

    invoke-static {v8, v0}, Lsh/i;->n(Lsh/i;Z)V

    :cond_3
    :goto_0
    return-void
.end method

.method public onOutputBufferAvailable(Landroid/media/MediaCodec;ILandroid/media/MediaCodec$BufferInfo;)V
    .locals 5

    const-string v0, "codec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "info"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p3, Landroid/media/MediaCodec$BufferInfo;->size:I

    if-lez v0, :cond_3

    invoke-virtual {p1, p2}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lsh/i$a;->a:Lsh/i;

    iget v2, p3, Landroid/media/MediaCodec$BufferInfo;->size:I

    iget v3, p3, Landroid/media/MediaCodec$BufferInfo;->offset:I

    invoke-virtual {v0, v3}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    invoke-static {v1}, Lsh/i;->f(Lsh/i;)I

    move-result v3

    const/16 v4, 0x8

    if-eq v3, v4, :cond_2

    const/16 v4, 0x10

    if-eq v3, v4, :cond_1

    const/16 v4, 0x20

    if-eq v3, v4, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1, v2, v0}, Lsh/i;->k(Lsh/i;ILjava/nio/ByteBuffer;)V

    goto :goto_0

    :cond_1
    invoke-static {v1, v2, v0}, Lsh/i;->j(Lsh/i;ILjava/nio/ByteBuffer;)V

    goto :goto_0

    :cond_2
    invoke-static {v1, v2, v0}, Lsh/i;->l(Lsh/i;ILjava/nio/ByteBuffer;)V

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    :cond_3
    invoke-static {p3}, Lsh/j;->a(Landroid/media/MediaCodec$BufferInfo;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lsh/i$a;->a:Lsh/i;

    invoke-virtual {p1}, Lsh/i;->z()V

    :cond_4
    return-void
.end method

.method public onOutputFormatChanged(Landroid/media/MediaCodec;Landroid/media/MediaFormat;)V
    .locals 4

    const-string v0, "codec"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "format"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lsh/i$a;->a:Lsh/i;

    const-string v0, "sample-rate"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-static {p1, v0}, Lsh/i;->q(Lsh/i;I)V

    iget-object p1, p0, Lsh/i$a;->a:Lsh/i;

    const-string v0, "channel-count"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result v0

    invoke-static {p1, v0}, Lsh/i;->m(Lsh/i;I)V

    iget-object p1, p0, Lsh/i$a;->a:Lsh/i;

    const-string v0, "pcm-encoding"

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->containsKey(Ljava/lang/String;)Z

    move-result v1

    const/16 v2, 0x10

    if-eqz v1, :cond_2

    invoke-virtual {p2, v0}, Landroid/media/MediaFormat;->getInteger(Ljava/lang/String;)I

    move-result p2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_2

    const/4 v0, 0x3

    if-eq p2, v0, :cond_1

    const/4 v0, 0x4

    if-eq p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/16 v2, 0x20

    goto :goto_0

    :cond_1
    const/16 v2, 0x8

    :cond_2
    :goto_0
    invoke-static {p1, v2}, Lsh/i;->o(Lsh/i;I)V

    iget-object p1, p0, Lsh/i$a;->a:Lsh/i;

    invoke-static {p1}, Lsh/i;->h(Lsh/i;)I

    move-result p2

    int-to-long v0, p2

    iget-object p2, p0, Lsh/i$a;->a:Lsh/i;

    invoke-static {p2}, Lsh/i;->a(Lsh/i;)J

    move-result-wide v2

    mul-long/2addr v0, v2

    const/16 p2, 0x3e8

    int-to-long v2, p2

    div-long/2addr v0, v2

    invoke-static {p1, v0, v1}, Lsh/i;->r(Lsh/i;J)V

    iget-object p1, p0, Lsh/i$a;->a:Lsh/i;

    invoke-static {p1}, Lsh/i;->i(Lsh/i;)J

    move-result-wide v0

    iget-object p2, p0, Lsh/i$a;->a:Lsh/i;

    invoke-static {p2}, Lsh/i;->b(Lsh/i;)I

    move-result p2

    int-to-long v2, p2

    div-long/2addr v0, v2

    invoke-static {p1, v0, v1}, Lsh/i;->p(Lsh/i;J)V

    return-void
.end method
