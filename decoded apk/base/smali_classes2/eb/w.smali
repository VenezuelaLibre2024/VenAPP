.class public final Leb/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leb/w$c;,
        Leb/w$b;,
        Leb/w$a;
    }
.end annotation


# direct methods
.method public static a(Leb/v;)Leb/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Leb/v<",
            "TT;>;)",
            "Leb/v<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Leb/w$b;

    if-nez v0, :cond_2

    instance-of v0, p0, Leb/w$a;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p0, Ljava/io/Serializable;

    if-eqz v0, :cond_1

    new-instance v0, Leb/w$a;

    invoke-direct {v0, p0}, Leb/w$a;-><init>(Leb/v;)V

    goto :goto_0

    :cond_1
    new-instance v0, Leb/w$b;

    invoke-direct {v0, p0}, Leb/w$b;-><init>(Leb/v;)V

    :goto_0
    return-object v0

    :cond_2
    :goto_1
    return-object p0
.end method

.method public static b(Ljava/lang/Object;)Leb/v;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Leb/v<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Leb/w$c;

    invoke-direct {v0, p0}, Leb/w$c;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
