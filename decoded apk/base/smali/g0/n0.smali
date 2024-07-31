.class public Lg0/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/n0$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Landroid/graphics/Matrix;

.field private final c:Z

.field private final d:Landroid/graphics/Rect;

.field private final e:Z

.field private final f:I

.field private final g:Landroidx/camera/core/impl/b2;

.field private h:I

.field private i:I

.field private j:Lg0/q0;

.field private k:Z

.field private l:Lw/i1;

.field private m:Lg0/n0$a;

.field private final n:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Runnable;",
            ">;"
        }
    .end annotation
.end field

.field private o:Z


# direct methods
.method public constructor <init>(IILandroidx/camera/core/impl/b2;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg0/n0;->k:Z

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iput-object v1, p0, Lg0/n0;->n:Ljava/util/Set;

    iput-boolean v0, p0, Lg0/n0;->o:Z

    iput p1, p0, Lg0/n0;->f:I

    iput p2, p0, Lg0/n0;->a:I

    iput-object p3, p0, Lg0/n0;->g:Landroidx/camera/core/impl/b2;

    iput-object p4, p0, Lg0/n0;->b:Landroid/graphics/Matrix;

    iput-boolean p5, p0, Lg0/n0;->c:Z

    iput-object p6, p0, Lg0/n0;->d:Landroid/graphics/Rect;

    iput p7, p0, Lg0/n0;->i:I

    iput p8, p0, Lg0/n0;->h:I

    iput-boolean p9, p0, Lg0/n0;->e:Z

    new-instance p1, Lg0/n0$a;

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->e()Landroid/util/Size;

    move-result-object p3

    invoke-direct {p1, p3, p2}, Lg0/n0$a;-><init>(Landroid/util/Size;I)V

    iput-object p1, p0, Lg0/n0;->m:Lg0/n0$a;

    return-void
.end method

.method private synthetic A(II)V
    .locals 2

    iget v0, p0, Lg0/n0;->i:I

    const/4 v1, 0x1

    if-eq v0, p1, :cond_0

    iput p1, p0, Lg0/n0;->i:I

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iget v0, p0, Lg0/n0;->h:I

    if-eq v0, p2, :cond_1

    iput p2, p0, Lg0/n0;->h:I

    goto :goto_1

    :cond_1
    move v1, p1

    :goto_1
    if-eqz v1, :cond_2

    invoke-direct {p0}, Lg0/n0;->B()V

    :cond_2
    return-void
.end method

.method private B()V
    .locals 7

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Lg0/n0;->l:Lw/i1;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lg0/n0;->d:Landroid/graphics/Rect;

    iget v2, p0, Lg0/n0;->i:I

    iget v3, p0, Lg0/n0;->h:I

    invoke-virtual {p0}, Lg0/n0;->v()Z

    move-result v4

    iget-object v5, p0, Lg0/n0;->b:Landroid/graphics/Matrix;

    iget-boolean v6, p0, Lg0/n0;->e:Z

    invoke-static/range {v1 .. v6}, Lw/i1$h;->g(Landroid/graphics/Rect;IIZLandroid/graphics/Matrix;Z)Lw/i1$h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lw/i1;->x(Lw/i1$h;)V

    :cond_0
    return-void
.end method

.method public static synthetic a(Lg0/n0;II)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg0/n0;->A(II)V

    return-void
.end method

.method public static synthetic b(Lg0/n0;Lg0/n0$a;ILandroid/util/Size;Landroid/graphics/Rect;IZLandroidx/camera/core/impl/c0;Landroid/view/Surface;)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-direct/range {p0 .. p8}, Lg0/n0;->x(Lg0/n0$a;ILandroid/util/Size;Landroid/graphics/Rect;IZLandroidx/camera/core/impl/c0;Landroid/view/Surface;)Lcom/google/common/util/concurrent/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lg0/n0;)V
    .locals 0

    invoke-direct {p0}, Lg0/n0;->z()V

    return-void
.end method

.method public static synthetic d(Lg0/n0;)V
    .locals 0

    invoke-direct {p0}, Lg0/n0;->m()V

    return-void
.end method

.method public static synthetic e(Lg0/n0;)V
    .locals 0

    invoke-direct {p0}, Lg0/n0;->y()V

    return-void
.end method

.method private g()V
    .locals 3

    iget-boolean v0, p0, Lg0/n0;->k:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const-string v2, "Consumer can only be linked once."

    invoke-static {v0, v2}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iput-boolean v1, p0, Lg0/n0;->k:Z

    return-void
.end method

.method private h()V
    .locals 2

    iget-boolean v0, p0, Lg0/n0;->o:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Edge is already closed."

    invoke-static {v0, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    return-void
.end method

.method private m()V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Lg0/n0;->m:Lg0/n0$a;

    invoke-virtual {v0}, Landroidx/camera/core/impl/r0;->d()V

    iget-object v0, p0, Lg0/n0;->j:Lg0/q0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg0/q0;->l()V

    const/4 v0, 0x0

    iput-object v0, p0, Lg0/n0;->j:Lg0/q0;

    :cond_0
    return-void
.end method

.method private synthetic x(Lg0/n0$a;ILandroid/util/Size;Landroid/graphics/Rect;IZLandroidx/camera/core/impl/c0;Landroid/view/Surface;)Lcom/google/common/util/concurrent/f;
    .locals 13

    move-object v1, p0

    invoke-static/range {p8 .. p8}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p1}, Landroidx/camera/core/impl/r0;->l()V
    :try_end_0
    .catch Landroidx/camera/core/impl/r0$a; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Lg0/q0;

    invoke-virtual {p0}, Lg0/n0;->u()I

    move-result v4

    iget-object v2, v1, Lg0/n0;->g:Landroidx/camera/core/impl/b2;

    invoke-virtual {v2}, Landroidx/camera/core/impl/b2;->e()Landroid/util/Size;

    move-result-object v6

    iget-object v12, v1, Lg0/n0;->b:Landroid/graphics/Matrix;

    move-object v2, v0

    move-object/from16 v3, p8

    move v5, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move/from16 v9, p5

    move/from16 v10, p6

    move-object/from16 v11, p7

    invoke-direct/range {v2 .. v12}, Lg0/q0;-><init>(Landroid/view/Surface;IILandroid/util/Size;Landroid/util/Size;Landroid/graphics/Rect;IZLandroidx/camera/core/impl/c0;Landroid/graphics/Matrix;)V

    invoke-virtual {v0}, Lg0/q0;->g()Lcom/google/common/util/concurrent/f;

    move-result-object v2

    new-instance v3, Lg0/k0;

    move-object v4, p1

    invoke-direct {v3, p1}, Lg0/k0;-><init>(Lg0/n0$a;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iput-object v0, v1, Lg0/n0;->j:Lg0/q0;

    invoke-static {v0}, La0/f;->h(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    move-object v2, v0

    invoke-static {v2}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0
.end method

.method private synthetic y()V
    .locals 1

    iget-boolean v0, p0, Lg0/n0;->o:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lg0/n0;->w()V

    :cond_0
    return-void
.end method

.method private synthetic z()V
    .locals 2

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lg0/i0;

    invoke-direct {v1, p0}, Lg0/i0;-><init>(Lg0/n0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public C(Landroidx/camera/core/impl/r0;)V
    .locals 2

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-direct {p0}, Lg0/n0;->h()V

    iget-object v0, p0, Lg0/n0;->m:Lg0/n0$a;

    new-instance v1, Lg0/g0;

    invoke-direct {v1, p0}, Lg0/g0;-><init>(Lg0/n0;)V

    invoke-virtual {v0, p1, v1}, Lg0/n0$a;->v(Landroidx/camera/core/impl/r0;Ljava/lang/Runnable;)Z

    return-void
.end method

.method public D(II)V
    .locals 1

    new-instance v0, Lg0/e0;

    invoke-direct {v0, p0, p1, p2}, Lg0/e0;-><init>(Lg0/n0;II)V

    invoke-static {v0}, Landroidx/camera/core/impl/utils/q;->d(Ljava/lang/Runnable;)V

    return-void
.end method

.method public f(Ljava/lang/Runnable;)V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-direct {p0}, Lg0/n0;->h()V

    iget-object v0, p0, Lg0/n0;->n:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final i()V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-direct {p0}, Lg0/n0;->m()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lg0/n0;->o:Z

    return-void
.end method

.method public j(Landroid/util/Size;ILandroid/graphics/Rect;IZLandroidx/camera/core/impl/c0;)Lcom/google/common/util/concurrent/f;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Size;",
            "I",
            "Landroid/graphics/Rect;",
            "IZ",
            "Landroidx/camera/core/impl/c0;",
            ")",
            "Lcom/google/common/util/concurrent/f<",
            "Lw/x0;",
            ">;"
        }
    .end annotation

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-direct {p0}, Lg0/n0;->h()V

    invoke-direct {p0}, Lg0/n0;->g()V

    move-object v9, p0

    iget-object v2, v9, Lg0/n0;->m:Lg0/n0$a;

    invoke-virtual {v2}, Landroidx/camera/core/impl/r0;->j()Lcom/google/common/util/concurrent/f;

    move-result-object v10

    new-instance v11, Lg0/j0;

    move-object v0, v11

    move-object v1, p0

    move v3, p2

    move-object v4, p1

    move-object v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move-object/from16 v8, p6

    invoke-direct/range {v0 .. v8}, Lg0/j0;-><init>(Lg0/n0;Lg0/n0$a;ILandroid/util/Size;Landroid/graphics/Rect;IZLandroidx/camera/core/impl/c0;)V

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-static {v10, v11, v0}, La0/f;->p(Lcom/google/common/util/concurrent/f;La0/a;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0
.end method

.method public k(Landroidx/camera/core/impl/c0;)Lw/i1;
    .locals 7

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-direct {p0}, Lg0/n0;->h()V

    new-instance v6, Lw/i1;

    iget-object v0, p0, Lg0/n0;->g:Landroidx/camera/core/impl/b2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/b2;->e()Landroid/util/Size;

    move-result-object v1

    iget-object v0, p0, Lg0/n0;->g:Landroidx/camera/core/impl/b2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/b2;->b()Lw/y;

    move-result-object v3

    iget-object v0, p0, Lg0/n0;->g:Landroidx/camera/core/impl/b2;

    invoke-virtual {v0}, Landroidx/camera/core/impl/b2;->c()Landroid/util/Range;

    move-result-object v4

    new-instance v5, Lg0/f0;

    invoke-direct {v5, p0}, Lg0/f0;-><init>(Lg0/n0;)V

    move-object v0, v6

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lw/i1;-><init>(Landroid/util/Size;Landroidx/camera/core/impl/c0;Lw/y;Landroid/util/Range;Ljava/lang/Runnable;)V

    :try_start_0
    invoke-virtual {v6}, Lw/i1;->j()Landroidx/camera/core/impl/r0;

    move-result-object p1

    iget-object v0, p0, Lg0/n0;->m:Lg0/n0$a;

    new-instance v1, Lg0/g0;

    invoke-direct {v1, p0}, Lg0/g0;-><init>(Lg0/n0;)V

    invoke-virtual {v0, p1, v1}, Lg0/n0$a;->v(Landroidx/camera/core/impl/r0;Ljava/lang/Runnable;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lg0/n0;->m:Lg0/n0$a;

    invoke-virtual {v0}, Landroidx/camera/core/impl/r0;->k()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lg0/h0;

    invoke-direct {v1, p1}, Lg0/h0;-><init>(Landroidx/camera/core/impl/r0;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    :try_end_0
    .catch Landroidx/camera/core/impl/r0$a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    iput-object v6, p0, Lg0/n0;->l:Lw/i1;

    invoke-direct {p0}, Lg0/n0;->B()V

    return-object v6

    :catch_0
    move-exception p1

    invoke-virtual {v6}, Lw/i1;->y()Z

    throw p1

    :catch_1
    move-exception p1

    new-instance v0, Ljava/lang/AssertionError;

    const-string v1, "Surface is somehow already closed"

    invoke-direct {v0, v1, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final l()V
    .locals 0

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-direct {p0}, Lg0/n0;->h()V

    invoke-direct {p0}, Lg0/n0;->m()V

    return-void
.end method

.method public n()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Lg0/n0;->d:Landroid/graphics/Rect;

    return-object v0
.end method

.method public o()Landroidx/camera/core/impl/r0;
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-direct {p0}, Lg0/n0;->h()V

    invoke-direct {p0}, Lg0/n0;->g()V

    iget-object v0, p0, Lg0/n0;->m:Lg0/n0$a;

    return-object v0
.end method

.method public p()I
    .locals 1

    iget v0, p0, Lg0/n0;->a:I

    return v0
.end method

.method public q()Z
    .locals 1

    iget-boolean v0, p0, Lg0/n0;->e:Z

    return v0
.end method

.method public r()I
    .locals 1

    iget v0, p0, Lg0/n0;->i:I

    return v0
.end method

.method public s()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Lg0/n0;->b:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public t()Landroidx/camera/core/impl/b2;
    .locals 1

    iget-object v0, p0, Lg0/n0;->g:Landroidx/camera/core/impl/b2;

    return-object v0
.end method

.method public u()I
    .locals 1

    iget v0, p0, Lg0/n0;->f:I

    return v0
.end method

.method public v()Z
    .locals 1

    iget-boolean v0, p0, Lg0/n0;->c:Z

    return v0
.end method

.method public w()V
    .locals 3

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-direct {p0}, Lg0/n0;->h()V

    iget-object v0, p0, Lg0/n0;->m:Lg0/n0$a;

    invoke-virtual {v0}, Lg0/n0$a;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lg0/n0;->m()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lg0/n0;->k:Z

    new-instance v0, Lg0/n0$a;

    iget-object v1, p0, Lg0/n0;->g:Landroidx/camera/core/impl/b2;

    invoke-virtual {v1}, Landroidx/camera/core/impl/b2;->e()Landroid/util/Size;

    move-result-object v1

    iget v2, p0, Lg0/n0;->a:I

    invoke-direct {v0, v1, v2}, Lg0/n0$a;-><init>(Landroid/util/Size;I)V

    iput-object v0, p0, Lg0/n0;->m:Lg0/n0$a;

    iget-object v0, p0, Lg0/n0;->n:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_1
    return-void
.end method
