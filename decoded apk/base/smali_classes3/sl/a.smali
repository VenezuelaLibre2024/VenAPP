.class public final Lsl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lql/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lsl/a$a;
    }
.end annotation


# instance fields
.field private final d:Lql/q;


# direct methods
.method public constructor <init>(Lql/q;)V
    .locals 1

    const-string v0, "defaultDns"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsl/a;->d:Lql/q;

    return-void
.end method

.method public synthetic constructor <init>(Lql/q;ILkotlin/jvm/internal/g;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, Lql/q;->b:Lql/q;

    :cond_0
    invoke-direct {p0, p1}, Lsl/a;-><init>(Lql/q;)V

    return-void
.end method

.method private final b(Ljava/net/Proxy;Lql/u;Lql/q;)Ljava/net/InetAddress;
    .locals 2

    invoke-virtual {p1}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lsl/a$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p2}, Lql/u;->h()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p3, p1}, Lql/q;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ldk/p;->G(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/net/InetAddress;

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object p1

    if-eqz p1, :cond_2

    check-cast p1, Ljava/net/InetSocketAddress;

    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object p1

    const-string p2, "address() as InetSocketAddress).address"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_1
    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type java.net.InetSocketAddress"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(Lql/e0;Lql/c0;)Lql/a0;
    .locals 20

    move-object/from16 v0, p0

    const-string v1, "response"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Lql/c0;->f()Ljava/util/List;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lql/c0;->O()Lql/a0;

    move-result-object v3

    invoke-virtual {v3}, Lql/a0;->i()Lql/u;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lql/c0;->g()I

    move-result v2

    const/16 v5, 0x197

    const/4 v6, 0x1

    if-ne v2, v5, :cond_0

    move v2, v6

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    const/4 v5, 0x0

    if-nez p1, :cond_1

    move-object v7, v5

    goto :goto_1

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lql/e0;->b()Ljava/net/Proxy;

    move-result-object v7

    :goto_1
    if-nez v7, :cond_2

    sget-object v7, Ljava/net/Proxy;->NO_PROXY:Ljava/net/Proxy;

    :cond_2
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lql/h;

    invoke-virtual {v8}, Lql/h;->c()Ljava/lang/String;

    move-result-object v9

    const-string v10, "Basic"

    invoke-static {v10, v9, v6}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v9

    if-nez v9, :cond_4

    goto :goto_2

    :cond_4
    if-nez p1, :cond_5

    :goto_3
    move-object v9, v5

    goto :goto_4

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lql/e0;->a()Lql/a;

    move-result-object v9

    if-nez v9, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {v9}, Lql/a;->c()Lql/q;

    move-result-object v9

    :goto_4
    if-nez v9, :cond_7

    iget-object v9, v0, Lsl/a;->d:Lql/q;

    :cond_7
    const-string v10, "proxy"

    if-eqz v2, :cond_9

    invoke-virtual {v7}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v11

    if-eqz v11, :cond_8

    check-cast v11, Ljava/net/InetSocketAddress;

    invoke-virtual {v11}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v12

    invoke-static {v7, v10}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v7, v4, v9}, Lsl/a;->b(Ljava/net/Proxy;Lql/u;Lql/q;)Ljava/net/InetAddress;

    move-result-object v13

    invoke-virtual {v11}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v14

    invoke-virtual {v4}, Lql/u;->q()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v8}, Lql/h;->b()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v8}, Lql/h;->c()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v4}, Lql/u;->s()Ljava/net/URL;

    move-result-object v18

    sget-object v19, Ljava/net/Authenticator$RequestorType;->PROXY:Ljava/net/Authenticator$RequestorType;

    invoke-static/range {v12 .. v19}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    move-result-object v9

    goto :goto_5

    :cond_8
    new-instance v1, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type java.net.InetSocketAddress"

    invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    invoke-virtual {v4}, Lql/u;->h()Ljava/lang/String;

    move-result-object v11

    invoke-static {v7, v10}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v7, v4, v9}, Lsl/a;->b(Ljava/net/Proxy;Lql/u;Lql/q;)Ljava/net/InetAddress;

    move-result-object v10

    invoke-virtual {v4}, Lql/u;->m()I

    move-result v12

    invoke-virtual {v4}, Lql/u;->q()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v8}, Lql/h;->b()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v8}, Lql/h;->c()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4}, Lql/u;->s()Ljava/net/URL;

    move-result-object v16

    sget-object v17, Ljava/net/Authenticator$RequestorType;->SERVER:Ljava/net/Authenticator$RequestorType;

    move-object v9, v11

    move v11, v12

    move-object v12, v13

    move-object v13, v14

    move-object v14, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v17

    invoke-static/range {v9 .. v16}, Ljava/net/Authenticator;->requestPasswordAuthentication(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/net/URL;Ljava/net/Authenticator$RequestorType;)Ljava/net/PasswordAuthentication;

    move-result-object v9

    :goto_5
    if-eqz v9, :cond_3

    if-eqz v2, :cond_a

    const-string v1, "Proxy-Authorization"

    goto :goto_6

    :cond_a
    const-string v1, "Authorization"

    :goto_6
    invoke-virtual {v9}, Ljava/net/PasswordAuthentication;->getUserName()Ljava/lang/String;

    move-result-object v2

    const-string v4, "auth.userName"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/lang/String;

    invoke-virtual {v9}, Ljava/net/PasswordAuthentication;->getPassword()[C

    move-result-object v5

    const-string v6, "auth.password"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v5}, Ljava/lang/String;-><init>([C)V

    invoke-virtual {v8}, Lql/h;->a()Ljava/nio/charset/Charset;

    move-result-object v5

    invoke-static {v2, v4, v5}, Lql/o;->a(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3}, Lql/a0;->h()Lql/a0$a;

    move-result-object v3

    invoke-virtual {v3, v1, v2}, Lql/a0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;

    move-result-object v1

    invoke-virtual {v1}, Lql/a0$a;->b()Lql/a0;

    move-result-object v1

    return-object v1

    :cond_b
    return-object v5
.end method
