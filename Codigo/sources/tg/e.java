package tg;

import com.google.android.gms.common.api.a;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e extends r {

    /* renamed from: e, reason: collision with root package name */
    static final int[] f26911e = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, 274, 82, 7, 262, 70, 22, 385, 193, 448, 145, 400, 208, 133, 388, 196, 168, 162, 138, 42};

    /* renamed from: a, reason: collision with root package name */
    private final boolean f26912a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f26913b;

    /* renamed from: c, reason: collision with root package name */
    private final StringBuilder f26914c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f26915d;

    public e() {
        this(false);
    }

    public e(boolean z10) {
        this(z10, false);
    }

    public e(boolean z10, boolean z11) {
        this.f26912a = z10;
        this.f26913b = z11;
        this.f26914c = new StringBuilder(20);
        this.f26915d = new int[9];
    }

    private static String h(CharSequence charSequence) {
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
                                        throw dg.h.a();
                                    }
                                    charAt = ':';
                                }
                            }
                            charAt = 0;
                        } else {
                            if (charAt2 < 'A' || charAt2 > 'Z') {
                                throw dg.h.a();
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
                                    throw dg.h.a();
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
                        throw dg.h.a();
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

    private static int[] i(kg.a aVar, int[] iArr) {
        int l10 = aVar.l();
        int j10 = aVar.j(0);
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
                    if (k(iArr) == 148 && aVar.p(Math.max(0, i11 - ((j10 - i11) / 2)), i11, false)) {
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

    private static char j(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f26911e;
            if (i11 >= iArr.length) {
                if (i10 == 148) {
                    return '*';
                }
                throw dg.m.a();
            }
            if (iArr[i11] == i10) {
                return "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i11);
            }
            i11++;
        }
    }

    private static int k(int[] iArr) {
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            int i11 = a.e.API_PRIORITY_OTHER;
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

    @Override // tg.r
    public dg.q c(int i10, kg.a aVar, Map<dg.e, ?> map) {
        int[] iArr = this.f26915d;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f26914c;
        sb2.setLength(0);
        int j10 = aVar.j(i(aVar, iArr)[1]);
        int l10 = aVar.l();
        while (true) {
            r.f(aVar, j10, iArr);
            int k10 = k(iArr);
            if (k10 < 0) {
                throw dg.m.a();
            }
            char j11 = j(k10);
            sb2.append(j11);
            int i11 = j10;
            for (int i12 : iArr) {
                i11 += i12;
            }
            int j12 = aVar.j(i11);
            if (j11 == '*') {
                sb2.setLength(sb2.length() - 1);
                int i13 = 0;
                for (int i14 : iArr) {
                    i13 += i14;
                }
                int i15 = (j12 - j10) - i13;
                if (j12 != l10 && i15 * 2 < i13) {
                    throw dg.m.a();
                }
                if (this.f26912a) {
                    int length = sb2.length() - 1;
                    int i16 = 0;
                    for (int i17 = 0; i17 < length; i17++) {
                        i16 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(this.f26914c.charAt(i17));
                    }
                    if (sb2.charAt(length) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i16 % 43)) {
                        throw dg.d.a();
                    }
                    sb2.setLength(length);
                }
                if (sb2.length() == 0) {
                    throw dg.m.a();
                }
                float f10 = i10;
                dg.q qVar = new dg.q(this.f26913b ? h(sb2) : sb2.toString(), null, new dg.s[]{new dg.s((r2[1] + r2[0]) / 2.0f, f10), new dg.s(j10 + (i13 / 2.0f), f10)}, dg.a.CODE_39);
                qVar.h(dg.r.SYMBOLOGY_IDENTIFIER, "]A0");
                return qVar;
            }
            j10 = j12;
        }
    }
}
