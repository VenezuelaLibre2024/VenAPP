.class public final Lzk/q2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lzk/w1;)Lzk/y;
    .locals 1

    new-instance v0, Lzk/p2;

    invoke-direct {v0, p0}, Lzk/p2;-><init>(Lzk/w1;)V

    return-object v0
.end method

.method public static synthetic b(Lzk/w1;ILjava/lang/Object;)Lzk/y;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    const/4 p0, 0x0

    :cond_0
    invoke-static {p0}, Lzk/q2;->a(Lzk/w1;)Lzk/y;

    move-result-object p0

    return-object p0
.end method
