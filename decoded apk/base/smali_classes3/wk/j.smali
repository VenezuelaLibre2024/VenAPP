.class Lwk/j;
.super Lwk/i;
.source "SourceFile"


# direct methods
.method public static c(Ljava/util/Iterator;)Lwk/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "+TT;>;)",
            "Lwk/d<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwk/j$a;

    invoke-direct {v0, p0}, Lwk/j$a;-><init>(Ljava/util/Iterator;)V

    invoke-static {v0}, Lwk/j;->d(Lwk/d;)Lwk/d;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lwk/d;)Lwk/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lwk/d<",
            "+TT;>;)",
            "Lwk/d<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lwk/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lwk/a;

    invoke-direct {v0, p0}, Lwk/a;-><init>(Lwk/d;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
