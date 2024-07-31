.class public final Le1/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/AutoCloseable;
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le1/d$d;,
        Le1/d$e;,
        Le1/d$c;
    }
.end annotation


# instance fields
.field private final A:Landroid/graphics/Rect;

.field private final B:Landroid/graphics/Rect;

.field private C:Ljava/nio/ByteBuffer;

.field private final D:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field private final E:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/nio/ByteBuffer;",
            ">;"
        }
    .end annotation
.end field

.field final F:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field G:Le1/d$e;

.field private H:Landroid/graphics/SurfaceTexture;

.field private I:Landroid/view/Surface;

.field private J:Landroid/view/Surface;

.field private K:Le1/b;

.field private L:Le1/a;

.field private M:I

.field private final N:[F

.field a:Landroid/media/MediaCodec;

.field final b:Le1/d$c;

.field private final c:Landroid/os/HandlerThread;

.field final d:Landroid/os/Handler;

.field private final e:I

.field final f:I

.field final r:I

.field final s:I

.field final t:I

.field final u:I

.field final v:I

.field private final w:I

.field final x:Z

.field private y:I

.field z:Z


# direct methods
.method public constructor <init>(IIZIILandroid/os/Handler;Le1/d$c;)V
    .locals 19

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p4

    move/from16 v4, p5

    const-string v5, "video/hevc"

    const-string v6, "image/vnd.android.heic"

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, v0, Le1/d;->D:Ljava/util/ArrayList;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, v0, Le1/d;->E:Ljava/util/ArrayList;

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    iput-object v7, v0, Le1/d;->F:Ljava/util/ArrayList;

    const/16 v7, 0x10

    new-array v7, v7, [F

    iput-object v7, v0, Le1/d;->N:[F

    if-ltz v1, :cond_16

    if-ltz v2, :cond_16

    if-ltz v3, :cond_16

    const/16 v7, 0x64

    if-gt v3, v7, :cond_16

    const/16 v7, 0x200

    const/4 v9, 0x1

    if-gt v1, v7, :cond_1

    if-le v2, v7, :cond_0

    goto :goto_0

    :cond_0
    const/4 v10, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    move v10, v9

    :goto_1
    and-int v10, p3, v10

    const/4 v11, 0x0

    :try_start_0
    invoke-static {v6}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v12

    iput-object v12, v0, Le1/d;->a:Landroid/media/MediaCodec;

    invoke-virtual {v12}, Landroid/media/MediaCodec;->getCodecInfo()Landroid/media/MediaCodecInfo;

    move-result-object v12

    invoke-virtual {v12, v6}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object v12

    invoke-virtual {v12}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v13

    invoke-virtual {v13, v1, v2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->isSizeSupported(II)Z

    move-result v13

    if-eqz v13, :cond_2

    move v13, v9

    goto :goto_2

    :cond_2
    iget-object v12, v0, Le1/d;->a:Landroid/media/MediaCodec;

    invoke-virtual {v12}, Landroid/media/MediaCodec;->release()V

    iput-object v11, v0, Le1/d;->a:Landroid/media/MediaCodec;

    new-instance v12, Ljava/lang/Exception;

    invoke-direct {v12}, Ljava/lang/Exception;-><init>()V

    throw v12
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-static {v5}, Landroid/media/MediaCodec;->createEncoderByType(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v12

    iput-object v12, v0, Le1/d;->a:Landroid/media/MediaCodec;

    invoke-virtual {v12}, Landroid/media/MediaCodec;->getCodecInfo()Landroid/media/MediaCodecInfo;

    move-result-object v12

    invoke-virtual {v12, v5}, Landroid/media/MediaCodecInfo;->getCapabilitiesForType(Ljava/lang/String;)Landroid/media/MediaCodecInfo$CodecCapabilities;

    move-result-object v12

    invoke-virtual {v12}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getVideoCapabilities()Landroid/media/MediaCodecInfo$VideoCapabilities;

    move-result-object v13

    invoke-virtual {v13, v1, v2}, Landroid/media/MediaCodecInfo$VideoCapabilities;->isSizeSupported(II)Z

    move-result v13

    xor-int/2addr v13, v9

    or-int/2addr v10, v13

    const/4 v13, 0x0

    :goto_2
    iput v4, v0, Le1/d;->e:I

    move-object/from16 v14, p7

    iput-object v14, v0, Le1/d;->b:Le1/d$c;

    if-eqz p6, :cond_3

    invoke-virtual/range {p6 .. p6}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v14

    goto :goto_3

    :cond_3
    move-object v14, v11

    :goto_3
    if-nez v14, :cond_4

    new-instance v14, Landroid/os/HandlerThread;

    const-string v15, "HeifEncoderThread"

    const/4 v8, -0x2

    invoke-direct {v14, v15, v8}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v14, v0, Le1/d;->c:Landroid/os/HandlerThread;

    invoke-virtual {v14}, Ljava/lang/Thread;->start()V

    invoke-virtual {v14}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v14

    goto :goto_4

    :cond_4
    iput-object v11, v0, Le1/d;->c:Landroid/os/HandlerThread;

    :goto_4
    new-instance v8, Landroid/os/Handler;

    invoke-direct {v8, v14}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v8, v0, Le1/d;->d:Landroid/os/Handler;

    const/4 v14, 0x2

    if-eq v4, v9, :cond_6

    if-ne v4, v14, :cond_5

    goto :goto_5

    :cond_5
    const/4 v15, 0x0

    goto :goto_6

    :cond_6
    :goto_5
    move v15, v9

    :goto_6
    if-eqz v15, :cond_7

    const v16, 0x7f000789

    goto :goto_7

    :cond_7
    const v16, 0x7f420888

    :goto_7
    move/from16 v11, v16

    iput v1, v0, Le1/d;->f:I

    iput v2, v0, Le1/d;->r:I

    iput-boolean v10, v0, Le1/d;->x:Z

    if-eqz v10, :cond_8

    add-int/lit16 v14, v2, 0x200

    sub-int/2addr v14, v9

    div-int/2addr v14, v7

    move/from16 v16, v14

    add-int/lit16 v14, v1, 0x200

    sub-int/2addr v14, v9

    div-int/2addr v14, v7

    move v9, v14

    move/from16 v4, v16

    move v14, v7

    goto :goto_8

    :cond_8
    move v7, v1

    move v14, v2

    move v4, v9

    :goto_8
    if-eqz v13, :cond_9

    invoke-static {v6, v1, v2}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v5

    goto :goto_9

    :cond_9
    invoke-static {v5, v7, v14}, Landroid/media/MediaFormat;->createVideoFormat(Ljava/lang/String;II)Landroid/media/MediaFormat;

    move-result-object v5

    :goto_9
    if-eqz v10, :cond_a

    const-string v6, "tile-width"

    invoke-virtual {v5, v6, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v6, "tile-height"

    invoke-virtual {v5, v6, v14}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v6, "grid-cols"

    invoke-virtual {v5, v6, v9}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v6, "grid-rows"

    invoke-virtual {v5, v6, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :cond_a
    if-eqz v13, :cond_b

    iput v1, v0, Le1/d;->s:I

    iput v2, v0, Le1/d;->t:I

    const/4 v4, 0x1

    iput v4, v0, Le1/d;->u:I

    iput v4, v0, Le1/d;->v:I

    goto :goto_a

    :cond_b
    iput v7, v0, Le1/d;->s:I

    iput v14, v0, Le1/d;->t:I

    iput v4, v0, Le1/d;->u:I

    iput v9, v0, Le1/d;->v:I

    :goto_a
    iget v4, v0, Le1/d;->u:I

    iget v6, v0, Le1/d;->v:I

    mul-int/2addr v4, v6

    iput v4, v0, Le1/d;->w:I

    const-string v6, "i-frame-interval"

    const/4 v7, 0x0

    invoke-virtual {v5, v6, v7}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v6, "color-format"

    invoke-virtual {v5, v6, v11}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    const-string v6, "frame-rate"

    invoke-virtual {v5, v6, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    mul-int/lit8 v4, v4, 0x1e

    const-string v6, "capture-rate"

    invoke-virtual {v5, v6, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    invoke-virtual {v12}, Landroid/media/MediaCodecInfo$CodecCapabilities;->getEncoderCapabilities()Landroid/media/MediaCodecInfo$EncoderCapabilities;

    move-result-object v4

    invoke-virtual {v4, v7}, Landroid/media/MediaCodecInfo$EncoderCapabilities;->isBitrateModeSupported(I)Z

    move-result v6

    const-wide/high16 v11, 0x4059000000000000L    # 100.0

    const-string v7, "bitrate-mode"

    const-string v9, "HeifEncoder"

    if-eqz v6, :cond_c

    const-string v6, "Setting bitrate mode to constant quality"

    invoke-static {v9, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v4}, Le1/c;->a(Landroid/media/MediaCodecInfo$EncoderCapabilities;)Landroid/util/Range;

    move-result-object v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Quality range: "

    invoke-virtual {v6, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v9, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v6, 0x0

    invoke-virtual {v5, v7, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    invoke-virtual {v4}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    int-to-double v6, v6

    invoke-virtual {v4}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-virtual {v4}, Landroid/util/Range;->getLower()Ljava/lang/Comparable;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    sub-int/2addr v9, v4

    mul-int/2addr v9, v3

    int-to-double v3, v9

    div-double/2addr v3, v11

    add-double/2addr v6, v3

    double-to-int v3, v6

    const-string v4, "quality"

    :goto_b
    invoke-virtual {v5, v4, v3}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    goto :goto_d

    :cond_c
    const/4 v6, 0x2

    invoke-virtual {v4, v6}, Landroid/media/MediaCodecInfo$EncoderCapabilities;->isBitrateModeSupported(I)Z

    move-result v4

    if-eqz v4, :cond_d

    const-string v4, "Setting bitrate mode to constant bitrate"

    invoke-static {v9, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v5, v7, v6}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    goto :goto_c

    :cond_d
    const-string v4, "Setting bitrate mode to variable bitrate"

    invoke-static {v9, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v4, 0x1

    invoke-virtual {v5, v7, v4}, Landroid/media/MediaFormat;->setInteger(Ljava/lang/String;I)V

    :goto_c
    mul-int v4, v1, v2

    int-to-double v6, v4

    const-wide/high16 v17, 0x3ff8000000000000L    # 1.5

    mul-double v6, v6, v17

    const-wide/high16 v17, 0x4020000000000000L    # 8.0

    mul-double v6, v6, v17

    const-wide/high16 v17, 0x3fd0000000000000L    # 0.25

    mul-double v6, v6, v17

    int-to-double v3, v3

    mul-double/2addr v6, v3

    div-double/2addr v6, v11

    double-to-int v3, v6

    const-string v4, "bitrate"

    goto :goto_b

    :goto_d
    iget-object v3, v0, Le1/d;->a:Landroid/media/MediaCodec;

    new-instance v4, Le1/d$d;

    invoke-direct {v4, v0}, Le1/d$d;-><init>(Le1/d;)V

    invoke-virtual {v3, v4, v8}, Landroid/media/MediaCodec;->setCallback(Landroid/media/MediaCodec$Callback;Landroid/os/Handler;)V

    iget-object v3, v0, Le1/d;->a:Landroid/media/MediaCodec;

    const/4 v4, 0x0

    const/4 v6, 0x1

    invoke-virtual {v3, v5, v4, v4, v6}, Landroid/media/MediaCodec;->configure(Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V

    if-eqz v15, :cond_14

    iget-object v3, v0, Le1/d;->a:Landroid/media/MediaCodec;

    invoke-virtual {v3}, Landroid/media/MediaCodec;->createInputSurface()Landroid/view/Surface;

    move-result-object v3

    iput-object v3, v0, Le1/d;->J:Landroid/view/Surface;

    if-eqz v10, :cond_f

    if-eqz v13, :cond_e

    goto :goto_e

    :cond_e
    move/from16 v3, p5

    goto :goto_f

    :cond_f
    :goto_e
    move/from16 v3, p5

    const/4 v4, 0x2

    if-ne v3, v4, :cond_10

    :goto_f
    const/4 v4, 0x1

    goto :goto_10

    :cond_10
    const/4 v4, 0x0

    :goto_10
    new-instance v5, Le1/d$e;

    invoke-direct {v5, v0, v4}, Le1/d$e;-><init>(Le1/d;Z)V

    iput-object v5, v0, Le1/d;->G:Le1/d$e;

    if-eqz v4, :cond_13

    new-instance v4, Le1/b;

    iget-object v5, v0, Le1/d;->J:Landroid/view/Surface;

    invoke-direct {v4, v5}, Le1/b;-><init>(Landroid/view/Surface;)V

    iput-object v4, v0, Le1/d;->K:Le1/b;

    invoke-virtual {v4}, Le1/b;->f()V

    new-instance v4, Le1/a;

    new-instance v5, Le1/f;

    const/4 v6, 0x2

    if-ne v3, v6, :cond_11

    const/4 v6, 0x0

    goto :goto_11

    :cond_11
    const/4 v6, 0x1

    :goto_11
    invoke-direct {v5, v6}, Le1/f;-><init>(I)V

    invoke-direct {v4, v5, v1, v2}, Le1/a;-><init>(Le1/f;II)V

    iput-object v4, v0, Le1/d;->L:Le1/a;

    invoke-virtual {v4}, Le1/a;->c()I

    move-result v4

    iput v4, v0, Le1/d;->M:I

    const/4 v4, 0x1

    if-ne v3, v4, :cond_12

    new-instance v3, Landroid/graphics/SurfaceTexture;

    iget v5, v0, Le1/d;->M:I

    invoke-direct {v3, v5, v4}, Landroid/graphics/SurfaceTexture;-><init>(IZ)V

    iput-object v3, v0, Le1/d;->H:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v3, v0}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    iget-object v3, v0, Le1/d;->H:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v3, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v1, Landroid/view/Surface;

    iget-object v2, v0, Le1/d;->H:Landroid/graphics/SurfaceTexture;

    invoke-direct {v1, v2}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iput-object v1, v0, Le1/d;->I:Landroid/view/Surface;

    :cond_12
    iget-object v1, v0, Le1/d;->K:Le1/b;

    invoke-virtual {v1}, Le1/b;->g()V

    goto :goto_13

    :cond_13
    iget-object v1, v0, Le1/d;->J:Landroid/view/Surface;

    iput-object v1, v0, Le1/d;->I:Landroid/view/Surface;

    goto :goto_13

    :cond_14
    const/4 v1, 0x2

    const/4 v7, 0x0

    :goto_12
    if-ge v7, v1, :cond_15

    iget-object v2, v0, Le1/d;->D:Ljava/util/ArrayList;

    iget v3, v0, Le1/d;->f:I

    iget v4, v0, Le1/d;->r:I

    mul-int/2addr v3, v4

    mul-int/lit8 v3, v3, 0x3

    div-int/2addr v3, v1

    invoke-static {v3}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_12

    :cond_15
    :goto_13
    new-instance v1, Landroid/graphics/Rect;

    iget v2, v0, Le1/d;->s:I

    iget v3, v0, Le1/d;->t:I

    const/4 v4, 0x0

    invoke-direct {v1, v4, v4, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    iput-object v1, v0, Le1/d;->B:Landroid/graphics/Rect;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, v0, Le1/d;->A:Landroid/graphics/Rect;

    return-void

    :cond_16
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "invalid encoder inputs"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private a()Ljava/nio/ByteBuffer;
    .locals 3

    iget-object v0, p0, Le1/d;->D:Ljava/util/ArrayList;

    monitor-enter v0

    :catch_0
    :goto_0
    :try_start_0
    iget-boolean v1, p0, Le1/d;->z:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Le1/d;->D:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    :try_start_1
    iget-object v1, p0, Le1/d;->D:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/lang/Object;->wait()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_0
    :try_start_2
    iget-boolean v1, p0, Le1/d;->z:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    iget-object v1, p0, Le1/d;->D:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/nio/ByteBuffer;

    :goto_1
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1
.end method

.method private e([B)V
    .locals 2

    invoke-direct {p0}, Le1/d;->a()Ljava/nio/ByteBuffer;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->clear()Ljava/nio/Buffer;

    if-eqz p1, :cond_1

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :cond_1
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    iget-object p1, p0, Le1/d;->E:Ljava/util/ArrayList;

    monitor-enter p1

    :try_start_0
    iget-object v1, p0, Le1/d;->E:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Le1/d;->d:Landroid/os/Handler;

    new-instance v0, Le1/d$a;

    invoke-direct {v0, p0}, Le1/d$a;-><init>(Le1/d;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private f(I)J
    .locals 4

    int-to-long v0, p1

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    iget p1, p0, Le1/d;->w:I

    int-to-long v2, p1

    div-long/2addr v0, v2

    const-wide/16 v2, 0x84

    add-long/2addr v0, v2

    return-wide v0
.end method

.method private static g(Ljava/nio/ByteBuffer;Landroid/media/Image;IILandroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 17

    move-object/from16 v0, p4

    move-object/from16 v1, p5

    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual/range {p5 .. p5}, Landroid/graphics/Rect;->width()I

    move-result v3

    if-ne v2, v3, :cond_6

    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-virtual/range {p5 .. p5}, Landroid/graphics/Rect;->height()I

    move-result v3

    if-ne v2, v3, :cond_6

    rem-int/lit8 v2, p2, 0x2

    if-nez v2, :cond_5

    rem-int/lit8 v2, p3, 0x2

    if-nez v2, :cond_5

    iget v2, v0, Landroid/graphics/Rect;->left:I

    const/4 v3, 0x2

    rem-int/2addr v2, v3

    if-nez v2, :cond_5

    iget v2, v0, Landroid/graphics/Rect;->top:I

    rem-int/2addr v2, v3

    if-nez v2, :cond_5

    iget v2, v0, Landroid/graphics/Rect;->right:I

    rem-int/2addr v2, v3

    if-nez v2, :cond_5

    iget v2, v0, Landroid/graphics/Rect;->bottom:I

    rem-int/2addr v2, v3

    if-nez v2, :cond_5

    iget v2, v1, Landroid/graphics/Rect;->left:I

    rem-int/2addr v2, v3

    if-nez v2, :cond_5

    iget v2, v1, Landroid/graphics/Rect;->top:I

    rem-int/2addr v2, v3

    if-nez v2, :cond_5

    iget v2, v1, Landroid/graphics/Rect;->right:I

    rem-int/2addr v2, v3

    if-nez v2, :cond_5

    iget v2, v1, Landroid/graphics/Rect;->bottom:I

    rem-int/2addr v2, v3

    if-nez v2, :cond_5

    invoke-virtual/range {p1 .. p1}, Landroid/media/Image;->getPlanes()[Landroid/media/Image$Plane;

    move-result-object v2

    const/4 v5, 0x0

    :goto_0
    array-length v6, v2

    if-ge v5, v6, :cond_4

    aget-object v6, v2, v5

    invoke-virtual {v6}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    move-result-object v6

    aget-object v7, v2, v5

    invoke-virtual {v7}, Landroid/media/Image$Plane;->getPixelStride()I

    move-result v7

    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Rect;->width()I

    move-result v8

    iget v9, v0, Landroid/graphics/Rect;->left:I

    sub-int v9, p2, v9

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    invoke-virtual/range {p4 .. p4}, Landroid/graphics/Rect;->height()I

    move-result v9

    iget v10, v0, Landroid/graphics/Rect;->top:I

    sub-int v10, p3, v10

    invoke-static {v9, v10}, Ljava/lang/Math;->min(II)I

    move-result v9

    const/4 v10, 0x1

    if-lez v5, :cond_0

    mul-int v11, p2, p3

    add-int/lit8 v12, v5, 0x3

    mul-int/2addr v11, v12

    div-int/lit8 v11, v11, 0x4

    move v12, v3

    goto :goto_1

    :cond_0
    move v12, v10

    const/4 v11, 0x0

    :goto_1
    const/4 v13, 0x0

    :goto_2
    div-int v14, v9, v12

    if-ge v13, v14, :cond_3

    iget v14, v0, Landroid/graphics/Rect;->top:I

    div-int/2addr v14, v12

    add-int/2addr v14, v13

    mul-int v14, v14, p2

    div-int/2addr v14, v12

    add-int/2addr v14, v11

    iget v15, v0, Landroid/graphics/Rect;->left:I

    div-int/2addr v15, v12

    add-int/2addr v14, v15

    move-object/from16 v15, p0

    invoke-virtual {v15, v14}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget v14, v1, Landroid/graphics/Rect;->top:I

    div-int/2addr v14, v12

    add-int/2addr v14, v13

    aget-object v16, v2, v5

    invoke-virtual/range {v16 .. v16}, Landroid/media/Image$Plane;->getRowStride()I

    move-result v16

    mul-int v14, v14, v16

    iget v3, v1, Landroid/graphics/Rect;->left:I

    mul-int/2addr v3, v7

    div-int/2addr v3, v12

    add-int/2addr v14, v3

    invoke-virtual {v6, v14}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    const/4 v3, 0x0

    :goto_3
    div-int v14, v8, v12

    if-ge v3, v14, :cond_2

    invoke-virtual/range {p0 .. p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v4

    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    if-le v7, v10, :cond_1

    add-int/lit8 v14, v14, -0x1

    if-eq v3, v14, :cond_1

    invoke-virtual {v6}, Ljava/nio/Buffer;->position()I

    move-result v4

    add-int/2addr v4, v7

    sub-int/2addr v4, v10

    invoke-virtual {v6, v4}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_2
    add-int/lit8 v13, v13, 0x1

    const/4 v3, 0x2

    goto :goto_2

    :cond_3
    move-object/from16 v15, p0

    add-int/lit8 v5, v5, 0x1

    const/4 v3, 0x2

    goto/16 :goto_0

    :cond_4
    return-void

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "src or dst are not aligned!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "src and dst rect size are different!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private i()V
    .locals 8

    iget v0, p0, Le1/d;->s:I

    iget v1, p0, Le1/d;->t:I

    const/4 v2, 0x0

    invoke-static {v2, v2, v0, v1}, Landroid/opengl/GLES20;->glViewport(IIII)V

    move v0, v2

    :goto_0
    iget v1, p0, Le1/d;->u:I

    if-ge v0, v1, :cond_1

    move v1, v2

    :goto_1
    iget v3, p0, Le1/d;->v:I

    if-ge v1, v3, :cond_0

    iget v3, p0, Le1/d;->s:I

    mul-int v4, v1, v3

    iget v5, p0, Le1/d;->t:I

    mul-int v6, v0, v5

    iget-object v7, p0, Le1/d;->A:Landroid/graphics/Rect;

    add-int/2addr v3, v4

    add-int/2addr v5, v6

    invoke-virtual {v7, v4, v6, v3, v5}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v3, p0, Le1/d;->L:Le1/a;

    iget v4, p0, Le1/d;->M:I

    sget-object v5, Le1/f;->i:[F

    iget-object v6, p0, Le1/d;->A:Landroid/graphics/Rect;

    invoke-virtual {v3, v4, v5, v6}, Le1/a;->a(I[FLandroid/graphics/Rect;)V

    iget-object v3, p0, Le1/d;->K:Le1/b;

    iget v4, p0, Le1/d;->y:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Le1/d;->y:I

    invoke-direct {p0, v4}, Le1/d;->f(I)J

    move-result-wide v4

    const-wide/16 v6, 0x3e8

    mul-long/2addr v4, v6

    invoke-virtual {v3, v4, v5}, Le1/b;->i(J)V

    iget-object v3, p0, Le1/d;->K:Le1/b;

    invoke-virtual {v3}, Le1/b;->j()Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private j()Ljava/nio/ByteBuffer;
    .locals 4

    iget-boolean v0, p0, Le1/d;->z:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Le1/d;->C:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_1

    iget-object v0, p0, Le1/d;->E:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Le1/d;->E:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v2, v1

    goto :goto_0

    :cond_0
    iget-object v2, p0, Le1/d;->E:Ljava/util/ArrayList;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/nio/ByteBuffer;

    :goto_0
    iput-object v2, p0, Le1/d;->C:Ljava/nio/ByteBuffer;

    monitor-exit v0

    goto :goto_1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    :cond_1
    :goto_1
    iget-boolean v0, p0, Le1/d;->z:Z

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    iget-object v1, p0, Le1/d;->C:Ljava/nio/ByteBuffer;

    :goto_2
    return-object v1
.end method

.method private n(Z)V
    .locals 2

    iget-object v0, p0, Le1/d;->D:Ljava/util/ArrayList;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Le1/d;->z:Z

    or-int/2addr p1, v1

    iput-boolean p1, p0, Le1/d;->z:Z

    iget-object p1, p0, Le1/d;->D:Ljava/util/ArrayList;

    iget-object v1, p0, Le1/d;->C:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Le1/d;->D:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p1, 0x0

    iput-object p1, p0, Le1/d;->C:Ljava/nio/ByteBuffer;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public b(Landroid/graphics/Bitmap;)V
    .locals 5

    iget v0, p0, Le1/d;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Le1/d;->G:Le1/d$e;

    iget v1, p0, Le1/d;->y:I

    invoke-direct {p0, v1}, Le1/d;->f(I)J

    move-result-wide v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    iget v3, p0, Le1/d;->y:I

    iget v4, p0, Le1/d;->w:I

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x1

    invoke-direct {p0, v3}, Le1/d;->f(I)J

    move-result-wide v3

    invoke-virtual {v0, v1, v2, v3, v4}, Le1/d$e;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le1/d;->K:Le1/b;

    if-nez v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    invoke-virtual {v0}, Le1/b;->f()V

    iget-object v0, p0, Le1/d;->L:Le1/a;

    iget v1, p0, Le1/d;->M:I

    invoke-virtual {v0, v1, p1}, Le1/a;->d(ILandroid/graphics/Bitmap;)V

    invoke-direct {p0}, Le1/d;->i()V

    iget-object p1, p0, Le1/d;->K:Le1/b;

    invoke-virtual {p1}, Le1/b;->g()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "addBitmap is only allowed in bitmap input mode"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Le1/d;->D:Ljava/util/ArrayList;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Le1/d;->z:Z

    iget-object v1, p0, Le1/d;->D:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Le1/d;->d:Landroid/os/Handler;

    new-instance v1, Le1/d$b;

    invoke-direct {v1, p0}, Le1/d$b;-><init>(Le1/d;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method l()V
    .locals 15

    :cond_0
    :goto_0
    invoke-direct {p0}, Le1/d;->j()Ljava/nio/ByteBuffer;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, Le1/d;->F:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_6

    iget-object v1, p0, Le1/d;->F:Ljava/util/ArrayList;

    const/4 v6, 0x0

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget v1, p0, Le1/d;->y:I

    iget v2, p0, Le1/d;->w:I

    rem-int/2addr v1, v2

    if-nez v1, :cond_1

    invoke-virtual {v0}, Ljava/nio/Buffer;->remaining()I

    move-result v1

    if-nez v1, :cond_1

    const/4 v1, 0x1

    move v14, v1

    goto :goto_1

    :cond_1
    move v14, v6

    :goto_1
    if-nez v14, :cond_2

    iget-object v1, p0, Le1/d;->a:Landroid/media/MediaCodec;

    invoke-virtual {v1, v8}, Landroid/media/MediaCodec;->getInputImage(I)Landroid/media/Image;

    move-result-object v1

    iget v2, p0, Le1/d;->s:I

    iget v3, p0, Le1/d;->y:I

    iget v4, p0, Le1/d;->v:I

    rem-int v5, v3, v4

    mul-int/2addr v5, v2

    iget v7, p0, Le1/d;->t:I

    div-int/2addr v3, v4

    iget v4, p0, Le1/d;->u:I

    rem-int/2addr v3, v4

    mul-int/2addr v3, v7

    iget-object v4, p0, Le1/d;->A:Landroid/graphics/Rect;

    add-int/2addr v2, v5

    add-int/2addr v7, v3

    invoke-virtual {v4, v5, v3, v2, v7}, Landroid/graphics/Rect;->set(IIII)V

    iget v2, p0, Le1/d;->f:I

    iget v3, p0, Le1/d;->r:I

    iget-object v4, p0, Le1/d;->A:Landroid/graphics/Rect;

    iget-object v5, p0, Le1/d;->B:Landroid/graphics/Rect;

    invoke-static/range {v0 .. v5}, Le1/d;->g(Ljava/nio/ByteBuffer;Landroid/media/Image;IILandroid/graphics/Rect;Landroid/graphics/Rect;)V

    :cond_2
    iget-object v7, p0, Le1/d;->a:Landroid/media/MediaCodec;

    const/4 v9, 0x0

    if-eqz v14, :cond_3

    move v10, v6

    goto :goto_2

    :cond_3
    invoke-virtual {v7, v8}, Landroid/media/MediaCodec;->getInputBuffer(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    move-result v0

    move v10, v0

    :goto_2
    iget v0, p0, Le1/d;->y:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Le1/d;->y:I

    invoke-direct {p0, v0}, Le1/d;->f(I)J

    move-result-wide v11

    if-eqz v14, :cond_4

    const/4 v6, 0x4

    :cond_4
    move v13, v6

    invoke-virtual/range {v7 .. v13}, Landroid/media/MediaCodec;->queueInputBuffer(IIIJI)V

    if-nez v14, :cond_5

    iget v0, p0, Le1/d;->y:I

    iget v1, p0, Le1/d;->w:I

    rem-int/2addr v0, v1

    if-nez v0, :cond_0

    :cond_5
    invoke-direct {p0, v14}, Le1/d;->n(Z)V

    goto/16 :goto_0

    :cond_6
    return-void
.end method

.method public o()V
    .locals 1

    iget-object v0, p0, Le1/d;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->start()V

    return-void
.end method

.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Le1/d;->K:Le1/b;

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    invoke-virtual {v0}, Le1/b;->f()V

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    iget-object v0, p0, Le1/d;->N:[F

    invoke-virtual {p1, v0}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->getTimestamp()J

    move-result-wide v0

    iget-object v2, p0, Le1/d;->G:Le1/d$e;

    iget v3, p0, Le1/d;->y:I

    iget v4, p0, Le1/d;->w:I

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x1

    invoke-direct {p0, v3}, Le1/d;->f(I)J

    move-result-wide v3

    invoke-virtual {v2, v0, v1, v3, v4}, Le1/d$e;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Le1/d;->i()V

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->releaseTexImage()V

    iget-object p1, p0, Le1/d;->K:Le1/b;

    invoke-virtual {p1}, Le1/b;->g()V

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public q()V
    .locals 3

    iget v0, p0, Le1/d;->e:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Le1/d;->G:Le1/d$e;

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Le1/d$e;->c(J)V

    goto :goto_0

    :cond_0
    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Le1/d;->e([B)V

    :cond_1
    :goto_0
    return-void
.end method

.method r()V
    .locals 3

    iget-object v0, p0, Le1/d;->a:Landroid/media/MediaCodec;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/media/MediaCodec;->stop()V

    iget-object v0, p0, Le1/d;->a:Landroid/media/MediaCodec;

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    iput-object v1, p0, Le1/d;->a:Landroid/media/MediaCodec;

    :cond_0
    iget-object v0, p0, Le1/d;->D:Ljava/util/ArrayList;

    monitor-enter v0

    const/4 v2, 0x1

    :try_start_0
    iput-boolean v2, p0, Le1/d;->z:Z

    iget-object v2, p0, Le1/d;->D:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/lang/Object;->notifyAll()V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-enter p0

    :try_start_1
    iget-object v0, p0, Le1/d;->L:Le1/a;

    if-eqz v0, :cond_1

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Le1/a;->e(Z)V

    iput-object v1, p0, Le1/d;->L:Le1/a;

    :cond_1
    iget-object v0, p0, Le1/d;->K:Le1/b;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Le1/b;->h()V

    iput-object v1, p0, Le1/d;->K:Le1/b;

    :cond_2
    iget-object v0, p0, Le1/d;->H:Landroid/graphics/SurfaceTexture;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->release()V

    iput-object v1, p0, Le1/d;->H:Landroid/graphics/SurfaceTexture;

    :cond_3
    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :catchall_1
    move-exception v1

    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1
.end method
