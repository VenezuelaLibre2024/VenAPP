.class final Ldk/s0$a;
.super Lkotlin/coroutines/jvm/internal/k;
.source "SourceFile"

# interfaces
.implements Lok/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldk/s0;->b(Ljava/util/Iterator;IIZZ)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/k;",
        "Lok/p<",
        "Lwk/f<",
        "-",
        "Ljava/util/List<",
        "+TT;>;>;",
        "Lgk/Continuation<",
        "-",
        "Lck/v;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "kotlin.collections.SlidingWindowKt$windowedIterator$1"
    f = "SlidingWindow.kt"
    l = {
        0x22,
        0x28,
        0x31,
        0x37,
        0x3a
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field b:Ljava/lang/Object;

.field c:Ljava/lang/Object;

.field d:I

.field e:I

.field private synthetic f:Ljava/lang/Object;

.field final synthetic r:I

.field final synthetic s:I

.field final synthetic t:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation
.end field

.field final synthetic u:Z

.field final synthetic v:Z


# direct methods
.method constructor <init>(IILjava/util/Iterator;ZZLgk/Continuation;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Iterator<",
            "+TT;>;ZZ",
            "Lgk/Continuation<",
            "-",
            "Ldk/s0$a;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, Ldk/s0$a;->r:I

    iput p2, p0, Ldk/s0$a;->s:I

    iput-object p3, p0, Ldk/s0$a;->t:Ljava/util/Iterator;

    iput-boolean p4, p0, Ldk/s0$a;->u:Z

    iput-boolean p5, p0, Ldk/s0$a;->v:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lkotlin/coroutines/jvm/internal/k;-><init>(ILgk/Continuation;)V

    return-void
.end method


# virtual methods
.method public final a(Lwk/f;Lgk/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwk/f<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Ldk/s0$a;->create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;

    move-result-object p1

    check-cast p1, Ldk/s0$a;

    sget-object p2, Lck/v;->a:Lck/v;

    invoke-virtual {p1, p2}, Ldk/s0$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final create(Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;
    .locals 8
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

    new-instance v7, Ldk/s0$a;

    iget v1, p0, Ldk/s0$a;->r:I

    iget v2, p0, Ldk/s0$a;->s:I

    iget-object v3, p0, Ldk/s0$a;->t:Ljava/util/Iterator;

    iget-boolean v4, p0, Ldk/s0$a;->u:Z

    iget-boolean v5, p0, Ldk/s0$a;->v:Z

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ldk/s0$a;-><init>(IILjava/util/Iterator;ZZLgk/Continuation;)V

    iput-object p1, v7, Ldk/s0$a;->f:Ljava/lang/Object;

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lwk/f;

    check-cast p2, Lgk/Continuation;

    invoke-virtual {p0, p1, p2}, Ldk/s0$a;->a(Lwk/f;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lhk/b;->c()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ldk/s0$a;->e:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v1, :cond_6

    if-eq v1, v6, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Ldk/s0$a;->b:Ljava/lang/Object;

    check-cast v1, Ldk/n0;

    iget-object v4, p0, Ldk/s0$a;->f:Ljava/lang/Object;

    check-cast v4, Lwk/f;

    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    move-object p1, p0

    goto/16 :goto_9

    :cond_2
    iget-object v1, p0, Ldk/s0$a;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    iget-object v5, p0, Ldk/s0$a;->b:Ljava/lang/Object;

    check-cast v5, Ldk/n0;

    iget-object v8, p0, Ldk/s0$a;->f:Ljava/lang/Object;

    check-cast v8, Lwk/f;

    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    move-object p1, p0

    goto/16 :goto_6

    :cond_3
    :goto_0
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_4
    iget v1, p0, Ldk/s0$a;->d:I

    iget-object v2, p0, Ldk/s0$a;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v3, p0, Ldk/s0$a;->b:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    iget-object v4, p0, Ldk/s0$a;->f:Ljava/lang/Object;

    check-cast v4, Lwk/f;

    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    move-object v8, p0

    :cond_5
    move p1, v1

    goto :goto_2

    :cond_6
    invoke-static {p1}, Lck/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ldk/s0$a;->f:Ljava/lang/Object;

    check-cast p1, Lwk/f;

    iget v1, p0, Ldk/s0$a;->r:I

    const/16 v8, 0x400

    invoke-static {v1, v8}, Luk/j;->d(II)I

    move-result v1

    iget v8, p0, Ldk/s0$a;->s:I

    iget v9, p0, Ldk/s0$a;->r:I

    sub-int/2addr v8, v9

    if-ltz v8, :cond_c

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, Ldk/s0$a;->t:Ljava/util/Iterator;

    const/4 v3, 0x0

    move-object v4, p1

    move p1, v3

    move-object v3, v2

    move-object v2, v1

    move v1, v8

    move-object v8, p0

    :cond_7
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    if-lez p1, :cond_8

    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_8
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v9

    iget v10, v8, Ldk/s0$a;->r:I

    if-ne v9, v10, :cond_7

    iput-object v4, v8, Ldk/s0$a;->f:Ljava/lang/Object;

    iput-object v3, v8, Ldk/s0$a;->b:Ljava/lang/Object;

    iput-object v2, v8, Ldk/s0$a;->c:Ljava/lang/Object;

    iput v1, v8, Ldk/s0$a;->d:I

    iput v6, v8, Ldk/s0$a;->e:I

    invoke-virtual {v4, v3, v8}, Lwk/f;->a(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :goto_2
    iget-boolean v1, v8, Ldk/s0$a;->u:Z

    if-eqz v1, :cond_9

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    goto :goto_3

    :cond_9
    new-instance v1, Ljava/util/ArrayList;

    iget v3, v8, Ldk/s0$a;->r:I

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object v3, v1

    :goto_3
    move v1, p1

    goto :goto_1

    :cond_a
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v6

    if-eqz p1, :cond_15

    iget-boolean p1, v8, Ldk/s0$a;->v:Z

    if-nez p1, :cond_b

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result p1

    iget v1, v8, Ldk/s0$a;->r:I

    if-ne p1, v1, :cond_15

    :cond_b
    iput-object v7, v8, Ldk/s0$a;->f:Ljava/lang/Object;

    iput-object v7, v8, Ldk/s0$a;->b:Ljava/lang/Object;

    iput-object v7, v8, Ldk/s0$a;->c:Ljava/lang/Object;

    iput v5, v8, Ldk/s0$a;->e:I

    invoke-virtual {v4, v3, v8}, Lwk/f;->a(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_15

    return-object v0

    :cond_c
    new-instance v5, Ldk/n0;

    invoke-direct {v5, v1}, Ldk/n0;-><init>(I)V

    iget-object v1, p0, Ldk/s0$a;->t:Ljava/util/Iterator;

    move-object v8, p1

    move-object p1, p0

    :cond_d
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v5, v9}, Ldk/n0;->l(Ljava/lang/Object;)V

    invoke-virtual {v5}, Ldk/n0;->n()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-virtual {v5}, Ldk/a;->size()I

    move-result v9

    iget v10, p1, Ldk/s0$a;->r:I

    if-ge v9, v10, :cond_e

    invoke-virtual {v5, v10}, Ldk/n0;->m(I)Ldk/n0;

    move-result-object v5

    goto :goto_4

    :cond_e
    iget-boolean v9, p1, Ldk/s0$a;->u:Z

    if-eqz v9, :cond_f

    move-object v9, v5

    goto :goto_5

    :cond_f
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_5
    iput-object v8, p1, Ldk/s0$a;->f:Ljava/lang/Object;

    iput-object v5, p1, Ldk/s0$a;->b:Ljava/lang/Object;

    iput-object v1, p1, Ldk/s0$a;->c:Ljava/lang/Object;

    iput v4, p1, Ldk/s0$a;->e:I

    invoke-virtual {v8, v9, p1}, Lwk/f;->a(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v0, :cond_10

    return-object v0

    :cond_10
    :goto_6
    iget v9, p1, Ldk/s0$a;->s:I

    invoke-virtual {v5, v9}, Ldk/n0;->o(I)V

    goto :goto_4

    :cond_11
    iget-boolean v1, p1, Ldk/s0$a;->v:Z

    if-eqz v1, :cond_15

    move-object v1, v5

    move-object v4, v8

    :goto_7
    invoke-virtual {v1}, Ldk/a;->size()I

    move-result v5

    iget v8, p1, Ldk/s0$a;->s:I

    if-le v5, v8, :cond_14

    iget-boolean v5, p1, Ldk/s0$a;->u:Z

    if-eqz v5, :cond_12

    move-object v5, v1

    goto :goto_8

    :cond_12
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_8
    iput-object v4, p1, Ldk/s0$a;->f:Ljava/lang/Object;

    iput-object v1, p1, Ldk/s0$a;->b:Ljava/lang/Object;

    iput-object v7, p1, Ldk/s0$a;->c:Ljava/lang/Object;

    iput v3, p1, Ldk/s0$a;->e:I

    invoke-virtual {v4, v5, p1}, Lwk/f;->a(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_13

    return-object v0

    :cond_13
    :goto_9
    iget v5, p1, Ldk/s0$a;->s:I

    invoke-virtual {v1, v5}, Ldk/n0;->o(I)V

    goto :goto_7

    :cond_14
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v6

    if-eqz v3, :cond_15

    iput-object v7, p1, Ldk/s0$a;->f:Ljava/lang/Object;

    iput-object v7, p1, Ldk/s0$a;->b:Ljava/lang/Object;

    iput-object v7, p1, Ldk/s0$a;->c:Ljava/lang/Object;

    iput v2, p1, Ldk/s0$a;->e:I

    invoke-virtual {v4, v1, p1}, Lwk/f;->a(Ljava/lang/Object;Lgk/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_15

    return-object v0

    :cond_15
    :goto_a
    sget-object p1, Lck/v;->a:Lck/v;

    return-object p1
.end method
