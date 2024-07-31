.class final synthetic Lcl/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lcl/c;Lcl/b;Lgk/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcl/c<",
            "-TT;>;",
            "Lcl/b<",
            "+TT;>;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0}, Lcl/d;->e(Lcl/c;)V

    invoke-interface {p1, p0, p2}, Lcl/b;->a(Lcl/c;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Lck/v;->a:Lck/v;

    return-object p0
.end method
