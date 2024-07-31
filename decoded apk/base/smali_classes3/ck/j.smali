.class Lck/j;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Lok/a;)Lck/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lok/a<",
            "+TT;>;)",
            "Lck/h<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "initializer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lck/p;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Lck/p;-><init>(Lok/a;Ljava/lang/Object;ILkotlin/jvm/internal/g;)V

    return-object v0
.end method
