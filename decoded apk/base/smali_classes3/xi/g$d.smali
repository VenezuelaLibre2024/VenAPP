.class final Lxi/g$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxi/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxi/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation


# instance fields
.field private final a:Ldm/c;

.field private final b:Z

.field private final c:Ldm/b;

.field private final d:Lxi/f$b;

.field private e:I

.field private f:Z


# direct methods
.method constructor <init>(Ldm/c;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxi/g$d;->a:Ldm/c;

    iput-boolean p2, p0, Lxi/g$d;->b:Z

    new-instance p1, Ldm/b;

    invoke-direct {p1}, Ldm/b;-><init>()V

    iput-object p1, p0, Lxi/g$d;->c:Ldm/b;

    new-instance p2, Lxi/f$b;

    invoke-direct {p2, p1}, Lxi/f$b;-><init>(Ldm/b;)V

    iput-object p2, p0, Lxi/g$d;->d:Lxi/f$b;

    const/16 p1, 0x4000

    iput p1, p0, Lxi/g$d;->e:I

    return-void
.end method

.method private f(IJ)V
    .locals 5

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_1

    iget v2, p0, Lxi/g$d;->e:I

    int-to-long v2, v2

    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int v2, v2

    int-to-long v3, v2

    sub-long/2addr p2, v3

    cmp-long v0, p2, v0

    if-nez v0, :cond_0

    const/4 v0, 0x4

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    :goto_1
    const/16 v1, 0x9

    invoke-virtual {p0, p1, v2, v1, v0}, Lxi/g$d;->b(IIBB)V

    iget-object v0, p0, Lxi/g$d;->a:Ldm/c;

    iget-object v1, p0, Lxi/g$d;->c:Ldm/b;

    invoke-interface {v0, v1, v3, v4}, Ldm/v;->K0(Ldm/b;J)V

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public declared-synchronized F(ILxi/a;[B)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lxi/g$d;->f:Z

    if-nez v0, :cond_2

    iget v0, p2, Lxi/a;->httpCode:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    array-length v0, p3

    add-int/lit8 v0, v0, 0x8

    const/4 v1, 0x7

    invoke-virtual {p0, v2, v0, v1, v2}, Lxi/g$d;->b(IIBB)V

    iget-object v0, p0, Lxi/g$d;->a:Ldm/c;

    invoke-interface {v0, p1}, Ldm/c;->writeInt(I)Ldm/c;

    iget-object p1, p0, Lxi/g$d;->a:Ldm/c;

    iget p2, p2, Lxi/a;->httpCode:I

    invoke-interface {p1, p2}, Ldm/c;->writeInt(I)Ldm/c;

    array-length p1, p3

    if-lez p1, :cond_0

    iget-object p1, p0, Lxi/g$d;->a:Ldm/c;

    invoke-interface {p1, p3}, Ldm/c;->write([B)Ldm/c;

    :cond_0
    iget-object p1, p0, Lxi/g$d;->a:Ldm/c;

    invoke-interface {p1}, Ldm/c;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    const-string p1, "errorCode.httpCode == -1"

    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p1, p2}, Lxi/g;->h(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized G()V
    .locals 5

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lxi/g$d;->f:Z

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lxi/g$d;->b:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    invoke-static {}, Lxi/g;->d()Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lxi/g;->d()Ljava/util/logging/Logger;

    move-result-object v0

    const-string v1, ">> CONNECTION %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {}, Lxi/g;->c()Ldm/e;

    move-result-object v3

    invoke-virtual {v3}, Ldm/e;->r()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_1
    iget-object v0, p0, Lxi/g$d;->a:Ldm/c;

    invoke-static {}, Lxi/g;->c()Ldm/e;

    move-result-object v1

    invoke-virtual {v1}, Ldm/e;->E()[B

    move-result-object v1

    invoke-interface {v0, v1}, Ldm/c;->write([B)Ldm/c;

    iget-object v0, p0, Lxi/g$d;->a:Ldm/c;

    invoke-interface {v0}, Ldm/c;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :cond_2
    :try_start_2
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized P0(Lxi/i;)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lxi/g$d;->f:Z

    if-nez v0, :cond_4

    invoke-virtual {p1}, Lxi/i;->f()I

    move-result v0

    mul-int/lit8 v0, v0, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {p0, v1, v0, v2, v1}, Lxi/g$d;->b(IIBB)V

    :goto_0
    const/16 v0, 0xa

    if-ge v1, v0, :cond_3

    invoke-virtual {p1, v1}, Lxi/i;->d(I)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    if-ne v1, v2, :cond_1

    const/4 v0, 0x3

    goto :goto_1

    :cond_1
    const/4 v0, 0x7

    if-ne v1, v0, :cond_2

    move v0, v2

    goto :goto_1

    :cond_2
    move v0, v1

    :goto_1
    iget-object v3, p0, Lxi/g$d;->a:Ldm/c;

    invoke-interface {v3, v0}, Ldm/c;->writeShort(I)Ldm/c;

    iget-object v0, p0, Lxi/g$d;->a:Ldm/c;

    invoke-virtual {p1, v1}, Lxi/i;->a(I)I

    move-result v3

    invoke-interface {v0, v3}, Ldm/c;->writeInt(I)Ldm/c;

    :goto_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lxi/g$d;->a:Ldm/c;

    invoke-interface {p1}, Ldm/c;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_4
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized X0(ZILdm/b;I)V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lxi/g$d;->f:Z

    if-nez v0, :cond_1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    int-to-byte p1, p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p2, p1, p3, p4}, Lxi/g$d;->a(IBLdm/b;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method a(IBLdm/b;I)V
    .locals 2

    const/4 v0, 0x0

    invoke-virtual {p0, p1, p4, v0, p2}, Lxi/g$d;->b(IIBB)V

    if-lez p4, :cond_0

    iget-object p1, p0, Lxi/g$d;->a:Ldm/c;

    int-to-long v0, p4

    invoke-interface {p1, p3, v0, v1}, Ldm/v;->K0(Ldm/b;J)V

    :cond_0
    return-void
.end method

.method b(IIBB)V
    .locals 3

    invoke-static {}, Lxi/g;->d()Ljava/util/logging/Logger;

    move-result-object v0

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {}, Lxi/g;->d()Ljava/util/logging/Logger;

    move-result-object v0

    invoke-static {v1, p1, p2, p3, p4}, Lxi/g$b;->b(ZIIBB)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    iget v0, p0, Lxi/g$d;->e:I

    const/4 v2, 0x1

    if-gt p2, v0, :cond_2

    const/high16 v0, -0x80000000

    and-int/2addr v0, p1

    if-nez v0, :cond_1

    iget-object v0, p0, Lxi/g$d;->a:Ldm/c;

    invoke-static {v0, p2}, Lxi/g;->i(Ldm/c;I)V

    iget-object p2, p0, Lxi/g$d;->a:Ldm/c;

    and-int/lit16 p3, p3, 0xff

    invoke-interface {p2, p3}, Ldm/c;->writeByte(I)Ldm/c;

    iget-object p2, p0, Lxi/g$d;->a:Ldm/c;

    and-int/lit16 p3, p4, 0xff

    invoke-interface {p2, p3}, Ldm/c;->writeByte(I)Ldm/c;

    iget-object p2, p0, Lxi/g$d;->a:Ldm/c;

    const p3, 0x7fffffff

    and-int/2addr p1, p3

    invoke-interface {p2, p1}, Ldm/c;->writeInt(I)Ldm/c;

    return-void

    :cond_1
    new-array p2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, v1

    const-string p1, "reserved bit set: %s"

    invoke-static {p1, p2}, Lxi/g;->h(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_2
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, p1, v1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, p1, v2

    const-string p2, "FRAME_SIZE_ERROR length > %d: %d"

    invoke-static {p2, p1}, Lxi/g;->h(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1
.end method

.method public declared-synchronized close()V
    .locals 1

    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    iput-boolean v0, p0, Lxi/g$d;->f:Z

    iget-object v0, p0, Lxi/g$d;->a:Ldm/c;

    invoke-interface {v0}, Ldm/v;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized d(IJ)V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lxi/g$d;->f:Z

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-wide/32 v2, 0x7fffffff

    cmp-long v0, p2, v2

    if-gtz v0, :cond_0

    const/4 v0, 0x4

    const/16 v2, 0x8

    invoke-virtual {p0, p1, v0, v2, v1}, Lxi/g$d;->b(IIBB)V

    iget-object p1, p0, Lxi/g$d;->a:Ldm/c;

    long-to-int p2, p2

    invoke-interface {p1, p2}, Ldm/c;->writeInt(I)Ldm/c;

    iget-object p1, p0, Lxi/g$d;->a:Ldm/c;

    invoke-interface {p1}, Ldm/c;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    const-string p1, "windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v0, v1

    invoke-static {p1, v0}, Lxi/g;->h(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/IllegalArgumentException;

    move-result-object p1

    throw p1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method e(ZILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZI",
            "Ljava/util/List<",
            "Lxi/d;",
            ">;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lxi/g$d;->f:Z

    if-nez v0, :cond_3

    iget-object v0, p0, Lxi/g$d;->d:Lxi/f$b;

    invoke-virtual {v0, p3}, Lxi/f$b;->e(Ljava/util/List;)V

    iget-object p3, p0, Lxi/g$d;->c:Ldm/b;

    invoke-virtual {p3}, Ldm/b;->size()J

    move-result-wide v0

    iget p3, p0, Lxi/g$d;->e:I

    int-to-long v2, p3

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p3, v2

    int-to-long v2, p3

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-eqz p1, :cond_1

    or-int/lit8 p1, v5, 0x1

    int-to-byte v5, p1

    :cond_1
    const/4 p1, 0x1

    invoke-virtual {p0, p2, p3, p1, v5}, Lxi/g$d;->b(IIBB)V

    iget-object p1, p0, Lxi/g$d;->a:Ldm/c;

    iget-object p3, p0, Lxi/g$d;->c:Ldm/b;

    invoke-interface {p1, p3, v2, v3}, Ldm/v;->K0(Ldm/b;J)V

    if-lez v4, :cond_2

    sub-long/2addr v0, v2

    invoke-direct {p0, p2, v0, v1}, Lxi/g$d;->f(IJ)V

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public declared-synchronized flush()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lxi/g$d;->f:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lxi/g$d;->a:Ldm/c;

    invoke-interface {v0}, Ldm/c;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized h(ZII)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lxi/g$d;->f:Z

    if-nez v0, :cond_1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    const/16 v1, 0x8

    const/4 v2, 0x6

    invoke-virtual {p0, v0, v1, v2, p1}, Lxi/g$d;->b(IIBB)V

    iget-object p1, p0, Lxi/g$d;->a:Ldm/c;

    invoke-interface {p1, p2}, Ldm/c;->writeInt(I)Ldm/c;

    iget-object p1, p0, Lxi/g$d;->a:Ldm/c;

    invoke-interface {p1, p3}, Ldm/c;->writeInt(I)Ldm/c;

    iget-object p1, p0, Lxi/g$d;->a:Ldm/c;

    invoke-interface {p1}, Ldm/c;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_1
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized o1(Lxi/i;)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lxi/g$d;->f:Z

    if-nez v0, :cond_0

    iget v0, p0, Lxi/g$d;->e:I

    invoke-virtual {p1, v0}, Lxi/i;->c(I)I

    move-result p1

    iput p1, p0, Lxi/g$d;->e:I

    const/4 p1, 0x4

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v1, p1, v0}, Lxi/g$d;->b(IIBB)V

    iget-object p1, p0, Lxi/g$d;->a:Ldm/c;

    invoke-interface {p1}, Ldm/c;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public p0()I
    .locals 1

    iget v0, p0, Lxi/g$d;->e:I

    return v0
.end method

.method public declared-synchronized r1(ZZIILjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZII",
            "Ljava/util/List<",
            "Lxi/d;",
            ">;)V"
        }
    .end annotation

    monitor-enter p0

    if-nez p2, :cond_1

    :try_start_0
    iget-boolean p2, p0, Lxi/g$d;->f:Z

    if-nez p2, :cond_0

    invoke-virtual {p0, p1, p3, p5}, Lxi/g$d;->e(ZILjava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit p0

    throw p1
.end method

.method public declared-synchronized s(ILxi/a;)V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lxi/g$d;->f:Z

    if-nez v0, :cond_1

    iget v0, p2, Lxi/a;->httpCode:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x4

    invoke-virtual {p0, p1, v2, v0, v1}, Lxi/g$d;->b(IIBB)V

    iget-object p1, p0, Lxi/g$d;->a:Ldm/c;

    iget p2, p2, Lxi/a;->httpCode:I

    invoke-interface {p1, p2}, Ldm/c;->writeInt(I)Ldm/c;

    iget-object p1, p0, Lxi/g$d;->a:Ldm/c;

    invoke-interface {p1}, Ldm/c;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method
