.class final Lf7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf7/g;


# instance fields
.field private final a:J

.field private final b:Lt8/t;

.field private final c:Lt8/t;

.field private d:J


# direct methods
.method public constructor <init>(JJJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lf7/b;->d:J

    iput-wide p5, p0, Lf7/b;->a:J

    new-instance p1, Lt8/t;

    invoke-direct {p1}, Lt8/t;-><init>()V

    iput-object p1, p0, Lf7/b;->b:Lt8/t;

    new-instance p2, Lt8/t;

    invoke-direct {p2}, Lt8/t;-><init>()V

    iput-object p2, p0, Lf7/b;->c:Lt8/t;

    const-wide/16 p5, 0x0

    invoke-virtual {p1, p5, p6}, Lt8/t;->a(J)V

    invoke-virtual {p2, p3, p4}, Lt8/t;->a(J)V

    return-void
.end method


# virtual methods
.method public a(J)Z
    .locals 3

    iget-object v0, p0, Lf7/b;->b:Lt8/t;

    invoke-virtual {v0}, Lt8/t;->c()I

    move-result v1

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Lt8/t;->b(I)J

    move-result-wide v0

    sub-long/2addr p1, v0

    const-wide/32 v0, 0x186a0

    cmp-long p1, p1, v0

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public b(JJ)V
    .locals 1

    invoke-virtual {p0, p1, p2}, Lf7/b;->a(J)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lf7/b;->b:Lt8/t;

    invoke-virtual {v0, p1, p2}, Lt8/t;->a(J)V

    iget-object p1, p0, Lf7/b;->c:Lt8/t;

    invoke-virtual {p1, p3, p4}, Lt8/t;->a(J)V

    return-void
.end method

.method public c(J)J
    .locals 2

    iget-object v0, p0, Lf7/b;->c:Lt8/t;

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1, v1}, Lt8/r0;->g(Lt8/t;JZZ)I

    move-result p1

    iget-object p2, p0, Lf7/b;->b:Lt8/t;

    invoke-virtual {p2, p1}, Lt8/t;->b(I)J

    move-result-wide p1

    return-wide p1
.end method

.method public d(J)Ly6/z$a;
    .locals 7

    iget-object v0, p0, Lf7/b;->b:Lt8/t;

    const/4 v1, 0x1

    invoke-static {v0, p1, p2, v1, v1}, Lt8/r0;->g(Lt8/t;JZZ)I

    move-result v0

    new-instance v2, Ly6/a0;

    iget-object v3, p0, Lf7/b;->b:Lt8/t;

    invoke-virtual {v3, v0}, Lt8/t;->b(I)J

    move-result-wide v3

    iget-object v5, p0, Lf7/b;->c:Lt8/t;

    invoke-virtual {v5, v0}, Lt8/t;->b(I)J

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Ly6/a0;-><init>(JJ)V

    iget-wide v3, v2, Ly6/a0;->a:J

    cmp-long p1, v3, p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lf7/b;->b:Lt8/t;

    invoke-virtual {p1}, Lt8/t;->c()I

    move-result p1

    sub-int/2addr p1, v1

    if-ne v0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ly6/a0;

    iget-object p2, p0, Lf7/b;->b:Lt8/t;

    add-int/2addr v0, v1

    invoke-virtual {p2, v0}, Lt8/t;->b(I)J

    move-result-wide v3

    iget-object p2, p0, Lf7/b;->c:Lt8/t;

    invoke-virtual {p2, v0}, Lt8/t;->b(I)J

    move-result-wide v0

    invoke-direct {p1, v3, v4, v0, v1}, Ly6/a0;-><init>(JJ)V

    new-instance p2, Ly6/z$a;

    invoke-direct {p2, v2, p1}, Ly6/z$a;-><init>(Ly6/a0;Ly6/a0;)V

    return-object p2

    :cond_1
    :goto_0
    new-instance p1, Ly6/z$a;

    invoke-direct {p1, v2}, Ly6/z$a;-><init>(Ly6/a0;)V

    return-object p1
.end method

.method e(J)V
    .locals 0

    iput-wide p1, p0, Lf7/b;->d:J

    return-void
.end method

.method public g()J
    .locals 2

    iget-wide v0, p0, Lf7/b;->a:J

    return-wide v0
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public i()J
    .locals 2

    iget-wide v0, p0, Lf7/b;->d:J

    return-wide v0
.end method
