.class final Ldf/x$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lok/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf/x;-><init>(Landroid/content/Context;Lgk/f;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lok/q<",
        "Lcl/c<",
        "-",
        "La1/d;",
        ">;",
        "Ljava/lang/Throwable;",
        "Lgk/Continuation<",
        "-",
        "Lck/v;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1"
    f = "SessionDatastore.kt"
    l = {
        0x49
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field a:I

.field private synthetic b:Ljava/lang/Object;

.field synthetic c:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lgk/Continuation;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "-",
            "Ldf/x$d;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-direct {p0, v0, p1}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lcl/c;Ljava/lang/Throwable;Lgk/Continuation;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcl/c<",
            "-",
            "La1/d;",
            ">;",
            "Ljava/lang/Throwable;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ldf/x$d;

    invoke-direct {v0, p3}, Ldf/x$d;-><init>(Lgk/Continuation;)V

    iput-object p1, v0, Ldf/x$d;->b:Ljava/lang/Object;

    iput-object p2, v0, Ldf/x$d;->c:Ljava/lang/Object;

    sget-object p1, Lck/v;->a:Lck/v;

    invoke-virtual {v0, p1}, Ldf/x$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ldf/x$d;->a:I

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

    iget-object p1, p0, Ldf/x$d;->b:Ljava/lang/Object;

    check-cast p1, Lcl/c;

    iget-object v1, p0, Ldf/x$d;->c:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Throwable;

    const-string v3, "FirebaseSessionsRepo"

    const-string v4, "Error reading stored session data."

    invoke-static {v3, v4, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {}, La1/e;->a()La1/d;

    move-result-object v1

    const/4 v3, 0x0

    iput-object v3, p0, Ldf/x$d;->b:Ljava/lang/Object;

    iput v2, p0, Ldf/x$d;->a:I

    invoke-interface {p1, v1, p0}, Lcl/c;->emit(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method

.method public bridge synthetic m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcl/c;

    check-cast p2, Ljava/lang/Throwable;

    check-cast p3, Lgk/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Ldf/x$d;->a(Lcl/c;Ljava/lang/Throwable;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
