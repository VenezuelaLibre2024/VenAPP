.class final Lc7/f;
.super Lc7/e;
.source "SourceFile"


# instance fields
.field private final b:Lt8/e0;

.field private final c:Lt8/e0;

.field private d:I

.field private e:Z

.field private f:Z

.field private g:I


# direct methods
.method public constructor <init>(Ly6/b0;)V
    .locals 1

    invoke-direct {p0, p1}, Lc7/e;-><init>(Ly6/b0;)V

    new-instance p1, Lt8/e0;

    sget-object v0, Lt8/x;->a:[B

    invoke-direct {p1, v0}, Lt8/e0;-><init>([B)V

    iput-object p1, p0, Lc7/f;->b:Lt8/e0;

    new-instance p1, Lt8/e0;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Lt8/e0;-><init>(I)V

    iput-object p1, p0, Lc7/f;->c:Lt8/e0;

    return-void
.end method


# virtual methods
.method protected b(Lt8/e0;)Z
    .locals 3

    invoke-virtual {p1}, Lt8/e0;->H()I

    move-result p1

    shr-int/lit8 v0, p1, 0x4

    and-int/lit8 v0, v0, 0xf

    and-int/lit8 p1, p1, 0xf

    const/4 v1, 0x7

    if-ne p1, v1, :cond_1

    iput v0, p0, Lc7/f;->g:I

    const/4 p1, 0x5

    if-eq v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :cond_1
    new-instance v0, Lc7/e$a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Video format not supported: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lc7/e$a;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected c(Lt8/e0;J)Z
    .locals 10

    invoke-virtual {p1}, Lt8/e0;->H()I

    move-result v0

    invoke-virtual {p1}, Lt8/e0;->r()I

    move-result v1

    int-to-long v1, v1

    const-wide/16 v3, 0x3e8

    mul-long/2addr v1, v3

    add-long v4, p2, v1

    const/4 p2, 0x1

    const/4 p3, 0x0

    if-nez v0, :cond_0

    iget-boolean v1, p0, Lc7/f;->e:Z

    if-nez v1, :cond_0

    new-instance v0, Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->a()I

    move-result v1

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lt8/e0;-><init>([B)V

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v1

    invoke-virtual {p1}, Lt8/e0;->a()I

    move-result v2

    invoke-virtual {p1, v1, p3, v2}, Lt8/e0;->l([BII)V

    invoke-static {v0}, Lu8/a;->b(Lt8/e0;)Lu8/a;

    move-result-object p1

    iget v0, p1, Lu8/a;->b:I

    iput v0, p0, Lc7/f;->d:I

    new-instance v0, Lt6/u1$b;

    invoke-direct {v0}, Lt6/u1$b;-><init>()V

    const-string v1, "video/avc"

    invoke-virtual {v0, v1}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v0

    iget-object v1, p1, Lu8/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lt6/u1$b;->K(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v0

    iget v1, p1, Lu8/a;->c:I

    invoke-virtual {v0, v1}, Lt6/u1$b;->n0(I)Lt6/u1$b;

    move-result-object v0

    iget v1, p1, Lu8/a;->d:I

    invoke-virtual {v0, v1}, Lt6/u1$b;->S(I)Lt6/u1$b;

    move-result-object v0

    iget v1, p1, Lu8/a;->e:F

    invoke-virtual {v0, v1}, Lt6/u1$b;->c0(F)Lt6/u1$b;

    move-result-object v0

    iget-object p1, p1, Lu8/a;->a:Ljava/util/List;

    invoke-virtual {v0, p1}, Lt6/u1$b;->V(Ljava/util/List;)Lt6/u1$b;

    move-result-object p1

    invoke-virtual {p1}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object p1

    iget-object v0, p0, Lc7/e;->a:Ly6/b0;

    invoke-interface {v0, p1}, Ly6/b0;->c(Lt6/u1;)V

    iput-boolean p2, p0, Lc7/f;->e:Z

    return p3

    :cond_0
    if-ne v0, p2, :cond_4

    iget-boolean v0, p0, Lc7/f;->e:Z

    if-eqz v0, :cond_4

    iget v0, p0, Lc7/f;->g:I

    if-ne v0, p2, :cond_1

    move v6, p2

    goto :goto_0

    :cond_1
    move v6, p3

    :goto_0
    iget-boolean v0, p0, Lc7/f;->f:Z

    if-nez v0, :cond_2

    if-nez v6, :cond_2

    return p3

    :cond_2
    iget-object v0, p0, Lc7/f;->c:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    aput-byte p3, v0, p3

    aput-byte p3, v0, p2

    const/4 v1, 0x2

    aput-byte p3, v0, v1

    iget v0, p0, Lc7/f;->d:I

    const/4 v1, 0x4

    rsub-int/lit8 v0, v0, 0x4

    move v7, p3

    :goto_1
    invoke-virtual {p1}, Lt8/e0;->a()I

    move-result v2

    if-lez v2, :cond_3

    iget-object v2, p0, Lc7/f;->c:Lt8/e0;

    invoke-virtual {v2}, Lt8/e0;->e()[B

    move-result-object v2

    iget v3, p0, Lc7/f;->d:I

    invoke-virtual {p1, v2, v0, v3}, Lt8/e0;->l([BII)V

    iget-object v2, p0, Lc7/f;->c:Lt8/e0;

    invoke-virtual {v2, p3}, Lt8/e0;->U(I)V

    iget-object v2, p0, Lc7/f;->c:Lt8/e0;

    invoke-virtual {v2}, Lt8/e0;->L()I

    move-result v2

    iget-object v3, p0, Lc7/f;->b:Lt8/e0;

    invoke-virtual {v3, p3}, Lt8/e0;->U(I)V

    iget-object v3, p0, Lc7/e;->a:Ly6/b0;

    iget-object v8, p0, Lc7/f;->b:Lt8/e0;

    invoke-interface {v3, v8, v1}, Ly6/b0;->a(Lt8/e0;I)V

    add-int/lit8 v7, v7, 0x4

    iget-object v3, p0, Lc7/e;->a:Ly6/b0;

    invoke-interface {v3, p1, v2}, Ly6/b0;->a(Lt8/e0;I)V

    add-int/2addr v7, v2

    goto :goto_1

    :cond_3
    iget-object v3, p0, Lc7/e;->a:Ly6/b0;

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-interface/range {v3 .. v9}, Ly6/b0;->b(JIIILy6/b0$a;)V

    iput-boolean p2, p0, Lc7/f;->f:Z

    return p2

    :cond_4
    return p3
.end method
