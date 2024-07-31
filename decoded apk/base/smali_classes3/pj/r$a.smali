.class abstract Lpj/r$a;
.super Lwj/a;
.source "SourceFile"

# interfaces
.implements Ldj/i;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpj/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lwj/a<",
        "TT;>;",
        "Ldj/i<",
        "TT;>;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x725dec0716520049L


# instance fields
.field final a:Ldj/r$b;

.field final b:Z

.field final c:I

.field final d:I

.field final e:Ljava/util/concurrent/atomic/AtomicLong;

.field f:Lim/c;

.field r:Lmj/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmj/j<",
            "TT;>;"
        }
    .end annotation
.end field

.field volatile s:Z

.field volatile t:Z

.field u:Ljava/lang/Throwable;

.field v:I

.field w:J

.field x:Z


# direct methods
.method constructor <init>(Ldj/r$b;ZI)V
    .locals 0

    invoke-direct {p0}, Lwj/a;-><init>()V

    iput-object p1, p0, Lpj/r$a;->a:Ldj/r$b;

    iput-boolean p2, p0, Lpj/r$a;->b:Z

    iput p3, p0, Lpj/r$a;->c:I

    new-instance p1, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lpj/r$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    shr-int/lit8 p1, p3, 0x2

    sub-int/2addr p3, p1

    iput p3, p0, Lpj/r$a;->d:I

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-boolean v0, p0, Lpj/r$a;->t:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpj/r$a;->t:Z

    invoke-virtual {p0}, Lpj/r$a;->k()V

    :cond_0
    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lpj/r$a;->t:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lpj/r$a;->v:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lpj/r$a;->k()V

    return-void

    :cond_1
    iget-object v0, p0, Lpj/r$a;->r:Lmj/j;

    invoke-interface {v0, p1}, Lmj/j;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lpj/r$a;->f:Lim/c;

    invoke-interface {p1}, Lim/c;->cancel()V

    new-instance p1, Lhj/c;

    const-string v0, "Queue is full?!"

    invoke-direct {p1, v0}, Lhj/c;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Lpj/r$a;->u:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lpj/r$a;->t:Z

    :cond_2
    invoke-virtual {p0}, Lpj/r$a;->k()V

    return-void
.end method

.method public final cancel()V
    .locals 1

    iget-boolean v0, p0, Lpj/r$a;->s:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lpj/r$a;->s:Z

    iget-object v0, p0, Lpj/r$a;->f:Lim/c;

    invoke-interface {v0}, Lim/c;->cancel()V

    iget-object v0, p0, Lpj/r$a;->a:Ldj/r$b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lpj/r$a;->r:Lmj/j;

    invoke-interface {v0}, Lmj/j;->clear()V

    :cond_1
    return-void
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lpj/r$a;->r:Lmj/j;

    invoke-interface {v0}, Lmj/j;->clear()V

    return-void
.end method

.method final e(ZZLim/b;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZ",
            "Lim/b<",
            "*>;)Z"
        }
    .end annotation

    iget-boolean v0, p0, Lpj/r$a;->s:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpj/r$a;->clear()V

    return v1

    :cond_0
    if-eqz p1, :cond_4

    iget-boolean p1, p0, Lpj/r$a;->b:Z

    if-eqz p1, :cond_1

    if-eqz p2, :cond_4

    iget-object p1, p0, Lpj/r$a;->u:Ljava/lang/Throwable;

    if-eqz p1, :cond_3

    goto :goto_1

    :goto_0
    iget-object p1, p0, Lpj/r$a;->a:Ldj/r$b;

    invoke-interface {p1}, Lgj/b;->dispose()V

    return v1

    :cond_1
    iget-object p1, p0, Lpj/r$a;->u:Ljava/lang/Throwable;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lpj/r$a;->clear()V

    :goto_1
    invoke-interface {p3, p1}, Lim/b;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_2
    if-eqz p2, :cond_4

    :cond_3
    invoke-interface {p3}, Lim/b;->a()V

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method abstract g()V
.end method

.method abstract h()V
.end method

.method public final i(J)V
    .locals 1

    invoke-static {p1, p2}, Lwj/g;->p(J)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lpj/r$a;->e:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lxj/d;->a(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {p0}, Lpj/r$a;->k()V

    :cond_0
    return-void
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lpj/r$a;->r:Lmj/j;

    invoke-interface {v0}, Lmj/j;->isEmpty()Z

    move-result v0

    return v0
.end method

.method abstract j()V
.end method

.method final k()V
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lpj/r$a;->a:Ldj/r$b;

    invoke-virtual {v0, p0}, Ldj/r$b;->b(Ljava/lang/Runnable;)Lgj/b;

    return-void
.end method

.method public final l(I)I
    .locals 1

    const/4 v0, 0x2

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lpj/r$a;->x:Z

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lpj/r$a;->t:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iput-object p1, p0, Lpj/r$a;->u:Ljava/lang/Throwable;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lpj/r$a;->t:Z

    invoke-virtual {p0}, Lpj/r$a;->k()V

    return-void
.end method

.method public final run()V
    .locals 2

    iget-boolean v0, p0, Lpj/r$a;->x:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lpj/r$a;->h()V

    goto :goto_0

    :cond_0
    iget v0, p0, Lpj/r$a;->v:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lpj/r$a;->j()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lpj/r$a;->g()V

    :goto_0
    return-void
.end method
