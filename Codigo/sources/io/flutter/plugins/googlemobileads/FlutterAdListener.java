package io.flutter.plugins.googlemobileads;

import io.flutter.plugins.googlemobileads.FlutterAd;
import x8.e;
import x8.o;

/* loaded from: classes3.dex */
class FlutterAdListener extends e {
    protected final int adId;
    protected final AdInstanceManager manager;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterAdListener(int i10, AdInstanceManager adInstanceManager) {
        this.adId = i10;
        this.manager = adInstanceManager;
    }

    @Override // x8.e, com.google.android.gms.ads.internal.client.a
    public void onAdClicked() {
        this.manager.onAdClicked(this.adId);
    }

    @Override // x8.e
    public void onAdClosed() {
        this.manager.onAdClosed(this.adId);
    }

    @Override // x8.e
    public void onAdFailedToLoad(o oVar) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(oVar));
    }

    @Override // x8.e
    public void onAdImpression() {
        this.manager.onAdImpression(this.adId);
    }

    @Override // x8.e
    public void onAdOpened() {
        this.manager.onAdOpened(this.adId);
    }
}
