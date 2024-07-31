.class final Ldh/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Ldh/d;->a:[C

    return-void
.end method

.method static a([BLdh/j;Ldh/f;Ljava/util/Map;)Lkg/e;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B",
            "Ldh/j;",
            "Ldh/f;",
            "Ljava/util/Map<",
            "Ldg/e;",
            "*>;)",
            "Lkg/e;"
        }
    .end annotation

    move-object/from16 v0, p1

    new-instance v7, Lkg/c;

    move-object/from16 v9, p0

    invoke-direct {v7, v9}, Lkg/c;-><init>([B)V

    new-instance v8, Ljava/lang/StringBuilder;

    const/16 v1, 0x32

    invoke-direct {v8, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    new-instance v10, Ljava/util/ArrayList;

    const/4 v11, 0x1

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    const/4 v12, 0x0

    const/4 v2, -0x1

    move v13, v1

    move v14, v13

    move v15, v14

    move/from16 v16, v2

    move/from16 v17, v16

    move-object/from16 v18, v12

    :goto_0
    :try_start_0
    invoke-virtual {v7}, Lkg/c;->a()I

    move-result v1

    const/4 v6, 0x4

    if-ge v1, v6, :cond_0

    sget-object v1, Ldh/h;->TERMINATOR:Ldh/h;

    :goto_1
    move-object v5, v1

    goto :goto_2

    :cond_0
    invoke-virtual {v7, v6}, Lkg/c;->d(I)I

    move-result v1

    invoke-static {v1}, Ldh/h;->b(I)Ldh/h;

    move-result-object v1

    goto :goto_1

    :goto_2
    sget-object v1, Ldh/d$a;->a:[I

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v1, v2

    const/4 v4, 0x2

    const/4 v3, 0x3

    packed-switch v2, :pswitch_data_0

    invoke-virtual {v5, v0}, Ldh/h;->i(Ldh/j;)I

    move-result v2

    goto :goto_5

    :pswitch_0
    invoke-virtual {v7, v6}, Lkg/c;->d(I)I

    move-result v1

    invoke-virtual {v5, v0}, Ldh/h;->i(Ldh/j;)I

    move-result v2

    invoke-virtual {v7, v2}, Lkg/c;->d(I)I

    move-result v2

    if-ne v1, v11, :cond_1

    invoke-static {v7, v8, v2}, Ldh/d;->d(Lkg/c;Ljava/lang/StringBuilder;I)V

    goto :goto_3

    :pswitch_1
    invoke-static {v7}, Ldh/d;->g(Lkg/c;)I

    move-result v1

    invoke-static {v1}, Lkg/d;->i(I)Lkg/d;

    move-result-object v18

    if-eqz v18, :cond_2

    :cond_1
    :goto_3
    :pswitch_2
    move/from16 v20, v3

    move/from16 v19, v4

    move-object v11, v5

    move/from16 v21, v6

    goto/16 :goto_6

    :cond_2
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object v0

    throw v0

    :pswitch_3
    invoke-virtual {v7}, Lkg/c;->a()I

    move-result v1

    const/16 v2, 0x10

    if-lt v1, v2, :cond_3

    const/16 v1, 0x8

    invoke-virtual {v7, v1}, Lkg/c;->d(I)I

    move-result v2

    invoke-virtual {v7, v1}, Lkg/c;->d(I)I

    move-result v1

    move/from16 v17, v1

    move/from16 v16, v2

    goto :goto_3

    :cond_3
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object v0

    throw v0

    :pswitch_4
    move/from16 v20, v3

    move/from16 v19, v4

    move/from16 v21, v6

    move v13, v11

    move v15, v13

    goto :goto_4

    :pswitch_5
    move/from16 v20, v3

    move/from16 v19, v4

    move/from16 v21, v6

    move v13, v11

    move v14, v13

    :goto_4
    move-object v11, v5

    goto :goto_6

    :goto_5
    invoke-virtual {v7, v2}, Lkg/c;->d(I)I

    move-result v2

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v19

    aget v1, v1, v19

    if-eq v1, v11, :cond_7

    if-eq v1, v4, :cond_6

    if-eq v1, v3, :cond_5

    if-ne v1, v6, :cond_4

    invoke-static {v7, v8, v2}, Ldh/d;->e(Lkg/c;Ljava/lang/StringBuilder;I)V

    goto :goto_3

    :cond_4
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object v0

    throw v0

    :cond_5
    move-object v1, v7

    move/from16 v19, v2

    move-object v2, v8

    move/from16 v20, v3

    move/from16 v3, v19

    move/from16 v19, v4

    move-object/from16 v4, v18

    move-object v11, v5

    move-object v5, v10

    move/from16 v21, v6

    move-object/from16 v6, p3

    invoke-static/range {v1 .. v6}, Ldh/d;->c(Lkg/c;Ljava/lang/StringBuilder;ILkg/d;Ljava/util/Collection;Ljava/util/Map;)V

    goto :goto_6

    :cond_6
    move v1, v2

    move/from16 v20, v3

    move/from16 v19, v4

    move-object v11, v5

    move/from16 v21, v6

    invoke-static {v7, v8, v1, v13}, Ldh/d;->b(Lkg/c;Ljava/lang/StringBuilder;IZ)V

    goto :goto_6

    :cond_7
    move v1, v2

    move/from16 v20, v3

    move/from16 v19, v4

    move-object v11, v5

    move/from16 v21, v6

    invoke-static {v7, v8, v1}, Ldh/d;->f(Lkg/c;Ljava/lang/StringBuilder;I)V

    :goto_6
    sget-object v1, Ldh/h;->TERMINATOR:Ldh/h;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    if-ne v11, v1, :cond_f

    if-eqz v18, :cond_a

    if-eqz v14, :cond_8

    move/from16 v15, v21

    goto :goto_8

    :cond_8
    if-eqz v15, :cond_9

    const/4 v0, 0x6

    goto :goto_7

    :cond_9
    move/from16 v15, v19

    goto :goto_8

    :cond_a
    if-eqz v14, :cond_b

    move/from16 v15, v20

    goto :goto_8

    :cond_b
    if-eqz v15, :cond_c

    const/4 v0, 0x5

    :goto_7
    move v15, v0

    goto :goto_8

    :cond_c
    const/4 v15, 0x1

    :goto_8
    new-instance v0, Lkg/e;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_d

    move-object v11, v12

    goto :goto_9

    :cond_d
    move-object v11, v10

    :goto_9
    if-nez p2, :cond_e

    goto :goto_a

    :cond_e
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    move-object v12, v2

    :goto_a
    move-object v8, v0

    move-object/from16 v9, p0

    move-object v10, v1

    move/from16 v13, v16

    move/from16 v14, v17

    invoke-direct/range {v8 .. v15}, Lkg/e;-><init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;III)V

    return-object v0

    :cond_f
    const/4 v11, 0x1

    goto/16 :goto_0

    :catch_0
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static b(Lkg/c;Ljava/lang/StringBuilder;IZ)V
    .locals 3

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    :goto_0
    const/4 v1, 0x1

    if-le p2, v1, :cond_1

    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v1

    const/16 v2, 0xb

    if-lt v1, v2, :cond_0

    invoke-virtual {p0, v2}, Lkg/c;->d(I)I

    move-result v1

    div-int/lit8 v2, v1, 0x2d

    invoke-static {v2}, Ldh/d;->h(I)C

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    rem-int/lit8 v1, v1, 0x2d

    invoke-static {v1}, Ldh/d;->h(I)C

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, -0x2

    goto :goto_0

    :cond_0
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_1
    if-ne p2, v1, :cond_3

    invoke-virtual {p0}, Lkg/c;->a()I

    move-result p2

    const/4 v2, 0x6

    if-lt p2, v2, :cond_2

    invoke-virtual {p0, v2}, Lkg/c;->d(I)I

    move-result p0

    invoke-static {p0}, Ldh/d;->h(I)C

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_3
    :goto_1
    if-eqz p3, :cond_6

    :goto_2
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    if-ge v0, p0, :cond_6

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result p0

    const/16 p2, 0x25

    if-ne p0, p2, :cond_5

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    move-result p0

    sub-int/2addr p0, v1

    if-ge v0, p0, :cond_4

    add-int/lit8 p0, v0, 0x1

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->charAt(I)C

    move-result p3

    if-ne p3, p2, :cond_4

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;

    goto :goto_3

    :cond_4
    const/16 p0, 0x1d

    invoke-virtual {p1, v0, p0}, Ljava/lang/StringBuilder;->setCharAt(IC)V

    :cond_5
    :goto_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_6
    return-void
.end method

.method private static c(Lkg/c;Ljava/lang/StringBuilder;ILkg/d;Ljava/util/Collection;Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkg/c;",
            "Ljava/lang/StringBuilder;",
            "I",
            "Lkg/d;",
            "Ljava/util/Collection<",
            "[B>;",
            "Ljava/util/Map<",
            "Ldg/e;",
            "*>;)V"
        }
    .end annotation

    mul-int/lit8 v0, p2, 0x8

    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v1

    if-gt v0, v1, :cond_2

    new-array v0, p2, [B

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_0

    const/16 v2, 0x8

    invoke-virtual {p0, v2}, Lkg/c;->d(I)I

    move-result v2

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-nez p3, :cond_1

    invoke-static {v0, p5}, Lkg/p;->a([BLjava/util/Map;)Ljava/nio/charset/Charset;

    move-result-object p0

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Lkg/d;->l()Ljava/nio/charset/Charset;

    move-result-object p0

    :goto_1
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, v0, p0}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    :cond_2
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0
.end method

.method private static d(Lkg/c;Ljava/lang/StringBuilder;I)V
    .locals 4

    mul-int/lit8 v0, p2, 0xd

    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v1

    if-gt v0, v1, :cond_2

    mul-int/lit8 v0, p2, 0x2

    new-array v0, v0, [B

    const/4 v1, 0x0

    :goto_0
    if-lez p2, :cond_1

    const/16 v2, 0xd

    invoke-virtual {p0, v2}, Lkg/c;->d(I)I

    move-result v2

    div-int/lit8 v3, v2, 0x60

    shl-int/lit8 v3, v3, 0x8

    rem-int/lit8 v2, v2, 0x60

    or-int/2addr v2, v3

    const/16 v3, 0xa00

    if-ge v2, v3, :cond_0

    const v3, 0xa1a1

    goto :goto_1

    :cond_0
    const v3, 0xa6a1

    :goto_1
    add-int/2addr v2, v3

    shr-int/lit8 v3, v2, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x1

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    aput-byte v2, v0, v3

    add-int/lit8 v1, v1, 0x2

    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/String;

    sget-object p2, Lkg/p;->c:Ljava/nio/charset/Charset;

    invoke-direct {p0, v0, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_2
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0
.end method

.method private static e(Lkg/c;Ljava/lang/StringBuilder;I)V
    .locals 4

    mul-int/lit8 v0, p2, 0xd

    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v1

    if-gt v0, v1, :cond_2

    mul-int/lit8 v0, p2, 0x2

    new-array v0, v0, [B

    const/4 v1, 0x0

    :goto_0
    if-lez p2, :cond_1

    const/16 v2, 0xd

    invoke-virtual {p0, v2}, Lkg/c;->d(I)I

    move-result v2

    div-int/lit16 v3, v2, 0xc0

    shl-int/lit8 v3, v3, 0x8

    rem-int/lit16 v2, v2, 0xc0

    or-int/2addr v2, v3

    const/16 v3, 0x1f00

    if-ge v2, v3, :cond_0

    const v3, 0x8140

    goto :goto_1

    :cond_0
    const v3, 0xc140

    :goto_1
    add-int/2addr v2, v3

    shr-int/lit8 v3, v2, 0x8

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v3, v1, 0x1

    int-to-byte v2, v2

    aput-byte v2, v0, v3

    add-int/lit8 v1, v1, 0x2

    add-int/lit8 p2, p2, -0x1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/lang/String;

    sget-object p2, Lkg/p;->b:Ljava/nio/charset/Charset;

    invoke-direct {p0, v0, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_2
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0
.end method

.method private static f(Lkg/c;Ljava/lang/StringBuilder;I)V
    .locals 3

    :goto_0
    const/4 v0, 0x3

    const/16 v1, 0xa

    if-lt p2, v0, :cond_2

    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v0

    if-lt v0, v1, :cond_1

    invoke-virtual {p0, v1}, Lkg/c;->d(I)I

    move-result v0

    const/16 v2, 0x3e8

    if-ge v0, v2, :cond_0

    div-int/lit8 v2, v0, 0x64

    invoke-static {v2}, Ldh/d;->h(I)C

    move-result v2

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    div-int/lit8 v2, v0, 0xa

    rem-int/2addr v2, v1

    invoke-static {v2}, Ldh/d;->h(I)C

    move-result v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    rem-int/lit8 v0, v0, 0xa

    invoke-static {v0}, Ldh/d;->h(I)C

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p2, p2, -0x3

    goto :goto_0

    :cond_0
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_1
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_2
    const/4 v0, 0x2

    if-ne p2, v0, :cond_5

    invoke-virtual {p0}, Lkg/c;->a()I

    move-result p2

    const/4 v0, 0x7

    if-lt p2, v0, :cond_4

    invoke-virtual {p0, v0}, Lkg/c;->d(I)I

    move-result p0

    const/16 p2, 0x64

    if-ge p0, p2, :cond_3

    div-int/lit8 p2, p0, 0xa

    invoke-static {p2}, Ldh/d;->h(I)C

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    rem-int/2addr p0, v1

    :goto_1
    invoke-static {p0}, Ldh/d;->h(I)C

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_3
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_4
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_5
    const/4 v0, 0x1

    if-ne p2, v0, :cond_8

    invoke-virtual {p0}, Lkg/c;->a()I

    move-result p2

    const/4 v0, 0x4

    if-lt p2, v0, :cond_7

    invoke-virtual {p0, v0}, Lkg/c;->d(I)I

    move-result p0

    if-ge p0, v1, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_7
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_8
    :goto_2
    return-void
.end method

.method private static g(Lkg/c;)I
    .locals 4

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lkg/c;->d(I)I

    move-result v1

    and-int/lit16 v2, v1, 0x80

    if-nez v2, :cond_0

    and-int/lit8 p0, v1, 0x7f

    return p0

    :cond_0
    and-int/lit16 v2, v1, 0xc0

    const/16 v3, 0x80

    if-ne v2, v3, :cond_1

    invoke-virtual {p0, v0}, Lkg/c;->d(I)I

    move-result p0

    and-int/lit8 v1, v1, 0x3f

    shl-int/lit8 v0, v1, 0x8

    or-int/2addr p0, v0

    return p0

    :cond_1
    and-int/lit16 v0, v1, 0xe0

    const/16 v2, 0xc0

    if-ne v0, v2, :cond_2

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lkg/c;->d(I)I

    move-result p0

    and-int/lit8 v1, v1, 0x1f

    shl-int/lit8 v0, v1, 0x10

    or-int/2addr p0, v0

    return p0

    :cond_2
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0
.end method

.method private static h(I)C
    .locals 2

    sget-object v0, Ldh/d;->a:[C

    array-length v1, v0

    if-ge p0, v1, :cond_0

    aget-char p0, v0, p0

    return p0

    :cond_0
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0
.end method
