.class public Lhc/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lhc/j;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Ljava/util/concurrent/ScheduledExecutorService;

.field private volatile d:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private volatile e:J


# direct methods
.method constructor <init>(Lhc/j;Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 0
    .param p2    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/c;
        .end annotation
    .end param
    .param p3    # Ljava/util/concurrent/ScheduledExecutorService;
        .annotation build Ldc/b;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lhc/j;

    iput-object p1, p0, Lhc/m;->a:Lhc/j;

    iput-object p2, p0, Lhc/m;->b:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lhc/m;->c:Ljava/util/concurrent/ScheduledExecutorService;

    const-wide/16 p1, -0x1

    iput-wide p1, p0, Lhc/m;->e:J

    return-void
.end method

.method public static synthetic a(Lhc/m;)V
    .locals 0

    invoke-direct {p0}, Lhc/m;->f()V

    return-void
.end method

.method public static synthetic b(Lhc/m;Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0, p1}, Lhc/m;->e(Ljava/lang/Exception;)V

    return-void
.end method

.method private d()J
    .locals 6

    iget-wide v0, p0, Lhc/m;->e:J

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const-wide/16 v0, 0x1e

    return-wide v0

    :cond_0
    iget-wide v0, p0, Lhc/m;->e:J

    const-wide/16 v2, 0x2

    mul-long/2addr v0, v2

    const-wide/16 v4, 0x3c0

    cmp-long v0, v0, v4

    if-gez v0, :cond_1

    iget-wide v0, p0, Lhc/m;->e:J

    mul-long/2addr v0, v2

    return-wide v0

    :cond_1
    return-wide v4
.end method

.method private synthetic e(Ljava/lang/Exception;)V
    .locals 0

    invoke-direct {p0}, Lhc/m;->h()V

    return-void
.end method

.method private f()V
    .locals 3

    iget-object v0, p0, Lhc/m;->a:Lhc/j;

    invoke-virtual {v0}, Lhc/j;->p()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lhc/m;->b:Ljava/util/concurrent/Executor;

    new-instance v2, Lhc/l;

    invoke-direct {v2, p0}, Lhc/l;-><init>(Lhc/m;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnFailureListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnFailureListener;)Lcom/google/android/gms/tasks/Task;

    return-void
.end method

.method private h()V
    .locals 5

    invoke-virtual {p0}, Lhc/m;->c()V

    invoke-direct {p0}, Lhc/m;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lhc/m;->e:J

    iget-object v0, p0, Lhc/m;->c:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lhc/k;

    invoke-direct {v1, p0}, Lhc/k;-><init>(Lhc/m;)V

    iget-wide v2, p0, Lhc/m;->e:J

    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    iput-object v0, p0, Lhc/m;->d:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, Lhc/m;->d:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lhc/m;->d:Ljava/util/concurrent/ScheduledFuture;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lhc/m;->d:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_0
    return-void
.end method

.method public g(J)V
    .locals 4

    invoke-virtual {p0}, Lhc/m;->c()V

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lhc/m;->e:J

    iget-object v0, p0, Lhc/m;->c:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v1, Lhc/k;

    invoke-direct {v1, p0}, Lhc/k;-><init>(Lhc/m;)V

    const-wide/16 v2, 0x0

    invoke-static {v2, v3, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide p1

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, p1, p2, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lhc/m;->d:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method
