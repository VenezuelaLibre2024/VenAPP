.class public final Lzk/x2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(JLzk/t0;Lzk/w1;)Lzk/v2;
    .locals 2

    instance-of v0, p2, Lzk/v0;

    if-eqz v0, :cond_0

    check-cast p2, Lzk/v0;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    sget-object v0, Lyk/a;->b:Lyk/a$a;

    sget-object v0, Lyk/d;->MILLISECONDS:Lyk/d;

    invoke-static {p0, p1, v0}, Lyk/c;->i(JLyk/d;)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Lzk/v0;->H(J)Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_2

    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Timed out waiting for "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " ms"

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_2
    new-instance p0, Lzk/v2;

    invoke-direct {p0, p2, p3}, Lzk/v2;-><init>(Ljava/lang/String;Lzk/w1;)V

    return-object p0
.end method

.method private static final b(Lzk/w2;Lok/p;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            "T::TU;>(",
            "Lzk/w2<",
            "TU;-TT;>;",
            "Lok/p<",
            "-",
            "Lzk/k0;",
            "-",
            "Lgk/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lel/d0;->d:Lgk/Continuation;

    invoke-interface {v0}, Lgk/Continuation;->getContext()Lgk/f;

    move-result-object v0

    invoke-static {v0}, Lzk/u0;->a(Lgk/f;)Lzk/t0;

    move-result-object v0

    iget-wide v1, p0, Lzk/w2;->e:J

    invoke-virtual {p0}, Lzk/a;->getContext()Lgk/f;

    move-result-object v3

    invoke-interface {v0, v1, v2, p0, v3}, Lzk/t0;->o(JLjava/lang/Runnable;Lgk/f;)Lzk/c1;

    move-result-object v0

    invoke-static {p0, v0}, Lzk/a2;->g(Lzk/w1;Lzk/c1;)Lzk/c1;

    invoke-static {p0, p0, p1}, Lfl/b;->c(Lel/d0;Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final c(JLok/p;Lgk/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J",
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

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-lez v0, :cond_1

    new-instance v0, Lzk/w2;

    invoke-direct {v0, p0, p1, p3}, Lzk/w2;-><init>(JLgk/Continuation;)V

    invoke-static {v0, p2}, Lzk/x2;->b(Lzk/w2;Lok/p;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    invoke-static {p3}, Lkotlin/coroutines/jvm/internal/h;->c(Lgk/Continuation;)V

    :cond_0
    return-object p0

    :cond_1
    new-instance p0, Lzk/v2;

    const-string p1, "Timed out immediately"

    invoke-direct {p0, p1}, Lzk/v2;-><init>(Ljava/lang/String;)V

    throw p0
.end method
