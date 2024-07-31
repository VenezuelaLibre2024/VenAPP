package com.facebook.ads.redexgen.uinode;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8u */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC07638u {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 51);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{-2, -15, -17, -5, -2, -16, -21, -16, -19, 0, -19, -18, -19, -1, -15};
    }

    public static C8w A00(C1398Ym c1398Ym) {
        try {
            return new YD(c1398Ym);
        } catch (IOException e10) {
            c1398Ym.A07().A9a(A02(0, 15, 89), C8A.A2K, new C8B(e10));
            return new YG();
        }
    }

    public static EN A01(C1398Ym c1398Ym) {
        return new EN(c1398Ym);
    }
}
