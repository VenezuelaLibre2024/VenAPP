.class public abstract Lkotlin/coroutines/jvm/internal/d;
.super Lkotlin/coroutines/jvm/internal/a;
.source "SourceFile"


# instance fields
.field private final _context:Lgk/f;

.field private transient intercepted:Lgk/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgk/Continuation<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lgk/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lgk/Continuation;->getContext()Lgk/f;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-direct {p0, p1, v0}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lgk/Continuation;Lgk/f;)V

    return-void
.end method

.method public constructor <init>(Lgk/Continuation;Lgk/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "Ljava/lang/Object;",
            ">;",
            "Lgk/f;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/a;-><init>(Lgk/Continuation;)V

    iput-object p2, p0, Lkotlin/coroutines/jvm/internal/d;->_context:Lgk/f;

    return-void
.end method


# virtual methods
.method public getContext()Lgk/f;
    .locals 1

    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->_context:Lgk/f;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final intercepted()Lgk/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lgk/Continuation<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lgk/Continuation;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lkotlin/coroutines/jvm/internal/d;->getContext()Lgk/f;

    move-result-object v0

    sget-object v1, Lgk/d;->n:Lgk/d$b;

    invoke-interface {v0, v1}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v0

    check-cast v0, Lgk/d;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0}, Lgk/d;->E(Lgk/Continuation;)Lgk/Continuation;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, p0

    :cond_1
    iput-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lgk/Continuation;

    :cond_2
    return-object v0
.end method

.method protected releaseIntercepted()V
    .locals 3

    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lgk/Continuation;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lkotlin/coroutines/jvm/internal/d;->getContext()Lgk/f;

    move-result-object v1

    sget-object v2, Lgk/d;->n:Lgk/d$b;

    invoke-interface {v1, v2}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    check-cast v1, Lgk/d;

    invoke-interface {v1, v0}, Lgk/d;->h0(Lgk/Continuation;)V

    :cond_0
    sget-object v0, Lkotlin/coroutines/jvm/internal/c;->a:Lkotlin/coroutines/jvm/internal/c;

    iput-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Lgk/Continuation;

    return-void
.end method
