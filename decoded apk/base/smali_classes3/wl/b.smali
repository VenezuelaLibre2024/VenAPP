.class public final Lwl/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lql/v;


# instance fields
.field private final a:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lwl/b;->a:Z

    return-void
.end method

.method private final b(I)Z
    .locals 3

    const/16 v0, 0x64

    const/4 v1, 0x1

    if-ne p1, v0, :cond_0

    goto :goto_1

    :cond_0
    const/16 v0, 0x66

    const/4 v2, 0x0

    if-gt v0, p1, :cond_1

    const/16 v0, 0xc8

    if-ge p1, v0, :cond_1

    move p1, v1

    goto :goto_0

    :cond_1
    move p1, v2

    :goto_0
    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    return v1
.end method


# virtual methods
.method public a(Lql/v$a;)Lql/c0;
    .locals 13

    const-string v0, "Connection"

    const-string v1, "close"

    const-string v2, "chain"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lwl/g;

    invoke-virtual {p1}, Lwl/g;->f()Lvl/c;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lwl/g;->h()Lql/a0;

    move-result-object p1

    invoke-virtual {p1}, Lql/a0;->a()Lql/b0;

    move-result-object v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x0

    :try_start_0
    invoke-virtual {v2, p1}, Lvl/c;->u(Lql/a0;)V

    invoke-virtual {p1}, Lql/a0;->g()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lwl/f;->a(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_3

    if-eqz v3, :cond_3

    const-string v9, "100-continue"

    const-string v10, "Expect"

    invoke-virtual {p1, v10}, Lql/a0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10, v7}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-eqz v9, :cond_0

    invoke-virtual {v2}, Lvl/c;->f()V

    invoke-virtual {v2, v7}, Lvl/c;->q(Z)Lql/c0$a;

    move-result-object v9
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-virtual {v2}, Lvl/c;->s()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    move v10, v6

    goto :goto_0

    :catch_0
    move-exception v3

    move v10, v7

    goto :goto_2

    :cond_0
    move v10, v7

    move-object v9, v8

    :goto_0
    if-nez v9, :cond_2

    :try_start_2
    invoke-virtual {v3}, Lql/b0;->d()Z

    move-result v11

    if-eqz v11, :cond_1

    invoke-virtual {v2}, Lvl/c;->f()V

    invoke-virtual {v2, p1, v7}, Lvl/c;->c(Lql/a0;Z)Ldm/v;

    move-result-object v11

    invoke-static {v11}, Ldm/l;->a(Ldm/v;)Ldm/c;

    move-result-object v11

    invoke-virtual {v3, v11}, Lql/b0;->f(Ldm/c;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v2, p1, v6}, Lvl/c;->c(Lql/a0;Z)Ldm/v;

    move-result-object v11

    invoke-static {v11}, Ldm/l;->a(Ldm/v;)Ldm/c;

    move-result-object v11

    invoke-virtual {v3, v11}, Lql/b0;->f(Ldm/c;)V

    invoke-interface {v11}, Ldm/v;->close()V

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lvl/c;->o()V

    invoke-virtual {v2}, Lvl/c;->h()Lvl/f;

    move-result-object v11

    invoke-virtual {v11}, Lvl/f;->v()Z

    move-result v11

    if-nez v11, :cond_4

    invoke-virtual {v2}, Lvl/c;->n()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :cond_3
    :try_start_3
    invoke-virtual {v2}, Lvl/c;->o()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    move v10, v7

    move-object v9, v8

    :cond_4
    :goto_1
    if-eqz v3, :cond_5

    :try_start_4
    invoke-virtual {v3}, Lql/b0;->d()Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-virtual {v2}, Lvl/c;->e()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    :cond_6
    move-object v3, v8

    goto :goto_3

    :catch_1
    move-exception v3

    goto :goto_2

    :catch_2
    move-exception v3

    move v10, v7

    move-object v9, v8

    :goto_2
    instance-of v11, v3, Lyl/a;

    if-nez v11, :cond_13

    invoke-virtual {v2}, Lvl/c;->k()Z

    move-result v11

    if-eqz v11, :cond_12

    :goto_3
    if-nez v9, :cond_7

    :try_start_5
    invoke-virtual {v2, v6}, Lvl/c;->q(Z)Lql/c0$a;

    move-result-object v9

    invoke-static {v9}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    if-eqz v10, :cond_7

    invoke-virtual {v2}, Lvl/c;->s()V

    move v10, v6

    :cond_7
    invoke-virtual {v9, p1}, Lql/c0$a;->s(Lql/a0;)Lql/c0$a;

    move-result-object v9

    invoke-virtual {v2}, Lvl/c;->h()Lvl/f;

    move-result-object v11

    invoke-virtual {v11}, Lvl/f;->r()Lql/s;

    move-result-object v11

    invoke-virtual {v9, v11}, Lql/c0$a;->j(Lql/s;)Lql/c0$a;

    move-result-object v9

    invoke-virtual {v9, v4, v5}, Lql/c0$a;->t(J)Lql/c0$a;

    move-result-object v9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v11

    invoke-virtual {v9, v11, v12}, Lql/c0$a;->r(J)Lql/c0$a;

    move-result-object v9

    invoke-virtual {v9}, Lql/c0$a;->c()Lql/c0;

    move-result-object v9

    invoke-virtual {v9}, Lql/c0;->g()I

    move-result v11

    invoke-direct {p0, v11}, Lwl/b;->b(I)Z

    move-result v12

    if-eqz v12, :cond_9

    invoke-virtual {v2, v6}, Lvl/c;->q(Z)Lql/c0$a;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    if-eqz v10, :cond_8

    invoke-virtual {v2}, Lvl/c;->s()V

    :cond_8
    invoke-virtual {v6, p1}, Lql/c0$a;->s(Lql/a0;)Lql/c0$a;

    move-result-object p1

    invoke-virtual {v2}, Lvl/c;->h()Lvl/f;

    move-result-object v6

    invoke-virtual {v6}, Lvl/f;->r()Lql/s;

    move-result-object v6

    invoke-virtual {p1, v6}, Lql/c0$a;->j(Lql/s;)Lql/c0$a;

    move-result-object p1

    invoke-virtual {p1, v4, v5}, Lql/c0$a;->t(J)Lql/c0$a;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    invoke-virtual {p1, v4, v5}, Lql/c0$a;->r(J)Lql/c0$a;

    move-result-object p1

    invoke-virtual {p1}, Lql/c0$a;->c()Lql/c0;

    move-result-object v9

    invoke-virtual {v9}, Lql/c0;->g()I

    move-result v11

    :cond_9
    invoke-virtual {v2, v9}, Lvl/c;->r(Lql/c0;)V

    iget-boolean p1, p0, Lwl/b;->a:Z

    if-eqz p1, :cond_a

    const/16 p1, 0x65

    if-ne v11, p1, :cond_a

    invoke-virtual {v9}, Lql/c0;->B()Lql/c0$a;

    move-result-object p1

    sget-object v4, Lrl/d;->c:Lql/d0;

    invoke-virtual {p1, v4}, Lql/c0$a;->b(Lql/d0;)Lql/c0$a;

    move-result-object p1

    :goto_4
    invoke-virtual {p1}, Lql/c0$a;->c()Lql/c0;

    move-result-object p1

    goto :goto_5

    :cond_a
    invoke-virtual {v9}, Lql/c0;->B()Lql/c0$a;

    move-result-object p1

    invoke-virtual {v2, v9}, Lvl/c;->p(Lql/c0;)Lql/d0;

    move-result-object v4

    invoke-virtual {p1, v4}, Lql/c0$a;->b(Lql/d0;)Lql/c0$a;

    move-result-object p1

    goto :goto_4

    :goto_5
    invoke-virtual {p1}, Lql/c0;->O()Lql/a0;

    move-result-object v4

    invoke-virtual {v4, v0}, Lql/a0;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4, v7}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-nez v4, :cond_b

    const/4 v4, 0x2

    invoke-static {p1, v0, v8, v4, v8}, Lql/c0;->n(Lql/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v7}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_c

    :cond_b
    invoke-virtual {v2}, Lvl/c;->n()V

    :cond_c
    const/16 v0, 0xcc

    if-eq v11, v0, :cond_d

    const/16 v0, 0xcd

    if-ne v11, v0, :cond_10

    :cond_d
    invoke-virtual {p1}, Lql/c0;->a()Lql/d0;

    move-result-object v0

    if-nez v0, :cond_e

    const-wide/16 v0, -0x1

    goto :goto_6

    :cond_e
    invoke-virtual {v0}, Lql/d0;->b()J

    move-result-wide v0

    :goto_6
    const-wide/16 v4, 0x0

    cmp-long v0, v0, v4

    if-lez v0, :cond_10

    new-instance v0, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HTTP "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " had non-zero Content-Length: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lql/c0;->a()Lql/d0;

    move-result-object p1

    if-nez p1, :cond_f

    goto :goto_7

    :cond_f
    invoke-virtual {p1}, Lql/d0;->b()J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    :goto_7
    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    :cond_10
    return-object p1

    :catch_3
    move-exception p1

    if-eqz v3, :cond_11

    invoke-static {v3, p1}, Lck/a;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw v3

    :cond_11
    throw p1

    :cond_12
    throw v3

    :cond_13
    throw v3
.end method
