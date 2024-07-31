.class public final Lpj/k;
.super Lpj/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lpj/k$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Lpj/a<",
        "TT;TR;>;"
    }
.end annotation


# instance fields
.field final c:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-TT;+",
            "Ljava/lang/Iterable<",
            "+TR;>;>;"
        }
    .end annotation
.end field

.field final d:I


# direct methods
.method public constructor <init>(Ldj/f;Ljj/e;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/f<",
            "TT;>;",
            "Ljj/e<",
            "-TT;+",
            "Ljava/lang/Iterable<",
            "+TR;>;>;I)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lpj/a;-><init>(Ldj/f;)V

    iput-object p2, p0, Lpj/k;->c:Ljj/e;

    iput p3, p0, Lpj/k;->d:I

    return-void
.end method


# virtual methods
.method public I(Lim/b;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TR;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lpj/a;->b:Ldj/f;

    instance-of v1, v0, Ljava/util/concurrent/Callable;

    if-eqz v1, :cond_1

    :try_start_0
    check-cast v0, Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-nez v0, :cond_0

    invoke-static {p1}, Lwj/d;->b(Lim/b;)V

    return-void

    :cond_0
    :try_start_1
    iget-object v1, p0, Lpj/k;->c:Ljj/e;

    invoke-interface {v1, v0}, Ljj/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {p1, v0}, Lpj/m;->K(Lim/b;Ljava/util/Iterator;)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lwj/d;->h(Ljava/lang/Throwable;Lim/b;)V

    return-void

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lwj/d;->h(Ljava/lang/Throwable;Lim/b;)V

    return-void

    :cond_1
    new-instance v1, Lpj/k$a;

    iget-object v2, p0, Lpj/k;->c:Ljj/e;

    iget v3, p0, Lpj/k;->d:I

    invoke-direct {v1, p1, v2, v3}, Lpj/k$a;-><init>(Lim/b;Ljj/e;I)V

    invoke-virtual {v0, v1}, Ldj/f;->H(Ldj/i;)V

    return-void
.end method
