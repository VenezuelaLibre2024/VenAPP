.class public final synthetic Lcom/google/android/gms/internal/ads/zzfek;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzfeo;

.field public final synthetic zzb:Lcom/google/android/gms/ads/internal/client/c3;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfeo;Lcom/google/android/gms/ads/internal/client/c3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfek;->zza:Lcom/google/android/gms/internal/ads/zzfeo;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfek;->zzb:Lcom/google/android/gms/ads/internal/client/c3;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfek;->zza:Lcom/google/android/gms/internal/ads/zzfeo;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzfeo;->zze:Lcom/google/android/gms/internal/ads/zzfep;

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzfep;->zzc(Lcom/google/android/gms/internal/ads/zzfep;)Lcom/google/android/gms/internal/ads/zzeqe;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfek;->zzb:Lcom/google/android/gms/ads/internal/client/c3;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzeqe;->zzbK(Lcom/google/android/gms/ads/internal/client/c3;)V

    return-void
.end method
