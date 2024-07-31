package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.2T */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC23882T {
    public static C23872S A00;
    public static byte[] A01;

    static {
        A02();
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 45);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{58, 54, 52, 119, 63, 56, 58, 60, 59, 54, 54, 50, 119, 56, 61, 42, 119, 24, 29, 6, 11, 28, 9, 22, 11, 13, 16, 23, 30, 6, 26, 22, 23, 31, 16, 30};
    }

    public static C23872S A00(C4336Ym c4336Ym) {
        if (A00 == null) {
            synchronized (C23872S.class) {
                if (A00 == null) {
                    A00 = new C23872S(new C4421aC(c4336Ym.getSharedPreferences(ProcessUtils.getProcessSpecificName(A01(0, 36, 116), c4336Ym), 0)));
                }
            }
        }
        return A00;
    }
}
