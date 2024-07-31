.class public abstract Ldj/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/d;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d()Ldj/b;
    .locals 1

    sget-object v0, Loj/b;->a:Ldj/b;

    invoke-static {v0}, Lyj/a;->j(Ldj/b;)Ldj/b;

    move-result-object v0

    return-object v0
.end method

.method public static varargs e([Ldj/d;)Ldj/b;
    .locals 2

    const-string v0, "sources is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Ldj/b;->d()Ldj/b;

    move-result-object p0

    return-object p0

    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-static {p0}, Ldj/b;->s(Ldj/d;)Ldj/b;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Loj/a;

    invoke-direct {v0, p0}, Loj/a;-><init>([Ldj/d;)V

    invoke-static {v0}, Lyj/a;->j(Ldj/b;)Ldj/b;

    move-result-object p0

    return-object p0
.end method

.method private i(Ljj/d;Ljj/d;Ljj/a;Ljj/a;Ljj/a;Ljj/a;)Ldj/b;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/d<",
            "-",
            "Lgj/b;",
            ">;",
            "Ljj/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Ljj/a;",
            "Ljj/a;",
            "Ljj/a;",
            "Ljj/a;",
            ")",
            "Ldj/b;"
        }
    .end annotation

    const-string v0, "onSubscribe is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onError is null"

    invoke-static {p2, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onComplete is null"

    invoke-static {p3, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onTerminate is null"

    invoke-static {p4, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onAfterTerminate is null"

    invoke-static {p5, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onDispose is null"

    invoke-static {p6, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Loj/g;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-direct/range {v1 .. v8}, Loj/g;-><init>(Ldj/d;Ljj/d;Ljj/d;Ljj/a;Ljj/a;Ljj/a;Ljj/a;)V

    invoke-static {v0}, Lyj/a;->j(Ldj/b;)Ldj/b;

    move-result-object p1

    return-object p1
.end method

.method public static j(Ljj/a;)Ldj/b;
    .locals 1

    const-string v0, "run is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Loj/c;

    invoke-direct {v0, p0}, Loj/c;-><init>(Ljj/a;)V

    invoke-static {v0}, Lyj/a;->j(Ldj/b;)Ldj/b;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ljava/util/concurrent/Callable;)Ldj/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "*>;)",
            "Ldj/b;"
        }
    .end annotation

    const-string v0, "callable is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Loj/d;

    invoke-direct {v0, p0}, Loj/d;-><init>(Ljava/util/concurrent/Callable;)V

    invoke-static {v0}, Lyj/a;->j(Ldj/b;)Ldj/b;

    move-result-object p0

    return-object p0
.end method

.method private static r(Ljava/lang/Throwable;)Ljava/lang/NullPointerException;
    .locals 2

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Actually not, but can\'t pass out an exception otherwise..."

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    return-object v0
.end method

.method public static s(Ldj/d;)Ldj/b;
    .locals 1

    const-string v0, "source is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    instance-of v0, p0, Ldj/b;

    if-eqz v0, :cond_0

    check-cast p0, Ldj/b;

    invoke-static {p0}, Lyj/a;->j(Ldj/b;)Ldj/b;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Loj/e;

    invoke-direct {v0, p0}, Loj/e;-><init>(Ldj/d;)V

    invoke-static {v0}, Lyj/a;->j(Ldj/b;)Ldj/b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ldj/c;)V
    .locals 1

    const-string v0, "s is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    invoke-static {p0, p1}, Lyj/a;->t(Ldj/b;Ldj/c;)Ldj/c;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldj/b;->p(Ldj/c;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    invoke-static {p1}, Ldj/b;->r(Ljava/lang/Throwable;)Ljava/lang/NullPointerException;

    move-result-object p1

    throw p1

    :catch_0
    move-exception p1

    throw p1
.end method

.method public final c(Ldj/d;)Ldj/b;
    .locals 0

    invoke-virtual {p0, p1}, Ldj/b;->f(Ldj/d;)Ldj/b;

    move-result-object p1

    return-object p1
.end method

.method public final f(Ldj/d;)Ldj/b;
    .locals 2

    const-string v0, "other is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x2

    new-array v0, v0, [Ldj/d;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    invoke-static {v0}, Ldj/b;->e([Ldj/d;)Ldj/b;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljj/a;)Ldj/b;
    .locals 7

    invoke-static {}, Llj/a;->b()Ljj/d;

    move-result-object v1

    invoke-static {}, Llj/a;->b()Ljj/d;

    move-result-object v2

    sget-object v6, Llj/a;->c:Ljj/a;

    move-object v0, p0

    move-object v3, p1

    move-object v4, v6

    move-object v5, v6

    invoke-direct/range {v0 .. v6}, Ldj/b;->i(Ljj/d;Ljj/d;Ljj/a;Ljj/a;Ljj/a;Ljj/a;)Ldj/b;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljj/d;)Ldj/b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ldj/b;"
        }
    .end annotation

    invoke-static {}, Llj/a;->b()Ljj/d;

    move-result-object v1

    sget-object v6, Llj/a;->c:Ljj/a;

    move-object v0, p0

    move-object v2, p1

    move-object v3, v6

    move-object v4, v6

    move-object v5, v6

    invoke-direct/range {v0 .. v6}, Ldj/b;->i(Ljj/d;Ljj/d;Ljj/a;Ljj/a;Ljj/a;Ljj/a;)Ldj/b;

    move-result-object p1

    return-object p1
.end method

.method public final l()Ldj/b;
    .locals 1

    invoke-static {}, Llj/a;->a()Ljj/g;

    move-result-object v0

    invoke-virtual {p0, v0}, Ldj/b;->m(Ljj/g;)Ldj/b;

    move-result-object v0

    return-object v0
.end method

.method public final m(Ljj/g;)Ldj/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/g<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Ldj/b;"
        }
    .end annotation

    const-string v0, "predicate is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Loj/f;

    invoke-direct {v0, p0, p1}, Loj/f;-><init>(Ldj/d;Ljj/g;)V

    invoke-static {v0}, Lyj/a;->j(Ldj/b;)Ldj/b;

    move-result-object p1

    return-object p1
.end method

.method public final n(Ljj/e;)Ldj/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/e<",
            "-",
            "Ljava/lang/Throwable;",
            "+",
            "Ldj/d;",
            ">;)",
            "Ldj/b;"
        }
    .end annotation

    const-string v0, "errorMapper is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Loj/h;

    invoke-direct {v0, p0, p1}, Loj/h;-><init>(Ldj/d;Ljj/e;)V

    invoke-static {v0}, Lyj/a;->j(Ldj/b;)Ldj/b;

    move-result-object p1

    return-object p1
.end method

.method public final o()Lgj/b;
    .locals 1

    new-instance v0, Lnj/e;

    invoke-direct {v0}, Lnj/e;-><init>()V

    invoke-virtual {p0, v0}, Ldj/b;->a(Ldj/c;)V

    return-object v0
.end method

.method protected abstract p(Ldj/c;)V
.end method

.method public final q()Ldj/j;
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

    instance-of v0, p0, Lmj/c;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lmj/c;

    invoke-interface {v0}, Lmj/c;->a()Ldj/j;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lqj/j;

    invoke-direct {v0, p0}, Lqj/j;-><init>(Ldj/d;)V

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object v0

    return-object v0
.end method
