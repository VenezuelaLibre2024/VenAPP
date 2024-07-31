.class public abstract Ldj/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/n;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ldj/n<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static A(Ldj/n;Ldj/n;Ljj/b;)Ldj/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ldj/n<",
            "+TT1;>;",
            "Ldj/n<",
            "+TT2;>;",
            "Ljj/b<",
            "-TT1;-TT2;+TR;>;)",
            "Ldj/j<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p2}, Llj/a;->g(Ljj/b;)Ljj/e;

    move-result-object p2

    const/4 v0, 0x2

    new-array v0, v0, [Ldj/n;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    invoke-static {p2, v0}, Ldj/j;->B(Ljj/e;[Ldj/n;)Ldj/j;

    move-result-object p0

    return-object p0
.end method

.method public static varargs B(Ljj/e;[Ldj/n;)Ldj/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-[",
            "Ljava/lang/Object;",
            "+TR;>;[",
            "Ldj/n<",
            "+TT;>;)",
            "Ldj/j<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "sources is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p1

    if-nez v0, :cond_0

    invoke-static {}, Ldj/j;->g()Ldj/j;

    move-result-object p0

    return-object p0

    :cond_0
    const-string v0, "zipper is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqj/v;

    invoke-direct {v0, p1, p0}, Lqj/v;-><init>([Ldj/n;Ljj/e;)V

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object p0

    return-object p0
.end method

.method public static b(Ldj/m;)Ldj/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldj/m<",
            "TT;>;)",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "onSubscribe is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqj/c;

    invoke-direct {v0, p0}, Lqj/c;-><init>(Ldj/m;)V

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object p0

    return-object p0
.end method

.method public static g()Ldj/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lqj/d;->a:Lqj/d;

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object v0

    return-object v0
.end method

.method public static l(Ljava/util/concurrent/Callable;)Ldj/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/concurrent/Callable<",
            "+TT;>;)",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "callable is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqj/i;

    invoke-direct {v0, p0}, Lqj/i;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object p0

    return-object p0
.end method

.method public static n(Ljava/lang/Object;)Ldj/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "item is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqj/m;

    invoke-direct {v0, p0}, Lqj/m;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ldj/l;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "observer is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p0, p1}, Lyj/a;->u(Ldj/j;Ldj/l;)Ldj/l;

    move-result-object p1

    const-string v0, "observer returned by the RxJavaPlugins hook is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    invoke-virtual {p0, p1}, Ldj/j;->u(Ldj/l;)V
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

.method public final c(Ljava/lang/Object;)Ldj/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "item is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Ldj/j;->n(Ljava/lang/Object;)Ldj/j;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldj/j;->x(Ldj/n;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method public final e(Ljj/d;)Ldj/j;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    new-instance v8, Lqj/q;

    invoke-static {}, Llj/a;->b()Ljj/d;

    move-result-object v2

    invoke-static {}, Llj/a;->b()Ljj/d;

    move-result-object v3

    const-string v0, "onError is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Ljj/d;

    sget-object v7, Llj/a;->c:Ljj/a;

    move-object v0, v8

    move-object v1, p0

    move-object v5, v7

    move-object v6, v7

    invoke-direct/range {v0 .. v7}, Lqj/q;-><init>(Ldj/n;Ljj/d;Ljj/d;Ljj/d;Ljj/a;Ljj/a;Ljj/a;)V

    invoke-static {v8}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ljj/d;)Ldj/j;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/d<",
            "-TT;>;)",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    new-instance v8, Lqj/q;

    invoke-static {}, Llj/a;->b()Ljj/d;

    move-result-object v2

    const-string v0, "onSubscribe is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljj/d;

    invoke-static {}, Llj/a;->b()Ljj/d;

    move-result-object v4

    sget-object v7, Llj/a;->c:Ljj/a;

    move-object v0, v8

    move-object v1, p0

    move-object v5, v7

    move-object v6, v7

    invoke-direct/range {v0 .. v7}, Lqj/q;-><init>(Ldj/n;Ljj/d;Ljj/d;Ljj/d;Ljj/a;Ljj/a;Ljj/a;)V

    invoke-static {v8}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljj/g;)Ldj/j;
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

    new-instance v0, Lqj/e;

    invoke-direct {v0, p0, p1}, Lqj/e;-><init>(Ldj/n;Ljj/g;)V

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method public final i(Ljj/e;)Ldj/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+",
            "Ldj/n<",
            "+TR;>;>;)",
            "Ldj/j<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqj/h;

    invoke-direct {v0, p0, p1}, Lqj/h;-><init>(Ldj/n;Ljj/e;)V

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljj/e;)Ldj/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/e<",
            "-TT;+",
            "Ldj/d;",
            ">;)",
            "Ldj/b;"
        }
    .end annotation

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqj/g;

    invoke-direct {v0, p0, p1}, Lqj/g;-><init>(Ldj/n;Ljj/e;)V

    invoke-static {v0}, Lyj/a;->j(Ldj/b;)Ldj/b;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljj/e;)Ldj/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+",
            "Ldj/p<",
            "+TR;>;>;)",
            "Ldj/o<",
            "TR;>;"
        }
    .end annotation

    invoke-virtual {p0}, Ldj/j;->z()Ldj/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Ldj/o;->j(Ljj/e;)Ldj/o;

    move-result-object p1

    return-object p1
.end method

.method public final m()Ldj/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/s<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    new-instance v0, Lqj/l;

    invoke-direct {v0, p0}, Lqj/l;-><init>(Ldj/n;)V

    invoke-static {v0}, Lyj/a;->n(Ldj/s;)Ldj/s;

    move-result-object v0

    return-object v0
.end method

.method public final o(Ljj/e;)Ldj/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+TR;>;)",
            "Ldj/j<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqj/n;

    invoke-direct {v0, p0, p1}, Lqj/n;-><init>(Ldj/n;Ljj/e;)V

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method public final p(Ldj/r;)Ldj/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/r;",
            ")",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqj/o;

    invoke-direct {v0, p0, p1}, Lqj/o;-><init>(Ldj/n;Ldj/r;)V

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method public final q(Ldj/n;)Ldj/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/n<",
            "+TT;>;)",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "next is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Llj/a;->e(Ljava/lang/Object;)Ljj/e;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldj/j;->r(Ljj/e;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method public final r(Ljj/e;)Ldj/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/e<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Ldj/n<",
            "+TT;>;>;)",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "resumeFunction is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqj/p;

    const/4 v1, 0x1

    invoke-direct {v0, p0, p1, v1}, Lqj/p;-><init>(Ldj/n;Ljj/e;Z)V

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method public final s()Lgj/b;
    .locals 3

    invoke-static {}, Llj/a;->b()Ljj/d;

    move-result-object v0

    sget-object v1, Llj/a;->f:Ljj/d;

    sget-object v2, Llj/a;->c:Ljj/a;

    invoke-virtual {p0, v0, v1, v2}, Ldj/j;->t(Ljj/d;Ljj/d;Ljj/a;)Lgj/b;

    move-result-object v0

    return-object v0
.end method

.method public final t(Ljj/d;Ljj/d;Ljj/a;)Lgj/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/d<",
            "-TT;>;",
            "Ljj/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Ljj/a;",
            ")",
            "Lgj/b;"
        }
    .end annotation

    const-string v0, "onSuccess is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onError is null"

    invoke-static {p2, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onComplete is null"

    invoke-static {p3, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqj/b;

    invoke-direct {v0, p1, p2, p3}, Lqj/b;-><init>(Ljj/d;Ljj/d;Ljj/a;)V

    invoke-virtual {p0, v0}, Ldj/j;->w(Ldj/l;)Ldj/l;

    move-result-object p1

    check-cast p1, Lgj/b;

    return-object p1
.end method

.method protected abstract u(Ldj/l;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;)V"
        }
    .end annotation
.end method

.method public final v(Ldj/r;)Ldj/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/r;",
            ")",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqj/r;

    invoke-direct {v0, p0, p1}, Lqj/r;-><init>(Ldj/n;Ldj/r;)V

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method public final w(Ldj/l;)Ldj/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Ldj/l<",
            "-TT;>;>(TE;)TE;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ldj/j;->a(Ldj/l;)V

    return-object p1
.end method

.method public final x(Ldj/n;)Ldj/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/n<",
            "+TT;>;)",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "other is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lqj/s;

    invoke-direct {v0, p0, p1}, Lqj/s;-><init>(Ldj/n;Ldj/n;)V

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method public final y()Ldj/f;
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
    new-instance v0, Lqj/t;

    invoke-direct {v0, p0}, Lqj/t;-><init>(Ldj/n;)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object v0

    return-object v0
.end method

.method public final z()Ldj/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/o<",
            "TT;>;"
        }
    .end annotation

    instance-of v0, p0, Lmj/d;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lmj/d;

    invoke-interface {v0}, Lmj/d;->b()Ldj/o;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lqj/u;

    invoke-direct {v0, p0}, Lqj/u;-><init>(Ldj/n;)V

    invoke-static {v0}, Lyj/a;->m(Ldj/o;)Ldj/o;

    move-result-object v0

    return-object v0
.end method
