.class public final Lb7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/k;


# static fields
.field public static final o:Ly6/p;


# instance fields
.field private final a:[B

.field private final b:Lt8/e0;

.field private final c:Z

.field private final d:Ly6/q$a;

.field private e:Ly6/m;

.field private f:Ly6/b0;

.field private g:I

.field private h:Ll7/a;

.field private i:Ly6/t;

.field private j:I

.field private k:I

.field private l:Lb7/b;

.field private m:I

.field private n:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb7/c;

    invoke-direct {v0}, Lb7/c;-><init>()V

    sput-object v0, Lb7/d;->o:Ly6/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lb7/d;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x2a

    new-array v0, v0, [B

    iput-object v0, p0, Lb7/d;->a:[B

    new-instance v0, Lt8/e0;

    const v1, 0x8000

    new-array v1, v1, [B

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lt8/e0;-><init>([BI)V

    iput-object v0, p0, Lb7/d;->b:Lt8/e0;

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    iput-boolean v0, p0, Lb7/d;->c:Z

    new-instance p1, Ly6/q$a;

    invoke-direct {p1}, Ly6/q$a;-><init>()V

    iput-object p1, p0, Lb7/d;->d:Ly6/q$a;

    iput v2, p0, Lb7/d;->g:I

    return-void
.end method

.method public static synthetic c()[Ly6/k;
    .locals 1

    invoke-static {}, Lb7/d;->j()[Ly6/k;

    move-result-object v0

    return-object v0
.end method

.method private d(Lt8/e0;Z)J
    .locals 4

    iget-object v0, p0, Lb7/d;->i:Ly6/t;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lt8/e0;->f()I

    move-result v0

    :goto_0
    invoke-virtual {p1}, Lt8/e0;->g()I

    move-result v1

    add-int/lit8 v1, v1, -0x10

    if-gt v0, v1, :cond_1

    invoke-virtual {p1, v0}, Lt8/e0;->U(I)V

    iget-object v1, p0, Lb7/d;->i:Ly6/t;

    iget v2, p0, Lb7/d;->k:I

    iget-object v3, p0, Lb7/d;->d:Ly6/q$a;

    invoke-static {p1, v1, v2, v3}, Ly6/q;->d(Lt8/e0;Ly6/t;ILy6/q$a;)Z

    move-result v1

    if-eqz v1, :cond_0

    :goto_1
    invoke-virtual {p1, v0}, Lt8/e0;->U(I)V

    iget-object p1, p0, Lb7/d;->d:Ly6/q$a;

    iget-wide p1, p1, Ly6/q$a;->a:J

    return-wide p1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_5

    :goto_2
    invoke-virtual {p1}, Lt8/e0;->g()I

    move-result p2

    iget v1, p0, Lb7/d;->j:I

    sub-int/2addr p2, v1

    if-gt v0, p2, :cond_4

    invoke-virtual {p1, v0}, Lt8/e0;->U(I)V

    const/4 p2, 0x0

    :try_start_0
    iget-object v1, p0, Lb7/d;->i:Ly6/t;

    iget v2, p0, Lb7/d;->k:I

    iget-object v3, p0, Lb7/d;->d:Ly6/q$a;

    invoke-static {p1, v1, v2, v3}, Ly6/q;->d(Lt8/e0;Ly6/t;ILy6/q$a;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move v1, p2

    :goto_3
    invoke-virtual {p1}, Lt8/e0;->f()I

    move-result v2

    invoke-virtual {p1}, Lt8/e0;->g()I

    move-result v3

    if-le v2, v3, :cond_2

    goto :goto_4

    :cond_2
    move p2, v1

    :goto_4
    if-eqz p2, :cond_3

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Lt8/e0;->g()I

    move-result p2

    invoke-virtual {p1, p2}, Lt8/e0;->U(I)V

    goto :goto_5

    :cond_5
    invoke-virtual {p1, v0}, Lt8/e0;->U(I)V

    :goto_5
    const-wide/16 p1, -0x1

    return-wide p1
.end method

.method private g(Ly6/l;)V
    .locals 5

    invoke-static {p1}, Ly6/r;->b(Ly6/l;)I

    move-result v0

    iput v0, p0, Lb7/d;->k:I

    iget-object v0, p0, Lb7/d;->e:Ly6/m;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly6/m;

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v1

    invoke-interface {p1}, Ly6/l;->getLength()J

    move-result-wide v3

    invoke-direct {p0, v1, v2, v3, v4}, Lb7/d;->h(JJ)Ly6/z;

    move-result-object p1

    invoke-interface {v0, p1}, Ly6/m;->p(Ly6/z;)V

    const/4 p1, 0x5

    iput p1, p0, Lb7/d;->g:I

    return-void
.end method

.method private h(JJ)Ly6/z;
    .locals 8

    iget-object v0, p0, Lb7/d;->i:Ly6/t;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lb7/d;->i:Ly6/t;

    iget-object v0, v2, Ly6/t;->k:Ly6/t$a;

    if-eqz v0, :cond_0

    new-instance p3, Ly6/s;

    invoke-direct {p3, v2, p1, p2}, Ly6/s;-><init>(Ly6/t;J)V

    return-object p3

    :cond_0
    const-wide/16 v0, -0x1

    cmp-long v0, p3, v0

    if-eqz v0, :cond_1

    iget-wide v0, v2, Ly6/t;->j:J

    const-wide/16 v3, 0x0

    cmp-long v0, v0, v3

    if-lez v0, :cond_1

    new-instance v0, Lb7/b;

    iget v3, p0, Lb7/d;->k:I

    move-object v1, v0

    move-wide v4, p1

    move-wide v6, p3

    invoke-direct/range {v1 .. v7}, Lb7/b;-><init>(Ly6/t;IJJ)V

    iput-object v0, p0, Lb7/d;->l:Lb7/b;

    invoke-virtual {v0}, Ly6/a;->b()Ly6/z;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Ly6/z$b;

    invoke-virtual {v2}, Ly6/t;->f()J

    move-result-wide p2

    invoke-direct {p1, p2, p3}, Ly6/z$b;-><init>(J)V

    return-object p1
.end method

.method private i(Ly6/l;)V
    .locals 3

    iget-object v0, p0, Lb7/d;->a:[B

    const/4 v1, 0x0

    array-length v2, v0

    invoke-interface {p1, v0, v1, v2}, Ly6/l;->q([BII)V

    invoke-interface {p1}, Ly6/l;->f()V

    const/4 p1, 0x2

    iput p1, p0, Lb7/d;->g:I

    return-void
.end method

.method private static synthetic j()[Ly6/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ly6/k;

    new-instance v1, Lb7/d;

    invoke-direct {v1}, Lb7/d;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private k()V
    .locals 11

    iget-wide v0, p0, Lb7/d;->n:J

    const-wide/32 v2, 0xf4240

    mul-long/2addr v0, v2

    iget-object v2, p0, Lb7/d;->i:Ly6/t;

    invoke-static {v2}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly6/t;

    iget v2, v2, Ly6/t;->e:I

    int-to-long v2, v2

    div-long v5, v0, v2

    iget-object v0, p0, Lb7/d;->f:Ly6/b0;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ly6/b0;

    const/4 v7, 0x1

    iget v8, p0, Lb7/d;->m:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Ly6/b0;->b(JIIILy6/b0$a;)V

    return-void
.end method

.method private l(Ly6/l;Ly6/y;)I
    .locals 6

    iget-object v0, p0, Lb7/d;->f:Ly6/b0;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lb7/d;->i:Ly6/t;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lb7/d;->l:Lb7/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ly6/a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lb7/d;->l:Lb7/b;

    invoke-virtual {v0, p1, p2}, Ly6/a;->c(Ly6/l;Ly6/y;)I

    move-result p1

    return p1

    :cond_0
    iget-wide v0, p0, Lb7/d;->n:J

    const-wide/16 v2, -0x1

    cmp-long p2, v0, v2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    iget-object p2, p0, Lb7/d;->i:Ly6/t;

    invoke-static {p1, p2}, Ly6/q;->i(Ly6/l;Ly6/t;)J

    move-result-wide p1

    iput-wide p1, p0, Lb7/d;->n:J

    return v0

    :cond_1
    iget-object p2, p0, Lb7/d;->b:Lt8/e0;

    invoke-virtual {p2}, Lt8/e0;->g()I

    move-result p2

    const v1, 0x8000

    if-ge p2, v1, :cond_4

    iget-object v4, p0, Lb7/d;->b:Lt8/e0;

    invoke-virtual {v4}, Lt8/e0;->e()[B

    move-result-object v4

    sub-int/2addr v1, p2

    invoke-interface {p1, v4, p2, v1}, Ly6/l;->read([BII)I

    move-result p1

    const/4 v1, -0x1

    if-ne p1, v1, :cond_2

    const/4 v4, 0x1

    goto :goto_0

    :cond_2
    move v4, v0

    :goto_0
    if-nez v4, :cond_3

    iget-object v1, p0, Lb7/d;->b:Lt8/e0;

    add-int/2addr p2, p1

    invoke-virtual {v1, p2}, Lt8/e0;->T(I)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lb7/d;->b:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->a()I

    move-result p1

    if-nez p1, :cond_5

    invoke-direct {p0}, Lb7/d;->k()V

    return v1

    :cond_4
    move v4, v0

    :cond_5
    :goto_1
    iget-object p1, p0, Lb7/d;->b:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->f()I

    move-result p1

    iget p2, p0, Lb7/d;->m:I

    iget v1, p0, Lb7/d;->j:I

    if-ge p2, v1, :cond_6

    iget-object v5, p0, Lb7/d;->b:Lt8/e0;

    sub-int/2addr v1, p2

    invoke-virtual {v5}, Lt8/e0;->a()I

    move-result p2

    invoke-static {v1, p2}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-virtual {v5, p2}, Lt8/e0;->V(I)V

    :cond_6
    iget-object p2, p0, Lb7/d;->b:Lt8/e0;

    invoke-direct {p0, p2, v4}, Lb7/d;->d(Lt8/e0;Z)J

    move-result-wide v4

    iget-object p2, p0, Lb7/d;->b:Lt8/e0;

    invoke-virtual {p2}, Lt8/e0;->f()I

    move-result p2

    sub-int/2addr p2, p1

    iget-object v1, p0, Lb7/d;->b:Lt8/e0;

    invoke-virtual {v1, p1}, Lt8/e0;->U(I)V

    iget-object p1, p0, Lb7/d;->f:Ly6/b0;

    iget-object v1, p0, Lb7/d;->b:Lt8/e0;

    invoke-interface {p1, v1, p2}, Ly6/b0;->a(Lt8/e0;I)V

    iget p1, p0, Lb7/d;->m:I

    add-int/2addr p1, p2

    iput p1, p0, Lb7/d;->m:I

    cmp-long p1, v4, v2

    if-eqz p1, :cond_7

    invoke-direct {p0}, Lb7/d;->k()V

    iput v0, p0, Lb7/d;->m:I

    iput-wide v4, p0, Lb7/d;->n:J

    :cond_7
    iget-object p1, p0, Lb7/d;->b:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->a()I

    move-result p1

    const/16 p2, 0x10

    if-ge p1, p2, :cond_8

    iget-object p1, p0, Lb7/d;->b:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->a()I

    move-result p1

    iget-object p2, p0, Lb7/d;->b:Lt8/e0;

    invoke-virtual {p2}, Lt8/e0;->e()[B

    move-result-object p2

    iget-object v1, p0, Lb7/d;->b:Lt8/e0;

    invoke-virtual {v1}, Lt8/e0;->f()I

    move-result v1

    iget-object v2, p0, Lb7/d;->b:Lt8/e0;

    invoke-virtual {v2}, Lt8/e0;->e()[B

    move-result-object v2

    invoke-static {p2, v1, v2, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget-object p2, p0, Lb7/d;->b:Lt8/e0;

    invoke-virtual {p2, v0}, Lt8/e0;->U(I)V

    iget-object p2, p0, Lb7/d;->b:Lt8/e0;

    invoke-virtual {p2, p1}, Lt8/e0;->T(I)V

    :cond_8
    return v0
.end method

.method private m(Ly6/l;)V
    .locals 2

    iget-boolean v0, p0, Lb7/d;->c:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {p1, v0}, Ly6/r;->d(Ly6/l;Z)Ll7/a;

    move-result-object p1

    iput-object p1, p0, Lb7/d;->h:Ll7/a;

    iput v1, p0, Lb7/d;->g:I

    return-void
.end method

.method private n(Ly6/l;)V
    .locals 3

    new-instance v0, Ly6/r$a;

    iget-object v1, p0, Lb7/d;->i:Ly6/t;

    invoke-direct {v0, v1}, Ly6/r$a;-><init>(Ly6/t;)V

    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_0

    invoke-static {p1, v0}, Ly6/r;->e(Ly6/l;Ly6/r$a;)Z

    move-result v1

    iget-object v2, v0, Ly6/r$a;->a:Ly6/t;

    invoke-static {v2}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly6/t;

    iput-object v2, p0, Lb7/d;->i:Ly6/t;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lb7/d;->i:Ly6/t;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lb7/d;->i:Ly6/t;

    iget p1, p1, Ly6/t;->c:I

    const/4 v0, 0x6

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iput p1, p0, Lb7/d;->j:I

    iget-object p1, p0, Lb7/d;->f:Ly6/b0;

    invoke-static {p1}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly6/b0;

    iget-object v0, p0, Lb7/d;->i:Ly6/t;

    iget-object v1, p0, Lb7/d;->a:[B

    iget-object v2, p0, Lb7/d;->h:Ll7/a;

    invoke-virtual {v0, v1, v2}, Ly6/t;->g([BLl7/a;)Lt6/u1;

    move-result-object v0

    invoke-interface {p1, v0}, Ly6/b0;->c(Lt6/u1;)V

    const/4 p1, 0x4

    iput p1, p0, Lb7/d;->g:I

    return-void
.end method

.method private o(Ly6/l;)V
    .locals 0

    invoke-static {p1}, Ly6/r;->i(Ly6/l;)V

    const/4 p1, 0x3

    iput p1, p0, Lb7/d;->g:I

    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    const/4 p2, 0x0

    if-nez p1, :cond_0

    iput p2, p0, Lb7/d;->g:I

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lb7/d;->l:Lb7/b;

    if-eqz p1, :cond_1

    invoke-virtual {p1, p3, p4}, Ly6/a;->h(J)V

    :cond_1
    :goto_0
    cmp-long p1, p3, v0

    if-nez p1, :cond_2

    goto :goto_1

    :cond_2
    const-wide/16 v0, -0x1

    :goto_1
    iput-wide v0, p0, Lb7/d;->n:J

    iput p2, p0, Lb7/d;->m:I

    iget-object p1, p0, Lb7/d;->b:Lt8/e0;

    invoke-virtual {p1, p2}, Lt8/e0;->Q(I)V

    return-void
.end method

.method public b(Ly6/m;)V
    .locals 2

    iput-object p1, p0, Lb7/d;->e:Ly6/m;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Ly6/m;->d(II)Ly6/b0;

    move-result-object v0

    iput-object v0, p0, Lb7/d;->f:Ly6/b0;

    invoke-interface {p1}, Ly6/m;->q()V

    return-void
.end method

.method public e(Ly6/l;)Z
    .locals 1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ly6/r;->c(Ly6/l;Z)Ll7/a;

    invoke-static {p1}, Ly6/r;->a(Ly6/l;)Z

    move-result p1

    return p1
.end method

.method public f(Ly6/l;Ly6/y;)I
    .locals 3

    iget v0, p0, Lb7/d;->g:I

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    const/4 v2, 0x1

    if-eq v0, v2, :cond_4

    const/4 v2, 0x2

    if-eq v0, v2, :cond_3

    const/4 v2, 0x3

    if-eq v0, v2, :cond_2

    const/4 v2, 0x4

    if-eq v0, v2, :cond_1

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    invoke-direct {p0, p1, p2}, Lb7/d;->l(Ly6/l;Ly6/y;)I

    move-result p1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    invoke-direct {p0, p1}, Lb7/d;->g(Ly6/l;)V

    return v1

    :cond_2
    invoke-direct {p0, p1}, Lb7/d;->n(Ly6/l;)V

    return v1

    :cond_3
    invoke-direct {p0, p1}, Lb7/d;->o(Ly6/l;)V

    return v1

    :cond_4
    invoke-direct {p0, p1}, Lb7/d;->i(Ly6/l;)V

    return v1

    :cond_5
    invoke-direct {p0, p1}, Lb7/d;->m(Ly6/l;)V

    return v1
.end method

.method public release()V
    .locals 0

    return-void
.end method
