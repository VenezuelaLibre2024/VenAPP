.class final Lv7/i0$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/y;
.implements Lv7/y$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/i0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final a:Lv7/y;

.field private final b:J

.field private c:Lv7/y$a;


# direct methods
.method public constructor <init>(Lv7/y;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv7/i0$b;->a:Lv7/y;

    iput-wide p2, p0, Lv7/i0$b;->b:J

    return-void
.end method

.method static synthetic d(Lv7/i0$b;)Lv7/y;
    .locals 0

    iget-object p0, p0, Lv7/i0$b;->a:Lv7/y;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic a(Lv7/w0;)V
    .locals 0

    check-cast p1, Lv7/y;

    invoke-virtual {p0, p1}, Lv7/i0$b;->m(Lv7/y;)V

    return-void
.end method

.method public b()J
    .locals 5

    iget-object v0, p0, Lv7/i0$b;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->b()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lv7/i0$b;->b:J

    add-long/2addr v2, v0

    :goto_0
    return-wide v2
.end method

.method public c(JLt6/u3;)J
    .locals 3

    iget-object v0, p0, Lv7/i0$b;->a:Lv7/y;

    iget-wide v1, p0, Lv7/i0$b;->b:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2, p3}, Lv7/y;->c(JLt6/u3;)J

    move-result-wide p1

    iget-wide v0, p0, Lv7/i0$b;->b:J

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public e(J)Z
    .locals 3

    iget-object v0, p0, Lv7/i0$b;->a:Lv7/y;

    iget-wide v1, p0, Lv7/i0$b;->b:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lv7/y;->e(J)Z

    move-result p1

    return p1
.end method

.method public f()J
    .locals 5

    iget-object v0, p0, Lv7/i0$b;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->f()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lv7/i0$b;->b:J

    add-long/2addr v2, v0

    :goto_0
    return-wide v2
.end method

.method public g(J)V
    .locals 3

    iget-object v0, p0, Lv7/i0$b;->a:Lv7/y;

    iget-wide v1, p0, Lv7/i0$b;->b:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lv7/y;->g(J)V

    return-void
.end method

.method public h(Lv7/y;)V
    .locals 0

    iget-object p1, p0, Lv7/i0$b;->c:Lv7/y$a;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv7/y$a;

    invoke-interface {p1, p0}, Lv7/y$a;->h(Lv7/y;)V

    return-void
.end method

.method public isLoading()Z
    .locals 1

    iget-object v0, p0, Lv7/i0$b;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->isLoading()Z

    move-result v0

    return v0
.end method

.method public j(J)J
    .locals 3

    iget-object v0, p0, Lv7/i0$b;->a:Lv7/y;

    iget-wide v1, p0, Lv7/i0$b;->b:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2}, Lv7/y;->j(J)J

    move-result-wide p1

    iget-wide v0, p0, Lv7/i0$b;->b:J

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public k(Lv7/y$a;J)V
    .locals 2

    iput-object p1, p0, Lv7/i0$b;->c:Lv7/y$a;

    iget-object p1, p0, Lv7/i0$b;->a:Lv7/y;

    iget-wide v0, p0, Lv7/i0$b;->b:J

    sub-long/2addr p2, v0

    invoke-interface {p1, p0, p2, p3}, Lv7/y;->k(Lv7/y$a;J)V

    return-void
.end method

.method public l()J
    .locals 5

    iget-object v0, p0, Lv7/i0$b;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->l()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lv7/i0$b;->b:J

    add-long/2addr v2, v0

    :goto_0
    return-wide v2
.end method

.method public m(Lv7/y;)V
    .locals 0

    iget-object p1, p0, Lv7/i0$b;->c:Lv7/y$a;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv7/y$a;

    invoke-interface {p1, p0}, Lv7/w0$a;->a(Lv7/w0;)V

    return-void
.end method

.method public o()V
    .locals 1

    iget-object v0, p0, Lv7/i0$b;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->o()V

    return-void
.end method

.method public r()Lv7/f1;
    .locals 1

    iget-object v0, p0, Lv7/i0$b;->a:Lv7/y;

    invoke-interface {v0}, Lv7/y;->r()Lv7/f1;

    move-result-object v0

    return-object v0
.end method

.method public s(JZ)V
    .locals 3

    iget-object v0, p0, Lv7/i0$b;->a:Lv7/y;

    iget-wide v1, p0, Lv7/i0$b;->b:J

    sub-long/2addr p1, v1

    invoke-interface {v0, p1, p2, p3}, Lv7/y;->s(JZ)V

    return-void
.end method

.method public t([Lq8/r;[Z[Lv7/v0;[ZJ)J
    .locals 12

    move-object v0, p0

    move-object v1, p3

    array-length v2, v1

    new-array v2, v2, [Lv7/v0;

    const/4 v10, 0x0

    move v3, v10

    :goto_0
    array-length v4, v1

    const/4 v11, 0x0

    if-ge v3, v4, :cond_1

    aget-object v4, v1, v3

    check-cast v4, Lv7/i0$c;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lv7/i0$c;->b()Lv7/v0;

    move-result-object v11

    :cond_0
    aput-object v11, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object v3, v0, Lv7/i0$b;->a:Lv7/y;

    iget-wide v4, v0, Lv7/i0$b;->b:J

    sub-long v8, p5, v4

    move-object v4, p1

    move-object v5, p2

    move-object v6, v2

    move-object/from16 v7, p4

    invoke-interface/range {v3 .. v9}, Lv7/y;->t([Lq8/r;[Z[Lv7/v0;[ZJ)J

    move-result-wide v3

    :goto_1
    array-length v5, v1

    if-ge v10, v5, :cond_5

    aget-object v5, v2, v10

    if-nez v5, :cond_2

    aput-object v11, v1, v10

    goto :goto_2

    :cond_2
    aget-object v6, v1, v10

    if-eqz v6, :cond_3

    check-cast v6, Lv7/i0$c;

    invoke-virtual {v6}, Lv7/i0$c;->b()Lv7/v0;

    move-result-object v6

    if-eq v6, v5, :cond_4

    :cond_3
    new-instance v6, Lv7/i0$c;

    iget-wide v7, v0, Lv7/i0$b;->b:J

    invoke-direct {v6, v5, v7, v8}, Lv7/i0$c;-><init>(Lv7/v0;J)V

    aput-object v6, v1, v10

    :cond_4
    :goto_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    :cond_5
    iget-wide v1, v0, Lv7/i0$b;->b:J

    add-long/2addr v3, v1

    return-wide v3
.end method
