.class public abstract Lt6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/q3;
.implements Lt6/r3;


# instance fields
.field private final a:I

.field private final b:Lt6/v1;

.field private c:Lt6/s3;

.field private d:I

.field private e:Lu6/m3;

.field private f:I

.field private r:Lv7/v0;

.field private s:[Lt6/u1;

.field private t:J

.field private u:J

.field private v:J

.field private w:Z

.field private x:Z


# direct methods
.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lt6/l;->a:I

    new-instance p1, Lt6/v1;

    invoke-direct {p1}, Lt6/v1;-><init>()V

    iput-object p1, p0, Lt6/l;->b:Lt6/v1;

    const-wide/high16 v0, -0x8000000000000000L

    iput-wide v0, p0, Lt6/l;->v:J

    return-void
.end method

.method private W(JZ)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lt6/l;->w:Z

    iput-wide p1, p0, Lt6/l;->u:J

    iput-wide p1, p0, Lt6/l;->v:J

    invoke-virtual {p0, p1, p2, p3}, Lt6/l;->Q(JZ)V

    return-void
.end method


# virtual methods
.method public final A([Lt6/u1;Lv7/v0;JJ)V
    .locals 6

    iget-boolean v0, p0, Lt6/l;->w:Z

    xor-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Lt8/a;->g(Z)V

    iput-object p2, p0, Lt6/l;->r:Lv7/v0;

    iget-wide v0, p0, Lt6/l;->v:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long p2, v0, v2

    if-nez p2, :cond_0

    iput-wide p3, p0, Lt6/l;->v:J

    :cond_0
    iput-object p1, p0, Lt6/l;->s:[Lt6/u1;

    iput-wide p5, p0, Lt6/l;->t:J

    move-object v0, p0

    move-object v1, p1

    move-wide v2, p3

    move-wide v4, p5

    invoke-virtual/range {v0 .. v5}, Lt6/l;->U([Lt6/u1;JJ)V

    return-void
.end method

.method public final B(Lt6/s3;[Lt6/u1;Lv7/v0;JZZJJ)V
    .locals 9

    move-object v7, p0

    move v8, p6

    iget v0, v7, Lt6/l;->f:I

    const/4 v1, 0x1

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    move-object v0, p1

    iput-object v0, v7, Lt6/l;->c:Lt6/s3;

    iput v1, v7, Lt6/l;->f:I

    move/from16 v0, p7

    invoke-virtual {p0, p6, v0}, Lt6/l;->P(ZZ)V

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move-wide/from16 v3, p8

    move-wide/from16 v5, p10

    invoke-virtual/range {v0 .. v6}, Lt6/l;->A([Lt6/u1;Lv7/v0;JJ)V

    move-wide v0, p4

    invoke-direct {p0, p4, p5, p6}, Lt6/l;->W(JZ)V

    return-void
.end method

.method public final C()J
    .locals 2

    iget-wide v0, p0, Lt6/l;->v:J

    return-wide v0
.end method

.method public final D(J)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lt6/l;->W(JZ)V

    return-void
.end method

.method public E()Lt8/u;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method protected final G(Ljava/lang/Throwable;Lt6/u1;I)Lt6/x;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p2, v0, p3}, Lt6/l;->H(Ljava/lang/Throwable;Lt6/u1;ZI)Lt6/x;

    move-result-object p1

    return-object p1
.end method

.method protected final H(Ljava/lang/Throwable;Lt6/u1;ZI)Lt6/x;
    .locals 9

    if-eqz p2, :cond_0

    iget-boolean v0, p0, Lt6/l;->x:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt6/l;->x:Z

    const/4 v0, 0x0

    :try_start_0
    invoke-interface {p0, p2}, Lt6/r3;->a(Lt6/u1;)I

    move-result v1

    invoke-static {v1}, Lt6/r3;->F(I)I

    move-result v1
    :try_end_0
    .catch Lt6/x; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v0, p0, Lt6/l;->x:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    iput-boolean v0, p0, Lt6/l;->x:Z

    throw p1

    :catch_0
    iput-boolean v0, p0, Lt6/l;->x:Z

    :cond_0
    const/4 v1, 0x4

    :goto_0
    move v6, v1

    invoke-interface {p0}, Lt6/q3;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lt6/l;->K()I

    move-result v4

    move-object v2, p1

    move-object v5, p2

    move v7, p3

    move v8, p4

    invoke-static/range {v2 .. v8}, Lt6/x;->g(Ljava/lang/Throwable;Ljava/lang/String;ILt6/u1;IZI)Lt6/x;

    move-result-object p1

    return-object p1
.end method

.method protected final I()Lt6/s3;
    .locals 1

    iget-object v0, p0, Lt6/l;->c:Lt6/s3;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt6/s3;

    return-object v0
.end method

.method protected final J()Lt6/v1;
    .locals 1

    iget-object v0, p0, Lt6/l;->b:Lt6/v1;

    invoke-virtual {v0}, Lt6/v1;->a()V

    iget-object v0, p0, Lt6/l;->b:Lt6/v1;

    return-object v0
.end method

.method protected final K()I
    .locals 1

    iget v0, p0, Lt6/l;->d:I

    return v0
.end method

.method protected final L()Lu6/m3;
    .locals 1

    iget-object v0, p0, Lt6/l;->e:Lu6/m3;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu6/m3;

    return-object v0
.end method

.method protected final M()[Lt6/u1;
    .locals 1

    iget-object v0, p0, Lt6/l;->s:[Lt6/u1;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt6/u1;

    return-object v0
.end method

.method protected final N()Z
    .locals 1

    invoke-virtual {p0}, Lt6/l;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lt6/l;->w:Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt6/l;->r:Lv7/v0;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/v0;

    invoke-interface {v0}, Lv7/v0;->d()Z

    move-result v0

    :goto_0
    return v0
.end method

.method protected abstract O()V
.end method

.method protected P(ZZ)V
    .locals 0

    return-void
.end method

.method protected abstract Q(JZ)V
.end method

.method protected R()V
    .locals 0

    return-void
.end method

.method protected S()V
    .locals 0

    return-void
.end method

.method protected T()V
    .locals 0

    return-void
.end method

.method protected abstract U([Lt6/u1;JJ)V
.end method

.method protected final V(Lt6/v1;Lw6/g;I)I
    .locals 5

    iget-object v0, p0, Lt6/l;->r:Lv7/v0;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/v0;

    invoke-interface {v0, p1, p2, p3}, Lv7/v0;->q(Lt6/v1;Lw6/g;I)I

    move-result p3

    const/4 v0, -0x4

    if-ne p3, v0, :cond_2

    invoke-virtual {p2}, Lw6/a;->s()Z

    move-result p1

    if-eqz p1, :cond_1

    const-wide/high16 p1, -0x8000000000000000L

    iput-wide p1, p0, Lt6/l;->v:J

    iget-boolean p1, p0, Lt6/l;->w:Z

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, -0x3

    :goto_0
    return v0

    :cond_1
    iget-wide v0, p2, Lw6/g;->e:J

    iget-wide v2, p0, Lt6/l;->t:J

    add-long/2addr v0, v2

    iput-wide v0, p2, Lw6/g;->e:J

    iget-wide p1, p0, Lt6/l;->v:J

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    iput-wide p1, p0, Lt6/l;->v:J

    goto :goto_1

    :cond_2
    const/4 p2, -0x5

    if-ne p3, p2, :cond_3

    iget-object p2, p1, Lt6/v1;->b:Lt6/u1;

    invoke-static {p2}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lt6/u1;

    iget-wide v0, p2, Lt6/u1;->A:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    invoke-virtual {p2}, Lt6/u1;->c()Lt6/u1$b;

    move-result-object v0

    iget-wide v1, p2, Lt6/u1;->A:J

    iget-wide v3, p0, Lt6/l;->t:J

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lt6/u1$b;->k0(J)Lt6/u1$b;

    move-result-object p2

    invoke-virtual {p2}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object p2

    iput-object p2, p1, Lt6/v1;->b:Lt6/u1;

    :cond_3
    :goto_1
    return p3
.end method

.method protected X(J)I
    .locals 3

    iget-object v0, p0, Lt6/l;->r:Lv7/v0;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/v0;

    iget-wide v1, p0, Lt6/l;->t:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lv7/v0;->p(J)I

    move-result p1

    return p1
.end method

.method public final f()V
    .locals 3

    iget v0, p0, Lt6/l;->f:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-static {v2}, Lt8/a;->g(Z)V

    iget-object v0, p0, Lt6/l;->b:Lt6/v1;

    invoke-virtual {v0}, Lt6/v1;->a()V

    iput v1, p0, Lt6/l;->f:I

    const/4 v0, 0x0

    iput-object v0, p0, Lt6/l;->r:Lv7/v0;

    iput-object v0, p0, Lt6/l;->s:[Lt6/u1;

    iput-boolean v1, p0, Lt6/l;->w:Z

    invoke-virtual {p0}, Lt6/l;->O()V

    return-void
.end method

.method public final g()I
    .locals 1

    iget v0, p0, Lt6/l;->a:I

    return v0
.end method

.method public final getState()I
    .locals 1

    iget v0, p0, Lt6/l;->f:I

    return v0
.end method

.method public final h()Lv7/v0;
    .locals 1

    iget-object v0, p0, Lt6/l;->r:Lv7/v0;

    return-object v0
.end method

.method public final i()Z
    .locals 4

    iget-wide v0, p0, Lt6/l;->v:J

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final k()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt6/l;->w:Z

    return-void
.end method

.method public p(ILjava/lang/Object;)V
    .locals 0

    return-void
.end method

.method public final q()V
    .locals 1

    iget-object v0, p0, Lt6/l;->r:Lv7/v0;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lv7/v0;

    invoke-interface {v0}, Lv7/v0;->a()V

    return-void
.end method

.method public final r()Z
    .locals 1

    iget-boolean v0, p0, Lt6/l;->w:Z

    return v0
.end method

.method public final reset()V
    .locals 1

    iget v0, p0, Lt6/l;->f:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-object v0, p0, Lt6/l;->b:Lt6/v1;

    invoke-virtual {v0}, Lt6/v1;->a()V

    invoke-virtual {p0}, Lt6/l;->R()V

    return-void
.end method

.method public final s(ILu6/m3;)V
    .locals 0

    iput p1, p0, Lt6/l;->d:I

    iput-object p2, p0, Lt6/l;->e:Lu6/m3;

    return-void
.end method

.method public final start()V
    .locals 2

    iget v0, p0, Lt6/l;->f:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lt8/a;->g(Z)V

    const/4 v0, 0x2

    iput v0, p0, Lt6/l;->f:I

    invoke-virtual {p0}, Lt6/l;->S()V

    return-void
.end method

.method public final stop()V
    .locals 3

    iget v0, p0, Lt6/l;->f:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    iput v2, p0, Lt6/l;->f:I

    invoke-virtual {p0}, Lt6/l;->T()V

    return-void
.end method

.method public final u()Lt6/r3;
    .locals 0

    return-object p0
.end method

.method public y()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
