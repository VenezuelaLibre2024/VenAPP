.class public final Lzk/p;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lzk/m;Lzk/c1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzk/m<",
            "*>;",
            "Lzk/c1;",
            ")V"
        }
    .end annotation

    new-instance v0, Lzk/d1;

    invoke-direct {v0, p1}, Lzk/d1;-><init>(Lzk/c1;)V

    invoke-interface {p0, v0}, Lzk/m;->k(Lok/l;)V

    return-void
.end method

.method public static final b(Lgk/Continuation;)Lzk/n;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lgk/Continuation<",
            "-TT;>;)",
            "Lzk/n<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lel/j;

    if-nez v0, :cond_0

    new-instance v0, Lzk/n;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lzk/n;-><init>(Lgk/Continuation;I)V

    return-object v0

    :cond_0
    move-object v0, p0

    check-cast v0, Lel/j;

    invoke-virtual {v0}, Lel/j;->m()Lzk/n;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lzk/n;->J()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    return-object v0

    :cond_3
    :goto_1
    new-instance v0, Lzk/n;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lzk/n;-><init>(Lgk/Continuation;I)V

    return-object v0
.end method
