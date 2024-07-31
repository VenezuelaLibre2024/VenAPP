.class public final Ly7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly7/f;


# instance fields
.field private final a:Ly6/c;

.field private final b:J


# direct methods
.method public constructor <init>(Ly6/c;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly7/h;->a:Ly6/c;

    iput-wide p2, p0, Ly7/h;->b:J

    return-void
.end method


# virtual methods
.method public a(JJ)J
    .locals 0

    iget-object p3, p0, Ly7/h;->a:Ly6/c;

    iget-object p3, p3, Ly6/c;->d:[J

    long-to-int p1, p1

    aget-wide p1, p3, p1

    return-wide p1
.end method

.method public b(JJ)J
    .locals 0

    const-wide/16 p1, 0x0

    return-wide p1
.end method

.method public c(J)J
    .locals 2

    iget-object v0, p0, Ly7/h;->a:Ly6/c;

    iget-object v0, v0, Ly6/c;->e:[J

    long-to-int p1, p1

    aget-wide p1, v0, p1

    iget-wide v0, p0, Ly7/h;->b:J

    sub-long/2addr p1, v0

    return-wide p1
.end method

.method public d(JJ)J
    .locals 0

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p1
.end method

.method public e(J)Lz7/i;
    .locals 7

    new-instance v6, Lz7/i;

    const/4 v1, 0x0

    iget-object v0, p0, Ly7/h;->a:Ly6/c;

    iget-object v2, v0, Ly6/c;->c:[J

    long-to-int p1, p1

    aget-wide v3, v2, p1

    iget-object p2, v0, Ly6/c;->b:[I

    aget p1, p2, p1

    int-to-long p1, p1

    move-object v0, v6

    move-wide v2, v3

    move-wide v4, p1

    invoke-direct/range {v0 .. v5}, Lz7/i;-><init>(Ljava/lang/String;JJ)V

    return-object v6
.end method

.method public f(JJ)J
    .locals 2

    iget-object p3, p0, Ly7/h;->a:Ly6/c;

    iget-wide v0, p0, Ly7/h;->b:J

    add-long/2addr p1, v0

    invoke-virtual {p3, p1, p2}, Ly6/c;->a(J)I

    move-result p1

    int-to-long p1, p1

    return-wide p1
.end method

.method public g(J)J
    .locals 0

    iget-object p1, p0, Ly7/h;->a:Ly6/c;

    iget p1, p1, Ly6/c;->a:I

    int-to-long p1, p1

    return-wide p1
.end method

.method public h()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public i()J
    .locals 2

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public j(JJ)J
    .locals 0

    iget-object p1, p0, Ly7/h;->a:Ly6/c;

    iget p1, p1, Ly6/c;->a:I

    int-to-long p1, p1

    return-wide p1
.end method
