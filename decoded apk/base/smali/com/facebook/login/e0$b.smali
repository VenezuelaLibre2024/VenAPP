.class public final Lcom/facebook/login/e0$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/login/e0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0}, Lcom/facebook/login/e0$b;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lcom/facebook/login/e0$b;)Ljava/util/Set;
    .locals 0

    invoke-direct {p0}, Lcom/facebook/login/e0$b;->e()Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lcom/facebook/login/e0$b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/a0;Li4/r0;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/facebook/login/e0$b;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/a0;Li4/r0;)V

    return-void
.end method

.method private final e()Ljava/util/Set;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "create_event"

    const-string v1, "rsvp_event"

    const-string v2, "ads_management"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ldk/o0;->i([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method private final f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/login/a0;Li4/r0;)V
    .locals 2

    new-instance v0, Li4/r;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Li4/r;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p3, v0}, Lcom/facebook/login/a0;->i(Ljava/lang/String;Ljava/lang/Exception;)V

    invoke-interface {p5, v0}, Li4/r0;->c(Ljava/lang/Exception;)V

    return-void
.end method


# virtual methods
.method public final c(Lcom/facebook/login/u$e;Li4/a;Li4/i;)Lcom/facebook/login/g0;
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newToken"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/facebook/login/u$e;->n()Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p2}, Li4/a;->k()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Ldk/p;->D(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Ldk/p;->i0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1}, Lcom/facebook/login/u$e;->t()Z

    move-result p1

    if-eqz p1, :cond_0

    move-object p1, v0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {v1, p1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    :cond_0
    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Ldk/p;->D(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Ldk/p;->i0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    move-object v0, v1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    new-instance v0, Lcom/facebook/login/g0;

    invoke-direct {v0, p2, p3, v1, p1}, Lcom/facebook/login/g0;-><init>(Li4/a;Li4/i;Ljava/util/Set;Ljava/util/Set;)V

    return-object v0
.end method

.method public d()Lcom/facebook/login/e0;
    .locals 1

    invoke-static {}, Lcom/facebook/login/e0;->d()Lcom/facebook/login/e0;

    move-result-object v0

    if-nez v0, :cond_0

    monitor-enter p0

    :try_start_0
    new-instance v0, Lcom/facebook/login/e0;

    invoke-direct {v0}, Lcom/facebook/login/e0;-><init>()V

    invoke-static {v0}, Lcom/facebook/login/e0;->f(Lcom/facebook/login/e0;)V

    sget-object v0, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_0
    :goto_0
    invoke-static {}, Lcom/facebook/login/e0;->d()Lcom/facebook/login/e0;

    move-result-object v0

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    const-string v0, "instance"

    invoke-static {v0}, Lkotlin/jvm/internal/n;->p(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final g(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    const-string v1, "publish"

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v1, v0, v2, v3}, Lxk/g;->E(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-string v1, "manage"

    invoke-static {p1, v1, v0, v2, v3}, Lxk/g;->E(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {}, Lcom/facebook/login/e0;->e()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 v0, 0x1

    :cond_1
    return v0
.end method
