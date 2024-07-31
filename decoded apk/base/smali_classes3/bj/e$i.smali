.class Lbj/e$i;
.super Lbj/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbj/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbj/e$i$a;
    }
.end annotation


# instance fields
.field private final a:Lvi/p0$h;

.field private b:Lbj/e$b;

.field private c:Z

.field private d:Lvi/q;

.field private e:Lvi/p0$j;

.field final synthetic f:Lbj/e;


# direct methods
.method constructor <init>(Lbj/e;Lvi/p0$h;)V
    .locals 0

    iput-object p1, p0, Lbj/e$i;->f:Lbj/e;

    invoke-direct {p0}, Lbj/c;-><init>()V

    iput-object p2, p0, Lbj/e$i;->a:Lvi/p0$h;

    return-void
.end method

.method static synthetic j(Lbj/e$i;Lvi/q;)Lvi/q;
    .locals 0

    iput-object p1, p0, Lbj/e$i;->d:Lvi/q;

    return-object p1
.end method

.method static synthetic k(Lbj/e$i;)Z
    .locals 0

    iget-boolean p0, p0, Lbj/e$i;->c:Z

    return p0
.end method


# virtual methods
.method public c()Lvi/a;
    .locals 3

    iget-object v0, p0, Lbj/e$i;->b:Lbj/e$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbj/e$i;->a:Lvi/p0$h;

    invoke-virtual {v0}, Lvi/p0$h;->c()Lvi/a;

    move-result-object v0

    invoke-virtual {v0}, Lvi/a;->d()Lvi/a$b;

    move-result-object v0

    invoke-static {}, Lbj/e;->j()Lvi/a$c;

    move-result-object v1

    iget-object v2, p0, Lbj/e$i;->b:Lbj/e$b;

    invoke-virtual {v0, v1, v2}, Lvi/a$b;->d(Lvi/a$c;Ljava/lang/Object;)Lvi/a$b;

    move-result-object v0

    invoke-virtual {v0}, Lvi/a$b;->a()Lvi/a;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lbj/e$i;->a:Lvi/p0$h;

    invoke-virtual {v0}, Lvi/p0$h;->c()Lvi/a;

    move-result-object v0

    return-object v0
.end method

.method public g(Lvi/p0$j;)V
    .locals 1

    iput-object p1, p0, Lbj/e$i;->e:Lvi/p0$j;

    new-instance v0, Lbj/e$i$a;

    invoke-direct {v0, p0, p1}, Lbj/e$i$a;-><init>(Lbj/e$i;Lvi/p0$j;)V

    invoke-super {p0, v0}, Lbj/c;->g(Lvi/p0$j;)V

    return-void
.end method

.method public h(Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lvi/x;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lbj/c;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lbj/e;->i(Ljava/util/List;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lbj/e;->i(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbj/e$i;->f:Lbj/e;

    iget-object v0, v0, Lbj/e;->c:Lbj/e$c;

    iget-object v2, p0, Lbj/e$i;->b:Lbj/e$b;

    invoke-virtual {v0, v2}, Lcom/google/common/collect/r;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbj/e$i;->b:Lbj/e$b;

    invoke-virtual {v0, p0}, Lbj/e$b;->i(Lbj/e$i;)Z

    :cond_0
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvi/x;

    invoke-virtual {v0}, Lvi/x;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/SocketAddress;

    iget-object v1, p0, Lbj/e$i;->f:Lbj/e;

    iget-object v1, v1, Lbj/e;->c:Lbj/e$c;

    invoke-virtual {v1, v0}, Lcom/google/common/collect/r;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lbj/c;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lbj/e;->i(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p1}, Lbj/e;->i(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lbj/e$i;->f:Lbj/e;

    iget-object v0, v0, Lbj/e;->c:Lbj/e$c;

    invoke-virtual {p0}, Lvi/p0$h;->a()Lvi/x;

    move-result-object v2

    invoke-virtual {v2}, Lvi/x;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/google/common/collect/r;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lbj/e$i;->f:Lbj/e;

    iget-object v0, v0, Lbj/e;->c:Lbj/e$c;

    invoke-virtual {p0}, Lvi/p0$h;->a()Lvi/x;

    move-result-object v2

    invoke-virtual {v2}, Lvi/x;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/common/collect/r;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbj/e$b;

    invoke-virtual {v0, p0}, Lbj/e$b;->i(Lbj/e$i;)Z

    invoke-virtual {v0}, Lbj/e$b;->j()V

    goto :goto_1

    :cond_2
    invoke-virtual {p0}, Lbj/c;->b()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lbj/e;->i(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-static {p1}, Lbj/e;->i(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvi/x;

    invoke-virtual {v0}, Lvi/x;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/SocketAddress;

    iget-object v1, p0, Lbj/e$i;->f:Lbj/e;

    iget-object v1, v1, Lbj/e;->c:Lbj/e$c;

    invoke-virtual {v1, v0}, Lcom/google/common/collect/r;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :goto_0
    iget-object v1, p0, Lbj/e$i;->f:Lbj/e;

    iget-object v1, v1, Lbj/e;->c:Lbj/e$c;

    invoke-virtual {v1, v0}, Lcom/google/common/collect/r;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbj/e$b;

    invoke-virtual {v0, p0}, Lbj/e$b;->b(Lbj/e$i;)Z

    :cond_3
    :goto_1
    iget-object v0, p0, Lbj/e$i;->a:Lvi/p0$h;

    invoke-virtual {v0, p1}, Lvi/p0$h;->h(Ljava/util/List;)V

    return-void
.end method

.method protected i()Lvi/p0$h;
    .locals 1

    iget-object v0, p0, Lbj/e$i;->a:Lvi/p0$h;

    return-object v0
.end method

.method l()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lbj/e$i;->b:Lbj/e$b;

    return-void
.end method

.method m()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lbj/e$i;->c:Z

    iget-object v0, p0, Lbj/e$i;->e:Lvi/p0$j;

    sget-object v1, Lvi/g1;->u:Lvi/g1;

    invoke-static {v1}, Lvi/q;->b(Lvi/g1;)Lvi/q;

    move-result-object v1

    invoke-interface {v0, v1}, Lvi/p0$j;->a(Lvi/q;)V

    return-void
.end method

.method n()Z
    .locals 1

    iget-boolean v0, p0, Lbj/e$i;->c:Z

    return v0
.end method

.method o(Lbj/e$b;)V
    .locals 0

    iput-object p1, p0, Lbj/e$i;->b:Lbj/e$b;

    return-void
.end method

.method p()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbj/e$i;->c:Z

    iget-object v0, p0, Lbj/e$i;->d:Lvi/q;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lbj/e$i;->e:Lvi/p0$j;

    invoke-interface {v1, v0}, Lvi/p0$j;->a(Lvi/q;)V

    :cond_0
    return-void
.end method
