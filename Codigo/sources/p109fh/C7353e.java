package p109fh;

import com.google.android.libraries.barhopper.RecognitionOptions;
import kg.C9263a;
import p066dg.C6961v;
import p067dh.C6971j;
import p067dh.EnumC6967f;

/* renamed from: fh.e */
/* loaded from: classes2.dex */
final class C7353e {

    /* renamed from: a */
    private static final int[][] f16619a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f16620b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f16621c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, RecognitionOptions.ITF, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* renamed from: d */
    private static final int[][] f16622d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m22129a(C9263a c9263a, EnumC6967f enumC6967f, C6971j c6971j, int i10, C7350b c7350b) {
        m22131c(c7350b);
        m22132d(c6971j, c7350b);
        m22140l(enumC6967f, i10, c7350b);
        m22147s(c6971j, c7350b);
        m22134f(c9263a, i10, c7350b);
    }

    /* renamed from: b */
    static int m22130b(int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int m22142n = m22142n(i11);
        int i12 = i10 << (m22142n - 1);
        while (m22142n(i12) >= m22142n) {
            i12 ^= i11 << (m22142n(i12) - m22142n);
        }
        return i12;
    }

    /* renamed from: c */
    static void m22131c(C7350b c7350b) {
        c7350b.m22092a((byte) -1);
    }

    /* renamed from: d */
    static void m22132d(C6971j c6971j, C7350b c7350b) {
        m22138j(c7350b);
        m22133e(c7350b);
        m22146r(c6971j, c7350b);
        m22139k(c7350b);
    }

    /* renamed from: e */
    private static void m22133e(C7350b c7350b) {
        if (c7350b.m22093b(8, c7350b.m22095d() - 8) == 0) {
            throw new C6961v();
        }
        c7350b.m22097f(8, c7350b.m22095d() - 8, 1);
    }

    /* renamed from: f */
    static void m22134f(C9263a c9263a, int i10, C7350b c7350b) {
        boolean z10;
        int m22096e = c7350b.m22096e() - 1;
        int m22095d = c7350b.m22095d() - 1;
        int i11 = 0;
        int i12 = -1;
        while (m22096e > 0) {
            if (m22096e == 6) {
                m22096e--;
            }
            while (m22095d >= 0 && m22095d < c7350b.m22095d()) {
                for (int i13 = 0; i13 < 2; i13++) {
                    int i14 = m22096e - i13;
                    if (m22143o(c7350b.m22093b(i14, m22095d))) {
                        if (i11 < c9263a.m27590l()) {
                            z10 = c9263a.m27586h(i11);
                            i11++;
                        } else {
                            z10 = false;
                        }
                        if (i10 != -1 && C7352d.m22126f(i10, i14, m22095d)) {
                            z10 = !z10;
                        }
                        c7350b.m22098g(i14, m22095d, z10);
                    }
                }
                m22095d += i12;
            }
            i12 = -i12;
            m22095d += i12;
            m22096e -= 2;
        }
        if (i11 == c9263a.m27590l()) {
            return;
        }
        throw new C6961v("Not all bits consumed: " + i11 + '/' + c9263a.m27590l());
    }

    /* renamed from: g */
    private static void m22135g(int i10, int i11, C7350b c7350b) {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!m22143o(c7350b.m22093b(i13, i11))) {
                throw new C6961v();
            }
            c7350b.m22097f(i13, i11, 0);
        }
    }

    /* renamed from: h */
    private static void m22136h(int i10, int i11, C7350b c7350b) {
        for (int i12 = 0; i12 < 5; i12++) {
            int[] iArr = f16620b[i12];
            for (int i13 = 0; i13 < 5; i13++) {
                c7350b.m22097f(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    /* renamed from: i */
    private static void m22137i(int i10, int i11, C7350b c7350b) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f16619a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                c7350b.m22097f(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    /* renamed from: j */
    private static void m22138j(C7350b c7350b) {
        int length = f16619a[0].length;
        m22137i(0, 0, c7350b);
        m22137i(c7350b.m22096e() - length, 0, c7350b);
        m22137i(0, c7350b.m22096e() - length, c7350b);
        m22135g(0, 7, c7350b);
        m22135g(c7350b.m22096e() - 8, 7, c7350b);
        m22135g(0, c7350b.m22096e() - 8, c7350b);
        m22141m(7, 0, c7350b);
        m22141m((c7350b.m22095d() - 7) - 1, 0, c7350b);
        m22141m(7, c7350b.m22095d() - 7, c7350b);
    }

    /* renamed from: k */
    private static void m22139k(C7350b c7350b) {
        int i10 = 8;
        while (i10 < c7350b.m22096e() - 8) {
            int i11 = i10 + 1;
            int i12 = i11 % 2;
            if (m22143o(c7350b.m22093b(i10, 6))) {
                c7350b.m22097f(i10, 6, i12);
            }
            if (m22143o(c7350b.m22093b(6, i10))) {
                c7350b.m22097f(6, i10, i12);
            }
            i10 = i11;
        }
    }

    /* renamed from: l */
    static void m22140l(EnumC6967f enumC6967f, int i10, C7350b c7350b) {
        int m22095d;
        C9263a c9263a = new C9263a();
        m22144p(enumC6967f, i10, c9263a);
        for (int i11 = 0; i11 < c9263a.m27590l(); i11++) {
            boolean m27586h = c9263a.m27586h((c9263a.m27590l() - 1) - i11);
            int[] iArr = f16622d[i11];
            c7350b.m22098g(iArr[0], iArr[1], m27586h);
            int i12 = 8;
            if (i11 < 8) {
                m22095d = 8;
                i12 = (c7350b.m22096e() - i11) - 1;
            } else {
                m22095d = (c7350b.m22095d() - 7) + (i11 - 8);
            }
            c7350b.m22098g(i12, m22095d, m27586h);
        }
    }

    /* renamed from: m */
    private static void m22141m(int i10, int i11, C7350b c7350b) {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!m22143o(c7350b.m22093b(i10, i13))) {
                throw new C6961v();
            }
            c7350b.m22097f(i10, i13, 0);
        }
    }

    /* renamed from: n */
    static int m22142n(int i10) {
        return 32 - Integer.numberOfLeadingZeros(i10);
    }

    /* renamed from: o */
    private static boolean m22143o(int i10) {
        return i10 == -1;
    }

    /* renamed from: p */
    static void m22144p(EnumC6967f enumC6967f, int i10, C9263a c9263a) {
        if (!C7355g.m22182b(i10)) {
            throw new C6961v("Invalid mask pattern");
        }
        int m20146h = (enumC6967f.m20146h() << 3) | i10;
        c9263a.m27583c(m20146h, 5);
        c9263a.m27583c(m22130b(m20146h, 1335), 10);
        C9263a c9263a2 = new C9263a();
        c9263a2.m27583c(21522, 15);
        c9263a.m27597v(c9263a2);
        if (c9263a.m27590l() == 15) {
            return;
        }
        throw new C6961v("should not happen but we got: " + c9263a.m27590l());
    }

    /* renamed from: q */
    static void m22145q(C6971j c6971j, C9263a c9263a) {
        c9263a.m27583c(c6971j.m20165j(), 6);
        c9263a.m27583c(m22130b(c6971j.m20165j(), 7973), 12);
        if (c9263a.m27590l() == 18) {
            return;
        }
        throw new C6961v("should not happen but we got: " + c9263a.m27590l());
    }

    /* renamed from: r */
    private static void m22146r(C6971j c6971j, C7350b c7350b) {
        if (c6971j.m20165j() < 2) {
            return;
        }
        int[] iArr = f16621c[c6971j.m20165j() - 1];
        for (int i10 : iArr) {
            if (i10 >= 0) {
                for (int i11 : iArr) {
                    if (i11 >= 0 && m22143o(c7350b.m22093b(i11, i10))) {
                        m22136h(i11 - 2, i10 - 2, c7350b);
                    }
                }
            }
        }
    }

    /* renamed from: s */
    static void m22147s(C6971j c6971j, C7350b c7350b) {
        if (c6971j.m20165j() < 7) {
            return;
        }
        C9263a c9263a = new C9263a();
        m22145q(c6971j, c9263a);
        int i10 = 17;
        for (int i11 = 0; i11 < 6; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                boolean m27586h = c9263a.m27586h(i10);
                i10--;
                c7350b.m22098g(i11, (c7350b.m22095d() - 11) + i12, m27586h);
                c7350b.m22098g((c7350b.m22095d() - 11) + i12, i11, m27586h);
            }
        }
    }
}
