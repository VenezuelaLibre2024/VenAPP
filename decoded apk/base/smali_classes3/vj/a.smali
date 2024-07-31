.class public abstract Lvj/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmj/a;
.implements Lmj/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lmj/a<",
        "TT;>;",
        "Lmj/g<",
        "TR;>;"
    }
.end annotation


# instance fields
.field protected final a:Lmj/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmj/a<",
            "-TR;>;"
        }
    .end annotation
.end field

.field protected b:Lim/c;

.field protected c:Lmj/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmj/g<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected d:Z

.field protected e:I


# direct methods
.method public constructor <init>(Lmj/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmj/a<",
            "-TR;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvj/a;->a:Lmj/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lvj/a;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lvj/a;->d:Z

    iget-object v0, p0, Lvj/a;->a:Lmj/a;

    invoke-interface {v0}, Lim/b;->a()V

    return-void
.end method

.method protected b()V
    .locals 0

    return-void
.end method

.method public cancel()V
    .locals 1

    iget-object v0, p0, Lvj/a;->b:Lim/c;

    invoke-interface {v0}, Lim/c;->cancel()V

    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lvj/a;->c:Lmj/g;

    invoke-interface {v0}, Lmj/j;->clear()V

    return-void
.end method

.method public final d(Lim/c;)V
    .locals 1

    iget-object v0, p0, Lvj/a;->b:Lim/c;

    invoke-static {v0, p1}, Lwj/g;->q(Lim/c;Lim/c;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Lvj/a;->b:Lim/c;

    instance-of v0, p1, Lmj/g;

    if-eqz v0, :cond_0

    check-cast p1, Lmj/g;

    iput-object p1, p0, Lvj/a;->c:Lmj/g;

    :cond_0
    invoke-virtual {p0}, Lvj/a;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lvj/a;->a:Lmj/a;

    invoke-interface {p1, p0}, Ldj/i;->d(Lim/c;)V

    invoke-virtual {p0}, Lvj/a;->b()V

    :cond_1
    return-void
.end method

.method protected e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected final g(Ljava/lang/Throwable;)V
    .locals 1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lvj/a;->b:Lim/c;

    invoke-interface {v0}, Lim/c;->cancel()V

    invoke-virtual {p0, p1}, Lvj/a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method protected final h(I)I
    .locals 2

    iget-object v0, p0, Lvj/a;->c:Lmj/g;

    if-eqz v0, :cond_1

    and-int/lit8 v1, p1, 0x4

    if-nez v1, :cond_1

    invoke-interface {v0, p1}, Lmj/f;->l(I)I

    move-result p1

    if-eqz p1, :cond_0

    iput p1, p0, Lvj/a;->e:I

    :cond_0
    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public i(J)V
    .locals 1

    iget-object v0, p0, Lvj/a;->b:Lim/c;

    invoke-interface {v0, p1, p2}, Lim/c;->i(J)V

    return-void
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lvj/a;->c:Lmj/g;

    invoke-interface {v0}, Lmj/j;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TR;)Z"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Should not be called!"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lvj/a;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lvj/a;->d:Z

    iget-object v0, p0, Lvj/a;->a:Lmj/a;

    invoke-interface {v0, p1}, Lim/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
