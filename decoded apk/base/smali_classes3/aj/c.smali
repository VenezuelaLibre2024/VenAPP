.class public final Laj/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Laj/c$d;,
        Laj/c$e;,
        Laj/c$b;,
        Laj/c$f;,
        Laj/c$c;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/logging/Logger;

.field static b:Z

.field static final c:Lvi/c$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/c$c<",
            "Laj/c$d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, Laj/c;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Laj/c;->a:Ljava/util/logging/Logger;

    const-string v0, "GRPC_CLIENT_CALL_REJECT_RUNNABLE"

    invoke-static {v0}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Leb/u;->b(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sput-boolean v0, Laj/c;->b:Z

    const-string v0, "internal-stub-type"

    invoke-static {v0}, Lvi/c$c;->b(Ljava/lang/String;)Lvi/c$c;

    move-result-object v0

    sput-object v0, Laj/c;->c:Lvi/c$c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static a(Lvi/g;Ljava/lang/Object;Laj/c$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Lvi/g<",
            "TReqT;TRespT;>;TReqT;",
            "Laj/c$c<",
            "TRespT;>;)V"
        }
    .end annotation

    invoke-static {p0, p2}, Laj/c;->f(Lvi/g;Laj/c$c;)V

    :try_start_0
    invoke-virtual {p0, p1}, Lvi/g;->d(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lvi/g;->b()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    invoke-static {p0, p1}, Laj/c;->c(Lvi/g;Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p1

    invoke-static {p0, p1}, Laj/c;->c(Lvi/g;Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method public static b(Lvi/d;Lvi/x0;Lvi/c;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Lvi/d;",
            "Lvi/x0<",
            "TReqT;TRespT;>;",
            "Lvi/c;",
            "TReqT;)TRespT;"
        }
    .end annotation

    new-instance v0, Laj/c$e;

    invoke-direct {v0}, Laj/c$e;-><init>()V

    sget-object v1, Laj/c;->c:Lvi/c$c;

    sget-object v2, Laj/c$d;->BLOCKING:Laj/c$d;

    invoke-virtual {p2, v1, v2}, Lvi/c;->q(Lvi/c$c;Ljava/lang/Object;)Lvi/c;

    move-result-object p2

    invoke-virtual {p2, v0}, Lvi/c;->n(Ljava/util/concurrent/Executor;)Lvi/c;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lvi/d;->h(Lvi/x0;Lvi/c;)Lvi/g;

    move-result-object p0

    const/4 p1, 0x0

    :try_start_0
    invoke-static {p0, p3}, Laj/c;->d(Lvi/g;Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/concurrent/Future;->isDone()Z

    move-result p3
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/Error; {:try_start_0 .. :try_end_0} :catch_3
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez p3, :cond_0

    :try_start_1
    invoke-virtual {v0}, Laj/c$e;->f()V
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/Error; {:try_start_1 .. :try_end_1} :catch_3
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catch_0
    move-exception p1

    const/4 p3, 0x1

    :try_start_2
    const-string v1, "Thread interrupted"

    invoke-virtual {p0, v1, p1}, Lvi/g;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/Error; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move p1, p3

    goto :goto_0

    :catchall_0
    move-exception p0

    move p1, p3

    goto :goto_3

    :catch_1
    move-exception p2

    move p1, p3

    goto :goto_1

    :catch_2
    move-exception p2

    move p1, p3

    goto :goto_2

    :cond_0
    :try_start_3
    invoke-virtual {v0}, Laj/c$e;->shutdown()V

    invoke-static {p2}, Laj/c;->e(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    move-result-object p0
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/Error; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz p1, :cond_1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_1
    return-object p0

    :catchall_1
    move-exception p0

    goto :goto_3

    :catch_3
    move-exception p2

    :goto_1
    :try_start_4
    invoke-static {p0, p2}, Laj/c;->c(Lvi/g;Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :catch_4
    move-exception p2

    :goto_2
    invoke-static {p0, p2}, Laj/c;->c(Lvi/g;Ljava/lang/Throwable;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_3
    if-eqz p1, :cond_2

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :cond_2
    throw p0
.end method

.method private static c(Lvi/g;Ljava/lang/Throwable;)Ljava/lang/RuntimeException;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/g<",
            "**>;",
            "Ljava/lang/Throwable;",
            ")",
            "Ljava/lang/RuntimeException;"
        }
    .end annotation

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0, v0, p1}, Lvi/g;->a(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    sget-object v0, Laj/c;->a:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->SEVERE:Ljava/util/logging/Level;

    const-string v2, "RuntimeException encountered while closing call"

    invoke-virtual {v0, v1, v2, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    instance-of p0, p1, Ljava/lang/RuntimeException;

    if-nez p0, :cond_1

    instance-of p0, p1, Ljava/lang/Error;

    if-eqz p0, :cond_0

    check-cast p1, Ljava/lang/Error;

    throw p1

    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_1
    check-cast p1, Ljava/lang/RuntimeException;

    throw p1
.end method

.method public static d(Lvi/g;Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Lvi/g<",
            "TReqT;TRespT;>;TReqT;)",
            "Lcom/google/common/util/concurrent/f<",
            "TRespT;>;"
        }
    .end annotation

    new-instance v0, Laj/c$b;

    invoke-direct {v0, p0}, Laj/c$b;-><init>(Lvi/g;)V

    new-instance v1, Laj/c$f;

    invoke-direct {v1, v0}, Laj/c$f;-><init>(Laj/c$b;)V

    invoke-static {p0, p1, v1}, Laj/c;->a(Lvi/g;Ljava/lang/Object;Laj/c$c;)V

    return-object v0
.end method

.method private static e(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Future<",
            "TV;>;)TV;"
        }
    .end annotation

    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    invoke-static {p0}, Laj/c;->g(Ljava/lang/Throwable;)Lvi/i1;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    sget-object v0, Lvi/g1;->g:Lvi/g1;

    const-string v1, "Thread interrupted"

    invoke-virtual {v0, v1}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvi/g1;->q(Ljava/lang/Throwable;)Lvi/g1;

    move-result-object p0

    invoke-virtual {p0}, Lvi/g1;->d()Lvi/i1;

    move-result-object p0

    throw p0
.end method

.method private static f(Lvi/g;Laj/c$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ReqT:",
            "Ljava/lang/Object;",
            "RespT:",
            "Ljava/lang/Object;",
            ">(",
            "Lvi/g<",
            "TReqT;TRespT;>;",
            "Laj/c$c<",
            "TRespT;>;)V"
        }
    .end annotation

    new-instance v0, Lvi/w0;

    invoke-direct {v0}, Lvi/w0;-><init>()V

    invoke-virtual {p0, p1, v0}, Lvi/g;->e(Lvi/g$a;Lvi/w0;)V

    invoke-virtual {p1}, Laj/c$c;->e()V

    return-void
.end method

.method private static g(Ljava/lang/Throwable;)Lvi/i1;
    .locals 2

    const-string v0, "t"

    invoke-static {p0, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    :goto_0
    if-eqz v0, :cond_2

    instance-of v1, v0, Lvi/h1;

    if-eqz v1, :cond_0

    check-cast v0, Lvi/h1;

    new-instance p0, Lvi/i1;

    invoke-virtual {v0}, Lvi/h1;->a()Lvi/g1;

    move-result-object v1

    invoke-virtual {v0}, Lvi/h1;->b()Lvi/w0;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lvi/i1;-><init>(Lvi/g1;Lvi/w0;)V

    return-object p0

    :cond_0
    instance-of v1, v0, Lvi/i1;

    if-eqz v1, :cond_1

    check-cast v0, Lvi/i1;

    new-instance p0, Lvi/i1;

    invoke-virtual {v0}, Lvi/i1;->a()Lvi/g1;

    move-result-object v1

    invoke-virtual {v0}, Lvi/i1;->b()Lvi/w0;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lvi/i1;-><init>(Lvi/g1;Lvi/w0;)V

    return-object p0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    goto :goto_0

    :cond_2
    sget-object v0, Lvi/g1;->h:Lvi/g1;

    const-string v1, "unexpected exception"

    invoke-virtual {v0, v1}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v0

    invoke-virtual {v0, p0}, Lvi/g1;->q(Ljava/lang/Throwable;)Lvi/g1;

    move-result-object p0

    invoke-virtual {p0}, Lvi/g1;->d()Lvi/i1;

    move-result-object p0

    return-object p0
.end method
