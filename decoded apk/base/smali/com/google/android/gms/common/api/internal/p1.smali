.class final Lcom/google/android/gms/common/api/internal/p1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/android/gms/common/api/n;

.field final synthetic b:Lcom/google/android/gms/common/api/internal/s1;


# direct methods
.method constructor <init>(Lcom/google/android/gms/common/api/internal/s1;Lcom/google/android/gms/common/api/n;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/common/api/internal/p1;->b:Lcom/google/android/gms/common/api/internal/s1;

    iput-object p2, p0, Lcom/google/android/gms/common/api/internal/p1;->a:Lcom/google/android/gms/common/api/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    :try_start_0
    sget-object v0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->zaa:Ljava/lang/ThreadLocal;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p1;->b:Lcom/google/android/gms/common/api/internal/s1;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/s1;->c(Lcom/google/android/gms/common/api/internal/s1;)Lcom/google/android/gms/common/api/q;

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/common/internal/s;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/common/api/q;

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/p1;->a:Lcom/google/android/gms/common/api/n;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/q;->b(Lcom/google/android/gms/common/api/n;)Lcom/google/android/gms/common/api/i;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/p1;->b:Lcom/google/android/gms/common/api/internal/s1;

    invoke-static {v2}, Lcom/google/android/gms/common/api/internal/s1;->d(Lcom/google/android/gms/common/api/internal/s1;)Lcom/google/android/gms/common/api/internal/q1;

    move-result-object v3

    invoke-static {v2}, Lcom/google/android/gms/common/api/internal/s1;->d(Lcom/google/android/gms/common/api/internal/s1;)Lcom/google/android/gms/common/api/internal/q1;

    move-result-object v2

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/p1;->b:Lcom/google/android/gms/common/api/internal/s1;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p1;->a:Lcom/google/android/gms/common/api/n;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/s1;->h(Lcom/google/android/gms/common/api/internal/s1;Lcom/google/android/gms/common/api/n;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/p1;->b:Lcom/google/android/gms/common/api/internal/s1;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/s1;->g(Lcom/google/android/gms/common/api/internal/s1;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/f;

    if-eqz v0, :cond_0

    :goto_0
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p1;->b:Lcom/google/android/gms/common/api/internal/s1;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/common/api/f;->j(Lcom/google/android/gms/common/api/internal/s1;)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p1;->b:Lcom/google/android/gms/common/api/internal/s1;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/s1;->d(Lcom/google/android/gms/common/api/internal/s1;)Lcom/google/android/gms/common/api/internal/q1;

    move-result-object v2

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/s1;->d(Lcom/google/android/gms/common/api/internal/s1;)Lcom/google/android/gms/common/api/internal/q1;

    move-result-object v1

    const/4 v3, 0x1

    invoke-virtual {v1, v3, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    sget-object v0, Lcom/google/android/gms/common/api/internal/BasePendingResult;->zaa:Ljava/lang/ThreadLocal;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/p1;->b:Lcom/google/android/gms/common/api/internal/s1;

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p1;->a:Lcom/google/android/gms/common/api/n;

    invoke-static {v0, v1}, Lcom/google/android/gms/common/api/internal/s1;->h(Lcom/google/android/gms/common/api/internal/s1;Lcom/google/android/gms/common/api/n;)V

    iget-object v0, p0, Lcom/google/android/gms/common/api/internal/p1;->b:Lcom/google/android/gms/common/api/internal/s1;

    invoke-static {v0}, Lcom/google/android/gms/common/api/internal/s1;->g(Lcom/google/android/gms/common/api/internal/s1;)Ljava/lang/ref/WeakReference;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/common/api/f;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :goto_1
    sget-object v1, Lcom/google/android/gms/common/api/internal/BasePendingResult;->zaa:Ljava/lang/ThreadLocal;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p1;->b:Lcom/google/android/gms/common/api/internal/s1;

    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/p1;->a:Lcom/google/android/gms/common/api/n;

    invoke-static {v1, v2}, Lcom/google/android/gms/common/api/internal/s1;->h(Lcom/google/android/gms/common/api/internal/s1;Lcom/google/android/gms/common/api/n;)V

    iget-object v1, p0, Lcom/google/android/gms/common/api/internal/p1;->b:Lcom/google/android/gms/common/api/internal/s1;

    invoke-static {v1}, Lcom/google/android/gms/common/api/internal/s1;->g(Lcom/google/android/gms/common/api/internal/s1;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/common/api/f;

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    iget-object v2, p0, Lcom/google/android/gms/common/api/internal/p1;->b:Lcom/google/android/gms/common/api/internal/s1;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/common/api/f;->j(Lcom/google/android/gms/common/api/internal/s1;)V

    :goto_2
    throw v0
.end method
