package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public class XI implements InterfaceC0853Cl, C1 {
    public static String[] A05 = {"RxrevBHwZunvWtoC5v6V", "BM7NoIYIDKALVkWYBFUm4mgKfD4surZT", "wT545zonAETVeqcNIpSLQKDSBA4psZtT", "O6YerNOVuBIV8g4cn8DH", "f7xxxnJira03VIlY2bxNtwSQeXyrwxct", "8kRv9b0m26r6Uh6XKMOB9WasCMU5o07v", "0W8GSaK37PxtOyOV4bIEUVoiYe2UqjRN", "TYUMHNguvpgJeUJ5Wme9D9z4"};
    public long A00 = -1;
    public long A01 = -1;
    public long[] A02;
    public long[] A03;
    public final /* synthetic */ XH A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.uinode.C1
    public final C0 A7t(long j10) {
        int A0B = IF.A0B(this.A02, this.A04.A04(j10), true, true);
        long A03 = this.A04.A03(this.A02[A0B]);
        C2 c22 = new C2(A03, this.A00 + this.A03[A0B]);
        if (A03 < j10) {
            long[] jArr = this.A02;
            if (A0B != jArr.length - 1) {
                return new C0(c22, new C2(this.A04.A03(jArr[A0B + 1]), this.A00 + this.A03[A0B + 1]));
            }
        }
        return new C0(c22);
    }

    public XI(XH xh2) {
        this.A04 = xh2;
    }

    public final void A00(long j10) {
        this.A00 = j10;
    }

    public final void A01(C0980Hz c0980Hz) {
        c0980Hz.A0Z(1);
        int length = c0980Hz.A0G();
        int i10 = length / 18;
        this.A02 = new long[i10];
        this.A03 = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.A02[i11] = c0980Hz.A0L();
            this.A03[i11] = c0980Hz.A0L();
            c0980Hz.A0Z(2);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0853Cl
    public final C1 A4m() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final long A6r() {
        C0967Hm c0967Hm;
        c0967Hm = this.A04.A01;
        return c0967Hm.A01();
    }

    @Override // com.facebook.ads.redexgen.uinode.C1
    public final boolean A9I() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0853Cl
    public final long AEI(InterfaceC0838Bt interfaceC0838Bt) throws IOException, InterruptedException {
        long j10 = this.A01;
        if (j10 < 0) {
            return -1L;
        }
        long j11 = -(j10 + 2);
        this.A01 = -1L;
        if (A05[5].charAt(9) != '6') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[0] = "MeEp95NFLxRX8bxkfA2m";
        strArr[3] = "RwTpOb1Sie1PnKrI5U9E";
        return j11;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC0853Cl
    public final long AGX(long j10) {
        long A04 = this.A04.A04(j10);
        long granule = this.A02[IF.A0B(this.A02, A04, true, true)];
        this.A01 = granule;
        return A04;
    }
}
