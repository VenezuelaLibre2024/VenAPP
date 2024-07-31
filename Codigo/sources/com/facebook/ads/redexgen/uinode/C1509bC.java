package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1509bC extends KT {
    public static byte[] A01;
    public final /* synthetic */ C1508bB A00;

    static {
        A02();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 95);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-20, -29, -8, -29, -11, -27, -12, -21, -14, -10, -68};
    }

    public C1509bC(C1508bB c1508bB) {
        this.A00 = c1508bB;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C1399Yn c1399Yn;
        NY ny;
        C1510bD c1510bD;
        c1399Yn = this.A00.A02;
        c1399Yn.A0E().AH4();
        ny = this.A00.A04;
        StringBuilder append = new StringBuilder().append(A00(0, 11, 35));
        c1510bD = this.A00.A00;
        ny.loadUrl(append.append(c1510bD.A03()).toString());
    }
}
