package p363t8;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: t8.x */
/* loaded from: classes.dex */
public final class C11179x {

    /* renamed from: a */
    public static final byte[] f29069a = {0, 0, 0, 1};

    /* renamed from: b */
    public static final float[] f29070b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c */
    private static final Object f29071c = new Object();

    /* renamed from: d */
    private static int[] f29072d = new int[10];

    /* renamed from: t8.x$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final int f29073a;

        /* renamed from: b */
        public final boolean f29074b;

        /* renamed from: c */
        public final int f29075c;

        /* renamed from: d */
        public final int f29076d;

        /* renamed from: e */
        public final int[] f29077e;

        /* renamed from: f */
        public final int f29078f;

        /* renamed from: g */
        public final int f29079g;

        /* renamed from: h */
        public final int f29080h;

        /* renamed from: i */
        public final int f29081i;

        /* renamed from: j */
        public final float f29082j;

        /* renamed from: k */
        public final int f29083k;

        /* renamed from: l */
        public final int f29084l;

        /* renamed from: m */
        public final int f29085m;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f10, int i17, int i18, int i19) {
            this.f29073a = i10;
            this.f29074b = z10;
            this.f29075c = i11;
            this.f29076d = i12;
            this.f29077e = iArr;
            this.f29078f = i13;
            this.f29079g = i14;
            this.f29080h = i15;
            this.f29081i = i16;
            this.f29082j = f10;
            this.f29083k = i17;
            this.f29084l = i18;
            this.f29085m = i19;
        }
    }

    /* renamed from: t8.x$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f29086a;

        /* renamed from: b */
        public final int f29087b;

        /* renamed from: c */
        public final boolean f29088c;

        public b(int i10, int i11, boolean z10) {
            this.f29086a = i10;
            this.f29087b = i11;
            this.f29088c = z10;
        }
    }

    /* renamed from: t8.x$c */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public final int f29089a;

        /* renamed from: b */
        public final int f29090b;

        /* renamed from: c */
        public final int f29091c;

        /* renamed from: d */
        public final int f29092d;

        /* renamed from: e */
        public final int f29093e;

        /* renamed from: f */
        public final int f29094f;

        /* renamed from: g */
        public final int f29095g;

        /* renamed from: h */
        public final float f29096h;

        /* renamed from: i */
        public final boolean f29097i;

        /* renamed from: j */
        public final boolean f29098j;

        /* renamed from: k */
        public final int f29099k;

        /* renamed from: l */
        public final int f29100l;

        /* renamed from: m */
        public final int f29101m;

        /* renamed from: n */
        public final boolean f29102n;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, boolean z10, boolean z11, int i17, int i18, int i19, boolean z12) {
            this.f29089a = i10;
            this.f29090b = i11;
            this.f29091c = i12;
            this.f29092d = i13;
            this.f29093e = i14;
            this.f29094f = i15;
            this.f29095g = i16;
            this.f29096h = f10;
            this.f29097i = z10;
            this.f29098j = z11;
            this.f29099k = i17;
            this.f29100l = i18;
            this.f29101m = i19;
            this.f29102n = z12;
        }
    }

    /* renamed from: a */
    public static void m35014a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* renamed from: b */
    public static void m35015b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int i12 = i10 + 1;
            if (i12 >= position) {
                byteBuffer.clear();
                return;
            }
            int i13 = byteBuffer.get(i10) & 255;
            if (i11 == 3) {
                if (i13 == 1 && (byteBuffer.get(i12) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(i10 - 3);
                    duplicate.limit(position);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i13 == 0) {
                i11++;
            }
            if (i13 != 0) {
                i11 = 0;
            }
            i10 = i12;
        }
    }

    /* renamed from: c */
    public static int m35016c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        C11137a.m34605g(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            m35014a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            m35014a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            m35014a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    m35014a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        zArr[0] = i12 <= 2 ? !(i12 != 2 ? !(zArr[1] && bArr[i13] == 1) : !(zArr[2] && bArr[i11 + (-2)] == 0 && bArr[i13] == 1)) : bArr[i11 + (-3)] == 0 && bArr[i11 + (-2)] == 0 && bArr[i13] == 1;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    /* renamed from: d */
    private static int m35017d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    /* renamed from: e */
    public static int m35018e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    /* renamed from: f */
    public static int m35019f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    /* renamed from: g */
    public static boolean m35020g(String str, byte b10) {
        if ("video/avc".equals(str) && (b10 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b10 & 126) >> 1) == 39;
    }

    /* renamed from: h */
    public static a m35021h(byte[] bArr, int i10, int i11) {
        return m35022i(bArr, i10 + 2, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b6  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static p363t8.C11179x.a m35022i(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p363t8.C11179x.m35022i(byte[], int, int):t8.x$a");
    }

    /* renamed from: j */
    public static b m35023j(byte[] bArr, int i10, int i11) {
        return m35024k(bArr, i10 + 1, i11);
    }

    /* renamed from: k */
    public static b m35024k(byte[] bArr, int i10, int i11) {
        C11148f0 c11148f0 = new C11148f0(bArr, i10, i11);
        int m34713h = c11148f0.m34713h();
        int m34713h2 = c11148f0.m34713h();
        c11148f0.m34715k();
        return new b(m34713h, m34713h2, c11148f0.m34710d());
    }

    /* renamed from: l */
    public static c m35025l(byte[] bArr, int i10, int i11) {
        return m35026m(bArr, i10 + 1, i11);
    }

    /* renamed from: m */
    public static c m35026m(byte[] bArr, int i10, int i11) {
        int m34713h;
        boolean m34710d;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        float f10;
        int i14;
        C11148f0 c11148f0 = new C11148f0(bArr, i10, i11);
        int m34711e = c11148f0.m34711e(8);
        int m34711e2 = c11148f0.m34711e(8);
        int m34711e3 = c11148f0.m34711e(8);
        int m34713h2 = c11148f0.m34713h();
        if (m34711e == 100 || m34711e == 110 || m34711e == 122 || m34711e == 244 || m34711e == 44 || m34711e == 83 || m34711e == 86 || m34711e == 118 || m34711e == 128 || m34711e == 138) {
            m34713h = c11148f0.m34713h();
            m34710d = m34713h == 3 ? c11148f0.m34710d() : false;
            c11148f0.m34713h();
            c11148f0.m34713h();
            c11148f0.m34715k();
            if (c11148f0.m34710d()) {
                int i15 = m34713h != 3 ? 8 : 12;
                int i16 = 0;
                while (i16 < i15) {
                    if (c11148f0.m34710d()) {
                        m35028o(c11148f0, i16 < 6 ? 16 : 64);
                    }
                    i16++;
                }
            }
        } else {
            m34713h = 1;
            m34710d = false;
        }
        int m34713h3 = c11148f0.m34713h() + 4;
        int m34713h4 = c11148f0.m34713h();
        if (m34713h4 == 0) {
            i12 = m34713h;
            z10 = m34710d;
            i13 = c11148f0.m34713h() + 4;
            z11 = false;
        } else {
            if (m34713h4 == 1) {
                boolean m34710d2 = c11148f0.m34710d();
                c11148f0.m34712g();
                c11148f0.m34712g();
                z10 = m34710d;
                long m34713h5 = c11148f0.m34713h();
                i12 = m34713h;
                for (int i17 = 0; i17 < m34713h5; i17++) {
                    c11148f0.m34713h();
                }
                z11 = m34710d2;
            } else {
                i12 = m34713h;
                z10 = m34710d;
                z11 = false;
            }
            i13 = 0;
        }
        int m34713h6 = c11148f0.m34713h();
        c11148f0.m34715k();
        int m34713h7 = c11148f0.m34713h() + 1;
        int m34713h8 = c11148f0.m34713h() + 1;
        boolean m34710d3 = c11148f0.m34710d();
        int i18 = (2 - (m34710d3 ? 1 : 0)) * m34713h8;
        if (!m34710d3) {
            c11148f0.m34715k();
        }
        c11148f0.m34715k();
        int i19 = m34713h7 * 16;
        int i20 = i18 * 16;
        if (c11148f0.m34710d()) {
            int m34713h9 = c11148f0.m34713h();
            int m34713h10 = c11148f0.m34713h();
            int m34713h11 = c11148f0.m34713h();
            int m34713h12 = c11148f0.m34713h();
            if (i12 == 0) {
                i14 = 2 - (m34710d3 ? 1 : 0);
            } else {
                int i21 = i12;
                r9 = i21 == 3 ? 1 : 2;
                i14 = (2 - (m34710d3 ? 1 : 0)) * (i21 == 1 ? 2 : 1);
            }
            i19 -= (m34713h9 + m34713h10) * r9;
            i20 -= (m34713h11 + m34713h12) * i14;
        }
        int i22 = i19;
        int i23 = i20;
        float f11 = 1.0f;
        if (c11148f0.m34710d() && c11148f0.m34710d()) {
            int m34711e4 = c11148f0.m34711e(8);
            if (m34711e4 == 255) {
                int m34711e5 = c11148f0.m34711e(16);
                int m34711e6 = c11148f0.m34711e(16);
                if (m34711e5 != 0 && m34711e6 != 0) {
                    f11 = m34711e5 / m34711e6;
                }
            } else {
                float[] fArr = f29070b;
                if (m34711e4 < fArr.length) {
                    f10 = fArr[m34711e4];
                    return new c(m34711e, m34711e2, m34711e3, m34713h2, m34713h6, i22, i23, f10, z10, m34710d3, m34713h3, m34713h4, i13, z11);
                }
                C11173s.m34970i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + m34711e4);
            }
        }
        f10 = f11;
        return new c(m34711e, m34711e2, m34711e3, m34713h2, m34713h6, i22, i23, f10, z10, m34710d3, m34713h3, m34713h4, i13, z11);
    }

    /* renamed from: n */
    private static void m35027n(C11148f0 c11148f0) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (c11148f0.m34710d()) {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        c11148f0.m34712g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        c11148f0.m34712g();
                    }
                } else {
                    c11148f0.m34713h();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    /* renamed from: o */
    private static void m35028o(C11148f0 c11148f0, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((c11148f0.m34712g() + i12) + RecognitionOptions.QR_CODE) % RecognitionOptions.QR_CODE;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: p */
    private static void m35029p(C11148f0 c11148f0) {
        int m34713h = c11148f0.m34713h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i10 = -1;
        int i11 = 0;
        int i12 = -1;
        while (i11 < m34713h) {
            if ((i11 != 0 && c11148f0.m34710d()) == true) {
                int i13 = i10 + i12;
                int m34713h2 = (1 - ((c11148f0.m34710d() ? 1 : 0) * 2)) * (c11148f0.m34713h() + 1);
                int i14 = i13 + 1;
                boolean[] zArr = new boolean[i14];
                for (int i15 = 0; i15 <= i13; i15++) {
                    if (c11148f0.m34710d()) {
                        zArr[i15] = true;
                    } else {
                        zArr[i15] = c11148f0.m34710d();
                    }
                }
                int[] iArr3 = new int[i14];
                int[] iArr4 = new int[i14];
                int i16 = 0;
                for (int i17 = i12 - 1; i17 >= 0; i17--) {
                    int i18 = iArr2[i17] + m34713h2;
                    if (i18 < 0 && zArr[i10 + i17]) {
                        iArr3[i16] = i18;
                        i16++;
                    }
                }
                if (m34713h2 < 0 && zArr[i13]) {
                    iArr3[i16] = m34713h2;
                    i16++;
                }
                for (int i19 = 0; i19 < i10; i19++) {
                    int i20 = iArr[i19] + m34713h2;
                    if (i20 < 0 && zArr[i19]) {
                        iArr3[i16] = i20;
                        i16++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr3, i16);
                int i21 = 0;
                for (int i22 = i10 - 1; i22 >= 0; i22--) {
                    int i23 = iArr[i22] + m34713h2;
                    if (i23 > 0 && zArr[i22]) {
                        iArr4[i21] = i23;
                        i21++;
                    }
                }
                if (m34713h2 > 0 && zArr[i13]) {
                    iArr4[i21] = m34713h2;
                    i21++;
                }
                for (int i24 = 0; i24 < i12; i24++) {
                    int i25 = iArr2[i24] + m34713h2;
                    if (i25 > 0 && zArr[i10 + i24]) {
                        iArr4[i21] = i25;
                        i21++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr4, i21);
                iArr = copyOf;
                i10 = i16;
                i12 = i21;
            } else {
                int m34713h3 = c11148f0.m34713h();
                int m34713h4 = c11148f0.m34713h();
                int[] iArr5 = new int[m34713h3];
                for (int i26 = 0; i26 < m34713h3; i26++) {
                    iArr5[i26] = c11148f0.m34713h() + 1;
                    c11148f0.m34715k();
                }
                int[] iArr6 = new int[m34713h4];
                for (int i27 = 0; i27 < m34713h4; i27++) {
                    iArr6[i27] = c11148f0.m34713h() + 1;
                    c11148f0.m34715k();
                }
                i10 = m34713h3;
                iArr = iArr5;
                i12 = m34713h4;
                iArr2 = iArr6;
            }
            i11++;
        }
    }

    /* renamed from: q */
    public static int m35030q(byte[] bArr, int i10) {
        int i11;
        synchronized (f29071c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = m35017d(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = f29072d;
                        if (iArr.length <= i13) {
                            f29072d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f29072d[i13] = i12;
                        i12 += 3;
                        i13++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f29072d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
