.class Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;
.super Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterOverlayAd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd$DelegatingAdManagerInterstitialAdCallbacks;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "FltGAMInterstitialAd"


# instance fields
.field private ad:Ly8/c;

.field private final adUnitId:Ljava/lang/String;

.field private final flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

.field private final manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

.field private final request:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;


# direct methods
.method public constructor <init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterOverlayAd;-><init>(I)V

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->adUnitId:Ljava/lang/String;

    iput-object p4, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->request:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    iput-object p5, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    return-void
.end method


# virtual methods
.method dispose()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->ad:Ly8/c;

    return-void
.end method

.method load()V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->adUnitId:Ljava/lang/String;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->request:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    invoke-virtual {v2, v1}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->asAdManagerAdRequest(Ljava/lang/String;)Ly8/a;

    move-result-object v2

    new-instance v3, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd$DelegatingAdManagerInterstitialAdCallbacks;

    invoke-direct {v3, p0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd$DelegatingAdManagerInterstitialAdCallbacks;-><init>(Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;)V

    invoke-virtual {v0, v1, v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->loadAdManagerInterstitial(Ljava/lang/String;Ly8/a;Ly8/d;)V

    return-void
.end method

.method onAdFailedToLoad(Lx8/o;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;

    invoke-direct {v2, p1}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;-><init>(Lx8/o;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onAdFailedToLoad(ILio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;)V

    return-void
.end method

.method onAdLoaded(Ly8/c;)V
    .locals 2

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->ad:Ly8/c;

    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd$DelegatingAdManagerInterstitialAdCallbacks;

    invoke-direct {v0, p0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd$DelegatingAdManagerInterstitialAdCallbacks;-><init>(Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;)V

    invoke-virtual {p1, v0}, Ly8/c;->setAppEventListener(Ly8/e;)V

    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterPaidEventListener;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-direct {v0, v1, p0}, Lio/flutter/plugins/googlemobileads/FlutterPaidEventListener;-><init>(Lio/flutter/plugins/googlemobileads/AdInstanceManager;Lio/flutter/plugins/googlemobileads/FlutterAd;)V

    invoke-virtual {p1, v0}, Lh9/a;->setOnPaidEventListener(Lx8/t;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    invoke-virtual {p1}, Lh9/a;->getResponseInfo()Lx8/z;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onAdLoaded(ILx8/z;)V

    return-void
.end method

.method onAppEvent(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    invoke-virtual {v0, v1, p1, p2}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onAppEvent(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setImmersiveMode(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->ad:Ly8/c;

    if-nez v0, :cond_0

    const-string p1, "FltGAMInterstitialAd"

    const-string v0, "The interstitial wasn\'t loaded yet."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lh9/a;->setImmersiveMode(Z)V

    return-void
.end method

.method public show()V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->ad:Ly8/c;

    const-string v1, "FltGAMInterstitialAd"

    if-nez v0, :cond_0

    const-string v0, "The interstitial wasn\'t loaded yet."

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v0}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "Tried to show interstitial before activity was bound to the plugin."

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->ad:Ly8/c;

    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v3, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    invoke-direct {v1, v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;-><init>(Lio/flutter/plugins/googlemobileads/AdInstanceManager;I)V

    invoke-virtual {v0, v1}, Lh9/a;->setFullScreenContentCallback(Lx8/n;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->ad:Ly8/c;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lh9/a;->show(Landroid/app/Activity;)V

    return-void
.end method
