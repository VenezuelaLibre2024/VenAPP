.class public final Lzk/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lgk/f;)Lzk/k0;
    .locals 3

    new-instance v0, Lel/f;

    sget-object v1, Lzk/w1;->q:Lzk/w1$b;

    invoke-interface {p0, v1}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v1, v2}, Lzk/a2;->b(Lzk/w1;ILjava/lang/Object;)Lzk/y;

    move-result-object v1

    invoke-interface {p0, v1}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object p0

    :goto_0
    invoke-direct {v0, p0}, Lel/f;-><init>(Lgk/f;)V

    return-object v0
.end method

.method public static final b()Lzk/k0;
    .locals 3

    new-instance v0, Lel/f;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v1, v2, v1}, Lzk/q2;->b(Lzk/w1;ILjava/lang/Object;)Lzk/y;

    move-result-object v1

    invoke-static {}, Lzk/a1;->c()Lzk/h2;

    move-result-object v2

    invoke-interface {v1, v2}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object v1

    invoke-direct {v0, v1}, Lel/f;-><init>(Lgk/f;)V

    return-object v0
.end method

.method public static final c(Lzk/k0;Ljava/util/concurrent/CancellationException;)V
    .locals 2

    invoke-interface {p0}, Lzk/k0;->h()Lgk/f;

    move-result-object v0

    sget-object v1, Lzk/w1;->q:Lzk/w1$b;

    invoke-interface {v0, v1}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v0

    check-cast v0, Lzk/w1;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lzk/w1;->O(Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Scope cannot be cancelled because it does not have a job: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic d(Lzk/k0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lzk/l0;->c(Lzk/k0;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final e(Lok/p;Lgk/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lok/p<",
            "-",
            "Lzk/k0;",
            "-",
            "Lgk/Continuation<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;",
            "Lgk/Continuation<",
            "-TR;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lel/d0;

    invoke-interface {p1}, Lgk/Continuation;->getContext()Lgk/f;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Lel/d0;-><init>(Lgk/f;Lgk/Continuation;)V

    invoke-static {v0, v0, p0}, Lfl/b;->b(Lel/d0;Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p0, v0, :cond_0

    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/h;->c(Lgk/Continuation;)V

    :cond_0
    return-object p0
.end method

.method public static final f(Lzk/k0;)V
    .locals 0

    invoke-interface {p0}, Lzk/k0;->h()Lgk/f;

    move-result-object p0

    invoke-static {p0}, Lzk/a2;->h(Lgk/f;)V

    return-void
.end method

.method public static final g(Lzk/k0;)Z
    .locals 1

    invoke-interface {p0}, Lzk/k0;->h()Lgk/f;

    move-result-object p0

    sget-object v0, Lzk/w1;->q:Lzk/w1$b;

    invoke-interface {p0, v0}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object p0

    check-cast p0, Lzk/w1;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lzk/w1;->a()Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    :goto_0
    return p0
.end method
