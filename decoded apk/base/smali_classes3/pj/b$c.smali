.class final Lpj/b$c;
.super Lpj/b$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lpj/b$b<",
        "TT;TR;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x28e181349daae86aL


# instance fields
.field final x:Lim/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lim/b<",
            "-TR;>;"
        }
    .end annotation
.end field

.field final y:Z


# direct methods
.method constructor <init>(Lim/b;Ljj/e;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TR;>;",
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TR;>;>;IZ)V"
        }
    .end annotation

    invoke-direct {p0, p2, p3}, Lpj/b$b;-><init>(Ljj/e;I)V

    iput-object p1, p0, Lpj/b$c;->x:Lim/b;

    iput-boolean p4, p0, Lpj/b$c;->y:Z

    return-void
.end method


# virtual methods
.method public cancel()V
    .locals 1

    iget-boolean v0, p0, Lpj/b$b;->t:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpj/b$b;->t:Z

    iget-object v0, p0, Lpj/b$b;->a:Lpj/b$e;

    invoke-virtual {v0}, Lwj/f;->cancel()V

    iget-object v0, p0, Lpj/b$b;->e:Lim/c;

    invoke-interface {v0}, Lim/c;->cancel()V

    :cond_0
    return-void
.end method

.method public e(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lpj/b$b;->u:Lxj/c;

    invoke-virtual {v0, p1}, Lxj/c;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean p1, p0, Lpj/b$c;->y:Z

    if-nez p1, :cond_0

    iget-object p1, p0, Lpj/b$b;->e:Lim/c;

    invoke-interface {p1}, Lim/c;->cancel()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lpj/b$b;->s:Z

    :cond_0
    const/4 p1, 0x0

    iput-boolean p1, p0, Lpj/b$b;->v:Z

    invoke-virtual {p0}, Lpj/b$c;->h()V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public g(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)V"
        }
    .end annotation

    iget-object v0, p0, Lpj/b$c;->x:Lim/b;

    invoke-interface {v0, p1}, Lim/b;->c(Ljava/lang/Object;)V

    return-void
.end method

.method h()V
    .locals 6

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_c

    :cond_0
    :goto_0
    iget-boolean v0, p0, Lpj/b$b;->t:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-boolean v0, p0, Lpj/b$b;->v:Z

    if-nez v0, :cond_b

    iget-boolean v0, p0, Lpj/b$b;->s:Z

    if-eqz v0, :cond_2

    iget-boolean v1, p0, Lpj/b$c;->y:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lpj/b$b;->u:Lxj/c;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Throwable;

    if-eqz v1, :cond_2

    :goto_1
    iget-object v0, p0, Lpj/b$c;->x:Lim/b;

    iget-object v1, p0, Lpj/b$b;->u:Lxj/c;

    invoke-virtual {v1}, Lxj/c;->b()Ljava/lang/Throwable;

    move-result-object v1

    invoke-interface {v0, v1}, Lim/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_2
    :try_start_0
    iget-object v1, p0, Lpj/b$b;->r:Lmj/j;

    invoke-interface {v1}, Lmj/j;->poll()Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_3

    move v4, v3

    goto :goto_2

    :cond_3
    move v4, v2

    :goto_2
    if-eqz v0, :cond_5

    if-eqz v4, :cond_5

    iget-object v0, p0, Lpj/b$b;->u:Lxj/c;

    invoke-virtual {v0}, Lxj/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v1, p0, Lpj/b$c;->x:Lim/b;

    invoke-interface {v1, v0}, Lim/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_3

    :cond_4
    iget-object v0, p0, Lpj/b$c;->x:Lim/b;

    invoke-interface {v0}, Lim/b;->a()V

    :goto_3
    return-void

    :cond_5
    if-nez v4, :cond_b

    :try_start_1
    iget-object v0, p0, Lpj/b$b;->b:Ljj/e;

    invoke-interface {v0, v1}, Ljj/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The mapper returned a null Publisher"

    invoke-static {v0, v1}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lim/a;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget v1, p0, Lpj/b$b;->w:I

    if-eq v1, v3, :cond_7

    iget v1, p0, Lpj/b$b;->f:I

    add-int/2addr v1, v3

    iget v4, p0, Lpj/b$b;->d:I

    if-ne v1, v4, :cond_6

    iput v2, p0, Lpj/b$b;->f:I

    iget-object v2, p0, Lpj/b$b;->e:Lim/c;

    int-to-long v4, v1

    invoke-interface {v2, v4, v5}, Lim/c;->i(J)V

    goto :goto_4

    :cond_6
    iput v1, p0, Lpj/b$b;->f:I

    :cond_7
    :goto_4
    instance-of v1, v0, Ljava/util/concurrent/Callable;

    if-eqz v1, :cond_a

    check-cast v0, Ljava/util/concurrent/Callable;

    :try_start_2
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-nez v0, :cond_8

    goto :goto_0

    :cond_8
    iget-object v1, p0, Lpj/b$b;->a:Lpj/b$e;

    invoke-virtual {v1}, Lwj/f;->g()Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, p0, Lpj/b$c;->x:Lim/b;

    invoke-interface {v1, v0}, Lim/b;->c(Ljava/lang/Object;)V

    goto/16 :goto_0

    :cond_9
    iput-boolean v3, p0, Lpj/b$b;->v:Z

    iget-object v1, p0, Lpj/b$b;->a:Lpj/b$e;

    new-instance v2, Lpj/b$g;

    invoke-direct {v2, v0, v1}, Lpj/b$g;-><init>(Ljava/lang/Object;Lim/b;)V

    invoke-virtual {v1, v2}, Lwj/f;->j(Lim/c;)V

    goto :goto_5

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Lpj/b$b;->e:Lim/c;

    invoke-interface {v1}, Lim/c;->cancel()V

    iget-object v1, p0, Lpj/b$b;->u:Lxj/c;

    invoke-virtual {v1, v0}, Lxj/c;->a(Ljava/lang/Throwable;)Z

    goto/16 :goto_1

    :cond_a
    iput-boolean v3, p0, Lpj/b$b;->v:Z

    iget-object v1, p0, Lpj/b$b;->a:Lpj/b$e;

    invoke-interface {v0, v1}, Lim/a;->a(Lim/b;)V

    :cond_b
    :goto_5
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_0

    :cond_c
    return-void
.end method

.method public i(J)V
    .locals 1

    iget-object v0, p0, Lpj/b$b;->a:Lpj/b$e;

    invoke-virtual {v0, p1, p2}, Lwj/f;->i(J)V

    return-void
.end method

.method j()V
    .locals 1

    iget-object v0, p0, Lpj/b$c;->x:Lim/b;

    invoke-interface {v0, p0}, Lim/b;->d(Lim/c;)V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lpj/b$b;->u:Lxj/c;

    invoke-virtual {v0, p1}, Lxj/c;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lpj/b$b;->s:Z

    invoke-virtual {p0}, Lpj/b$c;->h()V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
