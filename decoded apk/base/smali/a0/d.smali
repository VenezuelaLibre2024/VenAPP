.class public La0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/common/util/concurrent/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/google/common/util/concurrent/f<",
        "TV;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/common/util/concurrent/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/f<",
            "TV;>;"
        }
    .end annotation
.end field

.field b:Landroidx/concurrent/futures/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/concurrent/futures/c$a<",
            "TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La0/d$a;

    invoke-direct {v0, p0}, La0/d$a;-><init>(La0/d;)V

    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    iput-object v0, p0, La0/d;->a:Lcom/google/common/util/concurrent/f;

    return-void
.end method

.method constructor <init>(Lcom/google/common/util/concurrent/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/util/concurrent/f<",
            "TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Landroidx/core/util/h;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/common/util/concurrent/f;

    iput-object p1, p0, La0/d;->a:Lcom/google/common/util/concurrent/f;

    return-void
.end method

.method public static a(Lcom/google/common/util/concurrent/f;)La0/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/util/concurrent/f<",
            "TV;>;)",
            "La0/d<",
            "TV;>;"
        }
    .end annotation

    instance-of v0, p0, La0/d;

    if-eqz v0, :cond_0

    check-cast p0, La0/d;

    goto :goto_0

    :cond_0
    new-instance v0, La0/d;

    invoke-direct {v0, p0}, La0/d;-><init>(Lcom/google/common/util/concurrent/f;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V
    .locals 1

    iget-object v0, p0, La0/d;->a:Lcom/google/common/util/concurrent/f;

    invoke-interface {v0, p1, p2}, Lcom/google/common/util/concurrent/f;->addListener(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method b(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    iget-object v0, p0, La0/d;->b:Landroidx/concurrent/futures/c$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method c(Ljava/lang/Throwable;)Z
    .locals 1

    iget-object v0, p0, La0/d;->b:Landroidx/concurrent/futures/c$a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Landroidx/concurrent/futures/c$a;->f(Ljava/lang/Throwable;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public cancel(Z)Z
    .locals 1

    iget-object v0, p0, La0/d;->a:Lcom/google/common/util/concurrent/f;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    move-result p1

    return p1
.end method

.method public final d(Lm/a;Ljava/util/concurrent/Executor;)La0/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lm/a<",
            "-TV;TT;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "La0/d<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, La0/f;->o(Lcom/google/common/util/concurrent/f;Lm/a;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    check-cast p1, La0/d;

    return-object p1
.end method

.method public final e(La0/a;Ljava/util/concurrent/Executor;)La0/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "La0/a<",
            "-TV;TT;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "La0/d<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2}, La0/f;->p(Lcom/google/common/util/concurrent/f;La0/a;Ljava/util/concurrent/Executor;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    check-cast p1, La0/d;

    return-object p1
.end method

.method public get()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, La0/d;->a:Lcom/google/common/util/concurrent/f;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TV;"
        }
    .end annotation

    iget-object v0, p0, La0/d;->a:Lcom/google/common/util/concurrent/f;

    invoke-interface {v0, p1, p2, p3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public isCancelled()Z
    .locals 1

    iget-object v0, p0, La0/d;->a:Lcom/google/common/util/concurrent/f;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public isDone()Z
    .locals 1

    iget-object v0, p0, La0/d;->a:Lcom/google/common/util/concurrent/f;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    return v0
.end method
