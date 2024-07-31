.class public Lhc/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lic/a;

.field private b:J

.field private c:J


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lhc/p;->b:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lhc/p;->c:J

    new-instance v0, Lic/a$a;

    invoke-direct {v0}, Lic/a$a;-><init>()V

    iput-object v0, p0, Lhc/p;->a:Lic/a;

    return-void
.end method

.method private static b(I)I
    .locals 1

    const/16 v0, 0x190

    if-eq p0, v0, :cond_1

    const/16 v0, 0x194

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public a()Z
    .locals 4

    iget-wide v0, p0, Lhc/p;->c:J

    iget-object v2, p0, Lhc/p;->a:Lic/a;

    invoke-interface {v2}, Lic/a;->a()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lhc/p;->b:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lhc/p;->c:J

    return-void
.end method

.method public d(I)V
    .locals 6

    iget-wide v0, p0, Lhc/p;->b:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lhc/p;->b:J

    invoke-static {p1}, Lhc/p;->b(I)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object p1, p0, Lhc/p;->a:Lic/a;

    invoke-interface {p1}, Lic/a;->a()J

    move-result-wide v0

    const-wide/32 v2, 0x5265c00

    add-long/2addr v0, v2

    iput-wide v0, p0, Lhc/p;->c:J

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    mul-double/2addr v0, v2

    const-wide/high16 v2, 0x3ff0000000000000L    # 1.0

    add-double/2addr v0, v2

    iget-wide v2, p0, Lhc/p;->b:J

    long-to-double v2, v2

    mul-double/2addr v2, v0

    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v0

    const-wide v2, 0x408f400000000000L    # 1000.0

    mul-double/2addr v0, v2

    double-to-long v0, v0

    iget-object p1, p0, Lhc/p;->a:Lic/a;

    invoke-interface {p1}, Lic/a;->a()J

    move-result-wide v2

    const-wide/32 v4, 0xdbba00

    invoke-static {v0, v1, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    add-long/2addr v2, v0

    iput-wide v2, p0, Lhc/p;->c:J

    :goto_0
    return-void
.end method
