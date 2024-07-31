.class public final Li7/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/k;


# static fields
.field public static final m:Ly6/p;


# instance fields
.field private final a:I

.field private final b:Li7/i;

.field private final c:Lt8/e0;

.field private final d:Lt8/e0;

.field private final e:Lt8/d0;

.field private f:Ly6/m;

.field private g:J

.field private h:J

.field private i:I

.field private j:Z

.field private k:Z

.field private l:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Li7/g;

    invoke-direct {v0}, Li7/g;-><init>()V

    sput-object v0, Li7/h;->m:Ly6/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li7/h;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    :cond_0
    iput p1, p0, Li7/h;->a:I

    new-instance p1, Li7/i;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Li7/i;-><init>(Z)V

    iput-object p1, p0, Li7/h;->b:Li7/i;

    new-instance p1, Lt8/e0;

    const/16 v0, 0x800

    invoke-direct {p1, v0}, Lt8/e0;-><init>(I)V

    iput-object p1, p0, Li7/h;->c:Lt8/e0;

    const/4 p1, -0x1

    iput p1, p0, Li7/h;->i:I

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Li7/h;->h:J

    new-instance p1, Lt8/e0;

    const/16 v0, 0xa

    invoke-direct {p1, v0}, Lt8/e0;-><init>(I)V

    iput-object p1, p0, Li7/h;->d:Lt8/e0;

    new-instance v0, Lt8/d0;

    invoke-virtual {p1}, Lt8/e0;->e()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lt8/d0;-><init>([B)V

    iput-object v0, p0, Li7/h;->e:Lt8/d0;

    return-void
.end method

.method public static synthetic c()[Ly6/k;
    .locals 1

    invoke-static {}, Li7/h;->i()[Ly6/k;

    move-result-object v0

    return-object v0
.end method

.method private d(Ly6/l;)V
    .locals 9

    iget-boolean v0, p0, Li7/h;->j:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, -0x1

    iput v0, p0, Li7/h;->i:I

    invoke-interface {p1}, Ly6/l;->f()V

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_1

    invoke-direct {p0, p1}, Li7/h;->k(Ly6/l;)I

    :cond_1
    const/4 v1, 0x0

    move v2, v1

    :cond_2
    const/4 v5, 0x1

    :try_start_0
    iget-object v6, p0, Li7/h;->d:Lt8/e0;

    invoke-virtual {v6}, Lt8/e0;->e()[B

    move-result-object v6

    const/4 v7, 0x2

    invoke-interface {p1, v6, v1, v7, v5}, Ly6/l;->d([BIIZ)Z

    move-result v6

    if-eqz v6, :cond_7

    iget-object v6, p0, Li7/h;->d:Lt8/e0;

    invoke-virtual {v6, v1}, Lt8/e0;->U(I)V

    iget-object v6, p0, Li7/h;->d:Lt8/e0;

    invoke-virtual {v6}, Lt8/e0;->N()I

    move-result v6

    invoke-static {v6}, Li7/i;->m(I)Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_2

    :cond_3
    iget-object v6, p0, Li7/h;->d:Lt8/e0;

    invoke-virtual {v6}, Lt8/e0;->e()[B

    move-result-object v6

    const/4 v7, 0x4

    invoke-interface {p1, v6, v1, v7, v5}, Ly6/l;->d([BIIZ)Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_1

    :cond_4
    iget-object v6, p0, Li7/h;->e:Lt8/d0;

    const/16 v7, 0xe

    invoke-virtual {v6, v7}, Lt8/d0;->p(I)V

    iget-object v6, p0, Li7/h;->e:Lt8/d0;

    const/16 v7, 0xd

    invoke-virtual {v6, v7}, Lt8/d0;->h(I)I

    move-result v6

    const/4 v7, 0x6

    if-le v6, v7, :cond_6

    int-to-long v7, v6

    add-long/2addr v3, v7

    add-int/lit8 v2, v2, 0x1

    const/16 v7, 0x3e8

    if-ne v2, v7, :cond_5

    goto :goto_0

    :cond_5
    add-int/lit8 v6, v6, -0x6

    invoke-interface {p1, v6, v5}, Ly6/l;->p(IZ)Z

    move-result v6

    if-nez v6, :cond_2

    :goto_0
    goto :goto_1

    :cond_6
    iput-boolean v5, p0, Li7/h;->j:Z

    const-string v1, "Malformed ADTS stream"

    const/4 v6, 0x0

    invoke-static {v1, v6}, Lt6/b3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lt6/b3;

    move-result-object v1

    throw v1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_7
    :goto_1
    move v1, v2

    :goto_2
    invoke-interface {p1}, Ly6/l;->f()V

    if-lez v1, :cond_8

    int-to-long v0, v1

    div-long/2addr v3, v0

    long-to-int p1, v3

    iput p1, p0, Li7/h;->i:I

    goto :goto_3

    :cond_8
    iput v0, p0, Li7/h;->i:I

    :goto_3
    iput-boolean v5, p0, Li7/h;->j:Z

    return-void
.end method

.method private static g(IJ)I
    .locals 4

    int-to-long v0, p0

    const-wide/16 v2, 0x8

    mul-long/2addr v0, v2

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    div-long/2addr v0, p1

    long-to-int p0, v0

    return p0
.end method

.method private h(JZ)Ly6/z;
    .locals 11

    iget v0, p0, Li7/h;->i:I

    iget-object v1, p0, Li7/h;->b:Li7/i;

    invoke-virtual {v1}, Li7/i;->k()J

    move-result-wide v1

    invoke-static {v0, v1, v2}, Li7/h;->g(IJ)I

    move-result v8

    new-instance v0, Ly6/d;

    iget-wide v6, p0, Li7/h;->h:J

    iget v9, p0, Li7/h;->i:I

    move-object v3, v0

    move-wide v4, p1

    move v10, p3

    invoke-direct/range {v3 .. v10}, Ly6/d;-><init>(JJIIZ)V

    return-object v0
.end method

.method private static synthetic i()[Ly6/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ly6/k;

    new-instance v1, Li7/h;

    invoke-direct {v1}, Li7/h;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private j(JZ)V
    .locals 7

    iget-boolean v0, p0, Li7/h;->l:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget v0, p0, Li7/h;->a:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    iget v0, p0, Li7/h;->i:I

    if-lez v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_2

    iget-object v5, p0, Li7/h;->b:Li7/i;

    invoke-virtual {v5}, Li7/i;->k()J

    move-result-wide v5

    cmp-long v5, v5, v3

    if-nez v5, :cond_2

    if-nez p3, :cond_2

    return-void

    :cond_2
    if-eqz v0, :cond_4

    iget-object p3, p0, Li7/h;->b:Li7/i;

    invoke-virtual {p3}, Li7/i;->k()J

    move-result-wide v5

    cmp-long p3, v5, v3

    if-eqz p3, :cond_4

    iget-object p3, p0, Li7/h;->f:Ly6/m;

    iget v0, p0, Li7/h;->a:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_3

    move v2, v1

    :cond_3
    invoke-direct {p0, p1, p2, v2}, Li7/h;->h(JZ)Ly6/z;

    move-result-object p1

    invoke-interface {p3, p1}, Ly6/m;->p(Ly6/z;)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Li7/h;->f:Ly6/m;

    new-instance p2, Ly6/z$b;

    invoke-direct {p2, v3, v4}, Ly6/z$b;-><init>(J)V

    invoke-interface {p1, p2}, Ly6/m;->p(Ly6/z;)V

    :goto_1
    iput-boolean v1, p0, Li7/h;->l:Z

    return-void
.end method

.method private k(Ly6/l;)I
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v2, p0, Li7/h;->d:Lt8/e0;

    invoke-virtual {v2}, Lt8/e0;->e()[B

    move-result-object v2

    const/16 v3, 0xa

    invoke-interface {p1, v2, v0, v3}, Ly6/l;->q([BII)V

    iget-object v2, p0, Li7/h;->d:Lt8/e0;

    invoke-virtual {v2, v0}, Lt8/e0;->U(I)V

    iget-object v2, p0, Li7/h;->d:Lt8/e0;

    invoke-virtual {v2}, Lt8/e0;->K()I

    move-result v2

    const v3, 0x494433

    if-eq v2, v3, :cond_1

    invoke-interface {p1}, Ly6/l;->f()V

    invoke-interface {p1, v1}, Ly6/l;->k(I)V

    iget-wide v2, p0, Li7/h;->h:J

    const-wide/16 v4, -0x1

    cmp-long p1, v2, v4

    if-nez p1, :cond_0

    int-to-long v2, v1

    iput-wide v2, p0, Li7/h;->h:J

    :cond_0
    return v1

    :cond_1
    iget-object v2, p0, Li7/h;->d:Lt8/e0;

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Lt8/e0;->V(I)V

    iget-object v2, p0, Li7/h;->d:Lt8/e0;

    invoke-virtual {v2}, Lt8/e0;->G()I

    move-result v2

    add-int/lit8 v3, v2, 0xa

    add-int/2addr v1, v3

    invoke-interface {p1, v2}, Ly6/l;->k(I)V

    goto :goto_0
.end method


# virtual methods
.method public a(JJ)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Li7/h;->k:Z

    iget-object p1, p0, Li7/h;->b:Li7/i;

    invoke-virtual {p1}, Li7/i;->c()V

    iput-wide p3, p0, Li7/h;->g:J

    return-void
.end method

.method public b(Ly6/m;)V
    .locals 4

    iput-object p1, p0, Li7/h;->f:Ly6/m;

    iget-object v0, p0, Li7/h;->b:Li7/i;

    new-instance v1, Li7/i0$d;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Li7/i0$d;-><init>(II)V

    invoke-virtual {v0, p1, v1}, Li7/i;->d(Ly6/m;Li7/i0$d;)V

    invoke-interface {p1}, Ly6/m;->q()V

    return-void
.end method

.method public e(Ly6/l;)Z
    .locals 8

    invoke-direct {p0, p1}, Li7/h;->k(Ly6/l;)I

    move-result v0

    const/4 v1, 0x0

    move v3, v0

    move v2, v1

    move v4, v2

    :cond_0
    iget-object v5, p0, Li7/h;->d:Lt8/e0;

    invoke-virtual {v5}, Lt8/e0;->e()[B

    move-result-object v5

    const/4 v6, 0x2

    invoke-interface {p1, v5, v1, v6}, Ly6/l;->q([BII)V

    iget-object v5, p0, Li7/h;->d:Lt8/e0;

    invoke-virtual {v5, v1}, Lt8/e0;->U(I)V

    iget-object v5, p0, Li7/h;->d:Lt8/e0;

    invoke-virtual {v5}, Lt8/e0;->N()I

    move-result v5

    invoke-static {v5}, Li7/i;->m(I)Z

    move-result v5

    if-nez v5, :cond_1

    :goto_0
    add-int/lit8 v3, v3, 0x1

    invoke-interface {p1}, Ly6/l;->f()V

    invoke-interface {p1, v3}, Ly6/l;->k(I)V

    move v2, v1

    move v4, v2

    goto :goto_1

    :cond_1
    const/4 v5, 0x1

    add-int/2addr v2, v5

    const/4 v6, 0x4

    if-lt v2, v6, :cond_2

    const/16 v7, 0xbc

    if-le v4, v7, :cond_2

    return v5

    :cond_2
    iget-object v5, p0, Li7/h;->d:Lt8/e0;

    invoke-virtual {v5}, Lt8/e0;->e()[B

    move-result-object v5

    invoke-interface {p1, v5, v1, v6}, Ly6/l;->q([BII)V

    iget-object v5, p0, Li7/h;->e:Lt8/d0;

    const/16 v6, 0xe

    invoke-virtual {v5, v6}, Lt8/d0;->p(I)V

    iget-object v5, p0, Li7/h;->e:Lt8/d0;

    const/16 v6, 0xd

    invoke-virtual {v5, v6}, Lt8/d0;->h(I)I

    move-result v5

    const/4 v6, 0x6

    if-gt v5, v6, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v6, v5, -0x6

    invoke-interface {p1, v6}, Ly6/l;->k(I)V

    add-int/2addr v4, v5

    :goto_1
    sub-int v5, v3, v0

    const/16 v6, 0x2000

    if-lt v5, v6, :cond_0

    return v1
.end method

.method public f(Ly6/l;Ly6/y;)I
    .locals 7

    iget-object p2, p0, Li7/h;->f:Ly6/m;

    invoke-static {p2}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ly6/l;->getLength()J

    move-result-wide v0

    iget p2, p0, Li7/h;->a:I

    and-int/lit8 v2, p2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v2, :cond_1

    and-int/2addr p2, v3

    if-eqz p2, :cond_0

    const-wide/16 v5, -0x1

    cmp-long p2, v0, v5

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    move p2, v4

    goto :goto_1

    :cond_1
    :goto_0
    move p2, v3

    :goto_1
    if-eqz p2, :cond_2

    invoke-direct {p0, p1}, Li7/h;->d(Ly6/l;)V

    :cond_2
    iget-object p2, p0, Li7/h;->c:Lt8/e0;

    invoke-virtual {p2}, Lt8/e0;->e()[B

    move-result-object p2

    const/16 v2, 0x800

    invoke-interface {p1, p2, v4, v2}, Ly6/l;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_3

    move v2, v3

    goto :goto_2

    :cond_3
    move v2, v4

    :goto_2
    invoke-direct {p0, v0, v1, v2}, Li7/h;->j(JZ)V

    if-eqz v2, :cond_4

    return p2

    :cond_4
    iget-object p2, p0, Li7/h;->c:Lt8/e0;

    invoke-virtual {p2, v4}, Lt8/e0;->U(I)V

    iget-object p2, p0, Li7/h;->c:Lt8/e0;

    invoke-virtual {p2, p1}, Lt8/e0;->T(I)V

    iget-boolean p1, p0, Li7/h;->k:Z

    if-nez p1, :cond_5

    iget-object p1, p0, Li7/h;->b:Li7/i;

    iget-wide v0, p0, Li7/h;->g:J

    const/4 p2, 0x4

    invoke-virtual {p1, v0, v1, p2}, Li7/i;->f(JI)V

    iput-boolean v3, p0, Li7/h;->k:Z

    :cond_5
    iget-object p1, p0, Li7/h;->b:Li7/i;

    iget-object p2, p0, Li7/h;->c:Lt8/e0;

    invoke-virtual {p1, p2}, Li7/i;->b(Lt8/e0;)V

    return v4
.end method

.method public release()V
    .locals 0

    return-void
.end method
