package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Aa */
/* loaded from: assets/audience_network.dex */
public final class C2872Aa extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{35, 75, 121, 47, 35, 68, 7, 12, 5, 10, 10, 1, 8, 23, 68, 13, 10, 68, 1, 10, 7, 11, 0, 13, 10, 3, 68, 18, 41, 47, 38, 41, 35, 43, 34, 35, 103, 33, 40, 53, 42, 38, 51, 125, 103};
    }

    public C2872Aa(int i10, int i11, int i12) {
        super(A00(27, 18, 32) + i10 + A00(0, 5, 100) + i11 + A00(5, 22, 3) + i12);
    }
}
