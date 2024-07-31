.class final Lcom/google/ads/mediation/c;
.super Lh9/b;
.source "SourceFile"


# instance fields
.field final a:Lcom/google/ads/mediation/AbstractAdViewAdapter;

.field final b:Li9/s;


# direct methods
.method public constructor <init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Li9/s;)V
    .locals 0

    invoke-direct {p0}, Lh9/b;-><init>()V

    iput-object p1, p0, Lcom/google/ads/mediation/c;->a:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    iput-object p2, p0, Lcom/google/ads/mediation/c;->b:Li9/s;

    return-void
.end method


# virtual methods
.method public final onAdFailedToLoad(Lx8/o;)V
    .locals 2

    iget-object v0, p0, Lcom/google/ads/mediation/c;->b:Li9/s;

    iget-object v1, p0, Lcom/google/ads/mediation/c;->a:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    invoke-interface {v0, v1, p1}, Li9/s;->onAdFailedToLoad(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;Lx8/b;)V

    return-void
.end method

.method public final bridge synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lcom/google/ads/mediation/c;->a:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    check-cast p1, Lh9/a;

    iput-object p1, v0, Lcom/google/ads/mediation/AbstractAdViewAdapter;->mInterstitialAd:Lh9/a;

    iget-object v1, p0, Lcom/google/ads/mediation/c;->b:Li9/s;

    new-instance v2, Lcom/google/ads/mediation/d;

    invoke-direct {v2, v0, v1}, Lcom/google/ads/mediation/d;-><init>(Lcom/google/ads/mediation/AbstractAdViewAdapter;Li9/s;)V

    invoke-virtual {p1, v2}, Lh9/a;->setFullScreenContentCallback(Lx8/n;)V

    iget-object p1, p0, Lcom/google/ads/mediation/c;->b:Li9/s;

    iget-object v0, p0, Lcom/google/ads/mediation/c;->a:Lcom/google/ads/mediation/AbstractAdViewAdapter;

    invoke-interface {p1, v0}, Li9/s;->onAdLoaded(Lcom/google/android/gms/ads/mediation/MediationInterstitialAdapter;)V

    return-void
.end method
