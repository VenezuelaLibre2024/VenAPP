.class final Lio/grpc/internal/f1$p$e$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1$p$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/f1$p$e;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$p$e;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$p$e$b;->a:Lio/grpc/internal/f1$p$e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/f1$p$e$b;->a:Lio/grpc/internal/f1$p$e;

    iget-object v0, v0, Lio/grpc/internal/f1$p$e;->o:Lio/grpc/internal/f1$p;

    iget-object v0, v0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->I(Lio/grpc/internal/f1;)Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/f1$p$e$b;->a:Lio/grpc/internal/f1$p$e;

    iget-object v0, v0, Lio/grpc/internal/f1$p$e;->o:Lio/grpc/internal/f1$p;

    iget-object v0, v0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->I(Lio/grpc/internal/f1;)Ljava/util/Collection;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/f1$p$e$b;->a:Lio/grpc/internal/f1$p$e;

    invoke-interface {v0, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/grpc/internal/f1$p$e$b;->a:Lio/grpc/internal/f1$p$e;

    iget-object v0, v0, Lio/grpc/internal/f1$p$e;->o:Lio/grpc/internal/f1$p;

    iget-object v0, v0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->I(Lio/grpc/internal/f1;)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/f1$p$e$b;->a:Lio/grpc/internal/f1$p$e;

    iget-object v0, v0, Lio/grpc/internal/f1$p$e;->o:Lio/grpc/internal/f1$p;

    iget-object v0, v0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    iget-object v1, v0, Lio/grpc/internal/f1;->i0:Lio/grpc/internal/v0;

    invoke-static {v0}, Lio/grpc/internal/f1;->K(Lio/grpc/internal/f1;)Ljava/lang/Object;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Lio/grpc/internal/v0;->e(Ljava/lang/Object;Z)V

    iget-object v0, p0, Lio/grpc/internal/f1$p$e$b;->a:Lio/grpc/internal/f1$p$e;

    iget-object v0, v0, Lio/grpc/internal/f1$p$e;->o:Lio/grpc/internal/f1$p;

    iget-object v0, v0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lio/grpc/internal/f1;->J(Lio/grpc/internal/f1;Ljava/util/Collection;)Ljava/util/Collection;

    iget-object v0, p0, Lio/grpc/internal/f1$p$e$b;->a:Lio/grpc/internal/f1$p$e;

    iget-object v0, v0, Lio/grpc/internal/f1$p$e;->o:Lio/grpc/internal/f1$p;

    iget-object v0, v0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->n(Lio/grpc/internal/f1;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/f1$p$e$b;->a:Lio/grpc/internal/f1$p$e;

    iget-object v0, v0, Lio/grpc/internal/f1$p$e;->o:Lio/grpc/internal/f1$p;

    iget-object v0, v0, Lio/grpc/internal/f1$p;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->x(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$t;

    move-result-object v0

    sget-object v1, Lio/grpc/internal/f1;->q0:Lvi/g1;

    invoke-virtual {v0, v1}, Lio/grpc/internal/f1$t;->b(Lvi/g1;)V

    :cond_0
    return-void
.end method