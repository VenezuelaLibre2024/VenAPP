.class public final Landroidx/camera/core/f;
.super Landroidx/camera/core/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/f$a;,
        Landroidx/camera/core/f$d;,
        Landroidx/camera/core/f$c;,
        Landroidx/camera/core/f$e;,
        Landroidx/camera/core/f$b;
    }
.end annotation


# static fields
.field public static final s:Landroidx/camera/core/f$d;

.field private static final t:Ljava/lang/Boolean;


# instance fields
.field final n:Landroidx/camera/core/i;

.field private final o:Ljava/lang/Object;

.field private p:Landroidx/camera/core/f$a;

.field q:Landroidx/camera/core/impl/y1$b;

.field private r:Landroidx/camera/core/impl/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/core/f$d;

    invoke-direct {v0}, Landroidx/camera/core/f$d;-><init>()V

    sput-object v0, Landroidx/camera/core/f;->s:Landroidx/camera/core/f$d;

    const/4 v0, 0x0

    sput-object v0, Landroidx/camera/core/f;->t:Ljava/lang/Boolean;

    return-void
.end method

.method constructor <init>(Landroidx/camera/core/impl/c1;)V
    .locals 2

    invoke-direct {p0, p1}, Landroidx/camera/core/w;-><init>(Landroidx/camera/core/impl/k2;)V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/f;->o:Ljava/lang/Object;

    invoke-virtual {p0}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/c1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/c1;->W(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    new-instance p1, Landroidx/camera/core/j;

    invoke-direct {p1}, Landroidx/camera/core/j;-><init>()V

    iput-object p1, p0, Landroidx/camera/core/f;->n:Landroidx/camera/core/i;

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/camera/core/k;

    invoke-static {}, Lz/a;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-interface {p1, v1}, Lb0/k;->R(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-direct {v0, p1}, Landroidx/camera/core/k;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v0, p0, Landroidx/camera/core/f;->n:Landroidx/camera/core/i;

    :goto_0
    iget-object p1, p0, Landroidx/camera/core/f;->n:Landroidx/camera/core/i;

    invoke-virtual {p0}, Landroidx/camera/core/f;->d0()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/i;->t(I)V

    iget-object p1, p0, Landroidx/camera/core/f;->n:Landroidx/camera/core/i;

    invoke-virtual {p0}, Landroidx/camera/core/f;->g0()Z

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/i;->u(Z)V

    return-void
.end method

.method public static synthetic V(Landroidx/camera/core/f;Ljava/lang/String;Landroidx/camera/core/impl/c1;Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/camera/core/f;->i0(Ljava/lang/String;Landroidx/camera/core/impl/c1;Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V

    return-void
.end method

.method public static synthetic W(Landroidx/camera/core/f$a;Landroidx/camera/core/o;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/f;->j0(Landroidx/camera/core/f$a;Landroidx/camera/core/o;)V

    return-void
.end method

.method public static synthetic X(Landroidx/camera/core/t;Landroidx/camera/core/t;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/f;->h0(Landroidx/camera/core/t;Landroidx/camera/core/t;)V

    return-void
.end method

.method private f0(Landroidx/camera/core/impl/c0;)Z
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/f;->g0()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/camera/core/w;->o(Landroidx/camera/core/impl/c0;)I

    move-result p1

    rem-int/lit16 p1, p1, 0xb4

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private static synthetic h0(Landroidx/camera/core/t;Landroidx/camera/core/t;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/t;->l()V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroidx/camera/core/t;->l()V

    :cond_0
    return-void
.end method

.method private synthetic i0(Ljava/lang/String;Landroidx/camera/core/impl/c1;Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V
    .locals 0

    invoke-virtual {p0}, Landroidx/camera/core/f;->Y()V

    iget-object p4, p0, Landroidx/camera/core/f;->n:Landroidx/camera/core/i;

    invoke-virtual {p4}, Landroidx/camera/core/i;->g()V

    invoke-virtual {p0, p1}, Landroidx/camera/core/w;->x(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/camera/core/f;->Z(Ljava/lang/String;Landroidx/camera/core/impl/c1;Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/y1$b;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$b;->o()Landroidx/camera/core/impl/y1;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/w;->S(Landroidx/camera/core/impl/y1;)V

    invoke-virtual {p0}, Landroidx/camera/core/w;->D()V

    :cond_0
    return-void
.end method

.method private static synthetic j0(Landroidx/camera/core/f$a;Landroidx/camera/core/o;)V
    .locals 0

    invoke-interface {p0, p1}, Landroidx/camera/core/f$a;->b(Landroidx/camera/core/o;)V

    return-void
.end method

.method private l0()V
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Landroidx/camera/core/f;->n:Landroidx/camera/core/i;

    invoke-virtual {p0, v0}, Landroidx/camera/core/w;->o(Landroidx/camera/core/impl/c0;)I

    move-result v0

    invoke-virtual {v1, v0}, Landroidx/camera/core/i;->w(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public F()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/f;->n:Landroidx/camera/core/i;

    invoke-virtual {v0}, Landroidx/camera/core/i;->f()V

    return-void
.end method

.method protected H(Landroidx/camera/core/impl/b0;Landroidx/camera/core/impl/k2$a;)Landroidx/camera/core/impl/k2;
    .locals 5
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

    invoke-virtual {p0}, Landroidx/camera/core/f;->c0()Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1}, Landroidx/camera/core/impl/b0;->e()Landroidx/camera/core/impl/t1;

    move-result-object v1

    const-class v2, Ld0/g;

    invoke-virtual {v1, v2}, Landroidx/camera/core/impl/t1;->a(Ljava/lang/Class;)Z

    move-result v1

    iget-object v2, p0, Landroidx/camera/core/f;->n:Landroidx/camera/core/i;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :goto_0
    invoke-virtual {v2, v1}, Landroidx/camera/core/i;->s(Z)V

    iget-object v0, p0, Landroidx/camera/core/f;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/f;->p:Landroidx/camera/core/f$a;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v1}, Landroidx/camera/core/f$a;->a()Landroid/util/Size;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v1, :cond_2

    invoke-interface {p2}, Landroidx/camera/core/impl/k2$a;->b()Landroidx/camera/core/impl/k2;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-interface {p2}, Lw/z;->a()Landroidx/camera/core/impl/l1;

    move-result-object v0

    sget-object v3, Landroidx/camera/core/impl/f1;->i:Landroidx/camera/core/impl/n0$a;

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v0, v3, v4}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-interface {p1, v0}, Lw/o;->i(I)I

    move-result p1

    rem-int/lit16 p1, p1, 0xb4

    const/16 v0, 0x5a

    if-ne p1, v0, :cond_3

    new-instance p1, Landroid/util/Size;

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-direct {p1, v0, v1}, Landroid/util/Size;-><init>(II)V

    move-object v1, p1

    :cond_3
    invoke-interface {p2}, Landroidx/camera/core/impl/k2$a;->b()Landroidx/camera/core/impl/k2;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/f1;->l:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p1, v0}, Landroidx/camera/core/impl/u1;->b(Landroidx/camera/core/impl/n0$a;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-interface {p2}, Lw/z;->a()Landroidx/camera/core/impl/l1;

    move-result-object p1

    invoke-interface {p1, v0, v1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p2}, Lw/z;->a()Landroidx/camera/core/impl/l1;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/f1;->p:Landroidx/camera/core/impl/n0$a;

    invoke-interface {p1, v0, v2}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh0/c;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lh0/c;->d()Lh0/d;

    move-result-object v2

    if-nez v2, :cond_5

    invoke-static {p1}, Lh0/c$a;->b(Lh0/c;)Lh0/c$a;

    move-result-object p1

    new-instance v2, Lh0/d;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, Lh0/d;-><init>(Landroid/util/Size;I)V

    invoke-virtual {p1, v2}, Lh0/c$a;->e(Lh0/d;)Lh0/c$a;

    invoke-interface {p2}, Lw/z;->a()Landroidx/camera/core/impl/l1;

    move-result-object v1

    invoke-virtual {p1}, Lh0/c$a;->a()Lh0/c;

    move-result-object p1

    invoke-interface {v1, v0, p1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    :cond_5
    invoke-interface {p2}, Landroidx/camera/core/impl/k2$a;->b()Landroidx/camera/core/impl/k2;

    move-result-object p1

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method protected K(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/f;->q:Landroidx/camera/core/impl/y1$b;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/y1$b;->g(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/y1$b;

    iget-object v0, p0, Landroidx/camera/core/f;->q:Landroidx/camera/core/impl/y1$b;

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

    invoke-virtual {p0}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/c1;

    invoke-virtual {p0}, Landroidx/camera/core/w;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1, v0, p1}, Landroidx/camera/core/f;->Z(Ljava/lang/String;Landroidx/camera/core/impl/c1;Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/y1$b;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/f;->q:Landroidx/camera/core/impl/y1$b;

    invoke-virtual {v0}, Landroidx/camera/core/impl/y1$b;->o()Landroidx/camera/core/impl/y1;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroidx/camera/core/w;->S(Landroidx/camera/core/impl/y1;)V

    return-object p1
.end method

.method public M()V
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/f;->Y()V

    iget-object v0, p0, Landroidx/camera/core/f;->n:Landroidx/camera/core/i;

    invoke-virtual {v0}, Landroidx/camera/core/i;->j()V

    return-void
.end method

.method public P(Landroid/graphics/Matrix;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/camera/core/w;->P(Landroid/graphics/Matrix;)V

    iget-object v0, p0, Landroidx/camera/core/f;->n:Landroidx/camera/core/i;

    invoke-virtual {v0, p1}, Landroidx/camera/core/i;->x(Landroid/graphics/Matrix;)V

    return-void
.end method

.method public Q(Landroid/graphics/Rect;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/camera/core/w;->Q(Landroid/graphics/Rect;)V

    iget-object v0, p0, Landroidx/camera/core/f;->n:Landroidx/camera/core/i;

    invoke-virtual {v0, p1}, Landroidx/camera/core/i;->y(Landroid/graphics/Rect;)V

    return-void
.end method

.method Y()V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Landroidx/camera/core/f;->r:Landroidx/camera/core/impl/r0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/impl/r0;->d()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/camera/core/f;->r:Landroidx/camera/core/impl/r0;

    :cond_0
    return-void
.end method

.method Z(Ljava/lang/String;Landroidx/camera/core/impl/c1;Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/y1$b;
    .locals 11

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->e()Landroid/util/Size;

    move-result-object v0

    invoke-static {}, Lz/a;->b()Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-interface {p2, v1}, Lb0/k;->R(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v1

    invoke-static {v1}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    invoke-virtual {p0}, Landroidx/camera/core/f;->a0()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/f;->b0()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x4

    :goto_0
    move v8, v2

    invoke-virtual {p2}, Landroidx/camera/core/impl/c1;->Y()Lw/l0;

    move-result-object v2

    if-eqz v2, :cond_1

    new-instance v2, Landroidx/camera/core/t;

    invoke-virtual {p2}, Landroidx/camera/core/impl/c1;->Y()Lw/l0;

    move-result-object v4

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v5

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v6

    invoke-virtual {p0}, Landroidx/camera/core/w;->l()I

    move-result v7

    const-wide/16 v9, 0x0

    invoke-interface/range {v4 .. v10}, Lw/l0;->a(IIIIJ)Landroidx/camera/core/impl/g1;

    move-result-object v4

    invoke-direct {v2, v4}, Landroidx/camera/core/t;-><init>(Landroidx/camera/core/impl/g1;)V

    goto :goto_1

    :cond_1
    new-instance v2, Landroidx/camera/core/t;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v5

    invoke-virtual {p0}, Landroidx/camera/core/w;->l()I

    move-result v6

    invoke-static {v4, v5, v6, v8}, Landroidx/camera/core/p;->a(IIII)Landroidx/camera/core/impl/g1;

    move-result-object v4

    invoke-direct {v2, v4}, Landroidx/camera/core/t;-><init>(Landroidx/camera/core/impl/g1;)V

    :goto_1
    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v4

    invoke-direct {p0, v4}, Landroidx/camera/core/f;->f0(Landroidx/camera/core/impl/c0;)Z

    move-result v4

    goto :goto_2

    :cond_2
    move v4, v5

    :goto_2
    if-eqz v4, :cond_3

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v6

    goto :goto_3

    :cond_3
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v6

    :goto_3
    if-eqz v4, :cond_4

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v4

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v4

    :goto_4
    invoke-virtual {p0}, Landroidx/camera/core/f;->d0()I

    move-result v7

    const/4 v8, 0x2

    const/16 v9, 0x23

    if-ne v7, v8, :cond_5

    move v7, v3

    goto :goto_5

    :cond_5
    move v7, v9

    :goto_5
    invoke-virtual {p0}, Landroidx/camera/core/w;->l()I

    move-result v10

    if-ne v10, v9, :cond_6

    invoke-virtual {p0}, Landroidx/camera/core/f;->d0()I

    move-result v10

    if-ne v10, v8, :cond_6

    move v8, v3

    goto :goto_6

    :cond_6
    move v8, v5

    :goto_6
    invoke-virtual {p0}, Landroidx/camera/core/w;->l()I

    move-result v10

    if-ne v10, v9, :cond_8

    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v9

    if-eqz v9, :cond_7

    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v9

    invoke-virtual {p0, v9}, Landroidx/camera/core/w;->o(Landroidx/camera/core/impl/c0;)I

    move-result v9

    if-nez v9, :cond_9

    :cond_7
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0}, Landroidx/camera/core/f;->c0()Ljava/lang/Boolean;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    goto :goto_7

    :cond_8
    move v3, v5

    :cond_9
    :goto_7
    if-nez v8, :cond_b

    if-eqz v3, :cond_a

    goto :goto_8

    :cond_a
    const/4 v3, 0x0

    goto :goto_9

    :cond_b
    :goto_8
    new-instance v3, Landroidx/camera/core/t;

    invoke-virtual {v2}, Landroidx/camera/core/t;->e()I

    move-result v5

    invoke-static {v6, v4, v7, v5}, Landroidx/camera/core/p;->a(IIII)Landroidx/camera/core/impl/g1;

    move-result-object v4

    invoke-direct {v3, v4}, Landroidx/camera/core/t;-><init>(Landroidx/camera/core/impl/g1;)V

    :goto_9
    if-eqz v3, :cond_c

    iget-object v4, p0, Landroidx/camera/core/f;->n:Landroidx/camera/core/i;

    invoke-virtual {v4, v3}, Landroidx/camera/core/i;->v(Landroidx/camera/core/t;)V

    :cond_c
    invoke-direct {p0}, Landroidx/camera/core/f;->l0()V

    iget-object v4, p0, Landroidx/camera/core/f;->n:Landroidx/camera/core/i;

    invoke-virtual {v2, v4, v1}, Landroidx/camera/core/t;->f(Landroidx/camera/core/impl/g1$a;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->e()Landroid/util/Size;

    move-result-object v1

    invoke-static {p2, v1}, Landroidx/camera/core/impl/y1$b;->p(Landroidx/camera/core/impl/k2;Landroid/util/Size;)Landroidx/camera/core/impl/y1$b;

    move-result-object v1

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->d()Landroidx/camera/core/impl/n0;

    move-result-object v4

    if-eqz v4, :cond_d

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->d()Landroidx/camera/core/impl/n0;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroidx/camera/core/impl/y1$b;->g(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/y1$b;

    :cond_d
    iget-object v4, p0, Landroidx/camera/core/f;->r:Landroidx/camera/core/impl/r0;

    if-eqz v4, :cond_e

    invoke-virtual {v4}, Landroidx/camera/core/impl/r0;->d()V

    :cond_e
    new-instance v4, Landroidx/camera/core/impl/h1;

    invoke-virtual {v2}, Landroidx/camera/core/t;->getSurface()Landroid/view/Surface;

    move-result-object v5

    invoke-virtual {p0}, Landroidx/camera/core/w;->l()I

    move-result v6

    invoke-direct {v4, v5, v0, v6}, Landroidx/camera/core/impl/h1;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    iput-object v4, p0, Landroidx/camera/core/f;->r:Landroidx/camera/core/impl/r0;

    invoke-virtual {v4}, Landroidx/camera/core/impl/r0;->k()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    new-instance v4, Lw/a0;

    invoke-direct {v4, v2, v3}, Lw/a0;-><init>(Landroidx/camera/core/t;Landroidx/camera/core/t;)V

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v2

    invoke-interface {v0, v4, v2}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->c()Landroid/util/Range;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroidx/camera/core/impl/y1$b;->q(Landroid/util/Range;)Landroidx/camera/core/impl/y1$b;

    iget-object v0, p0, Landroidx/camera/core/f;->r:Landroidx/camera/core/impl/r0;

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->b()Lw/y;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Landroidx/camera/core/impl/y1$b;->m(Landroidx/camera/core/impl/r0;Lw/y;)Landroidx/camera/core/impl/y1$b;

    new-instance v0, Lw/b0;

    invoke-direct {v0, p0, p1, p2, p3}, Lw/b0;-><init>(Landroidx/camera/core/f;Ljava/lang/String;Landroidx/camera/core/impl/c1;Landroidx/camera/core/impl/b2;)V

    invoke-virtual {v1, v0}, Landroidx/camera/core/impl/y1$b;->f(Landroidx/camera/core/impl/y1$c;)Landroidx/camera/core/impl/y1$b;

    return-object v1
.end method

.method public a0()I
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/c1;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/c1;->W(I)I

    move-result v0

    return v0
.end method

.method public b0()I
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/c1;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/c1;->X(I)I

    move-result v0

    return v0
.end method

.method public c0()Ljava/lang/Boolean;
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/c1;

    sget-object v1, Landroidx/camera/core/f;->t:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/c1;->Z(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public d0()I
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/c1;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/c1;->a0(I)I

    move-result v0

    return v0
.end method

.method public e0()Lw/u0;
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/w;->q()Lw/u0;

    move-result-object v0

    return-object v0
.end method

.method public g0()Z
    .locals 2

    invoke-virtual {p0}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/c1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/c1;->b0(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public j(ZLandroidx/camera/core/impl/l2;)Landroidx/camera/core/impl/k2;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Landroidx/camera/core/impl/l2;",
            ")",
            "Landroidx/camera/core/impl/k2<",
            "*>;"
        }
    .end annotation

    sget-object v0, Landroidx/camera/core/f;->s:Landroidx/camera/core/f$d;

    invoke-virtual {v0}, Landroidx/camera/core/f$d;->a()Landroidx/camera/core/impl/c1;

    move-result-object v1

    invoke-interface {v1}, Landroidx/camera/core/impl/k2;->N()Landroidx/camera/core/impl/l2$b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {p2, v1, v2}, Landroidx/camera/core/impl/l2;->a(Landroidx/camera/core/impl/l2$b;I)Landroidx/camera/core/impl/n0;

    move-result-object p2

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/f$d;->a()Landroidx/camera/core/impl/c1;

    move-result-object p1

    invoke-static {p2, p1}, Landroidx/camera/core/impl/n0;->O(Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/n0;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2}, Landroidx/camera/core/f;->v(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/k2$a;

    move-result-object p1

    invoke-interface {p1}, Landroidx/camera/core/impl/k2$a;->b()Landroidx/camera/core/impl/k2;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public k0(Ljava/util/concurrent/Executor;Landroidx/camera/core/f$a;)V
    .locals 3

    iget-object v0, p0, Landroidx/camera/core/f;->o:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/camera/core/f;->n:Landroidx/camera/core/i;

    new-instance v2, Lw/c0;

    invoke-direct {v2, p2}, Lw/c0;-><init>(Landroidx/camera/core/f$a;)V

    invoke-virtual {v1, p1, v2}, Landroidx/camera/core/i;->r(Ljava/util/concurrent/Executor;Landroidx/camera/core/f$a;)V

    iget-object p1, p0, Landroidx/camera/core/f;->p:Landroidx/camera/core/f$a;

    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroidx/camera/core/w;->B()V

    :cond_0
    iput-object p2, p0, Landroidx/camera/core/f;->p:Landroidx/camera/core/f$a;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ImageAnalysis:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/camera/core/w;->n()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public v(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/k2$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/n0;",
            ")",
            "Landroidx/camera/core/impl/k2$a<",
            "***>;"
        }
    .end annotation

    invoke-static {p1}, Landroidx/camera/core/f$c;->d(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/f$c;

    move-result-object p1

    return-object p1
.end method
