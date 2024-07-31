.class Lwi/i$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lwi/i;->g(Lio/grpc/internal/j1$a;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/concurrent/CountDownLatch;

.field final synthetic b:Lwi/a;

.field final synthetic c:Lwi/i;


# direct methods
.method constructor <init>(Lwi/i;Ljava/util/concurrent/CountDownLatch;Lwi/a;)V
    .locals 0

    iput-object p1, p0, Lwi/i$c;->c:Lwi/i;

    iput-object p2, p0, Lwi/i$c;->a:Ljava/util/concurrent/CountDownLatch;

    iput-object p3, p0, Lwi/i$c;->b:Lwi/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    :try_start_0
    iget-object v0, p0, Lwi/i$c;->a:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :goto_0
    new-instance v0, Lwi/i$c$a;

    invoke-direct {v0, p0}, Lwi/i$c$a;-><init>(Lwi/i$c;)V

    invoke-static {v0}, Ldm/l;->b(Ldm/x;)Ldm/d;

    move-result-object v0

    const/4 v1, 0x1

    :try_start_1
    iget-object v2, p0, Lwi/i$c;->c:Lwi/i;

    iget-object v3, v2, Lwi/i;->S:Lvi/b0;

    if-nez v3, :cond_0

    invoke-static {v2}, Lwi/i;->L(Lwi/i;)Ljavax/net/SocketFactory;

    move-result-object v2

    iget-object v3, p0, Lwi/i$c;->c:Lwi/i;

    invoke-static {v3}, Lwi/i;->K(Lwi/i;)Ljava/net/InetSocketAddress;

    move-result-object v3

    invoke-virtual {v3}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v3

    iget-object v4, p0, Lwi/i$c;->c:Lwi/i;

    invoke-static {v4}, Lwi/i;->K(Lwi/i;)Ljava/net/InetSocketAddress;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v4

    invoke-virtual {v2, v3, v4}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v2

    :goto_1
    move-object v5, v2

    goto :goto_2

    :cond_0
    invoke-virtual {v3}, Lvi/b0;->b()Ljava/net/SocketAddress;

    move-result-object v2

    instance-of v2, v2, Ljava/net/InetSocketAddress;

    if-eqz v2, :cond_4

    iget-object v2, p0, Lwi/i$c;->c:Lwi/i;

    iget-object v3, v2, Lwi/i;->S:Lvi/b0;

    invoke-virtual {v3}, Lvi/b0;->c()Ljava/net/InetSocketAddress;

    move-result-object v3

    iget-object v4, p0, Lwi/i$c;->c:Lwi/i;

    iget-object v4, v4, Lwi/i;->S:Lvi/b0;

    invoke-virtual {v4}, Lvi/b0;->b()Ljava/net/SocketAddress;

    move-result-object v4

    check-cast v4, Ljava/net/InetSocketAddress;

    iget-object v5, p0, Lwi/i$c;->c:Lwi/i;

    iget-object v5, v5, Lwi/i;->S:Lvi/b0;

    invoke-virtual {v5}, Lvi/b0;->d()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lwi/i$c;->c:Lwi/i;

    iget-object v6, v6, Lwi/i;->S:Lvi/b0;

    invoke-virtual {v6}, Lvi/b0;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v3, v4, v5, v6}, Lwi/i;->M(Lwi/i;Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;

    move-result-object v2

    goto :goto_1

    :goto_2
    iget-object v2, p0, Lwi/i$c;->c:Lwi/i;

    invoke-static {v2}, Lwi/i;->N(Lwi/i;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lwi/i$c;->c:Lwi/i;

    invoke-static {v2}, Lwi/i;->N(Lwi/i;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    iget-object v2, p0, Lwi/i$c;->c:Lwi/i;

    invoke-static {v2}, Lwi/i;->O(Lwi/i;)Ljavax/net/ssl/HostnameVerifier;

    move-result-object v4

    iget-object v2, p0, Lwi/i$c;->c:Lwi/i;

    invoke-virtual {v2}, Lwi/i;->W()Ljava/lang/String;

    move-result-object v6

    iget-object v2, p0, Lwi/i$c;->c:Lwi/i;

    invoke-virtual {v2}, Lwi/i;->X()I

    move-result v7

    iget-object v2, p0, Lwi/i$c;->c:Lwi/i;

    invoke-static {v2}, Lwi/i;->P(Lwi/i;)Lio/grpc/okhttp/internal/b;

    move-result-object v8

    invoke-static/range {v3 .. v8}, Lwi/n;->b(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Socket;Ljava/lang/String;ILio/grpc/okhttp/internal/b;)Ljavax/net/ssl/SSLSocket;

    move-result-object v5

    invoke-virtual {v5}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v2

    goto :goto_3

    :cond_1
    const/4 v2, 0x0

    :goto_3
    invoke-virtual {v5, v1}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    invoke-static {v5}, Ldm/l;->h(Ljava/net/Socket;)Ldm/x;

    move-result-object v3

    invoke-static {v3}, Ldm/l;->b(Ldm/x;)Ldm/d;

    move-result-object v0

    iget-object v3, p0, Lwi/i$c;->b:Lwi/a;

    invoke-static {v5}, Ldm/l;->e(Ljava/net/Socket;)Ldm/v;

    move-result-object v4

    invoke-virtual {v3, v4, v5}, Lwi/a;->q(Ldm/v;Ljava/net/Socket;)V

    iget-object v3, p0, Lwi/i$c;->c:Lwi/i;

    invoke-static {v3}, Lwi/i;->k(Lwi/i;)Lvi/a;

    move-result-object v4

    invoke-virtual {v4}, Lvi/a;->d()Lvi/a$b;

    move-result-object v4

    sget-object v6, Lvi/a0;->a:Lvi/a$c;

    invoke-virtual {v5}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Lvi/a$b;->d(Lvi/a$c;Ljava/lang/Object;)Lvi/a$b;

    move-result-object v4

    sget-object v6, Lvi/a0;->b:Lvi/a$c;

    invoke-virtual {v5}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    move-result-object v7

    invoke-virtual {v4, v6, v7}, Lvi/a$b;->d(Lvi/a$c;Ljava/lang/Object;)Lvi/a$b;

    move-result-object v4

    sget-object v6, Lvi/a0;->c:Lvi/a$c;

    invoke-virtual {v4, v6, v2}, Lvi/a$b;->d(Lvi/a$c;Ljava/lang/Object;)Lvi/a$b;

    move-result-object v4

    sget-object v6, Lio/grpc/internal/p0;->a:Lvi/a$c;

    if-nez v2, :cond_2

    sget-object v7, Lvi/e1;->NONE:Lvi/e1;

    goto :goto_4

    :cond_2
    sget-object v7, Lvi/e1;->PRIVACY_AND_INTEGRITY:Lvi/e1;

    :goto_4
    invoke-virtual {v4, v6, v7}, Lvi/a$b;->d(Lvi/a$c;Ljava/lang/Object;)Lvi/a$b;

    move-result-object v4

    invoke-virtual {v4}, Lvi/a$b;->a()Lvi/a;

    move-result-object v4

    invoke-static {v3, v4}, Lwi/i;->l(Lwi/i;Lvi/a;)Lvi/a;
    :try_end_1
    .catch Lvi/h1; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object v3, p0, Lwi/i$c;->c:Lwi/i;

    new-instance v4, Lwi/i$e;

    invoke-static {v3}, Lwi/i;->p(Lwi/i;)Lxi/j;

    move-result-object v6

    invoke-interface {v6, v0, v1}, Lxi/j;->b(Ldm/d;Z)Lxi/b;

    move-result-object v0

    invoke-direct {v4, v3, v0}, Lwi/i$e;-><init>(Lwi/i;Lxi/b;)V

    invoke-static {v3, v4}, Lwi/i;->o(Lwi/i;Lwi/i$e;)Lwi/i$e;

    iget-object v0, p0, Lwi/i$c;->c:Lwi/i;

    invoke-static {v0}, Lwi/i;->j(Lwi/i;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    :try_start_2
    iget-object v0, p0, Lwi/i$c;->c:Lwi/i;

    const-string v1, "socket"

    invoke-static {v5, v1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/net/Socket;

    invoke-static {v0, v1}, Lwi/i;->q(Lwi/i;Ljava/net/Socket;)Ljava/net/Socket;

    if-eqz v2, :cond_3

    iget-object v0, p0, Lwi/i$c;->c:Lwi/i;

    new-instance v1, Lvi/c0$b;

    new-instance v4, Lvi/c0$c;

    invoke-direct {v4, v2}, Lvi/c0$c;-><init>(Ljavax/net/ssl/SSLSession;)V

    invoke-direct {v1, v4}, Lvi/c0$b;-><init>(Lvi/c0$c;)V

    invoke-static {v0, v1}, Lwi/i;->r(Lwi/i;Lvi/c0$b;)Lvi/c0$b;

    :cond_3
    monitor-exit v3

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_4
    :try_start_3
    sget-object v2, Lvi/g1;->t:Lvi/g1;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unsupported SocketAddress implementation "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Lwi/i$c;->c:Lwi/i;

    iget-object v4, v4, Lwi/i;->S:Lvi/b0;

    invoke-virtual {v4}, Lvi/b0;->b()Ljava/net/SocketAddress;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v2

    invoke-virtual {v2}, Lvi/g1;->c()Lvi/h1;

    move-result-object v2

    throw v2
    :try_end_3
    .catch Lvi/h1; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v2

    goto :goto_6

    :catch_1
    move-exception v2

    :try_start_4
    iget-object v3, p0, Lwi/i$c;->c:Lwi/i;

    invoke-virtual {v3, v2}, Lwi/i;->h(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    iget-object v2, p0, Lwi/i$c;->c:Lwi/i;

    new-instance v3, Lwi/i$e;

    invoke-static {v2}, Lwi/i;->p(Lwi/i;)Lxi/j;

    move-result-object v4

    invoke-interface {v4, v0, v1}, Lxi/j;->b(Ldm/d;Z)Lxi/b;

    move-result-object v0

    invoke-direct {v3, v2, v0}, Lwi/i$e;-><init>(Lwi/i;Lxi/b;)V

    :goto_5
    invoke-static {v2, v3}, Lwi/i;->o(Lwi/i;Lwi/i$e;)Lwi/i$e;

    return-void

    :catch_2
    move-exception v2

    :try_start_5
    iget-object v3, p0, Lwi/i$c;->c:Lwi/i;

    sget-object v4, Lxi/a;->INTERNAL_ERROR:Lxi/a;

    invoke-virtual {v2}, Lvi/h1;->a()Lvi/g1;

    move-result-object v2

    const/4 v5, 0x0

    invoke-static {v3, v5, v4, v2}, Lwi/i;->m(Lwi/i;ILxi/a;Lvi/g1;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    iget-object v2, p0, Lwi/i$c;->c:Lwi/i;

    new-instance v3, Lwi/i$e;

    invoke-static {v2}, Lwi/i;->p(Lwi/i;)Lxi/j;

    move-result-object v4

    invoke-interface {v4, v0, v1}, Lxi/j;->b(Ldm/d;Z)Lxi/b;

    move-result-object v0

    invoke-direct {v3, v2, v0}, Lwi/i$e;-><init>(Lwi/i;Lxi/b;)V

    goto :goto_5

    :goto_6
    iget-object v3, p0, Lwi/i$c;->c:Lwi/i;

    new-instance v4, Lwi/i$e;

    invoke-static {v3}, Lwi/i;->p(Lwi/i;)Lxi/j;

    move-result-object v5

    invoke-interface {v5, v0, v1}, Lxi/j;->b(Ldm/d;Z)Lxi/b;

    move-result-object v0

    invoke-direct {v4, v3, v0}, Lwi/i$e;-><init>(Lwi/i;Lxi/b;)V

    invoke-static {v3, v4}, Lwi/i;->o(Lwi/i;Lwi/i$e;)Lwi/i$e;

    throw v2
.end method
