package com.facebook.ads.redexgen.uinode;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.ads.redexgen.X.K0 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC3427K0 {
    public static Map<String, Long> A00;
    public static Map<String, Long> A01;
    public static Map<String, String> A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"WcKxqk7L6BbuUQ1o7qmtmX6WSmYBceUW", "BgR1wHMut0LLHWxcn1vNnqjOmnDpA7yk", "nofrFHfyJT7pmG0QketyEOeNZ4PDBNqx", "tJ6rTzDc1vJYhzSuFM6hiX1fKi0tAXSV", "zeDIr51bIn8XcOdXOM6dVjfvh9EOKJZZ", "x4ZdmXYSSnH60B6WOaypztUTceO04NF4", "XXJyOaEVU", "eLFDRkAKNxNhqN4Dib4JBju5Hz9f2MYZ"};

    public static String A01(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 64);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{-35, 43, -14, -35, 43, -14, -35, 28, -14, -35, 28, -14, -35, 28, -22, -24, -27, -19, -23, 26, -19, 23, -20, 10, 0, 5, -2, -73, 3, -8, 10, 11, -73, -8, -5, -73, 9, -4, 10, 7, 6, 5, 10, -4, 5, 3, 18, -22, -1, 17, 18, -16, 3, 17, 14, 13, 12, 17, 3};
    }

    static {
        A04();
        A01 = new ConcurrentHashMap();
        A00 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
        A03 = false;
    }

    public static long A00(String str, EnumC3407Jg enumC3407Jg) {
        if (A01.containsKey(str)) {
            return A01.get(str).longValue();
        }
        switch (C3426Jz.A00[enumC3407Jg.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return 15000L;
            default:
                return -1000L;
        }
    }

    public static String A02(C3428K1 c3428k1) {
        AbstractC3416Jp.A05(A01(44, 15, 94), A01(22, 22, 87), A01(14, 8, 116));
        return A02.get(A03(c3428k1));
    }

    public static String A03(C3428K1 c3428k1) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = c3428k1.A08();
        objArr[1] = c3428k1.A06();
        objArr[2] = Integer.valueOf(c3428k1.A07() == null ? 0 : c3428k1.A07().A00());
        objArr[3] = Integer.valueOf(c3428k1.A07() != null ? c3428k1.A07().A01() : 0);
        objArr[4] = Integer.valueOf(c3428k1.A04());
        return String.format(locale, A01(0, 14, 120), objArr);
    }

    public static void A05(long j10, C3428K1 c3428k1) {
        A01.put(A03(c3428k1), Long.valueOf(j10));
    }

    public static void A06(C3428K1 c3428k1) {
        A00.put(A03(c3428k1), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A07(String str, C3428K1 c3428k1) {
        A02.put(A03(c3428k1), str);
    }

    public static boolean A08(C3428K1 c3428k1) {
        if (A03) {
            return false;
        }
        String A032 = A03(c3428k1);
        if (!A00.containsKey(A032)) {
            return false;
        }
        Long l10 = A00.get(A032);
        if (A05[3].charAt(17) != 'M') {
            throw new RuntimeException();
        }
        A05[6] = "HNdF4hlEpt9Mz";
        return System.currentTimeMillis() - l10.longValue() < A00(A032, c3428k1.A06());
    }
}
