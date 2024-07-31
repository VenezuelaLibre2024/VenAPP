package io.flutter.plugins.googlemobileads;

import x8.b;
import x8.n;

/* loaded from: classes3.dex */
class FlutterFullScreenContentCallback extends n {
    protected final int adId;
    protected final AdInstanceManager manager;

    public FlutterFullScreenContentCallback(AdInstanceManager adInstanceManager, int i10) {
        this.manager = adInstanceManager;
        this.adId = i10;
    }

    @Override // x8.n
    public void onAdClicked() {
        this.manager.onAdClicked(this.adId);
    }

    @Override // x8.n
    public void onAdDismissedFullScreenContent() {
        this.manager.onAdDismissedFullScreenContent(this.adId);
    }

    @Override // x8.n
    public void onAdFailedToShowFullScreenContent(b bVar) {
        this.manager.onFailedToShowFullScreenContent(this.adId, bVar);
    }

    @Override // x8.n
    public void onAdImpression() {
        this.manager.onAdImpression(this.adId);
    }

    @Override // x8.n
    public void onAdShowedFullScreenContent() {
        this.manager.onAdShowedFullScreenContent(this.adId);
    }
}
