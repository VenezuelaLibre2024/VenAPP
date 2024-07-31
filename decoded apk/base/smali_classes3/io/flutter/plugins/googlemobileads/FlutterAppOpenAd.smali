.class Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;
.super Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterOverlayAd;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd$DelegatingAppOpenAdLoadCallback;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "FlutterAppOpenAd"


# instance fields
.field private ad:Lz8/a;

.field private final adManagerAdRequest:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

.field private final adUnitId:Ljava/lang/String;

.field private final flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

.field private final manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

.field private final request:Lio/flutter/plugins/googlemobileads/FlutterAdRequest;


# direct methods
.method constructor <init>(ILio/flutter/plugins/googlemobileads/AdInstanceManager;Ljava/lang/String;Lio/flutter/plugins/googlemobileads/FlutterAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;Lio/flutter/plugins/googlemobileads/FlutterAdLoader;)V
    .locals 1

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterOverlayAd;-><init>(I)V

    if-nez p4, :cond_1

    if-eqz p5, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    const-string v0, "One of request and adManagerAdRequest must be non-null."

    invoke-static {p1, v0}, Lio/flutter/util/Preconditions;->checkState(ZLjava/lang/Object;)V

    iput-object p2, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iput-object p3, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->adUnitId:Ljava/lang/String;

    iput-object p4, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->request:Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    iput-object p5, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->adManagerAdRequest:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    iput-object p6, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    return-void
.end method

.method static synthetic access$000(Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;Lz8/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->onAdLoaded(Lz8/a;)V

    return-void
.end method

.method static synthetic access$100(Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;Lx8/o;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->onAdFailedToLoad(Lx8/o;)V

    return-void
.end method

.method private onAdFailedToLoad(Lx8/o;)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    new-instance v2, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;

    invoke-direct {v2, p1}, Lio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;-><init>(Lx8/o;)V

    invoke-virtual {v0, v1, v2}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onAdFailedToLoad(ILio/flutter/plugins/googlemobileads/FlutterAd$FlutterLoadAdError;)V

    return-void
.end method

.method private onAdLoaded(Lz8/a;)V
    .locals 2

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->ad:Lz8/a;

    new-instance v0, Lio/flutter/plugins/googlemobileads/FlutterPaidEventListener;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-direct {v0, v1, p0}, Lio/flutter/plugins/googlemobileads/FlutterPaidEventListener;-><init>(Lio/flutter/plugins/googlemobileads/AdInstanceManager;Lio/flutter/plugins/googlemobileads/FlutterAd;)V

    invoke-virtual {p1, v0}, Lz8/a;->setOnPaidEventListener(Lx8/t;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    invoke-virtual {p1}, Lz8/a;->getResponseInfo()Lx8/z;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onAdLoaded(ILx8/z;)V

    return-void
.end method


# virtual methods
.method dispose()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->ad:Lz8/a;

    return-void
.end method

.method load()V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->request:Lio/flutter/plugins/googlemobileads/FlutterAdRequest;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->adUnitId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lio/flutter/plugins/googlemobileads/FlutterAdRequest;->asAdRequest(Ljava/lang/String;)Lx8/h;

    move-result-object v0

    new-instance v3, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd$DelegatingAppOpenAdLoadCallback;

    invoke-direct {v3, p0}, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd$DelegatingAppOpenAdLoadCallback;-><init>(Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;)V

    invoke-virtual {v1, v2, v0, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->loadAppOpen(Ljava/lang/String;Lx8/h;Lz8/a$a;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->adManagerAdRequest:Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->flutterAdLoader:Lio/flutter/plugins/googlemobileads/FlutterAdLoader;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->adUnitId:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lio/flutter/plugins/googlemobileads/FlutterAdManagerAdRequest;->asAdManagerAdRequest(Ljava/lang/String;)Ly8/a;

    move-result-object v0

    new-instance v3, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd$DelegatingAppOpenAdLoadCallback;

    invoke-direct {v3, p0}, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd$DelegatingAppOpenAdLoadCallback;-><init>(Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;)V

    invoke-virtual {v1, v2, v0, v3}, Lio/flutter/plugins/googlemobileads/FlutterAdLoader;->loadAdManagerAppOpen(Ljava/lang/String;Ly8/a;Lz8/a$a;)V

    :cond_1
    :goto_0
    return-void
.end method

.method setImmersiveMode(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->ad:Lz8/a;

    if-nez v0, :cond_0

    const-string p1, "FlutterAppOpenAd"

    const-string v0, "Tried to set immersive mode on app open ad before it was loaded"

    invoke-static {p1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    invoke-virtual {v0, p1}, Lz8/a;->setImmersiveMode(Z)V

    return-void
.end method

.method show()V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->ad:Lz8/a;

    const-string v1, "FlutterAppOpenAd"

    if-nez v0, :cond_0

    const-string v0, "Tried to show app open ad before it was loaded"

    invoke-static {v1, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v0}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->getActivity()Landroid/app/Activity;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "Tried to show app open ad before activity was bound to the plugin."

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->ad:Lz8/a;

    new-instance v1, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;

    iget-object v2, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v3, p0, Lio/flutter/plugins/googlemobileads/FlutterAd;->adId:I

    invoke-direct {v1, v2, v3}, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;-><init>(Lio/flutter/plugins/googlemobileads/AdInstanceManager;I)V

    invoke-virtual {v0, v1}, Lz8/a;->setFullScreenContentCallback(Lx8/n;)V

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->ad:Lz8/a;

    iget-object v1, p0, Lio/flutter/plugins/googlemobileads/FlutterAppOpenAd;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    invoke-virtual {v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->getActivity()Landroid/app/Activity;

    move-result-object v1

    invoke-virtual {v0, v1}, Lz8/a;->show(Landroid/app/Activity;)V

    return-void
.end method
