.class final Lio/grpc/internal/f1$s$a;
.super Lio/grpc/internal/x0$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$s;->g(Lvi/p0$j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lvi/p0$j;

.field final synthetic b:Lio/grpc/internal/f1$s;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$s;Lvi/p0$j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/f1$s$a;->b:Lio/grpc/internal/f1$s;

    iput-object p2, p0, Lio/grpc/internal/f1$s$a;->a:Lvi/p0$j;

    invoke-direct {p0}, Lio/grpc/internal/x0$j;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lio/grpc/internal/x0;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$s$a;->b:Lio/grpc/internal/f1$s;

    iget-object v0, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->i0:Lio/grpc/internal/v0;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lio/grpc/internal/v0;->e(Ljava/lang/Object;Z)V

    return-void
.end method

.method b(Lio/grpc/internal/x0;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$s$a;->b:Lio/grpc/internal/f1$s;

    iget-object v0, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->i0:Lio/grpc/internal/v0;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lio/grpc/internal/v0;->e(Ljava/lang/Object;Z)V

    return-void
.end method

.method c(Lio/grpc/internal/x0;Lvi/q;)V
    .locals 1

    iget-object p1, p0, Lio/grpc/internal/f1$s$a;->a:Lvi/p0$j;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v0, "listener is null"

    invoke-static {p1, v0}, Leb/o;->v(ZLjava/lang/Object;)V

    iget-object p1, p0, Lio/grpc/internal/f1$s$a;->a:Lvi/p0$j;

    invoke-interface {p1, p2}, Lvi/p0$j;->a(Lvi/q;)V

    return-void
.end method

.method d(Lio/grpc/internal/x0;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$s$a;->b:Lio/grpc/internal/f1$s;

    iget-object v0, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->b0(Lio/grpc/internal/f1;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/grpc/internal/f1$s$a;->b:Lio/grpc/internal/f1$s;

    iget-object v0, v0, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->W(Lio/grpc/internal/f1;)Lvi/c0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/c0;->k(Lvi/h0;)V

    iget-object p1, p0, Lio/grpc/internal/f1$s$a;->b:Lio/grpc/internal/f1$s;

    iget-object p1, p1, Lio/grpc/internal/f1$s;->k:Lio/grpc/internal/f1;

    invoke-static {p1}, Lio/grpc/internal/f1;->X(Lio/grpc/internal/f1;)V

    return-void
.end method
