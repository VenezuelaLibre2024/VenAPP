.class final Ldf/c0$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldf/c0;->a(Ldf/y;)V
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
    c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1"
    f = "SessionFirelogPublisher.kt"
    l = {
        0x40,
        0x48,
        0x49
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field a:Ljava/lang/Object;

.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:Ljava/lang/Object;

.field e:Ljava/lang/Object;

.field f:Ljava/lang/Object;

.field r:Ljava/lang/Object;

.field s:Ljava/lang/Object;

.field t:I

.field final synthetic u:Ldf/c0;

.field final synthetic v:Ldf/y;


# direct methods
.method constructor <init>(Ldf/c0;Ldf/y;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldf/c0;",
            "Ldf/y;",
            "Lgk/Continuation<",
            "-",
            "Ldf/c0$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldf/c0$c;->u:Ldf/c0;

    iput-object p2, p0, Ldf/c0$c;->v:Ldf/y;

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

    new-instance p1, Ldf/c0$c;

    iget-object v0, p0, Ldf/c0$c;->u:Ldf/c0;

    iget-object v1, p0, Ldf/c0$c;->v:Ldf/y;

    invoke-direct {p1, v0, v1, p2}, Ldf/c0$c;-><init>(Ldf/c0;Ldf/y;Lgk/Continuation;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lzk/k0;

    check-cast p2, Lgk/Continuation;

    invoke-virtual {p0, p1, p2}, Ldf/c0$c;->invoke(Lzk/k0;Lgk/Continuation;)Ljava/lang/Object;

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

    invoke-virtual {p0, p1, p2}, Ldf/c0$c;->create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;

    move-result-object p1

    check-cast p1, Ldf/c0$c;

    sget-object p2, Lck/v;->a:Lck/v;

    invoke-virtual {p1, p2}, Ldf/c0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ldf/c0$c;->t:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ldf/c0$c;->s:Ljava/lang/Object;

    check-cast v0, Ljava/util/Map;

    iget-object v1, p0, Ldf/c0$c;->r:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, p0, Ldf/c0$c;->f:Ljava/lang/Object;

    check-cast v2, Ldf/t;

    iget-object v3, p0, Ldf/c0$c;->e:Ljava/lang/Object;

    check-cast v3, Lff/f;

    iget-object v4, p0, Ldf/c0$c;->d:Ljava/lang/Object;

    check-cast v4, Ldf/y;

    iget-object v5, p0, Ldf/c0$c;->c:Ljava/lang/Object;

    check-cast v5, Lzb/g;

    iget-object v6, p0, Ldf/c0$c;->b:Ljava/lang/Object;

    check-cast v6, Ldf/a0;

    iget-object v7, p0, Ldf/c0$c;->a:Ljava/lang/Object;

    check-cast v7, Ldf/c0;

    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    move-object v8, v7

    move-object v11, v6

    move-object v6, v0

    move-object v0, v11

    move-object v12, v5

    move-object v5, v1

    move-object v1, v12

    move-object v13, v4

    move-object v4, v2

    move-object v2, v13

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Ldf/c0$c;->r:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v3, p0, Ldf/c0$c;->f:Ljava/lang/Object;

    check-cast v3, Ldf/t;

    iget-object v4, p0, Ldf/c0$c;->e:Ljava/lang/Object;

    check-cast v4, Lff/f;

    iget-object v5, p0, Ldf/c0$c;->d:Ljava/lang/Object;

    check-cast v5, Ldf/y;

    iget-object v6, p0, Ldf/c0$c;->c:Ljava/lang/Object;

    check-cast v6, Lzb/g;

    iget-object v7, p0, Ldf/c0$c;->b:Ljava/lang/Object;

    check-cast v7, Ldf/a0;

    iget-object v8, p0, Ldf/c0$c;->a:Ljava/lang/Object;

    check-cast v8, Ldf/c0;

    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_2
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ldf/c0$c;->u:Ldf/c0;

    iput v4, p0, Ldf/c0$c;->t:I

    invoke-static {p1, p0}, Ldf/c0;->f(Ldf/c0;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    return-object v0

    :cond_4
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_7

    iget-object p1, p0, Ldf/c0$c;->u:Ldf/c0;

    sget-object v1, Ldf/a0;->a:Ldf/a0;

    invoke-static {p1}, Ldf/c0;->c(Ldf/c0;)Lzb/g;

    move-result-object v4

    iget-object v5, p0, Ldf/c0$c;->v:Ldf/y;

    iget-object v6, p0, Ldf/c0$c;->u:Ldf/c0;

    invoke-static {v6}, Ldf/c0;->e(Ldf/c0;)Lff/f;

    move-result-object v6

    sget-object v7, Ldf/u;->a:Ldf/u;

    iget-object v8, p0, Ldf/c0$c;->u:Ldf/c0;

    invoke-static {v8}, Ldf/c0;->c(Ldf/c0;)Lzb/g;

    move-result-object v8

    invoke-virtual {v8}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v8

    const-string v9, "firebaseApp.applicationContext"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Ldf/u;->d(Landroid/content/Context;)Ldf/t;

    move-result-object v8

    iget-object v10, p0, Ldf/c0$c;->u:Ldf/c0;

    invoke-static {v10}, Ldf/c0;->c(Ldf/c0;)Lzb/g;

    move-result-object v10

    invoke-virtual {v10}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v7, v10}, Ldf/u;->c(Landroid/content/Context;)Ljava/util/List;

    move-result-object v7

    sget-object v9, Lef/a;->a:Lef/a;

    iput-object p1, p0, Ldf/c0$c;->a:Ljava/lang/Object;

    iput-object v1, p0, Ldf/c0$c;->b:Ljava/lang/Object;

    iput-object v4, p0, Ldf/c0$c;->c:Ljava/lang/Object;

    iput-object v5, p0, Ldf/c0$c;->d:Ljava/lang/Object;

    iput-object v6, p0, Ldf/c0$c;->e:Ljava/lang/Object;

    iput-object v8, p0, Ldf/c0$c;->f:Ljava/lang/Object;

    iput-object v7, p0, Ldf/c0$c;->r:Ljava/lang/Object;

    iput v3, p0, Ldf/c0$c;->t:I

    invoke-virtual {v9, p0}, Lef/a;->c(Lgk/Continuation;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_5

    return-object v0

    :cond_5
    move-object v11, v8

    move-object v8, p1

    move-object p1, v3

    move-object v3, v11

    move-object v12, v7

    move-object v7, v1

    move-object v1, v12

    move-object v13, v6

    move-object v6, v4

    move-object v4, v13

    :goto_1
    check-cast p1, Ljava/util/Map;

    iget-object v9, p0, Ldf/c0$c;->u:Ldf/c0;

    iput-object v8, p0, Ldf/c0$c;->a:Ljava/lang/Object;

    iput-object v7, p0, Ldf/c0$c;->b:Ljava/lang/Object;

    iput-object v6, p0, Ldf/c0$c;->c:Ljava/lang/Object;

    iput-object v5, p0, Ldf/c0$c;->d:Ljava/lang/Object;

    iput-object v4, p0, Ldf/c0$c;->e:Ljava/lang/Object;

    iput-object v3, p0, Ldf/c0$c;->f:Ljava/lang/Object;

    iput-object v1, p0, Ldf/c0$c;->r:Ljava/lang/Object;

    iput-object p1, p0, Ldf/c0$c;->s:Ljava/lang/Object;

    iput v2, p0, Ldf/c0$c;->t:I

    invoke-static {v9, p0}, Ldf/c0;->d(Ldf/c0;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_6

    return-object v0

    :cond_6
    move-object v0, v7

    move-object v11, v6

    move-object v6, p1

    move-object p1, v2

    move-object v2, v5

    move-object v5, v1

    move-object v1, v11

    move-object v12, v4

    move-object v4, v3

    move-object v3, v12

    :goto_2
    const-string v7, "getFirebaseInstallationId()"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v7, p1

    check-cast v7, Ljava/lang/String;

    invoke-virtual/range {v0 .. v7}, Ldf/a0;->a(Lzb/g;Ldf/y;Lff/f;Ldf/t;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;)Ldf/z;

    move-result-object p1

    invoke-static {v8, p1}, Ldf/c0;->b(Ldf/c0;Ldf/z;)V

    :cond_7
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
