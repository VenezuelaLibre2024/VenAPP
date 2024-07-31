.class public final Lel/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lel/h0;

.field public static final b:Lel/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lel/h0;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lel/k;->a:Lel/h0;

    new-instance v0, Lel/h0;

    const-string v1, "REUSABLE_CLAIMED"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lel/k;->b:Lel/h0;

    return-void
.end method

.method public static final synthetic a()Lel/h0;
    .locals 1

    sget-object v0, Lel/k;->a:Lel/h0;

    return-object v0
.end method

.method public static final b(Lgk/Continuation;Ljava/lang/Object;Lok/l;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lgk/Continuation<",
            "-TT;>;",
            "Ljava/lang/Object;",
            "Lok/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    instance-of v0, p0, Lel/j;

    if-eqz v0, :cond_8

    check-cast p0, Lel/j;

    invoke-static {p1, p2}, Lzk/e0;->b(Ljava/lang/Object;Lok/l;)Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, Lel/j;->d:Lzk/h0;

    invoke-virtual {p0}, Lel/j;->getContext()Lgk/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lzk/h0;->F0(Lgk/f;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-object p2, p0, Lel/j;->f:Ljava/lang/Object;

    iput v1, p0, Lzk/x0;->c:I

    iget-object p1, p0, Lel/j;->d:Lzk/h0;

    invoke-virtual {p0}, Lel/j;->getContext()Lgk/f;

    move-result-object p2

    invoke-virtual {p1, p2, p0}, Lzk/h0;->D0(Lgk/f;Ljava/lang/Runnable;)V

    goto/16 :goto_4

    :cond_0
    sget-object v0, Lzk/s2;->a:Lzk/s2;

    invoke-virtual {v0}, Lzk/s2;->b()Lzk/g1;

    move-result-object v0

    invoke-virtual {v0}, Lzk/g1;->a1()Z

    move-result v2

    if-eqz v2, :cond_1

    iput-object p2, p0, Lel/j;->f:Ljava/lang/Object;

    iput v1, p0, Lzk/x0;->c:I

    invoke-virtual {v0, p0}, Lzk/g1;->R0(Lzk/x0;)V

    goto/16 :goto_4

    :cond_1
    invoke-virtual {v0, v1}, Lzk/g1;->W0(Z)V

    const/4 v2, 0x0

    :try_start_0
    invoke-virtual {p0}, Lel/j;->getContext()Lgk/f;

    move-result-object v3

    sget-object v4, Lzk/w1;->q:Lzk/w1$b;

    invoke-interface {v3, v4}, Lgk/f;->b(Lgk/f$c;)Lgk/f$b;

    move-result-object v3

    check-cast v3, Lzk/w1;

    if-eqz v3, :cond_2

    invoke-interface {v3}, Lzk/w1;->a()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v3}, Lzk/w1;->n()Ljava/util/concurrent/CancellationException;

    move-result-object v3

    invoke-virtual {p0, p2, v3}, Lel/j;->a(Ljava/lang/Object;Ljava/lang/Throwable;)V

    sget-object p2, Lck/n;->b:Lck/n$a;

    invoke-static {v3}, Lck/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lck/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-interface {p0, p2}, Lgk/Continuation;->resumeWith(Ljava/lang/Object;)V

    move p2, v1

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_7

    iget-object p2, p0, Lel/j;->e:Lgk/Continuation;

    iget-object v3, p0, Lel/j;->r:Ljava/lang/Object;

    invoke-interface {p2}, Lgk/Continuation;->getContext()Lgk/f;

    move-result-object v4

    invoke-static {v4, v3}, Lel/l0;->c(Lgk/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lel/l0;->a:Lel/h0;

    if-eq v3, v5, :cond_3

    invoke-static {p2, v4, v3}, Lzk/g0;->g(Lgk/Continuation;Lgk/f;Ljava/lang/Object;)Lzk/z2;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    goto :goto_1

    :cond_3
    move-object p2, v2

    :goto_1
    :try_start_1
    iget-object v5, p0, Lel/j;->e:Lgk/Continuation;

    invoke-interface {v5, p1}, Lgk/Continuation;->resumeWith(Ljava/lang/Object;)V

    sget-object p1, Lck/v;->a:Lck/v;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz p2, :cond_4

    :try_start_2
    invoke-virtual {p2}, Lzk/z2;->R0()Z

    move-result p1

    if-eqz p1, :cond_7

    :cond_4
    invoke-static {v4, v3}, Lel/l0;->a(Lgk/f;Ljava/lang/Object;)V

    goto :goto_2

    :catchall_0
    move-exception p1

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lzk/z2;->R0()Z

    move-result p2

    if-eqz p2, :cond_6

    :cond_5
    invoke-static {v4, v3}, Lel/l0;->a(Lgk/f;Ljava/lang/Object;)V

    :cond_6
    throw p1

    :cond_7
    :goto_2
    invoke-virtual {v0}, Lzk/g1;->j1()Z

    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-nez p1, :cond_7

    goto :goto_3

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {p0, p1, v2}, Lzk/x0;->h(Ljava/lang/Throwable;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :goto_3
    invoke-virtual {v0, v1}, Lzk/g1;->I0(Z)V

    goto :goto_4

    :catchall_2
    move-exception p0

    invoke-virtual {v0, v1}, Lzk/g1;->I0(Z)V

    throw p0

    :cond_8
    invoke-interface {p0, p1}, Lgk/Continuation;->resumeWith(Ljava/lang/Object;)V

    :goto_4
    return-void
.end method

.method public static synthetic c(Lgk/Continuation;Ljava/lang/Object;Lok/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-static {p0, p1, p2}, Lel/k;->b(Lgk/Continuation;Ljava/lang/Object;Lok/l;)V

    return-void
.end method
