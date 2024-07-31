.class public abstract Lt6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/j3;


# instance fields
.field protected final a:Lt6/d4$d;


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt6/d4$d;

    invoke-direct {v0}, Lt6/d4$d;-><init>()V

    iput-object v0, p0, Lt6/k;->a:Lt6/d4$d;

    return-void
.end method

.method private R()I
    .locals 2

    invoke-interface {p0}, Lt6/j3;->J()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    :cond_0
    return v0
.end method

.method private T(JI)V
    .locals 6

    invoke-interface {p0}, Lt6/j3;->G()I

    move-result v1

    const/4 v5, 0x0

    move-object v0, p0

    move-wide v2, p1

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Lt6/k;->S(IJIZ)V

    return-void
.end method

.method private U(II)V
    .locals 6

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v5, 0x0

    move-object v0, p0

    move v1, p1

    move v4, p2

    invoke-virtual/range {v0 .. v5}, Lt6/k;->S(IJIZ)V

    return-void
.end method


# virtual methods
.method public final A(F)V
    .locals 1

    invoke-interface {p0}, Lt6/j3;->c()Lt6/i3;

    move-result-object v0

    invoke-virtual {v0, p1}, Lt6/i3;->e(F)Lt6/i3;

    move-result-object p1

    invoke-interface {p0, p1}, Lt6/j3;->b(Lt6/i3;)V

    return-void
.end method

.method public final E()Z
    .locals 3

    invoke-interface {p0}, Lt6/j3;->r()Lt6/d4;

    move-result-object v0

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Lt6/j3;->G()I

    move-result v1

    iget-object v2, p0, Lt6/k;->a:Lt6/d4$d;

    invoke-virtual {v0, v1, v2}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v0

    iget-boolean v0, v0, Lt6/d4$d;->s:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final M()Z
    .locals 3

    invoke-interface {p0}, Lt6/j3;->r()Lt6/d4;

    move-result-object v0

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Lt6/j3;->G()I

    move-result v1

    iget-object v2, p0, Lt6/k;->a:Lt6/d4$d;

    invoke-virtual {v0, v1, v2}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v0

    invoke-virtual {v0}, Lt6/d4$d;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final N(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lt6/c2;",
            ">;)V"
        }
    .end annotation

    const v0, 0x7fffffff

    invoke-interface {p0, v0, p1}, Lt6/j3;->C(ILjava/util/List;)V

    return-void
.end method

.method public final O()J
    .locals 3

    invoke-interface {p0}, Lt6/j3;->r()Lt6/d4;

    move-result-object v0

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lt6/j3;->G()I

    move-result v1

    iget-object v2, p0, Lt6/k;->a:Lt6/d4$d;

    invoke-virtual {v0, v1, v2}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v0

    invoke-virtual {v0}, Lt6/d4$d;->g()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public final P()I
    .locals 4

    invoke-interface {p0}, Lt6/j3;->r()Lt6/d4;

    move-result-object v0

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lt6/j3;->G()I

    move-result v1

    invoke-direct {p0}, Lt6/k;->R()I

    move-result v2

    invoke-interface {p0}, Lt6/j3;->K()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lt6/d4;->j(IIZ)I

    move-result v0

    :goto_0
    return v0
.end method

.method public final Q()I
    .locals 4

    invoke-interface {p0}, Lt6/j3;->r()Lt6/d4;

    move-result-object v0

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-interface {p0}, Lt6/j3;->G()I

    move-result v1

    invoke-direct {p0}, Lt6/k;->R()I

    move-result v2

    invoke-interface {p0}, Lt6/j3;->K()Z

    move-result v3

    invoke-virtual {v0, v1, v2, v3}, Lt6/d4;->q(IIZ)I

    move-result v0

    :goto_0
    return v0
.end method

.method public abstract S(IJIZ)V
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x1

    invoke-interface {p0, v0}, Lt6/j3;->k(Z)V

    return-void
.end method

.method public final i()V
    .locals 2

    invoke-interface {p0}, Lt6/j3;->G()I

    move-result v0

    const/4 v1, 0x4

    invoke-direct {p0, v0, v1}, Lt6/k;->U(II)V

    return-void
.end method

.method public final n()Z
    .locals 2

    invoke-virtual {p0}, Lt6/k;->P()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final p()Z
    .locals 3

    invoke-interface {p0}, Lt6/j3;->r()Lt6/d4;

    move-result-object v0

    invoke-virtual {v0}, Lt6/d4;->v()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-interface {p0}, Lt6/j3;->G()I

    move-result v1

    iget-object v2, p0, Lt6/k;->a:Lt6/d4$d;

    invoke-virtual {v0, v1, v2}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v0

    iget-boolean v0, v0, Lt6/d4$d;->t:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final pause()V
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lt6/j3;->k(Z)V

    return-void
.end method

.method public final v(Lt6/c2;)V
    .locals 0

    invoke-static {p1}, Lcom/google/common/collect/w;->w(Ljava/lang/Object;)Lcom/google/common/collect/w;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt6/k;->N(Ljava/util/List;)V

    return-void
.end method

.method public final x()Z
    .locals 2

    invoke-virtual {p0}, Lt6/k;->Q()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final z(J)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, p1, p2, v0}, Lt6/k;->T(JI)V

    return-void
.end method
