.class final Lt6/n3;
.super Lt6/a;
.source "SourceFile"


# instance fields
.field private final t:I

.field private final u:I

.field private final v:[I

.field private final w:[I

.field private final x:[Lt6/d4;

.field private final y:[Ljava/lang/Object;

.field private final z:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Collection;Lv7/x0;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lt6/m2;",
            ">;",
            "Lv7/x0;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0, p2}, Lt6/a;-><init>(ZLv7/x0;)V

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result p2

    new-array v1, p2, [I

    iput-object v1, p0, Lt6/n3;->v:[I

    new-array v1, p2, [I

    iput-object v1, p0, Lt6/n3;->w:[I

    new-array v1, p2, [Lt6/d4;

    iput-object v1, p0, Lt6/n3;->x:[Lt6/d4;

    new-array p2, p2, [Ljava/lang/Object;

    iput-object p2, p0, Lt6/n3;->y:[Ljava/lang/Object;

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, Lt6/n3;->z:Ljava/util/HashMap;

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move p2, v0

    move v1, p2

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt6/m2;

    iget-object v3, p0, Lt6/n3;->x:[Lt6/d4;

    invoke-interface {v2}, Lt6/m2;->a()Lt6/d4;

    move-result-object v4

    aput-object v4, v3, v1

    iget-object v3, p0, Lt6/n3;->w:[I

    aput v0, v3, v1

    iget-object v3, p0, Lt6/n3;->v:[I

    aput p2, v3, v1

    iget-object v3, p0, Lt6/n3;->x:[Lt6/d4;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Lt6/d4;->u()I

    move-result v3

    add-int/2addr v0, v3

    iget-object v3, p0, Lt6/n3;->x:[Lt6/d4;

    aget-object v3, v3, v1

    invoke-virtual {v3}, Lt6/d4;->n()I

    move-result v3

    add-int/2addr p2, v3

    iget-object v3, p0, Lt6/n3;->y:[Ljava/lang/Object;

    invoke-interface {v2}, Lt6/m2;->l()Ljava/lang/Object;

    move-result-object v2

    aput-object v2, v3, v1

    iget-object v2, p0, Lt6/n3;->z:Ljava/util/HashMap;

    iget-object v3, p0, Lt6/n3;->y:[Ljava/lang/Object;

    aget-object v3, v3, v1

    add-int/lit8 v4, v1, 0x1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move v1, v4

    goto :goto_0

    :cond_0
    iput v0, p0, Lt6/n3;->t:I

    iput p2, p0, Lt6/n3;->u:I

    return-void
.end method


# virtual methods
.method protected C(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lt6/n3;->y:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method protected E(I)I
    .locals 1

    iget-object v0, p0, Lt6/n3;->v:[I

    aget p1, v0, p1

    return p1
.end method

.method protected F(I)I
    .locals 1

    iget-object v0, p0, Lt6/n3;->w:[I

    aget p1, v0, p1

    return p1
.end method

.method protected I(I)Lt6/d4;
    .locals 1

    iget-object v0, p0, Lt6/n3;->x:[Lt6/d4;

    aget-object p1, v0, p1

    return-object p1
.end method

.method J()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lt6/d4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lt6/n3;->x:[Lt6/d4;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public n()I
    .locals 1

    iget v0, p0, Lt6/n3;->u:I

    return v0
.end method

.method public u()I
    .locals 1

    iget v0, p0, Lt6/n3;->t:I

    return v0
.end method

.method protected x(Ljava/lang/Object;)I
    .locals 1

    iget-object v0, p0, Lt6/n3;->z:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    return p1
.end method

.method protected y(I)I
    .locals 2

    iget-object v0, p0, Lt6/n3;->v:[I

    add-int/lit8 p1, p1, 0x1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v1}, Lt8/r0;->h([IIZZ)I

    move-result p1

    return p1
.end method

.method protected z(I)I
    .locals 2

    iget-object v0, p0, Lt6/n3;->w:[I

    add-int/lit8 p1, p1, 0x1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, v1}, Lt8/r0;->h([IIZZ)I

    move-result p1

    return p1
.end method
