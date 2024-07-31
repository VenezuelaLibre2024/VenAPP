.class final Lio/grpc/internal/f1$p$e;
.super Lio/grpc/internal/z;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1$p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/f1$p$e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        ">",
        "Lio/grpc/internal/z<",
        "TReqT;TRespT;>;"
    }
.end annotation


# instance fields
.field final l:Lvi/r;

.field final m:Lvi/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/x0<",
            "TReqT;TRespT;>;"
        }
    .end annotation
.end field

.field final n:Lvi/c;

.field final synthetic o:Lio/grpc/internal/f1$p;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$p;Lvi/r;Lvi/x0;Lvi/c;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/r;",
            "Lvi/x0<",
            "TReqT;TRespT;>;",
            "Lvi/c;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/f1$p$e;->o:Lio/grpc/internal/f1$p;

    iget-object v0, p1, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {v0, p4}, Lio/grpc/internal/f1;->v(Lio/grpc/internal/f1;Lvi/c;)Ljava/util/concurrent/Executor;

    move-result-object v0

    iget-object p1, p1, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {p1}, Lio/grpc/internal/f1;->L(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$r;

    move-result-object p1

    invoke-virtual {p4}, Lvi/c;->d()Lvi/t;

    move-result-object v1

    invoke-direct {p0, v0, p1, v1}, Lio/grpc/internal/z;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lvi/t;)V

    iput-object p2, p0, Lio/grpc/internal/f1$p$e;->l:Lvi/r;

    iput-object p3, p0, Lio/grpc/internal/f1$p$e;->m:Lvi/x0;

    iput-object p4, p0, Lio/grpc/internal/f1$p$e;->n:Lvi/c;

    return-void
.end method


# virtual methods
.method protected j()V
    .locals 2

    invoke-super {p0}, Lio/grpc/internal/z;->j()V

    iget-object v0, p0, Lio/grpc/internal/f1$p$e;->o:Lio/grpc/internal/f1$p;

    iget-object v0, v0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    new-instance v1, Lio/grpc/internal/f1$p$e$b;

    invoke-direct {v1, p0}, Lio/grpc/internal/f1$p$e$b;-><init>(Lio/grpc/internal/f1$p$e;)V

    invoke-virtual {v0, v1}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method r()V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/f1$p$e;->l:Lvi/r;

    invoke-virtual {v0}, Lvi/r;->b()Lvi/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/f1$p$e;->o:Lio/grpc/internal/f1$p;

    iget-object v2, p0, Lio/grpc/internal/f1$p$e;->m:Lvi/x0;

    iget-object v3, p0, Lio/grpc/internal/f1$p$e;->n:Lvi/c;

    invoke-static {v1, v2, v3}, Lio/grpc/internal/f1$p;->k(Lio/grpc/internal/f1$p;Lvi/x0;Lvi/c;)Lvi/g;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object v2, p0, Lio/grpc/internal/f1$p$e;->l:Lvi/r;

    invoke-virtual {v2, v0}, Lvi/r;->f(Lvi/r;)V

    invoke-virtual {p0, v1}, Lio/grpc/internal/z;->p(Lvi/g;)Ljava/lang/Runnable;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/f1$p$e;->o:Lio/grpc/internal/f1$p;

    iget-object v0, v0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    new-instance v1, Lio/grpc/internal/f1$p$e$b;

    invoke-direct {v1, p0}, Lio/grpc/internal/f1$p$e$b;-><init>(Lio/grpc/internal/f1$p$e;)V

    invoke-virtual {v0, v1}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lio/grpc/internal/f1$p$e;->o:Lio/grpc/internal/f1$p;

    iget-object v1, v1, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    iget-object v2, p0, Lio/grpc/internal/f1$p$e;->n:Lvi/c;

    invoke-static {v1, v2}, Lio/grpc/internal/f1;->v(Lio/grpc/internal/f1;Lvi/c;)Ljava/util/concurrent/Executor;

    move-result-object v1

    new-instance v2, Lio/grpc/internal/f1$p$e$a;

    invoke-direct {v2, p0, v0}, Lio/grpc/internal/f1$p$e$a;-><init>(Lio/grpc/internal/f1$p$e;Ljava/lang/Runnable;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :goto_0
    return-void

    :catchall_0
    move-exception v1

    iget-object v2, p0, Lio/grpc/internal/f1$p$e;->l:Lvi/r;

    invoke-virtual {v2, v0}, Lvi/r;->f(Lvi/r;)V

    throw v1
.end method
