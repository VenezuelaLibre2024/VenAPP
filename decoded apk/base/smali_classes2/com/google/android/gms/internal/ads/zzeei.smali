.class final Lcom/google/android/gms/internal/ads/zzeei;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgej;


# instance fields
.field final synthetic zza:Lcom/google/android/gms/internal/ads/zzbza;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzeem;Lcom/google/android/gms/internal/ads/zzbza;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzeei;->zza:Lcom/google/android/gms/internal/ads/zzbza;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Throwable;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeei;->zza:Lcom/google/android/gms/internal/ads/zzbza;

    invoke-static {p1}, Lcom/google/android/gms/ads/internal/util/d0;->v1(Ljava/lang/Throwable;)Lcom/google/android/gms/ads/internal/util/d0;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzbza;->zze(Lcom/google/android/gms/ads/internal/util/d0;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Service can\'t call client"

    invoke-static {v0, p1}, Lcom/google/android/gms/ads/internal/util/u1;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final bridge synthetic zzb(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Landroid/os/ParcelFileDescriptor;

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeei;->zza:Lcom/google/android/gms/internal/ads/zzbza;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzbza;->zzf(Landroid/os/ParcelFileDescriptor;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Service can\'t call client"

    invoke-static {v0, p1}, Lcom/google/android/gms/ads/internal/util/u1;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
