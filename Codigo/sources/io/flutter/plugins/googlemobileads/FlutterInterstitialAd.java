package io.flutter.plugins.googlemobileads;

import android.util.Log;
import h9.a;
import h9.b;
import io.flutter.plugins.googlemobileads.FlutterAd;
import java.lang.ref.WeakReference;
import x8.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FlutterInterstitialAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FlutterInterstitialAd";

    /* renamed from: ad, reason: collision with root package name */
    private a f18289ad;
    private final String adUnitId;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterAdRequest request;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class DelegatingInterstitialAdLoadCallback extends b {
        private final WeakReference<FlutterInterstitialAd> delegate;

        DelegatingInterstitialAdLoadCallback(FlutterInterstitialAd flutterInterstitialAd) {
            this.delegate = new WeakReference<>(flutterInterstitialAd);
        }

        @Override // x8.f
        public void onAdFailedToLoad(o oVar) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdFailedToLoad(oVar);
            }
        }

        @Override // x8.f
        public void onAdLoaded(a aVar) {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdLoaded(aVar);
            }
        }
    }

    public FlutterInterstitialAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdRequest flutterAdRequest, FlutterAdLoader flutterAdLoader) {
        super(i10);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.flutterAdLoader = flutterAdLoader;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        this.f18289ad = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void load() {
        String str;
        FlutterAdRequest flutterAdRequest;
        if (this.manager == null || (str = this.adUnitId) == null || (flutterAdRequest = this.request) == null) {
            return;
        }
        this.flutterAdLoader.loadInterstitial(str, flutterAdRequest.asAdRequest(str), new DelegatingInterstitialAdLoadCallback(this));
    }

    void onAdFailedToLoad(o oVar) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(oVar));
    }

    void onAdLoaded(a aVar) {
        this.f18289ad = aVar;
        aVar.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, aVar.getResponseInfo());
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void setImmersiveMode(boolean z10) {
        a aVar = this.f18289ad;
        if (aVar == null) {
            Log.e(TAG, "Error setting immersive mode in interstitial ad - the interstitial ad wasn't loaded yet.");
        } else {
            aVar.setImmersiveMode(z10);
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void show() {
        if (this.f18289ad == null) {
            Log.e(TAG, "Error showing interstitial - the interstitial ad wasn't loaded yet.");
        } else if (this.manager.getActivity() == null) {
            Log.e(TAG, "Tried to show interstitial before activity was bound to the plugin.");
        } else {
            this.f18289ad.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.f18289ad.show(this.manager.getActivity());
        }
    }
}
