.class public final Lcom/google/android/gms/internal/ads/zzbag;
.super Lcom/google/android/gms/internal/ads/zzbap;
.source "SourceFile"


# instance fields
.field private zza:Lx8/n;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbap;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzb()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbag;->zza:Lx8/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/n;->onAdClicked()V

    :cond_0
    return-void
.end method

.method public final zzc()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbag;->zza:Lx8/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/n;->onAdDismissedFullScreenContent()V

    :cond_0
    return-void
.end method

.method public final zzd(Lcom/google/android/gms/ads/internal/client/c3;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbag;->zza:Lx8/n;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/client/c3;->u1()Lx8/b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx8/n;->onAdFailedToShowFullScreenContent(Lx8/b;)V

    :cond_0
    return-void
.end method

.method public final zze()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbag;->zza:Lx8/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/n;->onAdImpression()V

    :cond_0
    return-void
.end method

.method public final zzf()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbag;->zza:Lx8/n;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/n;->onAdShowedFullScreenContent()V

    :cond_0
    return-void
.end method

.method public final zzg(Lx8/n;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbag;->zza:Lx8/n;

    return-void
.end method
