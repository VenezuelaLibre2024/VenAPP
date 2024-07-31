package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC2219Ad;
import com.facebook.ads.RewardedInterstitialAdExtendedListener;
import com.facebook.ads.RewardedInterstitialAdListener;
import com.facebook.ads.RewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedInterstitialAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.S2SRewardedVideoAdListener;

/* renamed from: com.facebook.ads.redexgen.X.5u */
/* loaded from: assets/audience_network.dex */
public class C25985u implements RewardedVideoAdExtendedListener, S2SRewardedVideoAdListener, S2SRewardedVideoAdExtendedListener {
    public final RewardedInterstitialAdListener A00;

    public C25985u(RewardedInterstitialAdListener rewardedInterstitialAdListener) {
        this.A00 = rewardedInterstitialAdListener;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(InterfaceC2219Ad interfaceC2219Ad) {
        this.A00.onAdClicked(interfaceC2219Ad);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(InterfaceC2219Ad interfaceC2219Ad) {
        this.A00.onAdLoaded(interfaceC2219Ad);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(InterfaceC2219Ad interfaceC2219Ad, AdError adError) {
        this.A00.onError(interfaceC2219Ad, adError);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(InterfaceC2219Ad interfaceC2219Ad) {
        this.A00.onLoggingImpression(interfaceC2219Ad);
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerFailed() {
        RewardedInterstitialAdListener rewardedInterstitialAdListener = this.A00;
        if (rewardedInterstitialAdListener instanceof S2SRewardedInterstitialAdListener) {
            ((S2SRewardedInterstitialAdListener) rewardedInterstitialAdListener).onRewardServerFailed();
        }
    }

    @Override // com.facebook.ads.S2SRewardedVideoAdListener
    public final void onRewardServerSuccess() {
        RewardedInterstitialAdListener rewardedInterstitialAdListener = this.A00;
        if (rewardedInterstitialAdListener instanceof S2SRewardedInterstitialAdListener) {
            ((S2SRewardedInterstitialAdListener) rewardedInterstitialAdListener).onRewardServerSuccess();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdExtendedListener
    public final void onRewardedVideoActivityDestroyed() {
        RewardedInterstitialAdListener rewardedInterstitialAdListener = this.A00;
        if (rewardedInterstitialAdListener instanceof RewardedInterstitialAdExtendedListener) {
            ((RewardedInterstitialAdExtendedListener) rewardedInterstitialAdListener).onRewardedInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        this.A00.onRewardedInterstitialClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        this.A00.onRewardedInterstitialCompleted();
    }
}
