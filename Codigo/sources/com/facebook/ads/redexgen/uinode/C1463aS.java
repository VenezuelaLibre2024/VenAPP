package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1463aS extends AbstractC05640q {
    public static byte[] A01;
    public static String[] A02 = {"7kSkrPID5YMo1WnvaMIgpKB6WIhQPZTc", "kYnVnFR0h3Yv", "", "4OZGrpocgzJPR2XOpe36kiptmUtlR1IY", "AELVZqmE3v", "ezzX0t3o6v3ClFiCUOYeN27kq8G", "mBbxV2ZqaJcWXY", "eL94qTtIFL"};
    public final /* synthetic */ C1461aQ A00;

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

    public C1463aS(C1461aQ c1461aQ) {
        this.A00 = c1461aQ;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05640q
    public final void A06() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05640q
    public final void A07() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05640q
    public final void A08() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05640q
    public final void A09() {
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            s2SRewardedVideoAdExtendedListener.onRewardedVideoActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05640q
    public final void A0A() {
        RewardedVideoAd rewardedVideoAd;
        RewardedVideoAd rewardedVideoAd2;
        long j10;
        RewardedVideoAd rewardedVideoAd3;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd != null) {
            rewardedVideoAd2 = this.A00.A03;
            C07015z c07015z = (C07015z) rewardedVideoAd2.buildShowAdConfig();
            long currentTimeMillis = System.currentTimeMillis();
            j10 = this.A00.A02;
            c07015z.A02(currentTimeMillis - j10);
            rewardedVideoAd3 = this.A00.A03;
            rewardedVideoAd3.show(c07015z.build());
            return;
        }
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05640q
    public final void A0C() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C2F c2f;
        this.A00.A07.A0E().A2j();
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c2f = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onAdClicked(c2f.A00());
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05640q
    public final void A0D() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C2F c2f;
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c2f = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onLoggingImpression(c2f.A00());
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05640q
    public final void A0F(InterfaceC05630p interfaceC05630p) {
        FG fg2;
        C2F c2f;
        C2F c2f2;
        FG fg3;
        C1F c1f;
        RewardedVideoAd rewardedVideoAd;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C2F c2f3;
        C1F c1f2;
        RewardedVideoAd rewardedVideoAd2;
        C1F c1f3;
        C2F c2f4;
        RewardedVideoAd rewardedVideoAd3;
        C1F c1f4;
        C2F c2f5;
        C2F c2f6;
        C2F c2f7;
        C1F c1f5;
        C2F c2f8;
        fg2 = this.A00.A05;
        if (fg2 == null) {
            this.A00.A07.A07().A9a(A00(0, 3, 70), C8A.A0N, new C8B(A00(3, 18, 43)));
            return;
        }
        AbstractC1506b9 abstractC1506b9 = (AbstractC1506b9) interfaceC05630p;
        c2f = this.A00.A09;
        if (c2f.A03 != null) {
            c2f8 = this.A00.A09;
            abstractC1506b9.A02(c2f8.A03);
        }
        c2f2 = this.A00.A09;
        int A0G = abstractC1506b9.A0G();
        String[] strArr = A02;
        if (strArr[4].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "61YjDYRNNN";
        strArr2[7] = "vT3ubuaNP5";
        c2f2.A00 = A0G;
        this.A00.A06 = true;
        C1461aQ c1461aQ = this.A00;
        fg3 = c1461aQ.A05;
        c1461aQ.A04 = fg3.A0G();
        c1f = this.A00.A04;
        if (c1f != null) {
            int i10 = 0;
            c1f4 = this.A00.A04;
            if (!c1f4.A0j()) {
                c1f5 = this.A00.A04;
                i10 = ((AbstractC1502b5) c1f5).A0v();
            }
            if (i10 > 0) {
                C1051Kz c1051Kz = new C1051Kz();
                C1399Yn c1399Yn = this.A00.A07;
                c2f5 = this.A00.A09;
                if (c1051Kz.A09(c1399Yn, c2f5.A06, i10)) {
                    c1051Kz.A08(this.A00.A07, true);
                    C1461aQ c1461aQ2 = this.A00;
                    C1399Yn c1399Yn2 = c1461aQ2.A07;
                    c2f6 = this.A00.A09;
                    String str = c2f6.A0D;
                    c2f7 = this.A00.A09;
                    c1461aQ2.A03 = c1051Kz.A07(c1399Yn2, str, c2f7.A06);
                } else {
                    C1461aQ c1461aQ3 = this.A00;
                    String[] strArr3 = A02;
                    if (strArr3[4].length() != strArr3[7].length()) {
                        String[] strArr4 = A02;
                        strArr4[4] = "df15N9yr5s";
                        strArr4[7] = "rrfEFjVt4q";
                        c1051Kz.A08(c1461aQ3.A07, false);
                    } else {
                        String[] strArr5 = A02;
                        strArr5[1] = "7AaEv1vCH3bw";
                        strArr5[5] = "Y1uo0lYkjhkOAjcvNvodbhiOq3C";
                        c1051Kz.A08(c1461aQ3.A07, false);
                    }
                }
            }
        }
        rewardedVideoAd = this.A00.A03;
        if (rewardedVideoAd == null) {
            s2SRewardedVideoAdExtendedListener = this.A00.A08;
            c2f3 = this.A00.A09;
            s2SRewardedVideoAdExtendedListener.onAdLoaded(c2f3.A00());
            return;
        }
        c1f2 = this.A00.A04;
        ((AbstractC1502b5) c1f2).A17(true);
        rewardedVideoAd2 = this.A00.A03;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled = rewardedVideoAd2.buildLoadAdConfig().withFailOnCacheFailureEnabled(true);
        c1f3 = this.A00.A04;
        RewardedVideoAd.RewardedVideoAdLoadConfigBuilder withRewardData = withFailOnCacheFailureEnabled.withRewardData(c1f3.A0J());
        c2f4 = this.A00.A09;
        RewardedVideoAd.RewardedVideoLoadAdConfig loadAdConfig = withRewardData.withAdExperience(c2f4.A02).withAdListener(new RewardedVideoAdListener() { // from class: com.facebook.ads.redexgen.X.25
            @Override // com.facebook.ads.AdListener
            public final void onAdClicked(Ad ad2) {
            }

            @Override // com.facebook.ads.AdListener
            public final void onAdLoaded(Ad ad2) {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                C2F c2f9;
                s2SRewardedVideoAdExtendedListener2 = C1463aS.this.A00.A08;
                c2f9 = C1463aS.this.A00.A09;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(c2f9.A00());
            }

            @Override // com.facebook.ads.AdListener
            public final void onError(Ad ad2, AdError adError) {
                C1F c1f6;
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                C2F c2f9;
                C1463aS.this.A00.A03 = null;
                c1f6 = C1463aS.this.A00.A04;
                ((AbstractC1502b5) c1f6).A17(false);
                s2SRewardedVideoAdExtendedListener2 = C1463aS.this.A00.A08;
                c2f9 = C1463aS.this.A00.A09;
                s2SRewardedVideoAdExtendedListener2.onAdLoaded(c2f9.A00());
            }

            @Override // com.facebook.ads.AdListener
            public final void onLoggingImpression(Ad ad2) {
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoClosed() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = C1463aS.this.A00.A08;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoClosed();
            }

            @Override // com.facebook.ads.RewardedVideoAdListener
            public final void onRewardedVideoCompleted() {
                S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener2;
                s2SRewardedVideoAdExtendedListener2 = C1463aS.this.A00.A08;
                s2SRewardedVideoAdExtendedListener2.onRewardedVideoCompleted();
            }
        }).build();
        rewardedVideoAd3 = this.A00.A03;
        rewardedVideoAd3.loadAd(loadAdConfig);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC05640q
    public final void A0G(C1005Jb c1005Jb) {
        C2F c2f;
        long j10;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C2F c2f2;
        this.A00.A0D(true);
        c2f = this.A00.A09;
        C0S A0E = c2f.A0B.A0E();
        j10 = this.A00.A01;
        A0E.A2m(C1057Lf.A01(j10), c1005Jb.A03().getErrorCode(), c1005Jb.A04());
        s2SRewardedVideoAdExtendedListener = this.A00.A08;
        c2f2 = this.A00.A09;
        s2SRewardedVideoAdExtendedListener.onError(c2f2.A00(), L1.A00(c1005Jb));
    }
}
