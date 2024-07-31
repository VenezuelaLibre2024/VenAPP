package v6;

import com.google.android.libraries.barhopper.RecognitionOptions;
import t6.b3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f27938a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f27939b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f27940a;

        /* renamed from: b, reason: collision with root package name */
        public final int f27941b;

        /* renamed from: c, reason: collision with root package name */
        public final String f27942c;

        private b(int i10, int i11, String str) {
            this.f27940a = i10;
            this.f27941b = i11;
            this.f27942c = str;
        }
    }

    public static byte[] a(int i10, int i11) {
        int i12 = 0;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            int[] iArr = f27938a;
            if (i14 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i14]) {
                i13 = i14;
            }
            i14++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = f27939b;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return b(2, i13, i15);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i10 + ", " + i11);
    }

    public static byte[] b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & RecognitionOptions.ITF) | ((i12 << 3) & 120))};
    }

    private static int c(t8.d0 d0Var) {
        int h10 = d0Var.h(5);
        return h10 == 31 ? d0Var.h(6) + 32 : h10;
    }

    private static int d(t8.d0 d0Var) {
        int h10 = d0Var.h(4);
        if (h10 == 15) {
            if (d0Var.b() >= 24) {
                return d0Var.h(24);
            }
            throw b3.a("AAC header insufficient data", null);
        }
        if (h10 < 13) {
            return f27938a[h10];
        }
        throw b3.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b e(t8.d0 d0Var, boolean z10) {
        int c10 = c(d0Var);
        int d10 = d(d0Var);
        int h10 = d0Var.h(4);
        String str = "mp4a.40." + c10;
        if (c10 == 5 || c10 == 29) {
            d10 = d(d0Var);
            c10 = c(d0Var);
            if (c10 == 22) {
                h10 = d0Var.h(4);
            }
        }
        if (z10) {
            if (c10 != 1 && c10 != 2 && c10 != 3 && c10 != 4 && c10 != 6 && c10 != 7 && c10 != 17) {
                switch (c10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw b3.e("Unsupported audio object type: " + c10);
                }
            }
            g(d0Var, c10, h10);
            switch (c10) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int h11 = d0Var.h(2);
                    if (h11 == 2 || h11 == 3) {
                        throw b3.e("Unsupported epConfig: " + h11);
                    }
            }
        }
        int i10 = f27939b[h10];
        if (i10 != -1) {
            return new b(d10, i10, str);
        }
        throw b3.a(null, null);
    }

    public static b f(byte[] bArr) {
        return e(new t8.d0(bArr), false);
    }

    private static void g(t8.d0 d0Var, int i10, int i11) {
        if (d0Var.g()) {
            t8.s.i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (d0Var.g()) {
            d0Var.r(14);
        }
        boolean g10 = d0Var.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            d0Var.r(3);
        }
        if (g10) {
            if (i10 == 22) {
                d0Var.r(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                d0Var.r(3);
            }
            d0Var.r(1);
        }
    }
}
