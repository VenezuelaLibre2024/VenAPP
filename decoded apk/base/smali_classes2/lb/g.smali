.class public Llb/g;
.super Llb/d;
.source "SourceFile"


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    invoke-direct {p0, p1, p2}, Llb/d;-><init>([BI)V

    return-void
.end method

.method static g([I[I)[I
    .locals 4

    const/16 v0, 0x10

    new-array v0, v0, [I

    invoke-static {v0, p0}, Llb/a;->c([I[I)V

    const/4 p0, 0x0

    aget p0, p1, p0

    const/16 v1, 0xc

    aput p0, v0, v1

    const/4 p0, 0x1

    aget p0, p1, p0

    const/16 v2, 0xd

    aput p0, v0, v2

    const/4 p0, 0x2

    aget p0, p1, p0

    const/16 v3, 0xe

    aput p0, v0, v3

    const/4 p0, 0x3

    aget p0, p1, p0

    const/16 p1, 0xf

    aput p0, v0, p1

    invoke-static {v0}, Llb/a;->d([I)V

    const/4 p0, 0x4

    aget v1, v0, v1

    aput v1, v0, p0

    const/4 p0, 0x5

    aget v1, v0, v2

    aput v1, v0, p0

    const/4 p0, 0x6

    aget v1, v0, v3

    aput v1, v0, p0

    const/4 p0, 0x7

    aget p1, v0, p1

    aput p1, v0, p0

    const/16 p0, 0x8

    invoke-static {v0, p0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method b([II)[I
    .locals 4

    array-length v0, p1

    invoke-virtual {p0}, Llb/g;->e()I

    move-result v1

    const/4 v2, 0x4

    div-int/2addr v1, v2

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/16 v0, 0x10

    new-array v0, v0, [I

    iget-object v1, p0, Llb/d;->a:[I

    invoke-static {v1, p1}, Llb/g;->g([I[I)[I

    move-result-object v1

    invoke-static {v0, v1}, Llb/a;->c([I[I)V

    const/16 v1, 0xc

    aput p2, v0, v1

    const/16 p2, 0xd

    aput v3, v0, p2

    const/16 p2, 0xe

    aget v1, p1, v2

    aput v1, v0, p2

    const/4 p2, 0x5

    aget p1, p1, p2

    const/16 p2, 0xf

    aput p1, v0, p2

    return-object v0

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    array-length p1, p1

    mul-int/lit8 p1, p1, 0x20

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v0, v3

    const-string p1, "XChaCha20 uses 192-bit nonces, but got a %d-bit nonce"

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

.method e()I
    .locals 1

    const/16 v0, 0x18

    return v0
.end method
