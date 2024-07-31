.class public abstract Lxc/f0$e$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxc/f0$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract a()Lxc/f0$e;
.end method

.method public abstract b(Lxc/f0$e$a;)Lxc/f0$e$b;
.end method

.method public abstract c(Ljava/lang/String;)Lxc/f0$e$b;
.end method

.method public abstract d(Z)Lxc/f0$e$b;
.end method

.method public abstract e(Lxc/f0$e$c;)Lxc/f0$e$b;
.end method

.method public abstract f(Ljava/lang/Long;)Lxc/f0$e$b;
.end method

.method public abstract g(Ljava/util/List;)Lxc/f0$e$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lxc/f0$e$d;",
            ">;)",
            "Lxc/f0$e$b;"
        }
    .end annotation
.end method

.method public abstract h(Ljava/lang/String;)Lxc/f0$e$b;
.end method

.method public abstract i(I)Lxc/f0$e$b;
.end method

.method public abstract j(Ljava/lang/String;)Lxc/f0$e$b;
.end method

.method public k([B)Lxc/f0$e$b;
    .locals 2

    new-instance v0, Ljava/lang/String;

    invoke-static {}, Lxc/f0;->a()Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v0, p1, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {p0, v0}, Lxc/f0$e$b;->j(Ljava/lang/String;)Lxc/f0$e$b;

    move-result-object p1

    return-object p1
.end method

.method public abstract l(Lxc/f0$e$e;)Lxc/f0$e$b;
.end method

.method public abstract m(J)Lxc/f0$e$b;
.end method

.method public abstract n(Lxc/f0$e$f;)Lxc/f0$e$b;
.end method
