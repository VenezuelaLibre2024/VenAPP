.class public final Lu8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "[B>;"
        }
    .end annotation
.end field

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:F

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/util/List;IIIFLjava/lang/String;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "[B>;IIIF",
            "Ljava/lang/String;",
            "III)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu8/f;->a:Ljava/util/List;

    iput p2, p0, Lu8/f;->b:I

    iput p3, p0, Lu8/f;->c:I

    iput p4, p0, Lu8/f;->d:I

    iput p5, p0, Lu8/f;->e:F

    iput-object p6, p0, Lu8/f;->i:Ljava/lang/String;

    iput p7, p0, Lu8/f;->f:I

    iput p8, p0, Lu8/f;->g:I

    iput p9, p0, Lu8/f;->h:I

    return-void
.end method

.method public static a(Lt8/e0;)Lu8/f;
    .locals 30

    move-object/from16 v0, p0

    const/16 v1, 0x15

    :try_start_0
    invoke-virtual {v0, v1}, Lt8/e0;->V(I)V

    invoke-virtual/range {p0 .. p0}, Lt8/e0;->H()I

    move-result v1

    and-int/lit8 v1, v1, 0x3

    invoke-virtual/range {p0 .. p0}, Lt8/e0;->H()I

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lt8/e0;->f()I

    move-result v3

    const/4 v4, 0x0

    move v5, v4

    move v6, v5

    :goto_0
    const/4 v7, 0x1

    if-ge v5, v2, :cond_1

    invoke-virtual {v0, v7}, Lt8/e0;->V(I)V

    invoke-virtual/range {p0 .. p0}, Lt8/e0;->N()I

    move-result v7

    move v8, v4

    :goto_1
    if-ge v8, v7, :cond_0

    invoke-virtual/range {p0 .. p0}, Lt8/e0;->N()I

    move-result v9

    add-int/lit8 v10, v9, 0x4

    add-int/2addr v6, v10

    invoke-virtual {v0, v9}, Lt8/e0;->V(I)V

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v3}, Lt8/e0;->U(I)V

    new-array v3, v6, [B

    const/4 v5, -0x1

    const/high16 v8, 0x3f800000    # 1.0f

    const/4 v9, 0x0

    move v13, v5

    move v14, v13

    move/from16 v17, v14

    move/from16 v18, v17

    move/from16 v19, v18

    move v15, v8

    move-object/from16 v16, v9

    move v5, v4

    move v8, v5

    :goto_2
    if-ge v5, v2, :cond_4

    invoke-virtual/range {p0 .. p0}, Lt8/e0;->H()I

    move-result v9

    and-int/lit8 v9, v9, 0x3f

    invoke-virtual/range {p0 .. p0}, Lt8/e0;->N()I

    move-result v10

    move v11, v4

    :goto_3
    if-ge v11, v10, :cond_3

    invoke-virtual/range {p0 .. p0}, Lt8/e0;->N()I

    move-result v12

    sget-object v7, Lt8/x;->a:[B

    move/from16 v20, v2

    array-length v2, v7

    invoke-static {v7, v4, v3, v8, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v2, v7

    add-int/2addr v8, v2

    invoke-virtual/range {p0 .. p0}, Lt8/e0;->e()[B

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lt8/e0;->f()I

    move-result v7

    invoke-static {v2, v7, v3, v8, v12}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    const/16 v2, 0x21

    if-ne v9, v2, :cond_2

    if-nez v11, :cond_2

    add-int v2, v8, v12

    invoke-static {v3, v8, v2}, Lt8/x;->h([BII)Lt8/x$a;

    move-result-object v2

    iget v13, v2, Lt8/x$a;->h:I

    iget v14, v2, Lt8/x$a;->i:I

    iget v7, v2, Lt8/x$a;->k:I

    iget v15, v2, Lt8/x$a;->l:I

    iget v4, v2, Lt8/x$a;->m:I

    move/from16 v16, v4

    iget v4, v2, Lt8/x$a;->j:F

    move/from16 v17, v4

    iget v4, v2, Lt8/x$a;->a:I

    move/from16 v18, v7

    iget-boolean v7, v2, Lt8/x$a;->b:Z

    move/from16 v27, v9

    iget v9, v2, Lt8/x$a;->c:I

    move/from16 v28, v10

    iget v10, v2, Lt8/x$a;->d:I

    move/from16 v19, v13

    iget-object v13, v2, Lt8/x$a;->e:[I

    iget v2, v2, Lt8/x$a;->f:I

    move/from16 v21, v4

    move/from16 v22, v7

    move/from16 v23, v9

    move/from16 v24, v10

    move-object/from16 v25, v13

    move/from16 v26, v2

    invoke-static/range {v21 .. v26}, Lt8/e;->c(IZII[II)Ljava/lang/String;

    move-result-object v2

    move/from16 v13, v19

    move/from16 v19, v16

    move-object/from16 v16, v2

    move/from16 v29, v18

    move/from16 v18, v15

    move/from16 v15, v17

    move/from16 v17, v29

    goto :goto_4

    :cond_2
    move/from16 v27, v9

    move/from16 v28, v10

    :goto_4
    add-int/2addr v8, v12

    invoke-virtual {v0, v12}, Lt8/e0;->V(I)V

    add-int/lit8 v11, v11, 0x1

    move/from16 v2, v20

    move/from16 v9, v27

    move/from16 v10, v28

    const/4 v4, 0x0

    const/4 v7, 0x1

    goto :goto_3

    :cond_3
    move/from16 v20, v2

    add-int/lit8 v5, v5, 0x1

    const/4 v4, 0x0

    const/4 v7, 0x1

    goto/16 :goto_2

    :cond_4
    if-nez v6, :cond_5

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    goto :goto_5

    :cond_5
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :goto_5
    move-object v11, v0

    new-instance v0, Lu8/f;

    const/4 v2, 0x1

    add-int/lit8 v12, v1, 0x1

    move-object v10, v0

    invoke-direct/range {v10 .. v19}, Lu8/f;-><init>(Ljava/util/List;IIIFLjava/lang/String;III)V
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    const-string v1, "Error parsing HEVC config"

    invoke-static {v1, v0}, Lt6/b3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lt6/b3;

    move-result-object v0

    throw v0
.end method
