.class final Lv7/e$a;
.super Lv7/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final r:J

.field private final s:J

.field private final t:J

.field private final u:Z


# direct methods
.method public constructor <init>(Lt6/d4;JJ)V
    .locals 7

    invoke-direct {p0, p1}, Lv7/s;-><init>(Lt6/d4;)V

    invoke-virtual {p1}, Lt6/d4;->n()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_9

    new-instance v0, Lt6/d4$d;

    invoke-direct {v0}, Lt6/d4$d;-><init>()V

    invoke-virtual {p1, v1, v0}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object p1

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, p2, p3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p2

    iget-boolean v0, p1, Lt6/d4$d;->w:Z

    if-nez v0, :cond_1

    cmp-long v0, p2, v3

    if-eqz v0, :cond_1

    iget-boolean v0, p1, Lt6/d4$d;->s:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lv7/e$b;

    invoke-direct {p1, v2}, Lv7/e$b;-><init>(I)V

    throw p1

    :cond_1
    :goto_0
    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v0, p4, v5

    if-nez v0, :cond_2

    iget-wide p4, p1, Lt6/d4$d;->y:J

    goto :goto_1

    :cond_2
    invoke-static {v3, v4, p4, p5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p4

    :goto_1
    iget-wide v3, p1, Lt6/d4$d;->y:J

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v3, v5

    if-eqz v0, :cond_5

    cmp-long v0, p4, v3

    if-lez v0, :cond_3

    move-wide p4, v3

    :cond_3
    cmp-long v0, p2, p4

    if-gtz v0, :cond_4

    goto :goto_2

    :cond_4
    new-instance p1, Lv7/e$b;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Lv7/e$b;-><init>(I)V

    throw p1

    :cond_5
    :goto_2
    iput-wide p2, p0, Lv7/e$a;->r:J

    iput-wide p4, p0, Lv7/e$a;->s:J

    cmp-long v0, p4, v5

    if-nez v0, :cond_6

    move-wide p2, v5

    goto :goto_3

    :cond_6
    sub-long p2, p4, p2

    :goto_3
    iput-wide p2, p0, Lv7/e$a;->t:J

    iget-boolean p1, p1, Lt6/d4$d;->t:Z

    if-eqz p1, :cond_8

    if-eqz v0, :cond_7

    cmp-long p1, v3, v5

    if-eqz p1, :cond_8

    cmp-long p1, p4, v3

    if-nez p1, :cond_8

    :cond_7
    move v1, v2

    :cond_8
    iput-boolean v1, p0, Lv7/e$a;->u:Z

    return-void

    :cond_9
    new-instance p1, Lv7/e$b;

    invoke-direct {p1, v1}, Lv7/e$b;-><init>(I)V

    throw p1
.end method


# virtual methods
.method public l(ILt6/d4$b;Z)Lt6/d4$b;
    .locals 12

    iget-object p1, p0, Lv7/s;->f:Lt6/d4;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2, p3}, Lt6/d4;->l(ILt6/d4$b;Z)Lt6/d4$b;

    invoke-virtual {p2}, Lt6/d4$b;->r()J

    move-result-wide v0

    iget-wide v2, p0, Lv7/e$a;->r:J

    sub-long v10, v0, v2

    iget-wide v0, p0, Lv7/e$a;->t:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    move-wide v8, v2

    goto :goto_0

    :cond_0
    sub-long/2addr v0, v10

    move-wide v8, v0

    :goto_0
    iget-object v5, p2, Lt6/d4$b;->a:Ljava/lang/Object;

    iget-object v6, p2, Lt6/d4$b;->b:Ljava/lang/Object;

    const/4 v7, 0x0

    move-object v4, p2

    invoke-virtual/range {v4 .. v11}, Lt6/d4$b;->v(Ljava/lang/Object;Ljava/lang/Object;IJJ)Lt6/d4$b;

    move-result-object p1

    return-object p1
.end method

.method public t(ILt6/d4$d;J)Lt6/d4$d;
    .locals 4

    iget-object p1, p0, Lv7/s;->f:Lt6/d4;

    const/4 p3, 0x0

    const-wide/16 v0, 0x0

    invoke-virtual {p1, p3, p2, v0, v1}, Lt6/d4;->t(ILt6/d4$d;J)Lt6/d4$d;

    iget-wide p3, p2, Lt6/d4$d;->B:J

    iget-wide v0, p0, Lv7/e$a;->r:J

    add-long/2addr p3, v0

    iput-wide p3, p2, Lt6/d4$d;->B:J

    iget-wide p3, p0, Lv7/e$a;->t:J

    iput-wide p3, p2, Lt6/d4$d;->y:J

    iget-boolean p1, p0, Lv7/e$a;->u:Z

    iput-boolean p1, p2, Lt6/d4$d;->t:Z

    iget-wide p3, p2, Lt6/d4$d;->x:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p3, v2

    if-eqz p1, :cond_1

    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p3

    iput-wide p3, p2, Lt6/d4$d;->x:J

    iget-wide v0, p0, Lv7/e$a;->s:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p3, p4, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p3

    :goto_0
    iget-wide v0, p0, Lv7/e$a;->r:J

    sub-long/2addr p3, v0

    iput-wide p3, p2, Lt6/d4$d;->x:J

    :cond_1
    iget-wide p3, p0, Lv7/e$a;->r:J

    invoke-static {p3, p4}, Lt8/r0;->a1(J)J

    move-result-wide p3

    iget-wide v0, p2, Lt6/d4$d;->e:J

    cmp-long p1, v0, v2

    if-eqz p1, :cond_2

    add-long/2addr v0, p3

    iput-wide v0, p2, Lt6/d4$d;->e:J

    :cond_2
    iget-wide v0, p2, Lt6/d4$d;->f:J

    cmp-long p1, v0, v2

    if-eqz p1, :cond_3

    add-long/2addr v0, p3

    iput-wide v0, p2, Lt6/d4$d;->f:J

    :cond_3
    return-object p2
.end method