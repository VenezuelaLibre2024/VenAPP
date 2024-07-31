.class public final Lzk/x;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lzk/w1;)Lzk/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lzk/w1;",
            ")",
            "Lzk/v<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lzk/w;

    invoke-direct {v0, p0}, Lzk/w;-><init>(Lzk/w1;)V

    return-object v0
.end method

.method public static synthetic b(Lzk/w1;ILjava/lang/Object;)Lzk/v;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lzk/x;->a(Lzk/w1;)Lzk/v;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lzk/v;Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lzk/v<",
            "TT;>;",
            "Ljava/lang/Object;",
            ")Z"
        }
    .end annotation

    invoke-static {p1}, Lck/n;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0, p1}, Lzk/v;->B(Ljava/lang/Object;)Z

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p0, v0}, Lzk/v;->y(Ljava/lang/Throwable;)Z

    move-result p0

    :goto_0
    return p0
.end method
