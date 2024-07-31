.class final Lqj/q$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/l;
.implements Lgj/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqj/q;
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
        "Ljava/lang/Object;",
        "Ldj/l<",
        "TT;>;",
        "Lgj/b;"
    }
.end annotation


# instance fields
.field final a:Ldj/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/l<",
            "-TT;>;"
        }
    .end annotation
.end field

.field final b:Lqj/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqj/q<",
            "TT;>;"
        }
    .end annotation
.end field

.field c:Lgj/b;


# direct methods
.method constructor <init>(Ldj/l;Lqj/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;",
            "Lqj/q<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqj/q$a;->a:Ldj/l;

    iput-object p2, p0, Lqj/q$a;->b:Lqj/q;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lqj/q$a;->c:Lgj/b;

    sget-object v1, Lkj/b;->DISPOSED:Lkj/b;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lqj/q$a;->b:Lqj/q;

    iget-object v0, v0, Lqj/q;->e:Ljj/a;

    invoke-interface {v0}, Ljj/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Lqj/q$a;->c:Lgj/b;

    iget-object v0, p0, Lqj/q$a;->a:Ldj/l;

    invoke-interface {v0}, Ldj/l;->a()V

    invoke-virtual {p0}, Lqj/q$a;->c()V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0, v0}, Lqj/q$a;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lqj/q$a;->c:Lgj/b;

    invoke-static {v0, p1}, Lkj/b;->p(Lgj/b;Lgj/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lqj/q$a;->b:Lqj/q;

    iget-object v0, v0, Lqj/q;->b:Ljj/d;

    invoke-interface {v0, p1}, Ljj/d;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object p1, p0, Lqj/q$a;->c:Lgj/b;

    iget-object p1, p0, Lqj/q$a;->a:Ldj/l;

    invoke-interface {p1, p0}, Ldj/l;->b(Lgj/b;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-interface {p1}, Lgj/b;->dispose()V

    sget-object p1, Lkj/b;->DISPOSED:Lkj/b;

    iput-object p1, p0, Lqj/q$a;->c:Lgj/b;

    iget-object p1, p0, Lqj/q$a;->a:Ldj/l;

    invoke-static {v0, p1}, Lkj/c;->o(Ljava/lang/Throwable;Ldj/l;)V

    :cond_0
    :goto_0
    return-void
.end method

.method c()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lqj/q$a;->b:Lqj/q;

    iget-object v0, v0, Lqj/q;->f:Ljj/a;

    invoke-interface {v0}, Ljj/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lyj/a;->q(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method d(Ljava/lang/Throwable;)V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lqj/q$a;->b:Lqj/q;

    iget-object v0, v0, Lqj/q;->d:Ljj/d;

    invoke-interface {v0, p1}, Ljj/d;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    new-instance v1, Lhj/a;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Throwable;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    aput-object v0, v2, p1

    invoke-direct {v1, v2}, Lhj/a;-><init>([Ljava/lang/Throwable;)V

    move-object p1, v1

    :goto_0
    sget-object v0, Lkj/b;->DISPOSED:Lkj/b;

    iput-object v0, p0, Lqj/q$a;->c:Lgj/b;

    iget-object v0, p0, Lqj/q$a;->a:Ldj/l;

    invoke-interface {v0, p1}, Ldj/l;->onError(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lqj/q$a;->c()V

    return-void
.end method

.method public dispose()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lqj/q$a;->b:Lqj/q;

    iget-object v0, v0, Lqj/q;->r:Ljj/a;

    invoke-interface {v0}, Ljj/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lyj/a;->q(Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, Lqj/q$a;->c:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    sget-object v0, Lkj/b;->DISPOSED:Lkj/b;

    iput-object v0, p0, Lqj/q$a;->c:Lgj/b;

    return-void
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lqj/q$a;->c:Lgj/b;

    invoke-interface {v0}, Lgj/b;->h()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lqj/q$a;->c:Lgj/b;

    sget-object v1, Lkj/b;->DISPOSED:Lkj/b;

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lqj/q$a;->d(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lqj/q$a;->c:Lgj/b;

    sget-object v1, Lkj/b;->DISPOSED:Lkj/b;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lqj/q$a;->b:Lqj/q;

    iget-object v0, v0, Lqj/q;->c:Ljj/d;

    invoke-interface {v0, p1}, Ljj/d;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-object v1, p0, Lqj/q$a;->c:Lgj/b;

    iget-object v0, p0, Lqj/q$a;->a:Ldj/l;

    invoke-interface {v0, p1}, Ldj/l;->onSuccess(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lqj/q$a;->c()V

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-virtual {p0, p1}, Lqj/q$a;->d(Ljava/lang/Throwable;)V

    return-void
.end method
