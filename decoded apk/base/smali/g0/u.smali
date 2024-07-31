.class public Lg0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg0/r0;
.implements Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/u$b;,
        Lg0/u$a;
    }
.end annotation


# instance fields
.field private final a:Lg0/a0;

.field final b:Landroid/os/HandlerThread;

.field private final c:Ljava/util/concurrent/Executor;

.field final d:Landroid/os/Handler;

.field private final e:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final f:[F

.field private final r:[F

.field final s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lw/x0;",
            "Landroid/view/Surface;",
            ">;"
        }
    .end annotation
.end field

.field private t:I

.field private u:Z

.field private final v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lg0/u$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lw/y;)V
    .locals 1

    sget-object v0, Lg0/d0;->a:Lg0/d0;

    invoke-direct {p0, p1, v0}, Lg0/u;-><init>(Lw/y;Lg0/d0;)V

    return-void
.end method

.method constructor <init>(Lw/y;Lg0/d0;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lg0/u;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/16 v0, 0x10

    new-array v2, v0, [F

    iput-object v2, p0, Lg0/u;->f:[F

    new-array v0, v0, [F

    iput-object v0, p0, Lg0/u;->r:[F

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lg0/u;->s:Ljava/util/Map;

    iput v1, p0, Lg0/u;->t:I

    iput-boolean v1, p0, Lg0/u;->u:Z

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lg0/u;->v:Ljava/util/List;

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "GL Thread"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lg0/u;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lg0/u;->d:Landroid/os/Handler;

    invoke-static {v1}, Lz/a;->e(Landroid/os/Handler;)Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    iput-object v0, p0, Lg0/u;->c:Ljava/util/concurrent/Executor;

    new-instance v0, Lg0/a0;

    invoke-direct {v0}, Lg0/a0;-><init>()V

    iput-object v0, p0, Lg0/u;->a:Lg0/a0;

    :try_start_0
    invoke-direct {p0, p1, p2}, Lg0/u;->u(Lw/y;Lg0/d0;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lg0/u;->release()V

    throw p1
.end method

.method private synthetic A(Lw/i1;)V
    .locals 4

    iget v0, p0, Lg0/u;->t:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lg0/u;->t:I

    new-instance v0, Landroid/graphics/SurfaceTexture;

    iget-object v1, p0, Lg0/u;->a:Lg0/a0;

    invoke-virtual {v1}, Lg0/a0;->v()I

    move-result v1

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    invoke-virtual {p1}, Lw/i1;->k()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Lw/i1;->k()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    iget-object v2, p0, Lg0/u;->c:Ljava/util/concurrent/Executor;

    new-instance v3, Lg0/h;

    invoke-direct {v3, p0, v0, v1}, Lg0/h;-><init>(Lg0/u;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;)V

    invoke-virtual {p1, v1, v2, v3}, Lw/i1;->v(Landroid/view/Surface;Ljava/util/concurrent/Executor;Landroidx/core/util/a;)V

    iget-object p1, p0, Lg0/u;->d:Landroid/os/Handler;

    invoke-virtual {v0, p0, p1}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;Landroid/os/Handler;)V

    return-void
.end method

.method private synthetic B(Lw/x0;Lw/x0$a;)V
    .locals 0

    invoke-interface {p1}, Lw/x0;->close()V

    iget-object p2, p0, Lg0/u;->s:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/Surface;

    if-eqz p1, :cond_0

    iget-object p2, p0, Lg0/u;->a:Lg0/a0;

    invoke-virtual {p2, p1}, Lg0/a0;->J(Landroid/view/Surface;)V

    :cond_0
    return-void
.end method

.method private synthetic C(Lw/x0;)V
    .locals 2

    iget-object v0, p0, Lg0/u;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lg0/g;

    invoke-direct {v1, p0, p1}, Lg0/g;-><init>(Lg0/u;Lw/x0;)V

    invoke-interface {p1, v0, v1}, Lw/x0;->A0(Ljava/util/concurrent/Executor;Landroidx/core/util/a;)Landroid/view/Surface;

    move-result-object v0

    iget-object v1, p0, Lg0/u;->a:Lg0/a0;

    invoke-virtual {v1, v0}, Lg0/a0;->C(Landroid/view/Surface;)V

    iget-object v1, p0, Lg0/u;->s:Ljava/util/Map;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private synthetic D()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg0/u;->u:Z

    invoke-direct {p0}, Lg0/u;->p()V

    return-void
.end method

.method private synthetic E(Lg0/u$b;)V
    .locals 1

    iget-object v0, p0, Lg0/u;->v:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private static synthetic F(Landroidx/concurrent/futures/c$a;)V
    .locals 2

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Failed to snapshot: OpenGLRenderer not ready."

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    return-void
.end method

.method private synthetic G(IILandroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1, p2, p3}, Lg0/u$b;->d(IILandroidx/concurrent/futures/c$a;)Lg0/a;

    move-result-object p1

    new-instance p2, Lg0/i;

    invoke-direct {p2, p0, p1}, Lg0/i;-><init>(Lg0/u;Lg0/u$b;)V

    new-instance p1, Lg0/j;

    invoke-direct {p1, p3}, Lg0/j;-><init>(Landroidx/concurrent/futures/c$a;)V

    invoke-direct {p0, p2, p1}, Lg0/u;->r(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    const-string p1, "DefaultSurfaceProcessor#snapshot"

    return-object p1
.end method

.method private H(Lck/q;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lck/q<",
            "Landroid/view/Surface;",
            "Landroid/util/Size;",
            "[F>;)V"
        }
    .end annotation

    iget-object v0, p0, Lg0/u;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    new-instance p1, Ljava/lang/Exception;

    const-string v0, "Failed to snapshot: no JPEG Surface."

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lg0/u;->s(Ljava/lang/Throwable;)V

    return-void

    :cond_1
    :try_start_0
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-object v1, p0, Lg0/u;->v:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, -0x1

    const/4 v3, 0x0

    move v4, v2

    move v6, v4

    move-object v5, v3

    move-object v7, v5

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg0/u$b;

    invoke-virtual {v8}, Lg0/u$b;->c()I

    move-result v9

    if-ne v4, v9, :cond_2

    if-nez v5, :cond_4

    :cond_2
    invoke-virtual {v8}, Lg0/u$b;->c()I

    move-result v4

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V

    :cond_3
    invoke-virtual {p1}, Lck/q;->b()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/util/Size;

    invoke-virtual {p1}, Lck/q;->c()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, [F

    invoke-direct {p0, v5, v6, v4}, Lg0/u;->t(Landroid/util/Size;[FI)Landroid/graphics/Bitmap;

    move-result-object v5

    move v6, v2

    :cond_4
    invoke-virtual {v8}, Lg0/u$b;->b()I

    move-result v9

    if-eq v6, v9, :cond_5

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->reset()V

    invoke-virtual {v8}, Lg0/u$b;->b()I

    move-result v6

    sget-object v7, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {v5, v7, v6, v0}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v7

    :cond_5
    invoke-virtual {p1}, Lck/q;->a()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/view/Surface;

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v10, v7

    check-cast v10, [B

    invoke-static {v9, v10}, Landroidx/camera/core/ImageProcessingUtil;->p(Landroid/view/Surface;[B)Z

    invoke-virtual {v8}, Lg0/u$b;->a()Landroidx/concurrent/futures/c$a;

    move-result-object v8

    invoke-virtual {v8, v3}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :cond_6
    :try_start_2
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_2

    :catchall_0
    move-exception p1

    :try_start_3
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception p1

    invoke-direct {p0, p1}, Lg0/u;->s(Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method public static synthetic d(Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-static {p0}, Lg0/u;->F(Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method public static synthetic e(Lg0/u;IILandroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lg0/u;->G(IILandroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lg0/u;Lw/x0;)V
    .locals 0

    invoke-direct {p0, p1}, Lg0/u;->C(Lw/x0;)V

    return-void
.end method

.method public static synthetic g(Lg0/u;Lw/i1;)V
    .locals 0

    invoke-direct {p0, p1}, Lg0/u;->A(Lw/i1;)V

    return-void
.end method

.method public static synthetic h(Lg0/u;Lw/y;Lg0/d0;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lg0/u;->y(Lw/y;Lg0/d0;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i()V
    .locals 0

    invoke-static {}, Lg0/u;->v()V

    return-void
.end method

.method public static synthetic j(Lg0/u;Landroid/graphics/SurfaceTexture;Landroid/view/Surface;Lw/i1$g;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lg0/u;->z(Landroid/graphics/SurfaceTexture;Landroid/view/Surface;Lw/i1$g;)V

    return-void
.end method

.method public static synthetic k(Lg0/u;Lg0/u$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lg0/u;->E(Lg0/u$b;)V

    return-void
.end method

.method public static synthetic l(Lg0/u;Lw/x0;Lw/x0$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg0/u;->B(Lw/x0;Lw/x0$a;)V

    return-void
.end method

.method public static synthetic m(Lg0/u;Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg0/u;->w(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic n(Lg0/u;Lw/y;Lg0/d0;Landroidx/concurrent/futures/c$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lg0/u;->x(Lw/y;Lg0/d0;Landroidx/concurrent/futures/c$a;)V

    return-void
.end method

.method public static synthetic o(Lg0/u;)V
    .locals 0

    invoke-direct {p0}, Lg0/u;->D()V

    return-void
.end method

.method private p()V
    .locals 4

    iget-boolean v0, p0, Lg0/u;->u:Z

    if-eqz v0, :cond_2

    iget v0, p0, Lg0/u;->t:I

    if-nez v0, :cond_2

    iget-object v0, p0, Lg0/u;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/x0;

    invoke-interface {v1}, Lw/x0;->close()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lg0/u;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/u$b;

    invoke-virtual {v1}, Lg0/u$b;->a()Landroidx/concurrent/futures/c$a;

    move-result-object v1

    new-instance v2, Ljava/lang/Exception;

    const-string v3, "Failed to snapshot: DefaultSurfaceProcessor is released."

    invoke-direct {v2, v3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lg0/u;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lg0/u;->a:Lg0/a0;

    invoke-virtual {v0}, Lg0/a0;->D()V

    iget-object v0, p0, Lg0/u;->b:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->quit()Z

    :cond_2
    return-void
.end method

.method private q(Ljava/lang/Runnable;)V
    .locals 1

    new-instance v0, Lg0/s;

    invoke-direct {v0}, Lg0/s;-><init>()V

    invoke-direct {p0, p1, v0}, Lg0/u;->r(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    return-void
.end method

.method private r(Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lg0/u;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lg0/q;

    invoke-direct {v1, p0, p2, p1}, Lg0/q;-><init>(Lg0/u;Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    const-string v0, "DefaultSurfaceProcessor"

    const-string v1, "Unable to executor runnable"

    invoke-static {v0, v1, p1}, Lw/o0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void
.end method

.method private s(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lg0/u;->v:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/u$b;

    invoke-virtual {v1}, Lg0/u$b;->a()Landroidx/concurrent/futures/c$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lg0/u;->v:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method private t(Landroid/util/Size;[FI)Landroid/graphics/Bitmap;
    .locals 7

    const/16 v0, 0x10

    new-array v0, v0, [F

    const/4 v1, 0x0

    invoke-static {v0, v1}, Landroid/opengl/Matrix;->setIdentityM([FI)V

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v0, v1}, Landroidx/camera/core/impl/utils/o;->d([FF)V

    int-to-float v2, p3

    invoke-static {v0, v2, v1, v1}, Landroidx/camera/core/impl/utils/o;->c([FFFF)V

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move-object v3, v0

    move-object v5, p2

    invoke-static/range {v1 .. v6}, Landroid/opengl/Matrix;->multiplyMM([FI[FI[FI)V

    invoke-static {p1, p3}, Landroidx/camera/core/impl/utils/r;->k(Landroid/util/Size;I)Landroid/util/Size;

    move-result-object p1

    iget-object p2, p0, Lg0/u;->a:Lg0/a0;

    invoke-virtual {p2, p1, v0}, Lg0/a0;->H(Landroid/util/Size;[F)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method private u(Lw/y;Lg0/d0;)V
    .locals 1

    new-instance v0, Lg0/o;

    invoke-direct {v0, p0, p1, p2}, Lg0/o;-><init>(Lg0/u;Lw/y;Lg0/d0;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    :goto_0
    instance-of p2, p1, Ljava/util/concurrent/ExecutionException;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    :cond_0
    instance-of p2, p1, Ljava/lang/RuntimeException;

    if-eqz p2, :cond_1

    check-cast p1, Ljava/lang/RuntimeException;

    throw p1

    :cond_1
    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Failed to create DefaultSurfaceProcessor"

    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method private static synthetic v()V
    .locals 0

    return-void
.end method

.method private synthetic w(Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    .locals 1

    iget-boolean v0, p0, Lg0/u;->u:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Ljava/lang/Runnable;->run()V

    :goto_0
    return-void
.end method

.method private synthetic x(Lw/y;Lg0/d0;Landroidx/concurrent/futures/c$a;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lg0/u;->a:Lg0/a0;

    invoke-virtual {v0, p1, p2}, Lg0/a0;->w(Lw/y;Lg0/d0;)V

    const/4 p1, 0x0

    invoke-virtual {p3, p1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    invoke-virtual {p3, p1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    :goto_0
    return-void
.end method

.method private synthetic y(Lw/y;Lg0/d0;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lg0/p;

    invoke-direct {v0, p0, p1, p2, p3}, Lg0/p;-><init>(Lg0/u;Lw/y;Lg0/d0;Landroidx/concurrent/futures/c$a;)V

    invoke-direct {p0, v0}, Lg0/u;->q(Ljava/lang/Runnable;)V

    const-string p1, "Init GlRenderer"

    return-object p1
.end method

.method private synthetic z(Landroid/graphics/SurfaceTexture;Landroid/view/Surface;Lw/i1$g;)V
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Landroid/graphics/SurfaceTexture;->setOnFrameAvailableListener(Landroid/graphics/SurfaceTexture$OnFrameAvailableListener;)V

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    invoke-virtual {p2}, Landroid/view/Surface;->release()V

    iget p1, p0, Lg0/u;->t:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lg0/u;->t:I

    invoke-direct {p0}, Lg0/u;->p()V

    return-void
.end method


# virtual methods
.method public a(Lw/x0;)V
    .locals 2

    iget-object v0, p0, Lg0/u;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Lw/x0;->close()V

    return-void

    :cond_0
    new-instance v0, Lg0/f;

    invoke-direct {v0, p0, p1}, Lg0/f;-><init>(Lg0/u;Lw/x0;)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lg0/k;

    invoke-direct {v1, p1}, Lg0/k;-><init>(Lw/x0;)V

    invoke-direct {p0, v0, v1}, Lg0/u;->r(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    return-void
.end method

.method public b(Lw/i1;)V
    .locals 2

    iget-object v0, p0, Lg0/u;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lw/i1;->y()Z

    return-void

    :cond_0
    new-instance v0, Lg0/l;

    invoke-direct {v0, p0, p1}, Lg0/l;-><init>(Lg0/u;Lw/i1;)V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lg0/m;

    invoke-direct {v1, p1}, Lg0/m;-><init>(Lw/i1;)V

    invoke-direct {p0, v0, v1}, Lg0/u;->r(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(II)Lcom/google/common/util/concurrent/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    new-instance v0, Lg0/r;

    invoke-direct {v0, p0, p1, p2}, Lg0/r;-><init>(Lg0/u;II)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    invoke-static {p1}, La0/f;->j(Lcom/google/common/util/concurrent/f;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method

.method public onFrameAvailable(Landroid/graphics/SurfaceTexture;)V
    .locals 9

    iget-object v0, p0, Lg0/u;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->updateTexImage()V

    iget-object v0, p0, Lg0/u;->f:[F

    invoke-virtual {p1, v0}, Landroid/graphics/SurfaceTexture;->getTransformMatrix([F)V

    iget-object v0, p0, Lg0/u;->s:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/Surface;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw/x0;

    iget-object v4, p0, Lg0/u;->r:[F

    iget-object v5, p0, Lg0/u;->f:[F

    invoke-interface {v2, v4, v5}, Lw/x0;->y0([F[F)V

    invoke-interface {v2}, Lw/x0;->getFormat()I

    move-result v4

    const/16 v5, 0x22

    if-ne v4, v5, :cond_1

    :try_start_0
    iget-object v2, p0, Lg0/u;->a:Lg0/a0;

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->getTimestamp()J

    move-result-wide v4

    iget-object v6, p0, Lg0/u;->r:[F

    invoke-virtual {v2, v4, v5, v6, v3}, Lg0/a0;->G(J[FLandroid/view/Surface;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v2

    const-string v3, "DefaultSurfaceProcessor"

    const-string v4, "Failed to render with OpenGL."

    invoke-static {v3, v4, v2}, Lw/o0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Lw/x0;->getFormat()I

    move-result v4

    const/16 v5, 0x100

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-ne v4, v5, :cond_2

    move v4, v6

    goto :goto_1

    :cond_2
    move v4, v7

    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "Unsupported format: "

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v2}, Lw/x0;->getFormat()I

    move-result v8

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    move v6, v7

    :goto_2
    const-string v1, "Only one JPEG output is supported."

    invoke-static {v6, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    new-instance v1, Lck/q;

    invoke-interface {v2}, Lw/x0;->p()Landroid/util/Size;

    move-result-object v2

    iget-object v4, p0, Lg0/u;->r:[F

    invoke-virtual {v4}, [F->clone()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, [F

    invoke-direct {v1, v3, v2, v4}, Lck/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    :try_start_1
    invoke-direct {p0, v1}, Lg0/u;->H(Lck/q;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move-exception p1

    invoke-direct {p0, p1}, Lg0/u;->s(Ljava/lang/Throwable;)V

    :goto_3
    return-void
.end method

.method public release()V
    .locals 2

    iget-object v0, p0, Lg0/u;->e:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lg0/n;

    invoke-direct {v0, p0}, Lg0/n;-><init>(Lg0/u;)V

    invoke-direct {p0, v0}, Lg0/u;->q(Ljava/lang/Runnable;)V

    return-void
.end method
