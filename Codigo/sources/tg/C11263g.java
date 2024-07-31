package tg;

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

/* renamed from: tg.g */
/* loaded from: classes2.dex */
public final class C11263g extends AbstractC11274r {

    /* renamed from: c */
    private static final char[] f29218c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d */
    static final int[] f29219d;

    /* renamed from: e */
    static final int f29220e;

    /* renamed from: a */
    private final StringBuilder f29221a = new StringBuilder(20);

    /* renamed from: b */
    private final int[] f29222b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f29219d = iArr;
        f29220e = iArr[47];
    }

    /* renamed from: h */
    private static void m35204h(CharSequence charSequence) {
        int length = charSequence.length();
        m35205i(charSequence, length - 2, 20);
        m35205i(charSequence, length - 1, 15);
    }

    /* renamed from: i */
    private static void m35205i(CharSequence charSequence, int i10, int i11) {
        int i12 = 0;
        int i13 = 1;
        for (int i14 = i10 - 1; i14 >= 0; i14--) {
            i12 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i14)) * i13;
            i13++;
            if (i13 > i11) {
                i13 = 1;
            }
        }
        if (charSequence.charAt(i10) != f29218c[i12 % 47]) {
            throw C6943d.m20090a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
    /* renamed from: j */
    private static String m35206j(CharSequence charSequence) {
        int i10;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt >= 'a' && charAt <= 'd') {
                if (i11 >= length - 1) {
                    throw C6947h.m20094a();
                }
                i11++;
                char charAt2 = charSequence.charAt(i11);
                switch (charAt) {
                    case 'a':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i10 = charAt2 - '@';
                            charAt = (char) i10;
                            break;
                        } else {
                            throw C6947h.m20094a();
                        }
                        break;
                    case 'b':
                        if (charAt2 >= 'A' && charAt2 <= 'E') {
                            i10 = charAt2 - '&';
                        } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                            i10 = charAt2 - 11;
                        } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                            i10 = charAt2 + 16;
                        } else if (charAt2 < 'P' || charAt2 > 'T') {
                            if (charAt2 != 'U') {
                                if (charAt2 != 'V') {
                                    if (charAt2 != 'W') {
                                        if (charAt2 >= 'X' && charAt2 <= 'Z') {
                                            charAt = 127;
                                            break;
                                        } else {
                                            throw C6947h.m20094a();
                                        }
                                    } else {
                                        charAt = '`';
                                        break;
                                    }
                                } else {
                                    charAt = '@';
                                    break;
                                }
                            }
                            charAt = 0;
                            break;
                        } else {
                            i10 = charAt2 + '+';
                        }
                        charAt = (char) i10;
                        break;
                    case 'c':
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            i10 = charAt2 - ' ';
                            charAt = (char) i10;
                            break;
                        } else {
                            if (charAt2 != 'Z') {
                                throw C6947h.m20094a();
                            }
                            charAt = ':';
                            break;
                        }
                    case 'd':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i10 = charAt2 + ' ';
                            charAt = (char) i10;
                            break;
                        } else {
                            throw C6947h.m20094a();
                        }
                    default:
                        charAt = 0;
                        break;
                }
            }
            sb2.append(charAt);
            i11++;
        }
        return sb2.toString();
    }

    /* renamed from: k */
    private int[] m35207k(C9263a c9263a) {
        int m27590l = c9263a.m27590l();
        int m27588j = c9263a.m27588j(0);
        Arrays.fill(this.f29222b, 0);
        int[] iArr = this.f29222b;
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
                    if (m35209m(iArr) == f29220e) {
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

    /* renamed from: l */
    private static char m35208l(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f29219d;
            if (i11 >= iArr.length) {
                throw C6952m.m20106a();
            }
            if (iArr[i11] == i10) {
                return f29218c[i11];
            }
            i11++;
        }
    }

    /* renamed from: m */
    private static int m35209m(int[] iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            i10 += i11;
        }
        int length = iArr.length;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            int round = Math.round((iArr[i13] * 9.0f) / i10);
            if (round < 1 || round > 4) {
                return -1;
            }
            if ((i13 & 1) == 0) {
                for (int i14 = 0; i14 < round; i14++) {
                    i12 = (i12 << 1) | 1;
                }
            } else {
                i12 <<= round;
            }
        }
        return i12;
    }

    @Override // tg.AbstractC11274r
    /* renamed from: c */
    public C6956q mo35175c(int i10, C9263a c9263a, Map<EnumC6944e, ?> map) {
        int m27588j = c9263a.m27588j(m35207k(c9263a)[1]);
        int m27590l = c9263a.m27590l();
        int[] iArr = this.f29222b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f29221a;
        sb2.setLength(0);
        while (true) {
            AbstractC11274r.m35226f(c9263a, m27588j, iArr);
            int m35209m = m35209m(iArr);
            if (m35209m < 0) {
                throw C6952m.m20106a();
            }
            char m35208l = m35208l(m35209m);
            sb2.append(m35208l);
            int i11 = m27588j;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int m27588j2 = c9263a.m27588j(i11);
            if (m35208l == '*') {
                sb2.deleteCharAt(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                if (m27588j2 == m27590l || !c9263a.m27586h(m27588j2)) {
                    throw C6952m.m20106a();
                }
                if (sb2.length() < 2) {
                    throw C6952m.m20106a();
                }
                m35204h(sb2);
                sb2.setLength(sb2.length() - 2);
                float f10 = i10;
                C6956q c6956q = new C6956q(m35206j(sb2), null, new C6958s[]{new C6958s((r14[1] + r14[0]) / 2.0f, f10), new C6958s(m27588j + (i13 / 2.0f), f10)}, EnumC6940a.CODE_93);
                c6956q.m20115h(EnumC6957r.SYMBOLOGY_IDENTIFIER, "]G0");
                return c6956q;
            }
            m27588j = m27588j2;
        }
    }
}
