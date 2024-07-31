.class final Lrj/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/q;
.implements Lgj/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrj/b;
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
        "Ldj/q<",
        "TT;>;",
        "Lgj/b;"
    }
.end annotation


# instance fields
.field final a:Ldj/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/q<",
            "-",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field final b:Ljj/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/g<",
            "-TT;>;"
        }
    .end annotation
.end field

.field c:Lgj/b;

.field d:Z


# direct methods
.method constructor <init>(Ldj/q;Ljj/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljj/g<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrj/b$a;->a:Ldj/q;

    iput-object p2, p0, Lrj/b$a;->b:Ljj/g;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-boolean v0, p0, Lrj/b$a;->d:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lrj/b$a;->d:Z

    iget-object v0, p0, Lrj/b$a;->a:Ldj/q;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Ldj/q;->c(Ljava/lang/Object;)V

    iget-object v0, p0, Lrj/b$a;->a:Ldj/q;

    invoke-interface {v0}, Ldj/q;->a()V

    :cond_0
    return-void
.end method

.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lrj/b$a;->c:Lgj/b;

    invoke-static {v0, p1}, Lkj/b;->p(Lgj/b;Lgj/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lrj/b$a;->c:Lgj/b;

    iget-object p1, p0, Lrj/b$a;->a:Ldj/q;

    invoke-interface {p1, p0}, Ldj/q;->b(Lgj/b;)V

    :cond_0
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lrj/b$a;->d:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :try_start_0
    iget-object v0, p0, Lrj/b$a;->b:Ljj/g;

    invoke-interface {v0, p1}, Ljj/g;->test(Ljava/lang/Object;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    iput-boolean p1, p0, Lrj/b$a;->d:Z

    iget-object p1, p0, Lrj/b$a;->c:Lgj/b;

    invoke-interface {p1}, Lgj/b;->dispose()V

    iget-object p1, p0, Lrj/b$a;->a:Ldj/q;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Ldj/q;->c(Ljava/lang/Object;)V

    iget-object p1, p0, Lrj/b$a;->a:Ldj/q;

    invoke-interface {p1}, Ldj/q;->a()V

    :cond_1
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lrj/b$a;->c:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    invoke-virtual {p0, p1}, Lrj/b$a;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lrj/b$a;->c:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    return-void
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lrj/b$a;->c:Lgj/b;

    invoke-interface {v0}, Lgj/b;->h()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-boolean v0, p0, Lrj/b$a;->d:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Lyj/a;->q(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lrj/b$a;->d:Z

    iget-object v0, p0, Lrj/b$a;->a:Ldj/q;

    invoke-interface {v0, p1}, Ldj/q;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
