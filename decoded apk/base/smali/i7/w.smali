.class public final Li7/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/i0;


# instance fields
.field private final a:Li7/m;

.field private final b:Lt8/d0;

.field private c:I

.field private d:I

.field private e:Lt8/n0;

.field private f:Z

.field private g:Z

.field private h:Z

.field private i:I

.field private j:I

.field private k:Z

.field private l:J


# direct methods
.method public constructor <init>(Li7/m;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li7/w;->a:Li7/m;

    new-instance p1, Lt8/d0;

    const/16 v0, 0xa

    new-array v0, v0, [B

    invoke-direct {p1, v0}, Lt8/d0;-><init>([B)V

    iput-object p1, p0, Li7/w;->b:Lt8/d0;

    const/4 p1, 0x0

    iput p1, p0, Li7/w;->c:I

    return-void
.end method

.method private d(Lt8/e0;[BI)Z
    .locals 3

    invoke-virtual {p1}, Lt8/e0;->a()I

    move-result v0

    iget v1, p0, Li7/w;->d:I

    sub-int v1, p3, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x1

    if-gtz v0, :cond_0

    return v1

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p1, v0}, Lt8/e0;->V(I)V

    goto :goto_0

    :cond_1
    iget v2, p0, Li7/w;->d:I

    invoke-virtual {p1, p2, v2, v0}, Lt8/e0;->l([BII)V

    :goto_0
    iget p1, p0, Li7/w;->d:I

    add-int/2addr p1, v0

    iput p1, p0, Li7/w;->d:I

    if-ne p1, p3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method private e()Z
    .locals 7

    iget-object v0, p0, Li7/w;->b:Lt8/d0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lt8/d0;->p(I)V

    iget-object v0, p0, Li7/w;->b:Lt8/d0;

    const/16 v2, 0x18

    invoke-virtual {v0, v2}, Lt8/d0;->h(I)I

    move-result v0

    const-string v2, "PesReader"

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-eq v0, v4, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Unexpected start code prefix: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    iput v3, p0, Li7/w;->j:I

    return v1

    :cond_0
    iget-object v0, p0, Li7/w;->b:Lt8/d0;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lt8/d0;->r(I)V

    iget-object v0, p0, Li7/w;->b:Lt8/d0;

    const/16 v5, 0x10

    invoke-virtual {v0, v5}, Lt8/d0;->h(I)I

    move-result v0

    iget-object v5, p0, Li7/w;->b:Lt8/d0;

    const/4 v6, 0x5

    invoke-virtual {v5, v6}, Lt8/d0;->r(I)V

    iget-object v5, p0, Li7/w;->b:Lt8/d0;

    invoke-virtual {v5}, Lt8/d0;->g()Z

    move-result v5

    iput-boolean v5, p0, Li7/w;->k:Z

    iget-object v5, p0, Li7/w;->b:Lt8/d0;

    const/4 v6, 0x2

    invoke-virtual {v5, v6}, Lt8/d0;->r(I)V

    iget-object v5, p0, Li7/w;->b:Lt8/d0;

    invoke-virtual {v5}, Lt8/d0;->g()Z

    move-result v5

    iput-boolean v5, p0, Li7/w;->f:Z

    iget-object v5, p0, Li7/w;->b:Lt8/d0;

    invoke-virtual {v5}, Lt8/d0;->g()Z

    move-result v5

    iput-boolean v5, p0, Li7/w;->g:Z

    iget-object v5, p0, Li7/w;->b:Lt8/d0;

    const/4 v6, 0x6

    invoke-virtual {v5, v6}, Lt8/d0;->r(I)V

    iget-object v5, p0, Li7/w;->b:Lt8/d0;

    invoke-virtual {v5, v1}, Lt8/d0;->h(I)I

    move-result v1

    iput v1, p0, Li7/w;->i:I

    if-nez v0, :cond_1

    :goto_0
    iput v3, p0, Li7/w;->j:I

    goto :goto_1

    :cond_1
    add-int/2addr v0, v6

    add-int/lit8 v0, v0, -0x9

    sub-int/2addr v0, v1

    iput v0, p0, Li7/w;->j:I

    if-gez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Found negative packet payload size: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Li7/w;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    :goto_1
    return v4
.end method

.method private f()V
    .locals 10

    iget-object v0, p0, Li7/w;->b:Lt8/d0;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lt8/d0;->p(I)V

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Li7/w;->l:J

    iget-boolean v0, p0, Li7/w;->f:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Li7/w;->b:Lt8/d0;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lt8/d0;->r(I)V

    iget-object v0, p0, Li7/w;->b:Lt8/d0;

    const/4 v2, 0x3

    invoke-virtual {v0, v2}, Lt8/d0;->h(I)I

    move-result v0

    int-to-long v3, v0

    const/16 v0, 0x1e

    shl-long/2addr v3, v0

    iget-object v5, p0, Li7/w;->b:Lt8/d0;

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, Lt8/d0;->r(I)V

    iget-object v5, p0, Li7/w;->b:Lt8/d0;

    const/16 v7, 0xf

    invoke-virtual {v5, v7}, Lt8/d0;->h(I)I

    move-result v5

    shl-int/2addr v5, v7

    int-to-long v8, v5

    or-long/2addr v3, v8

    iget-object v5, p0, Li7/w;->b:Lt8/d0;

    invoke-virtual {v5, v6}, Lt8/d0;->r(I)V

    iget-object v5, p0, Li7/w;->b:Lt8/d0;

    invoke-virtual {v5, v7}, Lt8/d0;->h(I)I

    move-result v5

    int-to-long v8, v5

    or-long/2addr v3, v8

    iget-object v5, p0, Li7/w;->b:Lt8/d0;

    invoke-virtual {v5, v6}, Lt8/d0;->r(I)V

    iget-boolean v5, p0, Li7/w;->h:Z

    if-nez v5, :cond_0

    iget-boolean v5, p0, Li7/w;->g:Z

    if-eqz v5, :cond_0

    iget-object v5, p0, Li7/w;->b:Lt8/d0;

    invoke-virtual {v5, v1}, Lt8/d0;->r(I)V

    iget-object v1, p0, Li7/w;->b:Lt8/d0;

    invoke-virtual {v1, v2}, Lt8/d0;->h(I)I

    move-result v1

    int-to-long v1, v1

    shl-long v0, v1, v0

    iget-object v2, p0, Li7/w;->b:Lt8/d0;

    invoke-virtual {v2, v6}, Lt8/d0;->r(I)V

    iget-object v2, p0, Li7/w;->b:Lt8/d0;

    invoke-virtual {v2, v7}, Lt8/d0;->h(I)I

    move-result v2

    shl-int/2addr v2, v7

    int-to-long v8, v2

    or-long/2addr v0, v8

    iget-object v2, p0, Li7/w;->b:Lt8/d0;

    invoke-virtual {v2, v6}, Lt8/d0;->r(I)V

    iget-object v2, p0, Li7/w;->b:Lt8/d0;

    invoke-virtual {v2, v7}, Lt8/d0;->h(I)I

    move-result v2

    int-to-long v7, v2

    or-long/2addr v0, v7

    iget-object v2, p0, Li7/w;->b:Lt8/d0;

    invoke-virtual {v2, v6}, Lt8/d0;->r(I)V

    iget-object v2, p0, Li7/w;->e:Lt8/n0;

    invoke-virtual {v2, v0, v1}, Lt8/n0;->b(J)J

    iput-boolean v6, p0, Li7/w;->h:Z

    :cond_0
    iget-object v0, p0, Li7/w;->e:Lt8/n0;

    invoke-virtual {v0, v3, v4}, Lt8/n0;->b(J)J

    move-result-wide v0

    iput-wide v0, p0, Li7/w;->l:J

    :cond_1
    return-void
.end method

.method private g(I)V
    .locals 0

    iput p1, p0, Li7/w;->c:I

    const/4 p1, 0x0

    iput p1, p0, Li7/w;->d:I

    return-void
.end method


# virtual methods
.method public a(Lt8/n0;Ly6/m;Li7/i0$d;)V
    .locals 0

    iput-object p1, p0, Li7/w;->e:Lt8/n0;

    iget-object p1, p0, Li7/w;->a:Li7/m;

    invoke-interface {p1, p2, p3}, Li7/m;->d(Ly6/m;Li7/i0$d;)V

    return-void
.end method

.method public final b(Lt8/e0;I)V
    .locals 7

    iget-object v0, p0, Li7/w;->e:Lt8/n0;

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    and-int/lit8 v0, p2, 0x1

    const/4 v1, -0x1

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v0, :cond_3

    iget v0, p0, Li7/w;->c:I

    if-eqz v0, :cond_2

    if-eq v0, v4, :cond_2

    const-string v5, "PesReader"

    if-eq v0, v3, :cond_1

    if-ne v0, v2, :cond_0

    iget v0, p0, Li7/w;->j:I

    if-eq v0, v1, :cond_6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Unexpected start indicator: expected "

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v6, p0, Li7/w;->j:I

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " more bytes"

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    const-string v0, "Unexpected start indicator reading extended header"

    invoke-static {v5, v0}, Lt8/s;->i(Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    invoke-direct {p0, v4}, Li7/w;->g(I)V

    :cond_3
    :goto_1
    invoke-virtual {p1}, Lt8/e0;->a()I

    move-result v0

    if-lez v0, :cond_d

    iget v0, p0, Li7/w;->c:I

    if-eqz v0, :cond_c

    const/4 v5, 0x0

    if-eq v0, v4, :cond_a

    if-eq v0, v3, :cond_8

    if-ne v0, v2, :cond_7

    invoke-virtual {p1}, Lt8/e0;->a()I

    move-result v0

    iget v6, p0, Li7/w;->j:I

    if-ne v6, v1, :cond_4

    goto :goto_2

    :cond_4
    sub-int v5, v0, v6

    :goto_2
    if-lez v5, :cond_5

    sub-int/2addr v0, v5

    invoke-virtual {p1}, Lt8/e0;->f()I

    move-result v5

    add-int/2addr v5, v0

    invoke-virtual {p1, v5}, Lt8/e0;->T(I)V

    :cond_5
    iget-object v5, p0, Li7/w;->a:Li7/m;

    invoke-interface {v5, p1}, Li7/m;->b(Lt8/e0;)V

    iget v5, p0, Li7/w;->j:I

    if-eq v5, v1, :cond_3

    sub-int/2addr v5, v0

    iput v5, p0, Li7/w;->j:I

    if-nez v5, :cond_3

    :cond_6
    :goto_3
    iget-object v0, p0, Li7/w;->a:Li7/m;

    invoke-interface {v0}, Li7/m;->e()V

    goto :goto_0

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_8
    const/16 v0, 0xa

    iget v6, p0, Li7/w;->i:I

    invoke-static {v0, v6}, Ljava/lang/Math;->min(II)I

    move-result v0

    iget-object v6, p0, Li7/w;->b:Lt8/d0;

    iget-object v6, v6, Lt8/d0;->a:[B

    invoke-direct {p0, p1, v6, v0}, Li7/w;->d(Lt8/e0;[BI)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    iget v6, p0, Li7/w;->i:I

    invoke-direct {p0, p1, v0, v6}, Li7/w;->d(Lt8/e0;[BI)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Li7/w;->f()V

    iget-boolean v0, p0, Li7/w;->k:Z

    if-eqz v0, :cond_9

    const/4 v5, 0x4

    :cond_9
    or-int/2addr p2, v5

    iget-object v0, p0, Li7/w;->a:Li7/m;

    iget-wide v5, p0, Li7/w;->l:J

    invoke-interface {v0, v5, v6, p2}, Li7/m;->f(JI)V

    invoke-direct {p0, v2}, Li7/w;->g(I)V

    goto :goto_1

    :cond_a
    iget-object v0, p0, Li7/w;->b:Lt8/d0;

    iget-object v0, v0, Lt8/d0;->a:[B

    const/16 v6, 0x9

    invoke-direct {p0, p1, v0, v6}, Li7/w;->d(Lt8/e0;[BI)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Li7/w;->e()Z

    move-result v0

    if-eqz v0, :cond_b

    move v5, v3

    :cond_b
    invoke-direct {p0, v5}, Li7/w;->g(I)V

    goto/16 :goto_1

    :cond_c
    invoke-virtual {p1}, Lt8/e0;->a()I

    move-result v0

    invoke-virtual {p1, v0}, Lt8/e0;->V(I)V

    goto/16 :goto_1

    :cond_d
    return-void
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Li7/w;->c:I

    iput v0, p0, Li7/w;->d:I

    iput-boolean v0, p0, Li7/w;->h:Z

    iget-object v0, p0, Li7/w;->a:Li7/m;

    invoke-interface {v0}, Li7/m;->c()V

    return-void
.end method