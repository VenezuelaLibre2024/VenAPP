.class public final synthetic Lcom/google/android/gms/ads/internal/client/e3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/b;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/ads/internal/client/m3;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/gms/ads/internal/client/m3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/client/e3;->a:Lcom/google/android/gms/ads/internal/client/m3;

    return-void
.end method


# virtual methods
.method public final getAdapterStatusMap()Ljava/util/Map;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/google/android/gms/ads/internal/client/h3;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/client/e3;->a:Lcom/google/android/gms/ads/internal/client/m3;

    invoke-direct {v1, v2}, Lcom/google/android/gms/ads/internal/client/h3;-><init>(Lcom/google/android/gms/ads/internal/client/m3;)V

    const-string v2, "com.google.android.gms.ads.MobileAds"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method