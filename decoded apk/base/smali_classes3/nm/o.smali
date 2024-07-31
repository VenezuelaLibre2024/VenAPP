.class public final Lnm/o;
.super Landroid/media/MediaDataSource;
.source "SourceFile"


# instance fields
.field private final a:[B


# direct methods
.method public constructor <init>([B)V
    .locals 1

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    iput-object p1, p0, Lnm/o;->a:[B

    return-void
.end method

.method private final a(IJ)I
    .locals 4

    int-to-long v0, p1

    add-long/2addr p2, v0

    iget-object p1, p0, Lnm/o;->a:[B

    array-length v2, p1

    int-to-long v2, v2

    cmp-long v2, p2, v2

    if-lez v2, :cond_0

    array-length p1, p1

    int-to-long v2, p1

    sub-long/2addr p2, v2

    sub-long/2addr v0, p2

    :cond_0
    long-to-int p1, v0

    return p1
.end method


# virtual methods
.method public declared-synchronized close()V
    .locals 0

    monitor-enter p0

    monitor-exit p0

    return-void
.end method

.method public declared-synchronized getSize()J
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lnm/o;->a:[B

    array-length v0, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v0, v0

    monitor-exit p0

    return-wide v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized readAt(J[BII)I
    .locals 2

    monitor-enter p0

    :try_start_0
    const-string v0, "buffer"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lnm/o;->a:[B

    array-length v0, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    int-to-long v0, v0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    monitor-exit p0

    const/4 p1, -0x1

    return p1

    :cond_0
    :try_start_1
    invoke-direct {p0, p5, p1, p2}, Lnm/o;->a(IJ)I

    move-result p5

    iget-object v0, p0, Lnm/o;->a:[B

    long-to-int p1, p1

    invoke-static {v0, p1, p3, p4, p5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return p5

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
