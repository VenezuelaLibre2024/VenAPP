.class public final Ltg/b;
.super Ltg/s;
.source "SourceFile"


# static fields
.field private static final b:[C

.field private static final c:[C

.field private static final d:[C

.field private static final e:C


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x4

    new-array v1, v0, [C

    fill-array-data v1, :array_0

    sput-object v1, Ltg/b;->b:[C

    new-array v2, v0, [C

    fill-array-data v2, :array_1

    sput-object v2, Ltg/b;->c:[C

    new-array v0, v0, [C

    fill-array-data v0, :array_2

    sput-object v0, Ltg/b;->d:[C

    const/4 v0, 0x0

    aget-char v0, v1, v0

    sput-char v0, Ltg/b;->e:C

    return-void

    :array_0
    .array-data 2
        0x41s
        0x42s
        0x43s
        0x44s
    .end array-data

    :array_1
    .array-data 2
        0x54s
        0x4es
        0x2as
        0x45s
    .end array-data

    :array_2
    .array-data 2
        0x2fs
        0x3as
        0x2bs
        0x2es
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltg/s;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/String;)[Z
    .locals 10

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ge v0, v1, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    sget-char v1, Ltg/b;->e:C

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_0
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v3

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v1

    sget-object v4, Ltg/b;->b:[C

    invoke-static {v4, v0}, Ltg/a;->h([CC)Z

    move-result v5

    invoke-static {v4, v1}, Ltg/a;->h([CC)Z

    move-result v4

    sget-object v6, Ltg/b;->c:[C

    invoke-static {v6, v0}, Ltg/a;->h([CC)Z

    move-result v0

    invoke-static {v6, v1}, Ltg/a;->h([CC)Z

    move-result v1

    const-string v6, "Invalid start/end guards: "

    if-eqz v5, :cond_2

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    if-eqz v0, :cond_4

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    if-nez v4, :cond_16

    if-nez v1, :cond_16

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    goto :goto_0

    :goto_1
    const/16 v0, 0x14

    move v1, v3

    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v3

    if-ge v1, v4, :cond_8

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    invoke-static {v4}, Ljava/lang/Character;->isDigit(C)Z

    move-result v4

    if-nez v4, :cond_7

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x2d

    if-eq v4, v5, :cond_7

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v5, 0x24

    if-ne v4, v5, :cond_5

    goto :goto_3

    :cond_5
    sget-object v4, Ltg/b;->d:[C

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v4, v5}, Ltg/a;->h([CC)Z

    move-result v4

    if-eqz v4, :cond_6

    add-int/lit8 v0, v0, 0xa

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Cannot encode : \'"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 p1, 0x27

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_3
    add-int/lit8 v0, v0, 0x9

    :goto_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    sub-int/2addr v1, v3

    add-int/2addr v0, v1

    new-array v0, v0, [Z

    move v1, v2

    move v4, v1

    :goto_5
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    if-ge v1, v5, :cond_15

    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    invoke-static {v5}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v5

    if-eqz v1, :cond_9

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    sub-int/2addr v6, v3

    if-ne v1, v6, :cond_e

    :cond_9
    const/16 v6, 0x2a

    if-eq v5, v6, :cond_d

    const/16 v6, 0x45

    if-eq v5, v6, :cond_c

    const/16 v6, 0x4e

    if-eq v5, v6, :cond_b

    const/16 v6, 0x54

    if-eq v5, v6, :cond_a

    goto :goto_6

    :cond_a
    const/16 v5, 0x41

    goto :goto_6

    :cond_b
    const/16 v5, 0x42

    goto :goto_6

    :cond_c
    const/16 v5, 0x44

    goto :goto_6

    :cond_d
    const/16 v5, 0x43

    :cond_e
    :goto_6
    move v6, v2

    :goto_7
    sget-object v7, Ltg/a;->d:[C

    array-length v8, v7

    if-ge v6, v8, :cond_10

    aget-char v7, v7, v6

    if-ne v5, v7, :cond_f

    sget-object v5, Ltg/a;->e:[I

    aget v5, v5, v6

    goto :goto_8

    :cond_f
    add-int/lit8 v6, v6, 0x1

    goto :goto_7

    :cond_10
    move v5, v2

    :goto_8
    move v6, v2

    move v8, v6

    move v7, v3

    :goto_9
    const/4 v9, 0x7

    if-ge v6, v9, :cond_13

    aput-boolean v7, v0, v4

    add-int/lit8 v4, v4, 0x1

    rsub-int/lit8 v9, v6, 0x6

    shr-int v9, v5, v9

    and-int/2addr v9, v3

    if-eqz v9, :cond_12

    if-ne v8, v3, :cond_11

    goto :goto_a

    :cond_11
    add-int/lit8 v8, v8, 0x1

    goto :goto_9

    :cond_12
    :goto_a
    xor-int/lit8 v7, v7, 0x1

    add-int/lit8 v6, v6, 0x1

    move v8, v2

    goto :goto_9

    :cond_13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v5

    sub-int/2addr v5, v3

    if-ge v1, v5, :cond_14

    aput-boolean v2, v0, v4

    add-int/lit8 v4, v4, 0x1

    :cond_14
    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_15
    return-object v0

    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected g()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ldg/a;",
            ">;"
        }
    .end annotation

    sget-object v0, Ldg/a;->CODABAR:Ldg/a;

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
