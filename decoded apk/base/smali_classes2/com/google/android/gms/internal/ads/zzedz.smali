.class public final synthetic Lcom/google/android/gms/internal/ads/zzedz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzgdu;


# instance fields
.field public final synthetic zza:Lcom/google/android/gms/internal/ads/zzeyo;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/internal/ads/zzeyo;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzedz;->zza:Lcom/google/android/gms/internal/ads/zzeyo;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzedz;->zza:Lcom/google/android/gms/internal/ads/zzeyo;

    check-cast p1, Landroid/os/Bundle;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzeyo;->zzb()Lcom/google/android/gms/internal/ads/zzext;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->b()Lcom/google/android/gms/internal/ads/zzcdv;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzcdv;->zzh(Landroid/os/Bundle;)Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzext;->zza(Ljava/lang/Object;)Lcom/google/common/util/concurrent/f;

    move-result-object p1

    return-object p1
.end method