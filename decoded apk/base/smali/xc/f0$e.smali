.class public abstract Lxc/f0$e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxc/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lxc/f0$e$d;,
        Lxc/f0$e$c;,
        Lxc/f0$e$e;,
        Lxc/f0$e$a;,
        Lxc/f0$e$f;,
        Lxc/f0$e$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lxc/f0$e$b;
    .locals 2

    new-instance v0, Lxc/h$b;

    invoke-direct {v0}, Lxc/h$b;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lxc/h$b;->d(Z)Lxc/f0$e$b;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract b()Lxc/f0$e$a;
.end method

.method public abstract c()Ljava/lang/String;
.end method

.method public abstract d()Lxc/f0$e$c;
.end method

.method public abstract e()Ljava/lang/Long;
.end method

.method public abstract f()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxc/f0$e$d;",
            ">;"
        }
    .end annotation
.end method

.method public abstract g()Ljava/lang/String;
.end method

.method public abstract h()I
.end method

.method public abstract i()Ljava/lang/String;
.end method

.method public j()[B
    .locals 2

    invoke-virtual {p0}, Lxc/f0$e;->i()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lxc/f0;->a()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    return-object v0
.end method

.method public abstract k()Lxc/f0$e$e;
.end method

.method public abstract l()J
.end method

.method public abstract m()Lxc/f0$e$f;
.end method

.method public abstract n()Z
.end method

.method public abstract o()Lxc/f0$e$b;
.end method

.method p(Ljava/lang/String;)Lxc/f0$e;
    .locals 1

    invoke-virtual {p0}, Lxc/f0$e;->o()Lxc/f0$e$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lxc/f0$e$b;->c(Ljava/lang/String;)Lxc/f0$e$b;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$e$b;->a()Lxc/f0$e;

    move-result-object p1

    return-object p1
.end method

.method q(Ljava/util/List;)Lxc/f0$e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lxc/f0$e$d;",
            ">;)",
            "Lxc/f0$e;"
        }
    .end annotation

    invoke-virtual {p0}, Lxc/f0$e;->o()Lxc/f0$e$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lxc/f0$e$b;->g(Ljava/util/List;)Lxc/f0$e$b;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$e$b;->a()Lxc/f0$e;

    move-result-object p1

    return-object p1
.end method

.method r(JZLjava/lang/String;)Lxc/f0$e;
    .locals 1

    invoke-virtual {p0}, Lxc/f0$e;->o()Lxc/f0$e$b;

    move-result-object v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Lxc/f0$e$b;->f(Ljava/lang/Long;)Lxc/f0$e$b;

    invoke-virtual {v0, p3}, Lxc/f0$e$b;->d(Z)Lxc/f0$e$b;

    if-eqz p4, :cond_0

    invoke-static {}, Lxc/f0$e$f;->a()Lxc/f0$e$f$a;

    move-result-object p1

    invoke-virtual {p1, p4}, Lxc/f0$e$f$a;->b(Ljava/lang/String;)Lxc/f0$e$f$a;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$e$f$a;->a()Lxc/f0$e$f;

    move-result-object p1

    invoke-virtual {v0, p1}, Lxc/f0$e$b;->n(Lxc/f0$e$f;)Lxc/f0$e$b;

    :cond_0
    invoke-virtual {v0}, Lxc/f0$e$b;->a()Lxc/f0$e;

    move-result-object p1

    return-object p1
.end method
