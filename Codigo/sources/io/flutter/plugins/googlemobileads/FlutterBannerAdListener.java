package io.flutter.plugins.googlemobileads;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
class FlutterBannerAdListener extends FlutterAdListener {
    final WeakReference<FlutterAdLoadedListener> adLoadedListenerWeakReference;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterBannerAdListener(int i10, AdInstanceManager adInstanceManager, FlutterAdLoadedListener flutterAdLoadedListener) {
        super(i10, adInstanceManager);
        this.adLoadedListenerWeakReference = new WeakReference<>(flutterAdLoadedListener);
    }

    @Override // x8.e
    public void onAdLoaded() {
        if (this.adLoadedListenerWeakReference.get() != null) {
            this.adLoadedListenerWeakReference.get().onAdLoaded();
        }
    }
}
