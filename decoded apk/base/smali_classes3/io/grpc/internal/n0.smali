.class public abstract Lio/grpc/internal/n0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/u1;


# instance fields
.field private final a:Lio/grpc/internal/u1;


# direct methods
.method protected constructor <init>(Lio/grpc/internal/u1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "buf"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/u1;

    iput-object p1, p0, Lio/grpc/internal/n0;->a:Lio/grpc/internal/u1;

    return-void
.end method


# virtual methods
.method public A(I)Lio/grpc/internal/u1;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->a:Lio/grpc/internal/u1;

    invoke-interface {v0, p1}, Lio/grpc/internal/u1;->A(I)Lio/grpc/internal/u1;

    move-result-object p1

    return-object p1
.end method

.method public V0([BII)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->a:Lio/grpc/internal/u1;

    invoke-interface {v0, p1, p2, p3}, Lio/grpc/internal/u1;->V0([BII)V

    return-void
.end method

.method public d1()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->a:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->d1()V

    return-void
.end method

.method public k()I
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->a:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->k()I

    move-result v0

    return v0
.end method

.method public l1(Ljava/io/OutputStream;I)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->a:Lio/grpc/internal/u1;

    invoke-interface {v0, p1, p2}, Lio/grpc/internal/u1;->l1(Ljava/io/OutputStream;I)V

    return-void
.end method

.method public markSupported()Z
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->a:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->markSupported()Z

    move-result v0

    return v0
.end method

.method public r0(Ljava/nio/ByteBuffer;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->a:Lio/grpc/internal/u1;

    invoke-interface {v0, p1}, Lio/grpc/internal/u1;->r0(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public readUnsignedByte()I
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->a:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->readUnsignedByte()I

    move-result v0

    return v0
.end method

.method public reset()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->a:Lio/grpc/internal/u1;

    invoke-interface {v0}, Lio/grpc/internal/u1;->reset()V

    return-void
.end method

.method public skipBytes(I)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/n0;->a:Lio/grpc/internal/u1;

    invoke-interface {v0, p1}, Lio/grpc/internal/u1;->skipBytes(I)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "delegate"

    iget-object v2, p0, Lio/grpc/internal/n0;->a:Lio/grpc/internal/u1;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
