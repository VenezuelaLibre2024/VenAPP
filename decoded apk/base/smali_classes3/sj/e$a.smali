.class final Lsj/e$a;
.super Lwj/c;
.source "SourceFile"

# interfaces
.implements Ldj/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lsj/e;
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
        "Lwj/c<",
        "TT;>;",
        "Ldj/t<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x29b22beb2ba33c0L


# instance fields
.field c:Lgj/b;


# direct methods
.method constructor <init>(Lim/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TT;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lwj/c;-><init>(Lim/b;)V

    return-void
.end method


# virtual methods
.method public b(Lgj/b;)V
    .locals 1

    iget-object v0, p0, Lsj/e$a;->c:Lgj/b;

    invoke-static {v0, p1}, Lkj/b;->p(Lgj/b;Lgj/b;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lsj/e$a;->c:Lgj/b;

    iget-object p1, p0, Lwj/c;->a:Lim/b;

    invoke-interface {p1, p0}, Lim/b;->d(Lim/c;)V

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 1

    invoke-super {p0}, Lwj/c;->cancel()V

    iget-object v0, p0, Lsj/e$a;->c:Lgj/b;

    invoke-interface {v0}, Lgj/b;->dispose()V

    return-void
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lwj/c;->a:Lim/b;

    invoke-interface {v0, p1}, Lim/b;->onError(Ljava/lang/Throwable;)V

    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lwj/c;->e(Ljava/lang/Object;)V

    return-void
.end method
