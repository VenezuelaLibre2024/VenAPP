.class public final Lcom/google/android/gms/internal/ads/zzcqu;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhhd;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzhhu;

.field private final zzb:Lcom/google/android/gms/internal/ads/zzhhu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhhu;Lcom/google/android/gms/internal/ads/zzhhu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzcqu;->zza:Lcom/google/android/gms/internal/ads/zzhhu;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzcqu;->zzb:Lcom/google/android/gms/internal/ads/zzhhu;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzcqt;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzcqu;->zza:Lcom/google/android/gms/internal/ads/zzhhu;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzhhh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzhhh;->zzd()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzcqu;->zzb:Lcom/google/android/gms/internal/ads/zzhhu;

    check-cast v1, Lcom/google/android/gms/internal/ads/zzhhh;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzhhh;->zzd()Ljava/util/Map;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/zzcqt;

    invoke-direct {v2, v0, v1}, Lcom/google/android/gms/internal/ads/zzcqt;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    return-object v2
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzcqu;->zza()Lcom/google/android/gms/internal/ads/zzcqt;

    move-result-object v0

    return-object v0
.end method
