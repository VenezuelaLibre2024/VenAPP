.class final Log/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Log/c$b;
    }
.end annotation


# static fields
.field private static final a:[C

.field private static final b:[C

.field private static final c:[C

.field private static final d:[C

.field private static final e:[C


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x28

    new-array v1, v0, [C

    fill-array-data v1, :array_0

    sput-object v1, Log/c;->a:[C

    const/16 v1, 0x1b

    new-array v1, v1, [C

    fill-array-data v1, :array_1

    sput-object v1, Log/c;->b:[C

    new-array v0, v0, [C

    fill-array-data v0, :array_2

    sput-object v0, Log/c;->c:[C

    sput-object v1, Log/c;->d:[C

    const/16 v0, 0x20

    new-array v0, v0, [C

    fill-array-data v0, :array_3

    sput-object v0, Log/c;->e:[C

    return-void

    nop

    :array_0
    .array-data 2
        0x2as
        0x2as
        0x2as
        0x20s
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
        0x47s
        0x48s
        0x49s
        0x4as
        0x4bs
        0x4cs
        0x4ds
        0x4es
        0x4fs
        0x50s
        0x51s
        0x52s
        0x53s
        0x54s
        0x55s
        0x56s
        0x57s
        0x58s
        0x59s
        0x5as
    .end array-data

    :array_1
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

    nop

    :array_2
    .array-data 2
        0x2as
        0x2as
        0x2as
        0x20s
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
        0x67s
        0x68s
        0x69s
        0x6as
        0x6bs
        0x6cs
        0x6ds
        0x6es
        0x6fs
        0x70s
        0x71s
        0x72s
        0x73s
        0x74s
        0x75s
        0x76s
        0x77s
        0x78s
        0x79s
        0x7as
    .end array-data

    :array_3
    .array-data 2
        0x60s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
        0x47s
        0x48s
        0x49s
        0x4as
        0x4bs
        0x4cs
        0x4ds
        0x4es
        0x4fs
        0x50s
        0x51s
        0x52s
        0x53s
        0x54s
        0x55s
        0x56s
        0x57s
        0x58s
        0x59s
        0x5as
        0x7bs
        0x7cs
        0x7ds
        0x7es
        0x7fs
    .end array-data
.end method

.method static a([B)Lkg/e;
    .locals 13

    new-instance v0, Lkg/c;

    invoke-direct {v0, p0}, Lkg/c;-><init>([B)V

    new-instance v1, Lkg/j;

    const/16 v2, 0x64

    invoke-direct {v1, v2}, Lkg/j;-><init>(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    new-instance v5, Ljava/util/ArrayList;

    const/4 v6, 0x1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    sget-object v8, Log/c$b;->ASCII_ENCODE:Log/c$b;

    new-instance v9, Ljava/util/HashSet;

    invoke-direct {v9}, Ljava/util/HashSet;-><init>()V

    :cond_0
    sget-object v10, Log/c$b;->ASCII_ENCODE:Log/c$b;

    if-ne v8, v10, :cond_1

    invoke-static {v0, v1, v2, v9}, Log/c;->c(Lkg/c;Lkg/j;Ljava/lang/StringBuilder;Ljava/util/Set;)Log/c$b;

    move-result-object v8

    goto :goto_1

    :cond_1
    sget-object v11, Log/c$a;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v11, v8

    packed-switch v8, :pswitch_data_0

    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :pswitch_0
    invoke-static {v0, v1}, Log/c;->f(Lkg/c;Lkg/j;)V

    move v3, v6

    goto :goto_0

    :pswitch_1
    invoke-static {v0, v1, v5}, Log/c;->d(Lkg/c;Lkg/j;Ljava/util/Collection;)V

    goto :goto_0

    :pswitch_2
    invoke-static {v0, v1}, Log/c;->g(Lkg/c;Lkg/j;)V

    goto :goto_0

    :pswitch_3
    invoke-static {v0, v1}, Log/c;->b(Lkg/c;Lkg/j;)V

    goto :goto_0

    :pswitch_4
    invoke-static {v0, v1, v9}, Log/c;->h(Lkg/c;Lkg/j;Ljava/util/Set;)V

    goto :goto_0

    :pswitch_5
    invoke-static {v0, v1, v9}, Log/c;->e(Lkg/c;Lkg/j;Ljava/util/Set;)V

    :goto_0
    move-object v8, v10

    :goto_1
    sget-object v10, Log/c$b;->PAD_ENCODE:Log/c$b;

    if-eq v8, v10, :cond_2

    invoke-virtual {v0}, Lkg/c;->a()I

    move-result v10

    if-gtz v10, :cond_0

    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {v1, v2}, Lkg/j;->e(Ljava/lang/StringBuilder;)V

    :cond_3
    const/4 v0, 0x5

    const/4 v2, 0x4

    if-eqz v3, :cond_8

    invoke-interface {v9, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v9, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-interface {v9, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    move v12, v2

    goto :goto_6

    :cond_6
    :goto_2
    const/4 v6, 0x6

    goto :goto_5

    :cond_7
    :goto_3
    move v12, v0

    goto :goto_6

    :cond_8
    invoke-interface {v9, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v9, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    goto :goto_4

    :cond_9
    invoke-interface {v9, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v9, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    :cond_a
    const/4 v6, 0x3

    goto :goto_5

    :cond_b
    :goto_4
    const/4 v6, 0x2

    :cond_c
    :goto_5
    move v12, v6

    :goto_6
    new-instance v0, Lkg/e;

    invoke-virtual {v1}, Lkg/j;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_d

    const/4 v5, 0x0

    :cond_d
    move-object v10, v5

    const/4 v11, 0x0

    move-object v7, v0

    move-object v8, p0

    invoke-direct/range {v7 .. v12}, Lkg/e;-><init>([BLjava/lang/String;Ljava/util/List;Ljava/lang/String;I)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static b(Lkg/c;Lkg/j;)V
    .locals 5

    const/4 v0, 0x3

    new-array v1, v0, [I

    :cond_0
    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, v3}, Lkg/c;->d(I)I

    move-result v2

    const/16 v4, 0xfe

    if-ne v2, v4, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0, v3}, Lkg/c;->d(I)I

    move-result v3

    invoke-static {v2, v3, v1}, Log/c;->i(II[I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_9

    aget v3, v1, v2

    if-eqz v3, :cond_8

    const/4 v4, 0x1

    if-eq v3, v4, :cond_7

    const/4 v4, 0x2

    if-eq v3, v4, :cond_6

    if-eq v3, v0, :cond_5

    const/16 v4, 0xe

    if-ge v3, v4, :cond_3

    add-int/lit8 v3, v3, 0x2c

    :goto_1
    int-to-char v3, v3

    goto :goto_2

    :cond_3
    const/16 v4, 0x28

    if-ge v3, v4, :cond_4

    add-int/lit8 v3, v3, 0x33

    goto :goto_1

    :cond_4
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_5
    const/16 v3, 0x20

    goto :goto_2

    :cond_6
    const/16 v3, 0x3e

    goto :goto_2

    :cond_7
    const/16 v3, 0x2a

    goto :goto_2

    :cond_8
    const/16 v3, 0xd

    :goto_2
    invoke-virtual {p1, v3}, Lkg/j;->b(C)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_9
    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v2

    if-gtz v2, :cond_0

    return-void
.end method

.method private static c(Lkg/c;Lkg/j;Ljava/lang/StringBuilder;Ljava/util/Set;)Log/c$b;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkg/c;",
            "Lkg/j;",
            "Ljava/lang/StringBuilder;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)",
            "Log/c$b;"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    const/16 v2, 0x8

    invoke-virtual {p0, v2}, Lkg/c;->d(I)I

    move-result v2

    if-eqz v2, :cond_7

    const/4 v3, 0x1

    const/16 v4, 0x80

    if-gt v2, v4, :cond_2

    if-eqz v1, :cond_1

    add-int/lit16 v2, v2, 0x80

    :cond_1
    sub-int/2addr v2, v3

    int-to-char p0, v2

    invoke-virtual {p1, p0}, Lkg/j;->b(C)V

    sget-object p0, Log/c$b;->ASCII_ENCODE:Log/c$b;

    return-object p0

    :cond_2
    const/16 v4, 0x81

    if-ne v2, v4, :cond_3

    sget-object p0, Log/c$b;->PAD_ENCODE:Log/c$b;

    return-object p0

    :cond_3
    const/16 v4, 0xe5

    if-gt v2, v4, :cond_5

    add-int/lit16 v2, v2, -0x82

    const/16 v3, 0xa

    if-ge v2, v3, :cond_4

    const/16 v3, 0x30

    invoke-virtual {p1, v3}, Lkg/j;->b(C)V

    :cond_4
    invoke-virtual {p1, v2}, Lkg/j;->c(I)V

    goto :goto_1

    :cond_5
    const-string v4, "\u001e\u0004"

    packed-switch v2, :pswitch_data_0

    const/16 v3, 0xfe

    if-ne v2, v3, :cond_6

    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v2

    if-nez v2, :cond_6

    goto :goto_1

    :pswitch_0
    sget-object p0, Log/c$b;->ECI_ENCODE:Log/c$b;

    return-object p0

    :pswitch_1
    sget-object p0, Log/c$b;->EDIFACT_ENCODE:Log/c$b;

    return-object p0

    :pswitch_2
    sget-object p0, Log/c$b;->TEXT_ENCODE:Log/c$b;

    return-object p0

    :pswitch_3
    sget-object p0, Log/c$b;->ANSIX12_ENCODE:Log/c$b;

    return-object p0

    :pswitch_4
    const-string v2, "[)>\u001e06\u001d"

    goto :goto_0

    :pswitch_5
    const-string v2, "[)>\u001e05\u001d"

    :goto_0
    invoke-virtual {p1, v2}, Lkg/j;->d(Ljava/lang/String;)V

    invoke-virtual {p2, v0, v4}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_6
    move v1, v3

    goto :goto_1

    :pswitch_7
    invoke-virtual {p1}, Lkg/j;->i()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/16 v2, 0x1d

    invoke-virtual {p1, v2}, Lkg/j;->b(C)V

    goto :goto_1

    :pswitch_8
    sget-object p0, Log/c$b;->BASE256_ENCODE:Log/c$b;

    return-object p0

    :pswitch_9
    sget-object p0, Log/c$b;->C40_ENCODE:Log/c$b;

    return-object p0

    :goto_1
    :pswitch_a
    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v2

    if-gtz v2, :cond_0

    sget-object p0, Log/c$b;->ASCII_ENCODE:Log/c$b;

    return-object p0

    :cond_6
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_7
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    nop

    :pswitch_data_0
    .packed-switch 0xe6
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_a
        :pswitch_a
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static d(Lkg/c;Lkg/j;Ljava/util/Collection;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkg/c;",
            "Lkg/j;",
            "Ljava/util/Collection<",
            "[B>;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lkg/c;->c()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Lkg/c;->d(I)I

    move-result v2

    add-int/lit8 v3, v0, 0x1

    invoke-static {v2, v0}, Log/c;->j(II)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v0

    div-int/2addr v0, v1

    goto :goto_0

    :cond_0
    const/16 v2, 0xfa

    if-ge v0, v2, :cond_1

    goto :goto_0

    :cond_1
    add-int/lit16 v0, v0, -0xf9

    mul-int/2addr v0, v2

    invoke-virtual {p0, v1}, Lkg/c;->d(I)I

    move-result v2

    add-int/lit8 v4, v3, 0x1

    invoke-static {v2, v3}, Log/c;->j(II)I

    move-result v2

    add-int/2addr v0, v2

    move v3, v4

    :goto_0
    if-ltz v0, :cond_4

    new-array v2, v0, [B

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v0, :cond_3

    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v5

    if-lt v5, v1, :cond_2

    invoke-virtual {p0, v1}, Lkg/c;->d(I)I

    move-result v5

    add-int/lit8 v6, v3, 0x1

    invoke-static {v5, v3}, Log/c;->j(II)I

    move-result v3

    int-to-byte v3, v3

    aput-byte v3, v2, v4

    add-int/lit8 v4, v4, 0x1

    move v3, v6

    goto :goto_1

    :cond_2
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_3
    invoke-interface {p2, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance p0, Ljava/lang/String;

    sget-object p2, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    invoke-direct {p0, v2, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    invoke-virtual {p1, p0}, Lkg/j;->d(Ljava/lang/String;)V

    return-void

    :cond_4
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0
.end method

.method private static e(Lkg/c;Lkg/j;Ljava/util/Set;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkg/c;",
            "Lkg/j;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v1, v0, [I

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :cond_0
    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v5

    const/16 v6, 0x8

    if-ne v5, v6, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, v6}, Lkg/c;->d(I)I

    move-result v5

    const/16 v7, 0xfe

    if-ne v5, v7, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0, v6}, Lkg/c;->d(I)I

    move-result v6

    invoke-static {v5, v6, v1}, Log/c;->i(II[I)V

    move v5, v2

    :goto_0
    if-ge v5, v0, :cond_10

    aget v6, v1, v5

    if-eqz v4, :cond_c

    const/4 v7, 0x1

    if-eq v4, v7, :cond_9

    const/4 v8, 0x2

    if-eq v4, v8, :cond_5

    if-ne v4, v0, :cond_4

    if-eqz v3, :cond_3

    add-int/lit16 v6, v6, 0xe0

    goto :goto_1

    :cond_3
    add-int/lit8 v6, v6, 0x60

    goto :goto_3

    :cond_4
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_5
    sget-object v4, Log/c;->b:[C

    array-length v8, v4

    if-ge v6, v8, :cond_6

    aget-char v4, v4, v6

    if-eqz v3, :cond_b

    add-int/lit16 v4, v4, 0x80

    int-to-char v3, v4

    goto :goto_2

    :cond_6
    const/16 v4, 0x1b

    if-eq v6, v4, :cond_8

    const/16 v3, 0x1e

    if-ne v6, v3, :cond_7

    move v3, v7

    goto :goto_5

    :cond_7
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_8
    invoke-virtual {p1}, Lkg/j;->i()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/16 v4, 0x1d

    goto :goto_4

    :cond_9
    if-eqz v3, :cond_a

    add-int/lit16 v6, v6, 0x80

    :goto_1
    int-to-char v3, v6

    :goto_2
    invoke-virtual {p1, v3}, Lkg/j;->b(C)V

    move v3, v2

    goto :goto_5

    :cond_a
    :goto_3
    int-to-char v4, v6

    :cond_b
    :goto_4
    invoke-virtual {p1, v4}, Lkg/j;->b(C)V

    :goto_5
    move v4, v2

    goto :goto_6

    :cond_c
    if-ge v6, v0, :cond_d

    add-int/lit8 v6, v6, 0x1

    move v4, v6

    goto :goto_6

    :cond_d
    sget-object v7, Log/c;->a:[C

    array-length v8, v7

    if-ge v6, v8, :cond_f

    aget-char v6, v7, v6

    if-eqz v3, :cond_e

    add-int/lit16 v6, v6, 0x80

    int-to-char v3, v6

    invoke-virtual {p1, v3}, Lkg/j;->b(C)V

    move v3, v2

    goto :goto_6

    :cond_e
    invoke-virtual {p1, v6}, Lkg/j;->b(C)V

    :goto_6
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_f
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_10
    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v5

    if-gtz v5, :cond_0

    return-void
.end method

.method private static f(Lkg/c;Lkg/j;)V
    .locals 2

    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v0

    const/16 v1, 0x8

    if-lt v0, v1, :cond_1

    invoke-virtual {p0, v1}, Lkg/c;->d(I)I

    move-result p0

    const/16 v0, 0x7f

    if-gt p0, v0, :cond_0

    add-int/lit8 p0, p0, -0x1

    invoke-virtual {p1, p0}, Lkg/j;->f(I)V

    :cond_0
    return-void

    :cond_1
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0
.end method

.method private static g(Lkg/c;Lkg/j;)V
    .locals 3

    :cond_0
    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v0

    const/16 v1, 0x10

    if-gt v0, v1, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x4

    if-ge v0, v1, :cond_5

    const/4 v1, 0x6

    invoke-virtual {p0, v1}, Lkg/c;->d(I)I

    move-result v1

    const/16 v2, 0x1f

    if-ne v1, v2, :cond_3

    invoke-virtual {p0}, Lkg/c;->b()I

    move-result p1

    const/16 v0, 0x8

    rsub-int/lit8 p1, p1, 0x8

    if-eq p1, v0, :cond_2

    invoke-virtual {p0, p1}, Lkg/c;->d(I)I

    :cond_2
    return-void

    :cond_3
    and-int/lit8 v2, v1, 0x20

    if-nez v2, :cond_4

    or-int/lit8 v1, v1, 0x40

    :cond_4
    int-to-char v1, v1

    invoke-virtual {p1, v1}, Lkg/j;->b(C)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v0

    if-gtz v0, :cond_0

    return-void
.end method

.method private static h(Lkg/c;Lkg/j;Ljava/util/Set;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkg/c;",
            "Lkg/j;",
            "Ljava/util/Set<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x3

    new-array v1, v0, [I

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :cond_0
    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v5

    const/16 v6, 0x8

    if-ne v5, v6, :cond_1

    return-void

    :cond_1
    invoke-virtual {p0, v6}, Lkg/c;->d(I)I

    move-result v5

    const/16 v7, 0xfe

    if-ne v5, v7, :cond_2

    return-void

    :cond_2
    invoke-virtual {p0, v6}, Lkg/c;->d(I)I

    move-result v6

    invoke-static {v5, v6, v1}, Log/c;->i(II[I)V

    move v5, v2

    :goto_0
    if-ge v5, v0, :cond_10

    aget v6, v1, v5

    if-eqz v4, :cond_c

    const/4 v7, 0x1

    if-eq v4, v7, :cond_9

    const/4 v8, 0x2

    if-eq v4, v8, :cond_5

    if-ne v4, v0, :cond_4

    sget-object v4, Log/c;->e:[C

    array-length v7, v4

    if-ge v6, v7, :cond_3

    aget-char v4, v4, v6

    if-eqz v3, :cond_b

    :goto_1
    add-int/lit16 v4, v4, 0x80

    int-to-char v3, v4

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
    sget-object v4, Log/c;->d:[C

    array-length v8, v4

    if-ge v6, v8, :cond_6

    aget-char v4, v4, v6

    if-eqz v3, :cond_b

    goto :goto_1

    :cond_6
    const/16 v4, 0x1b

    if-eq v6, v4, :cond_8

    const/16 v3, 0x1e

    if-ne v6, v3, :cond_7

    move v3, v7

    goto :goto_4

    :cond_7
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_8
    invoke-virtual {p1}, Lkg/j;->i()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p2, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const/16 v4, 0x1d

    goto :goto_3

    :cond_9
    if-eqz v3, :cond_a

    add-int/lit16 v6, v6, 0x80

    int-to-char v3, v6

    :goto_2
    invoke-virtual {p1, v3}, Lkg/j;->b(C)V

    move v3, v2

    goto :goto_4

    :cond_a
    int-to-char v4, v6

    :cond_b
    :goto_3
    invoke-virtual {p1, v4}, Lkg/j;->b(C)V

    :goto_4
    move v4, v2

    goto :goto_5

    :cond_c
    if-ge v6, v0, :cond_d

    add-int/lit8 v6, v6, 0x1

    move v4, v6

    goto :goto_5

    :cond_d
    sget-object v7, Log/c;->c:[C

    array-length v8, v7

    if-ge v6, v8, :cond_f

    aget-char v6, v7, v6

    if-eqz v3, :cond_e

    add-int/lit16 v6, v6, 0x80

    int-to-char v3, v6

    invoke-virtual {p1, v3}, Lkg/j;->b(C)V

    move v3, v2

    goto :goto_5

    :cond_e
    invoke-virtual {p1, v6}, Lkg/j;->b(C)V

    :goto_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_f
    invoke-static {}, Ldg/h;->a()Ldg/h;

    move-result-object p0

    throw p0

    :cond_10
    invoke-virtual {p0}, Lkg/c;->a()I

    move-result v5

    if-gtz v5, :cond_0

    return-void
.end method

.method private static i(II[I)V
    .locals 2

    shl-int/lit8 p0, p0, 0x8

    add-int/2addr p0, p1

    const/4 p1, 0x1

    sub-int/2addr p0, p1

    div-int/lit16 v0, p0, 0x640

    const/4 v1, 0x0

    aput v0, p2, v1

    mul-int/lit16 v0, v0, 0x640

    sub-int/2addr p0, v0

    div-int/lit8 v0, p0, 0x28

    aput v0, p2, p1

    mul-int/lit8 v0, v0, 0x28

    sub-int/2addr p0, v0

    const/4 p1, 0x2

    aput p0, p2, p1

    return-void
.end method

.method private static j(II)I
    .locals 0

    mul-int/lit16 p1, p1, 0x95

    rem-int/lit16 p1, p1, 0xff

    add-int/lit8 p1, p1, 0x1

    sub-int/2addr p0, p1

    if-ltz p0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit16 p0, p0, 0x100

    :goto_0
    return p0
.end method
