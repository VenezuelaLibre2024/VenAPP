package io.flutter.plugins.googlemobileads;

import android.util.Log;
import io.flutter.plugins.googlemobileads.FlutterAd;
import java.lang.ref.WeakReference;
import x8.o;
import y8.c;
import y8.d;
import y8.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FlutterAdManagerInterstitialAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FltGAMInterstitialAd";

    /* renamed from: ad, reason: collision with root package name */
    private c f18287ad;
    private final String adUnitId;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterAdManagerAdRequest request;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class DelegatingAdManagerInterstitialAdCallbacks extends d implements e {
        private final WeakReference<FlutterAdManagerInterstitialAd> delegate;

        DelegatingAdManagerInterstitialAdCallbacks(FlutterAdManagerInterstitialAd flutterAdManagerInterstitialAd) {
            this.delegate = new WeakReference<>(flutterAdManagerInterstitialAd);
        }

        @Override // x8.f
        public void onAdFailedToLoad(o oVar) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdFailedToLoad(oVar);
            }
        }

        @Override // x8.f
        public void onAdLoaded(c cVar) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdLoaded(cVar);
            }
        }

        @Override // y8.e
        public void onAppEvent(String str, String str2) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAppEvent(str, str2);
            }
        }
    }

    public FlutterAdManagerInterstitialAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdManagerAdRequest flutterAdManagerAdRequest, FlutterAdLoader flutterAdLoader) {
        super(i10);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdManagerAdRequest;
        this.flutterAdLoader = flutterAdLoader;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        this.f18287ad = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void load() {
        FlutterAdLoader flutterAdLoader = this.flutterAdLoader;
        String str = this.adUnitId;
        flutterAdLoader.loadAdManagerInterstitial(str, this.request.asAdManagerAdRequest(str), new DelegatingAdManagerInterstitialAdCallbacks(this));
    }

    void onAdFailedToLoad(o oVar) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(oVar));
    }

    void onAdLoaded(c cVar) {
        this.f18287ad = cVar;
        cVar.setAppEventListener(new DelegatingAdManagerInterstitialAdCallbacks(this));
        cVar.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, cVar.getResponseInfo());
    }

    void onAppEvent(String str, String str2) {
        this.manager.onAppEvent(this.adId, str, str2);
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void setImmersiveMode(boolean z10) {
        c cVar = this.f18287ad;
        if (cVar == null) {
            Log.e(TAG, "The interstitial wasn't loaded yet.");
        } else {
            cVar.setImmersiveMode(z10);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void show() {
        if (this.f18287ad == null) {
            Log.e(TAG, "The interstitial wasn't loaded yet.");
        } else if (this.manager.getActivity() == null) {
            Log.e(TAG, "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.f18287ad.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.f18287ad.show(this.manager.getActivity());
        }
    }
}
