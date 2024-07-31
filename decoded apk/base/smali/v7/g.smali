.class public abstract Lv7/g;
.super Lv7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/g$a;,
        Lv7/g$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lv7/a;"
    }
.end annotation


# instance fields
.field private final s:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "TT;",
            "Lv7/g$b<",
            "TT;>;>;"
        }
    .end annotation
.end field

.field private t:Landroid/os/Handler;

.field private u:Ls8/m0;


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lv7/a;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lv7/g;->s:Ljava/util/HashMap;

    return-void
.end method

.method public static synthetic F(Lv7/g;Ljava/lang/Object;Lv7/a0;Lt6/d4;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lv7/g;->J(Ljava/lang/Object;Lv7/a0;Lt6/d4;)V

    return-void
.end method

.method private synthetic J(Ljava/lang/Object;Lv7/a0;Lt6/d4;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lv7/g;->K(Ljava/lang/Object;Lv7/a0;Lt6/d4;)V

    return-void
.end method


# virtual methods
.method protected C(Ls8/m0;)V
    .locals 0

    iput-object p1, p0, Lv7/g;->u:Ls8/m0;

    invoke-static {}, Lt8/r0;->w()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lv7/g;->t:Landroid/os/Handler;

    return-void
.end method

.method protected E()V
    .locals 4

    iget-object v0, p0, Lv7/g;->s:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/g$b;

    iget-object v2, v1, Lv7/g$b;->a:Lv7/a0;

    iget-object v3, v1, Lv7/g$b;->b:Lv7/a0$c;

    invoke-interface {v2, v3}, Lv7/a0;->b(Lv7/a0$c;)V

    iget-object v2, v1, Lv7/g$b;->a:Lv7/a0;

    iget-object v3, v1, Lv7/g$b;->c:Lv7/g$a;

    invoke-interface {v2, v3}, Lv7/a0;->g(Lv7/h0;)V

    iget-object v2, v1, Lv7/g$b;->a:Lv7/a0;

    iget-object v1, v1, Lv7/g$b;->c:Lv7/g$a;

    invoke-interface {v2, v1}, Lv7/a0;->q(Lx6/u;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lv7/g;->s:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method protected abstract G(Ljava/lang/Object;Lv7/a0$b;)Lv7/a0$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lv7/a0$b;",
            ")",
            "Lv7/a0$b;"
        }
    .end annotation
.end method

.method protected H(Ljava/lang/Object;J)J
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;J)J"
        }
    .end annotation

    return-wide p2
.end method

.method protected I(Ljava/lang/Object;I)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)I"
        }
    .end annotation

    return p2
.end method

.method protected abstract K(Ljava/lang/Object;Lv7/a0;Lt6/d4;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lv7/a0;",
            "Lt6/d4;",
            ")V"
        }
    .end annotation
.end method

.method protected final L(Ljava/lang/Object;Lv7/a0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lv7/a0;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lv7/g;->s:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lt8/a;->a(Z)V

    new-instance v0, Lv7/f;

    invoke-direct {v0, p0, p1}, Lv7/f;-><init>(Lv7/g;Ljava/lang/Object;)V

    new-instance v1, Lv7/g$a;

    invoke-direct {v1, p0, p1}, Lv7/g$a;-><init>(Lv7/g;Ljava/lang/Object;)V

    iget-object v2, p0, Lv7/g;->s:Ljava/util/HashMap;

    new-instance v3, Lv7/g$b;

    invoke-direct {v3, p2, v0, v1}, Lv7/g$b;-><init>(Lv7/a0;Lv7/a0$c;Lv7/g$a;)V

    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lv7/g;->t:Landroid/os/Handler;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    invoke-interface {p2, p1, v1}, Lv7/a0;->j(Landroid/os/Handler;Lv7/h0;)V

    iget-object p1, p0, Lv7/g;->t:Landroid/os/Handler;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Handler;

    invoke-interface {p2, p1, v1}, Lv7/a0;->s(Landroid/os/Handler;Lx6/u;)V

    iget-object p1, p0, Lv7/g;->u:Ls8/m0;

    invoke-virtual {p0}, Lv7/a;->A()Lu6/m3;

    move-result-object v1

    invoke-interface {p2, v0, p1, v1}, Lv7/a0;->a(Lv7/a0$c;Ls8/m0;Lu6/m3;)V

    invoke-virtual {p0}, Lv7/a;->B()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {p2, v0}, Lv7/a0;->c(Lv7/a0$c;)V

    :cond_0
    return-void
.end method

.method public n()V
    .locals 2

    iget-object v0, p0, Lv7/g;->s:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/g$b;

    iget-object v1, v1, Lv7/g$b;->a:Lv7/a0;

    invoke-interface {v1}, Lv7/a0;->n()V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected y()V
    .locals 3

    iget-object v0, p0, Lv7/g;->s:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/g$b;

    iget-object v2, v1, Lv7/g$b;->a:Lv7/a0;

    iget-object v1, v1, Lv7/g$b;->b:Lv7/a0$c;

    invoke-interface {v2, v1}, Lv7/a0;->c(Lv7/a0$c;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method protected z()V
    .locals 3

    iget-object v0, p0, Lv7/g;->s:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv7/g$b;

    iget-object v2, v1, Lv7/g$b;->a:Lv7/a0;

    iget-object v1, v1, Lv7/g$b;->b:Lv7/a0$c;

    invoke-interface {v2, v1}, Lv7/a0;->f(Lv7/a0$c;)V

    goto :goto_0

    :cond_0
    return-void
.end method
