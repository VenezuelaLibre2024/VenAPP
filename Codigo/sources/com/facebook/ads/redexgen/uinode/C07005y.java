package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;

/* renamed from: com.facebook.ads.redexgen.X.5y */
/* loaded from: assets/audience_network.dex */
public final class C07005y implements RewardedVideoAd.RewardedVideoAdLoadConfigBuilder, RewardedVideoAd.RewardedVideoLoadAdConfig {
    public AdExperienceType A00;
    public C06995x A01;
    public String A02;
    public boolean A03;

    public C07005y(C06995x c06995x) {
        this.A01 = c06995x;
    }

    public final void A00() {
        this.A01.A07(this.A02, this.A00, this.A03);
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final RewardedVideoAd.RewardedVideoLoadAdConfig build() {
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder
    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdExperience(AdExperienceType adExperienceType) {
        this.A00 = adExperienceType;
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder
    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.A01.A06(rewardedVideoAdListener);
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder, com.facebook.ads.Ad.LoadConfigBuilder
    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withBid(String str) {
        this.A02 = str;
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder
    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z10) {
        this.A03 = z10;
        return this;
    }

    @Override // com.facebook.ads.RewardedVideoAd.RewardedVideoAdLoadConfigBuilder
    public final RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData(RewardData rewardData) {
        this.A01.A05(rewardData);
        return this;
    }
}