.class final Lt6/i2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lv7/y;

.field public final b:Ljava/lang/Object;

.field public final c:[Lv7/v0;

.field public d:Z

.field public e:Z

.field public f:Lt6/j2;

.field public g:Z

.field private final h:[Z

.field private final i:[Lt6/r3;

.field private final j:Lq8/a0;

.field private final k:Lt6/a3;

.field private l:Lt6/i2;

.field private m:Lv7/f1;

.field private n:Lq8/b0;

.field private o:J


# direct methods
.method public constructor <init>([Lt6/r3;JLq8/a0;Ls8/b;Lt6/a3;Lt6/j2;Lq8/b0;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt6/i2;->i:[Lt6/r3;

    iput-wide p2, p0, Lt6/i2;->o:J

    iput-object p4, p0, Lt6/i2;->j:Lq8/a0;

    iput-object p6, p0, Lt6/i2;->k:Lt6/a3;

    iget-object v0, p7, Lt6/j2;->a:Lv7/a0$b;

    iget-object p2, v0, Lv7/z;->a:Ljava/lang/Object;

    iput-object p2, p0, Lt6/i2;->b:Ljava/lang/Object;

    iput-object p7, p0, Lt6/i2;->f:Lt6/j2;

    sget-object p2, Lv7/f1;->d:Lv7/f1;

    iput-object p2, p0, Lt6/i2;->m:Lv7/f1;

    iput-object p8, p0, Lt6/i2;->n:Lq8/b0;

    array-length p2, p1

    new-array p2, p2, [Lv7/v0;

    iput-object p2, p0, Lt6/i2;->c:[Lv7/v0;

    array-length p1, p1

    new-array p1, p1, [Z

    iput-object p1, p0, Lt6/i2;->h:[Z

    iget-wide v3, p7, Lt6/j2;->b:J

    iget-wide v5, p7, Lt6/j2;->d:J

    move-object v1, p6

    move-object v2, p5

    invoke-static/range {v0 .. v6}, Lt6/i2;->e(Lv7/a0$b;Lt6/a3;Ls8/b;JJ)Lv7/y;

    move-result-object p1

    iput-object p1, p0, Lt6/i2;->a:Lv7/y;

    return-void
.end method

.method private c([Lv7/v0;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lt6/i2;->i:[Lt6/r3;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    invoke-interface {v1}, Lt6/r3;->g()I

    move-result v1

    const/4 v2, -0x2

    if-ne v1, v2, :cond_0

    iget-object v1, p0, Lt6/i2;->n:Lq8/b0;

    invoke-virtual {v1, v0}, Lq8/b0;->c(I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lv7/r;

    invoke-direct {v1}, Lv7/r;-><init>()V

    aput-object v1, p1, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private static e(Lv7/a0$b;Lt6/a3;Ls8/b;JJ)Lv7/y;
    .locals 7

    invoke-virtual {p1, p0, p2, p3, p4}, Lt6/a3;->h(Lv7/a0$b;Ls8/b;J)Lv7/y;

    move-result-object v1

    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p0, p5, p0

    if-eqz p0, :cond_0

    new-instance p0, Lv7/d;

    const/4 v2, 0x1

    const-wide/16 v3, 0x0

    move-object v0, p0

    move-wide v5, p5

    invoke-direct/range {v0 .. v6}, Lv7/d;-><init>(Lv7/y;ZJJ)V

    move-object v1, p0

    :cond_0
    return-object v1
.end method

.method private f()V
    .locals 3

    invoke-direct {p0}, Lt6/i2;->r()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lt6/i2;->n:Lq8/b0;

    iget v2, v1, Lq8/b0;->a:I

    if-ge v0, v2, :cond_2

    invoke-virtual {v1, v0}, Lq8/b0;->c(I)Z

    move-result v1

    iget-object v2, p0, Lt6/i2;->n:Lq8/b0;

    iget-object v2, v2, Lq8/b0;->c:[Lq8/r;

    aget-object v2, v2, v0

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lq8/r;->f()V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private g([Lv7/v0;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lt6/i2;->i:[Lt6/r3;

    array-length v2, v1

    if-ge v0, v2, :cond_1

    aget-object v1, v1, v0

    invoke-interface {v1}, Lt6/r3;->g()I

    move-result v1

    const/4 v2, -0x2

    if-ne v1, v2, :cond_0

    const/4 v1, 0x0

    aput-object v1, p1, v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method private h()V
    .locals 3

    invoke-direct {p0}, Lt6/i2;->r()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lt6/i2;->n:Lq8/b0;

    iget v2, v1, Lq8/b0;->a:I

    if-ge v0, v2, :cond_2

    invoke-virtual {v1, v0}, Lq8/b0;->c(I)Z

    move-result v1

    iget-object v2, p0, Lt6/i2;->n:Lq8/b0;

    iget-object v2, v2, Lq8/b0;->c:[Lq8/r;

    aget-object v2, v2, v0

    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lq8/r;->p()V

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private r()Z
    .locals 1

    iget-object v0, p0, Lt6/i2;->l:Lt6/i2;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private static u(Lt6/a3;Lv7/y;)V
    .locals 1

    :try_start_0
    instance-of v0, p1, Lv7/d;

    if-eqz v0, :cond_0

    check-cast p1, Lv7/d;

    iget-object p1, p1, Lv7/d;->a:Lv7/y;

    :cond_0
    invoke-virtual {p0, p1}, Lt6/a3;->z(Lv7/y;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "MediaPeriodHolder"

    const-string v0, "Period release failed."

    invoke-static {p1, v0, p0}, Lt8/s;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public A()V
    .locals 5

    iget-object v0, p0, Lt6/i2;->a:Lv7/y;

    instance-of v1, v0, Lv7/d;

    if-eqz v1, :cond_1

    iget-object v1, p0, Lt6/i2;->f:Lt6/j2;

    iget-wide v1, v1, Lt6/j2;->d:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v3, v1, v3

    if-nez v3, :cond_0

    const-wide/high16 v1, -0x8000000000000000L

    :cond_0
    check-cast v0, Lv7/d;

    const-wide/16 v3, 0x0

    invoke-virtual {v0, v3, v4, v1, v2}, Lv7/d;->u(JJ)V

    :cond_1
    return-void
.end method

.method public a(Lq8/b0;JZ)J
    .locals 7

    iget-object v0, p0, Lt6/i2;->i:[Lt6/r3;

    array-length v0, v0

    new-array v6, v0, [Z

    move-object v1, p0

    move-object v2, p1

    move-wide v3, p2

    move v5, p4

    invoke-virtual/range {v1 .. v6}, Lt6/i2;->b(Lq8/b0;JZ[Z)J

    move-result-wide p1

    return-wide p1
.end method

.method public b(Lq8/b0;JZ[Z)J
    .locals 13

    move-object v0, p0

    move-object v1, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    iget v4, v1, Lq8/b0;->a:I

    const/4 v5, 0x1

    if-ge v3, v4, :cond_1

    iget-object v4, v0, Lt6/i2;->h:[Z

    if-nez p4, :cond_0

    iget-object v6, v0, Lt6/i2;->n:Lq8/b0;

    invoke-virtual {p1, v6, v3}, Lq8/b0;->b(Lq8/b0;I)Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    move v5, v2

    :goto_1
    aput-boolean v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v3, v0, Lt6/i2;->c:[Lv7/v0;

    invoke-direct {p0, v3}, Lt6/i2;->g([Lv7/v0;)V

    invoke-direct {p0}, Lt6/i2;->f()V

    iput-object v1, v0, Lt6/i2;->n:Lq8/b0;

    invoke-direct {p0}, Lt6/i2;->h()V

    iget-object v6, v0, Lt6/i2;->a:Lv7/y;

    iget-object v7, v1, Lq8/b0;->c:[Lq8/r;

    iget-object v8, v0, Lt6/i2;->h:[Z

    iget-object v9, v0, Lt6/i2;->c:[Lv7/v0;

    move-object/from16 v10, p5

    move-wide v11, p2

    invoke-interface/range {v6 .. v12}, Lv7/y;->t([Lq8/r;[Z[Lv7/v0;[ZJ)J

    move-result-wide v3

    iget-object v6, v0, Lt6/i2;->c:[Lv7/v0;

    invoke-direct {p0, v6}, Lt6/i2;->c([Lv7/v0;)V

    iput-boolean v2, v0, Lt6/i2;->e:Z

    move v6, v2

    :goto_2
    iget-object v7, v0, Lt6/i2;->c:[Lv7/v0;

    array-length v8, v7

    if-ge v6, v8, :cond_5

    aget-object v7, v7, v6

    if-eqz v7, :cond_2

    invoke-virtual {p1, v6}, Lq8/b0;->c(I)Z

    move-result v7

    invoke-static {v7}, Lt8/a;->g(Z)V

    iget-object v7, v0, Lt6/i2;->i:[Lt6/r3;

    aget-object v7, v7, v6

    invoke-interface {v7}, Lt6/r3;->g()I

    move-result v7

    const/4 v8, -0x2

    if-eq v7, v8, :cond_4

    iput-boolean v5, v0, Lt6/i2;->e:Z

    goto :goto_4

    :cond_2
    iget-object v7, v1, Lq8/b0;->c:[Lq8/r;

    aget-object v7, v7, v6

    if-nez v7, :cond_3

    move v7, v5

    goto :goto_3

    :cond_3
    move v7, v2

    :goto_3
    invoke-static {v7}, Lt8/a;->g(Z)V

    :cond_4
    :goto_4
    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_5
    return-wide v3
.end method

.method public d(J)V
    .locals 1

    invoke-direct {p0}, Lt6/i2;->r()Z

    move-result v0

    invoke-static {v0}, Lt8/a;->g(Z)V

    invoke-virtual {p0, p1, p2}, Lt6/i2;->y(J)J

    move-result-wide p1

    iget-object v0, p0, Lt6/i2;->a:Lv7/y;

    invoke-interface {v0, p1, p2}, Lv7/y;->e(J)Z

    return-void
.end method

.method public i()J
    .locals 5

    iget-boolean v0, p0, Lt6/i2;->d:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lt6/i2;->f:Lt6/j2;

    iget-wide v0, v0, Lt6/j2;->b:J

    return-wide v0

    :cond_0
    iget-boolean v0, p0, Lt6/i2;->e:Z

    const-wide/high16 v1, -0x8000000000000000L

    if-eqz v0, :cond_1

    iget-object v0, p0, Lt6/i2;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->f()J

    move-result-wide v3

    goto :goto_0

    :cond_1
    move-wide v3, v1

    :goto_0
    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    iget-object v0, p0, Lt6/i2;->f:Lt6/j2;

    iget-wide v3, v0, Lt6/j2;->e:J

    :cond_2
    return-wide v3
.end method

.method public j()Lt6/i2;
    .locals 1

    iget-object v0, p0, Lt6/i2;->l:Lt6/i2;

    return-object v0
.end method

.method public k()J
    .locals 2

    iget-boolean v0, p0, Lt6/i2;->d:Z

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lt6/i2;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->b()J

    move-result-wide v0

    :goto_0
    return-wide v0
.end method

.method public l()J
    .locals 2

    iget-wide v0, p0, Lt6/i2;->o:J

    return-wide v0
.end method

.method public m()J
    .locals 4

    iget-object v0, p0, Lt6/i2;->f:Lt6/j2;

    iget-wide v0, v0, Lt6/j2;->b:J

    iget-wide v2, p0, Lt6/i2;->o:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public n()Lv7/f1;
    .locals 1

    iget-object v0, p0, Lt6/i2;->m:Lv7/f1;

    return-object v0
.end method

.method public o()Lq8/b0;
    .locals 1

    iget-object v0, p0, Lt6/i2;->n:Lq8/b0;

    return-object v0
.end method

.method public p(FLt6/d4;)V
    .locals 6

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt6/i2;->d:Z

    iget-object v0, p0, Lt6/i2;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->r()Lv7/f1;

    move-result-object v0

    iput-object v0, p0, Lt6/i2;->m:Lv7/f1;

    invoke-virtual {p0, p1, p2}, Lt6/i2;->v(FLt6/d4;)Lq8/b0;

    move-result-object p1

    iget-object p2, p0, Lt6/i2;->f:Lt6/j2;

    iget-wide v0, p2, Lt6/j2;->b:J

    iget-wide v2, p2, Lt6/j2;->e:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v2, v4

    if-eqz p2, :cond_0

    cmp-long p2, v0, v2

    if-ltz p2, :cond_0

    const-wide/16 v0, 0x1

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    :cond_0
    const/4 p2, 0x0

    invoke-virtual {p0, p1, v0, v1, p2}, Lt6/i2;->a(Lq8/b0;JZ)J

    move-result-wide p1

    iget-wide v0, p0, Lt6/i2;->o:J

    iget-object v2, p0, Lt6/i2;->f:Lt6/j2;

    iget-wide v3, v2, Lt6/j2;->b:J

    sub-long/2addr v3, p1

    add-long/2addr v0, v3

    iput-wide v0, p0, Lt6/i2;->o:J

    invoke-virtual {v2, p1, p2}, Lt6/j2;->b(J)Lt6/j2;

    move-result-object p1

    iput-object p1, p0, Lt6/i2;->f:Lt6/j2;

    return-void
.end method

.method public q()Z
    .locals 4

    iget-boolean v0, p0, Lt6/i2;->d:Z

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lt6/i2;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt6/i2;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->f()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public s(J)V
    .locals 1

    invoke-direct {p0}, Lt6/i2;->r()Z

    move-result v0

    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-boolean v0, p0, Lt6/i2;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt6/i2;->a:Lv7/y;

    invoke-virtual {p0, p1, p2}, Lt6/i2;->y(J)J

    move-result-wide p1

    invoke-interface {v0, p1, p2}, Lv7/y;->g(J)V

    :cond_0
    return-void
.end method

.method public t()V
    .locals 2

    invoke-direct {p0}, Lt6/i2;->f()V

    iget-object v0, p0, Lt6/i2;->k:Lt6/a3;

    iget-object v1, p0, Lt6/i2;->a:Lv7/y;

    invoke-static {v0, v1}, Lt6/i2;->u(Lt6/a3;Lv7/y;)V

    return-void
.end method

.method public v(FLt6/d4;)Lq8/b0;
    .locals 4

    iget-object v0, p0, Lt6/i2;->j:Lq8/a0;

    iget-object v1, p0, Lt6/i2;->i:[Lt6/r3;

    invoke-virtual {p0}, Lt6/i2;->n()Lv7/f1;

    move-result-object v2

    iget-object v3, p0, Lt6/i2;->f:Lt6/j2;

    iget-object v3, v3, Lt6/j2;->a:Lv7/a0$b;

    invoke-virtual {v0, v1, v2, v3, p2}, Lq8/a0;->g([Lt6/r3;Lv7/f1;Lv7/a0$b;Lt6/d4;)Lq8/b0;

    move-result-object p2

    iget-object v0, p2, Lq8/b0;->c:[Lq8/r;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    if-eqz v3, :cond_0

    invoke-interface {v3, p1}, Lq8/r;->l(F)V

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object p2
.end method

.method public w(Lt6/i2;)V
    .locals 1

    iget-object v0, p0, Lt6/i2;->l:Lt6/i2;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lt6/i2;->f()V

    iput-object p1, p0, Lt6/i2;->l:Lt6/i2;

    invoke-direct {p0}, Lt6/i2;->h()V

    return-void
.end method

.method public x(J)V
    .locals 0

    iput-wide p1, p0, Lt6/i2;->o:J

    return-void
.end method

.method public y(J)J
    .locals 2

    invoke-virtual {p0}, Lt6/i2;->l()J

    move-result-wide v0

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public z(J)J
    .locals 2

    invoke-virtual {p0}, Lt6/i2;->l()J

    move-result-wide v0

    add-long/2addr p1, v0

    return-wide p1
.end method
