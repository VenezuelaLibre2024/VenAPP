.class public Lzd/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final c:Lpf/b;


# instance fields
.field private final a:Lzd/u2;

.field private b:Ldj/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldj/j<",
            "Lpf/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lpf/b;->g0()Lpf/b;

    move-result-object v0

    sput-object v0, Lzd/w0;->c:Lpf/b;

    return-void
.end method

.method constructor <init>(Lzd/u2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ldj/j;->g()Ldj/j;

    move-result-object v0

    iput-object v0, p0, Lzd/w0;->b:Ldj/j;

    iput-object p1, p0, Lzd/w0;->a:Lzd/u2;

    return-void
.end method

.method public static synthetic a(Lzd/w0;Lpf/a;Lpf/b;)Ldj/d;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/w0;->q(Lpf/a;Lpf/b;)Ldj/d;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lzd/w0;Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/w0;->o(Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic c(Lzd/w0;Lpf/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/w0;->k(Lpf/b;)V

    return-void
.end method

.method public static synthetic d(Lzd/w0;Lpf/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/w0;->p(Lpf/b;)V

    return-void
.end method

.method public static synthetic e(Lzd/w0;Lpf/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/w0;->m(Lpf/b;)V

    return-void
.end method

.method public static synthetic f(Lzd/w0;Ljava/util/HashSet;Lpf/b;)Ldj/d;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/w0;->n(Ljava/util/HashSet;Lpf/b;)Ldj/d;

    move-result-object p0

    return-object p0
.end method

.method private static g(Lpf/b;Lpf/a;)Lpf/b;
    .locals 0

    invoke-static {p0}, Lpf/b;->i0(Lpf/b;)Lpf/b$b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lpf/b$b;->I(Lpf/a;)Lpf/b$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object p0

    check-cast p0, Lpf/b;

    return-object p0
.end method

.method private i()V
    .locals 1

    invoke-static {}, Ldj/j;->g()Ldj/j;

    move-result-object v0

    iput-object v0, p0, Lzd/w0;->b:Ldj/j;

    return-void
.end method

.method private k(Lpf/b;)V
    .locals 0

    invoke-static {p1}, Ldj/j;->n(Ljava/lang/Object;)Ldj/j;

    move-result-object p1

    iput-object p1, p0, Lzd/w0;->b:Ldj/j;

    return-void
.end method

.method private synthetic m(Lpf/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/w0;->k(Lpf/b;)V

    return-void
.end method

.method private synthetic n(Ljava/util/HashSet;Lpf/b;)Ldj/d;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Existing impressions: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/google/protobuf/x;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lzd/l2;->a(Ljava/lang/String;)V

    invoke-static {}, Lpf/b;->h0()Lpf/b$b;

    move-result-object v0

    invoke-virtual {p2}, Lpf/b;->f0()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lpf/a;

    invoke-virtual {v1}, Lpf/a;->e0()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0, v1}, Lpf/b$b;->I(Lpf/a;)Lpf/b$b;

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object p1

    check-cast p1, Lpf/b;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "New cleared impression list: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/google/protobuf/x;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lzd/l2;->a(Ljava/lang/String;)V

    iget-object p2, p0, Lzd/w0;->a:Lzd/u2;

    invoke-virtual {p2, p1}, Lzd/u2;->f(Lcom/google/protobuf/a;)Ldj/b;

    move-result-object p2

    new-instance v0, Lzd/v0;

    invoke-direct {v0, p0, p1}, Lzd/v0;-><init>(Lzd/w0;Lpf/b;)V

    invoke-virtual {p2, v0}, Ldj/b;->g(Ljj/a;)Ldj/b;

    move-result-object p1

    return-object p1
.end method

.method private synthetic o(Ljava/lang/Throwable;)V
    .locals 0

    invoke-direct {p0}, Lzd/w0;->i()V

    return-void
.end method

.method private synthetic p(Lpf/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lzd/w0;->k(Lpf/b;)V

    return-void
.end method

.method private synthetic q(Lpf/a;Lpf/b;)Ldj/d;
    .locals 1

    invoke-static {p2, p1}, Lzd/w0;->g(Lpf/b;Lpf/a;)Lpf/b;

    move-result-object p1

    iget-object p2, p0, Lzd/w0;->a:Lzd/u2;

    invoke-virtual {p2, p1}, Lzd/u2;->f(Lcom/google/protobuf/a;)Ldj/b;

    move-result-object p2

    new-instance v0, Lzd/q0;

    invoke-direct {v0, p0, p1}, Lzd/q0;-><init>(Lzd/w0;Lpf/b;)V

    invoke-virtual {p2, v0}, Ldj/b;->g(Ljj/a;)Ldj/b;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public h(Lpf/e;)Ldj/b;
    .locals 4

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-virtual {p1}, Lpf/e;->f0()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lof/c;

    invoke-virtual {v1}, Lof/c;->g0()Lof/c$c;

    move-result-object v2

    sget-object v3, Lof/c$c;->VANILLA_PAYLOAD:Lof/c$c;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lof/c;->j0()Lof/d;

    move-result-object v1

    invoke-virtual {v1}, Lof/d;->d0()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_0
    invoke-virtual {v1}, Lof/c;->e0()Lof/b;

    move-result-object v1

    invoke-virtual {v1}, Lof/b;->d0()Ljava/lang/String;

    move-result-object v1

    :goto_1
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Potential impressions to clear: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lzd/l2;->a(Ljava/lang/String;)V

    invoke-virtual {p0}, Lzd/w0;->j()Ldj/j;

    move-result-object p1

    sget-object v1, Lzd/w0;->c:Lpf/b;

    invoke-virtual {p1, v1}, Ldj/j;->c(Ljava/lang/Object;)Ldj/j;

    move-result-object p1

    new-instance v1, Lzd/u0;

    invoke-direct {v1, p0, v0}, Lzd/u0;-><init>(Lzd/w0;Ljava/util/HashSet;)V

    invoke-virtual {p1, v1}, Ldj/j;->j(Ljj/e;)Ldj/b;

    move-result-object p1

    return-object p1
.end method

.method public j()Ldj/j;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ldj/j<",
            "Lpf/b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzd/w0;->b:Ldj/j;

    iget-object v1, p0, Lzd/w0;->a:Lzd/u2;

    invoke-static {}, Lpf/b;->j0()Lcom/google/protobuf/z0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lzd/u2;->e(Lcom/google/protobuf/z0;)Ldj/j;

    move-result-object v1

    new-instance v2, Lzd/n0;

    invoke-direct {v2, p0}, Lzd/n0;-><init>(Lzd/w0;)V

    invoke-virtual {v1, v2}, Ldj/j;->f(Ljj/d;)Ldj/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Ldj/j;->x(Ldj/n;)Ldj/j;

    move-result-object v0

    new-instance v1, Lzd/o0;

    invoke-direct {v1, p0}, Lzd/o0;-><init>(Lzd/w0;)V

    invoke-virtual {v0, v1}, Ldj/j;->e(Ljj/d;)Ldj/j;

    move-result-object v0

    return-object v0
.end method

.method public l(Lof/c;)Ldj/s;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lof/c;",
            ")",
            "Ldj/s<",
            "Ljava/lang/Boolean;",
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

    move-result-object p1

    invoke-virtual {p1}, Lof/d;->d0()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lof/c;->e0()Lof/b;

    move-result-object p1

    invoke-virtual {p1}, Lof/b;->d0()Ljava/lang/String;

    move-result-object p1

    :goto_0
    invoke-virtual {p0}, Lzd/w0;->j()Ldj/j;

    move-result-object v0

    new-instance v1, Lzd/r0;

    invoke-direct {v1}, Lzd/r0;-><init>()V

    invoke-virtual {v0, v1}, Ldj/j;->o(Ljj/e;)Ldj/j;

    move-result-object v0

    new-instance v1, Lzd/s0;

    invoke-direct {v1}, Lzd/s0;-><init>()V

    invoke-virtual {v0, v1}, Ldj/j;->k(Ljj/e;)Ldj/o;

    move-result-object v0

    new-instance v1, Lzd/t0;

    invoke-direct {v1}, Lzd/t0;-><init>()V

    invoke-virtual {v0, v1}, Ldj/o;->r(Ljj/e;)Ldj/o;

    move-result-object v0

    invoke-virtual {v0, p1}, Ldj/o;->g(Ljava/lang/Object;)Ldj/s;

    move-result-object p1

    return-object p1
.end method

.method public r(Lpf/a;)Ldj/b;
    .locals 2

    invoke-virtual {p0}, Lzd/w0;->j()Ldj/j;

    move-result-object v0

    sget-object v1, Lzd/w0;->c:Lpf/b;

    invoke-virtual {v0, v1}, Ldj/j;->c(Ljava/lang/Object;)Ldj/j;

    move-result-object v0

    new-instance v1, Lzd/p0;

    invoke-direct {v1, p0, p1}, Lzd/p0;-><init>(Lzd/w0;Lpf/a;)V

    invoke-virtual {v0, v1}, Ldj/j;->j(Ljj/e;)Ldj/b;

    move-result-object p1

    return-object p1
.end method
