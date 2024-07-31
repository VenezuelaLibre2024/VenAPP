.class public Lio/flutter/plugins/googlemobileads/FlutterMobileAdsWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "FlutterMobileAdsWrapper"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public disableMediationInitialization(Landroid/content/Context;)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/ads/MobileAds;->a(Landroid/content/Context;)V

    return-void
.end method

.method public getRequestConfiguration()Lx8/y;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/MobileAds;->b()Lx8/y;

    move-result-object v0

    return-object v0
.end method

.method public getVersionString()Ljava/lang/String;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/ads/MobileAds;->c()Lx8/a0;

    move-result-object v0

    invoke-virtual {v0}, Lx8/a0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public initialize(Landroid/content/Context;Le9/c;)V
    .locals 0

    invoke-static {p1, p2}, Lcom/google/android/gms/ads/MobileAds;->e(Landroid/content/Context;Le9/c;)V

    return-void
.end method

.method public openAdInspector(Landroid/content/Context;Lx8/s;)V
    .locals 0

    invoke-static {p1, p2}, Lcom/google/android/gms/ads/MobileAds;->f(Landroid/content/Context;Lx8/s;)V

    return-void
.end method

.method public openDebugMenu(Landroid/content/Context;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1, p2}, Lcom/google/android/gms/ads/MobileAds;->g(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public registerWebView(ILio/flutter/embedding/engine/FlutterEngine;)V
    .locals 2

    int-to-long v0, p1

    invoke-static {p2, v0, v1}, Lio/flutter/plugins/webviewflutter/WebViewFlutterAndroidExternalApi;->getWebView(Lio/flutter/embedding/engine/FlutterEngine;J)Landroid/webkit/WebView;

    move-result-object p2

    if-nez p2, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "MobileAds.registerWebView unable to find webView with id: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "FlutterMobileAdsWrapper"

    invoke-static {p2, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lcom/google/android/gms/ads/MobileAds;->h(Landroid/webkit/WebView;)V

    :goto_0
    return-void
.end method

.method public setAppMuted(Z)V
    .locals 0

    invoke-static {p1}, Lcom/google/android/gms/ads/MobileAds;->i(Z)V

    return-void
.end method

.method public setAppVolume(D)V
    .locals 0

    double-to-float p1, p1

    invoke-static {p1}, Lcom/google/android/gms/ads/MobileAds;->j(F)V

    return-void
.end method
