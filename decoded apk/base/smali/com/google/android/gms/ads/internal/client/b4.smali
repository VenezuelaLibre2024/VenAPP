.class public final Lcom/google/android/gms/ads/internal/client/b4;
.super Lcom/google/android/gms/ads/internal/client/o1;
.source "SourceFile"


# instance fields
.field private a:Lcom/google/android/gms/internal/ads/zzbpk;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/client/o1;-><init>()V

    return-void
.end method


# virtual methods
.method final synthetic zzb()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/client/b4;->a:Lcom/google/android/gms/internal/ads/zzbpk;

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzbpk;->zzb(Ljava/util/List;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "Could not notify onComplete event."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final zze()F
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    return v0
.end method

.method public final zzf()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    return-object v0
.end method

.method public final zzg()Ljava/util/List;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final zzh(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final zzi()V
    .locals 0

    return-void
.end method

.method public final zzj(Z)V
    .locals 0

    return-void
.end method

.method public final zzk()V
    .locals 2

    const-string v0, "The initialization is not processed because MobileAdsSettingsManager is not created successfully."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzg(Ljava/lang/String;)V

    sget-object v0, Lcom/google/android/gms/internal/ads/zzcdv;->zza:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/a4;

    invoke-direct {v1, p0}, Lcom/google/android/gms/ads/internal/client/a4;-><init>(Lcom/google/android/gms/ads/internal/client/b4;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final zzl(Ljava/lang/String;Lcom/google/android/gms/dynamic/b;)V
    .locals 0

    return-void
.end method

.method public final zzm(Lcom/google/android/gms/ads/internal/client/c2;)V
    .locals 0

    return-void
.end method

.method public final zzn(Lcom/google/android/gms/dynamic/b;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final zzo(Lcom/google/android/gms/internal/ads/zzbsv;)V
    .locals 0

    return-void
.end method

.method public final zzp(Z)V
    .locals 0

    return-void
.end method

.method public final zzq(F)V
    .locals 0

    return-void
.end method

.method public final zzr(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final zzs(Lcom/google/android/gms/internal/ads/zzbpk;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/b4;->a:Lcom/google/android/gms/internal/ads/zzbpk;

    return-void
.end method

.method public final zzt(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public final zzu(Lcom/google/android/gms/ads/internal/client/i4;)V
    .locals 0

    return-void
.end method

.method public final zzv()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
