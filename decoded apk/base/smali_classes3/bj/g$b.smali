.class final Lbj/g$b;
.super Lbj/g$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbj/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final a:Lvi/g1;


# direct methods
.method constructor <init>(Lvi/g1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lbj/g$e;-><init>(Lbj/g$a;)V

    const-string v0, "status"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/g1;

    iput-object p1, p0, Lbj/g$b;->a:Lvi/g1;

    return-void
.end method


# virtual methods
.method public a(Lvi/p0$f;)Lvi/p0$e;
    .locals 0

    iget-object p1, p0, Lbj/g$b;->a:Lvi/g1;

    invoke-virtual {p1}, Lvi/g1;->p()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lvi/p0$e;->g()Lvi/p0$e;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lbj/g$b;->a:Lvi/g1;

    invoke-static {p1}, Lvi/p0$e;->f(Lvi/g1;)Lvi/p0$e;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method b(Lbj/g$e;)Z
    .locals 2

    instance-of v0, p1, Lbj/g$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbj/g$b;->a:Lvi/g1;

    check-cast p1, Lbj/g$b;

    iget-object v1, p1, Lbj/g$b;->a:Lvi/g1;

    invoke-static {v0, v1}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lbj/g$b;->a:Lvi/g1;

    invoke-virtual {v0}, Lvi/g1;->p()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Lbj/g$b;->a:Lvi/g1;

    invoke-virtual {p1}, Lvi/g1;->p()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-class v0, Lbj/g$b;

    invoke-static {v0}, Leb/i;->b(Ljava/lang/Class;)Leb/i$b;

    move-result-object v0

    const-string v1, "status"

    iget-object v2, p0, Lbj/g$b;->a:Lvi/g1;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
