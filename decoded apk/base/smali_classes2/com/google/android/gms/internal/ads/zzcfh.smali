.class final Lcom/google/android/gms/internal/ads/zzcfh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic zza:Landroid/media/MediaPlayer;

.field final synthetic zzb:Lcom/google/android/gms/internal/ads/zzcfp;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/ads/zzcfp;Landroid/media/MediaPlayer;)V
    .locals 0

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcfh;->zza:Landroid/media/MediaPlayer;

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcfh;->zzb:Lcom/google/android/gms/internal/ads/zzcfp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcfh;->zzb:Lcom/google/android/gms/internal/ads/zzcfp;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcfh;->zza:Landroid/media/MediaPlayer;

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/ads/zzcfp;->zzl(Lcom/google/android/gms/internal/ads/zzcfp;Landroid/media/MediaPlayer;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcfh;->zzb:Lcom/google/android/gms/internal/ads/zzcfp;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcfp;->zzi(Lcom/google/android/gms/internal/ads/zzcfp;)Lcom/google/android/gms/internal/ads/zzcfq;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzcfp;->zzi(Lcom/google/android/gms/internal/ads/zzcfp;)Lcom/google/android/gms/internal/ads/zzcfq;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzcfq;->zzf()V

    :cond_0
    return-void
.end method
