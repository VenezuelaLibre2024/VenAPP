.class final Lbh/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbh/g$b;
    }
.end annotation


# static fields
.field private static final a:[B

.field private static final b:[B

.field private static final c:[B

.field private static final d:[B

.field private static final e:Ljava/nio/charset/Charset;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const/16 v0, 0x1e

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    sput-object v1, Lbh/g;->a:[B

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    sput-object v0, Lbh/g;->b:[B

    const/16 v0, 0x80

    new-array v1, v0, [B

    sput-object v1, Lbh/g;->c:[B

    new-array v0, v0, [B

    sput-object v0, Lbh/g;->d:[B

    sget-object v0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    sput-object v0, Lbh/g;->e:Ljava/nio/charset/Charset;

    const/4 v0, -0x1

    invoke-static {v1, v0}, Ljava/util/Arrays;->fill([BB)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    sget-object v3, Lbh/g;->a:[B

    array-length v4, v3

    if-ge v2, v4, :cond_1

    aget-byte v3, v3, v2

    if-lez v3, :cond_0

    sget-object v4, Lbh/g;->c:[B

    int-to-byte v5, v2

    aput-byte v5, v4, v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    sget-object v2, Lbh/g;->d:[B

    invoke-static {v2, v0}, Ljava/util/Arrays;->fill([BB)V

    :goto_1
    sget-object v0, Lbh/g;->b:[B

    array-length v2, v0

    if-ge v1, v2, :cond_3

    aget-byte v0, v0, v1

    if-lez v0, :cond_2

    sget-object v2, Lbh/g;->d:[B

    int-to-byte v3, v1

    aput-byte v3, v2, v0

    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_3
    return-void

    :array_0
    .array-data 1
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x26t
        0xdt
        0x9t
        0x2ct
        0x3at
        0x23t
        0x2dt
        0x2et
        0x24t
        0x2ft
        0x2bt
        0x25t
        0x2at
        0x3dt
        0x5et
        0x0t
        0x20t
        0x0t
        0x0t
        0x0t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x3bt
        0x3ct
        0x3et
        0x40t
        0x5bt
        0x5ct
        0x5dt
        0x5ft
        0x60t
        0x7et
        0x21t
        0xdt
        0x9t
        0x2ct
        0x3at
        0xat
        0x2dt
        0x2et
        0x24t
        0x2ft
        0x22t
        0x7ct
        0x2at
        0x28t
        0x29t
        0x3ft
        0x7bt
        0x7dt
        0x27t
        0x0t
    .end array-data
.end method

.method private static a(Lkg/i;ILjava/nio/charset/Charset;)I
    .locals 6

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/nio/charset/Charset;->newEncoder()Ljava/nio/charset/CharsetEncoder;

    move-result-object p2

    :goto_0
    invoke-interface {p0}, Lkg/i;->length()I

    move-result v0

    move v1, p1

    :goto_1
    if-ge v1, v0, :cond_6

    const/4 v2, 0x0

    move v3, v1

    :cond_1
    const/16 v4, 0xd

    if-ge v2, v4, :cond_2

    invoke-interface {p0, v3}, Lkg/i;->a(I)Z

    move-result v5

    if-nez v5, :cond_2

    invoke-interface {p0, v3}, Lkg/i;->charAt(I)C

    move-result v3

    invoke-static {v3}, Lbh/g;->l(C)Z

    move-result v3

    if-eqz v3, :cond_2

    add-int/lit8 v2, v2, 0x1

    add-int v3, v1, v2

    if-lt v3, v0, :cond_1

    :cond_2
    if-lt v2, v4, :cond_3

    sub-int/2addr v1, p1

    return v1

    :cond_3
    if-eqz p2, :cond_5

    invoke-interface {p0, v1}, Lkg/i;->charAt(I)C

    move-result v2

    invoke-virtual {p2, v2}, Ljava/nio/charset/CharsetEncoder;->canEncode(C)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-interface {p0, v1}, Lkg/i;->charAt(I)C

    move-result p0

    new-instance p1, Ldg/v;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Non-encodable character detected: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, " (Unicode: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ldg/v;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    sub-int/2addr v1, p1

    return v1
.end method

.method private static b(Lkg/i;I)I
    .locals 3

    invoke-interface {p0}, Lkg/i;->length()I

    move-result v0

    const/4 v1, 0x0

    if-ge p1, v0, :cond_0

    :goto_0
    if-ge p1, v0, :cond_0

    invoke-interface {p0, p1}, Lkg/i;->a(I)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {p0, p1}, Lkg/i;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lbh/g;->l(C)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method

.method private static c(Lkg/i;I)I
    .locals 5

    invoke-interface {p0}, Lkg/i;->length()I

    move-result v0

    move v1, p1

    :goto_0
    if-ge v1, v0, :cond_4

    const/4 v2, 0x0

    :goto_1
    const/16 v3, 0xd

    if-ge v2, v3, :cond_0

    if-ge v1, v0, :cond_0

    invoke-interface {p0, v1}, Lkg/i;->a(I)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-interface {p0, v1}, Lkg/i;->charAt(I)C

    move-result v4

    invoke-static {v4}, Lbh/g;->l(C)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    if-lt v2, v3, :cond_1

    sub-int/2addr v1, p1

    sub-int/2addr v1, v2

    return v1

    :cond_1
    if-lez v2, :cond_2

    goto :goto_0

    :cond_2
    invoke-interface {p0, v1}, Lkg/i;->a(I)Z

    move-result v2

    if-nez v2, :cond_4

    invoke-interface {p0, v1}, Lkg/i;->charAt(I)C

    move-result v2

    invoke-static {v2}, Lbh/g;->o(C)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    sub-int/2addr v1, p1

    return v1
.end method

.method private static d([BIIILjava/lang/StringBuilder;)V
    .locals 10

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    if-nez p3, :cond_0

    const/16 p3, 0x391

    goto :goto_0

    :cond_0
    rem-int/lit8 p3, p2, 0x6

    if-nez p3, :cond_1

    const/16 p3, 0x39c

    goto :goto_0

    :cond_1
    const/16 p3, 0x385

    :goto_0
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 p3, 0x6

    if-lt p2, p3, :cond_5

    const/4 v0, 0x5

    new-array v1, v0, [C

    move v2, p1

    :goto_1
    add-int v3, p1, p2

    sub-int/2addr v3, v2

    if-lt v3, p3, :cond_6

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    move v6, v3

    :goto_2
    if-ge v6, p3, :cond_2

    const/16 v7, 0x8

    shl-long/2addr v4, v7

    add-int v7, v2, v6

    aget-byte v7, p0, v7

    and-int/lit16 v7, v7, 0xff

    int-to-long v7, v7

    add-long/2addr v4, v7

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    :goto_3
    if-ge v3, v0, :cond_3

    const-wide/16 v6, 0x384

    rem-long v8, v4, v6

    long-to-int v8, v8

    int-to-char v8, v8

    aput-char v8, v1, v3

    div-long/2addr v4, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_3
    const/4 v3, 0x4

    :goto_4
    if-ltz v3, :cond_4

    aget-char v4, v1, v3

    invoke-virtual {p4, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, -0x1

    goto :goto_4

    :cond_4
    add-int/lit8 v2, v2, 0x6

    goto :goto_1

    :cond_5
    move v2, p1

    :cond_6
    :goto_5
    add-int p3, p1, p2

    if-ge v2, p3, :cond_7

    aget-byte p3, p0, v2

    and-int/lit16 p3, p3, 0xff

    int-to-char p3, p3

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_7
    return-void
.end method

.method static e(Ljava/lang/String;Lbh/c;Ljava/nio/charset/Charset;Z)Ljava/lang/String;
    .locals 12

    const/4 v0, 0x0

    if-nez p2, :cond_1

    if-nez p3, :cond_1

    move v1, v0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0xff

    if-gt v2, v3, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ldg/v;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Non-encodable character detected: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p3, " (Unicode: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "). Consider specifying EncodeHintType.PDF417_AUTO_ECI and/or EncodeTypeHint.CHARACTER_SET."

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ldg/v;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v2, 0x0

    if-eqz p3, :cond_2

    new-instance v3, Lkg/n;

    const/4 v4, -0x1

    invoke-direct {v3, p0, p2, v4}, Lkg/n;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;I)V

    goto :goto_1

    :cond_2
    new-instance v3, Lbh/g$b;

    invoke-direct {v3, p0, v2}, Lbh/g$b;-><init>(Ljava/lang/String;Lbh/g$a;)V

    if-nez p2, :cond_3

    sget-object p2, Lbh/g;->e:Ljava/nio/charset/Charset;

    goto :goto_1

    :cond_3
    sget-object p0, Lbh/g;->e:Ljava/nio/charset/Charset;

    invoke-virtual {p0, p2}, Ljava/nio/charset/Charset;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_4

    invoke-static {p2}, Lkg/d;->b(Ljava/nio/charset/Charset;)Lkg/d;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-virtual {p0}, Lkg/d;->m()I

    move-result p0

    invoke-static {p0, v1}, Lbh/g;->i(ILjava/lang/StringBuilder;)V

    :cond_4
    :goto_1
    invoke-interface {v3}, Lkg/i;->length()I

    move-result p0

    sget-object v4, Lbh/g$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v4, p1

    const/4 v4, 0x1

    if-eq p1, v4, :cond_16

    const/4 v5, 0x2

    if-eq p1, v5, :cond_14

    const/4 v6, 0x3

    const/16 v7, 0x386

    if-eq p1, v6, :cond_13

    move p1, v0

    move v6, p1

    move v8, v6

    :goto_2
    if-ge p1, p0, :cond_17

    :goto_3
    if-ge p1, p0, :cond_5

    invoke-interface {v3, p1}, Lkg/i;->a(I)Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-interface {v3, p1}, Lkg/i;->b(I)I

    move-result v9

    invoke-static {v9, v1}, Lbh/g;->i(ILjava/lang/StringBuilder;)V

    add-int/lit8 p1, p1, 0x1

    goto :goto_3

    :cond_5
    if-lt p1, p0, :cond_6

    goto/16 :goto_9

    :cond_6
    invoke-static {v3, p1}, Lbh/g;->b(Lkg/i;I)I

    move-result v9

    const/16 v10, 0xd

    if-lt v9, v10, :cond_7

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v3, p1, v9, v1}, Lbh/g;->g(Lkg/i;IILjava/lang/StringBuilder;)V

    add-int/2addr p1, v9

    move v6, v0

    move v8, v5

    goto :goto_2

    :cond_7
    invoke-static {v3, p1}, Lbh/g;->c(Lkg/i;I)I

    move-result v10

    const/4 v11, 0x5

    if-ge v10, v11, :cond_11

    if-ne v9, p0, :cond_8

    goto :goto_8

    :cond_8
    if-eqz p3, :cond_9

    move-object v9, v2

    goto :goto_4

    :cond_9
    move-object v9, p2

    :goto_4
    invoke-static {v3, p1, v9}, Lbh/g;->a(Lkg/i;ILjava/nio/charset/Charset;)I

    move-result v9

    if-nez v9, :cond_a

    move v9, v4

    :cond_a
    if-eqz p3, :cond_b

    move-object v10, v2

    goto :goto_5

    :cond_b
    add-int v10, p1, v9

    invoke-interface {v3, p1, v10}, Lkg/i;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v10

    invoke-interface {v10}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v10

    :goto_5
    if-nez v10, :cond_c

    if-eq v9, v4, :cond_d

    :cond_c
    if-eqz v10, :cond_f

    array-length v11, v10

    if-ne v11, v4, :cond_f

    :cond_d
    if-nez v8, :cond_f

    if-eqz p3, :cond_e

    invoke-static {v3, p1, v4, v0, v1}, Lbh/g;->f(Lkg/i;IIILjava/lang/StringBuilder;)V

    goto :goto_7

    :cond_e
    invoke-static {v10, v0, v4, v0, v1}, Lbh/g;->d([BIIILjava/lang/StringBuilder;)V

    goto :goto_7

    :cond_f
    if-eqz p3, :cond_10

    add-int v6, p1, v9

    invoke-static {v3, p1, v6, v8, v1}, Lbh/g;->f(Lkg/i;IIILjava/lang/StringBuilder;)V

    goto :goto_6

    :cond_10
    array-length v6, v10

    invoke-static {v10, v0, v6, v8, v1}, Lbh/g;->d([BIIILjava/lang/StringBuilder;)V

    :goto_6
    move v6, v0

    move v8, v4

    :goto_7
    add-int/2addr p1, v9

    goto :goto_2

    :cond_11
    :goto_8
    if-eqz v8, :cond_12

    const/16 v6, 0x384

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v6, v0

    move v8, v6

    :cond_12
    invoke-static {v3, p1, v10, v1, v6}, Lbh/g;->h(Lkg/i;IILjava/lang/StringBuilder;I)I

    move-result v6

    add-int/2addr p1, v10

    goto/16 :goto_2

    :cond_13
    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v3, v0, p0, v1}, Lbh/g;->g(Lkg/i;IILjava/lang/StringBuilder;)V

    goto :goto_9

    :cond_14
    if-eqz p3, :cond_15

    invoke-interface {v3}, Lkg/i;->length()I

    move-result p0

    invoke-static {v3, v0, p0, v0, v1}, Lbh/g;->f(Lkg/i;IIILjava/lang/StringBuilder;)V

    goto :goto_9

    :cond_15
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    array-length p1, p0

    invoke-static {p0, v0, p1, v4, v1}, Lbh/g;->d([BIIILjava/lang/StringBuilder;)V

    goto :goto_9

    :cond_16
    invoke-static {v3, v0, p0, v1, v0}, Lbh/g;->h(Lkg/i;IILjava/lang/StringBuilder;I)I

    :cond_17
    :goto_9
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static f(Lkg/i;IIILjava/lang/StringBuilder;)V
    .locals 5

    add-int/2addr p2, p1

    invoke-interface {p0}, Lkg/i;->length()I

    move-result v0

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    move v0, p1

    :goto_0
    if-ge v0, p2, :cond_0

    invoke-interface {p0, v0}, Lkg/i;->a(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0, v0}, Lkg/i;->b(I)I

    move-result v1

    invoke-static {v1, p4}, Lbh/g;->i(ILjava/lang/StringBuilder;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_1
    if-ge v1, p2, :cond_1

    invoke-interface {p0, v1}, Lkg/i;->a(I)Z

    move-result v2

    if-nez v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    sub-int v2, v1, v0

    if-gtz v2, :cond_2

    return-void

    :cond_2
    invoke-static {p0, v0, v1}, Lbh/g;->p(Lkg/i;II)[B

    move-result-object v3

    if-ne v0, p1, :cond_3

    move v0, p3

    goto :goto_2

    :cond_3
    const/4 v0, 0x1

    :goto_2
    const/4 v4, 0x0

    invoke-static {v3, v4, v2, v0, p4}, Lbh/g;->d([BIIILjava/lang/StringBuilder;)V

    move v0, v1

    goto :goto_0
.end method

.method private static g(Lkg/i;IILjava/lang/StringBuilder;)V
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    div-int/lit8 v1, p2, 0x3

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-wide/16 v1, 0x384

    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, p2, :cond_2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    const/16 v5, 0x2c

    sub-int v6, p2, v4

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "1"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int v7, p1, v4

    add-int v8, v7, v5

    invoke-interface {p0, v7, v8}, Lkg/i;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v7, Ljava/math/BigInteger;

    invoke-direct {v7, v6}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v7, v1}, Ljava/math/BigInteger;->mod(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v6

    invoke-virtual {v6}, Ljava/math/BigInteger;->intValue()I

    move-result v6

    int-to-char v6, v6

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v7

    invoke-virtual {v7, v2}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    :goto_1
    if-ltz v6, :cond_1

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v7

    invoke-virtual {p3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v6, v6, -0x1

    goto :goto_1

    :cond_1
    add-int/2addr v4, v5

    goto :goto_0

    :cond_2
    return-void
.end method

.method private static h(Lkg/i;IILjava/lang/StringBuilder;I)I
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p3

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/4 v4, 0x0

    move/from16 v5, p4

    move v6, v4

    :cond_0
    :goto_0
    add-int v7, p1, v6

    invoke-interface {v0, v7}, Lkg/i;->a(I)Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {v0, v7}, Lkg/i;->b(I)I

    move-result v7

    invoke-static {v7, v2}, Lbh/g;->i(ILjava/lang/StringBuilder;)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    invoke-interface {v0, v7}, Lkg/i;->charAt(I)C

    move-result v8

    const/16 v9, 0x1a

    const/16 v10, 0x20

    const/16 v11, 0x1c

    const/16 v12, 0x1b

    const/16 v13, 0x1d

    const/4 v14, 0x2

    const/4 v15, 0x1

    if-eqz v5, :cond_d

    if-eq v5, v15, :cond_8

    if-eq v5, v14, :cond_3

    invoke-static {v8}, Lbh/g;->n(C)Z

    move-result v7

    if-eqz v7, :cond_2

    sget-object v7, Lbh/g;->d:[B

    aget-byte v7, v7, v8

    goto :goto_2

    :cond_2
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :goto_1
    move v5, v4

    goto :goto_0

    :cond_3
    invoke-static {v8}, Lbh/g;->m(C)Z

    move-result v9

    if-eqz v9, :cond_4

    sget-object v7, Lbh/g;->c:[B

    aget-byte v7, v7, v8

    :goto_2
    int-to-char v7, v7

    :goto_3
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_9

    :cond_4
    invoke-static {v8}, Lbh/g;->k(C)Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_5
    invoke-static {v8}, Lbh/g;->j(C)Z

    move-result v9

    if-eqz v9, :cond_6

    goto :goto_7

    :cond_6
    add-int/lit8 v7, v7, 0x1

    if-ge v7, v1, :cond_7

    invoke-interface {v0, v7}, Lkg/i;->a(I)Z

    move-result v9

    if-nez v9, :cond_7

    invoke-interface {v0, v7}, Lkg/i;->charAt(I)C

    move-result v7

    invoke-static {v7}, Lbh/g;->n(C)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v5, 0x19

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/4 v5, 0x3

    goto :goto_0

    :cond_7
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v7, Lbh/g;->d:[B

    aget-byte v7, v7, v8

    goto :goto_2

    :cond_8
    invoke-static {v8}, Lbh/g;->j(C)Z

    move-result v7

    if-eqz v7, :cond_a

    if-ne v8, v10, :cond_9

    goto :goto_4

    :cond_9
    add-int/lit8 v8, v8, -0x61

    goto :goto_6

    :cond_a
    invoke-static {v8}, Lbh/g;->k(C)Z

    move-result v7

    if-eqz v7, :cond_b

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_5

    :cond_b
    invoke-static {v8}, Lbh/g;->m(C)Z

    move-result v7

    if-eqz v7, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v7, Lbh/g;->d:[B

    aget-byte v7, v7, v8

    goto :goto_2

    :cond_d
    invoke-static {v8}, Lbh/g;->k(C)Z

    move-result v7

    if-eqz v7, :cond_f

    if-ne v8, v10, :cond_e

    :goto_4
    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_9

    :cond_e
    :goto_5
    add-int/lit8 v8, v8, -0x41

    :goto_6
    int-to-char v7, v8

    goto :goto_3

    :cond_f
    invoke-static {v8}, Lbh/g;->j(C)Z

    move-result v7

    if-eqz v7, :cond_10

    :goto_7
    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v5, v15

    goto/16 :goto_0

    :cond_10
    invoke-static {v8}, Lbh/g;->m(C)Z

    move-result v7

    if-eqz v7, :cond_11

    :goto_8
    invoke-virtual {v3, v11}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v5, v14

    goto/16 :goto_0

    :cond_11
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object v7, Lbh/g;->d:[B

    aget-byte v7, v7, v8

    goto/16 :goto_2

    :goto_9
    add-int/lit8 v6, v6, 0x1

    if-lt v6, v1, :cond_0

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    move v1, v4

    move v6, v1

    :goto_a
    if-ge v1, v0, :cond_14

    rem-int/lit8 v7, v1, 0x2

    if-eqz v7, :cond_12

    move v7, v15

    goto :goto_b

    :cond_12
    move v7, v4

    :goto_b
    if-eqz v7, :cond_13

    mul-int/lit8 v6, v6, 0x1e

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v7

    add-int/2addr v6, v7

    int-to-char v6, v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_c

    :cond_13
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result v6

    :goto_c
    add-int/lit8 v1, v1, 0x1

    goto :goto_a

    :cond_14
    rem-int/2addr v0, v14

    if-eqz v0, :cond_15

    mul-int/lit8 v6, v6, 0x1e

    add-int/2addr v6, v13

    int-to-char v0, v6

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_15
    return v5
.end method

.method private static i(ILjava/lang/StringBuilder;)V
    .locals 2

    const/16 v0, 0x384

    if-ltz p0, :cond_0

    if-ge p0, v0, :cond_0

    const/16 v0, 0x39f

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    const v1, 0xc5f94

    if-ge p0, v1, :cond_1

    const/16 v1, 0x39e

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    div-int/lit16 v1, p0, 0x384

    add-int/lit8 v1, v1, -0x1

    int-to-char v1, v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    rem-int/2addr p0, v0

    :goto_0
    int-to-char p0, p0

    :goto_1
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    const v0, 0xc6318

    if-ge p0, v0, :cond_2

    const/16 v0, 0x39d

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sub-int/2addr v1, p0

    int-to-char p0, v1

    goto :goto_1

    :goto_2
    return-void

    :cond_2
    new-instance p1, Ldg/v;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ECI number not in valid range from 0..811799, but was "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ldg/v;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static j(C)Z
    .locals 1

    const/16 v0, 0x20

    if-eq p0, v0, :cond_1

    const/16 v0, 0x61

    if-lt p0, v0, :cond_0

    const/16 v0, 0x7a

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static k(C)Z
    .locals 1

    const/16 v0, 0x20

    if-eq p0, v0, :cond_1

    const/16 v0, 0x41

    if-lt p0, v0, :cond_0

    const/16 v0, 0x5a

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method private static l(C)Z
    .locals 1

    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v0, 0x39

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static m(C)Z
    .locals 1

    sget-object v0, Lbh/g;->c:[B

    aget-byte p0, v0, p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static n(C)Z
    .locals 1

    sget-object v0, Lbh/g;->d:[B

    aget-byte p0, v0, p0

    const/4 v0, -0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static o(C)Z
    .locals 1

    const/16 v0, 0x9

    if-eq p0, v0, :cond_1

    const/16 v0, 0xa

    if-eq p0, v0, :cond_1

    const/16 v0, 0xd

    if-eq p0, v0, :cond_1

    const/16 v0, 0x20

    if-lt p0, v0, :cond_0

    const/16 v0, 0x7e

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method static p(Lkg/i;II)[B
    .locals 4

    sub-int v0, p2, p1

    new-array v0, v0, [B

    move v1, p1

    :goto_0
    if-ge v1, p2, :cond_0

    sub-int v2, v1, p1

    invoke-interface {p0, v1}, Lkg/i;->charAt(I)C

    move-result v3

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method
