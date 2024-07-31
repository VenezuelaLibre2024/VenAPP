.class public final Lb0/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb0/e$b;,
        Lb0/e$a;,
        Lb0/e$c;
    }
.end annotation


# instance fields
.field private final A:Landroidx/camera/core/impl/w1;

.field private final B:Landroidx/camera/core/impl/x1;

.field private final a:Landroidx/camera/core/impl/c0;

.field private final b:Ljava/util/LinkedHashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashSet<",
            "Landroidx/camera/core/impl/c0;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Landroidx/camera/core/impl/z;

.field private final d:Landroidx/camera/core/impl/l2;

.field private final e:Lb0/e$b;

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/w;",
            ">;"
        }
    .end annotation
.end field

.field private final r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/w;",
            ">;"
        }
    .end annotation
.end field

.field private final s:Lx/a;

.field private t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw/k;",
            ">;"
        }
    .end annotation
.end field

.field private u:Landroidx/camera/core/impl/u;

.field private final v:Ljava/lang/Object;

.field private w:Z

.field private x:Landroidx/camera/core/impl/n0;

.field private y:Landroidx/camera/core/w;

.field private z:Li0/d;


# direct methods
.method public constructor <init>(Ljava/util/LinkedHashSet;Lx/a;Landroidx/camera/core/impl/z;Landroidx/camera/core/impl/l2;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashSet<",
            "Landroidx/camera/core/impl/c0;",
            ">;",
            "Lx/a;",
            "Landroidx/camera/core/impl/z;",
            "Landroidx/camera/core/impl/l2;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb0/e;->f:Ljava/util/List;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lb0/e;->r:Ljava/util/List;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lb0/e;->t:Ljava/util/List;

    invoke-static {}, Landroidx/camera/core/impl/x;->a()Landroidx/camera/core/impl/u;

    move-result-object v0

    iput-object v0, p0, Lb0/e;->u:Landroidx/camera/core/impl/u;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lb0/e;->w:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lb0/e;->x:Landroidx/camera/core/impl/n0;

    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/c0;

    iput-object v0, p0, Lb0/e;->a:Landroidx/camera/core/impl/c0;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1, p1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    iput-object v1, p0, Lb0/e;->b:Ljava/util/LinkedHashSet;

    new-instance p1, Lb0/e$b;

    invoke-direct {p1, v1}, Lb0/e$b;-><init>(Ljava/util/LinkedHashSet;)V

    iput-object p1, p0, Lb0/e;->e:Lb0/e$b;

    iput-object p2, p0, Lb0/e;->s:Lx/a;

    iput-object p3, p0, Lb0/e;->c:Landroidx/camera/core/impl/z;

    iput-object p4, p0, Lb0/e;->d:Landroidx/camera/core/impl/l2;

    new-instance p1, Landroidx/camera/core/impl/w1;

    invoke-interface {v0}, Landroidx/camera/core/impl/c0;->d()Landroidx/camera/core/impl/y;

    move-result-object p2

    invoke-direct {p1, p2}, Landroidx/camera/core/impl/w1;-><init>(Landroidx/camera/core/impl/y;)V

    iput-object p1, p0, Lb0/e;->A:Landroidx/camera/core/impl/w1;

    new-instance p2, Landroidx/camera/core/impl/x1;

    invoke-interface {v0}, Landroidx/camera/core/impl/c0;->i()Landroidx/camera/core/impl/b0;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Landroidx/camera/core/impl/x1;-><init>(Landroidx/camera/core/impl/b0;Landroidx/camera/core/impl/w1;)V

    iput-object p2, p0, Lb0/e;->B:Landroidx/camera/core/impl/x1;

    return-void
.end method

.method private static A(Landroidx/camera/core/w;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/w;",
            ")",
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/l2$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p0}, Lb0/e;->M(Landroidx/camera/core/w;)Z

    move-result v1

    if-eqz v1, :cond_0

    check-cast p0, Li0/d;

    invoke-virtual {p0}, Li0/d;->a0()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/w;

    invoke-virtual {v1}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v1

    invoke-interface {v1}, Landroidx/camera/core/impl/k2;->N()Landroidx/camera/core/impl/l2$b;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object p0

    invoke-interface {p0}, Landroidx/camera/core/impl/k2;->N()Landroidx/camera/core/impl/l2$b;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-object v0
.end method

.method private B(Ljava/util/Collection;Landroidx/camera/core/impl/l2;Landroidx/camera/core/impl/l2;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;",
            "Landroidx/camera/core/impl/l2;",
            "Landroidx/camera/core/impl/l2;",
            ")",
            "Ljava/util/Map<",
            "Landroidx/camera/core/w;",
            "Lb0/e$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/w;

    new-instance v2, Lb0/e$c;

    const/4 v3, 0x0

    invoke-virtual {v1, v3, p2}, Landroidx/camera/core/w;->j(ZLandroidx/camera/core/impl/l2;)Landroidx/camera/core/impl/k2;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v1, v4, p3}, Landroidx/camera/core/w;->j(ZLandroidx/camera/core/impl/l2;)Landroidx/camera/core/impl/k2;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lb0/e$c;-><init>(Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/k2;)V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private C(Z)I
    .locals 7

    iget-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb0/e;->t:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v2, 0x0

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw/k;

    invoke-virtual {v3}, Lw/k;->f()I

    move-result v5

    invoke-static {v5}, Lg0/z0;->a(I)I

    move-result v5

    const/4 v6, 0x1

    if-le v5, v6, :cond_0

    if-nez v2, :cond_1

    move v4, v6

    :cond_1
    const-string v2, "Can only have one sharing effect."

    invoke-static {v4, v2}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    move-object v2, v3

    goto :goto_0

    :cond_2
    if-nez v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Lw/k;->f()I

    move-result v4

    :goto_1
    if-eqz p1, :cond_4

    or-int/lit8 v4, v4, 0x3

    :cond_4
    monitor-exit v0

    return v4

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private D(Ljava/util/Collection;Z)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;Z)",
            "Ljava/util/Set<",
            "Landroidx/camera/core/w;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-direct {p0, p2}, Lb0/e;->C(Z)I

    move-result p2

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/w;

    invoke-static {v1}, Lb0/e;->M(Landroidx/camera/core/w;)Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    const-string v3, "Only support one level of sharing for now."

    invoke-static {v2, v3}, Landroidx/core/util/h;->b(ZLjava/lang/Object;)V

    invoke-virtual {v1, p2}, Landroidx/camera/core/w;->y(I)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static F(Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/y1;)Z
    .locals 4

    invoke-virtual {p0}, Landroidx/camera/core/impl/b2;->d()Landroidx/camera/core/impl/n0;

    move-result-object p0

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->d()Landroidx/camera/core/impl/n0;

    move-result-object v0

    invoke-interface {p0}, Landroidx/camera/core/impl/n0;->e()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->size()I

    move-result v1

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1;->d()Landroidx/camera/core/impl/n0;

    move-result-object p1

    invoke-interface {p1}, Landroidx/camera/core/impl/n0;->e()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p1

    const/4 v2, 0x1

    if-eq v1, p1, :cond_0

    return v2

    :cond_0
    invoke-interface {p0}, Landroidx/camera/core/impl/n0;->e()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/n0$a;

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/n0;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0, v1}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {p0, v1}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_2
    return v2

    :cond_3
    const/4 p0, 0x0

    return p0
.end method

.method private G()Z
    .locals 3

    iget-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb0/e;->u:Landroidx/camera/core/impl/u;

    invoke-static {}, Landroidx/camera/core/impl/x;->a()Landroidx/camera/core/impl/u;

    move-result-object v2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private H()Z
    .locals 3

    iget-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb0/e;->u:Landroidx/camera/core/impl/u;

    invoke-interface {v1}, Landroidx/camera/core/impl/u;->v()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private I(Ljava/util/Collection;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/w;

    invoke-static {v3}, Lb0/e;->L(Landroidx/camera/core/w;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v1, v4

    goto :goto_0

    :cond_1
    invoke-static {v3}, Lb0/e;->K(Landroidx/camera/core/w;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v2, v4

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    if-nez v2, :cond_3

    move v0, v4

    :cond_3
    return v0
.end method

.method private J(Ljava/util/Collection;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/w;

    invoke-static {v3}, Lb0/e;->L(Landroidx/camera/core/w;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    invoke-static {v3}, Lb0/e;->K(Landroidx/camera/core/w;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v1, v4

    goto :goto_0

    :cond_2
    if-eqz v1, :cond_3

    if-nez v2, :cond_3

    move v0, v4

    :cond_3
    return v0
.end method

.method private static K(Landroidx/camera/core/w;)Z
    .locals 0

    instance-of p0, p0, Landroidx/camera/core/n;

    return p0
.end method

.method private static L(Landroidx/camera/core/w;)Z
    .locals 0

    instance-of p0, p0, Landroidx/camera/core/s;

    return p0
.end method

.method private static M(Landroidx/camera/core/w;)Z
    .locals 0

    instance-of p0, p0, Li0/d;

    return p0
.end method

.method static N(Ljava/util/Collection;)Z
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)Z"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v1, v0, [I

    fill-array-data v1, :array_0

    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/w;

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    if-ge v5, v0, :cond_0

    aget v6, v1, v5

    invoke-virtual {v3, v6}, Landroidx/camera/core/w;->y(I)Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v2, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    return v4

    :cond_1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x1

    return p0

    :array_0
    .array-data 4
        0x1
        0x2
        0x4
    .end array-data
.end method

.method private static synthetic O(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;Lw/i1$g;)V
    .locals 0

    invoke-virtual {p0}, Landroid/view/Surface;->release()V

    invoke-virtual {p1}, Landroid/graphics/SurfaceTexture;->release()V

    return-void
.end method

.method private static synthetic P(Lw/i1;)V
    .locals 4

    new-instance v0, Landroid/graphics/SurfaceTexture;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/SurfaceTexture;-><init>(I)V

    invoke-virtual {p0}, Lw/i1;->k()Landroid/util/Size;

    move-result-object v1

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lw/i1;->k()Landroid/util/Size;

    move-result-object v2

    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/graphics/SurfaceTexture;->setDefaultBufferSize(II)V

    invoke-virtual {v0}, Landroid/graphics/SurfaceTexture;->detachFromGLContext()V

    new-instance v1, Landroid/view/Surface;

    invoke-direct {v1, v0}, Landroid/view/Surface;-><init>(Landroid/graphics/SurfaceTexture;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lb0/d;

    invoke-direct {v3, v1, v0}, Lb0/d;-><init>(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;)V

    invoke-virtual {p0, v1, v2, v3}, Lw/i1;->v(Landroid/view/Surface;Ljava/util/concurrent/Executor;Landroidx/core/util/a;)V

    return-void
.end method

.method private R()V
    .locals 3

    iget-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb0/e;->x:Landroidx/camera/core/impl/n0;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lb0/e;->a:Landroidx/camera/core/impl/c0;

    invoke-interface {v1}, Landroidx/camera/core/impl/c0;->d()Landroidx/camera/core/impl/y;

    move-result-object v1

    iget-object v2, p0, Lb0/e;->x:Landroidx/camera/core/impl/n0;

    invoke-interface {v1, v2}, Landroidx/camera/core/impl/y;->i(Landroidx/camera/core/impl/n0;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private static T(Ljava/util/List;Ljava/util/Collection;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k;",
            ">;",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)",
            "Ljava/util/List<",
            "Lw/k;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/w;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroidx/camera/core/w;->O(Lw/k;)V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw/k;

    invoke-virtual {v3}, Lw/k;->f()I

    move-result v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/w;->y(I)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v1}, Landroidx/camera/core/w;->k()Lw/k;

    move-result-object v4

    if-nez v4, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, " already has effect"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Landroidx/camera/core/w;->k()Lw/k;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    invoke-virtual {v1, v3}, Landroidx/camera/core/w;->O(Lw/k;)V

    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method static V(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k;",
            ">;",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1}, Lb0/e;->T(Ljava/util/List;Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v0, p1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    invoke-static {p0, v0}, Lb0/e;->T(Ljava/util/List;Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "Unused effects: "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string p1, "CameraUseCaseAdapter"

    invoke-static {p1, p0}, Lw/o0;->k(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private Y(Ljava/util/Map;Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Landroidx/camera/core/w;",
            "Landroidx/camera/core/impl/b2;",
            ">;",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)V"
        }
    .end annotation

    iget-object p1, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    monitor-exit p1

    return-void

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2

    :catchall_0
    move-exception p2

    goto :goto_0
.end method

.method public static synthetic c(Lw/i1;)V
    .locals 0

    invoke-static {p0}, Lb0/e;->P(Lw/i1;)V

    return-void
.end method

.method public static synthetic k(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;Lw/i1$g;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lb0/e;->O(Landroid/view/Surface;Landroid/graphics/SurfaceTexture;Lw/i1$g;)V

    return-void
.end method

.method private p()V
    .locals 3

    iget-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb0/e;->a:Landroidx/camera/core/impl/c0;

    invoke-interface {v1}, Landroidx/camera/core/impl/c0;->d()Landroidx/camera/core/impl/y;

    move-result-object v1

    invoke-interface {v1}, Landroidx/camera/core/impl/y;->h()Landroidx/camera/core/impl/n0;

    move-result-object v2

    iput-object v2, p0, Lb0/e;->x:Landroidx/camera/core/impl/n0;

    invoke-interface {v1}, Landroidx/camera/core/impl/y;->j()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method static q(Ljava/util/Collection;Landroidx/camera/core/w;Li0/d;)Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;",
            "Landroidx/camera/core/w;",
            "Li0/d;",
            ")",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    if-eqz p1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    if-eqz p2, :cond_1

    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p2}, Li0/d;->a0()Ljava/util/Set;

    move-result-object p0

    invoke-interface {v0, p0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    :cond_1
    return-object v0
.end method

.method private s(ILandroidx/camera/core/impl/b0;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Map;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroidx/camera/core/impl/b0;",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;",
            "Ljava/util/Map<",
            "Landroidx/camera/core/w;",
            "Lb0/e$c;",
            ">;)",
            "Ljava/util/Map<",
            "Landroidx/camera/core/w;",
            "Landroidx/camera/core/impl/b2;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface/range {p2 .. p2}, Landroidx/camera/core/impl/b0;->b()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    invoke-interface/range {p4 .. p4}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_0

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/camera/core/w;

    iget-object v10, v0, Lb0/e;->c:Landroidx/camera/core/impl/z;

    invoke-virtual {v8}, Landroidx/camera/core/w;->l()I

    move-result v11

    invoke-virtual {v8}, Landroidx/camera/core/w;->e()Landroid/util/Size;

    move-result-object v12

    invoke-interface {v10, v1, v4, v11, v12}, Landroidx/camera/core/impl/z;->b(ILjava/lang/String;ILandroid/util/Size;)Landroidx/camera/core/impl/d2;

    move-result-object v13

    invoke-virtual {v8}, Landroidx/camera/core/w;->l()I

    move-result v14

    invoke-virtual {v8}, Landroidx/camera/core/w;->e()Landroid/util/Size;

    move-result-object v15

    invoke-virtual {v8}, Landroidx/camera/core/w;->d()Landroidx/camera/core/impl/b2;

    move-result-object v10

    invoke-static {v10}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/camera/core/impl/b2;

    invoke-virtual {v10}, Landroidx/camera/core/impl/b2;->b()Lw/y;

    move-result-object v16

    invoke-static {v8}, Lb0/e;->A(Landroidx/camera/core/w;)Ljava/util/List;

    move-result-object v17

    invoke-virtual {v8}, Landroidx/camera/core/w;->d()Landroidx/camera/core/impl/b2;

    move-result-object v10

    invoke-virtual {v10}, Landroidx/camera/core/impl/b2;->d()Landroidx/camera/core/impl/n0;

    move-result-object v18

    invoke-virtual {v8}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v10

    invoke-interface {v10, v9}, Landroidx/camera/core/impl/k2;->x(Landroid/util/Range;)Landroid/util/Range;

    move-result-object v19

    invoke-static/range {v13 .. v19}, Landroidx/camera/core/impl/a;->a(Landroidx/camera/core/impl/d2;ILandroid/util/Size;Lw/y;Ljava/util/List;Landroidx/camera/core/impl/n0;Landroid/util/Range;)Landroidx/camera/core/impl/a;

    move-result-object v9

    invoke-interface {v3, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v6, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v8}, Landroidx/camera/core/w;->d()Landroidx/camera/core/impl/b2;

    move-result-object v9

    invoke-interface {v5, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface/range {p3 .. p3}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_5

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    :try_start_0
    iget-object v10, v0, Lb0/e;->a:Landroidx/camera/core/impl/c0;

    invoke-interface {v10}, Landroidx/camera/core/impl/c0;->d()Landroidx/camera/core/impl/y;

    move-result-object v10

    invoke-interface {v10}, Landroidx/camera/core/impl/y;->e()Landroid/graphics/Rect;

    move-result-object v10
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-object v10, v9

    :goto_1
    new-instance v11, Lb0/h;

    if-eqz v10, :cond_1

    invoke-static {v10}, Landroidx/camera/core/impl/utils/r;->i(Landroid/graphics/Rect;)Landroid/util/Size;

    move-result-object v9

    :cond_1
    invoke-direct {v11, v2, v9}, Lb0/h;-><init>(Landroidx/camera/core/impl/b0;Landroid/util/Size;)V

    invoke-interface/range {p3 .. p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/camera/core/w;

    move-object/from16 v12, p5

    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lb0/e$c;

    iget-object v14, v13, Lb0/e$c;->a:Landroidx/camera/core/impl/k2;

    iget-object v13, v13, Lb0/e$c;->b:Landroidx/camera/core/impl/k2;

    invoke-virtual {v10, v2, v14, v13}, Landroidx/camera/core/w;->A(Landroidx/camera/core/impl/b0;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/k2;)Landroidx/camera/core/impl/k2;

    move-result-object v13

    invoke-interface {v7, v13, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v11, v13}, Lb0/h;->m(Landroidx/camera/core/impl/k2;)Ljava/util/List;

    move-result-object v10

    invoke-interface {v8, v13, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_2
    iget-object v2, v0, Lb0/e;->c:Landroidx/camera/core/impl/z;

    invoke-interface {v2, v1, v4, v3, v8}, Landroidx/camera/core/impl/z;->a(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;)Landroid/util/Pair;

    move-result-object v1

    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/camera/core/w;

    iget-object v7, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v7, Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v7, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/impl/b2;

    invoke-interface {v5, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_3
    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v6, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/w;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/b2;

    invoke-interface {v5, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    :cond_5
    return-object v5
.end method

.method private t()Landroidx/camera/core/n;
    .locals 2

    new-instance v0, Landroidx/camera/core/n$b;

    invoke-direct {v0}, Landroidx/camera/core/n$b;-><init>()V

    const-string v1, "ImageCapture-Extra"

    invoke-virtual {v0, v1}, Landroidx/camera/core/n$b;->l(Ljava/lang/String;)Landroidx/camera/core/n$b;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/n$b;->c()Landroidx/camera/core/n;

    move-result-object v0

    return-object v0
.end method

.method private u()Landroidx/camera/core/s;
    .locals 2

    new-instance v0, Landroidx/camera/core/s$a;

    invoke-direct {v0}, Landroidx/camera/core/s$a;-><init>()V

    const-string v1, "Preview-Extra"

    invoke-virtual {v0, v1}, Landroidx/camera/core/s$a;->k(Ljava/lang/String;)Landroidx/camera/core/s$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/s$a;->c()Landroidx/camera/core/s;

    move-result-object v0

    new-instance v1, Lb0/c;

    invoke-direct {v1}, Lb0/c;-><init>()V

    invoke-virtual {v0, v1}, Landroidx/camera/core/s;->j0(Landroidx/camera/core/s$c;)V

    return-object v0
.end method

.method private v(Ljava/util/Collection;Z)Li0/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;Z)",
            "Li0/d;"
        }
    .end annotation

    iget-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0, p1, p2}, Lb0/e;->D(Ljava/util/Collection;Z)Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p2

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ge p2, v1, :cond_0

    monitor-exit v0

    return-object v2

    :cond_0
    iget-object p2, p0, Lb0/e;->z:Li0/d;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Li0/d;->a0()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p0, Lb0/e;->z:Li0/d;

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v0

    return-object p1

    :cond_1
    invoke-static {p1}, Lb0/e;->N(Ljava/util/Collection;)Z

    move-result p2

    if-nez p2, :cond_2

    monitor-exit v0

    return-object v2

    :cond_2
    new-instance p2, Li0/d;

    iget-object v1, p0, Lb0/e;->a:Landroidx/camera/core/impl/c0;

    iget-object v2, p0, Lb0/e;->d:Landroidx/camera/core/impl/l2;

    invoke-direct {p2, v1, p1, v2}, Li0/d;-><init>(Landroidx/camera/core/impl/c0;Ljava/util/Set;Landroidx/camera/core/impl/l2;)V

    monitor-exit v0

    return-object p2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public static x(Ljava/util/LinkedHashSet;)Lb0/e$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/LinkedHashSet<",
            "Landroidx/camera/core/impl/c0;",
            ">;)",
            "Lb0/e$b;"
        }
    .end annotation

    new-instance v0, Lb0/e$b;

    invoke-direct {v0, p0}, Lb0/e$b;-><init>(Ljava/util/LinkedHashSet;)V

    return-object v0
.end method

.method private z()I
    .locals 3

    iget-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lb0/e;->s:Lx/a;

    invoke-interface {v1}, Lx/a;->b()I

    move-result v1

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    monitor-exit v0

    const/4 v0, 0x1

    return v0

    :cond_0
    monitor-exit v0

    const/4 v0, 0x0

    return v0

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public E()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/camera/core/w;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lb0/e;->f:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public Q(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/LinkedHashSet;

    iget-object v2, p0, Lb0/e;->f:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1, p1}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    invoke-virtual {p0, v1}, Lb0/e;->W(Ljava/util/Collection;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public S(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/k;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lb0/e;->t:Ljava/util/List;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public U(Lw/j1;)V
    .locals 1

    iget-object p1, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    monitor-exit p1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method W(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lb0/e;->X(Ljava/util/Collection;Z)V

    return-void
.end method

.method X(Ljava/util/Collection;Z)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;Z)V"
        }
    .end annotation

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    iget-object v9, v7, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v9

    :try_start_0
    invoke-virtual/range {p0 .. p1}, Lb0/e;->r(Ljava/util/Collection;)Landroidx/camera/core/w;

    move-result-object v0

    invoke-direct/range {p0 .. p2}, Lb0/e;->v(Ljava/util/Collection;Z)Li0/d;

    move-result-object v10

    invoke-static {v8, v0, v10}, Lb0/e;->q(Ljava/util/Collection;Landroidx/camera/core/w;Li0/d;)Ljava/util/Collection;

    move-result-object v11

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, v7, Lb0/e;->r:Ljava/util/List;

    invoke-interface {v12, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v1, v7, Lb0/e;->r:Ljava/util/List;

    invoke-interface {v13, v1}, Ljava/util/List;->retainAll(Ljava/util/Collection;)Z

    new-instance v14, Ljava/util/ArrayList;

    iget-object v1, v7, Lb0/e;->r:Ljava/util/List;

    invoke-direct {v14, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v14, v11}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    iget-object v1, v7, Lb0/e;->u:Landroidx/camera/core/impl/u;

    invoke-interface {v1}, Landroidx/camera/core/impl/u;->j()Landroidx/camera/core/impl/l2;

    move-result-object v1

    iget-object v2, v7, Lb0/e;->d:Landroidx/camera/core/impl/l2;

    invoke-direct {v7, v12, v1, v2}, Lb0/e;->B(Ljava/util/Collection;Landroidx/camera/core/impl/l2;Landroidx/camera/core/impl/l2;)Ljava/util/Map;

    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-direct/range {p0 .. p0}, Lb0/e;->z()I

    move-result v2

    iget-object v1, v7, Lb0/e;->a:Landroidx/camera/core/impl/c0;

    invoke-interface {v1}, Landroidx/camera/core/impl/c0;->i()Landroidx/camera/core/impl/b0;

    move-result-object v3

    move-object/from16 v1, p0

    move-object v4, v12

    move-object v5, v13

    move-object v6, v15

    invoke-direct/range {v1 .. v6}, Lb0/e;->s(ILandroidx/camera/core/impl/b0;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v1
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-direct {v7, v1, v11}, Lb0/e;->Y(Ljava/util/Map;Ljava/util/Collection;)V

    iget-object v2, v7, Lb0/e;->t:Ljava/util/List;

    invoke-static {v2, v11, v8}, Lb0/e;->V(Ljava/util/List;Ljava/util/Collection;Ljava/util/Collection;)V

    invoke-interface {v14}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/w;

    iget-object v4, v7, Lb0/e;->a:Landroidx/camera/core/impl/c0;

    invoke-virtual {v3, v4}, Landroidx/camera/core/w;->R(Landroidx/camera/core/impl/c0;)V

    goto :goto_0

    :cond_0
    iget-object v2, v7, Lb0/e;->a:Landroidx/camera/core/impl/c0;

    invoke-interface {v2, v14}, Landroidx/camera/core/impl/c0;->h(Ljava/util/Collection;)V

    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/w;

    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/camera/core/impl/b2;

    invoke-virtual {v4}, Landroidx/camera/core/impl/b2;->d()Landroidx/camera/core/impl/n0;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v3}, Landroidx/camera/core/w;->s()Landroidx/camera/core/impl/y1;

    move-result-object v6

    invoke-static {v4, v6}, Lb0/e;->F(Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/y1;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {v3, v5}, Landroidx/camera/core/w;->U(Landroidx/camera/core/impl/n0;)V

    goto :goto_1

    :cond_2
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/camera/core/w;

    invoke-interface {v15, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lb0/e$c;

    invoke-static {v4}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v7, Lb0/e;->a:Landroidx/camera/core/impl/c0;

    iget-object v6, v4, Lb0/e$c;->a:Landroidx/camera/core/impl/k2;

    iget-object v4, v4, Lb0/e$c;->b:Landroidx/camera/core/impl/k2;

    invoke-virtual {v3, v5, v6, v4}, Landroidx/camera/core/w;->b(Landroidx/camera/core/impl/c0;Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/k2;)V

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/camera/core/impl/b2;

    invoke-static {v4}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/camera/core/impl/b2;

    invoke-virtual {v3, v4}, Landroidx/camera/core/w;->T(Landroidx/camera/core/impl/b2;)V

    goto :goto_2

    :cond_3
    iget-boolean v1, v7, Lb0/e;->w:Z

    if-eqz v1, :cond_4

    iget-object v1, v7, Lb0/e;->a:Landroidx/camera/core/impl/c0;

    invoke-interface {v1, v12}, Landroidx/camera/core/impl/c0;->g(Ljava/util/Collection;)V

    :cond_4
    invoke-interface {v12}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/w;

    invoke-virtual {v2}, Landroidx/camera/core/w;->E()V

    goto :goto_3

    :cond_5
    iget-object v1, v7, Lb0/e;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, v7, Lb0/e;->f:Ljava/util/List;

    invoke-interface {v1, v8}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iget-object v1, v7, Lb0/e;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    iget-object v1, v7, Lb0/e;->r:Ljava/util/List;

    invoke-interface {v1, v11}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    iput-object v0, v7, Lb0/e;->y:Landroidx/camera/core/w;

    iput-object v10, v7, Lb0/e;->z:Li0/d;

    monitor-exit v9

    return-void

    :catch_0
    move-exception v0

    if-nez p2, :cond_6

    invoke-direct/range {p0 .. p0}, Lb0/e;->G()Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, v7, Lb0/e;->s:Lx/a;

    invoke-interface {v1}, Lx/a;->b()I

    move-result v1

    const/4 v2, 0x2

    if-eq v1, v2, :cond_6

    const/4 v0, 0x1

    invoke-virtual {v7, v8, v0}, Lb0/e;->X(Ljava/util/Collection;Z)V

    monitor-exit v9

    return-void

    :cond_6
    throw v0

    :catchall_0
    move-exception v0

    monitor-exit v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public a()Lw/j;
    .locals 1

    iget-object v0, p0, Lb0/e;->A:Landroidx/camera/core/impl/w1;

    return-object v0
.end method

.method public b()Lw/o;
    .locals 1

    iget-object v0, p0, Lb0/e;->B:Landroidx/camera/core/impl/x1;

    return-object v0
.end method

.method public f(Z)V
    .locals 1

    iget-object v0, p0, Lb0/e;->a:Landroidx/camera/core/impl/c0;

    invoke-interface {v0, p1}, Landroidx/camera/core/impl/c0;->f(Z)V

    return-void
.end method

.method public l(Landroidx/camera/core/impl/u;)V
    .locals 3

    iget-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v0

    if-nez p1, :cond_0

    :try_start_0
    invoke-static {}, Landroidx/camera/core/impl/x;->a()Landroidx/camera/core/impl/u;

    move-result-object p1

    :cond_0
    iget-object v1, p0, Lb0/e;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lb0/e;->u:Landroidx/camera/core/impl/u;

    invoke-interface {v1}, Landroidx/camera/core/impl/u;->Q()Landroidx/camera/core/impl/b1;

    move-result-object v1

    invoke-interface {p1}, Landroidx/camera/core/impl/u;->Q()Landroidx/camera/core/impl/b1;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Need to unbind all use cases before binding with extension enabled"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    iput-object p1, p0, Lb0/e;->u:Landroidx/camera/core/impl/u;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Landroidx/camera/core/impl/u;->V(Landroidx/camera/core/impl/z1;)Landroidx/camera/core/impl/z1;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Landroidx/camera/core/impl/z1;->e()Ljava/util/Set;

    move-result-object p1

    iget-object v1, p0, Lb0/e;->A:Landroidx/camera/core/impl/w1;

    const/4 v2, 0x1

    invoke-virtual {v1, v2, p1}, Landroidx/camera/core/impl/w1;->k(ZLjava/util/Set;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lb0/e;->A:Landroidx/camera/core/impl/w1;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1}, Landroidx/camera/core/impl/w1;->k(ZLjava/util/Set;)V

    :goto_1
    iget-object p1, p0, Lb0/e;->a:Landroidx/camera/core/impl/c0;

    iget-object v1, p0, Lb0/e;->u:Landroidx/camera/core/impl/u;

    invoke-interface {p1, v1}, Landroidx/camera/core/impl/c0;->l(Landroidx/camera/core/impl/u;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public n(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/LinkedHashSet;

    iget-object v2, p0, Lb0/e;->f:Ljava/util/List;

    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1, p1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {p0, v1}, Lb0/e;->W(Ljava/util/Collection;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v0

    return-void

    :catch_0
    move-exception p1

    new-instance v1, Lb0/e$a;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lb0/e$a;-><init>(Ljava/lang/String;)V

    throw v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public o()V
    .locals 3

    iget-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lb0/e;->w:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lb0/e;->a:Landroidx/camera/core/impl/c0;

    iget-object v2, p0, Lb0/e;->r:Ljava/util/List;

    invoke-interface {v1, v2}, Landroidx/camera/core/impl/c0;->g(Ljava/util/Collection;)V

    invoke-direct {p0}, Lb0/e;->R()V

    iget-object v1, p0, Lb0/e;->r:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/w;

    invoke-virtual {v2}, Landroidx/camera/core/w;->E()V

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    iput-boolean v1, p0, Lb0/e;->w:Z

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method r(Ljava/util/Collection;)Landroidx/camera/core/w;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/w;",
            ">;)",
            "Landroidx/camera/core/w;"
        }
    .end annotation

    iget-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, Lb0/e;->H()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-direct {p0, p1}, Lb0/e;->J(Ljava/util/Collection;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object p1, p0, Lb0/e;->y:Landroidx/camera/core/w;

    invoke-static {p1}, Lb0/e;->L(Landroidx/camera/core/w;)Z

    move-result p1

    if-eqz p1, :cond_0

    :goto_0
    iget-object p1, p0, Lb0/e;->y:Landroidx/camera/core/w;

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Lb0/e;->u()Landroidx/camera/core/s;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-direct {p0, p1}, Lb0/e;->I(Ljava/util/Collection;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lb0/e;->y:Landroidx/camera/core/w;

    invoke-static {p1}, Lb0/e;->K(Landroidx/camera/core/w;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lb0/e;->t()Landroidx/camera/core/n;

    move-result-object p1

    goto :goto_1

    :cond_3
    const/4 p1, 0x0

    :goto_1
    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public w()V
    .locals 4

    iget-object v0, p0, Lb0/e;->v:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lb0/e;->w:Z

    if-eqz v1, :cond_0

    iget-object v1, p0, Lb0/e;->a:Landroidx/camera/core/impl/c0;

    new-instance v2, Ljava/util/ArrayList;

    iget-object v3, p0, Lb0/e;->r:Ljava/util/List;

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v1, v2}, Landroidx/camera/core/impl/c0;->h(Ljava/util/Collection;)V

    invoke-direct {p0}, Lb0/e;->p()V

    const/4 v1, 0x0

    iput-boolean v1, p0, Lb0/e;->w:Z

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public y()Lb0/e$b;
    .locals 1

    iget-object v0, p0, Lb0/e;->e:Lb0/e$b;

    return-object v0
.end method
