.class public final Lcom/google/android/gms/internal/ads/zzcbf;
.super Lcom/google/android/gms/internal/ads/zzcap;
.source "SourceFile"


# instance fields
.field private zza:Lx8/n;

.field private zzb:Lx8/u;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcap;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb(Lx8/n;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbf;->zza:Lx8/n;

    return-void
.end method

.method public final zzc(Lx8/u;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcbf;->zzb:Lx8/u;

    return-void
.end method

.method public final zze()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbf;->zza:Lx8/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/n;->onAdClicked()V

    :cond_0
    return-void
.end method

.method public final zzf()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbf;->zza:Lx8/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/n;->onAdImpression()V

    :cond_0
    return-void
.end method

.method public final zzg()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbf;->zza:Lx8/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/n;->onAdDismissedFullScreenContent()V

    :cond_0
    return-void
.end method

.method public final zzh(I)V
    .locals 0

    return-void
.end method

.method public final zzi(Lcom/google/android/gms/ads/internal/client/c3;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbf;->zza:Lx8/n;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/client/c3;->u1()Lx8/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx8/n;->onAdFailedToShowFullScreenContent(Lx8/b;)V

    :cond_0
    return-void
.end method

.method public final zzj()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbf;->zza:Lx8/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/n;->onAdShowedFullScreenContent()V

    :cond_0
    return-void
.end method

.method public final zzk(Lcom/google/android/gms/internal/ads/zzcak;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcbf;->zzb:Lx8/u;

    if-eqz v0, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzcax;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/ads/zzcax;-><init>(Lcom/google/android/gms/internal/ads/zzcak;)V

    invoke-interface {v0, v1}, Lx8/u;->onUserEarnedReward(Ln9/b;)V

    :cond_0
    return-void
.end method
