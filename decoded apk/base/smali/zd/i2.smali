.class public Lzd/i2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lij/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lij/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lij/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lij/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lzd/k;

.field private final d:Lce/a;

.field private final e:Lzd/d;

.field private final f:Lzd/o3;

.field private final g:Lzd/w0;

.field private final h:Lzd/m3;

.field private final i:Lde/m;

.field private final j:Lzd/c;

.field private final k:Lzd/r3;

.field private final l:Lzd/b;

.field private final m:Lfe/f;

.field private final n:Lzd/n;

.field private final o:Ljava/util/concurrent/Executor;
    .annotation build Ldc/b;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lij/a;Lij/a;Lzd/k;Lce/a;Lzd/d;Lzd/c;Lzd/o3;Lzd/w0;Lzd/m3;Lde/m;Lzd/r3;Lfe/f;Lzd/n;Lzd/b;Ljava/util/concurrent/Executor;)V
    .locals 0
    .param p15    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/b;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lij/a<",
            "Ljava/lang/String;",
            ">;",
            "Lij/a<",
            "Ljava/lang/String;",
            ">;",
            "Lzd/k;",
            "Lce/a;",
            "Lzd/d;",
            "Lzd/c;",
            "Lzd/o3;",
            "Lzd/w0;",
            "Lzd/m3;",
            "Lde/m;",
            "Lzd/r3;",
            "Lfe/f;",
            "Lzd/n;",
            "Lzd/b;",
            "Ljava/util/concurrent/Executor;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/i2;->a:Lij/a;

    iput-object p2, p0, Lzd/i2;->b:Lij/a;

    iput-object p3, p0, Lzd/i2;->c:Lzd/k;

    iput-object p4, p0, Lzd/i2;->d:Lce/a;

    iput-object p5, p0, Lzd/i2;->e:Lzd/d;

    iput-object p6, p0, Lzd/i2;->j:Lzd/c;

    iput-object p7, p0, Lzd/i2;->f:Lzd/o3;

    iput-object p8, p0, Lzd/i2;->g:Lzd/w0;

    iput-object p9, p0, Lzd/i2;->h:Lzd/m3;

    iput-object p10, p0, Lzd/i2;->i:Lde/m;

    iput-object p11, p0, Lzd/i2;->k:Lzd/r3;

    iput-object p13, p0, Lzd/i2;->n:Lzd/n;

    iput-object p12, p0, Lzd/i2;->m:Lfe/f;

    iput-object p14, p0, Lzd/i2;->l:Lzd/b;

    iput-object p15, p0, Lzd/i2;->o:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic A(Ljava/lang/Boolean;)Z
    .locals 0

    invoke-static {p0}, Lzd/i2;->o0(Ljava/lang/Boolean;)Z

    move-result p0

    return p0
.end method

.method private static A0(Lzd/k2;)Z
    .locals 1

    invoke-virtual {p0}, Lzd/k2;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lzd/k2;->c()Lcom/google/firebase/installations/g;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/firebase/installations/g;->b()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic B(Lzd/i2;Lof/c;)Ldj/j;
    .locals 0

    invoke-direct {p0, p1}, Lzd/i2;->U(Lof/c;)Ldj/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lzd/i2;Ljava/lang/String;Lof/c;)Ldj/n;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/i2;->s0(Ljava/lang/String;Lof/c;)Ldj/n;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D()V
    .locals 0

    invoke-static {}, Lzd/i2;->g0()V

    return-void
.end method

.method public static synthetic E(Ljava/lang/Boolean;)Z
    .locals 0

    invoke-static {p0}, Lzd/i2;->m0(Ljava/lang/Boolean;)Z

    move-result p0

    return p0
.end method

.method public static synthetic F(Ljava/lang/Throwable;)Ldj/d;
    .locals 0

    invoke-static {p0}, Lzd/i2;->i0(Ljava/lang/Throwable;)Ldj/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Ldj/k;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lzd/i2;->t0(Ldj/k;Ljava/lang/Object;)V

    return-void
.end method

.method static H()Lpf/e;
    .locals 3

    invoke-static {}, Lpf/e;->g0()Lpf/e$b;

    move-result-object v0

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Lpf/e$b;->I(J)Lpf/e$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object v0

    check-cast v0, Lpf/e;

    return-object v0
.end method

.method private static I(Lof/c;Lof/c;)I
    .locals 1

    invoke-virtual {p0}, Lof/c;->f0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lof/c;->f0()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    invoke-virtual {p1}, Lof/c;->f0()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lof/c;->f0()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    invoke-virtual {p0}, Lof/c;->h0()Lqd/e;

    move-result-object p0

    invoke-virtual {p0}, Lqd/e;->d0()I

    move-result p0

    invoke-virtual {p1}, Lof/c;->h0()Lqd/e;

    move-result-object p1

    invoke-virtual {p1}, Lqd/e;->d0()I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p0

    return p0
.end method

.method private static J(Ljava/lang/String;Lof/c;)Z
    .locals 4

    invoke-static {p0}, Lzd/i2;->Q(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lof/c;->f0()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Lof/c;->i0()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lqd/h;

    invoke-static {v0, p0}, Lzd/i2;->O(Lqd/h;Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {v0, p0}, Lzd/i2;->N(Lqd/h;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_2
    new-array p1, v1, [Ljava/lang/Object;

    aput-object p0, p1, v2

    const-string p0, "The event %s is contained in the list of triggers"

    invoke-static {p0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lzd/l2;->a(Ljava/lang/String;)V

    return v1

    :cond_3
    return v2
.end method

.method private L(Ljava/lang/String;Lof/c;)Ldj/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lof/c;",
            ")",
            "Ldj/j<",
            "Lof/c;",
            ">;"
        }
    .end annotation

    invoke-virtual {p2}, Lof/c;->f0()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lzd/i2;->Q(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lzd/i2;->h:Lzd/m3;

    iget-object v0, p0, Lzd/i2;->i:Lde/m;

    invoke-virtual {p1, v0}, Lzd/m3;->p(Lde/m;)Ldj/s;

    move-result-object p1

    new-instance v0, Lzd/g1;

    invoke-direct {v0}, Lzd/g1;-><init>()V

    invoke-virtual {p1, v0}, Ldj/s;->f(Ljj/d;)Ldj/s;

    move-result-object p1

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Ldj/s;->h(Ljava/lang/Object;)Ldj/s;

    move-result-object v0

    invoke-virtual {p1, v0}, Ldj/s;->i(Ldj/s;)Ldj/s;

    move-result-object p1

    new-instance v0, Lzd/h1;

    invoke-direct {v0}, Lzd/h1;-><init>()V

    invoke-virtual {p1, v0}, Ldj/s;->g(Ljj/g;)Ldj/j;

    move-result-object p1

    new-instance v0, Lzd/i1;

    invoke-direct {v0, p2}, Lzd/i1;-><init>(Lof/c;)V

    invoke-virtual {p1, v0}, Ldj/j;->o(Ljj/e;)Ldj/j;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p2}, Ldj/j;->n(Ljava/lang/Object;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method private M(Ljava/lang/String;Ljj/e;Ljj/e;Ljj/e;Lpf/e;)Ldj/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljj/e<",
            "Lof/c;",
            "Ldj/j<",
            "Lof/c;",
            ">;>;",
            "Ljj/e<",
            "Lof/c;",
            "Ldj/j<",
            "Lof/c;",
            ">;>;",
            "Ljj/e<",
            "Lof/c;",
            "Ldj/j<",
            "Lof/c;",
            ">;>;",
            "Lpf/e;",
            ")",
            "Ldj/j<",
            "Lde/o;",
            ">;"
        }
    .end annotation

    invoke-virtual {p5}, Lpf/e;->f0()Ljava/util/List;

    move-result-object p5

    invoke-static {p5}, Ldj/f;->s(Ljava/lang/Iterable;)Ldj/f;

    move-result-object p5

    new-instance v0, Lzd/b1;

    invoke-direct {v0, p0}, Lzd/b1;-><init>(Lzd/i2;)V

    invoke-virtual {p5, v0}, Ldj/f;->j(Ljj/g;)Ldj/f;

    move-result-object p5

    new-instance v0, Lzd/c1;

    invoke-direct {v0, p1}, Lzd/c1;-><init>(Ljava/lang/String;)V

    invoke-virtual {p5, v0}, Ldj/f;->j(Ljj/g;)Ldj/f;

    move-result-object p5

    invoke-virtual {p5, p2}, Ldj/f;->p(Ljj/e;)Ldj/f;

    move-result-object p2

    invoke-virtual {p2, p3}, Ldj/f;->p(Ljj/e;)Ldj/f;

    move-result-object p2

    invoke-virtual {p2, p4}, Ldj/f;->p(Ljj/e;)Ldj/f;

    move-result-object p2

    new-instance p3, Lzd/d1;

    invoke-direct {p3}, Lzd/d1;-><init>()V

    invoke-virtual {p2, p3}, Ldj/f;->E(Ljava/util/Comparator;)Ldj/f;

    move-result-object p2

    invoke-virtual {p2}, Ldj/f;->k()Ldj/j;

    move-result-object p2

    new-instance p3, Lzd/e1;

    invoke-direct {p3, p0, p1}, Lzd/e1;-><init>(Lzd/i2;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Ldj/j;->i(Ljj/e;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method private static N(Lqd/h;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0}, Lqd/h;->b0()Lqd/d;

    move-result-object p0

    invoke-virtual {p0}, Lqd/d;->d0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static O(Lqd/h;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0}, Lqd/h;->d0()Lqd/f;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static P(Lce/a;Lof/c;)Z
    .locals 6

    invoke-virtual {p1}, Lof/c;->g0()Lof/c$c;

    move-result-object v0

    sget-object v1, Lof/c$c;->VANILLA_PAYLOAD:Lof/c$c;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lof/c;->j0()Lof/d;

    move-result-object v0

    invoke-virtual {v0}, Lof/d;->f0()J

    move-result-wide v2

    invoke-virtual {p1}, Lof/c;->j0()Lof/d;

    move-result-object p1

    invoke-virtual {p1}, Lof/d;->b0()J

    move-result-wide v4

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lof/c;->g0()Lof/c$c;

    move-result-object v0

    sget-object v2, Lof/c$c;->EXPERIMENTAL_PAYLOAD:Lof/c$c;

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lof/c;->e0()Lof/b;

    move-result-object v0

    invoke-virtual {v0}, Lof/b;->f0()J

    move-result-wide v2

    invoke-virtual {p1}, Lof/c;->e0()Lof/b;

    move-result-object p1

    invoke-virtual {p1}, Lof/b;->b0()J

    move-result-wide v4

    :goto_0
    invoke-interface {p0}, Lce/a;->a()J

    move-result-wide p0

    cmp-long v0, p0, v2

    if-lez v0, :cond_1

    cmp-long p0, p0, v4

    if-gez p0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public static Q(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "ON_FOREGROUND"

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static synthetic R(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Event Triggered: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lzd/l2;->a(Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic S(Lpf/e;)V
    .locals 0

    const-string p0, "Fetched from cache"

    invoke-static {p0}, Lzd/l2;->a(Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic T(Lof/c;Ljava/lang/Boolean;)Lof/c;
    .locals 0

    return-object p0
.end method

.method private synthetic U(Lof/c;)Ldj/j;
    .locals 2

    invoke-virtual {p1}, Lof/c;->f0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Ldj/j;->n(Ljava/lang/Object;)Ldj/j;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lzd/i2;->g:Lzd/w0;

    invoke-virtual {v0, p1}, Lzd/w0;->l(Lof/c;)Ldj/s;

    move-result-object v0

    new-instance v1, Lzd/v1;

    invoke-direct {v1}, Lzd/v1;-><init>()V

    invoke-virtual {v0, v1}, Ldj/s;->e(Ljj/d;)Ldj/s;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Ldj/s;->h(Ljava/lang/Object;)Ldj/s;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldj/s;->i(Ldj/s;)Ldj/s;

    move-result-object v0

    new-instance v1, Lzd/w1;

    invoke-direct {v1, p1}, Lzd/w1;-><init>(Lof/c;)V

    invoke-virtual {v0, v1}, Ldj/s;->f(Ljj/d;)Ldj/s;

    move-result-object v0

    new-instance v1, Lzd/x1;

    invoke-direct {v1}, Lzd/x1;-><init>()V

    invoke-virtual {v0, v1}, Ldj/s;->g(Ljj/g;)Ldj/j;

    move-result-object v0

    new-instance v1, Lzd/y1;

    invoke-direct {v1, p1}, Lzd/y1;-><init>(Lof/c;)V

    invoke-virtual {v0, v1}, Ldj/j;->o(Ljj/e;)Ldj/j;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method private synthetic V(Ljava/lang/String;Lof/c;)Ldj/j;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/i2;->L(Ljava/lang/String;Lof/c;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic W(Lof/c;)Ldj/j;
    .locals 2

    sget-object v0, Lzd/i2$a;->a:[I

    invoke-virtual {p0}, Lof/c;->b0()Lqd/d0;

    move-result-object v1

    invoke-virtual {v1}, Lqd/d0;->g0()Lqd/d0$b;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    const/4 v1, 0x4

    if-eq v0, v1, :cond_0

    const-string p0, "Filtering non-displayable message"

    invoke-static {p0}, Lzd/l2;->a(Ljava/lang/String;)V

    invoke-static {}, Ldj/j;->g()Ldj/j;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Ldj/j;->n(Ljava/lang/Object;)Ldj/j;

    move-result-object p0

    return-object p0
.end method

.method private synthetic X(Ljava/lang/String;Ljj/e;Ljj/e;Ljj/e;Lpf/e;)Ldj/j;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lzd/i2;->M(Ljava/lang/String;Ljj/e;Ljj/e;Ljj/e;Lpf/e;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method private static synthetic Y(Ljava/lang/Throwable;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Impressions store read fail: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lzd/l2;->d(Ljava/lang/String;)V

    return-void
.end method

.method private synthetic Z(Lpf/b;Lzd/k2;)Lpf/e;
    .locals 1

    iget-object v0, p0, Lzd/i2;->e:Lzd/d;

    invoke-virtual {v0, p2, p1}, Lzd/d;->c(Lzd/k2;Lpf/b;)Lpf/e;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic a(Lzd/i2;Lof/c;)Z
    .locals 0

    invoke-direct {p0, p1}, Lzd/i2;->q0(Lof/c;)Z

    move-result p0

    return p0
.end method

.method private static synthetic a0(Lpf/e;)V
    .locals 3

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lpf/e;->f0()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v2, 0x0

    aput-object p0, v1, v2

    const-string p0, "Successfully fetched %d messages from backend"

    invoke-static {v0, p0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lzd/l2;->c(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lzd/i2;Ljava/lang/String;Lof/c;)Ldj/j;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/i2;->V(Ljava/lang/String;Lof/c;)Ldj/j;

    move-result-object p0

    return-object p0
.end method

.method private synthetic b0(Lpf/e;)V
    .locals 1

    iget-object v0, p0, Lzd/i2;->g:Lzd/w0;

    invoke-virtual {v0, p1}, Lzd/w0;->h(Lpf/e;)Ldj/b;

    move-result-object p1

    invoke-virtual {p1}, Ldj/b;->o()Lgj/b;

    return-void
.end method

.method public static synthetic c(Lof/c;Ljava/lang/Boolean;)Lof/c;
    .locals 0

    invoke-static {p0, p1}, Lzd/i2;->T(Lof/c;Ljava/lang/Boolean;)Lof/c;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic c0(Ljava/lang/Throwable;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Service fetch error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lzd/l2;->d(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lzd/k2;)Z
    .locals 0

    invoke-static {p0}, Lzd/i2;->A0(Lzd/k2;)Z

    move-result p0

    return p0
.end method

.method private static synthetic d0(Ljava/lang/Throwable;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cache read error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lzd/l2;->d(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic e(Lof/c;Ljava/lang/Boolean;)Lof/c;
    .locals 0

    invoke-static {p0, p1}, Lzd/i2;->p0(Lof/c;Ljava/lang/Boolean;)Lof/c;

    move-result-object p0

    return-object p0
.end method

.method private synthetic e0(Ldj/j;Lpf/b;)Ldj/j;
    .locals 1

    iget-object v0, p0, Lzd/i2;->n:Lzd/n;

    invoke-virtual {v0}, Lzd/n;->b()Z

    move-result v0

    if-nez v0, :cond_0

    const-string p1, "Automatic data collection is disabled, not attempting campaign fetch from service."

    invoke-static {p1}, Lzd/l2;->c(Ljava/lang/String;)V

    invoke-static {}, Lzd/i2;->H()Lpf/e;

    move-result-object p1

    invoke-static {p1}, Ldj/j;->n(Ljava/lang/Object;)Ldj/j;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v0, Lzd/n1;

    invoke-direct {v0}, Lzd/n1;-><init>()V

    invoke-virtual {p1, v0}, Ldj/j;->h(Ljj/g;)Ldj/j;

    move-result-object p1

    new-instance v0, Lzd/o1;

    invoke-direct {v0, p0, p2}, Lzd/o1;-><init>(Lzd/i2;Lpf/b;)V

    invoke-virtual {p1, v0}, Ldj/j;->o(Ljj/e;)Ldj/j;

    move-result-object p1

    invoke-static {}, Lzd/i2;->H()Lpf/e;

    move-result-object p2

    invoke-static {p2}, Ldj/j;->n(Ljava/lang/Object;)Ldj/j;

    move-result-object p2

    invoke-virtual {p1, p2}, Ldj/j;->x(Ldj/n;)Ldj/j;

    move-result-object p1

    new-instance p2, Lzd/p1;

    invoke-direct {p2}, Lzd/p1;-><init>()V

    invoke-virtual {p1, p2}, Ldj/j;->f(Ljj/d;)Ldj/j;

    move-result-object p1

    new-instance p2, Lzd/q1;

    invoke-direct {p2, p0}, Lzd/q1;-><init>(Lzd/i2;)V

    invoke-virtual {p1, p2}, Ldj/j;->f(Ljj/d;)Ldj/j;

    move-result-object p1

    iget-object p2, p0, Lzd/i2;->j:Lzd/c;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lzd/r1;

    invoke-direct {v0, p2}, Lzd/r1;-><init>(Lzd/c;)V

    invoke-virtual {p1, v0}, Ldj/j;->f(Ljj/d;)Ldj/j;

    move-result-object p1

    iget-object p2, p0, Lzd/i2;->k:Lzd/r3;

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lzd/s1;

    invoke-direct {v0, p2}, Lzd/s1;-><init>(Lzd/r3;)V

    invoke-virtual {p1, v0}, Ldj/j;->f(Ljj/d;)Ldj/j;

    move-result-object p1

    new-instance p2, Lzd/t1;

    invoke-direct {p2}, Lzd/t1;-><init>()V

    invoke-virtual {p1, p2}, Ldj/j;->e(Ljj/d;)Ldj/j;

    move-result-object p1

    invoke-static {}, Ldj/j;->g()Ldj/j;

    move-result-object p2

    invoke-virtual {p1, p2}, Ldj/j;->q(Ldj/n;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic f(Lzd/i2;Lpf/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/i2;->b0(Lpf/e;)V

    return-void
.end method

.method private synthetic f0(Ljava/lang/String;)Lim/a;
    .locals 9

    iget-object v0, p0, Lzd/i2;->c:Lzd/k;

    invoke-virtual {v0}, Lzd/k;->f()Ldj/j;

    move-result-object v0

    new-instance v1, Lzd/u1;

    invoke-direct {v1}, Lzd/u1;-><init>()V

    invoke-virtual {v0, v1}, Ldj/j;->f(Ljj/d;)Ldj/j;

    move-result-object v0

    new-instance v1, Lzd/b2;

    invoke-direct {v1}, Lzd/b2;-><init>()V

    invoke-virtual {v0, v1}, Ldj/j;->e(Ljj/d;)Ldj/j;

    move-result-object v0

    invoke-static {}, Ldj/j;->g()Ldj/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldj/j;->q(Ldj/n;)Ldj/j;

    move-result-object v0

    new-instance v1, Lzd/c2;

    invoke-direct {v1, p0}, Lzd/c2;-><init>(Lzd/i2;)V

    new-instance v5, Lzd/d2;

    invoke-direct {v5, p0}, Lzd/d2;-><init>(Lzd/i2;)V

    new-instance v6, Lzd/e2;

    invoke-direct {v6, p0, p1}, Lzd/e2;-><init>(Lzd/i2;Ljava/lang/String;)V

    new-instance v7, Lzd/f2;

    invoke-direct {v7}, Lzd/f2;-><init>()V

    new-instance v8, Lzd/g2;

    move-object v2, v8

    move-object v3, p0

    move-object v4, p1

    invoke-direct/range {v2 .. v7}, Lzd/g2;-><init>(Lzd/i2;Ljava/lang/String;Ljj/e;Ljj/e;Ljj/e;)V

    iget-object v2, p0, Lzd/i2;->g:Lzd/w0;

    invoke-virtual {v2}, Lzd/w0;->j()Ldj/j;

    move-result-object v2

    new-instance v3, Lzd/h2;

    invoke-direct {v3}, Lzd/h2;-><init>()V

    invoke-virtual {v2, v3}, Ldj/j;->e(Ljj/d;)Ldj/j;

    move-result-object v2

    invoke-static {}, Lpf/b;->g0()Lpf/b;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldj/j;->c(Ljava/lang/Object;)Ldj/j;

    move-result-object v2

    invoke-static {}, Lpf/b;->g0()Lpf/b;

    move-result-object v3

    invoke-static {v3}, Ldj/j;->n(Ljava/lang/Object;)Ldj/j;

    move-result-object v3

    invoke-virtual {v2, v3}, Ldj/j;->q(Ldj/n;)Ldj/j;

    move-result-object v2

    iget-object v3, p0, Lzd/i2;->m:Lfe/f;

    invoke-interface {v3}, Lfe/f;->getId()Lcom/google/android/gms/tasks/Task;

    move-result-object v3

    iget-object v4, p0, Lzd/i2;->o:Ljava/util/concurrent/Executor;

    invoke-static {v3, v4}, Lzd/i2;->y0(Lcom/google/android/gms/tasks/Task;Ljava/util/concurrent/Executor;)Ldj/j;

    move-result-object v3

    iget-object v4, p0, Lzd/i2;->m:Lfe/f;

    const/4 v5, 0x0

    invoke-interface {v4, v5}, Lfe/f;->a(Z)Lcom/google/android/gms/tasks/Task;

    move-result-object v4

    iget-object v6, p0, Lzd/i2;->o:Ljava/util/concurrent/Executor;

    invoke-static {v4, v6}, Lzd/i2;->y0(Lcom/google/android/gms/tasks/Task;Ljava/util/concurrent/Executor;)Ldj/j;

    move-result-object v4

    new-instance v6, Lzd/z0;

    invoke-direct {v6}, Lzd/z0;-><init>()V

    invoke-static {v3, v4, v6}, Ldj/j;->A(Ldj/n;Ldj/n;Ljj/b;)Ldj/j;

    move-result-object v3

    iget-object v4, p0, Lzd/i2;->f:Lzd/o3;

    invoke-virtual {v4}, Lzd/o3;->a()Ldj/r;

    move-result-object v4

    invoke-virtual {v3, v4}, Ldj/j;->p(Ldj/r;)Ldj/j;

    move-result-object v3

    new-instance v4, Lzd/a1;

    invoke-direct {v4, p0, v3}, Lzd/a1;-><init>(Lzd/i2;Ldj/j;)V

    invoke-direct {p0, p1}, Lzd/i2;->x0(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    iget-object v0, p0, Lzd/i2;->k:Lzd/r3;

    invoke-virtual {v0}, Lzd/r3;->b()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    aput-object v0, p1, v5

    iget-object v0, p0, Lzd/i2;->k:Lzd/r3;

    invoke-virtual {v0}, Lzd/r3;->a()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x1

    aput-object v0, p1, v1

    const-string v0, "Forcing fetch from service rather than cache. Test Device: %s | App Fresh Install: %s"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lzd/l2;->c(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ldj/j;->i(Ljj/e;)Ldj/j;

    move-result-object p1

    :goto_0
    invoke-virtual {p1, v8}, Ldj/j;->i(Ljj/e;)Ldj/j;

    move-result-object p1

    invoke-virtual {p1}, Ldj/j;->y()Ldj/f;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, "Attempting to fetch campaigns using cache"

    invoke-static {p1}, Lzd/l2;->a(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ldj/j;->i(Ljj/e;)Ldj/j;

    move-result-object p1

    invoke-virtual {p1, v1}, Ldj/j;->f(Ljj/d;)Ldj/j;

    move-result-object p1

    invoke-virtual {v0, p1}, Ldj/j;->x(Ldj/n;)Ldj/j;

    move-result-object p1

    goto :goto_0
.end method

.method public static synthetic g(Lpf/e;)V
    .locals 0

    invoke-static {p0}, Lzd/i2;->a0(Lpf/e;)V

    return-void
.end method

.method private static synthetic g0()V
    .locals 1

    const-string v0, "Wrote to cache"

    invoke-static {v0}, Lzd/l2;->a(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic h(Lzd/i2;Ljava/lang/String;Ljj/e;Ljj/e;Ljj/e;Lpf/e;)Ldj/j;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lzd/i2;->X(Ljava/lang/String;Ljj/e;Ljj/e;Ljj/e;Lpf/e;)Ldj/j;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic h0(Ljava/lang/Throwable;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cache write error: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lzd/l2;->d(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic i(Ljava/lang/String;)V
    .locals 0

    invoke-static {p0}, Lzd/i2;->R(Ljava/lang/String;)V

    return-void
.end method

.method private static synthetic i0(Ljava/lang/Throwable;)Ldj/d;
    .locals 0

    invoke-static {}, Ldj/b;->d()Ldj/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lzd/i2;->d0(Ljava/lang/Throwable;)V

    return-void
.end method

.method private synthetic j0(Lpf/e;)V
    .locals 1

    iget-object v0, p0, Lzd/i2;->c:Lzd/k;

    invoke-virtual {v0, p1}, Lzd/k;->l(Lpf/e;)Ldj/b;

    move-result-object p1

    new-instance v0, Lzd/k1;

    invoke-direct {v0}, Lzd/k1;-><init>()V

    invoke-virtual {p1, v0}, Ldj/b;->g(Ljj/a;)Ldj/b;

    move-result-object p1

    new-instance v0, Lzd/l1;

    invoke-direct {v0}, Lzd/l1;-><init>()V

    invoke-virtual {p1, v0}, Ldj/b;->h(Ljj/d;)Ldj/b;

    move-result-object p1

    new-instance v0, Lzd/m1;

    invoke-direct {v0}, Lzd/m1;-><init>()V

    invoke-virtual {p1, v0}, Ldj/b;->n(Ljj/e;)Ldj/b;

    move-result-object p1

    invoke-virtual {p1}, Ldj/b;->o()Lgj/b;

    return-void
.end method

.method public static synthetic k(Ljava/lang/String;Lof/c;)Z
    .locals 0

    invoke-static {p0, p1}, Lzd/i2;->r0(Ljava/lang/String;Lof/c;)Z

    move-result p0

    return p0
.end method

.method private static synthetic k0(Ljava/lang/Throwable;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Impression store read fail: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lzd/l2;->d(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic l(Lzd/i2;Lpf/e;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/i2;->j0(Lpf/e;)V

    return-void
.end method

.method private static synthetic l0(Lof/c;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lzd/i2;->w0(Lof/c;Ljava/lang/Boolean;)V

    return-void
.end method

.method public static synthetic m(Lof/c;)Ldj/j;
    .locals 0

    invoke-static {p0}, Lzd/i2;->W(Lof/c;)Ldj/j;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic m0(Ljava/lang/Boolean;)Z
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static synthetic n(Lzd/i2;Ldj/j;Lpf/b;)Ldj/j;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/i2;->e0(Ldj/j;Lpf/b;)Ldj/j;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic n0(Ljava/lang/Boolean;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "App foreground rate limited ? : "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lzd/l2;->c(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic o(Lzd/i2;Ljava/lang/String;)Lim/a;
    .locals 0

    invoke-direct {p0, p1}, Lzd/i2;->f0(Ljava/lang/String;)Lim/a;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic o0(Ljava/lang/Boolean;)Z
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static synthetic p(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lzd/i2;->Y(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static synthetic p0(Lof/c;Ljava/lang/Boolean;)Lof/c;
    .locals 0

    return-object p0
.end method

.method public static synthetic q(Lof/c;Lof/c;)I
    .locals 0

    invoke-static {p0, p1}, Lzd/i2;->I(Lof/c;Lof/c;)I

    move-result p0

    return p0
.end method

.method private synthetic q0(Lof/c;)Z
    .locals 1

    iget-object v0, p0, Lzd/i2;->k:Lzd/r3;

    invoke-virtual {v0}, Lzd/r3;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lzd/i2;->d:Lce/a;

    invoke-static {v0, p1}, Lzd/i2;->P(Lce/a;Lof/c;)Z

    move-result p1

    if-eqz p1, :cond_0

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

.method public static synthetic r(Lpf/e;)V
    .locals 0

    invoke-static {p0}, Lzd/i2;->S(Lpf/e;)V

    return-void
.end method

.method private static synthetic r0(Ljava/lang/String;Lof/c;)Z
    .locals 0

    invoke-static {p0, p1}, Lzd/i2;->J(Ljava/lang/String;Lof/c;)Z

    move-result p0

    return p0
.end method

.method public static synthetic s(Lzd/i2;Lpf/b;Lzd/k2;)Lpf/e;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/i2;->Z(Lpf/b;Lzd/k2;)Lpf/e;

    move-result-object p0

    return-object p0
.end method

.method private synthetic s0(Ljava/lang/String;Lof/c;)Ldj/n;
    .locals 0

    invoke-direct {p0, p2, p1}, Lzd/i2;->z0(Lof/c;Ljava/lang/String;)Ldj/j;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic t(Ldj/k;Ljava/lang/Exception;)V
    .locals 0

    invoke-static {p0, p1}, Lzd/i2;->u0(Ldj/k;Ljava/lang/Exception;)V

    return-void
.end method

.method private static synthetic t0(Ldj/k;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Ldj/k;->onSuccess(Ljava/lang/Object;)V

    invoke-interface {p0}, Ldj/k;->a()V

    return-void
.end method

.method public static synthetic u(Lof/c;Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0, p1}, Lzd/i2;->l0(Lof/c;Ljava/lang/Boolean;)V

    return-void
.end method

.method private static synthetic u0(Ldj/k;Ljava/lang/Exception;)V
    .locals 0

    invoke-interface {p0, p1}, Ldj/k;->onError(Ljava/lang/Throwable;)V

    invoke-interface {p0}, Ldj/k;->a()V

    return-void
.end method

.method public static synthetic v(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lzd/i2;->h0(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static synthetic v0(Lcom/google/android/gms/tasks/Task;Ljava/util/concurrent/Executor;Ldj/k;)V
    .locals 1

    new-instance v0, Lzd/z1;

    invoke-direct {v0, p2}, Lzd/z1;-><init>(Ldj/k;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    new-instance v0, Lzd/a2;

    invoke-direct {v0, p2}, Lzd/a2;-><init>(Ldj/k;)V

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method public static synthetic w(Lcom/google/android/gms/tasks/Task;Ljava/util/concurrent/Executor;Ldj/k;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lzd/i2;->v0(Lcom/google/android/gms/tasks/Task;Ljava/util/concurrent/Executor;Ldj/k;)V

    return-void
.end method

.method private static w0(Lof/c;Ljava/lang/Boolean;)V
    .locals 5

    invoke-virtual {p0}, Lof/c;->g0()Lof/c$c;

    move-result-object v0

    sget-object v1, Lof/c$c;->VANILLA_PAYLOAD:Lof/c$c;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    new-array v0, v3, [Ljava/lang/Object;

    invoke-virtual {p0}, Lof/c;->j0()Lof/d;

    move-result-object p0

    invoke-virtual {p0}, Lof/d;->e0()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v0, v2

    aput-object p1, v0, v1

    const-string p0, "Already impressed campaign %s ? : %s"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    invoke-static {p0}, Lzd/l2;->c(Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Lof/c;->g0()Lof/c$c;

    move-result-object v0

    sget-object v4, Lof/c$c;->EXPERIMENTAL_PAYLOAD:Lof/c$c;

    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-array v0, v3, [Ljava/lang/Object;

    invoke-virtual {p0}, Lof/c;->e0()Lof/b;

    move-result-object p0

    invoke-virtual {p0}, Lof/b;->e0()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v0, v2

    aput-object p1, v0, v1

    const-string p0, "Already impressed experiment %s ? : %s"

    invoke-static {p0, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public static synthetic x(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lzd/i2;->k0(Ljava/lang/Throwable;)V

    return-void
.end method

.method private x0(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lzd/i2;->k:Lzd/r3;

    invoke-virtual {v0}, Lzd/r3;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lzd/i2;->Q(Ljava/lang/String;)Z

    move-result p1

    return p1

    :cond_0
    iget-object p1, p0, Lzd/i2;->k:Lzd/r3;

    invoke-virtual {p1}, Lzd/r3;->b()Z

    move-result p1

    return p1
.end method

.method public static synthetic y(Ljava/lang/Throwable;)V
    .locals 0

    invoke-static {p0}, Lzd/i2;->c0(Ljava/lang/Throwable;)V

    return-void
.end method

.method private static y0(Lcom/google/android/gms/tasks/Task;Ljava/util/concurrent/Executor;)Ldj/j;
    .locals 1
    .param p1    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/b;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/tasks/Task<",
            "TT;>;",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Ldj/j<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lzd/f1;

    invoke-direct {v0, p0, p1}, Lzd/f1;-><init>(Lcom/google/android/gms/tasks/Task;Ljava/util/concurrent/Executor;)V

    invoke-static {v0}, Ldj/j;->b(Ldj/m;)Ldj/j;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Ljava/lang/Boolean;)V
    .locals 0

    invoke-static {p0}, Lzd/i2;->n0(Ljava/lang/Boolean;)V

    return-void
.end method

.method private z0(Lof/c;Ljava/lang/String;)Ldj/j;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lof/c;",
            "Ljava/lang/String;",
            ")",
            "Ldj/j<",
            "Lde/o;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lof/c;->g0()Lof/c$c;

    move-result-object v0

    sget-object v1, Lof/c$c;->VANILLA_PAYLOAD:Lof/c$c;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lof/c;->j0()Lof/d;

    move-result-object v0

    invoke-virtual {v0}, Lof/d;->d0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lof/c;->j0()Lof/d;

    move-result-object v1

    invoke-virtual {v1}, Lof/d;->e0()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lof/c;->g0()Lof/c$c;

    move-result-object v0

    sget-object v1, Lof/c$c;->EXPERIMENTAL_PAYLOAD:Lof/c$c;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lof/c;->e0()Lof/b;

    move-result-object v0

    invoke-virtual {v0}, Lof/b;->d0()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lof/c;->e0()Lof/b;

    move-result-object v1

    invoke-virtual {v1}, Lof/b;->e0()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lof/c;->f0()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lzd/i2;->l:Lzd/b;

    invoke-virtual {p1}, Lof/c;->e0()Lof/b;

    move-result-object v3

    invoke-virtual {v3}, Lof/b;->h0()Lqd/m;

    move-result-object v3

    invoke-virtual {v2, v3}, Lzd/b;->c(Lqd/m;)V

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lof/c;->b0()Lqd/d0;

    move-result-object v2

    invoke-virtual {p1}, Lof/c;->f0()Z

    move-result v3

    invoke-virtual {p1}, Lof/c;->d0()Ljava/util/Map;

    move-result-object p1

    invoke-static {v2, v0, v1, v3, p1}, Lde/k;->c(Lqd/d0;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)Lde/i;

    move-result-object p1

    invoke-virtual {p1}, Lde/i;->c()Lcom/google/firebase/inappmessaging/model/MessageType;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/inappmessaging/model/MessageType;->UNSUPPORTED:Lcom/google/firebase/inappmessaging/model/MessageType;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ldj/j;->g()Ldj/j;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v0, Lde/o;

    invoke-direct {v0, p1, p2}, Lde/o;-><init>(Lde/i;Ljava/lang/String;)V

    invoke-static {v0}, Ldj/j;->n(Ljava/lang/Object;)Ldj/j;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Ldj/j;->g()Ldj/j;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public K()Ldj/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/f<",
            "Lde/o;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzd/i2;->a:Lij/a;

    iget-object v1, p0, Lzd/i2;->j:Lzd/c;

    invoke-virtual {v1}, Lzd/c;->d()Lij/a;

    move-result-object v1

    iget-object v2, p0, Lzd/i2;->b:Lij/a;

    invoke-static {v0, v1, v2}, Ldj/f;->v(Lim/a;Lim/a;Lim/a;)Ldj/f;

    move-result-object v0

    new-instance v1, Lzd/y0;

    invoke-direct {v1}, Lzd/y0;-><init>()V

    invoke-virtual {v0, v1}, Ldj/f;->g(Ljj/d;)Ldj/f;

    move-result-object v0

    iget-object v1, p0, Lzd/i2;->f:Lzd/o3;

    invoke-virtual {v1}, Lzd/o3;->a()Ldj/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldj/f;->w(Ldj/r;)Ldj/f;

    move-result-object v0

    new-instance v1, Lzd/j1;

    invoke-direct {v1, p0}, Lzd/j1;-><init>(Lzd/i2;)V

    invoke-virtual {v0, v1}, Ldj/f;->c(Ljj/e;)Ldj/f;

    move-result-object v0

    iget-object v1, p0, Lzd/i2;->f:Lzd/o3;

    invoke-virtual {v1}, Lzd/o3;->b()Ldj/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldj/f;->w(Ldj/r;)Ldj/f;

    move-result-object v0

    return-object v0
.end method
