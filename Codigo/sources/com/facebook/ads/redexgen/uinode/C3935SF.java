package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.SF */
/* loaded from: assets/audience_network.dex */
public final class C3935SF implements InterfaceC3811QF {
    public static byte[] A0B;
    public boolean A00;
    public boolean A01;
    public final C4337Yn A02;
    public final InterfaceC3369J2 A03;
    public final C3930SA A04;
    public final AbstractC3790Pu A05;
    public final AbstractC3781Pl A06;
    public final AbstractC3721On A07;
    public final C3954SY A08;
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

    public C3935SF(C4337Yn c4337Yn, InterfaceC3369J2 interfaceC3369J2, C3930SA c3930sa, String str, C3824QS c3824qs, Map<String, String> map) {
        AbstractC3781Pl abstractC3781Pl = new AbstractC3781Pl() { // from class: com.facebook.ads.redexgen.X.9N
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C27909F c27909f) {
                boolean z10;
                String str2;
                C3954SY c3954sy;
                C4337Yn c4337Yn2;
                z10 = C3935SF.this.A01;
                if (!z10) {
                    C3935SF.this.A01 = true;
                    c4337Yn2 = C3935SF.this.A02;
                    c4337Yn2.A0E().AFU();
                }
                str2 = C3935SF.this.A09;
                C3955SZ c3955sz = new C3955SZ(str2, c27909f.A03(), c27909f.A01(), c27909f.A02());
                if (c27909f.A00() >= 0.05d) {
                    c3955sz.A06(c27909f.A01());
                }
                c3954sy = C3935SF.this.A08;
                c3954sy.A0C(c3955sz);
            }
        };
        this.A06 = abstractC3781Pl;
        AbstractC3721On abstractC3721On = new AbstractC3721On() { // from class: com.facebook.ads.redexgen.X.9M
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C278398 c278398) {
                C4337Yn c4337Yn2;
                c4337Yn2 = C3935SF.this.A02;
                c4337Yn2.A0E().AFb();
                C3935SF.this.A0D();
            }
        };
        this.A07 = abstractC3721On;
        AbstractC3790Pu abstractC3790Pu = new AbstractC3790Pu() { // from class: com.facebook.ads.redexgen.X.9L
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.uinode.AbstractC27678s
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C27929H c27929h) {
                C4337Yn c4337Yn2;
                c4337Yn2 = C3935SF.this.A02;
                c4337Yn2.A0E().AFZ();
                C3935SF.this.A0D();
            }
        };
        this.A05 = abstractC3790Pu;
        this.A00 = false;
        this.A01 = false;
        this.A02 = c4337Yn;
        this.A03 = interfaceC3369J2;
        this.A09 = str;
        this.A0A = map;
        this.A04 = c3930sa;
        this.A08 = new C3954SY(str);
        if (C3348Ih.A1i(c4337Yn)) {
            c4337Yn.A0E().AFW();
            c3824qs.A0h(this);
            c3930sa.getEventBus().A05(abstractC3781Pl);
        } else {
            c4337Yn.A0E().AFX();
            c3930sa.getEventBus().A03(abstractC3781Pl, abstractC3721On, abstractC3790Pu);
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
        C3936SG c3936sg = new C3936SG(this);
        if (this.A04.A0l()) {
            ExecutorC3530Li.A00(c3936sg);
        } else {
            this.A04.getStateHandler().post(c3936sg);
        }
    }

    public final synchronized void A0D() {
        String A04 = C3954SY.A04(this.A08.A0B());
        if (A04 != null) {
            this.A02.A0E().AFc();
            InterfaceC3369J2 interfaceC3369J2 = this.A03;
            String encodedFrameData = this.A09;
            interfaceC3369J2.AA1(encodedFrameData, A08(A04));
        } else if (!this.A00) {
            this.A02.A0E().AFV();
            this.A03.AA1(this.A09, A08(A06(0, 0, 56)));
            this.A00 = true;
        } else {
            this.A02.A0E().AFe();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3811QF
    public final void AC8() {
        this.A02.A0E().AFa();
        A0D();
    }
}
