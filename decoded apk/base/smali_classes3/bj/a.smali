.class public abstract Lbj/a;
.super Lvi/p0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lvi/p0;-><init>()V

    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    invoke-virtual {p0}, Lbj/a;->f()Lvi/p0;

    move-result-object v0

    invoke-virtual {v0}, Lvi/p0;->b()Z

    move-result v0

    return v0
.end method

.method public c(Lvi/g1;)V
    .locals 1

    invoke-virtual {p0}, Lbj/a;->f()Lvi/p0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/p0;->c(Lvi/g1;)V

    return-void
.end method

.method public d(Lvi/p0$g;)V
    .locals 1

    invoke-virtual {p0}, Lbj/a;->f()Lvi/p0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/p0;->d(Lvi/p0$g;)V

    return-void
.end method

.method protected abstract f()Lvi/p0;
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "delegate"

    invoke-virtual {p0}, Lbj/a;->f()Lvi/p0;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
