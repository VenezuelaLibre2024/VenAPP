package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.TF */
/* loaded from: assets/audience_network.dex */
public class C3997TF extends AbstractRunnableC3455KT {
    public static byte[] A02;
    public final /* synthetic */ C3737P3 A00;
    public final /* synthetic */ C277893 A01;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 46);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{93, 106, 121, 121, 122, 109, 118, 113, 120, 63, 118, 113, 123, 122, 121, 118, 113, 118, 107, 122, 115, 102};
    }

    public C3997TF(C3737P3 c3737p3, C277893 c277893) {
        this.A00 = c3737p3;
        this.A01 = c277893;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C3930SA c3930sa;
        C3930SA c3930sa2;
        c3930sa = this.A00.A0D;
        if (c3930sa.getState() == EnumC3869RB.A02) {
            c3930sa2 = this.A00.A0D;
            if (c3930sa2.getCurrentPositionInMillis() == A00()) {
                this.A00.A0I(A00(0, 22, 49));
            }
        }
    }
}
