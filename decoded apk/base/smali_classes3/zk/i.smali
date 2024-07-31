.class final synthetic Lzk/i;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lgk/f;Lok/p;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lgk/f;",
            "Lok/p<",
            "-",
            "Lzk/k0;",
            "-",
            "Lgk/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)TT;"
        }
    .end annotation

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    sget-object v1, Lgk/d;->n:Lgk/d$b;

    invoke-interface {p0, v1}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v1

    check-cast v1, Lgk/d;

    if-nez v1, :cond_0

    sget-object v1, Lzk/s2;->a:Lzk/s2;

    invoke-virtual {v1}, Lzk/s2;->b()Lzk/g1;

    move-result-object v1

    sget-object v2, Lzk/p1;->a:Lzk/p1;

    invoke-interface {p0, v1}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object p0

    :goto_0
    invoke-static {v2, p0}, Lzk/g0;->e(Lzk/k0;Lgk/f;)Lgk/f;

    move-result-object p0

    goto :goto_4

    :cond_0
    instance-of v2, v1, Lzk/g1;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast v1, Lzk/g1;

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lzk/g1;->q1()Z

    move-result v2

    if-eqz v2, :cond_2

    move-object v3, v1

    :cond_2
    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    move-object v1, v3

    goto :goto_3

    :cond_4
    :goto_2
    sget-object v1, Lzk/s2;->a:Lzk/s2;

    invoke-virtual {v1}, Lzk/s2;->a()Lzk/g1;

    move-result-object v1

    :goto_3
    sget-object v2, Lzk/p1;->a:Lzk/p1;

    goto :goto_0

    :goto_4
    new-instance v2, Lzk/f;

    invoke-direct {v2, p0, v0, v1}, Lzk/f;-><init>(Lgk/f;Ljava/lang/Thread;Lzk/g1;)V

    sget-object p0, Lzk/m0;->DEFAULT:Lzk/m0;

    invoke-virtual {v2, p0, v2, p1}, Lzk/a;->Q0(Lzk/m0;Ljava/lang/Object;Lok/p;)V

    invoke-virtual {v2}, Lzk/f;->R0()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lgk/f;Lok/p;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p0, Lgk/g;->a:Lgk/g;

    :cond_0
    invoke-static {p0, p1}, Lzk/h;->e(Lgk/f;Lok/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
