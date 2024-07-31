.class public Li0/d;
.super Landroidx/camera/core/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li0/d$a;
    }
.end annotation


# instance fields
.field private final n:Li0/f;

.field private final o:Li0/g;

.field private p:Lg0/v0;

.field private q:Lg0/v0;

.field private r:Lg0/n0;

.field private s:Lg0/n0;

.field t:Landroidx/camera/core/impl/y1$b;


# direct methods
.method public constructor <init>(Landroidx/camera/core/impl/c0;Ljava/util/Set;Landroidx/camera/core/impl/l2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/c0;",
            "Ljava/util/Set<",
            "Landroidx/camera/core/w;",
            ">;",
            "Landroidx/camera/core/impl/l2;",
            ")V"
        }
    .end annotation

    invoke-static {p2}, Li0/d;->c0(Ljava/util/Set;)Li0/f;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/camera/core/w;-><init>(Landroidx/camera/core/impl/k2;)V

    invoke-static {p2}, Li0/d;->c0(Ljava/util/Set;)Li0/f;

    move-result-object v0

    iput-object v0, p0, Li0/d;->n:Li0/f;

    new-instance v0, Li0/g;

    new-instance v1, Li0/c;

    invoke-direct {v1, p0}, Li0/c;-><init>(Li0/d;)V

    invoke-direct {v0, p1, p2, p3, v1}, Li0/g;-><init>(Landroidx/camera/core/impl/c0;Ljava/util/Set;Landroidx/camera/core/impl/l2;Li0/d$a;)V

    iput-object v0, p0, Li0/d;->o:Li0/g;

    return-void
.end method

.method public static synthetic V(Li0/d;II)Lcom/google/common/util/concurrent/f;
    .locals 0

    invoke-direct {p0, p1, p2}, Li0/d;->f0(II)Lcom/google/common/util/concurrent/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic W(Li0/d;Ljava/lang/String;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Li0/d;->e0(Ljava/lang/String;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V

    return-void
.end method

.method private X(Landroidx/camera/core/impl/y1$b;Ljava/lang/String;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/b2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/y1$b;",
            "Ljava/lang/String;",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Landroidx/camera/core/impl/b2;",
            ")V"
        }
    .end annotation

    new-instance v0, Li0/b;

    invoke-direct {v0, p0, p2, p3, p4}, Li0/b;-><init>(Li0/d;Ljava/lang/String;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/b2;)V

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/y1$b;->f(Landroidx/camera/core/impl/y1$c;)Landroidx/camera/core/impl/y1$b;

    return-void
.end method

.method private Y()V
    .locals 2

    iget-object v0, p0, Li0/d;->r:Lg0/n0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg0/n0;->i()V

    iput-object v1, p0, Li0/d;->r:Lg0/n0;

    :cond_0
    iget-object v0, p0, Li0/d;->s:Lg0/n0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lg0/n0;->i()V

    iput-object v1, p0, Li0/d;->s:Lg0/n0;

    :cond_1
    iget-object v0, p0, Li0/d;->q:Lg0/v0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lg0/v0;->i()V

    iput-object v1, p0, Li0/d;->q:Lg0/v0;

    :cond_2
    iget-object v0, p0, Li0/d;->p:Lg0/v0;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lg0/v0;->i()V

    iput-object v1, p0, Li0/d;->p:Lg0/v0;

    :cond_3
    return-void
.end method

.method private Z(Ljava/lang/String;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/y1;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Landroidx/camera/core/impl/b2;",
            ")",
            "Landroidx/camera/core/impl/y1;"
        }
    .end annotation

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/c0;

    new-instance v11, Lg0/n0;

    const/4 v2, 0x3

    const/16 v3, 0x22

    invoke-virtual {p0}, Landroidx/camera/core/w;->r()Landroid/graphics/Matrix;

    move-result-object v5

    invoke-interface {v0}, Landroidx/camera/core/impl/c0;->m()Z

    move-result v6

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->e()Landroid/util/Size;

    move-result-object v1

    invoke-direct {p0, v1}, Li0/d;->b0(Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object v7

    invoke-static {v7}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Landroidx/camera/core/w;->o(Landroidx/camera/core/impl/c0;)I

    move-result v8

    const/4 v9, -0x1

    invoke-virtual {p0, v0}, Landroidx/camera/core/w;->z(Landroidx/camera/core/impl/c0;)Z

    move-result v10

    move-object v1, v11

    move-object v4, p3

    invoke-direct/range {v1 .. v10}, Lg0/n0;-><init>(IILandroidx/camera/core/impl/b2;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    iput-object v11, p0, Li0/d;->r:Lg0/n0;

    invoke-direct {p0, v11, v0}, Li0/d;->d0(Lg0/n0;Landroidx/camera/core/impl/c0;)Lg0/n0;

    move-result-object v1

    iput-object v1, p0, Li0/d;->s:Lg0/n0;

    new-instance v1, Lg0/v0;

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->b()Lw/y;

    move-result-object v2

    invoke-static {v2}, Lg0/u$a;->a(Lw/y;)Lg0/r0;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lg0/v0;-><init>(Landroidx/camera/core/impl/c0;Lg0/r0;)V

    iput-object v1, p0, Li0/d;->q:Lg0/v0;

    iget-object v0, p0, Li0/d;->o:Li0/g;

    iget-object v1, p0, Li0/d;->s:Lg0/n0;

    invoke-virtual {v0, v1}, Li0/g;->w(Lg0/n0;)Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Li0/d;->q:Lg0/v0;

    iget-object v2, p0, Li0/d;->s:Lg0/n0;

    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v2, v3}, Lg0/v0$b;->c(Lg0/n0;Ljava/util/List;)Lg0/v0$b;

    move-result-object v2

    invoke-virtual {v1, v2}, Lg0/v0;->m(Lg0/v0$b;)Lg0/v0$c;

    move-result-object v1

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/camera/core/w;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg0/n0;

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Li0/d;->o:Li0/g;

    invoke-virtual {v0, v2}, Li0/g;->G(Ljava/util/Map;)V

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->e()Landroid/util/Size;

    move-result-object v0

    invoke-static {p2, v0}, Landroidx/camera/core/impl/y1$b;->p(Landroidx/camera/core/impl/k2;Landroid/util/Size;)Landroidx/camera/core/impl/y1$b;

    move-result-object v0

    iget-object v1, p0, Li0/d;->r:Lg0/n0;

    invoke-virtual {v1}, Lg0/n0;->o()Landroidx/camera/core/impl/r0;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/y1$b;->l(Landroidx/camera/core/impl/r0;)Landroidx/camera/core/impl/y1$b;

    iget-object v1, p0, Li0/d;->o:Li0/g;

    invoke-virtual {v1}, Li0/g;->y()Landroidx/camera/core/impl/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/y1$b;->j(Landroidx/camera/core/impl/k;)Landroidx/camera/core/impl/y1$b;

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->d()Landroidx/camera/core/impl/n0;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->d()Landroidx/camera/core/impl/n0;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/y1$b;->g(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/y1$b;

    :cond_1
    invoke-direct {p0, v0, p1, p2, p3}, Li0/d;->X(Landroidx/camera/core/impl/y1$b;Ljava/lang/String;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/b2;)V

    iput-object v0, p0, Li0/d;->t:Landroidx/camera/core/impl/y1$b;

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1$b;->o()Landroidx/camera/core/impl/y1;

    move-result-object p1

    return-object p1
.end method

.method private b0(Landroid/util/Size;)Landroid/graphics/Rect;
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/core/w;->w()Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/w;->w()Landroid/graphics/Rect;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0
.end method

.method private static c0(Ljava/util/Set;)Li0/f;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Landroidx/camera/core/w;",
            ">;)",
            "Li0/f;"
        }
    .end annotation

    new-instance v0, Li0/e;

    invoke-direct {v0}, Li0/e;-><init>()V

    invoke-virtual {v0}, Li0/e;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v1, Landroidx/camera/core/impl/e1;->f:Landroidx/camera/core/impl/n0$a;

    const/16 v2, 0x22

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    sget-object v1, Landroidx/camera/core/impl/k2;->A:Landroidx/camera/core/impl/n0$a;

    sget-object v2, Landroidx/camera/core/impl/l2$b;->STREAM_SHARING:Landroidx/camera/core/impl/l2$b;

    invoke-interface {v0, v1, v2}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/w;

    invoke-virtual {v2}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v3

    sget-object v4, Landroidx/camera/core/impl/k2;->A:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v3, v4}, Landroidx/camera/core/impl/u1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v2

    invoke-interface {v2}, Landroidx/camera/core/impl/k2;->N()Landroidx/camera/core/impl/l2$b;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v2, "StreamSharing"

    const-string v3, "A child does not have capture type."

    invoke-static {v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_1
    sget-object p0, Li0/f;->H:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, p0, v1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    sget-object p0, Landroidx/camera/core/impl/f1;->k:Landroidx/camera/core/impl/n0$a;

    const/4 v1, 0x2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    new-instance p0, Li0/f;

    invoke-static {v0}, Landroidx/camera/core/impl/p1;->Y(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/p1;

    move-result-object v0

    invoke-direct {p0, v0}, Li0/f;-><init>(Landroidx/camera/core/impl/p1;)V

    return-object p0
.end method

.method private d0(Lg0/n0;Landroidx/camera/core/impl/c0;)Lg0/n0;
    .locals 8

    invoke-virtual {p0}, Landroidx/camera/core/w;->k()Lw/k;

    move-result-object v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lg0/v0;

    invoke-virtual {p0}, Landroidx/camera/core/w;->k()Lw/k;

    move-result-object v1

    invoke-virtual {v1}, Lw/k;->a()Lg0/r0;

    move-result-object v1

    invoke-direct {v0, p2, v1}, Lg0/v0;-><init>(Landroidx/camera/core/impl/c0;Lg0/r0;)V

    iput-object v0, p0, Li0/d;->p:Lg0/v0;

    invoke-virtual {p1}, Lg0/n0;->u()I

    move-result v2

    invoke-virtual {p1}, Lg0/n0;->p()I

    move-result v3

    invoke-virtual {p1}, Lg0/n0;->n()Landroid/graphics/Rect;

    move-result-object v4

    invoke-virtual {p1}, Lg0/n0;->n()Landroid/graphics/Rect;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, v0}, Landroidx/camera/core/impl/utils/r;->d(Landroid/graphics/Rect;I)Landroid/util/Size;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v6, 0x0

    invoke-static/range {v2 .. v7}, Lg0/v0$d;->h(IILandroid/graphics/Rect;Landroid/util/Size;IZ)Lg0/v0$d;

    move-result-object p2

    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1, v0}, Lg0/v0$b;->c(Lg0/n0;Ljava/util/List;)Lg0/v0$b;

    move-result-object p1

    iget-object v0, p0, Li0/d;->p:Lg0/v0;

    invoke-virtual {v0, p1}, Lg0/v0;->m(Lg0/v0$b;)Lg0/v0$c;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/n0;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method

.method private synthetic e0(Ljava/lang/String;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V
    .locals 0

    invoke-direct {p0}, Li0/d;->Y()V

    invoke-virtual {p0, p1}, Landroidx/camera/core/w;->x(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-direct {p0, p1, p2, p3}, Li0/d;->Z(Ljava/lang/String;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/y1;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/w;->S(Landroidx/camera/core/impl/y1;)V

    invoke-virtual {p0}, Landroidx/camera/core/w;->D()V

    iget-object p1, p0, Li0/d;->o:Li0/g;

    invoke-virtual {p1}, Li0/g;->E()V

    :cond_0
    return-void
.end method

.method private synthetic f0(II)Lcom/google/common/util/concurrent/f;
    .locals 1

    iget-object v0, p0, Li0/d;->q:Lg0/v0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg0/v0;->e()Lg0/r0;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lg0/r0;->c(II)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/Exception;

    const-string p2, "Failed to take picture: pipeline is not ready."

    invoke-direct {p1, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, La0/f;->f(Ljava/lang/Throwable;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public F()V
    .locals 1

    invoke-super {p0}, Landroidx/camera/core/w;->F()V

    iget-object v0, p0, Li0/d;->o:Li0/g;

    invoke-virtual {v0}, Li0/g;->o()V

    return-void
.end method

.method protected H(Landroidx/camera/core/impl/b0;Landroidx/camera/core/impl/k2$a;)Landroidx/camera/core/impl/k2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/b0;",
            "Landroidx/camera/core/impl/k2$a<",
            "***>;)",
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation

    iget-object p1, p0, Li0/d;->o:Li0/g;

    invoke-interface {p2}, Lw/z;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    invoke-virtual {p1, v0}, Li0/g;->B(Landroidx/camera/core/impl/l1;)V

    invoke-interface {p2}, Landroidx/camera/core/impl/k2$a;->b()Landroidx/camera/core/impl/k2;

    move-result-object p1

    return-object p1
.end method

.method public I()V
    .locals 1

    invoke-super {p0}, Landroidx/camera/core/w;->I()V

    iget-object v0, p0, Li0/d;->o:Li0/g;

    invoke-virtual {v0}, Li0/g;->C()V

    return-void
.end method

.method public J()V
    .locals 1

    invoke-super {p0}, Landroidx/camera/core/w;->J()V

    iget-object v0, p0, Li0/d;->o:Li0/g;

    invoke-virtual {v0}, Li0/g;->D()V

    return-void
.end method

.method protected K(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2;
    .locals 1

    iget-object v0, p0, Li0/d;->t:Landroidx/camera/core/impl/y1$b;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/y1$b;->g(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/y1$b;

    iget-object v0, p0, Li0/d;->t:Landroidx/camera/core/impl/y1$b;

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1$b;->o()Landroidx/camera/core/impl/y1;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/core/w;->S(Landroidx/camera/core/impl/y1;)V

    invoke-virtual {p0}, Landroidx/camera/core/w;->d()Landroidx/camera/core/impl/b2;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/b2;->f()Landroidx/camera/core/impl/b2$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/b2$a;->d(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/impl/b2$a;->a()Landroidx/camera/core/impl/b2;

    move-result-object p1

    return-object p1
.end method

.method protected L(Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/b2;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/w;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v1

    invoke-direct {p0, v0, v1, p1}, Li0/d;->Z(Ljava/lang/String;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/y1;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/core/w;->S(Landroidx/camera/core/impl/y1;)V

    invoke-virtual {p0}, Landroidx/camera/core/w;->B()V

    return-object p1
.end method

.method public M()V
    .locals 1

    invoke-super {p0}, Landroidx/camera/core/w;->M()V

    invoke-direct {p0}, Li0/d;->Y()V

    iget-object v0, p0, Li0/d;->o:Li0/g;

    invoke-virtual {v0}, Li0/g;->H()V

    return-void
.end method

.method public a0()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Landroidx/camera/core/w;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li0/d;->o:Li0/g;

    invoke-virtual {v0}, Li0/g;->v()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public j(ZLandroidx/camera/core/impl/l2;)Landroidx/camera/core/impl/k2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/camera/core/impl/l2;",
            ")",
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Li0/d;->n:Li0/f;

    invoke-interface {v0}, Landroidx/camera/core/impl/k2;->N()Landroidx/camera/core/impl/l2$b;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p2, v0, v1}, Landroidx/camera/core/impl/l2;->a(Landroidx/camera/core/impl/l2$b;I)Landroidx/camera/core/impl/n0;

    move-result-object p2

    if-eqz p1, :cond_0

    iget-object p1, p0, Li0/d;->n:Li0/f;

    invoke-virtual {p1}, Li0/f;->m()Landroidx/camera/core/impl/n0;

    move-result-object p1

    invoke-static {p2, p1}, Landroidx/camera/core/impl/n0;->O(Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/n0;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2}, Li0/d;->v(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/k2$a;

    move-result-object p1

    invoke-interface {p1}, Landroidx/camera/core/impl/k2$a;->b()Landroidx/camera/core/impl/k2;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public t()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    const/4 v1, 0x3

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public v(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/k2$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/n0;",
            ")",
            "Landroidx/camera/core/impl/k2$a<",
            "***>;"
        }
    .end annotation

    new-instance v0, Li0/e;

    invoke-static {p1}, Landroidx/camera/core/impl/m1;->b0(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/m1;

    move-result-object p1

    invoke-direct {v0, p1}, Li0/e;-><init>(Landroidx/camera/core/impl/m1;)V

    return-object v0
.end method
