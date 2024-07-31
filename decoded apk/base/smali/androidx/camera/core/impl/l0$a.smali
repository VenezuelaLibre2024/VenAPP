.class public final Landroidx/camera/core/impl/l0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/l0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroidx/camera/core/impl/r0;",
            ">;"
        }
    .end annotation
.end field

.field private b:Landroidx/camera/core/impl/l1;

.field private c:I

.field private d:Landroid/util/Range;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/camera/core/impl/k;",
            ">;"
        }
    .end annotation
.end field

.field private f:Z

.field private g:Landroidx/camera/core/impl/n1;

.field private h:Landroidx/camera/core/impl/s;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/impl/l0$a;->a:Ljava/util/Set;

    invoke-static {}, Landroidx/camera/core/impl/m1;->a0()Landroidx/camera/core/impl/m1;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/impl/l0$a;->b:Landroidx/camera/core/impl/l1;

    const/4 v0, -0x1

    iput v0, p0, Landroidx/camera/core/impl/l0$a;->c:I

    sget-object v0, Landroidx/camera/core/impl/b2;->a:Landroid/util/Range;

    iput-object v0, p0, Landroidx/camera/core/impl/l0$a;->d:Landroid/util/Range;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/impl/l0$a;->e:Ljava/util/List;

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/camera/core/impl/l0$a;->f:Z

    invoke-static {}, Landroidx/camera/core/impl/n1;->g()Landroidx/camera/core/impl/n1;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/impl/l0$a;->g:Landroidx/camera/core/impl/n1;

    return-void
.end method

.method private constructor <init>(Landroidx/camera/core/impl/l0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Landroidx/camera/core/impl/l0$a;->a:Ljava/util/Set;

    invoke-static {}, Landroidx/camera/core/impl/m1;->a0()Landroidx/camera/core/impl/m1;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/core/impl/l0$a;->b:Landroidx/camera/core/impl/l1;

    const/4 v1, -0x1

    iput v1, p0, Landroidx/camera/core/impl/l0$a;->c:I

    sget-object v1, Landroidx/camera/core/impl/b2;->a:Landroid/util/Range;

    iput-object v1, p0, Landroidx/camera/core/impl/l0$a;->d:Landroid/util/Range;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, p0, Landroidx/camera/core/impl/l0$a;->e:Ljava/util/List;

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/camera/core/impl/l0$a;->f:Z

    invoke-static {}, Landroidx/camera/core/impl/n1;->g()Landroidx/camera/core/impl/n1;

    move-result-object v1

    iput-object v1, p0, Landroidx/camera/core/impl/l0$a;->g:Landroidx/camera/core/impl/n1;

    iget-object v1, p1, Landroidx/camera/core/impl/l0;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p1, Landroidx/camera/core/impl/l0;->b:Landroidx/camera/core/impl/n0;

    invoke-static {v0}, Landroidx/camera/core/impl/m1;->b0(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/m1;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/core/impl/l0$a;->b:Landroidx/camera/core/impl/l1;

    iget v0, p1, Landroidx/camera/core/impl/l0;->c:I

    iput v0, p0, Landroidx/camera/core/impl/l0$a;->c:I

    iget-object v0, p1, Landroidx/camera/core/impl/l0;->d:Landroid/util/Range;

    iput-object v0, p0, Landroidx/camera/core/impl/l0$a;->d:Landroid/util/Range;

    iget-object v0, p0, Landroidx/camera/core/impl/l0$a;->e:Ljava/util/List;

    invoke-virtual {p1}, Landroidx/camera/core/impl/l0;->b()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p1}, Landroidx/camera/core/impl/l0;->i()Z

    move-result v0

    iput-boolean v0, p0, Landroidx/camera/core/impl/l0$a;->f:Z

    invoke-virtual {p1}, Landroidx/camera/core/impl/l0;->g()Landroidx/camera/core/impl/f2;

    move-result-object p1

    invoke-static {p1}, Landroidx/camera/core/impl/n1;->h(Landroidx/camera/core/impl/f2;)Landroidx/camera/core/impl/n1;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/impl/l0$a;->g:Landroidx/camera/core/impl/n1;

    return-void
.end method

.method public static j(Landroidx/camera/core/impl/k2;)Landroidx/camera/core/impl/l0$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/camera/core/impl/k2<",
            "*>;)",
            "Landroidx/camera/core/impl/l0$a;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Landroidx/camera/core/impl/k2;->q(Landroidx/camera/core/impl/l0$b;)Landroidx/camera/core/impl/l0$b;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Landroidx/camera/core/impl/l0$a;

    invoke-direct {v1}, Landroidx/camera/core/impl/l0$a;-><init>()V

    invoke-interface {v0, p0, v1}, Landroidx/camera/core/impl/l0$b;->a(Landroidx/camera/core/impl/k2;Landroidx/camera/core/impl/l0$a;)V

    return-object v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Implementation is missing option unpacker for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p0, v2}, Lb0/j;->u(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static k(Landroidx/camera/core/impl/l0;)Landroidx/camera/core/impl/l0$a;
    .locals 1

    new-instance v0, Landroidx/camera/core/impl/l0$a;

    invoke-direct {v0, p0}, Landroidx/camera/core/impl/l0$a;-><init>(Landroidx/camera/core/impl/l0;)V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Landroidx/camera/core/impl/k;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/impl/k;

    invoke-virtual {p0, v0}, Landroidx/camera/core/impl/l0$a;->c(Landroidx/camera/core/impl/k;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b(Landroidx/camera/core/impl/f2;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/l0$a;->g:Landroidx/camera/core/impl/n1;

    invoke-virtual {v0, p1}, Landroidx/camera/core/impl/n1;->f(Landroidx/camera/core/impl/f2;)V

    return-void
.end method

.method public c(Landroidx/camera/core/impl/k;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/l0$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Landroidx/camera/core/impl/l0$a;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/camera/core/impl/n0$a<",
            "TT;>;TT;)V"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/l0$a;->b:Landroidx/camera/core/impl/l1;

    invoke-interface {v0, p1, p2}, Landroidx/camera/core/impl/l1;->r(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)V

    return-void
.end method

.method public e(Landroidx/camera/core/impl/n0;)V
    .locals 5

    invoke-interface {p1}, Landroidx/camera/core/impl/n0;->e()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/camera/core/impl/n0$a;

    iget-object v2, p0, Landroidx/camera/core/impl/l0$a;->b:Landroidx/camera/core/impl/l1;

    const/4 v3, 0x0

    invoke-interface {v2, v1, v3}, Landroidx/camera/core/impl/n0;->g(Landroidx/camera/core/impl/n0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v1}, Landroidx/camera/core/impl/n0;->a(Landroidx/camera/core/impl/n0$a;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v2, Landroidx/camera/core/impl/k1;

    if-eqz v4, :cond_0

    check-cast v2, Landroidx/camera/core/impl/k1;

    check-cast v3, Landroidx/camera/core/impl/k1;

    invoke-virtual {v3}, Landroidx/camera/core/impl/k1;->c()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroidx/camera/core/impl/k1;->a(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    instance-of v2, v3, Landroidx/camera/core/impl/k1;

    if-eqz v2, :cond_1

    check-cast v3, Landroidx/camera/core/impl/k1;

    invoke-virtual {v3}, Landroidx/camera/core/impl/k1;->b()Landroidx/camera/core/impl/k1;

    move-result-object v3

    :cond_1
    iget-object v2, p0, Landroidx/camera/core/impl/l0$a;->b:Landroidx/camera/core/impl/l1;

    invoke-interface {p1, v1}, Landroidx/camera/core/impl/n0;->h(Landroidx/camera/core/impl/n0$a;)Landroidx/camera/core/impl/n0$c;

    move-result-object v4

    invoke-interface {v2, v1, v4, v3}, Landroidx/camera/core/impl/l1;->p(Landroidx/camera/core/impl/n0$a;Landroidx/camera/core/impl/n0$c;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public f(Landroidx/camera/core/impl/r0;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/l0$a;->a:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public g(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/l0$a;->g:Landroidx/camera/core/impl/n1;

    invoke-virtual {v0, p1, p2}, Landroidx/camera/core/impl/n1;->i(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public h()Landroidx/camera/core/impl/l0;
    .locals 10

    new-instance v9, Landroidx/camera/core/impl/l0;

    new-instance v1, Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/camera/core/impl/l0$a;->a:Ljava/util/Set;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Landroidx/camera/core/impl/l0$a;->b:Landroidx/camera/core/impl/l1;

    invoke-static {v0}, Landroidx/camera/core/impl/p1;->Y(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/p1;

    move-result-object v2

    iget v3, p0, Landroidx/camera/core/impl/l0$a;->c:I

    iget-object v4, p0, Landroidx/camera/core/impl/l0$a;->d:Landroid/util/Range;

    new-instance v5, Ljava/util/ArrayList;

    iget-object v0, p0, Landroidx/camera/core/impl/l0$a;->e:Ljava/util/List;

    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-boolean v6, p0, Landroidx/camera/core/impl/l0$a;->f:Z

    iget-object v0, p0, Landroidx/camera/core/impl/l0$a;->g:Landroidx/camera/core/impl/n1;

    invoke-static {v0}, Landroidx/camera/core/impl/f2;->c(Landroidx/camera/core/impl/f2;)Landroidx/camera/core/impl/f2;

    move-result-object v7

    iget-object v8, p0, Landroidx/camera/core/impl/l0$a;->h:Landroidx/camera/core/impl/s;

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Landroidx/camera/core/impl/l0;-><init>(Ljava/util/List;Landroidx/camera/core/impl/n0;ILandroid/util/Range;Ljava/util/List;ZLandroidx/camera/core/impl/f2;Landroidx/camera/core/impl/s;)V

    return-object v9
.end method

.method public i()V
    .locals 1

    iget-object v0, p0, Landroidx/camera/core/impl/l0$a;->a:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

.method public l()Landroid/util/Range;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/l0$a;->d:Landroid/util/Range;

    return-object v0
.end method

.method public m()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Landroidx/camera/core/impl/r0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/core/impl/l0$a;->a:Ljava/util/Set;

    return-object v0
.end method

.method public n()I
    .locals 1

    iget v0, p0, Landroidx/camera/core/impl/l0$a;->c:I

    return v0
.end method

.method public o(Landroidx/camera/core/impl/s;)V
    .locals 0

    iput-object p1, p0, Landroidx/camera/core/impl/l0$a;->h:Landroidx/camera/core/impl/s;

    return-void
.end method

.method public p(Landroid/util/Range;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Range<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Landroidx/camera/core/impl/l0$a;->d:Landroid/util/Range;

    return-void
.end method

.method public q(Landroidx/camera/core/impl/n0;)V
    .locals 0

    invoke-static {p1}, Landroidx/camera/core/impl/m1;->b0(Landroidx/camera/core/impl/n0;)Landroidx/camera/core/impl/m1;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/core/impl/l0$a;->b:Landroidx/camera/core/impl/l1;

    return-void
.end method

.method public r(I)V
    .locals 0

    iput p1, p0, Landroidx/camera/core/impl/l0$a;->c:I

    return-void
.end method

.method public s(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/camera/core/impl/l0$a;->f:Z

    return-void
.end method
