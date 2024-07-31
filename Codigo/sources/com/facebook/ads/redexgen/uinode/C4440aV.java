package com.facebook.ads.redexgen.uinode;

import android.view.View;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aV */
/* loaded from: assets/audience_network.dex */
public class C4440aV extends AbstractC22870q {
    public static byte[] A01;
    public static String[] A02 = {"", "lR4UvBki6PSdVcLREjEHAbqRd1OmLUQf", "DjKPGQUWmMf7x", "ODfaPUPPzX7KhktdCz15RADFZIjUcUTH", "SOtQhTlfKwNvvZXzwoqU2I3z2iEV30z7", "BHtVd6ktyCMEATMZK8J5wjGrCvXYI9tG", "P8UTzFKpwpJ94", "IxNcf87J3g"};
    public final /* synthetic */ C4438aT A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 126);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{99, 114, 107, 29, 17, 16, 10, 12, 17, 18, 18, 27, 12, 94, 23, 13, 94, 16, 11, 18, 18};
    }

    static {
        A01();
    }

    public C4440aV(C4438aT c4438aT) {
        this.A00 = c4438aT;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A02() {
        InterstitialAd interstitialAd;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAd = this.A00.A01;
        if (interstitialAd == null) {
            this.A00.A04 = false;
            interstitialAdExtendedListener = this.A00.A07;
            interstitialAdExtendedListener.onInterstitialActivityDestroyed();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A04() {
        InterstitialAd interstitialAd;
        InterstitialAd interstitialAd2;
        C3149FQ c3149fq;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C236526 c236526;
        C3149FQ c3149fq2;
        C3149FQ c3149fq3;
        interstitialAd = this.A00.A01;
        if (interstitialAd != null) {
            interstitialAd2 = this.A00.A01;
            interstitialAd2.show();
            return;
        }
        this.A00.A04 = false;
        c3149fq = this.A00.A03;
        if (c3149fq != null && C3348Ih.A1j(this.A00.A06)) {
            c3149fq2 = this.A00.A03;
            c3149fq2.A0P(new C4441aW(this));
            c3149fq3 = this.A00.A03;
            c3149fq3.A0K();
            this.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A00.A07;
        c236526 = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c236526.A01());
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A05() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C236526 c236526;
        interstitialAdExtendedListener = this.A00.A07;
        c236526 = this.A00.A08;
        interstitialAdExtendedListener.onInterstitialDisplayed(c236526.A01());
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A06() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A07() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A08() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        interstitialAdExtendedListener = this.A00.A07;
        interstitialAdExtendedListener.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0C() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C236526 c236526;
        this.A00.A06.A0E().A2j();
        interstitialAdExtendedListener = this.A00.A07;
        c236526 = this.A00.A08;
        interstitialAdExtendedListener.onAdClicked(c236526.A01());
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0D() {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C236526 c236526;
        interstitialAdExtendedListener = this.A00.A07;
        c236526 = this.A00.A08;
        interstitialAdExtendedListener.onLoggingImpression(c236526.A01());
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0E(View view) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0096, code lost:
    
        if (r5 > 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
    
        r6 = new com.facebook.ads.redexgen.uinode.C3485Kz();
        r2 = r7.A00.A06;
        r0 = r7.A00.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b3, code lost:
    
        if (r6.A09(r2, r0.A08(), r4.A0v()) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b5, code lost:
    
        r6.A08(r7.A00.A06, true);
        r5 = r7.A00;
        r2 = r5.A06;
        r0 = r7.A00.A08;
        r1 = r0.A0A();
        r0 = r7.A00.A08;
        r5.A01 = r6.A06(r2, r1, r0.A08());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0137, code lost:
    
        r6.A08(r7.A00.A06, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00db, code lost:
    
        r0 = r7.A00.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00e1, code lost:
    
        if (r0 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00e3, code lost:
    
        r4.A17(true);
        r0 = r7.A00.A01;
        r1 = r0.buildLoadAdConfig().withAdListener(new com.facebook.ads.redexgen.uinode.C236324(r7, r4));
        r0 = r7.A00.A08;
        r1 = r1.withCacheFlags(r0.A0B());
        r0 = r7.A00.A08;
        r1 = r1.withRewardData(r0.A03()).build();
        r0 = r7.A00.A01;
        r0.loadAd(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0122, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0123, code lost:
    
        r1 = r7.A00.A07;
        r0 = r7.A00.A08;
        r1.onAdLoaded(r0.A01());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0140, code lost:
    
        if (r5 > 0) goto L16;
     */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0F(com.facebook.ads.redexgen.uinode.InterfaceC22860p r8) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C4440aV.A0F(com.facebook.ads.redexgen.X.0p):void");
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0G(C3403Jb c3403Jb) {
        long j10;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C236526 c236526;
        InterfaceC22640S A0E = this.A00.A06.A0E();
        j10 = this.A00.A00;
        A0E.A2m(C3527Lf.A01(j10), c3403Jb.A03().getErrorCode(), c3403Jb.A04());
        interstitialAdExtendedListener = this.A00.A07;
        c236526 = this.A00.A08;
        interstitialAdExtendedListener.onError(c236526.A01(), AbstractC3487L1.A00(c3403Jb));
    }
}
