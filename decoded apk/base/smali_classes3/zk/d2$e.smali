.class final Lzk/d2$e;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzk/d2;->i()Lwk/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lok/p<",
        "Lwk/f<",
        "-",
        "Lzk/w1;",
        ">;",
        "Lgk/Continuation<",
        "-",
        "Lck/v;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "kotlinx.coroutines.JobSupport$children$1"
    f = "JobSupport.kt"
    l = {
        0x3bb,
        0x3bd
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:I

.field private synthetic e:Ljava/lang/Object;

.field final synthetic f:Lzk/d2;


# direct methods
.method constructor <init>(Lzk/d2;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzk/d2;",
            "Lgk/Continuation<",
            "-",
            "Lzk/d2$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzk/d2$e;->f:Lzk/d2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lwk/f;Lgk/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwk/f<",
            "-",
            "Lzk/w1;",
            ">;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lzk/d2$e;->create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;

    move-result-object p1

    check-cast p1, Lzk/d2$e;

    sget-object p2, Lck/v;->a:Lck/v;

    invoke-virtual {p1, p2}, Lzk/d2$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lgk/Continuation<",
            "*>;)",
            "Lgk/Continuation<",
            "Lck/v;",
            ">;"
        }
    .end annotation

    new-instance v0, Lzk/d2$e;

    iget-object v1, p0, Lzk/d2$e;->f:Lzk/d2;

    invoke-direct {v0, v1, p2}, Lzk/d2$e;-><init>(Lzk/d2;Lgk/Continuation;)V

    iput-object p1, v0, Lzk/d2$e;->e:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwk/f;

    check-cast p2, Lgk/Continuation;

    invoke-virtual {p0, p1, p2}, Lzk/d2$e;->a(Lwk/f;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lzk/d2$e;->d:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lzk/d2$e;->c:Ljava/lang/Object;

    check-cast v1, Lel/s;

    iget-object v3, p0, Lzk/d2$e;->b:Ljava/lang/Object;

    check-cast v3, Lel/q;

    iget-object v4, p0, Lzk/d2$e;->e:Ljava/lang/Object;

    check-cast v4, Lwk/f;

    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    move-object p1, p0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lzk/d2$e;->e:Ljava/lang/Object;

    check-cast p1, Lwk/f;

    iget-object v1, p0, Lzk/d2$e;->f:Lzk/d2;

    invoke-virtual {v1}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v1

    instance-of v4, v1, Lzk/t;

    if-eqz v4, :cond_3

    check-cast v1, Lzk/t;

    iget-object v1, v1, Lzk/t;->e:Lzk/u;

    iput v3, p0, Lzk/d2$e;->d:I

    invoke-virtual {p1, v1, p0}, Lwk/f;->a(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_3
    instance-of v3, v1, Lzk/r1;

    if-eqz v3, :cond_5

    check-cast v1, Lzk/r1;

    invoke-interface {v1}, Lzk/r1;->c()Lzk/i2;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lel/s;->l()Ljava/lang/Object;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Lel/s;

    move-object v4, p1

    move-object p1, p0

    move-object v6, v3

    move-object v3, v1

    move-object v1, v6

    :goto_0
    invoke-static {v1, v3}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    instance-of v5, v1, Lzk/t;

    if-eqz v5, :cond_4

    move-object v5, v1

    check-cast v5, Lzk/t;

    iget-object v5, v5, Lzk/t;->e:Lzk/u;

    iput-object v4, p1, Lzk/d2$e;->e:Ljava/lang/Object;

    iput-object v3, p1, Lzk/d2$e;->b:Ljava/lang/Object;

    iput-object v1, p1, Lzk/d2$e;->c:Ljava/lang/Object;

    iput v2, p1, Lzk/d2$e;->d:I

    invoke-virtual {v4, v5, p1}, Lwk/f;->a(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    invoke-virtual {v1}, Lel/s;->o()Lel/s;

    move-result-object v1

    goto :goto_0

    :cond_5
    :goto_2
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
