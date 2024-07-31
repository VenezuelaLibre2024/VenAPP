package io.flutter.plugins.googlemobileads;

import android.util.Log;
import io.flutter.plugins.googlemobileads.FlutterAd;
import java.lang.ref.WeakReference;
import n9.a;
import n9.b;
import n9.c;
import n9.d;
import x8.o;
import x8.u;

/* loaded from: classes3.dex */
public class FlutterRewardedAd extends FlutterAd.FlutterOverlayAd {
    private static final String TAG = "FlutterRewardedAd";
    private final FlutterAdManagerAdRequest adManagerRequest;
    private final String adUnitId;
    private final FlutterAdLoader flutterAdLoader;
    private final AdInstanceManager manager;
    private final FlutterAdRequest request;
    c rewardedAd;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class DelegatingRewardedCallback extends d implements a, u {
        private final WeakReference<FlutterRewardedAd> delegate;

        DelegatingRewardedCallback(FlutterRewardedAd flutterRewardedAd) {
            this.delegate = new WeakReference<>(flutterRewardedAd);
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

        @Override // n9.a
        public void onAdMetadataChanged() {
            if (this.delegate.get() != null) {
                this.delegate.get().onAdMetadataChanged();
            }
        }

        @Override // x8.u
        public void onUserEarnedReward(b bVar) {
            if (this.delegate.get() != null) {
                this.delegate.get().onUserEarnedReward(bVar);
            }
        }
    }

    /* loaded from: classes3.dex */
    public static class FlutterRewardItem {
        final Integer amount;
        final String type;

        public FlutterRewardItem(Integer num, String str) {
            this.amount = num;
            this.type = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlutterRewardItem)) {
                return false;
            }
            FlutterRewardItem flutterRewardItem = (FlutterRewardItem) obj;
            if (this.amount.equals(flutterRewardItem.amount)) {
                return this.type.equals(flutterRewardItem.type);
            }
            return false;
        }

        public int hashCode() {
            return (this.amount.hashCode() * 31) + this.type.hashCode();
        }
    }

    public FlutterRewardedAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdManagerAdRequest flutterAdManagerAdRequest, FlutterAdLoader flutterAdLoader) {
        super(i10);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.adManagerRequest = flutterAdManagerAdRequest;
        this.request = null;
        this.flutterAdLoader = flutterAdLoader;
    }

    public FlutterRewardedAd(int i10, AdInstanceManager adInstanceManager, String str, FlutterAdRequest flutterAdRequest, FlutterAdLoader flutterAdLoader) {
        super(i10);
        this.manager = adInstanceManager;
        this.adUnitId = str;
        this.request = flutterAdRequest;
        this.adManagerRequest = null;
        this.flutterAdLoader = flutterAdLoader;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void dispose() {
        this.rewardedAd = null;
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd
    public void load() {
        DelegatingRewardedCallback delegatingRewardedCallback = new DelegatingRewardedCallback(this);
        FlutterAdRequest flutterAdRequest = this.request;
        if (flutterAdRequest != null) {
            FlutterAdLoader flutterAdLoader = this.flutterAdLoader;
            String str = this.adUnitId;
            flutterAdLoader.loadRewarded(str, flutterAdRequest.asAdRequest(str), delegatingRewardedCallback);
            return;
        }
        FlutterAdManagerAdRequest flutterAdManagerAdRequest = this.adManagerRequest;
        if (flutterAdManagerAdRequest == null) {
            Log.e(TAG, "A null or invalid ad request was provided.");
            return;
        }
        FlutterAdLoader flutterAdLoader2 = this.flutterAdLoader;
        String str2 = this.adUnitId;
        flutterAdLoader2.loadAdManagerRewarded(str2, flutterAdManagerAdRequest.asAdManagerAdRequest(str2), delegatingRewardedCallback);
    }

    void onAdFailedToLoad(o oVar) {
        this.manager.onAdFailedToLoad(this.adId, new FlutterAd.FlutterLoadAdError(oVar));
    }

    void onAdLoaded(c cVar) {
        this.rewardedAd = cVar;
        cVar.setOnPaidEventListener(new FlutterPaidEventListener(this.manager, this));
        this.manager.onAdLoaded(this.adId, cVar.getResponseInfo());
    }

    void onAdMetadataChanged() {
        this.manager.onAdMetadataChanged(this.adId);
    }

    void onUserEarnedReward(b bVar) {
        this.manager.onRewardedAdUserEarnedReward(this.adId, new FlutterRewardItem(Integer.valueOf(bVar.getAmount()), bVar.getType()));
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void setImmersiveMode(boolean z10) {
        c cVar = this.rewardedAd;
        if (cVar == null) {
            Log.e(TAG, "Error setting immersive mode in rewarded ad - the rewarded ad wasn't loaded yet.");
        } else {
            cVar.setImmersiveMode(z10);
        }
    }

    public void setServerSideVerificationOptions(FlutterServerSideVerificationOptions flutterServerSideVerificationOptions) {
        c cVar = this.rewardedAd;
        if (cVar != null) {
            cVar.setServerSideVerificationOptions(flutterServerSideVerificationOptions.asServerSideVerificationOptions());
        } else {
            Log.e(TAG, "RewardedAd is null in setServerSideVerificationOptions");
        }
    }

    @Override // io.flutter.plugins.googlemobileads.FlutterAd.FlutterOverlayAd
    public void show() {
        if (this.rewardedAd == null) {
            Log.e(TAG, "Error showing rewarded - the rewarded ad wasn't loaded yet.");
        } else {
            if (this.manager.getActivity() == null) {
                Log.e(TAG, "Tried to show rewarded ad before activity was bound to the plugin.");
                return;
            }
            this.rewardedAd.setFullScreenContentCallback(new FlutterFullScreenContentCallback(this.manager, this.adId));
            this.rewardedAd.setOnAdMetadataChangedListener(new DelegatingRewardedCallback(this));
            this.rewardedAd.show(this.manager.getActivity(), new DelegatingRewardedCallback(this));
        }
    }
}
