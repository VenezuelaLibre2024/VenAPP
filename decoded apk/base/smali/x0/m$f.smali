.class final Lx0/m$f;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx0/m;-><init>(Lok/a;Lx0/k;Ljava/util/List;Lx0/b;Lzk/k0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lok/p<",
        "Lx0/m$b<",
        "TT;>;",
        "Lgk/Continuation<",
        "-",
        "Lck/v;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.datastore.core.SingleProcessDataStore$actor$3"
    f = "SingleProcessDataStore.kt"
    l = {
        0xef,
        0xf2
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lx0/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx0/m<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lx0/m;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/m<",
            "TT;>;",
            "Lgk/Continuation<",
            "-",
            "Lx0/m$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx0/m$f;->c:Lx0/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lx0/m$b;Lgk/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx0/m$b<",
            "TT;>;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lx0/m$f;->create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;

    move-result-object p1

    check-cast p1, Lx0/m$f;

    sget-object p2, Lck/v;->a:Lck/v;

    invoke-virtual {p1, p2}, Lx0/m$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    new-instance v0, Lx0/m$f;

    iget-object v1, p0, Lx0/m$f;->c:Lx0/m;

    invoke-direct {v0, v1, p2}, Lx0/m$f;-><init>(Lx0/m;Lgk/Continuation;)V

    iput-object p1, v0, Lx0/m$f;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lx0/m$b;

    check-cast p2, Lgk/Continuation;

    invoke-virtual {p0, p1, p2}, Lx0/m$f;->a(Lx0/m$b;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lx0/m$f;->a:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lx0/m$f;->b:Ljava/lang/Object;

    check-cast p1, Lx0/m$b;

    instance-of v1, p1, Lx0/m$b$a;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lx0/m$f;->c:Lx0/m;

    check-cast p1, Lx0/m$b$a;

    iput v3, p0, Lx0/m$f;->a:I

    invoke-static {v1, p1, p0}, Lx0/m;->h(Lx0/m;Lx0/m$b$a;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_3
    instance-of v1, p1, Lx0/m$b$b;

    if-eqz v1, :cond_4

    iget-object v1, p0, Lx0/m$f;->c:Lx0/m;

    check-cast p1, Lx0/m$b$b;

    iput v2, p0, Lx0/m$f;->a:I

    invoke-static {v1, p1, p0}, Lx0/m;->i(Lx0/m;Lx0/m$b$b;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_1
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
