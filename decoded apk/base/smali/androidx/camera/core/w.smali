.class public abstract Landroidx/camera/core/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/w$c;,
        Landroidx/camera/core/w$d;,
        Landroidx/camera/core/w$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/camera/core/w$d;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/lang/Object;

.field private c:Landroidx/camera/core/w$c;

.field private d:Landroidx/camera/core/impl/k2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation
.end field

.field private e:Landroidx/camera/core/impl/k2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation
.end field

.field private f:Landroidx/camera/core/impl/k2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation
.end field

.field private g:Landroidx/camera/core/impl/b2;

.field private h:Landroidx/camera/core/impl/k2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation
.end field

.field private i:Landroid/graphics/Rect;

.field private j:Landroid/graphics/Matrix;

.field private k:Landroidx/camera/core/impl/c0;

.field private l:Lw/k;

.field private m:Landroidx/camera/core/impl/y1;


# direct methods
.method protected constructor <init>(Landroidx/camera/core/impl/k2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/k2<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/w;->a:Ljava/util/Set;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/w;->b:Ljava/lang/Object;

    sget-object v0, Landroidx/camera/core/w$c;->INACTIVE:Landroidx/camera/core/w$c;

    iput-object v0, p0, Landroidx/camera/core/w;->c:Landroidx/camera/core/w$c;

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/w;->j:Landroid/graphics/Matrix;

    invoke-static {}, Landroidx/camera/core/impl/y1;->a()Landroidx/camera/core/impl/y1;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/w;->m:Landroidx/camera/core/impl/y1;

    iput-object p1, p0, Landroidx/camera/core/w;->e:Landroidx/camera/core/impl/k2;

    iput-object p1, p0, Landroidx/camera/core/w;->f:Landroidx/camera/core/impl/k2;

    return-void
.end method

.method private N(Landroidx/camera/core/w$d;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method private a(Landroidx/camera/core/w$d;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public A(Landroidx/camera/core/impl/b0;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/k2;)Landroidx/camera/core/impl/k2;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/b0;",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Landroidx/camera/core/impl/k2<",
            "*>;)",
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation

    if-eqz p3, :cond_0

    invoke-static {p3}, Landroidx/camera/core/impl/m1;->b0(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/m1;

    move-result-object p3

    sget-object v0, Lb0/j;->C:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {p3, v0}, Landroidx/camera/core/impl/m1;->c0(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-static {}, Landroidx/camera/core/impl/m1;->a0()Landroidx/camera/core/impl/m1;

    move-result-object p3

    :goto_0
    iget-object v0, p0, Landroidx/camera/core/w;->e:Landroidx/camera/core/impl/k2;

    sget-object v1, Landroidx/camera/core/impl/f1;->h:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/u1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Landroidx/camera/core/w;->e:Landroidx/camera/core/impl/k2;

    sget-object v1, Landroidx/camera/core/impl/f1;->l:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/u1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    sget-object v0, Landroidx/camera/core/impl/f1;->p:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {p3, v0}, Landroidx/camera/core/impl/p1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p3, v0}, Landroidx/camera/core/impl/m1;->c0(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    :cond_2
    iget-object v0, p0, Landroidx/camera/core/w;->e:Landroidx/camera/core/impl/k2;

    sget-object v1, Landroidx/camera/core/impl/f1;->p:Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/u1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Landroidx/camera/core/impl/f1;->n:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {p3, v0}, Landroidx/camera/core/impl/p1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, Landroidx/camera/core/w;->e:Landroidx/camera/core/impl/k2;

    invoke-interface {v2, v1}, Landroidx/camera/core/impl/u1;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lh0/c;

    invoke-virtual {v1}, Lh0/c;->d()Lh0/d;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p3, v0}, Landroidx/camera/core/impl/m1;->c0(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    :cond_3
    iget-object v0, p0, Landroidx/camera/core/w;->e:Landroidx/camera/core/impl/k2;

    invoke-interface {v0}, Landroidx/camera/core/impl/u1;->e()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/n0$a;

    iget-object v2, p0, Landroidx/camera/core/w;->e:Landroidx/camera/core/impl/k2;

    invoke-static {p3, p3, v2, v1}, Landroidx/camera/core/impl/n0;->D(Landroidx/camera/core/impl/m1;Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0$a;)V

    goto :goto_1

    :cond_4
    if-eqz p2, :cond_6

    invoke-interface {p2}, Landroidx/camera/core/impl/u1;->e()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/n0$a;

    invoke-virtual {v1}, Landroidx/camera/core/impl/n0$a;->c()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lb0/j;->C:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {v3}, Landroidx/camera/core/impl/n0$a;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {p3, p3, p2, v1}, Landroidx/camera/core/impl/n0;->D(Landroidx/camera/core/impl/m1;Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0$a;)V

    goto :goto_2

    :cond_6
    sget-object p2, Landroidx/camera/core/impl/f1;->l:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/p1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result p2

    if-eqz p2, :cond_7

    sget-object p2, Landroidx/camera/core/impl/f1;->h:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/p1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/m1;->c0(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    :cond_7
    sget-object p2, Landroidx/camera/core/impl/f1;->p:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/p1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p3, p2}, Landroidx/camera/core/impl/p1;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lh0/c;

    invoke-virtual {p2}, Lh0/c;->a()I

    move-result p2

    if-eqz p2, :cond_8

    sget-object p2, Landroidx/camera/core/impl/k2;->y:Landroidx/camera/core/impl/n0$a;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p3, p2, v0}, Landroidx/camera/core/impl/m1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    :cond_8
    invoke-virtual {p0, p3}, Landroidx/camera/core/w;->v(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/k2$a;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Landroidx/camera/core/w;->H(Landroidx/camera/core/impl/b0;Landroidx/camera/core/impl/k2$a;)Landroidx/camera/core/impl/k2;

    move-result-object p1

    return-object p1
.end method

.method protected final B()V
    .locals 1

    sget-object v0, Landroidx/camera/core/w$c;->ACTIVE:Landroidx/camera/core/w$c;

    iput-object v0, p0, Landroidx/camera/core/w;->c:Landroidx/camera/core/w$c;

    invoke-virtual {p0}, Landroidx/camera/core/w;->E()V

    return-void
.end method

.method protected final C()V
    .locals 1

    sget-object v0, Landroidx/camera/core/w$c;->INACTIVE:Landroidx/camera/core/w$c;

    iput-object v0, p0, Landroidx/camera/core/w;->c:Landroidx/camera/core/w$c;

    invoke-virtual {p0}, Landroidx/camera/core/w;->E()V

    return-void
.end method

.method protected final D()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/w;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/w$d;

    invoke-interface {v1, p0}, Landroidx/camera/core/w$d;->k(Landroidx/camera/core/w;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final E()V
    .locals 2

    sget-object v0, Landroidx/camera/core/w$a;->a:[I

    iget-object v1, p0, Landroidx/camera/core/w;->c:Landroidx/camera/core/w$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    goto :goto_2

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/w;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/w$d;

    invoke-interface {v1, p0}, Landroidx/camera/core/w$d;->c(Landroidx/camera/core/w;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Landroidx/camera/core/w;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/w$d;

    invoke-interface {v1, p0}, Landroidx/camera/core/w$d;->n(Landroidx/camera/core/w;)V

    goto :goto_1

    :cond_2
    :goto_2
    return-void
.end method

.method public F()V
    .locals 0

    return-void
.end method

.method public G()V
    .locals 0

    return-void
.end method

.method protected H(Landroidx/camera/core/impl/b0;Landroidx/camera/core/impl/k2$a;)Landroidx/camera/core/impl/k2;
    .locals 0
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

    invoke-interface {p2}, Landroidx/camera/core/impl/k2$a;->b()Landroidx/camera/core/impl/k2;

    move-result-object p1

    return-object p1
.end method

.method public I()V
    .locals 0

    return-void
.end method

.method public J()V
    .locals 0

    return-void
.end method

.method protected K(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w;->g:Landroidx/camera/core/impl/b2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/impl/b2;->f()Landroidx/camera/core/impl/b2$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/b2$a;->d(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/impl/b2$a;->a()Landroidx/camera/core/impl/b2;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Attempt to update the implementation options for a use case without attached stream specifications."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected L(Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/b2;
    .locals 0

    return-object p1
.end method

.method public M()V
    .locals 0

    return-void
.end method

.method public O(Lw/k;)V
    .locals 1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lw/k;->f()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/camera/core/w;->y(I)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Landroidx/core/util/h;->a(Z)V

    iput-object p1, p0, Landroidx/camera/core/w;->l:Lw/k;

    return-void
.end method

.method public P(Landroid/graphics/Matrix;)V
    .locals 1

    new-instance v0, Landroid/graphics/Matrix;

    invoke-direct {v0, p1}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    iput-object v0, p0, Landroidx/camera/core/w;->j:Landroid/graphics/Matrix;

    return-void
.end method

.method public Q(Landroid/graphics/Rect;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/w;->i:Landroid/graphics/Rect;

    return-void
.end method

.method public final R(Landroidx/camera/core/impl/c0;)V
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/core/w;->M()V

    iget-object v0, p0, Landroidx/camera/core/w;->f:Landroidx/camera/core/impl/k2;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lb0/l;->S(Landroidx/camera/core/w$b;)Landroidx/camera/core/w$b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroidx/camera/core/w$b;->a()V

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/w;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v2, p0, Landroidx/camera/core/w;->k:Landroidx/camera/core/impl/c0;

    if-ne p1, v2, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Landroidx/core/util/h;->a(Z)V

    iget-object p1, p0, Landroidx/camera/core/w;->k:Landroidx/camera/core/impl/c0;

    invoke-direct {p0, p1}, Landroidx/camera/core/w;->N(Landroidx/camera/core/w$d;)V

    iput-object v1, p0, Landroidx/camera/core/w;->k:Landroidx/camera/core/impl/c0;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Landroidx/camera/core/w;->g:Landroidx/camera/core/impl/b2;

    iput-object v1, p0, Landroidx/camera/core/w;->i:Landroid/graphics/Rect;

    iget-object p1, p0, Landroidx/camera/core/w;->e:Landroidx/camera/core/impl/k2;

    iput-object p1, p0, Landroidx/camera/core/w;->f:Landroidx/camera/core/impl/k2;

    iput-object v1, p0, Landroidx/camera/core/w;->d:Landroidx/camera/core/impl/k2;

    iput-object v1, p0, Landroidx/camera/core/w;->h:Landroidx/camera/core/impl/k2;

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method protected S(Landroidx/camera/core/impl/y1;)V
    .locals 2

    iput-object p1, p0, Landroidx/camera/core/w;->m:Landroidx/camera/core/impl/y1;

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->k()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/r0;

    invoke-virtual {v0}, Landroidx/camera/core/impl/r0;->g()Ljava/lang/Class;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/r0;->s(Ljava/lang/Class;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public T(Landroidx/camera/core/impl/b2;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/w;->L(Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/b2;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/w;->g:Landroidx/camera/core/impl/b2;

    return-void
.end method

.method public U(Landroidx/camera/core/impl/n0;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/w;->K(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/w;->g:Landroidx/camera/core/impl/b2;

    return-void
.end method

.method public final b(Landroidx/camera/core/impl/c0;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/k2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/c0;",
            "Landroidx/camera/core/impl/k2<",
            "*>;",
            "Landroidx/camera/core/impl/k2<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/w;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Landroidx/camera/core/w;->k:Landroidx/camera/core/impl/c0;

    invoke-direct {p0, p1}, Landroidx/camera/core/w;->a(Landroidx/camera/core/w$d;)V

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object p2, p0, Landroidx/camera/core/w;->d:Landroidx/camera/core/impl/k2;

    iput-object p3, p0, Landroidx/camera/core/w;->h:Landroidx/camera/core/impl/k2;

    invoke-interface {p1}, Landroidx/camera/core/impl/c0;->i()Landroidx/camera/core/impl/b0;

    move-result-object p2

    iget-object p3, p0, Landroidx/camera/core/w;->d:Landroidx/camera/core/impl/k2;

    iget-object v0, p0, Landroidx/camera/core/w;->h:Landroidx/camera/core/impl/k2;

    invoke-virtual {p0, p2, p3, v0}, Landroidx/camera/core/w;->A(Landroidx/camera/core/impl/b0;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/k2;)Landroidx/camera/core/impl/k2;

    move-result-object p2

    iput-object p2, p0, Landroidx/camera/core/w;->f:Landroidx/camera/core/impl/k2;

    const/4 p3, 0x0

    invoke-interface {p2, p3}, Lb0/l;->S(Landroidx/camera/core/w$b;)Landroidx/camera/core/w$b;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Landroidx/camera/core/impl/c0;->i()Landroidx/camera/core/impl/b0;

    move-result-object p1

    invoke-interface {p2, p1}, Landroidx/camera/core/w$b;->b(Lw/o;)V

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/w;->F()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method protected c()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/w;->f:Landroidx/camera/core/impl/k2;

    check-cast v0, Landroidx/camera/core/impl/f1;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/f1;->t(I)I

    move-result v0

    return v0
.end method

.method public d()Landroidx/camera/core/impl/b2;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w;->g:Landroidx/camera/core/impl/b2;

    return-object v0
.end method

.method public e()Landroid/util/Size;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w;->g:Landroidx/camera/core/impl/b2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/impl/b2;->e()Landroid/util/Size;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public f()Landroidx/camera/core/impl/c0;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/w;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/w;->k:Landroidx/camera/core/impl/c0;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method protected g()Landroidx/camera/core/impl/y;
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/w;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/w;->k:Landroidx/camera/core/impl/c0;

    if-nez v1, :cond_0

    sget-object v1, Landroidx/camera/core/impl/y;->a:Landroidx/camera/core/impl/y;

    monitor-exit v0

    return-object v1

    :cond_0
    invoke-interface {v1}, Landroidx/camera/core/impl/c0;->d()Landroidx/camera/core/impl/y;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method protected h()Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No camera attached to use case: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/core/util/h;->l(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/c0;

    invoke-interface {v0}, Landroidx/camera/core/impl/c0;->i()Landroidx/camera/core/impl/b0;

    move-result-object v0

    invoke-interface {v0}, Landroidx/camera/core/impl/b0;->b()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public i()Landroidx/camera/core/impl/k2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/w;->f:Landroidx/camera/core/impl/k2;

    return-object v0
.end method

.method public abstract j(ZLandroidx/camera/core/impl/l2;)Landroidx/camera/core/impl/k2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/camera/core/impl/l2;",
            ")",
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation
.end method

.method public k()Lw/k;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w;->l:Lw/k;

    return-object v0
.end method

.method public l()I
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w;->f:Landroidx/camera/core/impl/k2;

    invoke-interface {v0}, Landroidx/camera/core/impl/e1;->n()I

    move-result v0

    return v0
.end method

.method protected m()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/w;->f:Landroidx/camera/core/impl/k2;

    check-cast v0, Landroidx/camera/core/impl/f1;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/f1;->U(I)I

    move-result v0

    return v0
.end method

.method public n()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/w;->f:Landroidx/camera/core/impl/k2;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "<UnknownUseCase-"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ">"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lb0/j;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method protected o(Landroidx/camera/core/impl/c0;)I
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/camera/core/w;->p(Landroidx/camera/core/impl/c0;Z)I

    move-result p1

    return p1
.end method

.method protected p(Landroidx/camera/core/impl/c0;Z)I
    .locals 2

    invoke-interface {p1}, Landroidx/camera/core/impl/c0;->i()Landroidx/camera/core/impl/b0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/w;->u()I

    move-result v1

    invoke-interface {v0, v1}, Lw/o;->i(I)I

    move-result v0

    invoke-interface {p1}, Landroidx/camera/core/impl/c0;->m()Z

    move-result p1

    if-nez p1, :cond_0

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    neg-int p1, v0

    invoke-static {p1}, Landroidx/camera/core/impl/utils/r;->q(I)I

    move-result v0

    :cond_1
    return v0
.end method

.method protected q()Lw/u0;
    .locals 6

    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/camera/core/w;->e()Landroid/util/Size;

    move-result-object v1

    if-eqz v0, :cond_2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/w;->w()Landroid/graphics/Rect;

    move-result-object v2

    if-nez v2, :cond_1

    new-instance v2, Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v4

    const/4 v5, 0x0

    invoke-direct {v2, v5, v5, v3, v4}, Landroid/graphics/Rect;-><init>(IIII)V

    :cond_1
    invoke-virtual {p0, v0}, Landroidx/camera/core/w;->o(Landroidx/camera/core/impl/c0;)I

    move-result v0

    new-instance v3, Lw/u0;

    invoke-direct {v3, v1, v2, v0}, Lw/u0;-><init>(Landroid/util/Size;Landroid/graphics/Rect;I)V

    return-object v3

    :cond_2
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public r()Landroid/graphics/Matrix;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w;->j:Landroid/graphics/Matrix;

    return-object v0
.end method

.method public s()Landroidx/camera/core/impl/y1;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w;->m:Landroidx/camera/core/impl/y1;

    return-object v0
.end method

.method protected t()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ljava/util/Collections;->emptySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method protected u()I
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/w;->f:Landroidx/camera/core/impl/k2;

    check-cast v0, Landroidx/camera/core/impl/f1;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/f1;->C(I)I

    move-result v0

    return v0
.end method

.method public abstract v(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/k2$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/n0;",
            ")",
            "Landroidx/camera/core/impl/k2$a<",
            "***>;"
        }
    .end annotation
.end method

.method public w()Landroid/graphics/Rect;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/w;->i:Landroid/graphics/Rect;

    return-object v0
.end method

.method protected x(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/w;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public y(I)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/w;->t()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-static {p1, v1}, Lg0/z0;->b(II)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public z(Landroidx/camera/core/impl/c0;)Z
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/core/w;->m()I

    move-result v0

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    invoke-interface {p1}, Landroidx/camera/core/impl/c0;->j()Z

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown mirrorMode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    return v1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method
