.class public final Lcom/google/android/gms/internal/ads/zzeun;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzexq;


# instance fields
.field private final zza:Lcom/google/android/gms/internal/ads/zzgey;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/ads/zzgey;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzeun;->zza:Lcom/google/android/gms/internal/ads/zzgey;

    return-void
.end method


# virtual methods
.method public final zza()I
    .locals 1

    const/16 v0, 0x14

    return v0
.end method

.method public final zzb()Lcom/google/common/util/concurrent/f;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzeun;->zza:Lcom/google/android/gms/internal/ads/zzgey;

    sget-object v1, Lcom/google/android/gms/internal/ads/zzeum;->zza:Lcom/google/android/gms/internal/ads/zzeum;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzgey;->zzb(Ljava/util/concurrent/Callable;)Lcom/google/common/util/concurrent/f;

    move-result-object v0

    return-object v0
.end method
