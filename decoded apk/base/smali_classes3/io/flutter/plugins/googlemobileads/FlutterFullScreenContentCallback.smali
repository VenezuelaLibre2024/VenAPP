.class Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;
.super Lx8/n;
.source "SourceFile"


# instance fields
.field protected final adId:I

.field protected final manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;


# direct methods
.method public constructor <init>(Lio/flutter/plugins/googlemobileads/AdInstanceManager;I)V
    .locals 0

    invoke-direct {p0}, Lx8/n;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iput p2, p0, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;->adId:I

    return-void
.end method


# virtual methods
.method public onAdClicked()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v1, p0, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;->adId:I

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onAdClicked(I)V

    return-void
.end method

.method public onAdDismissedFullScreenContent()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v1, p0, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;->adId:I

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onAdDismissedFullScreenContent(I)V

    return-void
.end method

.method public onAdFailedToShowFullScreenContent(Lx8/b;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v1, p0, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;->adId:I

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onFailedToShowFullScreenContent(ILx8/b;)V

    return-void
.end method

.method public onAdImpression()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v1, p0, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;->adId:I

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onAdImpression(I)V

    return-void
.end method

.method public onAdShowedFullScreenContent()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;->manager:Lio/flutter/plugins/googlemobileads/AdInstanceManager;

    iget v1, p0, Lio/flutter/plugins/googlemobileads/FlutterFullScreenContentCallback;->adId:I

    invoke-virtual {v0, v1}, Lio/flutter/plugins/googlemobileads/AdInstanceManager;->onAdShowedFullScreenContent(I)V

    return-void
.end method
