.class public Lg8/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/k;


# instance fields
.field private final a:Lg8/j;

.field private final b:Lg8/d;

.field private final c:Lt8/e0;

.field private final d:Lt6/u1;

.field private final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final f:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lt8/e0;",
            ">;"
        }
    .end annotation
.end field

.field private g:Ly6/m;

.field private h:Ly6/b0;

.field private i:I

.field private j:I

.field private k:J


# direct methods
.method public constructor <init>(Lg8/j;Lt6/u1;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg8/m;->a:Lg8/j;

    new-instance p1, Lg8/d;

    invoke-direct {p1}, Lg8/d;-><init>()V

    iput-object p1, p0, Lg8/m;->b:Lg8/d;

    new-instance p1, Lt8/e0;

    invoke-direct {p1}, Lt8/e0;-><init>()V

    iput-object p1, p0, Lg8/m;->c:Lt8/e0;

    invoke-virtual {p2}, Lt6/u1;->c()Lt6/u1$b;

    move-result-object p1

    const-string v0, "text/x-exoplayer-cues"

    invoke-virtual {p1, v0}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    move-result-object p1

    iget-object p2, p2, Lt6/u1;->w:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lt6/u1$b;->K(Ljava/lang/String;)Lt6/u1$b;

    move-result-object p1

    invoke-virtual {p1}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object p1

    iput-object p1, p0, Lg8/m;->d:Lt6/u1;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lg8/m;->e:Ljava/util/List;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lg8/m;->f:Ljava/util/List;

    const/4 p1, 0x0

    iput p1, p0, Lg8/m;->j:I

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lg8/m;->k:J

    return-void
.end method

.method private c()V
    .locals 7

    :try_start_0
    iget-object v0, p0, Lg8/m;->a:Lg8/j;

    invoke-interface {v0}, Lw6/d;->d()Ljava/lang/Object;

    move-result-object v0

    :goto_0
    check-cast v0, Lg8/n;

    const-wide/16 v1, 0x5

    if-nez v0, :cond_0

    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    iget-object v0, p0, Lg8/m;->a:Lg8/j;

    invoke-interface {v0}, Lw6/d;->d()Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget v3, p0, Lg8/m;->i:I

    invoke-virtual {v0, v3}, Lw6/g;->y(I)V

    iget-object v3, v0, Lw6/g;->c:Ljava/nio/ByteBuffer;

    iget-object v4, p0, Lg8/m;->c:Lt8/e0;

    invoke-virtual {v4}, Lt8/e0;->e()[B

    move-result-object v4

    iget v5, p0, Lg8/m;->i:I

    const/4 v6, 0x0

    invoke-virtual {v3, v4, v6, v5}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    iget-object v3, v0, Lw6/g;->c:Ljava/nio/ByteBuffer;

    iget v4, p0, Lg8/m;->i:I

    invoke-virtual {v3, v4}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    iget-object v3, p0, Lg8/m;->a:Lg8/j;

    invoke-interface {v3, v0}, Lw6/d;->c(Ljava/lang/Object;)V

    iget-object v0, p0, Lg8/m;->a:Lg8/j;

    invoke-interface {v0}, Lw6/d;->b()Ljava/lang/Object;

    move-result-object v0

    :goto_1
    check-cast v0, Lg8/o;

    if-nez v0, :cond_1

    invoke-static {v1, v2}, Ljava/lang/Thread;->sleep(J)V

    iget-object v0, p0, Lg8/m;->a:Lg8/j;

    invoke-interface {v0}, Lw6/d;->b()Ljava/lang/Object;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_2
    invoke-virtual {v0}, Lg8/o;->l()I

    move-result v1

    if-ge v6, v1, :cond_2

    invoke-virtual {v0, v6}, Lg8/o;->i(I)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lg8/o;->h(J)Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lg8/m;->b:Lg8/d;

    invoke-virtual {v2, v1}, Lg8/d;->a(Ljava/util/List;)[B

    move-result-object v1

    iget-object v2, p0, Lg8/m;->e:Ljava/util/List;

    invoke-virtual {v0, v6}, Lg8/o;->i(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Lg8/m;->f:Ljava/util/List;

    new-instance v3, Lt8/e0;

    invoke-direct {v3, v1}, Lt8/e0;-><init>([B)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Lw6/h;->x()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lg8/k; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "SubtitleDecoder failed."

    invoke-static {v1, v0}, Lt6/b3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lt6/b3;

    move-result-object v0

    throw v0

    :catch_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    new-instance v0, Ljava/io/InterruptedIOException;

    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    throw v0
.end method

.method private d(Ly6/l;)Z
    .locals 6

    iget-object v0, p0, Lg8/m;->c:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->b()I

    move-result v0

    iget v1, p0, Lg8/m;->i:I

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lg8/m;->c:Lt8/e0;

    add-int/lit16 v1, v1, 0x400

    invoke-virtual {v0, v1}, Lt8/e0;->c(I)V

    :cond_0
    iget-object v0, p0, Lg8/m;->c:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    iget v1, p0, Lg8/m;->i:I

    iget-object v2, p0, Lg8/m;->c:Lt8/e0;

    invoke-virtual {v2}, Lt8/e0;->b()I

    move-result v2

    iget v3, p0, Lg8/m;->i:I

    sub-int/2addr v2, v3

    invoke-interface {p1, v0, v1, v2}, Ly6/l;->read([BII)I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    iget v2, p0, Lg8/m;->i:I

    add-int/2addr v2, v0

    iput v2, p0, Lg8/m;->i:I

    :cond_1
    invoke-interface {p1}, Ly6/l;->getLength()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long p1, v2, v4

    if-eqz p1, :cond_2

    iget p1, p0, Lg8/m;->i:I

    int-to-long v4, p1

    cmp-long p1, v4, v2

    if-eqz p1, :cond_3

    :cond_2
    if-ne v0, v1, :cond_4

    :cond_3
    const/4 p1, 0x1

    goto :goto_0

    :cond_4
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private g(Ly6/l;)Z
    .locals 4

    invoke-interface {p1}, Ly6/l;->getLength()J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ly6/l;->getLength()J

    move-result-wide v0

    invoke-static {v0, v1}, Lhb/e;->d(J)I

    move-result v0

    goto :goto_0

    :cond_0
    const/16 v0, 0x400

    :goto_0
    invoke-interface {p1, v0}, Ly6/l;->a(I)I

    move-result p1

    const/4 v0, -0x1

    if-ne p1, v0, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    return p1
.end method

.method private h()V
    .locals 11

    iget-object v0, p0, Lg8/m;->h:Ly6/b0;

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lg8/m;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    iget-object v1, p0, Lg8/m;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    iget-wide v0, p0, Lg8/m;->k:J

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v4

    if-nez v4, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    iget-object v4, p0, Lg8/m;->e:Ljava/util/List;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v4, v0, v3, v3}, Lt8/r0;->f(Ljava/util/List;Ljava/lang/Comparable;ZZ)I

    move-result v0

    :goto_1
    iget-object v1, p0, Lg8/m;->f:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    iget-object v1, p0, Lg8/m;->f:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt8/e0;

    invoke-virtual {v1, v2}, Lt8/e0;->U(I)V

    invoke-virtual {v1}, Lt8/e0;->e()[B

    move-result-object v3

    array-length v8, v3

    iget-object v3, p0, Lg8/m;->h:Ly6/b0;

    invoke-interface {v3, v1, v8}, Ly6/b0;->a(Lt8/e0;I)V

    iget-object v4, p0, Lg8/m;->h:Ly6/b0;

    iget-object v1, p0, Lg8/m;->e:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Ly6/b0;->b(JIIILy6/b0$a;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 1

    iget p1, p0, Lg8/m;->j:I

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    move p1, p2

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Lt8/a;->g(Z)V

    iput-wide p3, p0, Lg8/m;->k:J

    iget p1, p0, Lg8/m;->j:I

    const/4 p3, 0x2

    if-ne p1, p3, :cond_1

    iput p2, p0, Lg8/m;->j:I

    :cond_1
    iget p1, p0, Lg8/m;->j:I

    const/4 p2, 0x4

    if-ne p1, p2, :cond_2

    const/4 p1, 0x3

    iput p1, p0, Lg8/m;->j:I

    :cond_2
    return-void
.end method

.method public b(Ly6/m;)V
    .locals 7

    iget v0, p0, Lg8/m;->j:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-static {v0}, Lt8/a;->g(Z)V

    iput-object p1, p0, Lg8/m;->g:Ly6/m;

    const/4 v0, 0x3

    invoke-interface {p1, v2, v0}, Ly6/m;->d(II)Ly6/b0;

    move-result-object p1

    iput-object p1, p0, Lg8/m;->h:Ly6/b0;

    iget-object p1, p0, Lg8/m;->g:Ly6/m;

    invoke-interface {p1}, Ly6/m;->q()V

    iget-object p1, p0, Lg8/m;->g:Ly6/m;

    new-instance v0, Ly6/x;

    new-array v3, v1, [J

    const-wide/16 v4, 0x0

    aput-wide v4, v3, v2

    new-array v6, v1, [J

    aput-wide v4, v6, v2

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v0, v3, v6, v4, v5}, Ly6/x;-><init>([J[JJ)V

    invoke-interface {p1, v0}, Ly6/m;->p(Ly6/z;)V

    iget-object p1, p0, Lg8/m;->h:Ly6/b0;

    iget-object v0, p0, Lg8/m;->d:Lt6/u1;

    invoke-interface {p1, v0}, Ly6/b0;->c(Lt6/u1;)V

    iput v1, p0, Lg8/m;->j:I

    return-void
.end method

.method public e(Ly6/l;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method

.method public f(Ly6/l;Ly6/y;)I
    .locals 7

    iget p2, p0, Lg8/m;->j:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    const/4 v2, 0x5

    if-eq p2, v2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    move p2, v1

    :goto_0
    invoke-static {p2}, Lt8/a;->g(Z)V

    iget p2, p0, Lg8/m;->j:I

    const/4 v2, 0x2

    if-ne p2, v0, :cond_2

    iget-object p2, p0, Lg8/m;->c:Lt8/e0;

    invoke-interface {p1}, Ly6/l;->getLength()J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v0, v3, v5

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ly6/l;->getLength()J

    move-result-wide v3

    invoke-static {v3, v4}, Lhb/e;->d(J)I

    move-result v0

    goto :goto_1

    :cond_1
    const/16 v0, 0x400

    :goto_1
    invoke-virtual {p2, v0}, Lt8/e0;->Q(I)V

    iput v1, p0, Lg8/m;->i:I

    iput v2, p0, Lg8/m;->j:I

    :cond_2
    iget p2, p0, Lg8/m;->j:I

    const/4 v0, 0x4

    if-ne p2, v2, :cond_3

    invoke-direct {p0, p1}, Lg8/m;->d(Ly6/l;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-direct {p0}, Lg8/m;->c()V

    invoke-direct {p0}, Lg8/m;->h()V

    iput v0, p0, Lg8/m;->j:I

    :cond_3
    iget p2, p0, Lg8/m;->j:I

    const/4 v2, 0x3

    if-ne p2, v2, :cond_4

    invoke-direct {p0, p1}, Lg8/m;->g(Ly6/l;)Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-direct {p0}, Lg8/m;->h()V

    iput v0, p0, Lg8/m;->j:I

    :cond_4
    iget p1, p0, Lg8/m;->j:I

    if-ne p1, v0, :cond_5

    const/4 p1, -0x1

    return p1

    :cond_5
    return v1
.end method

.method public release()V
    .locals 2

    iget v0, p0, Lg8/m;->j:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lg8/m;->a:Lg8/j;

    invoke-interface {v0}, Lw6/d;->release()V

    iput v1, p0, Lg8/m;->j:I

    return-void
.end method
