.class public final Lej/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static volatile a:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "Ljava/util/concurrent/Callable<",
            "Ldj/r;",
            ">;",
            "Ldj/r;",
            ">;"
        }
    .end annotation
.end field

.field private static volatile b:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "Ldj/r;",
            "Ldj/r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static a(Ljj/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "TT;TR;>;TT;)TR;"
        }
    .end annotation

    :try_start_0
    invoke-interface {p0, p1}, Ljj/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lhj/b;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method static b(Ljj/e;Ljava/util/concurrent/Callable;)Ldj/r;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/e<",
            "Ljava/util/concurrent/Callable<",
            "Ldj/r;",
            ">;",
            "Ldj/r;",
            ">;",
            "Ljava/util/concurrent/Callable<",
            "Ldj/r;",
            ">;)",
            "Ldj/r;"
        }
    .end annotation

    invoke-static {p0, p1}, Lej/a;->a(Ljj/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldj/r;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "Scheduler Callable returned null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static c(Ljava/util/concurrent/Callable;)Ldj/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "Ldj/r;",
            ">;)",
            "Ldj/r;"
        }
    .end annotation

    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldj/r;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "Scheduler Callable returned null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lhj/b;->a(Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method public static d(Ljava/util/concurrent/Callable;)Ldj/r;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "Ldj/r;",
            ">;)",
            "Ldj/r;"
        }
    .end annotation

    if-eqz p0, :cond_1

    sget-object v0, Lej/a;->a:Ljj/e;

    if-nez v0, :cond_0

    invoke-static {p0}, Lej/a;->c(Ljava/util/concurrent/Callable;)Ldj/r;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Lej/a;->b(Ljj/e;Ljava/util/concurrent/Callable;)Ldj/r;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "scheduler == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static e(Ldj/r;)Ldj/r;
    .locals 1

    if-eqz p0, :cond_1

    sget-object v0, Lej/a;->b:Ljj/e;

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    invoke-static {v0, p0}, Lej/a;->a(Ljj/e;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ldj/r;

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "scheduler == null"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
