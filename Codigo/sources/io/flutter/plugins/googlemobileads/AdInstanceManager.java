package io.flutter.plugins.googlemobileads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.googlemobileads.FlutterAd;
import io.flutter.plugins.googlemobileads.FlutterRewardedAd;
import java.util.HashMap;
import java.util.Map;
import x8.b;
import x8.z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class AdInstanceManager {
    private Activity activity;
    private final Map<Integer, FlutterAd> ads = new HashMap();
    private final MethodChannel channel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdInstanceManager(MethodChannel methodChannel) {
        this.channel = methodChannel;
    }

    private void invokeOnAdEvent(final Map<Object, Object> map) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.flutter.plugins.googlemobileads.AdInstanceManager.1
            @Override // java.lang.Runnable
            public void run() {
                AdInstanceManager.this.channel.invokeMethod("onAdEvent", map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FlutterAd adForId(int i10) {
        return this.ads.get(Integer.valueOf(i10));
    }

    Integer adIdFor(FlutterAd flutterAd) {
        for (Integer num : this.ads.keySet()) {
            if (this.ads.get(num) == flutterAd) {
                return num;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void disposeAd(int i10) {
        if (this.ads.containsKey(Integer.valueOf(i10))) {
            FlutterAd flutterAd = this.ads.get(Integer.valueOf(i10));
            if (flutterAd != null) {
                flutterAd.dispose();
            }
            this.ads.remove(Integer.valueOf(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void disposeAllAds() {
        for (Map.Entry<Integer, FlutterAd> entry : this.ads.entrySet()) {
            if (entry.getValue() != null) {
                entry.getValue().dispose();
            }
        }
        this.ads.clear();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Activity getActivity() {
        return this.activity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAdClicked(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdClicked");
        invokeOnAdEvent(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAdClosed(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdClosed");
        invokeOnAdEvent(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAdDismissedFullScreenContent(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdDismissedFullScreenContent");
        invokeOnAdEvent(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAdFailedToLoad(int i10, FlutterAd.FlutterLoadAdError flutterLoadAdError) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdFailedToLoad");
        hashMap.put("loadAdError", flutterLoadAdError);
        invokeOnAdEvent(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAdImpression(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdImpression");
        invokeOnAdEvent(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAdLoaded(int i10, z zVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdLoaded");
        hashMap.put("responseInfo", zVar == null ? null : new FlutterAd.FlutterResponseInfo(zVar));
        invokeOnAdEvent(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAdMetadataChanged(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdMetadataChanged");
        invokeOnAdEvent(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAdOpened(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdOpened");
        invokeOnAdEvent(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAdShowedFullScreenContent(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAdShowedFullScreenContent");
        invokeOnAdEvent(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onAppEvent(int i10, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onAppEvent");
        hashMap.put("name", str);
        hashMap.put("data", str2);
        invokeOnAdEvent(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onFailedToShowFullScreenContent(int i10, b bVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onFailedToShowFullScreenContent");
        hashMap.put("error", new FlutterAd.FlutterAdError(bVar));
        invokeOnAdEvent(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onFluidAdHeightChanged(int i10, int i11) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onFluidAdHeightChanged");
        hashMap.put("height", Integer.valueOf(i11));
        invokeOnAdEvent(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onPaidEvent(FlutterAd flutterAd, FlutterAdValue flutterAdValue) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", adIdFor(flutterAd));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onPaidEvent");
        hashMap.put("valueMicros", Long.valueOf(flutterAdValue.valueMicros));
        hashMap.put("precision", Integer.valueOf(flutterAdValue.precisionType));
        hashMap.put("currencyCode", flutterAdValue.currencyCode);
        invokeOnAdEvent(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onRewardedAdUserEarnedReward(int i10, FlutterRewardedAd.FlutterRewardItem flutterRewardItem) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onRewardedAdUserEarnedReward");
        hashMap.put("rewardItem", flutterRewardItem);
        invokeOnAdEvent(hashMap);
    }

    void onRewardedInterstitialAdUserEarnedReward(int i10, FlutterRewardedAd.FlutterRewardItem flutterRewardItem) {
        HashMap hashMap = new HashMap();
        hashMap.put("adId", Integer.valueOf(i10));
        hashMap.put(io.flutter.plugins.firebase.analytics.Constants.EVENT_NAME, "onRewardedInterstitialAdUserEarnedReward");
        hashMap.put("rewardItem", flutterRewardItem);
        invokeOnAdEvent(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean showAdWithId(int i10) {
        FlutterAd.FlutterOverlayAd flutterOverlayAd = (FlutterAd.FlutterOverlayAd) adForId(i10);
        if (flutterOverlayAd == null) {
            return false;
        }
        flutterOverlayAd.show();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void trackAd(FlutterAd flutterAd, int i10) {
        if (this.ads.get(Integer.valueOf(i10)) != null) {
            throw new IllegalArgumentException(String.format("Ad for following adId already exists: %d", Integer.valueOf(i10)));
        }
        this.ads.put(Integer.valueOf(i10), flutterAd);
    }
}
