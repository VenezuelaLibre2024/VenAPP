package com.facebook.ads.redexgen.uinode;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.HV */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3276HV {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 99);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{64, 93, 74, 122, 73, 64, 75, 10, 23, 0, 48, 29, 10, 11, 6, 29};
    }

    public static long A00(InterfaceC3275HU interfaceC3275HU) {
        return interfaceC3275HU.A5p(A02(0, 7, 70), -1L);
    }

    public static Uri A01(InterfaceC3275HU interfaceC3275HU) {
        String A5r = interfaceC3275HU.A5r(A02(7, 9, 12), null);
        if (A5r == null) {
            return null;
        }
        return Uri.parse(A5r);
    }

    public static void A04(C3277HW c3277hw) {
        c3277hw.A01(A02(7, 9, 12));
    }

    public static void A05(C3277HW c3277hw, long j10) {
        c3277hw.A02(A02(0, 7, 70), j10);
    }

    public static void A06(C3277HW c3277hw, Uri uri) {
        c3277hw.A03(A02(7, 9, 12), uri.toString());
    }
}
