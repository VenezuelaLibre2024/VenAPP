.class final Lqj/u$a;
.super Lnj/d;
.source "SourceFile"

# interfaces
.implements Ldj/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lqj/u;
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
        "Lnj/d<",
        "TT;>;",
        "Ldj/l<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x6984808a6f073b2aL


# instance fields
.field c:Lgj/b;


# direct methods
.method constructor <init>(Ldj/q;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lnj/d;-><init>(Ldj/q;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    invoke-virtual {p0}, Lnj/d;->d()V

    return-void
.end method

.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lqj/u$a;->c:Lgj/b;

    invoke-static {v0, p1}, Lkj/b;->p(Lgj/b;Lgj/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lqj/u$a;->c:Lgj/b;

    iget-object p1, p0, Lnj/d;->a:Ldj/q;

    invoke-interface {p1, p0}, Ldj/q;->b(Lgj/b;)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    invoke-super {p0}, Lnj/d;->dispose()V

    iget-object v0, p0, Lqj/u$a;->c:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 0

    invoke-virtual {p0, p1}, Lnj/d;->f(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lnj/d;->e(Ljava/lang/Object;)V

    return-void
.end method
