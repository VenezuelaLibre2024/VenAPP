package tg;

import java.util.Collection;
import java.util.Collections;
import p066dg.EnumC6940a;

/* renamed from: tg.f */
/* loaded from: classes2.dex */
public final class C11262f extends AbstractC11275s {
    /* renamed from: i */
    private static void m35202i(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    /* renamed from: j */
    private static String m35203j(String str) {
        String str2;
        int i10;
        int i11;
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = str.charAt(i12);
            if (charAt != 0) {
                if (charAt != ' ') {
                    if (charAt == '@') {
                        str2 = "%V";
                    } else if (charAt == '`') {
                        str2 = "%W";
                    } else if (charAt != '-' && charAt != '.') {
                        if (charAt <= 26) {
                            sb2.append('$');
                            i10 = charAt - 1;
                        } else if (charAt < ' ') {
                            sb2.append('%');
                            i10 = charAt - 27;
                        } else if (charAt <= ',' || charAt == '/' || charAt == ':') {
                            sb2.append('/');
                            i10 = charAt - '!';
                        } else {
                            if (charAt <= '9') {
                                i11 = (charAt - '0') + 48;
                            } else if (charAt <= '?') {
                                sb2.append('%');
                                i11 = (charAt - ';') + 70;
                            } else if (charAt <= 'Z') {
                                i10 = charAt - 'A';
                            } else if (charAt <= '_') {
                                sb2.append('%');
                                i11 = (charAt - '[') + 75;
                            } else if (charAt <= 'z') {
                                sb2.append('+');
                                i10 = charAt - 'a';
                            } else {
                                if (charAt > 127) {
                                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i12) + "'");
                                }
                                sb2.append('%');
                                i11 = (charAt - '{') + 80;
                            }
                            charAt = (char) i11;
                        }
                        i11 = i10 + 65;
                        charAt = (char) i11;
                    }
                }
                sb2.append(charAt);
            } else {
                str2 = "%U";
            }
            sb2.append(str2);
        }
        return sb2.toString();
    }

    @Override // tg.AbstractC11275s
    /* renamed from: d */
    public boolean[] mo35182d(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i10)) < 0) {
                str = m35203j(str);
                length = str.length();
                if (length > 80) {
                    throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
                }
            } else {
                i10++;
            }
        }
        int[] iArr = new int[9];
        boolean[] zArr = new boolean[(length * 13) + 25];
        m35202i(148, iArr);
        int m35228b = AbstractC11275s.m35228b(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int m35228b2 = m35228b + AbstractC11275s.m35228b(zArr, m35228b, iArr2, false);
        for (int i11 = 0; i11 < length; i11++) {
            m35202i(C11261e.f29213e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i11))], iArr);
            int m35228b3 = m35228b2 + AbstractC11275s.m35228b(zArr, m35228b2, iArr, true);
            m35228b2 = m35228b3 + AbstractC11275s.m35228b(zArr, m35228b3, iArr2, false);
        }
        m35202i(148, iArr);
        AbstractC11275s.m35228b(zArr, m35228b2, iArr, true);
        return zArr;
    }

    @Override // tg.AbstractC11275s
    /* renamed from: g */
    protected Collection<EnumC6940a> mo35183g() {
        return Collections.singleton(EnumC6940a.CODE_39);
    }
}
