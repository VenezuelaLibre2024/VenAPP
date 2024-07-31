.class public final Lqg/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lqg/k$c;,
        Lqg/k$e;,
        Lqg/k$b;,
        Lqg/k$d;
    }
.end annotation


# static fields
.field static final a:[C


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1b

    new-array v0, v0, [C

    fill-array-data v0, :array_0

    sput-object v0, Lqg/k;->a:[C

    return-void

    :array_0
    .array-data 2
        0x21s
        0x22s
        0x23s
        0x24s
        0x25s
        0x26s
        0x27s
        0x28s
        0x29s
        0x2as
        0x2bs
        0x2cs
        0x2ds
        0x2es
        0x2fs
        0x3as
        0x3bs
        0x3cs
        0x3ds
        0x3es
        0x3fs
        0x40s
        0x5bs
        0x5cs
        0x5ds
        0x5es
        0x5fs
    .end array-data
.end method

.method static synthetic a(C)Z
    .locals 0

    invoke-static {p0}, Lqg/k;->l(C)Z

    move-result p0

    return p0
.end method

.method static synthetic b(C)Z
    .locals 0

    invoke-static {p0}, Lqg/k;->n(C)Z

    move-result p0

    return p0
.end method

.method static synthetic c(CI)Z
    .locals 0

    invoke-static {p0, p1}, Lqg/k;->m(CI)Z

    move-result p0

    return p0
.end method

.method static synthetic d(CI)Z
    .locals 0

    invoke-static {p0, p1}, Lqg/k;->o(CI)Z

    move-result p0

    return p0
.end method

.method static e([[Lqg/k$b;Lqg/k$b;)V
    .locals 3

    invoke-static {p1}, Lqg/k$b;->a(Lqg/k$b;)I

    move-result v0

    invoke-static {p1}, Lqg/k$b;->e(Lqg/k$b;)I

    move-result v1

    add-int/2addr v0, v1

    aget-object v1, p0, v0

    invoke-virtual {p1}, Lqg/k$b;->o()Lqg/k$d;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget-object v1, v1, v2

    if-eqz v1, :cond_0

    aget-object v1, p0, v0

    invoke-virtual {p1}, Lqg/k$b;->o()Lqg/k$d;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget-object v1, v1, v2

    invoke-static {v1}, Lqg/k$b;->f(Lqg/k$b;)I

    move-result v1

    invoke-static {p1}, Lqg/k$b;->f(Lqg/k$b;)I

    move-result v2

    if-le v1, v2, :cond_1

    :cond_0
    aget-object p0, p0, v0

    invoke-virtual {p1}, Lqg/k$b;->o()Lqg/k$d;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aput-object p1, p0, v0

    :cond_1
    return-void
.end method

.method static f(Lqg/k$c;[[Lqg/k$b;ILqg/k$b;)V
    .locals 17

    move-object/from16 v7, p0

    move-object/from16 v8, p1

    move/from16 v9, p2

    invoke-virtual {v7, v9}, Lkg/n;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v10, Lqg/k$b;

    sget-object v2, Lqg/k$d;->ASCII:Lqg/k$d;

    const/4 v4, 0x1

    const/4 v6, 0x0

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v3, p2

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lqg/k$b;-><init>(Lqg/k$c;Lqg/k$d;IILqg/k$b;Lqg/k$a;)V

    invoke-static {v8, v10}, Lqg/k;->e([[Lqg/k$b;Lqg/k$b;)V

    return-void

    :cond_0
    invoke-virtual {v7, v9}, Lkg/n;->charAt(I)C

    move-result v0

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz p3, :cond_1

    invoke-virtual/range {p3 .. p3}, Lqg/k$b;->o()Lqg/k$d;

    move-result-object v1

    sget-object v2, Lqg/k$d;->EDF:Lqg/k$d;

    if-eq v1, v2, :cond_7

    :cond_1
    invoke-static {v0}, Lqg/j;->f(C)Z

    move-result v0

    const/4 v13, 0x2

    if-eqz v0, :cond_2

    invoke-virtual {v7, v9, v13}, Lkg/n;->g(II)Z

    move-result v0

    if-eqz v0, :cond_2

    add-int/lit8 v0, v9, 0x1

    invoke-virtual {v7, v0}, Lkg/n;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lqg/j;->f(C)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v14, Lqg/k$b;

    sget-object v2, Lqg/k$d;->ASCII:Lqg/k$d;

    const/4 v4, 0x2

    const/4 v6, 0x0

    move-object v0, v14

    move-object/from16 v1, p0

    move/from16 v3, p2

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lqg/k$b;-><init>(Lqg/k$c;Lqg/k$d;IILqg/k$b;Lqg/k$a;)V

    goto :goto_0

    :cond_2
    new-instance v14, Lqg/k$b;

    sget-object v2, Lqg/k$d;->ASCII:Lqg/k$d;

    const/4 v4, 0x1

    const/4 v6, 0x0

    move-object v0, v14

    move-object/from16 v1, p0

    move/from16 v3, p2

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lqg/k$b;-><init>(Lqg/k$c;Lqg/k$d;IILqg/k$b;Lqg/k$a;)V

    :goto_0
    invoke-static {v8, v14}, Lqg/k;->e([[Lqg/k$b;Lqg/k$b;)V

    new-array v14, v13, [Lqg/k$d;

    sget-object v0, Lqg/k$d;->C40:Lqg/k$d;

    aput-object v0, v14, v11

    sget-object v0, Lqg/k$d;->TEXT:Lqg/k$d;

    aput-object v0, v14, v12

    move v15, v11

    :goto_1
    if-ge v15, v13, :cond_5

    aget-object v2, v14, v15

    new-array v0, v12, [I

    sget-object v1, Lqg/k$d;->C40:Lqg/k$d;

    if-ne v2, v1, :cond_3

    move v1, v12

    goto :goto_2

    :cond_3
    move v1, v11

    :goto_2
    invoke-static {v7, v9, v1, v0}, Lqg/k;->j(Lqg/k$c;IZ[I)I

    move-result v1

    if-lez v1, :cond_4

    new-instance v6, Lqg/k$b;

    aget v4, v0, v11

    const/16 v16, 0x0

    move-object v0, v6

    move-object/from16 v1, p0

    move/from16 v3, p2

    move-object/from16 v5, p3

    move-object v11, v6

    move-object/from16 v6, v16

    invoke-direct/range {v0 .. v6}, Lqg/k$b;-><init>(Lqg/k$c;Lqg/k$d;IILqg/k$b;Lqg/k$a;)V

    invoke-static {v8, v11}, Lqg/k;->e([[Lqg/k$b;Lqg/k$b;)V

    :cond_4
    add-int/lit8 v15, v15, 0x1

    const/4 v11, 0x0

    goto :goto_1

    :cond_5
    invoke-virtual {v7, v9, v10}, Lkg/n;->g(II)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v7, v9}, Lkg/n;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lqg/j;->k(C)Z

    move-result v0

    if-eqz v0, :cond_6

    add-int/lit8 v0, v9, 0x1

    invoke-virtual {v7, v0}, Lkg/n;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lqg/j;->k(C)Z

    move-result v0

    if-eqz v0, :cond_6

    add-int/lit8 v0, v9, 0x2

    invoke-virtual {v7, v0}, Lkg/n;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lqg/j;->k(C)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance v11, Lqg/k$b;

    sget-object v2, Lqg/k$d;->X12:Lqg/k$d;

    const/4 v4, 0x3

    const/4 v6, 0x0

    move-object v0, v11

    move-object/from16 v1, p0

    move/from16 v3, p2

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lqg/k$b;-><init>(Lqg/k$c;Lqg/k$d;IILqg/k$b;Lqg/k$a;)V

    invoke-static {v8, v11}, Lqg/k;->e([[Lqg/k$b;Lqg/k$b;)V

    :cond_6
    new-instance v11, Lqg/k$b;

    sget-object v2, Lqg/k$d;->B256:Lqg/k$d;

    const/4 v4, 0x1

    const/4 v6, 0x0

    move-object v0, v11

    move-object/from16 v1, p0

    move/from16 v3, p2

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lqg/k$b;-><init>(Lqg/k$c;Lqg/k$d;IILqg/k$b;Lqg/k$a;)V

    invoke-static {v8, v11}, Lqg/k;->e([[Lqg/k$b;Lqg/k$b;)V

    :cond_7
    const/4 v11, 0x0

    :goto_3
    if-ge v11, v10, :cond_8

    add-int v0, v9, v11

    invoke-virtual {v7, v0, v12}, Lkg/n;->g(II)Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-virtual {v7, v0}, Lkg/n;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lqg/j;->i(C)Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance v13, Lqg/k$b;

    sget-object v2, Lqg/k$d;->EDF:Lqg/k$d;

    add-int/lit8 v11, v11, 0x1

    const/4 v6, 0x0

    move-object v0, v13

    move-object/from16 v1, p0

    move/from16 v3, p2

    move v4, v11

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lqg/k$b;-><init>(Lqg/k$c;Lqg/k$d;IILqg/k$b;Lqg/k$a;)V

    invoke-static {v8, v13}, Lqg/k;->e([[Lqg/k$b;Lqg/k$b;)V

    goto :goto_3

    :cond_8
    if-ne v11, v10, :cond_9

    const/4 v0, 0x4

    invoke-virtual {v7, v9, v0}, Lkg/n;->g(II)Z

    move-result v0

    if-eqz v0, :cond_9

    add-int/lit8 v0, v9, 0x3

    invoke-virtual {v7, v0}, Lkg/n;->charAt(I)C

    move-result v0

    invoke-static {v0}, Lqg/j;->i(C)Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance v10, Lqg/k$b;

    sget-object v2, Lqg/k$d;->EDF:Lqg/k$d;

    const/4 v4, 0x4

    const/4 v6, 0x0

    move-object v0, v10

    move-object/from16 v1, p0

    move/from16 v3, p2

    move-object/from16 v5, p3

    invoke-direct/range {v0 .. v6}, Lqg/k$b;-><init>(Lqg/k$c;Lqg/k$d;IILqg/k$b;Lqg/k$a;)V

    invoke-static {v8, v10}, Lqg/k;->e([[Lqg/k$b;Lqg/k$b;)V

    :cond_9
    return-void
.end method

.method static g(Ljava/lang/String;Ljava/nio/charset/Charset;ILqg/m;I)[B
    .locals 8

    new-instance v7, Lqg/k$c;

    const/4 v6, 0x0

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move v5, p4

    invoke-direct/range {v0 .. v6}, Lqg/k$c;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;ILqg/m;ILqg/k$a;)V

    invoke-static {v7}, Lqg/k;->i(Lqg/k$c;)Lqg/k$e;

    move-result-object p0

    invoke-virtual {p0}, Lqg/k$e;->b()[B

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/lang/String;Ljava/nio/charset/Charset;ILqg/m;)Ljava/lang/String;
    .locals 3

    const-string v0, "[)>\u001e05\u001d"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x7

    const-string v2, "\u001e\u0004"

    if-eqz v0, :cond_0

    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x5

    goto :goto_0

    :cond_0
    const-string v0, "[)>\u001e06\u001d"

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x6

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/lang/String;

    invoke-static {p0, p1, p2, p3, v0}, Lqg/k;->g(Ljava/lang/String;Ljava/nio/charset/Charset;ILqg/m;I)[B

    move-result-object p0

    sget-object p1, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {v1, p0, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object v1
.end method

.method static i(Lqg/k$c;)Lqg/k$e;
    .locals 9

    invoke-virtual {p0}, Lkg/n;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    const/4 v2, 0x2

    new-array v2, v2, [I

    const/4 v3, 0x1

    const/4 v4, 0x6

    aput v4, v2, v3

    const/4 v5, 0x0

    aput v1, v2, v5

    const-class v1, Lqg/k$b;

    invoke-static {v1, v2}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[Lqg/k$b;

    const/4 v2, 0x0

    invoke-static {p0, v1, v5, v2}, Lqg/k;->f(Lqg/k$c;[[Lqg/k$b;ILqg/k$b;)V

    move v6, v3

    :goto_0
    if-gt v6, v0, :cond_3

    move v7, v5

    :goto_1
    if-ge v7, v4, :cond_1

    aget-object v8, v1, v6

    aget-object v8, v8, v7

    if-eqz v8, :cond_0

    if-ge v6, v0, :cond_0

    invoke-static {p0, v1, v6, v8}, Lqg/k;->f(Lqg/k$c;[[Lqg/k$b;ILqg/k$b;)V

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_1
    move v7, v5

    :goto_2
    if-ge v7, v4, :cond_2

    add-int/lit8 v8, v6, -0x1

    aget-object v8, v1, v8

    aput-object v2, v8, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    const/4 v2, -0x1

    const v6, 0x7fffffff

    :goto_3
    if-ge v5, v4, :cond_6

    aget-object v7, v1, v0

    aget-object v7, v7, v5

    if-eqz v7, :cond_5

    if-lt v5, v3, :cond_4

    const/4 v8, 0x3

    if-gt v5, v8, :cond_4

    invoke-static {v7}, Lqg/k$b;->f(Lqg/k$b;)I

    move-result v7

    add-int/2addr v7, v3

    goto :goto_4

    :cond_4
    invoke-static {v7}, Lqg/k$b;->f(Lqg/k$b;)I

    move-result v7

    :goto_4
    if-ge v7, v6, :cond_5

    move v2, v5

    move v6, v7

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_6
    if-ltz v2, :cond_7

    new-instance p0, Lqg/k$e;

    aget-object v0, v1, v0

    aget-object v0, v0, v2

    invoke-direct {p0, v0}, Lqg/k$e;-><init>(Lqg/k$b;)V

    return-object p0

    :cond_7
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Internal error: failed to encode \""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "\""

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method static j(Lqg/k$c;IZ[I)I
    .locals 5

    const/4 v0, 0x0

    move v1, p1

    move v2, v0

    :goto_0
    invoke-virtual {p0}, Lkg/n;->length()I

    move-result v3

    if-ge v1, v3, :cond_a

    invoke-virtual {p0, v1}, Lkg/n;->a(I)Z

    move-result v3

    if-eqz v3, :cond_0

    aput v0, p3, v0

    return v0

    :cond_0
    invoke-virtual {p0, v1}, Lkg/n;->charAt(I)C

    move-result v3

    if-eqz p2, :cond_1

    invoke-static {v3}, Lqg/j;->h(C)Z

    move-result v4

    if-nez v4, :cond_2

    :cond_1
    if-nez p2, :cond_3

    invoke-static {v3}, Lqg/j;->j(C)Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Lkg/n;->f()I

    move-result v4

    invoke-static {v3, v4}, Lqg/k;->k(CI)Z

    move-result v4

    if-nez v4, :cond_4

    add-int/lit8 v2, v2, 0x2

    goto :goto_1

    :cond_4
    and-int/lit16 v3, v3, 0xff

    const/16 v4, 0x80

    if-lt v3, v4, :cond_7

    if-eqz p2, :cond_5

    add-int/lit8 v4, v3, -0x80

    int-to-char v4, v4

    invoke-static {v4}, Lqg/j;->h(C)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    if-nez p2, :cond_7

    add-int/lit8 v3, v3, -0x80

    int-to-char v3, v3

    invoke-static {v3}, Lqg/j;->j(C)Z

    move-result v3

    if-eqz v3, :cond_7

    :cond_6
    add-int/lit8 v2, v2, 0x3

    goto :goto_1

    :cond_7
    add-int/lit8 v2, v2, 0x4

    :goto_1
    rem-int/lit8 v3, v2, 0x3

    if-eqz v3, :cond_9

    add-int/lit8 v3, v2, -0x2

    rem-int/lit8 v3, v3, 0x3

    if-nez v3, :cond_8

    add-int/lit8 v3, v1, 0x1

    invoke-virtual {p0}, Lkg/n;->length()I

    move-result v4

    if-ne v3, v4, :cond_8

    goto :goto_2

    :cond_8
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_9
    :goto_2
    sub-int/2addr v1, p1

    add-int/lit8 v1, v1, 0x1

    aput v1, p3, v0

    int-to-double p0, v2

    const-wide/high16 p2, 0x4008000000000000L    # 3.0

    div-double/2addr p0, p2

    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide p0

    double-to-int p0, p0

    return p0

    :cond_a
    aput v0, p3, v0

    return v0
.end method

.method static k(CI)Z
    .locals 0

    if-eq p0, p1, :cond_0

    const/16 p1, 0x80

    if-lt p0, p1, :cond_0

    const/16 p1, 0xff

    if-gt p0, p1, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static l(C)Z
    .locals 1

    const/16 v0, 0x1f

    if-gt p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static m(CI)Z
    .locals 6

    sget-object v0, Lqg/k;->a:[C

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v1, :cond_1

    aget-char v5, v0, v3

    if-ne v5, p0, :cond_0

    return v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    if-ne p0, p1, :cond_2

    move v2, v4

    :cond_2
    return v2
.end method

.method private static n(C)Z
    .locals 0

    invoke-static {p0}, Lqg/k;->l(C)Z

    move-result p0

    return p0
.end method

.method private static o(CI)Z
    .locals 0

    invoke-static {p0, p1}, Lqg/k;->m(CI)Z

    move-result p0

    return p0
.end method
