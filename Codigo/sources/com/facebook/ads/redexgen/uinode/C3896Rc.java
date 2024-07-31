package com.facebook.ads.redexgen.uinode;

import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Rc */
/* loaded from: assets/audience_network.dex */
public final class C3896Rc {
    public static InterfaceC3876RI A00;
    public static byte[] A01;
    public static String[] A02 = {"b", "jWWIi2TrnHAAyoG5itvaKpzBpE6rwsKb", "4piz2zd6PBPCOA5LKuru6huyc0Gk9hmI", "ThWxRwfxtMClt6xxWNEGrvPqHoOGiBgN", "VC0ltrZe3ujZ5yBmE9F34w5pTHRf8GMT", "g0Z7XyqsbnnTrD4DkPgr08gcmreNHhpx", "VVYGWntGozQ2sTcwE1XxLnyTeGzWkyyX", "XVqTwdXEkxL4UUDwn3dakWK60VTsxJd5"};
    public static final Set<String> A03;
    public static final Set<String> A04;
    public static final AtomicBoolean A05;

    public static String A05(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{36, 101, 110, 8, 85, 68, 11, 77, 77, 2, Byte.MAX_VALUE, 10, 123, 99, 73, 104, 8, 85, 98, 15, 86, 84, 94, 81, 8, 82, 77, 74, 8, 111, 85, 73, 81, 7, 48, Byte.MAX_VALUE, 32, 7, 58, 38, 2, 63, 42, 33, 62, 34, 103, 27, 33, 42, 8, 36, 58, 62, 126, 37, 26, 36, 99, 53, 30, 63, 113, 70, 13, Byte.MAX_VALUE, 119, 30, 59, 10, 123, 54, 3, 12, 43, 35, 38, 123, 61, 63, 59, 54, 62, 14, 10, 44, 53, 23, 0, 42, 14, 114, 69, 107, 64, 81, 82, 74, 87, 78, 76, 75, 66, 5, 71, 64, 67, 74, 87, 64, 5, 76, 75, 76, 81, 4, 113, 115, 113, 96, 31, 72, 71, 115, 75, 77, 98, 79, 2, 93, 72, 124, 123, 77, 71, 80, 124, 97, 28, 64, 89, 78, 100, 20, 35, 54, 62, 37, 39, 59, 54, 57, 50, 8, 58, 56, 51, 50, 8, 56, 57, 7, 12, 29, 30, 6, 27, 2, 19, 8, 61, 85, 32, 53, 9, 53, 13, 36, 94, 55, 82, 49, 49, 50, 3, 36, 23, 40, 21, 33, 47, 95, 11, 1, 54, 90, 109};
    }

    static {
        A07();
        HashSet hashSet = new HashSet();
        A03 = hashSet;
        HashSet hashSet2 = new HashSet();
        A04 = hashSet2;
        hashSet.add(A05(6, 29, 2));
        hashSet2.add(A05(168, 29, 95));
        hashSet2.add(A05(35, 29, 116));
        hashSet2.add(A05(64, 29, 119));
        hashSet2.add(A05(116, 29, 17));
        A05 = new AtomicBoolean();
    }

    public static InterfaceC3878RK A00(C26937f c26937f) {
        return A03(true, c26937f);
    }

    public static InterfaceC3878RK A01(C26937f c26937f) {
        return A02(true, c26937f);
    }

    public static InterfaceC3878RK A02(boolean z10, C26937f c26937f) {
        C3882RO c3882ro = new C3882RO();
        C3885RR A042 = A04(c26937f);
        if (!A0B(c26937f)) {
            c3882ro.A02(A04);
            c3882ro.A01(A03);
        }
        if (C3486L0.A04()) {
            Map<String, String> A022 = C3486L0.A02();
            String[] strArr = A02;
            if (strArr[2].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "6CjO7LbqJIONUadrRHmx0RuGBypxStir";
            strArr2[3] = "VKsjD9ddp6JrHwn0FL0Df9QGs7RhJ4JT";
            A042.A08(A022);
        }
        C3420Jt A002 = AbstractC3880RM.A00();
        C3882RO networkModuleConfigurationBuilder = c3882ro.A00(A042.A09());
        return A002.A00(networkModuleConfigurationBuilder.A03(z10).A04(c26937f.A04().A8z()).A05(), c26937f.A07(), ExecutorC3541Lt.A01());
    }

    public static InterfaceC3878RK A03(boolean z10, C26937f c26937f) {
        return AbstractC3880RM.A00().A00(new C3882RO().A03(z10).A00(A04(c26937f).A09()).A04(c26937f.A04().A8z()).A05(), c26937f.A07(), ExecutorC3541Lt.A01());
    }

    public static C3885RR A04(C26937f c26937f) {
        A08(c26937f);
        C3885RR c3885rr = new C3885RR();
        if (A0B(c26937f) || C3486L0.A04()) {
            c3885rr.A02(360000).A04(120000);
        } else {
            c3885rr.A02(C3348Ih.A08(c26937f)).A04(C3348Ih.A0A(c26937f));
        }
        c3885rr.A03(C3348Ih.A09(c26937f)).A05(C3348Ih.A0B(c26937f)).A06(C3348Ih.A0C(c26937f));
        synchronized (C3896Rc.class) {
            InterfaceC3876RI interfaceC3876RI = A00;
            if (interfaceC3876RI != null && (interfaceC3876RI instanceof InterfaceC3876RI)) {
                c3885rr.A07(interfaceC3876RI);
            }
        }
        return c3885rr;
    }

    public static void A06() {
        A05.set(true);
    }

    public static void A08(C26937f c26937f) {
        if (!A05.get()) {
            c26937f.A07().A9a(A05(161, 7, 81), AbstractC27248A.A21, new C27258B(A05(93, 23, 29)));
        }
    }

    public static synchronized void A09(InterfaceC3876RI interfaceC3876RI) {
        synchronized (C3896Rc.class) {
            A00 = interfaceC3876RI;
        }
    }

    public static boolean A0A(C26937f c26937f) {
        int i10 = Build.VERSION.SDK_INT;
        String A052 = A05(145, 16, 111);
        if (i10 < 17) {
            return Settings.System.getInt(c26937f.getContentResolver(), A052, 0) != 0;
        }
        int i11 = Settings.Global.getInt(c26937f.getContentResolver(), A052, 0);
        if (A02[0].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "6SlcDzdssqL5L6jmaJN4q0YtRJ9ZiIN0";
        strArr[1] = "IhCDgNyX5tEXKuNPsF1SGphg5lyX1n5g";
        return i11 != 0;
    }

    public static boolean A0B(C26937f c26937f) {
        String A8F = c26937f.A04().A8F();
        if (!TextUtils.isEmpty(A8F)) {
            String urlPrefix = A05(3, 3, 30);
            if (!A8F.endsWith(urlPrefix)) {
                String urlPrefix2 = A05(0, 3, 50);
                if (A8F.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}