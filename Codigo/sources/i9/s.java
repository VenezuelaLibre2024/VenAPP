package i9;

import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

@Deprecated
/* loaded from: classes.dex */
public interface s {
    void onAdClosed(MediationInterstitialAdapter mediationInterstitialAdapter);

    @Deprecated
    void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, int i10);

    void onAdFailedToLoad(MediationInterstitialAdapter mediationInterstitialAdapter, x8.b bVar);

    void onAdLoaded(MediationInterstitialAdapter mediationInterstitialAdapter);

    void onAdOpened(MediationInterstitialAdapter mediationInterstitialAdapter);
}
