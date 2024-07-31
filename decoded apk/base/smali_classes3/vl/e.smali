.class public final Lvl/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lql/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvl/e$a;,
        Lvl/e$b;
    }
.end annotation


# instance fields
.field private volatile A:Z

.field private volatile B:Lvl/c;

.field private volatile C:Lvl/f;

.field private final a:Lql/y;

.field private final b:Lql/a0;

.field private final c:Z

.field private final d:Lvl/g;

.field private final e:Lql/r;

.field private final f:Lvl/e$c;

.field private final r:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private s:Ljava/lang/Object;

.field private t:Lvl/d;

.field private u:Lvl/f;

.field private v:Z

.field private w:Lvl/c;

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method public constructor <init>(Lql/y;Lql/a0;Z)V
    .locals 1

    const-string v0, "client"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvl/e;->a:Lql/y;

    iput-object p2, p0, Lvl/e;->b:Lql/a0;

    iput-boolean p3, p0, Lvl/e;->c:Z

    invoke-virtual {p1}, Lql/y;->i()Lql/k;

    move-result-object p2

    invoke-virtual {p2}, Lql/k;->a()Lvl/g;

    move-result-object p2

    iput-object p2, p0, Lvl/e;->d:Lvl/g;

    invoke-virtual {p1}, Lql/y;->p()Lql/r$c;

    move-result-object p1

    invoke-interface {p1, p0}, Lql/r$c;->a(Lql/e;)Lql/r;

    move-result-object p1

    iput-object p1, p0, Lvl/e;->e:Lql/r;

    new-instance p1, Lvl/e$c;

    invoke-direct {p1, p0}, Lvl/e$c;-><init>(Lvl/e;)V

    invoke-virtual {p0}, Lvl/e;->k()Lql/y;

    move-result-object p2

    invoke-virtual {p2}, Lql/y;->e()I

    move-result p2

    int-to-long p2, p2

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, p2, p3, v0}, Ldm/y;->g(JLjava/util/concurrent/TimeUnit;)Ldm/y;

    iput-object p1, p0, Lvl/e;->f:Lvl/e$c;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    iput-object p1, p0, Lvl/e;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lvl/e;->z:Z

    return-void
.end method

.method private final C(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/io/IOException;",
            ">(TE;)TE;"
        }
    .end annotation

    iget-boolean v0, p0, Lvl/e;->v:Z

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lvl/e;->f:Lvl/e$c;

    invoke-virtual {v0}, Ldm/a;->u()Z

    move-result v0

    if-nez v0, :cond_1

    return-object p1

    :cond_1
    new-instance v0, Ljava/io/InterruptedIOException;

    const-string v1, "timeout"

    invoke-direct {v0, v1}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    if-eqz p1, :cond_2

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    :cond_2
    return-object v0
.end method

.method private final D()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lvl/e;->R0()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "canceled "

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lvl/e;->c:Z

    if-eqz v1, :cond_1

    const-string v1, "web socket"

    goto :goto_1

    :cond_1
    const-string v1, "call"

    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " to "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lvl/e;->w()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic a(Lvl/e;)Lvl/e$c;
    .locals 0

    iget-object p0, p0, Lvl/e;->f:Lvl/e$c;

    return-object p0
.end method

.method public static final synthetic b(Lvl/e;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lvl/e;->D()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final d(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/io/IOException;",
            ">(TE;)TE;"
        }
    .end annotation

    sget-boolean v0, Lrl/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

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
    iget-object v1, p0, Lvl/e;->u:Lvl/f;

    if-eqz v1, :cond_8

    if-eqz v0, :cond_3

    invoke-static {v1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " MUST NOT hold lock on "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_3
    :goto_1
    monitor-enter v1

    :try_start_0
    invoke-virtual {p0}, Lvl/e;->x()Ljava/net/Socket;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    iget-object v2, p0, Lvl/e;->u:Lvl/f;

    if-nez v2, :cond_5

    if-nez v0, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {v0}, Lrl/d;->n(Ljava/net/Socket;)V

    :goto_2
    iget-object v0, p0, Lvl/e;->e:Lql/r;

    invoke-virtual {v0, p0, v1}, Lql/r;->k(Lql/e;Lql/j;)V

    goto :goto_4

    :cond_5
    if-nez v0, :cond_6

    const/4 v0, 0x1

    goto :goto_3

    :cond_6
    const/4 v0, 0x0

    :goto_3
    if-eqz v0, :cond_7

    goto :goto_4

    :cond_7
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catchall_0
    move-exception p1

    monitor-exit v1

    throw p1

    :cond_8
    :goto_4
    invoke-direct {p0, p1}, Lvl/e;->C(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    if-eqz p1, :cond_9

    iget-object p1, p0, Lvl/e;->e:Lql/r;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {p1, p0, v0}, Lql/r;->d(Lql/e;Ljava/io/IOException;)V

    goto :goto_5

    :cond_9
    iget-object p1, p0, Lvl/e;->e:Lql/r;

    invoke-virtual {p1, p0}, Lql/r;->c(Lql/e;)V

    :goto_5
    return-object v0
.end method

.method private final e()V
    .locals 2

    sget-object v0, Lzl/j;->a:Lzl/j$a;

    invoke-virtual {v0}, Lzl/j$a;->g()Lzl/j;

    move-result-object v0

    const-string v1, "response.body().close()"

    invoke-virtual {v0, v1}, Lzl/j;->h(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lvl/e;->s:Ljava/lang/Object;

    iget-object v0, p0, Lvl/e;->e:Lql/r;

    invoke-virtual {v0, p0}, Lql/r;->e(Lql/e;)V

    return-void
.end method

.method private final h(Lql/u;)Lql/a;
    .locals 14

    invoke-virtual {p1}, Lql/u;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {v0}, Lql/y;->G()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iget-object v1, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {v1}, Lql/y;->t()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v1

    iget-object v2, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {v2}, Lql/y;->g()Lql/g;

    move-result-object v2

    move-object v6, v0

    move-object v7, v1

    move-object v8, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    move-object v6, v0

    move-object v7, v6

    move-object v8, v7

    :goto_0
    new-instance v0, Lql/a;

    invoke-virtual {p1}, Lql/u;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lql/u;->m()I

    move-result v3

    iget-object p1, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {p1}, Lql/y;->m()Lql/q;

    move-result-object v4

    iget-object p1, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {p1}, Lql/y;->F()Ljavax/net/SocketFactory;

    move-result-object v5

    iget-object p1, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {p1}, Lql/y;->B()Lql/b;

    move-result-object v9

    iget-object p1, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {p1}, Lql/y;->A()Ljava/net/Proxy;

    move-result-object v10

    iget-object p1, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {p1}, Lql/y;->z()Ljava/util/List;

    move-result-object v11

    iget-object p1, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {p1}, Lql/y;->j()Ljava/util/List;

    move-result-object v12

    iget-object p1, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {p1}, Lql/y;->C()Ljava/net/ProxySelector;

    move-result-object v13

    move-object v1, v0

    invoke-direct/range {v1 .. v13}, Lql/a;-><init>(Ljava/lang/String;ILql/q;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lql/g;Lql/b;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V

    return-object v0
.end method


# virtual methods
.method public final A(Lvl/f;)V
    .locals 0

    iput-object p1, p0, Lvl/e;->C:Lvl/f;

    return-void
.end method

.method public final B()V
    .locals 2

    iget-boolean v0, p0, Lvl/e;->v:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lvl/e;->v:Z

    iget-object v0, p0, Lvl/e;->f:Lvl/e$c;

    invoke-virtual {v0}, Ldm/a;->u()Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public Q(Lql/f;)V
    .locals 3

    const-string v0, "responseCallback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvl/e;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lvl/e;->e()V

    iget-object v0, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {v0}, Lql/y;->l()Lql/p;

    move-result-object v0

    new-instance v1, Lvl/e$a;

    invoke-direct {v1, p0, p1}, Lvl/e$a;-><init>(Lvl/e;Lql/f;)V

    invoke-virtual {v0, v1}, Lql/p;->b(Lvl/e$a;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already Executed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public R0()Z
    .locals 1

    iget-boolean v0, p0, Lvl/e;->A:Z

    return v0
.end method

.method public final c(Lvl/f;)V
    .locals 3

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-boolean v0, Lrl/d;->h:Z

    if-eqz v0, :cond_1

    invoke-static {p1}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Thread "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " MUST hold lock on "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lvl/e;->u:Lvl/f;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    if-eqz v0, :cond_3

    iput-object p1, p0, Lvl/e;->u:Lvl/f;

    invoke-virtual {p1}, Lvl/f;->n()Ljava/util/List;

    move-result-object p1

    new-instance v0, Lvl/e$b;

    iget-object v1, p0, Lvl/e;->s:Ljava/lang/Object;

    invoke-direct {v0, p0, v1}, Lvl/e$b;-><init>(Lvl/e;Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public cancel()V
    .locals 1

    iget-boolean v0, p0, Lvl/e;->A:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lvl/e;->A:Z

    iget-object v0, p0, Lvl/e;->B:Lvl/c;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lvl/c;->b()V

    :goto_0
    iget-object v0, p0, Lvl/e;->C:Lvl/f;

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lvl/f;->d()V

    :goto_1
    iget-object v0, p0, Lvl/e;->e:Lql/r;

    invoke-virtual {v0, p0}, Lql/r;->f(Lql/e;)V

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lvl/e;->g()Lvl/e;

    move-result-object v0

    return-object v0
.end method

.method public g()Lvl/e;
    .locals 4

    new-instance v0, Lvl/e;

    iget-object v1, p0, Lvl/e;->a:Lql/y;

    iget-object v2, p0, Lvl/e;->b:Lql/a0;

    iget-boolean v3, p0, Lvl/e;->c:Z

    invoke-direct {v0, v1, v2, v3}, Lvl/e;-><init>(Lql/y;Lql/a0;Z)V

    return-object v0
.end method

.method public final i(Lql/a0;Z)V
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvl/e;->w:Lvl/c;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lvl/e;->y:Z

    xor-int/2addr v0, v1

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lvl/e;->x:Z

    xor-int/2addr v0, v1

    if-eqz v0, :cond_2

    sget-object v0, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz p2, :cond_1

    new-instance p2, Lvl/d;

    iget-object v0, p0, Lvl/e;->d:Lvl/g;

    invoke-virtual {p1}, Lql/a0;->i()Lql/u;

    move-result-object p1

    invoke-direct {p0, p1}, Lvl/e;->h(Lql/u;)Lql/a;

    move-result-object p1

    iget-object v1, p0, Lvl/e;->e:Lql/r;

    invoke-direct {p2, v0, p1, p0, v1}, Lvl/d;-><init>(Lvl/g;Lql/a;Lvl/e;Lql/r;)V

    iput-object p2, p0, Lvl/e;->t:Lvl/d;

    :cond_1
    return-void

    :cond_2
    :try_start_1
    const-string p1, "Check failed."

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    const-string p1, "cannot make a new request because the previous response is still open: please call response.close()"

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_4
    const-string p1, "Check failed."

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final j(Z)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lvl/e;->z:Z

    if-eqz v0, :cond_2

    sget-object v0, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lvl/e;->B:Lvl/c;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lvl/c;->d()V

    :cond_1
    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, Lvl/e;->w:Lvl/c;

    return-void

    :cond_2
    :try_start_1
    const-string p1, "released"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final k()Lql/y;
    .locals 1

    iget-object v0, p0, Lvl/e;->a:Lql/y;

    return-object v0
.end method

.method public final l()Lvl/f;
    .locals 1

    iget-object v0, p0, Lvl/e;->u:Lvl/f;

    return-object v0
.end method

.method public final m()Lql/r;
    .locals 1

    iget-object v0, p0, Lvl/e;->e:Lql/r;

    return-object v0
.end method

.method public n()Lql/c0;
    .locals 3

    iget-object v0, p0, Lvl/e;->r:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lvl/e;->f:Lvl/e$c;

    invoke-virtual {v0}, Ldm/a;->t()V

    invoke-direct {p0}, Lvl/e;->e()V

    :try_start_0
    iget-object v0, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {v0}, Lql/y;->l()Lql/p;

    move-result-object v0

    invoke-virtual {v0, p0}, Lql/p;->c(Lvl/e;)V

    invoke-virtual {p0}, Lvl/e;->s()Lql/c0;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {v1}, Lql/y;->l()Lql/p;

    move-result-object v1

    invoke-virtual {v1, p0}, Lql/p;->h(Lvl/e;)V

    return-object v0

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {v1}, Lql/y;->l()Lql/p;

    move-result-object v1

    invoke-virtual {v1, p0}, Lql/p;->h(Lvl/e;)V

    throw v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Already Executed"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public o()Lql/a0;
    .locals 1

    iget-object v0, p0, Lvl/e;->b:Lql/a0;

    return-object v0
.end method

.method public final p()Z
    .locals 1

    iget-boolean v0, p0, Lvl/e;->c:Z

    return v0
.end method

.method public final q()Lvl/c;
    .locals 1

    iget-object v0, p0, Lvl/e;->w:Lvl/c;

    return-object v0
.end method

.method public final r()Lql/a0;
    .locals 1

    iget-object v0, p0, Lvl/e;->b:Lql/a0;

    return-object v0
.end method

.method public final s()Lql/c0;
    .locals 12

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {v0}, Lql/y;->u()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Ldk/p;->u(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    new-instance v0, Lwl/j;

    iget-object v1, p0, Lvl/e;->a:Lql/y;

    invoke-direct {v0, v1}, Lwl/j;-><init>(Lql/y;)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v0, Lwl/a;

    iget-object v1, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {v1}, Lql/y;->k()Lql/n;

    move-result-object v1

    invoke-direct {v0, v1}, Lwl/a;-><init>(Lql/n;)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v0, Ltl/a;

    iget-object v1, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {v1}, Lql/y;->d()Lql/c;

    const/4 v9, 0x0

    invoke-direct {v0, v9}, Ltl/a;-><init>(Lql/c;)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    sget-object v0, Lvl/a;->a:Lvl/a;

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    iget-boolean v0, p0, Lvl/e;->c:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {v0}, Lql/y;->v()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Ldk/p;->u(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    :cond_0
    new-instance v0, Lwl/b;

    iget-boolean v1, p0, Lvl/e;->c:Z

    invoke-direct {v0, v1}, Lwl/b;-><init>(Z)V

    invoke-interface {v2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v10, Lwl/g;

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lvl/e;->b:Lql/a0;

    iget-object v0, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {v0}, Lql/y;->h()I

    move-result v6

    iget-object v0, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {v0}, Lql/y;->D()I

    move-result v7

    iget-object v0, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {v0}, Lql/y;->I()I

    move-result v8

    move-object v0, v10

    move-object v1, p0

    invoke-direct/range {v0 .. v8}, Lwl/g;-><init>(Lvl/e;Ljava/util/List;ILvl/c;Lql/a0;III)V

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lvl/e;->b:Lql/a0;

    invoke-virtual {v10, v1}, Lwl/g;->a(Lql/a0;)Lql/c0;

    move-result-object v1

    invoke-virtual {p0}, Lvl/e;->R0()Z

    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    invoke-virtual {p0, v9}, Lvl/e;->v(Ljava/io/IOException;)Ljava/io/IOException;

    return-object v1

    :cond_1
    :try_start_1
    invoke-static {v1}, Lrl/d;->m(Ljava/io/Closeable;)V

    new-instance v1, Ljava/io/IOException;

    const-string v2, "Canceled"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v1

    goto :goto_0

    :catch_0
    move-exception v0

    const/4 v1, 0x1

    :try_start_2
    invoke-virtual {p0, v0}, Lvl/e;->v(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v2, "null cannot be cast to non-null type kotlin.Throwable"

    invoke-direct {v0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v0

    move v11, v1

    move-object v1, v0

    move v0, v11

    :goto_0
    if-nez v0, :cond_3

    invoke-virtual {p0, v9}, Lvl/e;->v(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_3
    throw v1
.end method

.method public final t(Lwl/g;)Lvl/c;
    .locals 4

    const-string v0, "chain"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lvl/e;->z:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lvl/e;->y:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lvl/e;->x:Z

    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    sget-object v0, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit p0

    iget-object v0, p0, Lvl/e;->t:Lvl/d;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    iget-object v2, p0, Lvl/e;->a:Lql/y;

    invoke-virtual {v0, v2, p1}, Lvl/d;->a(Lql/y;Lwl/g;)Lwl/d;

    move-result-object p1

    new-instance v2, Lvl/c;

    iget-object v3, p0, Lvl/e;->e:Lql/r;

    invoke-direct {v2, p0, v3, v0, p1}, Lvl/c;-><init>(Lvl/e;Lql/r;Lvl/d;Lwl/d;)V

    iput-object v2, p0, Lvl/e;->w:Lvl/c;

    iput-object v2, p0, Lvl/e;->B:Lvl/c;

    monitor-enter p0

    :try_start_1
    iput-boolean v1, p0, Lvl/e;->x:Z

    iput-boolean v1, p0, Lvl/e;->y:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    iget-boolean p1, p0, Lvl/e;->A:Z

    if-nez p1, :cond_0

    return-object v2

    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Canceled"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1

    :cond_1
    :try_start_2
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const-string p1, "Check failed."

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const-string p1, "released"

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final u(Lvl/c;ZZLjava/io/IOException;)Ljava/io/IOException;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/io/IOException;",
            ">(",
            "Lvl/c;",
            "ZZTE;)TE;"
        }
    .end annotation

    const-string v0, "exchange"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lvl/e;->B:Lvl/c;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-object p4

    :cond_0
    monitor-enter p0

    const/4 p1, 0x0

    if-eqz p2, :cond_1

    :try_start_0
    iget-boolean v0, p0, Lvl/e;->x:Z

    if-nez v0, :cond_2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    :goto_0
    if-eqz p3, :cond_7

    iget-boolean v0, p0, Lvl/e;->y:Z

    if-eqz v0, :cond_7

    :cond_2
    if-eqz p2, :cond_3

    iput-boolean p1, p0, Lvl/e;->x:Z

    :cond_3
    if-eqz p3, :cond_4

    iput-boolean p1, p0, Lvl/e;->y:Z

    :cond_4
    iget-boolean p2, p0, Lvl/e;->x:Z

    const/4 p3, 0x1

    if-nez p2, :cond_5

    iget-boolean v0, p0, Lvl/e;->y:Z

    if-nez v0, :cond_5

    move v0, p3

    goto :goto_1

    :cond_5
    move v0, p1

    :goto_1
    if-nez p2, :cond_6

    iget-boolean p2, p0, Lvl/e;->y:Z

    if-nez p2, :cond_6

    iget-boolean p2, p0, Lvl/e;->z:Z

    if-nez p2, :cond_6

    move p1, p3

    :cond_6
    move p2, p1

    move p1, v0

    goto :goto_2

    :cond_7
    move p2, p1

    :goto_2
    sget-object p3, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz p1, :cond_9

    const/4 p1, 0x0

    iput-object p1, p0, Lvl/e;->B:Lvl/c;

    iget-object p1, p0, Lvl/e;->u:Lvl/f;

    if-nez p1, :cond_8

    goto :goto_3

    :cond_8
    invoke-virtual {p1}, Lvl/f;->s()V

    :cond_9
    :goto_3
    if-eqz p2, :cond_a

    invoke-direct {p0, p4}, Lvl/e;->d(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    return-object p1

    :cond_a
    return-object p4

    :goto_4
    monitor-exit p0

    throw p1
.end method

.method public final v(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lvl/e;->z:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lvl/e;->z:Z

    iget-boolean v0, p0, Lvl/e;->x:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lvl/e;->y:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    move v1, v0

    :cond_0
    sget-object v0, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz v1, :cond_1

    invoke-direct {p0, p1}, Lvl/e;->d(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    :cond_1
    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final w()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvl/e;->b:Lql/a0;

    invoke-virtual {v0}, Lql/a0;->i()Lql/u;

    move-result-object v0

    invoke-virtual {v0}, Lql/u;->o()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final x()Ljava/net/Socket;
    .locals 7

    iget-object v0, p0, Lvl/e;->u:Lvl/f;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    sget-boolean v1, Lrl/d;->h:Z

    if-eqz v1, :cond_1

    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Thread "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " MUST hold lock on "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Lvl/f;->n()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, -0x1

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/ref/Reference;

    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, p0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_2

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    move v4, v6

    :goto_2
    if-eq v4, v6, :cond_4

    const/4 v3, 0x1

    :cond_4
    if-eqz v3, :cond_6

    invoke-interface {v1, v4}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, Lvl/e;->u:Lvl/f;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Lvl/f;->B(J)V

    iget-object v1, p0, Lvl/e;->d:Lvl/g;

    invoke-virtual {v1, v0}, Lvl/g;->c(Lvl/f;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lvl/f;->D()Ljava/net/Socket;

    move-result-object v0

    return-object v0

    :cond_5
    return-object v2

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final z()Z
    .locals 1

    iget-object v0, p0, Lvl/e;->t:Lvl/d;

    invoke-static {v0}, Lkotlin/jvm/internal/n;->b(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lvl/d;->e()Z

    move-result v0

    return v0
.end method
