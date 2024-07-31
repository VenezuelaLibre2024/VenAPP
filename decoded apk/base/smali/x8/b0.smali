.class public final Lx8/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx8/b0$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lcom/google/android/gms/ads/internal/client/s2;

.field private c:Lx8/b0$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lx8/b0;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Lx8/b0$a;)V
    .locals 3

    iget-object v0, p0, Lx8/b0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lx8/b0;->c:Lx8/b0$a;

    iget-object v1, p0, Lx8/b0;->b:Lcom/google/android/gms/ads/internal/client/s2;

    if-nez v1, :cond_0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    :try_start_1
    new-instance v2, Lcom/google/android/gms/ads/internal/client/m4;

    invoke-direct {v2, p1}, Lcom/google/android/gms/ads/internal/client/m4;-><init>(Lx8/b0$a;)V

    move-object p1, v2

    :goto_0
    invoke-interface {v1, p1}, Lcom/google/android/gms/ads/internal/client/s2;->zzm(Lcom/google/android/gms/ads/internal/client/v2;)V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    move-exception p1

    :try_start_2
    const-string v1, "Unable to call setVideoLifecycleCallbacks on video controller."

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final b()Lcom/google/android/gms/ads/internal/client/s2;
    .locals 2

    iget-object v0, p0, Lx8/b0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lx8/b0;->b:Lcom/google/android/gms/ads/internal/client/s2;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final c(Lcom/google/android/gms/ads/internal/client/s2;)V
    .locals 1

    iget-object v0, p0, Lx8/b0;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lx8/b0;->b:Lcom/google/android/gms/ads/internal/client/s2;

    iget-object p1, p0, Lx8/b0;->c:Lx8/b0$a;

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lx8/b0;->a(Lx8/b0$a;)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
