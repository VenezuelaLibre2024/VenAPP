package p396v6;

import com.google.android.libraries.barhopper.RecognitionOptions;
import p361t6.C11005b3;
import p363t8.C11144d0;
import p363t8.C11173s;

/* renamed from: v6.a */
/* loaded from: classes.dex */
public final class C11631a {

    /* renamed from: a */
    private static final int[] f30262a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b */
    private static final int[] f30263b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: v6.a$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public final int f30264a;

        /* renamed from: b */
        public final int f30265b;

        /* renamed from: c */
        public final String f30266c;

        private b(int i10, int i11, String str) {
            this.f30264a = i10;
            this.f30265b = i11;
            this.f30266c = str;
        }
    }

    /* renamed from: a */
    public static byte[] m36457a(int i10, int i11) {
        int i12 = 0;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            int[] iArr = f30262a;
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
            int[] iArr2 = f30263b;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return m36458b(2, i13, i15);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i10 + ", " + i11);
    }

    /* renamed from: b */
    public static byte[] m36458b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & RecognitionOptions.ITF) | ((i12 << 3) & 120))};
    }

    /* renamed from: c */
    private static int m36459c(C11144d0 c11144d0) {
        int m34632h = c11144d0.m34632h(5);
        return m34632h == 31 ? c11144d0.m34632h(6) + 32 : m34632h;
    }

    /* renamed from: d */
    private static int m36460d(C11144d0 c11144d0) {
        int m34632h = c11144d0.m34632h(4);
        if (m34632h == 15) {
            if (c11144d0.m34626b() >= 24) {
                return c11144d0.m34632h(24);
            }
            throw C11005b3.m33715a("AAC header insufficient data", null);
        }
        if (m34632h < 13) {
            return f30262a[m34632h];
        }
        throw C11005b3.m33715a("AAC header wrong Sampling Frequency Index", null);
    }

    /* renamed from: e */
    public static b m36461e(C11144d0 c11144d0, boolean z10) {
        int m36459c = m36459c(c11144d0);
        int m36460d = m36460d(c11144d0);
        int m34632h = c11144d0.m34632h(4);
        String str = "mp4a.40." + m36459c;
        if (m36459c == 5 || m36459c == 29) {
            m36460d = m36460d(c11144d0);
            m36459c = m36459c(c11144d0);
            if (m36459c == 22) {
                m34632h = c11144d0.m34632h(4);
            }
        }
        if (z10) {
            if (m36459c != 1 && m36459c != 2 && m36459c != 3 && m36459c != 4 && m36459c != 6 && m36459c != 7 && m36459c != 17) {
                switch (m36459c) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw C11005b3.m33719e("Unsupported audio object type: " + m36459c);
                }
            }
            m36463g(c11144d0, m36459c, m34632h);
            switch (m36459c) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int m34632h2 = c11144d0.m34632h(2);
                    if (m34632h2 == 2 || m34632h2 == 3) {
                        throw C11005b3.m33719e("Unsupported epConfig: " + m34632h2);
                    }
            }
        }
        int i10 = f30263b[m34632h];
        if (i10 != -1) {
            return new b(m36460d, i10, str);
        }
        throw C11005b3.m33715a(null, null);
    }

    /* renamed from: f */
    public static b m36462f(byte[] bArr) {
        return m36461e(new C11144d0(bArr), false);
    }

    /* renamed from: g */
    private static void m36463g(C11144d0 c11144d0, int i10, int i11) {
        if (c11144d0.m34631g()) {
            C11173s.m34970i("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (c11144d0.m34631g()) {
            c11144d0.m34642r(14);
        }
        boolean m34631g = c11144d0.m34631g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            c11144d0.m34642r(3);
        }
        if (m34631g) {
            if (i10 == 22) {
                c11144d0.m34642r(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                c11144d0.m34642r(3);
            }
            c11144d0.m34642r(1);
        }
    }
}
