.class Lbj/d$b;
.super Lbj/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbj/d;->q(Lvi/p0$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field a:Lvi/p0;

.field final synthetic b:Lbj/d;


# direct methods
.method constructor <init>(Lbj/d;)V
    .locals 0

    iput-object p1, p0, Lbj/d$b;->b:Lbj/d;

    invoke-direct {p0}, Lbj/b;-><init>()V

    return-void
.end method


# virtual methods
.method public f(Lvi/p;Lvi/p0$i;)V
    .locals 2

    iget-object v0, p0, Lbj/d$b;->a:Lvi/p0;

    iget-object v1, p0, Lbj/d$b;->b:Lbj/d;

    invoke-static {v1}, Lbj/d;->h(Lbj/d;)Lvi/p0;

    move-result-object v1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lbj/d$b;->b:Lbj/d;

    invoke-static {v0}, Lbj/d;->i(Lbj/d;)Z

    move-result v0

    const-string v1, "there\'s pending lb while current lb has been out of READY"

    invoke-static {v0, v1}, Leb/o;->v(ZLjava/lang/Object;)V

    iget-object v0, p0, Lbj/d$b;->b:Lbj/d;

    invoke-static {v0, p1}, Lbj/d;->k(Lbj/d;Lvi/p;)Lvi/p;

    iget-object v0, p0, Lbj/d$b;->b:Lbj/d;

    invoke-static {v0, p2}, Lbj/d;->l(Lbj/d;Lvi/p0$i;)Lvi/p0$i;

    sget-object p2, Lvi/p;->READY:Lvi/p;

    if-ne p1, p2, :cond_3

    :goto_0
    iget-object p1, p0, Lbj/d$b;->b:Lbj/d;

    invoke-static {p1}, Lbj/d;->m(Lbj/d;)V

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lbj/d$b;->a:Lvi/p0;

    iget-object v1, p0, Lbj/d$b;->b:Lbj/d;

    invoke-static {v1}, Lbj/d;->n(Lbj/d;)Lvi/p0;

    move-result-object v1

    if-ne v0, v1, :cond_3

    iget-object v0, p0, Lbj/d$b;->b:Lbj/d;

    sget-object v1, Lvi/p;->READY:Lvi/p;

    if-ne p1, v1, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {v0, v1}, Lbj/d;->j(Lbj/d;Z)Z

    iget-object v0, p0, Lbj/d$b;->b:Lbj/d;

    invoke-static {v0}, Lbj/d;->i(Lbj/d;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lbj/d$b;->b:Lbj/d;

    invoke-static {v0}, Lbj/d;->h(Lbj/d;)Lvi/p0;

    move-result-object v0

    iget-object v1, p0, Lbj/d$b;->b:Lbj/d;

    invoke-static {v1}, Lbj/d;->o(Lbj/d;)Lvi/p0;

    move-result-object v1

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lbj/d$b;->b:Lbj/d;

    invoke-static {v0}, Lbj/d;->g(Lbj/d;)Lvi/p0$d;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lvi/p0$d;->f(Lvi/p;Lvi/p0$i;)V

    :cond_3
    :goto_2
    return-void
.end method

.method protected g()Lvi/p0$d;
    .locals 1

    iget-object v0, p0, Lbj/d$b;->b:Lbj/d;

    invoke-static {v0}, Lbj/d;->g(Lbj/d;)Lvi/p0$d;

    move-result-object v0

    return-object v0
.end method
