.class public Lwe/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/perf/application/a$b;


# static fields
.field private static final C:Lre/a;

.field private static final D:Lwe/k;


# instance fields
.field private A:Ljava/lang/String;

.field private B:Z

.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lwe/c;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private d:Lzb/g;

.field private e:Loe/e;

.field private f:Lfe/f;

.field private r:Lee/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lee/b<",
            "Lf6/g;",
            ">;"
        }
    .end annotation
.end field

.field private s:Lwe/b;

.field private t:Ljava/util/concurrent/ExecutorService;

.field private u:Landroid/content/Context;

.field private v:Lcom/google/firebase/perf/config/a;

.field private w:Lwe/d;

.field private x:Lcom/google/firebase/perf/application/a;

.field private y:Lxe/c$b;

.field private z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lre/a;->e()Lre/a;

    move-result-object v0

    sput-object v0, Lwe/k;->C:Lre/a;

    new-instance v0, Lwe/k;

    invoke-direct {v0}, Lwe/k;-><init>()V

    sput-object v0, Lwe/k;->D:Lwe/k;

    return-void
.end method

.method private constructor <init>()V
    .locals 9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object v0, p0, Lwe/k;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lwe/k;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-boolean v1, p0, Lwe/k;->B:Z

    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    const/4 v3, 0x0

    const/4 v4, 0x1

    const-wide/16 v5, 0xa

    sget-object v7, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    new-instance v8, Ljava/util/concurrent/LinkedBlockingQueue;

    invoke-direct {v8}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>()V

    move-object v2, v0

    invoke-direct/range {v2 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V

    iput-object v0, p0, Lwe/k;->t:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lwe/k;->a:Ljava/util/Map;

    const/16 v1, 0x32

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "KEY_AVAILABLE_TRACES_FOR_CACHING"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v2, "KEY_AVAILABLE_GAUGES_FOR_CACHING"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private D(Lxe/i$b;Lxe/d;)Lxe/i;
    .locals 1

    invoke-direct {p0}, Lwe/k;->G()V

    iget-object v0, p0, Lwe/k;->y:Lxe/c$b;

    invoke-virtual {v0, p2}, Lxe/c$b;->M(Lxe/d;)Lxe/c$b;

    move-result-object p2

    invoke-virtual {p1}, Lxe/i$b;->m()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lxe/i$b;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p2}, Lcom/google/protobuf/x$a;->z()Lcom/google/protobuf/x$a;

    move-result-object p2

    check-cast p2, Lxe/c$b;

    invoke-direct {p0}, Lwe/k;->j()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p2, v0}, Lxe/c$b;->J(Ljava/util/Map;)Lxe/c$b;

    move-result-object p2

    :cond_1
    invoke-virtual {p1, p2}, Lxe/i$b;->I(Lxe/c$b;)Lxe/i$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object p1

    check-cast p1, Lxe/i;

    return-object p1
.end method

.method private E()V
    .locals 9

    iget-object v0, p0, Lwe/k;->d:Lzb/g;

    invoke-virtual {v0}, Lzb/g;->m()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lwe/k;->u:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lwe/k;->z:Ljava/lang/String;

    invoke-static {}, Lcom/google/firebase/perf/config/a;->g()Lcom/google/firebase/perf/config/a;

    move-result-object v0

    iput-object v0, p0, Lwe/k;->v:Lcom/google/firebase/perf/config/a;

    new-instance v0, Lwe/d;

    iget-object v1, p0, Lwe/k;->u:Landroid/content/Context;

    new-instance v8, Lcom/google/firebase/perf/util/i;

    const-wide/16 v3, 0x64

    const-wide/16 v5, 0x1

    sget-object v7, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    move-object v2, v8

    invoke-direct/range {v2 .. v7}, Lcom/google/firebase/perf/util/i;-><init>(JJLjava/util/concurrent/TimeUnit;)V

    const-wide/16 v2, 0x1f4

    invoke-direct {v0, v1, v8, v2, v3}, Lwe/d;-><init>(Landroid/content/Context;Lcom/google/firebase/perf/util/i;J)V

    iput-object v0, p0, Lwe/k;->w:Lwe/d;

    invoke-static {}, Lcom/google/firebase/perf/application/a;->b()Lcom/google/firebase/perf/application/a;

    move-result-object v0

    iput-object v0, p0, Lwe/k;->x:Lcom/google/firebase/perf/application/a;

    new-instance v0, Lwe/b;

    iget-object v1, p0, Lwe/k;->r:Lee/b;

    iget-object v2, p0, Lwe/k;->v:Lcom/google/firebase/perf/config/a;

    invoke-virtual {v2}, Lcom/google/firebase/perf/config/a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lwe/b;-><init>(Lee/b;Ljava/lang/String;)V

    iput-object v0, p0, Lwe/k;->s:Lwe/b;

    invoke-direct {p0}, Lwe/k;->h()V

    return-void
.end method

.method private F(Lxe/i$b;Lxe/d;)V
    .locals 4

    invoke-virtual {p0}, Lwe/k;->u()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lwe/k;->s(Lxe/j;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lwe/k;->C:Lre/a;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p1}, Lwe/k;->n(Lxe/j;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const-string v2, "Transport is not initialized yet, %s will be queued for to be dispatched later"

    invoke-virtual {v0, v2, v1}, Lre/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lwe/k;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    new-instance v1, Lwe/c;

    invoke-direct {v1, p1, p2}, Lwe/c;-><init>(Lxe/i$b;Lxe/d;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void

    :cond_1
    invoke-direct {p0, p1, p2}, Lwe/k;->D(Lxe/i$b;Lxe/d;)Lxe/i;

    move-result-object p1

    invoke-direct {p0, p1}, Lwe/k;->t(Lxe/i;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-direct {p0, p1}, Lwe/k;->g(Lxe/i;)V

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/perf/session/SessionManager;->stopGaugeCollectionIfSessionRunningTooLong()V

    :cond_2
    return-void
.end method

.method private G()V
    .locals 6

    iget-object v0, p0, Lwe/k;->v:Lcom/google/firebase/perf/config/a;

    invoke-virtual {v0}, Lcom/google/firebase/perf/config/a;->K()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lwe/k;->y:Lxe/c$b;

    invoke-virtual {v0}, Lxe/c$b;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lwe/k;->B:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    const/4 v1, 0x1

    :try_start_0
    iget-object v2, p0, Lwe/k;->f:Lfe/f;

    invoke-interface {v2}, Lfe/f;->getId()Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/32 v4, 0xea60

    invoke-static {v2, v4, v5, v3}, Lcom/google/android/gms/tasks/Tasks;->await(Lcom/google/android/gms/tasks/Task;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    sget-object v3, Lwe/k;->C:Lre/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    const-string v0, "Task to retrieve Installation Id is timed out: %s"

    invoke-virtual {v3, v0, v1}, Lre/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_1
    move-exception v2

    sget-object v3, Lwe/k;->C:Lre/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    const-string v0, "Task to retrieve Installation Id is interrupted: %s"

    invoke-virtual {v3, v0, v1}, Lre/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :catch_2
    move-exception v2

    sget-object v3, Lwe/k;->C:Lre/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    const-string v0, "Unable to retrieve Installation Id: %s"

    invoke-virtual {v3, v0, v1}, Lre/a;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    const/4 v2, 0x0

    :goto_1
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lwe/k;->y:Lxe/c$b;

    invoke-virtual {v0, v2}, Lxe/c$b;->L(Ljava/lang/String;)Lxe/c$b;

    goto :goto_2

    :cond_1
    sget-object v0, Lwe/k;->C:Lre/a;

    const-string v1, "Firebase Installation Id is empty, contact Firebase Support for debugging."

    invoke-virtual {v0, v1}, Lre/a;->j(Ljava/lang/String;)V

    :cond_2
    :goto_2
    return-void
.end method

.method private H()V
    .locals 1

    iget-object v0, p0, Lwe/k;->e:Loe/e;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lwe/k;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Loe/e;->c()Loe/e;

    move-result-object v0

    iput-object v0, p0, Lwe/k;->e:Loe/e;

    :cond_0
    return-void
.end method

.method public static synthetic a(Lwe/k;Lxe/g;Lxe/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lwe/k;->y(Lxe/g;Lxe/d;)V

    return-void
.end method

.method public static synthetic b(Lwe/k;)V
    .locals 0

    invoke-direct {p0}, Lwe/k;->E()V

    return-void
.end method

.method public static synthetic c(Lwe/k;Lwe/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lwe/k;->v(Lwe/c;)V

    return-void
.end method

.method public static synthetic d(Lwe/k;)V
    .locals 0

    invoke-direct {p0}, Lwe/k;->z()V

    return-void
.end method

.method public static synthetic e(Lwe/k;Lxe/h;Lxe/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lwe/k;->x(Lxe/h;Lxe/d;)V

    return-void
.end method

.method public static synthetic f(Lwe/k;Lxe/m;Lxe/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lwe/k;->w(Lxe/m;Lxe/d;)V

    return-void
.end method

.method private g(Lxe/i;)V
    .locals 5

    invoke-virtual {p1}, Lxe/i;->m()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    sget-object v0, Lwe/k;->C:Lre/a;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Lwe/k;->n(Lxe/j;)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v3, v1

    invoke-virtual {p1}, Lxe/i;->p()Lxe/m;

    move-result-object v1

    invoke-direct {p0, v1}, Lwe/k;->i(Lxe/m;)Ljava/lang/String;

    move-result-object v1

    aput-object v1, v3, v2

    const-string v1, "Logging %s. In a minute, visit the Firebase console to view your data: %s"

    invoke-virtual {v0, v1, v3}, Lre/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    sget-object v0, Lwe/k;->C:Lre/a;

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {p1}, Lwe/k;->n(Lxe/j;)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v1

    const-string v1, "Logging %s"

    invoke-virtual {v0, v1, v2}, Lre/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    iget-object v0, p0, Lwe/k;->s:Lwe/b;

    invoke-virtual {v0, p1}, Lwe/b;->b(Lxe/i;)V

    return-void
.end method

.method private h()V
    .locals 3

    iget-object v0, p0, Lwe/k;->x:Lcom/google/firebase/perf/application/a;

    new-instance v1, Ljava/lang/ref/WeakReference;

    sget-object v2, Lwe/k;->D:Lwe/k;

    invoke-direct {v1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lcom/google/firebase/perf/application/a;->k(Ljava/lang/ref/WeakReference;)V

    invoke-static {}, Lxe/c;->p0()Lxe/c$b;

    move-result-object v0

    iput-object v0, p0, Lwe/k;->y:Lxe/c$b;

    iget-object v1, p0, Lwe/k;->d:Lzb/g;

    invoke-virtual {v1}, Lzb/g;->r()Lzb/p;

    move-result-object v1

    invoke-virtual {v1}, Lzb/p;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxe/c$b;->N(Ljava/lang/String;)Lxe/c$b;

    move-result-object v0

    invoke-static {}, Lxe/a;->i0()Lxe/a$b;

    move-result-object v1

    iget-object v2, p0, Lwe/k;->z:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lxe/a$b;->I(Ljava/lang/String;)Lxe/a$b;

    move-result-object v1

    sget-object v2, Loe/a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lxe/a$b;->J(Ljava/lang/String;)Lxe/a$b;

    move-result-object v1

    iget-object v2, p0, Lwe/k;->u:Landroid/content/Context;

    invoke-static {v2}, Lwe/k;->p(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lxe/a$b;->K(Ljava/lang/String;)Lxe/a$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxe/c$b;->K(Lxe/a$b;)Lxe/c$b;

    iget-object v0, p0, Lwe/k;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_0
    :goto_0
    iget-object v0, p0, Lwe/k;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lwe/k;->b:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwe/c;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lwe/k;->t:Ljava/util/concurrent/ExecutorService;

    new-instance v2, Lwe/j;

    invoke-direct {v2, p0, v0}, Lwe/j;-><init>(Lwe/k;Lwe/c;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method private i(Lxe/m;)Ljava/lang/String;
    .locals 2

    invoke-virtual {p1}, Lxe/m;->z0()Ljava/lang/String;

    move-result-object p1

    const-string v0, "_st_"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwe/k;->A:Ljava/lang/String;

    iget-object v1, p0, Lwe/k;->z:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lre/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Lwe/k;->A:Ljava/lang/String;

    iget-object v1, p0, Lwe/k;->z:Ljava/lang/String;

    invoke-static {v0, v1, p1}, Lre/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private j()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lwe/k;->H()V

    iget-object v0, p0, Lwe/k;->e:Loe/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Loe/e;->b()Ljava/util/Map;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public static k()Lwe/k;
    .locals 1

    sget-object v0, Lwe/k;->D:Lwe/k;

    return-object v0
.end method

.method private static l(Lxe/g;)Ljava/lang/String;
    .locals 4

    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lxe/g;->o0()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lxe/g;->l0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-virtual {p0}, Lxe/g;->k0()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/4 v2, 0x2

    aput-object p0, v1, v2

    const-string p0, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)"

    invoke-static {v0, p0, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static m(Lxe/h;)Ljava/lang/String;
    .locals 7

    invoke-virtual {p0}, Lxe/h;->M0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lxe/h;->D0()J

    move-result-wide v0

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lxe/h;->I0()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p0}, Lxe/h;->w0()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    const-string v2, "UNKNOWN"

    :goto_1
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v4, 0x3

    new-array v4, v4, [Ljava/lang/Object;

    const/4 v5, 0x0

    invoke-virtual {p0}, Lxe/h;->F0()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v4, v5

    const/4 p0, 0x1

    aput-object v2, v4, p0

    new-instance p0, Ljava/text/DecimalFormat;

    const-string v2, "#.####"

    invoke-direct {p0, v2}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    long-to-double v0, v0

    const-wide v5, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v5

    invoke-virtual {p0, v0, v1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x2

    aput-object p0, v4, v0

    const-string p0, "network request trace: %s (responseCode: %s, responseTime: %sms)"

    invoke-static {v3, p0, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static n(Lxe/j;)Ljava/lang/String;
    .locals 1

    invoke-interface {p0}, Lxe/j;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lxe/j;->p()Lxe/m;

    move-result-object p0

    invoke-static {p0}, Lwe/k;->o(Lxe/m;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Lxe/j;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Lxe/j;->k()Lxe/h;

    move-result-object p0

    invoke-static {p0}, Lwe/k;->m(Lxe/h;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-interface {p0}, Lxe/j;->i()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Lxe/j;->q()Lxe/g;

    move-result-object p0

    invoke-static {p0}, Lwe/k;->l(Lxe/g;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    const-string p0, "log"

    return-object p0
.end method

.method private static o(Lxe/m;)Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, Lxe/m;->w0()J

    move-result-wide v0

    sget-object v2, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {p0}, Lxe/m;->z0()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v3, v4

    new-instance p0, Ljava/text/DecimalFormat;

    const-string v4, "#.####"

    invoke-direct {p0, v4}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V

    long-to-double v0, v0

    const-wide v4, 0x408f400000000000L    # 1000.0

    div-double/2addr v0, v4

    invoke-virtual {p0, v0, v1}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x1

    aput-object p0, v3, v0

    const-string p0, "trace metric: %s (duration: %sms)"

    invoke-static {v2, p0, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static p(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    const-string v0, ""

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x0

    invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p0

    iget-object p0, p0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :catch_0
    :goto_0
    return-object v0
.end method

.method private q(Lxe/i;)V
    .locals 3

    invoke-virtual {p1}, Lxe/i;->m()Z

    move-result v0

    const-wide/16 v1, 0x1

    if-eqz v0, :cond_0

    iget-object p1, p0, Lwe/k;->x:Lcom/google/firebase/perf/application/a;

    sget-object v0, Lcom/google/firebase/perf/util/b;->TRACE_EVENT_RATE_LIMITED:Lcom/google/firebase/perf/util/b;

    :goto_0
    invoke-virtual {v0}, Lcom/google/firebase/perf/util/b;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0, v1, v2}, Lcom/google/firebase/perf/application/a;->d(Ljava/lang/String;J)V

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lxe/i;->j()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lwe/k;->x:Lcom/google/firebase/perf/application/a;

    sget-object v0, Lcom/google/firebase/perf/util/b;->NETWORK_TRACE_EVENT_RATE_LIMITED:Lcom/google/firebase/perf/util/b;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method private s(Lxe/j;)Z
    .locals 8

    iget-object v0, p0, Lwe/k;->a:Ljava/util/Map;

    const-string v1, "KEY_AVAILABLE_TRACES_FOR_CACHING"

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v2, p0, Lwe/k;->a:Ljava/util/Map;

    const-string v3, "KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING"

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v4, p0, Lwe/k;->a:Ljava/util/Map;

    const-string v5, "KEY_AVAILABLE_GAUGES_FOR_CACHING"

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-interface {p1}, Lxe/j;->m()Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_0

    if-lez v0, :cond_0

    iget-object p1, p0, Lwe/k;->a:Ljava/util/Map;

    sub-int/2addr v0, v7

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v7

    :cond_0
    invoke-interface {p1}, Lxe/j;->j()Z

    move-result v1

    if-eqz v1, :cond_1

    if-lez v2, :cond_1

    iget-object p1, p0, Lwe/k;->a:Ljava/util/Map;

    sub-int/2addr v2, v7

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v7

    :cond_1
    invoke-interface {p1}, Lxe/j;->i()Z

    move-result v1

    if-eqz v1, :cond_2

    if-lez v4, :cond_2

    iget-object p1, p0, Lwe/k;->a:Ljava/util/Map;

    sub-int/2addr v4, v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {p1, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v7

    :cond_2
    sget-object v1, Lwe/k;->C:Lre/a;

    const/4 v3, 0x4

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {p1}, Lwe/k;->n(Lxe/j;)Ljava/lang/String;

    move-result-object p1

    const/4 v5, 0x0

    aput-object p1, v3, v5

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, v3, v7

    const/4 p1, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, p1

    const/4 p1, 0x3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, v3, p1

    const-string p1, "%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d)."

    invoke-virtual {v1, p1, v3}, Lre/a;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    return v5
.end method

.method private t(Lxe/i;)Z
    .locals 3

    iget-object v0, p0, Lwe/k;->v:Lcom/google/firebase/perf/config/a;

    invoke-virtual {v0}, Lcom/google/firebase/perf/config/a;->K()Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    sget-object v0, Lwe/k;->C:Lre/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lwe/k;->n(Lxe/j;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "Performance collection is not enabled, dropping %s"

    invoke-virtual {v0, p1, v1}, Lre/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_0
    invoke-virtual {p1}, Lxe/i;->g0()Lxe/c;

    move-result-object v0

    invoke-virtual {v0}, Lxe/c;->l0()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lwe/k;->C:Lre/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lwe/k;->n(Lxe/j;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "App Instance ID is null or empty, dropping %s"

    invoke-virtual {v0, p1, v1}, Lre/a;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_1
    iget-object v0, p0, Lwe/k;->u:Landroid/content/Context;

    invoke-static {p1, v0}, Lte/e;->b(Lxe/i;Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lwe/k;->C:Lre/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lwe/k;->n(Lxe/j;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values."

    invoke-virtual {v0, p1, v1}, Lre/a;->k(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_2
    iget-object v0, p0, Lwe/k;->w:Lwe/d;

    invoke-virtual {v0, p1}, Lwe/d;->h(Lxe/i;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0, p1}, Lwe/k;->q(Lxe/i;)V

    sget-object v0, Lwe/k;->C:Lre/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lwe/k;->n(Lxe/j;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "Event dropped due to device sampling - %s"

    invoke-virtual {v0, p1, v1}, Lre/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_3
    iget-object v0, p0, Lwe/k;->w:Lwe/d;

    invoke-virtual {v0, p1}, Lwe/d;->g(Lxe/i;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-direct {p0, p1}, Lwe/k;->q(Lxe/i;)V

    sget-object v0, Lwe/k;->C:Lre/a;

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Lwe/k;->n(Lxe/j;)Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "Rate limited (per device) - %s"

    invoke-virtual {v0, p1, v1}, Lre/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    return v2

    :cond_4
    return v1
.end method

.method private synthetic v(Lwe/c;)V
    .locals 1

    iget-object v0, p1, Lwe/c;->a:Lxe/i$b;

    iget-object p1, p1, Lwe/c;->b:Lxe/d;

    invoke-direct {p0, v0, p1}, Lwe/k;->F(Lxe/i$b;Lxe/d;)V

    return-void
.end method

.method private synthetic w(Lxe/m;Lxe/d;)V
    .locals 1

    invoke-static {}, Lxe/i;->i0()Lxe/i$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lxe/i$b;->L(Lxe/m;)Lxe/i$b;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lwe/k;->F(Lxe/i$b;Lxe/d;)V

    return-void
.end method

.method private synthetic x(Lxe/h;Lxe/d;)V
    .locals 1

    invoke-static {}, Lxe/i;->i0()Lxe/i$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lxe/i$b;->K(Lxe/h;)Lxe/i$b;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lwe/k;->F(Lxe/i$b;Lxe/d;)V

    return-void
.end method

.method private synthetic y(Lxe/g;Lxe/d;)V
    .locals 1

    invoke-static {}, Lxe/i;->i0()Lxe/i$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lxe/i$b;->J(Lxe/g;)Lxe/i$b;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lwe/k;->F(Lxe/i$b;Lxe/d;)V

    return-void
.end method

.method private synthetic z()V
    .locals 2

    iget-object v0, p0, Lwe/k;->w:Lwe/d;

    iget-boolean v1, p0, Lwe/k;->B:Z

    invoke-virtual {v0, v1}, Lwe/d;->a(Z)V

    return-void
.end method


# virtual methods
.method public A(Lxe/g;Lxe/d;)V
    .locals 2

    iget-object v0, p0, Lwe/k;->t:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lwe/i;

    invoke-direct {v1, p0, p1, p2}, Lwe/i;-><init>(Lwe/k;Lxe/g;Lxe/d;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public B(Lxe/h;Lxe/d;)V
    .locals 2

    iget-object v0, p0, Lwe/k;->t:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lwe/g;

    invoke-direct {v1, p0, p1, p2}, Lwe/g;-><init>(Lwe/k;Lxe/h;Lxe/d;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public C(Lxe/m;Lxe/d;)V
    .locals 2

    iget-object v0, p0, Lwe/k;->t:Ljava/util/concurrent/ExecutorService;

    new-instance v1, Lwe/e;

    invoke-direct {v1, p0, p1, p2}, Lwe/e;-><init>(Lwe/k;Lxe/m;Lxe/d;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public onUpdateAppState(Lxe/d;)V
    .locals 1

    sget-object v0, Lxe/d;->FOREGROUND:Lxe/d;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lwe/k;->B:Z

    invoke-virtual {p0}, Lwe/k;->u()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lwe/k;->t:Ljava/util/concurrent/ExecutorService;

    new-instance v0, Lwe/h;

    invoke-direct {v0, p0}, Lwe/h;-><init>(Lwe/k;)V

    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    :cond_1
    return-void
.end method

.method public r(Lzb/g;Lfe/f;Lee/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzb/g;",
            "Lfe/f;",
            "Lee/b<",
            "Lf6/g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lwe/k;->d:Lzb/g;

    invoke-virtual {p1}, Lzb/g;->r()Lzb/p;

    move-result-object p1

    invoke-virtual {p1}, Lzb/p;->g()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lwe/k;->A:Ljava/lang/String;

    iput-object p2, p0, Lwe/k;->f:Lfe/f;

    iput-object p3, p0, Lwe/k;->r:Lee/b;

    iget-object p1, p0, Lwe/k;->t:Ljava/util/concurrent/ExecutorService;

    new-instance p2, Lwe/f;

    invoke-direct {p2, p0}, Lwe/f;-><init>(Lwe/k;)V

    invoke-interface {p1, p2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public u()Z
    .locals 1

    iget-object v0, p0, Lwe/k;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method
