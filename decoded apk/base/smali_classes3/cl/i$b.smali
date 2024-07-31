.class final Lcl/i$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcl/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcl/i;->a(Lcl/b;Lok/p;)Lcl/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcl/c;"
    }
.end annotation


# instance fields
.field final synthetic a:Lkotlin/jvm/internal/v;

.field final synthetic b:Lcl/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcl/c<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic c:Lok/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lok/p<",
            "TT;",
            "Lgk/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lkotlin/jvm/internal/v;Lcl/c;Lok/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/v;",
            "Lcl/c<",
            "-TT;>;",
            "Lok/p<",
            "-TT;-",
            "Lgk/Continuation<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcl/i$b;->a:Lkotlin/jvm/internal/v;

    iput-object p2, p0, Lcl/i$b;->b:Lcl/c;

    iput-object p3, p0, Lcl/i$b;->c:Lok/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;
    .locals 6
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

    instance-of v0, p2, Lcl/i$b$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcl/i$b$a;

    iget v1, v0, Lcl/i$b$a;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcl/i$b$a;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcl/i$b$a;

    invoke-direct {v0, p0, p2}, Lcl/i$b$a;-><init>(Lcl/i$b;Lgk/Continuation;)V

    :goto_0
    iget-object p2, v0, Lcl/i$b$a;->c:Ljava/lang/Object;

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcl/i$b$a;->e:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lck/o;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcl/i$b$a;->b:Ljava/lang/Object;

    iget-object v2, v0, Lcl/i$b$a;->a:Ljava/lang/Object;

    check-cast v2, Lcl/i$b;

    invoke-static {p2}, Lck/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lck/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lck/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lcl/i$b;->a:Lkotlin/jvm/internal/v;

    iget-boolean p2, p2, Lkotlin/jvm/internal/v;->a:Z

    if-eqz p2, :cond_6

    iget-object p2, p0, Lcl/i$b;->b:Lcl/c;

    iput v5, v0, Lcl/i$b$a;->e:I

    invoke-interface {p2, p1, v0}, Lcl/c;->emit(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_1
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1

    :cond_6
    iget-object p2, p0, Lcl/i$b;->c:Lok/p;

    iput-object p0, v0, Lcl/i$b$a;->a:Ljava/lang/Object;

    iput-object p1, v0, Lcl/i$b$a;->b:Ljava/lang/Object;

    iput v4, v0, Lcl/i$b$a;->e:I

    invoke-interface {p2, p1, v0}, Lok/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    return-object v1

    :cond_7
    move-object v2, p0

    :goto_2
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_9

    iget-object p2, v2, Lcl/i$b;->a:Lkotlin/jvm/internal/v;

    iput-boolean v5, p2, Lkotlin/jvm/internal/v;->a:Z

    iget-object p2, v2, Lcl/i$b;->b:Lcl/c;

    const/4 v2, 0x0

    iput-object v2, v0, Lcl/i$b$a;->a:Ljava/lang/Object;

    iput-object v2, v0, Lcl/i$b$a;->b:Ljava/lang/Object;

    iput v3, v0, Lcl/i$b$a;->e:I

    invoke-interface {p2, p1, v0}, Lcl/c;->emit(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    return-object v1

    :cond_8
    :goto_3
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1

    :cond_9
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
