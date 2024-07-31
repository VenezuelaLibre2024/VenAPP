.class final Lff/g$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lff/g;-><init>(Lx0/f;)V
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
        "Lck/v;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.google.firebase.sessions.settings.SettingsCache$1"
    f = "SettingsCache.kt"
    l = {
        0x2e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:I

.field final synthetic c:Lff/g;


# direct methods
.method constructor <init>(Lff/g;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lff/g;",
            "Lgk/Continuation<",
            "-",
            "Lff/g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lff/g$a;->c:Lff/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;
    .locals 1
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

    new-instance p1, Lff/g$a;

    iget-object v0, p0, Lff/g$a;->c:Lff/g;

    invoke-direct {p1, v0, p2}, Lff/g$a;-><init>(Lff/g;Lgk/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzk/k0;

    check-cast p2, Lgk/Continuation;

    invoke-virtual {p0, p1, p2}, Lff/g$a;->invoke(Lzk/k0;Lgk/Continuation;)Ljava/lang/Object;

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
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lff/g$a;->create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;

    move-result-object p1

    check-cast p1, Lff/g$a;

    sget-object p2, Lck/v;->a:Lck/v;

    invoke-virtual {p1, p2}, Lff/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lff/g$a;->b:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lff/g$a;->a:Ljava/lang/Object;

    check-cast v0, Lff/g;

    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lff/g$a;->c:Lff/g;

    invoke-static {p1}, Lff/g;->a(Lff/g;)Lx0/f;

    move-result-object v1

    invoke-interface {v1}, Lx0/f;->getData()Lcl/b;

    move-result-object v1

    iput-object p1, p0, Lff/g$a;->a:Ljava/lang/Object;

    iput v2, p0, Lff/g$a;->b:I

    invoke-static {v1, p0}, Lcl/d;->f(Lcl/b;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    check-cast p1, La1/d;

    invoke-virtual {p1}, La1/d;->d()La1/d;

    move-result-object p1

    invoke-static {v0, p1}, Lff/g;->c(Lff/g;La1/d;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
