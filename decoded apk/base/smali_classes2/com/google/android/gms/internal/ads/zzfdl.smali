.class public final synthetic Lcom/google/android/gms/internal/ads/zzfdl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgdu;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzfdp;

.field public final synthetic zzb:Lcom/google/android/gms/internal/ads/zzdae;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzfdp;Lcom/google/android/gms/internal/ads/zzdae;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzfdl;->zza:Lcom/google/android/gms/internal/ads/zzfdp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzfdl;->zzb:Lcom/google/android/gms/internal/ads/zzdae;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzfdl;->zza:Lcom/google/android/gms/internal/ads/zzfdp;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzfdl;->zzb:Lcom/google/android/gms/internal/ads/zzdae;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzfdy;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzfdp;->zza(Lcom/google/android/gms/internal/ads/zzdae;Lcom/google/android/gms/internal/ads/zzfdy;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method
