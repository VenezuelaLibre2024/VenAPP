package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public class T0 extends KT {
    public static byte[] A01;
    public final /* synthetic */ C1257Sx A00;

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

    public T0(C1257Sx c1257Sx) {
        this.A00 = c1257Sx;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        boolean z10;
        InterfaceC1159Pd interfaceC1159Pd;
        z10 = this.A00.A0S;
        if (!z10) {
            interfaceC1159Pd = this.A00.A0X;
            interfaceC1159Pd.ADX(A00(0, 24, 79));
        }
    }
}
