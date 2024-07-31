package androidx.core.util;

import java.io.PrintWriter;

/* renamed from: androidx.core.util.j */
/* loaded from: classes.dex */
public final class C0986j {

    /* renamed from: a */
    private static final Object f4546a = new Object();

    /* renamed from: b */
    private static char[] f4547b = new char[24];

    /* renamed from: a */
    private static int m4839a(int i10, int i11, boolean z10, int i12) {
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

    /* renamed from: b */
    public static void m4840b(long j10, long j11, PrintWriter printWriter) {
        if (j10 == 0) {
            printWriter.print("--");
        } else {
            m4842d(j10 - j11, printWriter, 0);
        }
    }

    /* renamed from: c */
    public static void m4841c(long j10, PrintWriter printWriter) {
        m4842d(j10, printWriter, 0);
    }

    /* renamed from: d */
    public static void m4842d(long j10, PrintWriter printWriter, int i10) {
        synchronized (f4546a) {
            printWriter.print(new String(f4547b, 0, m4844f(j10, i10)));
        }
    }

    /* renamed from: e */
    public static void m4843e(long j10, StringBuilder sb2) {
        synchronized (f4546a) {
            sb2.append(f4547b, 0, m4844f(j10, 0));
        }
    }

    /* renamed from: f */
    private static int m4844f(long j10, int i10) {
        char c10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j11 = j10;
        if (f4547b.length < i10) {
            f4547b = new char[i10];
        }
        char[] cArr = f4547b;
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
            int m4839a = m4839a(i11, 1, false, 0);
            int m4839a2 = m4839a + m4839a(i12, 1, m4839a > 0, 2);
            int m4839a3 = m4839a2 + m4839a(i14, 1, m4839a2 > 0, 2);
            int m4839a4 = m4839a3 + m4839a(i13, 1, m4839a3 > 0, 2);
            i15 = 0;
            for (int m4839a5 = m4839a4 + m4839a(i17, 2, true, m4839a4 > 0 ? 3 : 0) + 1; m4839a5 < i10; m4839a5++) {
                cArr[i15] = ' ';
                i15++;
            }
        } else {
            i15 = 0;
        }
        cArr[i15] = c10;
        int i19 = i15 + 1;
        boolean z10 = i10 != 0;
        int m4845g = m4845g(cArr, i11, 'd', i19, false, 0);
        int m4845g2 = m4845g(cArr, i12, 'h', m4845g, m4845g != i19, z10 ? 2 : 0);
        int m4845g3 = m4845g(cArr, i14, 'm', m4845g2, m4845g2 != i19, z10 ? 2 : 0);
        int m4845g4 = m4845g(cArr, i13, 's', m4845g3, m4845g3 != i19, z10 ? 2 : 0);
        int m4845g5 = m4845g(cArr, i17, 'm', m4845g4, true, (!z10 || m4845g4 == i19) ? 0 : 3);
        cArr[m4845g5] = 's';
        return m4845g5 + 1;
    }

    /* renamed from: g */
    private static int m4845g(char[] cArr, int i10, char c10, int i11, boolean z10, int i12) {
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
