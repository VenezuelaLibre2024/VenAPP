.class public abstract Ldj/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/u;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ldj/u<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static h(Ljava/lang/Object;)Ldj/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ldj/s<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "value is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lsj/c;

    invoke-direct {v0, p0}, Lsj/c;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lyj/a;->n(Ldj/s;)Ldj/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c(Ldj/t;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/t<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "subscriber is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0, p1}, Lyj/a;->w(Ldj/s;Ldj/t;)Ldj/t;

    move-result-object p1

    const-string v0, "subscriber returned by the RxJavaPlugins hook is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p0, p1}, Ldj/s;->k(Ldj/t;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "subscribeActual failed"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0

    :catch_0
    move-exception p1

    throw p1
.end method

.method public final e(Ljj/d;)Ldj/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ldj/s<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "onError is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lsj/a;

    invoke-direct {v0, p0, p1}, Lsj/a;-><init>(Ldj/u;Ljj/d;)V

    invoke-static {v0}, Lyj/a;->n(Ldj/s;)Ldj/s;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ljj/d;)Ldj/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/d<",
            "-TT;>;)",
            "Ldj/s<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "onSuccess is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lsj/b;

    invoke-direct {v0, p0, p1}, Lsj/b;-><init>(Ldj/u;Ljj/d;)V

    invoke-static {v0}, Lyj/a;->n(Ldj/s;)Ldj/s;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljj/g;)Ldj/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/g<",
            "-TT;>;)",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "predicate is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqj/f;

    invoke-direct {v0, p0, p1}, Lqj/f;-><init>(Ldj/u;Ljj/g;)V

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method public final i(Ldj/s;)Ldj/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/s<",
            "+TT;>;)",
            "Ldj/s<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "resumeSingleInCaseOfError is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Llj/a;->e(Ljava/lang/Object;)Ljj/e;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldj/s;->j(Ljj/e;)Ldj/s;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljj/e;)Ldj/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/e<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Ldj/u<",
            "+TT;>;>;)",
            "Ldj/s<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "resumeFunctionInCaseOfError is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lsj/d;

    invoke-direct {v0, p0, p1}, Lsj/d;-><init>(Ldj/u;Ljj/e;)V

    invoke-static {v0}, Lyj/a;->n(Ldj/s;)Ldj/s;

    move-result-object p1

    return-object p1
.end method

.method protected abstract k(Ldj/t;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/t<",
            "-TT;>;)V"
        }
    .end annotation
.end method

.method public final l()Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lmj/b;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lmj/b;

    invoke-interface {v0}, Lmj/b;->d()Ldj/f;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lsj/e;

    invoke-direct {v0, p0}, Lsj/e;-><init>(Ldj/u;)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object v0

    return-object v0
.end method
