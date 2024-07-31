.class final Ld7/c;
.super Ly6/u;
.source "SourceFile"


# instance fields
.field private final b:J


# direct methods
.method public constructor <init>(Ly6/l;J)V
    .locals 2

    invoke-direct {p0, p1}, Ly6/u;-><init>(Ly6/l;)V

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v0

    cmp-long p1, v0, p2

    if-ltz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lt8/a;->a(Z)V

    iput-wide p2, p0, Ld7/c;->b:J

    return-void
.end method


# virtual methods
.method public getLength()J
    .locals 4

    invoke-super {p0}, Ly6/u;->getLength()J

    move-result-wide v0

    iget-wide v2, p0, Ld7/c;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public getPosition()J
    .locals 4

    invoke-super {p0}, Ly6/u;->getPosition()J

    move-result-wide v0

    iget-wide v2, p0, Ld7/c;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method

.method public i()J
    .locals 4

    invoke-super {p0}, Ly6/u;->i()J

    move-result-wide v0

    iget-wide v2, p0, Ld7/c;->b:J

    sub-long/2addr v0, v2

    return-wide v0
.end method
