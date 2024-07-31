package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedAdListener;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.5e */
/* loaded from: assets/audience_network.dex */
public final class C25825e implements InterstitialAdApi, Repairable {
    public static byte[] A04;
    public static String[] A05 = {"S822El9zG6GuADGrtluuLX363osWhxiG", "ZFI3hp6NIHNPBZ8p7tKJKM6DxTur89gU", "rKe2xKovfMLHVnc2kJBHIfRtW7KI2joW", "CTsEdbmp9bu3ZhSS7yZH02ALmjP1FNtP", "mPYAOoIIU9PuPwOlU3lFT13mhy9mIxzC", "", "", "HqZNdyzgU2LJRhG9zHJvoyCPzWSUAGCn"};
    public final InterstitialAd A00;
    public final C236526 A01;
    public final C3140FF A02;
    public final C4337Yn A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            int i14 = copyOfRange[i13] - i12;
            if (A05[0].charAt(22) != '3') {
                throw new RuntimeException();
            }
            A05[4] = "dLq0XFJawohP2A9uDPm8W8ZKhW9iXRhW";
            copyOfRange[i13] = (byte) (i14 - 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-32, -31, 17, 19, -31, -25, -29, -32, -71, -21, -26, -67, -66, -73, -24, -25, 37, 81, 32, 35, 40, 34, 81, 38, -49, -12, -6, -21, -8, -12, -25, -14, -90, -21, -8, -8, -11, -8, -76, -112, -29, 8, 14, -1, 12, 13, 14, 3, 14, 3, -5, 6, -70, -5, -2, -70, -2, -1, 13, 14, 12, 9, 19, -1, -2, -56, -19, -13, -28, -15, -14, -13, -24, -13, -24, -32, -21, -97, -32, -29, -97, -21, -18, -32, -29, -97, -15, -28, -16, -12, -28, -14, -13, -28, -29, -18, 19, 25, 10, 23, 24, 25, 14, 25, 14, 6, 17, -59, 6, 9, -59, 24, 13, 20, 28, -59, 8, 6, 17, 17, 10, 9, -10, -9, 5, 6, 4, 1, 11, -28, -17, -52, -17, -31, -28, -63, -28, 49, 38, 45, 53};
    }

    static {
        A01();
    }

    public C25825e(Context context, String str, InterstitialAd interstitialAd) {
        this.A00 = interstitialAd;
        String uuid = UUID.randomUUID().toString();
        C4337Yn A06 = C25805c.A06(context, uuid);
        this.A03 = A06;
        InterfaceC22640S A0E = A06.A0E();
        String adId = AdPlacementType.INTERSTITIAL.toString();
        A0E.A2s(adId, str);
        C236526 c236526 = new C236526(A06, interstitialAd, str);
        this.A01 = c236526;
        A06.A0L(this);
        this.A02 = new C3140FF(c236526, uuid);
    }

    public final void A02(InterstitialAdListener interstitialAdListener) {
        this.A03.A0E().A2l(interstitialAdListener != null);
        this.A01.A0E(interstitialAdListener);
        if (A05[0].charAt(22) != '3') {
            throw new RuntimeException();
        }
        A05[4] = "rYQ6gTbtajntBm3fXVm84HcfyQ9ACN8J";
    }

    public final void A03(RewardData rewardData) {
        this.A02.A0E(rewardData);
    }

    public final void A04(RewardedAdListener rewardedAdListener) {
        this.A01.A0G(rewardedAdListener);
    }

    public final void A05(EnumSet<CacheFlag> enumSet, String str) {
        AbstractC3416Jp.A05(A00(129, 8, 2), A00(65, 30, 1), A00(16, 8, 113));
        if (str == null) {
            this.A03.A0E().A2p();
        } else {
            this.A03.A0E().A2o();
        }
        this.A02.A0D(this.A00, enumSet, str);
        this.A03.A0E().A2n();
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return new C25835f(this);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final InterstitialAd.InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return new C25845g();
    }

    @Override // com.facebook.ads.InterfaceC2219Ad
    public final void destroy() {
        AbstractC3416Jp.A05(A00(122, 7, 20), A00(40, 25, 28), A00(0, 8, 49));
        if (C3348Ih.A1s(this.A03)) {
            return;
        }
        this.A02.A08();
        this.A03.A0E().A2t();
    }

    public final void finalize() {
        this.A02.A07();
    }

    @Override // com.facebook.ads.InterfaceC2219Ad
    public final String getPlacementId() {
        return this.A01.A0A();
    }

    @Override // com.facebook.ads.InterfaceC2219Ad
    public final boolean isAdInvalidated() {
        boolean A0F = this.A02.A0F();
        this.A03.A0E().A4s(A0F);
        return A0F;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean isAdLoaded() {
        return this.A02.A0G();
    }

    @Override // com.facebook.ads.InterfaceC2219Ad
    public final void loadAd() {
        A05(CacheFlag.ALL, null);
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final void loadAd(InterstitialAd.InterstitialLoadAdConfig interstitialLoadAdConfig) {
        ((C25835f) interstitialLoadAdConfig).A00();
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th2) {
        if (this.A01.A02() != null) {
            this.A01.A02().onError(this.A00, new AdError(AdError.INTERNAL_ERROR_CODE, A00(24, 16, 8) + AbstractC3518LW.A03(this.A03, th2)));
        }
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.InterfaceC2219Ad
    @Deprecated
    public final void setExtraHints(ExtraHints extraHints) {
        this.A01.A0I(extraHints.getHints());
        this.A01.A0J(extraHints.getMediationData());
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi, com.facebook.ads.FullScreenAd
    public final boolean show() {
        AbstractC3416Jp.A05(A00(137, 4, 64), A00(95, 27, 39), A00(8, 8, 7));
        this.A03.A0E().A2y();
        boolean A0H = this.A02.A0H(this.A00, new C25845g());
        this.A03.A0E().A2x(A0H);
        return A0H;
    }

    @Override // com.facebook.ads.internal.api.InterstitialAdApi
    public final boolean show(InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        this.A03.A0E().A2y();
        boolean A0H = this.A02.A0H(this.A00, interstitialShowAdConfig);
        this.A03.A0E().A2x(A0H);
        return A0H;
    }
}