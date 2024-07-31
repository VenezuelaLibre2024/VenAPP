package tg;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final class g extends r {

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f26916c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d, reason: collision with root package name */
    static final int[] f26917d;

    /* renamed from: e, reason: collision with root package name */
    static final int f26918e;

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f26919a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    private final int[] f26920b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f26917d = iArr;
        f26918e = iArr[47];
    }

    private static void h(CharSequence charSequence) {
        int length = charSequence.length();
        i(charSequence, length - 2, 20);
        i(charSequence, length - 1, 15);
    }

    private static void i(CharSequence charSequence, int i10, int i11) {
        int i12 = 0;
        int i13 = 1;
        for (int i14 = i10 - 1; i14 >= 0; i14--) {
            i12 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i14)) * i13;
            i13++;
            if (i13 > i11) {
                i13 = 1;
            }
        }
        if (charSequence.charAt(i10) != f26916c[i12 % 47]) {
            throw dg.d.a();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0029. Please report as an issue. */
    private static String j(CharSequence charSequence) {
        int i10;
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i11 = 0;
        while (i11 < length) {
            char charAt = charSequence.charAt(i11);
            if (charAt >= 'a' && charAt <= 'd') {
                if (i11 >= length - 1) {
                    throw dg.h.a();
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
                            throw dg.h.a();
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
                                            throw dg.h.a();
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
                                throw dg.h.a();
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
                            throw dg.h.a();
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

    private int[] k(kg.a aVar) {
        int l10 = aVar.l();
        int j10 = aVar.j(0);
        Arrays.fill(this.f26920b, 0);
        int[] iArr = this.f26920b;
        int length = iArr.length;
        boolean z10 = false;
        int i10 = 0;
        int i11 = j10;
        while (j10 < l10) {
            if (aVar.h(j10) != z10) {
                iArr[i10] = iArr[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else {
                    if (m(iArr) == f26918e) {
                        return new int[]{i11, j10};
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
            j10++;
        }
        throw dg.m.a();
    }

    private static char l(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f26917d;
            if (i11 >= iArr.length) {
                throw dg.m.a();
            }
            if (iArr[i11] == i10) {
                return f26916c[i11];
            }
            i11++;
        }
    }

    private static int m(int[] iArr) {
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

    @Override // tg.r
    public dg.q c(int i10, kg.a aVar, Map<dg.e, ?> map) {
        int j10 = aVar.j(k(aVar)[1]);
        int l10 = aVar.l();
        int[] iArr = this.f26920b;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f26919a;
        sb2.setLength(0);
        while (true) {
            r.f(aVar, j10, iArr);
            int m10 = m(iArr);
            if (m10 < 0) {
                throw dg.m.a();
            }
            char l11 = l(m10);
            sb2.append(l11);
            int i11 = j10;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int j11 = aVar.j(i11);
            if (l11 == '*') {
                sb2.deleteCharAt(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                if (j11 == l10 || !aVar.h(j11)) {
                    throw dg.m.a();
                }
                if (sb2.length() < 2) {
                    throw dg.m.a();
                }
                h(sb2);
                sb2.setLength(sb2.length() - 2);
                float f10 = i10;
                dg.q qVar = new dg.q(j(sb2), null, new dg.s[]{new dg.s((r14[1] + r14[0]) / 2.0f, f10), new dg.s(j10 + (i13 / 2.0f), f10)}, dg.a.CODE_93);
                qVar.h(dg.r.SYMBOLOGY_IDENTIFIER, "]G0");
                return qVar;
            }
            j10 = j11;
        }
    }
}
