.class Lio/grpc/internal/x0$l$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/x0$l;->d(Lvi/g1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lvi/g1;

.field final synthetic b:Lio/grpc/internal/x0$l;


# direct methods
.method constructor <init>(Lio/grpc/internal/x0$l;Lvi/g1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0$l$b;->b:Lio/grpc/internal/x0$l;

    iput-object p2, p0, Lio/grpc/internal/x0$l$b;->a:Lvi/g1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/x0$l$b;->b:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->i(Lio/grpc/internal/x0;)Lvi/q;

    move-result-object v0

    invoke-virtual {v0}, Lvi/q;->c()Lvi/p;

    move-result-object v0

    sget-object v1, Lvi/p;->SHUTDOWN:Lvi/p;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/x0$l$b;->b:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->j(Lio/grpc/internal/x0;)Lio/grpc/internal/j1;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/x0$l$b;->b:Lio/grpc/internal/x0$l;

    iget-object v2, v1, Lio/grpc/internal/x0$l;->a:Lio/grpc/internal/v;

    const/4 v3, 0x0

    if-ne v0, v2, :cond_1

    iget-object v0, v1, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0, v3}, Lio/grpc/internal/x0;->k(Lio/grpc/internal/x0;Lio/grpc/internal/j1;)Lio/grpc/internal/j1;

    iget-object v0, p0, Lio/grpc/internal/x0$l$b;->b:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->I(Lio/grpc/internal/x0;)Lio/grpc/internal/x0$k;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/internal/x0$k;->f()V

    iget-object v0, p0, Lio/grpc/internal/x0$l$b;->b:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    sget-object v1, Lvi/p;->IDLE:Lvi/p;

    invoke-static {v0, v1}, Lio/grpc/internal/x0;->E(Lio/grpc/internal/x0;Lvi/p;)V

    goto :goto_1

    :cond_1
    iget-object v0, v1, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->l(Lio/grpc/internal/x0;)Lio/grpc/internal/v;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/x0$l$b;->b:Lio/grpc/internal/x0$l;

    iget-object v2, v1, Lio/grpc/internal/x0$l;->a:Lio/grpc/internal/v;

    if-ne v0, v2, :cond_4

    iget-object v0, v1, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->i(Lio/grpc/internal/x0;)Lvi/q;

    move-result-object v0

    invoke-virtual {v0}, Lvi/q;->c()Lvi/p;

    move-result-object v0

    sget-object v1, Lvi/p;->CONNECTING:Lvi/p;

    if-ne v0, v1, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lio/grpc/internal/x0$l$b;->b:Lio/grpc/internal/x0$l;

    iget-object v1, v1, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v1}, Lio/grpc/internal/x0;->i(Lio/grpc/internal/x0;)Lvi/q;

    move-result-object v1

    invoke-virtual {v1}, Lvi/q;->c()Lvi/p;

    move-result-object v1

    const-string v2, "Expected state is CONNECTING, actual state is %s"

    invoke-static {v0, v2, v1}, Leb/o;->y(ZLjava/lang/String;Ljava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/x0$l$b;->b:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->I(Lio/grpc/internal/x0;)Lio/grpc/internal/x0$k;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/internal/x0$k;->c()V

    iget-object v0, p0, Lio/grpc/internal/x0$l$b;->b:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->I(Lio/grpc/internal/x0;)Lio/grpc/internal/x0$k;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/internal/x0$k;->e()Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lio/grpc/internal/x0$l$b;->b:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0, v3}, Lio/grpc/internal/x0;->m(Lio/grpc/internal/x0;Lio/grpc/internal/v;)Lio/grpc/internal/v;

    iget-object v0, p0, Lio/grpc/internal/x0$l$b;->b:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->I(Lio/grpc/internal/x0;)Lio/grpc/internal/x0$k;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/internal/x0$k;->f()V

    iget-object v0, p0, Lio/grpc/internal/x0$l$b;->b:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    iget-object v1, p0, Lio/grpc/internal/x0$l$b;->a:Lvi/g1;

    invoke-static {v0, v1}, Lio/grpc/internal/x0;->C(Lio/grpc/internal/x0;Lvi/g1;)V

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lio/grpc/internal/x0$l$b;->b:Lio/grpc/internal/x0$l;

    iget-object v0, v0, Lio/grpc/internal/x0$l;->d:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->F(Lio/grpc/internal/x0;)V

    :cond_4
    :goto_1
    return-void
.end method