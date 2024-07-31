.class public Lio/grpc/internal/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Lio/grpc/internal/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/k1$c;,
        Lio/grpc/internal/k1$d;,
        Lio/grpc/internal/k1$e;,
        Lio/grpc/internal/k1$b;
    }
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:Z

.field private volatile D:Z

.field private a:Lio/grpc/internal/k1$b;

.field private b:I

.field private final c:Lio/grpc/internal/h2;

.field private final d:Lio/grpc/internal/n2;

.field private e:Lvi/u;

.field private f:Lio/grpc/internal/r0;

.field private r:[B

.field private s:I

.field private t:Lio/grpc/internal/k1$e;

.field private u:I

.field private v:Z

.field private w:Lio/grpc/internal/u;

.field private x:Lio/grpc/internal/u;

.field private y:J

.field private z:Z


# direct methods
.method public constructor <init>(Lio/grpc/internal/k1$b;Lvi/u;ILio/grpc/internal/h2;Lio/grpc/internal/n2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lio/grpc/internal/k1$e;->HEADER:Lio/grpc/internal/k1$e;

    iput-object v0, p0, Lio/grpc/internal/k1;->t:Lio/grpc/internal/k1$e;

    const/4 v0, 0x5

    iput v0, p0, Lio/grpc/internal/k1;->u:I

    new-instance v0, Lio/grpc/internal/u;

    invoke-direct {v0}, Lio/grpc/internal/u;-><init>()V

    iput-object v0, p0, Lio/grpc/internal/k1;->x:Lio/grpc/internal/u;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/grpc/internal/k1;->z:Z

    const/4 v1, -0x1

    iput v1, p0, Lio/grpc/internal/k1;->A:I

    iput-boolean v0, p0, Lio/grpc/internal/k1;->C:Z

    iput-boolean v0, p0, Lio/grpc/internal/k1;->D:Z

    const-string v0, "sink"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/k1$b;

    iput-object p1, p0, Lio/grpc/internal/k1;->a:Lio/grpc/internal/k1$b;

    const-string p1, "decompressor"

    invoke-static {p2, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/u;

    iput-object p1, p0, Lio/grpc/internal/k1;->e:Lvi/u;

    iput p3, p0, Lio/grpc/internal/k1;->b:I

    const-string p1, "statsTraceCtx"

    invoke-static {p4, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/h2;

    iput-object p1, p0, Lio/grpc/internal/k1;->c:Lio/grpc/internal/h2;

    const-string p1, "transportTracer"

    invoke-static {p5, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/n2;

    iput-object p1, p0, Lio/grpc/internal/k1;->d:Lio/grpc/internal/n2;

    return-void
.end method

.method private a()V
    .locals 6

    iget-boolean v0, p0, Lio/grpc/internal/k1;->z:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/k1;->z:Z

    :goto_0
    const/4 v1, 0x0

    :try_start_0
    iget-boolean v2, p0, Lio/grpc/internal/k1;->D:Z

    if-nez v2, :cond_3

    iget-wide v2, p0, Lio/grpc/internal/k1;->y:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-lez v2, :cond_3

    invoke-direct {p0}, Lio/grpc/internal/k1;->y()Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Lio/grpc/internal/k1$a;->a:[I

    iget-object v3, p0, Lio/grpc/internal/k1;->t:Lio/grpc/internal/k1$e;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    if-eq v2, v0, :cond_2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-direct {p0}, Lio/grpc/internal/k1;->q()V

    iget-wide v2, p0, Lio/grpc/internal/k1;->y:J

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lio/grpc/internal/k1;->y:J

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lio/grpc/internal/k1;->t:Lio/grpc/internal/k1$e;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    invoke-direct {p0}, Lio/grpc/internal/k1;->r()V

    goto :goto_0

    :cond_3
    iget-boolean v0, p0, Lio/grpc/internal/k1;->D:Z

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lio/grpc/internal/k1;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, Lio/grpc/internal/k1;->z:Z

    return-void

    :cond_4
    :try_start_1
    iget-boolean v0, p0, Lio/grpc/internal/k1;->C:Z

    if-eqz v0, :cond_5

    invoke-direct {p0}, Lio/grpc/internal/k1;->o()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lio/grpc/internal/k1;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_5
    iput-boolean v1, p0, Lio/grpc/internal/k1;->z:Z

    return-void

    :catchall_0
    move-exception v0

    iput-boolean v1, p0, Lio/grpc/internal/k1;->z:Z

    throw v0
.end method

.method private j()Ljava/io/InputStream;
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/k1;->e:Lvi/u;

    sget-object v1, Lvi/l$b;->a:Lvi/l;

    if-eq v0, v1, :cond_0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/k1;->w:Lio/grpc/internal/u;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lio/grpc/internal/v1;->c(Lio/grpc/internal/u1;Z)Ljava/io/InputStream;

    move-result-object v1

    invoke-interface {v0, v1}, Lvi/u;->b(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object v0

    new-instance v1, Lio/grpc/internal/k1$d;

    iget v2, p0, Lio/grpc/internal/k1;->b:I

    iget-object v3, p0, Lio/grpc/internal/k1;->c:Lio/grpc/internal/h2;

    invoke-direct {v1, v0, v2, v3}, Lio/grpc/internal/k1$d;-><init>(Ljava/io/InputStream;ILio/grpc/internal/h2;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    sget-object v0, Lvi/g1;->t:Lvi/g1;

    const-string v1, "Can\'t decode compressed gRPC message as compression not configured"

    invoke-virtual {v0, v1}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v0

    invoke-virtual {v0}, Lvi/g1;->d()Lvi/i1;

    move-result-object v0

    throw v0
.end method

.method private l()Ljava/io/InputStream;
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/k1;->c:Lio/grpc/internal/h2;

    iget-object v1, p0, Lio/grpc/internal/k1;->w:Lio/grpc/internal/u;

    invoke-virtual {v1}, Lio/grpc/internal/u;->k()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lio/grpc/internal/h2;->f(J)V

    iget-object v0, p0, Lio/grpc/internal/k1;->w:Lio/grpc/internal/u;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lio/grpc/internal/v1;->c(Lio/grpc/internal/u1;Z)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method private n()Z
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/k1;->isClosed()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lio/grpc/internal/k1;->C:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private o()Z
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/grpc/internal/r0;->H()Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/k1;->x:Lio/grpc/internal/u;

    invoke-virtual {v0}, Lio/grpc/internal/u;->k()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private q()V
    .locals 6

    iget-object v0, p0, Lio/grpc/internal/k1;->c:Lio/grpc/internal/h2;

    iget v1, p0, Lio/grpc/internal/k1;->A:I

    iget v2, p0, Lio/grpc/internal/k1;->B:I

    int-to-long v2, v2

    const-wide/16 v4, -0x1

    invoke-virtual/range {v0 .. v5}, Lio/grpc/internal/h2;->e(IJJ)V

    const/4 v0, 0x0

    iput v0, p0, Lio/grpc/internal/k1;->B:I

    iget-boolean v0, p0, Lio/grpc/internal/k1;->v:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/grpc/internal/k1;->j()Ljava/io/InputStream;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/grpc/internal/k1;->l()Ljava/io/InputStream;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    iput-object v1, p0, Lio/grpc/internal/k1;->w:Lio/grpc/internal/u;

    iget-object v2, p0, Lio/grpc/internal/k1;->a:Lio/grpc/internal/k1$b;

    new-instance v3, Lio/grpc/internal/k1$c;

    invoke-direct {v3, v0, v1}, Lio/grpc/internal/k1$c;-><init>(Ljava/io/InputStream;Lio/grpc/internal/k1$a;)V

    invoke-interface {v2, v3}, Lio/grpc/internal/k1$b;->a(Lio/grpc/internal/j2$a;)V

    sget-object v0, Lio/grpc/internal/k1$e;->HEADER:Lio/grpc/internal/k1$e;

    iput-object v0, p0, Lio/grpc/internal/k1;->t:Lio/grpc/internal/k1$e;

    const/4 v0, 0x5

    iput v0, p0, Lio/grpc/internal/k1;->u:I

    return-void
.end method

.method private r()V
    .locals 6

    iget-object v0, p0, Lio/grpc/internal/k1;->w:Lio/grpc/internal/u;

    invoke-virtual {v0}, Lio/grpc/internal/u;->readUnsignedByte()I

    move-result v0

    and-int/lit16 v1, v0, 0xfe

    if-nez v1, :cond_2

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Lio/grpc/internal/k1;->v:Z

    iget-object v0, p0, Lio/grpc/internal/k1;->w:Lio/grpc/internal/u;

    invoke-virtual {v0}, Lio/grpc/internal/c;->readInt()I

    move-result v0

    iput v0, p0, Lio/grpc/internal/k1;->u:I

    if-ltz v0, :cond_1

    iget v3, p0, Lio/grpc/internal/k1;->b:I

    if-gt v0, v3, :cond_1

    iget v0, p0, Lio/grpc/internal/k1;->A:I

    add-int/2addr v0, v1

    iput v0, p0, Lio/grpc/internal/k1;->A:I

    iget-object v1, p0, Lio/grpc/internal/k1;->c:Lio/grpc/internal/h2;

    invoke-virtual {v1, v0}, Lio/grpc/internal/h2;->d(I)V

    iget-object v0, p0, Lio/grpc/internal/k1;->d:Lio/grpc/internal/n2;

    invoke-virtual {v0}, Lio/grpc/internal/n2;->d()V

    sget-object v0, Lio/grpc/internal/k1$e;->BODY:Lio/grpc/internal/k1$e;

    iput-object v0, p0, Lio/grpc/internal/k1;->t:Lio/grpc/internal/k1$e;

    return-void

    :cond_1
    sget-object v0, Lvi/g1;->o:Lvi/g1;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v4, 0x2

    new-array v4, v4, [Ljava/lang/Object;

    iget v5, p0, Lio/grpc/internal/k1;->b:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v4, v2

    iget v2, p0, Lio/grpc/internal/k1;->u:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v4, v1

    const-string v1, "gRPC message exceeds maximum size %d: %d"

    invoke-static {v3, v1, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v0

    invoke-virtual {v0}, Lvi/g1;->d()Lvi/i1;

    move-result-object v0

    throw v0

    :cond_2
    sget-object v0, Lvi/g1;->t:Lvi/g1;

    const-string v1, "gRPC frame header malformed: reserved bits not zero"

    invoke-virtual {v0, v1}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v0

    invoke-virtual {v0}, Lvi/g1;->d()Lvi/i1;

    move-result-object v0

    throw v0
.end method

.method private y()Z
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/k1;->w:Lio/grpc/internal/u;

    if-nez v1, :cond_0

    new-instance v1, Lio/grpc/internal/u;

    invoke-direct {v1}, Lio/grpc/internal/u;-><init>()V

    iput-object v1, p0, Lio/grpc/internal/k1;->w:Lio/grpc/internal/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    move v1, v0

    move v2, v1

    :goto_0
    :try_start_1
    iget v3, p0, Lio/grpc/internal/k1;->u:I

    iget-object v4, p0, Lio/grpc/internal/k1;->w:Lio/grpc/internal/u;

    invoke-virtual {v4}, Lio/grpc/internal/u;->k()I

    move-result v4

    sub-int/2addr v3, v4

    if-lez v3, :cond_a

    iget-object v4, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v4, :cond_6

    :try_start_2
    iget-object v4, p0, Lio/grpc/internal/k1;->r:[B

    if-eqz v4, :cond_1

    iget v5, p0, Lio/grpc/internal/k1;->s:I

    array-length v4, v4

    if-ne v5, v4, :cond_2

    :cond_1
    const/high16 v4, 0x200000

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    new-array v4, v4, [B

    iput-object v4, p0, Lio/grpc/internal/k1;->r:[B

    iput v0, p0, Lio/grpc/internal/k1;->s:I

    :cond_2
    iget-object v4, p0, Lio/grpc/internal/k1;->r:[B

    array-length v4, v4

    iget v5, p0, Lio/grpc/internal/k1;->s:I

    sub-int/2addr v4, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget-object v4, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    iget-object v5, p0, Lio/grpc/internal/k1;->r:[B

    iget v6, p0, Lio/grpc/internal/k1;->s:I

    invoke-virtual {v4, v5, v6, v3}, Lio/grpc/internal/r0;->B([BII)I

    move-result v3

    iget-object v4, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    invoke-virtual {v4}, Lio/grpc/internal/r0;->o()I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    invoke-virtual {v4}, Lio/grpc/internal/r0;->q()I

    move-result v4
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/2addr v2, v4

    if-nez v3, :cond_5

    if-lez v1, :cond_4

    iget-object v3, p0, Lio/grpc/internal/k1;->a:Lio/grpc/internal/k1$b;

    invoke-interface {v3, v1}, Lio/grpc/internal/k1$b;->c(I)V

    iget-object v3, p0, Lio/grpc/internal/k1;->t:Lio/grpc/internal/k1$e;

    sget-object v4, Lio/grpc/internal/k1$e;->BODY:Lio/grpc/internal/k1$e;

    if-ne v3, v4, :cond_4

    iget-object v3, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    if-eqz v3, :cond_3

    iget-object v1, p0, Lio/grpc/internal/k1;->c:Lio/grpc/internal/h2;

    int-to-long v3, v2

    invoke-virtual {v1, v3, v4}, Lio/grpc/internal/h2;->g(J)V

    iget v1, p0, Lio/grpc/internal/k1;->B:I

    add-int/2addr v1, v2

    iput v1, p0, Lio/grpc/internal/k1;->B:I

    goto :goto_1

    :cond_3
    iget-object v2, p0, Lio/grpc/internal/k1;->c:Lio/grpc/internal/h2;

    int-to-long v3, v1

    invoke-virtual {v2, v3, v4}, Lio/grpc/internal/h2;->g(J)V

    iget v2, p0, Lio/grpc/internal/k1;->B:I

    add-int/2addr v2, v1

    iput v2, p0, Lio/grpc/internal/k1;->B:I

    :cond_4
    :goto_1
    return v0

    :cond_5
    :try_start_3
    iget-object v4, p0, Lio/grpc/internal/k1;->w:Lio/grpc/internal/u;

    iget-object v5, p0, Lio/grpc/internal/k1;->r:[B

    iget v6, p0, Lio/grpc/internal/k1;->s:I

    invoke-static {v5, v6, v3}, Lio/grpc/internal/v1;->f([BII)Lio/grpc/internal/u1;

    move-result-object v5

    invoke-virtual {v4, v5}, Lio/grpc/internal/u;->b(Lio/grpc/internal/u1;)V

    iget v4, p0, Lio/grpc/internal/k1;->s:I

    add-int/2addr v4, v3

    iput v4, p0, Lio/grpc/internal/k1;->s:I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    :try_start_4
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3

    :catch_1
    move-exception v0

    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3

    :cond_6
    iget-object v4, p0, Lio/grpc/internal/k1;->x:Lio/grpc/internal/u;

    invoke-virtual {v4}, Lio/grpc/internal/u;->k()I

    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v4, :cond_9

    if-lez v1, :cond_8

    iget-object v3, p0, Lio/grpc/internal/k1;->a:Lio/grpc/internal/k1$b;

    invoke-interface {v3, v1}, Lio/grpc/internal/k1$b;->c(I)V

    iget-object v3, p0, Lio/grpc/internal/k1;->t:Lio/grpc/internal/k1$e;

    sget-object v4, Lio/grpc/internal/k1$e;->BODY:Lio/grpc/internal/k1$e;

    if-ne v3, v4, :cond_8

    iget-object v3, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    if-eqz v3, :cond_7

    iget-object v1, p0, Lio/grpc/internal/k1;->c:Lio/grpc/internal/h2;

    int-to-long v3, v2

    invoke-virtual {v1, v3, v4}, Lio/grpc/internal/h2;->g(J)V

    iget v1, p0, Lio/grpc/internal/k1;->B:I

    add-int/2addr v1, v2

    iput v1, p0, Lio/grpc/internal/k1;->B:I

    goto :goto_2

    :cond_7
    iget-object v2, p0, Lio/grpc/internal/k1;->c:Lio/grpc/internal/h2;

    int-to-long v3, v1

    invoke-virtual {v2, v3, v4}, Lio/grpc/internal/h2;->g(J)V

    iget v2, p0, Lio/grpc/internal/k1;->B:I

    add-int/2addr v2, v1

    iput v2, p0, Lio/grpc/internal/k1;->B:I

    :cond_8
    :goto_2
    return v0

    :cond_9
    :try_start_5
    iget-object v4, p0, Lio/grpc/internal/k1;->x:Lio/grpc/internal/u;

    invoke-virtual {v4}, Lio/grpc/internal/u;->k()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    add-int/2addr v1, v3

    iget-object v4, p0, Lio/grpc/internal/k1;->w:Lio/grpc/internal/u;

    iget-object v5, p0, Lio/grpc/internal/k1;->x:Lio/grpc/internal/u;

    invoke-virtual {v5, v3}, Lio/grpc/internal/u;->A(I)Lio/grpc/internal/u1;

    move-result-object v3

    invoke-virtual {v4, v3}, Lio/grpc/internal/u;->b(Lio/grpc/internal/u1;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_0

    :cond_a
    if-lez v1, :cond_c

    iget-object v0, p0, Lio/grpc/internal/k1;->a:Lio/grpc/internal/k1$b;

    invoke-interface {v0, v1}, Lio/grpc/internal/k1$b;->c(I)V

    iget-object v0, p0, Lio/grpc/internal/k1;->t:Lio/grpc/internal/k1$e;

    sget-object v3, Lio/grpc/internal/k1$e;->BODY:Lio/grpc/internal/k1$e;

    if-ne v0, v3, :cond_c

    iget-object v0, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lio/grpc/internal/k1;->c:Lio/grpc/internal/h2;

    int-to-long v3, v2

    invoke-virtual {v0, v3, v4}, Lio/grpc/internal/h2;->g(J)V

    iget v0, p0, Lio/grpc/internal/k1;->B:I

    add-int/2addr v0, v2

    goto :goto_3

    :cond_b
    iget-object v0, p0, Lio/grpc/internal/k1;->c:Lio/grpc/internal/h2;

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Lio/grpc/internal/h2;->g(J)V

    iget v0, p0, Lio/grpc/internal/k1;->B:I

    add-int/2addr v0, v1

    :goto_3
    iput v0, p0, Lio/grpc/internal/k1;->B:I

    :cond_c
    const/4 v0, 0x1

    return v0

    :catchall_0
    move-exception v0

    move v7, v1

    move-object v1, v0

    move v0, v7

    goto :goto_4

    :catchall_1
    move-exception v1

    move v2, v0

    :goto_4
    if-lez v0, :cond_e

    iget-object v3, p0, Lio/grpc/internal/k1;->a:Lio/grpc/internal/k1$b;

    invoke-interface {v3, v0}, Lio/grpc/internal/k1$b;->c(I)V

    iget-object v3, p0, Lio/grpc/internal/k1;->t:Lio/grpc/internal/k1$e;

    sget-object v4, Lio/grpc/internal/k1$e;->BODY:Lio/grpc/internal/k1$e;

    if-ne v3, v4, :cond_e

    iget-object v3, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    if-eqz v3, :cond_d

    iget-object v0, p0, Lio/grpc/internal/k1;->c:Lio/grpc/internal/h2;

    int-to-long v3, v2

    invoke-virtual {v0, v3, v4}, Lio/grpc/internal/h2;->g(J)V

    iget v0, p0, Lio/grpc/internal/k1;->B:I

    add-int/2addr v0, v2

    iput v0, p0, Lio/grpc/internal/k1;->B:I

    goto :goto_5

    :cond_d
    iget-object v2, p0, Lio/grpc/internal/k1;->c:Lio/grpc/internal/h2;

    int-to-long v3, v0

    invoke-virtual {v2, v3, v4}, Lio/grpc/internal/h2;->g(J)V

    iget v2, p0, Lio/grpc/internal/k1;->B:I

    add-int/2addr v2, v0

    iput v2, p0, Lio/grpc/internal/k1;->B:I

    :cond_e
    :goto_5
    throw v1
.end method


# virtual methods
.method public B(Lio/grpc/internal/r0;)V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/k1;->e:Lvi/u;

    sget-object v1, Lvi/l$b;->a:Lvi/l;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    const-string v1, "per-message decompressor already set"

    invoke-static {v0, v1}, Leb/o;->v(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    const-string v0, "full stream decompressor already set"

    invoke-static {v2, v0}, Leb/o;->v(ZLjava/lang/Object;)V

    const-string v0, "Can\'t pass a null full stream decompressor"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/r0;

    iput-object p1, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    const/4 p1, 0x0

    iput-object p1, p0, Lio/grpc/internal/k1;->x:Lio/grpc/internal/u;

    return-void
.end method

.method E(Lio/grpc/internal/k1$b;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/k1;->a:Lio/grpc/internal/k1$b;

    return-void
.end method

.method H()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/k1;->D:Z

    return-void
.end method

.method public b(I)V
    .locals 4

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "numMessages must be > 0"

    invoke-static {v0, v1}, Leb/o;->e(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lio/grpc/internal/k1;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-wide v0, p0, Lio/grpc/internal/k1;->y:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lio/grpc/internal/k1;->y:J

    invoke-direct {p0}, Lio/grpc/internal/k1;->a()V

    return-void
.end method

.method public close()V
    .locals 5

    invoke-virtual {p0}, Lio/grpc/internal/k1;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/k1;->w:Lio/grpc/internal/u;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/grpc/internal/u;->k()I

    move-result v0

    if-lez v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    if-eqz v4, :cond_4

    if-nez v0, :cond_3

    invoke-virtual {v4}, Lio/grpc/internal/r0;->r()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :cond_3
    :goto_1
    iget-object v0, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    invoke-virtual {v0}, Lio/grpc/internal/r0;->close()V

    move v0, v1

    :cond_4
    iget-object v1, p0, Lio/grpc/internal/k1;->x:Lio/grpc/internal/u;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lio/grpc/internal/u;->close()V

    :cond_5
    iget-object v1, p0, Lio/grpc/internal/k1;->w:Lio/grpc/internal/u;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lio/grpc/internal/u;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_6
    iput-object v3, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    iput-object v3, p0, Lio/grpc/internal/k1;->x:Lio/grpc/internal/u;

    iput-object v3, p0, Lio/grpc/internal/k1;->w:Lio/grpc/internal/u;

    iget-object v1, p0, Lio/grpc/internal/k1;->a:Lio/grpc/internal/k1$b;

    invoke-interface {v1, v0}, Lio/grpc/internal/k1$b;->e(Z)V

    return-void

    :catchall_0
    move-exception v0

    iput-object v3, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    iput-object v3, p0, Lio/grpc/internal/k1;->x:Lio/grpc/internal/u;

    iput-object v3, p0, Lio/grpc/internal/k1;->w:Lio/grpc/internal/u;

    throw v0
.end method

.method public e(I)V
    .locals 0

    iput p1, p0, Lio/grpc/internal/k1;->b:I

    return-void
.end method

.method public f(Lio/grpc/internal/u1;)V
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    :try_start_0
    invoke-direct {p0}, Lio/grpc/internal/k1;->n()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lio/grpc/internal/r0;->l(Lio/grpc/internal/u1;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lio/grpc/internal/k1;->x:Lio/grpc/internal/u;

    invoke-virtual {v1, p1}, Lio/grpc/internal/u;->b(Lio/grpc/internal/u1;)V

    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0}, Lio/grpc/internal/k1;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lio/grpc/internal/u1;->close()V

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_3

    invoke-interface {p1}, Lio/grpc/internal/u1;->close()V

    :cond_3
    throw v1
.end method

.method public g(Lvi/u;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Already set full stream decompressor"

    invoke-static {v0, v1}, Leb/o;->v(ZLjava/lang/Object;)V

    const-string v0, "Can\'t pass an empty decompressor"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/u;

    iput-object p1, p0, Lio/grpc/internal/k1;->e:Lvi/u;

    return-void
.end method

.method public i()V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/k1;->isClosed()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lio/grpc/internal/k1;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/grpc/internal/k1;->close()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/k1;->C:Z

    :goto_0
    return-void
.end method

.method public isClosed()Z
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/k1;->x:Lio/grpc/internal/u;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/k1;->f:Lio/grpc/internal/r0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
