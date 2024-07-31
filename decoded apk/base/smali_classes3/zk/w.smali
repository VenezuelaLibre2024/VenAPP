.class final Lzk/w;
.super Lzk/d2;
.source "SourceFile"

# interfaces
.implements Lzk/v;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lzk/d2;",
        "Lzk/v<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lzk/w1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lzk/d2;-><init>(Z)V

    invoke-virtual {p0, p1}, Lzk/d2;->b0(Lzk/w1;)V

    return-void
.end method


# virtual methods
.method public B(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lzk/d2;->l0(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public V()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public g()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lzk/d2;->M()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public i0(Lgk/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lzk/d2;->u(Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    return-object p1
.end method

.method public y(Ljava/lang/Throwable;)Z
    .locals 4

    new-instance v0, Lzk/a0;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct {v0, p1, v3, v1, v2}, Lzk/a0;-><init>(Ljava/lang/Throwable;ZILkotlin/jvm/internal/g;)V

    invoke-virtual {p0, v0}, Lzk/d2;->l0(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
