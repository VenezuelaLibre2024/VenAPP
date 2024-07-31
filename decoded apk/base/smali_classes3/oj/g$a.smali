.class final Loj/g$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/c;
.implements Lgj/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Loj/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final a:Ldj/c;

.field b:Lgj/b;

.field final synthetic c:Loj/g;


# direct methods
.method constructor <init>(Loj/g;Ldj/c;)V
    .locals 0

    iput-object p1, p0, Loj/g$a;->c:Loj/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Loj/g$a;->a:Ldj/c;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Loj/g$a;->b:Lgj/b;

    sget-object v1, Lkj/b;->DISPOSED:Lkj/b;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Loj/g$a;->c:Loj/g;

    iget-object v0, v0, Loj/g;->d:Ljj/a;

    invoke-interface {v0}, Ljj/a;->run()V

    iget-object v0, p0, Loj/g$a;->c:Loj/g;

    iget-object v0, v0, Loj/g;->e:Ljj/a;

    invoke-interface {v0}, Ljj/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Loj/g$a;->a:Ldj/c;

    invoke-interface {v0}, Ldj/c;->a()V

    invoke-virtual {p0}, Loj/g$a;->c()V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    iget-object v1, p0, Loj/g$a;->a:Ldj/c;

    invoke-interface {v1, v0}, Ldj/c;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Loj/g$a;->c:Loj/g;

    iget-object v0, v0, Loj/g;->b:Ljj/d;

    invoke-interface {v0, p1}, Ljj/d;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v0, p0, Loj/g$a;->b:Lgj/b;

    invoke-static {v0, p1}, Lkj/b;->p(Lgj/b;Lgj/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Loj/g$a;->b:Lgj/b;

    iget-object p1, p0, Loj/g$a;->a:Ldj/c;

    invoke-interface {p1, p0}, Ldj/c;->b(Lgj/b;)V

    :cond_0
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-interface {p1}, Lgj/b;->dispose()V

    sget-object p1, Lkj/b;->DISPOSED:Lkj/b;

    iput-object p1, p0, Loj/g$a;->b:Lgj/b;

    iget-object p1, p0, Loj/g$a;->a:Ldj/c;

    invoke-static {v0, p1}, Lkj/c;->n(Ljava/lang/Throwable;Ldj/c;)V

    return-void
.end method

.method c()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Loj/g$a;->c:Loj/g;

    iget-object v0, v0, Loj/g;->f:Ljj/a;

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

.method public dispose()V
    .locals 1

    :try_start_0
    iget-object v0, p0, Loj/g$a;->c:Loj/g;

    iget-object v0, v0, Loj/g;->r:Ljj/a;

    invoke-interface {v0}, Ljj/a;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {v0}, Lyj/a;->q(Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, Loj/g$a;->b:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    return-void
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Loj/g$a;->b:Lgj/b;

    invoke-interface {v0}, Lgj/b;->h()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 4

    iget-object v0, p0, Loj/g$a;->b:Lgj/b;

    sget-object v1, Lkj/b;->DISPOSED:Lkj/b;

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Loj/g$a;->c:Loj/g;

    iget-object v0, v0, Loj/g;->c:Ljj/d;

    invoke-interface {v0, p1}, Ljj/d;->accept(Ljava/lang/Object;)V

    iget-object v0, p0, Loj/g$a;->c:Loj/g;

    iget-object v0, v0, Loj/g;->e:Ljj/a;

    invoke-interface {v0}, Ljj/a;->run()V
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
    iget-object v0, p0, Loj/g$a;->a:Ldj/c;

    invoke-interface {v0, p1}, Ldj/c;->onError(Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Loj/g$a;->c()V

    return-void
.end method
