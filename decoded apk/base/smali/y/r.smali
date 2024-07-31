.class public Ly/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final g:Le0/b;


# instance fields
.field private final a:Landroidx/camera/core/impl/d1;

.field private final b:Landroidx/camera/core/impl/l0;

.field private final c:Ly/o;

.field private final d:Ly/m0;

.field private final e:Ly/e0;

.field private final f:Ly/o$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Le0/b;

    invoke-direct {v0}, Le0/b;-><init>()V

    sput-object v0, Ly/r;->g:Le0/b;

    return-void
.end method

.method public constructor <init>(Landroidx/camera/core/impl/d1;Landroid/util/Size;Lw/k;Z)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iput-object p1, p0, Ly/r;->a:Landroidx/camera/core/impl/d1;

    invoke-static {p1}, Landroidx/camera/core/impl/l0$a;->j(Landroidx/camera/core/impl/k2;)Landroidx/camera/core/impl/l0$a;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/camera/core/impl/l0$a;->h()Landroidx/camera/core/impl/l0;

    move-result-object v0

    iput-object v0, p0, Ly/r;->b:Landroidx/camera/core/impl/l0;

    new-instance v0, Ly/o;

    invoke-direct {v0}, Ly/o;-><init>()V

    iput-object v0, p0, Ly/r;->c:Ly/o;

    new-instance v1, Ly/m0;

    invoke-direct {v1}, Ly/m0;-><init>()V

    iput-object v1, p0, Ly/r;->d:Ly/m0;

    new-instance v2, Ly/e0;

    invoke-static {}, Lz/a;->c()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroidx/camera/core/impl/d1;->b0(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/Executor;

    if-eqz p3, :cond_0

    new-instance v4, Lg0/z;

    invoke-direct {v4, p3}, Lg0/z;-><init>(Lw/k;)V

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    invoke-direct {v2, v3, v4}, Ly/e0;-><init>(Ljava/util/concurrent/Executor;Lg0/z;)V

    iput-object v2, p0, Ly/r;->e:Ly/e0;

    invoke-virtual {p1}, Landroidx/camera/core/impl/d1;->n()I

    move-result p3

    invoke-direct {p0}, Ly/r;->i()I

    move-result v3

    invoke-virtual {p1}, Landroidx/camera/core/impl/d1;->a0()Lw/l0;

    move-result-object p1

    invoke-static {p2, p3, v3, p4, p1}, Ly/o$b;->j(Landroid/util/Size;IIZLw/l0;)Ly/o$b;

    move-result-object p1

    iput-object p1, p0, Ly/r;->f:Ly/o$b;

    invoke-virtual {v0, p1}, Ly/o;->n(Ly/o$b;)Ly/o$c;

    move-result-object p1

    invoke-virtual {v1, p1}, Ly/m0;->f(Ly/o$c;)Ly/e0$a;

    move-result-object p1

    invoke-virtual {v2, p1}, Ly/e0;->q(Ly/e0$a;)Ljava/lang/Void;

    return-void
.end method

.method private b(Landroidx/camera/core/impl/k0;Ly/v0;Ly/n0;)Ly/j;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Landroidx/camera/core/impl/k0;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/camera/core/impl/m0;

    new-instance v3, Landroidx/camera/core/impl/l0$a;

    invoke-direct {v3}, Landroidx/camera/core/impl/l0$a;-><init>()V

    iget-object v4, p0, Ly/r;->b:Landroidx/camera/core/impl/l0;

    invoke-virtual {v4}, Landroidx/camera/core/impl/l0;->h()I

    move-result v4

    invoke-virtual {v3, v4}, Landroidx/camera/core/impl/l0$a;->r(I)V

    iget-object v4, p0, Ly/r;->b:Landroidx/camera/core/impl/l0;

    invoke-virtual {v4}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/camera/core/impl/l0$a;->e(Landroidx/camera/core/impl/n0;)V

    invoke-virtual {p2}, Ly/v0;->n()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/camera/core/impl/l0$a;->a(Ljava/util/Collection;)V

    iget-object v4, p0, Ly/r;->f:Ly/o$b;

    invoke-virtual {v4}, Ly/o$b;->h()Landroidx/camera/core/impl/r0;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/camera/core/impl/l0$a;->f(Landroidx/camera/core/impl/r0;)V

    iget-object v4, p0, Ly/r;->f:Ly/o$b;

    invoke-virtual {v4}, Ly/o$b;->d()I

    move-result v4

    const/16 v5, 0x100

    if-ne v4, v5, :cond_1

    sget-object v4, Ly/r;->g:Le0/b;

    invoke-virtual {v4}, Le0/b;->a()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Landroidx/camera/core/impl/l0;->i:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {p2}, Ly/v0;->l()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroidx/camera/core/impl/l0$a;->d(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    :cond_0
    sget-object v4, Landroidx/camera/core/impl/l0;->j:Landroidx/camera/core/impl/n0$a;

    invoke-virtual {p0, p2}, Ly/r;->g(Ly/v0;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Landroidx/camera/core/impl/l0$a;->d(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    :cond_1
    invoke-interface {v2}, Landroidx/camera/core/impl/m0;->a()Landroidx/camera/core/impl/l0;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/camera/core/impl/l0;->e()Landroidx/camera/core/impl/n0;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroidx/camera/core/impl/l0$a;->e(Landroidx/camera/core/impl/n0;)V

    invoke-interface {v2}, Landroidx/camera/core/impl/m0;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v3, v1, v2}, Landroidx/camera/core/impl/l0$a;->g(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v2, p0, Ly/r;->f:Ly/o$b;

    invoke-virtual {v2}, Ly/o$b;->a()Landroidx/camera/core/impl/k;

    move-result-object v2

    invoke-virtual {v3, v2}, Landroidx/camera/core/impl/l0$a;->c(Landroidx/camera/core/impl/k;)V

    invoke-virtual {v3}, Landroidx/camera/core/impl/l0$a;->h()Landroidx/camera/core/impl/l0;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_2
    new-instance p1, Ly/j;

    invoke-direct {p1, v0, p3}, Ly/j;-><init>(Ljava/util/List;Ly/n0;)V

    return-object p1
.end method

.method private c()Landroidx/camera/core/impl/k0;
    .locals 2

    iget-object v0, p0, Ly/r;->a:Landroidx/camera/core/impl/d1;

    invoke-static {}, Lw/x;->b()Landroidx/camera/core/impl/k0;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/camera/core/impl/d1;->W(Landroidx/camera/core/impl/k0;)Landroidx/camera/core/impl/k0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Landroidx/camera/core/impl/k0;

    return-object v0
.end method

.method private d(Landroidx/camera/core/impl/k0;Ly/v0;Ly/n0;Lcom/google/common/util/concurrent/f;)Ly/f0;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/k0;",
            "Ly/v0;",
            "Ly/n0;",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;)",
            "Ly/f0;"
        }
    .end annotation

    new-instance v9, Ly/f0;

    invoke-virtual {p2}, Ly/v0;->k()Landroidx/camera/core/n$g;

    move-result-object v2

    invoke-virtual {p2}, Ly/v0;->g()Landroid/graphics/Rect;

    move-result-object v3

    invoke-virtual {p2}, Ly/v0;->l()I

    move-result v4

    invoke-virtual {p2}, Ly/v0;->i()I

    move-result v5

    invoke-virtual {p2}, Ly/v0;->m()Landroid/graphics/Matrix;

    move-result-object v6

    move-object v0, v9

    move-object v1, p1

    move-object v7, p3

    move-object v8, p4

    invoke-direct/range {v0 .. v8}, Ly/f0;-><init>(Landroidx/camera/core/impl/k0;Landroidx/camera/core/n$g;Landroid/graphics/Rect;IILandroid/graphics/Matrix;Ly/n0;Lcom/google/common/util/concurrent/f;)V

    return-object v9
.end method

.method private i()I
    .locals 3

    iget-object v0, p0, Ly/r;->a:Landroidx/camera/core/impl/d1;

    sget-object v1, Landroidx/camera/core/impl/d1;->K:Landroidx/camera/core/impl/n0$a;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroidx/camera/core/impl/u1;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0

    :cond_0
    const/16 v0, 0x100

    return v0
.end method


# virtual methods
.method public a()V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/r;->c:Ly/o;

    invoke-virtual {v0}, Ly/o;->j()V

    iget-object v0, p0, Ly/r;->d:Ly/m0;

    invoke-virtual {v0}, Ly/m0;->d()V

    iget-object v0, p0, Ly/r;->e:Ly/e0;

    invoke-virtual {v0}, Ly/e0;->o()V

    return-void
.end method

.method e(Ly/v0;Ly/n0;Lcom/google/common/util/concurrent/f;)Landroidx/core/util/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly/v0;",
            "Ly/n0;",
            "Lcom/google/common/util/concurrent/f<",
            "Ljava/lang/Void;",
            ">;)",
            "Landroidx/core/util/d<",
            "Ly/j;",
            "Ly/f0;",
            ">;"
        }
    .end annotation

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-direct {p0}, Ly/r;->c()Landroidx/camera/core/impl/k0;

    move-result-object v0

    new-instance v1, Landroidx/core/util/d;

    invoke-direct {p0, v0, p1, p2}, Ly/r;->b(Landroidx/camera/core/impl/k0;Ly/v0;Ly/n0;)Ly/j;

    move-result-object v2

    invoke-direct {p0, v0, p1, p2, p3}, Ly/r;->d(Landroidx/camera/core/impl/k0;Ly/v0;Ly/n0;Lcom/google/common/util/concurrent/f;)Ly/f0;

    move-result-object p1

    invoke-direct {v1, v2, p1}, Landroidx/core/util/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public f(Landroid/util/Size;)Landroidx/camera/core/impl/y1$b;
    .locals 1

    iget-object v0, p0, Ly/r;->a:Landroidx/camera/core/impl/d1;

    invoke-static {v0, p1}, Landroidx/camera/core/impl/y1$b;->p(Landroidx/camera/core/impl/k2;Landroid/util/Size;)Landroidx/camera/core/impl/y1$b;

    move-result-object p1

    iget-object v0, p0, Ly/r;->f:Ly/o$b;

    invoke-virtual {v0}, Ly/o$b;->h()Landroidx/camera/core/impl/r0;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/impl/y1$b;->h(Landroidx/camera/core/impl/r0;)Landroidx/camera/core/impl/y1$b;

    return-object p1
.end method

.method g(Ly/v0;)I
    .locals 3

    invoke-virtual {p1}, Ly/v0;->j()Landroidx/camera/core/n$f;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Ly/v0;->g()Landroid/graphics/Rect;

    move-result-object v1

    iget-object v2, p0, Ly/r;->f:Ly/o$b;

    invoke-virtual {v2}, Ly/o$b;->g()Landroid/util/Size;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/camera/core/impl/utils/r;->e(Landroid/graphics/Rect;Landroid/util/Size;)Z

    move-result v1

    if-eqz v0, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Ly/v0;->f()I

    move-result p1

    if-nez p1, :cond_1

    const/16 p1, 0x64

    return p1

    :cond_1
    const/16 p1, 0x5f

    return p1

    :cond_2
    invoke-virtual {p1}, Ly/v0;->i()I

    move-result p1

    return p1
.end method

.method public h()I
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/r;->c:Ly/o;

    invoke-virtual {v0}, Ly/o;->d()I

    move-result v0

    return v0
.end method

.method j(Lw/g0;)V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/r;->f:Ly/o$b;

    invoke-virtual {v0}, Ly/o$b;->b()Lg0/v;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg0/v;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public k(Landroidx/camera/core/e$a;)V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/r;->c:Ly/o;

    invoke-virtual {v0, p1}, Ly/o;->m(Landroidx/camera/core/e$a;)V

    return-void
.end method

.method l(Ly/f0;)V
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/r;->f:Ly/o$b;

    invoke-virtual {v0}, Ly/o$b;->f()Lg0/v;

    move-result-object v0

    invoke-virtual {v0, p1}, Lg0/v;->accept(Ljava/lang/Object;)V

    return-void
.end method
