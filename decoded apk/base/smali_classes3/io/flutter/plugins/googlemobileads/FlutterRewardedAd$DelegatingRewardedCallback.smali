.class final Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$DelegatingRewardedCallback;
.super Ln9/d;
.source "SourceFile"

# interfaces
.implements Ln9/a;
.implements Lx8/u;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "DelegatingRewardedCallback"
.end annotation


# instance fields
.field private final delegate:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;)V
    .locals 1

    invoke-direct {p0}, Ln9/d;-><init>()V

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$DelegatingRewardedCallback;->delegate:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public onAdFailedToLoad(Lx8/o;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$DelegatingRewardedCallback;->delegate:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$DelegatingRewardedCallback;->delegate:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;->onAdFailedToLoad(Lx8/o;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic onAdLoaded(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ln9/c;

    invoke-virtual {p0, p1}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$DelegatingRewardedCallback;->onAdLoaded(Ln9/c;)V

    return-void
.end method

.method public onAdLoaded(Ln9/c;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$DelegatingRewardedCallback;->delegate:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$DelegatingRewardedCallback;->delegate:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;->onAdLoaded(Ln9/c;)V

    :cond_0
    return-void
.end method

.method public onAdMetadataChanged()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$DelegatingRewardedCallback;->delegate:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$DelegatingRewardedCallback;->delegate:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;

    invoke-virtual {v0}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;->onAdMetadataChanged()V

    :cond_0
    return-void
.end method

.method public onUserEarnedReward(Ln9/b;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$DelegatingRewardedCallback;->delegate:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd$DelegatingRewardedCallback;->delegate:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;

    invoke-virtual {v0, p1}, Lio/flutter/plugins/googlemobileads/FlutterRewardedAd;->onUserEarnedReward(Ln9/b;)V

    :cond_0
    return-void
.end method
