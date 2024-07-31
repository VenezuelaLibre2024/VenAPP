.class final Lqj/g$a;
.super Ljava/util/concurrent/atomic/AtomicReference;
.source "SourceFile"

# interfaces
.implements Ldj/l;
.implements Ldj/c;
.implements Lgj/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqj/g;
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
        "Ldj/c;",
        "Lgj/b;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = -0x1e36b7386cc4ca45L


# instance fields
.field final a:Ldj/c;

.field final b:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-TT;+",
            "Ldj/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ldj/c;Ljj/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/c;",
            "Ljj/e<",
            "-TT;+",
            "Ldj/d;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lqj/g$a;->a:Ldj/c;

    iput-object p2, p0, Lqj/g$a;->b:Ljj/e;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lqj/g$a;->a:Ldj/c;

    invoke-interface {v0}, Ldj/c;->a()V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 0

    invoke-static {p0, p1}, Lkj/b;->l(Ljava/util/concurrent/atomic/AtomicReference;Lgj/b;)Z

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
    .locals 1

    iget-object v0, p0, Lqj/g$a;->a:Ldj/c;

    invoke-interface {v0, p1}, Ldj/c;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lqj/g$a;->b:Ljj/e;

    invoke-interface {v0, p1}, Ljj/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "The mapper returned a null CompletableSource"

    invoke-static {p1, v0}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ldj/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p0}, Lqj/g$a;->h()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1, p0}, Ldj/d;->a(Ldj/c;)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lqj/g$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
