.class public final Ld7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/k;


# instance fields
.field private final a:Lt8/e0;

.field private b:Ly6/m;

.field private c:I

.field private d:I

.field private e:I

.field private f:J

.field private g:Lr7/b;

.field private h:Ly6/l;

.field private i:Ld7/c;

.field private j:Lg7/k;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lt8/e0;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lt8/e0;-><init>(I)V

    iput-object v0, p0, Ld7/a;->a:Lt8/e0;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Ld7/a;->f:J

    return-void
.end method

.method private c(Ly6/l;)V
    .locals 3

    iget-object v0, p0, Ld7/a;->a:Lt8/e0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lt8/e0;->Q(I)V

    iget-object v0, p0, Ld7/a;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Ly6/l;->q([BII)V

    iget-object v0, p0, Ld7/a;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->N()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-interface {p1, v0}, Ly6/l;->k(I)V

    return-void
.end method

.method private d()V
    .locals 4

    const/4 v0, 0x0

    new-array v0, v0, [Ll7/a$b;

    invoke-direct {p0, v0}, Ld7/a;->h([Ll7/a$b;)V

    iget-object v0, p0, Ld7/a;->b:Ly6/m;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly6/m;

    invoke-interface {v0}, Ly6/m;->q()V

    iget-object v0, p0, Ld7/a;->b:Ly6/m;

    new-instance v1, Ly6/z$b;

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {v1, v2, v3}, Ly6/z$b;-><init>(J)V

    invoke-interface {v0, v1}, Ly6/m;->p(Ly6/z;)V

    const/4 v0, 0x6

    iput v0, p0, Ld7/a;->c:I

    return-void
.end method

.method private static g(Ljava/lang/String;J)Lr7/b;
    .locals 2

    const-wide/16 v0, -0x1

    cmp-long v0, p1, v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {p0}, Ld7/e;->a(Ljava/lang/String;)Ld7/b;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v1

    :cond_1
    invoke-virtual {p0, p1, p2}, Ld7/b;->a(J)Lr7/b;

    move-result-object p0

    return-object p0
.end method

.method private varargs h([Ll7/a$b;)V
    .locals 3

    iget-object v0, p0, Ld7/a;->b:Ly6/m;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly6/m;

    const/16 v1, 0x400

    const/4 v2, 0x4

    invoke-interface {v0, v1, v2}, Ly6/m;->d(II)Ly6/b0;

    move-result-object v0

    new-instance v1, Lt6/u1$b;

    invoke-direct {v1}, Lt6/u1$b;-><init>()V

    const-string v2, "image/jpeg"

    invoke-virtual {v1, v2}, Lt6/u1$b;->M(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v1

    new-instance v2, Ll7/a;

    invoke-direct {v2, p1}, Ll7/a;-><init>([Ll7/a$b;)V

    invoke-virtual {v1, v2}, Lt6/u1$b;->Z(Ll7/a;)Lt6/u1$b;

    move-result-object p1

    invoke-virtual {p1}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object p1

    invoke-interface {v0, p1}, Ly6/b0;->c(Lt6/u1;)V

    return-void
.end method

.method private i(Ly6/l;)I
    .locals 3

    iget-object v0, p0, Ld7/a;->a:Lt8/e0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lt8/e0;->Q(I)V

    iget-object v0, p0, Ld7/a;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Ly6/l;->q([BII)V

    iget-object p1, p0, Ld7/a;->a:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->N()I

    move-result p1

    return p1
.end method

.method private j(Ly6/l;)V
    .locals 4

    iget-object v0, p0, Ld7/a;->a:Lt8/e0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lt8/e0;->Q(I)V

    iget-object v0, p0, Ld7/a;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Ly6/l;->readFully([BII)V

    iget-object p1, p0, Ld7/a;->a:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->N()I

    move-result p1

    iput p1, p0, Ld7/a;->d:I

    const v0, 0xffda

    if-ne p1, v0, :cond_1

    iget-wide v0, p0, Ld7/a;->f:J

    const-wide/16 v2, -0x1

    cmp-long p1, v0, v2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    :goto_0
    iput p1, p0, Ld7/a;->c:I

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Ld7/a;->d()V

    goto :goto_1

    :cond_1
    const v0, 0xffd0

    if-lt p1, v0, :cond_2

    const v0, 0xffd9

    if-le p1, v0, :cond_3

    :cond_2
    const v0, 0xff01

    if-eq p1, v0, :cond_3

    const/4 p1, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method private k(Ly6/l;)V
    .locals 5

    iget v0, p0, Ld7/a;->d:I

    const v1, 0xffe1

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    new-instance v0, Lt8/e0;

    iget v1, p0, Ld7/a;->e:I

    invoke-direct {v0, v1}, Lt8/e0;-><init>(I)V

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v1

    iget v3, p0, Ld7/a;->e:I

    invoke-interface {p1, v1, v2, v3}, Ly6/l;->readFully([BII)V

    iget-object v1, p0, Ld7/a;->g:Lr7/b;

    if-nez v1, :cond_1

    const-string v1, "http://ns.adobe.com/xap/1.0/"

    invoke-virtual {v0}, Lt8/e0;->B()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lt8/e0;->B()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ly6/l;->getLength()J

    move-result-wide v3

    invoke-static {v0, v3, v4}, Ld7/a;->g(Ljava/lang/String;J)Lr7/b;

    move-result-object p1

    iput-object p1, p0, Ld7/a;->g:Lr7/b;

    if-eqz p1, :cond_1

    iget-wide v0, p1, Lr7/b;->d:J

    iput-wide v0, p0, Ld7/a;->f:J

    goto :goto_0

    :cond_0
    iget v0, p0, Ld7/a;->e:I

    invoke-interface {p1, v0}, Ly6/l;->n(I)V

    :cond_1
    :goto_0
    iput v2, p0, Ld7/a;->c:I

    return-void
.end method

.method private l(Ly6/l;)V
    .locals 3

    iget-object v0, p0, Ld7/a;->a:Lt8/e0;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lt8/e0;->Q(I)V

    iget-object v0, p0, Ld7/a;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Ly6/l;->readFully([BII)V

    iget-object p1, p0, Ld7/a;->a:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->N()I

    move-result p1

    sub-int/2addr p1, v1

    iput p1, p0, Ld7/a;->e:I

    iput v1, p0, Ld7/a;->c:I

    return-void
.end method

.method private m(Ly6/l;)V
    .locals 4

    iget-object v0, p0, Ld7/a;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-interface {p1, v0, v1, v2, v2}, Ly6/l;->d([BIIZ)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-direct {p0}, Ld7/a;->d()V

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Ly6/l;->f()V

    iget-object v0, p0, Ld7/a;->j:Lg7/k;

    if-nez v0, :cond_2

    new-instance v0, Lg7/k;

    invoke-direct {v0}, Lg7/k;-><init>()V

    iput-object v0, p0, Ld7/a;->j:Lg7/k;

    :cond_2
    new-instance v0, Ld7/c;

    iget-wide v1, p0, Ld7/a;->f:J

    invoke-direct {v0, p1, v1, v2}, Ld7/c;-><init>(Ly6/l;J)V

    iput-object v0, p0, Ld7/a;->i:Ld7/c;

    iget-object p1, p0, Ld7/a;->j:Lg7/k;

    invoke-virtual {p1, v0}, Lg7/k;->e(Ly6/l;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Ld7/a;->j:Lg7/k;

    new-instance v0, Ld7/d;

    iget-wide v1, p0, Ld7/a;->f:J

    iget-object v3, p0, Ld7/a;->b:Ly6/m;

    invoke-static {v3}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly6/m;

    invoke-direct {v0, v1, v2, v3}, Ld7/d;-><init>(JLy6/m;)V

    invoke-virtual {p1, v0}, Lg7/k;->b(Ly6/m;)V

    invoke-direct {p0}, Ld7/a;->n()V

    :goto_0
    return-void
.end method

.method private n()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ll7/a$b;

    iget-object v1, p0, Ld7/a;->g:Lr7/b;

    invoke-static {v1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll7/a$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-direct {p0, v0}, Ld7/a;->h([Ll7/a$b;)V

    const/4 v0, 0x5

    iput v0, p0, Ld7/a;->c:I

    return-void
.end method


# virtual methods
.method public a(JJ)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    iput p1, p0, Ld7/a;->c:I

    const/4 p1, 0x0

    iput-object p1, p0, Ld7/a;->j:Lg7/k;

    goto :goto_0

    :cond_0
    iget v0, p0, Ld7/a;->c:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Ld7/a;->j:Lg7/k;

    invoke-static {v0}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg7/k;

    invoke-virtual {v0, p1, p2, p3, p4}, Lg7/k;->a(JJ)V

    :cond_1
    :goto_0
    return-void
.end method

.method public b(Ly6/m;)V
    .locals 0

    iput-object p1, p0, Ld7/a;->b:Ly6/m;

    return-void
.end method

.method public e(Ly6/l;)Z
    .locals 5

    invoke-direct {p0, p1}, Ld7/a;->i(Ly6/l;)I

    move-result v0

    const v1, 0xffd8

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    invoke-direct {p0, p1}, Ld7/a;->i(Ly6/l;)I

    move-result v0

    iput v0, p0, Ld7/a;->d:I

    const v1, 0xffe0

    if-ne v0, v1, :cond_1

    invoke-direct {p0, p1}, Ld7/a;->c(Ly6/l;)V

    invoke-direct {p0, p1}, Ld7/a;->i(Ly6/l;)I

    move-result v0

    iput v0, p0, Ld7/a;->d:I

    :cond_1
    iget v0, p0, Ld7/a;->d:I

    const v1, 0xffe1

    if-eq v0, v1, :cond_2

    return v2

    :cond_2
    const/4 v0, 0x2

    invoke-interface {p1, v0}, Ly6/l;->k(I)V

    iget-object v0, p0, Ld7/a;->a:Lt8/e0;

    const/4 v1, 0x6

    invoke-virtual {v0, v1}, Lt8/e0;->Q(I)V

    iget-object v0, p0, Ld7/a;->a:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    invoke-interface {p1, v0, v2, v1}, Ly6/l;->q([BII)V

    iget-object p1, p0, Ld7/a;->a:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->J()J

    move-result-wide v0

    const-wide/32 v3, 0x45786966    # 5.758429993E-315

    cmp-long p1, v0, v3

    if-nez p1, :cond_3

    iget-object p1, p0, Ld7/a;->a:Lt8/e0;

    invoke-virtual {p1}, Lt8/e0;->N()I

    move-result p1

    if-nez p1, :cond_3

    const/4 v2, 0x1

    :cond_3
    return v2
.end method

.method public f(Ly6/l;Ly6/y;)I
    .locals 7

    iget v0, p0, Ld7/a;->c:I

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    const/4 v2, 0x1

    if-eq v0, v2, :cond_8

    const/4 v3, 0x2

    if-eq v0, v3, :cond_7

    const/4 v3, 0x4

    if-eq v0, v3, :cond_5

    const/4 v1, 0x5

    if-eq v0, v1, :cond_1

    const/4 p1, 0x6

    if-ne v0, p1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    throw p1

    :cond_1
    iget-object v0, p0, Ld7/a;->i:Ld7/c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ld7/a;->h:Ly6/l;

    if-eq p1, v0, :cond_3

    :cond_2
    iput-object p1, p0, Ld7/a;->h:Ly6/l;

    new-instance v0, Ld7/c;

    iget-wide v3, p0, Ld7/a;->f:J

    invoke-direct {v0, p1, v3, v4}, Ld7/c;-><init>(Ly6/l;J)V

    iput-object v0, p0, Ld7/a;->i:Ld7/c;

    :cond_3
    iget-object p1, p0, Ld7/a;->j:Lg7/k;

    invoke-static {p1}, Lt8/a;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg7/k;

    iget-object v0, p0, Ld7/a;->i:Ld7/c;

    invoke-virtual {p1, v0, p2}, Lg7/k;->f(Ly6/l;Ly6/y;)I

    move-result p1

    if-ne p1, v2, :cond_4

    iget-wide v0, p2, Ly6/y;->a:J

    iget-wide v2, p0, Ld7/a;->f:J

    add-long/2addr v0, v2

    iput-wide v0, p2, Ly6/y;->a:J

    :cond_4
    return p1

    :cond_5
    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v3

    iget-wide v5, p0, Ld7/a;->f:J

    cmp-long v0, v3, v5

    if-eqz v0, :cond_6

    iput-wide v5, p2, Ly6/y;->a:J

    return v2

    :cond_6
    invoke-direct {p0, p1}, Ld7/a;->m(Ly6/l;)V

    return v1

    :cond_7
    invoke-direct {p0, p1}, Ld7/a;->k(Ly6/l;)V

    return v1

    :cond_8
    invoke-direct {p0, p1}, Ld7/a;->l(Ly6/l;)V

    return v1

    :cond_9
    invoke-direct {p0, p1}, Ld7/a;->j(Ly6/l;)V

    return v1
.end method

.method public release()V
    .locals 1

    iget-object v0, p0, Ld7/a;->j:Lg7/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lg7/k;->release()V

    :cond_0
    return-void
.end method
