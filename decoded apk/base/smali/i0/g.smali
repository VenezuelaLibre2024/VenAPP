.class Li0/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/c0;


# instance fields
.field final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/camera/core/w;",
            ">;"
        }
    .end annotation
.end field

.field final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/camera/core/w;",
            "Lg0/n0;",
            ">;"
        }
    .end annotation
.end field

.field final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroidx/camera/core/w;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Landroidx/camera/core/impl/l2;

.field private final e:Landroidx/camera/core/impl/c0;

.field private final f:Landroidx/camera/core/impl/k;

.field private final r:Li0/i;


# direct methods
.method constructor <init>(Landroidx/camera/core/impl/c0;Ljava/util/Set;Landroidx/camera/core/impl/l2;Li0/d$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/c0;",
            "Ljava/util/Set<",
            "Landroidx/camera/core/w;",
            ">;",
            "Landroidx/camera/core/impl/l2;",
            "Li0/d$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Li0/g;->b:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Li0/g;->c:Ljava/util/Map;

    invoke-virtual {p0}, Li0/g;->p()Landroidx/camera/core/impl/k;

    move-result-object v0

    iput-object v0, p0, Li0/g;->f:Landroidx/camera/core/impl/k;

    iput-object p1, p0, Li0/g;->e:Landroidx/camera/core/impl/c0;

    iput-object p3, p0, Li0/g;->d:Landroidx/camera/core/impl/l2;

    iput-object p2, p0, Li0/g;->a:Ljava/util/Set;

    new-instance p3, Li0/i;

    invoke-interface {p1}, Landroidx/camera/core/impl/c0;->d()Landroidx/camera/core/impl/y;

    move-result-object p1

    invoke-direct {p3, p1, p4}, Li0/i;-><init>(Landroidx/camera/core/impl/y;Li0/d$a;)V

    iput-object p3, p0, Li0/g;->r:Li0/i;

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/camera/core/w;

    iget-object p3, p0, Li0/g;->c:Ljava/util/Map;

    sget-object p4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p3, p2, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private A(Landroidx/camera/core/w;)Z
    .locals 1

    iget-object v0, p0, Li0/g;->c:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    return p1
.end method

.method static F(Landroidx/camera/core/impl/s;Landroidx/camera/core/impl/y1;)V
    .locals 4

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/k;

    new-instance v2, Li0/h;

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->h()Landroidx/camera/core/impl/l0;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/camera/core/impl/l0;->g()Landroidx/camera/core/impl/f2;

    move-result-object v3

    invoke-direct {v2, v3, p0}, Li0/h;-><init>(Landroidx/camera/core/impl/f2;Landroidx/camera/core/impl/s;)V

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/k;->b(Landroidx/camera/core/impl/s;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method private q(Lg0/n0;Landroidx/camera/core/impl/r0;Landroidx/camera/core/impl/y1;)V
    .locals 1

    invoke-virtual {p1}, Lg0/n0;->w()V

    :try_start_0
    invoke-virtual {p1, p2}, Lg0/n0;->C(Landroidx/camera/core/impl/r0;)V
    :try_end_0
    .catch Landroidx/camera/core/impl/r0$a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-virtual {p3}, Landroidx/camera/core/impl/y1;->c()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/camera/core/impl/y1$c;

    sget-object v0, Landroidx/camera/core/impl/y1$f;->SESSION_ERROR_SURFACE_NEEDS_RESET:Landroidx/camera/core/impl/y1$f;

    invoke-interface {p2, p3, v0}, Landroidx/camera/core/impl/y1$c;->a(Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V

    goto :goto_0

    :cond_0
    :goto_1
    return-void
.end method

.method private static r(Landroidx/camera/core/w;)I
    .locals 0

    instance-of p0, p0, Landroidx/camera/core/n;

    if-eqz p0, :cond_0

    const/16 p0, 0x100

    goto :goto_0

    :cond_0
    const/16 p0, 0x22

    :goto_0
    return p0
.end method

.method private s(Landroidx/camera/core/w;)I
    .locals 1

    instance-of v0, p1, Landroidx/camera/core/s;

    if-eqz v0, :cond_0

    iget-object v0, p0, Li0/g;->e:Landroidx/camera/core/impl/c0;

    invoke-interface {v0}, Landroidx/camera/core/impl/c0;->b()Lw/o;

    move-result-object v0

    check-cast p1, Landroidx/camera/core/s;

    invoke-virtual {p1}, Landroidx/camera/core/s;->c0()I

    move-result p1

    invoke-interface {v0, p1}, Lw/o;->i(I)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method static t(Landroidx/camera/core/w;)Landroidx/camera/core/impl/r0;
    .locals 3

    instance-of v0, p0, Landroidx/camera/core/n;

    invoke-virtual {p0}, Landroidx/camera/core/w;->s()Landroidx/camera/core/impl/y1;

    move-result-object p0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/impl/y1;->h()Landroidx/camera/core/impl/l0;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/camera/core/impl/l0;->f()Ljava/util/List;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    invoke-static {v0}, Landroidx/core/util/h;->m(Z)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v2, :cond_2

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroidx/camera/core/impl/r0;

    return-object p0

    :cond_2
    const/4 p0, 0x0

    return-object p0
.end method

.method private static u(Landroidx/camera/core/w;)I
    .locals 1

    instance-of v0, p0, Landroidx/camera/core/s;

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    instance-of p0, p0, Landroidx/camera/core/n;

    if-eqz p0, :cond_1

    const/4 p0, 0x4

    return p0

    :cond_1
    const/4 p0, 0x2

    return p0
.end method

.method private static x(Ljava/util/Set;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Landroidx/camera/core/impl/k2<",
            "*>;>;)I"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/k2;

    invoke-interface {v1}, Landroidx/camera/core/impl/k2;->L()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    goto :goto_0

    :cond_0
    return v0
.end method

.method private z(Landroidx/camera/core/w;)Lg0/n0;
    .locals 1

    iget-object v0, p0, Li0/g;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg0/n0;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p1
.end method


# virtual methods
.method B(Landroidx/camera/core/impl/l1;)V
    .locals 6

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iget-object v1, p0, Li0/g;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/w;

    iget-object v3, p0, Li0/g;->e:Landroidx/camera/core/impl/c0;

    invoke-interface {v3}, Landroidx/camera/core/impl/c0;->i()Landroidx/camera/core/impl/b0;

    move-result-object v3

    const/4 v4, 0x1

    iget-object v5, p0, Li0/g;->d:Landroidx/camera/core/impl/l2;

    invoke-virtual {v2, v4, v5}, Landroidx/camera/core/w;->j(ZLandroidx/camera/core/impl/l2;)Landroidx/camera/core/impl/k2;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v5, v4}, Landroidx/camera/core/w;->A(Landroidx/camera/core/impl/b0;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/k2;)Landroidx/camera/core/impl/k2;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Li0/g;->e:Landroidx/camera/core/impl/c0;

    invoke-interface {v2}, Landroidx/camera/core/impl/c0;->i()Landroidx/camera/core/impl/b0;

    move-result-object v2

    const/16 v3, 0x22

    invoke-interface {v2, v3}, Landroidx/camera/core/impl/b0;->f(I)Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v2, p0, Li0/g;->e:Landroidx/camera/core/impl/c0;

    invoke-interface {v2}, Landroidx/camera/core/impl/c0;->d()Landroidx/camera/core/impl/y;

    move-result-object v2

    invoke-interface {v2}, Landroidx/camera/core/impl/y;->e()Landroid/graphics/Rect;

    move-result-object v2

    invoke-static {v2}, Landroidx/camera/core/impl/utils/r;->i(Landroid/graphics/Rect;)Landroid/util/Size;

    move-result-object v2

    sget-object v3, Landroidx/camera/core/impl/f1;->q:Landroidx/camera/core/impl/n0$a;

    invoke-static {v1, v2, v0}, Li0/a;->a(Ljava/util/List;Landroid/util/Size;Ljava/util/Set;)Ljava/util/List;

    move-result-object v1

    invoke-interface {p1, v3, v1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    sget-object v1, Landroidx/camera/core/impl/k2;->v:Landroidx/camera/core/impl/n0$a;

    invoke-static {v0}, Li0/g;->x(Ljava/util/Set;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    return-void
.end method

.method C()V
    .locals 2

    iget-object v0, p0, Li0/g;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/w;

    invoke-virtual {v1}, Landroidx/camera/core/w;->I()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method D()V
    .locals 2

    iget-object v0, p0, Li0/g;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/w;

    invoke-virtual {v1}, Landroidx/camera/core/w;->J()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method E()V
    .locals 2

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Li0/g;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/w;

    invoke-virtual {p0, v1}, Li0/g;->k(Landroidx/camera/core/w;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method G(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Landroidx/camera/core/w;",
            "Lg0/n0;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Li0/g;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Li0/g;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object p1, p0, Li0/g;->b:Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/w;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg0/n0;

    invoke-virtual {v0}, Lg0/n0;->n()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/w;->Q(Landroid/graphics/Rect;)V

    invoke-virtual {v0}, Lg0/n0;->s()Landroid/graphics/Matrix;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroidx/camera/core/w;->P(Landroid/graphics/Matrix;)V

    invoke-virtual {v0}, Lg0/n0;->t()Landroidx/camera/core/impl/b2;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/camera/core/w;->T(Landroidx/camera/core/impl/b2;)V

    invoke-virtual {v1}, Landroidx/camera/core/w;->E()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method H()V
    .locals 2

    iget-object v0, p0, Li0/g;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/w;

    invoke-virtual {v1, p0}, Landroidx/camera/core/w;->R(Landroidx/camera/core/impl/c0;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Landroidx/camera/core/w;)V
    .locals 2

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-direct {p0, p1}, Li0/g;->A(Landroidx/camera/core/w;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li0/g;->c:Ljava/util/Map;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Li0/g;->t(Landroidx/camera/core/w;)Landroidx/camera/core/impl/r0;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-direct {p0, p1}, Li0/g;->z(Landroidx/camera/core/w;)Lg0/n0;

    move-result-object v1

    invoke-virtual {p1}, Landroidx/camera/core/w;->s()Landroidx/camera/core/impl/y1;

    move-result-object p1

    invoke-direct {p0, v1, v0, p1}, Li0/g;->q(Lg0/n0;Landroidx/camera/core/impl/r0;Landroidx/camera/core/impl/y1;)V

    :cond_1
    return-void
.end method

.method public d()Landroidx/camera/core/impl/y;
    .locals 1

    iget-object v0, p0, Li0/g;->r:Li0/i;

    return-object v0
.end method

.method public g(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation not supported by VirtualCamera."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation not supported by VirtualCamera."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public i()Landroidx/camera/core/impl/b0;
    .locals 1

    iget-object v0, p0, Li0/g;->e:Landroidx/camera/core/impl/c0;

    invoke-interface {v0}, Landroidx/camera/core/impl/c0;->i()Landroidx/camera/core/impl/b0;

    move-result-object v0

    return-object v0
.end method

.method public k(Landroidx/camera/core/w;)V
    .locals 2

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-direct {p0, p1}, Li0/g;->z(Landroidx/camera/core/w;)Lg0/n0;

    move-result-object v0

    invoke-virtual {v0}, Lg0/n0;->w()V

    invoke-direct {p0, p1}, Li0/g;->A(Landroidx/camera/core/w;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Li0/g;->t(Landroidx/camera/core/w;)Landroidx/camera/core/impl/r0;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroidx/camera/core/w;->s()Landroidx/camera/core/impl/y1;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Li0/g;->q(Lg0/n0;Landroidx/camera/core/impl/r0;Landroidx/camera/core/impl/y1;)V

    :cond_1
    return-void
.end method

.method public m()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public n(Landroidx/camera/core/w;)V
    .locals 2

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-direct {p0, p1}, Li0/g;->A(Landroidx/camera/core/w;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Li0/g;->c:Ljava/util/Map;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1}, Li0/g;->z(Landroidx/camera/core/w;)Lg0/n0;

    move-result-object p1

    invoke-virtual {p1}, Lg0/n0;->l()V

    return-void
.end method

.method o()V
    .locals 4

    iget-object v0, p0, Li0/g;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/w;

    const/4 v2, 0x1

    iget-object v3, p0, Li0/g;->d:Landroidx/camera/core/impl/l2;

    invoke-virtual {v1, v2, v3}, Landroidx/camera/core/w;->j(ZLandroidx/camera/core/impl/l2;)Landroidx/camera/core/impl/k2;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, p0, v3, v2}, Landroidx/camera/core/w;->b(Landroidx/camera/core/impl/c0;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/k2;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method p()Landroidx/camera/core/impl/k;
    .locals 1

    new-instance v0, Li0/g$a;

    invoke-direct {v0, p0}, Li0/g$a;-><init>(Li0/g;)V

    return-object v0
.end method

.method v()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Landroidx/camera/core/w;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li0/g;->a:Ljava/util/Set;

    return-object v0
.end method

.method w(Lg0/n0;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg0/n0;",
            ")",
            "Ljava/util/Map<",
            "Landroidx/camera/core/w;",
            "Lg0/v0$d;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Li0/g;->a:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/w;

    invoke-direct {p0, v2}, Li0/g;->s(Landroidx/camera/core/w;)I

    move-result v7

    invoke-static {v2}, Li0/g;->u(Landroidx/camera/core/w;)I

    move-result v3

    invoke-static {v2}, Li0/g;->r(Landroidx/camera/core/w;)I

    move-result v4

    invoke-virtual {p1}, Lg0/n0;->n()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {p1}, Lg0/n0;->n()Landroid/graphics/Rect;

    move-result-object v6

    invoke-static {v6, v7}, Landroidx/camera/core/impl/utils/r;->d(Landroid/graphics/Rect;I)Landroid/util/Size;

    move-result-object v6

    invoke-virtual {v2, p0}, Landroidx/camera/core/w;->z(Landroidx/camera/core/impl/c0;)Z

    move-result v8

    invoke-static/range {v3 .. v8}, Lg0/v0$d;->h(IILandroid/graphics/Rect;Landroid/util/Size;IZ)Lg0/v0$d;

    move-result-object v3

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method y()Landroidx/camera/core/impl/k;
    .locals 1

    iget-object v0, p0, Li0/g;->f:Landroidx/camera/core/impl/k;

    return-object v0
.end method
