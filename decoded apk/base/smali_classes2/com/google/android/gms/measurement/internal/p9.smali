.class final Lcom/google/android/gms/measurement/internal/p9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;

.field private final synthetic b:Ljava/lang/String;

.field private final synthetic c:Ljava/lang/String;

.field private final synthetic d:Ljava/lang/String;

.field private final synthetic e:Lcom/google/android/gms/measurement/internal/lb;

.field private final synthetic f:Z

.field private final synthetic r:Lcom/google/android/gms/measurement/internal/v8;


# direct methods
.method constructor <init>(Lcom/google/android/gms/measurement/internal/v8;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/lb;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/measurement/internal/p9;->r:Lcom/google/android/gms/measurement/internal/v8;

    iput-object p2, p0, Lcom/google/android/gms/measurement/internal/p9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p3, p0, Lcom/google/android/gms/measurement/internal/p9;->b:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/measurement/internal/p9;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/measurement/internal/p9;->d:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/measurement/internal/p9;->e:Lcom/google/android/gms/measurement/internal/lb;

    iput-boolean p7, p0, Lcom/google/android/gms/measurement/internal/p9;->f:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/measurement/internal/p9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/p9;->r:Lcom/google/android/gms/measurement/internal/v8;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/v8;->w(Lcom/google/android/gms/measurement/internal/v8;)Lwa/i;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/p9;->r:Lcom/google/android/gms/measurement/internal/v8;

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/v6;->zzj()Lcom/google/android/gms/measurement/internal/n4;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/measurement/internal/n4;->B()Lcom/google/android/gms/measurement/internal/p4;

    move-result-object v1

    const-string v2, "(legacy) Failed to get user properties; not connected to service"

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/p9;->b:Ljava/lang/String;

    invoke-static {v3}, Lcom/google/android/gms/measurement/internal/n4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/p9;->c:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/p9;->d:Ljava/lang/String;

    invoke-virtual {v1, v2, v3, v4, v5}, Lcom/google/android/gms/measurement/internal/p4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/p9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/p9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    return-void

    :cond_0
    :try_start_2
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/p9;->b:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/p9;->e:Lcom/google/android/gms/measurement/internal/lb;

    invoke-static {v2}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/p9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/p9;->c:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/p9;->d:Ljava/lang/String;

    iget-boolean v5, p0, Lcom/google/android/gms/measurement/internal/p9;->f:Z

    iget-object v6, p0, Lcom/google/android/gms/measurement/internal/p9;->e:Lcom/google/android/gms/measurement/internal/lb;

    invoke-interface {v1, v3, v4, v5, v6}, Lwa/i;->I1(Ljava/lang/String;Ljava/lang/String;ZLcom/google/android/gms/measurement/internal/lb;)Ljava/util/List;

    move-result-object v1

    :goto_0
    invoke-virtual {v2, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/p9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v3, p0, Lcom/google/android/gms/measurement/internal/p9;->b:Ljava/lang/String;

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/p9;->c:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/p9;->d:Ljava/lang/String;

    iget-boolean v6, p0, Lcom/google/android/gms/measurement/internal/p9;->f:Z

    invoke-interface {v1, v3, v4, v5, v6}, Lwa/i;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :goto_1
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/p9;->r:Lcom/google/android/gms/measurement/internal/v8;

    invoke-static {v1}, Lcom/google/android/gms/measurement/internal/v8;->h0(Lcom/google/android/gms/measurement/internal/v8;)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/p9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_2
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_0
    move-exception v1

    goto :goto_4

    :catch_0
    move-exception v1

    :try_start_4
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/p9;->r:Lcom/google/android/gms/measurement/internal/v8;

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/v6;->zzj()Lcom/google/android/gms/measurement/internal/n4;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/measurement/internal/n4;->B()Lcom/google/android/gms/measurement/internal/p4;

    move-result-object v2

    const-string v3, "(legacy) Failed to get user properties; remote exception"

    iget-object v4, p0, Lcom/google/android/gms/measurement/internal/p9;->b:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/measurement/internal/n4;->q(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    iget-object v5, p0, Lcom/google/android/gms/measurement/internal/p9;->c:Ljava/lang/String;

    invoke-virtual {v2, v3, v4, v5, v1}, Lcom/google/android/gms/measurement/internal/p4;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/p9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    iget-object v1, p0, Lcom/google/android/gms/measurement/internal/p9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    goto :goto_2

    :goto_3
    monitor-exit v0

    return-void

    :goto_4
    iget-object v2, p0, Lcom/google/android/gms/measurement/internal/p9;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v2}, Ljava/lang/Object;->notify()V

    throw v1

    :catchall_1
    move-exception v1

    monitor-exit v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v1
.end method