.class public Ly/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/impl/g1;


# instance fields
.field private final a:Landroidx/camera/core/impl/g1;

.field private b:Ly/f0;


# direct methods
.method constructor <init>(Landroidx/camera/core/impl/g1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/x;->a:Landroidx/camera/core/impl/g1;

    return-void
.end method

.method public static synthetic a(Ly/x;Landroidx/camera/core/impl/g1$a;Landroidx/camera/core/impl/g1;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ly/x;->j(Landroidx/camera/core/impl/g1$a;Landroidx/camera/core/impl/g1;)V

    return-void
.end method

.method private i(Landroidx/camera/core/o;)Landroidx/camera/core/o;
    .locals 7

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Ly/x;->b:Ly/f0;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    const-string v3, "Pending request should not be null"

    invoke-static {v1, v3}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    new-instance v1, Landroid/util/Pair;

    iget-object v3, p0, Ly/x;->b:Ly/f0;

    invoke-virtual {v3}, Ly/f0;->h()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Ly/x;->b:Ly/f0;

    invoke-virtual {v4}, Ly/f0;->g()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v1, v3, v2}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Landroidx/camera/core/impl/f2;->a(Landroid/util/Pair;)Landroidx/camera/core/impl/f2;

    move-result-object v1

    iput-object v0, p0, Ly/x;->b:Ly/f0;

    new-instance v0, Landroidx/camera/core/u;

    new-instance v2, Landroid/util/Size;

    invoke-interface {p1}, Landroidx/camera/core/o;->getWidth()I

    move-result v3

    invoke-interface {p1}, Landroidx/camera/core/o;->getHeight()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/util/Size;-><init>(II)V

    new-instance v3, Lb0/b;

    new-instance v4, Li0/h;

    invoke-interface {p1}, Landroidx/camera/core/o;->e1()Lw/h0;

    move-result-object v5

    invoke-interface {v5}, Lw/h0;->c()J

    move-result-wide v5

    invoke-direct {v4, v1, v5, v6}, Li0/h;-><init>(Landroidx/camera/core/impl/f2;J)V

    invoke-direct {v3, v4}, Lb0/b;-><init>(Landroidx/camera/core/impl/s;)V

    invoke-direct {v0, p1, v2, v3}, Landroidx/camera/core/u;-><init>(Landroidx/camera/core/o;Landroid/util/Size;Lw/h0;)V

    return-object v0
.end method

.method private synthetic j(Landroidx/camera/core/impl/g1$a;Landroidx/camera/core/impl/g1;)V
    .locals 0

    invoke-interface {p1, p0}, Landroidx/camera/core/impl/g1$a;->a(Landroidx/camera/core/impl/g1;)V

    return-void
.end method


# virtual methods
.method public b()Landroidx/camera/core/o;
    .locals 1

    iget-object v0, p0, Ly/x;->a:Landroidx/camera/core/impl/g1;

    invoke-interface {v0}, Landroidx/camera/core/impl/g1;->b()Landroidx/camera/core/o;

    move-result-object v0

    invoke-direct {p0, v0}, Ly/x;->i(Landroidx/camera/core/o;)Landroidx/camera/core/o;

    move-result-object v0

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Ly/x;->a:Landroidx/camera/core/impl/g1;

    invoke-interface {v0}, Landroidx/camera/core/impl/g1;->c()I

    move-result v0

    return v0
.end method

.method public close()V
    .locals 1

    iget-object v0, p0, Ly/x;->a:Landroidx/camera/core/impl/g1;

    invoke-interface {v0}, Landroidx/camera/core/impl/g1;->close()V

    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Ly/x;->a:Landroidx/camera/core/impl/g1;

    invoke-interface {v0}, Landroidx/camera/core/impl/g1;->d()V

    return-void
.end method

.method public e()I
    .locals 1

    iget-object v0, p0, Ly/x;->a:Landroidx/camera/core/impl/g1;

    invoke-interface {v0}, Landroidx/camera/core/impl/g1;->e()I

    move-result v0

    return v0
.end method

.method public f(Landroidx/camera/core/impl/g1$a;Ljava/util/concurrent/Executor;)V
    .locals 2

    iget-object v0, p0, Ly/x;->a:Landroidx/camera/core/impl/g1;

    new-instance v1, Ly/w;

    invoke-direct {v1, p0, p1}, Ly/w;-><init>(Ly/x;Landroidx/camera/core/impl/g1$a;)V

    invoke-interface {v0, v1, p2}, Landroidx/camera/core/impl/g1;->f(Landroidx/camera/core/impl/g1$a;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public g()Landroidx/camera/core/o;
    .locals 1

    iget-object v0, p0, Ly/x;->a:Landroidx/camera/core/impl/g1;

    invoke-interface {v0}, Landroidx/camera/core/impl/g1;->g()Landroidx/camera/core/o;

    move-result-object v0

    invoke-direct {p0, v0}, Ly/x;->i(Landroidx/camera/core/o;)Landroidx/camera/core/o;

    move-result-object v0

    return-object v0
.end method

.method public getHeight()I
    .locals 1

    iget-object v0, p0, Ly/x;->a:Landroidx/camera/core/impl/g1;

    invoke-interface {v0}, Landroidx/camera/core/impl/g1;->getHeight()I

    move-result v0

    return v0
.end method

.method public getSurface()Landroid/view/Surface;
    .locals 1

    iget-object v0, p0, Ly/x;->a:Landroidx/camera/core/impl/g1;

    invoke-interface {v0}, Landroidx/camera/core/impl/g1;->getSurface()Landroid/view/Surface;

    move-result-object v0

    return-object v0
.end method

.method public getWidth()I
    .locals 1

    iget-object v0, p0, Ly/x;->a:Landroidx/camera/core/impl/g1;

    invoke-interface {v0}, Landroidx/camera/core/impl/g1;->getWidth()I

    move-result v0

    return v0
.end method

.method h(Ly/f0;)V
    .locals 2

    iget-object v0, p0, Ly/x;->b:Ly/f0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Pending request should be null"

    invoke-static {v0, v1}, Landroidx/core/util/h;->n(ZLjava/lang/String;)V

    iput-object p1, p0, Ly/x;->b:Ly/f0;

    return-void
.end method
