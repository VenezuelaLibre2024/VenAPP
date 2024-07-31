.class public abstract Lnj/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/q;
.implements Lmj/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ldj/q<",
        "TT;>;",
        "Lmj/e<",
        "TR;>;"
    }
.end annotation


# instance fields
.field protected final a:Ldj/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/q<",
            "-TR;>;"
        }
    .end annotation
.end field

.field protected b:Lgj/b;

.field protected c:Lmj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lmj/e<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected d:Z

.field protected e:I


# direct methods
.method public constructor <init>(Ldj/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TR;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lnj/a;->a:Ldj/q;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-boolean v0, p0, Lnj/a;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnj/a;->d:Z

    iget-object v0, p0, Lnj/a;->a:Ldj/q;

    invoke-interface {v0}, Ldj/q;->a()V

    return-void
.end method

.method public final b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lnj/a;->b:Lgj/b;

    invoke-static {v0, p1}, Lkj/b;->p(Lgj/b;Lgj/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    iput-object p1, p0, Lnj/a;->b:Lgj/b;

    instance-of v0, p1, Lmj/e;

    if-eqz v0, :cond_0

    check-cast p1, Lmj/e;

    iput-object p1, p0, Lnj/a;->c:Lmj/e;

    :cond_0
    invoke-virtual {p0}, Lnj/a;->e()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lnj/a;->a:Ldj/q;

    invoke-interface {p1, p0}, Ldj/q;->b(Lgj/b;)V

    invoke-virtual {p0}, Lnj/a;->d()V

    :cond_1
    return-void
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lnj/a;->c:Lmj/e;

    invoke-interface {v0}, Lmj/j;->clear()V

    return-void
.end method

.method protected d()V
    .locals 0

    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lnj/a;->b:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    return-void
.end method

.method protected e()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected final f(Ljava/lang/Throwable;)V
    .locals 1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lnj/a;->b:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    invoke-virtual {p0, p1}, Lnj/a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method protected final g(I)I
    .locals 2

    iget-object v0, p0, Lnj/a;->c:Lmj/e;

    if-eqz v0, :cond_1

    and-int/lit8 v1, p1, 0x4

    if-nez v1, :cond_1

    invoke-interface {v0, p1}, Lmj/f;->l(I)I

    move-result p1

    if-eqz p1, :cond_0

    iput p1, p0, Lnj/a;->e:I

    :cond_0
    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lnj/a;->b:Lgj/b;

    invoke-interface {v0}, Lgj/b;->h()Z

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lnj/a;->c:Lmj/e;

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

    iget-boolean v0, p0, Lnj/a;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lnj/a;->d:Z

    iget-object v0, p0, Lnj/a;->a:Ldj/q;

    invoke-interface {v0, p1}, Ldj/q;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
