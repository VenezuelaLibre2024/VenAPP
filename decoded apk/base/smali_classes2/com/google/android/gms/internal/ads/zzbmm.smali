.class final Lcom/google/android/gms/internal/ads/zzbmm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzbng;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;Ljava/util/Map;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzcjk;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzcjk;->zzK()Lcom/google/android/gms/internal/ads/zzbja;

    move-result-object p2

    const-string v0, "nativeClickMetaReady"

    if-eqz p2, :cond_0

    invoke-interface {p2}, Lcom/google/android/gms/internal/ads/zzbja;->zzb()Lorg/json/JSONObject;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzbqa;->zze(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void

    :cond_0
    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    invoke-interface {p1, v0, p2}, Lcom/google/android/gms/internal/ads/zzbqa;->zze(Ljava/lang/String;Lorg/json/JSONObject;)V

    return-void
.end method