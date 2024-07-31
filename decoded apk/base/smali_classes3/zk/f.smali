.class final Lzk/f;
.super Lzk/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lzk/a<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final d:Ljava/lang/Thread;

.field private final e:Lzk/g1;


# direct methods
.method public constructor <init>(Lgk/f;Ljava/lang/Thread;Lzk/g1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0, v0}, Lzk/a;-><init>(Lgk/f;ZZ)V

    iput-object p2, p0, Lzk/f;->d:Ljava/lang/Thread;

    iput-object p3, p0, Lzk/f;->e:Lzk/g1;

    return-void
.end method


# virtual methods
.method public final R0()Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-static {}, Lzk/c;->a()Lzk/b;

    :try_start_0
    iget-object v0, p0, Lzk/f;->e:Lzk/g1;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, v2, v1, v3}, Lzk/g1;->Y0(Lzk/g1;ZILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    :goto_0
    :try_start_1
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lzk/f;->e:Lzk/g1;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lzk/g1;->c1()J

    move-result-wide v4

    goto :goto_1

    :cond_1
    const-wide v4, 0x7fffffffffffffffL

    :goto_1
    invoke-virtual {p0}, Lzk/d2;->d0()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {}, Lzk/c;->a()Lzk/b;

    invoke-static {p0, v4, v5}, Ljava/util/concurrent/locks/LockSupport;->parkNanos(Ljava/lang/Object;J)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    :try_start_2
    iget-object v0, p0, Lzk/f;->e:Lzk/g1;

    if-eqz v0, :cond_3

    invoke-static {v0, v2, v1, v3}, Lzk/g1;->J0(Lzk/g1;ZILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_3
    invoke-static {}, Lzk/c;->a()Lzk/b;

    invoke-virtual {p0}, Lzk/d2;->Y()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lzk/e2;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lzk/a0;

    if-eqz v1, :cond_4

    move-object v3, v0

    check-cast v3, Lzk/a0;

    :cond_4
    if-nez v3, :cond_5

    return-object v0

    :cond_5
    iget-object v0, v3, Lzk/a0;->a:Ljava/lang/Throwable;

    throw v0

    :cond_6
    :try_start_3
    new-instance v0, Ljava/lang/InterruptedException;

    invoke-direct {v0}, Ljava/lang/InterruptedException;-><init>()V

    invoke-virtual {p0, v0}, Lzk/d2;->w(Ljava/lang/Throwable;)Z

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_2
    :try_start_4
    iget-object v4, p0, Lzk/f;->e:Lzk/g1;

    if-eqz v4, :cond_7

    invoke-static {v4, v2, v1, v3}, Lzk/g1;->J0(Lzk/g1;ZILjava/lang/Object;)V

    :cond_7
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {}, Lzk/c;->a()Lzk/b;

    throw v0
.end method

.method protected e0()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected t(Ljava/lang/Object;)V
    .locals 1

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    iget-object v0, p0, Lzk/f;->d:Ljava/lang/Thread;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lzk/f;->d:Ljava/lang/Thread;

    invoke-static {}, Lzk/c;->a()Lzk/b;

    invoke-static {p1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
