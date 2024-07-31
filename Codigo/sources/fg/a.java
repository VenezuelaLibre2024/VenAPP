package fg;

import dg.h;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import mg.e;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f15178b = {"CTRL_PS", " ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "CTRL_LL", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f15179c = {"CTRL_PS", " ", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "CTRL_US", "CTRL_ML", "CTRL_DL", "CTRL_BS"};

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f15180d = {"CTRL_PS", " ", "\u0001", "\u0002", "\u0003", "\u0004", "\u0005", "\u0006", "\u0007", "\b", "\t", "\n", "\u000b", "\f", "\r", "\u001b", "\u001c", "\u001d", "\u001e", "\u001f", "@", "\\", "^", "_", "`", "|", "~", "\u007f", "CTRL_LL", "CTRL_UL", "CTRL_PL", "CTRL_BS"};

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f15181e = {"FLG(n)", "\r", "\r\n", ". ", ", ", ": ", "!", "\"", "#", "$", "%", "&", "'", "(", ")", "*", "+", ",", "-", ".", "/", ":", ";", "<", "=", ">", "?", "[", "]", "{", "}", "CTRL_UL"};

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f15182f = {"CTRL_PS", " ", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ",", ".", "CTRL_UL", "CTRL_US"};

    /* renamed from: g, reason: collision with root package name */
    private static final Charset f15183g = StandardCharsets.ISO_8859_1;

    /* renamed from: a, reason: collision with root package name */
    private eg.a f15184a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fg.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C0251a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15185a;

        static {
            int[] iArr = new int[c.values().length];
            f15185a = iArr;
            try {
                iArr[c.UPPER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15185a[c.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15185a[c.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15185a[c.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15185a[c.DIGIT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final boolean[] f15186a;

        /* renamed from: b, reason: collision with root package name */
        private final int f15187b;

        b(boolean[] zArr, int i10) {
            this.f15186a = zArr;
            this.f15187b = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public enum c {
        UPPER,
        LOWER,
        MIXED,
        DIGIT,
        PUNCT,
        BINARY
    }

    static byte[] a(boolean[] zArr) {
        int length = (zArr.length + 7) / 8;
        byte[] bArr = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = h(zArr, i10 * 8);
        }
        return bArr;
    }

    private b b(boolean[] zArr) {
        int i10;
        mg.a aVar;
        if (this.f15184a.d() <= 2) {
            aVar = mg.a.f21488j;
            i10 = 6;
        } else {
            i10 = 8;
            if (this.f15184a.d() <= 8) {
                aVar = mg.a.f21492n;
            } else if (this.f15184a.d() <= 22) {
                aVar = mg.a.f21487i;
                i10 = 10;
            } else {
                aVar = mg.a.f21486h;
                i10 = 12;
            }
        }
        int c10 = this.f15184a.c();
        int length = zArr.length / i10;
        if (length < c10) {
            throw h.a();
        }
        int length2 = zArr.length % i10;
        int[] iArr = new int[length];
        int i11 = 0;
        while (i11 < length) {
            iArr[i11] = i(zArr, length2, i10);
            i11++;
            length2 += i10;
        }
        try {
            mg.c cVar = new mg.c(aVar);
            int i12 = length - c10;
            cVar.a(iArr, i12);
            int i13 = (1 << i10) - 1;
            int i14 = 0;
            for (int i15 = 0; i15 < c10; i15++) {
                int i16 = iArr[i15];
                if (i16 == 0 || i16 == i13) {
                    throw h.a();
                }
                if (i16 == 1 || i16 == i13 - 1) {
                    i14++;
                }
            }
            boolean[] zArr2 = new boolean[(c10 * i10) - i14];
            int i17 = 0;
            for (int i18 = 0; i18 < c10; i18++) {
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
        } catch (e e10) {
            throw h.b(e10);
        }
    }

    private boolean[] d(kg.b bVar) {
        boolean e10 = this.f15184a.e();
        int d10 = this.f15184a.d();
        int i10 = (e10 ? 11 : 14) + (d10 * 4);
        int[] iArr = new int[i10];
        boolean[] zArr = new boolean[j(d10, e10)];
        int i11 = 2;
        if (e10) {
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
        while (i16 < d10) {
            int i18 = ((d10 - i16) * 4) + (e10 ? 9 : 12);
            int i19 = i16 * 2;
            int i20 = (i10 - 1) - i19;
            int i21 = 0;
            while (i21 < i18) {
                int i22 = i21 * 2;
                int i23 = 0;
                while (i23 < i11) {
                    int i24 = i19 + i23;
                    int i25 = i19 + i21;
                    zArr[i17 + i22 + i23] = bVar.g(iArr[i24], iArr[i25]);
                    int i26 = iArr[i25];
                    int i27 = i20 - i23;
                    zArr[(i18 * 2) + i17 + i22 + i23] = bVar.g(i26, iArr[i27]);
                    int i28 = i20 - i21;
                    zArr[(i18 * 4) + i17 + i22 + i23] = bVar.g(iArr[i27], iArr[i28]);
                    zArr[(i18 * 6) + i17 + i22 + i23] = bVar.g(iArr[i28], iArr[i24]);
                    i23++;
                    d10 = d10;
                    e10 = e10;
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

    private static String e(c cVar, int i10) {
        int i11 = C0251a.f15185a[cVar.ordinal()];
        if (i11 == 1) {
            return f15178b[i10];
        }
        if (i11 == 2) {
            return f15179c[i10];
        }
        if (i11 == 3) {
            return f15180d[i10];
        }
        if (i11 == 4) {
            return f15181e[i10];
        }
        if (i11 == 5) {
            return f15182f[i10];
        }
        throw new IllegalStateException("Bad table");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
    
        throw dg.h.a();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String f(boolean[] r14) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fg.a.f(boolean[]):java.lang.String");
    }

    private static c g(char c10) {
        return c10 != 'B' ? c10 != 'D' ? c10 != 'P' ? c10 != 'L' ? c10 != 'M' ? c.UPPER : c.MIXED : c.LOWER : c.PUNCT : c.DIGIT : c.BINARY;
    }

    private static byte h(boolean[] zArr, int i10) {
        int length = zArr.length - i10;
        return (byte) (length >= 8 ? i(zArr, i10, 8) : i(zArr, i10, length) << (8 - length));
    }

    private static int i(boolean[] zArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = i10; i13 < i10 + i11; i13++) {
            i12 <<= 1;
            if (zArr[i13]) {
                i12 |= 1;
            }
        }
        return i12;
    }

    private static int j(int i10, boolean z10) {
        return ((z10 ? 88 : 112) + (i10 * 16)) * i10;
    }

    public kg.e c(eg.a aVar) {
        this.f15184a = aVar;
        b b10 = b(d(aVar.a()));
        kg.e eVar = new kg.e(a(b10.f15186a), f(b10.f15186a), null, String.format("%d%%", Integer.valueOf(b10.f15187b)));
        eVar.m(b10.f15186a.length);
        return eVar;
    }
}
