.class public Lg0/v0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/v0$b;,
        Lg0/v0$c;,
        Lg0/v0$d;
    }
.end annotation


# instance fields
.field final a:Lg0/r0;

.field final b:Landroidx/camera/core/impl/c0;

.field private c:Lg0/v0$c;

.field private d:Lg0/v0$b;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/c0;Lg0/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/v0;->b:Landroidx/camera/core/impl/c0;

    iput-object p2, p0, Lg0/v0;->a:Lg0/r0;

    return-void
.end method

.method public static synthetic a(Ljava/util/Map;Lw/i1$h;)V
    .locals 0

    invoke-static {p0, p1}, Lg0/v0;->h(Ljava/util/Map;Lw/i1$h;)V

    return-void
.end method

.method public static synthetic b(Lg0/v0;Lg0/n0;Ljava/util/Map$Entry;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg0/v0;->g(Lg0/n0;Ljava/util/Map$Entry;)V

    return-void
.end method

.method public static synthetic c(Lg0/v0;)V
    .locals 0

    invoke-direct {p0}, Lg0/v0;->f()V

    return-void
.end method

.method private d(Lg0/n0;Ljava/util/Map$Entry;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/n0;",
            "Ljava/util/Map$Entry<",
            "Lg0/v0$d;",
            "Lg0/n0;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lg0/n0;

    invoke-virtual {p1}, Lg0/n0;->t()Landroidx/camera/core/impl/b2;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/b2;->e()Landroid/util/Size;

    move-result-object v2

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/v0$d;

    invoke-virtual {v0}, Lg0/v0$d;->b()I

    move-result v3

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/v0$d;

    invoke-virtual {v0}, Lg0/v0$d;->a()Landroid/graphics/Rect;

    move-result-object v4

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/v0$d;

    invoke-virtual {v0}, Lg0/v0$d;->d()I

    move-result v5

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lg0/v0$d;

    invoke-virtual {p2}, Lg0/v0$d;->c()Z

    move-result v6

    invoke-virtual {p1}, Lg0/n0;->v()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lg0/v0;->b:Landroidx/camera/core/impl/c0;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move-object v7, p1

    invoke-virtual/range {v1 .. v7}, Lg0/n0;->j(Landroid/util/Size;ILandroid/graphics/Rect;IZLandroidx/camera/core/impl/c0;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    new-instance p2, Lg0/v0$a;

    invoke-direct {p2, p0}, Lg0/v0$a;-><init>(Lg0/v0;)V

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    invoke-static {p1, p2, v0}, La0/f;->b(Lcom/google/common/util/concurrent/f;La0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method private synthetic f()V
    .locals 2

    iget-object v0, p0, Lg0/v0;->c:Lg0/v0$c;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/n0;

    invoke-virtual {v1}, Lg0/n0;->i()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private synthetic g(Lg0/n0;Ljava/util/Map$Entry;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lg0/v0;->d(Lg0/n0;Ljava/util/Map$Entry;)V

    return-void
.end method

.method private static synthetic h(Ljava/util/Map;Lw/i1$h;)V
    .locals 3

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p1}, Lw/i1$h;->c()I

    move-result v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg0/v0$d;

    invoke-virtual {v2}, Lg0/v0$d;->d()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg0/v0$d;

    invoke-virtual {v2}, Lg0/v0$d;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    neg-int v1, v1

    :cond_0
    invoke-static {v1}, Landroidx/camera/core/impl/utils/r;->q(I)I

    move-result v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/n0;

    const/4 v2, -0x1

    invoke-virtual {v0, v1, v2}, Lg0/n0;->D(II)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private j(Lg0/n0;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/n0;",
            "Ljava/util/Map<",
            "Lg0/v0$d;",
            "Lg0/n0;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-direct {p0, p1, v0}, Lg0/v0;->d(Lg0/n0;Ljava/util/Map$Entry;)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/n0;

    new-instance v2, Lg0/t0;

    invoke-direct {v2, p0, p1, v0}, Lg0/t0;-><init>(Lg0/v0;Lg0/n0;Ljava/util/Map$Entry;)V

    invoke-virtual {v1, v2}, Lg0/n0;->f(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private k(Lg0/n0;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/n0;",
            "Ljava/util/Map<",
            "Lg0/v0$d;",
            "Lg0/n0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lg0/v0;->b:Landroidx/camera/core/impl/c0;

    invoke-virtual {p1, v0}, Lg0/n0;->k(Landroidx/camera/core/impl/c0;)Lw/i1;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lg0/v0;->l(Lw/i1;Ljava/util/Map;)V

    iget-object p2, p0, Lg0/v0;->a:Lg0/r0;

    invoke-interface {p2, p1}, Lw/y0;->b(Lw/i1;)V

    return-void
.end method

.method private n(Lg0/n0;Lg0/v0$d;)Lg0/n0;
    .locals 13

    invoke-virtual {p2}, Lg0/v0$d;->a()Landroid/graphics/Rect;

    move-result-object v0

    invoke-virtual {p2}, Lg0/v0$d;->d()I

    move-result v1

    invoke-virtual {p2}, Lg0/v0$d;->c()Z

    move-result v2

    new-instance v7, Landroid/graphics/Matrix;

    invoke-virtual {p1}, Lg0/n0;->s()Landroid/graphics/Matrix;

    move-result-object v3

    invoke-direct {v7, v3}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    invoke-virtual {p2}, Lg0/v0$d;->e()Landroid/util/Size;

    move-result-object v4

    invoke-static {v4}, Landroidx/camera/core/impl/utils/r;->n(Landroid/util/Size;)Landroid/graphics/RectF;

    move-result-object v4

    invoke-static {v3, v4, v1, v2}, Landroidx/camera/core/impl/utils/r;->c(Landroid/graphics/RectF;Landroid/graphics/RectF;IZ)Landroid/graphics/Matrix;

    move-result-object v3

    invoke-virtual {v7, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    invoke-static {v0, v1}, Landroidx/camera/core/impl/utils/r;->d(Landroid/graphics/Rect;I)Landroid/util/Size;

    move-result-object v0

    invoke-virtual {p2}, Lg0/v0$d;->e()Landroid/util/Size;

    move-result-object v3

    invoke-static {v0, v3}, Landroidx/camera/core/impl/utils/r;->g(Landroid/util/Size;Landroid/util/Size;)Z

    move-result v0

    invoke-static {v0}, Landroidx/core/util/h;->a(Z)V

    invoke-virtual {p1}, Lg0/n0;->t()Landroidx/camera/core/impl/b2;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/b2;->f()Landroidx/camera/core/impl/b2$a;

    move-result-object v0

    invoke-virtual {p2}, Lg0/v0$d;->e()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/camera/core/impl/b2$a;->e(Landroid/util/Size;)Landroidx/camera/core/impl/b2$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/b2$a;->a()Landroidx/camera/core/impl/b2;

    move-result-object v6

    new-instance v0, Lg0/n0;

    invoke-virtual {p2}, Lg0/v0$d;->f()I

    move-result v4

    invoke-virtual {p2}, Lg0/v0$d;->b()I

    move-result v5

    const/4 v8, 0x0

    invoke-virtual {p2}, Lg0/v0$d;->e()Landroid/util/Size;

    move-result-object p2

    invoke-static {p2}, Landroidx/camera/core/impl/utils/r;->l(Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object v9

    invoke-virtual {p1}, Lg0/n0;->r()I

    move-result p2

    sub-int v10, p2, v1

    const/4 v11, -0x1

    invoke-virtual {p1}, Lg0/n0;->q()Z

    move-result p1

    if-eq p1, v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    move v12, p1

    move-object v3, v0

    invoke-direct/range {v3 .. v12}, Lg0/n0;-><init>(IILandroidx/camera/core/impl/b2;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    return-object v0
.end method


# virtual methods
.method public e()Lg0/r0;
    .locals 1

    iget-object v0, p0, Lg0/v0;->a:Lg0/r0;

    return-object v0
.end method

.method public i()V
    .locals 2

    iget-object v0, p0, Lg0/v0;->a:Lg0/r0;

    invoke-interface {v0}, Lg0/r0;->release()V

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lg0/u0;

    invoke-direct {v1, p0}, Lg0/u0;-><init>(Lg0/v0;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method l(Lw/i1;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/i1;",
            "Ljava/util/Map<",
            "Lg0/v0$d;",
            "Lg0/n0;",
            ">;)V"
        }
    .end annotation

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    new-instance v1, Lg0/s0;

    invoke-direct {v1, p2}, Lg0/s0;-><init>(Ljava/util/Map;)V

    invoke-virtual {p1, v0, v1}, Lw/i1;->w(Ljava/util/concurrent/Executor;Lw/i1$i;)V

    return-void
.end method

.method public m(Lg0/v0$b;)Lg0/v0$c;
    .locals 4

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iput-object p1, p0, Lg0/v0;->d:Lg0/v0$b;

    new-instance v0, Lg0/v0$c;

    invoke-direct {v0}, Lg0/v0$c;-><init>()V

    iput-object v0, p0, Lg0/v0;->c:Lg0/v0$c;

    invoke-virtual {p1}, Lg0/v0$b;->b()Lg0/n0;

    move-result-object v0

    invoke-virtual {p1}, Lg0/v0$b;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/v0$d;

    iget-object v2, p0, Lg0/v0;->c:Lg0/v0$c;

    invoke-direct {p0, v0, v1}, Lg0/v0;->n(Lg0/n0;Lg0/v0$d;)Lg0/n0;

    move-result-object v3

    invoke-virtual {v2, v1, v3}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lg0/v0;->c:Lg0/v0$c;

    invoke-direct {p0, v0, p1}, Lg0/v0;->k(Lg0/n0;Ljava/util/Map;)V

    iget-object p1, p0, Lg0/v0;->c:Lg0/v0$c;

    invoke-direct {p0, v0, p1}, Lg0/v0;->j(Lg0/n0;Ljava/util/Map;)V

    iget-object p1, p0, Lg0/v0;->c:Lg0/v0$c;

    return-object p1
.end method
