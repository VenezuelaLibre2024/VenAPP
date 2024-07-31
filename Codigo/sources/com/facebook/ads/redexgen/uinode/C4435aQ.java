package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import com.facebook.ads.AdError;
import com.facebook.ads.AdExperienceType;
import com.facebook.ads.RewardData;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.aQ */
/* loaded from: assets/audience_network.dex */
public final class C4435aQ implements InterfaceC236223 {
    public static byte[] A0A;
    public static String[] A0B = {"gd6Snq8TqC5qGLc", "5Vo8FrFWo5Fl4YG5W1yHT6ZfMsOXSACT", "HYpFHiAeuVvng5d4eXQK0awgijL0SEef", "zgL9OdntC9Jt", "c4pha1QVXZPHNWU", "oPtBq8V8zceab2K03f0YSkruz1vfGvQp", "tGZii7gSURWSZ1CI0FSKqsks", "YmWpveYB3lCv"};
    public static final String A0C;
    public long A02;
    public RewardedVideoAd A03;
    public AbstractC23121F A04;
    public C3141FG A05;
    public final C4337Yn A07;
    public final S2SRewardedVideoAdExtendedListener A08;
    public final C23742F A09;
    public int A00 = 0;
    public boolean A06 = false;
    public long A01 = -1;

    public static String A09(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0A = new byte[]{120, 87, 25, 88, 93, 25, 85, 86, 88, 93, 25, 80, 74, 25, 88, 85, 75, 92, 88, 93, 64, 25, 80, 87, 25, 73, 75, 86, 94, 75, 92, 74, 74, 23, 25, 96, 86, 76, 25, 74, 81, 86, 76, 85, 93, 25, 78, 88, 80, 77, 25, 95, 86, 75, 25, 88, 93, 117, 86, 88, 93, 92, 93, 17, 16, 25, 77, 86, 25, 91, 92, 25, 90, 88, 85, 85, 92, 93, 47, 24, 24, 5, 24, 74, 6, 5, 11, 14, 3, 4, 13, 74, 24, 15, 29, 11, 24, 14, 15, 14, 74, 28, 3, 14, 15, 5, 74, 11, 14, 92, 77, 84};
        if (A0B[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0B;
        strArr[4] = "OGOVhUIoezz1oHK";
        strArr[0] = "xl2MkcRK0CWEWUY";
    }

    static {
        A0A();
        A0C = C4435aQ.class.getSimpleName();
    }

    public C4435aQ(C23742F c23742f, InterfaceC23792K interfaceC23792K, String str) {
        this.A09 = c23742f;
        this.A07 = c23742f.A0B;
        this.A08 = new C4425aG(str, interfaceC23792K, this, c23742f);
    }

    private void A0C(String str, AdExperienceType adExperienceType, boolean z10) {
        String A02;
        if (!this.A06 && this.A05 != null) {
            Log.w(A0C, A09(0, 78, 100));
        }
        A0D(false);
        this.A06 = false;
        C23531u c23531u = new C23531u(this.A09.A0D, EnumC3407Jg.A06, AdPlacementType.REWARDED_VIDEO, EnumC3405Je.A07, 1, this.A09.A0C);
        c23531u.A08(z10);
        if (C3348Ih.A28(this.A07) && (A02 = C3485Kz.A02(this.A07, this.A09.A06)) != null) {
            C23742F c23742f = this.A09;
            String[] strArr = A0B;
            String extraHints = strArr[2];
            if (extraHints.charAt(28) != strArr[1].charAt(28)) {
                throw new RuntimeException();
            }
            A0B[6] = "NRWBzlFLQPOGySbiiYXSLDN6";
            c23742f.A06 = A02;
        }
        c23531u.A06(this.A09.A06);
        c23531u.A07(this.A09.A07);
        C3141FG c3141fg = new C3141FG(this.A09.A0B, c23531u);
        this.A05 = c3141fg;
        c3141fg.A0P(new C4437aS(this));
        this.A05.A0U(str, adExperienceType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(boolean z10) {
        C3141FG c3141fg = this.A05;
        if (c3141fg != null) {
            c3141fg.A0P(new C4436aR(this));
            this.A05.A0V(z10);
            this.A05 = null;
        }
    }

    public final long A0F() {
        C3141FG c3141fg = this.A05;
        if (c3141fg != null) {
            return c3141fg.A0E();
        }
        return -1L;
    }

    public final C23742F A0G() {
        return this.A09;
    }

    public final C4337Yn A0H() {
        return this.A07;
    }

    public final void A0I(RewardData rewardData) {
        C3141FG c3141fg;
        this.A09.A03 = rewardData;
        if (this.A06 && (c3141fg = this.A05) != null) {
            c3141fg.A0X(rewardData);
        }
    }

    public final void A0J(String str, AdExperienceType adExperienceType, boolean z10) {
        this.A01 = System.currentTimeMillis();
        try {
            A0C(str, adExperienceType, z10);
        } catch (Exception e10) {
            Log.e(A0C, A09(78, 31, 55), e10);
            this.A09.A0B.A07().A9a(A09(109, 3, 96), AbstractC27248A.A0b, new C27258B(e10));
            AdError internalError = AdError.internalError(AdError.INTERNAL_ERROR_2004);
            this.A09.A0B.A0E().A2m(C3527Lf.A01(this.A01), internalError.getErrorCode(), internalError.getErrorMessage());
            this.A08.onError(this.A09.A00(), internalError);
        }
    }

    public final boolean A0K() {
        C3141FG c3141fg = this.A05;
        return c3141fg == null || c3141fg.A0W();
    }

    public final boolean A0L() {
        return this.A06;
    }

    public final boolean A0M(int i10, long j10) {
        if (!this.A06) {
            this.A08.onError(this.A09.A00(), AdError.SHOW_CALLED_BEFORE_LOAD_ERROR);
            return false;
        }
        if (this.A05 != null) {
            this.A02 = System.currentTimeMillis();
            this.A05.A07.A02(i10);
            this.A05.A07.A03(j10);
            this.A05.A0J();
            this.A06 = false;
            return true;
        }
        this.A06 = false;
        return false;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC236223
    public final void destroy() {
        A0D(true);
    }
}
