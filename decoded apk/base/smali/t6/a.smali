.class public abstract Lt6/a;
.super Lt6/d4;
.source "SourceFile"


# instance fields
.field private final f:I

.field private final r:Lv7/x0;

.field private final s:Z


# direct methods
.method public constructor <init>(ZLv7/x0;)V
    .locals 0

    invoke-direct {p0}, Lt6/d4;-><init>()V

    iput-boolean p1, p0, Lt6/a;->s:Z

    iput-object p2, p0, Lt6/a;->r:Lv7/x0;

    invoke-interface {p2}, Lv7/x0;->getLength()I

    move-result p1

    iput p1, p0, Lt6/a;->f:I

    return-void
.end method

.method public static A(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p0, Landroid/util/Pair;

    iget-object p0, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    return-object p0
.end method

.method public static B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p0, Landroid/util/Pair;

    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    return-object p0
.end method

.method public static D(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0
.end method

.method private G(IZ)I
    .locals 0

    if-eqz p2, :cond_0

    iget-object p2, p0, Lt6/a;->r:Lv7/x0;

    invoke-interface {p2, p1}, Lv7/x0;->c(I)I

    move-result p1

    goto :goto_0

    :cond_0
    iget p2, p0, Lt6/a;->f:I

    add-int/lit8 p2, p2, -0x1

    if-ge p1, p2, :cond_1

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_0
    return p1
.end method

.method private H(IZ)I
    .locals 0

    if-eqz p2, :cond_0

    iget-object p2, p0, Lt6/a;->r:Lv7/x0;

    invoke-interface {p2, p1}, Lv7/x0;->b(I)I

    move-result p1

    goto :goto_0

    :cond_0
    if-lez p1, :cond_1

    add-int/lit8 p1, p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_0
    return p1
.end method


# virtual methods
.method protected abstract C(I)Ljava/lang/Object;
.end method

.method protected abstract E(I)I
.end method

.method protected abstract F(I)I
.end method

.method protected abstract I(I)Lt6/d4;
.end method

.method public f(Z)I
    .locals 3

    iget v0, p0, Lt6/a;->f:I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v0, p0, Lt6/a;->s:Z

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    move p1, v2

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lt6/a;->r:Lv7/x0;

    invoke-interface {v0}, Lv7/x0;->f()I

    move-result v2

    :cond_2
    invoke-virtual {p0, v2}, Lt6/a;->I(I)Lt6/d4;

    move-result-object v0

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0, v2, p1}, Lt6/a;->G(IZ)I

    move-result v2

    if-ne v2, v1, :cond_2

    return v1

    :cond_3
    invoke-virtual {p0, v2}, Lt6/a;->F(I)I

    move-result v0

    invoke-virtual {p0, v2}, Lt6/a;->I(I)Lt6/d4;

    move-result-object v1

    invoke-virtual {v1, p1}, Lt6/d4;->f(Z)I

    move-result p1

    add-int/2addr v0, p1

    return v0
.end method

.method public final g(Ljava/lang/Object;)I
    .locals 3

    instance-of v0, p1, Landroid/util/Pair;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-static {p1}, Lt6/a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Lt6/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0}, Lt6/a;->x(Ljava/lang/Object;)I

    move-result v0

    if-ne v0, v1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0, v0}, Lt6/a;->I(I)Lt6/d4;

    move-result-object v2

    invoke-virtual {v2, p1}, Lt6/d4;->g(Ljava/lang/Object;)I

    move-result p1

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v0}, Lt6/a;->E(I)I

    move-result v0

    add-int v1, v0, p1

    :goto_0
    return v1
.end method

.method public h(Z)I
    .locals 3

    iget v0, p0, Lt6/a;->f:I

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-boolean v2, p0, Lt6/a;->s:Z

    if-eqz v2, :cond_1

    const/4 p1, 0x0

    :cond_1
    if-eqz p1, :cond_2

    iget-object v0, p0, Lt6/a;->r:Lv7/x0;

    invoke-interface {v0}, Lv7/x0;->d()I

    move-result v0

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v0, -0x1

    :cond_3
    :goto_0
    invoke-virtual {p0, v0}, Lt6/a;->I(I)Lt6/d4;

    move-result-object v2

    invoke-virtual {v2}, Lt6/d4;->v()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-direct {p0, v0, p1}, Lt6/a;->H(IZ)I

    move-result v0

    if-ne v0, v1, :cond_3

    return v1

    :cond_4
    invoke-virtual {p0, v0}, Lt6/a;->F(I)I

    move-result v1

    invoke-virtual {p0, v0}, Lt6/a;->I(I)Lt6/d4;

    move-result-object v0

    invoke-virtual {v0, p1}, Lt6/d4;->h(Z)I

    move-result p1

    add-int/2addr v1, p1

    return v1
.end method

.method public j(IIZ)I
    .locals 5

    iget-boolean v0, p0, Lt6/a;->s:Z

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_1

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    move p2, v2

    :cond_0
    move p3, v1

    :cond_1
    invoke-virtual {p0, p1}, Lt6/a;->z(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lt6/a;->F(I)I

    move-result v3

    invoke-virtual {p0, v0}, Lt6/a;->I(I)Lt6/d4;

    move-result-object v4

    sub-int/2addr p1, v3

    if-ne p2, v2, :cond_2

    goto :goto_0

    :cond_2
    move v1, p2

    :goto_0
    invoke-virtual {v4, p1, v1, p3}, Lt6/d4;->j(IIZ)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    add-int/2addr v3, p1

    return v3

    :cond_3
    invoke-direct {p0, v0, p3}, Lt6/a;->G(IZ)I

    move-result p1

    :goto_1
    if-eq p1, v1, :cond_4

    invoke-virtual {p0, p1}, Lt6/a;->I(I)Lt6/d4;

    move-result-object v0

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p1, p3}, Lt6/a;->G(IZ)I

    move-result p1

    goto :goto_1

    :cond_4
    if-eq p1, v1, :cond_5

    invoke-virtual {p0, p1}, Lt6/a;->F(I)I

    move-result p2

    invoke-virtual {p0, p1}, Lt6/a;->I(I)Lt6/d4;

    move-result-object p1

    invoke-virtual {p1, p3}, Lt6/d4;->f(Z)I

    move-result p1

    add-int/2addr p2, p1

    return p2

    :cond_5
    if-ne p2, v2, :cond_6

    invoke-virtual {p0, p3}, Lt6/a;->f(Z)I

    move-result p1

    return p1

    :cond_6
    return v1
.end method

.method public final l(ILt6/d4$b;Z)Lt6/d4$b;
    .locals 4

    invoke-virtual {p0, p1}, Lt6/a;->y(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lt6/a;->F(I)I

    move-result v1

    invoke-virtual {p0, v0}, Lt6/a;->E(I)I

    move-result v2

    invoke-virtual {p0, v0}, Lt6/a;->I(I)Lt6/d4;

    move-result-object v3

    sub-int/2addr p1, v2

    invoke-virtual {v3, p1, p2, p3}, Lt6/d4;->l(ILt6/d4$b;Z)Lt6/d4$b;

    iget p1, p2, Lt6/d4$b;->c:I

    add-int/2addr p1, v1

    iput p1, p2, Lt6/d4$b;->c:I

    if-eqz p3, :cond_0

    invoke-virtual {p0, v0}, Lt6/a;->C(I)Ljava/lang/Object;

    move-result-object p1

    iget-object p3, p2, Lt6/d4$b;->b:Ljava/lang/Object;

    invoke-static {p3}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-static {p1, p3}, Lt6/a;->D(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p2, Lt6/d4$b;->b:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public final m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;
    .locals 3

    invoke-static {p1}, Lt6/a;->B(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1}, Lt6/a;->A(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v0}, Lt6/a;->x(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0, v0}, Lt6/a;->F(I)I

    move-result v2

    invoke-virtual {p0, v0}, Lt6/a;->I(I)Lt6/d4;

    move-result-object v0

    invoke-virtual {v0, v1, p2}, Lt6/d4;->m(Ljava/lang/Object;Lt6/d4$b;)Lt6/d4$b;

    iget v0, p2, Lt6/d4$b;->c:I

    add-int/2addr v0, v2

    iput v0, p2, Lt6/d4$b;->c:I

    iput-object p1, p2, Lt6/d4$b;->b:Ljava/lang/Object;

    return-object p2
.end method

.method public q(IIZ)I
    .locals 5

    iget-boolean v0, p0, Lt6/a;->s:Z

    const/4 v1, 0x0

    const/4 v2, 0x2

    if-eqz v0, :cond_1

    const/4 p3, 0x1

    if-ne p2, p3, :cond_0

    move p2, v2

    :cond_0
    move p3, v1

    :cond_1
    invoke-virtual {p0, p1}, Lt6/a;->z(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lt6/a;->F(I)I

    move-result v3

    invoke-virtual {p0, v0}, Lt6/a;->I(I)Lt6/d4;

    move-result-object v4

    sub-int/2addr p1, v3

    if-ne p2, v2, :cond_2

    goto :goto_0

    :cond_2
    move v1, p2

    :goto_0
    invoke-virtual {v4, p1, v1, p3}, Lt6/d4;->q(IIZ)I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    add-int/2addr v3, p1

    return v3

    :cond_3
    invoke-direct {p0, v0, p3}, Lt6/a;->H(IZ)I

    move-result p1

    :goto_1
    if-eq p1, v1, :cond_4

    invoke-virtual {p0, p1}, Lt6/a;->I(I)Lt6/d4;

    move-result-object v0

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p1, p3}, Lt6/a;->H(IZ)I

    move-result p1

    goto :goto_1

    :cond_4
    if-eq p1, v1, :cond_5

    invoke-virtual {p0, p1}, Lt6/a;->F(I)I

    move-result p2

    invoke-virtual {p0, p1}, Lt6/a;->I(I)Lt6/d4;

    move-result-object p1

    invoke-virtual {p1, p3}, Lt6/d4;->h(Z)I

    move-result p1

    add-int/2addr p2, p1

    return p2

    :cond_5
    if-ne p2, v2, :cond_6

    invoke-virtual {p0, p3}, Lt6/a;->h(Z)I

    move-result p1

    return p1

    :cond_6
    return v1
.end method

.method public final r(I)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p1}, Lt6/a;->y(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lt6/a;->E(I)I

    move-result v1

    invoke-virtual {p0, v0}, Lt6/a;->I(I)Lt6/d4;

    move-result-object v2

    sub-int/2addr p1, v1

    invoke-virtual {v2, p1}, Lt6/d4;->r(I)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0}, Lt6/a;->C(I)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Lt6/a;->D(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final t(ILt6/d4$d;J)Lt6/d4$d;
    .locals 4

    invoke-virtual {p0, p1}, Lt6/a;->z(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lt6/a;->F(I)I

    move-result v1

    invoke-virtual {p0, v0}, Lt6/a;->E(I)I

    move-result v2

    invoke-virtual {p0, v0}, Lt6/a;->I(I)Lt6/d4;

    move-result-object v3

    sub-int/2addr p1, v1

    invoke-virtual {v3, p1, p2, p3, p4}, Lt6/d4;->t(ILt6/d4$d;J)Lt6/d4$d;

    invoke-virtual {p0, v0}, Lt6/a;->C(I)Ljava/lang/Object;

    move-result-object p1

    sget-object p3, Lt6/d4$d;->C:Ljava/lang/Object;

    iget-object p4, p2, Lt6/d4$d;->a:Ljava/lang/Object;

    invoke-virtual {p3, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    iget-object p3, p2, Lt6/d4$d;->a:Ljava/lang/Object;

    invoke-static {p1, p3}, Lt6/a;->D(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    iput-object p1, p2, Lt6/d4$d;->a:Ljava/lang/Object;

    iget p1, p2, Lt6/d4$d;->z:I

    add-int/2addr p1, v2

    iput p1, p2, Lt6/d4$d;->z:I

    iget p1, p2, Lt6/d4$d;->A:I

    add-int/2addr p1, v2

    iput p1, p2, Lt6/d4$d;->A:I

    return-object p2
.end method

.method protected abstract x(Ljava/lang/Object;)I
.end method

.method protected abstract y(I)I
.end method

.method protected abstract z(I)I
.end method
