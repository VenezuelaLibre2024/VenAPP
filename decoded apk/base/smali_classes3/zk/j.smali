.class final synthetic Lzk/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lzk/k0;Lgk/f;Lzk/m0;Lok/p;)Lzk/r0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lzk/k0;",
            "Lgk/f;",
            "Lzk/m0;",
            "Lok/p<",
            "-",
            "Lzk/k0;",
            "-",
            "Lgk/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzk/r0<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, Lzk/g0;->e(Lzk/k0;Lgk/f;)Lgk/f;

    move-result-object p0

    invoke-virtual {p2}, Lzk/m0;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lzk/f2;

    invoke-direct {p1, p0, p3}, Lzk/f2;-><init>(Lgk/f;Lok/p;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lzk/s0;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lzk/s0;-><init>(Lgk/f;Z)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lzk/a;->Q0(Lzk/m0;Ljava/lang/Object;Lok/p;)V

    return-object p1
.end method

.method public static synthetic b(Lzk/k0;Lgk/f;Lzk/m0;Lok/p;ILjava/lang/Object;)Lzk/r0;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lgk/g;->a:Lgk/g;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, Lzk/m0;->DEFAULT:Lzk/m0;

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lzk/h;->a(Lzk/k0;Lgk/f;Lzk/m0;Lok/p;)Lzk/r0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lzk/k0;Lgk/f;Lzk/m0;Lok/p;)Lzk/w1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzk/k0;",
            "Lgk/f;",
            "Lzk/m0;",
            "Lok/p<",
            "-",
            "Lzk/k0;",
            "-",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lzk/w1;"
        }
    .end annotation

    invoke-static {p0, p1}, Lzk/g0;->e(Lzk/k0;Lgk/f;)Lgk/f;

    move-result-object p0

    invoke-virtual {p2}, Lzk/m0;->i()Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lzk/g2;

    invoke-direct {p1, p0, p3}, Lzk/g2;-><init>(Lgk/f;Lok/p;)V

    goto :goto_0

    :cond_0
    new-instance p1, Lzk/o2;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Lzk/o2;-><init>(Lgk/f;Z)V

    :goto_0
    invoke-virtual {p1, p2, p1, p3}, Lzk/a;->Q0(Lzk/m0;Ljava/lang/Object;Lok/p;)V

    return-object p1
.end method

.method public static synthetic d(Lzk/k0;Lgk/f;Lzk/m0;Lok/p;ILjava/lang/Object;)Lzk/w1;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    sget-object p1, Lgk/g;->a:Lgk/g;

    :cond_0
    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_1

    sget-object p2, Lzk/m0;->DEFAULT:Lzk/m0;

    :cond_1
    invoke-static {p0, p1, p2, p3}, Lzk/h;->c(Lzk/k0;Lgk/f;Lzk/m0;Lok/p;)Lzk/w1;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lgk/f;Lok/p;Lgk/Continuation;)Ljava/lang/Object;
    .locals 8
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
            ">;",
            "Lgk/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p2}, Lgk/Continuation;->getContext()Lgk/f;

    move-result-object v0

    invoke-static {v0, p0}, Lzk/g0;->d(Lgk/f;Lgk/f;)Lgk/f;

    move-result-object p0

    invoke-static {p0}, Lzk/a2;->h(Lgk/f;)V

    if-ne p0, v0, :cond_0

    new-instance v0, Lel/d0;

    invoke-direct {v0, p0, p2}, Lel/d0;-><init>(Lgk/f;Lgk/Continuation;)V

    invoke-static {v0, v0, p1}, Lfl/b;->b(Lel/d0;Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v1, Lgk/d;->n:Lgk/d$b;

    invoke-interface {p0, v1}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v2

    invoke-interface {v0, v1}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lzk/z2;

    invoke-direct {v0, p0, p2}, Lzk/z2;-><init>(Lgk/f;Lgk/Continuation;)V

    invoke-virtual {v0}, Lzk/a;->getContext()Lgk/f;

    move-result-object p0

    const/4 v1, 0x0

    invoke-static {p0, v1}, Lel/l0;->c(Lgk/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    :try_start_0
    invoke-static {v0, v0, p1}, Lfl/b;->b(Lel/d0;Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0, v1}, Lel/l0;->a(Lgk/f;Ljava/lang/Object;)V

    move-object p0, p1

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-static {p0, v1}, Lel/l0;->a(Lgk/f;Ljava/lang/Object;)V

    throw p1

    :cond_1
    new-instance v0, Lzk/w0;

    invoke-direct {v0, p0, p2}, Lzk/w0;-><init>(Lgk/f;Lgk/Continuation;)V

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p1

    move-object v3, v0

    move-object v4, v0

    invoke-static/range {v2 .. v7}, Lfl/a;->d(Lok/p;Ljava/lang/Object;Lgk/Continuation;Lok/l;ILjava/lang/Object;)V

    invoke-virtual {v0}, Lzk/w0;->R0()Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_2

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lgk/Continuation;)V

    :cond_2
    return-object p0
.end method
