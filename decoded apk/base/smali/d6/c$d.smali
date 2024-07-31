.class Ld6/c$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/ads/AdListener;
.implements Lcom/facebook/ads/NativeAdListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field private final a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/facebook/ads/NativeAdBase;

.field final synthetic c:Ld6/c;


# direct methods
.method constructor <init>(Ld6/c;Landroid/content/Context;Lcom/facebook/ads/NativeAdBase;)V
    .locals 0

    iput-object p1, p0, Ld6/c$d;->c:Ld6/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p3, p0, Ld6/c$d;->b:Lcom/facebook/ads/NativeAdBase;

    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Ld6/c$d;->a:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onAdClicked(Lcom/facebook/ads/Ad;)V
    .locals 0

    iget-object p1, p0, Ld6/c$d;->c:Ld6/c;

    invoke-static {p1}, Ld6/c;->Q(Ld6/c;)Li9/t;

    move-result-object p1

    invoke-interface {p1}, Li9/c;->reportAdClicked()V

    iget-object p1, p0, Ld6/c$d;->c:Ld6/c;

    invoke-static {p1}, Ld6/c;->Q(Ld6/c;)Li9/t;

    move-result-object p1

    invoke-interface {p1}, Li9/c;->onAdOpened()V

    iget-object p1, p0, Ld6/c$d;->c:Ld6/c;

    invoke-static {p1}, Ld6/c;->Q(Ld6/c;)Li9/t;

    move-result-object p1

    invoke-interface {p1}, Li9/t;->onAdLeftApplication()V

    return-void
.end method

.method public onAdLoaded(Lcom/facebook/ads/Ad;)V
    .locals 3

    iget-object v0, p0, Ld6/c$d;->b:Lcom/facebook/ads/NativeAdBase;

    const-string v1, "com.google.ads.mediation.facebook"

    if-eq p1, v0, :cond_0

    new-instance p1, Lx8/b;

    const/16 v0, 0x6a

    const-string v2, "Ad Loaded is not a Native Ad."

    invoke-direct {p1, v0, v2, v1}, Lx8/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/ads/mediation/facebook/FacebookMediationAdapter;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Lx8/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ld6/c$d;->c:Ld6/c;

    invoke-static {v0}, Ld6/c;->P(Ld6/c;)Li9/e;

    move-result-object v0

    invoke-interface {v0, p1}, Li9/e;->onFailure(Lx8/b;)V

    return-void

    :cond_0
    iget-object p1, p0, Ld6/c$d;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    if-nez p1, :cond_1

    new-instance p1, Lx8/b;

    const/16 v0, 0x6b

    const-string v2, "Context is null."

    invoke-direct {p1, v0, v2, v1}, Lx8/b;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/google/ads/mediation/facebook/FacebookMediationAdapter;->TAG:Ljava/lang/String;

    invoke-virtual {p1}, Lx8/b;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ld6/c$d;->c:Ld6/c;

    invoke-static {v0}, Ld6/c;->P(Ld6/c;)Li9/e;

    move-result-object v0

    invoke-interface {v0, p1}, Li9/e;->onFailure(Lx8/b;)V

    return-void

    :cond_1
    iget-object v0, p0, Ld6/c$d;->c:Ld6/c;

    new-instance v1, Ld6/c$d$a;

    invoke-direct {v1, p0}, Ld6/c$d$a;-><init>(Ld6/c$d;)V

    invoke-virtual {v0, p1, v1}, Ld6/c;->T(Landroid/content/Context;Ld6/c$c;)V

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

    iget-object p2, p0, Ld6/c$d;->c:Ld6/c;

    invoke-static {p2}, Ld6/c;->P(Ld6/c;)Li9/e;

    move-result-object p2

    invoke-interface {p2, p1}, Li9/e;->onFailure(Lx8/b;)V

    return-void
.end method

.method public onLoggingImpression(Lcom/facebook/ads/Ad;)V
    .locals 0

    return-void
.end method

.method public onMediaDownloaded(Lcom/facebook/ads/Ad;)V
    .locals 1

    sget-object p1, Lcom/google/ads/mediation/facebook/FacebookMediationAdapter;->TAG:Ljava/lang/String;

    const-string v0, "onMediaDownloaded"

    invoke-static {p1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
