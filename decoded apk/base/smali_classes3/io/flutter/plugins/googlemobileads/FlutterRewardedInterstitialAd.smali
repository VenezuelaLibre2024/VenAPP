.class Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;
.super Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterOverlayAd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd$DelegatingRewardedCallback;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "FlutterRIAd"


# instance fields
.field private final adManagerRequest:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

.field private final adUnitId:Ljava/lang/String;

.field private final flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

.field private final manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

.field private final request:Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

.field rewardedInterstitialAd:Lo9/a;


# direct methods
.method public constructor <init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterOverlayAd;-><init>(I)V

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->adUnitId:Ljava/lang/String;

    iput-object p4, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->adManagerRequest:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->request:Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    iput-object p5, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    return-void
.end method

.method public constructor <init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterOverlayAd;-><init>(I)V

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->adUnitId:Ljava/lang/String;

    iput-object p4, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->request:Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    const/4 p1, 0x0

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->adManagerRequest:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    iput-object p5, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    return-void
.end method


# virtual methods
.method dispose()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->rewardedInterstitialAd:Lo9/a;

    return-void
.end method

.method load()V
    .locals 4

    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd$DelegatingRewardedCallback;

    invoke-direct {v0, p0}, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd$DelegatingRewardedCallback;-><init>(Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;)V

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->request:Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    iget-object v3, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->adUnitId:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->asAdRequest(Ljava/lang/String;)Lx8/h;

    move-result-object v1

    invoke-virtual {v2, v3, v1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->loadRewardedInterstitial(Ljava/lang/String;Lx8/h;Lo9/b;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->adManagerRequest:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    iget-object v3, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->adUnitId:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->asAdManagerAdRequest(Ljava/lang/String;)Ly8/a;

    move-result-object v1

    invoke-virtual {v2, v3, v1, v0}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->loadAdManagerRewardedInterstitial(Ljava/lang/String;Ly8/a;Lo9/b;)V

    goto :goto_0

    :cond_1
    const-string v0, "FlutterRIAd"

    const-string v1, "A null or invalid ad request was provided."

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method onAdFailedToLoad(Lx8/o;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;

    invoke-direct {v2, p1}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;-><init>(Lx8/o;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onAdFailedToLoad(ILio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;)V

    return-void
.end method

.method onAdLoaded(Lo9/a;)V
    .locals 2

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->rewardedInterstitialAd:Lo9/a;

    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterPaidEventListener;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-direct {v0, v1, p0}, Lio/flutter/plugins/googlemobileads/FlutterPaidEventListener;-><init>(Lio/flutter/plugins/googlemobileads/AdInstanceManager;Lio/flutter/plugins/googlemobileads/FlutterAd;)V

    invoke-virtual {p1, v0}, Lo9/a;->setOnPaidEventListener(Lx8/t;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    invoke-virtual {p1}, Lo9/a;->getResponseInfo()Lx8/z;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onAdLoaded(ILx8/z;)V

    return-void
.end method

.method onAdMetadataChanged()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onAdMetadataChanged(I)V

    return-void
.end method

.method onUserEarnedReward(Ln9/b;)V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$FlutterRewardItem;

    invoke-interface {p1}, Ln9/b;->getAmount()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p1}, Ln9/b;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, v3, p1}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$FlutterRewardItem;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onRewardedAdUserEarnedReward(ILio/flutter/plugins/googlemobileads/FlutterRewardedAd$FlutterRewardItem;)V

    return-void
.end method

.method public setImmersiveMode(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->rewardedInterstitialAd:Lo9/a;

    if-nez v0, :cond_0

    const-string p1, "FlutterRIAd"

    const-string v0, "Error setting immersive mode in rewarded interstitial ad - the rewarded interstitial ad wasn\'t loaded yet."

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lo9/a;->setImmersiveMode(Z)V

    return-void
.end method

.method public setServerSideVerificationOptions(Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->rewardedInterstitialAd:Lo9/a;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/flutter/plugins/googlemobileads/FlutterServerSideVerificationOptions;->asServerSideVerificationOptions()Ln9/e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lo9/a;->setServerSideVerificationOptions(Ln9/e;)V

    goto :goto_0

    :cond_0
    const-string p1, "FlutterRIAd"

    const-string v0, "RewardedInterstitialAd is null in setServerSideVerificationOptions"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :goto_0
    return-void
.end method

.method public show()V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->rewardedInterstitialAd:Lo9/a;

    const-string v1, "FlutterRIAd"

    if-nez v0, :cond_0

    const-string v0, "Error showing rewarded interstitial - the rewarded interstitial ad wasn\'t loaded yet."

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v0}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "Tried to show rewarded interstitial ad before activity was bound to the plugin."

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->rewardedInterstitialAd:Lo9/a;

    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v3, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    invoke-direct {v1, v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;-><init>(Lio/flutter/plugins/googlemobileads/AdInstanceManager;I)V

    invoke-virtual {v0, v1}, Lo9/a;->setFullScreenContentCallback(Lx8/n;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->rewardedInterstitialAd:Lo9/a;

    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd$DelegatingRewardedCallback;

    invoke-direct {v1, p0}, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd$DelegatingRewardedCallback;-><init>(Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;)V

    invoke-virtual {v0, v1}, Lo9/a;->setOnAdMetadataChangedListener(Ln9/a;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->rewardedInterstitialAd:Lo9/a;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->getActivity()Landroid/app/Activity;

    move-result-object v1

    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd$DelegatingRewardedCallback;

    invoke-direct {v2, p0}, Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd$DelegatingRewardedCallback;-><init>(Lio/flutter/plugins/googlemobileads/FlutterRewardedInterstitialAd;)V

    invoke-virtual {v0, v1, v2}, Lo9/a;->show(Landroid/app/Activity;Lx8/u;)V

    return-void
.end method
