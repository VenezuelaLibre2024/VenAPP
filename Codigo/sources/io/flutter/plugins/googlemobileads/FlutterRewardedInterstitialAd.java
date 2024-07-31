package io.flutter.plugins.googlemobileads;

import android.util.Log;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.plugins.googlemobileads.FlutterRewardedAd;
import java.lang.ref.WeakReference;
import o9.a;
import o9.b;
import x8.o;
import x8.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class FlutterRewardedInterstitialAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FlutterRIAd";
    private final FlutterAdManagerAdRequest adManagerRequest;
    private final String adUnitId;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterAdRequest request;
    a rewardedInterstitialAd;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class DelegatingRewardedCallback extends b implements n9.a, u {
        private final WeakReference<FlutterRewardedInterstitialAd> delegate;

        DelegatingRewardedCallback(FlutterRewardedInterstitialAd flutterRewardedInterstitialAd) {
            this.delegate = new WeakReference<>(flutterRewardedInterstitialAd);
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

        @Override // n9.a
        public void onAdMetadataChanged() {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdMetadataChanged();
            }
        }

        @Override // x8.u
        public void onUserEarnedReward(n9.b bVar) {
            if (this.delegate.get() != null) {
                this.delegate.get().onUserEarnedReward(bVar);
            }
        }
    }

    public FlutterRewardedInterstitialAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdManagerAdRequest flutterAdManagerAdRequest, FlutterAdLoader flutterAdLoader) {
        super(i10);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adManagerRequest = flutterAdManagerAdRequest;
        this.request = null;
        this.flutterAdLoader = flutterAdLoader;
    }

    public FlutterRewardedInterstitialAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdRequest flutterAdRequest, FlutterAdLoader flutterAdLoader) {
        super(i10);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.adManagerRequest = null;
        this.flutterAdLoader = flutterAdLoader;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        this.rewardedInterstitialAd = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void load() {
        DelegatingRewardedCallback delegatingRewardedCallback = new DelegatingRewardedCallback(this);
        FlutterAdRequest flutterAdRequest = this.request;
        if (flutterAdRequest != null) {
            FlutterAdLoader flutterAdLoader = this.flutterAdLoader;
            String str = this.adUnitId;
            flutterAdLoader.loadRewardedInterstitial(str, flutterAdRequest.asAdRequest(str), delegatingRewardedCallback);
            return;
        }
        FlutterAdManagerAdRequest flutterAdManagerAdRequest = this.adManagerRequest;
        if (flutterAdManagerAdRequest == null) {
            Log.e(TAG, "A null or invalid ad request was provided.");
            return;
        }
        FlutterAdLoader flutterAdLoader2 = this.flutterAdLoader;
        String str2 = this.adUnitId;
        flutterAdLoader2.loadAdManagerRewardedInterstitial(str2, flutterAdManagerAdRequest.asAdManagerAdRequest(str2), delegatingRewardedCallback);
    }

    void onAdFailedToLoad(o oVar) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(oVar));
    }

    void onAdLoaded(a aVar) {
        this.rewardedInterstitialAd = aVar;
        aVar.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, aVar.getResponseInfo());
    }

    void onAdMetadataChanged() {
        this.manager.onAdMetadataChanged(this.adId);
    }

    void onUserEarnedReward(n9.b bVar) {
        this.manager.onRewardedAdUserEarnedReward(this.adId, new FlutterRewardedAd.FlutterRewardItem(Integer.valueOf(bVar.getAmount()), bVar.getType()));
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void setImmersiveMode(boolean z10) {
        a aVar = this.rewardedInterstitialAd;
        if (aVar == null) {
            Log.e(TAG, "Error setting immersive mode in rewarded interstitial ad - the rewarded interstitial ad wasn't loaded yet.");
        } else {
            aVar.setImmersiveMode(z10);
        }
    }

    public void setServerSideVerificationOptions(FlutterServerSideVerificationOptions flutterServerSideVerificationOptions) {
        a aVar = this.rewardedInterstitialAd;
        if (aVar != null) {
            aVar.setServerSideVerificationOptions(flutterServerSideVerificationOptions.asServerSideVerificationOptions());
        } else {
            Log.e(TAG, "RewardedInterstitialAd is null in setServerSideVerificationOptions");
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void show() {
        if (this.rewardedInterstitialAd == null) {
            Log.e(TAG, "Error showing rewarded interstitial - the rewarded interstitial ad wasn't loaded yet.");
        } else {
            if (this.manager.getActivity() == null) {
                Log.e(TAG, "Tried to show rewarded interstitial ad before activity was bound to the plugin.");
                return;
            }
            this.rewardedInterstitialAd.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.rewardedInterstitialAd.setOnAdMetadataChangedListener(new DelegatingRewardedCallback(this));
            this.rewardedInterstitialAd.show(this.manager.getActivity(), new DelegatingRewardedCallback(this));
        }
    }
}
