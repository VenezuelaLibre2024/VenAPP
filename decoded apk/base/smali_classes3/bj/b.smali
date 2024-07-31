.class public abstract Lbj/b;
.super Lvi/p0$d;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lvi/p0$d;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lvi/p0$b;)Lvi/p0$h;
    .locals 1

    invoke-virtual {p0}, Lbj/b;->g()Lvi/p0$d;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/p0$d;->a(Lvi/p0$b;)Lvi/p0$h;

    move-result-object p1

    return-object p1
.end method

.method public b()Lvi/f;
    .locals 1

    invoke-virtual {p0}, Lbj/b;->g()Lvi/p0$d;

    move-result-object v0

    invoke-virtual {v0}, Lvi/p0$d;->b()Lvi/f;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    invoke-virtual {p0}, Lbj/b;->g()Lvi/p0$d;

    move-result-object v0

    invoke-virtual {v0}, Lvi/p0$d;->c()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method

.method public d()Lvi/k1;
    .locals 1

    invoke-virtual {p0}, Lbj/b;->g()Lvi/p0$d;

    move-result-object v0

    invoke-virtual {v0}, Lvi/p0$d;->d()Lvi/k1;

    move-result-object v0

    return-object v0
.end method

.method public e()V
    .locals 1

    invoke-virtual {p0}, Lbj/b;->g()Lvi/p0$d;

    move-result-object v0

    invoke-virtual {v0}, Lvi/p0$d;->e()V

    return-void
.end method

.method protected abstract g()Lvi/p0$d;
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "delegate"

    invoke-virtual {p0}, Lbj/b;->g()Lvi/p0$d;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
