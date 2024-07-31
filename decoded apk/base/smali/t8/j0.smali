.class public final Lt8/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt8/u;


# instance fields
.field private final a:Lt8/d;

.field private b:Z

.field private c:J

.field private d:J

.field private e:Lt6/i3;


# direct methods
.method public constructor <init>(Lt8/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt8/j0;->a:Lt8/d;

    sget-object p1, Lt6/i3;->d:Lt6/i3;

    iput-object p1, p0, Lt8/j0;->e:Lt6/i3;

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    iput-wide p1, p0, Lt8/j0;->c:J

    iget-boolean p1, p0, Lt8/j0;->b:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, Lt8/j0;->a:Lt8/d;

    invoke-interface {p1}, Lt8/d;->b()J

    move-result-wide p1

    iput-wide p1, p0, Lt8/j0;->d:J

    :cond_0
    return-void
.end method

.method public b(Lt6/i3;)V
    .locals 2

    iget-boolean v0, p0, Lt8/j0;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lt8/j0;->w()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lt8/j0;->a(J)V

    :cond_0
    iput-object p1, p0, Lt8/j0;->e:Lt6/i3;

    return-void
.end method

.method public c()Lt6/i3;
    .locals 1

    iget-object v0, p0, Lt8/j0;->e:Lt6/i3;

    return-object v0
.end method

.method public d()V
    .locals 2

    iget-boolean v0, p0, Lt8/j0;->b:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lt8/j0;->a:Lt8/d;

    invoke-interface {v0}, Lt8/d;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lt8/j0;->d:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Lt8/j0;->b:Z

    :cond_0
    return-void
.end method

.method public e()V
    .locals 2

    iget-boolean v0, p0, Lt8/j0;->b:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lt8/j0;->w()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Lt8/j0;->a(J)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lt8/j0;->b:Z

    :cond_0
    return-void
.end method

.method public w()J
    .locals 7

    iget-wide v0, p0, Lt8/j0;->c:J

    iget-boolean v2, p0, Lt8/j0;->b:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Lt8/j0;->a:Lt8/d;

    invoke-interface {v2}, Lt8/d;->b()J

    move-result-wide v2

    iget-wide v4, p0, Lt8/j0;->d:J

    sub-long/2addr v2, v4

    iget-object v4, p0, Lt8/j0;->e:Lt6/i3;

    iget v5, v4, Lt6/i3;->a:F

    const/high16 v6, 0x3f800000    # 1.0f

    cmpl-float v5, v5, v6

    if-nez v5, :cond_0

    invoke-static {v2, v3}, Lt8/r0;->C0(J)J

    move-result-wide v2

    goto :goto_0

    :cond_0
    invoke-virtual {v4, v2, v3}, Lt6/i3;->c(J)J

    move-result-wide v2

    :goto_0
    add-long/2addr v0, v2

    :cond_1
    return-wide v0
.end method
