.class final Lh7/j;
.super Lh7/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh7/j$a;
    }
.end annotation


# instance fields
.field private n:Lh7/j$a;

.field private o:I

.field private p:Z

.field private q:Ly6/e0$d;

.field private r:Ly6/e0$b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lh7/i;-><init>()V

    return-void
.end method

.method static n(Lt8/e0;J)V
    .locals 6

    invoke-virtual {p0}, Lt8/e0;->b()I

    move-result v0

    invoke-virtual {p0}, Lt8/e0;->g()I

    move-result v1

    add-int/lit8 v1, v1, 0x4

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, Lt8/e0;->e()[B

    move-result-object v0

    invoke-virtual {p0}, Lt8/e0;->g()I

    move-result v1

    add-int/lit8 v1, v1, 0x4

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    invoke-virtual {p0, v0}, Lt8/e0;->R([B)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lt8/e0;->g()I

    move-result v0

    add-int/lit8 v0, v0, 0x4

    invoke-virtual {p0, v0}, Lt8/e0;->T(I)V

    :goto_0
    invoke-virtual {p0}, Lt8/e0;->e()[B

    move-result-object v0

    invoke-virtual {p0}, Lt8/e0;->g()I

    move-result v1

    add-int/lit8 v1, v1, -0x4

    const-wide/16 v2, 0xff

    and-long v4, p1, v2

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v0, v1

    invoke-virtual {p0}, Lt8/e0;->g()I

    move-result v1

    add-int/lit8 v1, v1, -0x3

    const/16 v4, 0x8

    ushr-long v4, p1, v4

    and-long/2addr v4, v2

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v0, v1

    invoke-virtual {p0}, Lt8/e0;->g()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    const/16 v4, 0x10

    ushr-long v4, p1, v4

    and-long/2addr v4, v2

    long-to-int v4, v4

    int-to-byte v4, v4

    aput-byte v4, v0, v1

    invoke-virtual {p0}, Lt8/e0;->g()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    const/16 v1, 0x18

    ushr-long/2addr p1, v1

    and-long/2addr p1, v2

    long-to-int p1, p1

    int-to-byte p1, p1

    aput-byte p1, v0, p0

    return-void
.end method

.method private static o(BLh7/j$a;)I
    .locals 2

    iget v0, p1, Lh7/j$a;->e:I

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lh7/j;->p(BII)I

    move-result p0

    iget-object v0, p1, Lh7/j$a;->d:[Ly6/e0$c;

    aget-object p0, v0, p0

    iget-boolean p0, p0, Ly6/e0$c;->a:Z

    if-nez p0, :cond_0

    iget-object p0, p1, Lh7/j$a;->a:Ly6/e0$d;

    iget p0, p0, Ly6/e0$d;->g:I

    goto :goto_0

    :cond_0
    iget-object p0, p1, Lh7/j$a;->a:Ly6/e0$d;

    iget p0, p0, Ly6/e0$d;->h:I

    :goto_0
    return p0
.end method

.method static p(BII)I
    .locals 0

    shr-int/2addr p0, p2

    rsub-int/lit8 p1, p1, 0x8

    const/16 p2, 0xff

    ushr-int p1, p2, p1

    and-int/2addr p0, p1

    return p0
.end method

.method public static r(Lt8/e0;)Z
    .locals 1

    const/4 v0, 0x1

    :try_start_0
    invoke-static {v0, p0, v0}, Ly6/e0;->m(ILt8/e0;Z)Z

    move-result p0
    :try_end_0
    .catch Lt6/b3; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method protected e(J)V
    .locals 2

    invoke-super {p0, p1, p2}, Lh7/i;->e(J)V

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    move p1, p2

    :goto_0
    iput-boolean p1, p0, Lh7/j;->p:Z

    iget-object p1, p0, Lh7/j;->q:Ly6/e0$d;

    if-eqz p1, :cond_1

    iget p2, p1, Ly6/e0$d;->g:I

    :cond_1
    iput p2, p0, Lh7/j;->o:I

    return-void
.end method

.method protected f(Lt8/e0;)J
    .locals 5

    invoke-virtual {p1}, Lt8/e0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    aget-byte v0, v0, v1

    const/4 v2, 0x1

    and-int/2addr v0, v2

    if-ne v0, v2, :cond_0

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_0
    invoke-virtual {p1}, Lt8/e0;->e()[B

    move-result-object v0

    aget-byte v0, v0, v1

    iget-object v3, p0, Lh7/j;->n:Lh7/j$a;

    invoke-static {v3}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lh7/j$a;

    invoke-static {v0, v3}, Lh7/j;->o(BLh7/j$a;)I

    move-result v0

    iget-boolean v3, p0, Lh7/j;->p:Z

    if-eqz v3, :cond_1

    iget v1, p0, Lh7/j;->o:I

    add-int/2addr v1, v0

    div-int/lit8 v1, v1, 0x4

    :cond_1
    int-to-long v3, v1

    invoke-static {p1, v3, v4}, Lh7/j;->n(Lt8/e0;J)V

    iput-boolean v2, p0, Lh7/j;->p:Z

    iput v0, p0, Lh7/j;->o:I

    return-wide v3
.end method

.method protected h(Lt8/e0;JLh7/i$b;)Z
    .locals 3

    iget-object p2, p0, Lh7/j;->n:Lh7/j$a;

    if-eqz p2, :cond_0

    iget-object p1, p4, Lh7/i$b;->a:Lt6/u1;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Lh7/j;->q(Lt8/e0;)Lh7/j$a;

    move-result-object p1

    iput-object p1, p0, Lh7/j;->n:Lh7/j$a;

    const/4 p2, 0x1

    if-nez p1, :cond_1

    return p2

    :cond_1
    iget-object p3, p1, Lh7/j$a;->a:Ly6/e0$d;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p3, Ly6/e0$d;->j:[B

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v1, p1, Lh7/j$a;->c:[B

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object p1, p1, Lh7/j$a;->b:Ly6/e0$b;

    iget-object p1, p1, Ly6/e0$b;->b:[Ljava/lang/String;

    invoke-static {p1}, Lcom/google/common/collect/w;->s([Ljava/lang/Object;)Lcom/google/common/collect/w;

    move-result-object p1

    invoke-static {p1}, Ly6/e0;->c(Ljava/util/List;)Ll7/a;

    move-result-object p1

    new-instance v1, Lt6/u1$b;

    invoke-direct {v1}, Lt6/u1$b;-><init>()V

    const-string v2, "audio/vorbis"

    invoke-virtual {v1, v2}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v1

    iget v2, p3, Ly6/e0$d;->e:I

    invoke-virtual {v1, v2}, Lt6/u1$b;->I(I)Lt6/u1$b;

    move-result-object v1

    iget v2, p3, Ly6/e0$d;->d:I

    invoke-virtual {v1, v2}, Lt6/u1$b;->b0(I)Lt6/u1$b;

    move-result-object v1

    iget v2, p3, Ly6/e0$d;->b:I

    invoke-virtual {v1, v2}, Lt6/u1$b;->J(I)Lt6/u1$b;

    move-result-object v1

    iget p3, p3, Ly6/e0$d;->c:I

    invoke-virtual {v1, p3}, Lt6/u1$b;->h0(I)Lt6/u1$b;

    move-result-object p3

    invoke-virtual {p3, v0}, Lt6/u1$b;->V(Ljava/util/List;)Lt6/u1$b;

    move-result-object p3

    invoke-virtual {p3, p1}, Lt6/u1$b;->Z(Ll7/a;)Lt6/u1$b;

    move-result-object p1

    invoke-virtual {p1}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object p1

    iput-object p1, p4, Lh7/i$b;->a:Lt6/u1;

    return p2
.end method

.method protected l(Z)V
    .locals 0

    invoke-super {p0, p1}, Lh7/i;->l(Z)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    iput-object p1, p0, Lh7/j;->n:Lh7/j$a;

    iput-object p1, p0, Lh7/j;->q:Ly6/e0$d;

    iput-object p1, p0, Lh7/j;->r:Ly6/e0$b;

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, Lh7/j;->o:I

    iput-boolean p1, p0, Lh7/j;->p:Z

    return-void
.end method

.method q(Lt8/e0;)Lh7/j$a;
    .locals 6

    iget-object v1, p0, Lh7/j;->q:Ly6/e0$d;

    const/4 v0, 0x0

    if-nez v1, :cond_0

    invoke-static {p1}, Ly6/e0;->k(Lt8/e0;)Ly6/e0$d;

    move-result-object p1

    iput-object p1, p0, Lh7/j;->q:Ly6/e0$d;

    return-object v0

    :cond_0
    iget-object v2, p0, Lh7/j;->r:Ly6/e0$b;

    if-nez v2, :cond_1

    invoke-static {p1}, Ly6/e0;->i(Lt8/e0;)Ly6/e0$b;

    move-result-object p1

    iput-object p1, p0, Lh7/j;->r:Ly6/e0$b;

    return-object v0

    :cond_1
    invoke-virtual {p1}, Lt8/e0;->g()I

    move-result v0

    new-array v3, v0, [B

    invoke-virtual {p1}, Lt8/e0;->e()[B

    move-result-object v0

    invoke-virtual {p1}, Lt8/e0;->g()I

    move-result v4

    const/4 v5, 0x0

    invoke-static {v0, v5, v3, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget v0, v1, Ly6/e0$d;->b:I

    invoke-static {p1, v0}, Ly6/e0;->l(Lt8/e0;I)[Ly6/e0$c;

    move-result-object v4

    array-length p1, v4

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1}, Ly6/e0;->a(I)I

    move-result v5

    new-instance p1, Lh7/j$a;

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lh7/j$a;-><init>(Ly6/e0$d;Ly6/e0$b;[B[Ly6/e0$c;I)V

    return-object p1
.end method
