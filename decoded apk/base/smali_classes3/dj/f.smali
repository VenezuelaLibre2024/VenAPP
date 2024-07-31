.class public abstract Ldj/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lim/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lim/a<",
        "TT;>;"
    }
.end annotation


# static fields
.field static final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "rx2.buffer-size"

    const/16 v1, 0x80

    invoke-static {v0, v1}, Ljava/lang/Integer;->getInteger(Ljava/lang/String;I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    sput v0, Ldj/f;->a:I

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()I
    .locals 1

    sget v0, Ldj/f;->a:I

    return v0
.end method

.method public static e(Ldj/h;Ldj/a;)Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ldj/h<",
            "TT;>;",
            "Ldj/a;",
            ")",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "source is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "mode is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpj/c;

    invoke-direct {v0, p0, p1}, Lpj/c;-><init>(Ldj/h;Ldj/a;)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object p0

    return-object p0
.end method

.method private f(Ljj/d;Ljj/d;Ljj/a;Ljj/a;)Ldj/f;
    .locals 7
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
            "Ljj/a;",
            ")",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "onNext is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onError is null"

    invoke-static {p2, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onComplete is null"

    invoke-static {p3, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onAfterTerminate is null"

    invoke-static {p4, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpj/d;

    move-object v1, v0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v6}, Lpj/d;-><init>(Ldj/f;Ljj/d;Ljj/d;Ljj/a;Ljj/a;)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object p1

    return-object p1
.end method

.method public static i()Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lpj/g;->b:Ldj/f;

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object v0

    return-object v0
.end method

.method public static varargs r([Ljava/lang/Object;)Ldj/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "items is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, Ldj/f;->i()Ldj/f;

    move-result-object p0

    return-object p0

    :cond_0
    array-length v0, p0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    const/4 v0, 0x0

    aget-object p0, p0, v0

    invoke-static {p0}, Ldj/f;->t(Ljava/lang/Object;)Ldj/f;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance v0, Lpj/l;

    invoke-direct {v0, p0}, Lpj/l;-><init>([Ljava/lang/Object;)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object p0

    return-object p0
.end method

.method public static s(Ljava/lang/Iterable;)Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "+TT;>;)",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "source is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpj/m;

    invoke-direct {v0, p0}, Lpj/m;-><init>(Ljava/lang/Iterable;)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object p0

    return-object p0
.end method

.method public static t(Ljava/lang/Object;)Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "item is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpj/p;

    invoke-direct {v0, p0}, Lpj/p;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object p0

    return-object p0
.end method

.method public static v(Lim/a;Lim/a;Lim/a;)Ldj/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lim/a<",
            "+TT;>;",
            "Lim/a<",
            "+TT;>;",
            "Lim/a<",
            "+TT;>;)",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "source1 is null"

    invoke-static {p0, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source2 is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "source3 is null"

    invoke-static {p2, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v0, 0x3

    new-array v1, v0, [Lim/a;

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const/4 p0, 0x1

    aput-object p1, v1, p0

    const/4 p0, 0x2

    aput-object p2, v1, p0

    invoke-static {v1}, Ldj/f;->r([Ljava/lang/Object;)Ldj/f;

    move-result-object p0

    invoke-static {}, Llj/a;->d()Ljj/e;

    move-result-object p1

    invoke-virtual {p0, p1, v2, v0}, Ldj/f;->l(Ljj/e;ZI)Ldj/f;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final A()Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lpj/t;

    invoke-direct {v0, p0}, Lpj/t;-><init>(Ldj/f;)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object v0

    return-object v0
.end method

.method public final B()Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lpj/v;

    invoke-direct {v0, p0}, Lpj/v;-><init>(Ldj/f;)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object v0

    return-object v0
.end method

.method public final C()Lij/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lij/a<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Ldj/f;->b()I

    move-result v0

    invoke-virtual {p0, v0}, Ldj/f;->D(I)Lij/a;

    move-result-object v0

    return-object v0
.end method

.method public final D(I)Lij/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lij/a<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "bufferSize"

    invoke-static {p1, v0}, Llj/b;->e(ILjava/lang/String;)I

    invoke-static {p0, p1}, Lpj/w;->M(Ldj/f;I)Lij/a;

    move-result-object p1

    return-object p1
.end method

.method public final E(Ljava/util/Comparator;)Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Comparator<",
            "-TT;>;)",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "sortFunction"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p0}, Ldj/f;->J()Ldj/s;

    move-result-object v0

    invoke-virtual {v0}, Ldj/s;->l()Ldj/f;

    move-result-object v0

    invoke-static {p1}, Llj/a;->f(Ljava/util/Comparator;)Ljj/e;

    move-result-object p1

    invoke-virtual {v0, p1}, Ldj/f;->u(Ljj/e;)Ldj/f;

    move-result-object p1

    invoke-static {}, Llj/a;->d()Ljj/e;

    move-result-object v0

    invoke-virtual {p1, v0}, Ldj/f;->n(Ljj/e;)Ldj/f;

    move-result-object p1

    return-object p1
.end method

.method public final F(Ljj/d;)Lgj/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/d<",
            "-TT;>;)",
            "Lgj/b;"
        }
    .end annotation

    sget-object v0, Llj/a;->f:Ljj/d;

    sget-object v1, Llj/a;->c:Ljj/a;

    sget-object v2, Lpj/o;->INSTANCE:Lpj/o;

    invoke-virtual {p0, p1, v0, v1, v2}, Ldj/f;->G(Ljj/d;Ljj/d;Ljj/a;Ljj/d;)Lgj/b;

    move-result-object p1

    return-object p1
.end method

.method public final G(Ljj/d;Ljj/d;Ljj/a;Ljj/d;)Lgj/b;
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
            "Ljj/d<",
            "-",
            "Lim/c;",
            ">;)",
            "Lgj/b;"
        }
    .end annotation

    const-string v0, "onNext is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onError is null"

    invoke-static {p2, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onComplete is null"

    invoke-static {p3, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "onSubscribe is null"

    invoke-static {p4, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lvj/c;

    invoke-direct {v0, p1, p2, p3, p4}, Lvj/c;-><init>(Ljj/d;Ljj/d;Ljj/a;Ljj/d;)V

    invoke-virtual {p0, v0}, Ldj/f;->H(Ldj/i;)V

    return-object v0
.end method

.method public final H(Ldj/i;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/i<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "s is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    :try_start_0
    invoke-static {p0, p1}, Lyj/a;->x(Ldj/f;Lim/b;)Lim/b;

    move-result-object p1

    const-string v0, "Plugin returned null Subscriber"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    invoke-virtual {p0, p1}, Ldj/f;->I(Lim/b;)V
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

.method protected abstract I(Lim/b;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation
.end method

.method public final J()Ldj/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/s<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v0, Lpj/z;

    invoke-direct {v0, p0}, Lpj/z;-><init>(Ldj/f;)V

    invoke-static {v0}, Lyj/a;->n(Ldj/s;)Ldj/s;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lim/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation

    instance-of v0, p1, Ldj/i;

    if-eqz v0, :cond_0

    check-cast p1, Ldj/i;

    invoke-virtual {p0, p1}, Ldj/f;->H(Ldj/i;)V

    goto :goto_0

    :cond_0
    const-string v0, "s is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lvj/d;

    invoke-direct {v0, p1}, Lvj/d;-><init>(Lim/b;)V

    invoke-virtual {p0, v0}, Ldj/f;->H(Ldj/i;)V

    :goto_0
    return-void
.end method

.method public final c(Ljj/e;)Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TR;>;>;)",
            "Ldj/f<",
            "TR;>;"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Ldj/f;->d(Ljj/e;I)Ldj/f;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljj/e;I)Ldj/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TR;>;>;I)",
            "Ldj/f<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "prefetch"

    invoke-static {p2, v0}, Llj/b;->e(ILjava/lang/String;)I

    instance-of v0, p0, Lmj/h;

    if-eqz v0, :cond_1

    move-object p2, p0

    check-cast p2, Lmj/h;

    invoke-interface {p2}, Lmj/h;->call()Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, Ldj/f;->i()Ldj/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2, p1}, Lpj/x;->a(Ljava/lang/Object;Ljj/e;)Ldj/f;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Lpj/b;

    sget-object v1, Lxj/f;->IMMEDIATE:Lxj/f;

    invoke-direct {v0, p0, p1, p2, v1}, Lpj/b;-><init>(Ldj/f;Ljj/e;ILxj/f;)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljj/d;)Ldj/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/d<",
            "-TT;>;)",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Llj/a;->b()Ljj/d;

    move-result-object v0

    sget-object v1, Llj/a;->c:Ljj/a;

    invoke-direct {p0, p1, v0, v1, v1}, Ldj/f;->f(Ljj/d;Ljj/d;Ljj/a;Ljj/a;)Ldj/f;

    move-result-object p1

    return-object p1
.end method

.method public final h(J)Ldj/j;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    new-instance v0, Lpj/f;

    invoke-direct {v0, p0, p1, p2}, Lpj/f;-><init>(Ldj/f;J)V

    invoke-static {v0}, Lyj/a;->l(Ldj/j;)Ldj/j;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "index >= 0 required but it was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final j(Ljj/g;)Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/g<",
            "-TT;>;)",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "predicate is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpj/h;

    invoke-direct {v0, p0, p1}, Lpj/h;-><init>(Ldj/f;Ljj/g;)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object p1

    return-object p1
.end method

.method public final k()Ldj/j;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    invoke-virtual {p0, v0, v1}, Ldj/f;->h(J)Ldj/j;

    move-result-object v0

    return-object v0
.end method

.method public final l(Ljj/e;ZI)Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TR;>;>;ZI)",
            "Ldj/f<",
            "TR;>;"
        }
    .end annotation

    invoke-static {}, Ldj/f;->b()I

    move-result v0

    invoke-virtual {p0, p1, p2, p3, v0}, Ldj/f;->m(Ljj/e;ZII)Ldj/f;

    move-result-object p1

    return-object p1
.end method

.method public final m(Ljj/e;ZII)Ldj/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TR;>;>;ZII)",
            "Ldj/f<",
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

    invoke-static {}, Ldj/f;->i()Ldj/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2, p1}, Lpj/x;->a(Ljava/lang/Object;Ljj/e;)Ldj/f;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v6, Lpj/i;

    move-object v0, v6

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v5}, Lpj/i;-><init>(Ldj/f;Ljj/e;ZII)V

    invoke-static {v6}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object p1

    return-object p1
.end method

.method public final n(Ljj/e;)Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+",
            "Ljava/lang/Iterable<",
            "+TU;>;>;)",
            "Ldj/f<",
            "TU;>;"
        }
    .end annotation

    invoke-static {}, Ldj/f;->b()I

    move-result v0

    invoke-virtual {p0, p1, v0}, Ldj/f;->o(Ljj/e;I)Ldj/f;

    move-result-object p1

    return-object p1
.end method

.method public final o(Ljj/e;I)Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+",
            "Ljava/lang/Iterable<",
            "+TU;>;>;I)",
            "Ldj/f<",
            "TU;>;"
        }
    .end annotation

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "bufferSize"

    invoke-static {p2, v0}, Llj/b;->e(ILjava/lang/String;)I

    new-instance v0, Lpj/k;

    invoke-direct {v0, p0, p1, p2}, Lpj/k;-><init>(Ldj/f;Ljj/e;I)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object p1

    return-object p1
.end method

.method public final p(Ljj/e;)Ldj/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+",
            "Ldj/n<",
            "+TR;>;>;)",
            "Ldj/f<",
            "TR;>;"
        }
    .end annotation

    const/4 v0, 0x0

    const v1, 0x7fffffff

    invoke-virtual {p0, p1, v0, v1}, Ldj/f;->q(Ljj/e;ZI)Ldj/f;

    move-result-object p1

    return-object p1
.end method

.method public final q(Ljj/e;ZI)Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+",
            "Ldj/n<",
            "+TR;>;>;ZI)",
            "Ldj/f<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "maxConcurrency"

    invoke-static {p3, v0}, Llj/b;->e(ILjava/lang/String;)I

    new-instance v0, Lpj/j;

    invoke-direct {v0, p0, p1, p2, p3}, Lpj/j;-><init>(Ldj/f;Ljj/e;ZI)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object p1

    return-object p1
.end method

.method public final u(Ljj/e;)Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljj/e<",
            "-TT;+TR;>;)",
            "Ldj/f<",
            "TR;>;"
        }
    .end annotation

    const-string v0, "mapper is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lpj/q;

    invoke-direct {v0, p0, p1}, Lpj/q;-><init>(Ldj/f;Ljj/e;)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object p1

    return-object p1
.end method

.method public final w(Ldj/r;)Ldj/f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/r;",
            ")",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {}, Ldj/f;->b()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1}, Ldj/f;->x(Ldj/r;ZI)Ldj/f;

    move-result-object p1

    return-object p1
.end method

.method public final x(Ldj/r;ZI)Ldj/f;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/r;",
            "ZI)",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "scheduler is null"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "bufferSize"

    invoke-static {p3, v0}, Llj/b;->e(ILjava/lang/String;)I

    new-instance v0, Lpj/r;

    invoke-direct {v0, p0, p1, p2, p3}, Lpj/r;-><init>(Ldj/f;Ldj/r;ZI)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object p1

    return-object p1
.end method

.method public final y()Ldj/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    invoke-static {}, Ldj/f;->b()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {p0, v0, v1, v2}, Ldj/f;->z(IZZ)Ldj/f;

    move-result-object v0

    return-object v0
.end method

.method public final z(IZZ)Ldj/f;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZZ)",
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "bufferSize"

    invoke-static {p1, v0}, Llj/b;->e(ILjava/lang/String;)I

    new-instance v0, Lpj/s;

    sget-object v6, Llj/a;->c:Ljj/a;

    move-object v1, v0

    move-object v2, p0

    move v3, p1

    move v4, p3

    move v5, p2

    invoke-direct/range {v1 .. v6}, Lpj/s;-><init>(Ldj/f;IZZLjj/a;)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object p1

    return-object p1
.end method
