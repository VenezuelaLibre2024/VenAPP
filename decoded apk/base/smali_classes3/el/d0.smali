.class public Lel/d0;
.super Lzk/a;
.source "SourceFile"

# interfaces
.implements Lkotlin/coroutines/jvm/internal/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lzk/a<",
        "TT;>;",
        "Lkotlin/coroutines/jvm/internal/e;"
    }
.end annotation


# instance fields
.field public final d:Lgk/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgk/Continuation<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgk/f;Lgk/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/f;",
            "Lgk/Continuation<",
            "-TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v0}, Lzk/a;-><init>(Lgk/f;ZZ)V

    iput-object p2, p0, Lel/d0;->d:Lgk/Continuation;

    return-void
.end method


# virtual methods
.method protected N0(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lel/d0;->d:Lgk/Continuation;

    invoke-static {p1, v0}, Lzk/e0;->a(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, p1}, Lgk/Continuation;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method protected final e0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .locals 2

    iget-object v0, p0, Lel/d0;->d:Lgk/Continuation;

    instance-of v1, v0, Lkotlin/coroutines/jvm/internal/e;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlin/coroutines/jvm/internal/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method protected t(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lel/d0;->d:Lgk/Continuation;

    invoke-static {v0}, Lhk/b;->b(Lgk/Continuation;)Lgk/Continuation;

    move-result-object v0

    iget-object v1, p0, Lel/d0;->d:Lgk/Continuation;

    invoke-static {p1, v1}, Lzk/e0;->a(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lel/k;->c(Lgk/Continuation;Ljava/lang/Object;Lok/l;ILjava/lang/Object;)V

    return-void
.end method
