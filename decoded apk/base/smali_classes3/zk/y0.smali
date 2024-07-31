.class public final Lzk/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lzk/x0;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lzk/x0<",
            "-TT;>;I)V"
        }
    .end annotation

    invoke-virtual {p0}, Lzk/x0;->b()Lgk/Continuation;

    move-result-object v0

    const/4 v1, 0x4

    if-ne p1, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_2

    instance-of v2, v0, Lel/j;

    if-eqz v2, :cond_2

    invoke-static {p1}, Lzk/y0;->b(I)Z

    move-result p1

    iget v2, p0, Lzk/x0;->c:I

    invoke-static {v2}, Lzk/y0;->b(I)Z

    move-result v2

    if-ne p1, v2, :cond_2

    move-object p1, v0

    check-cast p1, Lel/j;

    iget-object p1, p1, Lel/j;->d:Lzk/h0;

    invoke-interface {v0}, Lgk/Continuation;->getContext()Lgk/f;

    move-result-object v0

    invoke-virtual {p1, v0}, Lzk/h0;->F0(Lgk/f;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v0, p0}, Lzk/h0;->D0(Lgk/f;Ljava/lang/Runnable;)V

    goto :goto_1

    :cond_1
    invoke-static {p0}, Lzk/y0;->e(Lzk/x0;)V

    goto :goto_1

    :cond_2
    invoke-static {p0, v0, v1}, Lzk/y0;->d(Lzk/x0;Lgk/Continuation;Z)V

    :goto_1
    return-void
.end method

.method public static final b(I)Z
    .locals 2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x2

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :cond_1
    :goto_0
    return v0
.end method

.method public static final c(I)Z
    .locals 1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final d(Lzk/x0;Lgk/Continuation;Z)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lzk/x0<",
            "-TT;>;",
            "Lgk/Continuation<",
            "-TT;>;Z)V"
        }
    .end annotation

    invoke-virtual {p0}, Lzk/x0;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0, v0}, Lzk/x0;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    sget-object p0, Lck/n;->b:Lck/n$a;

    invoke-static {v1}, Lck/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v1, Lck/n;->b:Lck/n$a;

    invoke-virtual {p0, v0}, Lzk/x0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lck/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p2, :cond_5

    const-string p2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lel/j;

    iget-object p2, p1, Lel/j;->e:Lgk/Continuation;

    iget-object v0, p1, Lel/j;->r:Ljava/lang/Object;

    invoke-interface {p2}, Lgk/Continuation;->getContext()Lgk/f;

    move-result-object v1

    invoke-static {v1, v0}, Lel/l0;->c(Lgk/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lel/l0;->a:Lel/h0;

    if-eq v0, v2, :cond_1

    invoke-static {p2, v1, v0}, Lzk/g0;->g(Lgk/Continuation;Lgk/f;Ljava/lang/Object;)Lzk/z2;

    move-result-object p2

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    :try_start_0
    iget-object p1, p1, Lel/j;->e:Lgk/Continuation;

    invoke-interface {p1, p0}, Lgk/Continuation;->resumeWith(Ljava/lang/Object;)V

    sget-object p0, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lzk/z2;->R0()Z

    move-result p0

    if-eqz p0, :cond_6

    :cond_2
    invoke-static {v1, v0}, Lel/l0;->a(Lgk/f;Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p0

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lzk/z2;->R0()Z

    move-result p1

    if-eqz p1, :cond_4

    :cond_3
    invoke-static {v1, v0}, Lel/l0;->a(Lgk/f;Ljava/lang/Object;)V

    :cond_4
    throw p0

    :cond_5
    invoke-interface {p1, p0}, Lgk/Continuation;->resumeWith(Ljava/lang/Object;)V

    :cond_6
    :goto_2
    return-void
.end method

.method private static final e(Lzk/x0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzk/x0<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lzk/s2;->a:Lzk/s2;

    invoke-virtual {v0}, Lzk/s2;->b()Lzk/g1;

    move-result-object v0

    invoke-virtual {v0}, Lzk/g1;->a1()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, p0}, Lzk/g1;->R0(Lzk/x0;)V

    goto :goto_1

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lzk/g1;->W0(Z)V

    :try_start_0
    invoke-virtual {p0}, Lzk/x0;->b()Lgk/Continuation;

    move-result-object v2

    invoke-static {p0, v2, v1}, Lzk/y0;->d(Lzk/x0;Lgk/Continuation;Z)V

    :cond_1
    invoke-virtual {v0}, Lzk/g1;->j1()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v2

    const/4 v3, 0x0

    :try_start_1
    invoke-virtual {p0, v2, v3}, Lzk/x0;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_0
    invoke-virtual {v0, v1}, Lzk/g1;->I0(Z)V

    :goto_1
    return-void

    :catchall_1
    move-exception p0

    invoke-virtual {v0, v1}, Lzk/g1;->I0(Z)V

    throw p0
.end method
