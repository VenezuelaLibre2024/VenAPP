.class public abstract Lcom/google/ads/mediation/AbstractAdViewAdapter;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/ads/mediation/MediationBannerAdapter;
.implements Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;
.implements Lcom/google/android/gms/ads/mediation/MediationNativeAdapter;
.implements Li9/b0;
.implements Li9/d0;


# static fields
.field public static final AD_UNIT_ID_PARAMETER:Ljava/lang/String; = "pubid"


# instance fields
.field private adLoader:Lx8/g;

.field protected mAdView:Lx8/k;

.field protected mInterstitialAd:Lh9/a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method buildAdRequest(Landroid/content/Context;Li9/f;Landroid/os/Bundle;Landroid/os/Bundle;)Lx8/h;
    .locals 3

    new-instance v0, Lx8/h$a;

    invoke-direct {v0}, Lx8/h$a;-><init>()V

    invoke-interface {p2}, Li9/f;->getKeywords()Ljava/util/Set;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v0, v2}, Lx8/a;->a(Ljava/lang/String;)Lx8/a;

    goto :goto_0

    :cond_0
    invoke-interface {p2}, Li9/f;->isTesting()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/x;->b()Lcom/google/android/gms/internal/ads/zzcdv;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzcdv;->zzy(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lx8/a;->h(Ljava/lang/String;)Lx8/a;

    :cond_1
    invoke-interface {p2}, Li9/f;->taggedForChildDirectedTreatment()I

    move-result p1

    const/4 v1, -0x1

    if-eq p1, v1, :cond_3

    invoke-interface {p2}, Li9/f;->taggedForChildDirectedTreatment()I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {v0, v1}, Lx8/a;->j(Z)Lx8/a;

    :cond_3
    invoke-interface {p2}, Li9/f;->isDesignedForFamilies()Z

    move-result p1

    invoke-virtual {v0, p1}, Lx8/a;->i(Z)Lx8/a;

    invoke-virtual {p0, p3, p4}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->buildExtrasBundle(Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    const-class p2, Lcom/google/ads/mediation/admob/AdMobAdapter;

    invoke-virtual {v0, p2, p1}, Lx8/a;->b(Ljava/lang/Class;Landroid/os/Bundle;)Lx8/a;

    invoke-virtual {v0}, Lx8/h$a;->k()Lx8/h;

    move-result-object p1

    return-object p1
.end method

.method protected abstract buildExtrasBundle(Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;
.end method

.method public getAdUnitId(Landroid/os/Bundle;)Ljava/lang/String;
    .locals 1

    const-string v0, "pubid"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public getBannerView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Lx8/k;

    return-object v0
.end method

.method getInterstitialAd()Lh9/a;
    .locals 1

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mInterstitialAd:Lh9/a;

    return-object v0
.end method

.method public getVideoController()Lcom/google/android/gms/ads/internal/client/s2;
    .locals 1

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Lx8/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/k;->e()Lx8/b0;

    move-result-object v0

    invoke-virtual {v0}, Lx8/b0;->b()Lcom/google/android/gms/ads/internal/client/s2;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method newAdLoader(Landroid/content/Context;Ljava/lang/String;)Lx8/g$a;
    .locals 1

    new-instance v0, Lx8/g$a;

    invoke-direct {v0, p1, p2}, Lx8/g$a;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    return-object v0
.end method

.method public onDestroy()V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Lx8/k;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/m;->a()V

    iput-object v1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Lx8/k;

    :cond_0
    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mInterstitialAd:Lh9/a;

    if-eqz v0, :cond_1

    iput-object v1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mInterstitialAd:Lh9/a;

    :cond_1
    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->adLoader:Lx8/g;

    if-eqz v0, :cond_2

    iput-object v1, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->adLoader:Lx8/g;

    :cond_2
    return-void
.end method

.method public onImmersiveModeUpdated(Z)V
    .locals 1

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mInterstitialAd:Lh9/a;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lh9/a;->setImmersiveMode(Z)V

    :cond_0
    return-void
.end method

.method public onPause()V
    .locals 1

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Lx8/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/m;->c()V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 1

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Lx8/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lx8/m;->d()V

    :cond_0
    return-void
.end method

.method public requestBannerAd(Landroid/content/Context;Li9/m;Landroid/os/Bundle;Lx8/i;Li9/f;Landroid/os/Bundle;)V
    .locals 3

    new-instance v0, Lx8/k;

    invoke-direct {v0, p1}, Lx8/k;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Lx8/k;

    new-instance v1, Lx8/i;

    invoke-virtual {p4}, Lx8/i;->j()I

    move-result v2

    invoke-virtual {p4}, Lx8/i;->c()I

    move-result p4

    invoke-direct {v1, v2, p4}, Lx8/i;-><init>(II)V

    invoke-virtual {v0, v1}, Lx8/m;->setAdSize(Lx8/i;)V

    iget-object p4, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Lx8/k;

    invoke-virtual {p0, p3}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->getAdUnitId(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Lx8/m;->setAdUnitId(Ljava/lang/String;)V

    iget-object p4, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Lx8/k;

    new-instance v0, Lcom/google/ads/mediation/b;

    invoke-direct {v0, p0, p2}, Lcom/google/ads/mediation/b;-><init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Li9/m;)V

    invoke-virtual {p4, v0}, Lx8/m;->setAdListener(Lx8/e;)V

    iget-object p2, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mAdView:Lx8/k;

    invoke-virtual {p0, p1, p5, p6, p3}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->buildAdRequest(Landroid/content/Context;Li9/f;Landroid/os/Bundle;Landroid/os/Bundle;)Lx8/h;

    move-result-object p1

    invoke-virtual {p2, p1}, Lx8/m;->b(Lx8/h;)V

    return-void
.end method

.method public requestInterstitialAd(Landroid/content/Context;Li9/s;Landroid/os/Bundle;Li9/f;Landroid/os/Bundle;)V
    .locals 1

    invoke-virtual {p0, p3}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->getAdUnitId(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p4, p5, p3}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->buildAdRequest(Landroid/content/Context;Li9/f;Landroid/os/Bundle;Landroid/os/Bundle;)Lx8/h;

    move-result-object p3

    new-instance p4, Lcom/google/ads/mediation/c;

    invoke-direct {p4, p0, p2}, Lcom/google/ads/mediation/c;-><init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Li9/s;)V

    invoke-static {p1, v0, p3, p4}, Lh9/a;->load(Landroid/content/Context;Ljava/lang/String;Lx8/h;Lh9/b;)V

    return-void
.end method

.method public requestNativeAd(Landroid/content/Context;Li9/v;Landroid/os/Bundle;Li9/z;Landroid/os/Bundle;)V
    .locals 5

    new-instance v0, Lcom/google/ads/mediation/e;

    invoke-direct {v0, p0, p2}, Lcom/google/ads/mediation/e;-><init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Li9/v;)V

    const-string p2, "pubid"

    invoke-virtual {p3, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->newAdLoader(Landroid/content/Context;Ljava/lang/String;)Lx8/g$a;

    move-result-object p2

    invoke-virtual {p2, v0}, Lx8/g$a;->c(Lx8/e;)Lx8/g$a;

    move-result-object p2

    invoke-interface {p4}, Li9/z;->getNativeAdOptions()La9/e;

    move-result-object v1

    invoke-virtual {p2, v1}, Lx8/g$a;->g(La9/e;)Lx8/g$a;

    invoke-interface {p4}, Li9/z;->getNativeAdRequestOptions()Lcom/google/android/gms/ads/nativead/c;

    move-result-object v1

    invoke-virtual {p2, v1}, Lx8/g$a;->d(Lcom/google/android/gms/ads/nativead/c;)Lx8/g$a;

    invoke-interface {p4}, Li9/z;->isUnifiedNativeAdRequested()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p2, v0}, Lx8/g$a;->f(La9/p;)Lx8/g$a;

    :cond_0
    invoke-interface {p4}, Li9/z;->zzb()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p4}, Li9/z;->zza()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p4}, Li9/z;->zza()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v4, 0x1

    if-eq v4, v3, :cond_1

    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    invoke-virtual {p2, v2, v0, v3}, Lx8/g$a;->e(Ljava/lang/String;La9/n;La9/m;)Lx8/g$a;

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Lx8/g$a;->a()Lx8/g;

    move-result-object p2

    iput-object p2, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->adLoader:Lx8/g;

    invoke-virtual {p0, p1, p4, p5, p3}, Lcom/google/ads/mediation/AbstractAdViewAdapter;->buildAdRequest(Landroid/content/Context;Li9/f;Landroid/os/Bundle;Landroid/os/Bundle;)Lx8/h;

    move-result-object p1

    invoke-virtual {p2, p1}, Lx8/g;->a(Lx8/h;)V

    return-void
.end method

.method public showInterstitial()V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mInterstitialAd:Lh9/a;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lh9/a;->show(Landroid/app/Activity;)V

    :cond_0
    return-void
.end method
