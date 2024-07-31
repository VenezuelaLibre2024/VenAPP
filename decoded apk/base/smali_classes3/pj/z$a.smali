.class final Lpj/z$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldj/i;
.implements Lgj/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpj/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U::",
        "Ljava/util/Collection<",
        "-TT;>;>",
        "Ljava/lang/Object;",
        "Ldj/i<",
        "TT;>;",
        "Lgj/b;"
    }
.end annotation


# instance fields
.field final a:Ldj/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/t<",
            "-TU;>;"
        }
    .end annotation
.end field

.field b:Lim/c;

.field c:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TU;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ldj/t;Ljava/util/Collection;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/t<",
            "-TU;>;TU;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpj/z$a;->a:Ldj/t;

    iput-object p2, p0, Lpj/z$a;->c:Ljava/util/Collection;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    sget-object v0, Lwj/g;->CANCELLED:Lwj/g;

    iput-object v0, p0, Lpj/z$a;->b:Lim/c;

    iget-object v0, p0, Lpj/z$a;->a:Ldj/t;

    iget-object v1, p0, Lpj/z$a;->c:Ljava/util/Collection;

    invoke-interface {v0, v1}, Ldj/t;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lpj/z$a;->c:Ljava/util/Collection;

    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public d(Lim/c;)V
    .locals 2

    iget-object v0, p0, Lpj/z$a;->b:Lim/c;

    invoke-static {v0, p1}, Lwj/g;->q(Lim/c;Lim/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iput-object p1, p0, Lpj/z$a;->b:Lim/c;

    iget-object v0, p0, Lpj/z$a;->a:Ldj/t;

    invoke-interface {v0, p0}, Ldj/t;->b(Lgj/b;)V

    const-wide v0, 0x7fffffffffffffffL

    invoke-interface {p1, v0, v1}, Lim/c;->i(J)V

    :cond_0
    return-void
.end method

.method public dispose()V
    .locals 1

    iget-object v0, p0, Lpj/z$a;->b:Lim/c;

    invoke-interface {v0}, Lim/c;->cancel()V

    sget-object v0, Lwj/g;->CANCELLED:Lwj/g;

    iput-object v0, p0, Lpj/z$a;->b:Lim/c;

    return-void
.end method

.method public h()Z
    .locals 2

    iget-object v0, p0, Lpj/z$a;->b:Lim/c;

    sget-object v1, Lwj/g;->CANCELLED:Lwj/g;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public onError(Ljava/lang/Throwable;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lpj/z$a;->c:Ljava/util/Collection;

    sget-object v0, Lwj/g;->CANCELLED:Lwj/g;

    iput-object v0, p0, Lpj/z$a;->b:Lim/c;

    iget-object v0, p0, Lpj/z$a;->a:Ldj/t;

    invoke-interface {v0, p1}, Ldj/t;->onError(Ljava/lang/Throwable;)V

    return-void
.end method
