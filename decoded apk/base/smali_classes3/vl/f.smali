.class public final Lvl/f;
.super Lyl/f$c;
.source "SourceFile"

# interfaces
.implements Lql/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvl/f$a;,
        Lvl/f$b;
    }
.end annotation


# static fields
.field public static final t:Lvl/f$a;


# instance fields
.field private final c:Lvl/g;

.field private final d:Lql/e0;

.field private e:Ljava/net/Socket;

.field private f:Ljava/net/Socket;

.field private g:Lql/s;

.field private h:Lql/z;

.field private i:Lyl/f;

.field private j:Ldm/d;

.field private k:Ldm/c;

.field private l:Z

.field private m:Z

.field private n:I

.field private o:I

.field private p:I

.field private q:I

.field private final r:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/ref/Reference<",
            "Lvl/e;",
            ">;>;"
        }
    .end annotation
.end field

.field private s:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvl/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvl/f$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lvl/f;->t:Lvl/f$a;

    return-void
.end method

.method public constructor <init>(Lvl/g;Lql/e0;)V
    .locals 1

    const-string v0, "connectionPool"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "route"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lyl/f$c;-><init>()V

    iput-object p1, p0, Lvl/f;->c:Lvl/g;

    iput-object p2, p0, Lvl/f;->d:Lql/e0;

    const/4 p1, 0x1

    iput p1, p0, Lvl/f;->q:I

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lvl/f;->r:Ljava/util/List;

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, Lvl/f;->s:J

    return-void
.end method

.method private final A(Ljava/util/List;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lql/e0;",
            ">;)Z"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lql/e0;

    invoke-virtual {v0}, Lql/e0;->b()Ljava/net/Proxy;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    const/4 v4, 0x1

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v2}, Lql/e0;->b()Ljava/net/Proxy;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    sget-object v3, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v2}, Lql/e0;->d()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-virtual {v0}, Lql/e0;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    move v0, v4

    goto :goto_0

    :cond_2
    move v0, v1

    :goto_0
    if-eqz v0, :cond_1

    move v1, v4

    :cond_3
    :goto_1
    return v1
.end method

.method private final E(I)V
    .locals 7

    iget-object v0, p0, Lvl/f;->f:Ljava/net/Socket;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lvl/f;->j:Ldm/d;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v2, p0, Lvl/f;->k:Ldm/c;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    new-instance v4, Lyl/f$a;

    const/4 v5, 0x1

    sget-object v6, Lul/e;->i:Lul/e;

    invoke-direct {v4, v5, v6}, Lyl/f$a;-><init>(ZLul/e;)V

    iget-object v5, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v5}, Lql/e0;->a()Lql/a;

    move-result-object v5

    invoke-virtual {v5}, Lql/a;->l()Lql/u;

    move-result-object v5

    invoke-virtual {v5}, Lql/u;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v0, v5, v1, v2}, Lyl/f$a;->s(Ljava/net/Socket;Ljava/lang/String;Ldm/d;Ldm/c;)Lyl/f$a;

    move-result-object v0

    invoke-virtual {v0, p0}, Lyl/f$a;->k(Lyl/f$c;)Lyl/f$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lyl/f$a;->l(I)Lyl/f$a;

    move-result-object p1

    invoke-virtual {p1}, Lyl/f$a;->a()Lyl/f;

    move-result-object p1

    iput-object p1, p0, Lvl/f;->i:Lyl/f;

    sget-object v0, Lyl/f;->N:Lyl/f$b;

    invoke-virtual {v0}, Lyl/f$b;->a()Lyl/m;

    move-result-object v0

    invoke-virtual {v0}, Lyl/m;->d()I

    move-result v0

    iput v0, p0, Lvl/f;->q:I

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-static {p1, v3, v0, v1, v0}, Lyl/f;->w1(Lyl/f;ZLul/e;ILjava/lang/Object;)V

    return-void
.end method

.method private final F(Lql/u;)Z
    .locals 4

    sget-boolean v0, Lrl/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " MUST hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v0}, Lql/e0;->a()Lql/a;

    move-result-object v0

    invoke-virtual {v0}, Lql/a;->l()Lql/u;

    move-result-object v0

    invoke-virtual {p1}, Lql/u;->m()I

    move-result v1

    invoke-virtual {v0}, Lql/u;->m()I

    move-result v2

    const/4 v3, 0x0

    if-eq v1, v2, :cond_2

    return v3

    :cond_2
    invoke-virtual {p1}, Lql/u;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lql/u;->h()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    return v1

    :cond_3
    iget-boolean v0, p0, Lvl/f;->m:Z

    if-nez v0, :cond_4

    iget-object v0, p0, Lvl/f;->g:Lql/s;

    if-eqz v0, :cond_4

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-direct {p0, p1, v0}, Lvl/f;->e(Lql/u;Lql/s;)Z

    move-result p1

    if-eqz p1, :cond_4

    move v3, v1

    :cond_4
    return v3
.end method

.method public static final synthetic c(Lvl/f;)Lql/s;
    .locals 0

    iget-object p0, p0, Lvl/f;->g:Lql/s;

    return-object p0
.end method

.method private final e(Lql/u;Lql/s;)Z
    .locals 3

    invoke-virtual {p2}, Lql/s;->d()Ljava/util/List;

    move-result-object p2

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    sget-object v0, Lcm/d;->a:Lcm/d;

    invoke-virtual {p1}, Lql/u;->h()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/security/cert/X509Certificate;

    invoke-virtual {v0, p1, p2}, Lcm/d;->e(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    return v1
.end method

.method private final h(IILql/e;Lql/r;)V
    .locals 4

    iget-object v0, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v0}, Lql/e0;->b()Ljava/net/Proxy;

    move-result-object v0

    iget-object v1, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v1}, Lql/e0;->a()Lql/a;

    move-result-object v1

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 v2, -0x1

    goto :goto_0

    :cond_0
    sget-object v3, Lvl/f$b;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    :goto_0
    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    new-instance v1, Ljava/net/Socket;

    invoke-direct {v1, v0}, Ljava/net/Socket;-><init>(Ljava/net/Proxy;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lql/a;->j()Ljavax/net/SocketFactory;

    move-result-object v1

    invoke-virtual {v1}, Ljavax/net/SocketFactory;->createSocket()Ljava/net/Socket;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    :goto_1
    iput-object v1, p0, Lvl/f;->e:Ljava/net/Socket;

    iget-object v2, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v2}, Lql/e0;->d()Ljava/net/InetSocketAddress;

    move-result-object v2

    invoke-virtual {p4, p3, v2, v0}, Lql/r;->i(Lql/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    invoke-virtual {v1, p2}, Ljava/net/Socket;->setSoTimeout(I)V

    :try_start_0
    sget-object p2, Lzl/j;->a:Lzl/j$a;

    invoke-virtual {p2}, Lzl/j$a;->g()Lzl/j;

    move-result-object p2

    iget-object p3, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {p3}, Lql/e0;->d()Ljava/net/InetSocketAddress;

    move-result-object p3

    invoke-virtual {p2, v1, p3, p1}, Lzl/j;->f(Ljava/net/Socket;Ljava/net/InetSocketAddress;I)V
    :try_end_0
    .catch Ljava/net/ConnectException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-static {v1}, Ldm/l;->h(Ljava/net/Socket;)Ldm/x;

    move-result-object p1

    invoke-static {p1}, Ldm/l;->b(Ldm/x;)Ldm/d;

    move-result-object p1

    iput-object p1, p0, Lvl/f;->j:Ldm/d;

    invoke-static {v1}, Ldm/l;->e(Ljava/net/Socket;)Ldm/v;

    move-result-object p1

    invoke-static {p1}, Ldm/l;->a(Ldm/v;)Ldm/c;

    move-result-object p1

    iput-object p1, p0, Lvl/f;->k:Ldm/c;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p2

    const-string p3, "throw with null exception"

    invoke-static {p2, p3}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_2

    :goto_2
    return-void

    :cond_2
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :catch_1
    move-exception p1

    new-instance p2, Ljava/net/ConnectException;

    iget-object p3, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {p3}, Lql/e0;->d()Ljava/net/InetSocketAddress;

    move-result-object p3

    const-string p4, "Failed to connect to "

    invoke-static {p4, p3}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3}, Ljava/net/ConnectException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw p2
.end method

.method private final i(Lvl/b;)V
    .locals 10

    iget-object v0, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v0}, Lql/e0;->a()Lql/a;

    move-result-object v0

    invoke-virtual {v0}, Lql/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v3, p0, Lvl/f;->e:Ljava/net/Socket;

    invoke-virtual {v0}, Lql/a;->l()Lql/u;

    move-result-object v4

    invoke-virtual {v4}, Lql/u;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lql/a;->l()Lql/u;

    move-result-object v5

    invoke-virtual {v5}, Lql/u;->m()I

    move-result v5

    const/4 v6, 0x1

    invoke-virtual {v1, v3, v4, v5, v6}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;

    move-result-object v1

    if-eqz v1, :cond_5

    check-cast v1, Ljavax/net/ssl/SSLSocket;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p1, v1}, Lvl/b;->a(Ljavax/net/ssl/SSLSocket;)Lql/l;

    move-result-object p1

    invoke-virtual {p1}, Lql/l;->h()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lzl/j;->a:Lzl/j$a;

    invoke-virtual {v3}, Lzl/j$a;->g()Lzl/j;

    move-result-object v3

    invoke-virtual {v0}, Lql/a;->l()Lql/u;

    move-result-object v4

    invoke-virtual {v4}, Lql/u;->h()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lql/a;->f()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v1, v4, v5}, Lzl/j;->e(Ljavax/net/ssl/SSLSocket;Ljava/lang/String;Ljava/util/List;)V

    :cond_0
    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->startHandshake()V

    invoke-virtual {v1}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v3

    sget-object v4, Lql/s;->e:Lql/s$a;

    const-string v5, "sslSocketSession"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Lql/s$a;->a(Ljavax/net/ssl/SSLSession;)Lql/s;

    move-result-object v4

    invoke-virtual {v0}, Lql/a;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lql/a;->l()Lql/u;

    move-result-object v7

    invoke-virtual {v7}, Lql/u;->h()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v7, v3}, Ljavax/net/ssl/HostnameVerifier;->verify(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-virtual {v4}, Lql/s;->d()Ljava/util/List;

    move-result-object p1

    move-object v3, p1

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v6

    if-eqz v3, :cond_1

    const/4 v3, 0x0

    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/security/cert/X509Certificate;

    new-instance v3, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "\n              |Hostname "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lql/a;->l()Lql/u;

    move-result-object v0

    invoke-virtual {v0}, Lql/u;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified:\n              |    certificate: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lql/g;->c:Lql/g$b;

    invoke-virtual {v0, p1}, Lql/g$b;->a(Ljava/security/cert/Certificate;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n              |    DN: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Principal;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\n              |    subjectAltNames: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Lcm/d;->a:Lcm/d;

    invoke-virtual {v0, p1}, Lcm/d;->a(Ljava/security/cert/X509Certificate;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "\n              "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2, v6, v2}, Lxk/g;->h(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw v3

    :cond_1
    new-instance p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Hostname "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lql/a;->l()Lql/u;

    move-result-object v0

    invoke-virtual {v0}, Lql/u;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not verified (no certificates)"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljavax/net/ssl/SSLPeerUnverifiedException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-virtual {v0}, Lql/a;->a()Lql/g;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    new-instance v5, Lql/s;

    invoke-virtual {v4}, Lql/s;->e()Lql/f0;

    move-result-object v6

    invoke-virtual {v4}, Lql/s;->a()Lql/i;

    move-result-object v7

    invoke-virtual {v4}, Lql/s;->c()Ljava/util/List;

    move-result-object v8

    new-instance v9, Lvl/f$c;

    invoke-direct {v9, v3, v4, v0}, Lvl/f$c;-><init>(Lql/g;Lql/s;Lql/a;)V

    invoke-direct {v5, v6, v7, v8, v9}, Lql/s;-><init>(Lql/f0;Lql/i;Ljava/util/List;Lok/a;)V

    iput-object v5, p0, Lvl/f;->g:Lql/s;

    invoke-virtual {v0}, Lql/a;->l()Lql/u;

    move-result-object v0

    invoke-virtual {v0}, Lql/u;->h()Ljava/lang/String;

    move-result-object v0

    new-instance v4, Lvl/f$d;

    invoke-direct {v4, p0}, Lvl/f$d;-><init>(Lvl/f;)V

    invoke-virtual {v3, v0, v4}, Lql/g;->b(Ljava/lang/String;Lok/a;)V

    invoke-virtual {p1}, Lql/l;->h()Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lzl/j;->a:Lzl/j$a;

    invoke-virtual {p1}, Lzl/j$a;->g()Lzl/j;

    move-result-object p1

    invoke-virtual {p1, v1}, Lzl/j;->g(Ljavax/net/ssl/SSLSocket;)Ljava/lang/String;

    move-result-object v2

    :cond_3
    iput-object v1, p0, Lvl/f;->f:Ljava/net/Socket;

    invoke-static {v1}, Ldm/l;->h(Ljava/net/Socket;)Ldm/x;

    move-result-object p1

    invoke-static {p1}, Ldm/l;->b(Ldm/x;)Ldm/d;

    move-result-object p1

    iput-object p1, p0, Lvl/f;->j:Ldm/d;

    invoke-static {v1}, Ldm/l;->e(Ljava/net/Socket;)Ldm/v;

    move-result-object p1

    invoke-static {p1}, Ldm/l;->a(Ldm/v;)Ldm/c;

    move-result-object p1

    iput-object p1, p0, Lvl/f;->k:Ldm/c;

    if-eqz v2, :cond_4

    sget-object p1, Lql/z;->Companion:Lql/z$a;

    invoke-virtual {p1, v2}, Lql/z$a;->a(Ljava/lang/String;)Lql/z;

    move-result-object p1

    goto :goto_0

    :cond_4
    sget-object p1, Lql/z;->HTTP_1_1:Lql/z;

    :goto_0
    iput-object p1, p0, Lvl/f;->h:Lql/z;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object p1, Lzl/j;->a:Lzl/j$a;

    invoke-virtual {p1}, Lzl/j$a;->g()Lzl/j;

    move-result-object p1

    invoke-virtual {p1, v1}, Lzl/j;->b(Ljavax/net/ssl/SSLSocket;)V

    return-void

    :catchall_0
    move-exception p1

    move-object v2, v1

    goto :goto_1

    :cond_5
    :try_start_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type javax.net.ssl.SSLSocket"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    :goto_1
    if-eqz v2, :cond_6

    sget-object v0, Lzl/j;->a:Lzl/j$a;

    invoke-virtual {v0}, Lzl/j$a;->g()Lzl/j;

    move-result-object v0

    invoke-virtual {v0, v2}, Lzl/j;->b(Ljavax/net/ssl/SSLSocket;)V

    :cond_6
    if-nez v2, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {v2}, Lrl/d;->n(Ljava/net/Socket;)V

    :goto_2
    throw p1
.end method

.method private final j(IIILql/e;Lql/r;)V
    .locals 6

    invoke-direct {p0}, Lvl/f;->l()Lql/a0;

    move-result-object v0

    invoke-virtual {v0}, Lql/a0;->i()Lql/u;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0x15

    if-ge v2, v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    invoke-direct {p0, p1, p2, p4, p5}, Lvl/f;->h(IILql/e;Lql/r;)V

    invoke-direct {p0, p2, p3, v0, v1}, Lvl/f;->k(IILql/a0;Lql/u;)Lql/a0;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    iget-object v3, p0, Lvl/f;->e:Ljava/net/Socket;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v3}, Lrl/d;->n(Ljava/net/Socket;)V

    :goto_1
    const/4 v3, 0x0

    iput-object v3, p0, Lvl/f;->e:Ljava/net/Socket;

    iput-object v3, p0, Lvl/f;->k:Ldm/c;

    iput-object v3, p0, Lvl/f;->j:Ldm/d;

    iget-object v4, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v4}, Lql/e0;->d()Ljava/net/InetSocketAddress;

    move-result-object v4

    iget-object v5, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v5}, Lql/e0;->b()Ljava/net/Proxy;

    move-result-object v5

    invoke-virtual {p5, p4, v4, v5, v3}, Lql/r;->g(Lql/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lql/z;)V

    goto :goto_0

    :cond_2
    :goto_2
    return-void
.end method

.method private final k(IILql/a0;Lql/u;)Lql/a0;
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CONNECT "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-static {p4, v1}, Lrl/d;->Q(Lql/u;Z)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " HTTP/1.1"

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    :goto_0
    iget-object v0, p0, Lvl/f;->j:Ldm/d;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v2, p0, Lvl/f;->k:Ldm/c;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    new-instance v3, Lxl/b;

    const/4 v4, 0x0

    invoke-direct {v3, v4, p0, v0, v2}, Lxl/b;-><init>(Lql/y;Lvl/f;Ldm/d;Ldm/c;)V

    invoke-interface {v0}, Ldm/x;->m()Ldm/y;

    move-result-object v5

    int-to-long v6, p1

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v5, v6, v7, v8}, Ldm/y;->g(JLjava/util/concurrent/TimeUnit;)Ldm/y;

    invoke-interface {v2}, Ldm/v;->m()Ldm/y;

    move-result-object v5

    int-to-long v6, p2

    invoke-virtual {v5, v6, v7, v8}, Ldm/y;->g(JLjava/util/concurrent/TimeUnit;)Ldm/y;

    invoke-virtual {p3}, Lql/a0;->e()Lql/t;

    move-result-object v5

    invoke-virtual {v3, v5, p4}, Lxl/b;->A(Lql/t;Ljava/lang/String;)V

    invoke-virtual {v3}, Lxl/b;->a()V

    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Lxl/b;->e(Z)Lql/c0$a;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v5, p3}, Lql/c0$a;->s(Lql/a0;)Lql/c0$a;

    move-result-object p3

    invoke-virtual {p3}, Lql/c0$a;->c()Lql/c0;

    move-result-object p3

    invoke-virtual {v3, p3}, Lxl/b;->z(Lql/c0;)V

    invoke-virtual {p3}, Lql/c0;->g()I

    move-result v3

    const/16 v5, 0xc8

    if-eq v3, v5, :cond_3

    const/16 v0, 0x197

    if-ne v3, v0, :cond_2

    iget-object v0, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v0}, Lql/e0;->a()Lql/a;

    move-result-object v0

    invoke-virtual {v0}, Lql/a;->h()Lql/b;

    move-result-object v0

    iget-object v2, p0, Lvl/f;->d:Lql/e0;

    invoke-interface {v0, v2, p3}, Lql/b;->a(Lql/e0;Lql/c0;)Lql/a0;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v2, "Connection"

    const/4 v3, 0x2

    invoke-static {p3, v2, v4, v3, v4}, Lql/c0;->n(Lql/c0;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    const-string v2, "close"

    invoke-static {v2, p3, v1}, Lxk/g;->r(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p3

    if-eqz p3, :cond_0

    return-object v0

    :cond_0
    move-object p3, v0

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "Failed to authenticate with proxy"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/io/IOException;

    invoke-virtual {p3}, Lql/c0;->g()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    const-string p3, "Unexpected response code for CONNECT: "

    invoke-static {p3, p2}, Lkotlin/jvm/internal/n;->k(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-interface {v0}, Ldm/d;->c()Ldm/b;

    move-result-object p1

    invoke-virtual {p1}, Ldm/b;->G0()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {v2}, Ldm/c;->c()Ldm/b;

    move-result-object p1

    invoke-virtual {p1}, Ldm/b;->G0()Z

    move-result p1

    if-eqz p1, :cond_4

    return-object v4

    :cond_4
    new-instance p1, Ljava/io/IOException;

    const-string p2, "TLS tunnel buffered too many bytes!"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final l()Lql/a0;
    .locals 4

    new-instance v0, Lql/a0$a;

    invoke-direct {v0}, Lql/a0$a;-><init>()V

    iget-object v1, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v1}, Lql/e0;->a()Lql/a;

    move-result-object v1

    invoke-virtual {v1}, Lql/a;->l()Lql/u;

    move-result-object v1

    invoke-virtual {v0, v1}, Lql/a0$a;->p(Lql/u;)Lql/a0$a;

    move-result-object v0

    const-string v1, "CONNECT"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Lql/a0$a;->f(Ljava/lang/String;Lql/b0;)Lql/a0$a;

    move-result-object v0

    iget-object v1, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v1}, Lql/e0;->a()Lql/a;

    move-result-object v1

    invoke-virtual {v1}, Lql/a;->l()Lql/u;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lrl/d;->Q(Lql/u;Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Host"

    invoke-virtual {v0, v2, v1}, Lql/a0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;

    move-result-object v0

    const-string v1, "Proxy-Connection"

    const-string v2, "Keep-Alive"

    invoke-virtual {v0, v1, v2}, Lql/a0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;

    move-result-object v0

    const-string v1, "User-Agent"

    const-string v2, "okhttp/4.11.0"

    invoke-virtual {v0, v1, v2}, Lql/a0$a;->d(Ljava/lang/String;Ljava/lang/String;)Lql/a0$a;

    move-result-object v0

    invoke-virtual {v0}, Lql/a0$a;->b()Lql/a0;

    move-result-object v0

    new-instance v1, Lql/c0$a;

    invoke-direct {v1}, Lql/c0$a;-><init>()V

    invoke-virtual {v1, v0}, Lql/c0$a;->s(Lql/a0;)Lql/c0$a;

    move-result-object v1

    sget-object v2, Lql/z;->HTTP_1_1:Lql/z;

    invoke-virtual {v1, v2}, Lql/c0$a;->q(Lql/z;)Lql/c0$a;

    move-result-object v1

    const/16 v2, 0x197

    invoke-virtual {v1, v2}, Lql/c0$a;->g(I)Lql/c0$a;

    move-result-object v1

    const-string v2, "Preemptive Authenticate"

    invoke-virtual {v1, v2}, Lql/c0$a;->n(Ljava/lang/String;)Lql/c0$a;

    move-result-object v1

    sget-object v2, Lrl/d;->c:Lql/d0;

    invoke-virtual {v1, v2}, Lql/c0$a;->b(Lql/d0;)Lql/c0$a;

    move-result-object v1

    const-wide/16 v2, -0x1

    invoke-virtual {v1, v2, v3}, Lql/c0$a;->t(J)Lql/c0$a;

    move-result-object v1

    invoke-virtual {v1, v2, v3}, Lql/c0$a;->r(J)Lql/c0$a;

    move-result-object v1

    const-string v2, "Proxy-Authenticate"

    const-string v3, "OkHttp-Preemptive"

    invoke-virtual {v1, v2, v3}, Lql/c0$a;->k(Ljava/lang/String;Ljava/lang/String;)Lql/c0$a;

    move-result-object v1

    invoke-virtual {v1}, Lql/c0$a;->c()Lql/c0;

    move-result-object v1

    iget-object v2, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v2}, Lql/e0;->a()Lql/a;

    move-result-object v2

    invoke-virtual {v2}, Lql/a;->h()Lql/b;

    move-result-object v2

    iget-object v3, p0, Lvl/f;->d:Lql/e0;

    invoke-interface {v2, v3, v1}, Lql/b;->a(Lql/e0;Lql/c0;)Lql/a0;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    return-object v0
.end method

.method private final m(Lvl/b;ILql/e;Lql/r;)V
    .locals 1

    iget-object v0, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v0}, Lql/e0;->a()Lql/a;

    move-result-object v0

    invoke-virtual {v0}, Lql/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {p1}, Lql/e0;->a()Lql/a;

    move-result-object p1

    invoke-virtual {p1}, Lql/a;->f()Ljava/util/List;

    move-result-object p1

    sget-object p3, Lql/z;->H2_PRIOR_KNOWLEDGE:Lql/z;

    invoke-interface {p1, p3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lvl/f;->e:Ljava/net/Socket;

    iput-object p1, p0, Lvl/f;->f:Ljava/net/Socket;

    iput-object p3, p0, Lvl/f;->h:Lql/z;

    invoke-direct {p0, p2}, Lvl/f;->E(I)V

    return-void

    :cond_0
    iget-object p1, p0, Lvl/f;->e:Ljava/net/Socket;

    iput-object p1, p0, Lvl/f;->f:Ljava/net/Socket;

    sget-object p1, Lql/z;->HTTP_1_1:Lql/z;

    iput-object p1, p0, Lvl/f;->h:Lql/z;

    return-void

    :cond_1
    invoke-virtual {p4, p3}, Lql/r;->B(Lql/e;)V

    invoke-direct {p0, p1}, Lvl/f;->i(Lvl/b;)V

    iget-object p1, p0, Lvl/f;->g:Lql/s;

    invoke-virtual {p4, p3, p1}, Lql/r;->A(Lql/e;Lql/s;)V

    iget-object p1, p0, Lvl/f;->h:Lql/z;

    sget-object p3, Lql/z;->HTTP_2:Lql/z;

    if-ne p1, p3, :cond_2

    invoke-direct {p0, p2}, Lvl/f;->E(I)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final B(J)V
    .locals 0

    iput-wide p1, p0, Lvl/f;->s:J

    return-void
.end method

.method public final C(Z)V
    .locals 0

    iput-boolean p1, p0, Lvl/f;->l:Z

    return-void
.end method

.method public D()Ljava/net/Socket;
    .locals 1

    iget-object v0, p0, Lvl/f;->f:Ljava/net/Socket;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final declared-synchronized G(Lvl/e;Ljava/io/IOException;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lyl/n;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, Lyl/n;

    iget-object v0, v0, Lyl/n;->a:Lyl/b;

    sget-object v2, Lyl/b;->REFUSED_STREAM:Lyl/b;

    if-ne v0, v2, :cond_0

    iget p1, p0, Lvl/f;->p:I

    add-int/2addr p1, v1

    iput p1, p0, Lvl/f;->p:I

    if-le p1, v1, :cond_5

    iput-boolean v1, p0, Lvl/f;->l:Z

    iget p1, p0, Lvl/f;->n:I

    :goto_0
    add-int/2addr p1, v1

    iput p1, p0, Lvl/f;->n:I

    goto :goto_1

    :cond_0
    check-cast p2, Lyl/n;

    iget-object p2, p2, Lyl/n;->a:Lyl/b;

    sget-object v0, Lyl/b;->CANCEL:Lyl/b;

    if-ne p2, v0, :cond_1

    invoke-virtual {p1}, Lvl/e;->R0()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    iput-boolean v1, p0, Lvl/f;->l:Z

    iget p1, p0, Lvl/f;->n:I

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Lvl/f;->v()Z

    move-result v0

    if-eqz v0, :cond_3

    instance-of v0, p2, Lyl/a;

    if-eqz v0, :cond_5

    :cond_3
    iput-boolean v1, p0, Lvl/f;->l:Z

    iget v0, p0, Lvl/f;->o:I

    if-nez v0, :cond_5

    if-eqz p2, :cond_4

    invoke-virtual {p1}, Lvl/e;->k()Lql/y;

    move-result-object p1

    iget-object v0, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {p0, p1, v0, p2}, Lvl/f;->g(Lql/y;Lql/e0;Ljava/io/IOException;)V

    :cond_4
    iget p1, p0, Lvl/f;->n:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_5
    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized a(Lyl/f;Lyl/m;)V
    .locals 1

    monitor-enter p0

    :try_start_0
    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "settings"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lyl/m;->d()I

    move-result p1

    iput p1, p0, Lvl/f;->q:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public b(Lyl/i;)V
    .locals 2

    const-string v0, "stream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lyl/b;->REFUSED_STREAM:Lyl/b;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lyl/i;->d(Lyl/b;Ljava/io/IOException;)V

    return-void
.end method

.method public final d()V
    .locals 1

    iget-object v0, p0, Lvl/f;->e:Ljava/net/Socket;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lrl/d;->n(Ljava/net/Socket;)V

    :goto_0
    return-void
.end method

.method public final f(IIIIZLql/e;Lql/r;)V
    .locals 16

    move-object/from16 v7, p0

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    const-string v0, "call"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventListener"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v7, Lvl/f;->h:Lql/z;

    const/4 v10, 0x1

    if-nez v0, :cond_0

    move v0, v10

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_d

    iget-object v0, v7, Lvl/f;->d:Lql/e0;

    invoke-virtual {v0}, Lql/e0;->a()Lql/a;

    move-result-object v0

    invoke-virtual {v0}, Lql/a;->b()Ljava/util/List;

    move-result-object v0

    new-instance v11, Lvl/b;

    invoke-direct {v11, v0}, Lvl/b;-><init>(Ljava/util/List;)V

    iget-object v1, v7, Lvl/f;->d:Lql/e0;

    invoke-virtual {v1}, Lql/e0;->a()Lql/a;

    move-result-object v1

    invoke-virtual {v1}, Lql/a;->k()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v1

    if-nez v1, :cond_3

    sget-object v1, Lql/l;->k:Lql/l;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, v7, Lvl/f;->d:Lql/e0;

    invoke-virtual {v0}, Lql/e0;->a()Lql/a;

    move-result-object v0

    invoke-virtual {v0}, Lql/a;->l()Lql/u;

    move-result-object v0

    invoke-virtual {v0}, Lql/u;->h()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lzl/j;->a:Lzl/j$a;

    invoke-virtual {v1}, Lzl/j$a;->g()Lzl/j;

    move-result-object v1

    invoke-virtual {v1, v0}, Lzl/j;->i(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    new-instance v1, Lvl/i;

    new-instance v2, Ljava/net/UnknownServiceException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CLEARTEXT communication to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " not permitted by network security policy"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lvl/i;-><init>(Ljava/io/IOException;)V

    throw v1

    :cond_2
    new-instance v0, Lvl/i;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "CLEARTEXT communication not enabled for client"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lvl/i;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_3
    iget-object v0, v7, Lvl/f;->d:Lql/e0;

    invoke-virtual {v0}, Lql/e0;->a()Lql/a;

    move-result-object v0

    invoke-virtual {v0}, Lql/a;->f()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lql/z;->H2_PRIOR_KNOWLEDGE:Lql/z;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :goto_1
    const/4 v12, 0x0

    move-object v13, v12

    :goto_2
    :try_start_0
    iget-object v0, v7, Lvl/f;->d:Lql/e0;

    invoke-virtual {v0}, Lql/e0;->c()Z

    move-result v0

    if-eqz v0, :cond_5

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    invoke-direct/range {v1 .. v6}, Lvl/f;->j(IIILql/e;Lql/r;)V

    iget-object v0, v7, Lvl/f;->e:Ljava/net/Socket;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    move/from16 v14, p1

    move/from16 v15, p2

    goto :goto_3

    :cond_5
    move/from16 v14, p1

    move/from16 v15, p2

    :try_start_1
    invoke-direct {v7, v14, v15, v8, v9}, Lvl/f;->h(IILql/e;Lql/r;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :goto_3
    move/from16 v6, p4

    :try_start_2
    invoke-direct {v7, v11, v6, v8, v9}, Lvl/f;->m(Lvl/b;ILql/e;Lql/r;)V

    iget-object v0, v7, Lvl/f;->d:Lql/e0;

    invoke-virtual {v0}, Lql/e0;->d()Ljava/net/InetSocketAddress;

    move-result-object v0

    iget-object v1, v7, Lvl/f;->d:Lql/e0;

    invoke-virtual {v1}, Lql/e0;->b()Ljava/net/Proxy;

    move-result-object v1

    iget-object v2, v7, Lvl/f;->h:Lql/z;

    invoke-virtual {v9, v8, v0, v1, v2}, Lql/r;->g(Lql/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lql/z;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :goto_4
    iget-object v0, v7, Lvl/f;->d:Lql/e0;

    invoke-virtual {v0}, Lql/e0;->c()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, v7, Lvl/f;->e:Ljava/net/Socket;

    if-eqz v0, :cond_6

    goto :goto_5

    :cond_6
    new-instance v0, Lvl/i;

    new-instance v1, Ljava/net/ProtocolException;

    const-string v2, "Too many tunnel connections attempted: 21"

    invoke-direct {v1, v2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lvl/i;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_7
    :goto_5
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iput-wide v0, v7, Lvl/f;->s:J

    return-void

    :catch_0
    move-exception v0

    goto :goto_7

    :catch_1
    move-exception v0

    goto :goto_6

    :catch_2
    move-exception v0

    move/from16 v14, p1

    move/from16 v15, p2

    :goto_6
    move/from16 v6, p4

    :goto_7
    iget-object v1, v7, Lvl/f;->f:Ljava/net/Socket;

    if-nez v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-static {v1}, Lrl/d;->n(Ljava/net/Socket;)V

    :goto_8
    iget-object v1, v7, Lvl/f;->e:Ljava/net/Socket;

    if-nez v1, :cond_9

    goto :goto_9

    :cond_9
    invoke-static {v1}, Lrl/d;->n(Ljava/net/Socket;)V

    :goto_9
    iput-object v12, v7, Lvl/f;->f:Ljava/net/Socket;

    iput-object v12, v7, Lvl/f;->e:Ljava/net/Socket;

    iput-object v12, v7, Lvl/f;->j:Ldm/d;

    iput-object v12, v7, Lvl/f;->k:Ldm/c;

    iput-object v12, v7, Lvl/f;->g:Lql/s;

    iput-object v12, v7, Lvl/f;->h:Lql/z;

    iput-object v12, v7, Lvl/f;->i:Lyl/f;

    iput v10, v7, Lvl/f;->q:I

    iget-object v1, v7, Lvl/f;->d:Lql/e0;

    invoke-virtual {v1}, Lql/e0;->d()Ljava/net/InetSocketAddress;

    move-result-object v3

    iget-object v1, v7, Lvl/f;->d:Lql/e0;

    invoke-virtual {v1}, Lql/e0;->b()Ljava/net/Proxy;

    move-result-object v4

    const/4 v5, 0x0

    move-object/from16 v1, p7

    move-object/from16 v2, p6

    move-object v6, v0

    invoke-virtual/range {v1 .. v6}, Lql/r;->h(Lql/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lql/z;Ljava/io/IOException;)V

    if-nez v13, :cond_a

    new-instance v13, Lvl/i;

    invoke-direct {v13, v0}, Lvl/i;-><init>(Ljava/io/IOException;)V

    goto :goto_a

    :cond_a
    invoke-virtual {v13, v0}, Lvl/i;->a(Ljava/io/IOException;)V

    :goto_a
    if-eqz p5, :cond_b

    invoke-virtual {v11, v0}, Lvl/b;->b(Ljava/io/IOException;)Z

    move-result v0

    if-eqz v0, :cond_b

    goto/16 :goto_2

    :cond_b
    throw v13

    :cond_c
    new-instance v0, Lvl/i;

    new-instance v1, Ljava/net/UnknownServiceException;

    const-string v2, "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"

    invoke-direct {v1, v2}, Ljava/net/UnknownServiceException;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lvl/i;-><init>(Ljava/io/IOException;)V

    throw v0

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "already connected"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final g(Lql/y;Lql/e0;Ljava/io/IOException;)V
    .locals 3

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failedRoute"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "failure"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lql/e0;->b()Ljava/net/Proxy;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    sget-object v1, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-eq v0, v1, :cond_0

    invoke-virtual {p2}, Lql/e0;->a()Lql/a;

    move-result-object v0

    invoke-virtual {v0}, Lql/a;->i()Ljava/net/ProxySelector;

    move-result-object v1

    invoke-virtual {v0}, Lql/a;->l()Lql/u;

    move-result-object v0

    invoke-virtual {v0}, Lql/u;->r()Ljava/net/URI;

    move-result-object v0

    invoke-virtual {p2}, Lql/e0;->b()Ljava/net/Proxy;

    move-result-object v2

    invoke-virtual {v2}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v2

    invoke-virtual {v1, v0, v2, p3}, Ljava/net/ProxySelector;->connectFailed(Ljava/net/URI;Ljava/net/SocketAddress;Ljava/io/IOException;)V

    :cond_0
    invoke-virtual {p1}, Lql/y;->s()Lvl/h;

    move-result-object p1

    invoke-virtual {p1, p2}, Lvl/h;->b(Lql/e0;)V

    return-void
.end method

.method public final n()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/ref/Reference<",
            "Lvl/e;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lvl/f;->r:Ljava/util/List;

    return-object v0
.end method

.method public final o()J
    .locals 2

    iget-wide v0, p0, Lvl/f;->s:J

    return-wide v0
.end method

.method public final p()Z
    .locals 1

    iget-boolean v0, p0, Lvl/f;->l:Z

    return v0
.end method

.method public final q()I
    .locals 1

    iget v0, p0, Lvl/f;->n:I

    return v0
.end method

.method public r()Lql/s;
    .locals 1

    iget-object v0, p0, Lvl/f;->g:Lql/s;

    return-object v0
.end method

.method public final declared-synchronized s()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lvl/f;->o:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lvl/f;->o:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final t(Lql/a;Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lql/a;",
            "Ljava/util/List<",
            "Lql/e0;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Lrl/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Thread "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, " MUST hold lock on "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lvl/f;->r:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget v1, p0, Lvl/f;->q:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_9

    iget-boolean v0, p0, Lvl/f;->l:Z

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v0}, Lql/e0;->a()Lql/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lql/a;->d(Lql/a;)Z

    move-result v0

    if-nez v0, :cond_3

    return v2

    :cond_3
    invoke-virtual {p1}, Lql/a;->l()Lql/u;

    move-result-object v0

    invoke-virtual {v0}, Lql/u;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lvl/f;->z()Lql/e0;

    move-result-object v1

    invoke-virtual {v1}, Lql/e0;->a()Lql/a;

    move-result-object v1

    invoke-virtual {v1}, Lql/a;->l()Lql/u;

    move-result-object v1

    invoke-virtual {v1}, Lql/u;->h()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_4

    return v1

    :cond_4
    iget-object v0, p0, Lvl/f;->i:Lyl/f;

    if-nez v0, :cond_5

    return v2

    :cond_5
    if-eqz p2, :cond_9

    invoke-direct {p0, p2}, Lvl/f;->A(Ljava/util/List;)Z

    move-result p2

    if-nez p2, :cond_6

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Lql/a;->e()Ljavax/net/ssl/HostnameVerifier;

    move-result-object p2

    sget-object v0, Lcm/d;->a:Lcm/d;

    if-eq p2, v0, :cond_7

    return v2

    :cond_7
    invoke-virtual {p1}, Lql/a;->l()Lql/u;

    move-result-object p2

    invoke-direct {p0, p2}, Lvl/f;->F(Lql/u;)Z

    move-result p2

    if-nez p2, :cond_8

    return v2

    :cond_8
    :try_start_0
    invoke-virtual {p1}, Lql/a;->a()Lql/g;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lql/a;->l()Lql/u;

    move-result-object p1

    invoke-virtual {p1}, Lql/u;->h()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0}, Lvl/f;->r()Lql/s;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lql/s;->d()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lql/g;->a(Ljava/lang/String;Ljava/util/List;)V
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    return v1

    :catch_0
    :cond_9
    :goto_1
    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Connection{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v1}, Lql/e0;->a()Lql/a;

    move-result-object v1

    invoke-virtual {v1}, Lql/a;->l()Lql/u;

    move-result-object v1

    invoke-virtual {v1}, Lql/u;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3a

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v1}, Lql/e0;->a()Lql/a;

    move-result-object v1

    invoke-virtual {v1}, Lql/a;->l()Lql/u;

    move-result-object v1

    invoke-virtual {v1}, Lql/u;->m()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", proxy="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v1}, Lql/e0;->b()Ljava/net/Proxy;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " hostAddress="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lvl/f;->d:Lql/e0;

    invoke-virtual {v1}, Lql/e0;->d()Ljava/net/InetSocketAddress;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " cipherSuite="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lvl/f;->g:Lql/s;

    const-string v2, "none"

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lql/s;->a()Lql/i;

    move-result-object v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " protocol="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lvl/f;->h:Lql/z;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u(Z)Z
    .locals 7

    sget-boolean v0, Lrl/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Thread "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " MUST NOT hold lock on "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    iget-object v2, p0, Lvl/f;->e:Ljava/net/Socket;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v3, p0, Lvl/f;->f:Ljava/net/Socket;

    invoke-static {v3}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v4, p0, Lvl/f;->j:Ldm/d;

    invoke-static {v4}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isClosed()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isInputShutdown()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-virtual {v3}, Ljava/net/Socket;->isOutputShutdown()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lvl/f;->i:Lyl/f;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v0, v1}, Lyl/f;->H0(J)Z

    move-result p1

    return p1

    :cond_3
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lvl/f;->o()J

    move-result-wide v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sub-long/2addr v0, v5

    monitor-exit p0

    const-wide v5, 0x2540be400L

    cmp-long v0, v0, v5

    if-ltz v0, :cond_4

    if-eqz p1, :cond_4

    invoke-static {v3, v4}, Lrl/d;->F(Ljava/net/Socket;Ldm/d;)Z

    move-result p1

    return p1

    :cond_4
    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_5
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final v()Z
    .locals 1

    iget-object v0, p0, Lvl/f;->i:Lyl/f;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final w(Lql/y;Lwl/g;)Lwl/d;
    .locals 6

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chain"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvl/f;->f:Ljava/net/Socket;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v1, p0, Lvl/f;->j:Ldm/d;

    invoke-static {v1}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v2, p0, Lvl/f;->k:Ldm/c;

    invoke-static {v2}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v3, p0, Lvl/f;->i:Lyl/f;

    if-eqz v3, :cond_0

    new-instance v0, Lyl/g;

    invoke-direct {v0, p1, p0, p2, v3}, Lyl/g;-><init>(Lql/y;Lvl/f;Lwl/g;Lyl/f;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lwl/g;->j()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-interface {v1}, Ldm/x;->m()Ldm/y;

    move-result-object v0

    invoke-virtual {p2}, Lwl/g;->g()I

    move-result v3

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0, v3, v4, v5}, Ldm/y;->g(JLjava/util/concurrent/TimeUnit;)Ldm/y;

    invoke-interface {v2}, Ldm/v;->m()Ldm/y;

    move-result-object v0

    invoke-virtual {p2}, Lwl/g;->i()I

    move-result p2

    int-to-long v3, p2

    invoke-virtual {v0, v3, v4, v5}, Ldm/y;->g(JLjava/util/concurrent/TimeUnit;)Ldm/y;

    new-instance v0, Lxl/b;

    invoke-direct {v0, p1, p0, v1, v2}, Lxl/b;-><init>(Lql/y;Lvl/f;Ldm/d;Ldm/c;)V

    :goto_0
    return-object v0
.end method

.method public final declared-synchronized x()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lvl/f;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized y()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lvl/f;->l:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public z()Lql/e0;
    .locals 1

    iget-object v0, p0, Lvl/f;->d:Lql/e0;

    return-object v0
.end method
