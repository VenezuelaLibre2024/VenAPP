.class public Lo6/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Li6/e;

.field private final c:Lp6/d;

.field private final d:Lo6/x;

.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Lq6/b;

.field private final g:Lr6/a;

.field private final h:Lr6/a;

.field private final i:Lp6/c;


# direct methods
.method public constructor <init>(Landroid/content/Context;Li6/e;Lp6/d;Lo6/x;Ljava/util/concurrent/Executor;Lq6/b;Lr6/a;Lr6/a;Lp6/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo6/r;->a:Landroid/content/Context;

    iput-object p2, p0, Lo6/r;->b:Li6/e;

    iput-object p3, p0, Lo6/r;->c:Lp6/d;

    iput-object p4, p0, Lo6/r;->d:Lo6/x;

    iput-object p5, p0, Lo6/r;->e:Ljava/util/concurrent/Executor;

    iput-object p6, p0, Lo6/r;->f:Lq6/b;

    iput-object p7, p0, Lo6/r;->g:Lr6/a;

    iput-object p8, p0, Lo6/r;->h:Lr6/a;

    iput-object p9, p0, Lo6/r;->i:Lp6/c;

    return-void
.end method

.method public static synthetic a(Lo6/r;Lh6/p;ILjava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lo6/r;->t(Lh6/p;ILjava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic b(Lo6/r;Lh6/p;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0, p1}, Lo6/r;->l(Lh6/p;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lo6/r;Ljava/util/Map;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lo6/r;->q(Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lo6/r;Lh6/p;)Ljava/lang/Iterable;
    .locals 0

    invoke-direct {p0, p1}, Lo6/r;->m(Lh6/p;)Ljava/lang/Iterable;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lo6/r;Ljava/lang/Iterable;Lh6/p;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lo6/r;->n(Ljava/lang/Iterable;Lh6/p;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lo6/r;Lh6/p;J)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lo6/r;->r(Lh6/p;J)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lo6/r;Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lo6/r;->o(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lo6/r;Lh6/p;I)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lo6/r;->s(Lh6/p;I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lo6/r;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0}, Lo6/r;->p()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic l(Lh6/p;)Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lo6/r;->c:Lp6/d;

    invoke-interface {v0, p1}, Lp6/d;->k0(Lh6/p;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private synthetic m(Lh6/p;)Ljava/lang/Iterable;
    .locals 1

    iget-object v0, p0, Lo6/r;->c:Lp6/d;

    invoke-interface {v0, p1}, Lp6/d;->K(Lh6/p;)Ljava/lang/Iterable;

    move-result-object p1

    return-object p1
.end method

.method private synthetic n(Ljava/lang/Iterable;Lh6/p;J)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lo6/r;->c:Lp6/d;

    invoke-interface {v0, p1}, Lp6/d;->o0(Ljava/lang/Iterable;)V

    iget-object p1, p0, Lo6/r;->c:Lp6/d;

    iget-object v0, p0, Lo6/r;->g:Lr6/a;

    invoke-interface {v0}, Lr6/a;->a()J

    move-result-wide v0

    add-long/2addr v0, p3

    invoke-interface {p1, p2, v0, v1}, Lp6/d;->f1(Lh6/p;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic o(Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo6/r;->c:Lp6/d;

    invoke-interface {v0, p1}, Lp6/d;->v(Ljava/lang/Iterable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic p()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo6/r;->i:Lp6/c;

    invoke-interface {v0}, Lp6/c;->a()V

    const/4 v0, 0x0

    return-object v0
.end method

.method private synthetic q(Ljava/util/Map;)Ljava/lang/Object;
    .locals 5

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    iget-object v1, p0, Lo6/r;->i:Lp6/c;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    int-to-long v2, v2

    sget-object v4, Lk6/c$b;->INVALID_PAYLOD:Lk6/c$b;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v1, v2, v3, v4, v0}, Lp6/c;->f(JLk6/c$b;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic r(Lh6/p;J)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lo6/r;->c:Lp6/d;

    iget-object v1, p0, Lo6/r;->g:Lr6/a;

    invoke-interface {v1}, Lr6/a;->a()J

    move-result-wide v1

    add-long/2addr v1, p2

    invoke-interface {v0, p1, v1, v2}, Lp6/d;->f1(Lh6/p;J)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic s(Lh6/p;I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo6/r;->d:Lo6/x;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, Lo6/x;->b(Lh6/p;I)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic t(Lh6/p;ILjava/lang/Runnable;)V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lo6/r;->f:Lq6/b;

    iget-object v1, p0, Lo6/r;->c:Lp6/d;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lo6/i;

    invoke-direct {v2, v1}, Lo6/i;-><init>(Lp6/d;)V

    invoke-interface {v0, v2}, Lq6/b;->b(Lq6/b$a;)Ljava/lang/Object;

    invoke-virtual {p0}, Lo6/r;->k()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lo6/r;->f:Lq6/b;

    new-instance v1, Lo6/j;

    invoke-direct {v1, p0, p1, p2}, Lo6/j;-><init>(Lo6/r;Lh6/p;I)V

    invoke-interface {v0, v1}, Lq6/b;->b(Lq6/b$a;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lo6/r;->u(Lh6/p;I)Li6/g;
    :try_end_0
    .catch Lq6/a; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :catch_0
    :try_start_1
    iget-object v0, p0, Lo6/r;->d:Lo6/x;

    add-int/lit8 p2, p2, 0x1

    invoke-interface {v0, p1, p2}, Lo6/x;->b(Lh6/p;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    return-void

    :goto_1
    invoke-interface {p3}, Ljava/lang/Runnable;->run()V

    throw p1
.end method


# virtual methods
.method public j(Li6/m;)Lh6/i;
    .locals 4

    iget-object v0, p0, Lo6/r;->f:Lq6/b;

    iget-object v1, p0, Lo6/r;->i:Lp6/c;

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lo6/h;

    invoke-direct {v2, v1}, Lo6/h;-><init>(Lp6/c;)V

    invoke-interface {v0, v2}, Lq6/b;->b(Lq6/b$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk6/a;

    invoke-static {}, Lh6/i;->a()Lh6/i$a;

    move-result-object v1

    iget-object v2, p0, Lo6/r;->g:Lr6/a;

    invoke-interface {v2}, Lr6/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lh6/i$a;->i(J)Lh6/i$a;

    move-result-object v1

    iget-object v2, p0, Lo6/r;->h:Lr6/a;

    invoke-interface {v2}, Lr6/a;->a()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lh6/i$a;->k(J)Lh6/i$a;

    move-result-object v1

    const-string v2, "GDT_CLIENT_METRICS"

    invoke-virtual {v1, v2}, Lh6/i$a;->j(Ljava/lang/String;)Lh6/i$a;

    move-result-object v1

    new-instance v2, Lh6/h;

    const-string v3, "proto"

    invoke-static {v3}, Lf6/b;->b(Ljava/lang/String;)Lf6/b;

    move-result-object v3

    invoke-virtual {v0}, Lk6/a;->f()[B

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lh6/h;-><init>(Lf6/b;[B)V

    invoke-virtual {v1, v2}, Lh6/i$a;->h(Lh6/h;)Lh6/i$a;

    move-result-object v0

    invoke-virtual {v0}, Lh6/i$a;->d()Lh6/i;

    move-result-object v0

    invoke-interface {p1, v0}, Li6/m;->a(Lh6/i;)Lh6/i;

    move-result-object p1

    return-object p1
.end method

.method k()Z
    .locals 2

    iget-object v0, p0, Lo6/r;->a:Landroid/content/Context;

    const-string v1, "connectivity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/net/ConnectivityManager;

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public u(Lh6/p;I)Li6/g;
    .locals 11

    iget-object v0, p0, Lo6/r;->b:Li6/e;

    invoke-virtual {p1}, Lh6/p;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Li6/e;->get(Ljava/lang/String;)Li6/m;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Li6/g;->e(J)Li6/g;

    move-result-object v3

    :cond_0
    :goto_0
    move-wide v8, v1

    :cond_1
    :goto_1
    iget-object v1, p0, Lo6/r;->f:Lq6/b;

    new-instance v2, Lo6/k;

    invoke-direct {v2, p0, p1}, Lo6/k;-><init>(Lo6/r;Lh6/p;)V

    invoke-interface {v1, v2}, Lq6/b;->b(Lq6/b$a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lo6/r;->f:Lq6/b;

    new-instance v2, Lo6/l;

    invoke-direct {v2, p0, p1}, Lo6/l;-><init>(Lo6/r;Lh6/p;)V

    invoke-interface {v1, v2}, Lq6/b;->b(Lq6/b$a;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    return-object v3

    :cond_2
    if-nez v0, :cond_3

    const-string v1, "Uploader"

    const-string v2, "Unknown backend for %s, deleting event batch for it..."

    invoke-static {v1, v2, p1}, Ll6/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {}, Li6/g;->a()Li6/g;

    move-result-object v1

    :goto_2
    move-object v3, v1

    goto :goto_4

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lp6/k;

    invoke-virtual {v3}, Lp6/k;->b()Lh6/i;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {p1}, Lh6/p;->e()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p0, v0}, Lo6/r;->j(Li6/m;)Lh6/i;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-static {}, Li6/f;->a()Li6/f$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Li6/f$a;->b(Ljava/lang/Iterable;)Li6/f$a;

    move-result-object v1

    invoke-virtual {p1}, Lh6/p;->c()[B

    move-result-object v2

    invoke-virtual {v1, v2}, Li6/f$a;->c([B)Li6/f$a;

    move-result-object v1

    invoke-virtual {v1}, Li6/f$a;->a()Li6/f;

    move-result-object v1

    invoke-interface {v0, v1}, Li6/m;->b(Li6/f;)Li6/g;

    move-result-object v1

    goto :goto_2

    :goto_4
    invoke-virtual {v3}, Li6/g;->c()Li6/g$a;

    move-result-object v1

    sget-object v2, Li6/g$a;->TRANSIENT_ERROR:Li6/g$a;

    const/4 v10, 0x1

    if-ne v1, v2, :cond_6

    iget-object v0, p0, Lo6/r;->f:Lq6/b;

    new-instance v1, Lo6/m;

    move-object v4, v1

    move-object v5, p0

    move-object v7, p1

    invoke-direct/range {v4 .. v9}, Lo6/m;-><init>(Lo6/r;Ljava/lang/Iterable;Lh6/p;J)V

    invoke-interface {v0, v1}, Lq6/b;->b(Lq6/b$a;)Ljava/lang/Object;

    iget-object v0, p0, Lo6/r;->d:Lo6/x;

    add-int/2addr p2, v10

    invoke-interface {v0, p1, p2, v10}, Lo6/x;->a(Lh6/p;IZ)V

    return-object v3

    :cond_6
    iget-object v1, p0, Lo6/r;->f:Lq6/b;

    new-instance v2, Lo6/n;

    invoke-direct {v2, p0, v6}, Lo6/n;-><init>(Lo6/r;Ljava/lang/Iterable;)V

    invoke-interface {v1, v2}, Lq6/b;->b(Lq6/b$a;)Ljava/lang/Object;

    invoke-virtual {v3}, Li6/g;->c()Li6/g$a;

    move-result-object v1

    sget-object v2, Li6/g$a;->OK:Li6/g$a;

    if-ne v1, v2, :cond_7

    invoke-virtual {v3}, Li6/g;->b()J

    move-result-wide v1

    invoke-static {v8, v9, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-virtual {p1}, Lh6/p;->e()Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object v4, p0, Lo6/r;->f:Lq6/b;

    new-instance v5, Lo6/o;

    invoke-direct {v5, p0}, Lo6/o;-><init>(Lo6/r;)V

    invoke-interface {v4, v5}, Lq6/b;->b(Lq6/b$a;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_7
    invoke-virtual {v3}, Li6/g;->c()Li6/g$a;

    move-result-object v1

    sget-object v2, Li6/g$a;->INVALID_PAYLOAD:Li6/g$a;

    if-ne v1, v2, :cond_1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lp6/k;

    invoke-virtual {v4}, Lp6/k;->b()Lh6/i;

    move-result-object v4

    invoke-virtual {v4}, Lh6/i;->j()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_6

    :cond_8
    invoke-interface {v1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    add-int/2addr v5, v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :goto_6
    invoke-interface {v1, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_5

    :cond_9
    iget-object v2, p0, Lo6/r;->f:Lq6/b;

    new-instance v4, Lo6/p;

    invoke-direct {v4, p0, v1}, Lo6/p;-><init>(Lo6/r;Ljava/util/Map;)V

    invoke-interface {v2, v4}, Lq6/b;->b(Lq6/b$a;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_a
    iget-object p2, p0, Lo6/r;->f:Lq6/b;

    new-instance v0, Lo6/q;

    invoke-direct {v0, p0, p1, v8, v9}, Lo6/q;-><init>(Lo6/r;Lh6/p;J)V

    invoke-interface {p2, v0}, Lq6/b;->b(Lq6/b$a;)Ljava/lang/Object;

    return-object v3
.end method

.method public v(Lh6/p;ILjava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lo6/r;->e:Ljava/util/concurrent/Executor;

    new-instance v1, Lo6/g;

    invoke-direct {v1, p0, p1, p2, p3}, Lo6/g;-><init>(Lo6/r;Lh6/p;ILjava/lang/Runnable;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
