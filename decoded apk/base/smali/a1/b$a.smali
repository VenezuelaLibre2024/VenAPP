.class final La1/b$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La1/b;->a(Lok/p;Lgk/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lok/p<",
        "La1/d;",
        "Lgk/Continuation<",
        "-",
        "La1/d;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2"
    f = "PreferenceDataStoreFactory.kt"
    l = {
        0x55
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Lok/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/p<",
            "La1/d;",
            "Lgk/Continuation<",
            "-",
            "La1/d;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lok/p;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lok/p<",
            "-",
            "La1/d;",
            "-",
            "Lgk/Continuation<",
            "-",
            "La1/d;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lgk/Continuation<",
            "-",
            "La1/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, La1/b$a;->c:Lok/p;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(La1/d;Lgk/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La1/d;",
            "Lgk/Continuation<",
            "-",
            "La1/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, La1/b$a;->create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;

    move-result-object p1

    check-cast p1, La1/b$a;

    sget-object p2, Lck/v;->a:Lck/v;

    invoke-virtual {p1, p2}, La1/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    new-instance v0, La1/b$a;

    iget-object v1, p0, La1/b$a;->c:Lok/p;

    invoke-direct {v0, v1, p2}, La1/b$a;-><init>(Lok/p;Lgk/Continuation;)V

    iput-object p1, v0, La1/b$a;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La1/d;

    check-cast p2, Lgk/Continuation;

    invoke-virtual {p0, p1, p2}, La1/b$a;->a(La1/d;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, La1/b$a;->a:I

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

    iget-object p1, p0, La1/b$a;->b:Ljava/lang/Object;

    check-cast p1, La1/d;

    iget-object v1, p0, La1/b$a;->c:Lok/p;

    iput v2, p0, La1/b$a;->a:I

    invoke-interface {v1, p1, p0}, Lok/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, La1/d;

    move-object v0, p1

    check-cast v0, La1/a;

    invoke-virtual {v0}, La1/a;->f()V

    return-object p1
.end method
