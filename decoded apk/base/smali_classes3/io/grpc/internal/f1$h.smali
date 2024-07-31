.class final Lio/grpc/internal/f1$h;
.super Lvi/y;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        ">",
        "Lvi/y<",
        "TReqT;TRespT;>;"
    }
.end annotation


# instance fields
.field private final a:Lvi/e0;

.field private final b:Lvi/d;

.field private final c:Ljava/util/concurrent/Executor;

.field private final d:Lvi/x0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/x0<",
            "TReqT;TRespT;>;"
        }
    .end annotation
.end field

.field private final e:Lvi/r;

.field private f:Lvi/c;

.field private g:Lvi/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lvi/e0;Lvi/d;Ljava/util/concurrent/Executor;Lvi/x0;Lvi/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/e0;",
            "Lvi/d;",
            "Ljava/util/concurrent/Executor;",
            "Lvi/x0<",
            "TReqT;TRespT;>;",
            "Lvi/c;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Lvi/y;-><init>()V

    iput-object p1, p0, Lio/grpc/internal/f1$h;->a:Lvi/e0;

    iput-object p2, p0, Lio/grpc/internal/f1$h;->b:Lvi/d;

    iput-object p4, p0, Lio/grpc/internal/f1$h;->d:Lvi/x0;

    invoke-virtual {p5}, Lvi/c;->e()Ljava/util/concurrent/Executor;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p5}, Lvi/c;->e()Ljava/util/concurrent/Executor;

    move-result-object p3

    :goto_0
    iput-object p3, p0, Lio/grpc/internal/f1$h;->c:Ljava/util/concurrent/Executor;

    invoke-virtual {p5, p3}, Lvi/c;->n(Ljava/util/concurrent/Executor;)Lvi/c;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/f1$h;->f:Lvi/c;

    invoke-static {}, Lvi/r;->e()Lvi/r;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/f1$h;->e:Lvi/r;

    return-void
.end method

.method static synthetic g(Lio/grpc/internal/f1$h;)Lvi/r;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/f1$h;->e:Lvi/r;

    return-object p0
.end method

.method private h(Lvi/g$a;Lvi/g1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/g$a<",
            "TRespT;>;",
            "Lvi/g1;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/f1$h;->c:Ljava/util/concurrent/Executor;

    new-instance v1, Lio/grpc/internal/f1$h$a;

    invoke-direct {v1, p0, p1, p2}, Lio/grpc/internal/f1$h$a;-><init>(Lio/grpc/internal/f1$h;Lvi/g$a;Lvi/g1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$h;->g:Lvi/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lvi/g;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public e(Lvi/g$a;Lvi/w0;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/g$a<",
            "TRespT;>;",
            "Lvi/w0;",
            ")V"
        }
    .end annotation

    new-instance v0, Lio/grpc/internal/s1;

    iget-object v1, p0, Lio/grpc/internal/f1$h;->d:Lvi/x0;

    iget-object v2, p0, Lio/grpc/internal/f1$h;->f:Lvi/c;

    invoke-direct {v0, v1, p2, v2}, Lio/grpc/internal/s1;-><init>(Lvi/x0;Lvi/w0;Lvi/c;)V

    iget-object v1, p0, Lio/grpc/internal/f1$h;->a:Lvi/e0;

    invoke-virtual {v1, v0}, Lvi/e0;->a(Lvi/p0$f;)Lvi/e0$b;

    move-result-object v0

    invoke-virtual {v0}, Lvi/e0$b;->c()Lvi/g1;

    move-result-object v1

    invoke-virtual {v1}, Lvi/g1;->p()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static {v1}, Lio/grpc/internal/q0;->n(Lvi/g1;)Lvi/g1;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/f1$h;->h(Lvi/g$a;Lvi/g1;)V

    invoke-static {}, Lio/grpc/internal/f1;->N()Lvi/g;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/f1$h;->g:Lvi/g;

    return-void

    :cond_0
    invoke-virtual {v0}, Lvi/e0$b;->b()Lvi/h;

    move-result-object v1

    invoke-virtual {v0}, Lvi/e0$b;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/grpc/internal/i1;

    iget-object v2, p0, Lio/grpc/internal/f1$h;->d:Lvi/x0;

    invoke-virtual {v0, v2}, Lio/grpc/internal/i1;->f(Lvi/x0;)Lio/grpc/internal/i1$b;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, p0, Lio/grpc/internal/f1$h;->f:Lvi/c;

    sget-object v3, Lio/grpc/internal/i1$b;->g:Lvi/c$c;

    invoke-virtual {v2, v3, v0}, Lvi/c;->q(Lvi/c$c;Ljava/lang/Object;)Lvi/c;

    move-result-object v0

    iput-object v0, p0, Lio/grpc/internal/f1$h;->f:Lvi/c;

    :cond_1
    if-eqz v1, :cond_2

    iget-object v0, p0, Lio/grpc/internal/f1$h;->d:Lvi/x0;

    iget-object v2, p0, Lio/grpc/internal/f1$h;->f:Lvi/c;

    iget-object v3, p0, Lio/grpc/internal/f1$h;->b:Lvi/d;

    invoke-interface {v1, v0, v2, v3}, Lvi/h;->a(Lvi/x0;Lvi/c;Lvi/d;)Lvi/g;

    move-result-object v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lio/grpc/internal/f1$h;->b:Lvi/d;

    iget-object v1, p0, Lio/grpc/internal/f1$h;->d:Lvi/x0;

    iget-object v2, p0, Lio/grpc/internal/f1$h;->f:Lvi/c;

    invoke-virtual {v0, v1, v2}, Lvi/d;->h(Lvi/x0;Lvi/c;)Lvi/g;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lio/grpc/internal/f1$h;->g:Lvi/g;

    iget-object v0, p0, Lio/grpc/internal/f1$h;->g:Lvi/g;

    invoke-virtual {v0, p1, p2}, Lvi/g;->e(Lvi/g$a;Lvi/w0;)V

    return-void
.end method

.method protected f()Lvi/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lvi/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/f1$h;->g:Lvi/g;

    return-object v0
.end method
