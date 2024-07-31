package com.facebook.ads.redexgen.uinode;

import android.util.Log;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.DF */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3028DF {
    public static byte[] A00;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C4211Wl A00(InterfaceC2951Bt interfaceC2951Bt) throws IOException, InterruptedException {
        AbstractC3281Ha.A01(interfaceC2951Bt);
        C3306Hz c3306Hz = new C3306Hz(16);
        if (C3027DE.A00(interfaceC2951Bt, c3306Hz).A00 != AbstractC3322IF.A08(A01(111, 4, 112))) {
            return null;
        }
        int i10 = 0;
        interfaceC2951Bt.ADv(c3306Hz.A00, 0, 4);
        c3306Hz.A0Y(0);
        int A08 = c3306Hz.A08();
        int A082 = AbstractC3322IF.A08(A01(195, 4, 13));
        String A01 = A01(199, 15, 13);
        if (A08 != A082) {
            Log.e(A01, A01(115, 25, 27) + A08);
            return null;
        }
        C3027DE A002 = C3027DE.A00(interfaceC2951Bt, c3306Hz);
        while (A002.A00 != AbstractC3322IF.A08(A01(218, 4, 32))) {
            interfaceC2951Bt.A3W((int) A002.A01);
            A002 = C3027DE.A00(interfaceC2951Bt, c3306Hz);
        }
        AbstractC3281Ha.A04(A002.A01 >= 16);
        interfaceC2951Bt.ADv(c3306Hz.A00, 0, 16);
        c3306Hz.A0Y(0);
        int A0C = c3306Hz.A0C();
        int A0C2 = c3306Hz.A0C();
        int A0B = c3306Hz.A0B();
        int A0B2 = c3306Hz.A0B();
        int A0C3 = c3306Hz.A0C();
        int A0C4 = c3306Hz.A0C();
        int i11 = (A0C2 * A0C4) / 8;
        if (A0C3 != i11) {
            throw new C28319v(A01(57, 26, 48) + i11 + A01(10, 7, 62) + A0C3);
        }
        switch (A0C) {
            case 1:
            case 65534:
                i10 = AbstractC3322IF.A02(A0C4);
                break;
            case 3:
                if (A0C4 == 32) {
                    i10 = 4;
                    break;
                }
                break;
            default:
                Log.e(A01, A01(166, 29, 30) + A0C);
                return null;
        }
        if (i10 == 0) {
            Log.e(A01, A01(140, 26, 101) + A0C4 + A01(0, 10, 35) + A0C);
            return null;
        }
        interfaceC2951Bt.A3W(((int) A002.A01) - 16);
        return new C4211Wl(A0C2, A0B, A0B2, A0C3, A0C4, i10);
    }

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 36);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{39, 97, 104, 117, 39, 115, 126, 119, 98, 39, 33, 58, 125, 117, 110, 32, 58, 123, 80, 77, 86, 83, 24, 81, 75, 24, 76, 87, 87, 24, 84, 89, 74, 95, 93, 24, 16, 70, 10, Byte.MAX_VALUE, 122, 19, 17, 24, 76, 87, 24, 75, 83, 81, 72, 3, 24, 81, 92, 2, 24, 81, 108, 100, 113, 119, 96, 113, 112, 52, 118, 120, 123, 119, Byte.MAX_VALUE, 52, 117, 120, 125, 115, 122, 121, 113, 122, 96, 46, 52, 103, 73, 64, 65, 92, 71, 64, 73, 14, 91, 64, 69, 64, 65, 89, 64, 14, 121, 111, 120, 14, 77, 70, 91, 64, 69, 20, 14, 6, 29, 18, 18, 106, 81, 76, 74, 79, 79, 80, 77, 75, 90, 91, 31, 109, 118, 121, 121, 31, 89, 80, 77, 82, 94, 75, 5, 31, 20, 47, 50, 52, 49, 49, 46, 51, 53, 36, 37, 97, 22, 0, 23, 97, 35, 40, 53, 97, 37, 36, 49, 53, 41, 97, 111, 84, 73, 79, 74, 74, 85, 72, 78, 95, 94, 26, 109, 123, 108, 26, 92, 85, 72, 87, 91, 78, 26, 78, 67, 74, 95, 0, 26, 126, 104, Byte.MAX_VALUE, 108, 126, 72, 95, 97, 76, 72, 77, 76, 91, 123, 76, 72, 77, 76, 91, 10, 15, 26, 15, 98, 105, 112, 36};
    }

    public static void A03(InterfaceC2951Bt interfaceC2951Bt, C4211Wl c4211Wl) throws IOException, InterruptedException {
        AbstractC3281Ha.A01(interfaceC2951Bt);
        AbstractC3281Ha.A01(c4211Wl);
        interfaceC2951Bt.AFM();
        C3306Hz c3306Hz = new C3306Hz(8);
        C3027DE A002 = C3027DE.A00(interfaceC2951Bt, c3306Hz);
        while (A002.A00 != AbstractC3322IF.A08(A01(214, 4, 74))) {
            Log.w(A01(199, 15, 13), A01(83, 28, 10) + A002.A00);
            long j10 = A002.A01 + 8;
            if (A002.A00 == AbstractC3322IF.A08(A01(111, 4, 112))) {
                j10 = 12;
            }
            if (j10 <= 2147483647L) {
                interfaceC2951Bt.AGP((int) j10);
                A002 = C3027DE.A00(interfaceC2951Bt, c3306Hz);
            } else {
                throw new C28319v(A01(17, 40, 28) + A002.A00);
            }
        }
        interfaceC2951Bt.AGP(8);
        c4211Wl.A06(interfaceC2951Bt.A7i(), A002.A01);
    }
}
