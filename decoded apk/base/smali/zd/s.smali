.class public Lzd/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzd/s$c;,
        Lzd/s$b;,
        Lzd/s$a;,
        Lzd/s$e;,
        Lzd/s$d;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lqd/r;",
            "Lzd/s$a;",
            ">;"
        }
    .end annotation
.end field

.field private c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lqd/s;",
            "Lzd/s$b;",
            ">;"
        }
    .end annotation
.end field

.field private d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lqd/u;",
            "Lzd/s$c;",
            ">;"
        }
    .end annotation
.end field

.field private e:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lqd/v;",
            "Lzd/s$e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;)V
    .locals 1
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/a;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lzd/s;->b:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lzd/s;->c:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lzd/s;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lzd/s;->e:Ljava/util/Map;

    iput-object p1, p0, Lzd/s;->a:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(Lzd/s$b;Lde/i;)V
    .locals 0

    invoke-static {p0, p1}, Lzd/s;->j(Lzd/s$b;Lde/i;)V

    return-void
.end method

.method public static synthetic b(Lzd/s$a;Lde/i;Lde/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lzd/s;->i(Lzd/s$a;Lde/i;Lde/a;)V

    return-void
.end method

.method public static synthetic c(Lzd/s$e;Lde/i;)V
    .locals 0

    invoke-static {p0, p1}, Lzd/s;->h(Lzd/s$e;Lde/i;)V

    return-void
.end method

.method public static synthetic d(Lzd/s$c;Lde/i;Lqd/t$b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lzd/s;->g(Lzd/s$c;Lde/i;Lqd/t$b;)V

    return-void
.end method

.method private static synthetic g(Lzd/s$c;Lde/i;Lqd/t$b;)V
    .locals 0

    invoke-virtual {p0}, Lzd/s$c;->b()Lqd/u;

    const/4 p0, 0x0

    throw p0
.end method

.method private static synthetic h(Lzd/s$e;Lde/i;)V
    .locals 0

    invoke-virtual {p0}, Lzd/s$e;->b()Lqd/v;

    const/4 p0, 0x0

    throw p0
.end method

.method private static synthetic i(Lzd/s$a;Lde/i;Lde/a;)V
    .locals 0

    invoke-virtual {p0}, Lzd/s$a;->b()Lqd/r;

    const/4 p0, 0x0

    throw p0
.end method

.method private static synthetic j(Lzd/s$b;Lde/i;)V
    .locals 0

    invoke-virtual {p0}, Lzd/s$b;->b()Lqd/s;

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public e(Lde/i;Lqd/t$b;)V
    .locals 4

    iget-object v0, p0, Lzd/s;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzd/s$c;

    iget-object v2, p0, Lzd/s;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2}, Lzd/s$d;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lzd/o;

    invoke-direct {v3, v1, p1, p2}, Lzd/o;-><init>(Lzd/s$c;Lde/i;Lqd/t$b;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public f(Lde/i;)V
    .locals 4

    iget-object v0, p0, Lzd/s;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzd/s$e;

    iget-object v2, p0, Lzd/s;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2}, Lzd/s$d;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lzd/p;

    invoke-direct {v3, v1, p1}, Lzd/p;-><init>(Lzd/s$e;Lde/i;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public k(Lde/i;Lde/a;)V
    .locals 4

    iget-object v0, p0, Lzd/s;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzd/s$a;

    iget-object v2, p0, Lzd/s;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2}, Lzd/s$d;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lzd/r;

    invoke-direct {v3, v1, p1, p2}, Lzd/r;-><init>(Lzd/s$a;Lde/i;Lde/a;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public l(Lde/i;)V
    .locals 4

    iget-object v0, p0, Lzd/s;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzd/s$b;

    iget-object v2, p0, Lzd/s;->a:Ljava/util/concurrent/Executor;

    invoke-virtual {v1, v2}, Lzd/s$d;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    move-result-object v2

    new-instance v3, Lzd/q;

    invoke-direct {v3, v1, p1}, Lzd/q;-><init>(Lzd/s$b;Lde/i;)V

    invoke-interface {v2, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public m()V
    .locals 1

    iget-object v0, p0, Lzd/s;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lzd/s;->e:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lzd/s;->d:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    iget-object v0, p0, Lzd/s;->c:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method
