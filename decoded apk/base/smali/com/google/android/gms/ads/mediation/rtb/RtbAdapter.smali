.class public abstract Lcom/google/android/gms/ads/mediation/rtb/RtbAdapter;
.super Li9/a;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Li9/a;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract collectSignals(Lk9/a;Lk9/b;)V
.end method

.method public loadRtbAppOpenAd(Li9/i;Li9/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/i;",
            "Li9/e<",
            "Li9/h;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Li9/a;->loadAppOpenAd(Li9/i;Li9/e;)V

    return-void
.end method

.method public loadRtbBannerAd(Li9/l;Li9/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/l;",
            "Li9/e<",
            "Li9/j;",
            "Li9/k;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Li9/a;->loadBannerAd(Li9/l;Li9/e;)V

    return-void
.end method

.method public loadRtbInterscrollerAd(Li9/l;Li9/e;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/l;",
            "Li9/e<",
            "Li9/o;",
            "Li9/k;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    new-instance v0, Lx8/b;

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    const-string v1, " does not support interscroller ads."

    invoke-virtual {p1, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "com.google.android.gms.ads"

    const/4 v2, 0x7

    invoke-direct {v0, v2, p1, v1}, Lx8/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    invoke-interface {p2, v0}, Li9/e;->onFailure(Lx8/b;)V

    return-void
.end method

.method public loadRtbInterstitialAd(Li9/r;Li9/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/r;",
            "Li9/e<",
            "Li9/p;",
            "Li9/q;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Li9/a;->loadInterstitialAd(Li9/r;Li9/e;)V

    return-void
.end method

.method public loadRtbNativeAd(Li9/u;Li9/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/u;",
            "Li9/e<",
            "Li9/c0;",
            "Li9/t;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Li9/a;->loadNativeAd(Li9/u;Li9/e;)V

    return-void
.end method

.method public loadRtbRewardedAd(Li9/y;Li9/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/y;",
            "Li9/e<",
            "Li9/w;",
            "Li9/x;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Li9/a;->loadRewardedAd(Li9/y;Li9/e;)V

    return-void
.end method

.method public loadRtbRewardedInterstitialAd(Li9/y;Li9/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li9/y;",
            "Li9/e<",
            "Li9/w;",
            "Li9/x;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Li9/a;->loadRewardedInterstitialAd(Li9/y;Li9/e;)V

    return-void
.end method
