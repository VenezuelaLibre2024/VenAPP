.class abstract Landroidx/camera/core/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/g1$a;


# instance fields
.field private a:Landroidx/camera/core/f$a;

.field private volatile b:I

.field private volatile c:I

.field private volatile d:I

.field private volatile e:Z

.field private volatile f:Z

.field private g:Ljava/util/concurrent/Executor;

.field private h:Landroidx/camera/core/t;

.field private i:Landroid/media/ImageWriter;

.field private j:Landroid/graphics/Rect;

.field private k:Landroid/graphics/Rect;

.field private l:Landroid/graphics/Matrix;

.field private m:Landroid/graphics/Matrix;

.field n:Ljava/nio/ByteBuffer;

.field o:Ljava/nio/ByteBuffer;

.field p:Ljava/nio/ByteBuffer;

.field q:Ljava/nio/ByteBuffer;

.field private final r:Ljava/lang/Object;

.field protected s:Z


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Landroidx/camera/core/i;->d:I

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/camera/core/i;->j:Landroid/graphics/Rect;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/camera/core/i;->k:Landroid/graphics/Rect;

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Landroidx/camera/core/i;->l:Landroid/graphics/Matrix;

    new-instance v1, Landroid/graphics/Matrix;

    invoke-direct {v1}, Landroid/graphics/Matrix;-><init>()V

    iput-object v1, p0, Landroidx/camera/core/i;->m:Landroid/graphics/Matrix;

    new-instance v1, Ljava/lang/Object;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    iput-object v1, p0, Landroidx/camera/core/i;->r:Ljava/lang/Object;

    iput-boolean v0, p0, Landroidx/camera/core/i;->s:Z

    return-void
.end method

.method public static synthetic b(Landroidx/camera/core/i;Ljava/util/concurrent/Executor;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/f$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct/range {p0 .. p7}, Landroidx/camera/core/i;->n(Ljava/util/concurrent/Executor;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/f$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/camera/core/i;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/f$a;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct/range {p0 .. p6}, Landroidx/camera/core/i;->m(Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/f$a;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method private h(Landroidx/camera/core/o;)V
    .locals 3

    iget v0, p0, Landroidx/camera/core/i;->d:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Landroidx/camera/core/i;->o:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_0

    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    move-result v0

    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    move-result v1

    mul-int/2addr v0, v1

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/i;->o:Ljava/nio/ByteBuffer;

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/i;->o:Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, p0, Landroidx/camera/core/i;->p:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_1

    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    move-result v0

    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    move-result v2

    mul-int/2addr v0, v2

    div-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/i;->p:Ljava/nio/ByteBuffer;

    :cond_1
    iget-object v0, p0, Landroidx/camera/core/i;->p:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, p0, Landroidx/camera/core/i;->q:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_2

    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    move-result v0

    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    move-result p1

    mul-int/2addr v0, p1

    div-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/i;->q:Ljava/nio/ByteBuffer;

    :cond_2
    iget-object p1, p0, Landroidx/camera/core/i;->q:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    goto :goto_0

    :cond_3
    iget v0, p0, Landroidx/camera/core/i;->d:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_4

    iget-object v0, p0, Landroidx/camera/core/i;->n:Ljava/nio/ByteBuffer;

    if-nez v0, :cond_4

    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    move-result v0

    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    move-result p1

    mul-int/2addr v0, p1

    mul-int/lit8 v0, v0, 0x4

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocateDirect(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/i;->n:Ljava/nio/ByteBuffer;

    :cond_4
    :goto_0
    return-void
.end method

.method private static i(IIIII)Landroidx/camera/core/t;
    .locals 1

    const/16 v0, 0x5a

    if-eq p2, v0, :cond_1

    const/16 v0, 0x10e

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    :goto_1
    if-eqz p2, :cond_2

    move v0, p1

    goto :goto_2

    :cond_2
    move v0, p0

    :goto_2
    if-eqz p2, :cond_3

    goto :goto_3

    :cond_3
    move p0, p1

    :goto_3
    new-instance p1, Landroidx/camera/core/t;

    invoke-static {v0, p0, p3, p4}, Landroidx/camera/core/p;->a(IIII)Landroidx/camera/core/impl/g1;

    move-result-object p0

    invoke-direct {p1, p0}, Landroidx/camera/core/t;-><init>(Landroidx/camera/core/impl/g1;)V

    return-object p1
.end method

.method static k(IIIII)Landroid/graphics/Matrix;
    .locals 3

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    if-lez p4, :cond_0

    new-instance v1, Landroid/graphics/RectF;

    int-to-float p0, p0

    int-to-float p1, p1

    const/4 v2, 0x0

    invoke-direct {v1, v2, v2, p0, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    sget-object p0, Landroidx/camera/core/impl/utils/r;->a:Landroid/graphics/RectF;

    sget-object p1, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v0, v1, p0, p1}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    int-to-float p0, p4

    invoke-virtual {v0, p0}, Landroid/graphics/Matrix;->postRotate(F)Z

    new-instance p0, Landroid/graphics/RectF;

    int-to-float p1, p2

    int-to-float p2, p3

    invoke-direct {p0, v2, v2, p1, p2}, Landroid/graphics/RectF;-><init>(FFFF)V

    invoke-static {p0}, Landroidx/camera/core/impl/utils/r;->a(Landroid/graphics/RectF;)Landroid/graphics/Matrix;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    :cond_0
    return-object v0
.end method

.method static l(Landroid/graphics/Rect;Landroid/graphics/Matrix;)Landroid/graphics/Rect;
    .locals 1

    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0, p0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p1, v0}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    new-instance p0, Landroid/graphics/Rect;

    invoke-direct {p0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {v0, p0}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    return-object p0
.end method

.method private synthetic m(Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/f$a;Landroidx/concurrent/futures/c$a;)V
    .locals 3

    iget-boolean v0, p0, Landroidx/camera/core/i;->s:Z

    if-eqz v0, :cond_2

    invoke-interface {p1}, Landroidx/camera/core/o;->e1()Lw/h0;

    move-result-object v0

    invoke-interface {v0}, Lw/h0;->b()Landroidx/camera/core/impl/f2;

    move-result-object v0

    invoke-interface {p1}, Landroidx/camera/core/o;->e1()Lw/h0;

    move-result-object p1

    invoke-interface {p1}, Lw/h0;->c()J

    move-result-wide v1

    iget-boolean p1, p0, Landroidx/camera/core/i;->e:Z

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget p1, p0, Landroidx/camera/core/i;->b:I

    :goto_0
    invoke-static {v0, v1, v2, p1, p2}, Lw/m0;->e(Landroidx/camera/core/impl/f2;JILandroid/graphics/Matrix;)Lw/h0;

    move-result-object p1

    new-instance p2, Landroidx/camera/core/u;

    invoke-direct {p2, p3, p1}, Landroidx/camera/core/u;-><init>(Landroidx/camera/core/o;Lw/h0;)V

    invoke-virtual {p4}, Landroid/graphics/Rect;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-interface {p2, p4}, Landroidx/camera/core/o;->Z(Landroid/graphics/Rect;)V

    :cond_1
    invoke-interface {p5, p2}, Landroidx/camera/core/f$a;->b(Landroidx/camera/core/o;)V

    const/4 p1, 0x0

    invoke-virtual {p6, p1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p1, Landroidx/core/os/k;

    const-string p2, "ImageAnalysis is detached"

    invoke-direct {p1, p2}, Landroidx/core/os/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p6, p1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :goto_1
    return-void
.end method

.method private synthetic n(Ljava/util/concurrent/Executor;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/f$a;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 9

    new-instance v8, Landroidx/camera/core/h;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Landroidx/camera/core/h;-><init>(Landroidx/camera/core/i;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/f$a;Landroidx/concurrent/futures/c$a;)V

    move-object v0, p1

    invoke-interface {p1, v8}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    const-string v0, "analyzeImage"

    return-object v0
.end method

.method private p(IIII)V
    .locals 1

    iget v0, p0, Landroidx/camera/core/i;->b:I

    invoke-static {p1, p2, p3, p4, v0}, Landroidx/camera/core/i;->k(IIIII)Landroid/graphics/Matrix;

    move-result-object p1

    iget-object p2, p0, Landroidx/camera/core/i;->j:Landroid/graphics/Rect;

    invoke-static {p2, p1}, Landroidx/camera/core/i;->l(Landroid/graphics/Rect;Landroid/graphics/Matrix;)Landroid/graphics/Rect;

    move-result-object p2

    iput-object p2, p0, Landroidx/camera/core/i;->k:Landroid/graphics/Rect;

    iget-object p2, p0, Landroidx/camera/core/i;->m:Landroid/graphics/Matrix;

    iget-object p3, p0, Landroidx/camera/core/i;->l:Landroid/graphics/Matrix;

    invoke-virtual {p2, p3, p1}, Landroid/graphics/Matrix;->setConcat(Landroid/graphics/Matrix;Landroid/graphics/Matrix;)Z

    return-void
.end method

.method private q(Landroidx/camera/core/o;I)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/i;->h:Landroidx/camera/core/t;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Landroidx/camera/core/t;->l()V

    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    move-result v0

    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    move-result p1

    iget-object v1, p0, Landroidx/camera/core/i;->h:Landroidx/camera/core/t;

    invoke-virtual {v1}, Landroidx/camera/core/t;->c()I

    move-result v1

    iget-object v2, p0, Landroidx/camera/core/i;->h:Landroidx/camera/core/t;

    invoke-virtual {v2}, Landroidx/camera/core/t;->e()I

    move-result v2

    invoke-static {v0, p1, p2, v1, v2}, Landroidx/camera/core/i;->i(IIIII)Landroidx/camera/core/t;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/i;->h:Landroidx/camera/core/t;

    iget p1, p0, Landroidx/camera/core/i;->d:I

    const/4 p2, 0x1

    if-ne p1, p2, :cond_2

    iget-object p1, p0, Landroidx/camera/core/i;->i:Landroid/media/ImageWriter;

    if-eqz p1, :cond_1

    invoke-static {p1}, Lc0/a;->a(Landroid/media/ImageWriter;)V

    :cond_1
    iget-object p1, p0, Landroidx/camera/core/i;->h:Landroidx/camera/core/t;

    invoke-virtual {p1}, Landroidx/camera/core/t;->getSurface()Landroid/view/Surface;

    move-result-object p1

    iget-object p2, p0, Landroidx/camera/core/i;->h:Landroidx/camera/core/t;

    invoke-virtual {p2}, Landroidx/camera/core/t;->e()I

    move-result p2

    invoke-static {p1, p2}, Lc0/a;->c(Landroid/view/Surface;I)Landroid/media/ImageWriter;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/i;->i:Landroid/media/ImageWriter;

    :cond_2
    return-void
.end method


# virtual methods
.method public a(Landroidx/camera/core/impl/g1;)V
    .locals 2

    :try_start_0
    invoke-virtual {p0, p1}, Landroidx/camera/core/i;->d(Landroidx/camera/core/impl/g1;)Landroidx/camera/core/o;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Landroidx/camera/core/i;->o(Landroidx/camera/core/o;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "ImageAnalysisAnalyzer"

    const-string v1, "Failed to acquire image."

    invoke-static {v0, v1, p1}, Lw/o0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    :goto_0
    return-void
.end method

.method abstract d(Landroidx/camera/core/impl/g1;)Landroidx/camera/core/o;
.end method

.method e(Landroidx/camera/core/o;)Lcom/google/common/util/concurrent/f;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/o;",
            ")",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Landroidx/camera/core/i;->e:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget v0, p0, Landroidx/camera/core/i;->b:I

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Landroidx/camera/core/i;->r:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    iget-object v9, p0, Landroidx/camera/core/i;->g:Ljava/util/concurrent/Executor;

    iget-object v10, p0, Landroidx/camera/core/i;->a:Landroidx/camera/core/f$a;

    iget-boolean v3, p0, Landroidx/camera/core/i;->e:Z

    const/4 v11, 0x1

    if-eqz v3, :cond_1

    iget v3, p0, Landroidx/camera/core/i;->c:I

    if-eq v0, v3, :cond_1

    move v12, v11

    goto :goto_1

    :cond_1
    move v12, v1

    :goto_1
    if-eqz v12, :cond_2

    invoke-direct {p0, p1, v0}, Landroidx/camera/core/i;->q(Landroidx/camera/core/o;I)V

    :cond_2
    iget-boolean v3, p0, Landroidx/camera/core/i;->e:Z

    if-eqz v3, :cond_3

    invoke-direct {p0, p1}, Landroidx/camera/core/i;->h(Landroidx/camera/core/o;)V

    :cond_3
    iget-object v3, p0, Landroidx/camera/core/i;->h:Landroidx/camera/core/t;

    iget-object v4, p0, Landroidx/camera/core/i;->i:Landroid/media/ImageWriter;

    iget-object v5, p0, Landroidx/camera/core/i;->n:Ljava/nio/ByteBuffer;

    iget-object v6, p0, Landroidx/camera/core/i;->o:Ljava/nio/ByteBuffer;

    iget-object v7, p0, Landroidx/camera/core/i;->p:Ljava/nio/ByteBuffer;

    iget-object v8, p0, Landroidx/camera/core/i;->q:Ljava/nio/ByteBuffer;

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-eqz v10, :cond_a

    if-eqz v9, :cond_a

    iget-boolean v2, p0, Landroidx/camera/core/i;->s:Z

    if-eqz v2, :cond_a

    if-eqz v3, :cond_6

    iget v2, p0, Landroidx/camera/core/i;->d:I

    const/4 v13, 0x2

    if-ne v2, v13, :cond_4

    iget-boolean v2, p0, Landroidx/camera/core/i;->f:Z

    invoke-static {p1, v3, v5, v0, v2}, Landroidx/camera/core/ImageProcessingUtil;->f(Landroidx/camera/core/o;Landroidx/camera/core/impl/g1;Ljava/nio/ByteBuffer;IZ)Landroidx/camera/core/o;

    move-result-object v2

    goto :goto_2

    :cond_4
    iget v2, p0, Landroidx/camera/core/i;->d:I

    if-ne v2, v11, :cond_6

    iget-boolean v2, p0, Landroidx/camera/core/i;->f:Z

    if-eqz v2, :cond_5

    invoke-static {p1}, Landroidx/camera/core/ImageProcessingUtil;->c(Landroidx/camera/core/o;)Z

    :cond_5
    if-eqz v4, :cond_6

    if-eqz v6, :cond_6

    if-eqz v7, :cond_6

    if-eqz v8, :cond_6

    move-object v2, p1

    move-object v5, v6

    move-object v6, v7

    move-object v7, v8

    move v8, v0

    invoke-static/range {v2 .. v8}, Landroidx/camera/core/ImageProcessingUtil;->n(Landroidx/camera/core/o;Landroidx/camera/core/impl/g1;Landroid/media/ImageWriter;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)Landroidx/camera/core/o;

    move-result-object v2

    goto :goto_2

    :cond_6
    const/4 v2, 0x0

    :goto_2
    if-nez v2, :cond_7

    move v1, v11

    :cond_7
    if-eqz v1, :cond_8

    move-object v8, p1

    goto :goto_3

    :cond_8
    move-object v8, v2

    :goto_3
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    new-instance v7, Landroid/graphics/Matrix;

    invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V

    iget-object v3, p0, Landroidx/camera/core/i;->r:Ljava/lang/Object;

    monitor-enter v3

    if-eqz v12, :cond_9

    if-nez v1, :cond_9

    :try_start_1
    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    move-result v1

    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    move-result v4

    invoke-interface {v8}, Landroidx/camera/core/o;->getWidth()I

    move-result v5

    invoke-interface {v8}, Landroidx/camera/core/o;->getHeight()I

    move-result v6

    invoke-direct {p0, v1, v4, v5, v6}, Landroidx/camera/core/i;->p(IIII)V

    :cond_9
    iput v0, p0, Landroidx/camera/core/i;->c:I

    iget-object v0, p0, Landroidx/camera/core/i;->k:Landroid/graphics/Rect;

    invoke-virtual {v2, v0}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    iget-object v0, p0, Landroidx/camera/core/i;->m:Landroid/graphics/Matrix;

    invoke-virtual {v7, v0}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    new-instance v0, Landroidx/camera/core/g;

    move-object v3, v0

    move-object v4, p0

    move-object v5, v9

    move-object v6, p1

    move-object v9, v2

    invoke-direct/range {v3 .. v10}, Landroidx/camera/core/g;-><init>(Landroidx/camera/core/i;Ljava/util/concurrent/Executor;Landroidx/camera/core/o;Landroid/graphics/Matrix;Landroidx/camera/core/o;Landroid/graphics/Rect;Landroidx/camera/core/f$a;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    goto :goto_4

    :catchall_0
    move-exception p1

    :try_start_2
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1

    :cond_a
    new-instance p1, Landroidx/core/os/k;

    const-string v0, "No analyzer or executor currently set."

    invoke-direct {p1, v0}, Landroidx/core/os/k;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    :goto_4
    return-object p1

    :catchall_1
    move-exception p1

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method f()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/camera/core/i;->s:Z

    return-void
.end method

.method abstract g()V
.end method

.method j()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/core/i;->s:Z

    invoke-virtual {p0}, Landroidx/camera/core/i;->g()V

    return-void
.end method

.method abstract o(Landroidx/camera/core/o;)V
.end method

.method r(Ljava/util/concurrent/Executor;Landroidx/camera/core/f$a;)V
    .locals 1

    if-nez p2, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/i;->g()V

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/i;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p2, p0, Landroidx/camera/core/i;->a:Landroidx/camera/core/f$a;

    iput-object p1, p0, Landroidx/camera/core/i;->g:Ljava/util/concurrent/Executor;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method s(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/camera/core/i;->f:Z

    return-void
.end method

.method t(I)V
    .locals 0

    iput p1, p0, Landroidx/camera/core/i;->d:I

    return-void
.end method

.method u(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/camera/core/i;->e:Z

    return-void
.end method

.method v(Landroidx/camera/core/t;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/i;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/i;->h:Landroidx/camera/core/t;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method w(I)V
    .locals 0

    iput p1, p0, Landroidx/camera/core/i;->b:I

    return-void
.end method

.method x(Landroid/graphics/Matrix;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/i;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/i;->l:Landroid/graphics/Matrix;

    new-instance p1, Landroid/graphics/Matrix;

    iget-object v1, p0, Landroidx/camera/core/i;->l:Landroid/graphics/Matrix;

    invoke-direct {p1, v1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object p1, p0, Landroidx/camera/core/i;->m:Landroid/graphics/Matrix;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method y(Landroid/graphics/Rect;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/i;->r:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/i;->j:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/Rect;

    iget-object v1, p0, Landroidx/camera/core/i;->j:Landroid/graphics/Rect;

    invoke-direct {p1, v1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object p1, p0, Landroidx/camera/core/i;->k:Landroid/graphics/Rect;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
