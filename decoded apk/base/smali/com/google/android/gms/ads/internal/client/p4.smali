.class public final Lcom/google/android/gms/ads/internal/client/p4;
.super Lcom/google/android/gms/ads/internal/client/g0;
.source "SourceFile"


# instance fields
.field private final a:Lx8/e;


# direct methods
.method public constructor <init>(Lx8/e;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/g0;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/p4;->a:Lx8/e;

    return-void
.end method


# virtual methods
.method public final f2()Lx8/e;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/p4;->a:Lx8/e;

    return-object v0
.end method

.method public final zzc()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/p4;->a:Lx8/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/e;->onAdClicked()V

    :cond_0
    return-void
.end method

.method public final zzd()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/p4;->a:Lx8/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/e;->onAdClosed()V

    :cond_0
    return-void
.end method

.method public final zze(I)V
    .locals 0

    return-void
.end method

.method public final zzf(Lcom/google/android/gms/ads/internal/client/c3;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/p4;->a:Lx8/e;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/client/c3;->v1()Lx8/o;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx8/e;->onAdFailedToLoad(Lx8/o;)V

    :cond_0
    return-void
.end method

.method public final zzg()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/p4;->a:Lx8/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/e;->onAdImpression()V

    :cond_0
    return-void
.end method

.method public final zzh()V
    .locals 0

    return-void
.end method

.method public final zzi()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/p4;->a:Lx8/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/e;->onAdLoaded()V

    :cond_0
    return-void
.end method

.method public final zzj()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/p4;->a:Lx8/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/e;->onAdOpened()V

    :cond_0
    return-void
.end method

.method public final zzk()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/p4;->a:Lx8/e;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/e;->onAdSwipeGestureClicked()V

    :cond_0
    return-void
.end method
