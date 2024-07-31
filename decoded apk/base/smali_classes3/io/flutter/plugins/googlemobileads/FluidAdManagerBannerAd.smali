.class final Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;
.super Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;
.source "SourceFile"


# static fields
.field private static final TAG:Ljava/lang/String; = "FluidAdManagerBannerAd"


# instance fields
.field private containerView:Landroid/view/ViewGroup;

.field private height:I


# direct methods
.method constructor <init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/BannerAdCreator;)V
    .locals 9

    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterAdSize;

    sget-object v1, Lx8/i;->p:Lx8/i;

    invoke-direct {v0, v1}, Lio/flutter/plugins/googlemobileads/FlutterAdSize;-><init>(Lx8/i;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    move-object v2, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v7, p4

    move-object v8, p5

    invoke-direct/range {v2 .. v8}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;-><init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Ljava/util/List;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/BannerAdCreator;)V

    const/4 p1, -0x1

    iput p1, p0, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;->height:I

    return-void
.end method

.method static synthetic access$000(Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;)I
    .locals 0

    iget p0, p0, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;->height:I

    return p0
.end method

.method static synthetic access$002(Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;I)I
    .locals 0

    iput p1, p0, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;->height:I

    return p1
.end method


# virtual methods
.method createContainerView()Landroid/widget/ScrollView;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v0}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "FluidAdManagerBannerAd"

    const-string v1, "Tried to create container view before plugin is attached to an activity."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x0

    return-object v0

    :cond_0
    new-instance v0, Landroid/widget/ScrollView;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method dispose()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/m;->a()V

    iput-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;->containerView:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    iput-object v1, p0, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;->containerView:Landroid/view/ViewGroup;

    :cond_1
    return-void
.end method

.method getPlatformView()Lio/flutter/plugin/platform/PlatformView;
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;->containerView:Landroid/view/ViewGroup;

    if-eqz v0, :cond_1

    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterPlatformView;

    invoke-direct {v1, v0}, Lio/flutter/plugins/googlemobileads/FlutterPlatformView;-><init>(Landroid/view/View;)V

    return-object v1

    :cond_1
    invoke-virtual {p0}, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;->createContainerView()Landroid/widget/ScrollView;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;->containerView:Landroid/view/ViewGroup;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterPlatformView;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    invoke-direct {v0, v1}, Lio/flutter/plugins/googlemobileads/FlutterPlatformView;-><init>(Landroid/view/View;)V

    return-object v0
.end method

.method public onAdLoaded()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    if-eqz v0, :cond_0

    new-instance v1, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd$1;

    invoke-direct {v1, p0}, Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd$1;-><init>(Lio/flutter/plugins/googlemobileads/FluidAdManagerBannerAd;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAdManagerBannerAd;->adView:Ly8/b;

    invoke-virtual {v2}, Lx8/m;->getResponseInfo()Lx8/z;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onAdLoaded(ILx8/z;)V

    :cond_0
    return-void
.end method
