package tg;

import com.google.android.gms.common.api.C5101a;
import java.util.Arrays;
import java.util.Map;
import kg.C9263a;
import p066dg.C6943d;
import p066dg.C6947h;
import p066dg.C6952m;
import p066dg.C6956q;
import p066dg.C6958s;
import p066dg.EnumC6940a;
import p066dg.EnumC6944e;
import p066dg.EnumC6957r;

/* renamed from: tg.e */
/* loaded from: classes2.dex */
public final class C11261e extends AbstractC11274r {

    /* renamed from: e */
    static final int[] f29213e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a */
    private final boolean f29214a;

    /* renamed from: b */
    private final boolean f29215b;

    /* renamed from: c */
    private final StringBuilder f29216c;

    /* renamed from: d */
    private final int[] f29217d;

    public C11261e() {
        this(false);
    }

    public C11261e(boolean z10) {
        this(z10, false);
    }

    public C11261e(boolean z10, boolean z11) {
        this.f29214a = z10;
        this.f29215b = z11;
        this.f29216c = new StringBuilder(20);
        this.f29217d = new int[9];
    }

    /* renamed from: h */
    private static String m35198h(CharSequence charSequence) {
        int i10;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i11++;
                char charAt2 = charSequence.charAt(i11);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i10 = charAt2 - ' ';
                                } else {
                                    if (charAt2 != 'Z') {
                                        throw C6947h.m20094a();
                                    }
                                    charAt = ':';
                                }
                            }
                            charAt = 0;
                        } else {
                            if (charAt2 < 'A' || charAt2 > 'Z') {
                                throw C6947h.m20094a();
                            }
                            i10 = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i10 = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i10 = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i10 = charAt2 + 16;
                    } else if (charAt2 < 'P' || charAt2 > 'T') {
                        if (charAt2 != 'U') {
                            if (charAt2 == 'V') {
                                charAt = '@';
                            } else if (charAt2 == 'W') {
                                charAt = '`';
                            } else {
                                if (charAt2 != 'X' && charAt2 != 'Y' && charAt2 != 'Z') {
                                    throw C6947h.m20094a();
                                }
                                charAt = 127;
                            }
                        }
                        charAt = 0;
                    } else {
                        i10 = charAt2 + '+';
                    }
                } else {
                    if (charAt2 < 'A' || charAt2 > 'Z') {
                        throw C6947h.m20094a();
                    }
                    i10 = charAt2 - '@';
                }
                charAt = (char) i10;
            }
            sb2.append(charAt);
            i11++;
        }
        return sb2.toString();
    }

    /* renamed from: i */
    private static int[] m35199i(C9263a c9263a, int[] iArr) {
        int m27590l = c9263a.m27590l();
        int m27588j = c9263a.m27588j(0);
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = m27588j;
        while (m27588j < m27590l) {
            if (c9263a.m27586h(m27588j) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else {
                    if (m35201k(iArr) == 148 && c9263a.m27592p(Math.max(0, i11 - ((m27588j - i11) / 2)), i11, false)) {
                        return new int[]{i11, m27588j};
                    }
                    i11 += iArr[0] + iArr[1];
                    int i12 = i10 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i10] = 0;
                    i10--;
                }
                iArr[i10] = 1;
                z10 = !z10;
            }
            m27588j++;
        }
        throw C6952m.m20106a();
    }

    /* renamed from: j */
    private static char m35200j(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f29213e;
            if (i11 >= iArr.length) {
                if (i10 == 148) {
                    return '*';
                }
                throw C6952m.m20106a();
            }
            if (iArr[i11] == i10) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i11);
            }
            i11++;
        }
    }

    /* renamed from: k */
    private static int m35201k(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            int i11 = C5101a.e.API_PRIORITY_OTHER;
            for (int i12 : iArr) {
                if (i12 < i11 && i12 > i10) {
                    i11 = i12;
                }
            }
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16++) {
                int i17 = iArr[i16];
                if (i17 > i11) {
                    i14 |= 1 << ((length - 1) - i16);
                    i13++;
                    i15 += i17;
                }
            }
            if (i13 == 3) {
                for (int i18 = 0; i18 < length && i13 > 0; i18++) {
                    int i19 = iArr[i18];
                    if (i19 > i11) {
                        i13--;
                        if (i19 * 2 >= i15) {
                            return -1;
                        }
                    }
                }
                return i14;
            }
            if (i13 <= 3) {
                return -1;
            }
            i10 = i11;
        }
    }

    @Override // tg.AbstractC11274r
    /* renamed from: c */
    public C6956q mo35175c(int i10, C9263a c9263a, Map<EnumC6944e, ?> map) {
        int[] iArr = this.f29217d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f29216c;
        sb2.setLength(0);
        int m27588j = c9263a.m27588j(m35199i(c9263a, iArr)[1]);
        int m27590l = c9263a.m27590l();
        while (true) {
            AbstractC11274r.m35226f(c9263a, m27588j, iArr);
            int m35201k = m35201k(iArr);
            if (m35201k < 0) {
                throw C6952m.m20106a();
            }
            char m35200j = m35200j(m35201k);
            sb2.append(m35200j);
            int i11 = m27588j;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int m27588j2 = c9263a.m27588j(i11);
            if (m35200j == '*') {
                sb2.setLength(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                int i15 = (m27588j2 - m27588j) - i13;
                if (m27588j2 != m27590l && i15 * 2 < i13) {
                    throw C6952m.m20106a();
                }
                if (this.f29214a) {
                    int length = sb2.length() - 1;
                    int i16 = 0;
                    for (int i17 = 0; i17 < length; i17++) {
                        i16 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f29216c.charAt(i17));
                    }
                    if (sb2.charAt(length) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i16 % 43)) {
                        throw C6943d.m20090a();
                    }
                    sb2.setLength(length);
                }
                if (sb2.length() == 0) {
                    throw C6952m.m20106a();
                }
                float f10 = i10;
                C6956q c6956q = new C6956q(this.f29215b ? m35198h(sb2) : sb2.toString(), null, new C6958s[]{new C6958s((r2[1] + r2[0]) / 2.0f, f10), new C6958s(m27588j + (i13 / 2.0f), f10)}, EnumC6940a.CODE_39);
                c6956q.m20115h(EnumC6957r.SYMBOLOGY_IDENTIFIER, "]A0");
                return c6956q;
            }
            m27588j = m27588j2;
        }
    }
}
