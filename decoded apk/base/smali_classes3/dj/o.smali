.class public abstract Ldj/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/p;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ldj/p<",
        "TT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static f()I
    .locals 1

    invoke-static {}, Ldj/f;->b()I

    move-result v0

    return v0
.end method

.method public static h()Ldj/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ldj/o<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lrj/d;->a:Ldj/o;

    invoke-static {v0}, Lyj/a;->m(Ldj/o;)Ldj/o;

    move-result-object v0

    return-object v0
.end method

.method public static p(Ljava/lang/Iterable;)Ldj/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+TT;>;)",
            "Ldj/o<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "source is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrj/i;

    invoke-direct {v0, p0}, Lrj/i;-><init>(Ljava/lang/Iterable;)V

    invoke-static {v0}, Lyj/a;->m(Ldj/o;)Ldj/o;

    move-result-object p0

    return-object p0
.end method

.method public static q(Ljava/lang/Object;)Ldj/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ldj/o<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "The item is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrj/j;

    invoke-direct {v0, p0}, Lrj/j;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lyj/a;->m(Ldj/o;)Ldj/o;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d(Ldj/q;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "observer is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    invoke-static {p0, p1}, Lyj/a;->v(Ldj/o;Ldj/q;)Ldj/q;

    move-result-object p1

    const-string v0, "Plugin returned null Observer"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Ldj/o;->s(Ldj/q;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Actually not, but can\'t throw other exceptions due to RS"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0

    :catch_0
    move-exception p1

    throw p1
.end method

.method public final e(Ljj/g;)Ldj/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/g<",
            "-TT;>;)",
            "Ldj/s<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "predicate is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrj/c;

    invoke-direct {v0, p0, p1}, Lrj/c;-><init>(Ldj/p;Ljj/g;)V

    invoke-static {v0}, Lyj/a;->n(Ldj/s;)Ldj/s;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/Object;)Ldj/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ldj/s<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "element is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-static {p1}, Llj/a;->c(Ljava/lang/Object;)Ljj/g;

    move-result-object p1

    invoke-virtual {p0, p1}, Ldj/o;->e(Ljj/g;)Ldj/s;

    move-result-object p1

    return-object p1
.end method

.method public final i(Ljj/g;)Ldj/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/g<",
            "-TT;>;)",
            "Ldj/o<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "predicate is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrj/e;

    invoke-direct {v0, p0, p1}, Lrj/e;-><init>(Ldj/p;Ljj/g;)V

    invoke-static {v0}, Lyj/a;->m(Ldj/o;)Ldj/o;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljj/e;)Ldj/o;
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

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ldj/o;->k(Ljj/e;Z)Ldj/o;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljj/e;Z)Ldj/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+",
            "Ldj/p<",
            "+TR;>;>;Z)",
            "Ldj/o<",
            "TR;>;"
        }
    .end annotation

    const v0, 0x7fffffff

    invoke-virtual {p0, p1, p2, v0}, Ldj/o;->l(Ljj/e;ZI)Ldj/o;

    move-result-object p1

    return-object p1
.end method

.method public final l(Ljj/e;ZI)Ldj/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+",
            "Ldj/p<",
            "+TR;>;>;ZI)",
            "Ldj/o<",
            "TR;>;"
        }
    .end annotation

    invoke-static {}, Ldj/o;->f()I

    move-result v0

    invoke-virtual {p0, p1, p2, p3, v0}, Ldj/o;->m(Ljj/e;ZII)Ldj/o;

    move-result-object p1

    return-object p1
.end method

.method public final m(Ljj/e;ZII)Ldj/o;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+",
            "Ldj/p<",
            "+TR;>;>;ZII)",
            "Ldj/o<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "maxConcurrency"

    invoke-static {p3, v0}, Llj/b;->e(ILjava/lang/String;)I

    const-string v0, "bufferSize"

    invoke-static {p4, v0}, Llj/b;->e(ILjava/lang/String;)I

    instance-of v0, p0, Lmj/h;

    if-eqz v0, :cond_1

    move-object p2, p0

    check-cast p2, Lmj/h;

    invoke-interface {p2}, Lmj/h;->call()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, Ldj/o;->h()Ldj/o;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2, p1}, Lrj/l;->a(Ljava/lang/Object;Ljj/e;)Ldj/o;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v6, Lrj/f;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lrj/f;-><init>(Ldj/p;Ljj/e;ZII)V

    invoke-static {v6}, Lyj/a;->m(Ldj/o;)Ldj/o;

    move-result-object p1

    return-object p1
.end method

.method public final n(Ljj/e;)Ldj/b;
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

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ldj/o;->o(Ljj/e;Z)Ldj/b;

    move-result-object p1

    return-object p1
.end method

.method public final o(Ljj/e;Z)Ldj/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/e<",
            "-TT;+",
            "Ldj/d;",
            ">;Z)",
            "Ldj/b;"
        }
    .end annotation

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrj/h;

    invoke-direct {v0, p0, p1, p2}, Lrj/h;-><init>(Ldj/p;Ljj/e;Z)V

    invoke-static {v0}, Lyj/a;->j(Ldj/b;)Ldj/b;

    move-result-object p1

    return-object p1
.end method

.method public final r(Ljj/e;)Ldj/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+TR;>;)",
            "Ldj/o<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrj/k;

    invoke-direct {v0, p0, p1}, Lrj/k;-><init>(Ldj/p;Ljj/e;)V

    invoke-static {v0}, Lyj/a;->m(Ldj/o;)Ldj/o;

    move-result-object p1

    return-object p1
.end method

.method protected abstract s(Ldj/q;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TT;>;)V"
        }
    .end annotation
.end method

.method public final t(Ldj/p;)Ldj/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/p<",
            "+TT;>;)",
            "Ldj/o<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "other is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lrj/m;

    invoke-direct {v0, p0, p1}, Lrj/m;-><init>(Ldj/p;Ldj/p;)V

    invoke-static {v0}, Lyj/a;->m(Ldj/o;)Ldj/o;

    move-result-object p1

    return-object p1
.end method

.method public final u(Ldj/a;)Ldj/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/a;",
            ")",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lpj/n;

    invoke-direct {v0, p0}, Lpj/n;-><init>(Ldj/o;)V

    sget-object v1, Ldj/o$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v1, p1

    const/4 v1, 0x1

    if-eq p1, v1, :cond_3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_2

    const/4 v1, 0x3

    if-eq p1, v1, :cond_1

    const/4 v1, 0x4

    if-eq p1, v1, :cond_0

    invoke-virtual {v0}, Ldj/f;->y()Ldj/f;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Lpj/u;

    invoke-direct {p1, v0}, Lpj/u;-><init>(Ldj/f;)V

    invoke-static {p1}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object p1

    return-object p1

    :cond_1
    return-object v0

    :cond_2
    invoke-virtual {v0}, Ldj/f;->B()Ldj/f;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-virtual {v0}, Ldj/f;->A()Ldj/f;

    move-result-object p1

    return-object p1
.end method
