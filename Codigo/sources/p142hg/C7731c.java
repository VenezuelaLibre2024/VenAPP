package p142hg;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kg.C9263a;
import kg.C9264b;
import mg.C9580a;
import mg.C9583d;

/* renamed from: hg.c */
/* loaded from: classes2.dex */
public final class C7731c {

    /* renamed from: a */
    private static final int[] f18416a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    /* renamed from: a */
    private static int[] m23578a(C9263a c9263a, int i10, int i11) {
        int[] iArr = new int[i11];
        int m27590l = c9263a.m27590l() / i10;
        for (int i12 = 0; i12 < m27590l; i12++) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                i13 |= c9263a.m27586h((i12 * i10) + i14) ? 1 << ((i10 - i14) - 1) : 0;
            }
            iArr[i12] = i13;
        }
        return iArr;
    }

    /* renamed from: b */
    private static void m23579b(C9264b c9264b, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 2) {
            int i13 = i10 - i12;
            int i14 = i13;
            while (true) {
                int i15 = i10 + i12;
                if (i14 <= i15) {
                    c9264b.m27612r(i14, i13);
                    c9264b.m27612r(i14, i15);
                    c9264b.m27612r(i13, i14);
                    c9264b.m27612r(i15, i14);
                    i14++;
                }
            }
        }
        int i16 = i10 - i11;
        c9264b.m27612r(i16, i16);
        int i17 = i16 + 1;
        c9264b.m27612r(i17, i16);
        c9264b.m27612r(i16, i17);
        int i18 = i10 + i11;
        c9264b.m27612r(i18, i16);
        c9264b.m27612r(i18, i17);
        c9264b.m27612r(i18, i18 - 1);
    }

    /* renamed from: c */
    private static void m23580c(C9264b c9264b, boolean z10, int i10, C9263a c9263a) {
        int i11 = i10 / 2;
        int i12 = 0;
        if (z10) {
            while (i12 < 7) {
                int i13 = (i11 - 3) + i12;
                if (c9263a.m27586h(i12)) {
                    c9264b.m27612r(i13, i11 - 5);
                }
                if (c9263a.m27586h(i12 + 7)) {
                    c9264b.m27612r(i11 + 5, i13);
                }
                if (c9263a.m27586h(20 - i12)) {
                    c9264b.m27612r(i13, i11 + 5);
                }
                if (c9263a.m27586h(27 - i12)) {
                    c9264b.m27612r(i11 - 5, i13);
                }
                i12++;
            }
            return;
        }
        while (i12 < 10) {
            int i14 = (i11 - 5) + i12 + (i12 / 5);
            if (c9263a.m27586h(i12)) {
                c9264b.m27612r(i14, i11 - 7);
            }
            if (c9263a.m27586h(i12 + 10)) {
                c9264b.m27612r(i11 + 7, i14);
            }
            if (c9263a.m27586h(29 - i12)) {
                c9264b.m27612r(i14, i11 + 7);
            }
            if (c9263a.m27586h(39 - i12)) {
                c9264b.m27612r(i11 - 7, i14);
            }
            i12++;
        }
    }

    /* renamed from: d */
    public static C7729a m23581d(String str, int i10, int i11, Charset charset) {
        return m23582e(str.getBytes(charset != null ? charset : StandardCharsets.ISO_8859_1), i10, i11, charset);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public static C7729a m23582e(byte[] bArr, int i10, int i11, Charset charset) {
        C9263a c9263a;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        C9263a m23593a = new C7732d(bArr, charset).m23593a();
        int m27590l = ((m23593a.m27590l() * i10) / 100) + 11;
        int m27590l2 = m23593a.m27590l() + m27590l;
        int i16 = 4;
        int i17 = 0;
        int i18 = 1;
        if (i11 == 0) {
            C9263a c9263a2 = null;
            int i19 = 0;
            int i20 = 0;
            while (i19 <= 32) {
                boolean z11 = i19 <= 3 ? i18 : i17;
                int i21 = z11 != 0 ? i19 + 1 : i19;
                int m23587j = m23587j(i21, z11);
                if (m27590l2 <= m23587j) {
                    if (c9263a2 == null || i20 != f18416a[i21]) {
                        int i22 = f18416a[i21];
                        i20 = i22;
                        c9263a2 = m23586i(m23593a, i22);
                    }
                    int i23 = m23587j - (m23587j % i20);
                    if ((z11 == 0 || c9263a2.m27590l() <= i20 * 64) && c9263a2.m27590l() + m27590l <= i23) {
                        c9263a = c9263a2;
                        i12 = i20;
                        z10 = z11;
                        i13 = i21;
                        i14 = m23587j;
                    }
                }
                i19++;
                i18 = i18;
                i16 = 4;
                i17 = 0;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z10 = i11 < 0;
        i13 = Math.abs(i11);
        if (i13 > (z10 ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i11)));
        }
        i14 = m23587j(i13, z10);
        i12 = f18416a[i13];
        int i24 = i14 - (i14 % i12);
        c9263a = m23586i(m23593a, i12);
        if (c9263a.m27590l() + m27590l > i24) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z10 && c9263a.m27590l() > i12 * 64) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        C9263a m23583f = m23583f(c9263a, i14, i12);
        int m27590l3 = c9263a.m27590l() / i12;
        C9263a m23584g = m23584g(z10, i13, m27590l3);
        int i25 = (z10 ? 11 : 14) + (i13 * 4);
        int[] iArr = new int[i25];
        int i26 = 2;
        if (z10) {
            for (int i27 = i17; i27 < i25; i27++) {
                iArr[i27] = i27;
            }
            i15 = i25;
        } else {
            int i28 = i25 / 2;
            i15 = i25 + 1 + (((i28 - 1) / 15) * 2);
            int i29 = i15 / 2;
            for (int i30 = i17; i30 < i28; i30++) {
                iArr[(i28 - i30) - 1] = (i29 - r15) - 1;
                iArr[i28 + i30] = (i30 / 15) + i30 + i29 + i18;
            }
        }
        C9264b c9264b = new C9264b(i15);
        int i31 = i17;
        int i32 = i31;
        while (i31 < i13) {
            int i33 = ((i13 - i31) * i16) + (z10 ? 9 : 12);
            int i34 = i17;
            while (i34 < i33) {
                int i35 = i34 * 2;
                while (i17 < i26) {
                    if (m23583f.m27586h(i32 + i35 + i17)) {
                        int i36 = i31 * 2;
                        c9264b.m27612r(iArr[i36 + i17], iArr[i36 + i34]);
                    }
                    if (m23583f.m27586h((i33 * 2) + i32 + i35 + i17)) {
                        int i37 = i31 * 2;
                        c9264b.m27612r(iArr[i37 + i34], iArr[((i25 - 1) - i37) - i17]);
                    }
                    if (m23583f.m27586h((i33 * 4) + i32 + i35 + i17)) {
                        int i38 = (i25 - 1) - (i31 * 2);
                        c9264b.m27612r(iArr[i38 - i17], iArr[i38 - i34]);
                    }
                    if (m23583f.m27586h((i33 * 6) + i32 + i35 + i17)) {
                        int i39 = i31 * 2;
                        c9264b.m27612r(iArr[((i25 - 1) - i39) - i34], iArr[i39 + i17]);
                    }
                    i17++;
                    i26 = 2;
                }
                i34++;
                i17 = 0;
                i26 = 2;
            }
            i32 += i33 * 8;
            i31++;
            i16 = 4;
            i17 = 0;
            i26 = 2;
        }
        m23580c(c9264b, z10, i15, m23584g);
        int i40 = i15 / 2;
        if (z10) {
            m23579b(c9264b, i40, 5);
        } else {
            m23579b(c9264b, i40, 7);
            int i41 = 0;
            int i42 = 0;
            while (i42 < (i25 / 2) - 1) {
                for (int i43 = i40 & 1; i43 < i15; i43 += 2) {
                    int i44 = i40 - i41;
                    c9264b.m27612r(i44, i43);
                    int i45 = i40 + i41;
                    c9264b.m27612r(i45, i43);
                    c9264b.m27612r(i43, i44);
                    c9264b.m27612r(i43, i45);
                }
                i42 += 15;
                i41 += 16;
            }
        }
        C7729a c7729a = new C7729a();
        c7729a.m23573c(z10);
        c7729a.m23576f(i15);
        c7729a.m23574d(i13);
        c7729a.m23572b(m27590l3);
        c7729a.m23575e(c9264b);
        return c7729a;
    }

    /* renamed from: f */
    private static C9263a m23583f(C9263a c9263a, int i10, int i11) {
        int m27590l = c9263a.m27590l() / i11;
        C9583d c9583d = new C9583d(m23585h(i11));
        int i12 = i10 / i11;
        int[] m23578a = m23578a(c9263a, i11, i12);
        c9583d.m28556b(m23578a, i12 - m27590l);
        C9263a c9263a2 = new C9263a();
        c9263a2.m27583c(0, i10 % i11);
        for (int i13 : m23578a) {
            c9263a2.m27583c(i13, i11);
        }
        return c9263a2;
    }

    /* renamed from: g */
    static C9263a m23584g(boolean z10, int i10, int i11) {
        int i12;
        C9263a c9263a = new C9263a();
        int i13 = i10 - 1;
        if (z10) {
            c9263a.m27583c(i13, 2);
            c9263a.m27583c(i11 - 1, 6);
            i12 = 28;
        } else {
            c9263a.m27583c(i13, 5);
            c9263a.m27583c(i11 - 1, 11);
            i12 = 40;
        }
        return m23583f(c9263a, i12, 4);
    }

    /* renamed from: h */
    private static C9580a m23585h(int i10) {
        if (i10 == 4) {
            return C9580a.f23343k;
        }
        if (i10 == 6) {
            return C9580a.f23342j;
        }
        if (i10 == 8) {
            return C9580a.f23346n;
        }
        if (i10 == 10) {
            return C9580a.f23341i;
        }
        if (i10 == 12) {
            return C9580a.f23340h;
        }
        throw new IllegalArgumentException("Unsupported word size " + i10);
    }

    /* renamed from: i */
    static C9263a m23586i(C9263a c9263a, int i10) {
        C9263a c9263a2 = new C9263a();
        int m27590l = c9263a.m27590l();
        int i11 = (1 << i10) - 2;
        int i12 = 0;
        while (i12 < m27590l) {
            int i13 = 0;
            for (int i14 = 0; i14 < i10; i14++) {
                int i15 = i12 + i14;
                if (i15 >= m27590l || c9263a.m27586h(i15)) {
                    i13 |= 1 << ((i10 - 1) - i14);
                }
            }
            int i16 = i13 & i11;
            if (i16 != i11) {
                if (i16 == 0) {
                    i16 = i13 | 1;
                } else {
                    c9263a2.m27583c(i13, i10);
                    i12 += i10;
                }
            }
            c9263a2.m27583c(i16, i10);
            i12--;
            i12 += i10;
        }
        return c9263a2;
    }

    /* renamed from: j */
    private static int m23587j(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 * 16)) * i10;
    }
}
