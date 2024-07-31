.class public abstract Lbj/c;
.super Lvi/p0$h;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lvi/p0$h;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lvi/x;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lbj/c;->i()Lvi/p0$h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/p0$h;->b()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public d()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lbj/c;->i()Lvi/p0$h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/p0$h;->d()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 1

    invoke-virtual {p0}, Lbj/c;->i()Lvi/p0$h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/p0$h;->e()V

    return-void
.end method

.method public f()V
    .locals 1

    invoke-virtual {p0}, Lbj/c;->i()Lvi/p0$h;

    move-result-object v0

    invoke-virtual {v0}, Lvi/p0$h;->f()V

    return-void
.end method

.method public g(Lvi/p0$j;)V
    .locals 1

    invoke-virtual {p0}, Lbj/c;->i()Lvi/p0$h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/p0$h;->g(Lvi/p0$j;)V

    return-void
.end method

.method protected abstract i()Lvi/p0$h;
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "delegate"

    invoke-virtual {p0}, Lbj/c;->i()Lvi/p0$h;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
