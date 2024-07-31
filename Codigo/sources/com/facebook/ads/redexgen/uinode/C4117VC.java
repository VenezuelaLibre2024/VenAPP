package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.VC */
/* loaded from: assets/audience_network.dex */
public class C4117VC extends AbstractC22870q {
    public static byte[] A01;
    public final /* synthetic */ C4107V2 A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 109);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{23, 42, 61, 50, 63, 46, -23, 42, 45, 60, -23, 54, 42, 55, 42, 48, 46, 59, -23, 61, 49, 46, 50, 59, -23, 56, 64, 55, -23, 50, 54, 57, 59, 46, 60, 60, 50, 56, 55, 60, -9};
    }

    public C4117VC(C4107V2 c4107v2) {
        this.A00 = c4107v2;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0B(C4491bK c4491bK) {
        this.A00.A1T(c4491bK);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0C() {
        InterfaceC4106V1 interfaceC4106V1;
        InterfaceC4106V1 interfaceC4106V12;
        interfaceC4106V1 = this.A00.A0G;
        if (interfaceC4106V1 != null) {
            interfaceC4106V12 = this.A00.A0G;
            interfaceC4106V12.AAc();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0D() {
        throw new IllegalStateException(A00(0, 41, 92));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0F(InterfaceC22860p interfaceC22860p) {
        C3147FO c3147fo;
        C3147FO c3147fo2;
        c3147fo = this.A00.A0A;
        if (c3147fo != null) {
            c3147fo2 = this.A00.A0A;
            c3147fo2.A0J();
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC22870q
    public final void A0G(C3403Jb c3403Jb) {
        long j10;
        InterfaceC4106V1 interfaceC4106V1;
        InterfaceC4106V1 interfaceC4106V12;
        InterfaceC22640S A0E = this.A00.A11().A0E();
        j10 = this.A00.A00;
        A0E.A2m(C3527Lf.A01(j10), c3403Jb.A03().getErrorCode(), c3403Jb.A04());
        interfaceC4106V1 = this.A00.A0G;
        if (interfaceC4106V1 != null) {
            interfaceC4106V12 = this.A00.A0G;
            interfaceC4106V12.ABR(c3403Jb);
        }
    }
}
