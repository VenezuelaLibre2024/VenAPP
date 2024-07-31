package androidx.core.util;

import java.io.PrintWriter;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f3874a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static char[] f3875b = new char[24];

    private static int a(int i10, int i11, boolean z10, int i12) {
        if (i10 > 99 || (z10 && i12 >= 3)) {
            return i11 + 3;
        }
        if (i10 > 9 || (z10 && i12 >= 2)) {
            return i11 + 2;
        }
        if (z10 || i10 > 0) {
            return i11 + 1;
        }
        return 0;
    }

    public static void b(long j10, long j11, PrintWriter printWriter) {
        if (j10 == 0) {
            printWriter.print("--");
        } else {
            d(j10 - j11, printWriter, 0);
        }
    }

    public static void c(long j10, PrintWriter printWriter) {
        d(j10, printWriter, 0);
    }

    public static void d(long j10, PrintWriter printWriter, int i10) {
        synchronized (f3874a) {
            printWriter.print(new String(f3875b, 0, f(j10, i10)));
        }
    }

    public static void e(long j10, StringBuilder sb2) {
        synchronized (f3874a) {
            sb2.append(f3875b, 0, f(j10, 0));
        }
    }

    private static int f(long j10, int i10) {
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11 = j10;
        if (f3875b.length < i10) {
            f3875b = new char[i10];
        }
        char[] cArr = f3875b;
        if (j11 == 0) {
            int i16 = i10 - 1;
            while (i16 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j11 > 0) {
            c10 = '+';
        } else {
            j11 = -j11;
            c10 = '-';
        }
        int i17 = (int) (j11 % 1000);
        int floor = (int) Math.floor(j11 / 1000);
        if (floor > 86400) {
            i11 = floor / 86400;
            floor -= 86400 * i11;
        } else {
            i11 = 0;
        }
        if (floor > 3600) {
            i12 = floor / 3600;
            floor -= i12 * 3600;
        } else {
            i12 = 0;
        }
        if (floor > 60) {
            int i18 = floor / 60;
            i13 = floor - (i18 * 60);
            i14 = i18;
        } else {
            i13 = floor;
            i14 = 0;
        }
        if (i10 != 0) {
            int a10 = a(i11, 1, false, 0);
            int a11 = a10 + a(i12, 1, a10 > 0, 2);
            int a12 = a11 + a(i14, 1, a11 > 0, 2);
            int a13 = a12 + a(i13, 1, a12 > 0, 2);
            i15 = 0;
            for (int a14 = a13 + a(i17, 2, true, a13 > 0 ? 3 : 0) + 1; a14 < i10; a14++) {
                cArr[i15] = ' ';
                i15++;
            }
        } else {
            i15 = 0;
        }
        cArr[i15] = c10;
        int i19 = i15 + 1;
        boolean z10 = i10 != 0;
        int g10 = g(cArr, i11, 'd', i19, false, 0);
        int g11 = g(cArr, i12, 'h', g10, g10 != i19, z10 ? 2 : 0);
        int g12 = g(cArr, i14, 'm', g11, g11 != i19, z10 ? 2 : 0);
        int g13 = g(cArr, i13, 's', g12, g12 != i19, z10 ? 2 : 0);
        int g14 = g(cArr, i17, 'm', g13, true, (!z10 || g13 == i19) ? 0 : 3);
        cArr[g14] = 's';
        return g14 + 1;
    }

    private static int g(char[] cArr, int i10, char c10, int i11, boolean z10, int i12) {
        int i13;
        if (!z10 && i10 <= 0) {
            return i11;
        }
        if ((!z10 || i12 < 3) && i10 <= 99) {
            i13 = i11;
        } else {
            int i14 = i10 / 100;
            cArr[i11] = (char) (i14 + 48);
            i13 = i11 + 1;
            i10 -= i14 * 100;
        }
        if ((z10 && i12 >= 2) || i10 > 9 || i11 != i13) {
            int i15 = i10 / 10;
            cArr[i13] = (char) (i15 + 48);
            i13++;
            i10 -= i15 * 10;
        }
        cArr[i13] = (char) (i10 + 48);
        int i16 = i13 + 1;
        cArr[i16] = c10;
        return i16 + 1;
    }
}