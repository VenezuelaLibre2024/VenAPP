.class public Lcom/google/android/gms/ads/internal/client/y;
.super Lx8/e;
.source "SourceFile"


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Lx8/e;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lx8/e;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/client/y;->a:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final d(Lx8/e;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/y;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/y;->b:Lx8/e;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final onAdClicked()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/y;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/y;->b:Lx8/e;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lx8/e;->onAdClicked()V

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

.method public final onAdClosed()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/y;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/y;->b:Lx8/e;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lx8/e;->onAdClosed()V

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

.method public onAdFailedToLoad(Lx8/o;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/y;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/y;->b:Lx8/e;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lx8/e;->onAdFailedToLoad(Lx8/o;)V

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

.method public final onAdImpression()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/y;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/y;->b:Lx8/e;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lx8/e;->onAdImpression()V

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

.method public onAdLoaded()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/y;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/y;->b:Lx8/e;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lx8/e;->onAdLoaded()V

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

.method public final onAdOpened()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/y;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/client/y;->b:Lx8/e;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lx8/e;->onAdOpened()V

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
