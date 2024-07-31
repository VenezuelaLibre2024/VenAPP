.class public Landroidx/work/impl/e0;
.super Lf2/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/impl/e0$a;
    }
.end annotation


# static fields
.field private static final k:Ljava/lang/String;

.field private static l:Landroidx/work/impl/e0;

.field private static m:Landroidx/work/impl/e0;

.field private static final n:Ljava/lang/Object;


# instance fields
.field private a:Landroid/content/Context;

.field private b:Landroidx/work/a;

.field private c:Landroidx/work/impl/WorkDatabase;

.field private d:Lm2/b;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroidx/work/impl/t;",
            ">;"
        }
    .end annotation
.end field

.field private f:Landroidx/work/impl/r;

.field private g:Ll2/r;

.field private h:Z

.field private i:Landroid/content/BroadcastReceiver$PendingResult;

.field private final j:Lj2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkManagerImpl"

    invoke-static {v0}, Lf2/j;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/impl/e0;->k:Ljava/lang/String;

    const/4 v0, 0x0

    sput-object v0, Landroidx/work/impl/e0;->l:Landroidx/work/impl/e0;

    sput-object v0, Landroidx/work/impl/e0;->m:Landroidx/work/impl/e0;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/work/impl/e0;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;Lm2/b;)V
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lf2/p;->a:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/work/impl/e0;-><init>(Landroid/content/Context;Landroidx/work/a;Lm2/b;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;Lm2/b;Landroidx/work/impl/WorkDatabase;)V
    .locals 9

    invoke-direct {p0}, Lf2/t;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Lf2/j$a;

    invoke-virtual {p2}, Landroidx/work/a;->j()I

    move-result v2

    invoke-direct {v1, v2}, Lf2/j$a;-><init>(I)V

    invoke-static {v1}, Lf2/j;->h(Lf2/j;)V

    new-instance v1, Lj2/n;

    invoke-direct {v1, v0, p3}, Lj2/n;-><init>(Landroid/content/Context;Lm2/b;)V

    iput-object v1, p0, Landroidx/work/impl/e0;->j:Lj2/n;

    invoke-virtual {p0, v0, p2, v1}, Landroidx/work/impl/e0;->i(Landroid/content/Context;Landroidx/work/a;Lj2/n;)Ljava/util/List;

    move-result-object v0

    new-instance v8, Landroidx/work/impl/r;

    move-object v2, v8

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, v0

    invoke-direct/range {v2 .. v7}, Landroidx/work/impl/r;-><init>(Landroid/content/Context;Landroidx/work/a;Lm2/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Landroidx/work/impl/e0;->t(Landroid/content/Context;Landroidx/work/a;Lm2/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Landroidx/work/impl/r;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/a;Lm2/b;Z)V
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-interface {p3}, Lm2/b;->b()Lm2/a;

    move-result-object v1

    invoke-static {v0, v1, p4}, Landroidx/work/impl/WorkDatabase;->D(Landroid/content/Context;Ljava/util/concurrent/Executor;Z)Landroidx/work/impl/WorkDatabase;

    move-result-object p4

    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/work/impl/e0;-><init>(Landroid/content/Context;Landroidx/work/a;Lm2/b;Landroidx/work/impl/WorkDatabase;)V

    return-void
.end method

.method public static g(Landroid/content/Context;Landroidx/work/a;)V
    .locals 4

    sget-object v0, Landroidx/work/impl/e0;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/work/impl/e0;->l:Landroidx/work/impl/e0;

    if-eqz v1, :cond_1

    sget-object v2, Landroidx/work/impl/e0;->m:Landroidx/work/impl/e0;

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    if-nez v1, :cond_3

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    sget-object v1, Landroidx/work/impl/e0;->m:Landroidx/work/impl/e0;

    if-nez v1, :cond_2

    new-instance v1, Landroidx/work/impl/e0;

    new-instance v2, Lm2/c;

    invoke-virtual {p1}, Landroidx/work/a;->m()Ljava/util/concurrent/Executor;

    move-result-object v3

    invoke-direct {v2, v3}, Lm2/c;-><init>(Ljava/util/concurrent/Executor;)V

    invoke-direct {v1, p0, p1, v2}, Landroidx/work/impl/e0;-><init>(Landroid/content/Context;Landroidx/work/a;Lm2/b;)V

    sput-object v1, Landroidx/work/impl/e0;->m:Landroidx/work/impl/e0;

    :cond_2
    sget-object p0, Landroidx/work/impl/e0;->m:Landroidx/work/impl/e0;

    sput-object p0, Landroidx/work/impl/e0;->l:Landroidx/work/impl/e0;

    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public static l()Landroidx/work/impl/e0;
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    sget-object v0, Landroidx/work/impl/e0;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    sget-object v1, Landroidx/work/impl/e0;->l:Landroidx/work/impl/e0;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    sget-object v1, Landroidx/work/impl/e0;->m:Landroidx/work/impl/e0;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public static m(Landroid/content/Context;)Landroidx/work/impl/e0;
    .locals 2

    sget-object v0, Landroidx/work/impl/e0;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Landroidx/work/impl/e0;->l()Landroidx/work/impl/e0;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    instance-of v1, p0, Landroidx/work/a$c;

    if-eqz v1, :cond_0

    move-object v1, p0

    check-cast v1, Landroidx/work/a$c;

    invoke-interface {v1}, Landroidx/work/a$c;->a()Landroidx/work/a;

    move-result-object v1

    invoke-static {p0, v1}, Landroidx/work/impl/e0;->g(Landroid/content/Context;Landroidx/work/a;)V

    invoke-static {p0}, Landroidx/work/impl/e0;->m(Landroid/content/Context;)Landroidx/work/impl/e0;

    move-result-object v1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v1, "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."

    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method private t(Landroid/content/Context;Landroidx/work/a;Lm2/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;Landroidx/work/impl/r;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/work/a;",
            "Lm2/b;",
            "Landroidx/work/impl/WorkDatabase;",
            "Ljava/util/List<",
            "Landroidx/work/impl/t;",
            ">;",
            "Landroidx/work/impl/r;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/impl/e0;->a:Landroid/content/Context;

    iput-object p2, p0, Landroidx/work/impl/e0;->b:Landroidx/work/a;

    iput-object p3, p0, Landroidx/work/impl/e0;->d:Lm2/b;

    iput-object p4, p0, Landroidx/work/impl/e0;->c:Landroidx/work/impl/WorkDatabase;

    iput-object p5, p0, Landroidx/work/impl/e0;->e:Ljava/util/List;

    iput-object p6, p0, Landroidx/work/impl/e0;->f:Landroidx/work/impl/r;

    new-instance p2, Ll2/r;

    invoke-direct {p2, p4}, Ll2/r;-><init>(Landroidx/work/impl/WorkDatabase;)V

    iput-object p2, p0, Landroidx/work/impl/e0;->g:Ll2/r;

    const/4 p2, 0x0

    iput-boolean p2, p0, Landroidx/work/impl/e0;->h:Z

    invoke-static {p1}, Landroidx/work/impl/e0$a;->a(Landroid/content/Context;)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Landroidx/work/impl/e0;->d:Lm2/b;

    new-instance p3, Landroidx/work/impl/utils/ForceStopRunnable;

    invoke-direct {p3, p1, p0}, Landroidx/work/impl/utils/ForceStopRunnable;-><init>(Landroid/content/Context;Landroidx/work/impl/e0;)V

    invoke-interface {p2, p3}, Lm2/b;->c(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot initialize WorkManager in direct boot mode"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public A(Landroidx/work/impl/v;)V
    .locals 3

    iget-object v0, p0, Landroidx/work/impl/e0;->d:Lm2/b;

    new-instance v1, Ll2/w;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Ll2/w;-><init>(Landroidx/work/impl/e0;Landroidx/work/impl/v;Z)V

    invoke-interface {v0, v1}, Lm2/b;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Ljava/lang/String;)Lf2/m;
    .locals 1

    invoke-static {p1, p0}, Ll2/c;->d(Ljava/lang/String;Landroidx/work/impl/e0;)Ll2/c;

    move-result-object p1

    iget-object v0, p0, Landroidx/work/impl/e0;->d:Lm2/b;

    invoke-interface {v0, p1}, Lm2/b;->c(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ll2/c;->e()Lf2/m;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/util/UUID;)Lf2/m;
    .locals 1

    invoke-static {p1, p0}, Ll2/c;->b(Ljava/util/UUID;Landroidx/work/impl/e0;)Ll2/c;

    move-result-object p1

    iget-object v0, p0, Landroidx/work/impl/e0;->d:Lm2/b;

    invoke-interface {v0, p1}, Lm2/b;->c(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ll2/c;->e()Lf2/m;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/util/List;)Lf2/m;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lf2/u;",
            ">;)",
            "Lf2/m;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Landroidx/work/impl/x;

    invoke-direct {v0, p0, p1}, Landroidx/work/impl/x;-><init>(Landroidx/work/impl/e0;Ljava/util/List;)V

    invoke-virtual {v0}, Landroidx/work/impl/x;->a()Lf2/m;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "enqueue needs at least one WorkRequest."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public f(Ljava/lang/String;)Landroidx/lifecycle/LiveData;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Landroidx/lifecycle/LiveData<",
            "Ljava/util/List<",
            "Lf2/s;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/work/impl/e0;->c:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->J()Lk2/v;

    move-result-object v0

    invoke-interface {v0, p1}, Lk2/v;->s(Ljava/lang/String;)Landroidx/lifecycle/LiveData;

    move-result-object p1

    sget-object v0, Lk2/u;->w:Lm/a;

    iget-object v1, p0, Landroidx/work/impl/e0;->d:Lm2/b;

    invoke-static {p1, v0, v1}, Ll2/m;->a(Landroidx/lifecycle/LiveData;Lm/a;Lm2/b;)Landroidx/lifecycle/LiveData;

    move-result-object p1

    return-object p1
.end method

.method public h()Lf2/m;
    .locals 2

    new-instance v0, Ll2/t;

    invoke-direct {v0, p0}, Ll2/t;-><init>(Landroidx/work/impl/e0;)V

    iget-object v1, p0, Landroidx/work/impl/e0;->d:Lm2/b;

    invoke-interface {v1, v0}, Lm2/b;->c(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ll2/t;->a()Lf2/m;

    move-result-object v0

    return-object v0
.end method

.method public i(Landroid/content/Context;Landroidx/work/a;Lj2/n;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroidx/work/a;",
            "Lj2/n;",
            ")",
            "Ljava/util/List<",
            "Landroidx/work/impl/t;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x2

    new-array v0, v0, [Landroidx/work/impl/t;

    const/4 v1, 0x0

    invoke-static {p1, p0}, Landroidx/work/impl/u;->a(Landroid/content/Context;Landroidx/work/impl/e0;)Landroidx/work/impl/t;

    move-result-object v2

    aput-object v2, v0, v1

    new-instance v1, Lg2/b;

    invoke-direct {v1, p1, p2, p3, p0}, Lg2/b;-><init>(Landroid/content/Context;Landroidx/work/a;Lj2/n;Landroidx/work/impl/e0;)V

    const/4 p1, 0x1

    aput-object v1, v0, p1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public j()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/e0;->a:Landroid/content/Context;

    return-object v0
.end method

.method public k()Landroidx/work/a;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/e0;->b:Landroidx/work/a;

    return-object v0
.end method

.method public n()Ll2/r;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/e0;->g:Ll2/r;

    return-object v0
.end method

.method public o()Landroidx/work/impl/r;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/e0;->f:Landroidx/work/impl/r;

    return-object v0
.end method

.method public p()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Landroidx/work/impl/t;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/work/impl/e0;->e:Ljava/util/List;

    return-object v0
.end method

.method public q()Lj2/n;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/e0;->j:Lj2/n;

    return-object v0
.end method

.method public r()Landroidx/work/impl/WorkDatabase;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/e0;->c:Landroidx/work/impl/WorkDatabase;

    return-object v0
.end method

.method public s()Lm2/b;
    .locals 1

    iget-object v0, p0, Landroidx/work/impl/e0;->d:Lm2/b;

    return-object v0
.end method

.method public u()V
    .locals 2

    sget-object v0, Landroidx/work/impl/e0;->n:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Landroidx/work/impl/e0;->h:Z

    iget-object v1, p0, Landroidx/work/impl/e0;->i:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/work/impl/e0;->i:Landroid/content/BroadcastReceiver$PendingResult;

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public v()V
    .locals 3

    invoke-virtual {p0}, Landroidx/work/impl/e0;->j()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroidx/work/impl/background/systemjob/g;->b(Landroid/content/Context;)V

    invoke-virtual {p0}, Landroidx/work/impl/e0;->r()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->J()Lk2/v;

    move-result-object v0

    invoke-interface {v0}, Lk2/v;->m()I

    invoke-virtual {p0}, Landroidx/work/impl/e0;->k()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/work/impl/e0;->r()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/work/impl/e0;->p()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v1, v2}, Landroidx/work/impl/u;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method

.method public w(Landroid/content/BroadcastReceiver$PendingResult;)V
    .locals 2

    sget-object v0, Landroidx/work/impl/e0;->n:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Landroidx/work/impl/e0;->i:Landroid/content/BroadcastReceiver$PendingResult;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    :cond_0
    iput-object p1, p0, Landroidx/work/impl/e0;->i:Landroid/content/BroadcastReceiver$PendingResult;

    iget-boolean v1, p0, Landroidx/work/impl/e0;->h:Z

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    const/4 p1, 0x0

    iput-object p1, p0, Landroidx/work/impl/e0;->i:Landroid/content/BroadcastReceiver$PendingResult;

    :cond_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public x(Landroidx/work/impl/v;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroidx/work/impl/e0;->y(Landroidx/work/impl/v;Landroidx/work/WorkerParameters$a;)V

    return-void
.end method

.method public y(Landroidx/work/impl/v;Landroidx/work/WorkerParameters$a;)V
    .locals 2

    iget-object v0, p0, Landroidx/work/impl/e0;->d:Lm2/b;

    new-instance v1, Ll2/v;

    invoke-direct {v1, p0, p1, p2}, Ll2/v;-><init>(Landroidx/work/impl/e0;Landroidx/work/impl/v;Landroidx/work/WorkerParameters$a;)V

    invoke-interface {v0, v1}, Lm2/b;->c(Ljava/lang/Runnable;)V

    return-void
.end method

.method public z(Lk2/m;)V
    .locals 3

    iget-object v0, p0, Landroidx/work/impl/e0;->d:Lm2/b;

    new-instance v1, Ll2/w;

    new-instance v2, Landroidx/work/impl/v;

    invoke-direct {v2, p1}, Landroidx/work/impl/v;-><init>(Lk2/m;)V

    const/4 p1, 0x1

    invoke-direct {v1, p0, v2, p1}, Ll2/w;-><init>(Landroidx/work/impl/e0;Landroidx/work/impl/v;Z)V

    invoke-interface {v0, v1}, Lm2/b;->c(Ljava/lang/Runnable;)V

    return-void
.end method
