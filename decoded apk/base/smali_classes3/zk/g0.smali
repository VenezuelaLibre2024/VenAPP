.class public final Lzk/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Lgk/f;Lgk/f;Z)Lgk/f;
    .locals 3

    invoke-static {p0}, Lzk/g0;->c(Lgk/f;)Z

    move-result v0

    invoke-static {p1}, Lzk/g0;->c(Lgk/f;)Z

    move-result v1

    if-nez v0, :cond_0

    if-nez v1, :cond_0

    invoke-interface {p0, p1}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Lkotlin/jvm/internal/x;

    invoke-direct {v0}, Lkotlin/jvm/internal/x;-><init>()V

    iput-object p1, v0, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    sget-object p1, Lgk/g;->a:Lgk/g;

    new-instance v2, Lzk/g0$b;

    invoke-direct {v2, v0, p2}, Lzk/g0$b;-><init>(Lkotlin/jvm/internal/x;Z)V

    invoke-interface {p0, p1, v2}, Lgk/f;->z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgk/f;

    if-eqz v1, :cond_1

    iget-object p2, v0, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    check-cast p2, Lgk/f;

    sget-object v1, Lzk/g0$a;->a:Lzk/g0$a;

    invoke-interface {p2, p1, v1}, Lgk/f;->z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    :cond_1
    iget-object p1, v0, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    check-cast p1, Lgk/f;

    invoke-interface {p0, p1}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lgk/f;)Ljava/lang/String;
    .locals 0

    const/4 p0, 0x0

    return-object p0
.end method

.method private static final c(Lgk/f;)Z
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v1, Lzk/g0$c;->a:Lzk/g0$c;

    invoke-interface {p0, v0, v1}, Lgk/f;->z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method public static final d(Lgk/f;Lgk/f;)Lgk/f;
    .locals 1

    invoke-static {p1}, Lzk/g0;->c(Lgk/f;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lzk/g0;->a(Lgk/f;Lgk/f;Z)Lgk/f;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lzk/k0;Lgk/f;)Lgk/f;
    .locals 1

    invoke-interface {p0}, Lzk/k0;->h()Lgk/f;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, p1, v0}, Lzk/g0;->a(Lgk/f;Lgk/f;Z)Lgk/f;

    move-result-object p0

    invoke-static {}, Lzk/a1;->a()Lzk/h0;

    move-result-object p1

    if-eq p0, p1, :cond_0

    sget-object p1, Lgk/d;->n:Lgk/d$b;

    invoke-interface {p0, p1}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-static {}, Lzk/a1;->a()Lzk/h0;

    move-result-object p1

    invoke-interface {p0, p1}, Lgk/f;->U(Lgk/f;)Lgk/f;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final f(Lkotlin/coroutines/jvm/internal/e;)Lzk/z2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/jvm/internal/e;",
            ")",
            "Lzk/z2<",
            "*>;"
        }
    .end annotation

    :cond_0
    instance-of v0, p0, Lzk/w0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    invoke-interface {p0}, Lkotlin/coroutines/jvm/internal/e;->getCallerFrame()Lkotlin/coroutines/jvm/internal/e;

    move-result-object p0

    if-nez p0, :cond_2

    return-object v1

    :cond_2
    instance-of v0, p0, Lzk/z2;

    if-eqz v0, :cond_0

    check-cast p0, Lzk/z2;

    return-object p0
.end method

.method public static final g(Lgk/Continuation;Lgk/f;Ljava/lang/Object;)Lzk/z2;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "*>;",
            "Lgk/f;",
            "Ljava/lang/Object;",
            ")",
            "Lzk/z2<",
            "*>;"
        }
    .end annotation

    instance-of v0, p0, Lkotlin/coroutines/jvm/internal/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    sget-object v0, Lzk/a3;->a:Lzk/a3;

    invoke-interface {p1, v0}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    return-object v1

    :cond_2
    check-cast p0, Lkotlin/coroutines/jvm/internal/e;

    invoke-static {p0}, Lzk/g0;->f(Lkotlin/coroutines/jvm/internal/e;)Lzk/z2;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0, p1, p2}, Lzk/z2;->S0(Lgk/f;Ljava/lang/Object;)V

    :cond_3
    return-object p0
.end method
