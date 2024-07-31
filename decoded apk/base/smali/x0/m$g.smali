.class final Lx0/m$g;
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
        "Lcl/c<",
        "-TT;>;",
        "Lgk/Continuation<",
        "-",
        "Lck/v;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.datastore.core.SingleProcessDataStore$data$1"
    f = "SingleProcessDataStore.kt"
    l = {
        0x75
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

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
            "Lx0/m$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx0/m$g;->c:Lx0/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILgk/Continuation;)V

    return-void
.end method


# virtual methods
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

    new-instance v0, Lx0/m$g;

    iget-object v1, p0, Lx0/m$g;->c:Lx0/m;

    invoke-direct {v0, v1, p2}, Lx0/m$g;-><init>(Lx0/m;Lgk/Continuation;)V

    iput-object p1, v0, Lx0/m$g;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lcl/c;Lgk/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcl/c<",
            "-TT;>;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lx0/m$g;->create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;

    move-result-object p1

    check-cast p1, Lx0/m$g;

    sget-object p2, Lck/v;->a:Lck/v;

    invoke-virtual {p1, p2}, Lx0/m$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcl/c;

    check-cast p2, Lgk/Continuation;

    invoke-virtual {p0, p1, p2}, Lx0/m$g;->invoke(Lcl/c;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lx0/m$g;->a:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lx0/m$g;->b:Ljava/lang/Object;

    check-cast p1, Lcl/c;

    iget-object v1, p0, Lx0/m$g;->c:Lx0/m;

    invoke-static {v1}, Lx0/m;->e(Lx0/m;)Lcl/k;

    move-result-object v1

    invoke-interface {v1}, Lcl/k;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx0/n;

    instance-of v3, v1, Lx0/c;

    if-nez v3, :cond_2

    iget-object v3, p0, Lx0/m$g;->c:Lx0/m;

    invoke-static {v3}, Lx0/m;->d(Lx0/m;)Lx0/l;

    move-result-object v3

    new-instance v4, Lx0/m$b$a;

    invoke-direct {v4, v1}, Lx0/m$b$a;-><init>(Lx0/n;)V

    invoke-virtual {v3, v4}, Lx0/l;->e(Ljava/lang/Object;)V

    :cond_2
    iget-object v3, p0, Lx0/m$g;->c:Lx0/m;

    invoke-static {v3}, Lx0/m;->e(Lx0/m;)Lcl/k;

    move-result-object v3

    new-instance v4, Lx0/m$g$a;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, Lx0/m$g$a;-><init>(Lx0/n;Lgk/Continuation;)V

    invoke-static {v3, v4}, Lcl/d;->c(Lcl/b;Lok/p;)Lcl/b;

    move-result-object v1

    new-instance v3, Lx0/m$g$b;

    invoke-direct {v3, v1}, Lx0/m$g$b;-><init>(Lcl/b;)V

    iput v2, p0, Lx0/m$g;->a:I

    invoke-static {p1, v3, p0}, Lcl/d;->d(Lcl/c;Lcl/b;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
