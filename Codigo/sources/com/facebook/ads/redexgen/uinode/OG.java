package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class OG {
    public static byte[] A05;
    public boolean A00 = false;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AbstractC1502b5 A02;
    public final C1399Yn A03;
    public final OE A04;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{84, 91, 94, 84, 92, 104, 68, 88, 66, 69, 84, 82};
    }

    public OG(C1399Yn c1399Yn, AbstractC1502b5 abstractC1502b5, OE oe2) {
        this.A03 = c1399Yn;
        this.A04 = oe2;
        this.A02 = abstractC1502b5;
    }

    public static OG A01(C1399Yn c1399Yn, AbstractC1502b5 abstractC1502b5, OE oe2) {
        Object creativeAsCtaLoggingHelper = c1399Yn.A0H();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new OG(c1399Yn, abstractC1502b5, oe2);
            c1399Yn.A0N(creativeAsCtaLoggingHelper);
        }
        return (OG) creativeAsCtaLoggingHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(String str, C1U c1u, String str2) {
        Map<String, String> A052 = new C1112Ni().A03(null).A02(null).A05();
        A052.put(A02(0, 12, 15), str);
        this.A03.A09().A9j(str2, A052);
        if (c1u != null) {
            C1U.A06(c1u, this.A03);
        }
        if (C0988Ih.A20(this.A03)) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC1532bZ.A03, Boolean.TRUE.toString());
            hashMap.put(AbstractC1532bZ.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC1532bZ.A05, Boolean.TRUE.toString());
            this.A03.A09().A9s(str2, hashMap);
        }
        this.A04.AC9();
    }

    public static boolean A06(C1399Yn c1399Yn) {
        return C0988Ih.A1F(c1399Yn) && C1047Kv.A0H(c1399Yn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.uinode.OF A09(com.facebook.ads.redexgen.uinode.AbstractC1502b5 r4) {
        /*
            r3 = this;
            com.facebook.ads.redexgen.X.Yn r0 = r3.A03
            boolean r0 = com.facebook.ads.redexgen.uinode.C0988Ih.A1K(r0)
            r2 = 1
            if (r0 == 0) goto L1f
            boolean r0 = r4.A0l()
            if (r0 == 0) goto L1d
            com.facebook.ads.redexgen.X.Yn r0 = r3.A03
            boolean r0 = A06(r0)
            if (r0 == 0) goto L1d
        L17:
            com.facebook.ads.redexgen.X.OF r0 = new com.facebook.ads.redexgen.X.OF
            r0.<init>(r2, r2)
            return r0
        L1d:
            r2 = 0
            goto L17
        L1f:
            boolean r1 = r4.A0l()
            if (r1 == 0) goto L33
            com.facebook.ads.redexgen.X.Yn r0 = r3.A03
            boolean r0 = A06(r0)
            if (r0 == 0) goto L33
        L2d:
            com.facebook.ads.redexgen.X.OF r0 = new com.facebook.ads.redexgen.X.OF
            r0.<init>(r1, r2)
            return r0
        L33:
            r2 = 0
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.OG.A09(com.facebook.ads.redexgen.X.b5):com.facebook.ads.redexgen.X.OF");
    }

    public final void A0A() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }

    public final void A0B(String str, C1U c1u, String str2) {
        A0A();
        this.A00 = true;
        this.A01.postDelayed(new OD(this, str, c1u, str2), this.A02.A0H());
    }
}
