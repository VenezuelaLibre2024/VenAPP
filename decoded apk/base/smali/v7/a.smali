.class public abstract Lv7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/a0;


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lv7/a0$c;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lv7/a0$c;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lv7/h0$a;

.field private final d:Lx6/u$a;

.field private e:Landroid/os/Looper;

.field private f:Lt6/d4;

.field private r:Lu6/m3;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lv7/a;->a:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lv7/a;->b:Ljava/util/HashSet;

    new-instance v0, Lv7/h0$a;

    invoke-direct {v0}, Lv7/h0$a;-><init>()V

    iput-object v0, p0, Lv7/a;->c:Lv7/h0$a;

    new-instance v0, Lx6/u$a;

    invoke-direct {v0}, Lx6/u$a;-><init>()V

    iput-object v0, p0, Lv7/a;->d:Lx6/u$a;

    return-void
.end method


# virtual methods
.method protected final A()Lu6/m3;
    .locals 1

    iget-object v0, p0, Lv7/a;->r:Lu6/m3;

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu6/m3;

    return-object v0
.end method

.method protected final B()Z
    .locals 1

    iget-object v0, p0, Lv7/a;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method protected abstract C(Ls8/m0;)V
.end method

.method protected final D(Lt6/d4;)V
    .locals 2

    iput-object p1, p0, Lv7/a;->f:Lt6/d4;

    iget-object v0, p0, Lv7/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/a0$c;

    invoke-interface {v1, p0, p1}, Lv7/a0$c;->a(Lv7/a0;Lt6/d4;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected abstract E()V
.end method

.method public final a(Lv7/a0$c;Ls8/m0;Lu6/m3;)V
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    iget-object v1, p0, Lv7/a;->e:Landroid/os/Looper;

    if-eqz v1, :cond_1

    if-ne v1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    invoke-static {v1}, Lt8/a;->a(Z)V

    iput-object p3, p0, Lv7/a;->r:Lu6/m3;

    iget-object p3, p0, Lv7/a;->f:Lt6/d4;

    iget-object v1, p0, Lv7/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, Lv7/a;->e:Landroid/os/Looper;

    if-nez v1, :cond_2

    iput-object v0, p0, Lv7/a;->e:Landroid/os/Looper;

    iget-object p3, p0, Lv7/a;->b:Ljava/util/HashSet;

    invoke-virtual {p3, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p2}, Lv7/a;->C(Ls8/m0;)V

    goto :goto_2

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p0, p1}, Lv7/a;->f(Lv7/a0$c;)V

    invoke-interface {p1, p0, p3}, Lv7/a0$c;->a(Lv7/a0;Lt6/d4;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public final b(Lv7/a0$c;)V
    .locals 1

    iget-object v0, p0, Lv7/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lv7/a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lv7/a;->e:Landroid/os/Looper;

    iput-object p1, p0, Lv7/a;->f:Lt6/d4;

    iput-object p1, p0, Lv7/a;->r:Lu6/m3;

    iget-object p1, p0, Lv7/a;->b:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->clear()V

    invoke-virtual {p0}, Lv7/a;->E()V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lv7/a;->c(Lv7/a0$c;)V

    :goto_0
    return-void
.end method

.method public final c(Lv7/a0$c;)V
    .locals 2

    iget-object v0, p0, Lv7/a;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    iget-object v1, p0, Lv7/a;->b:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    iget-object p1, p0, Lv7/a;->b:Ljava/util/HashSet;

    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lv7/a;->y()V

    :cond_0
    return-void
.end method

.method public final f(Lv7/a0$c;)V
    .locals 2

    iget-object v0, p0, Lv7/a;->e:Landroid/os/Looper;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lv7/a;->b:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    move-result v0

    iget-object v1, p0, Lv7/a;->b:Ljava/util/HashSet;

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lv7/a;->z()V

    :cond_0
    return-void
.end method

.method public final g(Lv7/h0;)V
    .locals 1

    iget-object v0, p0, Lv7/a;->c:Lv7/h0$a;

    invoke-virtual {v0, p1}, Lv7/h0$a;->C(Lv7/h0;)V

    return-void
.end method

.method public final j(Landroid/os/Handler;Lv7/h0;)V
    .locals 1

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lv7/a;->c:Lv7/h0$a;

    invoke-virtual {v0, p1, p2}, Lv7/h0$a;->g(Landroid/os/Handler;Lv7/h0;)V

    return-void
.end method

.method public final q(Lx6/u;)V
    .locals 1

    iget-object v0, p0, Lv7/a;->d:Lx6/u$a;

    invoke-virtual {v0, p1}, Lx6/u$a;->t(Lx6/u;)V

    return-void
.end method

.method public final s(Landroid/os/Handler;Lx6/u;)V
    .locals 1

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lv7/a;->d:Lx6/u$a;

    invoke-virtual {v0, p1, p2}, Lx6/u$a;->g(Landroid/os/Handler;Lx6/u;)V

    return-void
.end method

.method protected final t(ILv7/a0$b;)Lx6/u$a;
    .locals 1

    iget-object v0, p0, Lv7/a;->d:Lx6/u$a;

    invoke-virtual {v0, p1, p2}, Lx6/u$a;->u(ILv7/a0$b;)Lx6/u$a;

    move-result-object p1

    return-object p1
.end method

.method protected final u(Lv7/a0$b;)Lx6/u$a;
    .locals 2

    iget-object v0, p0, Lv7/a;->d:Lx6/u$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lx6/u$a;->u(ILv7/a0$b;)Lx6/u$a;

    move-result-object p1

    return-object p1
.end method

.method protected final v(ILv7/a0$b;J)Lv7/h0$a;
    .locals 1

    iget-object v0, p0, Lv7/a;->c:Lv7/h0$a;

    invoke-virtual {v0, p1, p2, p3, p4}, Lv7/h0$a;->F(ILv7/a0$b;J)Lv7/h0$a;

    move-result-object p1

    return-object p1
.end method

.method protected final w(Lv7/a0$b;)Lv7/h0$a;
    .locals 4

    iget-object v0, p0, Lv7/a;->c:Lv7/h0$a;

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    invoke-virtual {v0, v1, p1, v2, v3}, Lv7/h0$a;->F(ILv7/a0$b;J)Lv7/h0$a;

    move-result-object p1

    return-object p1
.end method

.method protected final x(Lv7/a0$b;J)Lv7/h0$a;
    .locals 2

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lv7/a;->c:Lv7/h0$a;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1, p2, p3}, Lv7/h0$a;->F(ILv7/a0$b;J)Lv7/h0$a;

    move-result-object p1

    return-object p1
.end method

.method protected y()V
    .locals 0

    return-void
.end method

.method protected z()V
    .locals 0

    return-void
.end method
