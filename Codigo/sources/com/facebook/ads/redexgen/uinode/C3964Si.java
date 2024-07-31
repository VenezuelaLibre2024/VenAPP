package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Si */
/* loaded from: assets/audience_network.dex */
public class C3964Si extends AbstractRunnableC3455KT {
    public static byte[] A02;
    public final /* synthetic */ C28019Q A00;
    public final /* synthetic */ C277893 A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-126, -75, -90, -90, -91, -78, -87, -82, -89, 96, -87, -82, -92, -91, -90, -87, -82, -87, -76, -91, -84, -71};
    }

    public C3964Si(C28019Q c28019q, C277893 c277893) {
        this.A00 = c28019q;
        this.A01 = c277893;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C3930SA c3930sa;
        C3930SA c3930sa2;
        c3930sa = this.A00.A0B;
        if (c3930sa.getState() == EnumC3869RB.A02) {
            c3930sa2 = this.A00.A0B;
            if (c3930sa2.getCurrentPositionInMillis() == A00()) {
                this.A00.A0G(A00(0, 22, 11));
            }
        }
    }
}
