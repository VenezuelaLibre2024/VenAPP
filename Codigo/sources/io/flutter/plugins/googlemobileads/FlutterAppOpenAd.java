package io.flutter.plugins.googlemobileads;

import android.util.Log;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.util.Preconditions;
import java.lang.ref.WeakReference;
import x8.o;
import z8.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FlutterAppOpenAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FlutterAppOpenAd";

    /* renamed from: ad, reason: collision with root package name */
    private a f18288ad;
    private final FlutterAdManagerAdRequest adManagerAdRequest;
    private final String adUnitId;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterAdRequest request;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class DelegatingAppOpenAdLoadCallback extends a.AbstractC0543a {
        private final WeakReference<FlutterAppOpenAd> delegate;

        DelegatingAppOpenAdLoadCallback(FlutterAppOpenAd flutterAppOpenAd) {
            this.delegate = new WeakReference<>(flutterAppOpenAd);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterAppOpenAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdRequest flutterAdRequest, FlutterAdManagerAdRequest flutterAdManagerAdRequest, FlutterAdLoader flutterAdLoader) {
        super(i10);
        Preconditions.checkState((flutterAdRequest == null && flutterAdManagerAdRequest == null) ? false : true, "One of request and adManagerAdRequest must be non-null.");
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.adManagerAdRequest = flutterAdManagerAdRequest;
        this.flutterAdLoader = flutterAdLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdFailedToLoad(o oVar) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(oVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdLoaded(a aVar) {
        this.f18288ad = aVar;
        aVar.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, aVar.getResponseInfo());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        this.f18288ad = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void load() {
        FlutterAdRequest flutterAdRequest = this.request;
        if (flutterAdRequest != null) {
            FlutterAdLoader flutterAdLoader = this.flutterAdLoader;
            String str = this.adUnitId;
            flutterAdLoader.loadAppOpen(str, flutterAdRequest.asAdRequest(str), new DelegatingAppOpenAdLoadCallback(this));
        } else {
            FlutterAdManagerAdRequest flutterAdManagerAdRequest = this.adManagerAdRequest;
            if (flutterAdManagerAdRequest != null) {
                FlutterAdLoader flutterAdLoader2 = this.flutterAdLoader;
                String str2 = this.adUnitId;
                flutterAdLoader2.loadAdManagerAppOpen(str2, flutterAdManagerAdRequest.asAdManagerAdRequest(str2), new DelegatingAppOpenAdLoadCallback(this));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void setImmersiveMode(boolean z10) {
        a aVar = this.f18288ad;
        if (aVar == null) {
            Log.w(TAG, "Tried to set immersive mode on app open ad before it was loaded");
        } else {
            aVar.setImmersiveMode(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void show() {
        if (this.f18288ad == null) {
            Log.w(TAG, "Tried to show app open ad before it was loaded");
        } else if (this.manager.getActivity() == null) {
            Log.e(TAG, "Tried to show app open ad before activity was bound to the plugin.");
        } else {
            this.f18288ad.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.f18288ad.show(this.manager.getActivity());
        }
    }
}
