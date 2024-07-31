.class final Lio/grpc/internal/f1$n$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$n;->f(Lvi/p;Lvi/p0$i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lvi/p0$i;

.field final synthetic b:Lvi/p;

.field final synthetic c:Lio/grpc/internal/f1$n;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$n;Lvi/p0$i;Lvi/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/f1$n$b;->c:Lio/grpc/internal/f1$n;

    iput-object p2, p0, Lio/grpc/internal/f1$n$b;->a:Lvi/p0$i;

    iput-object p3, p0, Lio/grpc/internal/f1$n$b;->b:Lvi/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lio/grpc/internal/f1$n$b;->c:Lio/grpc/internal/f1$n;

    iget-object v1, v0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->q0(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$n;

    move-result-object v1

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$n$b;->c:Lio/grpc/internal/f1$n;

    iget-object v0, v0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    iget-object v1, p0, Lio/grpc/internal/f1$n$b;->a:Lvi/p0$i;

    invoke-static {v0, v1}, Lio/grpc/internal/f1;->S(Lio/grpc/internal/f1;Lvi/p0$i;)V

    iget-object v0, p0, Lio/grpc/internal/f1$n$b;->b:Lvi/p;

    sget-object v1, Lvi/p;->SHUTDOWN:Lvi/p;

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lio/grpc/internal/f1$n$b;->c:Lio/grpc/internal/f1$n;

    iget-object v0, v0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->z(Lio/grpc/internal/f1;)Lvi/f;

    move-result-object v0

    sget-object v1, Lvi/f$a;->INFO:Lvi/f$a;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lio/grpc/internal/f1$n$b;->b:Lvi/p;

    aput-object v4, v2, v3

    const/4 v3, 0x1

    iget-object v4, p0, Lio/grpc/internal/f1$n$b;->a:Lvi/p0$i;

    aput-object v4, v2, v3

    const-string v3, "Entering {0} state with picker: {1}"

    invoke-virtual {v0, v1, v3, v2}, Lvi/f;->b(Lvi/f$a;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/f1$n$b;->c:Lio/grpc/internal/f1$n;

    iget-object v0, v0, Lio/grpc/internal/f1$n;->b:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->O(Lio/grpc/internal/f1;)Lio/grpc/internal/w;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/f1$n$b;->b:Lvi/p;

    invoke-virtual {v0, v1}, Lio/grpc/internal/w;->a(Lvi/p;)V

    :cond_1
    return-void
.end method
