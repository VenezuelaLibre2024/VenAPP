package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Vs */
/* loaded from: assets/audience_network.dex */
public final class C4159Vs extends C3249H4 {
    public static byte[] A02;
    public final int A00;
    public final Map<String, List<String>> A01;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 27);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{48, 7, 17, 18, 13, 12, 17, 7, 66, 1, 13, 6, 7, 88, 66};
    }

    public C4159Vs(int i10, Map<String, List<String>> map, C3243Gy c3243Gy) {
        super(A00(0, 15, 121) + i10, c3243Gy, 1);
        this.A00 = i10;
        this.A01 = map;
    }
}