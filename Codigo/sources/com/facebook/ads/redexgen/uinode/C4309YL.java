package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;

/* renamed from: com.facebook.ads.redexgen.X.YL */
/* loaded from: assets/audience_network.dex */
public final class C4309YL implements InterfaceC26957h {
    public static C4309YL A07;
    public static byte[] A08;
    public static String[] A09 = {"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};
    public InterfaceC22680W A00;
    public InterfaceC26456g A01;
    public InterfaceC26947g A02;
    public InterfaceC27107w A03;
    public C27518c A04;
    public InterfaceC3381JE A05;
    public InterfaceC3290Hj A06;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A06(int r4, int r5, int r6) {
        /*
            byte[] r1 = com.facebook.ads.redexgen.uinode.C4309YL.A08
            int r0 = r4 + r5
            byte[] r3 = java.util.Arrays.copyOfRange(r1, r4, r0)
            r4 = 0
        L9:
            int r5 = r3.length
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C4309YL.A09
            r0 = 6
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L22
        L1c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L22:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C4309YL.A09
            java.lang.String r1 = "Hv2WK1fJh7GnXaP"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "jwUFRNkRPBL5IaL"
            r0 = 7
            r2[r0] = r1
            if (r4 >= r5) goto L5c
            r5 = r3[r4]
            int r5 = r5 - r6
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C4309YL.A09
            r0 = 4
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L48
            goto L1c
        L48:
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C4309YL.A09
            java.lang.String r1 = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw"
            r0 = 3
            r2[r0] = r1
            int r0 = r5 + (-98)
            byte r0 = (byte) r0
            r3[r4] = r0
            int r4 = r4 + 1
            goto L9
        L5c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C4309YL.A06(int, int, int):java.lang.String");
    }

    public static void A07() {
        A08 = new byte[]{-62, -11, -55, -10, -13, -62, -63, -62, -16, 2, 16, 16, 6, 12, 11, -67, 1, -2, 17, -2, -67, 6, 11, 6, 17, 6, -2, 9, 6, 23, 2, 1, 33, 20, 31, 30, 33, 35, 2, 20, 34, 34, 24, 30, 29, -13, 16, 35, 16, -8, 29, 24, 35, 24, 16, 27, 24, 41, 20, 19};
        if (A09[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0C(C4336Ym c4336Ym) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c4336Ym);
        InterfaceC3290Hj A05 = A05(c4336Ym, this.A03, A03(c4336Ym));
        this.A06 = A05;
        A09(c4336Ym, A00(c4336Ym, A05));
        A0A(c4336Ym, this.A06);
        A0B(c4336Ym, this.A06);
        InterfaceC3290Hj interfaceC3290Hj = this.A06;
        if (interfaceC3290Hj != null) {
            interfaceC3290Hj.A5m();
        }
    }

    static {
        A07();
    }

    public static InterfaceC261066 A00(C4336Ym c4336Ym, InterfaceC3290Hj interfaceC3290Hj) {
        if (!C3348Ih.A1P(c4336Ym) || interfaceC3290Hj == null) {
            return null;
        }
        return AbstractC261167.A00().A00(interfaceC3290Hj);
    }

    public static InterfaceC27107w A01(C4336Ym c4336Ym) {
        return AbstractC27117x.A00().A00(c4336Ym, new C4316YS());
    }

    public static synchronized C4309YL A02() {
        C4309YL c4309yl;
        synchronized (C4309YL.class) {
            if (A07 == null) {
                A07 = new C4309YL();
            }
            c4309yl = A07;
        }
        return c4309yl;
    }

    public static InterfaceC3878RK A03(C4336Ym c4336Ym) {
        if (!C3348Ih.A1L(c4336Ym)) {
            return null;
        }
        return C3896Rc.A01(c4336Ym);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26957h
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC3290Hj A86() {
        return this.A06;
    }

    public static InterfaceC3290Hj A05(C4336Ym c4336Ym, InterfaceC27107w interfaceC27107w, InterfaceC3878RK interfaceC3878RK) {
        if (C3348Ih.A2E(c4336Ym) && interfaceC3878RK != null && !ProcessUtils.isRemoteRenderingProcess()) {
            return AbstractC3919Rz.A00().A00(c4336Ym, interfaceC27107w, interfaceC3878RK, AbstractC3436K9.A04(c4336Ym), new C4310YM(new C3428K1(c4336Ym, A06(0, 0, 122), null, EnumC3407Jg.A07, 0, new C3412Jl(), AbstractC3518LW.A01(C3348Ih.A0J(c4336Ym)), null, null, new C4444aZ()), c4336Ym), C3917Rx.A00().A00());
        }
        return null;
    }

    public static void A08() {
        String A06 = A06(8, 24, 59);
        if (A09[5].length() == 20) {
            throw new RuntimeException();
        }
        A09[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        AbstractC3416Jp.A05(A06(32, 28, 77), A06, A06(0, 8, 46));
    }

    public static void A09(C4336Ym c4336Ym, InterfaceC261066 interfaceC261066) {
        if (!C3348Ih.A1P(c4336Ym) || interfaceC261066 == null) {
            return;
        }
        AbstractC260864.A00().A00(interfaceC261066, c4336Ym);
    }

    public static void A0A(C4336Ym c4336Ym, InterfaceC3290Hj interfaceC3290Hj) {
        if (!C3348Ih.A0h(c4336Ym) || interfaceC3290Hj == null) {
            return;
        }
        new C26306R(c4336Ym, interfaceC3290Hj, new C26316S(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C4336Ym c4336Ym, InterfaceC3290Hj interfaceC3290Hj) {
        if (interfaceC3290Hj == null) {
            return;
        }
        AbstractC3352Il.A00(c4336Ym, interfaceC3290Hj);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26957h
    public final InterfaceC3369J2 A5u(C4336Ym c4336Ym) {
        return C4131VQ.A01(c4336Ym);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26957h
    public final synchronized InterfaceC26947g A6A(C26937f c26937f) {
        if (this.A02 == null) {
            this.A02 = new C4311YN(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26957h
    public final synchronized InterfaceC26456g A6L() {
        if (this.A01 == null) {
            this.A01 = new C4338Yo();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26957h
    public final synchronized InterfaceC27107w A6j(C26937f c26937f) {
        if (this.A03 == null) {
            this.A03 = A01(c26937f.A01());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26957h
    public final synchronized InterfaceC272389 A6l(C26937f c26937f) {
        return new C4325Yb(c26937f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26957h
    public final synchronized InterfaceC26967i A6v(C26937f c26937f) {
        return new C3087EO(this, c26937f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26957h
    public final synchronized InterfaceC22680W A77(C26937f c26937f) {
        if (!C3348Ih.A0v(c26937f)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = AbstractC22690X.A00().A00(new C4314YQ(c26937f));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26957h
    public final synchronized InterfaceC26987k A7q(C26937f c26937f) {
        return new C4312YO(c26937f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26957h
    public final C4336Ym A7r(Context context) {
        C4336Ym sdkContext = AbstractC26927e.A00();
        if (sdkContext == null) {
            C4336Ym sdkContext2 = new C4336Ym(context, this);
            AbstractC26927e.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26957h
    public final synchronized InterfaceC3381JE A7s(C4336Ym c4336Ym) {
        if (this.A05 == null) {
            this.A05 = new C4139VY(c4336Ym);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26957h
    public final synchronized C27518c A7y() {
        if (this.A04 == null) {
            this.A04 = new C27518c();
            A08();
        }
        return this.A04;
    }
}
