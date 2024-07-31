.class Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field final adChoicesPlacement:Ljava/lang/Integer;

.field final mediaAspectRatio:Ljava/lang/Integer;

.field final requestCustomMuteThisAd:Ljava/lang/Boolean;

.field final shouldRequestMultipleImages:Ljava/lang/Boolean;

.field final shouldReturnUrlsForImageAssets:Ljava/lang/Boolean;

.field final videoOptions:Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;


# direct methods
.method constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->adChoicesPlacement:Ljava/lang/Integer;

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->mediaAspectRatio:Ljava/lang/Integer;

    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->videoOptions:Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;

    iput-object p4, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->requestCustomMuteThisAd:Ljava/lang/Boolean;

    iput-object p5, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->shouldRequestMultipleImages:Ljava/lang/Boolean;

    iput-object p6, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->shouldReturnUrlsForImageAssets:Ljava/lang/Boolean;

    return-void
.end method


# virtual methods
.method asNativeAdOptions()Lcom/google/android/gms/ads/nativead/c;
    .locals 2

    new-instance v0, Lcom/google/android/gms/ads/nativead/c$a;

    invoke-direct {v0}, Lcom/google/android/gms/ads/nativead/c$a;-><init>()V

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->adChoicesPlacement:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/nativead/c$a;->c(I)Lcom/google/android/gms/ads/nativead/c$a;

    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->mediaAspectRatio:Ljava/lang/Integer;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/nativead/c$a;->d(I)Lcom/google/android/gms/ads/nativead/c$a;

    :cond_1
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->videoOptions:Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/FlutterVideoOptions;->asVideoOptions()Lx8/c0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/nativead/c$a;->h(Lx8/c0;)Lcom/google/android/gms/ads/nativead/c$a;

    :cond_2
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->requestCustomMuteThisAd:Ljava/lang/Boolean;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/nativead/c$a;->e(Z)Lcom/google/android/gms/ads/nativead/c$a;

    :cond_3
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->shouldRequestMultipleImages:Ljava/lang/Boolean;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/nativead/c$a;->f(Z)Lcom/google/android/gms/ads/nativead/c$a;

    :cond_4
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterNativeAdOptions;->shouldReturnUrlsForImageAssets:Ljava/lang/Boolean;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/nativead/c$a;->g(Z)Lcom/google/android/gms/ads/nativead/c$a;

    :cond_5
    invoke-virtual {v0}, Lcom/google/android/gms/ads/nativead/c$a;->a()Lcom/google/android/gms/ads/nativead/c;

    move-result-object v0

    return-object v0
.end method
