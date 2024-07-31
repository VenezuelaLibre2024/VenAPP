package com.facebook.ads.redexgen.uinode;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8u */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC27698u {
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

    public static InterfaceC27718w A00(C4336Ym c4336Ym) {
        try {
            return new C4301YD(c4336Ym);
        } catch (IOException e10) {
            c4336Ym.A07().A9a(A02(0, 15, 89), AbstractC27248A.A2K, new C27258B(e10));
            return new C4304YG();
        }
    }

    public static C3086EN A01(C4336Ym c4336Ym) {
        return new C3086EN(c4336Ym);
    }
}
