.class public Lzd/m3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final d:Lzd/c3;


# instance fields
.field private final a:Lzd/u2;

.field private final b:Lce/a;

.field private c:Ldj/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/j<",
            "Lzd/c3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lzd/c3;->d0()Lzd/c3;

    move-result-object v0

    sput-object v0, Lzd/m3;->d:Lzd/c3;

    return-void
.end method

.method constructor <init>(Lzd/u2;Lce/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ldj/j;->g()Ldj/j;

    move-result-object v0

    iput-object v0, p0, Lzd/m3;->c:Ldj/j;

    iput-object p1, p0, Lzd/m3;->a:Lzd/u2;

    iput-object p2, p0, Lzd/m3;->b:Lce/a;

    return-void
.end method

.method public static synthetic a(Lzd/m3;Lde/m;Lzd/c3;)Ldj/d;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/m3;->v(Lde/m;Lzd/c3;)Ldj/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lzd/m3;Lde/m;Lzd/b3;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/m3;->x(Lde/m;Lzd/b3;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Lzd/c3;Lde/m;Lzd/b3;)Lzd/c3;
    .locals 0

    invoke-static {p0, p1, p2}, Lzd/m3;->s(Lzd/c3;Lde/m;Lzd/b3;)Lzd/c3;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lzd/m3;Lzd/c3;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/m3;->t(Lzd/c3;)V

    return-void
.end method

.method public static synthetic e(Lzd/m3;Lde/m;Lzd/c3;)Lzd/b3;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/m3;->w(Lde/m;Lzd/c3;)Lzd/b3;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lzd/m3;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/m3;->q(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic g(Lzd/m3;Lzd/c3;)Ldj/d;
    .locals 0

    invoke-direct {p0, p1}, Lzd/m3;->u(Lzd/c3;)Ldj/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lzd/m3;Lzd/c3;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/m3;->n(Lzd/c3;)V

    return-void
.end method

.method public static synthetic i(Lzd/m3;Lde/m;Lzd/b3;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/m3;->r(Lde/m;Lzd/b3;)Z

    move-result p0

    return p0
.end method

.method private j()V
    .locals 1

    invoke-static {}, Ldj/j;->g()Ldj/j;

    move-result-object v0

    iput-object v0, p0, Lzd/m3;->c:Ldj/j;

    return-void
.end method

.method private k()Ldj/j;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/j<",
            "Lzd/c3;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzd/m3;->c:Ldj/j;

    iget-object v1, p0, Lzd/m3;->a:Lzd/u2;

    invoke-static {}, Lzd/c3;->j0()Lcom/google/protobuf/z0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lzd/u2;->e(Lcom/google/protobuf/z0;)Ldj/j;

    move-result-object v1

    new-instance v2, Lzd/e3;

    invoke-direct {v2, p0}, Lzd/e3;-><init>(Lzd/m3;)V

    invoke-virtual {v1, v2}, Ldj/j;->f(Ljj/d;)Ldj/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldj/j;->x(Ldj/n;)Ldj/j;

    move-result-object v0

    new-instance v1, Lzd/f3;

    invoke-direct {v1, p0}, Lzd/f3;-><init>(Lzd/m3;)V

    invoke-virtual {v0, v1}, Ldj/j;->e(Ljj/d;)Ldj/j;

    move-result-object v0

    return-object v0
.end method

.method private static m(Lzd/b3;)Lzd/b3;
    .locals 5

    invoke-static {p0}, Lzd/b3;->k0(Lzd/b3;)Lzd/b3$a;

    move-result-object v0

    invoke-virtual {v0}, Lzd/b3$a;->I()Lzd/b3$a;

    move-result-object v0

    invoke-virtual {p0}, Lzd/b3;->i0()J

    move-result-wide v1

    const-wide/16 v3, 0x1

    add-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Lzd/b3$a;->K(J)Lzd/b3$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object p0

    check-cast p0, Lzd/b3;

    return-object p0
.end method

.method private n(Lzd/c3;)V
    .locals 0

    invoke-static {p1}, Ldj/j;->n(Ljava/lang/Object;)Ldj/j;

    move-result-object p1

    iput-object p1, p0, Lzd/m3;->c:Ldj/j;

    return-void
.end method

.method private o(Lzd/b3;Lde/m;)Z
    .locals 4

    iget-object v0, p0, Lzd/m3;->b:Lce/a;

    invoke-interface {v0}, Lce/a;->a()J

    move-result-wide v0

    invoke-virtual {p1}, Lzd/b3;->h0()J

    move-result-wide v2

    sub-long/2addr v0, v2

    invoke-virtual {p2}, Lde/m;->d()J

    move-result-wide p1

    cmp-long p1, v0, p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private synthetic q(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Lzd/m3;->j()V

    return-void
.end method

.method private synthetic r(Lde/m;Lzd/b3;)Z
    .locals 0

    invoke-direct {p0, p2, p1}, Lzd/m3;->o(Lzd/b3;Lde/m;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private static synthetic s(Lzd/c3;Lde/m;Lzd/b3;)Lzd/c3;
    .locals 0

    invoke-static {p2}, Lzd/m3;->m(Lzd/b3;)Lzd/b3;

    move-result-object p2

    invoke-static {p0}, Lzd/c3;->i0(Lzd/c3;)Lzd/c3$a;

    move-result-object p0

    invoke-virtual {p1}, Lde/m;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lzd/c3$a;->I(Ljava/lang/String;Lzd/b3;)Lzd/c3$a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object p0

    check-cast p0, Lzd/c3;

    return-object p0
.end method

.method private synthetic t(Lzd/c3;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/m3;->n(Lzd/c3;)V

    return-void
.end method

.method private synthetic u(Lzd/c3;)Ldj/d;
    .locals 2

    iget-object v0, p0, Lzd/m3;->a:Lzd/u2;

    invoke-virtual {v0, p1}, Lzd/u2;->f(Lcom/google/protobuf/a;)Ldj/b;

    move-result-object v0

    new-instance v1, Lzd/l3;

    invoke-direct {v1, p0, p1}, Lzd/l3;-><init>(Lzd/m3;Lzd/c3;)V

    invoke-virtual {v0, v1}, Ldj/b;->g(Ljj/a;)Ldj/b;

    move-result-object p1

    return-object p1
.end method

.method private synthetic v(Lde/m;Lzd/c3;)Ldj/d;
    .locals 2

    invoke-virtual {p1}, Lde/m;->c()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lzd/m3;->y()Lzd/b3;

    move-result-object v1

    invoke-virtual {p2, v0, v1}, Lzd/c3;->e0(Ljava/lang/String;Lzd/b3;)Lzd/b3;

    move-result-object v0

    invoke-static {v0}, Ldj/o;->q(Ljava/lang/Object;)Ldj/o;

    move-result-object v0

    new-instance v1, Lzd/i3;

    invoke-direct {v1, p0, p1}, Lzd/i3;-><init>(Lzd/m3;Lde/m;)V

    invoke-virtual {v0, v1}, Ldj/o;->i(Ljj/g;)Ldj/o;

    move-result-object v0

    invoke-direct {p0}, Lzd/m3;->y()Lzd/b3;

    move-result-object v1

    invoke-static {v1}, Ldj/o;->q(Ljava/lang/Object;)Ldj/o;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldj/o;->t(Ldj/p;)Ldj/o;

    move-result-object v0

    new-instance v1, Lzd/j3;

    invoke-direct {v1, p2, p1}, Lzd/j3;-><init>(Lzd/c3;Lde/m;)V

    invoke-virtual {v0, v1}, Ldj/o;->r(Ljj/e;)Ldj/o;

    move-result-object p1

    new-instance p2, Lzd/k3;

    invoke-direct {p2, p0}, Lzd/k3;-><init>(Lzd/m3;)V

    invoke-virtual {p1, p2}, Ldj/o;->n(Ljj/e;)Ldj/b;

    move-result-object p1

    return-object p1
.end method

.method private synthetic w(Lde/m;Lzd/c3;)Lzd/b3;
    .locals 1

    invoke-virtual {p1}, Lde/m;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lzd/m3;->y()Lzd/b3;

    move-result-object v0

    invoke-virtual {p2, p1, v0}, Lzd/c3;->e0(Ljava/lang/String;Lzd/b3;)Lzd/b3;

    move-result-object p1

    return-object p1
.end method

.method private synthetic x(Lde/m;Lzd/b3;)Z
    .locals 2

    invoke-direct {p0, p2, p1}, Lzd/m3;->o(Lzd/b3;Lde/m;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p2}, Lzd/b3;->i0()J

    move-result-wide v0

    invoke-virtual {p1}, Lde/m;->b()J

    move-result-wide p1

    cmp-long p1, v0, p1

    if-gez p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method private y()Lzd/b3;
    .locals 3

    invoke-static {}, Lzd/b3;->j0()Lzd/b3$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lzd/b3$a;->K(J)Lzd/b3$a;

    move-result-object v0

    iget-object v1, p0, Lzd/m3;->b:Lce/a;

    invoke-interface {v1}, Lce/a;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lzd/b3$a;->J(J)Lzd/b3$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object v0

    check-cast v0, Lzd/b3;

    return-object v0
.end method


# virtual methods
.method public l(Lde/m;)Ldj/b;
    .locals 2

    invoke-direct {p0}, Lzd/m3;->k()Ldj/j;

    move-result-object v0

    sget-object v1, Lzd/m3;->d:Lzd/c3;

    invoke-virtual {v0, v1}, Ldj/j;->c(Ljava/lang/Object;)Ldj/j;

    move-result-object v0

    new-instance v1, Lzd/d3;

    invoke-direct {v1, p0, p1}, Lzd/d3;-><init>(Lzd/m3;Lde/m;)V

    invoke-virtual {v0, v1}, Ldj/j;->j(Ljj/e;)Ldj/b;

    move-result-object p1

    return-object p1
.end method

.method public p(Lde/m;)Ldj/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde/m;",
            ")",
            "Ldj/s<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lzd/m3;->k()Ldj/j;

    move-result-object v0

    invoke-static {}, Lzd/c3;->d0()Lzd/c3;

    move-result-object v1

    invoke-static {v1}, Ldj/j;->n(Ljava/lang/Object;)Ldj/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldj/j;->x(Ldj/n;)Ldj/j;

    move-result-object v0

    new-instance v1, Lzd/g3;

    invoke-direct {v1, p0, p1}, Lzd/g3;-><init>(Lzd/m3;Lde/m;)V

    invoke-virtual {v0, v1}, Ldj/j;->o(Ljj/e;)Ldj/j;

    move-result-object v0

    new-instance v1, Lzd/h3;

    invoke-direct {v1, p0, p1}, Lzd/h3;-><init>(Lzd/m3;Lde/m;)V

    invoke-virtual {v0, v1}, Ldj/j;->h(Ljj/g;)Ldj/j;

    move-result-object p1

    invoke-virtual {p1}, Ldj/j;->m()Ldj/s;

    move-result-object p1

    return-object p1
.end method
