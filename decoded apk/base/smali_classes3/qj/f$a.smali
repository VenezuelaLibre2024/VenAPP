.class final Lqj/f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/t;
.implements Lgj/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqj/f;
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
        "Ldj/t<",
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

.field final b:Ljj/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/g<",
            "-TT;>;"
        }
    .end annotation
.end field

.field c:Lgj/b;


# direct methods
.method constructor <init>(Ldj/l;Ljj/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/l<",
            "-TT;>;",
            "Ljj/g<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqj/f$a;->a:Ldj/l;

    iput-object p2, p0, Lqj/f$a;->b:Ljj/g;

    return-void
.end method


# virtual methods
.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lqj/f$a;->c:Lgj/b;

    invoke-static {v0, p1}, Lkj/b;->p(Lgj/b;Lgj/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqj/f$a;->c:Lgj/b;

    iget-object p1, p0, Lqj/f$a;->a:Ldj/l;

    invoke-interface {p1, p0}, Ldj/l;->b(Lgj/b;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 2

    iget-object v0, p0, Lqj/f$a;->c:Lgj/b;

    sget-object v1, Lkj/b;->DISPOSED:Lkj/b;

    iput-object v1, p0, Lqj/f$a;->c:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    return-void
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lqj/f$a;->c:Lgj/b;

    invoke-interface {v0}, Lgj/b;->h()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lqj/f$a;->a:Ldj/l;

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

    :try_start_0
    iget-object v0, p0, Lqj/f$a;->b:Ljj/g;

    invoke-interface {v0, p1}, Ljj/g;->test(Ljava/lang/Object;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqj/f$a;->a:Ldj/l;

    invoke-interface {v0, p1}, Ldj/l;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lqj/f$a;->a:Ldj/l;

    invoke-interface {p1}, Ldj/l;->a()V

    :goto_0
    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lhj/b;->b(Ljava/lang/Throwable;)V

    iget-object v0, p0, Lqj/f$a;->a:Ldj/l;

    invoke-interface {v0, p1}, Ldj/l;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
