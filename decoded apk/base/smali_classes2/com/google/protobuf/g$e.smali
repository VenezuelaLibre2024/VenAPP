.class final Lcom/google/protobuf/g$e;
.super Lcom/google/protobuf/g$j;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final f:I

.field private final r:I


# direct methods
.method constructor <init>([BII)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/protobuf/g$j;-><init>([B)V

    add-int v0, p2, p3

    array-length p1, p1

    invoke-static {p2, v0, p1}, Lcom/google/protobuf/g;->h(III)I

    iput p2, p0, Lcom/google/protobuf/g$e;->f:I

    iput p3, p0, Lcom/google/protobuf/g$e;->r:I

    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    new-instance p1, Ljava/io/InvalidObjectException;

    const-string v0, "BoundedByteStream instances are not to be serialized directly"

    invoke-direct {p1, v0}, Ljava/io/InvalidObjectException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method protected H()I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/g$e;->f:I

    return v0
.end method

.method public d(I)B
    .locals 2

    invoke-virtual {p0}, Lcom/google/protobuf/g$e;->size()I

    move-result v0

    invoke-static {p1, v0}, Lcom/google/protobuf/g;->f(II)V

    iget-object v0, p0, Lcom/google/protobuf/g$j;->e:[B

    iget v1, p0, Lcom/google/protobuf/g$e;->f:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method protected n([BIII)V
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/g$j;->e:[B

    invoke-virtual {p0}, Lcom/google/protobuf/g$e;->H()I

    move-result v1

    add-int/2addr v1, p2

    invoke-static {v0, v1, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method o(I)B
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/g$j;->e:[B

    iget v1, p0, Lcom/google/protobuf/g$e;->f:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/g$e;->r:I

    return v0
.end method

.method writeReplace()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/g;->w()[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/protobuf/g;->D([B)Lcom/google/protobuf/g;

    move-result-object v0

    return-object v0
.end method
