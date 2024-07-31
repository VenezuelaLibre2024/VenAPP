.class final Lrj/f$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lgj/b;
.implements Ldj/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrj/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Lgj/b;",
        "Ldj/q<",
        "TT;>;"
    }
.end annotation


# static fields
.field static final B:[Lrj/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lrj/f$a<",
            "**>;"
        }
    .end annotation
.end field

.field static final C:[Lrj/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lrj/f$a<",
            "**>;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = -0x1d634c9cafb5cc5aL


# instance fields
.field A:I

.field final a:Ldj/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/q<",
            "-TU;>;"
        }
    .end annotation
.end field

.field final b:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-TT;+",
            "Ldj/p<",
            "+TU;>;>;"
        }
    .end annotation
.end field

.field final c:Z

.field final d:I

.field final e:I

.field volatile f:Lmj/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmj/i<",
            "TU;>;"
        }
    .end annotation
.end field

.field volatile r:Z

.field final s:Lxj/c;

.field volatile t:Z

.field final u:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "[",
            "Lrj/f$a<",
            "**>;>;"
        }
    .end annotation
.end field

.field v:Lgj/b;

.field w:J

.field x:J

.field y:I

.field z:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ldj/p<",
            "+TU;>;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v1, v0, [Lrj/f$a;

    sput-object v1, Lrj/f$b;->B:[Lrj/f$a;

    new-array v0, v0, [Lrj/f$a;

    sput-object v0, Lrj/f$b;->C:[Lrj/f$a;

    return-void
.end method

.method constructor <init>(Ldj/q;Ljj/e;ZII)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TU;>;",
            "Ljj/e<",
            "-TT;+",
            "Ldj/p<",
            "+TU;>;>;ZII)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    new-instance v0, Lxj/c;

    invoke-direct {v0}, Lxj/c;-><init>()V

    iput-object v0, p0, Lrj/f$b;->s:Lxj/c;

    iput-object p1, p0, Lrj/f$b;->a:Ldj/q;

    iput-object p2, p0, Lrj/f$b;->b:Ljj/e;

    iput-boolean p3, p0, Lrj/f$b;->c:Z

    iput p4, p0, Lrj/f$b;->d:I

    iput p5, p0, Lrj/f$b;->e:I

    const p1, 0x7fffffff

    if-eq p4, p1, :cond_0

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1, p4}, Ljava/util/ArrayDeque;-><init>(I)V

    iput-object p1, p0, Lrj/f$b;->z:Ljava/util/Queue;

    :cond_0
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object p2, Lrj/f$b;->B:[Lrj/f$a;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lrj/f$b;->u:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lrj/f$b;->r:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lrj/f$b;->r:Z

    invoke-virtual {p0}, Lrj/f$b;->g()V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lrj/f$b;->v:Lgj/b;

    invoke-static {v0, p1}, Lkj/b;->p(Lgj/b;Lgj/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lrj/f$b;->v:Lgj/b;

    iget-object p1, p0, Lrj/f$b;->a:Ldj/q;

    invoke-interface {p1, p0}, Ldj/q;->b(Lgj/b;)V

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lrj/f$b;->r:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lrj/f$b;->b:Ljj/e;

    invoke-interface {v0, p1}, Ljj/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The mapper returned a null ObservableSource"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldj/p;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    iget v0, p0, Lrj/f$b;->d:I

    const v1, 0x7fffffff

    if-eq v0, v1, :cond_2

    monitor-enter p0

    :try_start_1
    iget v0, p0, Lrj/f$b;->A:I

    iget v1, p0, Lrj/f$b;->d:I

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lrj/f$b;->z:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    monitor-exit p0

    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lrj/f$b;->A:I

    monitor-exit p0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {p0, p1}, Lrj/f$b;->k(Ldj/p;)V

    return-void

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lrj/f$b;->v:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    invoke-virtual {p0, p1}, Lrj/f$b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method d(Lrj/f$a;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrj/f$a<",
            "TT;TU;>;)Z"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, Lrj/f$b;->u:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrj/f$a;

    sget-object v1, Lrj/f$b;->C:[Lrj/f$a;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lrj/f$a;->d()V

    return v2

    :cond_1
    array-length v1, v0

    add-int/lit8 v3, v1, 0x1

    new-array v3, v3, [Lrj/f$a;

    invoke-static {v0, v2, v3, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    aput-object p1, v3, v1

    iget-object v1, p0, Lrj/f$b;->u:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, v0, v3}, Le2/c;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1
.end method

.method public dispose()V
    .locals 2

    iget-boolean v0, p0, Lrj/f$b;->t:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lrj/f$b;->t:Z

    invoke-virtual {p0}, Lrj/f$b;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lrj/f$b;->s:Lxj/c;

    invoke-virtual {v0}, Lxj/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    sget-object v1, Lxj/g;->a:Ljava/lang/Throwable;

    if-eq v0, v1, :cond_0

    invoke-static {v0}, Lyj/a;->q(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method e()Z
    .locals 3

    iget-boolean v0, p0, Lrj/f$b;->t:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lrj/f$b;->s:Lxj/c;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Throwable;

    iget-boolean v2, p0, Lrj/f$b;->c:Z

    if-nez v2, :cond_2

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lrj/f$b;->f()Z

    iget-object v0, p0, Lrj/f$b;->s:Lxj/c;

    invoke-virtual {v0}, Lxj/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    sget-object v2, Lxj/g;->a:Ljava/lang/Throwable;

    if-eq v0, v2, :cond_1

    iget-object v2, p0, Lrj/f$b;->a:Ldj/q;

    invoke-interface {v2, v0}, Ldj/q;->onError(Ljava/lang/Throwable;)V

    :cond_1
    return v1

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method f()Z
    .locals 4

    iget-object v0, p0, Lrj/f$b;->v:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    iget-object v0, p0, Lrj/f$b;->u:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrj/f$a;

    sget-object v1, Lrj/f$b;->C:[Lrj/f$a;

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lrj/f$b;->u:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrj/f$a;

    if-eq v0, v1, :cond_1

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3}, Lrj/f$a;->d()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    return v0

    :cond_1
    return v2
.end method

.method g()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lrj/f$b;->i()V

    :cond_0
    return-void
.end method

.method public h()Z
    .locals 1

    iget-boolean v0, p0, Lrj/f$b;->t:Z

    return v0
.end method

.method i()V
    .locals 13

    iget-object v0, p0, Lrj/f$b;->a:Ldj/q;

    const/4 v1, 0x1

    move v2, v1

    :cond_0
    :goto_0
    invoke-virtual {p0}, Lrj/f$b;->e()Z

    move-result v3

    if-eqz v3, :cond_1

    return-void

    :cond_1
    iget-object v3, p0, Lrj/f$b;->f:Lmj/i;

    if-eqz v3, :cond_5

    :cond_2
    :goto_1
    invoke-virtual {p0}, Lrj/f$b;->e()Z

    move-result v4

    if-eqz v4, :cond_3

    return-void

    :cond_3
    invoke-interface {v3}, Lmj/i;->poll()Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_4

    if-nez v4, :cond_2

    goto :goto_2

    :cond_4
    invoke-interface {v0, v4}, Ldj/q;->c(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    :goto_2
    iget-boolean v3, p0, Lrj/f$b;->r:Z

    iget-object v4, p0, Lrj/f$b;->f:Lmj/i;

    iget-object v5, p0, Lrj/f$b;->u:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, [Lrj/f$a;

    array-length v6, v5

    iget v7, p0, Lrj/f$b;->d:I

    const v8, 0x7fffffff

    const/4 v9, 0x0

    if-eq v7, v8, :cond_6

    monitor-enter p0

    :try_start_0
    iget-object v7, p0, Lrj/f$b;->z:Ljava/util/Queue;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    monitor-exit p0

    goto :goto_3

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_6
    move v7, v9

    :goto_3
    if-eqz v3, :cond_a

    if-eqz v4, :cond_7

    invoke-interface {v4}, Lmj/j;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_a

    :cond_7
    if-nez v6, :cond_a

    if-nez v7, :cond_a

    iget-object v1, p0, Lrj/f$b;->s:Lxj/c;

    invoke-virtual {v1}, Lxj/c;->b()Ljava/lang/Throwable;

    move-result-object v1

    sget-object v2, Lxj/g;->a:Ljava/lang/Throwable;

    if-eq v1, v2, :cond_9

    if-nez v1, :cond_8

    invoke-interface {v0}, Ldj/q;->a()V

    goto :goto_4

    :cond_8
    invoke-interface {v0, v1}, Ldj/q;->onError(Ljava/lang/Throwable;)V

    :cond_9
    :goto_4
    return-void

    :cond_a
    if-eqz v6, :cond_1c

    iget-wide v3, p0, Lrj/f$b;->x:J

    iget v7, p0, Lrj/f$b;->y:I

    if-le v6, v7, :cond_b

    aget-object v10, v5, v7

    iget-wide v10, v10, Lrj/f$a;->a:J

    cmp-long v10, v10, v3

    if-eqz v10, :cond_10

    :cond_b
    if-gt v6, v7, :cond_c

    move v7, v9

    :cond_c
    move v10, v9

    :goto_5
    if-ge v10, v6, :cond_f

    aget-object v11, v5, v7

    iget-wide v11, v11, Lrj/f$a;->a:J

    cmp-long v11, v11, v3

    if-nez v11, :cond_d

    goto :goto_6

    :cond_d
    add-int/lit8 v7, v7, 0x1

    if-ne v7, v6, :cond_e

    move v7, v9

    :cond_e
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    :cond_f
    :goto_6
    iput v7, p0, Lrj/f$b;->y:I

    aget-object v3, v5, v7

    iget-wide v3, v3, Lrj/f$a;->a:J

    iput-wide v3, p0, Lrj/f$b;->x:J

    :cond_10
    move v3, v9

    move v4, v3

    :goto_7
    if-ge v3, v6, :cond_1b

    invoke-virtual {p0}, Lrj/f$b;->e()Z

    move-result v10

    if-eqz v10, :cond_11

    return-void

    :cond_11
    aget-object v10, v5, v7

    :cond_12
    invoke-virtual {p0}, Lrj/f$b;->e()Z

    move-result v11

    if-eqz v11, :cond_13

    return-void

    :cond_13
    iget-object v11, v10, Lrj/f$a;->d:Lmj/j;

    if-nez v11, :cond_14

    goto :goto_8

    :cond_14
    :try_start_1
    invoke-interface {v11}, Lmj/j;->poll()Ljava/lang/Object;

    move-result-object v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-nez v12, :cond_18

    if-nez v12, :cond_12

    :goto_8
    iget-boolean v11, v10, Lrj/f$a;->c:Z

    iget-object v12, v10, Lrj/f$a;->d:Lmj/j;

    if-eqz v11, :cond_17

    if-eqz v12, :cond_15

    invoke-interface {v12}, Lmj/j;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_17

    :cond_15
    invoke-virtual {p0, v10}, Lrj/f$b;->j(Lrj/f$a;)V

    invoke-virtual {p0}, Lrj/f$b;->e()Z

    move-result v4

    if-eqz v4, :cond_16

    return-void

    :cond_16
    move v4, v1

    :cond_17
    add-int/lit8 v7, v7, 0x1

    if-ne v7, v6, :cond_1a

    move v7, v9

    goto :goto_9

    :cond_18
    invoke-interface {v0, v12}, Ldj/q;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lrj/f$b;->e()Z

    move-result v12

    if-eqz v12, :cond_14

    return-void

    :catchall_1
    move-exception v4

    invoke-static {v4}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-virtual {v10}, Lrj/f$a;->d()V

    iget-object v11, p0, Lrj/f$b;->s:Lxj/c;

    invoke-virtual {v11, v4}, Lxj/c;->a(Ljava/lang/Throwable;)Z

    invoke-virtual {p0}, Lrj/f$b;->e()Z

    move-result v4

    if-eqz v4, :cond_19

    return-void

    :cond_19
    invoke-virtual {p0, v10}, Lrj/f$b;->j(Lrj/f$a;)V

    add-int/lit8 v3, v3, 0x1

    move v4, v1

    :cond_1a
    :goto_9
    add-int/2addr v3, v1

    goto :goto_7

    :cond_1b
    iput v7, p0, Lrj/f$b;->y:I

    aget-object v3, v5, v7

    iget-wide v5, v3, Lrj/f$a;->a:J

    iput-wide v5, p0, Lrj/f$b;->x:J

    move v9, v4

    :cond_1c
    if-eqz v9, :cond_1e

    iget v3, p0, Lrj/f$b;->d:I

    if-eq v3, v8, :cond_0

    monitor-enter p0

    :try_start_2
    iget-object v3, p0, Lrj/f$b;->z:Ljava/util/Queue;

    invoke-interface {v3}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ldj/p;

    if-nez v3, :cond_1d

    iget v3, p0, Lrj/f$b;->A:I

    sub-int/2addr v3, v1

    iput v3, p0, Lrj/f$b;->A:I

    monitor-exit p0

    goto/16 :goto_0

    :cond_1d
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {p0, v3}, Lrj/f$b;->k(Ldj/p;)V

    goto/16 :goto_0

    :catchall_2
    move-exception v0

    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    throw v0

    :cond_1e
    neg-int v2, v2

    invoke-virtual {p0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v2

    if-nez v2, :cond_0

    return-void
.end method

.method j(Lrj/f$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrj/f$a<",
            "TT;TU;>;)V"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, Lrj/f$b;->u:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lrj/f$a;

    array-length v1, v0

    if-nez v1, :cond_1

    return-void

    :cond_1
    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_3

    aget-object v4, v0, v3

    if-ne v4, p1, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 v3, -0x1

    :goto_1
    if-gez v3, :cond_4

    return-void

    :cond_4
    const/4 v4, 0x1

    if-ne v1, v4, :cond_5

    sget-object v1, Lrj/f$b;->B:[Lrj/f$a;

    goto :goto_2

    :cond_5
    add-int/lit8 v5, v1, -0x1

    new-array v5, v5, [Lrj/f$a;

    invoke-static {v0, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v2, v3, 0x1

    sub-int/2addr v1, v3

    sub-int/2addr v1, v4

    invoke-static {v0, v2, v5, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v5

    :goto_2
    iget-object v2, p0, Lrj/f$b;->u:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v2, v0, v1}, Le2/c;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void
.end method

.method k(Ldj/p;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/p<",
            "+TU;>;)V"
        }
    .end annotation

    :cond_0
    instance-of v0, p1, Ljava/util/concurrent/Callable;

    if-eqz v0, :cond_2

    check-cast p1, Ljava/util/concurrent/Callable;

    invoke-virtual {p0, p1}, Lrj/f$b;->m(Ljava/util/concurrent/Callable;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget p1, p0, Lrj/f$b;->d:I

    const v0, 0x7fffffff

    if-eq p1, v0, :cond_3

    monitor-enter p0

    :try_start_0
    iget-object p1, p0, Lrj/f$b;->z:Ljava/util/Queue;

    invoke-interface {p1}, Ljava/util/Queue;->poll()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldj/p;

    if-nez p1, :cond_1

    iget v0, p0, Lrj/f$b;->A:I

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iput v0, p0, Lrj/f$b;->A:I

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lrj/f$b;->g()V

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1

    :cond_2
    new-instance v0, Lrj/f$a;

    iget-wide v1, p0, Lrj/f$b;->w:J

    const-wide/16 v3, 0x1

    add-long/2addr v3, v1

    iput-wide v3, p0, Lrj/f$b;->w:J

    invoke-direct {v0, p0, v1, v2}, Lrj/f$a;-><init>(Lrj/f$b;J)V

    invoke-virtual {p0, v0}, Lrj/f$b;->d(Lrj/f$a;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1, v0}, Ldj/p;->d(Ldj/q;)V

    :cond_3
    :goto_1
    return-void
.end method

.method l(Ljava/lang/Object;Lrj/f$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;",
            "Lrj/f$a<",
            "TT;TU;>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, Lrj/f$b;->a:Ldj/q;

    invoke-interface {p2, p1}, Ldj/q;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_2

    return-void

    :cond_0
    iget-object v0, p2, Lrj/f$a;->d:Lmj/j;

    if-nez v0, :cond_1

    new-instance v0, Ltj/b;

    iget v1, p0, Lrj/f$b;->e:I

    invoke-direct {v0, v1}, Ltj/b;-><init>(I)V

    iput-object v0, p2, Lrj/f$a;->d:Lmj/j;

    :cond_1
    invoke-interface {v0, p1}, Lmj/j;->offer(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-eqz p1, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0}, Lrj/f$b;->i()V

    return-void
.end method

.method m(Ljava/util/concurrent/Callable;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Callable<",
            "+TU;>;)Z"
        }
    .end annotation

    const/4 v0, 0x1

    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    invoke-virtual {p0, v2, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lrj/f$b;->a:Ldj/q;

    invoke-interface {v1, p1}, Ldj/q;->c(Ljava/lang/Object;)V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_5

    return v0

    :cond_1
    iget-object v1, p0, Lrj/f$b;->f:Lmj/i;

    if-nez v1, :cond_3

    iget v1, p0, Lrj/f$b;->d:I

    const v3, 0x7fffffff

    if-ne v1, v3, :cond_2

    new-instance v1, Ltj/b;

    iget v3, p0, Lrj/f$b;->e:I

    invoke-direct {v1, v3}, Ltj/b;-><init>(I)V

    goto :goto_0

    :cond_2
    new-instance v1, Ltj/a;

    iget v3, p0, Lrj/f$b;->d:I

    invoke-direct {v1, v3}, Ltj/a;-><init>(I)V

    :goto_0
    iput-object v1, p0, Lrj/f$b;->f:Lmj/i;

    :cond_3
    invoke-interface {v1, p1}, Lmj/j;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v1, "Scalar queue full?!"

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lrj/f$b;->onError(Ljava/lang/Throwable;)V

    return v0

    :cond_4
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p1

    if-eqz p1, :cond_5

    return v2

    :cond_5
    invoke-virtual {p0}, Lrj/f$b;->i()V

    return v0

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lrj/f$b;->s:Lxj/c;

    invoke-virtual {v1, p1}, Lxj/c;->a(Ljava/lang/Throwable;)Z

    invoke-virtual {p0}, Lrj/f$b;->g()V

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lrj/f$b;->r:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lrj/f$b;->s:Lxj/c;

    invoke-virtual {v0, p1}, Lxj/c;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lrj/f$b;->r:Z

    invoke-virtual {p0}, Lrj/f$b;->g()V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
