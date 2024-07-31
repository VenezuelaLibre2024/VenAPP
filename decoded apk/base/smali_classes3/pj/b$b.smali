.class abstract Lpj/b$b;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Ldj/i;
.implements Lpj/b$f;
.implements Lim/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpj/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "Ldj/i<",
        "TT;>;",
        "Lpj/b$f<",
        "TR;>;",
        "Lim/c;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x30bac63fcc0431bbL


# instance fields
.field final a:Lpj/b$e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpj/b$e<",
            "TR;>;"
        }
    .end annotation
.end field

.field final b:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TR;>;>;"
        }
    .end annotation
.end field

.field final c:I

.field final d:I

.field e:Lim/c;

.field f:I

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

.field final u:Lxj/c;

.field volatile v:Z

.field w:I


# direct methods
.method constructor <init>(Ljj/e;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TR;>;>;I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lpj/b$b;->b:Ljj/e;

    iput p2, p0, Lpj/b$b;->c:I

    shr-int/lit8 p1, p2, 0x2

    sub-int/2addr p2, p1

    iput p2, p0, Lpj/b$b;->d:I

    new-instance p1, Lpj/b$e;

    invoke-direct {p1, p0}, Lpj/b$e;-><init>(Lpj/b$f;)V

    iput-object p1, p0, Lpj/b$b;->a:Lpj/b$e;

    new-instance p1, Lxj/c;

    invoke-direct {p1}, Lxj/c;-><init>()V

    iput-object p1, p0, Lpj/b$b;->u:Lxj/c;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lpj/b$b;->s:Z

    invoke-virtual {p0}, Lpj/b$b;->h()V

    return-void
.end method

.method public final b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lpj/b$b;->v:Z

    invoke-virtual {p0}, Lpj/b$b;->h()V

    return-void
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget v0, p0, Lpj/b$b;->w:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lpj/b$b;->r:Lmj/j;

    invoke-interface {v0, p1}, Lmj/j;->offer(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lpj/b$b;->e:Lim/c;

    invoke-interface {p1}, Lim/c;->cancel()V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Queue full?!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lim/b;->onError(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lpj/b$b;->h()V

    return-void
.end method

.method public final d(Lim/c;)V
    .locals 3

    iget-object v0, p0, Lpj/b$b;->e:Lim/c;

    invoke-static {v0, p1}, Lwj/g;->q(Lim/c;Lim/c;)Z

    move-result v0

    if-eqz v0, :cond_2

    iput-object p1, p0, Lpj/b$b;->e:Lim/c;

    instance-of v0, p1, Lmj/g;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lmj/g;

    const/4 v1, 0x3

    invoke-interface {v0, v1}, Lmj/f;->l(I)I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iput v1, p0, Lpj/b$b;->w:I

    iput-object v0, p0, Lpj/b$b;->r:Lmj/j;

    iput-boolean v2, p0, Lpj/b$b;->s:Z

    invoke-virtual {p0}, Lpj/b$b;->j()V

    invoke-virtual {p0}, Lpj/b$b;->h()V

    return-void

    :cond_0
    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    iput v1, p0, Lpj/b$b;->w:I

    iput-object v0, p0, Lpj/b$b;->r:Lmj/j;

    invoke-virtual {p0}, Lpj/b$b;->j()V

    iget v0, p0, Lpj/b$b;->c:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, Lim/c;->i(J)V

    return-void

    :cond_1
    new-instance v0, Ltj/a;

    iget v1, p0, Lpj/b$b;->c:I

    invoke-direct {v0, v1}, Ltj/a;-><init>(I)V

    iput-object v0, p0, Lpj/b$b;->r:Lmj/j;

    invoke-virtual {p0}, Lpj/b$b;->j()V

    iget v0, p0, Lpj/b$b;->c:I

    int-to-long v0, v0

    invoke-interface {p1, v0, v1}, Lim/c;->i(J)V

    :cond_2
    return-void
.end method

.method abstract h()V
.end method

.method abstract j()V
.end method
