.class final Lq8/m$i;
.super Lq8/m$h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lq8/m$h<",
        "Lq8/m$i;",
        ">;"
    }
.end annotation


# instance fields
.field private final A:Z

.field private final B:Z

.field private final C:I

.field private final e:Z

.field private final f:Lq8/m$d;

.field private final r:Z

.field private final s:Z

.field private final t:I

.field private final u:I

.field private final v:I

.field private final w:I

.field private final x:Z

.field private final y:Z

.field private final z:I


# direct methods
.method public constructor <init>(ILv7/d1;ILq8/m$d;IIZ)V
    .locals 4

    invoke-direct {p0, p1, p2, p3}, Lq8/m$h;-><init>(ILv7/d1;I)V

    iput-object p4, p0, Lq8/m$i;->f:Lq8/m$d;

    iget-boolean p1, p4, Lq8/m$d;->q0:Z

    if-eqz p1, :cond_0

    const/16 p1, 0x18

    goto :goto_0

    :cond_0
    const/16 p1, 0x10

    :goto_0
    iget-boolean p2, p4, Lq8/m$d;->p0:Z

    const/4 p3, 0x1

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    and-int p2, p6, p1

    if-eqz p2, :cond_1

    move p2, p3

    goto :goto_1

    :cond_1
    move p2, v0

    :goto_1
    iput-boolean p2, p0, Lq8/m$i;->y:Z

    const/high16 p2, -0x40800000    # -1.0f

    const/4 p6, -0x1

    if-eqz p7, :cond_6

    iget-object v1, p0, Lq8/m$h;->d:Lt6/u1;

    iget v2, v1, Lt6/u1;->B:I

    if-eq v2, p6, :cond_2

    iget v3, p4, Lq8/y;->a:I

    if-gt v2, v3, :cond_6

    :cond_2
    iget v2, v1, Lt6/u1;->C:I

    if-eq v2, p6, :cond_3

    iget v3, p4, Lq8/y;->b:I

    if-gt v2, v3, :cond_6

    :cond_3
    iget v2, v1, Lt6/u1;->D:F

    cmpl-float v3, v2, p2

    if-eqz v3, :cond_4

    iget v3, p4, Lq8/y;->c:I

    int-to-float v3, v3

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_6

    :cond_4
    iget v1, v1, Lt6/u1;->s:I

    if-eq v1, p6, :cond_5

    iget v2, p4, Lq8/y;->d:I

    if-gt v1, v2, :cond_6

    :cond_5
    move v1, p3

    goto :goto_2

    :cond_6
    move v1, v0

    :goto_2
    iput-boolean v1, p0, Lq8/m$i;->e:Z

    if-eqz p7, :cond_b

    iget-object p7, p0, Lq8/m$h;->d:Lt6/u1;

    iget v1, p7, Lt6/u1;->B:I

    if-eq v1, p6, :cond_7

    iget v2, p4, Lq8/y;->e:I

    if-lt v1, v2, :cond_b

    :cond_7
    iget v1, p7, Lt6/u1;->C:I

    if-eq v1, p6, :cond_8

    iget v2, p4, Lq8/y;->f:I

    if-lt v1, v2, :cond_b

    :cond_8
    iget v1, p7, Lt6/u1;->D:F

    cmpl-float p2, v1, p2

    if-eqz p2, :cond_9

    iget p2, p4, Lq8/y;->r:I

    int-to-float p2, p2

    cmpl-float p2, v1, p2

    if-ltz p2, :cond_b

    :cond_9
    iget p2, p7, Lt6/u1;->s:I

    if-eq p2, p6, :cond_a

    iget p6, p4, Lq8/y;->s:I

    if-lt p2, p6, :cond_b

    :cond_a
    move p2, p3

    goto :goto_3

    :cond_b
    move p2, v0

    :goto_3
    iput-boolean p2, p0, Lq8/m$i;->r:Z

    invoke-static {p5, v0}, Lq8/m;->I(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lq8/m$i;->s:Z

    iget-object p2, p0, Lq8/m$h;->d:Lt6/u1;

    iget p6, p2, Lt6/u1;->s:I

    iput p6, p0, Lq8/m$i;->t:I

    invoke-virtual {p2}, Lt6/u1;->g()I

    move-result p2

    iput p2, p0, Lq8/m$i;->u:I

    iget-object p2, p0, Lq8/m$h;->d:Lt6/u1;

    iget p2, p2, Lt6/u1;->e:I

    iget p6, p4, Lq8/y;->x:I

    invoke-static {p2, p6}, Lq8/m;->t(II)I

    move-result p2

    iput p2, p0, Lq8/m$i;->w:I

    iget-object p2, p0, Lq8/m$h;->d:Lt6/u1;

    iget p2, p2, Lt6/u1;->e:I

    if-eqz p2, :cond_d

    and-int/2addr p2, p3

    if-eqz p2, :cond_c

    goto :goto_4

    :cond_c
    move p2, v0

    goto :goto_5

    :cond_d
    :goto_4
    move p2, p3

    :goto_5
    iput-boolean p2, p0, Lq8/m$i;->x:Z

    move p2, v0

    :goto_6
    iget-object p6, p4, Lq8/y;->w:Lcom/google/common/collect/w;

    invoke-virtual {p6}, Ljava/util/AbstractCollection;->size()I

    move-result p6

    if-ge p2, p6, :cond_f

    iget-object p6, p0, Lq8/m$h;->d:Lt6/u1;

    iget-object p6, p6, Lt6/u1;->w:Ljava/lang/String;

    if-eqz p6, :cond_e

    iget-object p7, p4, Lq8/y;->w:Lcom/google/common/collect/w;

    invoke-interface {p7, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p7

    invoke-virtual {p6, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p6

    if-eqz p6, :cond_e

    goto :goto_7

    :cond_e
    add-int/lit8 p2, p2, 0x1

    goto :goto_6

    :cond_f
    const p2, 0x7fffffff

    :goto_7
    iput p2, p0, Lq8/m$i;->v:I

    invoke-static {p5}, Lt6/r3;->j(I)I

    move-result p2

    const/16 p4, 0x80

    if-ne p2, p4, :cond_10

    move p2, p3

    goto :goto_8

    :cond_10
    move p2, v0

    :goto_8
    iput-boolean p2, p0, Lq8/m$i;->A:Z

    invoke-static {p5}, Lt6/r3;->t(I)I

    move-result p2

    const/16 p4, 0x40

    if-ne p2, p4, :cond_11

    goto :goto_9

    :cond_11
    move p3, v0

    :goto_9
    iput-boolean p3, p0, Lq8/m$i;->B:Z

    iget-object p2, p0, Lq8/m$h;->d:Lt6/u1;

    iget-object p2, p2, Lt6/u1;->w:Ljava/lang/String;

    invoke-static {p2}, Lq8/m;->u(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lq8/m$i;->C:I

    invoke-direct {p0, p5, p1}, Lq8/m$i;->q(II)I

    move-result p1

    iput p1, p0, Lq8/m$i;->z:I

    return-void
.end method

.method public static synthetic i(Lq8/m$i;Lq8/m$i;)I
    .locals 0

    invoke-static {p0, p1}, Lq8/m$i;->m(Lq8/m$i;Lq8/m$i;)I

    move-result p0

    return p0
.end method

.method public static synthetic l(Lq8/m$i;Lq8/m$i;)I
    .locals 0

    invoke-static {p0, p1}, Lq8/m$i;->n(Lq8/m$i;Lq8/m$i;)I

    move-result p0

    return p0
.end method

.method private static m(Lq8/m$i;Lq8/m$i;)I
    .locals 4

    invoke-static {}, Lcom/google/common/collect/o;->j()Lcom/google/common/collect/o;

    move-result-object v0

    iget-boolean v1, p0, Lq8/m$i;->s:Z

    iget-boolean v2, p1, Lq8/m$i;->s:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/o;->g(ZZ)Lcom/google/common/collect/o;

    move-result-object v0

    iget v1, p0, Lq8/m$i;->w:I

    iget v2, p1, Lq8/m$i;->w:I

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/o;->d(II)Lcom/google/common/collect/o;

    move-result-object v0

    iget-boolean v1, p0, Lq8/m$i;->x:Z

    iget-boolean v2, p1, Lq8/m$i;->x:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/o;->g(ZZ)Lcom/google/common/collect/o;

    move-result-object v0

    iget-boolean v1, p0, Lq8/m$i;->e:Z

    iget-boolean v2, p1, Lq8/m$i;->e:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/o;->g(ZZ)Lcom/google/common/collect/o;

    move-result-object v0

    iget-boolean v1, p0, Lq8/m$i;->r:Z

    iget-boolean v2, p1, Lq8/m$i;->r:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/o;->g(ZZ)Lcom/google/common/collect/o;

    move-result-object v0

    iget v1, p0, Lq8/m$i;->v:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget v2, p1, Lq8/m$i;->v:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {}, Lcom/google/common/collect/r0;->c()Lcom/google/common/collect/r0;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/common/collect/r0;->f()Lcom/google/common/collect/r0;

    move-result-object v3

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/common/collect/o;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/o;

    move-result-object v0

    iget-boolean v1, p0, Lq8/m$i;->A:Z

    iget-boolean v2, p1, Lq8/m$i;->A:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/o;->g(ZZ)Lcom/google/common/collect/o;

    move-result-object v0

    iget-boolean v1, p0, Lq8/m$i;->B:Z

    iget-boolean v2, p1, Lq8/m$i;->B:Z

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/o;->g(ZZ)Lcom/google/common/collect/o;

    move-result-object v0

    iget-boolean v1, p0, Lq8/m$i;->A:Z

    if-eqz v1, :cond_0

    iget-boolean v1, p0, Lq8/m$i;->B:Z

    if-eqz v1, :cond_0

    iget p0, p0, Lq8/m$i;->C:I

    iget p1, p1, Lq8/m$i;->C:I

    invoke-virtual {v0, p0, p1}, Lcom/google/common/collect/o;->d(II)Lcom/google/common/collect/o;

    move-result-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/google/common/collect/o;->i()I

    move-result p0

    return p0
.end method

.method private static n(Lq8/m$i;Lq8/m$i;)I
    .locals 5

    iget-boolean v0, p0, Lq8/m$i;->e:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lq8/m$i;->s:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lq8/m;->v()Lcom/google/common/collect/r0;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Lq8/m;->v()Lcom/google/common/collect/r0;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/collect/r0;->f()Lcom/google/common/collect/r0;

    move-result-object v0

    :goto_0
    invoke-static {}, Lcom/google/common/collect/o;->j()Lcom/google/common/collect/o;

    move-result-object v1

    iget v2, p0, Lq8/m$i;->t:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lq8/m$i;->t:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Lq8/m$i;->f:Lq8/m$d;

    iget-boolean v4, v4, Lq8/y;->H:Z

    if-eqz v4, :cond_1

    invoke-static {}, Lq8/m;->v()Lcom/google/common/collect/r0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/common/collect/r0;->f()Lcom/google/common/collect/r0;

    move-result-object v4

    goto :goto_1

    :cond_1
    invoke-static {}, Lq8/m;->w()Lcom/google/common/collect/r0;

    move-result-object v4

    :goto_1
    invoke-virtual {v1, v2, v3, v4}, Lcom/google/common/collect/o;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/o;

    move-result-object v1

    iget v2, p0, Lq8/m$i;->u:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lq8/m$i;->u:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/common/collect/o;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/o;

    move-result-object v1

    iget p0, p0, Lq8/m$i;->t:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    iget p1, p1, Lq8/m$i;->t:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v1, p0, p1, v0}, Lcom/google/common/collect/o;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/o;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/common/collect/o;->i()I

    move-result p0

    return p0
.end method

.method public static o(Ljava/util/List;Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lq8/m$i;",
            ">;",
            "Ljava/util/List<",
            "Lq8/m$i;",
            ">;)I"
        }
    .end annotation

    invoke-static {}, Lcom/google/common/collect/o;->j()Lcom/google/common/collect/o;

    move-result-object v0

    new-instance v1, Lq8/p;

    invoke-direct {v1}, Lq8/p;-><init>()V

    invoke-static {p0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq8/m$i;

    new-instance v2, Lq8/p;

    invoke-direct {v2}, Lq8/p;-><init>()V

    invoke-static {p1, v2}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq8/m$i;

    new-instance v3, Lq8/p;

    invoke-direct {v3}, Lq8/p;-><init>()V

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/common/collect/o;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/o;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Lcom/google/common/collect/o;->d(II)Lcom/google/common/collect/o;

    move-result-object v0

    new-instance v1, Lq8/q;

    invoke-direct {v1}, Lq8/q;-><init>()V

    invoke-static {p0, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq8/m$i;

    new-instance v1, Lq8/q;

    invoke-direct {v1}, Lq8/q;-><init>()V

    invoke-static {p1, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq8/m$i;

    new-instance v1, Lq8/q;

    invoke-direct {v1}, Lq8/q;-><init>()V

    invoke-virtual {v0, p0, p1, v1}, Lcom/google/common/collect/o;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/o;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/common/collect/o;->i()I

    move-result p0

    return p0
.end method

.method public static p(ILv7/d1;Lq8/m$d;[II)Lcom/google/common/collect/w;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lv7/d1;",
            "Lq8/m$d;",
            "[II)",
            "Lcom/google/common/collect/w<",
            "Lq8/m$i;",
            ">;"
        }
    .end annotation

    move-object/from16 v8, p1

    move-object/from16 v9, p2

    iget v0, v9, Lq8/y;->t:I

    iget v1, v9, Lq8/y;->u:I

    iget-boolean v2, v9, Lq8/y;->v:Z

    invoke-static {v8, v0, v1, v2}, Lq8/m;->s(Lv7/d1;IIZ)I

    move-result v10

    invoke-static {}, Lcom/google/common/collect/w;->p()Lcom/google/common/collect/w$a;

    move-result-object v11

    const/4 v12, 0x0

    move v13, v12

    :goto_0
    iget v0, v8, Lv7/d1;->a:I

    if-ge v13, v0, :cond_2

    invoke-virtual {v8, v13}, Lv7/d1;->d(I)Lt6/u1;

    move-result-object v0

    invoke-virtual {v0}, Lt6/u1;->g()I

    move-result v0

    const v1, 0x7fffffff

    if-eq v10, v1, :cond_1

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    if-gt v0, v10, :cond_0

    goto :goto_1

    :cond_0
    move v7, v12

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v0, 0x1

    move v7, v0

    :goto_2
    new-instance v14, Lq8/m$i;

    aget v5, p3, v13

    move-object v0, v14

    move v1, p0

    move-object/from16 v2, p1

    move v3, v13

    move-object/from16 v4, p2

    move/from16 v6, p4

    invoke-direct/range {v0 .. v7}, Lq8/m$i;-><init>(ILv7/d1;ILq8/m$d;IIZ)V

    invoke-virtual {v11, v14}, Lcom/google/common/collect/w$a;->h(Ljava/lang/Object;)Lcom/google/common/collect/w$a;

    add-int/lit8 v13, v13, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {v11}, Lcom/google/common/collect/w$a;->k()Lcom/google/common/collect/w;

    move-result-object v0

    return-object v0
.end method

.method private q(II)I
    .locals 2

    iget-object v0, p0, Lq8/m$h;->d:Lt6/u1;

    iget v0, v0, Lt6/u1;->e:I

    and-int/lit16 v0, v0, 0x4000

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Lq8/m$i;->f:Lq8/m$d;

    iget-boolean v0, v0, Lq8/m$d;->y0:Z

    invoke-static {p1, v0}, Lq8/m;->I(IZ)Z

    move-result v0

    if-nez v0, :cond_1

    return v1

    :cond_1
    iget-boolean v0, p0, Lq8/m$i;->e:Z

    if-nez v0, :cond_2

    iget-object v0, p0, Lq8/m$i;->f:Lq8/m$d;

    iget-boolean v0, v0, Lq8/m$d;->o0:Z

    if-nez v0, :cond_2

    return v1

    :cond_2
    invoke-static {p1, v1}, Lq8/m;->I(IZ)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lq8/m$i;->r:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lq8/m$i;->e:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lq8/m$h;->d:Lt6/u1;

    iget v0, v0, Lt6/u1;->s:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lq8/m$i;->f:Lq8/m$d;

    iget-boolean v1, v0, Lq8/y;->I:Z

    if-nez v1, :cond_3

    iget-boolean v0, v0, Lq8/y;->H:Z

    if-nez v0, :cond_3

    and-int/2addr p1, p2

    if-eqz p1, :cond_3

    const/4 p1, 0x2

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    :goto_0
    return p1
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lq8/m$i;->z:I

    return v0
.end method

.method public bridge synthetic h(Lq8/m$h;)Z
    .locals 0

    check-cast p1, Lq8/m$i;

    invoke-virtual {p0, p1}, Lq8/m$i;->r(Lq8/m$i;)Z

    move-result p1

    return p1
.end method

.method public r(Lq8/m$i;)Z
    .locals 2

    iget-boolean v0, p0, Lq8/m$i;->y:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lq8/m$h;->d:Lt6/u1;

    iget-object v0, v0, Lt6/u1;->w:Ljava/lang/String;

    iget-object v1, p1, Lq8/m$h;->d:Lt6/u1;

    iget-object v1, v1, Lt6/u1;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lq8/m$i;->f:Lq8/m$d;

    iget-boolean v0, v0, Lq8/m$d;->r0:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lq8/m$i;->A:Z

    iget-boolean v1, p1, Lq8/m$i;->A:Z

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lq8/m$i;->B:Z

    iget-boolean p1, p1, Lq8/m$i;->B:Z

    if-ne v0, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
