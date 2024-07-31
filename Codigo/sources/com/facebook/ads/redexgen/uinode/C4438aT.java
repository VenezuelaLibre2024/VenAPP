package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.aT */
/* loaded from: assets/audience_network.dex */
public final class C4438aT implements InterfaceC236223 {
    public static byte[] A09;
    public static String[] A0A = {"Q9RghtL5kPMxXUG2hlpmHrVaJwYYGwGq", "TIO3FaU0Mikock0w3rckrPhiuYRMfGhJ", "k6SAISDvmHdOF1rkjeEeymm6HvDlJVR0", "eDRhFd25R2oFsFg27vb0d5UADzs1KoZv", "MaVPWgska1IH7XOKtPwNB8GdxIWUIxDt", "dS1g8OO0fBonmOwqVSSlXi39LbvMIXQb", "JdFW5Fpsu4G", "QGzwgj8zvaLwI8"};
    public static final String A0B;
    public long A00 = -1;
    public InterstitialAd A01;
    public AbstractC23121F A02;
    public C3149FQ A03;
    public boolean A04;
    public boolean A05;
    public final C4337Yn A06;
    public final InterstitialAdExtendedListener A07;
    public final C236526 A08;

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 110);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A09 = new byte[]{-59, -14, -92, -27, -24, -92, -16, -13, -27, -24, -92, -19, -9, -92, -27, -16, -10, -23, -27, -24, -3, -92, -19, -14, -92, -12, -10, -13, -21, -10, -23, -9, -9, -78, -92, -35, -13, -7, -92, -9, -20, -13, -7, -16, -24, -92, -5, -27, -19, -8, -92, -22, -13, -10, -92, -27, -24, -48, -13, -27, -24, -23, -24, -84, -83, -92, -8, -13, -92, -26, -23, -92, -25, -27, -16, -16, -23, -24, -4, 33, 39, 24, 37, 38, 39, 28, 39, 28, 20, 31, -45, 31, 34, 20, 23, -45, 22, 20, 31, 31, 24, 23, -45, 42, 27, 28, 31, 24, -45, 38, 27, 34, 42, 28, 33, 26, -45, 28, 33, 39, 24, 37, 38, 39, 28, 39, 28, 20, 31, -31, 13, 28, 21};
    }

    static {
        A0A();
        A0B = C4438aT.class.getSimpleName();
    }

    public C4438aT(C236526 c236526, InterfaceC23792K interfaceC23792K, String str) {
        this.A08 = c236526;
        this.A06 = c236526.A05();
        this.A07 = new C4426aH(str, interfaceC23792K, this);
    }

    public final long A0D() {
        C3149FQ c3149fq = this.A03;
        if (c3149fq != null) {
            return c3149fq.A0E();
        }
        return -1L;
    }

    public final C236526 A0E() {
        return this.A08;
    }

    public final C4337Yn A0F() {
        return this.A06;
    }

    public final void A0G(EnumSet<CacheFlag> cacheFlags, String str) {
        String A02;
        this.A00 = System.currentTimeMillis();
        if (!this.A05 && this.A03 != null) {
            Log.w(A0B, A09(0, 78, 22));
        }
        this.A05 = false;
        if (this.A04 && !C3348Ih.A0e(this.A06)) {
            this.A06.A07().A9a(A09(130, 3, 62), AbstractC27248A.A0L, new C27258B(A09(78, 52, 69)));
            AdErrorType adErrorType = AdErrorType.LOAD_CALLED_WHILE_SHOWING_AD;
            this.A06.A0E().A2m(C3527Lf.A01(this.A00), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            this.A07.onError(this.A08.A01(), new AdError(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage()));
            return;
        }
        C3149FQ c3149fq = this.A03;
        if (c3149fq != null) {
            c3149fq.A0P(new C4443aY(this));
            this.A03.A0K();
            this.A03 = null;
        }
        C23531u c23531u = new C23531u(this.A08.A0A(), AbstractC3409Ji.A00(this.A06.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, EnumC3405Je.A07, 1, cacheFlags, this.A08.A06());
        if (C3348Ih.A28(this.A06) && (A02 = C3485Kz.A02(this.A06, this.A08.A08())) != null) {
            C236526 c236526 = this.A08;
            if (A0A[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[3] = "6YCA3PHZSlLj0jmN2b2hvaW99ZyRMwjh";
            strArr[5] = "7PoIPIeUN8KAt8vfreK3c69iBAU82q7R";
            c236526.A0I(A02);
        }
        c23531u.A06(this.A08.A08());
        c23531u.A07(this.A08.A09());
        c23531u.A04(this.A08.A03());
        C3149FQ c3149fq2 = new C3149FQ(this.A06, c23531u);
        this.A03 = c3149fq2;
        c3149fq2.A0P(new C4440aV(this));
        this.A03.A0T(str);
    }

    public final boolean A0H() {
        C3149FQ c3149fq = this.A03;
        return c3149fq == null || c3149fq.A0W();
    }

    public final boolean A0I() {
        return this.A05;
    }

    public final boolean A0J() {
        AdError adError = AdError.SHOW_CALLED_BEFORE_LOAD_ERROR;
        if (!this.A05) {
            this.A06.A0E().A2m(C3527Lf.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A07.onError(this.A08.A01(), adError);
            return false;
        }
        C3149FQ c3149fq = this.A03;
        if (c3149fq == null) {
            this.A06.A07().A9a(A09(130, 3, 62), AbstractC27248A.A0S, new C27258B(AdErrorType.INTERSTITIAL_CONTROLLER_IS_NULL.getDefaultErrorMessage()));
            this.A06.A0E().A2m(C3527Lf.A01(this.A00), adError.getErrorCode(), adError.getErrorMessage());
            this.A07.onError(this.A08.A01(), adError);
            return false;
        }
        c3149fq.A0J();
        this.A04 = true;
        this.A05 = false;
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC236223
    public final void destroy() {
        C3149FQ c3149fq = this.A03;
        if (c3149fq != null) {
            c3149fq.A0P(new C4439aU(this));
            this.A03.A0V(true);
            this.A03 = null;
            this.A05 = false;
            this.A04 = false;
        }
    }
}
