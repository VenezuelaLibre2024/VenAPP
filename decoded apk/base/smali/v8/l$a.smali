.class final Lv8/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/opengl/GLSurfaceView$Renderer;
.implements Lv8/m$a;
.implements Lv8/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv8/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field private final a:Lv8/i;

.field private final b:[F

.field private final c:[F

.field private final d:[F

.field private final e:[F

.field private final f:[F

.field private r:F

.field private s:F

.field private final t:[F

.field private final u:[F

.field final synthetic v:Lv8/l;


# direct methods
.method public constructor <init>(Lv8/l;Lv8/i;)V
    .locals 4

    iput-object p1, p0, Lv8/l$a;->v:Lv8/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x10

    new-array v0, p1, [F

    iput-object v0, p0, Lv8/l$a;->b:[F

    new-array v0, p1, [F

    iput-object v0, p0, Lv8/l$a;->c:[F

    new-array v0, p1, [F

    iput-object v0, p0, Lv8/l$a;->d:[F

    new-array v1, p1, [F

    iput-object v1, p0, Lv8/l$a;->e:[F

    new-array v2, p1, [F

    iput-object v2, p0, Lv8/l$a;->f:[F

    new-array v3, p1, [F

    iput-object v3, p0, Lv8/l$a;->t:[F

    new-array p1, p1, [F

    iput-object p1, p0, Lv8/l$a;->u:[F

    iput-object p2, p0, Lv8/l$a;->a:Lv8/i;

    invoke-static {v0}, Lt8/n;->j([F)V

    invoke-static {v1}, Lt8/n;->j([F)V

    invoke-static {v2}, Lt8/n;->j([F)V

    const p1, 0x40490fdb    # (float)Math.PI

    iput p1, p0, Lv8/l$a;->s:F

    return-void
.end method

.method private c(F)F
    .locals 4

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    const-wide v0, 0x4046800000000000L    # 45.0

    invoke-static {v0, v1}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->tan(D)D

    move-result-wide v0

    float-to-double v2, p1

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->atan(D)D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    const-wide/high16 v2, 0x4000000000000000L    # 2.0

    mul-double/2addr v0, v2

    double-to-float p1, v0

    return p1

    :cond_1
    const/high16 p1, 0x42b40000    # 90.0f

    return p1
.end method

.method private d()V
    .locals 6

    iget-object v0, p0, Lv8/l$a;->e:[F

    const/4 v1, 0x0

    iget v2, p0, Lv8/l$a;->r:F

    neg-float v2, v2

    iget v3, p0, Lv8/l$a;->s:F

    float-to-double v3, v3

    invoke-static {v3, v4}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float v3, v3

    iget v4, p0, Lv8/l$a;->s:F

    float-to-double v4, v4

    invoke-static {v4, v5}, Ljava/lang/Math;->sin(D)D

    move-result-wide v4

    double-to-float v4, v4

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V

    return-void
.end method


# virtual methods
.method public declared-synchronized a([FF)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lv8/l$a;->d:[F

    array-length v1, v0

    const/4 v2, 0x0

    invoke-static {p1, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    neg-float p1, p2

    iput p1, p0, Lv8/l$a;->s:F

    invoke-direct {p0}, Lv8/l$a;->d()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized b(Landroid/graphics/PointF;)V
    .locals 7

    monitor-enter p0

    :try_start_0
    iget v0, p1, Landroid/graphics/PointF;->y:F

    iput v0, p0, Lv8/l$a;->r:F

    invoke-direct {p0}, Lv8/l$a;->d()V

    iget-object v1, p0, Lv8/l$a;->f:[F

    const/4 v2, 0x0

    iget p1, p1, Landroid/graphics/PointF;->x:F

    neg-float v3, p1

    const/4 v4, 0x0

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Landroid/opengl/Matrix;->setRotateM([FIFFFF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
    .locals 12

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lv8/l$a;->u:[F

    const/4 v1, 0x0

    iget-object v2, p0, Lv8/l$a;->d:[F

    const/4 v3, 0x0

    iget-object v4, p0, Lv8/l$a;->f:[F

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    iget-object v6, p0, Lv8/l$a;->t:[F

    const/4 v7, 0x0

    iget-object v8, p0, Lv8/l$a;->e:[F

    const/4 v9, 0x0

    iget-object v10, p0, Lv8/l$a;->u:[F

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lv8/l$a;->c:[F

    const/4 v1, 0x0

    iget-object v2, p0, Lv8/l$a;->b:[F

    const/4 v3, 0x0

    iget-object v4, p0, Lv8/l$a;->t:[F

    const/4 v5, 0x0

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    iget-object p1, p0, Lv8/l$a;->a:Lv8/i;

    iget-object v0, p0, Lv8/l$a;->c:[F

    invoke-virtual {p1, v0, v1}, Lv8/i;->e([FZ)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 0

    iget-object p1, p0, Lv8/l$a;->v:Lv8/l;

    invoke-virtual {p1}, Landroid/view/View;->performClick()Z

    move-result p1

    return p1
.end method

.method public onSurfaceChanged(Ljavax/microedition/khronos/opengles/GL10;II)V
    .locals 6

    const/4 p1, 0x0

    invoke-static {p1, p1, p2, p3}, Landroid/opengl/GLES20;->glViewport(IIII)V

    int-to-float p1, p2

    int-to-float p2, p3

    div-float v3, p1, p2

    invoke-direct {p0, v3}, Lv8/l$a;->c(F)F

    move-result v2

    iget-object v0, p0, Lv8/l$a;->b:[F

    const/4 v1, 0x0

    const v4, 0x3dcccccd    # 0.1f

    const/high16 v5, 0x42c80000    # 100.0f

    invoke-static/range {v0 .. v5}, Landroid/opengl/Matrix;->perspectiveM([FIFFFF)V

    return-void
.end method

.method public declared-synchronized onSurfaceCreated(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V
    .locals 0

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lv8/l$a;->v:Lv8/l;

    iget-object p2, p0, Lv8/l$a;->a:Lv8/i;

    invoke-virtual {p2}, Lv8/i;->f()Landroid/graphics/SurfaceTexture;

    move-result-object p2

    invoke-static {p1, p2}, Lv8/l;->c(Lv8/l;Landroid/graphics/SurfaceTexture;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
