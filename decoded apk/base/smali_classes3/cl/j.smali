.class final synthetic Lcl/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcl/b;Lgk/Continuation;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcl/b<",
            "+TT;>;",
            "Lgk/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcl/j$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcl/j$b;

    iget v1, v0, Lcl/j$b;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcl/j$b;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcl/j$b;

    invoke-direct {v0, p1}, Lcl/j$b;-><init>(Lgk/Continuation;)V

    :goto_0
    iget-object p1, v0, Lcl/j$b;->c:Ljava/lang/Object;

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcl/j$b;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lcl/j$b;->b:Ljava/lang/Object;

    check-cast p0, Lcl/j$a;

    iget-object v0, v0, Lcl/j$b;->a:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/x;

    :try_start_0
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ldl/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    new-instance p1, Lkotlin/jvm/internal/x;

    invoke-direct {p1}, Lkotlin/jvm/internal/x;-><init>()V

    sget-object v2, Ldl/h;->a:Lel/h0;

    iput-object v2, p1, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    new-instance v2, Lcl/j$a;

    invoke-direct {v2, p1}, Lcl/j$a;-><init>(Lkotlin/jvm/internal/x;)V

    :try_start_1
    iput-object p1, v0, Lcl/j$b;->a:Ljava/lang/Object;

    iput-object v2, v0, Lcl/j$b;->b:Ljava/lang/Object;

    iput v3, v0, Lcl/j$b;->d:I

    invoke-interface {p0, v2, v0}, Lcl/b;->a(Lcl/c;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ldl/a; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    goto :goto_2

    :catch_1
    move-exception p0

    move-object v0, p1

    move-object p1, p0

    move-object p0, v2

    :goto_1
    invoke-static {p1, p0}, Ldl/f;->a(Ldl/a;Lcl/c;)V

    :goto_2
    iget-object p0, v0, Lkotlin/jvm/internal/x;->a:Ljava/lang/Object;

    sget-object p1, Ldl/h;->a:Lel/h0;

    if-eq p0, p1, :cond_4

    return-object p0

    :cond_4
    new-instance p0, Ljava/util/NoSuchElementException;

    const-string p1, "Expected at least one element"

    invoke-direct {p0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
