.class public Lcom/google/android/gms/internal/ads/zzgee;
.super Lcom/google/android/gms/internal/ads/zzgeo;
.source "SourceFile"


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzgeo;-><init>()V

    return-void
.end method

.method public static zzu(Lcom/google/common/util/concurrent/f;)Lcom/google/android/gms/internal/ads/zzgee;
    .locals 1

    instance-of v0, p0, Lcom/google/android/gms/internal/ads/zzgee;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/google/android/gms/internal/ads/zzgee;

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/ads/zzgef;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/ads/zzgef;-><init>(Lcom/google/common/util/concurrent/f;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
