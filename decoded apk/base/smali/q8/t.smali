.class public abstract Lq8/t;
.super Lq8/a0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/t$a;
    }
.end annotation


# instance fields
.field private c:Lq8/t$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lq8/a0;-><init>()V

    return-void
.end method

.method private static i([Lt6/r3;Lv7/d1;[IZ)I
    .locals 10

    array-length v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move v3, v1

    move v4, v3

    move v5, v2

    :goto_0
    array-length v6, p0

    if-ge v3, v6, :cond_4

    aget-object v6, p0, v3

    move v7, v1

    move v8, v7

    :goto_1
    iget v9, p1, Lv7/d1;->a:I

    if-ge v7, v9, :cond_0

    invoke-virtual {p1, v7}, Lv7/d1;->d(I)Lt6/u1;

    move-result-object v9

    invoke-interface {v6, v9}, Lt6/r3;->a(Lt6/u1;)I

    move-result v9

    invoke-static {v9}, Lt6/r3;->F(I)I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v8

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_0
    aget v6, p2, v3

    if-nez v6, :cond_1

    move v6, v2

    goto :goto_2

    :cond_1
    move v6, v1

    :goto_2
    if-gt v8, v4, :cond_2

    if-ne v8, v4, :cond_3

    if-eqz p3, :cond_3

    if-nez v5, :cond_3

    if-eqz v6, :cond_3

    :cond_2
    move v0, v3

    move v5, v6

    move v4, v8

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return v0
.end method

.method private static j(Lt6/r3;Lv7/d1;)[I
    .locals 3

    iget v0, p1, Lv7/d1;->a:I

    new-array v0, v0, [I

    const/4 v1, 0x0

    :goto_0
    iget v2, p1, Lv7/d1;->a:I

    if-ge v1, v2, :cond_0

    invoke-virtual {p1, v1}, Lv7/d1;->d(I)Lt6/u1;

    move-result-object v2

    invoke-interface {p0, v2}, Lt6/r3;->a(Lt6/u1;)I

    move-result v2

    aput v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static k([Lt6/r3;)[I
    .locals 4

    array-length v0, p0

    new-array v1, v0, [I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    aget-object v3, p0, v2

    invoke-interface {v3}, Lt6/r3;->y()I

    move-result v3

    aput v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method


# virtual methods
.method public final e(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lq8/t$a;

    iput-object p1, p0, Lq8/t;->c:Lq8/t$a;

    return-void
.end method

.method public final g([Lt6/r3;Lv7/f1;Lv7/a0$b;Lt6/d4;)Lq8/b0;
    .locals 14

    move-object v0, p1

    move-object/from16 v1, p2

    array-length v2, v0

    const/4 v3, 0x1

    add-int/2addr v2, v3

    new-array v2, v2, [I

    array-length v4, v0

    add-int/2addr v4, v3

    new-array v5, v4, [[Lv7/d1;

    array-length v6, v0

    add-int/2addr v6, v3

    new-array v6, v6, [[[I

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    if-ge v8, v4, :cond_0

    iget v9, v1, Lv7/f1;->a:I

    new-array v10, v9, [Lv7/d1;

    aput-object v10, v5, v8

    new-array v9, v9, [[I

    aput-object v9, v6, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lq8/t;->k([Lt6/r3;)[I

    move-result-object v4

    move v8, v7

    :goto_1
    iget v9, v1, Lv7/f1;->a:I

    if-ge v8, v9, :cond_3

    invoke-virtual {v1, v8}, Lv7/f1;->c(I)Lv7/d1;

    move-result-object v9

    iget v10, v9, Lv7/d1;->c:I

    const/4 v11, 0x5

    if-ne v10, v11, :cond_1

    move v10, v3

    goto :goto_2

    :cond_1
    move v10, v7

    :goto_2
    invoke-static {p1, v9, v2, v10}, Lq8/t;->i([Lt6/r3;Lv7/d1;[IZ)I

    move-result v10

    array-length v11, v0

    if-ne v10, v11, :cond_2

    iget v11, v9, Lv7/d1;->a:I

    new-array v11, v11, [I

    goto :goto_3

    :cond_2
    aget-object v11, v0, v10

    invoke-static {v11, v9}, Lq8/t;->j(Lt6/r3;Lv7/d1;)[I

    move-result-object v11

    :goto_3
    aget v12, v2, v10

    aget-object v13, v5, v10

    aput-object v9, v13, v12

    aget-object v9, v6, v10

    aput-object v11, v9, v12

    add-int/2addr v12, v3

    aput v12, v2, v10

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_3
    array-length v1, v0

    new-array v10, v1, [Lv7/f1;

    array-length v1, v0

    new-array v8, v1, [Ljava/lang/String;

    array-length v1, v0

    new-array v9, v1, [I

    :goto_4
    array-length v1, v0

    if-ge v7, v1, :cond_4

    aget v1, v2, v7

    new-instance v3, Lv7/f1;

    aget-object v11, v5, v7

    invoke-static {v11, v1}, Lt8/r0;->H0([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [Lv7/d1;

    invoke-direct {v3, v11}, Lv7/f1;-><init>([Lv7/d1;)V

    aput-object v3, v10, v7

    aget-object v3, v6, v7

    invoke-static {v3, v1}, Lt8/r0;->H0([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [[I

    aput-object v1, v6, v7

    aget-object v1, v0, v7

    invoke-interface {v1}, Lt6/r3;->getName()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v8, v7

    aget-object v1, v0, v7

    invoke-interface {v1}, Lt6/r3;->g()I

    move-result v1

    aput v1, v9, v7

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_4
    array-length v1, v0

    aget v1, v2, v1

    new-instance v13, Lv7/f1;

    array-length v0, v0

    aget-object v0, v5, v0

    invoke-static {v0, v1}, Lt8/r0;->H0([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv7/d1;

    invoke-direct {v13, v0}, Lv7/f1;-><init>([Lv7/d1;)V

    new-instance v0, Lq8/t$a;

    move-object v7, v0

    move-object v11, v4

    move-object v12, v6

    invoke-direct/range {v7 .. v13}, Lq8/t$a;-><init>([Ljava/lang/String;[I[Lv7/f1;[I[[[ILv7/f1;)V

    move-object v7, p0

    move-object v8, v0

    move-object v9, v6

    move-object v10, v4

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    invoke-virtual/range {v7 .. v12}, Lq8/t;->l(Lq8/t$a;[[[I[ILv7/a0$b;Lt6/d4;)Landroid/util/Pair;

    move-result-object v1

    iget-object v2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v2, [Lq8/u;

    invoke-static {v0, v2}, Lq8/z;->b(Lq8/t$a;[Lq8/u;)Lt6/i4;

    move-result-object v2

    new-instance v3, Lq8/b0;

    iget-object v4, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v4, [Lt6/s3;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast v1, [Lq8/r;

    invoke-direct {v3, v4, v1, v2, v0}, Lq8/b0;-><init>([Lt6/s3;[Lq8/r;Lt6/i4;Ljava/lang/Object;)V

    return-object v3
.end method

.method protected abstract l(Lq8/t$a;[[[I[ILv7/a0$b;Lt6/d4;)Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq8/t$a;",
            "[[[I[I",
            "Lv7/a0$b;",
            "Lt6/d4;",
            ")",
            "Landroid/util/Pair<",
            "[",
            "Lt6/s3;",
            "[",
            "Lq8/r;",
            ">;"
        }
    .end annotation
.end method
