.class Lio/flutter/plugins/googlemobileads/FlutterBannerAd;
.super Lio/flutter/plugins/googlemobileads/FlutterAd;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemobileads/FlutterAdLoadedListener;


# instance fields
.field private final adUnitId:Ljava/lang/String;

.field private adView:Lx8/k;

.field private final bannerAdCreator:Lio/flutter/plugins/googlemobileads/BannerAdCreator;

.field private final manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

.field private final request:Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

.field private final size:Lio/flutter/plugins/googlemobileads/FlutterAdSize;


# direct methods
.method public constructor <init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdSize;Lio/flutter/plugins/googlemobileads/BannerAdCreator;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemobileads/FlutterAd;-><init>(I)V

    invoke-static {p2}, Lio/flutter/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lio/flutter/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lio/flutter/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, Lio/flutter/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->adUnitId:Ljava/lang/String;

    iput-object p4, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->request:Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    iput-object p5, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->size:Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    iput-object p6, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->bannerAdCreator:Lio/flutter/plugins/googlemobileads/BannerAdCreator;

    return-void
.end method


# virtual methods
.method dispose()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->adView:Lx8/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/m;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->adView:Lx8/k;

    :cond_0
    return-void
.end method

.method getAdSize()Lio/flutter/plugins/googlemobileads/FlutterAdSize;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->adView:Lx8/k;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lx8/m;->getAdSize()Lx8/i;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->adView:Lx8/k;

    invoke-virtual {v1}, Lx8/m;->getAdSize()Lx8/i;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/flutter/plugins/googlemobileads/FlutterAdSize;-><init>(Lx8/i;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getPlatformView()Lio/flutter/plugin/platform/PlatformView;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->adView:Lx8/k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterPlatformView;

    invoke-direct {v1, v0}, Lio/flutter/plugins/googlemobileads/FlutterPlatformView;-><init>(Landroid/view/View;)V

    return-object v1
.end method

.method load()V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->bannerAdCreator:Lio/flutter/plugins/googlemobileads/BannerAdCreator;

    invoke-virtual {v0}, Lio/flutter/plugins/googlemobileads/BannerAdCreator;->createAdView()Lx8/k;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->adView:Lx8/k;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->adUnitId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lx8/m;->setAdUnitId(Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->adView:Lx8/k;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->size:Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/FlutterAdSize;->getAdSize()Lx8/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx8/m;->setAdSize(Lx8/i;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->adView:Lx8/k;

    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterPaidEventListener;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-direct {v1, v2, p0}, Lio/flutter/plugins/googlemobileads/FlutterPaidEventListener;-><init>(Lio/flutter/plugins/googlemobileads/AdInstanceManager;Lio/flutter/plugins/googlemobileads/FlutterAd;)V

    invoke-virtual {v0, v1}, Lx8/m;->setOnPaidEventListener(Lx8/t;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->adView:Lx8/k;

    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterBannerAdListener;

    iget v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    iget-object v3, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-direct {v1, v2, v3, p0}, Lio/flutter/plugins/googlemobileads/FlutterBannerAdListener;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Lio/flutter/plugins/googlemobileads/FlutterAdLoadedListener;)V

    invoke-virtual {v0, v1}, Lx8/m;->setAdListener(Lx8/e;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->adView:Lx8/k;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->request:Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->adUnitId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->asAdRequest(Ljava/lang/String;)Lx8/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx8/m;->b(Lx8/h;)V

    return-void
.end method

.method public onAdLoaded()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->adView:Lx8/k;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterBannerAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    invoke-virtual {v0}, Lx8/m;->getResponseInfo()Lx8/z;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onAdLoaded(ILx8/z;)V

    :cond_0
    return-void
.end method
