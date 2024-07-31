.class final Lqj/o$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ldj/l;
.implements Lgj/b;
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqj/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/util/concurrent/atomic/AtomicReference<",
        "Lgj/b;",
        ">;",
        "Ldj/l<",
        "TT;>;",
        "Lgj/b;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x76f356c87ebda749L


# instance fields
.field final a:Ldj/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/l<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final b:Ldj/r;

.field c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field d:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Ldj/l;Ldj/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;",
            "Ldj/r;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqj/o$a;->a:Ldj/l;

    iput-object p2, p0, Lqj/o$a;->b:Ldj/r;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lqj/o$a;->b:Ldj/r;

    invoke-virtual {v0, p0}, Ldj/r;->b(Ljava/lang/Runnable;)Lgj/b;

    move-result-object v0

    invoke-static {p0, v0}, Lkj/b;->l(Ljava/util/concurrent/atomic/AtomicReference;Lgj/b;)Z

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 0

    invoke-static {p0, p1}, Lkj/b;->o(Ljava/util/concurrent/atomic/AtomicReference;Lgj/b;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lqj/o$a;->a:Ldj/l;

    invoke-interface {p1, p0}, Ldj/l;->b(Lgj/b;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 0

    invoke-static {p0}, Lkj/b;->b(Ljava/util/concurrent/atomic/AtomicReference;)Z

    return-void
.end method

.method public h()Z
    .locals 1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgj/b;

    invoke-static {v0}, Lkj/b;->i(Lgj/b;)Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, Lqj/o$a;->d:Ljava/lang/Throwable;

    iget-object p1, p0, Lqj/o$a;->b:Ldj/r;

    invoke-virtual {p1, p0}, Ldj/r;->b(Ljava/lang/Runnable;)Lgj/b;

    move-result-object p1

    invoke-static {p0, p1}, Lkj/b;->l(Ljava/util/concurrent/atomic/AtomicReference;Lgj/b;)Z

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iput-object p1, p0, Lqj/o$a;->c:Ljava/lang/Object;

    iget-object p1, p0, Lqj/o$a;->b:Ldj/r;

    invoke-virtual {p1, p0}, Ldj/r;->b(Ljava/lang/Runnable;)Lgj/b;

    move-result-object p1

    invoke-static {p0, p1}, Lkj/b;->l(Ljava/util/concurrent/atomic/AtomicReference;Lgj/b;)Z

    return-void
.end method

.method public run()V
    .locals 2

    iget-object v0, p0, Lqj/o$a;->d:Ljava/lang/Throwable;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iput-object v1, p0, Lqj/o$a;->d:Ljava/lang/Throwable;

    iget-object v1, p0, Lqj/o$a;->a:Ldj/l;

    invoke-interface {v1, v0}, Ldj/l;->onError(Ljava/lang/Throwable;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lqj/o$a;->c:Ljava/lang/Object;

    if-eqz v0, :cond_1

    iput-object v1, p0, Lqj/o$a;->c:Ljava/lang/Object;

    iget-object v1, p0, Lqj/o$a;->a:Ldj/l;

    invoke-interface {v1, v0}, Ldj/l;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lqj/o$a;->a:Ldj/l;

    invoke-interface {v0}, Ldj/l;->a()V

    :goto_0
    return-void
.end method
