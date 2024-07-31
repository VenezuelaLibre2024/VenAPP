.class public final Ldl/i;
.super Lkotlin/coroutines/jvm/internal/d;
.source "SourceFile"

# interfaces
.implements Lcl/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lkotlin/coroutines/jvm/internal/d;",
        "Lcl/c<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lcl/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcl/c<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Lgk/f;

.field public final c:I

.field private d:Lgk/f;

.field private e:Lgk/Continuation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcl/c;Lgk/f;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcl/c<",
            "-TT;>;",
            "Lgk/f;",
            ")V"
        }
    .end annotation

    sget-object v0, Ldl/g;->a:Ldl/g;

    sget-object v1, Lgk/g;->a:Lgk/g;

    invoke-direct {p0, v0, v1}, Lkotlin/coroutines/jvm/internal/d;-><init>(Lgk/Continuation;Lgk/f;)V

    iput-object p1, p0, Ldl/i;->a:Lcl/c;

    iput-object p2, p0, Ldl/i;->b:Lgk/f;

    const/4 p1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    sget-object v0, Ldl/i$a;->a:Ldl/i$a;

    invoke-interface {p2, p1, v0}, Lgk/f;->z0(Ljava/lang/Object;Lok/p;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iput p1, p0, Ldl/i;->c:I

    return-void
.end method

.method private final a(Lgk/f;Lgk/f;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/f;",
            "Lgk/f;",
            "TT;)V"
        }
    .end annotation

    instance-of v0, p2, Ldl/e;

    if-eqz v0, :cond_0

    check-cast p2, Ldl/e;

    invoke-direct {p0, p2, p3}, Ldl/i;->g(Ldl/e;Ljava/lang/Object;)V

    :cond_0
    invoke-static {p0, p1}, Ldl/k;->a(Ldl/i;Lgk/f;)V

    return-void
.end method

.method private final f(Lgk/Continuation;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;TT;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p1}, Lgk/Continuation;->getContext()Lgk/f;

    move-result-object v0

    invoke-static {v0}, Lzk/a2;->h(Lgk/f;)V

    iget-object v1, p0, Ldl/i;->d:Lgk/f;

    if-eq v1, v0, :cond_0

    invoke-direct {p0, v0, v1, p2}, Ldl/i;->a(Lgk/f;Lgk/f;Ljava/lang/Object;)V

    iput-object v0, p0, Ldl/i;->d:Lgk/f;

    :cond_0
    iput-object p1, p0, Ldl/i;->e:Lgk/Continuation;

    invoke-static {}, Ldl/j;->a()Lok/q;

    move-result-object p1

    iget-object v0, p0, Ldl/i;->a:Lcl/c;

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->c(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0, p2, p0}, Lok/q;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-object p2, p0, Ldl/i;->e:Lgk/Continuation;

    :cond_1
    return-object p1
.end method

.method private final g(Ldl/e;Ljava/lang/Object;)V
    .locals 3

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\n            Flow exception transparency is violated:\n                Previous \'emit\' call has thrown exception "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Ldl/e;->a:Ljava/lang/Throwable;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", but then emission attempt of value \'"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\' has been detected.\n                Emissions from \'catch\' blocks are prohibited in order to avoid unspecified behaviour, \'Flow.catch\' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxk/g;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public emit(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :try_start_0
    invoke-direct {p0, p2, p1}, Ldl/i;->f(Lgk/Continuation;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Lgk/Continuation;)V

    :cond_0
    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1

    :catchall_0
    move-exception p1

    new-instance v0, Ldl/e;

    invoke-interface {p2}, Lgk/Continuation;->getContext()Lgk/f;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Ldl/e;-><init>(Ljava/lang/Throwable;Lgk/f;)V

    iput-object v0, p0, Ldl/i;->d:Lgk/f;

    throw p1
.end method

.method public getCallerFrame()Lkotlin/coroutines/jvm/internal/e;
    .locals 2

    iget-object v0, p0, Ldl/i;->e:Lgk/Continuation;

    instance-of v1, v0, Lkotlin/coroutines/jvm/internal/e;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlin/coroutines/jvm/internal/e;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public getContext()Lgk/f;
    .locals 1

    iget-object v0, p0, Ldl/i;->d:Lgk/f;

    if-nez v0, :cond_0

    sget-object v0, Lgk/g;->a:Lgk/g;

    :cond_0
    return-object v0
.end method

.method public getStackTraceElement()Ljava/lang/StackTraceElement;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {p1}, Lck/n;->d(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Ldl/e;

    invoke-virtual {p0}, Ldl/i;->getContext()Lgk/f;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ldl/e;-><init>(Ljava/lang/Throwable;Lgk/f;)V

    iput-object v1, p0, Ldl/i;->d:Lgk/f;

    :cond_0
    iget-object v0, p0, Ldl/i;->e:Lgk/Continuation;

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lgk/Continuation;->resumeWith(Ljava/lang/Object;)V

    :cond_1
    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public releaseIntercepted()V
    .locals 0

    invoke-super {p0}, Lkotlin/coroutines/jvm/internal/d;->releaseIntercepted()V

    return-void
.end method
