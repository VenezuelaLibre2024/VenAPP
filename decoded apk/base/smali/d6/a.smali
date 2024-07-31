.class public Ld6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li9/j;
.implements Lcom/facebook/ads/AdListener;


# instance fields
.field private final a:Li9/l;

.field private final b:Li9/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Li9/e<",
            "Li9/j;",
            "Li9/k;",
            ">;"
        }
    .end annotation
.end field

.field private c:Lcom/facebook/ads/AdView;

.field private d:Landroid/widget/FrameLayout;

.field private e:Li9/k;

.field private final f:Lc6/f;


# direct methods
.method public constructor <init>(Li9/l;Li9/e;Lc6/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/l;",
            "Li9/e<",
            "Li9/j;",
            "Li9/k;",
            ">;",
            "Lc6/f;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld6/a;->a:Li9/l;

    iput-object p2, p0, Ld6/a;->b:Li9/e;

    iput-object p3, p0, Ld6/a;->f:Lc6/f;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 5

    iget-object v0, p0, Ld6/a;->a:Li9/l;

    invoke-virtual {v0}, Li9/d;->c()Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lcom/google/ads/mediation/facebook/FacebookMediationAdapter;->getPlacementID(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const-string v2, "com.google.ads.mediation.facebook"

    if-eqz v1, :cond_0

    new-instance v0, Lx8/b;

    const/16 v1, 0x65

    const-string v3, "Failed to request ad. PlacementID is null or empty."

    invoke-direct {v0, v1, v3, v2}, Lx8/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sget-object v1, Lcom/google/ads/mediation/facebook/FacebookMediationAdapter;->TAG:Ljava/lang/String;

    invoke-virtual {v0}, Lx8/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Ld6/a;->b:Li9/e;

    invoke-interface {v1, v0}, Li9/e;->onFailure(Lx8/b;)V

    return-void

    :cond_0
    iget-object v1, p0, Ld6/a;->a:Li9/l;

    invoke-static {v1}, Lcom/google/ads/mediation/facebook/FacebookMediationAdapter;->setMixedAudience(Li9/d;)V

    :try_start_0
    iget-object v1, p0, Ld6/a;->f:Lc6/f;

    iget-object v3, p0, Ld6/a;->a:Li9/l;

    invoke-virtual {v3}, Li9/d;->b()Landroid/content/Context;

    move-result-object v3

    iget-object v4, p0, Ld6/a;->a:Li9/l;

    invoke-virtual {v4}, Li9/d;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v3, v0, v4}, Lc6/f;->c(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/ads/AdView;

    move-result-object v0

    iput-object v0, p0, Ld6/a;->c:Lcom/facebook/ads/AdView;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Ld6/a;->a:Li9/l;

    invoke-virtual {v0}, Li9/d;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ld6/a;->c:Lcom/facebook/ads/AdView;

    new-instance v1, Lcom/facebook/ads/ExtraHints$Builder;

    invoke-direct {v1}, Lcom/facebook/ads/ExtraHints$Builder;-><init>()V

    iget-object v2, p0, Ld6/a;->a:Li9/l;

    invoke-virtual {v2}, Li9/d;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/facebook/ads/ExtraHints$Builder;->mediationData(Ljava/lang/String;)Lcom/facebook/ads/ExtraHints$Builder;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/ads/ExtraHints$Builder;->build()Lcom/facebook/ads/ExtraHints;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ads/AdView;->setExtraHints(Lcom/facebook/ads/ExtraHints;)V

    :cond_1
    iget-object v0, p0, Ld6/a;->a:Li9/l;

    invoke-virtual {v0}, Li9/d;->b()Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    iget-object v2, p0, Ld6/a;->a:Li9/l;

    invoke-virtual {v2}, Li9/l;->f()Lx8/i;

    move-result-object v2

    invoke-virtual {v2, v0}, Lx8/i;->k(Landroid/content/Context;)I

    move-result v2

    const/4 v3, -0x2

    invoke-direct {v1, v2, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    new-instance v2, Landroid/widget/FrameLayout;

    invoke-direct {v2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, Ld6/a;->d:Landroid/widget/FrameLayout;

    iget-object v0, p0, Ld6/a;->c:Lcom/facebook/ads/AdView;

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v0, p0, Ld6/a;->d:Landroid/widget/FrameLayout;

    iget-object v1, p0, Ld6/a;->c:Lcom/facebook/ads/AdView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v0, p0, Ld6/a;->c:Lcom/facebook/ads/AdView;

    invoke-virtual {v0}, Lcom/facebook/ads/AdView;->buildLoadAdConfig()Lcom/facebook/ads/AdView$AdViewLoadConfigBuilder;

    move-result-object v1

    invoke-interface {v1, p0}, Lcom/facebook/ads/AdView$AdViewLoadConfigBuilder;->withAdListener(Lcom/facebook/ads/AdListener;)Lcom/facebook/ads/AdView$AdViewLoadConfigBuilder;

    move-result-object v1

    iget-object v2, p0, Ld6/a;->a:Li9/l;

    invoke-virtual {v2}, Li9/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/ads/AdView$AdViewLoadConfigBuilder;->withBid(Ljava/lang/String;)Lcom/facebook/ads/AdView$AdViewLoadConfigBuilder;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/ads/AdView$AdViewLoadConfigBuilder;->build()Lcom/facebook/ads/AdView$AdViewLoadConfig;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/ads/AdView;->loadAd(Lcom/facebook/ads/AdView$AdViewLoadConfig;)V

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Lx8/b;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to create banner ad: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/16 v3, 0x6f

    invoke-direct {v1, v3, v0, v2}, Lx8/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/ads/mediation/facebook/FacebookMediationAdapter;->TAG:Ljava/lang/String;

    invoke-virtual {v1}, Lx8/b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ld6/a;->b:Li9/e;

    invoke-interface {v0, v1}, Li9/e;->onFailure(Lx8/b;)V

    return-void
.end method

.method public getView()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Ld6/a;->d:Landroid/widget/FrameLayout;

    return-object v0
.end method

.method public onAdClicked(Lcom/facebook/ads/Ad;)V
    .locals 0

    iget-object p1, p0, Ld6/a;->e:Li9/k;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Li9/c;->reportAdClicked()V

    iget-object p1, p0, Ld6/a;->e:Li9/k;

    invoke-interface {p1}, Li9/c;->onAdOpened()V

    iget-object p1, p0, Ld6/a;->e:Li9/k;

    invoke-interface {p1}, Li9/k;->onAdLeftApplication()V

    :cond_0
    return-void
.end method

.method public onAdLoaded(Lcom/facebook/ads/Ad;)V
    .locals 0

    iget-object p1, p0, Ld6/a;->b:Li9/e;

    invoke-interface {p1, p0}, Li9/e;->onSuccess(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li9/k;

    iput-object p1, p0, Ld6/a;->e:Li9/k;

    return-void
.end method

.method public onError(Lcom/facebook/ads/Ad;Lcom/facebook/ads/AdError;)V
    .locals 1

    invoke-static {p2}, Lcom/google/ads/mediation/facebook/FacebookMediationAdapter;->getAdError(Lcom/facebook/ads/AdError;)Lx8/b;

    move-result-object p1

    sget-object p2, Lcom/google/ads/mediation/facebook/FacebookMediationAdapter;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Lx8/b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p2, p0, Ld6/a;->b:Li9/e;

    invoke-interface {p2, p1}, Li9/e;->onFailure(Lx8/b;)V

    return-void
.end method

.method public onLoggingImpression(Lcom/facebook/ads/Ad;)V
    .locals 0

    iget-object p1, p0, Ld6/a;->e:Li9/k;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Li9/c;->reportAdImpression()V

    :cond_0
    return-void
.end method
