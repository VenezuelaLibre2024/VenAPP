.class Lbj/e$d;
.super Lbj/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbj/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field private a:Lvi/p0$d;

.field final synthetic b:Lbj/e;


# direct methods
.method constructor <init>(Lbj/e;Lvi/p0$d;)V
    .locals 0

    iput-object p1, p0, Lbj/e$d;->b:Lbj/e;

    invoke-direct {p0}, Lbj/b;-><init>()V

    iput-object p2, p0, Lbj/e$d;->a:Lvi/p0$d;

    return-void
.end method


# virtual methods
.method public a(Lvi/p0$b;)Lvi/p0$h;
    .locals 4

    new-instance v0, Lbj/e$i;

    iget-object v1, p0, Lbj/e$d;->b:Lbj/e;

    iget-object v2, p0, Lbj/e$d;->a:Lvi/p0$d;

    invoke-virtual {v2, p1}, Lvi/p0$d;->a(Lvi/p0$b;)Lvi/p0$h;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lbj/e$i;-><init>(Lbj/e;Lvi/p0$h;)V

    invoke-virtual {p1}, Lvi/p0$b;->a()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lbj/e;->i(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lbj/e$d;->b:Lbj/e;

    iget-object v1, v1, Lbj/e;->c:Lbj/e$c;

    const/4 v2, 0x0

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvi/x;

    invoke-virtual {v3}, Lvi/x;->a()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v3}, Lcom/google/common/collect/r;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lbj/e$d;->b:Lbj/e;

    iget-object v1, v1, Lbj/e;->c:Lbj/e$c;

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/x;

    invoke-virtual {p1}, Lvi/x;->a()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/common/collect/r;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbj/e$b;

    invoke-virtual {p1, v0}, Lbj/e$b;->b(Lbj/e$i;)Z

    invoke-static {p1}, Lbj/e$b;->a(Lbj/e$b;)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lbj/e$i;->m()V

    :cond_0
    return-object v0
.end method

.method public f(Lvi/p;Lvi/p0$i;)V
    .locals 3

    iget-object v0, p0, Lbj/e$d;->a:Lvi/p0$d;

    new-instance v1, Lbj/e$h;

    iget-object v2, p0, Lbj/e$d;->b:Lbj/e;

    invoke-direct {v1, v2, p2}, Lbj/e$h;-><init>(Lbj/e;Lvi/p0$i;)V

    invoke-virtual {v0, p1, v1}, Lvi/p0$d;->f(Lvi/p;Lvi/p0$i;)V

    return-void
.end method

.method protected g()Lvi/p0$d;
    .locals 1

    iget-object v0, p0, Lbj/e$d;->a:Lvi/p0$d;

    return-object v0
.end method
