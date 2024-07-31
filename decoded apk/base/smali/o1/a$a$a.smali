.class final Lo1/a$a$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo1/a$a;->b(Landroidx/privacysandbox/ads/adservices/topics/a;)Lcom/google/common/util/concurrent/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lok/p<",
        "Lzk/k0;",
        "Lgk/Continuation<",
        "-",
        "Landroidx/privacysandbox/ads/adservices/topics/b;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1"
    f = "TopicsManagerFutures.kt"
    l = {
        0x38
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field a:I

.field final synthetic b:Lo1/a$a;

.field final synthetic c:Landroidx/privacysandbox/ads/adservices/topics/a;


# direct methods
.method constructor <init>(Lo1/a$a;Landroidx/privacysandbox/ads/adservices/topics/a;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo1/a$a;",
            "Landroidx/privacysandbox/ads/adservices/topics/a;",
            "Lgk/Continuation<",
            "-",
            "Lo1/a$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lo1/a$a$a;->b:Lo1/a$a;

    iput-object p2, p0, Lo1/a$a$a;->c:Landroidx/privacysandbox/ads/adservices/topics/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILgk/Continuation;)V

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

    new-instance p1, Lo1/a$a$a;

    iget-object v0, p0, Lo1/a$a$a;->b:Lo1/a$a;

    iget-object v1, p0, Lo1/a$a$a;->c:Landroidx/privacysandbox/ads/adservices/topics/a;

    invoke-direct {p1, v0, v1, p2}, Lo1/a$a$a;-><init>(Lo1/a$a;Landroidx/privacysandbox/ads/adservices/topics/a;Lgk/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzk/k0;

    check-cast p2, Lgk/Continuation;

    invoke-virtual {p0, p1, p2}, Lo1/a$a$a;->invoke(Lzk/k0;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lzk/k0;Lgk/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzk/k0;",
            "Lgk/Continuation<",
            "-",
            "Landroidx/privacysandbox/ads/adservices/topics/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lo1/a$a$a;->create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;

    move-result-object p1

    check-cast p1, Lo1/a$a$a;

    sget-object p2, Lck/v;->a:Lck/v;

    invoke-virtual {p1, p2}, Lo1/a$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lo1/a$a$a;->a:I

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

    iget-object p1, p0, Lo1/a$a$a;->b:Lo1/a$a;

    invoke-static {p1}, Lo1/a$a;->c(Lo1/a$a;)Landroidx/privacysandbox/ads/adservices/topics/d;

    move-result-object p1

    iget-object v1, p0, Lo1/a$a$a;->c:Landroidx/privacysandbox/ads/adservices/topics/a;

    iput v2, p0, Lo1/a$a$a;->a:I

    invoke-virtual {p1, v1, p0}, Landroidx/privacysandbox/ads/adservices/topics/d;->a(Landroidx/privacysandbox/ads/adservices/topics/a;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    return-object p1
.end method
