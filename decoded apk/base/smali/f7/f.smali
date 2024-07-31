.class public final Lf7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly6/k;


# static fields
.field public static final u:Ly6/p;

.field private static final v:Lq7/h$a;


# instance fields
.field private final a:I

.field private final b:J

.field private final c:Lt8/e0;

.field private final d:Lv6/s0$a;

.field private final e:Ly6/v;

.field private final f:Ly6/w;

.field private final g:Ly6/b0;

.field private h:Ly6/m;

.field private i:Ly6/b0;

.field private j:Ly6/b0;

.field private k:I

.field private l:Ll7/a;

.field private m:J

.field private n:J

.field private o:J

.field private p:I

.field private q:Lf7/g;

.field private r:Z

.field private s:Z

.field private t:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf7/d;

    invoke-direct {v0}, Lf7/d;-><init>()V

    sput-object v0, Lf7/f;->u:Ly6/p;

    new-instance v0, Lf7/e;

    invoke-direct {v0}, Lf7/e;-><init>()V

    sput-object v0, Lf7/f;->v:Lq7/h$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lf7/f;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    invoke-direct {p0, p1, v0, v1}, Lf7/f;-><init>(IJ)V

    return-void
.end method

.method public constructor <init>(IJ)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 p1, p1, 0x1

    :cond_0
    iput p1, p0, Lf7/f;->a:I

    iput-wide p2, p0, Lf7/f;->b:J

    new-instance p1, Lt8/e0;

    const/16 p2, 0xa

    invoke-direct {p1, p2}, Lt8/e0;-><init>(I)V

    iput-object p1, p0, Lf7/f;->c:Lt8/e0;

    new-instance p1, Lv6/s0$a;

    invoke-direct {p1}, Lv6/s0$a;-><init>()V

    iput-object p1, p0, Lf7/f;->d:Lv6/s0$a;

    new-instance p1, Ly6/v;

    invoke-direct {p1}, Ly6/v;-><init>()V

    iput-object p1, p0, Lf7/f;->e:Ly6/v;

    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide p1, p0, Lf7/f;->m:J

    new-instance p1, Ly6/w;

    invoke-direct {p1}, Ly6/w;-><init>()V

    iput-object p1, p0, Lf7/f;->f:Ly6/w;

    new-instance p1, Ly6/j;

    invoke-direct {p1}, Ly6/j;-><init>()V

    iput-object p1, p0, Lf7/f;->g:Ly6/b0;

    iput-object p1, p0, Lf7/f;->j:Ly6/b0;

    return-void
.end method

.method public static synthetic c()[Ly6/k;
    .locals 1

    invoke-static {}, Lf7/f;->o()[Ly6/k;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(IIIII)Z
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lf7/f;->p(IIIII)Z

    move-result p0

    return p0
.end method

.method private g()V
    .locals 1

    iget-object v0, p0, Lf7/f;->i:Ly6/b0;

    invoke-static {v0}, Lt8/a;->i(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lf7/f;->h:Ly6/m;

    invoke-static {v0}, Lt8/r0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private h(Ly6/l;)Lf7/g;
    .locals 11

    invoke-direct {p0, p1}, Lf7/f;->r(Ly6/l;)Lf7/g;

    move-result-object v0

    iget-object v1, p0, Lf7/f;->l:Ll7/a;

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v2

    invoke-static {v1, v2, v3}, Lf7/f;->q(Ll7/a;J)Lf7/c;

    move-result-object v1

    iget-boolean v2, p0, Lf7/f;->r:Z

    if-eqz v2, :cond_0

    new-instance p1, Lf7/g$a;

    invoke-direct {p1}, Lf7/g$a;-><init>()V

    return-object p1

    :cond_0
    iget v2, p0, Lf7/f;->a:I

    and-int/lit8 v2, v2, 0x4

    if-eqz v2, :cond_3

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ly6/z;->i()J

    move-result-wide v2

    invoke-interface {v1}, Lf7/g;->g()J

    move-result-wide v0

    :goto_0
    move-wide v9, v0

    move-wide v5, v2

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_2

    invoke-interface {v0}, Ly6/z;->i()J

    move-result-wide v2

    invoke-interface {v0}, Lf7/g;->g()J

    move-result-wide v0

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lf7/f;->l:Ll7/a;

    invoke-static {v0}, Lf7/f;->l(Ll7/a;)J

    move-result-wide v2

    const-wide/16 v0, -0x1

    goto :goto_0

    :goto_1
    new-instance v0, Lf7/b;

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v7

    move-object v4, v0

    invoke-direct/range {v4 .. v10}, Lf7/b;-><init>(JJJ)V

    goto :goto_2

    :cond_3
    if-eqz v1, :cond_4

    move-object v0, v1

    goto :goto_2

    :cond_4
    if-eqz v0, :cond_5

    goto :goto_2

    :cond_5
    const/4 v0, 0x0

    :goto_2
    const/4 v1, 0x1

    if-eqz v0, :cond_6

    invoke-interface {v0}, Ly6/z;->h()Z

    move-result v2

    if-nez v2, :cond_8

    iget v2, p0, Lf7/f;->a:I

    and-int/2addr v2, v1

    if-eqz v2, :cond_8

    :cond_6
    iget v0, p0, Lf7/f;->a:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_7

    goto :goto_3

    :cond_7
    const/4 v1, 0x0

    :goto_3
    invoke-direct {p0, p1, v1}, Lf7/f;->k(Ly6/l;Z)Lf7/g;

    move-result-object v0

    :cond_8
    return-object v0
.end method

.method private i(J)J
    .locals 4

    iget-wide v0, p0, Lf7/f;->m:J

    const-wide/32 v2, 0xf4240

    mul-long/2addr p1, v2

    iget-object v2, p0, Lf7/f;->d:Lv6/s0$a;

    iget v2, v2, Lv6/s0$a;->d:I

    int-to-long v2, v2

    div-long/2addr p1, v2

    add-long/2addr v0, p1

    return-wide v0
.end method

.method private k(Ly6/l;Z)Lf7/g;
    .locals 9

    iget-object v0, p0, Lf7/f;->c:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-interface {p1, v0, v2, v1}, Ly6/l;->q([BII)V

    iget-object v0, p0, Lf7/f;->c:Lt8/e0;

    invoke-virtual {v0, v2}, Lt8/e0;->U(I)V

    iget-object v0, p0, Lf7/f;->d:Lv6/s0$a;

    iget-object v1, p0, Lf7/f;->c:Lt8/e0;

    invoke-virtual {v1}, Lt8/e0;->q()I

    move-result v1

    invoke-virtual {v0, v1}, Lv6/s0$a;->a(I)Z

    new-instance v0, Lf7/a;

    invoke-interface {p1}, Ly6/l;->getLength()J

    move-result-wide v3

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v5

    iget-object v7, p0, Lf7/f;->d:Lv6/s0$a;

    move-object v2, v0

    move v8, p2

    invoke-direct/range {v2 .. v8}, Lf7/a;-><init>(JJLv6/s0$a;Z)V

    return-object v0
.end method

.method private static l(Ll7/a;)J
    .locals 6

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ll7/a;->e()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-virtual {p0, v2}, Ll7/a;->d(I)Ll7/a$b;

    move-result-object v3

    instance-of v4, v3, Lq7/m;

    if-eqz v4, :cond_0

    check-cast v3, Lq7/m;

    iget-object v4, v3, Lq7/i;->a:Ljava/lang/String;

    const-string v5, "TLEN"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    iget-object p0, v3, Lq7/m;->d:Lcom/google/common/collect/w;

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Lt8/r0;->C0(J)J

    move-result-wide v0

    return-wide v0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide v0
.end method

.method private static m(Lt8/e0;I)I
    .locals 2

    invoke-virtual {p0}, Lt8/e0;->g()I

    move-result v0

    add-int/lit8 v1, p1, 0x4

    if-lt v0, v1, :cond_1

    invoke-virtual {p0, p1}, Lt8/e0;->U(I)V

    invoke-virtual {p0}, Lt8/e0;->q()I

    move-result p1

    const v0, 0x58696e67

    if-eq p1, v0, :cond_0

    const v0, 0x496e666f

    if-ne p1, v0, :cond_1

    :cond_0
    return p1

    :cond_1
    invoke-virtual {p0}, Lt8/e0;->g()I

    move-result p1

    const/16 v0, 0x28

    if-lt p1, v0, :cond_2

    const/16 p1, 0x24

    invoke-virtual {p0, p1}, Lt8/e0;->U(I)V

    invoke-virtual {p0}, Lt8/e0;->q()I

    move-result p0

    const p1, 0x56425249

    if-ne p0, p1, :cond_2

    return p1

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private static n(IJ)Z
    .locals 4

    const v0, -0x1f400

    and-int/2addr p0, v0

    int-to-long v0, p0

    const-wide/32 v2, -0x1f400

    and-long p0, p1, v2

    cmp-long p0, v0, p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static synthetic o()[Ly6/k;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ly6/k;

    new-instance v1, Lf7/f;

    invoke-direct {v1}, Lf7/f;-><init>()V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method private static synthetic p(IIIII)Z
    .locals 3

    const/16 v0, 0x43

    const/4 v1, 0x2

    const/16 v2, 0x4d

    if-ne p1, v0, :cond_0

    const/16 v0, 0x4f

    if-ne p2, v0, :cond_0

    if-ne p3, v2, :cond_0

    if-eq p4, v2, :cond_1

    if-eq p0, v1, :cond_1

    :cond_0
    if-ne p1, v2, :cond_2

    const/16 p1, 0x4c

    if-ne p2, p1, :cond_2

    if-ne p3, p1, :cond_2

    const/16 p1, 0x54

    if-eq p4, p1, :cond_1

    if-ne p0, v1, :cond_2

    :cond_1
    const/4 p0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method private static q(Ll7/a;J)Lf7/c;
    .locals 4

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ll7/a;->e()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Ll7/a;->d(I)Ll7/a$b;

    move-result-object v2

    instance-of v3, v2, Lq7/k;

    if-eqz v3, :cond_0

    check-cast v2, Lq7/k;

    invoke-static {p0}, Lf7/f;->l(Ll7/a;)J

    move-result-wide v0

    invoke-static {p1, p2, v2, v0, v1}, Lf7/c;->a(JLq7/k;J)Lf7/c;

    move-result-object p0

    return-object p0

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method private r(Ly6/l;)Lf7/g;
    .locals 10

    new-instance v5, Lt8/e0;

    iget-object v0, p0, Lf7/f;->d:Lv6/s0$a;

    iget v0, v0, Lv6/s0$a;->c:I

    invoke-direct {v5, v0}, Lt8/e0;-><init>(I)V

    invoke-virtual {v5}, Lt8/e0;->e()[B

    move-result-object v0

    iget-object v1, p0, Lf7/f;->d:Lv6/s0$a;

    iget v1, v1, Lv6/s0$a;->c:I

    const/4 v6, 0x0

    invoke-interface {p1, v0, v6, v1}, Ly6/l;->q([BII)V

    iget-object v0, p0, Lf7/f;->d:Lv6/s0$a;

    iget v1, v0, Lv6/s0$a;->a:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    const/16 v3, 0x15

    iget v0, v0, Lv6/s0$a;->e:I

    if-eqz v1, :cond_0

    if-eq v0, v2, :cond_2

    const/16 v3, 0x24

    goto :goto_0

    :cond_0
    if-eq v0, v2, :cond_1

    goto :goto_0

    :cond_1
    const/16 v3, 0xd

    :cond_2
    :goto_0
    move v7, v3

    invoke-static {v5, v7}, Lf7/f;->m(Lt8/e0;I)I

    move-result v8

    const v0, 0x58696e67

    const v9, 0x496e666f

    if-eq v8, v0, :cond_5

    if-ne v8, v9, :cond_3

    goto :goto_1

    :cond_3
    const v0, 0x56425249

    if-ne v8, v0, :cond_4

    invoke-interface {p1}, Ly6/l;->getLength()J

    move-result-wide v0

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v2

    iget-object v4, p0, Lf7/f;->d:Lv6/s0$a;

    invoke-static/range {v0 .. v5}, Lf7/h;->a(JJLv6/s0$a;Lt8/e0;)Lf7/h;

    move-result-object v0

    iget-object v1, p0, Lf7/f;->d:Lv6/s0$a;

    iget v1, v1, Lv6/s0$a;->c:I

    invoke-interface {p1, v1}, Ly6/l;->n(I)V

    goto :goto_2

    :cond_4
    invoke-interface {p1}, Ly6/l;->f()V

    const/4 v0, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    invoke-interface {p1}, Ly6/l;->getLength()J

    move-result-wide v0

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v2

    iget-object v4, p0, Lf7/f;->d:Lv6/s0$a;

    invoke-static/range {v0 .. v5}, Lf7/i;->a(JJLv6/s0$a;Lt8/e0;)Lf7/i;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v1, p0, Lf7/f;->e:Ly6/v;

    invoke-virtual {v1}, Ly6/v;->a()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-interface {p1}, Ly6/l;->f()V

    add-int/lit16 v7, v7, 0x8d

    invoke-interface {p1, v7}, Ly6/l;->k(I)V

    iget-object v1, p0, Lf7/f;->c:Lt8/e0;

    invoke-virtual {v1}, Lt8/e0;->e()[B

    move-result-object v1

    const/4 v2, 0x3

    invoke-interface {p1, v1, v6, v2}, Ly6/l;->q([BII)V

    iget-object v1, p0, Lf7/f;->c:Lt8/e0;

    invoke-virtual {v1, v6}, Lt8/e0;->U(I)V

    iget-object v1, p0, Lf7/f;->e:Ly6/v;

    iget-object v2, p0, Lf7/f;->c:Lt8/e0;

    invoke-virtual {v2}, Lt8/e0;->K()I

    move-result v2

    invoke-virtual {v1, v2}, Ly6/v;->d(I)Z

    :cond_6
    iget-object v1, p0, Lf7/f;->d:Lv6/s0$a;

    iget v1, v1, Lv6/s0$a;->c:I

    invoke-interface {p1, v1}, Ly6/l;->n(I)V

    if-eqz v0, :cond_7

    invoke-interface {v0}, Ly6/z;->h()Z

    move-result v1

    if-nez v1, :cond_7

    if-ne v8, v9, :cond_7

    invoke-direct {p0, p1, v6}, Lf7/f;->k(Ly6/l;Z)Lf7/g;

    move-result-object p1

    return-object p1

    :cond_7
    :goto_2
    return-object v0
.end method

.method private s(Ly6/l;)Z
    .locals 8

    iget-object v0, p0, Lf7/f;->q:Lf7/g;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lf7/g;->g()J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ly6/l;->i()J

    move-result-wide v4

    const-wide/16 v6, 0x4

    sub-long/2addr v2, v6

    cmp-long v0, v4, v2

    if-lez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lf7/f;->c:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->e()[B

    move-result-object v0

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-interface {p1, v0, v2, v3, v1}, Ly6/l;->d([BIIZ)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    xor-int/2addr p1, v1

    return p1

    :catch_0
    return v1
.end method

.method private t(Ly6/l;)I
    .locals 5

    iget v0, p0, Lf7/f;->k:I

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0, p1, v0}, Lf7/f;->v(Ly6/l;Z)Z
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, -0x1

    return p1

    :cond_0
    :goto_0
    iget-object v0, p0, Lf7/f;->q:Lf7/g;

    if-nez v0, :cond_2

    invoke-direct {p0, p1}, Lf7/f;->h(Ly6/l;)Lf7/g;

    move-result-object v0

    iput-object v0, p0, Lf7/f;->q:Lf7/g;

    iget-object v1, p0, Lf7/f;->h:Ly6/m;

    invoke-interface {v1, v0}, Ly6/m;->p(Ly6/z;)V

    iget-object v0, p0, Lf7/f;->j:Ly6/b0;

    new-instance v1, Lt6/u1$b;

    invoke-direct {v1}, Lt6/u1$b;-><init>()V

    iget-object v2, p0, Lf7/f;->d:Lv6/s0$a;

    iget-object v2, v2, Lv6/s0$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lt6/u1$b;->g0(Ljava/lang/String;)Lt6/u1$b;

    move-result-object v1

    const/16 v2, 0x1000

    invoke-virtual {v1, v2}, Lt6/u1$b;->Y(I)Lt6/u1$b;

    move-result-object v1

    iget-object v2, p0, Lf7/f;->d:Lv6/s0$a;

    iget v2, v2, Lv6/s0$a;->e:I

    invoke-virtual {v1, v2}, Lt6/u1$b;->J(I)Lt6/u1$b;

    move-result-object v1

    iget-object v2, p0, Lf7/f;->d:Lv6/s0$a;

    iget v2, v2, Lv6/s0$a;->d:I

    invoke-virtual {v1, v2}, Lt6/u1$b;->h0(I)Lt6/u1$b;

    move-result-object v1

    iget-object v2, p0, Lf7/f;->e:Ly6/v;

    iget v2, v2, Ly6/v;->a:I

    invoke-virtual {v1, v2}, Lt6/u1$b;->P(I)Lt6/u1$b;

    move-result-object v1

    iget-object v2, p0, Lf7/f;->e:Ly6/v;

    iget v2, v2, Ly6/v;->b:I

    invoke-virtual {v1, v2}, Lt6/u1$b;->Q(I)Lt6/u1$b;

    move-result-object v1

    iget v2, p0, Lf7/f;->a:I

    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lf7/f;->l:Ll7/a;

    :goto_1
    invoke-virtual {v1, v2}, Lt6/u1$b;->Z(Ll7/a;)Lt6/u1$b;

    move-result-object v1

    invoke-virtual {v1}, Lt6/u1$b;->G()Lt6/u1;

    move-result-object v1

    invoke-interface {v0, v1}, Ly6/b0;->c(Lt6/u1;)V

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v0

    iput-wide v0, p0, Lf7/f;->o:J

    goto :goto_2

    :cond_2
    iget-wide v0, p0, Lf7/f;->o:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v0

    iget-wide v2, p0, Lf7/f;->o:J

    cmp-long v4, v0, v2

    if-gez v4, :cond_3

    sub-long/2addr v2, v0

    long-to-int v0, v2

    invoke-interface {p1, v0}, Ly6/l;->n(I)V

    :cond_3
    :goto_2
    invoke-direct {p0, p1}, Lf7/f;->u(Ly6/l;)I

    move-result p1

    return p1
.end method

.method private u(Ly6/l;)I
    .locals 11

    iget v0, p0, Lf7/f;->p:I

    const/4 v1, 0x1

    const/4 v2, -0x1

    const/4 v3, 0x0

    if-nez v0, :cond_4

    invoke-interface {p1}, Ly6/l;->f()V

    invoke-direct {p0, p1}, Lf7/f;->s(Ly6/l;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v2

    :cond_0
    iget-object v0, p0, Lf7/f;->c:Lt8/e0;

    invoke-virtual {v0, v3}, Lt8/e0;->U(I)V

    iget-object v0, p0, Lf7/f;->c:Lt8/e0;

    invoke-virtual {v0}, Lt8/e0;->q()I

    move-result v0

    iget v4, p0, Lf7/f;->k:I

    int-to-long v4, v4

    invoke-static {v0, v4, v5}, Lf7/f;->n(IJ)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v0}, Lv6/s0;->j(I)I

    move-result v4

    if-ne v4, v2, :cond_1

    goto :goto_0

    :cond_1
    iget-object v4, p0, Lf7/f;->d:Lv6/s0$a;

    invoke-virtual {v4, v0}, Lv6/s0$a;->a(I)Z

    iget-wide v4, p0, Lf7/f;->m:J

    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v4, v6

    if-nez v0, :cond_2

    iget-object v0, p0, Lf7/f;->q:Lf7/g;

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v4

    invoke-interface {v0, v4, v5}, Lf7/g;->c(J)J

    move-result-wide v4

    iput-wide v4, p0, Lf7/f;->m:J

    iget-wide v4, p0, Lf7/f;->b:J

    cmp-long v0, v4, v6

    if-eqz v0, :cond_2

    iget-object v0, p0, Lf7/f;->q:Lf7/g;

    const-wide/16 v4, 0x0

    invoke-interface {v0, v4, v5}, Lf7/g;->c(J)J

    move-result-wide v4

    iget-wide v6, p0, Lf7/f;->m:J

    iget-wide v8, p0, Lf7/f;->b:J

    sub-long/2addr v8, v4

    add-long/2addr v6, v8

    iput-wide v6, p0, Lf7/f;->m:J

    :cond_2
    iget-object v0, p0, Lf7/f;->d:Lv6/s0$a;

    iget v4, v0, Lv6/s0$a;->c:I

    iput v4, p0, Lf7/f;->p:I

    iget-object v4, p0, Lf7/f;->q:Lf7/g;

    instance-of v5, v4, Lf7/b;

    if-eqz v5, :cond_4

    check-cast v4, Lf7/b;

    iget-wide v5, p0, Lf7/f;->n:J

    iget v0, v0, Lv6/s0$a;->g:I

    int-to-long v7, v0

    add-long/2addr v5, v7

    invoke-direct {p0, v5, v6}, Lf7/f;->i(J)J

    move-result-wide v5

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v7

    iget-object v0, p0, Lf7/f;->d:Lv6/s0$a;

    iget v0, v0, Lv6/s0$a;->c:I

    int-to-long v9, v0

    add-long/2addr v7, v9

    invoke-virtual {v4, v5, v6, v7, v8}, Lf7/b;->b(JJ)V

    iget-boolean v0, p0, Lf7/f;->s:Z

    if-eqz v0, :cond_4

    iget-wide v5, p0, Lf7/f;->t:J

    invoke-virtual {v4, v5, v6}, Lf7/b;->a(J)Z

    move-result v0

    if-eqz v0, :cond_4

    iput-boolean v3, p0, Lf7/f;->s:Z

    iget-object v0, p0, Lf7/f;->i:Ly6/b0;

    iput-object v0, p0, Lf7/f;->j:Ly6/b0;

    goto :goto_1

    :cond_3
    :goto_0
    invoke-interface {p1, v1}, Ly6/l;->n(I)V

    iput v3, p0, Lf7/f;->k:I

    return v3

    :cond_4
    :goto_1
    iget-object v0, p0, Lf7/f;->j:Ly6/b0;

    iget v4, p0, Lf7/f;->p:I

    invoke-interface {v0, p1, v4, v1}, Ly6/b0;->f(Ls8/h;IZ)I

    move-result p1

    if-ne p1, v2, :cond_5

    return v2

    :cond_5
    iget v0, p0, Lf7/f;->p:I

    sub-int/2addr v0, p1

    iput v0, p0, Lf7/f;->p:I

    if-lez v0, :cond_6

    return v3

    :cond_6
    iget-object v4, p0, Lf7/f;->j:Ly6/b0;

    iget-wide v0, p0, Lf7/f;->n:J

    invoke-direct {p0, v0, v1}, Lf7/f;->i(J)J

    move-result-wide v5

    const/4 v7, 0x1

    iget-object p1, p0, Lf7/f;->d:Lv6/s0$a;

    iget v8, p1, Lv6/s0$a;->c:I

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-interface/range {v4 .. v10}, Ly6/b0;->b(JIIILy6/b0$a;)V

    iget-wide v0, p0, Lf7/f;->n:J

    iget-object p1, p0, Lf7/f;->d:Lv6/s0$a;

    iget p1, p1, Lv6/s0$a;->g:I

    int-to-long v4, p1

    add-long/2addr v0, v4

    iput-wide v0, p0, Lf7/f;->n:J

    iput v3, p0, Lf7/f;->p:I

    return v3
.end method

.method private v(Ly6/l;Z)Z
    .locals 11

    if-eqz p2, :cond_0

    const v0, 0x8000

    goto :goto_0

    :cond_0
    const/high16 v0, 0x20000

    :goto_0
    invoke-interface {p1}, Ly6/l;->f()V

    invoke-interface {p1}, Ly6/l;->getPosition()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez v1, :cond_5

    iget v1, p0, Lf7/f;->a:I

    and-int/lit8 v1, v1, 0x8

    if-nez v1, :cond_1

    move v1, v3

    goto :goto_1

    :cond_1
    move v1, v4

    :goto_1
    if-eqz v1, :cond_2

    move-object v1, v2

    goto :goto_2

    :cond_2
    sget-object v1, Lf7/f;->v:Lq7/h$a;

    :goto_2
    iget-object v5, p0, Lf7/f;->f:Ly6/w;

    invoke-virtual {v5, p1, v1}, Ly6/w;->a(Ly6/l;Lq7/h$a;)Ll7/a;

    move-result-object v1

    iput-object v1, p0, Lf7/f;->l:Ll7/a;

    if-eqz v1, :cond_3

    iget-object v5, p0, Lf7/f;->e:Ly6/v;

    invoke-virtual {v5, v1}, Ly6/v;->c(Ll7/a;)Z

    :cond_3
    invoke-interface {p1}, Ly6/l;->i()J

    move-result-wide v5

    long-to-int v1, v5

    if-nez p2, :cond_4

    invoke-interface {p1, v1}, Ly6/l;->n(I)V

    :cond_4
    move v5, v4

    goto :goto_3

    :cond_5
    move v1, v4

    move v5, v1

    :goto_3
    move v6, v5

    move v7, v6

    :goto_4
    invoke-direct {p0, p1}, Lf7/f;->s(Ly6/l;)Z

    move-result v8

    if-eqz v8, :cond_7

    if-lez v6, :cond_6

    goto :goto_6

    :cond_6
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_7
    iget-object v8, p0, Lf7/f;->c:Lt8/e0;

    invoke-virtual {v8, v4}, Lt8/e0;->U(I)V

    iget-object v8, p0, Lf7/f;->c:Lt8/e0;

    invoke-virtual {v8}, Lt8/e0;->q()I

    move-result v8

    if-eqz v5, :cond_8

    int-to-long v9, v5

    invoke-static {v8, v9, v10}, Lf7/f;->n(IJ)Z

    move-result v9

    if-eqz v9, :cond_9

    :cond_8
    invoke-static {v8}, Lv6/s0;->j(I)I

    move-result v9

    const/4 v10, -0x1

    if-ne v9, v10, :cond_d

    :cond_9
    add-int/lit8 v5, v7, 0x1

    if-ne v7, v0, :cond_b

    if-eqz p2, :cond_a

    return v4

    :cond_a
    const-string p1, "Searched too many bytes."

    invoke-static {p1, v2}, Lt6/b3;->a(Ljava/lang/String;Ljava/lang/Throwable;)Lt6/b3;

    move-result-object p1

    throw p1

    :cond_b
    if-eqz p2, :cond_c

    invoke-interface {p1}, Ly6/l;->f()V

    add-int v6, v1, v5

    invoke-interface {p1, v6}, Ly6/l;->k(I)V

    goto :goto_5

    :cond_c
    invoke-interface {p1, v3}, Ly6/l;->n(I)V

    :goto_5
    move v6, v4

    move v7, v5

    move v5, v6

    goto :goto_4

    :cond_d
    add-int/lit8 v6, v6, 0x1

    if-ne v6, v3, :cond_e

    iget-object v5, p0, Lf7/f;->d:Lv6/s0$a;

    invoke-virtual {v5, v8}, Lv6/s0$a;->a(I)Z

    move v5, v8

    goto :goto_8

    :cond_e
    const/4 v8, 0x4

    if-ne v6, v8, :cond_10

    :goto_6
    if-eqz p2, :cond_f

    add-int/2addr v1, v7

    invoke-interface {p1, v1}, Ly6/l;->n(I)V

    goto :goto_7

    :cond_f
    invoke-interface {p1}, Ly6/l;->f()V

    :goto_7
    iput v5, p0, Lf7/f;->k:I

    return v3

    :cond_10
    :goto_8
    add-int/lit8 v9, v9, -0x4

    invoke-interface {p1, v9}, Ly6/l;->k(I)V

    goto :goto_4
.end method


# virtual methods
.method public a(JJ)V
    .locals 2

    const/4 p1, 0x0

    iput p1, p0, Lf7/f;->k:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    iput-wide v0, p0, Lf7/f;->m:J

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lf7/f;->n:J

    iput p1, p0, Lf7/f;->p:I

    iput-wide p3, p0, Lf7/f;->t:J

    iget-object p1, p0, Lf7/f;->q:Lf7/g;

    instance-of p2, p1, Lf7/b;

    if-eqz p2, :cond_0

    check-cast p1, Lf7/b;

    invoke-virtual {p1, p3, p4}, Lf7/b;->a(J)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lf7/f;->s:Z

    iget-object p1, p0, Lf7/f;->g:Ly6/b0;

    iput-object p1, p0, Lf7/f;->j:Ly6/b0;

    :cond_0
    return-void
.end method

.method public b(Ly6/m;)V
    .locals 2

    iput-object p1, p0, Lf7/f;->h:Ly6/m;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-interface {p1, v0, v1}, Ly6/m;->d(II)Ly6/b0;

    move-result-object p1

    iput-object p1, p0, Lf7/f;->i:Ly6/b0;

    iput-object p1, p0, Lf7/f;->j:Ly6/b0;

    iget-object p1, p0, Lf7/f;->h:Ly6/m;

    invoke-interface {p1}, Ly6/m;->q()V

    return-void
.end method

.method public e(Ly6/l;)Z
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lf7/f;->v(Ly6/l;Z)Z

    move-result p1

    return p1
.end method

.method public f(Ly6/l;Ly6/y;)I
    .locals 4

    invoke-direct {p0}, Lf7/f;->g()V

    invoke-direct {p0, p1}, Lf7/f;->t(Ly6/l;)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    iget-object p2, p0, Lf7/f;->q:Lf7/g;

    instance-of p2, p2, Lf7/b;

    if-eqz p2, :cond_0

    iget-wide v0, p0, Lf7/f;->n:J

    invoke-direct {p0, v0, v1}, Lf7/f;->i(J)J

    move-result-wide v0

    iget-object p2, p0, Lf7/f;->q:Lf7/g;

    invoke-interface {p2}, Ly6/z;->i()J

    move-result-wide v2

    cmp-long p2, v2, v0

    if-eqz p2, :cond_0

    iget-object p2, p0, Lf7/f;->q:Lf7/g;

    check-cast p2, Lf7/b;

    invoke-virtual {p2, v0, v1}, Lf7/b;->e(J)V

    iget-object p2, p0, Lf7/f;->h:Ly6/m;

    iget-object v0, p0, Lf7/f;->q:Lf7/g;

    invoke-interface {p2, v0}, Ly6/m;->p(Ly6/z;)V

    :cond_0
    return p1
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lf7/f;->r:Z

    return-void
.end method

.method public release()V
    .locals 0

    return-void
.end method
