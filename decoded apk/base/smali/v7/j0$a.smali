.class final Lv7/j0$a;
.super Lv7/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv7/j0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final r:[J

.field private final s:[J


# direct methods
.method public constructor <init>(Lt6/d4;Ljava/util/Map;)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt6/d4;",
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lv7/s;-><init>(Lt6/d4;)V

    invoke-virtual {p1}, Lt6/d4;->u()I

    move-result v0

    invoke-virtual {p1}, Lt6/d4;->u()I

    move-result v1

    new-array v1, v1, [J

    iput-object v1, p0, Lv7/j0$a;->s:[J

    new-instance v1, Lt6/d4$d;

    invoke-direct {v1}, Lt6/d4$d;-><init>()V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_0

    iget-object v4, p0, Lv7/j0$a;->s:[J

    invoke-virtual {p1, v3, v1}, Lt6/d4;->s(ILt6/d4$d;)Lt6/d4$d;

    move-result-object v5

    iget-wide v5, v5, Lt6/d4$d;->y:J

    aput-wide v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lt6/d4;->n()I

    move-result v0

    new-array v1, v0, [J

    iput-object v1, p0, Lv7/j0$a;->r:[J

    new-instance v1, Lt6/d4$b;

    invoke-direct {v1}, Lt6/d4$b;-><init>()V

    :goto_1
    if-ge v2, v0, :cond_3

    const/4 v3, 0x1

    invoke-virtual {p1, v2, v1, v3}, Lt6/d4;->l(ILt6/d4$b;Z)Lt6/d4$b;

    iget-object v3, v1, Lt6/d4$b;->b:Ljava/lang/Object;

    invoke-interface {p2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-static {v3}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Long;

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object v5, p0, Lv7/j0$a;->r:[J

    const-wide/high16 v6, -0x8000000000000000L

    cmp-long v6, v3, v6

    if-eqz v6, :cond_1

    goto :goto_2

    :cond_1
    iget-wide v3, v1, Lt6/d4$b;->d:J

    :goto_2
    aput-wide v3, v5, v2

    iget-wide v5, v1, Lt6/d4$b;->d:J

    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v7, v5, v7

    if-eqz v7, :cond_2

    iget-object v7, p0, Lv7/j0$a;->s:[J

    iget v8, v1, Lt6/d4$b;->c:I

    aget-wide v9, v7, v8

    sub-long/2addr v5, v3

    sub-long/2addr v9, v5

    aput-wide v9, v7, v8

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    return-void
.end method


# virtual methods
.method public l(ILt6/d4$b;Z)Lt6/d4$b;
    .locals 2

    invoke-super {p0, p1, p2, p3}, Lv7/s;->l(ILt6/d4$b;Z)Lt6/d4$b;

    iget-object p3, p0, Lv7/j0$a;->r:[J

    aget-wide v0, p3, p1

    iput-wide v0, p2, Lt6/d4$b;->d:J

    return-object p2
.end method

.method public t(ILt6/d4$d;J)Lt6/d4$d;
    .locals 4

    invoke-super {p0, p1, p2, p3, p4}, Lv7/s;->t(ILt6/d4$d;J)Lt6/d4$d;

    iget-object p3, p0, Lv7/j0$a;->s:[J

    aget-wide v0, p3, p1

    iput-wide v0, p2, Lt6/d4$d;->y:J

    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, v0, p3

    if-eqz p1, :cond_1

    iget-wide v2, p2, Lt6/d4$d;->x:J

    cmp-long p1, v2, p3

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p3

    goto :goto_1

    :cond_1
    :goto_0
    iget-wide p3, p2, Lt6/d4$d;->x:J

    :goto_1
    iput-wide p3, p2, Lt6/d4$d;->x:J

    return-object p2
.end method
