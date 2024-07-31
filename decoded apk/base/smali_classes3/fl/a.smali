.class public final Lfl/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method private static final a(Lgk/Continuation;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    sget-object v0, Lck/n;->b:Lck/n$a;

    invoke-static {p1}, Lck/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lck/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0, v0}, Lgk/Continuation;->resumeWith(Ljava/lang/Object;)V

    throw p1
.end method

.method public static final b(Lgk/Continuation;Lgk/Continuation;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgk/Continuation<",
            "-",
            "Lck/v;",
            ">;",
            "Lgk/Continuation<",
            "*>;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0}, Lhk/b;->b(Lgk/Continuation;)Lgk/Continuation;

    move-result-object p0

    sget-object v0, Lck/n;->b:Lck/n$a;

    sget-object v0, Lck/v;->a:Lck/v;

    invoke-static {v0}, Lck/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p0, v0, v2, v1, v2}, Lel/k;->c(Lgk/Continuation;Ljava/lang/Object;Lok/l;ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p1, p0}, Lfl/a;->a(Lgk/Continuation;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static final c(Lok/p;Ljava/lang/Object;Lgk/Continuation;Lok/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lok/p<",
            "-TR;-",
            "Lgk/Continuation<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Lgk/Continuation<",
            "-TT;>;",
            "Lok/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lck/v;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    invoke-static {p0, p1, p2}, Lhk/b;->a(Lok/p;Ljava/lang/Object;Lgk/Continuation;)Lgk/Continuation;

    move-result-object p0

    invoke-static {p0}, Lhk/b;->b(Lgk/Continuation;)Lgk/Continuation;

    move-result-object p0

    sget-object p1, Lck/n;->b:Lck/n$a;

    sget-object p1, Lck/v;->a:Lck/v;

    invoke-static {p1}, Lck/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1, p3}, Lel/k;->b(Lgk/Continuation;Ljava/lang/Object;Lok/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p2, p0}, Lfl/a;->a(Lgk/Continuation;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static synthetic d(Lok/p;Ljava/lang/Object;Lgk/Continuation;Lok/l;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lfl/a;->c(Lok/p;Ljava/lang/Object;Lgk/Continuation;Lok/l;)V

    return-void
.end method
