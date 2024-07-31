package tg;

import java.util.Collection;
import java.util.Collections;
import p066dg.EnumC6940a;

/* renamed from: tg.h */
/* loaded from: classes2.dex */
public class C11264h extends AbstractC11275s {
    /* renamed from: i */
    private static int m35210i(boolean[] zArr, int i10, int i11) {
        for (int i12 = 0; i12 < 9; i12++) {
            boolean z10 = true;
            int i13 = i10 + i12;
            if (((1 << (8 - i12)) & i11) == 0) {
                z10 = false;
            }
            zArr[i13] = z10;
        }
        return 9;
    }

    /* renamed from: j */
    private static int m35211j(String str, int i10) {
        int i11 = 0;
        int i12 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i11 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i12;
            i12++;
            if (i12 > i10) {
                i12 = 1;
            }
        }
        return i11 % 47;
    }

    /* renamed from: k */
    static String m35212k(String str) {
        int i10;
        String str2;
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length * 2);
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (charAt == 0) {
                str2 = "bU";
            } else {
                if (charAt <= 26) {
                    sb2.append('a');
                    i10 = (charAt + 'A') - 1;
                } else if (charAt <= 31) {
                    sb2.append('b');
                    i10 = (charAt + 'A') - 27;
                } else {
                    if (charAt != ' ' && charAt != '$' && charAt != '%' && charAt != '+') {
                        if (charAt <= ',') {
                            sb2.append('c');
                            i10 = (charAt + 'A') - 33;
                        } else if (charAt > '9') {
                            if (charAt == ':') {
                                str2 = "cZ";
                            } else if (charAt <= '?') {
                                sb2.append('b');
                                i10 = (charAt + 'F') - 59;
                            } else if (charAt == '@') {
                                str2 = "bV";
                            } else if (charAt > 'Z') {
                                if (charAt <= '_') {
                                    sb2.append('b');
                                    i10 = (charAt + 'K') - 91;
                                } else if (charAt == '`') {
                                    str2 = "bW";
                                } else if (charAt <= 'z') {
                                    sb2.append('d');
                                    i10 = (charAt + 'A') - 97;
                                } else {
                                    if (charAt > 127) {
                                        throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + charAt + "'");
                                    }
                                    sb2.append('b');
                                    i10 = (charAt + 'P') - 123;
                                }
                            }
                        }
                    }
                    sb2.append(charAt);
                }
                charAt = (char) i10;
                sb2.append(charAt);
            }
            sb2.append(str2);
        }
        return sb2.toString();
    }

    @Override // tg.AbstractC11275s
    /* renamed from: d */
    public boolean[] mo35182d(String str) {
        String m35212k = m35212k(str);
        int length = m35212k.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long after converting to extended encoding, but got " + length);
        }
        boolean[] zArr = new boolean[((m35212k.length() + 2 + 2) * 9) + 1];
        int m35210i = m35210i(zArr, 0, C11263g.f29220e);
        for (int i10 = 0; i10 < length; i10++) {
            m35210i += m35210i(zArr, m35210i, C11263g.f29219d["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(m35212k.charAt(i10))]);
        }
        int m35211j = m35211j(m35212k, 20);
        int[] iArr = C11263g.f29219d;
        int m35210i2 = m35210i + m35210i(zArr, m35210i, iArr[m35211j]);
        int m35210i3 = m35210i2 + m35210i(zArr, m35210i2, iArr[m35211j(m35212k + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(m35211j), 15)]);
        zArr[m35210i3 + m35210i(zArr, m35210i3, C11263g.f29220e)] = true;
        return zArr;
    }

    @Override // tg.AbstractC11275s
    /* renamed from: g */
    protected Collection<EnumC6940a> mo35183g() {
        return Collections.singleton(EnumC6940a.CODE_93);
    }
}
