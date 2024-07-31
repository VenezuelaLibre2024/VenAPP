.class public final Li7/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/m;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li7/p$b;
    }
.end annotation


# instance fields
.field private final a:Li7/d0;

.field private final b:Z

.field private final c:Z

.field private final d:Li7/u;

.field private final e:Li7/u;

.field private final f:Li7/u;

.field private g:J

.field private final h:[Z

.field private i:Ljava/lang/String;

.field private j:Ly6/b0;

.field private k:Li7/p$b;

.field private l:Z

.field private m:J

.field private n:Z

.field private final o:Lt8/e0;


# direct methods
.method public constructor <init>(Li7/d0;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li7/p;->a:Li7/d0;

    iput-boolean p2, p0, Li7/p;->b:Z

    iput-boolean p3, p0, Li7/p;->c:Z

    const/4 p1, 0x3

    new-array p1, p1, [Z

    iput-object p1, p0, Li7/p;->h:[Z

    new-instance p1, Li7/u;

    const/4 p2, 0x7

    const/16 p3, 0x80

    invoke-direct {p1, p2, p3}, Li7/u;-><init>(II)V

    iput-object p1, p0, Li7/p;->d:Li7/u;

    new-instance p1, Li7/u;

    const/16 p2, 0x8

    invoke-direct {p1, p2, p3}, Li7/u;-><init>(II)V

    iput-object p1, p0, Li7/p;->e:Li7/u;

    new-instance p1, Li7/u;

    const/4 p2, 0x6

    invoke-direct {p1, p2, p3}, Li7/u;-><init>(II)V

    iput-object p1, p0, Li7/p;->f:Li7/u;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Li7/p;->m:J

    new-instance p1, Lt8/e0;

    invoke-direct {p1}, Lt8/e0;-><init>()V

    iput-object p1, p0, Li7/p;->o:Lt8/e0;

    return-void
.end method

.method private a()V
    .locals 1

    iget-object v0, p0, Li7/p;->j:Ly6/b0;

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Li7/p;->k:Li7/p$b;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private g(JIIJ)V
    .locals 7

    iget-boolean v0, p0, Li7/p;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Li7/p;->k:Li7/p$b;

    invoke-virtual {v0}, Li7/p$b;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_0
    iget-object v0, p0, Li7/p;->d:Li7/u;

    invoke-virtual {v0, p4}, Li7/u;->b(I)Z

    iget-object v0, p0, Li7/p;->e:Li7/u;

    invoke-virtual {v0, p4}, Li7/u;->b(I)Z

    iget-boolean v0, p0, Li7/p;->l:Z

    const/4 v1, 0x3

    if-nez v0, :cond_1

    iget-object v0, p0, Li7/p;->d:Li7/u;

    invoke-virtual {v0}, Li7/u;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Li7/p;->e:Li7/u;

    invoke-virtual {v0}, Li7/u;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Li7/p;->d:Li7/u;

    iget-object v3, v2, Li7/u;->d:[B

    iget v2, v2, Li7/u;->e:I

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Li7/p;->e:Li7/u;

    iget-object v3, v2, Li7/u;->d:[B

    iget v2, v2, Li7/u;->e:I

    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object v2, p0, Li7/p;->d:Li7/u;

    iget-object v3, v2, Li7/u;->d:[B

    iget v2, v2, Li7/u;->e:I

    invoke-static {v3, v1, v2}, Lt8/x;->l([BII)Lt8/x$c;

    move-result-object v2

    iget-object v3, p0, Li7/p;->e:Li7/u;

    iget-object v4, v3, Li7/u;->d:[B

    iget v3, v3, Li7/u;->e:I

    invoke-static {v4, v1, v3}, Lt8/x;->j([BII)Lt8/x$b;

    move-result-object v1

    iget v3, v2, Lt8/x$c;->a:I

    iget v4, v2, Lt8/x$c;->b:I

    iget v5, v2, Lt8/x$c;->c:I

    invoke-static {v3, v4, v5}, Lt8/e;->a(III)Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Li7/p;->j:Ly6/b0;

    new-instance v5, Lt6/u1$b;

    invoke-direct {v5}, Lt6/u1$b;-><init>()V

    iget-object v6, p0, Li7/p;->i:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lt6/u1$b;->U(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v5

    const-string v6, "video/avc"

    invoke-virtual {v5, v6}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v5

    invoke-virtual {v5, v3}, Lt6/u1$b;->K(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v3

    iget v5, v2, Lt8/x$c;->f:I

    invoke-virtual {v3, v5}, Lt6/u1$b;->n0(I)Lt6/u1$b;

    move-result-object v3

    iget v5, v2, Lt8/x$c;->g:I

    invoke-virtual {v3, v5}, Lt6/u1$b;->S(I)Lt6/u1$b;

    move-result-object v3

    iget v5, v2, Lt8/x$c;->h:F

    invoke-virtual {v3, v5}, Lt6/u1$b;->c0(F)Lt6/u1$b;

    move-result-object v3

    invoke-virtual {v3, v0}, Lt6/u1$b;->V(Ljava/util/List;)Lt6/u1$b;

    move-result-object v0

    invoke-virtual {v0}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object v0

    invoke-interface {v4, v0}, Ly6/b0;->c(Lt6/u1;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Li7/p;->l:Z

    iget-object v0, p0, Li7/p;->k:Li7/p$b;

    invoke-virtual {v0, v2}, Li7/p$b;->f(Lt8/x$c;)V

    iget-object v0, p0, Li7/p;->k:Li7/p$b;

    invoke-virtual {v0, v1}, Li7/p$b;->e(Lt8/x$b;)V

    iget-object v0, p0, Li7/p;->d:Li7/u;

    invoke-virtual {v0}, Li7/u;->d()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Li7/p;->d:Li7/u;

    invoke-virtual {v0}, Li7/u;->c()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Li7/p;->d:Li7/u;

    iget-object v2, v0, Li7/u;->d:[B

    iget v0, v0, Li7/u;->e:I

    invoke-static {v2, v1, v0}, Lt8/x;->l([BII)Lt8/x$c;

    move-result-object v0

    iget-object v1, p0, Li7/p;->k:Li7/p$b;

    invoke-virtual {v1, v0}, Li7/p$b;->f(Lt8/x$c;)V

    iget-object v0, p0, Li7/p;->d:Li7/u;

    :goto_0
    invoke-virtual {v0}, Li7/u;->d()V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Li7/p;->e:Li7/u;

    invoke-virtual {v0}, Li7/u;->c()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Li7/p;->e:Li7/u;

    iget-object v2, v0, Li7/u;->d:[B

    iget v0, v0, Li7/u;->e:I

    invoke-static {v2, v1, v0}, Lt8/x;->j([BII)Lt8/x$b;

    move-result-object v0

    iget-object v1, p0, Li7/p;->k:Li7/p$b;

    invoke-virtual {v1, v0}, Li7/p$b;->e(Lt8/x$b;)V

    :goto_1
    iget-object v0, p0, Li7/p;->e:Li7/u;

    goto :goto_0

    :cond_3
    :goto_2
    iget-object v0, p0, Li7/p;->f:Li7/u;

    invoke-virtual {v0, p4}, Li7/u;->b(I)Z

    move-result p4

    if-eqz p4, :cond_4

    iget-object p4, p0, Li7/p;->f:Li7/u;

    iget-object v0, p4, Li7/u;->d:[B

    iget p4, p4, Li7/u;->e:I

    invoke-static {v0, p4}, Lt8/x;->q([BI)I

    move-result p4

    iget-object v0, p0, Li7/p;->o:Lt8/e0;

    iget-object v1, p0, Li7/p;->f:Li7/u;

    iget-object v1, v1, Li7/u;->d:[B

    invoke-virtual {v0, v1, p4}, Lt8/e0;->S([BI)V

    iget-object p4, p0, Li7/p;->o:Lt8/e0;

    const/4 v0, 0x4

    invoke-virtual {p4, v0}, Lt8/e0;->U(I)V

    iget-object p4, p0, Li7/p;->a:Li7/d0;

    iget-object v0, p0, Li7/p;->o:Lt8/e0;

    invoke-virtual {p4, p5, p6, v0}, Li7/d0;->a(JLt8/e0;)V

    :cond_4
    iget-object v1, p0, Li7/p;->k:Li7/p$b;

    iget-boolean v5, p0, Li7/p;->l:Z

    iget-boolean v6, p0, Li7/p;->n:Z

    move-wide v2, p1

    move v4, p3

    invoke-virtual/range {v1 .. v6}, Li7/p$b;->b(JIZZ)Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    iput-boolean p1, p0, Li7/p;->n:Z

    :cond_5
    return-void
.end method

.method private h([BII)V
    .locals 1

    iget-boolean v0, p0, Li7/p;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Li7/p;->k:Li7/p$b;

    invoke-virtual {v0}, Li7/p$b;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Li7/p;->d:Li7/u;

    invoke-virtual {v0, p1, p2, p3}, Li7/u;->a([BII)V

    iget-object v0, p0, Li7/p;->e:Li7/u;

    invoke-virtual {v0, p1, p2, p3}, Li7/u;->a([BII)V

    :cond_1
    iget-object v0, p0, Li7/p;->f:Li7/u;

    invoke-virtual {v0, p1, p2, p3}, Li7/u;->a([BII)V

    iget-object v0, p0, Li7/p;->k:Li7/p$b;

    invoke-virtual {v0, p1, p2, p3}, Li7/p$b;->a([BII)V

    return-void
.end method

.method private i(JIJ)V
    .locals 7

    iget-boolean v0, p0, Li7/p;->l:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Li7/p;->k:Li7/p$b;

    invoke-virtual {v0}, Li7/p$b;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Li7/p;->d:Li7/u;

    invoke-virtual {v0, p3}, Li7/u;->e(I)V

    iget-object v0, p0, Li7/p;->e:Li7/u;

    invoke-virtual {v0, p3}, Li7/u;->e(I)V

    :cond_1
    iget-object v0, p0, Li7/p;->f:Li7/u;

    invoke-virtual {v0, p3}, Li7/u;->e(I)V

    iget-object v1, p0, Li7/p;->k:Li7/p$b;

    move-wide v2, p1

    move v4, p3

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Li7/p$b;->h(JIJ)V

    return-void
.end method


# virtual methods
.method public b(Lt8/e0;)V
    .locals 14

    invoke-direct {p0}, Li7/p;->a()V

    invoke-virtual {p1}, Lt8/e0;->f()I

    move-result v0

    invoke-virtual {p1}, Lt8/e0;->g()I

    move-result v1

    invoke-virtual {p1}, Lt8/e0;->e()[B

    move-result-object v2

    iget-wide v3, p0, Li7/p;->g:J

    invoke-virtual {p1}, Lt8/e0;->a()I

    move-result v5

    int-to-long v5, v5

    add-long/2addr v3, v5

    iput-wide v3, p0, Li7/p;->g:J

    iget-object v3, p0, Li7/p;->j:Ly6/b0;

    invoke-virtual {p1}, Lt8/e0;->a()I

    move-result v4

    invoke-interface {v3, p1, v4}, Ly6/b0;->a(Lt8/e0;I)V

    :goto_0
    iget-object p1, p0, Li7/p;->h:[Z

    invoke-static {v2, v0, v1, p1}, Lt8/x;->c([BII[Z)I

    move-result p1

    if-ne p1, v1, :cond_0

    invoke-direct {p0, v2, v0, v1}, Li7/p;->h([BII)V

    return-void

    :cond_0
    invoke-static {v2, p1}, Lt8/x;->f([BI)I

    move-result v6

    sub-int v3, p1, v0

    if-lez v3, :cond_1

    invoke-direct {p0, v2, v0, p1}, Li7/p;->h([BII)V

    :cond_1
    sub-int v10, v1, p1

    iget-wide v4, p0, Li7/p;->g:J

    int-to-long v7, v10

    sub-long/2addr v4, v7

    if-gez v3, :cond_2

    neg-int v0, v3

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    move v11, v0

    iget-wide v12, p0, Li7/p;->m:J

    move-object v7, p0

    move-wide v8, v4

    invoke-direct/range {v7 .. v13}, Li7/p;->g(JIIJ)V

    iget-wide v7, p0, Li7/p;->m:J

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Li7/p;->i(JIJ)V

    add-int/lit8 v0, p1, 0x3

    goto :goto_0
.end method

.method public c()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Li7/p;->g:J

    const/4 v0, 0x0

    iput-boolean v0, p0, Li7/p;->n:Z

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Li7/p;->m:J

    iget-object v0, p0, Li7/p;->h:[Z

    invoke-static {v0}, Lt8/x;->a([Z)V

    iget-object v0, p0, Li7/p;->d:Li7/u;

    invoke-virtual {v0}, Li7/u;->d()V

    iget-object v0, p0, Li7/p;->e:Li7/u;

    invoke-virtual {v0}, Li7/u;->d()V

    iget-object v0, p0, Li7/p;->f:Li7/u;

    invoke-virtual {v0}, Li7/u;->d()V

    iget-object v0, p0, Li7/p;->k:Li7/p$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Li7/p$b;->g()V

    :cond_0
    return-void
.end method

.method public d(Ly6/m;Li7/i0$d;)V
    .locals 4

    invoke-virtual {p2}, Li7/i0$d;->a()V

    invoke-virtual {p2}, Li7/i0$d;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Li7/p;->i:Ljava/lang/String;

    invoke-virtual {p2}, Li7/i0$d;->c()I

    move-result v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v1}, Ly6/m;->d(II)Ly6/b0;

    move-result-object v0

    iput-object v0, p0, Li7/p;->j:Ly6/b0;

    new-instance v1, Li7/p$b;

    iget-boolean v2, p0, Li7/p;->b:Z

    iget-boolean v3, p0, Li7/p;->c:Z

    invoke-direct {v1, v0, v2, v3}, Li7/p$b;-><init>(Ly6/b0;ZZ)V

    iput-object v1, p0, Li7/p;->k:Li7/p$b;

    iget-object v0, p0, Li7/p;->a:Li7/d0;

    invoke-virtual {v0, p1, p2}, Li7/d0;->b(Ly6/m;Li7/i0$d;)V

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method

.method public f(JI)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    iput-wide p1, p0, Li7/p;->m:J

    :cond_0
    iget-boolean p1, p0, Li7/p;->n:Z

    and-int/lit8 p2, p3, 0x2

    if-eqz p2, :cond_1

    const/4 p2, 0x1

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    or-int/2addr p1, p2

    iput-boolean p1, p0, Li7/p;->n:Z

    return-void
.end method
