.class public final La1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lx0/f;Lok/p;Lgk/Continuation;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/f<",
            "La1/d;",
            ">;",
            "Lok/p<",
            "-",
            "La1/a;",
            "-",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lgk/Continuation<",
            "-",
            "La1/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, La1/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, La1/g$a;-><init>(Lok/p;Lgk/Continuation;)V

    invoke-interface {p0, v0, p2}, Lx0/f;->a(Lok/p;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
