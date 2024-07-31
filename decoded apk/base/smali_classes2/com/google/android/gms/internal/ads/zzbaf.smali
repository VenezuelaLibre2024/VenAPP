.class public final Lcom/google/android/gms/internal/ads/zzbaf;
.super Lz8/a;
.source "SourceFile"


# instance fields
.field zza:Lx8/n;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzbaj;

.field private final zzc:Ljava/lang/String;

.field private final zzd:Lcom/google/android/gms/internal/ads/zzbag;

.field private zze:Lx8/t;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzbaj;Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Lz8/a;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbag;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/zzbag;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzbaf;->zzd:Lcom/google/android/gms/internal/ads/zzbag;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbaf;->zzb:Lcom/google/android/gms/internal/ads/zzbaj;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbaf;->zzc:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbaf;->zzc:Ljava/lang/String;

    return-object v0
.end method

.method public final getFullScreenContentCallback()Lx8/n;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbaf;->zza:Lx8/n;

    return-object v0
.end method

.method public final getOnPaidEventListener()Lx8/t;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbaf;->zze:Lx8/t;

    return-object v0
.end method

.method public final getResponseInfo()Lx8/z;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbaf;->zzb:Lcom/google/android/gms/internal/ads/zzbaj;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzbaj;->zzf()Lcom/google/android/gms/ads/internal/client/p2;

    move-result-object v0
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lx8/z;->g(Lcom/google/android/gms/ads/internal/client/p2;)Lx8/z;

    move-result-object v0

    return-object v0
.end method

.method public final setFullScreenContentCallback(Lx8/n;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbaf;->zza:Lx8/n;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbaf;->zzd:Lcom/google/android/gms/internal/ads/zzbag;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzbag;->zzg(Lx8/n;)V

    return-void
.end method

.method public final setImmersiveMode(Z)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbaf;->zzb:Lcom/google/android/gms/internal/ads/zzbaj;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzbaj;->zzg(Z)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final setOnPaidEventListener(Lx8/t;)V
    .locals 2

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbaf;->zze:Lx8/t;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbaf;->zzb:Lcom/google/android/gms/internal/ads/zzbaj;

    new-instance v1, Lcom/google/android/gms/ads/internal/client/h4;

    invoke-direct {v1, p1}, Lcom/google/android/gms/ads/internal/client/h4;-><init>(Lx8/t;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzbaj;->zzh(Lcom/google/android/gms/ads/internal/client/i2;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final show(Landroid/app/Activity;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbaf;->zzb:Lcom/google/android/gms/internal/ads/zzbaj;

    invoke-static {p1}, Lcom/google/android/gms/dynamic/d;->h2(Ljava/lang/Object;)Lcom/google/android/gms/dynamic/b;

    move-result-object p1

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbaf;->zzd:Lcom/google/android/gms/internal/ads/zzbag;

    invoke-interface {v0, p1, v1}, Lcom/google/android/gms/internal/ads/zzbaj;->zzi(Lcom/google/android/gms/dynamic/b;Lcom/google/android/gms/internal/ads/zzbaq;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "#007 Could not call remote method."

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
