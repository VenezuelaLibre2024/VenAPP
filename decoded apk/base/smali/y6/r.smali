.class public final Ly6/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly6/r$a;
    }
.end annotation


# direct methods
.method public static a(Ly6/l;)Z
    .locals 6

    new-instance v0, Lt8/e0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lt8/e0;-><init>(I)V

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p0, v2, v3, v1}, Ly6/l;->q([BII)V

    invoke-virtual {v0}, Lt8/e0;->J()J

    move-result-wide v0

    const-wide/32 v4, 0x664c6143

    cmp-long p0, v0, v4

    if-nez p0, :cond_0

    const/4 v3, 0x1

    :cond_0
    return v3
.end method

.method public static b(Ly6/l;)I
    .locals 4

    invoke-interface {p0}, Ly6/l;->f()V

    new-instance v0, Lt8/e0;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Lt8/e0;-><init>(I)V

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p0, v2, v3, v1}, Ly6/l;->q([BII)V

    invoke-virtual {v0}, Lt8/e0;->N()I

    move-result v0

    shr-int/lit8 v1, v0, 0x2

    const/16 v2, 0x3ffe

    invoke-interface {p0}, Ly6/l;->f()V

    if-ne v1, v2, :cond_0

    return v0

    :cond_0
    const-string p0, "First frame does not start with sync code."

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lt6/b3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lt6/b3;

    move-result-object p0

    throw p0
.end method

.method public static c(Ly6/l;Z)Ll7/a;
    .locals 2

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    move-object p1, v0

    goto :goto_0

    :cond_0
    sget-object p1, Lq7/h;->b:Lq7/h$a;

    :goto_0
    new-instance v1, Ly6/w;

    invoke-direct {v1}, Ly6/w;-><init>()V

    invoke-virtual {v1, p0, p1}, Ly6/w;->a(Ly6/l;Lq7/h$a;)Ll7/a;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ll7/a;->e()I

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, p0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static d(Ly6/l;Z)Ll7/a;
    .locals 4

    invoke-interface {p0}, Ly6/l;->f()V

    invoke-interface {p0}, Ly6/l;->i()J

    move-result-wide v0

    invoke-static {p0, p1}, Ly6/r;->c(Ly6/l;Z)Ll7/a;

    move-result-object p1

    invoke-interface {p0}, Ly6/l;->i()J

    move-result-wide v2

    sub-long/2addr v2, v0

    long-to-int v0, v2

    invoke-interface {p0, v0}, Ly6/l;->n(I)V

    return-object p1
.end method

.method public static e(Ly6/l;Ly6/r$a;)Z
    .locals 7

    invoke-interface {p0}, Ly6/l;->f()V

    new-instance v0, Lt8/d0;

    const/4 v1, 0x4

    new-array v2, v1, [B

    invoke-direct {v0, v2}, Lt8/d0;-><init>([B)V

    iget-object v2, v0, Lt8/d0;->a:[B

    const/4 v3, 0x0

    invoke-interface {p0, v2, v3, v1}, Ly6/l;->q([BII)V

    invoke-virtual {v0}, Lt8/d0;->g()Z

    move-result v2

    const/4 v4, 0x7

    invoke-virtual {v0, v4}, Lt8/d0;->h(I)I

    move-result v4

    const/16 v5, 0x18

    invoke-virtual {v0, v5}, Lt8/d0;->h(I)I

    move-result v0

    add-int/2addr v0, v1

    if-nez v4, :cond_0

    invoke-static {p0}, Ly6/r;->h(Ly6/l;)Ly6/t;

    move-result-object p0

    :goto_0
    iput-object p0, p1, Ly6/r$a;->a:Ly6/t;

    goto :goto_1

    :cond_0
    iget-object v5, p1, Ly6/r$a;->a:Ly6/t;

    if-eqz v5, :cond_4

    const/4 v6, 0x3

    if-ne v4, v6, :cond_1

    invoke-static {p0, v0}, Ly6/r;->g(Ly6/l;I)Ly6/t$a;

    move-result-object p0

    invoke-virtual {v5, p0}, Ly6/t;->b(Ly6/t$a;)Ly6/t;

    move-result-object p0

    goto :goto_0

    :cond_1
    if-ne v4, v1, :cond_2

    invoke-static {p0, v0}, Ly6/r;->j(Ly6/l;I)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v5, p0}, Ly6/t;->c(Ljava/util/List;)Ly6/t;

    move-result-object p0

    goto :goto_0

    :cond_2
    const/4 v6, 0x6

    if-ne v4, v6, :cond_3

    new-instance v4, Lt8/e0;

    invoke-direct {v4, v0}, Lt8/e0;-><init>(I)V

    invoke-virtual {v4}, Lt8/e0;->e()[B

    move-result-object v6

    invoke-interface {p0, v6, v3, v0}, Ly6/l;->readFully([BII)V

    invoke-virtual {v4, v1}, Lt8/e0;->V(I)V

    invoke-static {v4}, Lo7/a;->a(Lt8/e0;)Lo7/a;

    move-result-object p0

    invoke-static {p0}, Lcom/google/common/collect/w;->w(Ljava/lang/Object;)Lcom/google/common/collect/w;

    move-result-object p0

    invoke-virtual {v5, p0}, Ly6/t;->a(Ljava/util/List;)Ly6/t;

    move-result-object p0

    goto :goto_0

    :cond_3
    invoke-interface {p0, v0}, Ly6/l;->n(I)V

    :goto_1
    return v2

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static f(Lt8/e0;)Ly6/t$a;
    .locals 10

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lt8/e0;->V(I)V

    invoke-virtual {p0}, Lt8/e0;->K()I

    move-result v0

    invoke-virtual {p0}, Lt8/e0;->f()I

    move-result v1

    int-to-long v1, v1

    int-to-long v3, v0

    add-long/2addr v1, v3

    div-int/lit8 v0, v0, 0x12

    new-array v3, v0, [J

    new-array v4, v0, [J

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v0, :cond_1

    invoke-virtual {p0}, Lt8/e0;->A()J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long v8, v6, v8

    if-nez v8, :cond_0

    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v3

    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v4

    goto :goto_1

    :cond_0
    aput-wide v6, v3, v5

    invoke-virtual {p0}, Lt8/e0;->A()J

    move-result-wide v6

    aput-wide v6, v4, v5

    const/4 v6, 0x2

    invoke-virtual {p0, v6}, Lt8/e0;->V(I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lt8/e0;->f()I

    move-result v0

    int-to-long v5, v0

    sub-long/2addr v1, v5

    long-to-int v0, v1

    invoke-virtual {p0, v0}, Lt8/e0;->V(I)V

    new-instance p0, Ly6/t$a;

    invoke-direct {p0, v3, v4}, Ly6/t$a;-><init>([J[J)V

    return-object p0
.end method

.method private static g(Ly6/l;I)Ly6/t$a;
    .locals 3

    new-instance v0, Lt8/e0;

    invoke-direct {v0, p1}, Lt8/e0;-><init>(I)V

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2, p1}, Ly6/l;->readFully([BII)V

    invoke-static {v0}, Ly6/r;->f(Lt8/e0;)Ly6/t$a;

    move-result-object p0

    return-object p0
.end method

.method private static h(Ly6/l;)Ly6/t;
    .locals 3

    const/16 v0, 0x26

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2, v0}, Ly6/l;->readFully([BII)V

    new-instance p0, Ly6/t;

    const/4 v0, 0x4

    invoke-direct {p0, v1, v0}, Ly6/t;-><init>([BI)V

    return-object p0
.end method

.method public static i(Ly6/l;)V
    .locals 4

    new-instance v0, Lt8/e0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lt8/e0;-><init>(I)V

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v2

    const/4 v3, 0x0

    invoke-interface {p0, v2, v3, v1}, Ly6/l;->readFully([BII)V

    invoke-virtual {v0}, Lt8/e0;->J()J

    move-result-wide v0

    const-wide/32 v2, 0x664c6143

    cmp-long p0, v0, v2

    if-nez p0, :cond_0

    return-void

    :cond_0
    const-string p0, "Failed to read FLAC stream marker."

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lt6/b3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lt6/b3;

    move-result-object p0

    throw p0
.end method

.method private static j(Ly6/l;I)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly6/l;",
            "I)",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lt8/e0;

    invoke-direct {v0, p1}, Lt8/e0;-><init>(I)V

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {p0, v1, v2, p1}, Ly6/l;->readFully([BII)V

    const/4 p0, 0x4

    invoke-virtual {v0, p0}, Lt8/e0;->V(I)V

    invoke-static {v0, v2, v2}, Ly6/e0;->j(Lt8/e0;ZZ)Ly6/e0$b;

    move-result-object p0

    iget-object p0, p0, Ly6/e0$b;->b:[Ljava/lang/String;

    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method
