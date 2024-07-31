.class public final Lpj/z;
.super Ldj/s;
.source "SourceFile"

# interfaces
.implements Lmj/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/z$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U::",
        "Ljava/util/Collection<",
        "-TT;>;>",
        "Ldj/s<",
        "TU;>;",
        "Lmj/b<",
        "TU;>;"
    }
.end annotation


# instance fields
.field final a:Ldj/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/f<",
            "TT;>;"
        }
    .end annotation
.end field

.field final b:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "TU;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldj/f;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/f<",
            "TT;>;)V"
        }
    .end annotation

    invoke-static {}, Lxj/b;->h()Ljava/util/concurrent/Callable;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lpj/z;-><init>(Ldj/f;Ljava/util/concurrent/Callable;)V

    return-void
.end method

.method public constructor <init>(Ldj/f;Ljava/util/concurrent/Callable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/f<",
            "TT;>;",
            "Ljava/util/concurrent/Callable<",
            "TU;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/s;-><init>()V

    iput-object p1, p0, Lpj/z;->a:Ldj/f;

    iput-object p2, p0, Lpj/z;->b:Ljava/util/concurrent/Callable;

    return-void
.end method


# virtual methods
.method public d()Ldj/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/f<",
            "TU;>;"
        }
    .end annotation

    new-instance v0, Lpj/y;

    iget-object v1, p0, Lpj/z;->a:Ldj/f;

    iget-object v2, p0, Lpj/z;->b:Ljava/util/concurrent/Callable;

    invoke-direct {v0, v1, v2}, Lpj/y;-><init>(Ldj/f;Ljava/util/concurrent/Callable;)V

    invoke-static {v0}, Lyj/a;->k(Ldj/f;)Ldj/f;

    move-result-object v0

    return-object v0
.end method

.method protected k(Ldj/t;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/t<",
            "-TU;>;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lpj/z;->b:Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."

    invoke-static {v0, v1}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v1, p0, Lpj/z;->a:Ldj/f;

    new-instance v2, Lpj/z$a;

    invoke-direct {v2, p1, v0}, Lpj/z$a;-><init>(Ldj/t;Ljava/util/Collection;)V

    invoke-virtual {v1, v2}, Ldj/f;->H(Ldj/i;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lkj/c;->q(Ljava/lang/Throwable;Ldj/t;)V

    return-void
.end method
