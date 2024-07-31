package com.facebook.ads.redexgen.uinode;

import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.OG */
/* loaded from: assets/audience_network.dex */
public final class C3688OG {
    public static byte[] A05;
    public boolean A00 = false;
    public final Handler A01 = new Handler(Looper.getMainLooper());
    public final AbstractC4476b5 A02;
    public final C4337Yn A03;
    public final InterfaceC3686OE A04;

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

    public C3688OG(C4337Yn c4337Yn, AbstractC4476b5 abstractC4476b5, InterfaceC3686OE interfaceC3686OE) {
        this.A03 = c4337Yn;
        this.A04 = interfaceC3686OE;
        this.A02 = abstractC4476b5;
    }

    public static C3688OG A01(C4337Yn c4337Yn, AbstractC4476b5 abstractC4476b5, InterfaceC3686OE interfaceC3686OE) {
        Object creativeAsCtaLoggingHelper = c4337Yn.A0H();
        if (creativeAsCtaLoggingHelper == null) {
            creativeAsCtaLoggingHelper = new C3688OG(c4337Yn, abstractC4476b5, interfaceC3686OE);
            c4337Yn.A0N(creativeAsCtaLoggingHelper);
        }
        return (C3688OG) creativeAsCtaLoggingHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(String str, C23271U c23271u, String str2) {
        Map<String, String> A052 = new C3654Ni().A03(null).A02(null).A05();
        A052.put(A02(0, 12, 15), str);
        this.A03.A09().A9j(str2, A052);
        if (c23271u != null) {
            C23271U.A06(c23271u, this.A03);
        }
        if (C3348Ih.A20(this.A03)) {
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC4506bZ.A03, Boolean.TRUE.toString());
            hashMap.put(AbstractC4506bZ.A04, Boolean.TRUE.toString());
            hashMap.put(AbstractC4506bZ.A05, Boolean.TRUE.toString());
            this.A03.A09().A9s(str2, hashMap);
        }
        this.A04.AC9();
    }

    public static boolean A06(C4337Yn c4337Yn) {
        return C3348Ih.A1F(c4337Yn) && C3481Kv.A0H(c4337Yn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r0 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.uinode.C3687OF A09(com.facebook.ads.redexgen.uinode.AbstractC4476b5 r4) {
        /*
            r3 = this;
            com.facebook.ads.redexgen.X.Yn r0 = r3.A03
            boolean r0 = com.facebook.ads.redexgen.uinode.C3348Ih.A1K(r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C3688OG.A09(com.facebook.ads.redexgen.X.b5):com.facebook.ads.redexgen.X.OF");
    }

    public final void A0A() {
        this.A00 = false;
        this.A01.removeCallbacksAndMessages(null);
    }

    public final void A0B(String str, C23271U c23271u, String str2) {
        A0A();
        this.A00 = true;
        this.A01.postDelayed(new RunnableC3685OD(this, str, c23271u, str2), this.A02.A0H());
    }
}
