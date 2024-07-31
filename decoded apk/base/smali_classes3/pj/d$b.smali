.class final Lpj/d$b;
.super Lvj/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpj/d;
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
        "Lvj/b<",
        "TT;TT;>;"
    }
.end annotation


# instance fields
.field final f:Ljj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/d<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final r:Ljj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field final s:Ljj/a;

.field final t:Ljj/a;


# direct methods
.method constructor <init>(Lim/b;Ljj/d;Ljj/d;Ljj/a;Ljj/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;",
            "Ljj/d<",
            "-TT;>;",
            "Ljj/d<",
            "-",
            "Ljava/lang/Throwable;",
            ">;",
            "Ljj/a;",
            "Ljj/a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lvj/b;-><init>(Lim/b;)V

    iput-object p2, p0, Lpj/d$b;->f:Ljj/d;

    iput-object p3, p0, Lpj/d$b;->r:Ljj/d;

    iput-object p4, p0, Lpj/d$b;->s:Ljj/a;

    iput-object p5, p0, Lpj/d$b;->t:Ljj/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lvj/b;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lpj/d$b;->s:Ljj/a;

    invoke-interface {v0}, Ljj/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lvj/b;->d:Z

    iget-object v0, p0, Lvj/b;->a:Lim/b;

    invoke-interface {v0}, Lim/b;->a()V

    :try_start_1
    iget-object v0, p0, Lpj/d$b;->t:Ljj/a;

    invoke-interface {v0}, Ljj/a;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lyj/a;->q(Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :catchall_1
    move-exception v0

    invoke-virtual {p0, v0}, Lvj/b;->g(Ljava/lang/Throwable;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lvj/b;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lvj/b;->e:I

    if-eqz v0, :cond_1

    iget-object p1, p0, Lvj/b;->a:Lim/b;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lim/b;->c(Ljava/lang/Object;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v0, p0, Lpj/d$b;->f:Ljj/d;

    invoke-interface {v0, p1}, Ljj/d;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Lvj/b;->a:Lim/b;

    invoke-interface {v0, p1}, Lim/b;->c(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {p0, p1}, Lvj/b;->g(Ljava/lang/Throwable;)V

    return-void
.end method

.method public l(I)I
    .locals 0

    invoke-virtual {p0, p1}, Lvj/b;->h(I)I

    move-result p1

    return p1
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 6

    iget-boolean v0, p0, Lvj/b;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lvj/b;->d:Z

    :try_start_0
    iget-object v1, p0, Lpj/d$b;->r:Ljj/d;

    invoke-interface {v1, p1}, Ljj/d;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    iget-object v2, p0, Lvj/b;->a:Lim/b;

    new-instance v3, Lhj/a;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Throwable;

    const/4 v5, 0x0

    aput-object p1, v4, v5

    aput-object v1, v4, v0

    invoke-direct {v3, v4}, Lhj/a;-><init>([Ljava/lang/Throwable;)V

    invoke-interface {v2, v3}, Lim/b;->onError(Ljava/lang/Throwable;)V

    move v0, v5

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, p0, Lvj/b;->a:Lim/b;

    invoke-interface {v0, p1}, Lim/b;->onError(Ljava/lang/Throwable;)V

    :cond_1
    :try_start_1
    iget-object p1, p0, Lpj/d$b;->t:Ljj/a;

    invoke-interface {p1}, Ljj/a;->run()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public poll()Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x2

    const/4 v2, 0x1

    :try_start_0
    iget-object v3, p0, Lvj/b;->c:Lmj/g;

    invoke-interface {v3}, Lmj/j;->poll()Ljava/lang/Object;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-eqz v3, :cond_0

    :try_start_1
    iget-object v4, p0, Lpj/d$b;->f:Ljj/d;

    invoke-interface {v4, v3}, Ljj/d;->accept(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v3

    :try_start_2
    invoke-static {v3}, Lhj/b;->b(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    iget-object v4, p0, Lpj/d$b;->r:Ljj/d;

    invoke-interface {v4, v3}, Ljj/d;->accept(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :try_start_4
    invoke-static {v3}, Lxj/g;->c(Ljava/lang/Throwable;)Ljava/lang/Exception;

    move-result-object v0

    throw v0

    :catchall_1
    move-exception v4

    new-instance v5, Lhj/a;

    new-array v1, v1, [Ljava/lang/Throwable;

    aput-object v3, v1, v0

    aput-object v4, v1, v2

    invoke-direct {v5, v1}, Lhj/a;-><init>([Ljava/lang/Throwable;)V

    throw v5
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    move-exception v0

    iget-object v1, p0, Lpj/d$b;->t:Ljj/a;

    invoke-interface {v1}, Ljj/a;->run()V

    throw v0

    :cond_0
    iget v0, p0, Lvj/b;->e:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Lpj/d$b;->s:Ljj/a;

    invoke-interface {v0}, Ljj/a;->run()V

    :goto_0
    iget-object v0, p0, Lpj/d$b;->t:Ljj/a;

    invoke-interface {v0}, Ljj/a;->run()V

    :cond_1
    return-object v3

    :catchall_3
    move-exception v3

    invoke-static {v3}, Lhj/b;->b(Ljava/lang/Throwable;)V

    :try_start_5
    iget-object v4, p0, Lpj/d$b;->r:Ljj/d;

    invoke-interface {v4, v3}, Ljj/d;->accept(Ljava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    invoke-static {v3}, Lxj/g;->c(Ljava/lang/Throwable;)Ljava/lang/Exception;

    move-result-object v0

    throw v0

    :catchall_4
    move-exception v4

    new-instance v5, Lhj/a;

    new-array v1, v1, [Ljava/lang/Throwable;

    aput-object v3, v1, v0

    aput-object v4, v1, v2

    invoke-direct {v5, v1}, Lhj/a;-><init>([Ljava/lang/Throwable;)V

    throw v5
.end method
