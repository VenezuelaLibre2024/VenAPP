.class Lio/grpc/internal/f1$p$a;
.super Lvi/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1$p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/f1$p;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$p;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$p$a;->a:Lio/grpc/internal/f1$p;

    invoke-direct {p0}, Lvi/d;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$p$a;->a:Lio/grpc/internal/f1$p;

    invoke-static {v0}, Lio/grpc/internal/f1$p;->j(Lio/grpc/internal/f1$p;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public h(Lvi/x0;Lvi/c;)Lvi/g;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<RequestT:",
            "Ljava/lang/Object;",
            "ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "Lvi/x0<",
            "TRequestT;TResponseT;>;",
            "Lvi/c;",
            ")",
            "Lvi/g<",
            "TRequestT;TResponseT;>;"
        }
    .end annotation

    new-instance v8, Lio/grpc/internal/p;

    iget-object v0, p0, Lio/grpc/internal/f1$p$a;->a:Lio/grpc/internal/f1$p;

    iget-object v0, v0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {v0, p2}, Lio/grpc/internal/f1;->v(Lio/grpc/internal/f1;Lvi/c;)Ljava/util/concurrent/Executor;

    move-result-object v2

    iget-object v0, p0, Lio/grpc/internal/f1$p$a;->a:Lio/grpc/internal/f1$p;

    iget-object v0, v0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->F(Lio/grpc/internal/f1;)Lio/grpc/internal/p$e;

    move-result-object v4

    iget-object v0, p0, Lio/grpc/internal/f1$p$a;->a:Lio/grpc/internal/f1$p;

    iget-object v0, v0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->H(Lio/grpc/internal/f1;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$p$a;->a:Lio/grpc/internal/f1$p;

    iget-object v0, v0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->w(Lio/grpc/internal/f1;)Lio/grpc/internal/t;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/t;->l0()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    :goto_0
    move-object v5, v0

    iget-object v0, p0, Lio/grpc/internal/f1$p$a;->a:Lio/grpc/internal/f1$p;

    iget-object v0, v0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->y(Lio/grpc/internal/f1;)Lio/grpc/internal/m;

    move-result-object v6

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v7}, Lio/grpc/internal/p;-><init>(Lvi/x0;Ljava/util/concurrent/Executor;Lvi/c;Lio/grpc/internal/p$e;Ljava/util/concurrent/ScheduledExecutorService;Lio/grpc/internal/m;Lvi/e0;)V

    iget-object p1, p0, Lio/grpc/internal/f1$p$a;->a:Lio/grpc/internal/f1$p;

    iget-object p1, p1, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {p1}, Lio/grpc/internal/f1;->E(Lio/grpc/internal/f1;)Z

    move-result p1

    invoke-virtual {v8, p1}, Lio/grpc/internal/p;->C(Z)Lio/grpc/internal/p;

    move-result-object p1

    iget-object p2, p0, Lio/grpc/internal/f1$p$a;->a:Lio/grpc/internal/f1$p;

    iget-object p2, p2, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {p2}, Lio/grpc/internal/f1;->D(Lio/grpc/internal/f1;)Lvi/v;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/grpc/internal/p;->B(Lvi/v;)Lio/grpc/internal/p;

    move-result-object p1

    iget-object p2, p0, Lio/grpc/internal/f1$p$a;->a:Lio/grpc/internal/f1$p;

    iget-object p2, p2, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {p2}, Lio/grpc/internal/f1;->C(Lio/grpc/internal/f1;)Lvi/o;

    move-result-object p2

    invoke-virtual {p1, p2}, Lio/grpc/internal/p;->A(Lvi/o;)Lio/grpc/internal/p;

    move-result-object p1

    return-object p1
.end method
