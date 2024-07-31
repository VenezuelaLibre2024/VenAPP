.class public final Lcom/google/android/gms/internal/ads/zzbwi;
.super Lcom/google/android/gms/internal/ads/zzbkz;
.source "SourceFile"


# instance fields
.field private final zza:Lcom/google/android/gms/ads/nativead/b$c;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/nativead/b$c;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/ads/zzbkz;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzbwi;->zza:Lcom/google/android/gms/ads/nativead/b$c;

    return-void
.end method


# virtual methods
.method public final zze(Lcom/google/android/gms/internal/ads/zzblj;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/zzbwb;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/zzbwb;-><init>(Lcom/google/android/gms/internal/ads/zzblj;)V

    iget-object p1, p0, Lcom/google/android/gms/internal/ads/zzbwi;->zza:Lcom/google/android/gms/ads/nativead/b$c;

    invoke-interface {p1, v0}, Lcom/google/android/gms/ads/nativead/b$c;->onNativeAdLoaded(Lcom/google/android/gms/ads/nativead/b;)V

    return-void
.end method
