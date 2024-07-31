.class public final Lwl/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lql/v;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwl/j$a;
    }
.end annotation


# static fields
.field public static final b:Lwl/j$a;


# instance fields
.field private final a:Lql/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lwl/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwl/j$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lwl/j;->b:Lwl/j$a;

    return-void
.end method

.method public constructor <init>(Lql/y;)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwl/j;->a:Lql/y;

    return-void
.end method

.method private final b(Lql/c0;Ljava/lang/String;)Lql/a0;
    .locals 8

    iget-object v0, p0, Lwl/j;->a:Lql/y;

    invoke-virtual {v0}, Lql/y;->q()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    const-string v0, "Location"

    const/4 v2, 0x2

    invoke-static {p1, v0, v1, v2, v1}, Lql/c0;->n(Lql/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p1}, Lql/c0;->O()Lql/a0;

    move-result-object v2

    invoke-virtual {v2}, Lql/a0;->i()Lql/u;

    move-result-object v2

    invoke-virtual {v2, v0}, Lql/u;->p(Ljava/lang/String;)Lql/u;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    invoke-virtual {v0}, Lql/u;->q()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lql/c0;->O()Lql/a0;

    move-result-object v3

    invoke-virtual {v3}, Lql/a0;->i()Lql/u;

    move-result-object v3

    invoke-virtual {v3}, Lql/u;->q()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, p0, Lwl/j;->a:Lql/y;

    invoke-virtual {v2}, Lql/y;->r()Z

    move-result v2

    if-nez v2, :cond_3

    return-object v1

    :cond_3
    invoke-virtual {p1}, Lql/c0;->O()Lql/a0;

    move-result-object v2

    invoke-virtual {v2}, Lql/a0;->h()Lql/a0$a;

    move-result-object v2

    invoke-static {p2}, Lwl/f;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {p1}, Lql/c0;->g()I

    move-result v3

    sget-object v4, Lwl/f;->a:Lwl/f;

    invoke-virtual {v4, p2}, Lwl/f;->c(Ljava/lang/String;)Z

    move-result v5

    const/16 v6, 0x133

    const/16 v7, 0x134

    if-nez v5, :cond_5

    if-eq v3, v7, :cond_5

    if-ne v3, v6, :cond_4

    goto :goto_0

    :cond_4
    const/4 v5, 0x0

    goto :goto_1

    :cond_5
    :goto_0
    const/4 v5, 0x1

    :goto_1
    invoke-virtual {v4, p2}, Lwl/f;->b(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_6

    if-eq v3, v7, :cond_6

    if-eq v3, v6, :cond_6

    const-string p2, "GET"

    goto :goto_2

    :cond_6
    if-eqz v5, :cond_7

    invoke-virtual {p1}, Lql/c0;->O()Lql/a0;

    move-result-object v1

    invoke-virtual {v1}, Lql/a0;->a()Lql/b0;

    move-result-object v1

    :cond_7
    :goto_2
    invoke-virtual {v2, p2, v1}, Lql/a0$a;->f(Ljava/lang/String;Lql/b0;)Lql/a0$a;

    if-nez v5, :cond_8

    const-string p2, "Transfer-Encoding"

    invoke-virtual {v2, p2}, Lql/a0$a;->j(Ljava/lang/String;)Lql/a0$a;

    const-string p2, "Content-Length"

    invoke-virtual {v2, p2}, Lql/a0$a;->j(Ljava/lang/String;)Lql/a0$a;

    const-string p2, "Content-Type"

    invoke-virtual {v2, p2}, Lql/a0$a;->j(Ljava/lang/String;)Lql/a0$a;

    :cond_8
    invoke-virtual {p1}, Lql/c0;->O()Lql/a0;

    move-result-object p1

    invoke-virtual {p1}, Lql/a0;->i()Lql/u;

    move-result-object p1

    invoke-static {p1, v0}, Lrl/d;->j(Lql/u;Lql/u;)Z

    move-result p1

    if-nez p1, :cond_9

    const-string p1, "Authorization"

    invoke-virtual {v2, p1}, Lql/a0$a;->j(Ljava/lang/String;)Lql/a0$a;

    :cond_9
    invoke-virtual {v2, v0}, Lql/a0$a;->p(Lql/u;)Lql/a0$a;

    move-result-object p1

    invoke-virtual {p1}, Lql/a0$a;->b()Lql/a0;

    move-result-object p1

    return-object p1
.end method

.method private final c(Lql/c0;Lvl/c;)Lql/a0;
    .locals 5

    const/4 v0, 0x0

    if-nez p2, :cond_0

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Lvl/c;->h()Lvl/f;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lvl/f;->z()Lql/e0;

    move-result-object v1

    :goto_1
    invoke-virtual {p1}, Lql/c0;->g()I

    move-result v2

    invoke-virtual {p1}, Lql/c0;->O()Lql/a0;

    move-result-object v3

    invoke-virtual {v3}, Lql/a0;->g()Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x133

    if-eq v2, v4, :cond_11

    const/16 v4, 0x134

    if-eq v2, v4, :cond_11

    const/16 v4, 0x191

    if-eq v2, v4, :cond_10

    const/16 v4, 0x1a5

    if-eq v2, v4, :cond_c

    const/16 p2, 0x1f7

    if-eq v2, p2, :cond_9

    const/16 p2, 0x197

    if-eq v2, p2, :cond_7

    const/16 p2, 0x198

    if-eq v2, p2, :cond_2

    packed-switch v2, :pswitch_data_0

    return-object v0

    :cond_2
    iget-object v1, p0, Lwl/j;->a:Lql/y;

    invoke-virtual {v1}, Lql/y;->E()Z

    move-result v1

    if-nez v1, :cond_3

    return-object v0

    :cond_3
    invoke-virtual {p1}, Lql/c0;->O()Lql/a0;

    move-result-object v1

    invoke-virtual {v1}, Lql/a0;->a()Lql/b0;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lql/b0;->e()Z

    move-result v1

    if-eqz v1, :cond_4

    return-object v0

    :cond_4
    invoke-virtual {p1}, Lql/c0;->E()Lql/c0;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lql/c0;->g()I

    move-result v1

    if-ne v1, p2, :cond_5

    return-object v0

    :cond_5
    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lwl/j;->g(Lql/c0;I)I

    move-result p2

    if-lez p2, :cond_6

    return-object v0

    :cond_6
    invoke-virtual {p1}, Lql/c0;->O()Lql/a0;

    move-result-object p1

    return-object p1

    :cond_7
    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lql/e0;->b()Ljava/net/Proxy;

    move-result-object p2

    invoke-virtual {p2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object p2

    sget-object v0, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne p2, v0, :cond_8

    iget-object p2, p0, Lwl/j;->a:Lql/y;

    invoke-virtual {p2}, Lql/y;->B()Lql/b;

    move-result-object p2

    invoke-interface {p2, v1, p1}, Lql/b;->a(Lql/e0;Lql/c0;)Lql/a0;

    move-result-object p1

    return-object p1

    :cond_8
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Received HTTP_PROXY_AUTH (407) code while not using proxy"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    invoke-virtual {p1}, Lql/c0;->E()Lql/c0;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lql/c0;->g()I

    move-result v1

    if-ne v1, p2, :cond_a

    return-object v0

    :cond_a
    const p2, 0x7fffffff

    invoke-direct {p0, p1, p2}, Lwl/j;->g(Lql/c0;I)I

    move-result p2

    if-nez p2, :cond_b

    invoke-virtual {p1}, Lql/c0;->O()Lql/a0;

    move-result-object p1

    return-object p1

    :cond_b
    return-object v0

    :cond_c
    invoke-virtual {p1}, Lql/c0;->O()Lql/a0;

    move-result-object v1

    invoke-virtual {v1}, Lql/a0;->a()Lql/b0;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lql/b0;->e()Z

    move-result v1

    if-eqz v1, :cond_d

    return-object v0

    :cond_d
    if-eqz p2, :cond_f

    invoke-virtual {p2}, Lvl/c;->l()Z

    move-result v1

    if-nez v1, :cond_e

    goto :goto_2

    :cond_e
    invoke-virtual {p2}, Lvl/c;->h()Lvl/f;

    move-result-object p2

    invoke-virtual {p2}, Lvl/f;->x()V

    invoke-virtual {p1}, Lql/c0;->O()Lql/a0;

    move-result-object p1

    return-object p1

    :cond_f
    :goto_2
    return-object v0

    :cond_10
    iget-object p2, p0, Lwl/j;->a:Lql/y;

    invoke-virtual {p2}, Lql/y;->c()Lql/b;

    move-result-object p2

    invoke-interface {p2, v1, p1}, Lql/b;->a(Lql/e0;Lql/c0;)Lql/a0;

    move-result-object p1

    return-object p1

    :cond_11
    :pswitch_0
    invoke-direct {p0, p1, v3}, Lwl/j;->b(Lql/c0;Ljava/lang/String;)Lql/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final d(Ljava/io/IOException;Z)Z
    .locals 3

    instance-of v0, p1, Ljava/net/ProtocolException;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    instance-of v0, p1, Ljava/io/InterruptedIOException;

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    instance-of p1, p1, Ljava/net/SocketTimeoutException;

    if-eqz p1, :cond_1

    if-nez p2, :cond_1

    move v1, v2

    :cond_1
    return v1

    :cond_2
    instance-of p2, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Ljava/security/cert/CertificateException;

    if-eqz p2, :cond_3

    return v1

    :cond_3
    instance-of p1, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p1, :cond_4

    return v1

    :cond_4
    return v2
.end method

.method private final e(Ljava/io/IOException;Lvl/e;Lql/a0;Z)Z
    .locals 2

    iget-object v0, p0, Lwl/j;->a:Lql/y;

    invoke-virtual {v0}, Lql/y;->E()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    if-eqz p4, :cond_1

    invoke-direct {p0, p1, p3}, Lwl/j;->f(Ljava/io/IOException;Lql/a0;)Z

    move-result p3

    if-eqz p3, :cond_1

    return v1

    :cond_1
    invoke-direct {p0, p1, p4}, Lwl/j;->d(Ljava/io/IOException;Z)Z

    move-result p1

    if-nez p1, :cond_2

    return v1

    :cond_2
    invoke-virtual {p2}, Lvl/e;->z()Z

    move-result p1

    if-nez p1, :cond_3

    return v1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method private final f(Ljava/io/IOException;Lql/a0;)Z
    .locals 0

    invoke-virtual {p2}, Lql/a0;->a()Lql/b0;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lql/b0;->e()Z

    move-result p2

    if-nez p2, :cond_1

    :cond_0
    instance-of p1, p1, Ljava/io/FileNotFoundException;

    if-eqz p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private final g(Lql/c0;I)I
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x2

    const-string v2, "Retry-After"

    invoke-static {p1, v2, v0, v1, v0}, Lql/c0;->n(Lql/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    return p2

    :cond_0
    new-instance p2, Lxk/f;

    const-string v0, "\\d+"

    invoke-direct {p2, v0}, Lxk/f;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Lxk/f;->a(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "valueOf(header)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    return p1

    :cond_1
    const p1, 0x7fffffff

    return p1
.end method


# virtual methods
.method public a(Lql/v$a;)Lql/c0;
    .locals 10

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lwl/g;

    invoke-virtual {p1}, Lwl/g;->h()Lql/a0;

    move-result-object v0

    invoke-virtual {p1}, Lwl/g;->d()Lvl/e;

    move-result-object v1

    invoke-static {}, Ldk/p;->j()Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    move v8, v3

    move-object v7, v4

    :goto_0
    move v6, v5

    :goto_1
    invoke-virtual {v1, v0, v6}, Lvl/e;->i(Lql/a0;Z)V

    :try_start_0
    invoke-virtual {v1}, Lvl/e;->R0()Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v6, :cond_9

    :try_start_1
    invoke-virtual {p1, v0}, Lwl/g;->a(Lql/a0;)Lql/c0;

    move-result-object v0
    :try_end_1
    .catch Lvl/i; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v7, :cond_0

    :try_start_2
    invoke-virtual {v0}, Lql/c0;->B()Lql/c0$a;

    move-result-object v0

    invoke-virtual {v7}, Lql/c0;->B()Lql/c0$a;

    move-result-object v6

    invoke-virtual {v6, v4}, Lql/c0$a;->b(Lql/d0;)Lql/c0$a;

    move-result-object v6

    invoke-virtual {v6}, Lql/c0$a;->c()Lql/c0;

    move-result-object v6

    invoke-virtual {v0, v6}, Lql/c0$a;->p(Lql/c0;)Lql/c0$a;

    move-result-object v0

    invoke-virtual {v0}, Lql/c0$a;->c()Lql/c0;

    move-result-object v0

    :cond_0
    move-object v7, v0

    invoke-virtual {v1}, Lvl/e;->q()Lvl/c;

    move-result-object v0

    invoke-direct {p0, v7, v0}, Lwl/j;->c(Lql/c0;Lvl/c;)Lql/a0;

    move-result-object v6

    if-nez v6, :cond_2

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lvl/c;->m()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v1}, Lvl/e;->B()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_1
    invoke-virtual {v1, v3}, Lvl/e;->j(Z)V

    return-object v7

    :cond_2
    :try_start_3
    invoke-virtual {v6}, Lql/a0;->a()Lql/b0;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lql/b0;->e()Z

    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v0, :cond_3

    invoke-virtual {v1, v3}, Lvl/e;->j(Z)V

    return-object v7

    :cond_3
    :try_start_4
    invoke-virtual {v7}, Lql/c0;->a()Lql/d0;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {v0}, Lrl/d;->m(Ljava/io/Closeable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_2
    add-int/lit8 v8, v8, 0x1

    const/16 v0, 0x14

    if-gt v8, v0, :cond_5

    invoke-virtual {v1, v5}, Lvl/e;->j(Z)V

    move-object v0, v6

    goto :goto_0

    :cond_5
    :try_start_5
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Too many follow-up requests: "

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :catch_0
    move-exception v6

    instance-of v9, v6, Lyl/a;

    if-nez v9, :cond_6

    move v9, v5

    goto :goto_3

    :cond_6
    move v9, v3

    :goto_3
    invoke-direct {p0, v6, v1, v0, v9}, Lwl/j;->e(Ljava/io/IOException;Lvl/e;Lql/a0;Z)Z

    move-result v9

    if-eqz v9, :cond_7

    check-cast v2, Ljava/util/Collection;

    goto :goto_4

    :cond_7
    invoke-static {v6, v2}, Lrl/d;->Y(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :catch_1
    move-exception v6

    invoke-virtual {v6}, Lvl/i;->c()Ljava/io/IOException;

    move-result-object v9

    invoke-direct {p0, v9, v1, v0, v3}, Lwl/j;->e(Ljava/io/IOException;Lvl/e;Lql/a0;Z)Z

    move-result v9

    if-eqz v9, :cond_8

    check-cast v2, Ljava/util/Collection;

    invoke-virtual {v6}, Lvl/i;->b()Ljava/io/IOException;

    move-result-object v6

    :goto_4
    invoke-static {v2, v6}, Ldk/p;->S(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual {v1, v5}, Lvl/e;->j(Z)V

    move v6, v3

    goto/16 :goto_1

    :cond_8
    :try_start_6
    invoke-virtual {v6}, Lvl/i;->b()Ljava/io/IOException;

    move-result-object p1

    invoke-static {p1, v2}, Lrl/d;->Y(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_9
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :catchall_0
    move-exception p1

    invoke-virtual {v1, v5}, Lvl/e;->j(Z)V

    throw p1
.end method
