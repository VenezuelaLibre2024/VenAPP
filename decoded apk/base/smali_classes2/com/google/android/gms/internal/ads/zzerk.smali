.class public final Lcom/google/android/gms/internal/ads/zzerk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzexq;


# instance fields
.field private final zza:Lla/f;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzfhh;


# direct methods
.method constructor <init>(Lla/f;Lcom/google/android/gms/internal/ads/zzfhh;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzerk;->zza:Lla/f;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzerk;->zzb:Lcom/google/android/gms/internal/ads/zzfhh;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final zzb()Lcom/google/common/util/concurrent/f;
    .locals 5

    new-instance v0, Lcom/google/android/gms/internal/ads/zzerl;

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzerk;->zza:Lla/f;

    iget-object v2, p0, Lcom/google/android/gms/internal/ads/zzerk;->zzb:Lcom/google/android/gms/internal/ads/zzfhh;

    invoke-interface {v1}, Lla/f;->a()J

    move-result-wide v3

    invoke-direct {v0, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzerl;-><init>(Lcom/google/android/gms/internal/ads/zzfhh;J)V

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzgen;->zzh(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0
.end method
