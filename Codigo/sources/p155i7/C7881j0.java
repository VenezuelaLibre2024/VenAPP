package p155i7;

import p363t8.C11146e0;

/* renamed from: i7.j0 */
/* loaded from: classes.dex */
public final class C7881j0 {
    /* renamed from: a */
    public static int m24270a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] != 71) {
            i10++;
        }
        return i10;
    }

    /* renamed from: b */
    public static boolean m24271b(byte[] bArr, int i10, int i11, int i12) {
        int i13 = 0;
        for (int i14 = -4; i14 <= 4; i14++) {
            int i15 = (i14 * 188) + i12;
            if (i15 < i10 || i15 >= i11 || bArr[i15] != 71) {
                i13 = 0;
            } else {
                i13++;
                if (i13 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static long m24272c(C11146e0 c11146e0, int i10, int i11) {
        c11146e0.m34677U(i10);
        if (c11146e0.m34679a() < 5) {
            return -9223372036854775807L;
        }
        int m34692q = c11146e0.m34692q();
        if ((8388608 & m34692q) != 0 || ((2096896 & m34692q) >> 8) != i11) {
            return -9223372036854775807L;
        }
        if (((m34692q & 32) != 0) && c11146e0.m34664H() >= 7 && c11146e0.m34679a() >= 7) {
            if ((c11146e0.m34664H() & 16) == 16) {
                byte[] bArr = new byte[6];
                c11146e0.m34688l(bArr, 0, 6);
                return m24273d(bArr);
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: d */
    private static long m24273d(byte[] bArr) {
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((255 & bArr[4]) >> 7);
    }
}
