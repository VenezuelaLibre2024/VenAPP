.class Li7/h0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/b0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li7/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field private final a:Lt8/d0;

.field private final b:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Li7/i0;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Landroid/util/SparseIntArray;

.field private final d:I

.field final synthetic e:Li7/h0;


# direct methods
.method public constructor <init>(Li7/h0;I)V
    .locals 1

    iput-object p1, p0, Li7/h0$b;->e:Li7/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Lt8/d0;

    const/4 v0, 0x5

    new-array v0, v0, [B

    invoke-direct {p1, v0}, Lt8/d0;-><init>([B)V

    iput-object p1, p0, Li7/h0$b;->a:Lt8/d0;

    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Li7/h0$b;->b:Landroid/util/SparseArray;

    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, Li7/h0$b;->c:Landroid/util/SparseIntArray;

    iput p2, p0, Li7/h0$b;->d:I

    return-void
.end method

.method private c(Lt8/e0;I)Li7/i0$b;
    .locals 12

    invoke-virtual {p1}, Lt8/e0;->f()I

    move-result v0

    add-int/2addr p2, v0

    const/4 v1, -0x1

    const/4 v2, 0x0

    move-object v3, v2

    :goto_0
    invoke-virtual {p1}, Lt8/e0;->f()I

    move-result v4

    if-ge v4, p2, :cond_d

    invoke-virtual {p1}, Lt8/e0;->H()I

    move-result v4

    invoke-virtual {p1}, Lt8/e0;->H()I

    move-result v5

    invoke-virtual {p1}, Lt8/e0;->f()I

    move-result v6

    add-int/2addr v6, v5

    if-le v6, p2, :cond_0

    goto/16 :goto_6

    :cond_0
    const/4 v5, 0x5

    const/16 v7, 0xac

    const/16 v8, 0x87

    const/16 v9, 0x81

    if-ne v4, v5, :cond_4

    invoke-virtual {p1}, Lt8/e0;->J()J

    move-result-wide v4

    const-wide/32 v10, 0x41432d33

    cmp-long v10, v4, v10

    if-nez v10, :cond_1

    goto :goto_2

    :cond_1
    const-wide/32 v9, 0x45414333

    cmp-long v9, v4, v9

    if-nez v9, :cond_2

    goto :goto_3

    :cond_2
    const-wide/32 v8, 0x41432d34

    cmp-long v8, v4, v8

    if-nez v8, :cond_3

    :goto_1
    move v1, v7

    goto/16 :goto_5

    :cond_3
    const-wide/32 v7, 0x48455643

    cmp-long v4, v4, v7

    if-nez v4, :cond_c

    const/16 v1, 0x24

    goto/16 :goto_5

    :cond_4
    const/16 v5, 0x6a

    if-ne v4, v5, :cond_5

    :goto_2
    move v1, v9

    goto :goto_5

    :cond_5
    const/16 v5, 0x7a

    if-ne v4, v5, :cond_6

    :goto_3
    move v1, v8

    goto :goto_5

    :cond_6
    const/16 v5, 0x7f

    if-ne v4, v5, :cond_7

    invoke-virtual {p1}, Lt8/e0;->H()I

    move-result v4

    const/16 v5, 0x15

    if-ne v4, v5, :cond_c

    goto :goto_1

    :cond_7
    const/16 v5, 0x7b

    if-ne v4, v5, :cond_8

    const/16 v1, 0x8a

    goto :goto_5

    :cond_8
    const/16 v5, 0xa

    const/4 v7, 0x3

    if-ne v4, v5, :cond_9

    invoke-virtual {p1, v7}, Lt8/e0;->E(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    :cond_9
    const/16 v5, 0x59

    if-ne v4, v5, :cond_b

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :goto_4
    invoke-virtual {p1}, Lt8/e0;->f()I

    move-result v3

    if-ge v3, v6, :cond_a

    invoke-virtual {p1, v7}, Lt8/e0;->E(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lt8/e0;->H()I

    move-result v4

    const/4 v8, 0x4

    new-array v9, v8, [B

    const/4 v10, 0x0

    invoke-virtual {p1, v9, v10, v8}, Lt8/e0;->l([BII)V

    new-instance v8, Li7/i0$a;

    invoke-direct {v8, v3, v4, v9}, Li7/i0$a;-><init>(Ljava/lang/String;I[B)V

    invoke-interface {v1, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    move-object v3, v1

    move v1, v5

    goto :goto_5

    :cond_b
    const/16 v5, 0x6f

    if-ne v4, v5, :cond_c

    const/16 v1, 0x101

    :cond_c
    :goto_5
    invoke-virtual {p1}, Lt8/e0;->f()I

    move-result v4

    sub-int/2addr v6, v4

    invoke-virtual {p1, v6}, Lt8/e0;->V(I)V

    goto/16 :goto_0

    :cond_d
    :goto_6
    invoke-virtual {p1, p2}, Lt8/e0;->U(I)V

    new-instance v4, Li7/i0$b;

    invoke-virtual {p1}, Lt8/e0;->e()[B

    move-result-object p1

    invoke-static {p1, v0, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-direct {v4, v1, v2, v3, p1}, Li7/i0$b;-><init>(ILjava/lang/String;Ljava/util/List;[B)V

    return-object v4
.end method


# virtual methods
.method public a(Lt8/n0;Ly6/m;Li7/i0$d;)V
    .locals 0

    return-void
.end method

.method public b(Lt8/e0;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p1 .. p1}, Lt8/e0;->H()I

    move-result v2

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    return-void

    :cond_0
    iget-object v2, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v2}, Li7/h0;->l(Li7/h0;)I

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eq v2, v5, :cond_2

    iget-object v2, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v2}, Li7/h0;->l(Li7/h0;)I

    move-result v2

    if-eq v2, v3, :cond_2

    iget-object v2, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v2}, Li7/h0;->g(Li7/h0;)I

    move-result v2

    if-ne v2, v5, :cond_1

    goto :goto_0

    :cond_1
    new-instance v2, Lt8/n0;

    iget-object v6, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v6}, Li7/h0;->m(Li7/h0;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lt8/n0;

    invoke-virtual {v6}, Lt8/n0;->c()J

    move-result-wide v6

    invoke-direct {v2, v6, v7}, Lt8/n0;-><init>(J)V

    iget-object v6, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v6}, Li7/h0;->m(Li7/h0;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    :goto_0
    iget-object v2, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v2}, Li7/h0;->m(Li7/h0;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt8/n0;

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lt8/e0;->H()I

    move-result v6

    and-int/lit16 v6, v6, 0x80

    if-nez v6, :cond_3

    return-void

    :cond_3
    invoke-virtual {v1, v5}, Lt8/e0;->V(I)V

    invoke-virtual/range {p1 .. p1}, Lt8/e0;->N()I

    move-result v6

    const/4 v7, 0x3

    invoke-virtual {v1, v7}, Lt8/e0;->V(I)V

    iget-object v8, v0, Li7/h0$b;->a:Lt8/d0;

    invoke-virtual {v1, v8, v3}, Lt8/e0;->k(Lt8/d0;I)V

    iget-object v8, v0, Li7/h0$b;->a:Lt8/d0;

    invoke-virtual {v8, v7}, Lt8/d0;->r(I)V

    iget-object v8, v0, Li7/h0$b;->e:Li7/h0;

    iget-object v9, v0, Li7/h0$b;->a:Lt8/d0;

    const/16 v10, 0xd

    invoke-virtual {v9, v10}, Lt8/d0;->h(I)I

    move-result v9

    invoke-static {v8, v9}, Li7/h0;->n(Li7/h0;I)I

    iget-object v8, v0, Li7/h0$b;->a:Lt8/d0;

    invoke-virtual {v1, v8, v3}, Lt8/e0;->k(Lt8/d0;I)V

    iget-object v8, v0, Li7/h0$b;->a:Lt8/d0;

    const/4 v9, 0x4

    invoke-virtual {v8, v9}, Lt8/d0;->r(I)V

    iget-object v8, v0, Li7/h0$b;->a:Lt8/d0;

    const/16 v11, 0xc

    invoke-virtual {v8, v11}, Lt8/d0;->h(I)I

    move-result v8

    invoke-virtual {v1, v8}, Lt8/e0;->V(I)V

    iget-object v8, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v8}, Li7/h0;->l(Li7/h0;)I

    move-result v8

    const/16 v12, 0x2000

    const/16 v13, 0x15

    if-ne v8, v3, :cond_4

    iget-object v8, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v8}, Li7/h0;->o(Li7/h0;)Li7/i0;

    move-result-object v8

    if-nez v8, :cond_4

    new-instance v8, Li7/i0$b;

    sget-object v14, Lt8/r0;->f:[B

    const/4 v15, 0x0

    invoke-direct {v8, v13, v15, v15, v14}, Li7/i0$b;-><init>(ILjava/lang/String;Ljava/util/List;[B)V

    iget-object v14, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v14}, Li7/h0;->q(Li7/h0;)Li7/i0$c;

    move-result-object v15

    invoke-interface {v15, v13, v8}, Li7/i0$c;->b(ILi7/i0$b;)Li7/i0;

    move-result-object v8

    invoke-static {v14, v8}, Li7/h0;->p(Li7/h0;Li7/i0;)Li7/i0;

    iget-object v8, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v8}, Li7/h0;->o(Li7/h0;)Li7/i0;

    move-result-object v8

    if-eqz v8, :cond_4

    iget-object v8, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v8}, Li7/h0;->o(Li7/h0;)Li7/i0;

    move-result-object v8

    iget-object v14, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v14}, Li7/h0;->r(Li7/h0;)Ly6/m;

    move-result-object v14

    new-instance v15, Li7/i0$d;

    invoke-direct {v15, v6, v13, v12}, Li7/i0$d;-><init>(III)V

    invoke-interface {v8, v2, v14, v15}, Li7/i0;->a(Lt8/n0;Ly6/m;Li7/i0$d;)V

    :cond_4
    iget-object v8, v0, Li7/h0$b;->b:Landroid/util/SparseArray;

    invoke-virtual {v8}, Landroid/util/SparseArray;->clear()V

    iget-object v8, v0, Li7/h0$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v8}, Landroid/util/SparseIntArray;->clear()V

    invoke-virtual/range {p1 .. p1}, Lt8/e0;->a()I

    move-result v8

    :goto_2
    if-lez v8, :cond_c

    iget-object v14, v0, Li7/h0$b;->a:Lt8/d0;

    const/4 v15, 0x5

    invoke-virtual {v1, v14, v15}, Lt8/e0;->k(Lt8/d0;I)V

    iget-object v14, v0, Li7/h0$b;->a:Lt8/d0;

    const/16 v4, 0x8

    invoke-virtual {v14, v4}, Lt8/d0;->h(I)I

    move-result v4

    iget-object v14, v0, Li7/h0$b;->a:Lt8/d0;

    invoke-virtual {v14, v7}, Lt8/d0;->r(I)V

    iget-object v14, v0, Li7/h0$b;->a:Lt8/d0;

    invoke-virtual {v14, v10}, Lt8/d0;->h(I)I

    move-result v14

    iget-object v7, v0, Li7/h0$b;->a:Lt8/d0;

    invoke-virtual {v7, v9}, Lt8/d0;->r(I)V

    iget-object v7, v0, Li7/h0$b;->a:Lt8/d0;

    invoke-virtual {v7, v11}, Lt8/d0;->h(I)I

    move-result v7

    invoke-direct {v0, v1, v7}, Li7/h0$b;->c(Lt8/e0;I)Li7/i0$b;

    move-result-object v9

    const/4 v10, 0x6

    if-eq v4, v10, :cond_5

    if-ne v4, v15, :cond_6

    :cond_5
    iget v4, v9, Li7/i0$b;->a:I

    :cond_6
    add-int/lit8 v7, v7, 0x5

    sub-int/2addr v8, v7

    iget-object v7, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v7}, Li7/h0;->l(Li7/h0;)I

    move-result v7

    if-ne v7, v3, :cond_7

    move v7, v4

    goto :goto_3

    :cond_7
    move v7, v14

    :goto_3
    iget-object v10, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v10}, Li7/h0;->s(Li7/h0;)Landroid/util/SparseBooleanArray;

    move-result-object v10

    invoke-virtual {v10, v7}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v10

    if-eqz v10, :cond_8

    goto :goto_5

    :cond_8
    iget-object v10, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v10}, Li7/h0;->l(Li7/h0;)I

    move-result v10

    if-ne v10, v3, :cond_9

    if-ne v4, v13, :cond_9

    iget-object v4, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v4}, Li7/h0;->o(Li7/h0;)Li7/i0;

    move-result-object v4

    goto :goto_4

    :cond_9
    iget-object v10, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v10}, Li7/h0;->q(Li7/h0;)Li7/i0$c;

    move-result-object v10

    invoke-interface {v10, v4, v9}, Li7/i0$c;->b(ILi7/i0$b;)Li7/i0;

    move-result-object v4

    :goto_4
    iget-object v9, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v9}, Li7/h0;->l(Li7/h0;)I

    move-result v9

    if-ne v9, v3, :cond_a

    iget-object v9, v0, Li7/h0$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v9, v7, v12}, Landroid/util/SparseIntArray;->get(II)I

    move-result v9

    if-ge v14, v9, :cond_b

    :cond_a
    iget-object v9, v0, Li7/h0$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v9, v7, v14}, Landroid/util/SparseIntArray;->put(II)V

    iget-object v9, v0, Li7/h0$b;->b:Landroid/util/SparseArray;

    invoke-virtual {v9, v7, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_b
    :goto_5
    const/4 v4, 0x0

    const/4 v7, 0x3

    const/4 v9, 0x4

    const/16 v10, 0xd

    goto/16 :goto_2

    :cond_c
    iget-object v1, v0, Li7/h0$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v1}, Landroid/util/SparseIntArray;->size()I

    move-result v1

    const/4 v4, 0x0

    :goto_6
    if-ge v4, v1, :cond_f

    iget-object v7, v0, Li7/h0$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v7, v4}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v7

    iget-object v8, v0, Li7/h0$b;->c:Landroid/util/SparseIntArray;

    invoke-virtual {v8, v4}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v8

    iget-object v9, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v9}, Li7/h0;->s(Li7/h0;)Landroid/util/SparseBooleanArray;

    move-result-object v9

    invoke-virtual {v9, v7, v5}, Landroid/util/SparseBooleanArray;->put(IZ)V

    iget-object v9, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v9}, Li7/h0;->t(Li7/h0;)Landroid/util/SparseBooleanArray;

    move-result-object v9

    invoke-virtual {v9, v8, v5}, Landroid/util/SparseBooleanArray;->put(IZ)V

    iget-object v9, v0, Li7/h0$b;->b:Landroid/util/SparseArray;

    invoke-virtual {v9, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Li7/i0;

    if-eqz v9, :cond_e

    iget-object v10, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v10}, Li7/h0;->o(Li7/h0;)Li7/i0;

    move-result-object v10

    if-eq v9, v10, :cond_d

    iget-object v10, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v10}, Li7/h0;->r(Li7/h0;)Ly6/m;

    move-result-object v10

    new-instance v11, Li7/i0$d;

    invoke-direct {v11, v6, v7, v12}, Li7/i0$d;-><init>(III)V

    invoke-interface {v9, v2, v10, v11}, Li7/i0;->a(Lt8/n0;Ly6/m;Li7/i0$d;)V

    :cond_d
    iget-object v7, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v7}, Li7/h0;->d(Li7/h0;)Landroid/util/SparseArray;

    move-result-object v7

    invoke-virtual {v7, v8, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_e
    add-int/lit8 v4, v4, 0x1

    goto :goto_6

    :cond_f
    iget-object v1, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v1}, Li7/h0;->l(Li7/h0;)I

    move-result v1

    if-ne v1, v3, :cond_10

    iget-object v1, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v1}, Li7/h0;->h(Li7/h0;)Z

    move-result v1

    if-nez v1, :cond_12

    iget-object v1, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v1}, Li7/h0;->r(Li7/h0;)Ly6/m;

    move-result-object v1

    invoke-interface {v1}, Ly6/m;->q()V

    iget-object v1, v0, Li7/h0$b;->e:Li7/h0;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Li7/h0;->j(Li7/h0;I)I

    :goto_7
    iget-object v1, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v1, v5}, Li7/h0;->i(Li7/h0;Z)Z

    goto :goto_9

    :cond_10
    const/4 v2, 0x0

    iget-object v1, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v1}, Li7/h0;->d(Li7/h0;)Landroid/util/SparseArray;

    move-result-object v1

    iget v3, v0, Li7/h0$b;->d:I

    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->remove(I)V

    iget-object v1, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v1}, Li7/h0;->l(Li7/h0;)I

    move-result v3

    if-ne v3, v5, :cond_11

    move v4, v2

    goto :goto_8

    :cond_11
    iget-object v2, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v2}, Li7/h0;->g(Li7/h0;)I

    move-result v2

    add-int/lit8 v4, v2, -0x1

    :goto_8
    invoke-static {v1, v4}, Li7/h0;->j(Li7/h0;I)I

    iget-object v1, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v1}, Li7/h0;->g(Li7/h0;)I

    move-result v1

    if-nez v1, :cond_12

    iget-object v1, v0, Li7/h0$b;->e:Li7/h0;

    invoke-static {v1}, Li7/h0;->r(Li7/h0;)Ly6/m;

    move-result-object v1

    invoke-interface {v1}, Ly6/m;->q()V

    goto :goto_7

    :cond_12
    :goto_9
    return-void
.end method
