.class public final Lu8/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu8/n$e;,
        Lu8/n$d;,
        Lu8/n$c;,
        Lu8/n$b;,
        Lu8/n$a;
    }
.end annotation


# instance fields
.field private final a:Lu8/e;

.field private final b:Lu8/n$b;

.field private final c:Lu8/n$e;

.field private d:Z

.field private e:Landroid/view/Surface;

.field private f:F

.field private g:F

.field private h:F

.field private i:F

.field private j:I

.field private k:J

.field private l:J

.field private m:J

.field private n:J

.field private o:J

.field private p:J

.field private q:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lu8/e;

    invoke-direct {v0}, Lu8/e;-><init>()V

    iput-object v0, p0, Lu8/n;->a:Lu8/e;

    invoke-static {p1}, Lu8/n;->f(Landroid/content/Context;)Lu8/n$b;

    move-result-object p1

    iput-object p1, p0, Lu8/n;->b:Lu8/n$b;

    if-eqz p1, :cond_0

    invoke-static {}, Lu8/n$e;->d()Lu8/n$e;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lu8/n;->c:Lu8/n$e;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lu8/n;->k:J

    iput-wide v0, p0, Lu8/n;->l:J

    const/high16 p1, -0x40800000    # -1.0f

    iput p1, p0, Lu8/n;->f:F

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lu8/n;->i:F

    const/4 p1, 0x0

    iput p1, p0, Lu8/n;->j:I

    return-void
.end method

.method public static synthetic a(Lu8/n;Landroid/view/Display;)V
    .locals 0

    invoke-direct {p0, p1}, Lu8/n;->p(Landroid/view/Display;)V

    return-void
.end method

.method private static c(JJ)Z
    .locals 0

    sub-long/2addr p0, p2

    invoke-static {p0, p1}, Ljava/lang/Math;->abs(J)J

    move-result-wide p0

    const-wide/32 p2, 0x1312d00

    cmp-long p0, p0, p2

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private d()V
    .locals 3

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lu8/n;->e:Landroid/view/Surface;

    if-eqz v0, :cond_1

    iget v1, p0, Lu8/n;->j:I

    const/high16 v2, -0x80000000

    if-eq v1, v2, :cond_1

    iget v1, p0, Lu8/n;->h:F

    const/4 v2, 0x0

    cmpl-float v1, v1, v2

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    iput v2, p0, Lu8/n;->h:F

    invoke-static {v0, v2}, Lu8/n$a;->a(Landroid/view/Surface;F)V

    :cond_1
    :goto_0
    return-void
.end method

.method private static e(JJJ)J
    .locals 4

    sub-long v0, p0, p2

    div-long/2addr v0, p4

    mul-long/2addr v0, p4

    add-long/2addr p2, v0

    cmp-long v0, p0, p2

    if-gtz v0, :cond_0

    sub-long p4, p2, p4

    goto :goto_0

    :cond_0
    add-long/2addr p4, p2

    move-wide v2, p2

    move-wide p2, p4

    move-wide p4, v2

    :goto_0
    sub-long v0, p2, p0

    sub-long/2addr p0, p4

    cmp-long p0, v0, p0

    if-gez p0, :cond_1

    goto :goto_1

    :cond_1
    move-wide p2, p4

    :goto_1
    return-wide p2
.end method

.method private static f(Landroid/content/Context;)Lu8/n$b;
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sget v1, Lt8/r0;->a:I

    const/16 v2, 0x11

    if-lt v1, v2, :cond_0

    invoke-static {p0}, Lu8/n$d;->d(Landroid/content/Context;)Lu8/n$b;

    move-result-object v0

    :cond_0
    if-nez v0, :cond_1

    invoke-static {p0}, Lu8/n$c;->c(Landroid/content/Context;)Lu8/n$b;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method private n()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lu8/n;->m:J

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lu8/n;->p:J

    iput-wide v0, p0, Lu8/n;->n:J

    return-void
.end method

.method private p(Landroid/view/Display;)V
    .locals 4

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/Display;->getRefreshRate()F

    move-result p1

    float-to-double v0, p1

    const-wide v2, 0x41cdcd6500000000L    # 1.0E9

    div-double/2addr v2, v0

    double-to-long v0, v2

    iput-wide v0, p0, Lu8/n;->k:J

    const-wide/16 v2, 0x50

    mul-long/2addr v0, v2

    const-wide/16 v2, 0x64

    div-long/2addr v0, v2

    goto :goto_0

    :cond_0
    const-string p1, "VideoFrameReleaseHelper"

    const-string v0, "Unable to query display refresh rate"

    invoke-static {p1, v0}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lu8/n;->k:J

    :goto_0
    iput-wide v0, p0, Lu8/n;->l:J

    return-void
.end method

.method private q()V
    .locals 7

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_8

    iget-object v0, p0, Lu8/n;->e:Landroid/view/Surface;

    if-nez v0, :cond_0

    goto/16 :goto_4

    :cond_0
    iget-object v0, p0, Lu8/n;->a:Lu8/e;

    invoke-virtual {v0}, Lu8/e;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu8/n;->a:Lu8/e;

    invoke-virtual {v0}, Lu8/e;->b()F

    move-result v0

    goto :goto_0

    :cond_1
    iget v0, p0, Lu8/n;->f:F

    :goto_0
    iget v2, p0, Lu8/n;->g:F

    cmpl-float v3, v0, v2

    if-nez v3, :cond_2

    return-void

    :cond_2
    const/high16 v3, -0x40800000    # -1.0f

    cmpl-float v4, v0, v3

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_6

    cmpl-float v2, v2, v3

    if-eqz v2, :cond_6

    iget-object v1, p0, Lu8/n;->a:Lu8/e;

    invoke-virtual {v1}, Lu8/e;->e()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lu8/n;->a:Lu8/e;

    invoke-virtual {v1}, Lu8/e;->d()J

    move-result-wide v1

    const-wide v3, 0x12a05f200L

    cmp-long v1, v1, v3

    if-ltz v1, :cond_3

    move v1, v6

    goto :goto_1

    :cond_3
    move v1, v5

    :goto_1
    if-eqz v1, :cond_4

    const v1, 0x3ca3d70a    # 0.02f

    goto :goto_2

    :cond_4
    const/high16 v1, 0x3f800000    # 1.0f

    :goto_2
    iget v2, p0, Lu8/n;->g:F

    sub-float v2, v0, v2

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v1, v2, v1

    if-ltz v1, :cond_5

    goto :goto_3

    :cond_5
    move v6, v5

    goto :goto_3

    :cond_6
    if-eqz v4, :cond_7

    goto :goto_3

    :cond_7
    iget-object v2, p0, Lu8/n;->a:Lu8/e;

    invoke-virtual {v2}, Lu8/e;->c()I

    move-result v2

    if-lt v2, v1, :cond_5

    :goto_3
    if-eqz v6, :cond_8

    iput v0, p0, Lu8/n;->g:F

    invoke-direct {p0, v5}, Lu8/n;->r(Z)V

    :cond_8
    :goto_4
    return-void
.end method

.method private r(Z)V
    .locals 3

    sget v0, Lt8/r0;->a:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_3

    iget-object v0, p0, Lu8/n;->e:Landroid/view/Surface;

    if-eqz v0, :cond_3

    iget v1, p0, Lu8/n;->j:I

    const/high16 v2, -0x80000000

    if-ne v1, v2, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v1, p0, Lu8/n;->d:Z

    if-eqz v1, :cond_1

    iget v1, p0, Lu8/n;->g:F

    const/high16 v2, -0x40800000    # -1.0f

    cmpl-float v2, v1, v2

    if-eqz v2, :cond_1

    iget v2, p0, Lu8/n;->i:F

    mul-float/2addr v1, v2

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    if-nez p1, :cond_2

    iget p1, p0, Lu8/n;->h:F

    cmpl-float p1, p1, v1

    if-nez p1, :cond_2

    return-void

    :cond_2
    iput v1, p0, Lu8/n;->h:F

    invoke-static {v0, v1}, Lu8/n$a;->a(Landroid/view/Surface;F)V

    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public b(J)J
    .locals 10

    iget-wide v0, p0, Lu8/n;->p:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu8/n;->a:Lu8/e;

    invoke-virtual {v0}, Lu8/e;->e()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu8/n;->a:Lu8/e;

    invoke-virtual {v0}, Lu8/e;->a()J

    move-result-wide v0

    iget-wide v2, p0, Lu8/n;->q:J

    iget-wide v4, p0, Lu8/n;->m:J

    iget-wide v6, p0, Lu8/n;->p:J

    sub-long/2addr v4, v6

    mul-long/2addr v0, v4

    long-to-float v0, v0

    iget v1, p0, Lu8/n;->i:F

    div-float/2addr v0, v1

    float-to-long v0, v0

    add-long/2addr v2, v0

    invoke-static {p1, p2, v2, v3}, Lu8/n;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_0

    move-wide v4, v2

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lu8/n;->n()V

    :cond_1
    move-wide v4, p1

    :goto_0
    iget-wide p1, p0, Lu8/n;->m:J

    iput-wide p1, p0, Lu8/n;->n:J

    iput-wide v4, p0, Lu8/n;->o:J

    iget-object p1, p0, Lu8/n;->c:Lu8/n$e;

    if-eqz p1, :cond_4

    iget-wide v0, p0, Lu8/n;->k:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long p2, v0, v2

    if-nez p2, :cond_2

    goto :goto_1

    :cond_2
    iget-wide v6, p1, Lu8/n$e;->a:J

    cmp-long p1, v6, v2

    if-nez p1, :cond_3

    return-wide v4

    :cond_3
    iget-wide v8, p0, Lu8/n;->k:J

    invoke-static/range {v4 .. v9}, Lu8/n;->e(JJJ)J

    move-result-wide p1

    iget-wide v0, p0, Lu8/n;->l:J

    sub-long/2addr p1, v0

    return-wide p1

    :cond_4
    :goto_1
    return-wide v4
.end method

.method public g(F)V
    .locals 0

    iput p1, p0, Lu8/n;->f:F

    iget-object p1, p0, Lu8/n;->a:Lu8/e;

    invoke-virtual {p1}, Lu8/e;->g()V

    invoke-direct {p0}, Lu8/n;->q()V

    return-void
.end method

.method public h(J)V
    .locals 4

    iget-wide v0, p0, Lu8/n;->n:J

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    iput-wide v0, p0, Lu8/n;->p:J

    iget-wide v0, p0, Lu8/n;->o:J

    iput-wide v0, p0, Lu8/n;->q:J

    :cond_0
    iget-wide v0, p0, Lu8/n;->m:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lu8/n;->m:J

    iget-object v0, p0, Lu8/n;->a:Lu8/e;

    const-wide/16 v1, 0x3e8

    mul-long/2addr p1, v1

    invoke-virtual {v0, p1, p2}, Lu8/e;->f(J)V

    invoke-direct {p0}, Lu8/n;->q()V

    return-void
.end method

.method public i(F)V
    .locals 0

    iput p1, p0, Lu8/n;->i:F

    invoke-direct {p0}, Lu8/n;->n()V

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lu8/n;->r(Z)V

    return-void
.end method

.method public j()V
    .locals 0

    invoke-direct {p0}, Lu8/n;->n()V

    return-void
.end method

.method public k()V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu8/n;->d:Z

    invoke-direct {p0}, Lu8/n;->n()V

    iget-object v0, p0, Lu8/n;->b:Lu8/n$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu8/n;->c:Lu8/n$e;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/n$e;

    invoke-virtual {v0}, Lu8/n$e;->a()V

    iget-object v0, p0, Lu8/n;->b:Lu8/n$b;

    new-instance v1, Lu8/l;

    invoke-direct {v1, p0}, Lu8/l;-><init>(Lu8/n;)V

    invoke-interface {v0, v1}, Lu8/n$b;->b(Lu8/n$b$a;)V

    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lu8/n;->r(Z)V

    return-void
.end method

.method public l()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lu8/n;->d:Z

    iget-object v0, p0, Lu8/n;->b:Lu8/n$b;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lu8/n$b;->a()V

    iget-object v0, p0, Lu8/n;->c:Lu8/n$e;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu8/n$e;

    invoke-virtual {v0}, Lu8/n$e;->e()V

    :cond_0
    invoke-direct {p0}, Lu8/n;->d()V

    return-void
.end method

.method public m(Landroid/view/Surface;)V
    .locals 1

    instance-of v0, p1, Lu8/j;

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    :cond_0
    iget-object v0, p0, Lu8/n;->e:Landroid/view/Surface;

    if-ne v0, p1, :cond_1

    return-void

    :cond_1
    invoke-direct {p0}, Lu8/n;->d()V

    iput-object p1, p0, Lu8/n;->e:Landroid/view/Surface;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lu8/n;->r(Z)V

    return-void
.end method

.method public o(I)V
    .locals 1

    iget v0, p0, Lu8/n;->j:I

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, Lu8/n;->j:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lu8/n;->r(Z)V

    return-void
.end method
