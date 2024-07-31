.class final Lrj/l$b;
.super Ldj/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lrj/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "R:",
        "Ljava/lang/Object;",
        ">",
        "Ldj/o<",
        "TR;>;"
    }
.end annotation


# instance fields
.field final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field final b:Ljj/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljj/e<",
            "-TT;+",
            "Ldj/p<",
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
            "Ldj/p<",
            "+TR;>;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ldj/o;-><init>()V

    iput-object p1, p0, Lrj/l$b;->a:Ljava/lang/Object;

    iput-object p2, p0, Lrj/l$b;->b:Ljj/e;

    return-void
.end method


# virtual methods
.method public s(Ldj/q;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldj/q<",
            "-TR;>;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Lrj/l$b;->b:Ljj/e;

    iget-object v1, p0, Lrj/l$b;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Ljj/e;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "The mapper returned a null ObservableSource"

    invoke-static {v0, v1}, Llj/b;->d(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldj/p;
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

    invoke-static {p1}, Lkj/c;->m(Ldj/q;)V

    return-void

    :cond_0
    new-instance v1, Lrj/l$a;

    invoke-direct {v1, p1, v0}, Lrj/l$a;-><init>(Ldj/q;Ljava/lang/Object;)V

    invoke-interface {p1, v1}, Ldj/q;->b(Lgj/b;)V

    invoke-virtual {v1}, Lrj/l$a;->run()V

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lhj/b;->b(Ljava/lang/Throwable;)V

    invoke-static {v0, p1}, Lkj/c;->p(Ljava/lang/Throwable;Ldj/q;)V

    return-void

    :cond_1
    invoke-interface {v0, p1}, Ldj/p;->d(Ldj/q;)V

    :goto_0
    return-void

    :catchall_1
    move-exception v0

    invoke-static {v0, p1}, Lkj/c;->p(Ljava/lang/Throwable;Ldj/q;)V

    return-void
.end method
