.class public final Lcom/google/android/gms/internal/ads/zzeff;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzhhd;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzhhu;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzhhu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeff;->zza:Lcom/google/android/gms/internal/ads/zzhhu;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/google/android/gms/internal/ads/zzefe;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeff;->zza:Lcom/google/android/gms/internal/ads/zzhhu;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzcmh;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzcmh;->zza()Lcom/google/android/gms/internal/ads/zzbzp;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/ads/zzefe;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/ads/zzefe;-><init>(Lcom/google/android/gms/internal/ads/zzbzp;)V

    return-object v1
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/ads/zzeff;->zza()Lcom/google/android/gms/internal/ads/zzefe;

    move-result-object v0

    return-object v0
.end method
