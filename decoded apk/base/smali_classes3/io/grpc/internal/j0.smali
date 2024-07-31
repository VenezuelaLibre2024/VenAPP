.class abstract Lio/grpc/internal/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/v;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract a()Lio/grpc/internal/v;
.end method

.method public b(Lvi/g1;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/j0;->a()Lio/grpc/internal/v;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/j1;->b(Lvi/g1;)V

    return-void
.end method

.method public c(Lvi/x0;Lvi/w0;Lvi/c;[Lvi/k;)Lio/grpc/internal/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/x0<",
            "**>;",
            "Lvi/w0;",
            "Lvi/c;",
            "[",
            "Lvi/k;",
            ")",
            "Lio/grpc/internal/q;"
        }
    .end annotation

    invoke-virtual {p0}, Lio/grpc/internal/j0;->a()Lio/grpc/internal/v;

    move-result-object v0

    invoke-interface {v0, p1, p2, p3, p4}, Lio/grpc/internal/s;->c(Lvi/x0;Lvi/w0;Lvi/c;[Lvi/k;)Lio/grpc/internal/q;

    move-result-object p1

    return-object p1
.end method

.method public d(Lvi/g1;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/j0;->a()Lio/grpc/internal/v;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/j1;->d(Lvi/g1;)V

    return-void
.end method

.method public e()Lvi/i0;
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/j0;->a()Lio/grpc/internal/v;

    move-result-object v0

    invoke-interface {v0}, Lvi/n0;->e()Lvi/i0;

    move-result-object v0

    return-object v0
.end method

.method public f(Lio/grpc/internal/s$a;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/j0;->a()Lio/grpc/internal/v;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lio/grpc/internal/s;->f(Lio/grpc/internal/s$a;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public g(Lio/grpc/internal/j1$a;)Ljava/lang/Runnable;
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/j0;->a()Lio/grpc/internal/v;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/j1;->g(Lio/grpc/internal/j1$a;)Ljava/lang/Runnable;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "delegate"

    invoke-virtual {p0}, Lio/grpc/internal/j0;->a()Lio/grpc/internal/v;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
