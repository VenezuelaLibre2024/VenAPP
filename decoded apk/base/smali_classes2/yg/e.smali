.class final Lyg/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyg/e$b;
    }
.end annotation


# static fields
.field private static final a:[C

.field private static final b:[C

.field private static final c:[Ljava/math/BigInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const-string v0, ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}\'"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lyg/e;->a:[C

    const-string v0, "0123456789&\r\t,:#-.$/+%*=^"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lyg/e;->b:[C

    const/16 v0, 0x10

    new-array v0, v0, [Ljava/math/BigInteger;

    sput-object v0, Lyg/e;->c:[Ljava/math/BigInteger;

    const/4 v1, 0x0

    sget-object v2, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    aput-object v2, v0, v1

    const-wide/16 v1, 0x384

    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const/4 v0, 0x2

    :goto_0
    sget-object v2, Lyg/e;->c:[Ljava/math/BigInteger;

    array-length v3, v2

    if-ge v0, v3, :cond_0

    add-int/lit8 v3, v0, -0x1

    aget-object v3, v2, v3

    invoke-virtual {v3, v1}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    aput-object v3, v2, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private static a(I[IILkg/j;)I
    .locals 11

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    aget v2, p1, v0

    if-ge p2, v2, :cond_a

    if-nez v1, :cond_a

    :goto_1
    aget v2, p1, v0

    const/16 v3, 0x39f

    const/4 v4, 0x1

    if-ge p2, v2, :cond_0

    aget v5, p1, p2

    if-ne v5, v3, :cond_0

    add-int/lit8 p2, p2, 0x1

    aget v2, p1, p2

    invoke-virtual {p3, v2}, Lkg/j;->f(I)V

    add-int/2addr p2, v4

    goto :goto_1

    :cond_0
    if-ge p2, v2, :cond_9

    aget v2, p1, p2

    const/16 v5, 0x384

    if-lt v2, v5, :cond_1

    goto/16 :goto_6

    :cond_1
    const-wide/16 v6, 0x0

    move v2, v0

    :goto_2
    const-wide/16 v8, 0x384

    mul-long/2addr v6, v8

    add-int/lit8 v8, p2, 0x1

    aget p2, p1, p2

    int-to-long v9, p2

    add-long/2addr v6, v9

    add-int/2addr v2, v4

    const/4 p2, 0x5

    if-ge v2, p2, :cond_3

    aget v9, p1, v0

    if-ge v8, v9, :cond_3

    aget v9, p1, v8

    if-lt v9, v5, :cond_2

    goto :goto_3

    :cond_2
    move p2, v8

    goto :goto_2

    :cond_3
    :goto_3
    if-ne v2, p2, :cond_5

    const/16 p2, 0x39c

    if-eq p0, p2, :cond_4

    aget p2, p1, v0

    if-ge v8, p2, :cond_5

    aget p2, p1, v8

    if-ge p2, v5, :cond_5

    :cond_4
    move p2, v0

    :goto_4
    const/4 v2, 0x6

    if-ge p2, v2, :cond_8

    rsub-int/lit8 v2, p2, 0x5

    mul-int/lit8 v2, v2, 0x8

    shr-long v2, v6, v2

    long-to-int v2, v2

    int-to-byte v2, v2

    invoke-virtual {p3, v2}, Lkg/j;->a(B)V

    add-int/lit8 p2, p2, 0x1

    goto :goto_4

    :cond_5
    sub-int/2addr v8, v2

    :goto_5
    aget p2, p1, v0

    if-ge v8, p2, :cond_8

    if-nez v1, :cond_8

    add-int/lit8 p2, v8, 0x1

    aget v2, p1, v8

    if-ge v2, v5, :cond_6

    int-to-byte v2, v2

    invoke-virtual {p3, v2}, Lkg/j;->a(B)V

    move v8, p2

    goto :goto_5

    :cond_6
    if-ne v2, v3, :cond_7

    add-int/lit8 v2, p2, 0x1

    aget p2, p1, p2

    invoke-virtual {p3, p2}, Lkg/j;->f(I)V

    move v8, v2

    goto :goto_5

    :cond_7
    add-int/lit8 p2, p2, -0x1

    move v8, p2

    move v1, v4

    goto :goto_5

    :cond_8
    move p2, v8

    goto/16 :goto_0

    :cond_9
    :goto_6
    move v1, v4

    goto/16 :goto_0

    :cond_a
    return p2
.end method

.method static b([ILjava/lang/String;)Lkg/e;
    .locals 5

    new-instance v0, Lkg/j;

    array-length v1, p0

    mul-int/lit8 v1, v1, 0x2

    invoke-direct {v0, v1}, Lkg/j;-><init>(I)V

    const/4 v1, 0x1

    invoke-static {p0, v1, v0}, Lyg/e;->g([IILkg/j;)I

    move-result v1

    new-instance v2, Lxg/c;

    invoke-direct {v2}, Lxg/c;-><init>()V

    :goto_0
    const/4 v3, 0x0

    aget v3, p0, v3

    if-ge v1, v3, :cond_1

    add-int/lit8 v3, v1, 0x1

    aget v1, p0, v1

    const/16 v4, 0x391

    if-eq v1, v4, :cond_0

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    add-int/lit8 v3, v3, -0x1

    goto :goto_2

    :pswitch_0
    invoke-static {p0, v3, v2}, Lyg/e;->d([IILxg/c;)I

    move-result v1

    goto :goto_0

    :pswitch_1
    add-int/lit8 v1, v3, 0x1

    aget v3, p0, v3

    invoke-virtual {v0, v3}, Lkg/j;->f(I)V

    goto :goto_0

    :pswitch_2
    add-int/lit8 v3, v3, 0x2

    goto :goto_1

    :pswitch_3
    add-int/lit8 v3, v3, 0x1

    :goto_1
    move v1, v3

    goto :goto_0

    :pswitch_4
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :pswitch_5
    invoke-static {p0, v3, v0}, Lyg/e;->f([IILkg/j;)I

    move-result v1

    goto :goto_0

    :pswitch_6
    invoke-static {v1, p0, v3, v0}, Lyg/e;->a(I[IILkg/j;)I

    move-result v1

    goto :goto_0

    :goto_2
    :pswitch_7
    invoke-static {p0, v3, v0}, Lyg/e;->g([IILkg/j;)I

    move-result v1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v3, 0x1

    aget v3, p0, v3

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Lkg/j;->b(C)V

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lkg/j;->h()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-virtual {v2}, Lxg/c;->a()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_2

    goto :goto_3

    :cond_2
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_3
    :goto_3
    new-instance p0, Lkg/e;

    invoke-virtual {v0}, Lkg/j;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, v1, p1}, Lkg/e;-><init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lkg/e;->n(Ljava/lang/Object;)V

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x384
        :pswitch_7
        :pswitch_6
        :pswitch_5
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x39a
        :pswitch_4
        :pswitch_4
        :pswitch_6
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static c([II)Ljava/lang/String;
    .locals 6

    sget-object v0, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    const/4 v3, 0x1

    if-ge v2, p1, :cond_0

    sget-object v4, Lyg/e;->c:[Ljava/math/BigInteger;

    sub-int v5, p1, v2

    sub-int/2addr v5, v3

    aget-object v3, v4, v5

    aget v4, p0, v2

    int-to-long v4, v4

    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v0

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/math/BigInteger;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v0, 0x31

    if-ne p1, v0, :cond_1

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0
.end method

.method static d([IILxg/c;)I
    .locals 8

    add-int/lit8 v0, p1, 0x2

    const/4 v1, 0x0

    aget v2, p0, v1

    if-gt v0, v2, :cond_a

    const/4 v0, 0x2

    new-array v2, v0, [I

    move v3, v1

    :goto_0
    if-ge v3, v0, :cond_0

    aget v4, p0, p1

    aput v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v2, v0}, Lyg/e;->c([II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p2, v1}, Lxg/c;->k(I)V

    goto :goto_1

    :cond_1
    :try_start_0
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p2, v0}, Lxg/c;->k(I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_2
    aget v2, p0, v1

    const/16 v3, 0x39a

    const/16 v4, 0x39b

    const/4 v5, 0x1

    if-ge p1, v2, :cond_2

    array-length v2, p0

    if-ge p1, v2, :cond_2

    aget v2, p0, p1

    if-eq v2, v3, :cond_2

    if-eq v2, v4, :cond_2

    new-array v3, v5, [Ljava/lang/Object;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v3, v1

    const-string v2, "%03d"

    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    if-eqz v2, :cond_9

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lxg/c;->e(Ljava/lang/String;)V

    aget v0, p0, p1

    const/4 v2, -0x1

    if-ne v0, v4, :cond_3

    add-int/lit8 v0, p1, 0x1

    goto :goto_3

    :cond_3
    move v0, v2

    :goto_3
    aget v6, p0, v1

    if-ge p1, v6, :cond_6

    aget v6, p0, p1

    if-eq v6, v3, :cond_5

    if-ne v6, v4, :cond_4

    add-int/lit8 p1, p1, 0x1

    aget v6, p0, p1

    packed-switch v6, :pswitch_data_0

    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :pswitch_0
    new-instance v6, Lkg/j;

    invoke-direct {v6}, Lkg/j;-><init>()V

    add-int/lit8 p1, p1, 0x1

    invoke-static {p0, p1, v6}, Lyg/e;->f([IILkg/j;)I

    move-result p1

    invoke-virtual {v6}, Lkg/j;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {p2, v6}, Lxg/c;->d(I)V

    goto :goto_3

    :pswitch_1
    new-instance v6, Lkg/j;

    invoke-direct {v6}, Lkg/j;-><init>()V

    add-int/lit8 p1, p1, 0x1

    invoke-static {p0, p1, v6}, Lyg/e;->f([IILkg/j;)I

    move-result p1

    invoke-virtual {v6}, Lkg/j;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    invoke-virtual {p2, v6, v7}, Lxg/c;->g(J)V

    goto :goto_3

    :pswitch_2
    new-instance v6, Lkg/j;

    invoke-direct {v6}, Lkg/j;-><init>()V

    add-int/lit8 p1, p1, 0x1

    invoke-static {p0, p1, v6}, Lyg/e;->g([IILkg/j;)I

    move-result p1

    invoke-virtual {v6}, Lkg/j;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v6}, Lxg/c;->c(Ljava/lang/String;)V

    goto :goto_3

    :pswitch_3
    new-instance v6, Lkg/j;

    invoke-direct {v6}, Lkg/j;-><init>()V

    add-int/lit8 p1, p1, 0x1

    invoke-static {p0, p1, v6}, Lyg/e;->g([IILkg/j;)I

    move-result p1

    invoke-virtual {v6}, Lkg/j;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v6}, Lxg/c;->l(Ljava/lang/String;)V

    goto :goto_3

    :pswitch_4
    new-instance v6, Lkg/j;

    invoke-direct {v6}, Lkg/j;-><init>()V

    add-int/lit8 p1, p1, 0x1

    invoke-static {p0, p1, v6}, Lyg/e;->f([IILkg/j;)I

    move-result p1

    invoke-virtual {v6}, Lkg/j;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    invoke-virtual {p2, v6, v7}, Lxg/c;->m(J)V

    goto/16 :goto_3

    :pswitch_5
    new-instance v6, Lkg/j;

    invoke-direct {v6}, Lkg/j;-><init>()V

    add-int/lit8 p1, p1, 0x1

    invoke-static {p0, p1, v6}, Lyg/e;->f([IILkg/j;)I

    move-result p1

    invoke-virtual {v6}, Lkg/j;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    invoke-virtual {p2, v6}, Lxg/c;->j(I)V

    goto/16 :goto_3

    :pswitch_6
    new-instance v6, Lkg/j;

    invoke-direct {v6}, Lkg/j;-><init>()V

    add-int/lit8 p1, p1, 0x1

    invoke-static {p0, p1, v6}, Lyg/e;->g([IILkg/j;)I

    move-result p1

    invoke-virtual {v6}, Lkg/j;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v6}, Lxg/c;->f(Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_4
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_5
    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p2, v5}, Lxg/c;->h(Z)V

    goto/16 :goto_3

    :cond_6
    if-eq v0, v2, :cond_8

    sub-int v1, p1, v0

    invoke-virtual {p2}, Lxg/c;->b()Z

    move-result v2

    if-eqz v2, :cond_7

    add-int/lit8 v1, v1, -0x1

    :cond_7
    add-int/2addr v1, v0

    invoke-static {p0, v0, v1}, Ljava/util/Arrays;->copyOfRange([III)[I

    move-result-object p0

    invoke-virtual {p2, p0}, Lxg/c;->i([I)V

    :cond_8
    return p1

    :cond_9
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :catch_0
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_a
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static e([I[IILkg/j;Lyg/e$b;)Lyg/e$b;
    .locals 15

    move-object/from16 v0, p3

    const/4 v1, 0x0

    move/from16 v5, p2

    move-object/from16 v2, p4

    move-object v3, v2

    move-object v4, v3

    move v6, v1

    :goto_0
    if-ge v6, v5, :cond_13

    aget v7, p0, v6

    sget-object v8, Lyg/e$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v8, v8, v9

    const/16 v9, 0x20

    const/16 v10, 0x1d

    const/16 v11, 0x1a

    const/16 v12, 0x391

    const/16 v13, 0x384

    packed-switch v8, :pswitch_data_0

    :goto_1
    move-object v7, v4

    move-object v4, v3

    move v3, v1

    goto/16 :goto_a

    :pswitch_0
    if-ge v7, v10, :cond_0

    sget-object v3, Lyg/e;->a:[C

    aget-char v3, v3, v7

    goto :goto_3

    :cond_0
    if-eq v7, v10, :cond_2

    if-eq v7, v13, :cond_2

    if-eq v7, v12, :cond_1

    goto :goto_2

    :cond_1
    aget v3, p1, v6

    int-to-char v3, v3

    invoke-virtual {v0, v3}, Lkg/j;->b(C)V

    :goto_2
    move v3, v1

    goto :goto_3

    :cond_2
    sget-object v3, Lyg/e$b;->ALPHA:Lyg/e$b;

    goto :goto_1

    :pswitch_1
    if-ge v7, v11, :cond_3

    add-int/lit8 v7, v7, 0x41

    int-to-char v3, v7

    :goto_3
    move-object v7, v4

    goto/16 :goto_a

    :cond_3
    if-eq v7, v11, :cond_4

    if-eq v7, v13, :cond_5

    move v9, v1

    :cond_4
    move-object v3, v4

    goto/16 :goto_9

    :cond_5
    sget-object v3, Lyg/e$b;->ALPHA:Lyg/e$b;

    goto/16 :goto_8

    :pswitch_2
    if-ge v7, v10, :cond_6

    sget-object v8, Lyg/e;->a:[C

    aget-char v7, v8, v7

    goto/16 :goto_5

    :cond_6
    if-eq v7, v10, :cond_8

    if-eq v7, v13, :cond_8

    if-eq v7, v12, :cond_7

    goto :goto_1

    :cond_7
    aget v7, p1, v6

    int-to-char v7, v7

    invoke-virtual {v0, v7}, Lkg/j;->b(C)V

    goto :goto_1

    :cond_8
    sget-object v2, Lyg/e$b;->ALPHA:Lyg/e$b;

    move-object v3, v2

    goto :goto_1

    :pswitch_3
    const/16 v8, 0x19

    if-ge v7, v8, :cond_9

    sget-object v8, Lyg/e;->b:[C

    aget-char v7, v8, v7

    goto :goto_5

    :cond_9
    if-eq v7, v13, :cond_b

    if-eq v7, v12, :cond_a

    packed-switch v7, :pswitch_data_1

    goto/16 :goto_8

    :pswitch_4
    sget-object v2, Lyg/e$b;->LOWER:Lyg/e$b;

    goto/16 :goto_7

    :pswitch_5
    sget-object v2, Lyg/e$b;->PUNCT:Lyg/e$b;

    goto :goto_7

    :cond_a
    aget v7, p1, v6

    int-to-char v7, v7

    invoke-virtual {v0, v7}, Lkg/j;->b(C)V

    goto/16 :goto_8

    :cond_b
    :pswitch_6
    sget-object v2, Lyg/e$b;->ALPHA:Lyg/e$b;

    goto :goto_7

    :pswitch_7
    if-ge v7, v11, :cond_c

    add-int/lit8 v7, v7, 0x61

    goto :goto_4

    :cond_c
    if-eq v7, v13, :cond_e

    if-eq v7, v12, :cond_d

    packed-switch v7, :pswitch_data_2

    goto :goto_8

    :pswitch_8
    sget-object v4, Lyg/e$b;->PUNCT_SHIFT:Lyg/e$b;

    goto :goto_6

    :pswitch_9
    sget-object v2, Lyg/e$b;->MIXED:Lyg/e$b;

    goto :goto_7

    :pswitch_a
    sget-object v4, Lyg/e$b;->ALPHA_SHIFT:Lyg/e$b;

    goto :goto_6

    :cond_d
    aget v7, p1, v6

    int-to-char v7, v7

    invoke-virtual {v0, v7}, Lkg/j;->b(C)V

    goto :goto_8

    :cond_e
    sget-object v2, Lyg/e$b;->ALPHA:Lyg/e$b;

    goto :goto_7

    :pswitch_b
    if-ge v7, v11, :cond_f

    add-int/lit8 v7, v7, 0x41

    :goto_4
    int-to-char v7, v7

    :goto_5
    move-object v14, v4

    move-object v4, v3

    move v3, v7

    move-object v7, v14

    goto :goto_a

    :cond_f
    if-eq v7, v13, :cond_11

    if-eq v7, v12, :cond_10

    packed-switch v7, :pswitch_data_3

    goto :goto_8

    :pswitch_c
    sget-object v4, Lyg/e$b;->PUNCT_SHIFT:Lyg/e$b;

    :goto_6
    move v9, v1

    move-object v14, v4

    move-object v4, v3

    move-object v3, v14

    goto :goto_9

    :pswitch_d
    sget-object v2, Lyg/e$b;->MIXED:Lyg/e$b;

    goto :goto_7

    :pswitch_e
    sget-object v2, Lyg/e$b;->LOWER:Lyg/e$b;

    :goto_7
    move v9, v1

    move-object v3, v2

    goto :goto_9

    :cond_10
    aget v7, p1, v6

    int-to-char v7, v7

    invoke-virtual {v0, v7}, Lkg/j;->b(C)V

    :goto_8
    move v9, v1

    goto :goto_9

    :cond_11
    sget-object v2, Lyg/e$b;->ALPHA:Lyg/e$b;

    goto :goto_7

    :goto_9
    :pswitch_f
    move-object v7, v4

    move-object v4, v3

    move v3, v9

    :goto_a
    if-eqz v3, :cond_12

    invoke-virtual {v0, v3}, Lkg/j;->b(C)V

    :cond_12
    add-int/lit8 v6, v6, 0x1

    move-object v3, v4

    move-object v4, v7

    goto/16 :goto_0

    :cond_13
    return-object v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_b
        :pswitch_7
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x19
        :pswitch_5
        :pswitch_f
        :pswitch_4
        :pswitch_6
        :pswitch_c
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1a
        :pswitch_f
        :pswitch_a
        :pswitch_9
        :pswitch_8
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1a
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch
.end method

.method private static f([IILkg/j;)I
    .locals 7

    const/16 v0, 0xf

    new-array v0, v0, [I

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    aget v4, p0, v1

    if-ge p1, v4, :cond_5

    if-nez v2, :cond_5

    add-int/lit8 v5, p1, 0x1

    aget p1, p0, p1

    const/4 v6, 0x1

    if-ne v5, v4, :cond_0

    move v2, v6

    :cond_0
    const/16 v4, 0x384

    if-ge p1, v4, :cond_1

    aput p1, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    if-eq p1, v4, :cond_2

    const/16 v4, 0x385

    if-eq p1, v4, :cond_2

    const/16 v4, 0x39f

    if-eq p1, v4, :cond_2

    const/16 v4, 0x3a0

    if-eq p1, v4, :cond_2

    packed-switch p1, :pswitch_data_0

    goto :goto_1

    :cond_2
    :pswitch_0
    add-int/lit8 v5, v5, -0x1

    move v2, v6

    :goto_1
    rem-int/lit8 v4, v3, 0xf

    if-eqz v4, :cond_3

    const/16 v4, 0x386

    if-eq p1, v4, :cond_3

    if-eqz v2, :cond_4

    :cond_3
    if-lez v3, :cond_4

    invoke-static {v0, v3}, Lyg/e;->c([II)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lkg/j;->d(Ljava/lang/String;)V

    move v3, v1

    :cond_4
    move p1, v5

    goto :goto_0

    :cond_5
    return p1

    :pswitch_data_0
    .packed-switch 0x39a
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private static g([IILkg/j;)I
    .locals 10

    const/4 v0, 0x0

    aget v1, p0, v0

    sub-int v2, v1, p1

    mul-int/lit8 v2, v2, 0x2

    new-array v2, v2, [I

    sub-int/2addr v1, p1

    mul-int/lit8 v1, v1, 0x2

    new-array v1, v1, [I

    sget-object v3, Lyg/e$b;->ALPHA:Lyg/e$b;

    move v4, v0

    move v5, v4

    :goto_0
    aget v6, p0, v0

    if-ge p1, v6, :cond_4

    if-nez v4, :cond_4

    add-int/lit8 v6, p1, 0x1

    aget p1, p0, p1

    const/16 v7, 0x384

    if-ge p1, v7, :cond_0

    div-int/lit8 v7, p1, 0x1e

    aput v7, v2, v5

    add-int/lit8 v7, v5, 0x1

    rem-int/lit8 p1, p1, 0x1e

    aput p1, v2, v7

    add-int/lit8 v5, v5, 0x2

    goto :goto_1

    :cond_0
    const/16 v8, 0x391

    if-eq p1, v8, :cond_3

    const/16 v8, 0x39f

    if-eq p1, v8, :cond_2

    const/16 v8, 0x3a0

    if-eq p1, v8, :cond_1

    packed-switch p1, :pswitch_data_0

    packed-switch p1, :pswitch_data_1

    :goto_1
    move p1, v6

    goto :goto_0

    :pswitch_0
    add-int/lit8 p1, v5, 0x1

    aput v7, v2, v5

    move v5, p1

    goto :goto_1

    :cond_1
    :pswitch_1
    add-int/lit8 v6, v6, -0x1

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    invoke-static {v2, v1, v5, p2, v3}, Lyg/e;->e([I[IILkg/j;Lyg/e$b;)Lyg/e$b;

    move-result-object p1

    add-int/lit8 v1, v6, 0x1

    aget v2, p0, v6

    invoke-virtual {p2, v2}, Lkg/j;->f(I)V

    aget v2, p0, v0

    sub-int v3, v2, v1

    mul-int/lit8 v3, v3, 0x2

    new-array v3, v3, [I

    sub-int/2addr v2, v1

    mul-int/lit8 v2, v2, 0x2

    new-array v2, v2, [I

    move v5, v0

    move-object v9, v3

    move-object v3, p1

    move p1, v1

    move-object v1, v2

    move-object v2, v9

    goto :goto_0

    :cond_3
    aput v8, v2, v5

    add-int/lit8 p1, v6, 0x1

    aget v6, p0, v6

    aput v6, v1, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_4
    invoke-static {v2, v1, v5, p2, v3}, Lyg/e;->e([I[IILkg/j;Lyg/e$b;)Lyg/e$b;

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x384
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x39a
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method
