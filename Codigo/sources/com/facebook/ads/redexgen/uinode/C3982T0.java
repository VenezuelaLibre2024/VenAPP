package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.T0 */
/* loaded from: assets/audience_network.dex */
public class C3982T0 extends AbstractRunnableC3455KT {
    public static byte[] A01;
    public final /* synthetic */ C3979Sx A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{35, 54, 49, 50, 60, -19, 68, 46, 64, -19, 59, 50, 67, 50, 63, -19, 61, 63, 50, 61, 46, 63, 50, 49};
    }

    public C3982T0(C3979Sx c3979Sx) {
        this.A00 = c3979Sx;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        boolean z10;
        InterfaceC3773Pd interfaceC3773Pd;
        z10 = this.A00.A0S;
        if (!z10) {
            interfaceC3773Pd = this.A00.A0X;
            interfaceC3773Pd.ADX(A00(0, 24, 79));
        }
    }
}
