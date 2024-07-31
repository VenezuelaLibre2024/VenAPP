package p468yg;

import java.lang.reflect.Array;
import p222lg.C9506a;
import p446xg.C12483a;

/* renamed from: yg.i */
/* loaded from: classes2.dex */
final class C12693i {

    /* renamed from: a */
    private static final float[][] f34408a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, C12483a.f33821b.length, 8);

    static {
        int i10;
        int i11 = 0;
        while (true) {
            int[] iArr = C12483a.f33821b;
            if (i11 >= iArr.length) {
                return;
            }
            int i12 = iArr[i11];
            int i13 = i12 & 1;
            int i14 = 0;
            while (i14 < 8) {
                float f10 = 0.0f;
                while (true) {
                    i10 = i12 & 1;
                    if (i10 == i13) {
                        f10 += 1.0f;
                        i12 >>= 1;
                    }
                }
                f34408a[i11][(8 - i14) - 1] = f10 / 17.0f;
                i14++;
                i13 = i10;
            }
            i11++;
        }
    }

    /* renamed from: a */
    private static int m41807a(int[] iArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            for (int i11 = 0; i11 < iArr[i10]; i11++) {
                int i12 = 1;
                long j11 = j10 << 1;
                if (i10 % 2 != 0) {
                    i12 = 0;
                }
                j10 = j11 | i12;
            }
        }
        return (int) j10;
    }

    /* renamed from: b */
    private static int m41808b(int[] iArr) {
        int m28274d = C9506a.m28274d(iArr);
        float[] fArr = new float[8];
        if (m28274d > 1) {
            for (int i10 = 0; i10 < 8; i10++) {
                fArr[i10] = iArr[i10] / m28274d;
            }
        }
        float f10 = Float.MAX_VALUE;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            float[][] fArr2 = f34408a;
            if (i12 >= fArr2.length) {
                return i11;
            }
            float[] fArr3 = fArr2[i12];
            float f11 = 0.0f;
            for (int i13 = 0; i13 < 8; i13++) {
                float f12 = fArr3[i13] - fArr[i13];
                f11 += f12 * f12;
                if (f11 >= f10) {
                    break;
                }
            }
            if (f11 < f10) {
                i11 = C12483a.f33821b[i12];
                f10 = f11;
            }
            i12++;
        }
    }

    /* renamed from: c */
    private static int m41809c(int[] iArr) {
        int m41807a = m41807a(iArr);
        if (C12483a.m40818a(m41807a) == -1) {
            return -1;
        }
        return m41807a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m41810d(int[] iArr) {
        int m41809c = m41809c(m41811e(iArr));
        return m41809c != -1 ? m41809c : m41808b(iArr);
    }

    /* renamed from: e */
    private static int[] m41811e(int[] iArr) {
        float m28274d = C9506a.m28274d(iArr);
        int[] iArr2 = new int[8];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 17; i12++) {
            float f10 = (m28274d / 34.0f) + ((i12 * m28274d) / 17.0f);
            int i13 = iArr[i11];
            if (i10 + i13 <= f10) {
                i10 += i13;
                i11++;
            }
            iArr2[i11] = iArr2[i11] + 1;
        }
        return iArr2;
    }
}
