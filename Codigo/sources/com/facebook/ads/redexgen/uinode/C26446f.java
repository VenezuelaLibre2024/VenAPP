package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.6f */
/* loaded from: assets/audience_network.dex */
public final class C26446f {
    public static int A00;
    public static int A01;
    public static int A02;
    public static int A03;
    public static int A04;
    public static int A05;
    public static int A06;
    public static int A07;
    public static byte[] A08;
    public static final String A09;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 62);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-120, -90, -88, -83, -86, 101, -87, -82, -72, -80, 101, -85, -90, -82, -79, -70, -73, -86, 115, -63, -33, -31, -26, -29, -98, -30, -25, -15, -23, -98, -15, -13, -31, -31, -29, -15, -15, -84, -63, -33, -31, -26, -29, -98, -30, -19, -11, -20, -22, -19, -33, -30, -98, -28, -33, -25, -22, -13, -16, -29, -84, -127, -97, -95, -90, -93, 94, -90, -89, -78, 108, -72, -42, -40, -35, -38, -107, -30, -34, -24, -24, -93, -83, -80, -85, -81, -66, -79, -83, -64, -75, -62, -79, -85, -65, -75, -58, -79, -85, -82, -59, -64, -79, -65, -55, -52, -57, -53, -38, -51, -55, -36, -47, -34, -51, -57, -36, -31, -40, -51, -95, -92, -97, -90, -81, -78, -83, -95, -76, -97, -76, -71, -80, -91, 21, 24, 19, 38, 25, 37, 41, 25, 39, 40, 19, 29, 24, -79, -60, -60, -75, -67, -64, -60, -78, -80, -78, -73, -76, 24, 22, 24, 29, 26, 20, 24, 36, 35, 41, 26, 45, 41, -50, -55, -47, -44, -35, -38, -51, -57, -38, -51, -55, -37, -41, -42, 22, 26, 14, 20, 18, 11, 14, 0, 3, -2, 19, 8, 12, 4, 5, 2, -4};
    }

    static {
        A01();
        A09 = C26446f.class.getSimpleName();
        A05 = AbstractC27248A.A0o;
        A06 = AbstractC27248A.A0s;
        A02 = AbstractC27248A.A0l;
        A01 = AbstractC27248A.A0k;
        A03 = AbstractC27248A.A0m;
        A00 = AbstractC27248A.A0i;
        A04 = AbstractC27248A.A0n;
        A07 = AbstractC27248A.A0t;
    }

    public static void A02(C26937f c26937f, C26346V c26346v, int i10, String str, long j10) {
        if (!A06(c26937f)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), c26346v.A01);
            jSONObject.put(A00(134, 13, 118), c26346v.A02);
            if (j10 > 0) {
                jSONObject.put(A00(191, 9, 97), C3527Lf.A06(System.currentTimeMillis() - j10));
            }
            C27258B c27258b = new C27258B(str);
            c27258b.A07(jSONObject);
            c27258b.A05(1);
            c26937f.A07().A9b(A00(154, 5, 17), i10, c27258b);
        } catch (Throwable deLogException) {
            c26937f.A07().A3c(deLogException);
        }
    }

    public static void A03(C26937f c26937f, C26396a c26396a, String str, int i10, String str2, Long l10, Long l11) {
        if (A06(c26937f)) {
            A05(c26937f, c26396a.A05, c26396a.A06, c26396a.A07, A00(186, 5, 111), str, i10, str2, l10, l11, null);
        }
    }

    public static void A04(C26937f c26937f, C26436e c26436e, boolean z10) {
        if (!A06(c26937f)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), c26436e.A01);
            jSONObject.put(A00(134, 13, 118), c26436e.A03);
            jSONObject.put(A00(104, 16, 42), c26436e.A02);
            jSONObject.put(A00(159, 13, 119), c26436e.A00);
            if (C3348Ih.A1z(c26937f)) {
                jSONObject.put(A00(200, 3, 82), c26436e.A04);
            }
            String A002 = z10 ? A00(61, 10, 0) : A00(71, 11, 55);
            int i10 = z10 ? A05 : A06;
            C27258B c27258b = new C27258B(A002);
            c27258b.A07(jSONObject);
            c27258b.A05(1);
            c26937f.A07().A9b(A00(154, 5, 17), i10, c27258b);
        } catch (Throwable th2) {
            c26937f.A07().A3c(th2);
        }
    }

    public static void A05(C26937f c26937f, String str, String str2, String str3, String str4, String str5, int i10, String str6, Long l10, Long l11, Integer num) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A00(120, 14, 2), str);
            jSONObject.put(A00(134, 13, 118), str2);
            jSONObject.put(A00(104, 16, 42), str4);
            if (str6 != null) {
                jSONObject.put(A00(172, 14, 42), str6);
            }
            if (l10 != null) {
                jSONObject.put(A00(82, 22, 14), String.valueOf(l10));
            }
            if (l11 != null) {
                jSONObject.put(A00(191, 9, 97), String.valueOf(l11));
            }
            if (num != null) {
                jSONObject.put(A00(147, 7, 18), String.valueOf(num));
            }
            jSONObject.put(A00(159, 13, 119), str5);
            if (C3348Ih.A1z(c26937f)) {
                jSONObject.put(A00(200, 3, 82), str3);
            }
            String A002 = A00(19, 19, 64);
            if (i10 == A03) {
                A002 = A00(38, 23, 64);
            } else if (i10 == A01) {
                A002 = A00(0, 19, 7);
            }
            C27258B c27258b = new C27258B(A002);
            c27258b.A07(jSONObject);
            c27258b.A05(1);
            c26937f.A07().A9b(A00(154, 5, 17), i10, c27258b);
        } catch (Throwable th2) {
            c26937f.A07().A3c(th2);
        }
    }

    public static boolean A06(C26937f c26937f) {
        int A062;
        if (c26937f.A04().A8z()) {
            A062 = 1;
        } else {
            A062 = AbstractC3350Ij.A06(c26937f);
        }
        if (A062 == 0) {
            return false;
        }
        return A062 <= 0 || c26937f.A08().A00() <= 1.0d / ((double) A062);
    }
}
