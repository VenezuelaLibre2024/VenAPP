.class public final Lcom/google/android/gms/ads/internal/client/f4;
.super Lcom/google/android/gms/internal/ads/zzcam;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzcam;-><init>()V

    return-void
.end method

.method private static f2(Lcom/google/android/gms/internal/ads/zzcau;)V
    .locals 2

    const-string v0, "This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzg(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzcdv;->zza:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/e4;

    invoke-direct {v1, p0}, Lcom/google/android/gms/ads/internal/client/e4;-><init>(Lcom/google/android/gms/internal/ads/zzcau;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public final zzb()Landroid/os/Bundle;
    .locals 1

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    return-object v0
.end method

.method public final zzc()Lcom/google/android/gms/ads/internal/client/p2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zzd()Lcom/google/android/gms/internal/ads/zzcak;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final zze()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public final zzf(Lcom/google/android/gms/ads/internal/client/u4;Lcom/google/android/gms/internal/ads/zzcau;)V
    .locals 0

    invoke-static {p2}, Lcom/google/android/gms/ads/internal/client/f4;->f2(Lcom/google/android/gms/internal/ads/zzcau;)V

    return-void
.end method

.method public final zzg(Lcom/google/android/gms/ads/internal/client/u4;Lcom/google/android/gms/internal/ads/zzcau;)V
    .locals 0

    invoke-static {p2}, Lcom/google/android/gms/ads/internal/client/f4;->f2(Lcom/google/android/gms/internal/ads/zzcau;)V

    return-void
.end method

.method public final zzh(Z)V
    .locals 0

    return-void
.end method

.method public final zzi(Lcom/google/android/gms/ads/internal/client/f2;)V
    .locals 0

    return-void
.end method

.method public final zzj(Lcom/google/android/gms/ads/internal/client/i2;)V
    .locals 0

    return-void
.end method

.method public final zzk(Lcom/google/android/gms/internal/ads/zzcaq;)V
    .locals 0

    return-void
.end method

.method public final zzl(Lcom/google/android/gms/internal/ads/zzcbb;)V
    .locals 0

    return-void
.end method

.method public final zzm(Lcom/google/android/gms/dynamic/b;)V
    .locals 0

    return-void
.end method

.method public final zzn(Lcom/google/android/gms/dynamic/b;Z)V
    .locals 0

    return-void
.end method

.method public final zzo()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final zzp(Lcom/google/android/gms/internal/ads/zzcav;)V
    .locals 0

    return-void
.end method
