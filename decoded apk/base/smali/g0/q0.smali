.class final Lg0/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/x0;


# instance fields
.field private final A:Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private B:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private C:Landroidx/camera/core/impl/c0;

.field private D:Landroid/graphics/Matrix;

.field private final a:Ljava/lang/Object;

.field private final b:Landroid/view/Surface;

.field private final c:I

.field private final d:I

.field private final e:Landroid/util/Size;

.field private final f:Landroid/util/Size;

.field private final r:Landroid/graphics/Rect;

.field private final s:I

.field private final t:Z

.field private final u:[F

.field private final v:[F

.field private w:Landroidx/core/util/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/core/util/a<",
            "Lw/x0$a;",
            ">;"
        }
    .end annotation
.end field

.field private x:Ljava/util/concurrent/Executor;

.field private y:Z

.field private z:Z


# direct methods
.method constructor <init>(Landroid/view/Surface;IILandroid/util/Size;Landroid/util/Size;Landroid/graphics/Rect;IZLandroidx/camera/core/impl/c0;Landroid/graphics/Matrix;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lg0/q0;->a:Ljava/lang/Object;

    const/16 v0, 0x10

    new-array v1, v0, [F

    iput-object v1, p0, Lg0/q0;->u:[F

    new-array v0, v0, [F

    iput-object v0, p0, Lg0/q0;->v:[F

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg0/q0;->y:Z

    iput-boolean v0, p0, Lg0/q0;->z:Z

    iput-object p1, p0, Lg0/q0;->b:Landroid/view/Surface;

    iput p2, p0, Lg0/q0;->c:I

    iput p3, p0, Lg0/q0;->d:I

    iput-object p4, p0, Lg0/q0;->e:Landroid/util/Size;

    iput-object p5, p0, Lg0/q0;->f:Landroid/util/Size;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1, p6}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    iput-object p1, p0, Lg0/q0;->r:Landroid/graphics/Rect;

    iput-boolean p8, p0, Lg0/q0;->t:Z

    iput p7, p0, Lg0/q0;->s:I

    iput-object p9, p0, Lg0/q0;->C:Landroidx/camera/core/impl/c0;

    iput-object p10, p0, Lg0/q0;->D:Landroid/graphics/Matrix;

    invoke-direct {p0}, Lg0/q0;->e()V

    new-instance p1, Lg0/o0;

    invoke-direct {p1, p0}, Lg0/o0;-><init>(Lg0/q0;)V

    invoke-static {p1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    iput-object p1, p0, Lg0/q0;->A:Lcom/google/common/util/concurrent/f;

    return-void
.end method

.method public static synthetic a(Lg0/q0;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0, p1}, Lg0/q0;->j(Ljava/util/concurrent/atomic/AtomicReference;)V

    return-void
.end method

.method public static synthetic b(Lg0/q0;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lg0/q0;->i(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private e()V
    .locals 14

    iget-object v0, p0, Lg0/q0;->u:[F

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    iget-object v0, p0, Lg0/q0;->u:[F

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v0, v2}, Landroidx/camera/core/impl/utils/o;->d([FF)V

    iget-object v0, p0, Lg0/q0;->u:[F

    iget v3, p0, Lg0/q0;->s:I

    int-to-float v3, v3

    invoke-static {v0, v3, v2, v2}, Landroidx/camera/core/impl/utils/o;->c([FFFF)V

    iget-boolean v0, p0, Lg0/q0;->t:Z

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg0/q0;->u:[F

    invoke-static {v0, v1, v3, v2, v2}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    iget-object v0, p0, Lg0/q0;->u:[F

    const/high16 v4, -0x40800000    # -1.0f

    invoke-static {v0, v1, v4, v3, v3}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    :cond_0
    iget-object v0, p0, Lg0/q0;->f:Landroid/util/Size;

    iget v4, p0, Lg0/q0;->s:I

    invoke-static {v0, v4}, Landroidx/camera/core/impl/utils/r;->k(Landroid/util/Size;I)Landroid/util/Size;

    move-result-object v0

    iget-object v4, p0, Lg0/q0;->f:Landroid/util/Size;

    invoke-static {v4}, Landroidx/camera/core/impl/utils/r;->n(Landroid/util/Size;)Landroid/graphics/RectF;

    move-result-object v4

    invoke-static {v0}, Landroidx/camera/core/impl/utils/r;->n(Landroid/util/Size;)Landroid/graphics/RectF;

    move-result-object v5

    iget v6, p0, Lg0/q0;->s:I

    iget-boolean v7, p0, Lg0/q0;->t:Z

    invoke-static {v4, v5, v6, v7}, Landroidx/camera/core/impl/utils/r;->c(Landroid/graphics/RectF;Landroid/graphics/RectF;IZ)Landroid/graphics/Matrix;

    move-result-object v4

    new-instance v5, Landroid/graphics/RectF;

    iget-object v6, p0, Lg0/q0;->r:Landroid/graphics/Rect;

    invoke-direct {v5, v6}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {v4, v5}, Landroid/graphics/Matrix;->mapRect(Landroid/graphics/RectF;)Z

    iget v4, v5, Landroid/graphics/RectF;->left:F

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v4, v6

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v7

    sub-float/2addr v6, v7

    iget v7, v5, Landroid/graphics/RectF;->top:F

    sub-float/2addr v6, v7

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v7

    int-to-float v7, v7

    div-float/2addr v6, v7

    invoke-virtual {v5}, Landroid/graphics/RectF;->width()F

    move-result v7

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v8

    int-to-float v8, v8

    div-float/2addr v7, v8

    invoke-virtual {v5}, Landroid/graphics/RectF;->height()F

    move-result v5

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v5, v0

    iget-object v0, p0, Lg0/q0;->u:[F

    invoke-static {v0, v1, v4, v6, v2}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    iget-object v0, p0, Lg0/q0;->u:[F

    invoke-static {v0, v1, v7, v5, v3}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    invoke-direct {p0}, Lg0/q0;->f()V

    iget-object v12, p0, Lg0/q0;->u:[F

    const/4 v9, 0x0

    iget-object v10, p0, Lg0/q0;->v:[F

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v8, v12

    invoke-static/range {v8 .. v13}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    return-void
.end method

.method private f()V
    .locals 4

    iget-object v0, p0, Lg0/q0;->v:[F

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    iget-object v0, p0, Lg0/q0;->v:[F

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v0, v2}, Landroidx/camera/core/impl/utils/o;->d([FF)V

    iget-object v0, p0, Lg0/q0;->C:Landroidx/camera/core/impl/c0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/impl/c0;->m()Z

    move-result v0

    const-string v3, "Camera has no transform."

    invoke-static {v0, v3}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iget-object v0, p0, Lg0/q0;->v:[F

    iget-object v3, p0, Lg0/q0;->C:Landroidx/camera/core/impl/c0;

    invoke-interface {v3}, Landroidx/camera/core/impl/c0;->b()Lw/o;

    move-result-object v3

    invoke-interface {v3}, Lw/o;->a()I

    move-result v3

    int-to-float v3, v3

    invoke-static {v0, v3, v2, v2}, Landroidx/camera/core/impl/utils/o;->c([FFFF)V

    iget-object v0, p0, Lg0/q0;->C:Landroidx/camera/core/impl/c0;

    invoke-interface {v0}, Landroidx/camera/core/impl/c0;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg0/q0;->v:[F

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x0

    invoke-static {v0, v1, v2, v3, v3}, Landroid/opengl/Matrix;->translateM([FIFFF)V

    iget-object v0, p0, Lg0/q0;->v:[F

    const/high16 v3, -0x40800000    # -1.0f

    invoke-static {v0, v1, v3, v2, v2}, Landroid/opengl/Matrix;->scaleM([FIFFF)V

    :cond_0
    iget-object v0, p0, Lg0/q0;->v:[F

    invoke-static {v0, v1, v0, v1}, Landroid/opengl/Matrix;->invertM([FI[FI)Z

    return-void
.end method

.method private synthetic i(Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    iput-object p1, p0, Lg0/q0;->B:Landroidx/concurrent/futures/c$a;

    const-string p1, "SurfaceOutputImpl close future complete"

    return-object p1
.end method

.method private synthetic j(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/core/util/a;

    const/4 v0, 0x0

    invoke-static {v0, p0}, Lw/x0$a;->c(ILw/x0;)Lw/x0$a;

    move-result-object v0

    invoke-interface {p1, v0}, Landroidx/core/util/a;->accept(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public A0(Ljava/util/concurrent/Executor;Landroidx/core/util/a;)Landroid/view/Surface;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Landroidx/core/util/a<",
            "Lw/x0$a;",
            ">;)",
            "Landroid/view/Surface;"
        }
    .end annotation

    iget-object v0, p0, Lg0/q0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lg0/q0;->x:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lg0/q0;->w:Landroidx/core/util/a;

    iget-boolean p1, p0, Lg0/q0;->y:Z

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lg0/q0;->l()V

    :cond_0
    iget-object p1, p0, Lg0/q0;->b:Landroid/view/Surface;

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public close()V
    .locals 2

    iget-object v0, p0, Lg0/q0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lg0/q0;->z:Z

    if-nez v1, :cond_0

    const/4 v1, 0x1

    iput-boolean v1, p0, Lg0/q0;->z:Z

    :cond_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lg0/q0;->B:Landroidx/concurrent/futures/c$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1
.end method

.method public g()Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lg0/q0;->A:Lcom/google/common/util/concurrent/f;

    return-object v0
.end method

.method public getFormat()I
    .locals 1

    iget v0, p0, Lg0/q0;->d:I

    return v0
.end method

.method public l()V
    .locals 4

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iget-object v1, p0, Lg0/q0;->a:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-object v2, p0, Lg0/q0;->x:Ljava/util/concurrent/Executor;

    if-eqz v2, :cond_1

    iget-object v2, p0, Lg0/q0;->w:Landroidx/core/util/a;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v3, p0, Lg0/q0;->z:Z

    if-nez v3, :cond_2

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    iget-object v2, p0, Lg0/q0;->x:Ljava/util/concurrent/Executor;

    const/4 v3, 0x0

    iput-boolean v3, p0, Lg0/q0;->y:Z

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v2, 0x1

    iput-boolean v2, p0, Lg0/q0;->y:Z

    :cond_2
    const/4 v2, 0x0

    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_3

    :try_start_1
    new-instance v1, Lg0/p0;

    invoke-direct {v1, p0, v0}, Lg0/p0;-><init>(Lg0/q0;Ljava/util/concurrent/atomic/AtomicReference;)V

    invoke-interface {v2, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    const-string v1, "SurfaceOutputImpl"

    const-string v2, "Processor executor closed. Close request not posted."

    invoke-static {v1, v2, v0}, Lw/o0;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public p()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Lg0/q0;->e:Landroid/util/Size;

    return-object v0
.end method

.method public y0([F[F)V
    .locals 6

    const/4 v1, 0x0

    const/4 v3, 0x0

    iget-object v4, p0, Lg0/q0;->u:[F

    const/4 v5, 0x0

    move-object v0, p1

    move-object v2, p2

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    return-void
.end method
