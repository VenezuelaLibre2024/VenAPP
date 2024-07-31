.class Lwk/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lok/p;)Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lok/p<",
            "-",
            "Lwk/f<",
            "-TT;>;-",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwk/e;

    invoke-direct {v0}, Lwk/e;-><init>()V

    invoke-static {p0, v0, v0}, Lhk/b;->a(Lok/p;Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;

    move-result-object p0

    invoke-virtual {v0, p0}, Lwk/e;->g(Lgk/Continuation;)V

    return-object v0
.end method

.method public static b(Lok/p;)Lwk/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lok/p<",
            "-",
            "Lwk/f<",
            "-TT;>;-",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)",
            "Lwk/d<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwk/h$a;

    invoke-direct {v0, p0}, Lwk/h$a;-><init>(Lok/p;)V

    return-object v0
.end method
