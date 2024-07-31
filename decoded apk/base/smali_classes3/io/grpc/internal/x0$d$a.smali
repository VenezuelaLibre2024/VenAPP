.class Lio/grpc/internal/x0$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/x0$d;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/x0$d;


# direct methods
.method constructor <init>(Lio/grpc/internal/x0$d;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0$d$a;->a:Lio/grpc/internal/x0$d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/x0$d$a;->a:Lio/grpc/internal/x0$d;

    iget-object v0, v0, Lio/grpc/internal/x0$d;->b:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->p(Lio/grpc/internal/x0;)Lio/grpc/internal/j1;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/x0$d$a;->a:Lio/grpc/internal/x0$d;

    iget-object v1, v1, Lio/grpc/internal/x0$d;->b:Lio/grpc/internal/x0;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Lio/grpc/internal/x0;->o(Lio/grpc/internal/x0;Lvi/k1$d;)Lvi/k1$d;

    iget-object v1, p0, Lio/grpc/internal/x0$d$a;->a:Lio/grpc/internal/x0$d;

    iget-object v1, v1, Lio/grpc/internal/x0$d;->b:Lio/grpc/internal/x0;

    invoke-static {v1, v2}, Lio/grpc/internal/x0;->q(Lio/grpc/internal/x0;Lio/grpc/internal/j1;)Lio/grpc/internal/j1;

    sget-object v1, Lvi/g1;->u:Lvi/g1;

    const-string v2, "InternalSubchannel closed transport due to address change"

    invoke-virtual {v1, v2}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v1

    invoke-interface {v0, v1}, Lio/grpc/internal/j1;->d(Lvi/g1;)V

    return-void
.end method
