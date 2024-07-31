.class public final Lv7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/y;
.implements Lv7/y$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv7/d$a;
    }
.end annotation


# instance fields
.field public final a:Lv7/y;

.field private b:Lv7/y$a;

.field private c:[Lv7/d$a;

.field private d:J

.field e:J

.field f:J

.field private r:Lv7/e$b;


# direct methods
.method public constructor <init>(Lv7/y;ZJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/d;->a:Lv7/y;

    const/4 p1, 0x0

    new-array p1, p1, [Lv7/d$a;

    iput-object p1, p0, Lv7/d;->c:[Lv7/d$a;

    if-eqz p2, :cond_0

    move-wide p1, p3

    goto :goto_0

    :cond_0
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    :goto_0
    iput-wide p1, p0, Lv7/d;->d:J

    iput-wide p3, p0, Lv7/d;->e:J

    iput-wide p5, p0, Lv7/d;->f:J

    return-void
.end method

.method private d(JLt6/u3;)Lt6/u3;
    .locals 10

    iget-wide v0, p3, Lt6/u3;->a:J

    const-wide/16 v2, 0x0

    iget-wide v4, p0, Lv7/d;->e:J

    sub-long v4, p1, v4

    invoke-static/range {v0 .. v5}, Lt8/r0;->r(JJJ)J

    move-result-wide v0

    iget-wide v2, p3, Lt6/u3;->b:J

    const-wide/16 v4, 0x0

    iget-wide v6, p0, Lv7/d;->f:J

    const-wide/high16 v8, -0x8000000000000000L

    cmp-long v8, v6, v8

    if-nez v8, :cond_0

    const-wide p1, 0x7fffffffffffffffL

    move-wide v6, p1

    goto :goto_0

    :cond_0
    sub-long/2addr v6, p1

    :goto_0
    invoke-static/range {v2 .. v7}, Lt8/r0;->r(JJJ)J

    move-result-wide p1

    iget-wide v2, p3, Lt6/u3;->a:J

    cmp-long v2, v0, v2

    if-nez v2, :cond_1

    iget-wide v2, p3, Lt6/u3;->b:J

    cmp-long v2, p1, v2

    if-nez v2, :cond_1

    return-object p3

    :cond_1
    new-instance p3, Lt6/u3;

    invoke-direct {p3, v0, v1, p1, p2}, Lt6/u3;-><init>(JJ)V

    return-object p3
.end method

.method private static q(J[Lq8/r;)Z
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long p0, p0, v0

    const/4 p1, 0x0

    if-eqz p0, :cond_1

    array-length p0, p2

    move v0, p1

    :goto_0
    if-ge v0, p0, :cond_1

    aget-object v1, p2, v0

    if-eqz v1, :cond_0

    invoke-interface {v1}, Lq8/r;->s()Lt6/u1;

    move-result-object v1

    iget-object v2, v1, Lt6/u1;->w:Ljava/lang/String;

    iget-object v1, v1, Lt6/u1;->t:Ljava/lang/String;

    invoke-static {v2, v1}, Lt8/w;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return p1
.end method


# virtual methods
.method public bridge synthetic a(Lv7/w0;)V
    .locals 0

    check-cast p1, Lv7/y;

    invoke-virtual {p0, p1}, Lv7/d;->n(Lv7/y;)V

    return-void
.end method

.method public b()J
    .locals 7

    iget-object v0, p0, Lv7/d;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->b()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-wide v4, p0, Lv7/d;->f:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_0

    cmp-long v4, v0, v4

    if-ltz v4, :cond_0

    goto :goto_0

    :cond_0
    return-wide v0

    :cond_1
    :goto_0
    return-wide v2
.end method

.method public c(JLt6/u3;)J
    .locals 3

    iget-wide v0, p0, Lv7/d;->e:J

    cmp-long v2, p1, v0

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lv7/d;->d(JLt6/u3;)Lt6/u3;

    move-result-object p3

    iget-object v0, p0, Lv7/d;->a:Lv7/y;

    invoke-interface {v0, p1, p2, p3}, Lv7/y;->c(JLt6/u3;)J

    move-result-wide p1

    return-wide p1
.end method

.method public e(J)Z
    .locals 1

    iget-object v0, p0, Lv7/d;->a:Lv7/y;

    invoke-interface {v0, p1, p2}, Lv7/y;->e(J)Z

    move-result p1

    return p1
.end method

.method public f()J
    .locals 7

    iget-object v0, p0, Lv7/d;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->f()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-eqz v4, :cond_1

    iget-wide v4, p0, Lv7/d;->f:J

    cmp-long v6, v4, v2

    if-eqz v6, :cond_0

    cmp-long v4, v0, v4

    if-ltz v4, :cond_0

    goto :goto_0

    :cond_0
    return-wide v0

    :cond_1
    :goto_0
    return-wide v2
.end method

.method public g(J)V
    .locals 1

    iget-object v0, p0, Lv7/d;->a:Lv7/y;

    invoke-interface {v0, p1, p2}, Lv7/y;->g(J)V

    return-void
.end method

.method public h(Lv7/y;)V
    .locals 0

    iget-object p1, p0, Lv7/d;->r:Lv7/e$b;

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lv7/d;->b:Lv7/y$a;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv7/y$a;

    invoke-interface {p1, p0}, Lv7/y$a;->h(Lv7/y;)V

    return-void
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, Lv7/d;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->isLoading()Z

    move-result v0

    return v0
.end method

.method public j(J)J
    .locals 5

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lv7/d;->d:J

    iget-object v0, p0, Lv7/d;->c:[Lv7/d$a;

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lv7/d$a;->b()V

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lv7/d;->a:Lv7/y;

    invoke-interface {v0, p1, p2}, Lv7/y;->j(J)J

    move-result-wide v0

    cmp-long p1, v0, p1

    if-eqz p1, :cond_2

    iget-wide p1, p0, Lv7/d;->e:J

    cmp-long p1, v0, p1

    if-ltz p1, :cond_3

    iget-wide p1, p0, Lv7/d;->f:J

    const-wide/high16 v3, -0x8000000000000000L

    cmp-long v3, p1, v3

    if-eqz v3, :cond_2

    cmp-long p1, v0, p1

    if-gtz p1, :cond_3

    :cond_2
    const/4 v2, 0x1

    :cond_3
    invoke-static {v2}, Lt8/a;->g(Z)V

    return-wide v0
.end method

.method public k(Lv7/y$a;J)V
    .locals 0

    iput-object p1, p0, Lv7/d;->b:Lv7/y$a;

    iget-object p1, p0, Lv7/d;->a:Lv7/y;

    invoke-interface {p1, p0, p2, p3}, Lv7/y;->k(Lv7/y$a;J)V

    return-void
.end method

.method public l()J
    .locals 9

    invoke-virtual {p0}, Lv7/d;->m()Z

    move-result v0

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_1

    iget-wide v3, p0, Lv7/d;->d:J

    iput-wide v1, p0, Lv7/d;->d:J

    invoke-virtual {p0}, Lv7/d;->l()J

    move-result-wide v5

    cmp-long v0, v5, v1

    if-eqz v0, :cond_0

    move-wide v3, v5

    :cond_0
    return-wide v3

    :cond_1
    iget-object v0, p0, Lv7/d;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->l()J

    move-result-wide v3

    cmp-long v0, v3, v1

    if-nez v0, :cond_2

    return-wide v1

    :cond_2
    iget-wide v0, p0, Lv7/d;->e:J

    cmp-long v0, v3, v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-ltz v0, :cond_3

    move v0, v1

    goto :goto_0

    :cond_3
    move v0, v2

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-wide v5, p0, Lv7/d;->f:J

    const-wide/high16 v7, -0x8000000000000000L

    cmp-long v0, v5, v7

    if-eqz v0, :cond_5

    cmp-long v0, v3, v5

    if-gtz v0, :cond_4

    goto :goto_1

    :cond_4
    move v1, v2

    :cond_5
    :goto_1
    invoke-static {v1}, Lt8/a;->g(Z)V

    return-wide v3
.end method

.method m()Z
    .locals 4

    iget-wide v0, p0, Lv7/d;->d:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public n(Lv7/y;)V
    .locals 0

    iget-object p1, p0, Lv7/d;->b:Lv7/y$a;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv7/y$a;

    invoke-interface {p1, p0}, Lv7/w0$a;->a(Lv7/w0;)V

    return-void
.end method

.method public o()V
    .locals 1

    iget-object v0, p0, Lv7/d;->r:Lv7/e$b;

    if-nez v0, :cond_0

    iget-object v0, p0, Lv7/d;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->o()V

    return-void

    :cond_0
    throw v0
.end method

.method public p(Lv7/e$b;)V
    .locals 0

    iput-object p1, p0, Lv7/d;->r:Lv7/e$b;

    return-void
.end method

.method public r()Lv7/f1;
    .locals 1

    iget-object v0, p0, Lv7/d;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->r()Lv7/f1;

    move-result-object v0

    return-object v0
.end method

.method public s(JZ)V
    .locals 1

    iget-object v0, p0, Lv7/d;->a:Lv7/y;

    invoke-interface {v0, p1, p2, p3}, Lv7/y;->s(JZ)V

    return-void
.end method

.method public t([Lq8/r;[Z[Lv7/v0;[ZJ)J
    .locals 12

    move-object v0, p0

    move-object v1, p3

    array-length v2, v1

    new-array v2, v2, [Lv7/d$a;

    iput-object v2, v0, Lv7/d;->c:[Lv7/d$a;

    array-length v2, v1

    new-array v9, v2, [Lv7/v0;

    const/4 v10, 0x0

    move v2, v10

    :goto_0
    array-length v3, v1

    const/4 v11, 0x0

    if-ge v2, v3, :cond_1

    iget-object v3, v0, Lv7/d;->c:[Lv7/d$a;

    aget-object v4, v1, v2

    check-cast v4, Lv7/d$a;

    aput-object v4, v3, v2

    if-eqz v4, :cond_0

    iget-object v11, v4, Lv7/d$a;->a:Lv7/v0;

    :cond_0
    aput-object v11, v9, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, v0, Lv7/d;->a:Lv7/y;

    move-object v3, p1

    move-object v4, p2

    move-object v5, v9

    move-object/from16 v6, p4

    move-wide/from16 v7, p5

    invoke-interface/range {v2 .. v8}, Lv7/y;->t([Lq8/r;[Z[Lv7/v0;[ZJ)J

    move-result-wide v2

    invoke-virtual {p0}, Lv7/d;->m()Z

    move-result v4

    if-eqz v4, :cond_2

    iget-wide v4, v0, Lv7/d;->e:J

    cmp-long v6, p5, v4

    if-nez v6, :cond_2

    move-object v6, p1

    invoke-static {v4, v5, p1}, Lv7/d;->q(J[Lq8/r;)Z

    move-result v4

    if-eqz v4, :cond_2

    move-wide v4, v2

    goto :goto_1

    :cond_2
    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    :goto_1
    iput-wide v4, v0, Lv7/d;->d:J

    cmp-long v4, v2, p5

    if-eqz v4, :cond_4

    iget-wide v4, v0, Lv7/d;->e:J

    cmp-long v4, v2, v4

    if-ltz v4, :cond_3

    iget-wide v4, v0, Lv7/d;->f:J

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v6, v4, v6

    if-eqz v6, :cond_4

    cmp-long v4, v2, v4

    if-gtz v4, :cond_3

    goto :goto_2

    :cond_3
    move v4, v10

    goto :goto_3

    :cond_4
    :goto_2
    const/4 v4, 0x1

    :goto_3
    invoke-static {v4}, Lt8/a;->g(Z)V

    :goto_4
    array-length v4, v1

    if-ge v10, v4, :cond_8

    aget-object v4, v9, v10

    if-nez v4, :cond_5

    iget-object v4, v0, Lv7/d;->c:[Lv7/d$a;

    aput-object v11, v4, v10

    goto :goto_5

    :cond_5
    iget-object v5, v0, Lv7/d;->c:[Lv7/d$a;

    aget-object v6, v5, v10

    if-eqz v6, :cond_6

    iget-object v6, v6, Lv7/d$a;->a:Lv7/v0;

    if-eq v6, v4, :cond_7

    :cond_6
    new-instance v6, Lv7/d$a;

    invoke-direct {v6, p0, v4}, Lv7/d$a;-><init>(Lv7/d;Lv7/v0;)V

    aput-object v6, v5, v10

    :cond_7
    :goto_5
    iget-object v4, v0, Lv7/d;->c:[Lv7/d$a;

    aget-object v4, v4, v10

    aput-object v4, v1, v10

    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_8
    return-wide v2
.end method

.method public u(JJ)V
    .locals 0

    iput-wide p1, p0, Lv7/d;->e:J

    iput-wide p3, p0, Lv7/d;->f:J

    return-void
.end method
