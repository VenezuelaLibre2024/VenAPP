.class public final synthetic Lcom/google/android/gms/internal/ads/zzcxj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzcxp;

.field public final synthetic zzb:Lcom/google/common/util/concurrent/f;

.field public final synthetic zzc:Lcom/google/common/util/concurrent/f;

.field public final synthetic zzd:Lcom/google/common/util/concurrent/f;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzcxp;Lcom/google/common/util/concurrent/f;Lcom/google/common/util/concurrent/f;Lcom/google/common/util/concurrent/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcxj;->zza:Lcom/google/android/gms/internal/ads/zzcxp;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcxj;->zzb:Lcom/google/common/util/concurrent/f;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzcxj;->zzc:Lcom/google/common/util/concurrent/f;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzcxj;->zzd:Lcom/google/common/util/concurrent/f;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcxj;->zza:Lcom/google/android/gms/internal/ads/zzcxp;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcxj;->zzb:Lcom/google/common/util/concurrent/f;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzcxj;->zzc:Lcom/google/common/util/concurrent/f;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzcxj;->zzd:Lcom/google/common/util/concurrent/f;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/ads/zzcxp;->zzg(Lcom/google/common/util/concurrent/f;Lcom/google/common/util/concurrent/f;Lcom/google/common/util/concurrent/f;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0
.end method
