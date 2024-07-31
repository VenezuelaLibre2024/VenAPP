.class final Lv7/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/y;
.implements Lv7/y$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/i0$a;,
        Lv7/i0$c;,
        Lv7/i0$b;
    }
.end annotation


# instance fields
.field private final a:[Lv7/y;

.field private final b:Ljava/util/IdentityHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/IdentityHashMap<",
            "Lv7/v0;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lv7/i;

.field private final d:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lv7/y;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lv7/d1;",
            "Lv7/d1;",
            ">;"
        }
    .end annotation
.end field

.field private f:Lv7/y$a;

.field private r:Lv7/f1;

.field private s:[Lv7/y;

.field private t:Lv7/w0;


# direct methods
.method public varargs constructor <init>(Lv7/i;[J[Lv7/y;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/i0;->c:Lv7/i;

    iput-object p3, p0, Lv7/i0;->a:[Lv7/y;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lv7/i0;->d:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lv7/i0;->e:Ljava/util/HashMap;

    const/4 v0, 0x0

    new-array v1, v0, [Lv7/w0;

    invoke-interface {p1, v1}, Lv7/i;->a([Lv7/w0;)Lv7/w0;

    move-result-object p1

    iput-object p1, p0, Lv7/i0;->t:Lv7/w0;

    new-instance p1, Ljava/util/IdentityHashMap;

    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    iput-object p1, p0, Lv7/i0;->b:Ljava/util/IdentityHashMap;

    new-array p1, v0, [Lv7/y;

    iput-object p1, p0, Lv7/i0;->s:[Lv7/y;

    :goto_0
    array-length p1, p3

    if-ge v0, p1, :cond_1

    aget-wide v1, p2, v0

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-eqz p1, :cond_0

    iget-object p1, p0, Lv7/i0;->a:[Lv7/y;

    new-instance v3, Lv7/i0$b;

    aget-object v4, p3, v0

    invoke-direct {v3, v4, v1, v2}, Lv7/i0$b;-><init>(Lv7/y;J)V

    aput-object v3, p1, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lv7/w0;)V
    .locals 0

    check-cast p1, Lv7/y;

    invoke-virtual {p0, p1}, Lv7/i0;->m(Lv7/y;)V

    return-void
.end method

.method public b()J
    .locals 2

    iget-object v0, p0, Lv7/i0;->t:Lv7/w0;

    invoke-interface {v0}, Lv7/w0;->b()J

    move-result-wide v0

    return-wide v0
.end method

.method public c(JLt6/u3;)J
    .locals 3

    iget-object v0, p0, Lv7/i0;->s:[Lv7/y;

    array-length v1, v0

    const/4 v2, 0x0

    if-lez v1, :cond_0

    aget-object v0, v0, v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lv7/i0;->a:[Lv7/y;

    aget-object v0, v0, v2

    :goto_0
    invoke-interface {v0, p1, p2, p3}, Lv7/y;->c(JLt6/u3;)J

    move-result-wide p1

    return-wide p1
.end method

.method public d(I)Lv7/y;
    .locals 1

    iget-object v0, p0, Lv7/i0;->a:[Lv7/y;

    aget-object p1, v0, p1

    instance-of v0, p1, Lv7/i0$b;

    if-eqz v0, :cond_0

    check-cast p1, Lv7/i0$b;

    invoke-static {p1}, Lv7/i0$b;->d(Lv7/i0$b;)Lv7/y;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public e(J)Z
    .locals 4

    iget-object v0, p0, Lv7/i0;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lv7/i0;->d:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, Lv7/i0;->d:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lv7/y;

    invoke-interface {v3, p1, p2}, Lv7/y;->e(J)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v1

    :cond_1
    iget-object v0, p0, Lv7/i0;->t:Lv7/w0;

    invoke-interface {v0, p1, p2}, Lv7/w0;->e(J)Z

    move-result p1

    return p1
.end method

.method public f()J
    .locals 2

    iget-object v0, p0, Lv7/i0;->t:Lv7/w0;

    invoke-interface {v0}, Lv7/w0;->f()J

    move-result-wide v0

    return-wide v0
.end method

.method public g(J)V
    .locals 1

    iget-object v0, p0, Lv7/i0;->t:Lv7/w0;

    invoke-interface {v0, p1, p2}, Lv7/w0;->g(J)V

    return-void
.end method

.method public h(Lv7/y;)V
    .locals 9

    iget-object v0, p0, Lv7/i0;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, Lv7/i0;->d:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lv7/i0;->a:[Lv7/y;

    array-length v0, p1

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v4, p1, v2

    invoke-interface {v4}, Lv7/y;->r()Lv7/f1;

    move-result-object v4

    iget v4, v4, Lv7/f1;->a:I

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-array p1, v3, [Lv7/d1;

    move v0, v1

    move v2, v0

    :goto_1
    iget-object v3, p0, Lv7/i0;->a:[Lv7/y;

    array-length v4, v3

    if-ge v0, v4, :cond_3

    aget-object v3, v3, v0

    invoke-interface {v3}, Lv7/y;->r()Lv7/f1;

    move-result-object v3

    iget v4, v3, Lv7/f1;->a:I

    move v5, v1

    :goto_2
    if-ge v5, v4, :cond_2

    invoke-virtual {v3, v5}, Lv7/f1;->c(I)Lv7/d1;

    move-result-object v6

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ":"

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v8, v6, Lv7/d1;->b:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lv7/d1;->c(Ljava/lang/String;)Lv7/d1;

    move-result-object v7

    iget-object v8, p0, Lv7/i0;->e:Ljava/util/HashMap;

    invoke-virtual {v8, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v6, v2, 0x1

    aput-object v7, p1, v2

    add-int/lit8 v5, v5, 0x1

    move v2, v6

    goto :goto_2

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    new-instance v0, Lv7/f1;

    invoke-direct {v0, p1}, Lv7/f1;-><init>([Lv7/d1;)V

    iput-object v0, p0, Lv7/i0;->r:Lv7/f1;

    iget-object p1, p0, Lv7/i0;->f:Lv7/y$a;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv7/y$a;

    invoke-interface {p1, p0}, Lv7/y$a;->h(Lv7/y;)V

    return-void
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, Lv7/i0;->t:Lv7/w0;

    invoke-interface {v0}, Lv7/w0;->isLoading()Z

    move-result v0

    return v0
.end method

.method public j(J)J
    .locals 3

    iget-object v0, p0, Lv7/i0;->s:[Lv7/y;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-interface {v0, p1, p2}, Lv7/y;->j(J)J

    move-result-wide p1

    const/4 v0, 0x1

    :goto_0
    iget-object v1, p0, Lv7/i0;->s:[Lv7/y;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    invoke-interface {v1, p1, p2}, Lv7/y;->j(J)J

    move-result-wide v1

    cmp-long v1, v1, p1

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Unexpected child seekToUs result."

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    return-wide p1
.end method

.method public k(Lv7/y$a;J)V
    .locals 3

    iput-object p1, p0, Lv7/i0;->f:Lv7/y$a;

    iget-object p1, p0, Lv7/i0;->d:Ljava/util/ArrayList;

    iget-object v0, p0, Lv7/i0;->a:[Lv7/y;

    invoke-static {p1, v0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    iget-object p1, p0, Lv7/i0;->a:[Lv7/y;

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-interface {v2, p0, p2, p3}, Lv7/y;->k(Lv7/y$a;J)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public l()J
    .locals 15

    iget-object v0, p0, Lv7/i0;->s:[Lv7/y;

    array-length v1, v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v4, 0x0

    move-wide v6, v2

    move v5, v4

    :goto_0
    if-ge v5, v1, :cond_8

    aget-object v8, v0, v5

    invoke-interface {v8}, Lv7/y;->l()J

    move-result-wide v9

    cmp-long v11, v9, v2

    const-string v12, "Unexpected child seekToUs result."

    if-eqz v11, :cond_5

    cmp-long v11, v6, v2

    if-nez v11, :cond_3

    iget-object v6, p0, Lv7/i0;->s:[Lv7/y;

    array-length v7, v6

    move v11, v4

    :goto_1
    if-ge v11, v7, :cond_2

    aget-object v13, v6, v11

    if-ne v13, v8, :cond_0

    goto :goto_2

    :cond_0
    invoke-interface {v13, v9, v10}, Lv7/y;->j(J)J

    move-result-wide v13

    cmp-long v13, v13, v9

    if-nez v13, :cond_1

    add-int/lit8 v11, v11, 0x1

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_2
    move-wide v6, v9

    goto :goto_3

    :cond_3
    cmp-long v8, v9, v6

    if-nez v8, :cond_4

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Conflicting discontinuities."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    cmp-long v9, v6, v2

    if-eqz v9, :cond_7

    invoke-interface {v8, v6, v7}, Lv7/y;->j(J)J

    move-result-wide v8

    cmp-long v8, v8, v6

    if-nez v8, :cond_6

    goto :goto_3

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    :goto_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_8
    return-wide v6
.end method

.method public m(Lv7/y;)V
    .locals 0

    iget-object p1, p0, Lv7/i0;->f:Lv7/y$a;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv7/y$a;

    invoke-interface {p1, p0}, Lv7/w0$a;->a(Lv7/w0;)V

    return-void
.end method

.method public o()V
    .locals 4

    iget-object v0, p0, Lv7/i0;->a:[Lv7/y;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-interface {v3}, Lv7/y;->o()V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public r()Lv7/f1;
    .locals 1

    iget-object v0, p0, Lv7/i0;->r:Lv7/f1;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/f1;

    return-object v0
.end method

.method public s(JZ)V
    .locals 4

    iget-object v0, p0, Lv7/i0;->s:[Lv7/y;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-interface {v3, p1, p2, p3}, Lv7/y;->s(JZ)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public t([Lq8/r;[Z[Lv7/v0;[ZJ)J
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    array-length v3, v1

    new-array v3, v3, [I

    array-length v4, v1

    new-array v4, v4, [I

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    array-length v7, v1

    const/4 v8, 0x0

    if-ge v6, v7, :cond_3

    aget-object v7, v2, v6

    if-nez v7, :cond_0

    goto :goto_1

    :cond_0
    iget-object v8, v0, Lv7/i0;->b:Ljava/util/IdentityHashMap;

    invoke-virtual {v8, v7}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/lang/Integer;

    :goto_1
    const/4 v7, -0x1

    if-nez v8, :cond_1

    move v8, v7

    goto :goto_2

    :cond_1
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v8

    :goto_2
    aput v8, v3, v6

    aget-object v8, v1, v6

    if-eqz v8, :cond_2

    invoke-interface {v8}, Lq8/u;->d()Lv7/d1;

    move-result-object v7

    iget-object v7, v7, Lv7/d1;->b:Ljava/lang/String;

    const-string v8, ":"

    invoke-virtual {v7, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v7, v5, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    aput v7, v4, v6

    goto :goto_3

    :cond_2
    aput v7, v4, v6

    :goto_3
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_3
    iget-object v6, v0, Lv7/i0;->b:Ljava/util/IdentityHashMap;

    invoke-virtual {v6}, Ljava/util/IdentityHashMap;->clear()V

    array-length v6, v1

    new-array v7, v6, [Lv7/v0;

    array-length v9, v1

    new-array v9, v9, [Lv7/v0;

    array-length v10, v1

    new-array v15, v10, [Lq8/r;

    new-instance v14, Ljava/util/ArrayList;

    iget-object v10, v0, Lv7/i0;->a:[Lv7/y;

    array-length v10, v10

    invoke-direct {v14, v10}, Ljava/util/ArrayList;-><init>(I)V

    move-wide/from16 v17, p5

    move v13, v5

    :goto_4
    iget-object v10, v0, Lv7/i0;->a:[Lv7/y;

    array-length v10, v10

    if-ge v13, v10, :cond_e

    move v10, v5

    :goto_5
    array-length v11, v1

    if-ge v10, v11, :cond_6

    aget v11, v3, v10

    if-ne v11, v13, :cond_4

    aget-object v11, v2, v10

    goto :goto_6

    :cond_4
    move-object v11, v8

    :goto_6
    aput-object v11, v9, v10

    aget v11, v4, v10

    if-ne v11, v13, :cond_5

    aget-object v11, v1, v10

    invoke-static {v11}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lq8/r;

    invoke-interface {v11}, Lq8/u;->d()Lv7/d1;

    move-result-object v12

    iget-object v5, v0, Lv7/i0;->e:Ljava/util/HashMap;

    invoke-virtual {v5, v12}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lv7/d1;

    invoke-static {v5}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lv7/d1;

    new-instance v12, Lv7/i0$a;

    invoke-direct {v12, v11, v5}, Lv7/i0$a;-><init>(Lq8/r;Lv7/d1;)V

    aput-object v12, v15, v10

    goto :goto_7

    :cond_5
    aput-object v8, v15, v10

    :goto_7
    add-int/lit8 v10, v10, 0x1

    const/4 v5, 0x0

    goto :goto_5

    :cond_6
    iget-object v5, v0, Lv7/i0;->a:[Lv7/y;

    aget-object v10, v5, v13

    move-object v11, v15

    move-object/from16 v12, p2

    move v5, v13

    move-object v13, v9

    move-object v8, v14

    move-object/from16 v14, p4

    move-object/from16 v19, v15

    move-wide/from16 v15, v17

    invoke-interface/range {v10 .. v16}, Lv7/y;->t([Lq8/r;[Z[Lv7/v0;[ZJ)J

    move-result-wide v10

    if-nez v5, :cond_7

    move-wide/from16 v17, v10

    goto :goto_8

    :cond_7
    cmp-long v10, v10, v17

    if-nez v10, :cond_d

    :goto_8
    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_9
    array-length v12, v1

    if-ge v10, v12, :cond_b

    aget v12, v4, v10

    const/4 v13, 0x1

    if-ne v12, v5, :cond_8

    aget-object v11, v9, v10

    invoke-static {v11}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lv7/v0;

    aget-object v12, v9, v10

    aput-object v12, v7, v10

    iget-object v12, v0, Lv7/i0;->b:Ljava/util/IdentityHashMap;

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v12, v11, v14}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v11, v13

    goto :goto_b

    :cond_8
    aget v12, v3, v10

    if-ne v12, v5, :cond_a

    aget-object v12, v9, v10

    if-nez v12, :cond_9

    goto :goto_a

    :cond_9
    const/4 v13, 0x0

    :goto_a
    invoke-static {v13}, Lt8/a;->g(Z)V

    :cond_a
    :goto_b
    add-int/lit8 v10, v10, 0x1

    goto :goto_9

    :cond_b
    if-eqz v11, :cond_c

    iget-object v10, v0, Lv7/i0;->a:[Lv7/y;

    aget-object v10, v10, v5

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_c
    add-int/lit8 v13, v5, 0x1

    move-object v14, v8

    move-object/from16 v15, v19

    const/4 v5, 0x0

    const/4 v8, 0x0

    goto/16 :goto_4

    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "Children enabled at different positions."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_e
    move v1, v5

    move-object v8, v14

    invoke-static {v7, v1, v2, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v1, v1, [Lv7/y;

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lv7/y;

    iput-object v1, v0, Lv7/i0;->s:[Lv7/y;

    iget-object v2, v0, Lv7/i0;->c:Lv7/i;

    invoke-interface {v2, v1}, Lv7/i;->a([Lv7/w0;)Lv7/w0;

    move-result-object v1

    iput-object v1, v0, Lv7/i0;->t:Lv7/w0;

    return-wide v17
.end method
