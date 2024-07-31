.class public Lio/flutter/plugins/webviewflutter/InstanceManager;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;
    }
.end annotation


# static fields
.field private static final CLEAR_FINALIZED_WEAK_REFERENCES_INTERVAL:J = 0xbb8L

.field private static final MIN_HOST_CREATED_IDENTIFIER:J = 0x10000L

.field private static final TAG:Ljava/lang/String; = "InstanceManager"


# instance fields
.field private final finalizationListener:Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;

.field private final handler:Landroid/os/Handler;

.field private hasFinalizationListenerStopped:Z

.field private final identifiers:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap<",
            "Ljava/lang/Object;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private nextIdentifier:J

.field private final referenceQueue:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final strongInstances:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final weakInstances:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/ref/WeakReference<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private final weakReferencesToIdentifiers:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/ref/WeakReference<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->identifiers:Ljava/util/WeakHashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakInstances:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->strongInstances:Ljava/util/HashMap;

    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->referenceQueue:Ljava/lang/ref/ReferenceQueue;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakReferencesToIdentifiers:Ljava/util/HashMap;

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->handler:Landroid/os/Handler;

    const-wide/32 v1, 0x10000

    iput-wide v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->nextIdentifier:J

    const/4 v1, 0x0

    iput-boolean v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->hasFinalizationListenerStopped:Z

    iput-object p1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->finalizationListener:Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;

    new-instance p1, Lio/flutter/plugins/webviewflutter/y2;

    invoke-direct {p1, p0}, Lio/flutter/plugins/webviewflutter/y2;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    const-wide/16 v1, 0xbb8

    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static synthetic a(Lio/flutter/plugins/webviewflutter/InstanceManager;)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->releaseAllFinalizedInstances()V

    return-void
.end method

.method private addInstance(Ljava/lang/Object;J)V
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz v0, :cond_1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakInstances:Ljava/util/HashMap;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->referenceQueue:Ljava/lang/ref/ReferenceQueue;

    invoke-direct {v0, p1, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->identifiers:Ljava/util/WeakHashMap;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakInstances:Ljava/util/HashMap;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakReferencesToIdentifiers:Ljava/util/HashMap;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->strongInstances:Ljava/util/HashMap;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {v0, p2, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v0, v1

    const-string p2, "Identifier has already been added: %d"

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    aput-object p2, v0, v1

    const-string p2, "Identifier must be >= 0: %d"

    invoke-static {p2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static create(Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;)Lio/flutter/plugins/webviewflutter/InstanceManager;
    .locals 1

    new-instance v0, Lio/flutter/plugins/webviewflutter/InstanceManager;

    invoke-direct {v0, p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;)V

    return-object v0
.end method

.method private logWarningIfFinalizationListenerHasStopped()V
    .locals 2

    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->hasFinalizationListenerStopped()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "InstanceManager"

    const-string v1, "The manager was used after calls to the FinalizationListener have been stopped."

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method private releaseAllFinalizedInstances()V
    .locals 4

    invoke-virtual {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->hasFinalizationListenerStopped()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    :goto_0
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->referenceQueue:Ljava/lang/ref/ReferenceQueue;

    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakReferencesToIdentifiers:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakInstances:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->strongInstances:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->finalizationListener:Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-interface {v1, v2, v3}, Lio/flutter/plugins/webviewflutter/InstanceManager$FinalizationListener;->onFinalize(J)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->handler:Landroid/os/Handler;

    new-instance v1, Lio/flutter/plugins/webviewflutter/y2;

    invoke-direct {v1, p0}, Lio/flutter/plugins/webviewflutter/y2;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    const-wide/16 v2, 0xbb8

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method


# virtual methods
.method public addDartCreatedInstance(Ljava/lang/Object;J)V
    .locals 0

    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->logWarningIfFinalizationListenerHasStopped()V

    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugins/webviewflutter/InstanceManager;->addInstance(Ljava/lang/Object;J)V

    return-void
.end method

.method public addHostCreatedInstance(Ljava/lang/Object;)J
    .locals 4

    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->logWarningIfFinalizationListenerHasStopped()V

    invoke-virtual {p0, p1}, Lio/flutter/plugins/webviewflutter/InstanceManager;->containsInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-wide v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->nextIdentifier:J

    const-wide/16 v2, 0x1

    add-long/2addr v2, v0

    iput-wide v2, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->nextIdentifier:J

    invoke-direct {p0, p1, v0, v1}, Lio/flutter/plugins/webviewflutter/InstanceManager;->addInstance(Ljava/lang/Object;J)V

    return-wide v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Instance of "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " has already been added."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public clear()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->identifiers:Ljava/util/WeakHashMap;

    invoke-virtual {v0}, Ljava/util/WeakHashMap;->clear()V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakInstances:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->strongInstances:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakReferencesToIdentifiers:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    return-void
.end method

.method public containsInstance(Ljava/lang/Object;)Z
    .locals 1

    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->logWarningIfFinalizationListenerHasStopped()V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->identifiers:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public getIdentifierForStrongReference(Ljava/lang/Object;)Ljava/lang/Long;
    .locals 2

    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->logWarningIfFinalizationListenerHasStopped()V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->identifiers:Ljava/util/WeakHashMap;

    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->strongInstances:Ljava/util/HashMap;

    invoke-virtual {v1, v0, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public getInstance(J)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J)TT;"
        }
    .end annotation

    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->logWarningIfFinalizationListenerHasStopped()V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->weakInstances:Ljava/util/HashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public hasFinalizationListenerStopped()Z
    .locals 1

    iget-boolean v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->hasFinalizationListenerStopped:Z

    return v0
.end method

.method public remove(J)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(J)TT;"
        }
    .end annotation

    invoke-direct {p0}, Lio/flutter/plugins/webviewflutter/InstanceManager;->logWarningIfFinalizationListenerHasStopped()V

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->strongInstances:Ljava/util/HashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public stopFinalizationListener()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->handler:Landroid/os/Handler;

    new-instance v1, Lio/flutter/plugins/webviewflutter/y2;

    invoke-direct {v1, p0}, Lio/flutter/plugins/webviewflutter/y2;-><init>(Lio/flutter/plugins/webviewflutter/InstanceManager;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/flutter/plugins/webviewflutter/InstanceManager;->hasFinalizationListenerStopped:Z

    return-void
.end method
