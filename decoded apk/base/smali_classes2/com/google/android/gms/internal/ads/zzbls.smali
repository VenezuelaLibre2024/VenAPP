.class final Lcom/google/android/gms/internal/ads/zzbls;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:Ly8/b;

.field final synthetic zzb:Lcom/google/android/gms/ads/internal/client/u0;

.field final synthetic zzc:Lcom/google/android/gms/internal/ads/zzblt;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzblt;Ly8/b;Lcom/google/android/gms/ads/internal/client/u0;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzbls;->zza:Ly8/b;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzbls;->zzb:Lcom/google/android/gms/ads/internal/client/u0;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbls;->zzc:Lcom/google/android/gms/internal/ads/zzblt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbls;->zza:Ly8/b;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzbls;->zzb:Lcom/google/android/gms/ads/internal/client/u0;

    invoke-virtual {v0, v1}, Ly8/b;->g(Lcom/google/android/gms/ads/internal/client/u0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "Could not bind."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcec;->zzj(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzbls;->zzc:Lcom/google/android/gms/internal/ads/zzblt;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzblt;->zzc(Lcom/google/android/gms/internal/ads/zzblt;)La9/f;

    const/4 v0, 0x0

    throw v0
.end method
