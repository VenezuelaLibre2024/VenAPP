.class Ly/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:Ly/f0;

.field private b:Ly/e0$a;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ly/m0;Ly/f0;)V
    .locals 0

    invoke-direct {p0, p1}, Ly/m0;->e(Ly/f0;)V

    return-void
.end method

.method public static synthetic b(Ly/m0;Landroidx/camera/core/o;)V
    .locals 0

    invoke-direct {p0, p1}, Ly/m0;->c(Landroidx/camera/core/o;)V

    return-void
.end method

.method private c(Landroidx/camera/core/o;)V
    .locals 4

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    iget-object v0, p0, Ly/m0;->a:Ly/f0;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Landroidx/core/util/h;->m(Z)V

    invoke-interface {p1}, Landroidx/camera/core/o;->e1()Lw/h0;

    move-result-object v0

    invoke-interface {v0}, Lw/h0;->b()Landroidx/camera/core/impl/f2;

    move-result-object v0

    iget-object v3, p0, Ly/m0;->a:Ly/f0;

    invoke-virtual {v3}, Ly/f0;->h()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/camera/core/impl/f2;->d(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v3, p0, Ly/m0;->a:Ly/f0;

    invoke-virtual {v3}, Ly/f0;->g()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-ne v0, v3, :cond_1

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-static {v1}, Landroidx/core/util/h;->m(Z)V

    iget-object v0, p0, Ly/m0;->b:Ly/e0$a;

    invoke-virtual {v0}, Ly/e0$a;->a()Lg0/v;

    move-result-object v0

    iget-object v1, p0, Ly/m0;->a:Ly/f0;

    invoke-static {v1, p1}, Ly/e0$b;->c(Ly/f0;Landroidx/camera/core/o;)Ly/e0$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lg0/v;->accept(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput-object p1, p0, Ly/m0;->a:Ly/f0;

    return-void
.end method

.method private e(Ly/f0;)V
    .locals 4

    invoke-static {}, Landroidx/camera/core/impl/utils/q;->a()V

    invoke-virtual {p1}, Ly/f0;->g()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    const-string v3, "Cannot handle multi-image capture."

    invoke-static {v0, v3}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iget-object v0, p0, Ly/m0;->a:Ly/f0;

    if-nez v0, :cond_1

    move v1, v2

    :cond_1
    const-string v0, "Already has an existing request."

    invoke-static {v1, v0}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iput-object p1, p0, Ly/m0;->a:Ly/f0;

    invoke-virtual {p1}, Ly/f0;->a()Lcom/google/common/util/concurrent/f;

    move-result-object v0

    new-instance v1, Ly/m0$a;

    invoke-direct {v1, p0, p1}, Ly/m0$a;-><init>(Ly/m0;Ly/f0;)V

    invoke-static {}, Lz/a;->a()Ljava/util/concurrent/Executor;

    move-result-object p1

    invoke-static {v0, v1, p1}, La0/f;->b(Lcom/google/common/util/concurrent/f;La0/c;Ljava/util/concurrent/Executor;)V

    return-void
.end method


# virtual methods
.method public d()V
    .locals 0

    return-void
.end method

.method public f(Ly/o$c;)Ly/e0$a;
    .locals 2

    invoke-virtual {p1}, Ly/o$c;->a()Lg0/v;

    move-result-object v0

    new-instance v1, Ly/k0;

    invoke-direct {v1, p0}, Ly/k0;-><init>(Ly/m0;)V

    invoke-virtual {v0, v1}, Lg0/v;->a(Landroidx/core/util/a;)V

    invoke-virtual {p1}, Ly/o$c;->d()Lg0/v;

    move-result-object v0

    new-instance v1, Ly/l0;

    invoke-direct {v1, p0}, Ly/l0;-><init>(Ly/m0;)V

    invoke-virtual {v0, v1}, Lg0/v;->a(Landroidx/core/util/a;)V

    invoke-virtual {p1}, Ly/o$c;->b()I

    move-result v0

    invoke-virtual {p1}, Ly/o$c;->c()I

    move-result p1

    invoke-static {v0, p1}, Ly/e0$a;->d(II)Ly/e0$a;

    move-result-object p1

    iput-object p1, p0, Ly/m0;->b:Ly/e0$a;

    return-object p1
.end method
