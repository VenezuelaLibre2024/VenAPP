package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;
import com.facebook.ads.InterfaceC2219Ad;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aS */
/* loaded from: assets/audience_network.dex */
public class C4437aS extends AbstractC22870q {
    public static byte[] A01;
    public static String[] A02 = {"7kSkrPID5YMo1WnvaMIgpKB6WIhQPZTc", "kYnVnFR0h3Yv", "", "4OZGrpocgzJPR2XOpe36kiptmUtlR1IY", "AELVZqmE3v", "ezzX0t3o6v3ClFiCUOYeN27kq8G", "mBbxV2ZqaJcWXY", "eL94qTtIFL"};
    public final /* synthetic */ C4435aQ A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 61);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-28, -13, -20, -53, -41, -42, -36, -38, -41, -44, -44, -51, -38, -120, -47, -37, -120, -42, -35, -44, -44};
    }

    static {
        A01();
    }

    public C4437aS(C4435aQ c4435aQ) {
        this.A00 = c4435aQ;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j10;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A03;
            C26035z c26035z = (C26035z) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j10 = this.A00.A02;
            c26035z.A02(currentTimeMillis - j10);
            rewardedVideoAd3 = this.A00.A03;
            rewardedVideoAd3.show(c26035z.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C23742F c23742f;
        this.A00.A07.A0E().A2j();
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c23742f = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onAdClicked(c23742f.A00());
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C23742F c23742f;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c23742f = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(c23742f.A00());
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0F(InterfaceC22860p interfaceC22860p) {
        C3141FG c3141fg;
        C23742F c23742f;
        C23742F c23742f2;
        C3141FG c3141fg2;
        AbstractC23121F abstractC23121F;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C23742F c23742f3;
        AbstractC23121F abstractC23121F2;
        RewardedVideoAd rewardedVideoAd2;
        AbstractC23121F abstractC23121F3;
        C23742F c23742f4;
        RewardedVideoAd rewardedVideoAd3;
        AbstractC23121F abstractC23121F4;
        C23742F c23742f5;
        C23742F c23742f6;
        C23742F c23742f7;
        AbstractC23121F abstractC23121F5;
        C23742F c23742f8;
        c3141fg = this.A00.A05;
        if (c3141fg == null) {
            this.A00.A07.A07().A9a(A00(0, 3, 70), AbstractC27248A.A0N, new C27258B(A00(3, 18, 43)));
            return;
        }
        AbstractC4480b9 abstractC4480b9 = (AbstractC4480b9) interfaceC22860p;
        c23742f = this.A00.A09;
        if (c23742f.A03 != null) {
            c23742f8 = this.A00.A09;
            abstractC4480b9.A02(c23742f8.A03);
        }
        c23742f2 = this.A00.A09;
        int A0G = abstractC4480b9.A0G();
        String[] strArr = A02;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "61YjDYRNNN";
        strArr2[7] = "vT3ubuaNP5";
        c23742f2.A00 = A0G;
        this.A00.A06 = true;
        C4435aQ c4435aQ = this.A00;
        c3141fg2 = c4435aQ.A05;
        c4435aQ.A04 = c3141fg2.A0G();
        abstractC23121F = this.A00.A04;
        if (abstractC23121F != null) {
            int i10 = 0;
            abstractC23121F4 = this.A00.A04;
            if (!abstractC23121F4.A0j()) {
                abstractC23121F5 = this.A00.A04;
                i10 = ((AbstractC4476b5) abstractC23121F5).A0v();
            }
            if (i10 > 0) {
                C3485Kz c3485Kz = new C3485Kz();
                C4337Yn c4337Yn = this.A00.A07;
                c23742f5 = this.A00.A09;
                if (c3485Kz.A09(c4337Yn, c23742f5.A06, i10)) {
                    c3485Kz.A08(this.A00.A07, true);
                    C4435aQ c4435aQ2 = this.A00;
                    C4337Yn c4337Yn2 = c4435aQ2.A07;
                    c23742f6 = this.A00.A09;
                    String str = c23742f6.A0D;
                    c23742f7 = this.A00.A09;
                    c4435aQ2.A03 = c3485Kz.A07(c4337Yn2, str, c23742f7.A06);
                } else {
                    C4435aQ c4435aQ3 = this.A00;
                    String[] strArr3 = A02;
                    if (strArr3[4].length() != strArr3[7].length()) {
                        String[] strArr4 = A02;
                        strArr4[4] = "df15N9yr5s";
                        strArr4[7] = "rrfEFjVt4q";
                        c3485Kz.A08(c4435aQ3.A07, false);
                    } else {
                        String[] strArr5 = A02;
                        strArr5[1] = "7AaEv1vCH3bw";
                        strArr5[5] = "Y1uo0lYkjhkOAjcvNvodbhiOq3C";
                        c3485Kz.A08(c4435aQ3.A07, false);
                    }
                }
            }
        }
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            c23742f3 = this.A00.A09;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(c23742f3.A00());
            return;
        }
        abstractC23121F2 = this.A00.A04;
        ((AbstractC4476b5) abstractC23121F2).A17(true);
        rewardedVideoAd2 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        abstractC23121F3 = this.A00.A04;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(abstractC23121F3.A0J());
        c23742f4 = this.A00.A09;
        RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = withRewardData.withAdExperience(c23742f4.A02).withAdListener(new RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.25
            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(InterfaceC2219Ad interfaceC2219Ad) {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(InterfaceC2219Ad interfaceC2219Ad) {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                C23742F c23742f9;
                s2SRewardedVideoAdExtendedListener2 = C4437aS.this.A00.A08;
                c23742f9 = C4437aS.this.A00.A09;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(c23742f9.A00());
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(InterfaceC2219Ad interfaceC2219Ad, AdError adError) {
                AbstractC23121F abstractC23121F6;
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                C23742F c23742f9;
                C4437aS.this.A00.A03 = null;
                abstractC23121F6 = C4437aS.this.A00.A04;
                ((AbstractC4476b5) abstractC23121F6).A17(false);
                s2SRewardedVideoAdExtendedListener2 = C4437aS.this.A00.A08;
                c23742f9 = C4437aS.this.A00.A09;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(c23742f9.A00());
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(InterfaceC2219Ad interfaceC2219Ad) {
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoClosed() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = C4437aS.this.A00.A08;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoClosed();
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoCompleted() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = C4437aS.this.A00.A08;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoCompleted();
            }
        }).build();
        rewardedVideoAd3 = this.A00.A03;
        rewardedVideoAd3.loadAd(loadAdConfig);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0G(C3403Jb c3403Jb) {
        C23742F c23742f;
        long j10;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C23742F c23742f2;
        this.A00.A0D(true);
        c23742f = this.A00.A09;
        InterfaceC22640S A0E = c23742f.A0B.A0E();
        j10 = this.A00.A01;
        A0E.A2m(C3527Lf.A01(j10), c3403Jb.A03().getErrorCode(), c3403Jb.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c23742f2 = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onError(c23742f2.A00(), AbstractC3487L1.A00(c3403Jb));
    }
}
