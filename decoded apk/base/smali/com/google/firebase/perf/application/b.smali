.class public abstract Lcom/google/firebase/perf/application/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/firebase/perf/application/a$b;


# instance fields
.field private final appStateCallback:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/google/firebase/perf/application/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private final appStateMonitor:Lcom/google/firebase/perf/application/a;

.field private currentAppState:Lxe/d;

.field private isRegisteredForAppState:Z


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/firebase/perf/application/a;->b()Lcom/google/firebase/perf/application/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/firebase/perf/application/b;-><init>(Lcom/google/firebase/perf/application/a;)V

    return-void
.end method

.method protected constructor <init>(Lcom/google/firebase/perf/application/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/firebase/perf/application/b;->isRegisteredForAppState:Z

    sget-object v0, Lxe/d;->APPLICATION_PROCESS_STATE_UNKNOWN:Lxe/d;

    iput-object v0, p0, Lcom/google/firebase/perf/application/b;->currentAppState:Lxe/d;

    iput-object p1, p0, Lcom/google/firebase/perf/application/b;->appStateMonitor:Lcom/google/firebase/perf/application/a;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lcom/google/firebase/perf/application/b;->appStateCallback:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public getAppState()Lxe/d;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/application/b;->currentAppState:Lxe/d;

    return-object v0
.end method

.method public getAppStateCallback()Ljava/lang/ref/WeakReference;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/google/firebase/perf/application/a$b;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/firebase/perf/application/b;->appStateCallback:Ljava/lang/ref/WeakReference;

    return-object v0
.end method

.method protected incrementTsnsCount(I)V
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/perf/application/b;->appStateMonitor:Lcom/google/firebase/perf/application/a;

    invoke-virtual {v0, p1}, Lcom/google/firebase/perf/application/a;->e(I)V

    return-void
.end method

.method public onUpdateAppState(Lxe/d;)V
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/perf/application/b;->currentAppState:Lxe/d;

    sget-object v1, Lxe/d;->APPLICATION_PROCESS_STATE_UNKNOWN:Lxe/d;

    if-ne v0, v1, :cond_0

    :goto_0
    iput-object p1, p0, Lcom/google/firebase/perf/application/b;->currentAppState:Lxe/d;

    goto :goto_1

    :cond_0
    if-eq v0, p1, :cond_1

    if-eq p1, v1, :cond_1

    sget-object p1, Lxe/d;->FOREGROUND_BACKGROUND:Lxe/d;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method protected registerForAppState()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/firebase/perf/application/b;->isRegisteredForAppState:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/application/b;->appStateMonitor:Lcom/google/firebase/perf/application/a;

    invoke-virtual {v0}, Lcom/google/firebase/perf/application/a;->a()Lxe/d;

    move-result-object v0

    iput-object v0, p0, Lcom/google/firebase/perf/application/b;->currentAppState:Lxe/d;

    iget-object v0, p0, Lcom/google/firebase/perf/application/b;->appStateMonitor:Lcom/google/firebase/perf/application/a;

    iget-object v1, p0, Lcom/google/firebase/perf/application/b;->appStateCallback:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1}, Lcom/google/firebase/perf/application/a;->k(Ljava/lang/ref/WeakReference;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/firebase/perf/application/b;->isRegisteredForAppState:Z

    return-void
.end method

.method protected unregisterForAppState()V
    .locals 2

    iget-boolean v0, p0, Lcom/google/firebase/perf/application/b;->isRegisteredForAppState:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/firebase/perf/application/b;->appStateMonitor:Lcom/google/firebase/perf/application/a;

    iget-object v1, p0, Lcom/google/firebase/perf/application/b;->appStateCallback:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1}, Lcom/google/firebase/perf/application/a;->p(Ljava/lang/ref/WeakReference;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/firebase/perf/application/b;->isRegisteredForAppState:Z

    return-void
.end method
