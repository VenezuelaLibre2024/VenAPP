.class final Lv8/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lu8/k;
.implements Lv8/a;


# instance fields
.field private final a:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final b:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final c:Lv8/g;

.field private final d:Lv8/c;

.field private final e:Lt8/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/m0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Lt8/m0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt8/m0<",
            "Lv8/e;",
            ">;"
        }
    .end annotation
.end field

.field private final r:[F

.field private final s:[F

.field private t:I

.field private u:Landroid/graphics/SurfaceTexture;

.field private volatile v:I

.field private w:I

.field private x:[B


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object v0, p0, Lv8/i;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lv8/i;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lv8/g;

    invoke-direct {v0}, Lv8/g;-><init>()V

    iput-object v0, p0, Lv8/i;->c:Lv8/g;

    new-instance v0, Lv8/c;

    invoke-direct {v0}, Lv8/c;-><init>()V

    iput-object v0, p0, Lv8/i;->d:Lv8/c;

    new-instance v0, Lt8/m0;

    invoke-direct {v0}, Lt8/m0;-><init>()V

    iput-object v0, p0, Lv8/i;->e:Lt8/m0;

    new-instance v0, Lt8/m0;

    invoke-direct {v0}, Lt8/m0;-><init>()V

    iput-object v0, p0, Lv8/i;->f:Lt8/m0;

    const/16 v0, 0x10

    new-array v1, v0, [F

    iput-object v1, p0, Lv8/i;->r:[F

    new-array v0, v0, [F

    iput-object v0, p0, Lv8/i;->s:[F

    const/4 v0, 0x0

    iput v0, p0, Lv8/i;->v:I

    const/4 v0, -0x1

    iput v0, p0, Lv8/i;->w:I

    return-void
.end method

.method public static synthetic d(Lv8/i;Landroid/graphics/SurfaceTexture;)V
    .locals 0

    invoke-direct {p0, p1}, Lv8/i;->g(Landroid/graphics/SurfaceTexture;)V

    return-void
.end method

.method private synthetic g(Landroid/graphics/SurfaceTexture;)V
    .locals 1

    iget-object p1, p0, Lv8/i;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method private i([BIJ)V
    .locals 2

    iget-object v0, p0, Lv8/i;->x:[B

    iget v1, p0, Lv8/i;->w:I

    iput-object p1, p0, Lv8/i;->x:[B

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    iget p2, p0, Lv8/i;->v:I

    :cond_0
    iput p2, p0, Lv8/i;->w:I

    if-ne v1, p2, :cond_1

    iget-object p1, p0, Lv8/i;->x:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_1

    return-void

    :cond_1
    iget-object p1, p0, Lv8/i;->x:[B

    if-eqz p1, :cond_2

    iget p2, p0, Lv8/i;->w:I

    invoke-static {p1, p2}, Lv8/f;->a([BI)Lv8/e;

    move-result-object p1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_3

    invoke-static {p1}, Lv8/g;->c(Lv8/e;)Z

    move-result p2

    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    iget p1, p0, Lv8/i;->w:I

    invoke-static {p1}, Lv8/e;->b(I)Lv8/e;

    move-result-object p1

    :goto_1
    iget-object p2, p0, Lv8/i;->f:Lt8/m0;

    invoke-virtual {p2, p3, p4, p1}, Lt8/m0;->a(JLjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public a(JJLt6/u1;Landroid/media/MediaFormat;)V
    .locals 0

    iget-object p6, p0, Lv8/i;->e:Lt8/m0;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p6, p3, p4, p1}, Lt8/m0;->a(JLjava/lang/Object;)V

    iget-object p1, p5, Lt6/u1;->G:[B

    iget p2, p5, Lt6/u1;->H:I

    invoke-direct {p0, p1, p2, p3, p4}, Lv8/i;->i([BIJ)V

    return-void
.end method

.method public b(J[F)V
    .locals 1

    iget-object v0, p0, Lv8/i;->d:Lv8/c;

    invoke-virtual {v0, p1, p2, p3}, Lv8/c;->e(J[F)V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lv8/i;->e:Lt8/m0;

    invoke-virtual {v0}, Lt8/m0;->c()V

    iget-object v0, p0, Lv8/i;->d:Lv8/c;

    invoke-virtual {v0}, Lv8/c;->d()V

    iget-object v0, p0, Lv8/i;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public e([FZ)V
    .locals 8

    const-string v0, "Failed to draw a frame"

    const-string v1, "SceneRenderer"

    const/16 v2, 0x4000

    invoke-static {v2}, Landroid/opengl/GLES20;->glClear(I)V

    :try_start_0
    invoke-static {}, Lt8/n;->b()V
    :try_end_0
    .catch Lt8/n$a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    invoke-static {v1, v0, v2}, Lt8/s;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    iget-object v2, p0, Lv8/i;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lv8/i;->u:Landroid/graphics/SurfaceTexture;

    invoke-static {v2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/SurfaceTexture;

    invoke-virtual {v2}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    :try_start_1
    invoke-static {}, Lt8/n;->b()V
    :try_end_1
    .catch Lt8/n$a; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v2

    invoke-static {v1, v0, v2}, Lt8/s;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    iget-object v0, p0, Lv8/i;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0, v3, v4}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lv8/i;->r:[F

    invoke-static {v0}, Lt8/n;->j([F)V

    :cond_0
    iget-object v0, p0, Lv8/i;->u:Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->getTimestamp()J

    move-result-wide v0

    iget-object v2, p0, Lv8/i;->e:Lt8/m0;

    invoke-virtual {v2, v0, v1}, Lt8/m0;->g(J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    if-eqz v2, :cond_1

    iget-object v3, p0, Lv8/i;->d:Lv8/c;

    iget-object v4, p0, Lv8/i;->r:[F

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-virtual {v3, v4, v5, v6}, Lv8/c;->c([FJ)Z

    :cond_1
    iget-object v2, p0, Lv8/i;->f:Lt8/m0;

    invoke-virtual {v2, v0, v1}, Lt8/m0;->j(J)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv8/e;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lv8/i;->c:Lv8/g;

    invoke-virtual {v1, v0}, Lv8/g;->d(Lv8/e;)V

    :cond_2
    iget-object v2, p0, Lv8/i;->s:[F

    const/4 v3, 0x0

    const/4 v5, 0x0

    iget-object v6, p0, Lv8/i;->r:[F

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v2 .. v7}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    iget-object p1, p0, Lv8/i;->c:Lv8/g;

    iget v0, p0, Lv8/i;->t:I

    iget-object v1, p0, Lv8/i;->s:[F

    invoke-virtual {p1, v0, v1, p2}, Lv8/g;->a(I[FZ)V

    return-void
.end method

.method public f()Landroid/graphics/SurfaceTexture;
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, 0x3f000000    # 0.5f

    :try_start_0
    invoke-static {v1, v1, v1, v0}, Landroid/opengl/GLES20;->glClearColor(FFFF)V

    invoke-static {}, Lt8/n;->b()V

    iget-object v0, p0, Lv8/i;->c:Lv8/g;

    invoke-virtual {v0}, Lv8/g;->b()V

    invoke-static {}, Lt8/n;->b()V

    invoke-static {}, Lt8/n;->f()I

    move-result v0

    iput v0, p0, Lv8/i;->t:I
    :try_end_0
    .catch Lt8/n$a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "SceneRenderer"

    const-string v2, "Failed to initialize the renderer"

    invoke-static {v1, v2, v0}, Lt8/s;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    new-instance v0, Landroid/graphics/SurfaceTexture;

    iget v1, p0, Lv8/i;->t:I

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    iput-object v0, p0, Lv8/i;->u:Landroid/graphics/SurfaceTexture;

    new-instance v1, Lv8/h;

    invoke-direct {v1, p0}, Lv8/h;-><init>(Lv8/i;)V

    invoke-virtual {v0, v1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    iget-object v0, p0, Lv8/i;->u:Landroid/graphics/SurfaceTexture;

    return-object v0
.end method

.method public h(I)V
    .locals 0

    iput p1, p0, Lv8/i;->v:I

    return-void
.end method
