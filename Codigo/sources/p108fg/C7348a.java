package p108fg;

import eg.C7186a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kg.C9264b;
import kg.C9267e;
import mg.C9580a;
import mg.C9582c;
import mg.C9584e;
import p066dg.C6947h;

/* renamed from: fg.a */
/* loaded from: classes2.dex */
public final class C7348a {

    /* renamed from: b */
    private static final String[] f16601b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c */
    private static final String[] f16602c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d */
    private static final String[] f16603d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e */
    private static final String[] f16604e = {"FLG(n)", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f */
    private static final String[] f16605f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: g */
    private static final Charset f16606g = StandardCharsets.ISO_8859_1;

    /* renamed from: a */
    private C7186a f16607a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fg.a$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16608a;

        static {
            int[] iArr = new int[c.values().length];
            f16608a = iArr;
            try {
                iArr[c.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16608a[c.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16608a[c.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16608a[c.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16608a[c.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fg.a$b */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a */
        private final boolean[] f16609a;

        /* renamed from: b */
        private final int f16610b;

        b(boolean[] zArr, int i10) {
            this.f16609a = zArr;
            this.f16610b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: fg.a$c */
    /* loaded from: classes2.dex */
    public enum c {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    /* renamed from: a */
    static byte[] m22078a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = m22084h(zArr, i10 * 8);
        }
        return bArr;
    }

    /* renamed from: b */
    private b m22079b(boolean[] zArr) {
        int i10;
        C9580a c9580a;
        if (this.f16607a.m21395d() <= 2) {
            c9580a = C9580a.f23342j;
            i10 = 6;
        } else {
            i10 = 8;
            if (this.f16607a.m21395d() <= 8) {
                c9580a = C9580a.f23346n;
            } else if (this.f16607a.m21395d() <= 22) {
                c9580a = C9580a.f23341i;
                i10 = 10;
            } else {
                c9580a = C9580a.f23340h;
                i10 = 12;
            }
        }
        int m21394c = this.f16607a.m21394c();
        int length = zArr.length / i10;
        if (length < m21394c) {
            throw C6947h.m20094a();
        }
        int length2 = zArr.length % i10;
        int[] iArr = new int[length];
        int i11 = 0;
        while (i11 < length) {
            iArr[i11] = m22085i(zArr, length2, i10);
            i11++;
            length2 += i10;
        }
        try {
            C9582c c9582c = new C9582c(c9580a);
            int i12 = length - m21394c;
            c9582c.m28554a(iArr, i12);
            int i13 = (1 << i10) - 1;
            int i14 = 0;
            for (int i15 = 0; i15 < m21394c; i15++) {
                int i16 = iArr[i15];
                if (i16 == 0 || i16 == i13) {
                    throw C6947h.m20094a();
                }
                if (i16 == 1 || i16 == i13 - 1) {
                    i14++;
                }
            }
            boolean[] zArr2 = new boolean[(m21394c * i10) - i14];
            int i17 = 0;
            for (int i18 = 0; i18 < m21394c; i18++) {
                int i19 = iArr[i18];
                if (i19 == 1 || i19 == i13 - 1) {
                    Arrays.fill(zArr2, i17, (i17 + i10) - 1, i19 > 1);
                    i17 += i10 - 1;
                } else {
                    int i20 = i10 - 1;
                    while (i20 >= 0) {
                        int i21 = i17 + 1;
                        zArr2[i17] = ((1 << i20) & i19) != 0;
                        i20--;
                        i17 = i21;
                    }
                }
            }
            return new b(zArr2, (i12 * 100) / length);
        } catch (C9584e e10) {
            throw C6947h.m20095b(e10);
        }
    }

    /* renamed from: d */
    private boolean[] m22080d(C9264b c9264b) {
        boolean m21396e = this.f16607a.m21396e();
        int m21395d = this.f16607a.m21395d();
        int i10 = (m21396e ? 11 : 14) + (m21395d * 4);
        int[] iArr = new int[i10];
        boolean[] zArr = new boolean[m22086j(m21395d, m21396e)];
        int i11 = 2;
        if (m21396e) {
            for (int i12 = 0; i12 < i10; i12++) {
                iArr[i12] = i12;
            }
        } else {
            int i13 = i10 / 2;
            int i14 = ((i10 + 1) + (((i13 - 1) / 15) * 2)) / 2;
            for (int i15 = 0; i15 < i13; i15++) {
                iArr[(i13 - i15) - 1] = (i14 - r12) - 1;
                iArr[i13 + i15] = (i15 / 15) + i15 + i14 + 1;
            }
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < m21395d) {
            int i18 = ((m21395d - i16) * 4) + (m21396e ? 9 : 12);
            int i19 = i16 * 2;
            int i20 = (i10 - 1) - i19;
            int i21 = 0;
            while (i21 < i18) {
                int i22 = i21 * 2;
                int i23 = 0;
                while (i23 < i11) {
                    int i24 = i19 + i23;
                    int i25 = i19 + i21;
                    zArr[i17 + i22 + i23] = c9264b.m27603g(iArr[i24], iArr[i25]);
                    int i26 = iArr[i25];
                    int i27 = i20 - i23;
                    zArr[(i18 * 2) + i17 + i22 + i23] = c9264b.m27603g(i26, iArr[i27]);
                    int i28 = i20 - i21;
                    zArr[(i18 * 4) + i17 + i22 + i23] = c9264b.m27603g(iArr[i27], iArr[i28]);
                    zArr[(i18 * 6) + i17 + i22 + i23] = c9264b.m27603g(iArr[i28], iArr[i24]);
                    i23++;
                    m21395d = m21395d;
                    m21396e = m21396e;
                    i11 = 2;
                }
                i21++;
                i11 = 2;
            }
            i17 += i18 * 8;
            i16++;
            i11 = 2;
        }
        return zArr;
    }

    /* renamed from: e */
    private static String m22081e(c cVar, int i10) {
        int i11 = a.f16608a[cVar.ordinal()];
        if (i11 == 1) {
            return f16601b[i10];
        }
        if (i11 == 2) {
            return f16602c[i10];
        }
        if (i11 == 3) {
            return f16603d[i10];
        }
        if (i11 == 4) {
            return f16604e[i10];
        }
        if (i11 == 5) {
            return f16605f[i10];
        }
        throw new IllegalStateException("Bad table");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        throw p066dg.C6947h.m20094a();
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String m22082f(boolean[] r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p108fg.C7348a.m22082f(boolean[]):java.lang.String");
    }

    /* renamed from: g */
    private static c m22083g(char c10) {
        return c10 != 'B' ? c10 != 'D' ? c10 != 'P' ? c10 != 'L' ? c10 != 'M' ? c.UPPER : c.MIXED : c.LOWER : c.PUNCT : c.DIGIT : c.BINARY;
    }

    /* renamed from: h */
    private static byte m22084h(boolean[] zArr, int i10) {
        int length = zArr.length - i10;
        return (byte) (length >= 8 ? m22085i(zArr, i10, 8) : m22085i(zArr, i10, length) << (8 - length));
    }

    /* renamed from: i */
    private static int m22085i(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    /* renamed from: j */
    private static int m22086j(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 * 16)) * i10;
    }

    /* renamed from: c */
    public C9267e m22087c(C7186a c7186a) {
        this.f16607a = c7186a;
        b m22079b = m22079b(m22080d(c7186a.m27641a()));
        C9267e c9267e = new C9267e(m22078a(m22079b.f16609a), m22082f(m22079b.f16609a), null, String.format("%d%%", Integer.valueOf(m22079b.f16610b)));
        c9267e.m27637m(m22079b.f16609a.length);
        return c9267e;
    }
}
