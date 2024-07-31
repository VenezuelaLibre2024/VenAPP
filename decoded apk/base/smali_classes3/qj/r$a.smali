.class final Lqj/r$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ldj/l;
.implements Lgj/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqj/r;
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
        "Lgj/b;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x76f356c87ebda749L


# instance fields
.field final a:Lkj/e;

.field final b:Ldj/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/l<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ldj/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqj/r$a;->b:Ldj/l;

    new-instance p1, Lkj/e;

    invoke-direct {p1}, Lkj/e;-><init>()V

    iput-object p1, p0, Lqj/r$a;->a:Lkj/e;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lqj/r$a;->b:Ldj/l;

    invoke-interface {v0}, Ldj/l;->a()V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 0

    invoke-static {p0, p1}, Lkj/b;->o(Ljava/util/concurrent/atomic/AtomicReference;Lgj/b;)Z

    return-void
.end method

.method public dispose()V
    .locals 1

    invoke-static {p0}, Lkj/b;->b(Ljava/util/concurrent/atomic/AtomicReference;)Z

    iget-object v0, p0, Lqj/r$a;->a:Lkj/e;

    invoke-virtual {v0}, Lkj/e;->dispose()V

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
    .locals 1

    iget-object v0, p0, Lqj/r$a;->b:Ldj/l;

    invoke-interface {v0, p1}, Ldj/l;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lqj/r$a;->b:Ldj/l;

    invoke-interface {v0, p1}, Ldj/l;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
