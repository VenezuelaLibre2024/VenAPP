package com.facebook.ads.redexgen.uinode;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class K9 {
    public static byte[] A00;
    public static String[] A01 = {"DRlsPwjpEwtNoZv5ySnxf", "lqEqsXUgP0JMZJfgrKxewN2wIWHzYKcc", "dBjDOWAGvP7mSKAaP52zl", "ype", "mP5mKraLiX8XnVkHST8LkS5AYOMnukgh", "WxiRHArz5NNbCsZRJT7jzOWIY3Iz", "jBZrwNF22PwjCa8Ii6ulb8rFZ5hC5AS6", "qRbUwr6kgq5VO8gbp3xyKAMHfEJZ"};
    public static final AtomicReference<String> A02;
    public static final AtomicReference<String> A03;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{118, 98, 123, 116, 126, 116, 120, 126, 116, 121, 125, 116, 116, 122, 116, 125, 124, 98, 47, 56, 42, 62, 72, 6, 3, 9, 16, 56, 11, 8, 0, 0, 14, 9, 0, 72, 12, 66, 71, 77, 84, 124, 80, 90, 77, 64, 17, 111, 46, 37, 52, 55, 47, 50, 43, 31, 33, 36, 51, 31, 35, 47, 45, 45, 47, 46, 88, 68, 68, 64, 67, 10, 31, 31, 87, 66, 81, 64, 88, 21, 67, 30, 86, 81, 83, 85, 82, 95, 95, 91, 30, 83, 95, 93, 4, 24, 24, 28, 31, 86, 67, 67, 27, 27, 27, 73, 31, 66, 10, 13, 15, 9, 14, 3, 3, 7, 66, 15, 3, 1, 83, 83, 83};
    }

    static {
        A09();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>();
    }

    public static String A01(C07277f c07277f) {
        return A05(c07277f) + A00(47, 19, 24);
    }

    public static String A02(C07277f c07277f) {
        String loggingEndpointPrefix = C0988Ih.A0T(c07277f);
        StringBuilder append = new StringBuilder().append(A07(c07277f, loggingEndpointPrefix));
        String loggingEndpointPrefix2 = A00(22, 14, 63);
        return append.append(loggingEndpointPrefix2).toString();
    }

    public static String A03(C07277f c07277f) {
        return A05(c07277f) + A00(1, 21, 21);
    }

    public static String A04(C07277f c07277f) {
        String syncEndpointPrefix = C0988Ih.A0U(c07277f);
        StringBuilder append = new StringBuilder().append(A07(c07277f, syncEndpointPrefix));
        String syncEndpointPrefix2 = A00(36, 11, 123);
        return append.append(syncEndpointPrefix2).toString();
    }

    public static String A05(C07277f c07277f) {
        String str = A02.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String urlOverride = A00(66, 28, 104);
        return A06(c07277f, urlOverride);
    }

    public static String A06(C07277f c07277f, String str) {
        String sb2;
        String A8F = c07277f.A04().A8F();
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        if (TextUtils.isEmpty(A8F)) {
            sb2 = A00(0, 0, 29);
        } else {
            StringBuilder sb3 = new StringBuilder();
            String prefix = A00(0, 1, 0);
            sb2 = sb3.append(prefix).append(A8F).toString();
        }
        objArr[0] = sb2;
        if (A01[4].charAt(27) == 'a') {
            throw new RuntimeException();
        }
        A01[1] = "Rtsd39h1DjNUt9rd7OM3RjcgvmtBKqBR";
        String prefix2 = String.format(locale, str, objArr);
        return prefix2;
    }

    public static String A07(C07277f c07277f, String str) {
        String str2 = A03.get();
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        String urlOverride = A00(94, 26, 52);
        return A08(A06(c07277f, urlOverride), str);
    }

    public static String A08(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str.replace(A00(120, 3, 124), str2);
    }
}
