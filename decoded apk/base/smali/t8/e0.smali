.class public final Lt8/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:[C

.field private static final e:[C

.field private static final f:Lcom/google/common/collect/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/a0<",
            "Ljava/nio/charset/Charset;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private a:[B

.field private b:I

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x2

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lt8/e0;->d:[C

    const/4 v0, 0x1

    new-array v0, v0, [C

    const/4 v1, 0x0

    const/16 v2, 0xa

    aput-char v2, v0, v1

    sput-object v0, Lt8/e0;->e:[C

    sget-object v0, Leb/e;->a:Ljava/nio/charset/Charset;

    sget-object v1, Leb/e;->c:Ljava/nio/charset/Charset;

    sget-object v2, Leb/e;->f:Ljava/nio/charset/Charset;

    sget-object v3, Leb/e;->d:Ljava/nio/charset/Charset;

    sget-object v4, Leb/e;->e:Ljava/nio/charset/Charset;

    invoke-static {v0, v1, v2, v3, v4}, Lcom/google/common/collect/a0;->z(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/a0;

    move-result-object v0

    sput-object v0, Lt8/e0;->f:Lcom/google/common/collect/a0;

    return-void

    nop

    :array_0
    .array-data 2
        0xds
        0xas
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lt8/r0;->f:[B

    iput-object v0, p0, Lt8/e0;->a:[B

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-array v0, p1, [B

    iput-object v0, p0, Lt8/e0;->a:[B

    iput p1, p0, Lt8/e0;->c:I

    return-void
.end method

.method public constructor <init>([B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt8/e0;->a:[B

    array-length p1, p1

    iput p1, p0, Lt8/e0;->c:I

    return-void
.end method

.method public constructor <init>([BI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt8/e0;->a:[B

    iput p2, p0, Lt8/e0;->c:I

    return-void
.end method

.method private W(Ljava/nio/charset/Charset;)V
    .locals 2

    sget-object v0, Lt8/e0;->d:[C

    invoke-direct {p0, p1, v0}, Lt8/e0;->m(Ljava/nio/charset/Charset;[C)C

    move-result v0

    const/16 v1, 0xd

    if-ne v0, v1, :cond_0

    sget-object v0, Lt8/e0;->e:[C

    invoke-direct {p0, p1, v0}, Lt8/e0;->m(Ljava/nio/charset/Charset;[C)C

    :cond_0
    return-void
.end method

.method private d(Ljava/nio/charset/Charset;)I
    .locals 4

    sget-object v0, Leb/e;->c:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Leb/e;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Leb/e;->f:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Leb/e;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Leb/e;->d:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported charset: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    const/4 v0, 0x2

    goto :goto_2

    :cond_3
    :goto_1
    const/4 v0, 0x1

    :goto_2
    iget v1, p0, Lt8/e0;->b:I

    :goto_3
    iget v2, p0, Lt8/e0;->c:I

    add-int/lit8 v3, v0, -0x1

    sub-int v3, v2, v3

    if-ge v1, v3, :cond_9

    sget-object v2, Leb/e;->c:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v2}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    sget-object v2, Leb/e;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v2}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    iget-object v2, p0, Lt8/e0;->a:[B

    aget-byte v2, v2, v1

    invoke-static {v2}, Lt8/r0;->v0(I)Z

    move-result v2

    if-eqz v2, :cond_5

    return v1

    :cond_5
    sget-object v2, Leb/e;->f:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v2}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    sget-object v2, Leb/e;->d:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v2}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    :cond_6
    iget-object v2, p0, Lt8/e0;->a:[B

    aget-byte v3, v2, v1

    if-nez v3, :cond_7

    add-int/lit8 v3, v1, 0x1

    aget-byte v2, v2, v3

    invoke-static {v2}, Lt8/r0;->v0(I)Z

    move-result v2

    if-eqz v2, :cond_7

    return v1

    :cond_7
    sget-object v2, Leb/e;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v2}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    iget-object v2, p0, Lt8/e0;->a:[B

    add-int/lit8 v3, v1, 0x1

    aget-byte v3, v2, v3

    if-nez v3, :cond_8

    aget-byte v2, v2, v1

    invoke-static {v2}, Lt8/r0;->v0(I)Z

    move-result v2

    if-eqz v2, :cond_8

    return v1

    :cond_8
    add-int/2addr v1, v0

    goto :goto_3

    :cond_9
    return v2
.end method

.method private i(Ljava/nio/charset/Charset;)I
    .locals 4

    sget-object v0, Leb/e;->c:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    sget-object v0, Leb/e;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lt8/e0;->a()I

    move-result v0

    if-lt v0, v1, :cond_1

    iget-object p1, p0, Lt8/e0;->a:[B

    iget v0, p0, Lt8/e0;->b:I

    aget-byte p1, p1, v0

    invoke-static {p1}, Lhb/h;->a(B)I

    move-result p1

    int-to-long v2, p1

    invoke-static {v2, v3}, Lhb/b;->a(J)C

    move-result p1

    int-to-byte p1, p1

    goto :goto_1

    :cond_1
    sget-object v0, Leb/e;->f:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x2

    if-nez v0, :cond_2

    sget-object v0, Leb/e;->d:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    invoke-virtual {p0}, Lt8/e0;->a()I

    move-result v0

    if-lt v0, v2, :cond_3

    iget-object p1, p0, Lt8/e0;->a:[B

    iget v0, p0, Lt8/e0;->b:I

    aget-byte v3, p1, v0

    add-int/2addr v0, v1

    aget-byte p1, p1, v0

    invoke-static {v3, p1}, Lhb/b;->c(BB)C

    move-result p1

    :goto_0
    int-to-byte p1, p1

    move v1, v2

    goto :goto_1

    :cond_3
    sget-object v0, Leb/e;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lt8/e0;->a()I

    move-result p1

    if-lt p1, v2, :cond_4

    iget-object p1, p0, Lt8/e0;->a:[B

    iget v0, p0, Lt8/e0;->b:I

    add-int/lit8 v1, v0, 0x1

    aget-byte v1, p1, v1

    aget-byte p1, p1, v0

    invoke-static {v1, p1}, Lhb/b;->c(BB)C

    move-result p1

    goto :goto_0

    :goto_1
    int-to-long v2, p1

    invoke-static {v2, v3}, Lhb/b;->a(J)C

    move-result p1

    shl-int/lit8 p1, p1, 0x10

    add-int/2addr p1, v1

    return p1

    :cond_4
    const/4 p1, 0x0

    return p1
.end method

.method private m(Ljava/nio/charset/Charset;[C)C
    .locals 2

    invoke-direct {p0, p1}, Lt8/e0;->i(Ljava/nio/charset/Charset;)I

    move-result p1

    if-eqz p1, :cond_0

    shr-int/lit8 v0, p1, 0x10

    int-to-char v0, v0

    invoke-static {p2, v0}, Lhb/b;->b([CC)Z

    move-result p2

    if-eqz p2, :cond_0

    iget p2, p0, Lt8/e0;->b:I

    const v1, 0xffff

    and-int/2addr p1, v1

    add-int/2addr p2, p1

    iput p2, p0, Lt8/e0;->b:I

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public A()J
    .locals 9

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v0, v1

    int-to-long v3, v1

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    const/16 v1, 0x38

    shl-long/2addr v3, v1

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, v0, v2

    int-to-long v7, v2

    and-long/2addr v7, v5

    const/16 v2, 0x30

    shl-long/2addr v7, v2

    or-long v2, v3, v7

    add-int/lit8 v4, v1, 0x1

    aget-byte v1, v0, v1

    int-to-long v7, v1

    and-long/2addr v7, v5

    const/16 v1, 0x28

    shl-long/2addr v7, v1

    or-long v1, v2, v7

    add-int/lit8 v3, v4, 0x1

    aget-byte v4, v0, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x20

    shl-long/2addr v7, v4

    or-long/2addr v1, v7

    add-int/lit8 v4, v3, 0x1

    aget-byte v3, v0, v3

    int-to-long v7, v3

    and-long/2addr v7, v5

    const/16 v3, 0x18

    shl-long/2addr v7, v3

    or-long/2addr v1, v7

    add-int/lit8 v3, v4, 0x1

    aget-byte v4, v0, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x10

    shl-long/2addr v7, v4

    or-long/2addr v1, v7

    add-int/lit8 v4, v3, 0x1

    aget-byte v3, v0, v3

    int-to-long v7, v3

    and-long/2addr v7, v5

    const/16 v3, 0x8

    shl-long/2addr v7, v3

    or-long/2addr v1, v7

    add-int/lit8 v3, v4, 0x1

    iput v3, p0, Lt8/e0;->b:I

    aget-byte v0, v0, v4

    int-to-long v3, v0

    and-long/2addr v3, v5

    or-long v0, v1, v3

    return-wide v0
.end method

.method public B()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lt8/e0;->n(C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public C(I)Ljava/lang/String;
    .locals 3

    if-nez p1, :cond_0

    const-string p1, ""

    return-object p1

    :cond_0
    iget v0, p0, Lt8/e0;->b:I

    add-int v1, v0, p1

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Lt8/e0;->c:I

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lt8/e0;->a:[B

    aget-byte v1, v2, v1

    if-nez v1, :cond_1

    add-int/lit8 v1, p1, -0x1

    goto :goto_0

    :cond_1
    move v1, p1

    :goto_0
    iget-object v2, p0, Lt8/e0;->a:[B

    invoke-static {v2, v0, v1}, Lt8/r0;->E([BII)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lt8/e0;->b:I

    add-int/2addr v1, p1

    iput v1, p0, Lt8/e0;->b:I

    return-object v0
.end method

.method public D()S
    .locals 4

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lt8/e0;->b:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    int-to-short v0, v0

    return v0
.end method

.method public E(I)Ljava/lang/String;
    .locals 1

    sget-object v0, Leb/e;->c:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p1, v0}, Lt8/e0;->F(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public F(ILjava/nio/charset/Charset;)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lt8/e0;->a:[B

    iget v2, p0, Lt8/e0;->b:I

    invoke-direct {v0, v1, v2, p1, p2}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    iget p2, p0, Lt8/e0;->b:I

    add-int/2addr p2, p1

    iput p2, p0, Lt8/e0;->b:I

    return-object v0
.end method

.method public G()I
    .locals 4

    invoke-virtual {p0}, Lt8/e0;->H()I

    move-result v0

    invoke-virtual {p0}, Lt8/e0;->H()I

    move-result v1

    invoke-virtual {p0}, Lt8/e0;->H()I

    move-result v2

    invoke-virtual {p0}, Lt8/e0;->H()I

    move-result v3

    shl-int/lit8 v0, v0, 0x15

    shl-int/lit8 v1, v1, 0xe

    or-int/2addr v0, v1

    shl-int/lit8 v1, v2, 0x7

    or-int/2addr v0, v1

    or-int/2addr v0, v3

    return v0
.end method

.method public H()I
    .locals 3

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lt8/e0;->b:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public I()I
    .locals 4

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/lit8 v3, v2, 0x1

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    add-int/lit8 v3, v3, 0x2

    iput v3, p0, Lt8/e0;->b:I

    return v0
.end method

.method public J()J
    .locals 9

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v0, v1

    int-to-long v3, v1

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    const/16 v1, 0x18

    shl-long/2addr v3, v1

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, v0, v2

    int-to-long v7, v2

    and-long/2addr v7, v5

    const/16 v2, 0x10

    shl-long/2addr v7, v2

    or-long v2, v3, v7

    add-int/lit8 v4, v1, 0x1

    aget-byte v1, v0, v1

    int-to-long v7, v1

    and-long/2addr v7, v5

    const/16 v1, 0x8

    shl-long/2addr v7, v1

    or-long v1, v2, v7

    add-int/lit8 v3, v4, 0x1

    iput v3, p0, Lt8/e0;->b:I

    aget-byte v0, v0, v4

    int-to-long v3, v0

    and-long/2addr v3, v5

    or-long v0, v1, v3

    return-wide v0
.end method

.method public K()I
    .locals 4

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x10

    add-int/lit8 v3, v2, 0x1

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    add-int/lit8 v2, v3, 0x1

    iput v2, p0, Lt8/e0;->b:I

    aget-byte v0, v0, v3

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    return v0
.end method

.method public L()I
    .locals 4

    invoke-virtual {p0}, Lt8/e0;->q()I

    move-result v0

    if-ltz v0, :cond_0

    return v0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Top bit not zero: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public M()J
    .locals 5

    invoke-virtual {p0}, Lt8/e0;->A()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-ltz v2, :cond_0

    return-wide v0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Top bit not zero: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public N()I
    .locals 4

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lt8/e0;->b:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    return v0
.end method

.method public O()J
    .locals 11

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    aget-byte v0, v0, v1

    int-to-long v0, v0

    const/4 v2, 0x7

    move v3, v2

    :goto_0
    const/4 v4, 0x6

    const/4 v5, 0x1

    if-ltz v3, :cond_2

    shl-int v6, v5, v3

    int-to-long v7, v6

    and-long/2addr v7, v0

    const-wide/16 v9, 0x0

    cmp-long v7, v7, v9

    if-nez v7, :cond_1

    if-ge v3, v4, :cond_0

    sub-int/2addr v6, v5

    int-to-long v6, v6

    and-long/2addr v0, v6

    sub-int/2addr v2, v3

    goto :goto_1

    :cond_0
    if-ne v3, v2, :cond_2

    move v2, v5

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_5

    :goto_2
    if-ge v5, v2, :cond_4

    iget-object v3, p0, Lt8/e0;->a:[B

    iget v6, p0, Lt8/e0;->b:I

    add-int/2addr v6, v5

    aget-byte v3, v3, v6

    and-int/lit16 v6, v3, 0xc0

    const/16 v7, 0x80

    if-ne v6, v7, :cond_3

    shl-long/2addr v0, v4

    and-int/lit8 v3, v3, 0x3f

    int-to-long v6, v3

    or-long/2addr v0, v6

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    new-instance v2, Ljava/lang/NumberFormatException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid UTF-8 sequence continuation byte: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_4
    iget v3, p0, Lt8/e0;->b:I

    add-int/2addr v3, v2

    iput v3, p0, Lt8/e0;->b:I

    return-wide v0

    :cond_5
    new-instance v2, Ljava/lang/NumberFormatException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Invalid UTF-8 sequence first byte: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public P()Ljava/nio/charset/Charset;
    .locals 7

    invoke-virtual {p0}, Lt8/e0;->a()I

    move-result v0

    const/4 v1, 0x3

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v2, p0, Lt8/e0;->b:I

    aget-byte v3, v0, v2

    const/16 v4, -0x11

    if-ne v3, v4, :cond_0

    add-int/lit8 v3, v2, 0x1

    aget-byte v3, v0, v3

    const/16 v4, -0x45

    if-ne v3, v4, :cond_0

    add-int/lit8 v3, v2, 0x2

    aget-byte v0, v0, v3

    const/16 v3, -0x41

    if-ne v0, v3, :cond_0

    add-int/2addr v2, v1

    iput v2, p0, Lt8/e0;->b:I

    sget-object v0, Leb/e;->c:Ljava/nio/charset/Charset;

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lt8/e0;->a()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v2, p0, Lt8/e0;->b:I

    aget-byte v3, v0, v2

    const/4 v4, -0x1

    const/4 v5, -0x2

    if-ne v3, v5, :cond_1

    add-int/lit8 v6, v2, 0x1

    aget-byte v6, v0, v6

    if-ne v6, v4, :cond_1

    add-int/2addr v2, v1

    iput v2, p0, Lt8/e0;->b:I

    sget-object v0, Leb/e;->d:Ljava/nio/charset/Charset;

    return-object v0

    :cond_1
    if-ne v3, v4, :cond_2

    add-int/lit8 v3, v2, 0x1

    aget-byte v0, v0, v3

    if-ne v0, v5, :cond_2

    add-int/2addr v2, v1

    iput v2, p0, Lt8/e0;->b:I

    sget-object v0, Leb/e;->e:Ljava/nio/charset/Charset;

    return-object v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method public Q(I)V
    .locals 1

    invoke-virtual {p0}, Lt8/e0;->b()I

    move-result v0

    if-ge v0, p1, :cond_0

    new-array v0, p1, [B

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt8/e0;->a:[B

    :goto_0
    invoke-virtual {p0, v0, p1}, Lt8/e0;->S([BI)V

    return-void
.end method

.method public R([B)V
    .locals 1

    array-length v0, p1

    invoke-virtual {p0, p1, v0}, Lt8/e0;->S([BI)V

    return-void
.end method

.method public S([BI)V
    .locals 0

    iput-object p1, p0, Lt8/e0;->a:[B

    iput p2, p0, Lt8/e0;->c:I

    const/4 p1, 0x0

    iput p1, p0, Lt8/e0;->b:I

    return-void
.end method

.method public T(I)V
    .locals 1

    if-ltz p1, :cond_0

    iget-object v0, p0, Lt8/e0;->a:[B

    array-length v0, v0

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->a(Z)V

    iput p1, p0, Lt8/e0;->c:I

    return-void
.end method

.method public U(I)V
    .locals 1

    if-ltz p1, :cond_0

    iget v0, p0, Lt8/e0;->c:I

    if-gt p1, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->a(Z)V

    iput p1, p0, Lt8/e0;->b:I

    return-void
.end method

.method public V(I)V
    .locals 1

    iget v0, p0, Lt8/e0;->b:I

    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Lt8/e0;->U(I)V

    return-void
.end method

.method public a()I
    .locals 2

    iget v0, p0, Lt8/e0;->c:I

    iget v1, p0, Lt8/e0;->b:I

    sub-int/2addr v0, v1

    return v0
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lt8/e0;->a:[B

    array-length v0, v0

    return v0
.end method

.method public c(I)V
    .locals 1

    invoke-virtual {p0}, Lt8/e0;->b()I

    move-result v0

    if-le p1, v0, :cond_0

    iget-object v0, p0, Lt8/e0;->a:[B

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lt8/e0;->a:[B

    :cond_0
    return-void
.end method

.method public e()[B
    .locals 1

    iget-object v0, p0, Lt8/e0;->a:[B

    return-object v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lt8/e0;->b:I

    return v0
.end method

.method public g()I
    .locals 1

    iget v0, p0, Lt8/e0;->c:I

    return v0
.end method

.method public h(Ljava/nio/charset/Charset;)C
    .locals 3

    sget-object v0, Lt8/e0;->f:Lcom/google/common/collect/a0;

    invoke-virtual {v0, p1}, Lcom/google/common/collect/u;->contains(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported charset: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lt8/a;->b(ZLjava/lang/Object;)V

    invoke-direct {p0, p1}, Lt8/e0;->i(Ljava/nio/charset/Charset;)I

    move-result p1

    shr-int/lit8 p1, p1, 0x10

    int-to-char p1, p1

    return p1
.end method

.method public j()I
    .locals 2

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public k(Lt8/d0;I)V
    .locals 2

    iget-object v0, p1, Lt8/d0;->a:[B

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, p2}, Lt8/e0;->l([BII)V

    invoke-virtual {p1, v1}, Lt8/d0;->p(I)V

    return-void
.end method

.method public l([BII)V
    .locals 2

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lt8/e0;->b:I

    add-int/2addr p1, p3

    iput p1, p0, Lt8/e0;->b:I

    return-void
.end method

.method public n(C)Ljava/lang/String;
    .locals 3

    invoke-virtual {p0}, Lt8/e0;->a()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget v0, p0, Lt8/e0;->b:I

    :goto_0
    iget v1, p0, Lt8/e0;->c:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lt8/e0;->a:[B

    aget-byte v1, v1, v0

    if-eq v1, p1, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    sub-int v2, v0, v1

    invoke-static {p1, v1, v2}, Lt8/r0;->E([BII)Ljava/lang/String;

    move-result-object p1

    iput v0, p0, Lt8/e0;->b:I

    iget v1, p0, Lt8/e0;->c:I

    if-ge v0, v1, :cond_2

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lt8/e0;->b:I

    :cond_2
    return-object p1
.end method

.method public o()D
    .locals 2

    invoke-virtual {p0}, Lt8/e0;->A()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v0

    return-wide v0
.end method

.method public p()F
    .locals 1

    invoke-virtual {p0}, Lt8/e0;->q()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    return v0
.end method

.method public q()I
    .locals 4

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    add-int/lit8 v3, v2, 0x1

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x10

    or-int/2addr v1, v2

    add-int/lit8 v2, v3, 0x1

    aget-byte v3, v0, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x8

    or-int/2addr v1, v3

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lt8/e0;->b:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    return v0
.end method

.method public r()I
    .locals 4

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x18

    shr-int/lit8 v1, v1, 0x8

    add-int/lit8 v3, v2, 0x1

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    add-int/lit8 v2, v3, 0x1

    iput v2, p0, Lt8/e0;->b:I

    aget-byte v0, v0, v3

    and-int/lit16 v0, v0, 0xff

    or-int/2addr v0, v1

    return v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    sget-object v0, Leb/e;->c:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, Lt8/e0;->t(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public t(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 3

    sget-object v0, Lt8/e0;->f:Lcom/google/common/collect/a0;

    invoke-virtual {v0, p1}, Lcom/google/common/collect/u;->contains(Ljava/lang/Object;)Z

    move-result v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unsupported charset: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lt8/a;->b(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lt8/e0;->a()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v0, Leb/e;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lt8/e0;->P()Ljava/nio/charset/Charset;

    :cond_1
    invoke-direct {p0, p1}, Lt8/e0;->d(Ljava/nio/charset/Charset;)I

    move-result v0

    iget v1, p0, Lt8/e0;->b:I

    sub-int/2addr v0, v1

    invoke-virtual {p0, v0, p1}, Lt8/e0;->F(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    iget v1, p0, Lt8/e0;->b:I

    iget v2, p0, Lt8/e0;->c:I

    if-ne v1, v2, :cond_2

    return-object v0

    :cond_2
    invoke-direct {p0, p1}, Lt8/e0;->W(Ljava/nio/charset/Charset;)V

    return-object v0
.end method

.method public u()I
    .locals 4

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v3, v2, 0x1

    aget-byte v2, v0, v2

    and-int/lit16 v2, v2, 0xff

    shl-int/lit8 v2, v2, 0x8

    or-int/2addr v1, v2

    add-int/lit8 v2, v3, 0x1

    aget-byte v3, v0, v3

    and-int/lit16 v3, v3, 0xff

    shl-int/lit8 v3, v3, 0x10

    or-int/2addr v1, v3

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lt8/e0;->b:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x18

    or-int/2addr v0, v1

    return v0
.end method

.method public v()J
    .locals 9

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v0, v1

    int-to-long v3, v1

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, v0, v2

    int-to-long v7, v2

    and-long/2addr v7, v5

    const/16 v2, 0x8

    shl-long/2addr v7, v2

    or-long v2, v3, v7

    add-int/lit8 v4, v1, 0x1

    aget-byte v1, v0, v1

    int-to-long v7, v1

    and-long/2addr v7, v5

    const/16 v1, 0x10

    shl-long/2addr v7, v1

    or-long v1, v2, v7

    add-int/lit8 v3, v4, 0x1

    aget-byte v4, v0, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x18

    shl-long/2addr v7, v4

    or-long/2addr v1, v7

    add-int/lit8 v4, v3, 0x1

    aget-byte v3, v0, v3

    int-to-long v7, v3

    and-long/2addr v7, v5

    const/16 v3, 0x20

    shl-long/2addr v7, v3

    or-long/2addr v1, v7

    add-int/lit8 v3, v4, 0x1

    aget-byte v4, v0, v4

    int-to-long v7, v4

    and-long/2addr v7, v5

    const/16 v4, 0x28

    shl-long/2addr v7, v4

    or-long/2addr v1, v7

    add-int/lit8 v4, v3, 0x1

    aget-byte v3, v0, v3

    int-to-long v7, v3

    and-long/2addr v7, v5

    const/16 v3, 0x30

    shl-long/2addr v7, v3

    or-long/2addr v1, v7

    add-int/lit8 v3, v4, 0x1

    iput v3, p0, Lt8/e0;->b:I

    aget-byte v0, v0, v4

    int-to-long v3, v0

    and-long/2addr v3, v5

    const/16 v0, 0x38

    shl-long/2addr v3, v0

    or-long v0, v1, v3

    return-wide v0
.end method

.method public w()S
    .locals 4

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lt8/e0;->b:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v1

    int-to-short v0, v0

    return v0
.end method

.method public x()J
    .locals 9

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v0, v1

    int-to-long v3, v1

    const-wide/16 v5, 0xff

    and-long/2addr v3, v5

    add-int/lit8 v1, v2, 0x1

    aget-byte v2, v0, v2

    int-to-long v7, v2

    and-long/2addr v7, v5

    const/16 v2, 0x8

    shl-long/2addr v7, v2

    or-long v2, v3, v7

    add-int/lit8 v4, v1, 0x1

    aget-byte v1, v0, v1

    int-to-long v7, v1

    and-long/2addr v7, v5

    const/16 v1, 0x10

    shl-long/2addr v7, v1

    or-long v1, v2, v7

    add-int/lit8 v3, v4, 0x1

    iput v3, p0, Lt8/e0;->b:I

    aget-byte v0, v0, v4

    int-to-long v3, v0

    and-long/2addr v3, v5

    const/16 v0, 0x18

    shl-long/2addr v3, v0

    or-long v0, v1, v3

    return-wide v0
.end method

.method public y()I
    .locals 4

    invoke-virtual {p0}, Lt8/e0;->u()I

    move-result v0

    if-ltz v0, :cond_0

    return v0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Top bit not zero: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public z()I
    .locals 4

    iget-object v0, p0, Lt8/e0;->a:[B

    iget v1, p0, Lt8/e0;->b:I

    add-int/lit8 v2, v1, 0x1

    aget-byte v1, v0, v1

    and-int/lit16 v1, v1, 0xff

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lt8/e0;->b:I

    aget-byte v0, v0, v2

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    or-int/2addr v0, v1

    return v0
.end method
