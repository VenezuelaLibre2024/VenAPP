.class public final synthetic Lcom/google/android/gms/internal/ads/zzenm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzdkw;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzeiq;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzeiq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzenm;->zza:Lcom/google/android/gms/internal/ads/zzeiq;

    return-void
.end method


# virtual methods
.method public final zza(ZLandroid/content/Context;Lcom/google/android/gms/internal/ads/zzdbk;)V
    .locals 0

    iget-object p2, p0, Lcom/google/android/gms/internal/ads/zzenm;->zza:Lcom/google/android/gms/internal/ads/zzeiq;

    :try_start_0
    iget-object p3, p2, Lcom/google/android/gms/internal/ads/zzeiq;->zzb:Ljava/lang/Object;

    check-cast p3, Lcom/google/android/gms/internal/ads/zzfif;

    invoke-virtual {p3, p1}, Lcom/google/android/gms/internal/ads/zzfif;->zzv(Z)V

    iget-object p1, p2, Lcom/google/android/gms/internal/ads/zzeiq;->zzb:Ljava/lang/Object;

    check-cast p1, Lcom/google/android/gms/internal/ads/zzfif;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzfif;->zzA()V
    :try_end_0
    .catch Lcom/google/android/gms/internal/ads/zzfho; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "Cannot show rewarded video."

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzcec;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p2, Lcom/google/android/gms/internal/ads/zzdkv;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/ads/zzdkv;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method
