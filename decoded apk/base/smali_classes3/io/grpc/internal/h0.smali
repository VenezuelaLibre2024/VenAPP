.class abstract Lio/grpc/internal/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/q;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lvi/n;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/i2;->a(Lvi/n;)V

    return-void
.end method

.method public b(I)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/i2;->b(I)V

    return-void
.end method

.method public c(Lvi/g1;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->c(Lvi/g1;)V

    return-void
.end method

.method public d()Z
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/i2;->d()Z

    move-result v0

    return v0
.end method

.method public e(I)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->e(I)V

    return-void
.end method

.method public f(I)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->f(I)V

    return-void
.end method

.method public flush()V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/i2;->flush()V

    return-void
.end method

.method public g(Lvi/t;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->g(Lvi/t;)V

    return-void
.end method

.method public h(Ljava/io/InputStream;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/i2;->h(Ljava/io/InputStream;)V

    return-void
.end method

.method public i()V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/i2;->i()V

    return-void
.end method

.method public j(Z)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->j(Z)V

    return-void
.end method

.method public k(Lvi/v;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->k(Lvi/v;)V

    return-void
.end method

.method public l(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->l(Ljava/lang/String;)V

    return-void
.end method

.method public m(Lio/grpc/internal/w0;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->m(Lio/grpc/internal/w0;)V

    return-void
.end method

.method public n()V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/q;->n()V

    return-void
.end method

.method public o(Lio/grpc/internal/r;)V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lio/grpc/internal/q;->o(Lio/grpc/internal/r;)V

    return-void
.end method

.method protected abstract p()Lio/grpc/internal/q;
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "delegate"

    invoke-virtual {p0}, Lio/grpc/internal/h0;->p()Lio/grpc/internal/q;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
