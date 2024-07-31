.class public final Landroidx/camera/core/s;
.super Landroidx/camera/core/w;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/s$c;,
        Landroidx/camera/core/s$b;,
        Landroidx/camera/core/s$a;
    }
.end annotation


# static fields
.field public static final u:Landroidx/camera/core/s$b;

.field private static final v:Ljava/util/concurrent/Executor;


# instance fields
.field private n:Landroidx/camera/core/s$c;

.field private o:Ljava/util/concurrent/Executor;

.field p:Landroidx/camera/core/impl/y1$b;

.field private q:Landroidx/camera/core/impl/r0;

.field private r:Lg0/n0;

.field s:Lw/i1;

.field private t:Lg0/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/camera/core/s$b;

    invoke-direct {v0}, Landroidx/camera/core/s$b;-><init>()V

    sput-object v0, Landroidx/camera/core/s;->u:Landroidx/camera/core/s$b;

    invoke-static {}, Lz/a;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/s;->v:Ljava/util/concurrent/Executor;

    return-void
.end method

.method constructor <init>(Landroidx/camera/core/impl/r1;)V
    .locals 0

    invoke-direct {p0, p1}, Landroidx/camera/core/w;-><init>(Landroidx/camera/core/impl/k2;)V

    sget-object p1, Landroidx/camera/core/s;->v:Ljava/util/concurrent/Executor;

    iput-object p1, p0, Landroidx/camera/core/s;->o:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic V(Landroidx/camera/core/s;Ljava/lang/String;Landroidx/camera/core/impl/r1;Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Landroidx/camera/core/s;->d0(Ljava/lang/String;Landroidx/camera/core/impl/r1;Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V

    return-void
.end method

.method public static synthetic W(Landroidx/camera/core/s$c;Lw/i1;)V
    .locals 0

    invoke-static {p0, p1}, Landroidx/camera/core/s;->f0(Landroidx/camera/core/s$c;Lw/i1;)V

    return-void
.end method

.method public static synthetic X(Landroidx/camera/core/s;Lg0/n0;Landroidx/camera/core/impl/c0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/core/s;->e0(Lg0/n0;Landroidx/camera/core/impl/c0;)V

    return-void
.end method

.method private Y(Landroidx/camera/core/impl/y1$b;Ljava/lang/String;Landroidx/camera/core/impl/r1;Landroidx/camera/core/impl/b2;)V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/s;->n:Landroidx/camera/core/s$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroidx/camera/core/s;->q:Landroidx/camera/core/impl/r0;

    invoke-virtual {p4}, Landroidx/camera/core/impl/b2;->b()Lw/y;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroidx/camera/core/impl/y1$b;->m(Landroidx/camera/core/impl/r0;Lw/y;)Landroidx/camera/core/impl/y1$b;

    :cond_0
    new-instance v0, Lw/t0;

    invoke-direct {v0, p0, p2, p3, p4}, Lw/t0;-><init>(Landroidx/camera/core/s;Ljava/lang/String;Landroidx/camera/core/impl/r1;Landroidx/camera/core/impl/b2;)V

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/y1$b;->f(Landroidx/camera/core/impl/y1$c;)Landroidx/camera/core/impl/y1$b;

    return-void
.end method

.method private Z()V
    .locals 2

    iget-object v0, p0, Landroidx/camera/core/s;->q:Landroidx/camera/core/impl/r0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/impl/r0;->d()V

    iput-object v1, p0, Landroidx/camera/core/s;->q:Landroidx/camera/core/impl/r0;

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/s;->t:Lg0/v0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lg0/v0;->i()V

    iput-object v1, p0, Landroidx/camera/core/s;->t:Lg0/v0;

    :cond_1
    iget-object v0, p0, Landroidx/camera/core/s;->r:Lg0/n0;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lg0/n0;->i()V

    iput-object v1, p0, Landroidx/camera/core/s;->r:Lg0/n0;

    :cond_2
    iput-object v1, p0, Landroidx/camera/core/s;->s:Lw/i1;

    return-void
.end method

.method private a0(Ljava/lang/String;Landroidx/camera/core/impl/r1;Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/y1$b;
    .locals 12

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/impl/c0;

    invoke-direct {p0}, Landroidx/camera/core/s;->Z()V

    iget-object v1, p0, Landroidx/camera/core/s;->r:Lg0/n0;

    if-nez v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Landroidx/core/util/h;->m(Z)V

    new-instance v1, Lg0/n0;

    const/4 v3, 0x1

    const/16 v4, 0x22

    invoke-virtual {p0}, Landroidx/camera/core/w;->r()Landroid/graphics/Matrix;

    move-result-object v6

    invoke-interface {v0}, Landroidx/camera/core/impl/c0;->m()Z

    move-result v7

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->e()Landroid/util/Size;

    move-result-object v2

    invoke-direct {p0, v2}, Landroidx/camera/core/s;->b0(Landroid/util/Size;)Landroid/graphics/Rect;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, v0}, Landroidx/camera/core/w;->z(Landroidx/camera/core/impl/c0;)Z

    move-result v2

    invoke-virtual {p0, v0, v2}, Landroidx/camera/core/s;->p(Landroidx/camera/core/impl/c0;Z)I

    move-result v9

    invoke-virtual {p0}, Landroidx/camera/core/w;->c()I

    move-result v10

    invoke-direct {p0, v0}, Landroidx/camera/core/s;->l0(Landroidx/camera/core/impl/c0;)Z

    move-result v11

    move-object v2, v1

    move-object v5, p3

    invoke-direct/range {v2 .. v11}, Lg0/n0;-><init>(IILandroidx/camera/core/impl/b2;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    iput-object v1, p0, Landroidx/camera/core/s;->r:Lg0/n0;

    invoke-virtual {p0}, Landroidx/camera/core/w;->k()Lw/k;

    move-result-object v1

    if-eqz v1, :cond_1

    new-instance v2, Lg0/v0;

    invoke-virtual {v1}, Lw/k;->a()Lg0/r0;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Lg0/v0;-><init>(Landroidx/camera/core/impl/c0;Lg0/r0;)V

    iput-object v2, p0, Landroidx/camera/core/s;->t:Lg0/v0;

    iget-object v1, p0, Landroidx/camera/core/s;->r:Lg0/n0;

    new-instance v2, Landroidx/camera/core/r;

    invoke-direct {v2, p0}, Landroidx/camera/core/r;-><init>(Landroidx/camera/core/s;)V

    invoke-virtual {v1, v2}, Lg0/n0;->f(Ljava/lang/Runnable;)V

    iget-object v1, p0, Landroidx/camera/core/s;->r:Lg0/n0;

    invoke-static {v1}, Lg0/v0$d;->i(Lg0/n0;)Lg0/v0$d;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/core/s;->r:Lg0/n0;

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {v2, v3}, Lg0/v0$b;->c(Lg0/n0;Ljava/util/List;)Lg0/v0$b;

    move-result-object v2

    iget-object v3, p0, Landroidx/camera/core/s;->t:Lg0/v0;

    invoke-virtual {v3, v2}, Lg0/v0;->m(Lg0/v0$b;)Lg0/v0$c;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg0/n0;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lw/r0;

    invoke-direct {v2, p0, v1, v0}, Lw/r0;-><init>(Landroidx/camera/core/s;Lg0/n0;Landroidx/camera/core/impl/c0;)V

    invoke-virtual {v1, v2}, Lg0/n0;->f(Ljava/lang/Runnable;)V

    invoke-virtual {v1, v0}, Lg0/n0;->k(Landroidx/camera/core/impl/c0;)Lw/i1;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/s;->s:Lw/i1;

    iget-object v0, p0, Landroidx/camera/core/s;->r:Lg0/n0;

    invoke-virtual {v0}, Lg0/n0;->o()Landroidx/camera/core/impl/r0;

    move-result-object v0

    goto :goto_1

    :cond_1
    iget-object v1, p0, Landroidx/camera/core/s;->r:Lg0/n0;

    new-instance v2, Landroidx/camera/core/r;

    invoke-direct {v2, p0}, Landroidx/camera/core/r;-><init>(Landroidx/camera/core/s;)V

    invoke-virtual {v1, v2}, Lg0/n0;->f(Ljava/lang/Runnable;)V

    iget-object v1, p0, Landroidx/camera/core/s;->r:Lg0/n0;

    invoke-virtual {v1, v0}, Lg0/n0;->k(Landroidx/camera/core/impl/c0;)Lw/i1;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/s;->s:Lw/i1;

    invoke-virtual {v0}, Lw/i1;->j()Landroidx/camera/core/impl/r0;

    move-result-object v0

    :goto_1
    iput-object v0, p0, Landroidx/camera/core/s;->q:Landroidx/camera/core/impl/r0;

    iget-object v0, p0, Landroidx/camera/core/s;->n:Landroidx/camera/core/s$c;

    if-eqz v0, :cond_2

    invoke-direct {p0}, Landroidx/camera/core/s;->h0()V

    :cond_2
    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->e()Landroid/util/Size;

    move-result-object v0

    invoke-static {p2, v0}, Landroidx/camera/core/impl/y1$b;->p(Landroidx/camera/core/impl/k2;Landroid/util/Size;)Landroidx/camera/core/impl/y1$b;

    move-result-object v0

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->c()Landroid/util/Range;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/y1$b;->q(Landroid/util/Range;)Landroidx/camera/core/impl/y1$b;

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->d()Landroidx/camera/core/impl/n0;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-virtual {p3}, Landroidx/camera/core/impl/b2;->d()Landroidx/camera/core/impl/n0;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/y1$b;->g(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/y1$b;

    :cond_3
    invoke-direct {p0, v0, p1, p2, p3}, Landroidx/camera/core/s;->Y(Landroidx/camera/core/impl/y1$b;Ljava/lang/String;Landroidx/camera/core/impl/r1;Landroidx/camera/core/impl/b2;)V

    return-object v0
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
    if-eqz p1, :cond_1

    new-instance v0, Landroid/graphics/Rect;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v1

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v2, v1, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic d0(Ljava/lang/String;Landroidx/camera/core/impl/r1;Landroidx/camera/core/impl/b2;Landroidx/camera/core/impl/y1;Landroidx/camera/core/impl/y1$f;)V
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/camera/core/w;->x(Ljava/lang/String;)Z

    move-result p4

    if-eqz p4, :cond_0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/core/s;->a0(Ljava/lang/String;Landroidx/camera/core/impl/r1;Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/y1$b;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$b;->o()Landroidx/camera/core/impl/y1;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/w;->S(Landroidx/camera/core/impl/y1;)V

    invoke-virtual {p0}, Landroidx/camera/core/w;->D()V

    :cond_0
    return-void
.end method

.method private synthetic e0(Lg0/n0;Landroidx/camera/core/impl/c0;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroidx/camera/core/s;->g0(Lg0/n0;Landroidx/camera/core/impl/c0;)V

    return-void
.end method

.method private static synthetic f0(Landroidx/camera/core/s$c;Lw/i1;)V
    .locals 0

    invoke-interface {p0, p1}, Landroidx/camera/core/s$c;->a(Lw/i1;)V

    return-void
.end method

.method private g0(Lg0/n0;Landroidx/camera/core/impl/c0;)V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v0

    if-ne p2, v0, :cond_0

    invoke-virtual {p1, p2}, Lg0/n0;->k(Landroidx/camera/core/impl/c0;)Lw/i1;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/s;->s:Lw/i1;

    invoke-direct {p0}, Landroidx/camera/core/s;->h0()V

    :cond_0
    return-void
.end method

.method private h0()V
    .locals 4

    invoke-direct {p0}, Landroidx/camera/core/s;->i0()V

    iget-object v0, p0, Landroidx/camera/core/s;->n:Landroidx/camera/core/s$c;

    invoke-static {v0}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/s$c;

    iget-object v1, p0, Landroidx/camera/core/s;->s:Lw/i1;

    invoke-static {v1}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/i1;

    iget-object v2, p0, Landroidx/camera/core/s;->o:Ljava/util/concurrent/Executor;

    new-instance v3, Lw/s0;

    invoke-direct {v3, v0, v1}, Lw/s0;-><init>(Landroidx/camera/core/s$c;Lw/i1;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private i0()V
    .locals 3

    invoke-virtual {p0}, Landroidx/camera/core/w;->f()Landroidx/camera/core/impl/c0;

    move-result-object v0

    iget-object v1, p0, Landroidx/camera/core/s;->r:Lg0/n0;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {p0, v0}, Landroidx/camera/core/w;->z(Landroidx/camera/core/impl/c0;)Z

    move-result v2

    invoke-virtual {p0, v0, v2}, Landroidx/camera/core/s;->p(Landroidx/camera/core/impl/c0;Z)I

    move-result v0

    invoke-virtual {p0}, Landroidx/camera/core/w;->c()I

    move-result v2

    invoke-virtual {v1, v0, v2}, Lg0/n0;->D(II)V

    :cond_0
    return-void
.end method

.method private l0(Landroidx/camera/core/impl/c0;)Z
    .locals 1

    invoke-interface {p1}, Landroidx/camera/core/impl/c0;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/camera/core/w;->z(Landroidx/camera/core/impl/c0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private m0(Ljava/lang/String;Landroidx/camera/core/impl/r1;Landroidx/camera/core/impl/b2;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Landroidx/camera/core/s;->a0(Ljava/lang/String;Landroidx/camera/core/impl/r1;Landroidx/camera/core/impl/b2;)Landroidx/camera/core/impl/y1$b;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/s;->p:Landroidx/camera/core/impl/y1$b;

    invoke-virtual {p1}, Landroidx/camera/core/impl/y1$b;->o()Landroidx/camera/core/impl/y1;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/camera/core/w;->S(Landroidx/camera/core/impl/y1;)V

    return-void
.end method


# virtual methods
.method protected H(Landroidx/camera/core/impl/b0;Landroidx/camera/core/impl/k2$a;)Landroidx/camera/core/impl/k2;
    .locals 2
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

    invoke-interface {p2}, Lw/z;->a()Landroidx/camera/core/impl/l1;

    move-result-object p1

    sget-object v0, Landroidx/camera/core/impl/e1;->f:Landroidx/camera/core/impl/n0$a;

    const/16 v1, 0x22

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    invoke-interface {p2}, Landroidx/camera/core/impl/k2$a;->b()Landroidx/camera/core/impl/k2;

    move-result-object p1

    return-object p1
.end method

.method protected K(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/b2;
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/s;->p:Landroidx/camera/core/impl/y1$b;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/y1$b;->g(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/y1$b;

    iget-object v0, p0, Landroidx/camera/core/s;->p:Landroidx/camera/core/impl/y1$b;

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

    check-cast v1, Landroidx/camera/core/impl/r1;

    invoke-direct {p0, v0, v1, p1}, Landroidx/camera/core/s;->m0(Ljava/lang/String;Landroidx/camera/core/impl/r1;Landroidx/camera/core/impl/b2;)V

    return-object p1
.end method

.method public M()V
    .locals 0

    invoke-direct {p0}, Landroidx/camera/core/s;->Z()V

    return-void
.end method

.method public Q(Landroid/graphics/Rect;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/camera/core/w;->Q(Landroid/graphics/Rect;)V

    invoke-direct {p0}, Landroidx/camera/core/s;->i0()V

    return-void
.end method

.method public c0()I
    .locals 1

    invoke-virtual {p0}, Landroidx/camera/core/w;->u()I

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

    sget-object v0, Landroidx/camera/core/s;->u:Landroidx/camera/core/s$b;

    invoke-virtual {v0}, Landroidx/camera/core/s$b;->a()Landroidx/camera/core/impl/r1;

    move-result-object v1

    invoke-interface {v1}, Landroidx/camera/core/impl/k2;->N()Landroidx/camera/core/impl/l2$b;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {p2, v1, v2}, Landroidx/camera/core/impl/l2;->a(Landroidx/camera/core/impl/l2$b;I)Landroidx/camera/core/impl/n0;

    move-result-object p2

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Landroidx/camera/core/s$b;->a()Landroidx/camera/core/impl/r1;

    move-result-object p1

    invoke-static {p2, p1}, Landroidx/camera/core/impl/n0;->O(Landroidx/camera/core/impl/n0;Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/n0;

    move-result-object p2

    :cond_0
    if-nez p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p2}, Landroidx/camera/core/s;->v(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/k2$a;

    move-result-object p1

    invoke-interface {p1}, Landroidx/camera/core/impl/k2$a;->b()Landroidx/camera/core/impl/k2;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public j0(Landroidx/camera/core/s$c;)V
    .locals 1

    sget-object v0, Landroidx/camera/core/s;->v:Ljava/util/concurrent/Executor;

    invoke-virtual {p0, v0, p1}, Landroidx/camera/core/s;->k0(Ljava/util/concurrent/Executor;Landroidx/camera/core/s$c;)V

    return-void
.end method

.method public k0(Ljava/util/concurrent/Executor;Landroidx/camera/core/s$c;)V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    if-nez p2, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/camera/core/s;->n:Landroidx/camera/core/s$c;

    invoke-virtual {p0}, Landroidx/camera/core/w;->C()V

    goto :goto_0

    :cond_0
    iput-object p2, p0, Landroidx/camera/core/s;->n:Landroidx/camera/core/s$c;

    iput-object p1, p0, Landroidx/camera/core/s;->o:Ljava/util/concurrent/Executor;

    invoke-virtual {p0}, Landroidx/camera/core/w;->e()Landroid/util/Size;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroidx/camera/core/w;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/camera/core/w;->i()Landroidx/camera/core/impl/k2;

    move-result-object p2

    check-cast p2, Landroidx/camera/core/impl/r1;

    invoke-virtual {p0}, Landroidx/camera/core/w;->d()Landroidx/camera/core/impl/b2;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Landroidx/camera/core/s;->m0(Ljava/lang/String;Landroidx/camera/core/impl/r1;Landroidx/camera/core/impl/b2;)V

    invoke-virtual {p0}, Landroidx/camera/core/w;->D()V

    :cond_1
    invoke-virtual {p0}, Landroidx/camera/core/w;->B()V

    :goto_0
    return-void
.end method

.method protected p(Landroidx/camera/core/impl/c0;Z)I
    .locals 1

    invoke-interface {p1}, Landroidx/camera/core/impl/c0;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-super {p0, p1, p2}, Landroidx/camera/core/w;->p(Landroidx/camera/core/impl/c0;Z)I

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
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

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Preview:"

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

    invoke-static {p1}, Landroidx/camera/core/s$a;->d(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/s$a;

    move-result-object p1

    return-object p1
.end method
