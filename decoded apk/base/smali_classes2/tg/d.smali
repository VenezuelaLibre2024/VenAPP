.class public final Ltg/d;
.super Ltg/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ltg/d$c;,
        Ltg/d$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ltg/s;-><init>()V

    return-void
.end method

.method private static i(Ljava/lang/String;Ljava/util/Map;)I
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ldg/g;",
            "*>;)I"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_b

    const/16 v2, 0x50

    if-gt v0, v2, :cond_b

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-eqz p1, :cond_3

    sget-object v4, Ldg/g;->FORCE_CODE_SET:Ldg/g;

    invoke-interface {p1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v4

    packed-switch v4, :pswitch_data_0

    :goto_0
    move v1, v3

    goto :goto_1

    :pswitch_0
    const-string v1, "C"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    goto :goto_1

    :pswitch_1
    const-string v4, "B"

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_0

    :pswitch_2
    const-string v1, "A"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    move v1, v2

    :cond_2
    :goto_1
    packed-switch v1, :pswitch_data_1

    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported code set hint: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_3
    const/16 v3, 0x63

    goto :goto_2

    :pswitch_4
    const/16 v3, 0x64

    goto :goto_2

    :pswitch_5
    const/16 v3, 0x65

    :cond_3
    :goto_2
    if-ge v2, v0, :cond_a

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p1

    const/16 v1, 0x7f

    packed-switch p1, :pswitch_data_2

    if-gt p1, v1, :cond_9

    :pswitch_6
    packed-switch v3, :pswitch_data_3

    goto :goto_3

    :pswitch_7
    const/16 v4, 0x5f

    if-le p1, v4, :cond_8

    if-le p1, v1, :cond_4

    goto :goto_3

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bad character in input for forced code set A: ASCII value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_8
    const/16 v1, 0x20

    if-le p1, v1, :cond_5

    goto :goto_3

    :cond_5
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bad character in input for forced code set B: ASCII value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_9
    const/16 v4, 0x30

    if-lt p1, v4, :cond_7

    const/16 v4, 0x39

    if-le p1, v4, :cond_6

    if-le p1, v1, :cond_7

    :cond_6
    const/16 v1, 0xf2

    if-eq p1, v1, :cond_7

    const/16 v1, 0xf3

    if-eq p1, v1, :cond_7

    const/16 v1, 0xf4

    if-eq p1, v1, :cond_7

    goto :goto_3

    :cond_7
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bad character in input for forced code set C: ASCII value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    :goto_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Bad character in input: ASCII value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    return v3

    :cond_b
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Contents length should be between 1 and 80 characters, but got "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_data_0
    .packed-switch 0x41
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0xf1
        :pswitch_6
        :pswitch_6
        :pswitch_6
        :pswitch_6
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x63
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method

.method private static j(Ljava/lang/CharSequence;II)I
    .locals 6

    invoke-static {p0, p1}, Ltg/d;->l(Ljava/lang/CharSequence;I)Ltg/d$b;

    move-result-object v0

    sget-object v1, Ltg/d$b;->ONE_DIGIT:Ltg/d$b;

    const/16 v2, 0x65

    const/16 v3, 0x64

    if-ne v0, v1, :cond_1

    if-ne p2, v2, :cond_0

    return v2

    :cond_0
    return v3

    :cond_1
    sget-object v4, Ltg/d$b;->UNCODABLE:Ltg/d$b;

    if-ne v0, v4, :cond_4

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-ge p1, v0, :cond_3

    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    const/16 p1, 0x20

    if-lt p0, p1, :cond_2

    if-ne p2, v2, :cond_3

    const/16 p1, 0x60

    if-lt p0, p1, :cond_2

    const/16 p1, 0xf1

    if-lt p0, p1, :cond_3

    const/16 p1, 0xf4

    if-gt p0, p1, :cond_3

    :cond_2
    return v2

    :cond_3
    return v3

    :cond_4
    if-ne p2, v2, :cond_5

    sget-object v5, Ltg/d$b;->FNC_1:Ltg/d$b;

    if-ne v0, v5, :cond_5

    return v2

    :cond_5
    const/16 v2, 0x63

    if-ne p2, v2, :cond_6

    return v2

    :cond_6
    if-ne p2, v3, :cond_e

    sget-object p2, Ltg/d$b;->FNC_1:Ltg/d$b;

    if-ne v0, p2, :cond_7

    return v3

    :cond_7
    add-int/lit8 v0, p1, 0x2

    invoke-static {p0, v0}, Ltg/d;->l(Ljava/lang/CharSequence;I)Ltg/d$b;

    move-result-object v0

    if-eq v0, v4, :cond_d

    if-ne v0, v1, :cond_8

    goto :goto_1

    :cond_8
    if-ne v0, p2, :cond_a

    add-int/lit8 p1, p1, 0x3

    invoke-static {p0, p1}, Ltg/d;->l(Ljava/lang/CharSequence;I)Ltg/d$b;

    move-result-object p0

    sget-object p1, Ltg/d$b;->TWO_DIGITS:Ltg/d$b;

    if-ne p0, p1, :cond_9

    return v2

    :cond_9
    return v3

    :cond_a
    add-int/lit8 p1, p1, 0x4

    :goto_0
    invoke-static {p0, p1}, Ltg/d;->l(Ljava/lang/CharSequence;I)Ltg/d$b;

    move-result-object p2

    sget-object v0, Ltg/d$b;->TWO_DIGITS:Ltg/d$b;

    if-ne p2, v0, :cond_b

    add-int/lit8 p1, p1, 0x2

    goto :goto_0

    :cond_b
    sget-object p0, Ltg/d$b;->ONE_DIGIT:Ltg/d$b;

    if-ne p2, p0, :cond_c

    return v3

    :cond_c
    return v2

    :cond_d
    :goto_1
    return v3

    :cond_e
    sget-object p2, Ltg/d$b;->FNC_1:Ltg/d$b;

    if-ne v0, p2, :cond_f

    add-int/lit8 p1, p1, 0x1

    invoke-static {p0, p1}, Ltg/d;->l(Ljava/lang/CharSequence;I)Ltg/d$b;

    move-result-object v0

    :cond_f
    sget-object p0, Ltg/d$b;->TWO_DIGITS:Ltg/d$b;

    if-ne v0, p0, :cond_10

    return v2

    :cond_10
    return v3
.end method

.method private static k(Ljava/lang/String;I)[Z
    .locals 10

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x1

    move v4, v2

    move v5, v4

    move v6, v3

    :cond_0
    :goto_0
    if-ge v2, v0, :cond_a

    const/4 v7, -0x1

    if-ne p1, v7, :cond_1

    invoke-static {p0, v2, v5}, Ltg/d;->j(Ljava/lang/CharSequence;II)I

    move-result v7

    goto :goto_1

    :cond_1
    move v7, p1

    :goto_1
    const/16 v8, 0x64

    const/16 v9, 0x65

    if-ne v7, v5, :cond_6

    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v7

    packed-switch v7, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    if-ne v5, v9, :cond_5

    move v8, v9

    goto :goto_3

    :pswitch_1
    const/16 v8, 0x60

    goto :goto_3

    :pswitch_2
    const/16 v8, 0x61

    goto :goto_3

    :pswitch_3
    const/16 v8, 0x66

    goto :goto_3

    :goto_2
    if-eq v5, v8, :cond_4

    if-eq v5, v9, :cond_3

    add-int/lit8 v7, v2, 0x1

    if-eq v7, v0, :cond_2

    add-int/lit8 v8, v2, 0x2

    invoke-virtual {p0, v2, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    move v2, v7

    goto :goto_3

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Bad number of characters for digit only encoding."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v7

    add-int/lit8 v8, v7, -0x20

    if-gez v8, :cond_5

    add-int/lit8 v8, v8, 0x60

    goto :goto_3

    :cond_4
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v7

    add-int/lit8 v8, v7, -0x20

    :cond_5
    :goto_3
    add-int/2addr v2, v3

    goto :goto_6

    :cond_6
    if-nez v5, :cond_9

    if-eq v7, v8, :cond_8

    if-eq v7, v9, :cond_7

    const/16 v5, 0x69

    goto :goto_4

    :cond_7
    const/16 v5, 0x67

    goto :goto_4

    :cond_8
    const/16 v5, 0x68

    :goto_4
    move v8, v5

    goto :goto_5

    :cond_9
    move v8, v7

    :goto_5
    move v5, v7

    :goto_6
    sget-object v7, Ltg/c;->a:[[I

    aget-object v7, v7, v8

    invoke-interface {v1, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    mul-int/2addr v8, v6

    add-int/2addr v4, v8

    if-eqz v2, :cond_0

    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_a
    invoke-static {v1, v4}, Ltg/d;->m(Ljava/util/Collection;I)[Z

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0xf1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static l(Ljava/lang/CharSequence;I)Ltg/d$b;
    .locals 4

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-lt p1, v0, :cond_0

    sget-object p0, Ltg/d$b;->UNCODABLE:Ltg/d$b;

    return-object p0

    :cond_0
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    const/16 v2, 0xf1

    if-ne v1, v2, :cond_1

    sget-object p0, Ltg/d$b;->FNC_1:Ltg/d$b;

    return-object p0

    :cond_1
    const/16 v2, 0x30

    if-lt v1, v2, :cond_6

    const/16 v3, 0x39

    if-le v1, v3, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 p1, p1, 0x1

    if-lt p1, v0, :cond_3

    sget-object p0, Ltg/d$b;->ONE_DIGIT:Ltg/d$b;

    return-object p0

    :cond_3
    invoke-interface {p0, p1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result p0

    if-lt p0, v2, :cond_5

    if-le p0, v3, :cond_4

    goto :goto_0

    :cond_4
    sget-object p0, Ltg/d$b;->TWO_DIGITS:Ltg/d$b;

    return-object p0

    :cond_5
    :goto_0
    sget-object p0, Ltg/d$b;->ONE_DIGIT:Ltg/d$b;

    return-object p0

    :cond_6
    :goto_1
    sget-object p0, Ltg/d$b;->UNCODABLE:Ltg/d$b;

    return-object p0
.end method

.method static m(Ljava/util/Collection;I)[Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "[I>;I)[Z"
        }
    .end annotation

    rem-int/lit8 p1, p1, 0x67

    sget-object v0, Ltg/c;->a:[[I

    aget-object p1, v0, p1

    invoke-interface {p0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 p1, 0x6a

    aget-object p1, v0, p1

    invoke-interface {p0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    array-length v3, v2

    move v4, v0

    :goto_0
    if-ge v4, v3, :cond_0

    aget v5, v2, v4

    add-int/2addr v1, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    new-array p1, v1, [Z

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    const/4 v2, 0x1

    invoke-static {p1, v0, v1, v2}, Ltg/s;->b([ZI[IZ)I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_1

    :cond_2
    return-object p1
.end method


# virtual methods
.method public d(Ljava/lang/String;)[Z
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Ltg/d;->e(Ljava/lang/String;Ljava/util/Map;)[Z

    move-result-object p1

    return-object p1
.end method

.method protected e(Ljava/lang/String;Ljava/util/Map;)[Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ldg/g;",
            "*>;)[Z"
        }
    .end annotation

    invoke-static {p1, p2}, Ltg/d;->i(Ljava/lang/String;Ljava/util/Map;)I

    move-result v0

    if-eqz p2, :cond_0

    sget-object v1, Ldg/g;->CODE128_COMPACT:Ldg/g;

    invoke-interface {p2, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    new-instance p2, Ltg/d$c;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Ltg/d$c;-><init>(Ltg/d$a;)V

    invoke-static {p2, p1}, Ltg/d$c;->a(Ltg/d$c;Ljava/lang/String;)[Z

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {p1, v0}, Ltg/d;->k(Ljava/lang/String;I)[Z

    move-result-object p1

    :goto_1
    return-object p1
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

    sget-object v0, Ldg/a;->CODE_128:Ldg/a;

    invoke-static {v0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
