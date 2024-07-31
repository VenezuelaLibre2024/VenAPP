.class final Lq8/m$b;
.super Lq8/m$h;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lq8/m$h<",
        "Lq8/m$b;",
        ">;",
        "Ljava/lang/Comparable<",
        "Lq8/m$b;",
        ">;"
    }
.end annotation


# instance fields
.field private final A:Z

.field private final B:I

.field private final C:I

.field private final D:I

.field private final E:I

.field private final F:Z

.field private final G:Z

.field private final e:I

.field private final f:Z

.field private final r:Ljava/lang/String;

.field private final s:Lq8/m$d;

.field private final t:Z

.field private final u:I

.field private final v:I

.field private final w:I

.field private final x:Z

.field private final y:I

.field private final z:I


# direct methods
.method public constructor <init>(ILv7/d1;ILq8/m$d;IZLeb/p;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lv7/d1;",
            "I",
            "Lq8/m$d;",
            "IZ",
            "Leb/p<",
            "Lt6/u1;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3}, Lq8/m$h;-><init>(ILv7/d1;I)V

    iput-object p4, p0, Lq8/m$b;->s:Lq8/m$d;

    iget-object p1, p0, Lq8/m$h;->d:Lt6/u1;

    iget-object p1, p1, Lt6/u1;->c:Ljava/lang/String;

    invoke-static {p1}, Lq8/m;->Q(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lq8/m$b;->r:Ljava/lang/String;

    const/4 p1, 0x0

    invoke-static {p5, p1}, Lq8/m;->I(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lq8/m$b;->t:Z

    move p2, p1

    :goto_0
    iget-object p3, p4, Lq8/y;->y:Lcom/google/common/collect/w;

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    const v0, 0x7fffffff

    if-ge p2, p3, :cond_1

    iget-object p3, p0, Lq8/m$h;->d:Lt6/u1;

    iget-object v1, p4, Lq8/y;->y:Lcom/google/common/collect/w;

    invoke-interface {v1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {p3, v1, p1}, Lq8/m;->B(Lt6/u1;Ljava/lang/String;Z)I

    move-result p3

    if-lez p3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_1
    move p3, p1

    move p2, v0

    :goto_1
    iput p2, p0, Lq8/m$b;->v:I

    iput p3, p0, Lq8/m$b;->u:I

    iget-object p2, p0, Lq8/m$h;->d:Lt6/u1;

    iget p2, p2, Lt6/u1;->e:I

    iget p3, p4, Lq8/y;->z:I

    invoke-static {p2, p3}, Lq8/m;->t(II)I

    move-result p2

    iput p2, p0, Lq8/m$b;->w:I

    iget-object p2, p0, Lq8/m$h;->d:Lt6/u1;

    iget p3, p2, Lt6/u1;->e:I

    const/4 v1, 0x1

    if-eqz p3, :cond_3

    and-int/2addr p3, v1

    if-eqz p3, :cond_2

    goto :goto_2

    :cond_2
    move p3, p1

    goto :goto_3

    :cond_3
    :goto_2
    move p3, v1

    :goto_3
    iput-boolean p3, p0, Lq8/m$b;->x:Z

    iget p3, p2, Lt6/u1;->d:I

    and-int/2addr p3, v1

    if-eqz p3, :cond_4

    move p3, v1

    goto :goto_4

    :cond_4
    move p3, p1

    :goto_4
    iput-boolean p3, p0, Lq8/m$b;->A:Z

    iget p3, p2, Lt6/u1;->J:I

    iput p3, p0, Lq8/m$b;->B:I

    iget v2, p2, Lt6/u1;->K:I

    iput v2, p0, Lq8/m$b;->C:I

    iget v2, p2, Lt6/u1;->s:I

    iput v2, p0, Lq8/m$b;->D:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_5

    iget v4, p4, Lq8/y;->B:I

    if-gt v2, v4, :cond_7

    :cond_5
    if-eq p3, v3, :cond_6

    iget v2, p4, Lq8/y;->A:I

    if-gt p3, v2, :cond_7

    :cond_6
    invoke-interface {p7, p2}, Leb/p;->apply(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_7

    move p2, v1

    goto :goto_5

    :cond_7
    move p2, p1

    :goto_5
    iput-boolean p2, p0, Lq8/m$b;->f:Z

    invoke-static {}, Lt8/r0;->h0()[Ljava/lang/String;

    move-result-object p2

    move p3, p1

    :goto_6
    array-length p7, p2

    if-ge p3, p7, :cond_9

    iget-object p7, p0, Lq8/m$h;->d:Lt6/u1;

    aget-object v2, p2, p3

    invoke-static {p7, v2, p1}, Lq8/m;->B(Lt6/u1;Ljava/lang/String;Z)I

    move-result p7

    if-lez p7, :cond_8

    goto :goto_7

    :cond_8
    add-int/lit8 p3, p3, 0x1

    goto :goto_6

    :cond_9
    move p7, p1

    move p3, v0

    :goto_7
    iput p3, p0, Lq8/m$b;->y:I

    iput p7, p0, Lq8/m$b;->z:I

    move p2, p1

    :goto_8
    iget-object p3, p4, Lq8/y;->C:Lcom/google/common/collect/w;

    invoke-virtual {p3}, Ljava/util/AbstractCollection;->size()I

    move-result p3

    if-ge p2, p3, :cond_b

    iget-object p3, p0, Lq8/m$h;->d:Lt6/u1;

    iget-object p3, p3, Lt6/u1;->w:Ljava/lang/String;

    if-eqz p3, :cond_a

    iget-object p7, p4, Lq8/y;->C:Lcom/google/common/collect/w;

    invoke-interface {p7, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p7

    invoke-virtual {p3, p7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_a

    move v0, p2

    goto :goto_9

    :cond_a
    add-int/lit8 p2, p2, 0x1

    goto :goto_8

    :cond_b
    :goto_9
    iput v0, p0, Lq8/m$b;->E:I

    invoke-static {p5}, Lt6/r3;->j(I)I

    move-result p2

    const/16 p3, 0x80

    if-ne p2, p3, :cond_c

    move p2, v1

    goto :goto_a

    :cond_c
    move p2, p1

    :goto_a
    iput-boolean p2, p0, Lq8/m$b;->F:Z

    invoke-static {p5}, Lt6/r3;->t(I)I

    move-result p2

    const/16 p3, 0x40

    if-ne p2, p3, :cond_d

    move p1, v1

    :cond_d
    iput-boolean p1, p0, Lq8/m$b;->G:Z

    invoke-direct {p0, p5, p6}, Lq8/m$b;->n(IZ)I

    move-result p1

    iput p1, p0, Lq8/m$b;->e:I

    return-void
.end method

.method public static i(Ljava/util/List;Ljava/util/List;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lq8/m$b;",
            ">;",
            "Ljava/util/List<",
            "Lq8/m$b;",
            ">;)I"
        }
    .end annotation

    invoke-static {p0}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq8/m$b;

    invoke-static {p1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq8/m$b;

    invoke-virtual {p0, p1}, Lq8/m$b;->l(Lq8/m$b;)I

    move-result p0

    return p0
.end method

.method public static m(ILv7/d1;Lq8/m$d;[IZLeb/p;)Lcom/google/common/collect/w;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lv7/d1;",
            "Lq8/m$d;",
            "[IZ",
            "Leb/p<",
            "Lt6/u1;",
            ">;)",
            "Lcom/google/common/collect/w<",
            "Lq8/m$b;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/common/collect/w;->p()Lcom/google/common/collect/w$a;

    move-result-object v0

    const/4 v1, 0x0

    move-object v10, p1

    :goto_0
    iget v2, v10, Lv7/d1;->a:I

    if-ge v1, v2, :cond_0

    new-instance v11, Lq8/m$b;

    aget v7, p3, v1

    move-object v2, v11

    move v3, p0

    move-object v4, p1

    move v5, v1

    move-object v6, p2

    move/from16 v8, p4

    move-object/from16 v9, p5

    invoke-direct/range {v2 .. v9}, Lq8/m$b;-><init>(ILv7/d1;ILq8/m$d;IZLeb/p;)V

    invoke-virtual {v0, v11}, Lcom/google/common/collect/w$a;->h(Ljava/lang/Object;)Lcom/google/common/collect/w$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/google/common/collect/w$a;->k()Lcom/google/common/collect/w;

    move-result-object v0

    return-object v0
.end method

.method private n(IZ)I
    .locals 2

    iget-object v0, p0, Lq8/m$b;->s:Lq8/m$d;

    iget-boolean v0, v0, Lq8/m$d;->y0:Z

    invoke-static {p1, v0}, Lq8/m;->I(IZ)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lq8/m$b;->f:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lq8/m$b;->s:Lq8/m$d;

    iget-boolean v0, v0, Lq8/m$d;->s0:Z

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-static {p1, v1}, Lq8/m;->I(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-boolean p1, p0, Lq8/m$b;->f:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lq8/m$h;->d:Lt6/u1;

    iget p1, p1, Lt6/u1;->s:I

    const/4 v0, -0x1

    if-eq p1, v0, :cond_3

    iget-object p1, p0, Lq8/m$b;->s:Lq8/m$d;

    iget-boolean v0, p1, Lq8/y;->I:Z

    if-nez v0, :cond_3

    iget-boolean v0, p1, Lq8/y;->H:Z

    if-nez v0, :cond_3

    iget-boolean p1, p1, Lq8/m$d;->A0:Z

    if-nez p1, :cond_2

    if-nez p2, :cond_3

    :cond_2
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

    iget v0, p0, Lq8/m$b;->e:I

    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lq8/m$b;

    invoke-virtual {p0, p1}, Lq8/m$b;->l(Lq8/m$b;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic h(Lq8/m$h;)Z
    .locals 0

    check-cast p1, Lq8/m$b;

    invoke-virtual {p0, p1}, Lq8/m$b;->o(Lq8/m$b;)Z

    move-result p1

    return p1
.end method

.method public l(Lq8/m$b;)I
    .locals 5

    iget-boolean v0, p0, Lq8/m$b;->f:Z

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lq8/m$b;->t:Z

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

    iget-boolean v2, p0, Lq8/m$b;->t:Z

    iget-boolean v3, p1, Lq8/m$b;->t:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/o;->g(ZZ)Lcom/google/common/collect/o;

    move-result-object v1

    iget v2, p0, Lq8/m$b;->v:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lq8/m$b;->v:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Lcom/google/common/collect/r0;->c()Lcom/google/common/collect/r0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/common/collect/r0;->f()Lcom/google/common/collect/r0;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/common/collect/o;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/o;

    move-result-object v1

    iget v2, p0, Lq8/m$b;->u:I

    iget v3, p1, Lq8/m$b;->u:I

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/o;->d(II)Lcom/google/common/collect/o;

    move-result-object v1

    iget v2, p0, Lq8/m$b;->w:I

    iget v3, p1, Lq8/m$b;->w:I

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/o;->d(II)Lcom/google/common/collect/o;

    move-result-object v1

    iget-boolean v2, p0, Lq8/m$b;->A:Z

    iget-boolean v3, p1, Lq8/m$b;->A:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/o;->g(ZZ)Lcom/google/common/collect/o;

    move-result-object v1

    iget-boolean v2, p0, Lq8/m$b;->x:Z

    iget-boolean v3, p1, Lq8/m$b;->x:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/o;->g(ZZ)Lcom/google/common/collect/o;

    move-result-object v1

    iget v2, p0, Lq8/m$b;->y:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lq8/m$b;->y:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Lcom/google/common/collect/r0;->c()Lcom/google/common/collect/r0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/common/collect/r0;->f()Lcom/google/common/collect/r0;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/common/collect/o;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/o;

    move-result-object v1

    iget v2, p0, Lq8/m$b;->z:I

    iget v3, p1, Lq8/m$b;->z:I

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/o;->d(II)Lcom/google/common/collect/o;

    move-result-object v1

    iget-boolean v2, p0, Lq8/m$b;->f:Z

    iget-boolean v3, p1, Lq8/m$b;->f:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/o;->g(ZZ)Lcom/google/common/collect/o;

    move-result-object v1

    iget v2, p0, Lq8/m$b;->E:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lq8/m$b;->E:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {}, Lcom/google/common/collect/r0;->c()Lcom/google/common/collect/r0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/common/collect/r0;->f()Lcom/google/common/collect/r0;

    move-result-object v4

    invoke-virtual {v1, v2, v3, v4}, Lcom/google/common/collect/o;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/o;

    move-result-object v1

    iget v2, p0, Lq8/m$b;->D:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lq8/m$b;->D:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Lq8/m$b;->s:Lq8/m$d;

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

    iget-boolean v2, p0, Lq8/m$b;->F:Z

    iget-boolean v3, p1, Lq8/m$b;->F:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/o;->g(ZZ)Lcom/google/common/collect/o;

    move-result-object v1

    iget-boolean v2, p0, Lq8/m$b;->G:Z

    iget-boolean v3, p1, Lq8/m$b;->G:Z

    invoke-virtual {v1, v2, v3}, Lcom/google/common/collect/o;->g(ZZ)Lcom/google/common/collect/o;

    move-result-object v1

    iget v2, p0, Lq8/m$b;->B:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lq8/m$b;->B:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/common/collect/o;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/o;

    move-result-object v1

    iget v2, p0, Lq8/m$b;->C:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lq8/m$b;->C:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1, v2, v3, v0}, Lcom/google/common/collect/o;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/o;

    move-result-object v1

    iget v2, p0, Lq8/m$b;->D:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    iget v3, p1, Lq8/m$b;->D:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    iget-object v4, p0, Lq8/m$b;->r:Ljava/lang/String;

    iget-object p1, p1, Lq8/m$b;->r:Ljava/lang/String;

    invoke-static {v4, p1}, Lt8/r0;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-static {}, Lq8/m;->w()Lcom/google/common/collect/r0;

    move-result-object v0

    :goto_2
    invoke-virtual {v1, v2, v3, v0}, Lcom/google/common/collect/o;->f(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lcom/google/common/collect/o;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/common/collect/o;->i()I

    move-result p1

    return p1
.end method

.method public o(Lq8/m$b;)Z
    .locals 4

    iget-object v0, p0, Lq8/m$b;->s:Lq8/m$d;

    iget-boolean v1, v0, Lq8/m$d;->v0:Z

    const/4 v2, -0x1

    if-nez v1, :cond_0

    iget-object v1, p0, Lq8/m$h;->d:Lt6/u1;

    iget v1, v1, Lt6/u1;->J:I

    if-eq v1, v2, :cond_3

    iget-object v3, p1, Lq8/m$h;->d:Lt6/u1;

    iget v3, v3, Lt6/u1;->J:I

    if-ne v1, v3, :cond_3

    :cond_0
    iget-boolean v0, v0, Lq8/m$d;->t0:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lq8/m$h;->d:Lt6/u1;

    iget-object v0, v0, Lt6/u1;->w:Ljava/lang/String;

    if-eqz v0, :cond_3

    iget-object v1, p1, Lq8/m$h;->d:Lt6/u1;

    iget-object v1, v1, Lt6/u1;->w:Ljava/lang/String;

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_1
    iget-object v0, p0, Lq8/m$b;->s:Lq8/m$d;

    iget-boolean v1, v0, Lq8/m$d;->u0:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lq8/m$h;->d:Lt6/u1;

    iget v1, v1, Lt6/u1;->K:I

    if-eq v1, v2, :cond_3

    iget-object v2, p1, Lq8/m$h;->d:Lt6/u1;

    iget v2, v2, Lt6/u1;->K:I

    if-ne v1, v2, :cond_3

    :cond_2
    iget-boolean v0, v0, Lq8/m$d;->w0:Z

    if-nez v0, :cond_4

    iget-boolean v0, p0, Lq8/m$b;->F:Z

    iget-boolean v1, p1, Lq8/m$b;->F:Z

    if-ne v0, v1, :cond_3

    iget-boolean v0, p0, Lq8/m$b;->G:Z

    iget-boolean p1, p1, Lq8/m$b;->G:Z

    if-ne v0, p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    goto :goto_1

    :cond_4
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method
