.class final Lio/grpc/internal/z1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final a:I

.field final b:J

.field final c:J

.field final d:D

.field final e:Ljava/lang/Long;

.field final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lvi/g1$b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(IJJDLjava/lang/Long;Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJJD",
            "Ljava/lang/Long;",
            "Ljava/util/Set<",
            "Lvi/g1$b;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lio/grpc/internal/z1;->a:I

    iput-wide p2, p0, Lio/grpc/internal/z1;->b:J

    iput-wide p4, p0, Lio/grpc/internal/z1;->c:J

    iput-wide p6, p0, Lio/grpc/internal/z1;->d:D

    iput-object p8, p0, Lio/grpc/internal/z1;->e:Ljava/lang/Long;

    invoke-static {p9}, Lcom/google/common/collect/a0;->r(Ljava/util/Collection;)Lcom/google/common/collect/a0;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/z1;->f:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, Lio/grpc/internal/z1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lio/grpc/internal/z1;

    iget v0, p0, Lio/grpc/internal/z1;->a:I

    iget v2, p1, Lio/grpc/internal/z1;->a:I

    if-ne v0, v2, :cond_1

    iget-wide v2, p0, Lio/grpc/internal/z1;->b:J

    iget-wide v4, p1, Lio/grpc/internal/z1;->b:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, Lio/grpc/internal/z1;->c:J

    iget-wide v4, p1, Lio/grpc/internal/z1;->c:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget-wide v2, p0, Lio/grpc/internal/z1;->d:D

    iget-wide v4, p1, Lio/grpc/internal/z1;->d:D

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Double;->compare(DD)I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/z1;->e:Ljava/lang/Long;

    iget-object v2, p1, Lio/grpc/internal/z1;->e:Ljava/lang/Long;

    invoke-static {v0, v2}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/z1;->f:Ljava/util/Set;

    iget-object p1, p1, Lio/grpc/internal/z1;->f:Ljava/util/Set;

    invoke-static {v0, p1}, Leb/k;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Lio/grpc/internal/z1;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-wide v1, p0, Lio/grpc/internal/z1;->b:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-wide v1, p0, Lio/grpc/internal/z1;->c:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-wide v1, p0, Lio/grpc/internal/z1;->d:D

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x3

    aput-object v1, v0, v2

    const/4 v1, 0x4

    iget-object v2, p0, Lio/grpc/internal/z1;->e:Ljava/lang/Long;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    iget-object v2, p0, Lio/grpc/internal/z1;->f:Ljava/util/Set;

    aput-object v2, v0, v1

    invoke-static {v0}, Leb/k;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "maxAttempts"

    iget v2, p0, Lio/grpc/internal/z1;->a:I

    invoke-virtual {v0, v1, v2}, Leb/i$b;->b(Ljava/lang/String;I)Leb/i$b;

    move-result-object v0

    const-string v1, "initialBackoffNanos"

    iget-wide v2, p0, Lio/grpc/internal/z1;->b:J

    invoke-virtual {v0, v1, v2, v3}, Leb/i$b;->c(Ljava/lang/String;J)Leb/i$b;

    move-result-object v0

    const-string v1, "maxBackoffNanos"

    iget-wide v2, p0, Lio/grpc/internal/z1;->c:J

    invoke-virtual {v0, v1, v2, v3}, Leb/i$b;->c(Ljava/lang/String;J)Leb/i$b;

    move-result-object v0

    const-string v1, "backoffMultiplier"

    iget-wide v2, p0, Lio/grpc/internal/z1;->d:D

    invoke-virtual {v0, v1, v2, v3}, Leb/i$b;->a(Ljava/lang/String;D)Leb/i$b;

    move-result-object v0

    const-string v1, "perAttemptRecvTimeoutNanos"

    iget-object v2, p0, Lio/grpc/internal/z1;->e:Ljava/lang/Long;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    const-string v1, "retryableStatusCodes"

    iget-object v2, p0, Lio/grpc/internal/z1;->f:Ljava/util/Set;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method