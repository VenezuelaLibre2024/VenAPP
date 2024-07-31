.class final Lpj/x$a;
.super Ldj/f;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lpj/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/f<",
        "TR;>;"
    }
.end annotation


# instance fields
.field final b:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final c:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TR;>;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljj/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljj/e<",
            "-TT;+",
            "Lim/a<",
            "+TR;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/f;-><init>()V

    iput-object p1, p0, Lpj/x$a;->b:Ljava/lang/Object;

    iput-object p2, p0, Lpj/x$a;->c:Ljj/e;

    return-void
.end method


# virtual methods
.method public I(Lim/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lim/b<",
            "-TR;>;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lpj/x$a;->c:Ljj/e;

    iget-object v1, p0, Lpj/x$a;->b:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljj/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The mapper returned a null Publisher"

    invoke-static {v0, v1}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lim/a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    instance-of v1, v0, Ljava/util/concurrent/Callable;

    if-eqz v1, :cond_1

    :try_start_1
    check-cast v0, Ljava/util/concurrent/Callable;

    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-nez v0, :cond_0

    invoke-static {p1}, Lwj/d;->b(Lim/b;)V

    return-void

    :cond_0
    new-instance v1, Lwj/e;

    invoke-direct {v1, p1, v0}, Lwj/e;-><init>(Lim/b;Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Lim/b;->d(Lim/c;)V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lwj/d;->h(Ljava/lang/Throwable;Lim/b;)V

    return-void

    :cond_1
    invoke-interface {v0, p1}, Lim/a;->a(Lim/b;)V

    :goto_0
    return-void

    :catchall_1
    move-exception v0

    invoke-static {v0, p1}, Lwj/d;->h(Ljava/lang/Throwable;Lim/b;)V

    return-void
.end method
