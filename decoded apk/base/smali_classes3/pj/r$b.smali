.class final Lpj/r$b;
.super Lpj/r$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpj/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lpj/r$a<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x8f22a8b85feb275L


# instance fields
.field final y:Lmj/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmj/a<",
            "-TT;>;"
        }
    .end annotation
.end field

.field z:J


# direct methods
.method constructor <init>(Lmj/a;Ldj/r$b;ZI)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmj/a<",
            "-TT;>;",
            "Ldj/r$b;",
            "ZI)V"
        }
    .end annotation

    invoke-direct {p0, p2, p3, p4}, Lpj/r$a;-><init>(Ldj/r$b;ZI)V

    iput-object p1, p0, Lpj/r$b;->y:Lmj/a;

    return-void
.end method


# virtual methods
.method public d(Lim/c;)V
    .locals 3

    iget-object v0, p0, Lpj/r$a;->f:Lim/c;

    invoke-static {v0, p1}, Lwj/g;->q(Lim/c;Lim/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Lpj/r$a;->f:Lim/c;

    instance-of v0, p1, Lmj/g;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lmj/g;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lmj/f;->l(I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iput v2, p0, Lpj/r$a;->v:I

    iput-object v0, p0, Lpj/r$a;->r:Lmj/j;

    iput-boolean v2, p0, Lpj/r$a;->t:Z

    iget-object p1, p0, Lpj/r$b;->y:Lmj/a;

    invoke-interface {p1, p0}, Ldj/i;->d(Lim/c;)V

    return-void

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iput v2, p0, Lpj/r$a;->v:I

    iput-object v0, p0, Lpj/r$a;->r:Lmj/j;

    iget-object v0, p0, Lpj/r$b;->y:Lmj/a;

    invoke-interface {v0, p0}, Ldj/i;->d(Lim/c;)V

    iget v0, p0, Lpj/r$a;->c:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, Lim/c;->i(J)V

    return-void

    :cond_1
    new-instance v0, Ltj/a;

    iget v1, p0, Lpj/r$a;->c:I

    invoke-direct {v0, v1}, Ltj/a;-><init>(I)V

    iput-object v0, p0, Lpj/r$a;->r:Lmj/j;

    iget-object v0, p0, Lpj/r$b;->y:Lmj/a;

    invoke-interface {v0, p0}, Ldj/i;->d(Lim/c;)V

    iget v0, p0, Lpj/r$a;->c:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, Lim/c;->i(J)V

    :cond_2
    return-void
.end method

.method g()V
    .locals 14

    iget-object v0, p0, Lpj/r$b;->y:Lmj/a;

    iget-object v1, p0, Lpj/r$a;->r:Lmj/j;

    iget-wide v2, p0, Lpj/r$a;->w:J

    iget-wide v4, p0, Lpj/r$b;->z:J

    const/4 v6, 0x1

    move v7, v6

    :cond_0
    :goto_0
    iget-object v8, p0, Lpj/r$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v8}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v8

    :cond_1
    :goto_1
    cmp-long v10, v2, v8

    if-eqz v10, :cond_6

    iget-boolean v11, p0, Lpj/r$a;->t:Z

    :try_start_0
    invoke-interface {v1}, Lmj/j;->poll()Ljava/lang/Object;

    move-result-object v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v12, :cond_2

    move v13, v6

    goto :goto_2

    :cond_2
    const/4 v13, 0x0

    :goto_2
    invoke-virtual {p0, v11, v13, v0}, Lpj/r$a;->e(ZZLim/b;)Z

    move-result v11

    if-eqz v11, :cond_3

    return-void

    :cond_3
    if-eqz v13, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v0, v12}, Lmj/a;->f(Ljava/lang/Object;)Z

    move-result v10

    const-wide/16 v11, 0x1

    if-eqz v10, :cond_5

    add-long/2addr v2, v11

    :cond_5
    add-long/2addr v4, v11

    iget v10, p0, Lpj/r$a;->d:I

    int-to-long v10, v10

    cmp-long v10, v4, v10

    if-nez v10, :cond_1

    iget-object v10, p0, Lpj/r$a;->f:Lim/c;

    invoke-interface {v10, v4, v5}, Lim/c;->i(J)V

    const-wide/16 v4, 0x0

    goto :goto_1

    :catchall_0
    move-exception v2

    invoke-static {v2}, Lhj/b;->b(Ljava/lang/Throwable;)V

    iget-object v3, p0, Lpj/r$a;->f:Lim/c;

    invoke-interface {v3}, Lim/c;->cancel()V

    invoke-interface {v1}, Lmj/j;->clear()V

    invoke-interface {v0, v2}, Lim/b;->onError(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lpj/r$a;->a:Ldj/r$b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    return-void

    :cond_6
    :goto_3
    if-nez v10, :cond_7

    iget-boolean v8, p0, Lpj/r$a;->t:Z

    invoke-interface {v1}, Lmj/j;->isEmpty()Z

    move-result v9

    invoke-virtual {p0, v8, v9, v0}, Lpj/r$a;->e(ZZLim/b;)Z

    move-result v8

    if-eqz v8, :cond_7

    return-void

    :cond_7
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v8

    if-ne v7, v8, :cond_8

    iput-wide v2, p0, Lpj/r$a;->w:J

    iput-wide v4, p0, Lpj/r$b;->z:J

    neg-int v7, v7

    invoke-virtual {p0, v7}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v7

    if-nez v7, :cond_0

    return-void

    :cond_8
    move v7, v8

    goto :goto_0
.end method

.method h()V
    .locals 4

    const/4 v0, 0x1

    :cond_0
    iget-boolean v1, p0, Lpj/r$a;->s:Z

    if-eqz v1, :cond_1

    return-void

    :cond_1
    iget-boolean v1, p0, Lpj/r$a;->t:Z

    iget-object v2, p0, Lpj/r$b;->y:Lmj/a;

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lim/b;->c(Ljava/lang/Object;)V

    if-eqz v1, :cond_3

    iget-object v0, p0, Lpj/r$a;->u:Ljava/lang/Throwable;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lpj/r$b;->y:Lmj/a;

    invoke-interface {v1, v0}, Lim/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lpj/r$b;->y:Lmj/a;

    invoke-interface {v0}, Lim/b;->a()V

    :goto_0
    iget-object v0, p0, Lpj/r$a;->a:Ldj/r$b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    return-void

    :cond_3
    neg-int v0, v0

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v0

    if-nez v0, :cond_0

    return-void
.end method

.method j()V
    .locals 9

    iget-object v0, p0, Lpj/r$b;->y:Lmj/a;

    iget-object v1, p0, Lpj/r$a;->r:Lmj/j;

    iget-wide v2, p0, Lpj/r$a;->w:J

    const/4 v4, 0x1

    :cond_0
    :goto_0
    iget-object v5, p0, Lpj/r$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v5

    :cond_1
    :goto_1
    cmp-long v7, v2, v5

    if-eqz v7, :cond_4

    :try_start_0
    invoke-interface {v1}, Lmj/j;->poll()Ljava/lang/Object;

    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-boolean v8, p0, Lpj/r$a;->s:Z

    if-eqz v8, :cond_2

    return-void

    :cond_2
    if-nez v7, :cond_3

    :goto_2
    invoke-interface {v0}, Lim/b;->a()V

    :goto_3
    iget-object v0, p0, Lpj/r$a;->a:Ldj/r$b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    return-void

    :cond_3
    invoke-interface {v0, v7}, Lmj/a;->f(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const-wide/16 v7, 0x1

    add-long/2addr v2, v7

    goto :goto_1

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    iget-object v2, p0, Lpj/r$a;->f:Lim/c;

    invoke-interface {v2}, Lim/c;->cancel()V

    invoke-interface {v0, v1}, Lim/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_4
    iget-boolean v5, p0, Lpj/r$a;->s:Z

    if-eqz v5, :cond_5

    return-void

    :cond_5
    invoke-interface {v1}, Lmj/j;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_6

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v5

    if-ne v4, v5, :cond_7

    iput-wide v2, p0, Lpj/r$a;->w:J

    neg-int v4, v4

    invoke-virtual {p0, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    move-result v4

    if-nez v4, :cond_0

    return-void

    :cond_7
    move v4, v5

    goto :goto_0
.end method

.method public poll()Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lpj/r$a;->r:Lmj/j;

    invoke-interface {v0}, Lmj/j;->poll()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget v1, p0, Lpj/r$a;->v:I

    const/4 v2, 0x1

    if-eq v1, v2, :cond_1

    iget-wide v1, p0, Lpj/r$b;->z:J

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    iget v3, p0, Lpj/r$a;->d:I

    int-to-long v3, v3

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    const-wide/16 v3, 0x0

    iput-wide v3, p0, Lpj/r$b;->z:J

    iget-object v3, p0, Lpj/r$a;->f:Lim/c;

    invoke-interface {v3, v1, v2}, Lim/c;->i(J)V

    goto :goto_0

    :cond_0
    iput-wide v1, p0, Lpj/r$b;->z:J

    :cond_1
    :goto_0
    return-object v0
.end method
