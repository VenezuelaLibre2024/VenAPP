.class final Lv8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a([BI)Lv8/e;
    .locals 5

    new-instance v0, Lt8/e0;

    invoke-direct {v0, p0}, Lt8/e0;-><init>([B)V

    const/4 p0, 0x0

    :try_start_0
    invoke-static {v0}, Lv8/f;->c(Lt8/e0;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lv8/f;->f(Lt8/e0;)Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Lv8/f;->e(Lt8/e0;)Ljava/util/ArrayList;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, p0

    :goto_0
    if-nez v0, :cond_1

    return-object p0

    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_3

    const/4 v4, 0x2

    if-eq v1, v4, :cond_2

    return-object p0

    :cond_2
    new-instance p0, Lv8/e;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lv8/e$a;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv8/e$a;

    invoke-direct {p0, v1, v0, p1}, Lv8/e;-><init>(Lv8/e$a;Lv8/e$a;I)V

    return-object p0

    :cond_3
    new-instance p0, Lv8/e;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv8/e$a;

    invoke-direct {p0, v0, p1}, Lv8/e;-><init>(Lv8/e$a;I)V

    return-object p0
.end method

.method private static b(I)I
    .locals 1

    shr-int/lit8 v0, p0, 0x1

    and-int/lit8 p0, p0, 0x1

    neg-int p0, p0

    xor-int/2addr p0, v0

    return p0
.end method

.method private static c(Lt8/e0;)Z
    .locals 2

    const/4 v0, 0x4

    invoke-virtual {p0, v0}, Lt8/e0;->V(I)V

    invoke-virtual {p0}, Lt8/e0;->q()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Lt8/e0;->U(I)V

    const p0, 0x70726f6a

    if-ne v0, p0, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method private static d(Lt8/e0;)Lv8/e$a;
    .locals 23

    invoke-virtual/range {p0 .. p0}, Lt8/e0;->q()I

    move-result v0

    const/16 v1, 0x2710

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    return-object v2

    :cond_0
    new-array v1, v0, [F

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lt8/e0;->p()F

    move-result v5

    aput v5, v1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lt8/e0;->q()I

    move-result v4

    const/16 v5, 0x7d00

    if-le v4, v5, :cond_2

    return-object v2

    :cond_2
    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    invoke-static {v5, v6}, Ljava/lang/Math;->log(D)D

    move-result-wide v7

    int-to-double v9, v0

    mul-double/2addr v9, v5

    invoke-static {v9, v10}, Ljava/lang/Math;->log(D)D

    move-result-wide v9

    div-double/2addr v9, v7

    invoke-static {v9, v10}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v9

    double-to-int v9, v9

    new-instance v10, Lt8/d0;

    invoke-virtual/range {p0 .. p0}, Lt8/e0;->e()[B

    move-result-object v11

    invoke-direct {v10, v11}, Lt8/d0;-><init>([B)V

    invoke-virtual/range {p0 .. p0}, Lt8/e0;->f()I

    move-result v11

    const/16 v12, 0x8

    mul-int/2addr v11, v12

    invoke-virtual {v10, v11}, Lt8/d0;->p(I)V

    mul-int/lit8 v11, v4, 0x5

    new-array v11, v11, [F

    const/4 v13, 0x5

    new-array v14, v13, [I

    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_1
    if-ge v15, v4, :cond_6

    const/4 v3, 0x0

    :goto_2
    if-ge v3, v13, :cond_5

    aget v17, v14, v3

    invoke-virtual {v10, v9}, Lt8/d0;->h(I)I

    move-result v18

    invoke-static/range {v18 .. v18}, Lv8/f;->b(I)I

    move-result v18

    add-int v13, v17, v18

    if-ge v13, v0, :cond_4

    if-gez v13, :cond_3

    goto :goto_3

    :cond_3
    add-int/lit8 v17, v16, 0x1

    aget v18, v1, v13

    aput v18, v11, v16

    aput v13, v14, v3

    add-int/lit8 v3, v3, 0x1

    move/from16 v16, v17

    const/4 v13, 0x5

    goto :goto_2

    :cond_4
    :goto_3
    return-object v2

    :cond_5
    add-int/lit8 v15, v15, 0x1

    const/4 v13, 0x5

    goto :goto_1

    :cond_6
    invoke-virtual {v10}, Lt8/d0;->e()I

    move-result v0

    add-int/lit8 v0, v0, 0x7

    and-int/lit8 v0, v0, -0x8

    invoke-virtual {v10, v0}, Lt8/d0;->p(I)V

    const/16 v0, 0x20

    invoke-virtual {v10, v0}, Lt8/d0;->h(I)I

    move-result v1

    new-array v3, v1, [Lv8/e$b;

    const/4 v9, 0x0

    :goto_4
    if-ge v9, v1, :cond_b

    invoke-virtual {v10, v12}, Lt8/d0;->h(I)I

    move-result v13

    invoke-virtual {v10, v12}, Lt8/d0;->h(I)I

    move-result v14

    invoke-virtual {v10, v0}, Lt8/d0;->h(I)I

    move-result v15

    const v0, 0x1f400

    if-le v15, v0, :cond_7

    return-object v2

    :cond_7
    move/from16 v16, v13

    int-to-double v12, v4

    mul-double/2addr v12, v5

    invoke-static {v12, v13}, Ljava/lang/Math;->log(D)D

    move-result-wide v12

    div-double/2addr v12, v7

    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v12

    double-to-int v12, v12

    mul-int/lit8 v13, v15, 0x3

    new-array v13, v13, [F

    mul-int/lit8 v0, v15, 0x2

    new-array v0, v0, [F

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_5
    if-ge v5, v15, :cond_a

    invoke-virtual {v10, v12}, Lt8/d0;->h(I)I

    move-result v19

    invoke-static/range {v19 .. v19}, Lv8/f;->b(I)I

    move-result v19

    add-int v6, v6, v19

    if-ltz v6, :cond_9

    if-lt v6, v4, :cond_8

    goto :goto_6

    :cond_8
    mul-int/lit8 v19, v5, 0x3

    mul-int/lit8 v20, v6, 0x5

    aget v21, v11, v20

    aput v21, v13, v19

    add-int/lit8 v21, v19, 0x1

    add-int/lit8 v22, v20, 0x1

    aget v22, v11, v22

    aput v22, v13, v21

    add-int/lit8 v19, v19, 0x2

    add-int/lit8 v21, v20, 0x2

    aget v21, v11, v21

    aput v21, v13, v19

    mul-int/lit8 v19, v5, 0x2

    add-int/lit8 v21, v20, 0x3

    aget v21, v11, v21

    aput v21, v0, v19

    add-int/lit8 v19, v19, 0x1

    add-int/lit8 v20, v20, 0x4

    aget v20, v11, v20

    aput v20, v0, v19

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_9
    :goto_6
    return-object v2

    :cond_a
    new-instance v5, Lv8/e$b;

    move/from16 v6, v16

    invoke-direct {v5, v6, v13, v0, v14}, Lv8/e$b;-><init>(I[F[FI)V

    aput-object v5, v3, v9

    add-int/lit8 v9, v9, 0x1

    const/16 v0, 0x20

    const-wide/high16 v5, 0x4000000000000000L    # 2.0

    const/16 v12, 0x8

    goto :goto_4

    :cond_b
    new-instance v0, Lv8/e$a;

    invoke-direct {v0, v3}, Lv8/e$a;-><init>([Lv8/e$b;)V

    return-object v0
.end method

.method private static e(Lt8/e0;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt8/e0;",
            ")",
            "Ljava/util/ArrayList<",
            "Lv8/e$a;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, Lt8/e0;->H()I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    const/4 v0, 0x7

    invoke-virtual {p0, v0}, Lt8/e0;->V(I)V

    invoke-virtual {p0}, Lt8/e0;->q()I

    move-result v0

    const v2, 0x64666c38

    if-ne v0, v2, :cond_2

    new-instance v0, Lt8/e0;

    invoke-direct {v0}, Lt8/e0;-><init>()V

    new-instance v2, Ljava/util/zip/Inflater;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ljava/util/zip/Inflater;-><init>(Z)V

    :try_start_0
    invoke-static {p0, v0, v2}, Lt8/r0;->q0(Lt8/e0;Lt8/e0;Ljava/util/zip/Inflater;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v2}, Ljava/util/zip/Inflater;->end()V

    if-nez p0, :cond_1

    return-object v1

    :cond_1
    move-object p0, v0

    goto :goto_0

    :catchall_0
    move-exception p0

    invoke-virtual {v2}, Ljava/util/zip/Inflater;->end()V

    throw p0

    :cond_2
    const v2, 0x72617720

    if-eq v0, v2, :cond_3

    return-object v1

    :cond_3
    :goto_0
    invoke-static {p0}, Lv8/f;->g(Lt8/e0;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0
.end method

.method private static f(Lt8/e0;)Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt8/e0;",
            ")",
            "Ljava/util/ArrayList<",
            "Lv8/e$a;",
            ">;"
        }
    .end annotation

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Lt8/e0;->V(I)V

    invoke-virtual {p0}, Lt8/e0;->f()I

    move-result v0

    invoke-virtual {p0}, Lt8/e0;->g()I

    move-result v1

    :goto_0
    const/4 v2, 0x0

    if-ge v0, v1, :cond_3

    invoke-virtual {p0}, Lt8/e0;->q()I

    move-result v3

    add-int/2addr v3, v0

    if-le v3, v0, :cond_3

    if-le v3, v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p0}, Lt8/e0;->q()I

    move-result v0

    const v2, 0x79746d70

    if-eq v0, v2, :cond_2

    const v2, 0x6d736870

    if-ne v0, v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0, v3}, Lt8/e0;->U(I)V

    move v0, v3

    goto :goto_0

    :cond_2
    :goto_1
    invoke-virtual {p0, v3}, Lt8/e0;->T(I)V

    invoke-static {p0}, Lv8/f;->e(Lt8/e0;)Ljava/util/ArrayList;

    move-result-object p0

    return-object p0

    :cond_3
    :goto_2
    return-object v2
.end method

.method private static g(Lt8/e0;)Ljava/util/ArrayList;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt8/e0;",
            ")",
            "Ljava/util/ArrayList<",
            "Lv8/e$a;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lt8/e0;->f()I

    move-result v1

    invoke-virtual {p0}, Lt8/e0;->g()I

    move-result v2

    :goto_0
    if-ge v1, v2, :cond_4

    invoke-virtual {p0}, Lt8/e0;->q()I

    move-result v3

    add-int/2addr v3, v1

    const/4 v4, 0x0

    if-le v3, v1, :cond_3

    if-le v3, v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lt8/e0;->q()I

    move-result v1

    const v5, 0x6d657368

    if-ne v1, v5, :cond_2

    invoke-static {p0}, Lv8/f;->d(Lt8/e0;)Lv8/e$a;

    move-result-object v1

    if-nez v1, :cond_1

    return-object v4

    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p0, v3}, Lt8/e0;->U(I)V

    move v1, v3

    goto :goto_0

    :cond_3
    :goto_1
    return-object v4

    :cond_4
    return-object v0
.end method