.class final Ldf/k$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf/k;-><init>(Lzb/g;Lff/f;Lgk/f;)V
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
    c = "com.google.firebase.sessions.FirebaseSessions$1"
    f = "FirebaseSessions.kt"
    l = {
        0x2c,
        0x30
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field a:I

.field final synthetic b:Ldf/k;

.field final synthetic c:Lgk/f;


# direct methods
.method constructor <init>(Ldf/k;Lgk/f;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf/k;",
            "Lgk/f;",
            "Lgk/Continuation<",
            "-",
            "Ldf/k$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldf/k$a;->b:Ldf/k;

    iput-object p2, p0, Ldf/k$a;->c:Lgk/f;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILgk/Continuation;)V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lzb/p;)V
    .locals 0

    invoke-static {p0, p1}, Ldf/k$a;->f(Ljava/lang/String;Lzb/p;)V

    return-void
.end method

.method private static final f(Ljava/lang/String;Lzb/p;)V
    .locals 0

    const-string p0, "FirebaseSessions"

    const-string p1, "FirebaseApp instance deleted. Sessions library will stop collecting data."

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p0, Ldf/i0;->a:Ldf/i0;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ldf/i0;->a(Ldf/f0;)V

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

    new-instance p1, Ldf/k$a;

    iget-object v0, p0, Ldf/k$a;->b:Ldf/k;

    iget-object v1, p0, Ldf/k$a;->c:Lgk/f;

    invoke-direct {p1, v0, v1, p2}, Ldf/k$a;-><init>(Ldf/k;Lgk/f;Lgk/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzk/k0;

    check-cast p2, Lgk/Continuation;

    invoke-virtual {p0, p1, p2}, Ldf/k$a;->invoke(Lzk/k0;Lgk/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Ldf/k$a;->create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;

    move-result-object p1

    check-cast p1, Ldf/k$a;

    sget-object p2, Lck/v;->a:Lck/v;

    invoke-virtual {p1, p2}, Ldf/k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ldf/k$a;->a:I

    const-string v2, "FirebaseSessions"

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    sget-object p1, Lef/a;->a:Lef/a;

    iput v4, p0, Ldf/k$a;->a:I

    invoke-virtual {p1, p0}, Lef/a;->c(Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v1, p1, Ljava/util/Collection;

    if-eqz v1, :cond_4

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lef/b;

    invoke-interface {v1}, Lef/b;->a()Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v4, 0x0

    :cond_6
    :goto_1
    if-eqz v4, :cond_7

    const-string p1, "No Sessions subscribers. Not listening to lifecycle events."

    goto :goto_3

    :cond_7
    iget-object p1, p0, Ldf/k$a;->b:Ldf/k;

    invoke-static {p1}, Ldf/k;->b(Ldf/k;)Lff/f;

    move-result-object p1

    iput v3, p0, Ldf/k$a;->a:I

    invoke-virtual {p1, p0}, Lff/f;->g(Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    return-object v0

    :cond_8
    :goto_2
    iget-object p1, p0, Ldf/k$a;->b:Ldf/k;

    invoke-static {p1}, Ldf/k;->b(Ldf/k;)Lff/f;

    move-result-object p1

    invoke-virtual {p1}, Lff/f;->d()Z

    move-result p1

    if-nez p1, :cond_9

    const-string p1, "Sessions SDK disabled. Not listening to lifecycle events."

    :goto_3
    invoke-static {v2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_4

    :cond_9
    new-instance p1, Ldf/f0;

    iget-object v0, p0, Ldf/k$a;->c:Lgk/f;

    invoke-direct {p1, v0}, Ldf/f0;-><init>(Lgk/f;)V

    invoke-virtual {p1}, Ldf/f0;->i()V

    sget-object v0, Ldf/i0;->a:Ldf/i0;

    invoke-virtual {v0, p1}, Ldf/i0;->a(Ldf/f0;)V

    iget-object p1, p0, Ldf/k$a;->b:Ldf/k;

    invoke-static {p1}, Ldf/k;->a(Ldf/k;)Lzb/g;

    move-result-object p1

    new-instance v0, Ldf/j;

    invoke-direct {v0}, Ldf/j;-><init>()V

    invoke-virtual {p1, v0}, Lzb/g;->h(Lzb/h;)V

    :goto_4
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
