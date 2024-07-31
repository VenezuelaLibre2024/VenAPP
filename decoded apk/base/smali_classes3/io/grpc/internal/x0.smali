.class final Lio/grpc/internal/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvi/h0;
.implements Lio/grpc/internal/m2;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/x0$m;,
        Lio/grpc/internal/x0$k;,
        Lio/grpc/internal/x0$i;,
        Lio/grpc/internal/x0$j;,
        Lio/grpc/internal/x0$l;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lvi/h0<",
        "Ljava/lang/Object;",
        ">;",
        "Lio/grpc/internal/m2;"
    }
.end annotation


# instance fields
.field private final a:Lvi/i0;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Lio/grpc/internal/k$a;

.field private final e:Lio/grpc/internal/x0$j;

.field private final f:Lio/grpc/internal/t;

.field private final g:Ljava/util/concurrent/ScheduledExecutorService;

.field private final h:Lvi/c0;

.field private final i:Lio/grpc/internal/m;

.field private final j:Lio/grpc/internal/o;

.field private final k:Lvi/f;

.field private final l:Lvi/k1;

.field private final m:Lio/grpc/internal/x0$k;

.field private volatile n:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lvi/x;",
            ">;"
        }
    .end annotation
.end field

.field private o:Lio/grpc/internal/k;

.field private final p:Leb/t;

.field private q:Lvi/k1$d;

.field private r:Lvi/k1$d;

.field private s:Lio/grpc/internal/j1;

.field private final t:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lio/grpc/internal/v;",
            ">;"
        }
    .end annotation
.end field

.field private final u:Lio/grpc/internal/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/v0<",
            "Lio/grpc/internal/v;",
            ">;"
        }
    .end annotation
.end field

.field private v:Lio/grpc/internal/v;

.field private volatile w:Lio/grpc/internal/j1;

.field private volatile x:Lvi/q;

.field private y:Lvi/g1;


# direct methods
.method constructor <init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/grpc/internal/k$a;Lio/grpc/internal/t;Ljava/util/concurrent/ScheduledExecutorService;Leb/v;Lvi/k1;Lio/grpc/internal/x0$j;Lvi/c0;Lio/grpc/internal/m;Lio/grpc/internal/o;Lvi/i0;Lvi/f;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lvi/x;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/grpc/internal/k$a;",
            "Lio/grpc/internal/t;",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            "Leb/v<",
            "Leb/t;",
            ">;",
            "Lvi/k1;",
            "Lio/grpc/internal/x0$j;",
            "Lvi/c0;",
            "Lio/grpc/internal/m;",
            "Lio/grpc/internal/o;",
            "Lvi/i0;",
            "Lvi/f;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lio/grpc/internal/x0;->t:Ljava/util/Collection;

    new-instance v2, Lio/grpc/internal/x0$a;

    invoke-direct {v2, p0}, Lio/grpc/internal/x0$a;-><init>(Lio/grpc/internal/x0;)V

    iput-object v2, v0, Lio/grpc/internal/x0;->u:Lio/grpc/internal/v0;

    sget-object v2, Lvi/p;->IDLE:Lvi/p;

    invoke-static {v2}, Lvi/q;->a(Lvi/p;)Lvi/q;

    move-result-object v2

    iput-object v2, v0, Lio/grpc/internal/x0;->x:Lvi/q;

    const-string v2, "addressGroups"

    invoke-static {p1, v2}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    const-string v3, "addressGroups is empty"

    invoke-static {v2, v3}, Leb/o;->e(ZLjava/lang/Object;)V

    const-string v2, "addressGroups contains null entry"

    invoke-static {p1, v2}, Lio/grpc/internal/x0;->L(Ljava/util/List;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    iput-object v1, v0, Lio/grpc/internal/x0;->n:Ljava/util/List;

    new-instance v2, Lio/grpc/internal/x0$k;

    invoke-direct {v2, v1}, Lio/grpc/internal/x0$k;-><init>(Ljava/util/List;)V

    iput-object v2, v0, Lio/grpc/internal/x0;->m:Lio/grpc/internal/x0$k;

    move-object v1, p2

    iput-object v1, v0, Lio/grpc/internal/x0;->b:Ljava/lang/String;

    move-object v1, p3

    iput-object v1, v0, Lio/grpc/internal/x0;->c:Ljava/lang/String;

    move-object v1, p4

    iput-object v1, v0, Lio/grpc/internal/x0;->d:Lio/grpc/internal/k$a;

    move-object v1, p5

    iput-object v1, v0, Lio/grpc/internal/x0;->f:Lio/grpc/internal/t;

    move-object v1, p6

    iput-object v1, v0, Lio/grpc/internal/x0;->g:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p7}, Leb/v;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/t;

    iput-object v1, v0, Lio/grpc/internal/x0;->p:Leb/t;

    move-object v1, p8

    iput-object v1, v0, Lio/grpc/internal/x0;->l:Lvi/k1;

    move-object v1, p9

    iput-object v1, v0, Lio/grpc/internal/x0;->e:Lio/grpc/internal/x0$j;

    move-object v1, p10

    iput-object v1, v0, Lio/grpc/internal/x0;->h:Lvi/c0;

    move-object v1, p11

    iput-object v1, v0, Lio/grpc/internal/x0;->i:Lio/grpc/internal/m;

    const-string v1, "channelTracer"

    move-object/from16 v2, p12

    invoke-static {v2, v1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/grpc/internal/o;

    iput-object v1, v0, Lio/grpc/internal/x0;->j:Lio/grpc/internal/o;

    const-string v1, "logId"

    move-object/from16 v2, p13

    invoke-static {v2, v1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvi/i0;

    iput-object v1, v0, Lio/grpc/internal/x0;->a:Lvi/i0;

    const-string v1, "channelLogger"

    move-object/from16 v2, p14

    invoke-static {v2, v1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvi/f;

    iput-object v1, v0, Lio/grpc/internal/x0;->k:Lvi/f;

    return-void
.end method

.method static synthetic A(Lio/grpc/internal/x0;Lio/grpc/internal/v;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/x0;->P(Lio/grpc/internal/v;Z)V

    return-void
.end method

.method static synthetic B(Lio/grpc/internal/x0;Lvi/g1;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/x0;->Q(Lvi/g1;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method static synthetic C(Lio/grpc/internal/x0;Lvi/g1;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/x0;->R(Lvi/g1;)V

    return-void
.end method

.method static synthetic D(Lio/grpc/internal/x0;)Lvi/c0;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x0;->h:Lvi/c0;

    return-object p0
.end method

.method static synthetic E(Lio/grpc/internal/x0;Lvi/p;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/x0;->M(Lvi/p;)V

    return-void
.end method

.method static synthetic F(Lio/grpc/internal/x0;)V
    .locals 0

    invoke-direct {p0}, Lio/grpc/internal/x0;->S()V

    return-void
.end method

.method static synthetic G(Lio/grpc/internal/x0;Lvi/k1$d;)Lvi/k1$d;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0;->q:Lvi/k1$d;

    return-object p1
.end method

.method static synthetic H(Lio/grpc/internal/x0;)V
    .locals 0

    invoke-direct {p0}, Lio/grpc/internal/x0;->K()V

    return-void
.end method

.method static synthetic I(Lio/grpc/internal/x0;)Lio/grpc/internal/x0$k;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x0;->m:Lio/grpc/internal/x0$k;

    return-object p0
.end method

.method static synthetic J(Lio/grpc/internal/x0;Ljava/util/List;)Ljava/util/List;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0;->n:Ljava/util/List;

    return-object p1
.end method

.method private K()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/x0;->l:Lvi/k1;

    invoke-virtual {v0}, Lvi/k1;->e()V

    iget-object v0, p0, Lio/grpc/internal/x0;->q:Lvi/k1$d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lvi/k1$d;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/grpc/internal/x0;->q:Lvi/k1$d;

    iput-object v0, p0, Lio/grpc/internal/x0;->o:Lio/grpc/internal/k;

    :cond_0
    return-void
.end method

.method private static L(Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private M(Lvi/p;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/x0;->l:Lvi/k1;

    invoke-virtual {v0}, Lvi/k1;->e()V

    invoke-static {p1}, Lvi/q;->a(Lvi/p;)Lvi/q;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/grpc/internal/x0;->N(Lvi/q;)V

    return-void
.end method

.method private N(Lvi/q;)V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/x0;->l:Lvi/k1;

    invoke-virtual {v0}, Lvi/k1;->e()V

    iget-object v0, p0, Lio/grpc/internal/x0;->x:Lvi/q;

    invoke-virtual {v0}, Lvi/q;->c()Lvi/p;

    move-result-object v0

    invoke-virtual {p1}, Lvi/q;->c()Lvi/p;

    move-result-object v1

    if-eq v0, v1, :cond_1

    iget-object v0, p0, Lio/grpc/internal/x0;->x:Lvi/q;

    invoke-virtual {v0}, Lvi/q;->c()Lvi/p;

    move-result-object v0

    sget-object v1, Lvi/p;->SHUTDOWN:Lvi/p;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Cannot transition out of SHUTDOWN to "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Leb/o;->v(ZLjava/lang/Object;)V

    iput-object p1, p0, Lio/grpc/internal/x0;->x:Lvi/q;

    iget-object v0, p0, Lio/grpc/internal/x0;->e:Lio/grpc/internal/x0$j;

    invoke-virtual {v0, p0, p1}, Lio/grpc/internal/x0$j;->c(Lio/grpc/internal/x0;Lvi/q;)V

    :cond_1
    return-void
.end method

.method private O()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/x0;->l:Lvi/k1;

    new-instance v1, Lio/grpc/internal/x0$f;

    invoke-direct {v1, p0}, Lio/grpc/internal/x0$f;-><init>(Lio/grpc/internal/x0;)V

    invoke-virtual {v0, v1}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private P(Lio/grpc/internal/v;Z)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/x0;->l:Lvi/k1;

    new-instance v1, Lio/grpc/internal/x0$g;

    invoke-direct {v1, p0, p1, p2}, Lio/grpc/internal/x0$g;-><init>(Lio/grpc/internal/x0;Lio/grpc/internal/v;Z)V

    invoke-virtual {v0, v1}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private Q(Lvi/g1;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lvi/g1;->n()Lvi/g1$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lvi/g1;->o()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lvi/g1;->o()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p1}, Lvi/g1;->m()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lvi/g1;->m()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private R(Lvi/g1;)V
    .locals 9

    iget-object v0, p0, Lio/grpc/internal/x0;->l:Lvi/k1;

    invoke-virtual {v0}, Lvi/k1;->e()V

    invoke-static {p1}, Lvi/q;->b(Lvi/g1;)Lvi/q;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/grpc/internal/x0;->N(Lvi/q;)V

    iget-object v0, p0, Lio/grpc/internal/x0;->o:Lio/grpc/internal/k;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/x0;->d:Lio/grpc/internal/k$a;

    invoke-interface {v0}, Lio/grpc/internal/k$a;->get()Lio/grpc/internal/k;

    move-result-object v0

    iput-object v0, p0, Lio/grpc/internal/x0;->o:Lio/grpc/internal/k;

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/x0;->o:Lio/grpc/internal/k;

    invoke-interface {v0}, Lio/grpc/internal/k;->a()J

    move-result-wide v0

    iget-object v2, p0, Lio/grpc/internal/x0;->p:Leb/t;

    sget-object v7, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v2, v7}, Leb/t;->d(Ljava/util/concurrent/TimeUnit;)J

    move-result-wide v2

    sub-long v5, v0, v2

    iget-object v0, p0, Lio/grpc/internal/x0;->k:Lvi/f;

    sget-object v1, Lvi/f$a;->INFO:Lvi/f$a;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    invoke-direct {p0, p1}, Lio/grpc/internal/x0;->Q(Lvi/g1;)Ljava/lang/String;

    move-result-object p1

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 v4, 0x1

    aput-object p1, v2, v4

    const-string p1, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns"

    invoke-virtual {v0, v1, p1, v2}, Lvi/f;->b(Lvi/f$a;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lio/grpc/internal/x0;->q:Lvi/k1$d;

    if-nez p1, :cond_1

    move v3, v4

    :cond_1
    const-string p1, "previous reconnectTask is not done"

    invoke-static {v3, p1}, Leb/o;->v(ZLjava/lang/Object;)V

    iget-object v3, p0, Lio/grpc/internal/x0;->l:Lvi/k1;

    new-instance v4, Lio/grpc/internal/x0$b;

    invoke-direct {v4, p0}, Lio/grpc/internal/x0$b;-><init>(Lio/grpc/internal/x0;)V

    iget-object v8, p0, Lio/grpc/internal/x0;->g:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual/range {v3 .. v8}, Lvi/k1;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lvi/k1$d;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/x0;->q:Lvi/k1$d;

    return-void
.end method

.method private S()V
    .locals 8

    iget-object v0, p0, Lio/grpc/internal/x0;->l:Lvi/k1;

    invoke-virtual {v0}, Lvi/k1;->e()V

    iget-object v0, p0, Lio/grpc/internal/x0;->q:Lvi/k1$d;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    const-string v3, "Should have no reconnectTask scheduled"

    invoke-static {v0, v3}, Leb/o;->v(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/x0;->m:Lio/grpc/internal/x0$k;

    invoke-virtual {v0}, Lio/grpc/internal/x0$k;->d()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/x0;->p:Leb/t;

    invoke-virtual {v0}, Leb/t;->f()Leb/t;

    move-result-object v0

    invoke-virtual {v0}, Leb/t;->g()Leb/t;

    :cond_1
    iget-object v0, p0, Lio/grpc/internal/x0;->m:Lio/grpc/internal/x0$k;

    invoke-virtual {v0}, Lio/grpc/internal/x0$k;->a()Ljava/net/SocketAddress;

    move-result-object v0

    instance-of v3, v0, Lvi/b0;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    check-cast v0, Lvi/b0;

    invoke-virtual {v0}, Lvi/b0;->c()Ljava/net/InetSocketAddress;

    move-result-object v3

    goto :goto_1

    :cond_2
    move-object v3, v0

    move-object v0, v4

    :goto_1
    iget-object v5, p0, Lio/grpc/internal/x0;->m:Lio/grpc/internal/x0$k;

    invoke-virtual {v5}, Lio/grpc/internal/x0$k;->b()Lvi/a;

    move-result-object v5

    sget-object v6, Lvi/x;->d:Lvi/a$c;

    invoke-virtual {v5, v6}, Lvi/a;->b(Lvi/a$c;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    new-instance v7, Lio/grpc/internal/t$a;

    invoke-direct {v7}, Lio/grpc/internal/t$a;-><init>()V

    if-eqz v6, :cond_3

    goto :goto_2

    :cond_3
    iget-object v6, p0, Lio/grpc/internal/x0;->b:Ljava/lang/String;

    :goto_2
    invoke-virtual {v7, v6}, Lio/grpc/internal/t$a;->e(Ljava/lang/String;)Lio/grpc/internal/t$a;

    move-result-object v6

    invoke-virtual {v6, v5}, Lio/grpc/internal/t$a;->f(Lvi/a;)Lio/grpc/internal/t$a;

    move-result-object v5

    iget-object v6, p0, Lio/grpc/internal/x0;->c:Ljava/lang/String;

    invoke-virtual {v5, v6}, Lio/grpc/internal/t$a;->h(Ljava/lang/String;)Lio/grpc/internal/t$a;

    move-result-object v5

    invoke-virtual {v5, v0}, Lio/grpc/internal/t$a;->g(Lvi/b0;)Lio/grpc/internal/t$a;

    move-result-object v0

    new-instance v5, Lio/grpc/internal/x0$m;

    invoke-direct {v5}, Lio/grpc/internal/x0$m;-><init>()V

    invoke-virtual {p0}, Lio/grpc/internal/x0;->e()Lvi/i0;

    move-result-object v6

    iput-object v6, v5, Lio/grpc/internal/x0$m;->a:Lvi/i0;

    new-instance v6, Lio/grpc/internal/x0$i;

    iget-object v7, p0, Lio/grpc/internal/x0;->f:Lio/grpc/internal/t;

    invoke-interface {v7, v3, v0, v5}, Lio/grpc/internal/t;->h1(Ljava/net/SocketAddress;Lio/grpc/internal/t$a;Lvi/f;)Lio/grpc/internal/v;

    move-result-object v0

    iget-object v7, p0, Lio/grpc/internal/x0;->i:Lio/grpc/internal/m;

    invoke-direct {v6, v0, v7, v4}, Lio/grpc/internal/x0$i;-><init>(Lio/grpc/internal/v;Lio/grpc/internal/m;Lio/grpc/internal/x0$a;)V

    invoke-interface {v6}, Lvi/n0;->e()Lvi/i0;

    move-result-object v0

    iput-object v0, v5, Lio/grpc/internal/x0$m;->a:Lvi/i0;

    iget-object v0, p0, Lio/grpc/internal/x0;->h:Lvi/c0;

    invoke-virtual {v0, v6}, Lvi/c0;->c(Lvi/h0;)V

    iput-object v6, p0, Lio/grpc/internal/x0;->v:Lio/grpc/internal/v;

    iget-object v0, p0, Lio/grpc/internal/x0;->t:Ljava/util/Collection;

    invoke-interface {v0, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    new-instance v0, Lio/grpc/internal/x0$l;

    invoke-direct {v0, p0, v6, v3}, Lio/grpc/internal/x0$l;-><init>(Lio/grpc/internal/x0;Lio/grpc/internal/v;Ljava/net/SocketAddress;)V

    invoke-interface {v6, v0}, Lio/grpc/internal/j1;->g(Lio/grpc/internal/j1$a;)Ljava/lang/Runnable;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v3, p0, Lio/grpc/internal/x0;->l:Lvi/k1;

    invoke-virtual {v3, v0}, Lvi/k1;->b(Ljava/lang/Runnable;)V

    :cond_4
    iget-object v0, p0, Lio/grpc/internal/x0;->k:Lvi/f;

    sget-object v3, Lvi/f$a;->INFO:Lvi/f$a;

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v4, v5, Lio/grpc/internal/x0$m;->a:Lvi/i0;

    aput-object v4, v1, v2

    const-string v2, "Started transport {0}"

    invoke-virtual {v0, v3, v2, v1}, Lvi/f;->b(Lvi/f$a;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method static synthetic h(Lio/grpc/internal/x0;)Lio/grpc/internal/x0$j;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x0;->e:Lio/grpc/internal/x0$j;

    return-object p0
.end method

.method static synthetic i(Lio/grpc/internal/x0;)Lvi/q;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x0;->x:Lvi/q;

    return-object p0
.end method

.method static synthetic j(Lio/grpc/internal/x0;)Lio/grpc/internal/j1;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x0;->w:Lio/grpc/internal/j1;

    return-object p0
.end method

.method static synthetic k(Lio/grpc/internal/x0;Lio/grpc/internal/j1;)Lio/grpc/internal/j1;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0;->w:Lio/grpc/internal/j1;

    return-object p1
.end method

.method static synthetic l(Lio/grpc/internal/x0;)Lio/grpc/internal/v;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x0;->v:Lio/grpc/internal/v;

    return-object p0
.end method

.method static synthetic m(Lio/grpc/internal/x0;Lio/grpc/internal/v;)Lio/grpc/internal/v;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0;->v:Lio/grpc/internal/v;

    return-object p1
.end method

.method static synthetic n(Lio/grpc/internal/x0;)Lvi/k1$d;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x0;->r:Lvi/k1$d;

    return-object p0
.end method

.method static synthetic o(Lio/grpc/internal/x0;Lvi/k1$d;)Lvi/k1$d;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0;->r:Lvi/k1$d;

    return-object p1
.end method

.method static synthetic p(Lio/grpc/internal/x0;)Lio/grpc/internal/j1;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x0;->s:Lio/grpc/internal/j1;

    return-object p0
.end method

.method static synthetic q(Lio/grpc/internal/x0;Lio/grpc/internal/j1;)Lio/grpc/internal/j1;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0;->s:Lio/grpc/internal/j1;

    return-object p1
.end method

.method static synthetic r(Lio/grpc/internal/x0;)Ljava/util/concurrent/ScheduledExecutorService;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x0;->g:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method static synthetic s(Lio/grpc/internal/x0;)Lvi/k1;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x0;->l:Lvi/k1;

    return-object p0
.end method

.method static synthetic t(Lio/grpc/internal/x0;)Lvi/g1;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x0;->y:Lvi/g1;

    return-object p0
.end method

.method static synthetic u(Lio/grpc/internal/x0;Lvi/g1;)Lvi/g1;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0;->y:Lvi/g1;

    return-object p1
.end method

.method static synthetic v(Lio/grpc/internal/x0;)Ljava/util/Collection;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x0;->t:Ljava/util/Collection;

    return-object p0
.end method

.method static synthetic w(Lio/grpc/internal/x0;)V
    .locals 0

    invoke-direct {p0}, Lio/grpc/internal/x0;->O()V

    return-void
.end method

.method static synthetic x(Lio/grpc/internal/x0;)Lio/grpc/internal/v0;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x0;->u:Lio/grpc/internal/v0;

    return-object p0
.end method

.method static synthetic y(Lio/grpc/internal/x0;)Lvi/f;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/x0;->k:Lvi/f;

    return-object p0
.end method

.method static synthetic z(Lio/grpc/internal/x0;Lio/grpc/internal/k;)Lio/grpc/internal/k;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0;->o:Lio/grpc/internal/k;

    return-object p1
.end method


# virtual methods
.method public T(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lvi/x;",
            ">;)V"
        }
    .end annotation

    const-string v0, "newAddressGroups"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "newAddressGroups contains null entry"

    invoke-static {p1, v0}, Lio/grpc/internal/x0;->L(Ljava/util/List;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "newAddressGroups is empty"

    invoke-static {v0, v1}, Leb/o;->e(ZLjava/lang/Object;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lio/grpc/internal/x0;->l:Lvi/k1;

    new-instance v1, Lio/grpc/internal/x0$d;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/x0$d;-><init>(Lio/grpc/internal/x0;Ljava/util/List;)V

    invoke-virtual {v0, v1}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a()Lio/grpc/internal/s;
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/x0;->w:Lio/grpc/internal/j1;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/x0;->l:Lvi/k1;

    new-instance v1, Lio/grpc/internal/x0$c;

    invoke-direct {v1, p0}, Lio/grpc/internal/x0$c;-><init>(Lio/grpc/internal/x0;)V

    invoke-virtual {v0, v1}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method b(Lvi/g1;)V
    .locals 2

    invoke-virtual {p0, p1}, Lio/grpc/internal/x0;->d(Lvi/g1;)V

    iget-object v0, p0, Lio/grpc/internal/x0;->l:Lvi/k1;

    new-instance v1, Lio/grpc/internal/x0$h;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/x0$h;-><init>(Lio/grpc/internal/x0;Lvi/g1;)V

    invoke-virtual {v0, v1}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d(Lvi/g1;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/x0;->l:Lvi/k1;

    new-instance v1, Lio/grpc/internal/x0$e;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/x0$e;-><init>(Lio/grpc/internal/x0;Lvi/g1;)V

    invoke-virtual {v0, v1}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public e()Lvi/i0;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/x0;->a:Lvi/i0;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/x0;->a:Lvi/i0;

    invoke-virtual {v1}, Lvi/i0;->d()J

    move-result-wide v1

    const-string v3, "logId"

    invoke-virtual {v0, v3, v1, v2}, Leb/i$b;->c(Ljava/lang/String;J)Leb/i$b;

    move-result-object v0

    const-string v1, "addressGroups"

    iget-object v2, p0, Lio/grpc/internal/x0;->n:Ljava/util/List;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
