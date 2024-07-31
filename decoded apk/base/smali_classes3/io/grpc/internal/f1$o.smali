.class final Lio/grpc/internal/f1$o;
.super Lvi/y0$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "o"
.end annotation


# instance fields
.field final a:Lio/grpc/internal/f1$n;

.field final b:Lvi/y0;

.field final synthetic c:Lio/grpc/internal/f1;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1;Lio/grpc/internal/f1$n;Lvi/y0;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-direct {p0}, Lvi/y0$e;-><init>()V

    const-string p1, "helperImpl"

    invoke-static {p2, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/f1$n;

    iput-object p1, p0, Lio/grpc/internal/f1$o;->a:Lio/grpc/internal/f1$n;

    const-string p1, "resolver"

    invoke-static {p3, p1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvi/y0;

    iput-object p1, p0, Lio/grpc/internal/f1$o;->b:Lvi/y0;

    return-void
.end method

.method static synthetic d(Lio/grpc/internal/f1$o;)V
    .locals 0

    invoke-direct {p0}, Lio/grpc/internal/f1$o;->g()V

    return-void
.end method

.method static synthetic e(Lio/grpc/internal/f1$o;Lvi/g1;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/f1$o;->f(Lvi/g1;)V

    return-void
.end method

.method private f(Lvi/g1;)V
    .locals 6

    sget-object v0, Lio/grpc/internal/f1;->n0:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget-object v3, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-virtual {v3}, Lio/grpc/internal/f1;->e()Lvi/i0;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    const/4 v3, 0x1

    aput-object p1, v2, v3

    const-string v5, "[{0}] Failed to resolve name. status={1}"

    invoke-virtual {v0, v1, v5, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->k0(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$p;

    move-result-object v0

    invoke-virtual {v0}, Lio/grpc/internal/f1$p;->m()V

    iget-object v0, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->d0(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$q;

    move-result-object v0

    sget-object v1, Lio/grpc/internal/f1$q;->ERROR:Lio/grpc/internal/f1$q;

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->z(Lio/grpc/internal/f1;)Lvi/f;

    move-result-object v0

    sget-object v2, Lvi/f$a;->WARNING:Lvi/f$a;

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v4

    const-string v4, "Failed to resolve name: {0}"

    invoke-virtual {v0, v2, v4, v3}, Lvi/f;->b(Lvi/f$a;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v0, v1}, Lio/grpc/internal/f1;->e0(Lio/grpc/internal/f1;Lio/grpc/internal/f1$q;)Lio/grpc/internal/f1$q;

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$o;->a:Lio/grpc/internal/f1$n;

    iget-object v1, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v1}, Lio/grpc/internal/f1;->q0(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$n;

    move-result-object v1

    if-eq v0, v1, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lio/grpc/internal/f1$o;->a:Lio/grpc/internal/f1$n;

    iget-object v0, v0, Lio/grpc/internal/f1$n;->a:Lio/grpc/internal/j$b;

    invoke-virtual {v0, p1}, Lio/grpc/internal/j$b;->b(Lvi/g1;)V

    invoke-direct {p0}, Lio/grpc/internal/f1$o;->g()V

    return-void
.end method

.method private g()V
    .locals 7

    iget-object v0, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->j(Lio/grpc/internal/f1;)Lvi/k1$d;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->j(Lio/grpc/internal/f1;)Lvi/k1$d;

    move-result-object v0

    invoke-virtual {v0}, Lvi/k1$d;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->f0(Lio/grpc/internal/f1;)Lio/grpc/internal/k;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->Z(Lio/grpc/internal/f1;)Lio/grpc/internal/k$a;

    move-result-object v1

    invoke-interface {v1}, Lio/grpc/internal/k$a;->get()Lio/grpc/internal/k;

    move-result-object v1

    invoke-static {v0, v1}, Lio/grpc/internal/f1;->g0(Lio/grpc/internal/f1;Lio/grpc/internal/k;)Lio/grpc/internal/k;

    :cond_1
    iget-object v0, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->f0(Lio/grpc/internal/f1;)Lio/grpc/internal/k;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/k;->a()J

    move-result-wide v3

    iget-object v0, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->z(Lio/grpc/internal/f1;)Lvi/f;

    move-result-object v0

    sget-object v1, Lvi/f$a;->DEBUG:Lvi/f$a;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    aput-object v6, v2, v5

    const-string v5, "Scheduling DNS resolution backoff for {0} ns"

    invoke-virtual {v0, v1, v5, v2}, Lvi/f;->b(Lvi/f$a;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    iget-object v1, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    new-instance v2, Lio/grpc/internal/f1$i;

    invoke-direct {v2, v0}, Lio/grpc/internal/f1$i;-><init>(Lio/grpc/internal/f1;)V

    sget-object v5, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    iget-object v6, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    invoke-static {v6}, Lio/grpc/internal/f1;->w(Lio/grpc/internal/f1;)Lio/grpc/internal/t;

    move-result-object v6

    invoke-interface {v6}, Lio/grpc/internal/t;->l0()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v6

    invoke-virtual/range {v1 .. v6}, Lvi/k1;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/ScheduledExecutorService;)Lvi/k1$d;

    move-result-object v1

    invoke-static {v0, v1}, Lio/grpc/internal/f1;->k(Lio/grpc/internal/f1;Lvi/k1$d;)Lvi/k1$d;

    return-void
.end method


# virtual methods
.method public b(Lvi/g1;)V
    .locals 2

    invoke-virtual {p1}, Lvi/g1;->p()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "the error status must not be OK"

    invoke-static {v0, v1}, Leb/o;->e(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    new-instance v1, Lio/grpc/internal/f1$o$a;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/f1$o$a;-><init>(Lio/grpc/internal/f1$o;Lvi/g1;)V

    invoke-virtual {v0, v1}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public c(Lvi/y0$g;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$o;->c:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->s:Lvi/k1;

    new-instance v1, Lio/grpc/internal/f1$o$b;

    invoke-direct {v1, p0, p1}, Lio/grpc/internal/f1$o$b;-><init>(Lio/grpc/internal/f1$o;Lvi/y0$g;)V

    invoke-virtual {v0, v1}, Lvi/k1;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
