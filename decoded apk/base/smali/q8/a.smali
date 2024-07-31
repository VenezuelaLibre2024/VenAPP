.class public Lq8/a;
.super Lq8/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq8/a$a;,
        Lq8/a$b;
    }
.end annotation


# instance fields
.field private final h:Ls8/e;

.field private final i:J

.field private final j:J

.field private final k:J

.field private final l:I

.field private final m:I

.field private final n:F

.field private final o:F

.field private final p:Lcom/google/common/collect/w;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/w<",
            "Lq8/a$a;",
            ">;"
        }
    .end annotation
.end field

.field private final q:Lt8/d;

.field private r:F

.field private s:I

.field private t:I

.field private u:J

.field private v:Lx7/n;


# direct methods
.method protected constructor <init>(Lv7/d1;[IILs8/e;JJJIIFFLjava/util/List;Lt8/d;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lv7/d1;",
            "[II",
            "Ls8/e;",
            "JJJIIFF",
            "Ljava/util/List<",
            "Lq8/a$a;",
            ">;",
            "Lt8/d;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0, p1, p2, p3}, Lq8/c;-><init>(Lv7/d1;[II)V

    cmp-long v1, p9, p5

    if-gez v1, :cond_0

    const-string v1, "AdaptiveTrackSelection"

    const-string v2, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs"

    invoke-static {v1, v2}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    move-object v3, p4

    move-wide v1, p5

    goto :goto_0

    :cond_0
    move-object v3, p4

    move-wide/from16 v1, p9

    :goto_0
    iput-object v3, v0, Lq8/a;->h:Ls8/e;

    const-wide/16 v3, 0x3e8

    mul-long v5, p5, v3

    iput-wide v5, v0, Lq8/a;->i:J

    mul-long v5, p7, v3

    iput-wide v5, v0, Lq8/a;->j:J

    mul-long/2addr v1, v3

    iput-wide v1, v0, Lq8/a;->k:J

    move/from16 v1, p11

    iput v1, v0, Lq8/a;->l:I

    move/from16 v1, p12

    iput v1, v0, Lq8/a;->m:I

    move/from16 v1, p13

    iput v1, v0, Lq8/a;->n:F

    move/from16 v1, p14

    iput v1, v0, Lq8/a;->o:F

    invoke-static/range {p15 .. p15}, Lcom/google/common/collect/w;->r(Ljava/util/Collection;)Lcom/google/common/collect/w;

    move-result-object v1

    iput-object v1, v0, Lq8/a;->p:Lcom/google/common/collect/w;

    move-object/from16 v1, p16

    iput-object v1, v0, Lq8/a;->q:Lt8/d;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Lq8/a;->r:F

    const/4 v1, 0x0

    iput v1, v0, Lq8/a;->t:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v1, v0, Lq8/a;->u:J

    return-void
.end method

.method private A(JJ)I
    .locals 4

    invoke-direct {p0, p3, p4}, Lq8/a;->C(J)J

    move-result-wide p3

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget v2, p0, Lq8/c;->b:I

    if-ge v0, v2, :cond_3

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v2, p1, v2

    if-eqz v2, :cond_0

    invoke-virtual {p0, v0, p1, p2}, Lq8/c;->j(IJ)Z

    move-result v2

    if-nez v2, :cond_2

    :cond_0
    invoke-virtual {p0, v0}, Lq8/c;->a(I)Lt6/u1;

    move-result-object v1

    iget v2, v1, Lt6/u1;->s:I

    invoke-virtual {p0, v1, v2, p3, p4}, Lq8/a;->z(Lt6/u1;IJ)Z

    move-result v1

    if-eqz v1, :cond_1

    return v0

    :cond_1
    move v1, v0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return v1
.end method

.method private static B([Lq8/r$a;)Lcom/google/common/collect/w;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lq8/r$a;",
            ")",
            "Lcom/google/common/collect/w<",
            "Lcom/google/common/collect/w<",
            "Lq8/a$a;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p0

    const-wide/16 v4, 0x0

    const/4 v6, 0x1

    if-ge v2, v3, :cond_1

    aget-object v3, p0, v2

    if-eqz v3, :cond_0

    iget-object v3, v3, Lq8/r$a;->b:[I

    array-length v3, v3

    if-le v3, v6, :cond_0

    invoke-static {}, Lcom/google/common/collect/w;->p()Lcom/google/common/collect/w$a;

    move-result-object v3

    new-instance v6, Lq8/a$a;

    invoke-direct {v6, v4, v5, v4, v5}, Lq8/a$a;-><init>(JJ)V

    invoke-virtual {v3, v6}, Lcom/google/common/collect/w$a;->h(Ljava/lang/Object;)Lcom/google/common/collect/w$a;

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    :goto_1
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Lq8/a;->G([Lq8/r$a;)[[J

    move-result-object v2

    array-length v3, v2

    new-array v3, v3, [I

    array-length v7, v2

    new-array v7, v7, [J

    move v8, v1

    :goto_2
    array-length v9, v2

    if-ge v8, v9, :cond_3

    aget-object v9, v2, v8

    array-length v10, v9

    if-nez v10, :cond_2

    move-wide v10, v4

    goto :goto_3

    :cond_2
    aget-wide v10, v9, v1

    :goto_3
    aput-wide v10, v7, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    :cond_3
    invoke-static {v0, v7}, Lq8/a;->y(Ljava/util/List;[J)V

    invoke-static {v2}, Lq8/a;->H([[J)Lcom/google/common/collect/w;

    move-result-object v4

    move v5, v1

    :goto_4
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    move-result v8

    if-ge v5, v8, :cond_4

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    aget v9, v3, v8

    add-int/2addr v9, v6

    aput v9, v3, v8

    aget-object v10, v2, v8

    aget-wide v9, v10, v9

    aput-wide v9, v7, v8

    invoke-static {v0, v7}, Lq8/a;->y(Ljava/util/List;[J)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_4
    move v2, v1

    :goto_5
    array-length v3, p0

    if-ge v2, v3, :cond_6

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_5

    aget-wide v3, v7, v2

    const-wide/16 v5, 0x2

    mul-long/2addr v3, v5

    aput-wide v3, v7, v2

    :cond_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_6
    invoke-static {v0, v7}, Lq8/a;->y(Ljava/util/List;[J)V

    invoke-static {}, Lcom/google/common/collect/w;->p()Lcom/google/common/collect/w$a;

    move-result-object p0

    :goto_6
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_8

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/common/collect/w$a;

    if-nez v2, :cond_7

    invoke-static {}, Lcom/google/common/collect/w;->v()Lcom/google/common/collect/w;

    move-result-object v2

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/google/common/collect/w$a;->k()Lcom/google/common/collect/w;

    move-result-object v2

    :goto_7
    invoke-virtual {p0, v2}, Lcom/google/common/collect/w$a;->h(Ljava/lang/Object;)Lcom/google/common/collect/w$a;

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_8
    invoke-virtual {p0}, Lcom/google/common/collect/w$a;->k()Lcom/google/common/collect/w;

    move-result-object p0

    return-object p0
.end method

.method private C(J)J
    .locals 6

    invoke-direct {p0, p1, p2}, Lq8/a;->I(J)J

    move-result-wide p1

    iget-object v0, p0, Lq8/a;->p:Lcom/google/common/collect/w;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-wide p1

    :cond_0
    const/4 v0, 0x1

    move v1, v0

    :goto_0
    iget-object v2, p0, Lq8/a;->p:Lcom/google/common/collect/w;

    invoke-virtual {v2}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    sub-int/2addr v2, v0

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lq8/a;->p:Lcom/google/common/collect/w;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lq8/a$a;

    iget-wide v2, v2, Lq8/a$a;->a:J

    cmp-long v2, v2, p1

    if-gez v2, :cond_1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lq8/a;->p:Lcom/google/common/collect/w;

    add-int/lit8 v2, v1, -0x1

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq8/a$a;

    iget-object v2, p0, Lq8/a;->p:Lcom/google/common/collect/w;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq8/a$a;

    iget-wide v2, v0, Lq8/a$a;->a:J

    sub-long/2addr p1, v2

    long-to-float p1, p1

    iget-wide v4, v1, Lq8/a$a;->a:J

    sub-long/2addr v4, v2

    long-to-float p2, v4

    div-float/2addr p1, p2

    iget-wide v2, v0, Lq8/a$a;->b:J

    iget-wide v0, v1, Lq8/a$a;->b:J

    sub-long/2addr v0, v2

    long-to-float p2, v0

    mul-float/2addr p1, p2

    float-to-long p1, p1

    add-long/2addr v2, p1

    return-wide v2
.end method

.method private D(Ljava/util/List;)J
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lx7/n;",
            ">;)J"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    invoke-static {p1}, Lcom/google/common/collect/e0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx7/n;

    iget-wide v3, p1, Lx7/f;->g:J

    cmp-long v0, v3, v1

    if-eqz v0, :cond_1

    iget-wide v5, p1, Lx7/f;->h:J

    cmp-long p1, v5, v1

    if-eqz p1, :cond_1

    sub-long v1, v5, v3

    :cond_1
    return-wide v1
.end method

.method private F([Lx7/o;Ljava/util/List;)J
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lx7/o;",
            "Ljava/util/List<",
            "+",
            "Lx7/n;",
            ">;)J"
        }
    .end annotation

    iget v0, p0, Lq8/a;->s:I

    array-length v1, p1

    if-ge v0, v1, :cond_0

    aget-object v0, p1, v0

    invoke-interface {v0}, Lx7/o;->next()Z

    move-result v0

    if-eqz v0, :cond_0

    iget p2, p0, Lq8/a;->s:I

    aget-object p1, p1, p2

    invoke-interface {p1}, Lx7/o;->b()J

    move-result-wide v0

    invoke-interface {p1}, Lx7/o;->a()J

    move-result-wide p1

    sub-long/2addr v0, p1

    return-wide v0

    :cond_0
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    aget-object v2, p1, v1

    invoke-interface {v2}, Lx7/o;->next()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Lx7/o;->b()J

    move-result-wide p1

    invoke-interface {v2}, Lx7/o;->a()J

    move-result-wide v0

    sub-long/2addr p1, v0

    return-wide p1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-direct {p0, p2}, Lq8/a;->D(Ljava/util/List;)J

    move-result-wide p1

    return-wide p1
.end method

.method private static G([Lq8/r$a;)[[J
    .locals 10

    array-length v0, p0

    new-array v0, v0, [[J

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_3

    aget-object v3, p0, v2

    if-nez v3, :cond_0

    new-array v3, v1, [J

    aput-object v3, v0, v2

    goto :goto_2

    :cond_0
    iget-object v4, v3, Lq8/r$a;->b:[I

    array-length v4, v4

    new-array v4, v4, [J

    aput-object v4, v0, v2

    move v4, v1

    :goto_1
    iget-object v5, v3, Lq8/r$a;->b:[I

    array-length v6, v5

    if-ge v4, v6, :cond_2

    iget-object v6, v3, Lq8/r$a;->a:Lv7/d1;

    aget v5, v5, v4

    invoke-virtual {v6, v5}, Lv7/d1;->d(I)Lt6/u1;

    move-result-object v5

    iget v5, v5, Lt6/u1;->s:I

    int-to-long v5, v5

    aget-object v7, v0, v2

    const-wide/16 v8, -0x1

    cmp-long v8, v5, v8

    if-nez v8, :cond_1

    const-wide/16 v5, 0x0

    :cond_1
    aput-wide v5, v7, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    aget-object v3, v0, v2

    invoke-static {v3}, Ljava/util/Arrays;->sort([J)V

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-object v0
.end method

.method private static H([[J)Lcom/google/common/collect/w;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([[J)",
            "Lcom/google/common/collect/w<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/google/common/collect/l0;->c()Lcom/google/common/collect/l0$e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/collect/l0$e;->a()Lcom/google/common/collect/l0$d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/collect/l0$d;->e()Lcom/google/common/collect/g0;

    move-result-object v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v3, p0

    if-ge v2, v3, :cond_5

    aget-object v3, p0, v2

    array-length v4, v3

    const/4 v5, 0x1

    if-gt v4, v5, :cond_0

    goto :goto_5

    :cond_0
    array-length v3, v3

    new-array v4, v3, [D

    move v5, v1

    :goto_1
    aget-object v6, p0, v2

    array-length v7, v6

    const-wide/16 v8, 0x0

    if-ge v5, v7, :cond_2

    aget-wide v10, v6, v5

    const-wide/16 v6, -0x1

    cmp-long v6, v10, v6

    if-nez v6, :cond_1

    goto :goto_2

    :cond_1
    long-to-double v6, v10

    invoke-static {v6, v7}, Ljava/lang/Math;->log(D)D

    move-result-wide v8

    :goto_2
    aput-wide v8, v4, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    add-int/lit8 v3, v3, -0x1

    aget-wide v5, v4, v3

    aget-wide v10, v4, v1

    sub-double/2addr v5, v10

    move v7, v1

    :goto_3
    if-ge v7, v3, :cond_4

    aget-wide v10, v4, v7

    add-int/lit8 v7, v7, 0x1

    aget-wide v12, v4, v7

    add-double/2addr v10, v12

    const-wide/high16 v12, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v10, v12

    cmpl-double v12, v5, v8

    if-nez v12, :cond_3

    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    goto :goto_4

    :cond_3
    aget-wide v12, v4, v1

    sub-double/2addr v10, v12

    div-double/2addr v10, v5

    :goto_4
    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v0, v10, v11}, Lcom/google/common/collect/k0;->put(Ljava/lang/Object;Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    invoke-interface {v0}, Lcom/google/common/collect/k0;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-static {p0}, Lcom/google/common/collect/w;->r(Ljava/util/Collection;)Lcom/google/common/collect/w;

    move-result-object p0

    return-object p0
.end method

.method private I(J)J
    .locals 7

    iget-object v0, p0, Lq8/a;->h:Ls8/e;

    invoke-interface {v0}, Ls8/e;->g()J

    move-result-wide v0

    long-to-float v0, v0

    iget v1, p0, Lq8/a;->n:F

    mul-float/2addr v0, v1

    float-to-long v0, v0

    iget-object v2, p0, Lq8/a;->h:Ls8/e;

    invoke-interface {v2}, Ls8/e;->b()J

    move-result-wide v2

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v6, v2, v4

    if-eqz v6, :cond_1

    cmp-long v4, p1, v4

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    long-to-float p1, p1

    iget p2, p0, Lq8/a;->r:F

    div-float p2, p1, p2

    long-to-float v2, v2

    sub-float/2addr p2, v2

    const/4 v2, 0x0

    invoke-static {p2, v2}, Ljava/lang/Math;->max(FF)F

    move-result p2

    long-to-float v0, v0

    mul-float/2addr v0, p2

    div-float/2addr v0, p1

    float-to-long p1, v0

    return-wide p1

    :cond_1
    :goto_0
    long-to-float p1, v0

    iget p2, p0, Lq8/a;->r:F

    div-float/2addr p1, p2

    float-to-long p1, p1

    return-wide p1
.end method

.method private J(JJ)J
    .locals 3

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    iget-wide p1, p0, Lq8/a;->i:J

    return-wide p1

    :cond_0
    cmp-long v0, p3, v0

    if-eqz v0, :cond_1

    sub-long/2addr p1, p3

    :cond_1
    long-to-float p1, p1

    iget p2, p0, Lq8/a;->o:F

    mul-float/2addr p1, p2

    float-to-long p1, p1

    iget-wide p3, p0, Lq8/a;->i:J

    invoke-static {p1, p2, p3, p4}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p1

    return-wide p1
.end method

.method static synthetic x([Lq8/r$a;)Lcom/google/common/collect/w;
    .locals 0

    invoke-static {p0}, Lq8/a;->B([Lq8/r$a;)Lcom/google/common/collect/w;

    move-result-object p0

    return-object p0
.end method

.method private static y(Ljava/util/List;[J)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/common/collect/w$a<",
            "Lq8/a$a;",
            ">;>;[J)V"
        }
    .end annotation

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    array-length v4, p1

    if-ge v3, v4, :cond_0

    aget-wide v4, p1, v3

    add-long/2addr v0, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/common/collect/w$a;

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    new-instance v4, Lq8/a$a;

    aget-wide v5, p1, v2

    invoke-direct {v4, v0, v1, v5, v6}, Lq8/a$a;-><init>(JJ)V

    invoke-virtual {v3, v4}, Lcom/google/common/collect/w$a;->h(Ljava/lang/Object;)Lcom/google/common/collect/w$a;

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method


# virtual methods
.method protected E()J
    .locals 2

    iget-wide v0, p0, Lq8/a;->k:J

    return-wide v0
.end method

.method protected K(JLjava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lx7/n;",
            ">;)Z"
        }
    .end annotation

    iget-wide v0, p0, Lq8/a;->u:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_1

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x3e8

    cmp-long p1, p1, v0

    if-gez p1, :cond_1

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-static {p3}, Lcom/google/common/collect/e0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx7/n;

    iget-object p2, p0, Lq8/a;->v:Lx7/n;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public f()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lq8/a;->v:Lx7/n;

    return-void
.end method

.method public g(JJJLjava/util/List;[Lx7/o;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJJ",
            "Ljava/util/List<",
            "+",
            "Lx7/n;",
            ">;[",
            "Lx7/o;",
            ")V"
        }
    .end annotation

    iget-object p1, p0, Lq8/a;->q:Lt8/d;

    invoke-interface {p1}, Lt8/d;->b()J

    move-result-wide p1

    invoke-direct {p0, p8, p7}, Lq8/a;->F([Lx7/o;Ljava/util/List;)J

    move-result-wide v0

    iget p8, p0, Lq8/a;->t:I

    if-nez p8, :cond_0

    const/4 p3, 0x1

    iput p3, p0, Lq8/a;->t:I

    invoke-direct {p0, p1, p2, v0, v1}, Lq8/a;->A(JJ)I

    move-result p1

    iput p1, p0, Lq8/a;->s:I

    return-void

    :cond_0
    iget v2, p0, Lq8/a;->s:I

    invoke-interface {p7}, Ljava/util/List;->isEmpty()Z

    move-result v3

    const/4 v4, -0x1

    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_0

    :cond_1
    invoke-static {p7}, Lcom/google/common/collect/e0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lx7/n;

    iget-object v3, v3, Lx7/f;->d:Lt6/u1;

    invoke-virtual {p0, v3}, Lq8/c;->e(Lt6/u1;)I

    move-result v3

    :goto_0
    if-eq v3, v4, :cond_2

    invoke-static {p7}, Lcom/google/common/collect/e0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p7

    check-cast p7, Lx7/n;

    iget p8, p7, Lx7/f;->e:I

    move v2, v3

    :cond_2
    invoke-direct {p0, p1, p2, v0, v1}, Lq8/a;->A(JJ)I

    move-result p7

    invoke-virtual {p0, v2, p1, p2}, Lq8/c;->j(IJ)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p0, v2}, Lq8/c;->a(I)Lt6/u1;

    move-result-object p1

    invoke-virtual {p0, p7}, Lq8/c;->a(I)Lt6/u1;

    move-result-object p2

    invoke-direct {p0, p5, p6, v0, v1}, Lq8/a;->J(JJ)J

    move-result-wide p5

    iget p2, p2, Lt6/u1;->s:I

    iget p1, p1, Lt6/u1;->s:I

    if-le p2, p1, :cond_3

    cmp-long p5, p3, p5

    if-gez p5, :cond_3

    goto :goto_1

    :cond_3
    if-ge p2, p1, :cond_4

    iget-wide p1, p0, Lq8/a;->j:J

    cmp-long p1, p3, p1

    if-ltz p1, :cond_4

    :goto_1
    move p7, v2

    :cond_4
    if-ne p7, v2, :cond_5

    goto :goto_2

    :cond_5
    const/4 p8, 0x3

    :goto_2
    iput p8, p0, Lq8/a;->t:I

    iput p7, p0, Lq8/a;->s:I

    return-void
.end method

.method public h()I
    .locals 1

    iget v0, p0, Lq8/a;->s:I

    return v0
.end method

.method public l(F)V
    .locals 0

    iput p1, p0, Lq8/a;->r:F

    return-void
.end method

.method public m()Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public p()V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lq8/a;->u:J

    const/4 v0, 0x0

    iput-object v0, p0, Lq8/a;->v:Lx7/n;

    return-void
.end method

.method public q(JLjava/util/List;)I
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "+",
            "Lx7/n;",
            ">;)I"
        }
    .end annotation

    iget-object v0, p0, Lq8/a;->q:Lt8/d;

    invoke-interface {v0}, Lt8/d;->b()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1, p3}, Lq8/a;->K(JLjava/util/List;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result p1

    return p1

    :cond_0
    iput-wide v0, p0, Lq8/a;->u:J

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_0

    :cond_1
    invoke-static {p3}, Lcom/google/common/collect/e0;->d(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lx7/n;

    :goto_0
    iput-object v2, p0, Lq8/a;->v:Lx7/n;

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    return v3

    :cond_2
    invoke-interface {p3}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v4, v2, -0x1

    invoke-interface {p3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lx7/n;

    iget-wide v4, v4, Lx7/f;->g:J

    sub-long/2addr v4, p1

    iget v6, p0, Lq8/a;->r:F

    invoke-static {v4, v5, v6}, Lt8/r0;->f0(JF)J

    move-result-wide v4

    invoke-virtual {p0}, Lq8/a;->E()J

    move-result-wide v6

    cmp-long v4, v4, v6

    if-gez v4, :cond_3

    return v2

    :cond_3
    invoke-direct {p0, p3}, Lq8/a;->D(Ljava/util/List;)J

    move-result-wide v4

    invoke-direct {p0, v0, v1, v4, v5}, Lq8/a;->A(JJ)I

    move-result v0

    invoke-virtual {p0, v0}, Lq8/c;->a(I)Lt6/u1;

    move-result-object v0

    :goto_1
    if-ge v3, v2, :cond_5

    invoke-interface {p3, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx7/n;

    iget-object v4, v1, Lx7/f;->d:Lt6/u1;

    iget-wide v8, v1, Lx7/f;->g:J

    sub-long/2addr v8, p1

    iget v1, p0, Lq8/a;->r:F

    invoke-static {v8, v9, v1}, Lt8/r0;->f0(JF)J

    move-result-wide v8

    cmp-long v1, v8, v6

    if-ltz v1, :cond_4

    iget v1, v4, Lt6/u1;->s:I

    iget v5, v0, Lt6/u1;->s:I

    if-ge v1, v5, :cond_4

    iget v1, v4, Lt6/u1;->C:I

    const/4 v5, -0x1

    if-eq v1, v5, :cond_4

    iget v8, p0, Lq8/a;->m:I

    if-gt v1, v8, :cond_4

    iget v4, v4, Lt6/u1;->B:I

    if-eq v4, v5, :cond_4

    iget v5, p0, Lq8/a;->l:I

    if-gt v4, v5, :cond_4

    iget v4, v0, Lt6/u1;->C:I

    if-ge v1, v4, :cond_4

    return v3

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    return v2
.end method

.method public t()I
    .locals 1

    iget v0, p0, Lq8/a;->t:I

    return v0
.end method

.method protected z(Lt6/u1;IJ)Z
    .locals 0

    int-to-long p1, p2

    cmp-long p1, p1, p3

    if-gtz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
