.class final Lf7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf7/g;


# instance fields
.field private final a:[J

.field private final b:[J

.field private final c:J


# direct methods
.method private constructor <init>([J[JJ)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf7/c;->a:[J

    iput-object p2, p0, Lf7/c;->b:[J

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p1, p3, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    array-length p1, p2

    add-int/lit8 p1, p1, -0x1

    aget-wide p1, p2, p1

    invoke-static {p1, p2}, Lt8/r0;->C0(J)J

    move-result-wide p3

    :goto_0
    iput-wide p3, p0, Lf7/c;->c:J

    return-void
.end method

.method public static a(JLq7/k;J)Lf7/c;
    .locals 9

    iget-object v0, p2, Lq7/k;->e:[I

    array-length v0, v0

    add-int/lit8 v1, v0, 0x1

    new-array v2, v1, [J

    new-array v1, v1, [J

    const/4 v3, 0x0

    aput-wide p0, v2, v3

    const-wide/16 v4, 0x0

    aput-wide v4, v1, v3

    const/4 v3, 0x1

    :goto_0
    if-gt v3, v0, :cond_0

    iget v6, p2, Lq7/k;->c:I

    iget-object v7, p2, Lq7/k;->e:[I

    add-int/lit8 v8, v3, -0x1

    aget v7, v7, v8

    add-int/2addr v6, v7

    int-to-long v6, v6

    add-long/2addr p0, v6

    iget v6, p2, Lq7/k;->d:I

    iget-object v7, p2, Lq7/k;->f:[I

    aget v7, v7, v8

    add-int/2addr v6, v7

    int-to-long v6, v6

    add-long/2addr v4, v6

    aput-wide p0, v2, v3

    aput-wide v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Lf7/c;

    invoke-direct {p0, v2, v1, p3, p4}, Lf7/c;-><init>([J[JJ)V

    return-object p0
.end method

.method private static b(J[J[J)Landroid/util/Pair;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J[J[J)",
            "Landroid/util/Pair<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-static {p2, p0, p1, v0, v0}, Lt8/r0;->i([JJZZ)I

    move-result v1

    aget-wide v2, p2, v1

    aget-wide v4, p3, v1

    add-int/2addr v1, v0

    array-length v0, p2

    if-ne v1, v0, :cond_0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    :goto_0
    invoke-static {p0, p1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    move-result-object p0

    return-object p0

    :cond_0
    aget-wide v6, p2, v1

    aget-wide p2, p3, v1

    cmp-long v0, v6, v2

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    goto :goto_1

    :cond_1
    long-to-double v0, p0

    long-to-double v8, v2

    sub-double/2addr v0, v8

    sub-long/2addr v6, v2

    long-to-double v2, v6

    div-double/2addr v0, v2

    :goto_1
    sub-long/2addr p2, v4

    long-to-double p2, p2

    mul-double/2addr v0, p2

    double-to-long p2, v0

    add-long/2addr p2, v4

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0
.end method


# virtual methods
.method public c(J)J
    .locals 2

    iget-object v0, p0, Lf7/c;->a:[J

    iget-object v1, p0, Lf7/c;->b:[J

    invoke-static {p1, p2, v0, v1}, Lf7/c;->b(J[J[J)Landroid/util/Pair;

    move-result-object p1

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    invoke-static {p1, p2}, Lt8/r0;->C0(J)J

    move-result-wide p1

    return-wide p1
.end method

.method public d(J)Ly6/z$a;
    .locals 6

    const-wide/16 v2, 0x0

    iget-wide v4, p0, Lf7/c;->c:J

    move-wide v0, p1

    invoke-static/range {v0 .. v5}, Lt8/r0;->r(JJJ)J

    move-result-wide p1

    invoke-static {p1, p2}, Lt8/r0;->a1(J)J

    move-result-wide p1

    iget-object v0, p0, Lf7/c;->b:[J

    iget-object v1, p0, Lf7/c;->a:[J

    invoke-static {p1, p2, v0, v1}, Lf7/c;->b(J[J[J)Landroid/util/Pair;

    move-result-object p1

    iget-object p2, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-static {v0, v1}, Lt8/r0;->C0(J)J

    move-result-wide v0

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide p1

    new-instance v2, Ly6/z$a;

    new-instance v3, Ly6/a0;

    invoke-direct {v3, v0, v1, p1, p2}, Ly6/a0;-><init>(JJ)V

    invoke-direct {v2, v3}, Ly6/z$a;-><init>(Ly6/a0;)V

    return-object v2
.end method

.method public g()J
    .locals 2

    const-wide/16 v0, -0x1

    return-wide v0
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lf7/c;->c:J

    return-wide v0
.end method
