.class final Lrj/g$a;
.super Lnj/b;
.source "SourceFile"

# interfaces
.implements Ldj/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrj/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lrj/g$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lnj/b<",
        "TT;>;",
        "Ldj/q<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x752c1ce874ed53bfL


# instance fields
.field final a:Ldj/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/q<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final b:Lxj/c;

.field final c:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-TT;+",
            "Ldj/d;",
            ">;"
        }
    .end annotation
.end field

.field final d:Z

.field final e:Lgj/a;

.field f:Lgj/b;

.field volatile r:Z


# direct methods
.method constructor <init>(Ldj/q;Ljj/e;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TT;>;",
            "Ljj/e<",
            "-TT;+",
            "Ldj/d;",
            ">;Z)V"
        }
    .end annotation

    invoke-direct {p0}, Lnj/b;-><init>()V

    iput-object p1, p0, Lrj/g$a;->a:Ldj/q;

    iput-object p2, p0, Lrj/g$a;->c:Ljj/e;

    iput-boolean p3, p0, Lrj/g$a;->d:Z

    new-instance p1, Lxj/c;

    invoke-direct {p1}, Lxj/c;-><init>()V

    iput-object p1, p0, Lrj/g$a;->b:Lxj/c;

    new-instance p1, Lgj/a;

    invoke-direct {p1}, Lgj/a;-><init>()V

    iput-object p1, p0, Lrj/g$a;->e:Lgj/a;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->lazySet(I)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lrj/g$a;->b:Lxj/c;

    invoke-virtual {v0}, Lxj/c;->b()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lrj/g$a;->a:Ldj/q;

    invoke-interface {v1, v0}, Ldj/q;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lrj/g$a;->a:Ldj/q;

    invoke-interface {v0}, Ldj/q;->a()V

    :cond_1
    :goto_0
    return-void
.end method

.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lrj/g$a;->f:Lgj/b;

    invoke-static {v0, p1}, Lkj/b;->p(Lgj/b;Lgj/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lrj/g$a;->f:Lgj/b;

    iget-object p1, p0, Lrj/g$a;->a:Ldj/q;

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

    :try_start_0
    iget-object v0, p0, Lrj/g$a;->c:Ljj/e;

    invoke-interface {v0, p1}, Ljj/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The mapper returned a null CompletableSource"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldj/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    new-instance v0, Lrj/g$a$a;

    invoke-direct {v0, p0}, Lrj/g$a$a;-><init>(Lrj/g$a;)V

    iget-boolean v1, p0, Lrj/g$a;->r:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lrj/g$a;->e:Lgj/a;

    invoke-virtual {v1, v0}, Lgj/a;->b(Lgj/b;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0}, Ldj/d;->a(Ldj/c;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lrj/g$a;->f:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    invoke-virtual {p0, p1}, Lrj/g$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public clear()V
    .locals 0

    return-void
.end method

.method d(Lrj/g$a$a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrj/g$a<",
            "TT;>.a;)V"
        }
    .end annotation

    iget-object v0, p0, Lrj/g$a;->e:Lgj/a;

    invoke-virtual {v0, p1}, Lgj/a;->c(Lgj/b;)Z

    invoke-virtual {p0}, Lrj/g$a;->a()V

    return-void
.end method

.method public dispose()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lrj/g$a;->r:Z

    iget-object v0, p0, Lrj/g$a;->f:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    iget-object v0, p0, Lrj/g$a;->e:Lgj/a;

    invoke-virtual {v0}, Lgj/a;->dispose()V

    return-void
.end method

.method e(Lrj/g$a$a;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lrj/g$a<",
            "TT;>.a;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lrj/g$a;->e:Lgj/a;

    invoke-virtual {v0, p1}, Lgj/a;->c(Lgj/b;)Z

    invoke-virtual {p0, p2}, Lrj/g$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lrj/g$a;->f:Lgj/b;

    invoke-interface {v0}, Lgj/b;->h()Z

    move-result v0

    return v0
.end method

.method public isEmpty()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public l(I)I
    .locals 0

    and-int/lit8 p1, p1, 0x2

    return p1
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lrj/g$a;->b:Lxj/c;

    invoke-virtual {v0, p1}, Lxj/c;->a(Ljava/lang/Throwable;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean p1, p0, Lrj/g$a;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lrj/g$a;->dispose()V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndSet(I)I

    move-result p1

    if-lez p1, :cond_2

    :goto_0
    iget-object p1, p0, Lrj/g$a;->b:Lxj/c;

    invoke-virtual {p1}, Lxj/c;->b()Ljava/lang/Throwable;

    move-result-object p1

    iget-object v0, p0, Lrj/g$a;->a:Ldj/q;

    invoke-interface {v0, p1}, Ldj/q;->onError(Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public poll()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method
