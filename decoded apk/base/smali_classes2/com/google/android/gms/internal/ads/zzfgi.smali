.class final Lcom/google/android/gms/internal/ads/zzfgi;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln9/a;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/ads/internal/client/y0;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzfgj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzfgj;Lcom/google/android/gms/ads/internal/client/y0;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfgi;->zza:Lcom/google/android/gms/ads/internal/client/y0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfgi;->zzb:Lcom/google/android/gms/internal/ads/zzfgj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAdMetadataChanged()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfgi;->zzb:Lcom/google/android/gms/internal/ads/zzfgj;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfgj;->zzv(Lcom/google/android/gms/internal/ads/zzfgj;)Lcom/google/android/gms/internal/ads/zzdso;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfgi;->zza:Lcom/google/android/gms/ads/internal/client/y0;

    invoke-interface {v0}, Lcom/google/android/gms/ads/internal/client/y0;->zze()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzl(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method
