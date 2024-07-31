.class public final Lvl/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lvl/g;

.field private final b:Lql/a;

.field private final c:Lvl/e;

.field private final d:Lql/r;

.field private e:Lvl/j$b;

.field private f:Lvl/j;

.field private g:I

.field private h:I

.field private i:I

.field private j:Lql/e0;


# direct methods
.method public constructor <init>(Lvl/g;Lql/a;Lvl/e;Lql/r;)V
    .locals 1

    const-string v0, "connectionPool"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "address"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "call"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvl/d;->a:Lvl/g;

    iput-object p2, p0, Lvl/d;->b:Lql/a;

    iput-object p3, p0, Lvl/d;->c:Lvl/e;

    iput-object p4, p0, Lvl/d;->d:Lql/r;

    return-void
.end method

.method private final b(IIIIZ)Lvl/f;
    .locals 14

    move-object v1, p0

    iget-object v0, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v0}, Lvl/e;->R0()Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v0}, Lvl/e;->l()Lvl/f;

    move-result-object v2

    const/4 v0, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_6

    monitor-enter v2

    :try_start_0
    invoke-virtual {v2}, Lvl/f;->p()Z

    move-result v5

    if-nez v5, :cond_1

    invoke-virtual {v2}, Lvl/f;->z()Lql/e0;

    move-result-object v5

    invoke-virtual {v5}, Lql/e0;->a()Lql/a;

    move-result-object v5

    invoke-virtual {v5}, Lql/a;->l()Lql/u;

    move-result-object v5

    invoke-virtual {p0, v5}, Lvl/d;->g(Lql/u;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_0

    :cond_0
    move-object v5, v4

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v5, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v5}, Lvl/e;->x()Ljava/net/Socket;

    move-result-object v5

    :goto_1
    sget-object v6, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v2

    iget-object v6, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v6}, Lvl/e;->l()Lvl/f;

    move-result-object v6

    if-eqz v6, :cond_4

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    move v0, v3

    :goto_2
    if-eqz v0, :cond_3

    return-object v2

    :cond_3
    const-string v0, "Check failed."

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    if-nez v5, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v5}, Lrl/d;->n(Ljava/net/Socket;)V

    :goto_3
    iget-object v5, v1, Lvl/d;->d:Lql/r;

    iget-object v6, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v5, v6, v2}, Lql/r;->k(Lql/e;Lql/j;)V

    goto :goto_4

    :catchall_0
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_6
    :goto_4
    iput v3, v1, Lvl/d;->g:I

    iput v3, v1, Lvl/d;->h:I

    iput v3, v1, Lvl/d;->i:I

    iget-object v2, v1, Lvl/d;->a:Lvl/g;

    iget-object v5, v1, Lvl/d;->b:Lql/a;

    iget-object v6, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v2, v5, v6, v4, v3}, Lvl/g;->a(Lql/a;Lvl/e;Ljava/util/List;Z)Z

    move-result v2

    if-eqz v2, :cond_7

    :goto_5
    iget-object v0, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v0}, Lvl/e;->l()Lvl/f;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    :goto_6
    iget-object v2, v1, Lvl/d;->d:Lql/r;

    iget-object v3, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v2, v3, v0}, Lql/r;->j(Lql/e;Lql/j;)V

    return-object v0

    :cond_7
    iget-object v2, v1, Lvl/d;->j:Lql/e0;

    if-eqz v2, :cond_8

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iput-object v4, v1, Lvl/d;->j:Lql/e0;

    :goto_7
    move-object v5, v4

    goto :goto_8

    :cond_8
    iget-object v2, v1, Lvl/d;->e:Lvl/j$b;

    if-eqz v2, :cond_9

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lvl/j$b;->b()Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, v1, Lvl/d;->e:Lvl/j$b;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lvl/j$b;->c()Lql/e0;

    move-result-object v2

    goto :goto_7

    :cond_9
    iget-object v2, v1, Lvl/d;->f:Lvl/j;

    if-nez v2, :cond_a

    new-instance v2, Lvl/j;

    iget-object v5, v1, Lvl/d;->b:Lql/a;

    iget-object v6, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v6}, Lvl/e;->k()Lql/y;

    move-result-object v6

    invoke-virtual {v6}, Lql/y;->s()Lvl/h;

    move-result-object v6

    iget-object v7, v1, Lvl/d;->c:Lvl/e;

    iget-object v8, v1, Lvl/d;->d:Lql/r;

    invoke-direct {v2, v5, v6, v7, v8}, Lvl/j;-><init>(Lql/a;Lvl/h;Lql/e;Lql/r;)V

    iput-object v2, v1, Lvl/d;->f:Lvl/j;

    :cond_a
    invoke-virtual {v2}, Lvl/j;->c()Lvl/j$b;

    move-result-object v2

    iput-object v2, v1, Lvl/d;->e:Lvl/j$b;

    invoke-virtual {v2}, Lvl/j$b;->a()Ljava/util/List;

    move-result-object v5

    iget-object v6, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v6}, Lvl/e;->R0()Z

    move-result v6

    if-nez v6, :cond_d

    iget-object v6, v1, Lvl/d;->a:Lvl/g;

    iget-object v7, v1, Lvl/d;->b:Lql/a;

    iget-object v8, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v6, v7, v8, v5, v3}, Lvl/g;->a(Lql/a;Lvl/e;Ljava/util/List;Z)Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_5

    :cond_b
    invoke-virtual {v2}, Lvl/j$b;->c()Lql/e0;

    move-result-object v2

    :goto_8
    new-instance v3, Lvl/f;

    iget-object v6, v1, Lvl/d;->a:Lvl/g;

    invoke-direct {v3, v6, v2}, Lvl/f;-><init>(Lvl/g;Lql/e0;)V

    iget-object v6, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v6, v3}, Lvl/e;->A(Lvl/f;)V

    :try_start_1
    iget-object v12, v1, Lvl/d;->c:Lvl/e;

    iget-object v13, v1, Lvl/d;->d:Lql/r;

    move-object v6, v3

    move v7, p1

    move/from16 v8, p2

    move/from16 v9, p3

    move/from16 v10, p4

    move/from16 v11, p5

    invoke-virtual/range {v6 .. v13}, Lvl/f;->f(IIIIZLql/e;Lql/r;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    iget-object v6, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v6, v4}, Lvl/e;->A(Lvl/f;)V

    iget-object v4, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v4}, Lvl/e;->k()Lql/y;

    move-result-object v4

    invoke-virtual {v4}, Lql/y;->s()Lvl/h;

    move-result-object v4

    invoke-virtual {v3}, Lvl/f;->z()Lql/e0;

    move-result-object v6

    invoke-virtual {v4, v6}, Lvl/h;->a(Lql/e0;)V

    iget-object v4, v1, Lvl/d;->a:Lvl/g;

    iget-object v6, v1, Lvl/d;->b:Lql/a;

    iget-object v7, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v4, v6, v7, v5, v0}, Lvl/g;->a(Lql/a;Lvl/e;Ljava/util/List;Z)Z

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v0}, Lvl/e;->l()Lvl/f;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iput-object v2, v1, Lvl/d;->j:Lql/e0;

    invoke-virtual {v3}, Lvl/f;->D()Ljava/net/Socket;

    move-result-object v2

    invoke-static {v2}, Lrl/d;->n(Ljava/net/Socket;)V

    goto/16 :goto_6

    :cond_c
    monitor-enter v3

    :try_start_2
    iget-object v0, v1, Lvl/d;->a:Lvl/g;

    invoke-virtual {v0, v3}, Lvl/g;->e(Lvl/f;)V

    iget-object v0, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v0, v3}, Lvl/e;->c(Lvl/f;)V

    sget-object v0, Lck/v;->a:Lck/v;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v3

    iget-object v0, v1, Lvl/d;->d:Lql/r;

    iget-object v2, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v0, v2, v3}, Lql/r;->j(Lql/e;Lql/j;)V

    return-object v3

    :catchall_1
    move-exception v0

    monitor-exit v3

    throw v0

    :catchall_2
    move-exception v0

    iget-object v2, v1, Lvl/d;->c:Lvl/e;

    invoke-virtual {v2, v4}, Lvl/e;->A(Lvl/f;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    new-instance v0, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v0, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private final c(IIIIZZ)Lvl/f;
    .locals 2

    :goto_0
    invoke-direct/range {p0 .. p5}, Lvl/d;->b(IIIIZ)Lvl/f;

    move-result-object v0

    invoke-virtual {v0, p6}, Lvl/f;->u(Z)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lvl/f;->y()V

    iget-object v0, p0, Lvl/d;->j:Lql/e0;

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lvl/d;->e:Lvl/j$b;

    const/4 v1, 0x1

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lvl/j$b;->b()Z

    move-result v0

    :goto_1
    if-eqz v0, :cond_3

    goto :goto_0

    :cond_3
    iget-object v0, p0, Lvl/d;->f:Lvl/j;

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lvl/j;->a()Z

    move-result v1

    :goto_2
    if-eqz v1, :cond_5

    goto :goto_0

    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "exhausted all routes"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final f()Lql/e0;
    .locals 4

    iget v0, p0, Lvl/d;->g:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gt v0, v2, :cond_4

    iget v0, p0, Lvl/d;->h:I

    if-gt v0, v2, :cond_4

    iget v0, p0, Lvl/d;->i:I

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lvl/d;->c:Lvl/e;

    invoke-virtual {v0}, Lvl/e;->l()Lvl/f;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, Lvl/f;->q()I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_2

    monitor-exit v0

    return-object v1

    :cond_2
    :try_start_1
    invoke-virtual {v0}, Lvl/f;->z()Lql/e0;

    move-result-object v2

    invoke-virtual {v2}, Lql/e0;->a()Lql/a;

    move-result-object v2

    invoke-virtual {v2}, Lql/a;->l()Lql/u;

    move-result-object v2

    invoke-virtual {p0}, Lvl/d;->d()Lql/a;

    move-result-object v3

    invoke-virtual {v3}, Lql/a;->l()Lql/u;

    move-result-object v3

    invoke-static {v2, v3}, Lrl/d;->j(Lql/u;Lql/u;)Z

    move-result v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v2, :cond_3

    monitor-exit v0

    return-object v1

    :cond_3
    :try_start_2
    invoke-virtual {v0}, Lvl/f;->z()Lql/e0;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1

    :cond_4
    :goto_0
    return-object v1
.end method


# virtual methods
.method public final a(Lql/y;Lwl/g;)Lwl/d;
    .locals 8

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chain"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p2}, Lwl/g;->e()I

    move-result v2

    invoke-virtual {p2}, Lwl/g;->g()I

    move-result v3

    invoke-virtual {p2}, Lwl/g;->i()I

    move-result v4

    invoke-virtual {p1}, Lql/y;->x()I

    move-result v5

    invoke-virtual {p1}, Lql/y;->E()Z

    move-result v6

    invoke-virtual {p2}, Lwl/g;->h()Lql/a0;

    move-result-object v0

    invoke-virtual {v0}, Lql/a0;->g()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GET"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    move v7, v0

    move-object v1, p0

    invoke-direct/range {v1 .. v7}, Lvl/d;->c(IIIIZZ)Lvl/f;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lvl/f;->w(Lql/y;Lwl/g;)Lwl/d;

    move-result-object p1
    :try_end_0
    .catch Lvl/i; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p0, p1}, Lvl/d;->h(Ljava/io/IOException;)V

    new-instance p2, Lvl/i;

    invoke-direct {p2, p1}, Lvl/i;-><init>(Ljava/io/IOException;)V

    throw p2

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Lvl/i;->c()Ljava/io/IOException;

    move-result-object p2

    invoke-virtual {p0, p2}, Lvl/d;->h(Ljava/io/IOException;)V

    throw p1
.end method

.method public final d()Lql/a;
    .locals 1

    iget-object v0, p0, Lvl/d;->b:Lql/a;

    return-object v0
.end method

.method public final e()Z
    .locals 3

    iget v0, p0, Lvl/d;->g:I

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget v0, p0, Lvl/d;->h:I

    if-nez v0, :cond_0

    iget v0, p0, Lvl/d;->i:I

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lvl/d;->j:Lql/e0;

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    return v2

    :cond_1
    invoke-direct {p0}, Lvl/d;->f()Lql/e0;

    move-result-object v0

    if-eqz v0, :cond_2

    iput-object v0, p0, Lvl/d;->j:Lql/e0;

    return v2

    :cond_2
    iget-object v0, p0, Lvl/d;->e:Lvl/j$b;

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lvl/j$b;->b()Z

    move-result v0

    if-ne v0, v2, :cond_4

    move v1, v2

    :cond_4
    :goto_0
    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-object v0, p0, Lvl/d;->f:Lvl/j;

    if-nez v0, :cond_6

    return v2

    :cond_6
    invoke-virtual {v0}, Lvl/j;->a()Z

    move-result v0

    return v0
.end method

.method public final g(Lql/u;)Z
    .locals 3

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvl/d;->b:Lql/a;

    invoke-virtual {v0}, Lql/a;->l()Lql/u;

    move-result-object v0

    invoke-virtual {p1}, Lql/u;->m()I

    move-result v1

    invoke-virtual {v0}, Lql/u;->m()I

    move-result v2

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Lql/u;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lql/u;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final h(Ljava/io/IOException;)V
    .locals 2

    const-string v0, "e"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lvl/d;->j:Lql/e0;

    instance-of v0, p1, Lyl/n;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lyl/n;

    iget-object v0, v0, Lyl/n;->a:Lyl/b;

    sget-object v1, Lyl/b;->REFUSED_STREAM:Lyl/b;

    if-ne v0, v1, :cond_0

    iget p1, p0, Lvl/d;->g:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lvl/d;->g:I

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lyl/a;

    if-eqz p1, :cond_1

    iget p1, p0, Lvl/d;->h:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lvl/d;->h:I

    goto :goto_0

    :cond_1
    iget p1, p0, Lvl/d;->i:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lvl/d;->i:I

    :goto_0
    return-void
.end method
