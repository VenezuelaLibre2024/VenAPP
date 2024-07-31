.class Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;
.super Lio/flutter/plugins/googlemobileads/FlutterAd;
.source "SourceFile"

# interfaces
.implements Lio/flutter/plugins/googlemobileads/FlutterAdLoadedListener;


# instance fields
.field private final adUnitId:Ljava/lang/String;

.field protected adView:Ly8/b;

.field private final bannerAdCreator:Lio/flutter/plugins/googlemobileads/BannerAdCreator;

.field protected final manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

.field private final request:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

.field private final sizes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/flutter/plugins/googlemobileads/FlutterAdSize;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Ljava/util/List;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/BannerAdCreator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lio/flutter/plugins/googlemobileads/AdInstanceManager;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/flutter/plugins/googlemobileads/FlutterAdSize;",
            ">;",
            "Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;",
            "Lio/flutter/plugins/googlemobileads/BannerAdCreator;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemobileads/FlutterAd;-><init>(I)V

    invoke-static {p2}, Lio/flutter/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lio/flutter/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4}, Lio/flutter/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p5}, Lio/flutter/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adUnitId:Ljava/lang/String;

    iput-object p4, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->sizes:Ljava/util/List;

    iput-object p5, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->request:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    iput-object p6, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->bannerAdCreator:Lio/flutter/plugins/googlemobileads/BannerAdCreator;

    return-void
.end method


# virtual methods
.method dispose()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/m;->a()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    :cond_0
    return-void
.end method

.method getAdSize()Lio/flutter/plugins/googlemobileads/FlutterAdSize;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lx8/m;->getAdSize()Lx8/i;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    invoke-virtual {v1}, Lx8/m;->getAdSize()Lx8/i;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/flutter/plugins/googlemobileads/FlutterAdSize;-><init>(Lx8/i;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method getPlatformView()Lio/flutter/plugin/platform/PlatformView;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

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

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->bannerAdCreator:Lio/flutter/plugins/googlemobileads/BannerAdCreator;

    invoke-virtual {v0}, Lio/flutter/plugins/googlemobileads/BannerAdCreator;->createAdManagerAdView()Ly8/b;

    move-result-object v0

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    instance-of v1, p0, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;

    if-eqz v1, :cond_0

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adUnitId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lx8/m;->setAdUnitId(Ljava/lang/String;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd$1;

    invoke-direct {v1, p0}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd$1;-><init>(Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;)V

    invoke-virtual {v0, v1}, Ly8/b;->setAppEventListener(Ly8/e;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->sizes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    new-array v0, v0, [Lx8/i;

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->sizes:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->sizes:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    invoke-virtual {v2}, Lio/flutter/plugins/googlemobileads/FlutterAdSize;->getAdSize()Lx8/i;

    move-result-object v2

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    invoke-virtual {v1, v0}, Ly8/b;->setAdSizes([Lx8/i;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterBannerAdListener;

    iget v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    iget-object v3, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-direct {v1, v2, v3, p0}, Lio/flutter/plugins/googlemobileads/FlutterBannerAdListener;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Lio/flutter/plugins/googlemobileads/FlutterAdLoadedListener;)V

    invoke-virtual {v0, v1}, Lx8/m;->setAdListener(Lx8/e;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->request:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adUnitId:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->asAdManagerAdRequest(Ljava/lang/String;)Ly8/a;

    move-result-object v1

    invoke-virtual {v0, v1}, Ly8/b;->e(Ly8/a;)V

    return-void
.end method

.method public onAdLoaded()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    invoke-virtual {v0}, Lx8/m;->getResponseInfo()Lx8/z;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onAdLoaded(ILx8/z;)V

    :cond_0
    return-void
.end method
