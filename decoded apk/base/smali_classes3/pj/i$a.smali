.class final Lpj/i$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ldj/i;
.implements Lgj/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpj/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lim/c;",
        ">;",
        "Ldj/i<",
        "TU;>;",
        "Lgj/b;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x3fec6c572fe7d027L


# instance fields
.field final a:J

.field final b:Lpj/i$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpj/i$b<",
            "TT;TU;>;"
        }
    .end annotation
.end field

.field final c:I

.field final d:I

.field volatile e:Z

.field volatile f:Lmj/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmj/j<",
            "TU;>;"
        }
    .end annotation
.end field

.field r:J

.field s:I


# direct methods
.method constructor <init>(Lpj/i$b;J)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpj/i$b<",
            "TT;TU;>;J)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-wide p2, p0, Lpj/i$a;->a:J

    iput-object p1, p0, Lpj/i$a;->b:Lpj/i$b;

    iget p1, p1, Lpj/i$b;->e:I

    iput p1, p0, Lpj/i$a;->d:I

    shr-int/lit8 p1, p1, 0x2

    iput p1, p0, Lpj/i$a;->c:I

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpj/i$a;->e:Z

    iget-object v0, p0, Lpj/i$a;->b:Lpj/i$b;

    invoke-virtual {v0}, Lpj/i$b;->j()V

    return-void
.end method

.method b(J)V
    .locals 2

    iget v0, p0, Lpj/i$a;->s:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget-wide v0, p0, Lpj/i$a;->r:J

    add-long/2addr v0, p1

    iget p1, p0, Lpj/i$a;->c:I

    int-to-long p1, p1

    cmp-long p1, v0, p1

    if-ltz p1, :cond_0

    const-wide/16 p1, 0x0

    iput-wide p1, p0, Lpj/i$a;->r:J

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lim/c;

    invoke-interface {p1, v0, v1}, Lim/c;->i(J)V

    goto :goto_0

    :cond_0
    iput-wide v0, p0, Lpj/i$a;->r:J

    :cond_1
    :goto_0
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    iget v0, p0, Lpj/i$a;->s:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lpj/i$a;->b:Lpj/i$b;

    invoke-virtual {v0, p1, p0}, Lpj/i$b;->p(Ljava/lang/Object;Lpj/i$a;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lpj/i$a;->b:Lpj/i$b;

    invoke-virtual {p1}, Lpj/i$b;->j()V

    :goto_0
    return-void
.end method

.method public d(Lim/c;)V
    .locals 3

    invoke-static {p0, p1}, Lwj/g;->o(Ljava/util/concurrent/atomic/AtomicReference;Lim/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    instance-of v0, p1, Lmj/g;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lmj/g;

    const/4 v1, 0x7

    invoke-interface {v0, v1}, Lmj/f;->l(I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iput v1, p0, Lpj/i$a;->s:I

    iput-object v0, p0, Lpj/i$a;->f:Lmj/j;

    iput-boolean v2, p0, Lpj/i$a;->e:Z

    iget-object p1, p0, Lpj/i$a;->b:Lpj/i$b;

    invoke-virtual {p1}, Lpj/i$b;->j()V

    return-void

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iput v1, p0, Lpj/i$a;->s:I

    iput-object v0, p0, Lpj/i$a;->f:Lmj/j;

    :cond_1
    iget v0, p0, Lpj/i$a;->d:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, Lim/c;->i(J)V

    :cond_2
    return-void
.end method

.method public dispose()V
    .locals 0

    invoke-static {p0}, Lwj/g;->b(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public h()Z
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lwj/g;->CANCELLED:Lwj/g;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lwj/g;->CANCELLED:Lwj/g;

    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicReference;->lazySet(Ljava/lang/Object;)V

    iget-object v0, p0, Lpj/i$a;->b:Lpj/i$b;

    invoke-virtual {v0, p0, p1}, Lpj/i$b;->n(Lpj/i$a;Ljava/lang/Throwable;)V

    return-void
.end method
