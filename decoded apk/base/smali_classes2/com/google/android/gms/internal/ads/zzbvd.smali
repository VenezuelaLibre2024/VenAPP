.class final Lcom/google/android/gms/internal/ads/zzbvd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/e;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzbup;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzbtb;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzbve;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzbve;Lcom/google/android/gms/internal/ads/zzbup;Lcom/google/android/gms/internal/ads/zzbtb;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbvd;->zza:Lcom/google/android/gms/internal/ads/zzbup;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbvd;->zzb:Lcom/google/android/gms/internal/ads/zzbtb;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbvd;->zzc:Lcom/google/android/gms/internal/ads/zzbve;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFailure(Ljava/lang/String;)V
    .locals 3

    new-instance v0, Lx8/b;

    const/4 v1, 0x0

    const-string v2, "undefined"

    invoke-direct {v0, v1, p1, v2}, Lx8/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/ads/zzbvd;->onFailure(Lx8/b;)V

    return-void
.end method

.method public final onFailure(Lx8/b;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbvd;->zza:Lcom/google/android/gms/internal/ads/zzbup;

    invoke-virtual {p1}, Lx8/b;->d()Lcom/google/android/gms/ads/internal/client/c3;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzbup;->zzf(Lcom/google/android/gms/ads/internal/client/c3;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, ""

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final bridge synthetic onSuccess(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Li9/w;

    const-string v0, ""

    if-nez p1, :cond_0

    const-string p1, "Adapter incorrectly returned a null ad. The onFailure() callback should be called if an adapter fails to load an ad."

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzj(Ljava/lang/String;)V

    const/4 p1, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbvd;->zza:Lcom/google/android/gms/internal/ads/zzbup;

    const-string v2, "Adapter returned null."

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzbup;->zze(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_0
    :try_start_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbvd;->zzc:Lcom/google/android/gms/internal/ads/zzbve;

    invoke-static {v1, p1}, Lcom/google/android/gms/internal/ads/zzbve;->zzu(Lcom/google/android/gms/internal/ads/zzbve;Li9/w;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbvd;->zza:Lcom/google/android/gms/internal/ads/zzbup;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzbup;->zzg()V
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzh(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbvd;->zzb:Lcom/google/android/gms/internal/ads/zzbtb;

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbvf;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzbvf;-><init>(Lcom/google/android/gms/internal/ads/zzbtb;)V

    move-object p1, v0

    :goto_1
    return-object p1
.end method
