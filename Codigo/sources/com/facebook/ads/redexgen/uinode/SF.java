package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class SF implements QF {
    public static byte[] A0B;
    public boolean A00;
    public boolean A01;
    public final C1399Yn A02;
    public final J2 A03;
    public final SA A04;
    public final AbstractC1176Pu A05;
    public final AbstractC1167Pl A06;
    public final AbstractC1143On A07;
    public final SY A08;
    public final String A09;
    public final Map<String, String> A0A;

    static {
        A09();
    }

    public static String A06(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0B = new byte[]{125, 105, 122, 118, 126, 104};
    }

    public SF(C1399Yn c1399Yn, J2 j22, SA sa2, String str, QS qs, Map<String, String> map) {
        C9N c9n = new AbstractC1167Pl() { // from class: com.facebook.ads.redexgen.X.9N
            public C9N() {
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
            /* renamed from: A00 */
            public final void A03(C9F c9f) {
                boolean z10;
                String str2;
                SY sy;
                C1399Yn c1399Yn2;
                z10 = SF.this.A01;
                if (!z10) {
                    SF.this.A01 = true;
                    c1399Yn2 = SF.this.A02;
                    c1399Yn2.A0E().AFU();
                }
                str2 = SF.this.A09;
                SZ sz = new SZ(str2, c9f.A03(), c9f.A01(), c9f.A02());
                if (c9f.A00() >= 0.05d) {
                    sz.A06(c9f.A01());
                }
                sy = SF.this.A08;
                sy.A0C(sz);
            }
        };
        this.A06 = c9n;
        C9M c9m = new AbstractC1143On() { // from class: com.facebook.ads.redexgen.X.9M
            public C9M() {
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
            /* renamed from: A00 */
            public final void A03(AnonymousClass98 anonymousClass98) {
                C1399Yn c1399Yn2;
                c1399Yn2 = SF.this.A02;
                c1399Yn2.A0E().AFb();
                SF.this.A0D();
            }
        };
        this.A07 = c9m;
        C9L c9l = new AbstractC1176Pu() { // from class: com.facebook.ads.redexgen.X.9L
            public C9L() {
            }

            @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
            /* renamed from: A00 */
            public final void A03(C9H c9h) {
                C1399Yn c1399Yn2;
                c1399Yn2 = SF.this.A02;
                c1399Yn2.A0E().AFZ();
                SF.this.A0D();
            }
        };
        this.A05 = c9l;
        this.A00 = false;
        this.A01 = false;
        this.A02 = c1399Yn;
        this.A03 = j22;
        this.A09 = str;
        this.A0A = map;
        this.A04 = sa2;
        this.A08 = new SY(str);
        if (C0988Ih.A1i(c1399Yn)) {
            c1399Yn.A0E().AFW();
            qs.A0h(this);
            sa2.getEventBus().A05(c9n);
        } else {
            c1399Yn.A0E().AFX();
            sa2.getEventBus().A03(c9n, c9m, c9l);
        }
    }

    private Map<String, String> A08(String str) {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.A0A;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(A06(0, 6, 123), str);
        return hashMap;
    }

    public final void A0C() {
        SG sg2 = new SG(this);
        if (this.A04.A0l()) {
            ExecutorC1060Li.A00(sg2);
        } else {
            this.A04.getStateHandler().post(sg2);
        }
    }

    public final synchronized void A0D() {
        String A04 = SY.A04(this.A08.A0B());
        if (A04 != null) {
            this.A02.A0E().AFc();
            J2 j22 = this.A03;
            String encodedFrameData = this.A09;
            j22.AA1(encodedFrameData, A08(A04));
        } else if (!this.A00) {
            this.A02.A0E().AFV();
            this.A03.AA1(this.A09, A08(A06(0, 0, 56)));
            this.A00 = true;
        } else {
            this.A02.A0E().AFe();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.QF
    public final void AC8() {
        this.A02.A0E().AFa();
        A0D();
    }
}
