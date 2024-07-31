package com.facebook.ads.redexgen.uinode;

import android.content.Context;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.util.process.ProcessUtils;

/* loaded from: assets/audience_network.dex */
public final class YL implements InterfaceC07287h {
    public static YL A07;
    public static byte[] A08;
    public static String[] A09 = {"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};
    public C0W A00;
    public InterfaceC07086g A01;
    public C7g A02;
    public InterfaceC07397w A03;
    public C07458c A04;
    public JE A05;
    public InterfaceC0964Hj A06;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A06(int r4, int r5, int r6) {
        /*
            byte[] r1 = com.facebook.ads.redexgen.uinode.YL.A08
            int r0 = r4 + r5
            byte[] r3 = java.util.Arrays.copyOfRange(r1, r4, r0)
            r4 = 0
        L9:
            int r5 = r3.length
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.YL.A09
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
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.YL.A09
            java.lang.String r1 = "Hv2WK1fJh7GnXaP"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "jwUFRNkRPBL5IaL"
            r0 = 7
            r2[r0] = r1
            if (r4 >= r5) goto L5c
            r5 = r3[r4]
            int r5 = r5 - r6
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.YL.A09
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
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.YL.A09
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.YL.A06(int, int, int):java.lang.String");
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
    public final synchronized void A0C(C1398Ym c1398Ym) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(c1398Ym);
        InterfaceC0964Hj A05 = A05(c1398Ym, this.A03, A03(c1398Ym));
        this.A06 = A05;
        A09(c1398Ym, A00(c1398Ym, A05));
        A0A(c1398Ym, this.A06);
        A0B(c1398Ym, this.A06);
        InterfaceC0964Hj interfaceC0964Hj = this.A06;
        if (interfaceC0964Hj != null) {
            interfaceC0964Hj.A5m();
        }
    }

    static {
        A07();
    }

    public static AnonymousClass66 A00(C1398Ym c1398Ym, InterfaceC0964Hj interfaceC0964Hj) {
        if (!C0988Ih.A1P(c1398Ym) || interfaceC0964Hj == null) {
            return null;
        }
        return AnonymousClass67.A00().A00(interfaceC0964Hj);
    }

    public static InterfaceC07397w A01(C1398Ym c1398Ym) {
        return AbstractC07407x.A00().A00(c1398Ym, new YS());
    }

    public static synchronized YL A02() {
        YL yl2;
        synchronized (YL.class) {
            if (A07 == null) {
                A07 = new YL();
            }
            yl2 = A07;
        }
        return yl2;
    }

    public static RK A03(C1398Ym c1398Ym) {
        if (!C0988Ih.A1L(c1398Ym)) {
            return null;
        }
        return C1210Rc.A01(c1398Ym);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07287h
    /* renamed from: A04 */
    public final synchronized InterfaceC0964Hj A86() {
        return this.A06;
    }

    public static InterfaceC0964Hj A05(C1398Ym c1398Ym, InterfaceC07397w interfaceC07397w, RK rk2) {
        if (C0988Ih.A2E(c1398Ym) && rk2 != null && !ProcessUtils.isRemoteRenderingProcess()) {
            return AbstractC1233Rz.A00().A00(c1398Ym, interfaceC07397w, rk2, K9.A04(c1398Ym), new YM(new K1(c1398Ym, A06(0, 0, 122), null, EnumC1009Jg.A07, 0, new C1014Jl(), LW.A01(C0988Ih.A0J(c1398Ym)), null, null, new C1470aZ()), c1398Ym), C1231Rx.A00().A00());
        }
        return null;
    }

    public static void A08() {
        String A06 = A06(8, 24, 59);
        if (A09[5].length() == 20) {
            throw new RuntimeException();
        }
        A09[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        AbstractC1018Jp.A05(A06(32, 28, 77), A06, A06(0, 8, 46));
    }

    public static void A09(C1398Ym c1398Ym, AnonymousClass66 anonymousClass66) {
        if (!C0988Ih.A1P(c1398Ym) || anonymousClass66 == null) {
            return;
        }
        AnonymousClass64.A00().A00(anonymousClass66, c1398Ym);
    }

    public static void A0A(C1398Ym c1398Ym, InterfaceC0964Hj interfaceC0964Hj) {
        if (!C0988Ih.A0h(c1398Ym) || interfaceC0964Hj == null) {
            return;
        }
        new C6R(c1398Ym, interfaceC0964Hj, new C6S(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(C1398Ym c1398Ym, InterfaceC0964Hj interfaceC0964Hj) {
        if (interfaceC0964Hj == null) {
            return;
        }
        AbstractC0991Il.A00(c1398Ym, interfaceC0964Hj);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07287h
    public final J2 A5u(C1398Ym c1398Ym) {
        return VQ.A01(c1398Ym);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07287h
    public final synchronized C7g A6A(C07277f c07277f) {
        if (this.A02 == null) {
            this.A02 = new YN(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07287h
    public final synchronized InterfaceC07086g A6L() {
        if (this.A01 == null) {
            this.A01 = new C1400Yo();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07287h
    public final synchronized InterfaceC07397w A6j(C07277f c07277f) {
        if (this.A03 == null) {
            this.A03 = A01(c07277f.A01());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07287h
    public final synchronized AnonymousClass89 A6l(C07277f c07277f) {
        return new C1387Yb(c07277f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07287h
    public final synchronized InterfaceC07297i A6v(C07277f c07277f) {
        return new EO(this, c07277f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07287h
    public final synchronized C0W A77(C07277f c07277f) {
        if (!C0988Ih.A0v(c07277f)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0X.A00().A00(new YQ(c07277f));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07287h
    public final synchronized C7k A7q(C07277f c07277f) {
        return new YO(c07277f);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07287h
    public final C1398Ym A7r(Context context) {
        C1398Ym sdkContext = AbstractC07267e.A00();
        if (sdkContext == null) {
            C1398Ym sdkContext2 = new C1398Ym(context, this);
            AbstractC07267e.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07287h
    public final synchronized JE A7s(C1398Ym c1398Ym) {
        if (this.A05 == null) {
            this.A05 = new VY(c1398Ym);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC07287h
    public final synchronized C07458c A7y() {
        if (this.A04 == null) {
            this.A04 = new C07458c();
            A08();
        }
        return this.A04;
    }
}
