.class final Lj7/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/z;


# instance fields
.field private final a:Lj7/c;

.field private final b:I

.field private final c:J

.field private final d:J

.field private final e:J


# direct methods
.method public constructor <init>(Lj7/c;IJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj7/e;->a:Lj7/c;

    iput p2, p0, Lj7/e;->b:I

    iput-wide p3, p0, Lj7/e;->c:J

    sub-long/2addr p5, p3

    iget p1, p1, Lj7/c;->e:I

    int-to-long p1, p1

    div-long/2addr p5, p1

    iput-wide p5, p0, Lj7/e;->d:J

    invoke-direct {p0, p5, p6}, Lj7/e;->a(J)J

    move-result-wide p1

    iput-wide p1, p0, Lj7/e;->e:J

    return-void
.end method

.method private a(J)J
    .locals 8

    iget v0, p0, Lj7/e;->b:I

    int-to-long v0, v0

    mul-long v2, p1, v0

    const-wide/32 v4, 0xf4240

    iget-object p1, p0, Lj7/e;->a:Lj7/c;

    iget p1, p1, Lj7/c;->c:I

    int-to-long v6, p1

    invoke-static/range {v2 .. v7}, Lt8/r0;->O0(JJJ)J

    move-result-wide p1

    return-wide p1
.end method


# virtual methods
.method public d(J)Ly6/z$a;
    .locals 10

    iget-object v0, p0, Lj7/e;->a:Lj7/c;

    iget v0, v0, Lj7/c;->c:I

    int-to-long v0, v0

    mul-long/2addr v0, p1

    iget v2, p0, Lj7/e;->b:I

    int-to-long v2, v2

    const-wide/32 v4, 0xf4240

    mul-long/2addr v2, v4

    div-long v4, v0, v2

    const-wide/16 v6, 0x0

    iget-wide v0, p0, Lj7/e;->d:J

    const-wide/16 v2, 0x1

    sub-long v8, v0, v2

    invoke-static/range {v4 .. v9}, Lt8/r0;->r(JJJ)J

    move-result-wide v0

    iget-wide v4, p0, Lj7/e;->c:J

    iget-object v6, p0, Lj7/e;->a:Lj7/c;

    iget v6, v6, Lj7/c;->e:I

    int-to-long v6, v6

    mul-long/2addr v6, v0

    add-long/2addr v4, v6

    invoke-direct {p0, v0, v1}, Lj7/e;->a(J)J

    move-result-wide v6

    new-instance v8, Ly6/a0;

    invoke-direct {v8, v6, v7, v4, v5}, Ly6/a0;-><init>(JJ)V

    cmp-long p1, v6, p1

    if-gez p1, :cond_1

    iget-wide p1, p0, Lj7/e;->d:J

    sub-long/2addr p1, v2

    cmp-long p1, v0, p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    add-long/2addr v0, v2

    iget-wide p1, p0, Lj7/e;->c:J

    iget-object v2, p0, Lj7/e;->a:Lj7/c;

    iget v2, v2, Lj7/c;->e:I

    int-to-long v2, v2

    mul-long/2addr v2, v0

    add-long/2addr p1, v2

    invoke-direct {p0, v0, v1}, Lj7/e;->a(J)J

    move-result-wide v0

    new-instance v2, Ly6/a0;

    invoke-direct {v2, v0, v1, p1, p2}, Ly6/a0;-><init>(JJ)V

    new-instance p1, Ly6/z$a;

    invoke-direct {p1, v8, v2}, Ly6/z$a;-><init>(Ly6/a0;Ly6/a0;)V

    return-object p1

    :cond_1
    :goto_0
    new-instance p1, Ly6/z$a;

    invoke-direct {p1, v8}, Ly6/z$a;-><init>(Ly6/a0;)V

    return-object p1
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lj7/e;->e:J

    return-wide v0
.end method
