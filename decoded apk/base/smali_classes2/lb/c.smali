.class public Llb/c;
.super Llb/d;
.source "SourceFile"


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    invoke-direct {p0, p1, p2}, Llb/d;-><init>([BI)V

    return-void
.end method


# virtual methods
.method public b([II)[I
    .locals 3

    array-length v0, p1

    invoke-virtual {p0}, Llb/c;->e()I

    move-result v1

    div-int/lit8 v1, v1, 0x4

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    const/16 v0, 0x10

    new-array v0, v0, [I

    iget-object v1, p0, Llb/d;->a:[I

    invoke-static {v0, v1}, Llb/a;->c([I[I)V

    const/16 v1, 0xc

    aput p2, v0, v1

    const/16 p2, 0xd

    array-length v1, p1

    invoke-static {p1, v2, v0, p2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    array-length p1, p1

    mul-int/lit8 p1, p1, 0x20

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v2

    const-string p1, "ChaCha20 uses 96-bit nonces, but got a %d-bit nonce"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public bridge synthetic c([BLjava/nio/ByteBuffer;)[B
    .locals 0

    invoke-super {p0, p1, p2}, Llb/d;->c([BLjava/nio/ByteBuffer;)[B

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Ljava/nio/ByteBuffer;[B[B)V
    .locals 0

    invoke-super {p0, p1, p2, p3}, Llb/d;->d(Ljava/nio/ByteBuffer;[B[B)V

    return-void
.end method

.method public e()I
    .locals 1

    const/16 v0, 0xc

    return v0
.end method
