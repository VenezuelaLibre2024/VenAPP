.class public Lkg/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkg/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkg/n$b;
    }
.end annotation


# instance fields
.field private final a:[I

.field private final b:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/nio/charset/Charset;I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p3, p0, Lkg/n;->b:I

    new-instance v0, Lkg/h;

    invoke-direct {v0, p1, p2, p3}, Lkg/h;-><init>(Ljava/lang/String;Ljava/nio/charset/Charset;I)V

    invoke-virtual {v0}, Lkg/h;->g()I

    move-result p2

    const/4 v1, 0x1

    if-ne p2, v1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p2

    new-array p2, p2, [I

    iput-object p2, p0, Lkg/n;->a:[I

    const/4 p2, 0x0

    :goto_0
    iget-object v0, p0, Lkg/n;->a:[I

    array-length v0, v0

    if-ge p2, v0, :cond_2

    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    iget-object v1, p0, Lkg/n;->a:[I

    if-ne v0, p3, :cond_0

    const/16 v0, 0x3e8

    :cond_0
    aput v0, v1, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p1, v0, p3}, Lkg/n;->e(Ljava/lang/String;Lkg/h;I)[I

    move-result-object p1

    iput-object p1, p0, Lkg/n;->a:[I

    :cond_2
    return-void
.end method

.method static c([[Lkg/n$b;ILkg/n$b;)V
    .locals 2

    aget-object v0, p0, p1

    invoke-static {p2}, Lkg/n$b;->a(Lkg/n$b;)I

    move-result v1

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    aget-object v0, p0, p1

    invoke-static {p2}, Lkg/n$b;->a(Lkg/n$b;)I

    move-result v1

    aget-object v0, v0, v1

    invoke-static {v0}, Lkg/n$b;->b(Lkg/n$b;)I

    move-result v0

    invoke-static {p2}, Lkg/n$b;->b(Lkg/n$b;)I

    move-result v1

    if-le v0, v1, :cond_1

    :cond_0
    aget-object p0, p0, p1

    invoke-static {p2}, Lkg/n$b;->a(Lkg/n$b;)I

    move-result p1

    aput-object p2, p0, p1

    :cond_1
    return-void
.end method

.method static d(Ljava/lang/String;Lkg/h;[[Lkg/n$b;ILkg/n$b;I)V
    .locals 15

    move-object/from16 v7, p1

    move/from16 v8, p3

    move-object v0, p0

    move/from16 v9, p5

    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    move-result v10

    invoke-virtual/range {p1 .. p1}, Lkg/h;->g()I

    move-result v0

    invoke-virtual/range {p1 .. p1}, Lkg/h;->f()I

    move-result v1

    if-ltz v1, :cond_1

    if-eq v10, v9, :cond_0

    invoke-virtual/range {p1 .. p1}, Lkg/h;->f()I

    move-result v1

    invoke-virtual {v7, v10, v1}, Lkg/h;->a(CI)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lkg/h;->f()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    move v11, v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    move v11, v0

    move v0, v1

    :goto_0
    move v12, v0

    :goto_1
    if-ge v12, v11, :cond_4

    if-eq v10, v9, :cond_3

    invoke-virtual {v7, v10, v12}, Lkg/h;->a(CI)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    move-object/from16 v0, p2

    goto :goto_3

    :cond_3
    :goto_2
    add-int/lit8 v13, v8, 0x1

    new-instance v14, Lkg/n$b;

    const/4 v6, 0x0

    move-object v0, v14

    move v1, v10

    move-object/from16 v2, p1

    move v3, v12

    move-object/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lkg/n$b;-><init>(CLkg/h;ILkg/n$b;ILkg/n$a;)V

    move-object/from16 v0, p2

    invoke-static {v0, v13, v14}, Lkg/n;->c([[Lkg/n$b;ILkg/n$b;)V

    :goto_3
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_4
    return-void
.end method

.method static e(Ljava/lang/String;Lkg/h;I)[I
    .locals 12

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p1}, Lkg/h;->g()I

    move-result v2

    const/4 v3, 0x2

    new-array v3, v3, [I

    const/4 v4, 0x1

    aput v2, v3, v4

    const/4 v2, 0x0

    aput v1, v3, v2

    const-class v1, Lkg/n$b;

    invoke-static {v1, v3}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[Lkg/n$b;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, p0

    move-object v6, p1

    move-object v7, v1

    move v10, p2

    invoke-static/range {v5 .. v10}, Lkg/n;->d(Ljava/lang/String;Lkg/h;[[Lkg/n$b;ILkg/n$b;I)V

    move v3, v4

    :goto_0
    if-gt v3, v0, :cond_3

    move v11, v2

    :goto_1
    invoke-virtual {p1}, Lkg/h;->g()I

    move-result v5

    if-ge v11, v5, :cond_1

    aget-object v5, v1, v3

    aget-object v9, v5, v11

    if-eqz v9, :cond_0

    if-ge v3, v0, :cond_0

    move-object v5, p0

    move-object v6, p1

    move-object v7, v1

    move v8, v3

    move v10, p2

    invoke-static/range {v5 .. v10}, Lkg/n;->d(Ljava/lang/String;Lkg/h;[[Lkg/n$b;ILkg/n$b;I)V

    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_1
    move v5, v2

    :goto_2
    invoke-virtual {p1}, Lkg/h;->g()I

    move-result v6

    if-ge v5, v6, :cond_2

    add-int/lit8 v6, v3, -0x1

    aget-object v6, v1, v6

    const/4 v7, 0x0

    aput-object v7, v6, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    const/4 p2, -0x1

    const v3, 0x7fffffff

    move v5, v2

    :goto_3
    invoke-virtual {p1}, Lkg/h;->g()I

    move-result v6

    if-ge v5, v6, :cond_5

    aget-object v6, v1, v0

    aget-object v6, v6, v5

    if-eqz v6, :cond_4

    invoke-static {v6}, Lkg/n$b;->b(Lkg/n$b;)I

    move-result v7

    if-ge v7, v3, :cond_4

    invoke-static {v6}, Lkg/n$b;->b(Lkg/n$b;)I

    move-result p2

    move v3, p2

    move p2, v5

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    :cond_5
    if-ltz p2, :cond_c

    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    aget-object v0, v1, v0

    aget-object p2, v0, p2

    :goto_4
    if-eqz p2, :cond_a

    invoke-virtual {p2}, Lkg/n$b;->e()Z

    move-result v0

    if-eqz v0, :cond_6

    const/16 v0, 0x3e8

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    goto :goto_6

    :cond_6
    invoke-static {p2}, Lkg/n$b;->c(Lkg/n$b;)C

    move-result v0

    invoke-static {p2}, Lkg/n$b;->a(Lkg/n$b;)I

    move-result v1

    invoke-virtual {p1, v0, v1}, Lkg/h;->b(CI)[B

    move-result-object v0

    array-length v1, v0

    sub-int/2addr v1, v4

    :goto_5
    if-ltz v1, :cond_7

    aget-byte v3, v0, v1

    and-int/lit16 v3, v3, 0xff

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p0, v2, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    add-int/lit8 v1, v1, -0x1

    goto :goto_5

    :cond_7
    :goto_6
    invoke-static {p2}, Lkg/n$b;->d(Lkg/n$b;)Lkg/n$b;

    move-result-object v0

    if-nez v0, :cond_8

    move v0, v2

    goto :goto_7

    :cond_8
    invoke-static {p2}, Lkg/n$b;->d(Lkg/n$b;)Lkg/n$b;

    move-result-object v0

    invoke-static {v0}, Lkg/n$b;->a(Lkg/n$b;)I

    move-result v0

    :goto_7
    invoke-static {p2}, Lkg/n$b;->a(Lkg/n$b;)I

    move-result v1

    if-eq v0, v1, :cond_9

    invoke-static {p2}, Lkg/n$b;->a(Lkg/n$b;)I

    move-result v0

    invoke-virtual {p1, v0}, Lkg/h;->e(I)I

    move-result v0

    add-int/lit16 v0, v0, 0x100

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p0, v2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_9
    invoke-static {p2}, Lkg/n$b;->d(Lkg/n$b;)Lkg/n$b;

    move-result-object p2

    goto :goto_4

    :cond_a
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    new-array p2, p1, [I

    :goto_8
    if-ge v2, p1, :cond_b

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    aput v0, p2, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_b
    return-object p2

    :cond_c
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Internal error: failed to encode \""

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\""

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a(I)Z
    .locals 3

    if-ltz p1, :cond_1

    invoke-virtual {p0}, Lkg/n;->length()I

    move-result v0

    if-ge p1, v0, :cond_1

    iget-object v0, p0, Lkg/n;->a:[I

    aget p1, v0, p1

    const/16 v0, 0xff

    if-le p1, v0, :cond_0

    const/16 v0, 0x3e7

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(I)I
    .locals 3

    if-ltz p1, :cond_1

    invoke-virtual {p0}, Lkg/n;->length()I

    move-result v0

    if-ge p1, v0, :cond_1

    invoke-virtual {p0, p1}, Lkg/n;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lkg/n;->a:[I

    aget p1, v0, p1

    add-int/lit16 p1, p1, -0x100

    return p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "value at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is not an ECI but a character"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public charAt(I)C
    .locals 3

    if-ltz p1, :cond_2

    invoke-virtual {p0}, Lkg/n;->length()I

    move-result v0

    if-ge p1, v0, :cond_2

    invoke-virtual {p0, p1}, Lkg/n;->a(I)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0, p1}, Lkg/n;->h(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget p1, p0, Lkg/n;->b:I

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lkg/n;->a:[I

    aget p1, v0, p1

    :goto_0
    int-to-char p1, p1

    return p1

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "value at "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is not a character but an ECI"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f()I
    .locals 1

    iget v0, p0, Lkg/n;->b:I

    return v0
.end method

.method public g(II)Z
    .locals 4

    add-int v0, p1, p2

    const/4 v1, 0x1

    sub-int/2addr v0, v1

    iget-object v2, p0, Lkg/n;->a:[I

    array-length v2, v2

    const/4 v3, 0x0

    if-lt v0, v2, :cond_0

    return v3

    :cond_0
    move v0, v3

    :goto_0
    if-ge v0, p2, :cond_2

    add-int v2, p1, v0

    invoke-virtual {p0, v2}, Lkg/n;->a(I)Z

    move-result v2

    if-eqz v2, :cond_1

    return v3

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method public h(I)Z
    .locals 3

    if-ltz p1, :cond_1

    invoke-virtual {p0}, Lkg/n;->length()I

    move-result v0

    if-ge p1, v0, :cond_1

    iget-object v0, p0, Lkg/n;->a:[I

    aget p1, v0, p1

    const/16 v0, 0x3e8

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public length()I
    .locals 1

    iget-object v0, p0, Lkg/n;->a:[I

    array-length v0, v0

    return v0
.end method

.method public subSequence(II)Ljava/lang/CharSequence;
    .locals 2

    if-ltz p1, :cond_2

    if-gt p1, p2, :cond_2

    invoke-virtual {p0}, Lkg/n;->length()I

    move-result v0

    if-gt p2, v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    if-ge p1, p2, :cond_1

    invoke-virtual {p0, p1}, Lkg/n;->a(I)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p0, p1}, Lkg/n;->charAt(I)C

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "value at "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is not a character but an ECI"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    return-object v0

    :cond_2
    new-instance p2, Ljava/lang/IndexOutOfBoundsException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x0

    :goto_0
    invoke-virtual {p0}, Lkg/n;->length()I

    move-result v2

    if-ge v1, v2, :cond_3

    if-lez v1, :cond_0

    const-string v2, ", "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0, v1}, Lkg/n;->a(I)Z

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "ECI("

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Lkg/n;->b(I)I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x29

    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    invoke-virtual {p0, v1}, Lkg/n;->charAt(I)C

    move-result v2

    const/16 v3, 0x80

    if-ge v2, v3, :cond_2

    const/16 v2, 0x27

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Lkg/n;->charAt(I)C

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v1}, Lkg/n;->charAt(I)C

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method