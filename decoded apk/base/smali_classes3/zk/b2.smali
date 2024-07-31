.class final synthetic Lzk/b2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lzk/w1;)Lzk/y;
    .locals 1

    new-instance v0, Lzk/z1;

    invoke-direct {v0, p0}, Lzk/z1;-><init>(Lzk/w1;)V

    return-object v0
.end method

.method public static synthetic b(Lzk/w1;ILjava/lang/Object;)Lzk/y;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lzk/a2;->a(Lzk/w1;)Lzk/y;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lgk/f;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    sget-object v0, Lzk/w1;->q:Lzk/w1$b;

    invoke-interface {p0, v0}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object p0

    check-cast p0, Lzk/w1;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lzk/w1;->O(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public static synthetic d(Lgk/f;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lzk/a2;->c(Lgk/f;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final e(Lgk/f;Ljava/util/concurrent/CancellationException;)V
    .locals 1

    sget-object v0, Lzk/w1;->q:Lzk/w1$b;

    invoke-interface {p0, v0}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object p0

    check-cast p0, Lzk/w1;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lzk/w1;->i()Lwk/d;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lwk/d;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzk/w1;

    invoke-interface {v0, p1}, Lzk/w1;->O(Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic f(Lgk/f;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lzk/a2;->e(Lgk/f;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public static final g(Lzk/w1;Lzk/c1;)Lzk/c1;
    .locals 1

    new-instance v0, Lzk/e1;

    invoke-direct {v0, p1}, Lzk/e1;-><init>(Lzk/c1;)V

    invoke-interface {p0, v0}, Lzk/w1;->R(Lok/l;)Lzk/c1;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lgk/f;)V
    .locals 1

    sget-object v0, Lzk/w1;->q:Lzk/w1$b;

    invoke-interface {p0, v0}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object p0

    check-cast p0, Lzk/w1;

    if-eqz p0, :cond_0

    invoke-static {p0}, Lzk/a2;->i(Lzk/w1;)V

    :cond_0
    return-void
.end method

.method public static final i(Lzk/w1;)V
    .locals 1

    invoke-interface {p0}, Lzk/w1;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-interface {p0}, Lzk/w1;->n()Ljava/util/concurrent/CancellationException;

    move-result-object p0

    throw p0
.end method

.method public static final j(Lgk/f;)Lzk/w1;
    .locals 3

    sget-object v0, Lzk/w1;->q:Lzk/w1$b;

    invoke-interface {p0, v0}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v0

    check-cast v0, Lzk/w1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Current context doesn\'t contain Job in it: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
