package t8;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f26773a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    public static final float[] f26774b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* renamed from: c, reason: collision with root package name */
    private static final Object f26775c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static int[] f26776d = new int[10];

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f26777a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f26778b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26779c;

        /* renamed from: d, reason: collision with root package name */
        public final int f26780d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f26781e;

        /* renamed from: f, reason: collision with root package name */
        public final int f26782f;

        /* renamed from: g, reason: collision with root package name */
        public final int f26783g;

        /* renamed from: h, reason: collision with root package name */
        public final int f26784h;

        /* renamed from: i, reason: collision with root package name */
        public final int f26785i;

        /* renamed from: j, reason: collision with root package name */
        public final float f26786j;

        /* renamed from: k, reason: collision with root package name */
        public final int f26787k;

        /* renamed from: l, reason: collision with root package name */
        public final int f26788l;

        /* renamed from: m, reason: collision with root package name */
        public final int f26789m;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16, float f10, int i17, int i18, int i19) {
            this.f26777a = i10;
            this.f26778b = z10;
            this.f26779c = i11;
            this.f26780d = i12;
            this.f26781e = iArr;
            this.f26782f = i13;
            this.f26783g = i14;
            this.f26784h = i15;
            this.f26785i = i16;
            this.f26786j = f10;
            this.f26787k = i17;
            this.f26788l = i18;
            this.f26789m = i19;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f26790a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26791b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f26792c;

        public b(int i10, int i11, boolean z10) {
            this.f26790a = i10;
            this.f26791b = i11;
            this.f26792c = z10;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f26793a;

        /* renamed from: b, reason: collision with root package name */
        public final int f26794b;

        /* renamed from: c, reason: collision with root package name */
        public final int f26795c;

        /* renamed from: d, reason: collision with root package name */
        public final int f26796d;

        /* renamed from: e, reason: collision with root package name */
        public final int f26797e;

        /* renamed from: f, reason: collision with root package name */
        public final int f26798f;

        /* renamed from: g, reason: collision with root package name */
        public final int f26799g;

        /* renamed from: h, reason: collision with root package name */
        public final float f26800h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f26801i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f26802j;

        /* renamed from: k, reason: collision with root package name */
        public final int f26803k;

        /* renamed from: l, reason: collision with root package name */
        public final int f26804l;

        /* renamed from: m, reason: collision with root package name */
        public final int f26805m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f26806n;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10, boolean z10, boolean z11, int i17, int i18, int i19, boolean z12) {
            this.f26793a = i10;
            this.f26794b = i11;
            this.f26795c = i12;
            this.f26796d = i13;
            this.f26797e = i14;
            this.f26798f = i15;
            this.f26799g = i16;
            this.f26800h = f10;
            this.f26801i = z10;
            this.f26802j = z11;
            this.f26803k = i17;
            this.f26804l = i18;
            this.f26805m = i19;
            this.f26806n = z12;
        }
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void b(ByteBuffer byteBuffer) {
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

    public static int c(byte[] bArr, int i10, int i11, boolean[] zArr) {
        int i12 = i11 - i10;
        t8.a.g(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    a(zArr);
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

    private static int d(byte[] bArr, int i10, int i11) {
        while (i10 < i11 - 2) {
            if (bArr[i10] == 0 && bArr[i10 + 1] == 0 && bArr[i10 + 2] == 3) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static int e(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 126) >> 1;
    }

    public static int f(byte[] bArr, int i10) {
        return bArr[i10 + 3] & 31;
    }

    public static boolean g(String str, byte b10) {
        if ("video/avc".equals(str) && (b10 & 31) == 6) {
            return true;
        }
        return "video/hevc".equals(str) && ((b10 & 126) >> 1) == 39;
    }

    public static a h(byte[] bArr, int i10, int i11) {
        return i(bArr, i10 + 2, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static t8.x.a i(byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t8.x.i(byte[], int, int):t8.x$a");
    }

    public static b j(byte[] bArr, int i10, int i11) {
        return k(bArr, i10 + 1, i11);
    }

    public static b k(byte[] bArr, int i10, int i11) {
        f0 f0Var = new f0(bArr, i10, i11);
        int h10 = f0Var.h();
        int h11 = f0Var.h();
        f0Var.k();
        return new b(h10, h11, f0Var.d());
    }

    public static c l(byte[] bArr, int i10, int i11) {
        return m(bArr, i10 + 1, i11);
    }

    public static c m(byte[] bArr, int i10, int i11) {
        int h10;
        boolean d10;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        float f10;
        int i14;
        f0 f0Var = new f0(bArr, i10, i11);
        int e10 = f0Var.e(8);
        int e11 = f0Var.e(8);
        int e12 = f0Var.e(8);
        int h11 = f0Var.h();
        if (e10 == 100 || e10 == 110 || e10 == 122 || e10 == 244 || e10 == 44 || e10 == 83 || e10 == 86 || e10 == 118 || e10 == 128 || e10 == 138) {
            h10 = f0Var.h();
            d10 = h10 == 3 ? f0Var.d() : false;
            f0Var.h();
            f0Var.h();
            f0Var.k();
            if (f0Var.d()) {
                int i15 = h10 != 3 ? 8 : 12;
                int i16 = 0;
                while (i16 < i15) {
                    if (f0Var.d()) {
                        o(f0Var, i16 < 6 ? 16 : 64);
                    }
                    i16++;
                }
            }
        } else {
            h10 = 1;
            d10 = false;
        }
        int h12 = f0Var.h() + 4;
        int h13 = f0Var.h();
        if (h13 == 0) {
            i12 = h10;
            z10 = d10;
            i13 = f0Var.h() + 4;
            z11 = false;
        } else {
            if (h13 == 1) {
                boolean d11 = f0Var.d();
                f0Var.g();
                f0Var.g();
                z10 = d10;
                long h14 = f0Var.h();
                i12 = h10;
                for (int i17 = 0; i17 < h14; i17++) {
                    f0Var.h();
                }
                z11 = d11;
            } else {
                i12 = h10;
                z10 = d10;
                z11 = false;
            }
            i13 = 0;
        }
        int h15 = f0Var.h();
        f0Var.k();
        int h16 = f0Var.h() + 1;
        int h17 = f0Var.h() + 1;
        boolean d12 = f0Var.d();
        int i18 = (2 - (d12 ? 1 : 0)) * h17;
        if (!d12) {
            f0Var.k();
        }
        f0Var.k();
        int i19 = h16 * 16;
        int i20 = i18 * 16;
        if (f0Var.d()) {
            int h18 = f0Var.h();
            int h19 = f0Var.h();
            int h20 = f0Var.h();
            int h21 = f0Var.h();
            if (i12 == 0) {
                i14 = 2 - (d12 ? 1 : 0);
            } else {
                int i21 = i12;
                r9 = i21 == 3 ? 1 : 2;
                i14 = (2 - (d12 ? 1 : 0)) * (i21 == 1 ? 2 : 1);
            }
            i19 -= (h18 + h19) * r9;
            i20 -= (h20 + h21) * i14;
        }
        int i22 = i19;
        int i23 = i20;
        float f11 = 1.0f;
        if (f0Var.d() && f0Var.d()) {
            int e13 = f0Var.e(8);
            if (e13 == 255) {
                int e14 = f0Var.e(16);
                int e15 = f0Var.e(16);
                if (e14 != 0 && e15 != 0) {
                    f11 = e14 / e15;
                }
            } else {
                float[] fArr = f26774b;
                if (e13 < fArr.length) {
                    f10 = fArr[e13];
                    return new c(e10, e11, e12, h11, h15, i22, i23, f10, z10, d12, h12, h13, i13, z11);
                }
                s.i("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + e13);
            }
        }
        f10 = f11;
        return new c(e10, e11, e12, h11, h15, i22, i23, f10, z10, d12, h12, h13, i13, z11);
    }

    private static void n(f0 f0Var) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (f0Var.d()) {
                    int min = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        f0Var.g();
                    }
                    for (int i13 = 0; i13 < min; i13++) {
                        f0Var.g();
                    }
                } else {
                    f0Var.h();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void o(f0 f0Var, int i10) {
        int i11 = 8;
        int i12 = 8;
        for (int i13 = 0; i13 < i10; i13++) {
            if (i11 != 0) {
                i11 = ((f0Var.g() + i12) + RecognitionOptions.QR_CODE) % RecognitionOptions.QR_CODE;
            }
            if (i11 != 0) {
                i12 = i11;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void p(f0 f0Var) {
        int h10 = f0Var.h();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i10 = -1;
        int i11 = 0;
        int i12 = -1;
        while (i11 < h10) {
            if ((i11 != 0 && f0Var.d()) == true) {
                int i13 = i10 + i12;
                int h11 = (1 - ((f0Var.d() ? 1 : 0) * 2)) * (f0Var.h() + 1);
                int i14 = i13 + 1;
                boolean[] zArr = new boolean[i14];
                for (int i15 = 0; i15 <= i13; i15++) {
                    if (f0Var.d()) {
                        zArr[i15] = true;
                    } else {
                        zArr[i15] = f0Var.d();
                    }
                }
                int[] iArr3 = new int[i14];
                int[] iArr4 = new int[i14];
                int i16 = 0;
                for (int i17 = i12 - 1; i17 >= 0; i17--) {
                    int i18 = iArr2[i17] + h11;
                    if (i18 < 0 && zArr[i10 + i17]) {
                        iArr3[i16] = i18;
                        i16++;
                    }
                }
                if (h11 < 0 && zArr[i13]) {
                    iArr3[i16] = h11;
                    i16++;
                }
                for (int i19 = 0; i19 < i10; i19++) {
                    int i20 = iArr[i19] + h11;
                    if (i20 < 0 && zArr[i19]) {
                        iArr3[i16] = i20;
                        i16++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr3, i16);
                int i21 = 0;
                for (int i22 = i10 - 1; i22 >= 0; i22--) {
                    int i23 = iArr[i22] + h11;
                    if (i23 > 0 && zArr[i22]) {
                        iArr4[i21] = i23;
                        i21++;
                    }
                }
                if (h11 > 0 && zArr[i13]) {
                    iArr4[i21] = h11;
                    i21++;
                }
                for (int i24 = 0; i24 < i12; i24++) {
                    int i25 = iArr2[i24] + h11;
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
                int h12 = f0Var.h();
                int h13 = f0Var.h();
                int[] iArr5 = new int[h12];
                for (int i26 = 0; i26 < h12; i26++) {
                    iArr5[i26] = f0Var.h() + 1;
                    f0Var.k();
                }
                int[] iArr6 = new int[h13];
                for (int i27 = 0; i27 < h13; i27++) {
                    iArr6[i27] = f0Var.h() + 1;
                    f0Var.k();
                }
                i10 = h12;
                iArr = iArr5;
                i12 = h13;
                iArr2 = iArr6;
            }
            i11++;
        }
    }

    public static int q(byte[] bArr, int i10) {
        int i11;
        synchronized (f26775c) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < i10) {
                try {
                    i12 = d(bArr, i12, i10);
                    if (i12 < i10) {
                        int[] iArr = f26776d;
                        if (iArr.length <= i13) {
                            f26776d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f26776d[i13] = i12;
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
                int i17 = f26776d[i16] - i15;
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
