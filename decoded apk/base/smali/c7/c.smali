.class public final Lc7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/k;


# static fields
.field public static final q:Ly6/p;


# instance fields
.field private final a:Lt8/e0;

.field private final b:Lt8/e0;

.field private final c:Lt8/e0;

.field private final d:Lt8/e0;

.field private final e:Lc7/d;

.field private f:Ly6/m;

.field private g:I

.field private h:Z

.field private i:J

.field private j:I

.field private k:I

.field private l:I

.field private m:J

.field private n:Z

.field private o:Lc7/a;

.field private p:Lc7/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc7/b;

    invoke-direct {v0}, Lc7/b;-><init>()V

    sput-object v0, Lc7/c;->q:Ly6/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt8/e0;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Lt8/e0;-><init>(I)V

    iput-object v0, p0, Lc7/c;->a:Lt8/e0;

    new-instance v0, Lt8/e0;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lt8/e0;-><init>(I)V

    iput-object v0, p0, Lc7/c;->b:Lt8/e0;

    new-instance v0, Lt8/e0;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lt8/e0;-><init>(I)V

    iput-object v0, p0, Lc7/c;->c:Lt8/e0;

    new-instance v0, Lt8/e0;

    invoke-direct {v0}, Lt8/e0;-><init>()V

    iput-object v0, p0, Lc7/c;->d:Lt8/e0;

    new-instance v0, Lc7/d;

    invoke-direct {v0}, Lc7/d;-><init>()V

    iput-object v0, p0, Lc7/c;->e:Lc7/d;

    const/4 v0, 0x1

    iput v0, p0, Lc7/c;->g:I

    return-void
.end method

.method public static synthetic c()[Ly6/k;
    .locals 1

    invoke-static {}, Lc7/c;->h()[Ly6/k;

    move-result-object v0

    return-object v0
.end method

.method private d()V
    .locals 4

    iget-boolean v0, p0, Lc7/c;->n:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lc7/c;->f:Ly6/m;

    new-instance v1, Ly6/z$b;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v1, v2, v3}, Ly6/z$b;-><init>(J)V

    invoke-interface {v0, v1}, Ly6/m;->p(Ly6/z;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lc7/c;->n:Z

    :cond_0
    return-void
.end method

.method private g()J
    .locals 4

    iget-boolean v0, p0, Lc7/c;->h:Z

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lc7/c;->i:J

    iget-wide v2, p0, Lc7/c;->m:J

    add-long/2addr v0, v2

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc7/c;->e:Lc7/d;

    invoke-virtual {v0}, Lc7/d;->d()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    const-wide/16 v0, 0x0

    goto :goto_0

    :cond_1
    iget-wide v0, p0, Lc7/c;->m:J

    :goto_0
    return-wide v0
.end method

.method private static synthetic h()[Ly6/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ly6/k;

    new-instance v1, Lc7/c;

    invoke-direct {v1}, Lc7/c;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private i(Ly6/l;)Lt8/e0;
    .locals 4

    iget v0, p0, Lc7/c;->l:I

    iget-object v1, p0, Lc7/c;->d:Lt8/e0;

    invoke-virtual {v1}, Lt8/e0;->b()I

    move-result v1

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    iget-object v0, p0, Lc7/c;->d:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->b()I

    move-result v1

    mul-int/lit8 v1, v1, 0x2

    iget v3, p0, Lc7/c;->l:I

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    new-array v1, v1, [B

    invoke-virtual {v0, v1, v2}, Lt8/e0;->S([BI)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lc7/c;->d:Lt8/e0;

    invoke-virtual {v0, v2}, Lt8/e0;->U(I)V

    :goto_0
    iget-object v0, p0, Lc7/c;->d:Lt8/e0;

    iget v1, p0, Lc7/c;->l:I

    invoke-virtual {v0, v1}, Lt8/e0;->T(I)V

    iget-object v0, p0, Lc7/c;->d:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    iget v1, p0, Lc7/c;->l:I

    invoke-interface {p1, v0, v2, v1}, Ly6/l;->readFully([BII)V

    iget-object p1, p0, Lc7/c;->d:Lt8/e0;

    return-object p1
.end method

.method private j(Ly6/l;)Z
    .locals 6

    iget-object v0, p0, Lc7/c;->b:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0x9

    const/4 v3, 0x1

    invoke-interface {p1, v0, v1, v2, v3}, Ly6/l;->g([BIIZ)Z

    move-result p1

    if-nez p1, :cond_0

    return v1

    :cond_0
    iget-object p1, p0, Lc7/c;->b:Lt8/e0;

    invoke-virtual {p1, v1}, Lt8/e0;->U(I)V

    iget-object p1, p0, Lc7/c;->b:Lt8/e0;

    const/4 v0, 0x4

    invoke-virtual {p1, v0}, Lt8/e0;->V(I)V

    iget-object p1, p0, Lc7/c;->b:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->H()I

    move-result p1

    and-int/lit8 v4, p1, 0x4

    if-eqz v4, :cond_1

    move v4, v3

    goto :goto_0

    :cond_1
    move v4, v1

    :goto_0
    and-int/2addr p1, v3

    if-eqz p1, :cond_2

    move v1, v3

    :cond_2
    if-eqz v4, :cond_3

    iget-object p1, p0, Lc7/c;->o:Lc7/a;

    if-nez p1, :cond_3

    new-instance p1, Lc7/a;

    iget-object v4, p0, Lc7/c;->f:Ly6/m;

    const/16 v5, 0x8

    invoke-interface {v4, v5, v3}, Ly6/m;->d(II)Ly6/b0;

    move-result-object v4

    invoke-direct {p1, v4}, Lc7/a;-><init>(Ly6/b0;)V

    iput-object p1, p0, Lc7/c;->o:Lc7/a;

    :cond_3
    const/4 p1, 0x2

    if-eqz v1, :cond_4

    iget-object v1, p0, Lc7/c;->p:Lc7/f;

    if-nez v1, :cond_4

    new-instance v1, Lc7/f;

    iget-object v4, p0, Lc7/c;->f:Ly6/m;

    invoke-interface {v4, v2, p1}, Ly6/m;->d(II)Ly6/b0;

    move-result-object v4

    invoke-direct {v1, v4}, Lc7/f;-><init>(Ly6/b0;)V

    iput-object v1, p0, Lc7/c;->p:Lc7/f;

    :cond_4
    iget-object v1, p0, Lc7/c;->f:Ly6/m;

    invoke-interface {v1}, Ly6/m;->q()V

    iget-object v1, p0, Lc7/c;->b:Lt8/e0;

    invoke-virtual {v1}, Lt8/e0;->q()I

    move-result v1

    sub-int/2addr v1, v2

    add-int/2addr v1, v0

    iput v1, p0, Lc7/c;->j:I

    iput p1, p0, Lc7/c;->g:I

    return v3
.end method

.method private k(Ly6/l;)Z
    .locals 9

    invoke-direct {p0}, Lc7/c;->g()J

    move-result-wide v0

    iget v2, p0, Lc7/c;->k:I

    const/16 v3, 0x8

    const-wide v4, -0x7fffffffffffffffL    # -4.9E-324

    const/4 v6, 0x1

    if-ne v2, v3, :cond_1

    iget-object v3, p0, Lc7/c;->o:Lc7/a;

    if-eqz v3, :cond_1

    invoke-direct {p0}, Lc7/c;->d()V

    iget-object v2, p0, Lc7/c;->o:Lc7/a;

    :goto_0
    invoke-direct {p0, p1}, Lc7/c;->i(Ly6/l;)Lt8/e0;

    move-result-object p1

    invoke-virtual {v2, p1, v0, v1}, Lc7/e;->a(Lt8/e0;J)Z

    move-result p1

    :cond_0
    :goto_1
    move v0, v6

    goto :goto_2

    :cond_1
    const/16 v3, 0x9

    if-ne v2, v3, :cond_2

    iget-object v3, p0, Lc7/c;->p:Lc7/f;

    if-eqz v3, :cond_2

    invoke-direct {p0}, Lc7/c;->d()V

    iget-object v2, p0, Lc7/c;->p:Lc7/f;

    goto :goto_0

    :cond_2
    const/16 v3, 0x12

    if-ne v2, v3, :cond_3

    iget-boolean v2, p0, Lc7/c;->n:Z

    if-nez v2, :cond_3

    iget-object v2, p0, Lc7/c;->e:Lc7/d;

    invoke-direct {p0, p1}, Lc7/c;->i(Ly6/l;)Lt8/e0;

    move-result-object p1

    invoke-virtual {v2, p1, v0, v1}, Lc7/e;->a(Lt8/e0;J)Z

    move-result p1

    iget-object v0, p0, Lc7/c;->e:Lc7/d;

    invoke-virtual {v0}, Lc7/d;->d()J

    move-result-wide v0

    cmp-long v2, v0, v4

    if-eqz v2, :cond_0

    iget-object v2, p0, Lc7/c;->f:Ly6/m;

    new-instance v3, Ly6/x;

    iget-object v7, p0, Lc7/c;->e:Lc7/d;

    invoke-virtual {v7}, Lc7/d;->e()[J

    move-result-object v7

    iget-object v8, p0, Lc7/c;->e:Lc7/d;

    invoke-virtual {v8}, Lc7/d;->f()[J

    move-result-object v8

    invoke-direct {v3, v7, v8, v0, v1}, Ly6/x;-><init>([J[JJ)V

    invoke-interface {v2, v3}, Ly6/m;->p(Ly6/z;)V

    iput-boolean v6, p0, Lc7/c;->n:Z

    goto :goto_1

    :cond_3
    iget v0, p0, Lc7/c;->l:I

    invoke-interface {p1, v0}, Ly6/l;->n(I)V

    const/4 p1, 0x0

    move v0, p1

    :goto_2
    iget-boolean v1, p0, Lc7/c;->h:Z

    if-nez v1, :cond_5

    if-eqz p1, :cond_5

    iput-boolean v6, p0, Lc7/c;->h:Z

    iget-object p1, p0, Lc7/c;->e:Lc7/d;

    invoke-virtual {p1}, Lc7/d;->d()J

    move-result-wide v1

    cmp-long p1, v1, v4

    if-nez p1, :cond_4

    iget-wide v1, p0, Lc7/c;->m:J

    neg-long v1, v1

    goto :goto_3

    :cond_4
    const-wide/16 v1, 0x0

    :goto_3
    iput-wide v1, p0, Lc7/c;->i:J

    :cond_5
    const/4 p1, 0x4

    iput p1, p0, Lc7/c;->j:I

    const/4 p1, 0x2

    iput p1, p0, Lc7/c;->g:I

    return v0
.end method

.method private l(Ly6/l;)Z
    .locals 6

    iget-object v0, p0, Lc7/c;->c:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/16 v2, 0xb

    const/4 v3, 0x1

    invoke-interface {p1, v0, v1, v2, v3}, Ly6/l;->g([BIIZ)Z

    move-result p1

    if-nez p1, :cond_0

    return v1

    :cond_0
    iget-object p1, p0, Lc7/c;->c:Lt8/e0;

    invoke-virtual {p1, v1}, Lt8/e0;->U(I)V

    iget-object p1, p0, Lc7/c;->c:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->H()I

    move-result p1

    iput p1, p0, Lc7/c;->k:I

    iget-object p1, p0, Lc7/c;->c:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->K()I

    move-result p1

    iput p1, p0, Lc7/c;->l:I

    iget-object p1, p0, Lc7/c;->c:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->K()I

    move-result p1

    int-to-long v0, p1

    iput-wide v0, p0, Lc7/c;->m:J

    iget-object p1, p0, Lc7/c;->c:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->H()I

    move-result p1

    shl-int/lit8 p1, p1, 0x18

    int-to-long v0, p1

    iget-wide v4, p0, Lc7/c;->m:J

    or-long/2addr v0, v4

    const-wide/16 v4, 0x3e8

    mul-long/2addr v0, v4

    iput-wide v0, p0, Lc7/c;->m:J

    iget-object p1, p0, Lc7/c;->c:Lt8/e0;

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lt8/e0;->V(I)V

    const/4 p1, 0x4

    iput p1, p0, Lc7/c;->g:I

    return v3
.end method

.method private m(Ly6/l;)V
    .locals 1

    iget v0, p0, Lc7/c;->j:I

    invoke-interface {p1, v0}, Ly6/l;->n(I)V

    const/4 p1, 0x0

    iput p1, p0, Lc7/c;->j:I

    const/4 p1, 0x3

    iput p1, p0, Lc7/c;->g:I

    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 0

    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    const/4 p2, 0x0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput p1, p0, Lc7/c;->g:I

    iput-boolean p2, p0, Lc7/c;->h:Z

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    iput p1, p0, Lc7/c;->g:I

    :goto_0
    iput p2, p0, Lc7/c;->j:I

    return-void
.end method

.method public b(Ly6/m;)V
    .locals 0

    iput-object p1, p0, Lc7/c;->f:Ly6/m;

    return-void
.end method

.method public e(Ly6/l;)Z
    .locals 3

    iget-object v0, p0, Lc7/c;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Ly6/l;->q([BII)V

    iget-object v0, p0, Lc7/c;->a:Lt8/e0;

    invoke-virtual {v0, v2}, Lt8/e0;->U(I)V

    iget-object v0, p0, Lc7/c;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->K()I

    move-result v0

    const v1, 0x464c56

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Lc7/c;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    const/4 v1, 0x2

    invoke-interface {p1, v0, v2, v1}, Ly6/l;->q([BII)V

    iget-object v0, p0, Lc7/c;->a:Lt8/e0;

    invoke-virtual {v0, v2}, Lt8/e0;->U(I)V

    iget-object v0, p0, Lc7/c;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->N()I

    move-result v0

    and-int/lit16 v0, v0, 0xfa

    if-eqz v0, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, Lc7/c;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    const/4 v1, 0x4

    invoke-interface {p1, v0, v2, v1}, Ly6/l;->q([BII)V

    iget-object v0, p0, Lc7/c;->a:Lt8/e0;

    invoke-virtual {v0, v2}, Lt8/e0;->U(I)V

    iget-object v0, p0, Lc7/c;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->q()I

    move-result v0

    invoke-interface {p1}, Ly6/l;->f()V

    invoke-interface {p1, v0}, Ly6/l;->k(I)V

    iget-object v0, p0, Lc7/c;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    invoke-interface {p1, v0, v2, v1}, Ly6/l;->q([BII)V

    iget-object p1, p0, Lc7/c;->a:Lt8/e0;

    invoke-virtual {p1, v2}, Lt8/e0;->U(I)V

    iget-object p1, p0, Lc7/c;->a:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->q()I

    move-result p1

    if-nez p1, :cond_2

    const/4 v2, 0x1

    :cond_2
    return v2
.end method

.method public f(Ly6/l;Ly6/y;)I
    .locals 2

    iget-object p2, p0, Lc7/c;->f:Ly6/m;

    invoke-static {p2}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    :goto_0
    iget p2, p0, Lc7/c;->g:I

    const/4 v0, 0x1

    const/4 v1, -0x1

    if-eq p2, v0, :cond_4

    const/4 v0, 0x2

    if-eq p2, v0, :cond_3

    const/4 v0, 0x3

    if-eq p2, v0, :cond_2

    const/4 v0, 0x4

    if-ne p2, v0, :cond_1

    invoke-direct {p0, p1}, Lc7/c;->k(Ly6/l;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_2
    invoke-direct {p0, p1}, Lc7/c;->l(Ly6/l;)Z

    move-result p2

    if-nez p2, :cond_0

    return v1

    :cond_3
    invoke-direct {p0, p1}, Lc7/c;->m(Ly6/l;)V

    goto :goto_0

    :cond_4
    invoke-direct {p0, p1}, Lc7/c;->j(Ly6/l;)Z

    move-result p2

    if-nez p2, :cond_0

    return v1
.end method

.method public release()V
    .locals 0

    return-void
.end method
