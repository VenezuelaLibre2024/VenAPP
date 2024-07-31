.class final Lk7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk7/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk7/b$b;
    }
.end annotation


# instance fields
.field private final a:Landroid/media/MediaCodec;

.field private final b:Lk7/g;

.field private final c:Lk7/e;

.field private final d:Z

.field private e:Z

.field private f:I


# direct methods
.method private constructor <init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Landroid/os/HandlerThread;Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    new-instance v0, Lk7/g;

    invoke-direct {v0, p2}, Lk7/g;-><init>(Landroid/os/HandlerThread;)V

    iput-object v0, p0, Lk7/b;->b:Lk7/g;

    new-instance p2, Lk7/e;

    invoke-direct {p2, p1, p3}, Lk7/e;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;)V

    iput-object p2, p0, Lk7/b;->c:Lk7/e;

    iput-boolean p4, p0, Lk7/b;->d:Z

    const/4 p1, 0x0

    iput p1, p0, Lk7/b;->f:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Landroid/os/HandlerThread;ZLk7/b$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lk7/b;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Landroid/os/HandlerThread;Z)V

    return-void
.end method

.method public static synthetic o(Lk7/b;Lk7/l$c;Landroid/media/MediaCodec;JJ)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Lk7/b;->w(Lk7/l$c;Landroid/media/MediaCodec;JJ)V

    return-void
.end method

.method static synthetic p(Lk7/b;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lk7/b;->v(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    return-void
.end method

.method static synthetic q(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lk7/b;->t(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic r(I)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lk7/b;->s(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static s(I)Ljava/lang/String;
    .locals 1

    const-string v0, "ExoPlayer:MediaCodecAsyncAdapter:"

    invoke-static {p0, v0}, Lk7/b;->u(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static t(I)Ljava/lang/String;
    .locals 1

    const-string v0, "ExoPlayer:MediaCodecQueueingThread:"

    invoke-static {p0, v0}, Lk7/b;->u(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static u(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x1

    if-ne p0, p1, :cond_0

    const-string p0, "Audio"

    :goto_0
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const/4 p1, 0x2

    if-ne p0, p1, :cond_1

    const-string p0, "Video"

    goto :goto_0

    :cond_1
    const-string p1, "Unknown("

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, ")"

    goto :goto_0

    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private v(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    .locals 2

    iget-object v0, p0, Lk7/b;->b:Lk7/g;

    iget-object v1, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, v1}, Lk7/g;->h(Landroid/media/MediaCodec;)V

    const-string v0, "configureCodec"

    invoke-static {v0}, Lt8/o0;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    invoke-static {}, Lt8/o0;->c()V

    iget-object p1, p0, Lk7/b;->c:Lk7/e;

    invoke-virtual {p1}, Lk7/e;->q()V

    const-string p1, "startCodec"

    invoke-static {p1}, Lt8/o0;->a(Ljava/lang/String;)V

    iget-object p1, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    invoke-virtual {p1}, Landroid/media/MediaCodec;->start()V

    invoke-static {}, Lt8/o0;->c()V

    const/4 p1, 0x1

    iput p1, p0, Lk7/b;->f:I

    return-void
.end method

.method private synthetic w(Lk7/l$c;Landroid/media/MediaCodec;JJ)V
    .locals 6

    move-object v0, p1

    move-object v1, p0

    move-wide v2, p3

    move-wide v4, p5

    invoke-interface/range {v0 .. v5}, Lk7/l$c;->a(Lk7/l;JJ)V

    return-void
.end method

.method private x()V
    .locals 2

    iget-boolean v0, p0, Lk7/b;->d:Z

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lk7/b;->c:Lk7/e;

    invoke-virtual {v0}, Lk7/e;->r()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->interrupt()V

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    :goto_0
    return-void
.end method


# virtual methods
.method public a()Landroid/media/MediaFormat;
    .locals 1

    iget-object v0, p0, Lk7/b;->b:Lk7/g;

    invoke-virtual {v0}, Lk7/g;->g()Landroid/media/MediaFormat;

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 1

    invoke-direct {p0}, Lk7/b;->x()V

    iget-object v0, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setVideoScalingMode(I)V

    return-void
.end method

.method public c(I)Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public d(Landroid/view/Surface;)V
    .locals 1

    invoke-direct {p0}, Lk7/b;->x()V

    iget-object v0, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setOutputSurface(Landroid/view/Surface;)V

    return-void
.end method

.method public e(IIIJI)V
    .locals 7

    iget-object v0, p0, Lk7/b;->c:Lk7/e;

    move v1, p1

    move v2, p2

    move v3, p3

    move-wide v4, p4

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lk7/e;->m(IIIJI)V

    return-void
.end method

.method public f(IILw6/c;JI)V
    .locals 7

    iget-object v0, p0, Lk7/b;->c:Lk7/e;

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-wide v4, p4

    move v6, p6

    invoke-virtual/range {v0 .. v6}, Lk7/e;->n(IILw6/c;JI)V

    return-void
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lk7/b;->c:Lk7/e;

    invoke-virtual {v0}, Lk7/e;->i()V

    iget-object v0, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->flush()V

    iget-object v0, p0, Lk7/b;->b:Lk7/g;

    invoke-virtual {v0}, Lk7/g;->e()V

    iget-object v0, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    return-void
.end method

.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public h(Lk7/l$c;Landroid/os/Handler;)V
    .locals 2

    invoke-direct {p0}, Lk7/b;->x()V

    iget-object v0, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    new-instance v1, Lk7/a;

    invoke-direct {v1, p0, p1}, Lk7/a;-><init>(Lk7/b;Lk7/l$c;)V

    invoke-virtual {v0, v1, p2}, Landroid/media/MediaCodec;->setOnFrameRenderedListener(Landroid/media/MediaCodec$OnFrameRenderedListener;Landroid/os/Handler;)V

    return-void
.end method

.method public i(Landroid/os/Bundle;)V
    .locals 1

    invoke-direct {p0}, Lk7/b;->x()V

    iget-object v0, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->setParameters(Landroid/os/Bundle;)V

    return-void
.end method

.method public j(IJ)V
    .locals 1

    iget-object v0, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2, p3}, Landroid/media/MediaCodec;->releaseOutputBuffer(IJ)V

    return-void
.end method

.method public k()I
    .locals 1

    iget-object v0, p0, Lk7/b;->c:Lk7/e;

    invoke-virtual {v0}, Lk7/e;->l()V

    iget-object v0, p0, Lk7/b;->b:Lk7/g;

    invoke-virtual {v0}, Lk7/g;->c()I

    move-result v0

    return v0
.end method

.method public l(Landroid/media/MediaCodec$BufferInfo;)I
    .locals 1

    iget-object v0, p0, Lk7/b;->c:Lk7/e;

    invoke-virtual {v0}, Lk7/e;->l()V

    iget-object v0, p0, Lk7/b;->b:Lk7/g;

    invoke-virtual {v0, p1}, Lk7/g;->d(Landroid/media/MediaCodec$BufferInfo;)I

    move-result p1

    return p1
.end method

.method public m(IZ)V
    .locals 1

    iget-object v0, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1, p2}, Landroid/media/MediaCodec;->releaseOutputBuffer(IZ)V

    return-void
.end method

.method public n(I)Ljava/nio/ByteBuffer;
    .locals 1

    iget-object v0, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0, p1}, Landroid/media/MediaCodec;->getOutputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    return-object p1
.end method

.method public release()V
    .locals 3

    const/4 v0, 0x1

    :try_start_0
    iget v1, p0, Lk7/b;->f:I

    if-ne v1, v0, :cond_0

    iget-object v1, p0, Lk7/b;->c:Lk7/e;

    invoke-virtual {v1}, Lk7/e;->p()V

    iget-object v1, p0, Lk7/b;->b:Lk7/g;

    invoke-virtual {v1}, Lk7/g;->o()V

    :cond_0
    const/4 v1, 0x2

    iput v1, p0, Lk7/b;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v1, p0, Lk7/b;->e:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    invoke-virtual {v1}, Landroid/media/MediaCodec;->release()V

    iput-boolean v0, p0, Lk7/b;->e:Z

    :cond_1
    return-void

    :catchall_0
    move-exception v1

    iget-boolean v2, p0, Lk7/b;->e:Z

    if-nez v2, :cond_2

    iget-object v2, p0, Lk7/b;->a:Landroid/media/MediaCodec;

    invoke-virtual {v2}, Landroid/media/MediaCodec;->release()V

    iput-boolean v0, p0, Lk7/b;->e:Z

    :cond_2
    throw v1
.end method
