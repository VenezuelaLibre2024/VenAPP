package io.flutter.plugins.googlemobileads;

import com.google.android.gms.ads.nativead.b;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FlutterNativeAdLoadedListener implements b.c {
    private final WeakReference<FlutterNativeAd> nativeAdWeakReference;

    public FlutterNativeAdLoadedListener(FlutterNativeAd flutterNativeAd) {
        this.nativeAdWeakReference = new WeakReference<>(flutterNativeAd);
    }

    @Override // com.google.android.gms.ads.nativead.b.c
    public void onNativeAdLoaded(b bVar) {
        if (this.nativeAdWeakReference.get() != null) {
            this.nativeAdWeakReference.get().onNativeAdLoaded(bVar);
        }
    }
}
