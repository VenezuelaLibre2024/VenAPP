.class final Lff/g$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lff/g;->h(La1/d$a;Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lok/p<",
        "La1/a;",
        "Lgk/Continuation<",
        "-",
        "Lck/v;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2"
    f = "SettingsCache.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field a:I

.field synthetic b:Ljava/lang/Object;

.field final synthetic c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final synthetic d:La1/d$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La1/d$a<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic e:Lff/g;


# direct methods
.method constructor <init>(Ljava/lang/Object;La1/d$a;Lff/g;Lgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "La1/d$a<",
            "TT;>;",
            "Lff/g;",
            "Lgk/Continuation<",
            "-",
            "Lff/g$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lff/g$d;->c:Ljava/lang/Object;

    iput-object p2, p0, Lff/g$d;->d:La1/d$a;

    iput-object p3, p0, Lff/g$d;->e:Lff/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(La1/a;Lgk/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La1/a;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lff/g$d;->create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;

    move-result-object p1

    check-cast p1, Lff/g$d;

    sget-object p2, Lck/v;->a:Lck/v;

    invoke-virtual {p1, p2}, Lff/g$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;
    .locals 4
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

    new-instance v0, Lff/g$d;

    iget-object v1, p0, Lff/g$d;->c:Ljava/lang/Object;

    iget-object v2, p0, Lff/g$d;->d:La1/d$a;

    iget-object v3, p0, Lff/g$d;->e:Lff/g;

    invoke-direct {v0, v1, v2, v3, p2}, Lff/g$d;-><init>(Ljava/lang/Object;La1/d$a;Lff/g;Lgk/Continuation;)V

    iput-object p1, v0, Lff/g$d;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La1/a;

    check-cast p2, Lgk/Continuation;

    invoke-virtual {p0, p1, p2}, Lff/g$d;->a(La1/a;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    iget v0, p0, Lff/g$d;->a:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lff/g$d;->b:Ljava/lang/Object;

    check-cast p1, La1/a;

    iget-object v0, p0, Lff/g$d;->c:Ljava/lang/Object;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lff/g$d;->d:La1/d$a;

    invoke-virtual {p1, v1, v0}, La1/a;->i(La1/d$a;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lff/g$d;->d:La1/d$a;

    invoke-virtual {p1, v0}, La1/a;->h(La1/d$a;)Ljava/lang/Object;

    :goto_0
    iget-object v0, p0, Lff/g$d;->e:Lff/g;

    invoke-static {v0, p1}, Lff/g;->c(Lff/g;La1/d;)V

    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
