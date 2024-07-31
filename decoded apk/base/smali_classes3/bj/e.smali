.class public final Lbj/e;
.super Lvi/p0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbj/e$g;,
        Lbj/e$f;,
        Lbj/e$k;,
        Lbj/e$j;,
        Lbj/e$c;,
        Lbj/e$b;,
        Lbj/e$h;,
        Lbj/e$i;,
        Lbj/e$d;,
        Lbj/e$e;
    }
.end annotation


# static fields
.field private static final k:Lvi/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/a$c<",
            "Lbj/e$b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final c:Lbj/e$c;

.field private final d:Lvi/k1;

.field private final e:Lvi/p0$d;

.field private final f:Lbj/d;

.field private g:Lio/grpc/internal/k2;

.field private final h:Ljava/util/concurrent/ScheduledExecutorService;

.field private i:Lvi/k1$d;

.field private j:Ljava/lang/Long;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "addressTrackerKey"

    invoke-static {v0}, Lvi/a$c;->a(Ljava/lang/String;)Lvi/a$c;

    move-result-object v0

    sput-object v0, Lbj/e;->k:Lvi/a$c;

    return-void
.end method

.method public constructor <init>(Lvi/p0$d;Lio/grpc/internal/k2;)V
    .locals 2

    invoke-direct {p0}, Lvi/p0;-><init>()V

    new-instance v0, Lbj/e$d;

    const-string v1, "helper"

    invoke-static {p1, v1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvi/p0$d;

    invoke-direct {v0, p0, v1}, Lbj/e$d;-><init>(Lbj/e;Lvi/p0$d;)V

    iput-object v0, p0, Lbj/e;->e:Lvi/p0$d;

    new-instance v1, Lbj/d;

    invoke-direct {v1, v0}, Lbj/d;-><init>(Lvi/p0$d;)V

    iput-object v1, p0, Lbj/e;->f:Lbj/d;

    new-instance v0, Lbj/e$c;

    invoke-direct {v0}, Lbj/e$c;-><init>()V

    iput-object v0, p0, Lbj/e;->c:Lbj/e$c;

    invoke-virtual {p1}, Lvi/p0$d;->d()Lvi/k1;

    move-result-object v0

    const-string v1, "syncContext"

    invoke-static {v0, v1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvi/k1;

    iput-object v0, p0, Lbj/e;->d:Lvi/k1;

    invoke-virtual {p1}, Lvi/p0$d;->c()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object p1

    const-string v0, "timeService"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p1, p0, Lbj/e;->h:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p2, p0, Lbj/e;->g:Lio/grpc/internal/k2;

    return-void
.end method

.method static synthetic f(Lbj/e;)Ljava/lang/Long;
    .locals 0

    iget-object p0, p0, Lbj/e;->j:Ljava/lang/Long;

    return-object p0
.end method

.method static synthetic g(Lbj/e;Ljava/lang/Long;)Ljava/lang/Long;
    .locals 0

    iput-object p1, p0, Lbj/e;->j:Ljava/lang/Long;

    return-object p1
.end method

.method static synthetic h(Lbj/e;)Lio/grpc/internal/k2;
    .locals 0

    iget-object p0, p0, Lbj/e;->g:Lio/grpc/internal/k2;

    return-object p0
.end method

.method static synthetic i(Ljava/util/List;)Z
    .locals 0

    invoke-static {p0}, Lbj/e;->l(Ljava/util/List;)Z

    move-result p0

    return p0
.end method

.method static synthetic j()Lvi/a$c;
    .locals 1

    sget-object v0, Lbj/e;->k:Lvi/a$c;

    return-object v0
.end method

.method static synthetic k(Lbj/e$c;I)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lbj/e;->m(Lbj/e$c;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static l(Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lvi/x;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvi/x;

    invoke-virtual {v2}, Lvi/x;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/2addr v1, v2

    if-le v1, v3, :cond_0

    return v0

    :cond_1
    return v3
.end method

.method private static m(Lbj/e$c;I)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbj/e$c;",
            "I)",
            "Ljava/util/List<",
            "Lbj/e$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lcom/google/common/collect/r;->values()Ljava/util/Collection;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbj/e$b;

    invoke-virtual {v1}, Lbj/e$b;->f()J

    move-result-wide v2

    int-to-long v4, p1

    cmp-long v2, v2, v4

    if-ltz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method public a(Lvi/p0$g;)Z
    .locals 11

    invoke-virtual {p1}, Lvi/p0$g;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbj/e$g;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Lvi/p0$g;->a()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvi/x;

    invoke-virtual {v3}, Lvi/x;->a()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lbj/e;->c:Lbj/e$c;

    invoke-virtual {v2}, Lcom/google/common/collect/r;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Set;->retainAll(Ljava/util/Collection;)Z

    iget-object v2, p0, Lbj/e;->c:Lbj/e$c;

    invoke-virtual {v2, v0}, Lbj/e$c;->m(Lbj/e$g;)V

    iget-object v2, p0, Lbj/e;->c:Lbj/e$c;

    invoke-virtual {v2, v0, v1}, Lbj/e$c;->j(Lbj/e$g;Ljava/util/Collection;)V

    iget-object v1, p0, Lbj/e;->f:Lbj/d;

    iget-object v2, v0, Lbj/e$g;->g:Lio/grpc/internal/d2$b;

    invoke-virtual {v2}, Lio/grpc/internal/d2$b;->b()Lvi/q0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lbj/d;->q(Lvi/p0$c;)V

    invoke-virtual {v0}, Lbj/e$g;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lbj/e;->j:Ljava/lang/Long;

    if-nez v1, :cond_1

    iget-object v1, v0, Lbj/e$g;->a:Ljava/lang/Long;

    goto :goto_1

    :cond_1
    iget-object v1, v0, Lbj/e$g;->a:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    iget-object v3, p0, Lbj/e;->g:Lio/grpc/internal/k2;

    invoke-interface {v3}, Lio/grpc/internal/k2;->a()J

    move-result-wide v3

    iget-object v5, p0, Lbj/e;->j:Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    sub-long/2addr v3, v5

    sub-long/2addr v1, v3

    const-wide/16 v3, 0x0

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    :goto_1
    iget-object v2, p0, Lbj/e;->i:Lvi/k1$d;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lvi/k1$d;->a()V

    iget-object v2, p0, Lbj/e;->c:Lbj/e$c;

    invoke-virtual {v2}, Lbj/e$c;->k()V

    :cond_2
    iget-object v3, p0, Lbj/e;->d:Lvi/k1;

    new-instance v4, Lbj/e$e;

    invoke-direct {v4, p0, v0}, Lbj/e$e;-><init>(Lbj/e;Lbj/e$g;)V

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    iget-object v1, v0, Lbj/e$g;->a:Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    sget-object v9, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v10, p0, Lbj/e;->h:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-virtual/range {v3 .. v10}, Lvi/k1;->d(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lvi/k1$d;

    move-result-object v1

    iput-object v1, p0, Lbj/e;->i:Lvi/k1$d;

    goto :goto_2

    :cond_3
    iget-object v1, p0, Lbj/e;->i:Lvi/k1$d;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lvi/k1$d;->a()V

    const/4 v1, 0x0

    iput-object v1, p0, Lbj/e;->j:Ljava/lang/Long;

    iget-object v1, p0, Lbj/e;->c:Lbj/e$c;

    invoke-virtual {v1}, Lbj/e$c;->f()V

    :cond_4
    :goto_2
    iget-object v1, p0, Lbj/e;->f:Lbj/d;

    invoke-virtual {p1}, Lvi/p0$g;->e()Lvi/p0$g$a;

    move-result-object p1

    iget-object v0, v0, Lbj/e$g;->g:Lio/grpc/internal/d2$b;

    invoke-virtual {v0}, Lio/grpc/internal/d2$b;->a()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lvi/p0$g$a;->d(Ljava/lang/Object;)Lvi/p0$g$a;

    move-result-object p1

    invoke-virtual {p1}, Lvi/p0$g$a;->a()Lvi/p0$g;

    move-result-object p1

    invoke-virtual {v1, p1}, Lbj/a;->d(Lvi/p0$g;)V

    const/4 p1, 0x1

    return p1
.end method

.method public c(Lvi/g1;)V
    .locals 1

    iget-object v0, p0, Lbj/e;->f:Lbj/d;

    invoke-virtual {v0, p1}, Lbj/a;->c(Lvi/g1;)V

    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lbj/e;->f:Lbj/d;

    invoke-virtual {v0}, Lbj/d;->e()V

    return-void
.end method
