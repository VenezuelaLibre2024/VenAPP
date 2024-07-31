.class final Lqj/l$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/l;
.implements Lgj/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqj/l;
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
.field final a:Ldj/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/t<",
            "-",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field b:Lgj/b;


# direct methods
.method constructor <init>(Ldj/t;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/t<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqj/l$a;->a:Ldj/t;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    sget-object v0, Lkj/b;->DISPOSED:Lkj/b;

    iput-object v0, p0, Lqj/l$a;->b:Lgj/b;

    iget-object v0, p0, Lqj/l$a;->a:Ldj/t;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, v1}, Ldj/t;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lqj/l$a;->b:Lgj/b;

    invoke-static {v0, p1}, Lkj/b;->p(Lgj/b;Lgj/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqj/l$a;->b:Lgj/b;

    iget-object p1, p0, Lqj/l$a;->a:Ldj/t;

    invoke-interface {p1, p0}, Ldj/t;->b(Lgj/b;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lqj/l$a;->b:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    sget-object v0, Lkj/b;->DISPOSED:Lkj/b;

    iput-object v0, p0, Lqj/l$a;->b:Lgj/b;

    return-void
.end method

.method public h()Z
    .locals 1

    iget-object v0, p0, Lqj/l$a;->b:Lgj/b;

    invoke-interface {v0}, Lgj/b;->h()Z

    move-result v0

    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    sget-object v0, Lkj/b;->DISPOSED:Lkj/b;

    iput-object v0, p0, Lqj/l$a;->b:Lgj/b;

    iget-object v0, p0, Lqj/l$a;->a:Ldj/t;

    invoke-interface {v0, p1}, Ldj/t;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    sget-object p1, Lkj/b;->DISPOSED:Lkj/b;

    iput-object p1, p0, Lqj/l$a;->b:Lgj/b;

    iget-object p1, p0, Lqj/l$a;->a:Ldj/t;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Ldj/t;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method
