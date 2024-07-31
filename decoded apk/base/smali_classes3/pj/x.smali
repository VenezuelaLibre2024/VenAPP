.class public final Lpj/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/x$a;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/Object;Ljj/e;)Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "U:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TU;>;>;)",
            "Ldj/f<",
            "TU;>;"
        }
    .end annotation

    new-instance v0, Lpj/x$a;

    invoke-direct {v0, p0, p1}, Lpj/x$a;-><init>(Ljava/lang/Object;Ljj/e;)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object p0

    return-object p0
.end method

.method public static b(Lim/a;Lim/b;Ljj/e;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Lim/a<",
            "TT;>;",
            "Lim/b<",
            "-TR;>;",
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TR;>;>;)Z"
        }
    .end annotation

    instance-of v0, p0, Ljava/util/concurrent/Callable;

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    :try_start_0
    check-cast p0, Ljava/util/concurrent/Callable;

    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p0, :cond_0

    invoke-static {p1}, Lwj/d;->b(Lim/b;)V

    return v0

    :cond_0
    :try_start_1
    invoke-interface {p2, p0}, Ljj/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const-string p2, "The mapper returned a null Publisher"

    invoke-static {p0, p2}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lim/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    instance-of p2, p0, Ljava/util/concurrent/Callable;

    if-eqz p2, :cond_2

    :try_start_2
    check-cast p0, Ljava/util/concurrent/Callable;

    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez p0, :cond_1

    invoke-static {p1}, Lwj/d;->b(Lim/b;)V

    return v0

    :cond_1
    new-instance p2, Lwj/e;

    invoke-direct {p2, p1, p0}, Lwj/e;-><init>(Lim/b;Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Lim/b;->d(Lim/c;)V

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {p0, p1}, Lwj/d;->h(Ljava/lang/Throwable;Lim/b;)V

    return v0

    :cond_2
    invoke-interface {p0, p1}, Lim/a;->a(Lim/b;)V

    :goto_0
    return v0

    :cond_3
    const/4 p0, 0x0

    return p0
.end method
