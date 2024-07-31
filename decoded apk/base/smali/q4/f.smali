.class public final Lq4/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lq4/f;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/util/concurrent/ScheduledExecutorService;

.field private static volatile d:Ljava/util/concurrent/ScheduledFuture;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ScheduledFuture<",
            "*>;"
        }
    .end annotation
.end field

.field private static final e:Ljava/lang/Object;

.field private static final f:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static volatile g:Lq4/m;

.field private static final h:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private static i:Ljava/lang/String;

.field private static j:J

.field private static k:I

.field private static l:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq4/f;

    invoke-direct {v0}, Lq4/f;-><init>()V

    sput-object v0, Lq4/f;->a:Lq4/f;

    const-class v0, Lq4/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "com.facebook.appevents.internal.ActivityLifecycleTracker"

    :cond_0
    sput-object v0, Lq4/f;->b:Ljava/lang/String;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadScheduledExecutor()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    sput-object v0, Lq4/f;->c:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq4/f;->e:Ljava/lang/Object;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lq4/f;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    sput-object v0, Lq4/f;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(JLjava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lq4/f;->t(JLjava/lang/String;)V

    return-void
.end method

.method public static synthetic b(JLjava/lang/String;Landroid/content/Context;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lq4/f;->w(JLjava/lang/String;Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic c()V
    .locals 0

    invoke-static {}, Lq4/f;->q()V

    return-void
.end method

.method public static synthetic d(Z)V
    .locals 0

    invoke-static {p0}, Lq4/f;->y(Z)V

    return-void
.end method

.method public static synthetic e(JLjava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lq4/f;->u(JLjava/lang/String;)V

    return-void
.end method

.method public static final synthetic f()I
    .locals 1

    sget v0, Lq4/f;->k:I

    return v0
.end method

.method public static final synthetic g()Ljava/lang/String;
    .locals 1

    sget-object v0, Lq4/f;->b:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic h(Lq4/f;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lq4/f;->r(Landroid/app/Activity;)V

    return-void
.end method

.method public static final synthetic i(Lq4/f;Landroid/app/Activity;)V
    .locals 0

    invoke-direct {p0, p1}, Lq4/f;->s(Landroid/app/Activity;)V

    return-void
.end method

.method public static final synthetic j(I)V
    .locals 0

    sput p0, Lq4/f;->k:I

    return-void
.end method

.method private final k()V
    .locals 3

    sget-object v0, Lq4/f;->e:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lq4/f;->d:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v1, :cond_1

    sget-object v1, Lq4/f;->d:Ljava/util/concurrent/ScheduledFuture;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    :cond_1
    :goto_0
    const/4 v1, 0x0

    sput-object v1, Lq4/f;->d:Ljava/util/concurrent/ScheduledFuture;

    sget-object v1, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public static final l()Landroid/app/Activity;
    .locals 2

    sget-object v0, Lq4/f;->l:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    :cond_1
    :goto_0
    return-object v1
.end method

.method public static final m()Ljava/util/UUID;
    .locals 2

    sget-object v0, Lq4/f;->g:Lq4/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    sget-object v0, Lq4/f;->g:Lq4/m;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lq4/m;->d()Ljava/util/UUID;

    move-result-object v1

    :cond_1
    :goto_0
    return-object v1
.end method

.method private final n()I
    .locals 1

    sget-object v0, Lcom/facebook/internal/v;->a:Lcom/facebook/internal/v;

    invoke-static {}, Li4/e0;->m()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/internal/v;->f(Ljava/lang/String;)Lcom/facebook/internal/r;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lq4/j;->a()I

    move-result v0

    return v0

    :cond_0
    invoke-virtual {v0}, Lcom/facebook/internal/r;->n()I

    move-result v0

    return v0
.end method

.method public static final o()Z
    .locals 1

    sget v0, Lq4/f;->k:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static final p(Landroid/app/Activity;)V
    .locals 1

    sget-object p0, Lq4/f;->c:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Lq4/d;

    invoke-direct {v0}, Lq4/d;-><init>()V

    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final q()V
    .locals 1

    sget-object v0, Lq4/f;->g:Lq4/m;

    if-nez v0, :cond_0

    sget-object v0, Lq4/m;->g:Lq4/m$a;

    invoke-virtual {v0}, Lq4/m$a;->b()Lq4/m;

    move-result-object v0

    sput-object v0, Lq4/f;->g:Lq4/m;

    :cond_0
    return-void
.end method

.method private final r(Landroid/app/Activity;)V
    .locals 0

    invoke-static {p1}, Ll4/e;->j(Landroid/app/Activity;)V

    return-void
.end method

.method private final s(Landroid/app/Activity;)V
    .locals 3

    sget-object v0, Lq4/f;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result v1

    if-gez v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    sget-object v0, Lq4/f;->b:Ljava/lang/String;

    const-string v1, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application\'s onCreate method"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    invoke-direct {p0}, Lq4/f;->k()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1}, Lcom/facebook/internal/n0;->u(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Ll4/e;->k(Landroid/app/Activity;)V

    new-instance p1, Lq4/b;

    invoke-direct {p1, v0, v1, v2}, Lq4/b;-><init>(JLjava/lang/String;)V

    sget-object v0, Lq4/f;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final t(JLjava/lang/String;)V
    .locals 7

    const-string v0, "$activityName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq4/f;->g:Lq4/m;

    if-nez v0, :cond_0

    new-instance v0, Lq4/m;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lq4/m;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;ILkotlin/jvm/internal/g;)V

    sput-object v0, Lq4/f;->g:Lq4/m;

    :cond_0
    sget-object v0, Lq4/f;->g:Lq4/m;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq4/m;->k(Ljava/lang/Long;)V

    :goto_0
    sget-object v0, Lq4/f;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    if-gtz v0, :cond_2

    new-instance v0, Lq4/e;

    invoke-direct {v0, p0, p1, p2}, Lq4/e;-><init>(JLjava/lang/String;)V

    sget-object v1, Lq4/f;->e:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lq4/f;->c:Ljava/util/concurrent/ScheduledExecutorService;

    sget-object v3, Lq4/f;->a:Lq4/f;

    invoke-direct {v3}, Lq4/f;->n()I

    move-result v3

    int-to-long v3, v3

    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v2, v0, v3, v4, v5}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object v0

    sput-object v0, Lq4/f;->d:Ljava/util/concurrent/ScheduledFuture;

    sget-object v0, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception p0

    monitor-exit v1

    throw p0

    :cond_2
    :goto_1
    sget-wide v0, Lq4/f;->j:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_3

    sub-long/2addr p0, v0

    const/16 v0, 0x3e8

    int-to-long v0, v0

    div-long v2, p0, v0

    :cond_3
    invoke-static {p2, v2, v3}, Lq4/i;->e(Ljava/lang/String;J)V

    sget-object p0, Lq4/f;->g:Lq4/m;

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lq4/m;->m()V

    :goto_2
    return-void
.end method

.method private static final u(JLjava/lang/String;)V
    .locals 7

    const-string v0, "$activityName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq4/f;->g:Lq4/m;

    if-nez v0, :cond_0

    new-instance v0, Lq4/m;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lq4/m;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;ILkotlin/jvm/internal/g;)V

    sput-object v0, Lq4/f;->g:Lq4/m;

    :cond_0
    sget-object p0, Lq4/f;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result p0

    const/4 p1, 0x0

    if-gtz p0, :cond_1

    sget-object p0, Lq4/n;->a:Lq4/n;

    sget-object p0, Lq4/f;->g:Lq4/m;

    sget-object v0, Lq4/f;->i:Ljava/lang/String;

    invoke-static {p2, p0, v0}, Lq4/n;->e(Ljava/lang/String;Lq4/m;Ljava/lang/String;)V

    sget-object p0, Lq4/m;->g:Lq4/m$a;

    invoke-virtual {p0}, Lq4/m$a;->a()V

    sput-object p1, Lq4/f;->g:Lq4/m;

    :cond_1
    sget-object p0, Lq4/f;->e:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    sput-object p1, Lq4/f;->d:Ljava/util/concurrent/ScheduledFuture;

    sget-object p1, Lck/v;->a:Lck/v;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public static final v(Landroid/app/Activity;)V
    .locals 4

    const-string v0, "activity"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lq4/f;->l:Ljava/lang/ref/WeakReference;

    sget-object v0, Lq4/f;->f:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    sget-object v0, Lq4/f;->a:Lq4/f;

    invoke-direct {v0}, Lq4/f;->k()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lq4/f;->j:J

    invoke-static {p0}, Lcom/facebook/internal/n0;->u(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Ll4/e;->l(Landroid/app/Activity;)V

    invoke-static {p0}, Lj4/b;->d(Landroid/app/Activity;)V

    invoke-static {p0}, Lu4/e;->h(Landroid/app/Activity;)V

    invoke-static {}, Lo4/k;->b()V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    new-instance v3, Lq4/c;

    invoke-direct {v3, v0, v1, v2, p0}, Lq4/c;-><init>(JLjava/lang/String;Landroid/content/Context;)V

    sget-object p0, Lq4/f;->c:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {p0, v3}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method private static final w(JLjava/lang/String;Landroid/content/Context;)V
    .locals 10

    const-string v0, "$activityName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq4/f;->g:Lq4/m;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move-object v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lq4/m;->e()Ljava/lang/Long;

    move-result-object v0

    :goto_0
    sget-object v2, Lq4/f;->g:Lq4/m;

    const-string v3, "appContext"

    if-nez v2, :cond_1

    new-instance v0, Lq4/m;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lq4/m;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;ILkotlin/jvm/internal/g;)V

    sput-object v0, Lq4/f;->g:Lq4/m;

    sget-object v0, Lq4/n;->a:Lq4/n;

    sget-object v0, Lq4/f;->i:Ljava/lang/String;

    invoke-static {p3, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1, v0, p3}, Lq4/n;->c(Ljava/lang/String;Lq4/o;Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_1

    :cond_1
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long v4, p0, v4

    sget-object v0, Lq4/f;->a:Lq4/f;

    invoke-direct {v0}, Lq4/f;->n()I

    move-result v0

    mul-int/lit16 v0, v0, 0x3e8

    int-to-long v6, v0

    cmp-long v0, v4, v6

    if-lez v0, :cond_2

    sget-object v0, Lq4/n;->a:Lq4/n;

    sget-object v0, Lq4/f;->g:Lq4/m;

    sget-object v2, Lq4/f;->i:Ljava/lang/String;

    invoke-static {p2, v0, v2}, Lq4/n;->e(Ljava/lang/String;Lq4/m;Ljava/lang/String;)V

    sget-object v0, Lq4/f;->i:Ljava/lang/String;

    invoke-static {p3, v3}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1, v0, p3}, Lq4/n;->c(Ljava/lang/String;Lq4/o;Ljava/lang/String;Landroid/content/Context;)V

    new-instance p2, Lq4/m;

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v4, p2

    invoke-direct/range {v4 .. v9}, Lq4/m;-><init>(Ljava/lang/Long;Ljava/lang/Long;Ljava/util/UUID;ILkotlin/jvm/internal/g;)V

    sput-object p2, Lq4/f;->g:Lq4/m;

    goto :goto_1

    :cond_2
    const-wide/16 p2, 0x3e8

    cmp-long p2, v4, p2

    if-lez p2, :cond_4

    sget-object p2, Lq4/f;->g:Lq4/m;

    if-nez p2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Lq4/m;->h()V

    :cond_4
    :goto_1
    sget-object p2, Lq4/f;->g:Lq4/m;

    if-nez p2, :cond_5

    goto :goto_2

    :cond_5
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-virtual {p2, p0}, Lq4/m;->k(Ljava/lang/Long;)V

    :goto_2
    sget-object p0, Lq4/f;->g:Lq4/m;

    if-nez p0, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lq4/m;->m()V

    :goto_3
    return-void
.end method

.method public static final x(Landroid/app/Application;Ljava/lang/String;)V
    .locals 3

    const-string v0, "application"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq4/f;->h:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lcom/facebook/internal/n;->a:Lcom/facebook/internal/n;

    sget-object v0, Lcom/facebook/internal/n$b;->CodelessEvents:Lcom/facebook/internal/n$b;

    new-instance v1, Lq4/a;

    invoke-direct {v1}, Lq4/a;-><init>()V

    invoke-static {v0, v1}, Lcom/facebook/internal/n;->a(Lcom/facebook/internal/n$b;Lcom/facebook/internal/n$a;)V

    sput-object p1, Lq4/f;->i:Ljava/lang/String;

    new-instance p1, Lq4/f$a;

    invoke-direct {p1}, Lq4/f$a;-><init>()V

    invoke-virtual {p0, p1}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    return-void
.end method

.method private static final y(Z)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {}, Ll4/e;->f()V

    goto :goto_0

    :cond_0
    invoke-static {}, Ll4/e;->e()V

    :goto_0
    return-void
.end method
