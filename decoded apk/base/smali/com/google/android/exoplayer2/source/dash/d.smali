.class final Lcom/google/android/exoplayer2/source/dash/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv7/v0;


# instance fields
.field private final a:Lt6/u1;

.field private final b:Ln7/c;

.field private c:[J

.field private d:Z

.field private e:Lz7/f;

.field private f:Z

.field private r:I

.field private s:J


# direct methods
.method public constructor <init>(Lz7/f;Lt6/u1;Z)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/d;->a:Lt6/u1;

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->e:Lz7/f;

    new-instance p2, Ln7/c;

    invoke-direct {p2}, Ln7/c;-><init>()V

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/d;->b:Ln7/c;

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lcom/google/android/exoplayer2/source/dash/d;->s:J

    iget-object p2, p1, Lz7/f;->b:[J

    iput-object p2, p0, Lcom/google/android/exoplayer2/source/dash/d;->c:[J

    invoke-virtual {p0, p1, p3}, Lcom/google/android/exoplayer2/source/dash/d;->e(Lz7/f;Z)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d;->e:Lz7/f;

    invoke-virtual {v0}, Lz7/f;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c(J)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/exoplayer2/source/dash/d;->c:[J

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, p2, v1, v2}, Lt8/r0;->e([JJZZ)I

    move-result v0

    iput v0, p0, Lcom/google/android/exoplayer2/source/dash/d;->r:I

    iget-boolean v3, p0, Lcom/google/android/exoplayer2/source/dash/d;->d:Z

    if-eqz v3, :cond_0

    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/d;->c:[J

    array-length v3, v3

    if-ne v0, v3, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    :goto_1
    iput-wide p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->s:J

    return-void
.end method

.method public d()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e(Lz7/f;Z)V
    .locals 8

    iget v0, p0, Lcom/google/android/exoplayer2/source/dash/d;->r:I

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-nez v0, :cond_0

    move-wide v4, v1

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lcom/google/android/exoplayer2/source/dash/d;->c:[J

    add-int/lit8 v0, v0, -0x1

    aget-wide v4, v3, v0

    :goto_0
    iput-boolean p2, p0, Lcom/google/android/exoplayer2/source/dash/d;->d:Z

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->e:Lz7/f;

    iget-object p1, p1, Lz7/f;->b:[J

    iput-object p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->c:[J

    iget-wide v6, p0, Lcom/google/android/exoplayer2/source/dash/d;->s:J

    cmp-long p2, v6, v1

    if-eqz p2, :cond_1

    invoke-virtual {p0, v6, v7}, Lcom/google/android/exoplayer2/source/dash/d;->c(J)V

    goto :goto_1

    :cond_1
    cmp-long p2, v4, v1

    if-eqz p2, :cond_2

    const/4 p2, 0x0

    invoke-static {p1, v4, v5, p2, p2}, Lt8/r0;->e([JJZZ)I

    move-result p1

    iput p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->r:I

    :cond_2
    :goto_1
    return-void
.end method

.method public p(J)I
    .locals 4

    iget v0, p0, Lcom/google/android/exoplayer2/source/dash/d;->r:I

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/d;->c:[J

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v1, p1, p2, v2, v3}, Lt8/r0;->e([JJZZ)I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget p2, p0, Lcom/google/android/exoplayer2/source/dash/d;->r:I

    sub-int p2, p1, p2

    iput p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->r:I

    return p2
.end method

.method public q(Lt6/v1;Lw6/g;I)I
    .locals 6

    iget v0, p0, Lcom/google/android/exoplayer2/source/dash/d;->r:I

    iget-object v1, p0, Lcom/google/android/exoplayer2/source/dash/d;->c:[J

    array-length v1, v1

    const/4 v2, 0x1

    if-ne v0, v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/4 v3, -0x4

    const/4 v4, 0x4

    if-eqz v1, :cond_1

    iget-boolean v5, p0, Lcom/google/android/exoplayer2/source/dash/d;->d:Z

    if-nez v5, :cond_1

    invoke-virtual {p2, v4}, Lw6/a;->w(I)V

    return v3

    :cond_1
    and-int/lit8 v5, p3, 0x2

    if-nez v5, :cond_6

    iget-boolean v5, p0, Lcom/google/android/exoplayer2/source/dash/d;->f:Z

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    if-eqz v1, :cond_3

    const/4 p1, -0x3

    return p1

    :cond_3
    and-int/lit8 p1, p3, 0x1

    if-nez p1, :cond_4

    add-int/lit8 p1, v0, 0x1

    iput p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->r:I

    :cond_4
    and-int/lit8 p1, p3, 0x4

    if-nez p1, :cond_5

    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->b:Ln7/c;

    iget-object p3, p0, Lcom/google/android/exoplayer2/source/dash/d;->e:Lz7/f;

    iget-object p3, p3, Lz7/f;->a:[Ln7/a;

    aget-object p3, p3, v0

    invoke-virtual {p1, p3}, Ln7/c;->a(Ln7/a;)[B

    move-result-object p1

    array-length p3, p1

    invoke-virtual {p2, p3}, Lw6/g;->y(I)V

    iget-object p3, p2, Lw6/g;->c:Ljava/nio/ByteBuffer;

    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    :cond_5
    iget-object p1, p0, Lcom/google/android/exoplayer2/source/dash/d;->c:[J

    aget-wide v0, p1, v0

    iput-wide v0, p2, Lw6/g;->e:J

    invoke-virtual {p2, v2}, Lw6/a;->w(I)V

    return v3

    :cond_6
    :goto_1
    iget-object p2, p0, Lcom/google/android/exoplayer2/source/dash/d;->a:Lt6/u1;

    iput-object p2, p1, Lt6/v1;->b:Lt6/u1;

    iput-boolean v2, p0, Lcom/google/android/exoplayer2/source/dash/d;->f:Z

    const/4 p1, -0x5

    return p1
.end method
