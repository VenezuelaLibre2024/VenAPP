package sg;

import java.text.DecimalFormat;
import kg.C9267e;
import p066dg.C6947h;

/* renamed from: sg.b */
/* loaded from: classes2.dex */
final class C10912b {

    /* renamed from: a */
    private static final byte[] f27743a = {53, 54, 43, 44, 45, 46, 47, 48, 37, 38};

    /* renamed from: b */
    private static final byte[] f27744b = {55, 56, 57, 58, 59, 60, 49, 50, 51, 52};

    /* renamed from: c */
    private static final byte[] f27745c = {39, 40, 41, 42, 31, 32};

    /* renamed from: d */
    private static final byte[] f27746d = {33, 34, 35, 36, 25, 26, 27, 28, 29, 30, 19, 20, 21, 22, 23, 24, 13, 14, 15, 16, 17, 18, 7, 8, 9, 10, 11, 12, 1, 2};

    /* renamed from: e */
    private static final byte[][] f27747e = {new byte[]{39, 40, 41, 42, 31, 32}, new byte[]{33, 34, 35, 36, 25, 26}, new byte[]{27, 28, 29, 30, 19, 20}, new byte[]{21, 22, 23, 24, 13, 14}, new byte[]{15, 16, 17, 18, 7, 8}, new byte[]{9, 10, 11, 12, 1, 2}};

    /* renamed from: f */
    private static final String[] f27748f = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001e\ufffbÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C9267e m33314a(byte[] bArr, int i10) {
        String m33321h;
        String str;
        int i11;
        StringBuilder sb2 = new StringBuilder(144);
        if (i10 == 2 || i10 == 3) {
            int i12 = 0;
            if (i10 == 2) {
                int m33319f = m33319f(bArr);
                int m33320g = m33320g(bArr);
                if (m33320g > 10) {
                    throw C6947h.m20094a();
                }
                m33321h = new DecimalFormat("0000000000".substring(0, m33320g)).format(m33319f);
            } else {
                m33321h = m33321h(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format(m33316c(bArr));
            String format2 = decimalFormat.format(m33322i(bArr));
            sb2.append(m33318e(bArr, 10, 84));
            if (sb2.toString().startsWith("[)>\u001e01\u001d")) {
                str = m33321h + (char) 29 + format + (char) 29 + format2 + (char) 29;
                i12 = 9;
            } else {
                str = m33321h + (char) 29 + format + (char) 29 + format2 + (char) 29;
            }
            sb2.insert(i12, str);
        } else {
            if (i10 != 4) {
                i11 = i10 == 5 ? 77 : 93;
            }
            sb2.append(m33318e(bArr, 1, i11));
        }
        return new C9267e(bArr, sb2.toString(), null, String.valueOf(i10));
    }

    /* renamed from: b */
    private static int m33315b(int i10, byte[] bArr) {
        int i11 = i10 - 1;
        return ((1 << (5 - (i11 % 6))) & bArr[i11 / 6]) == 0 ? 0 : 1;
    }

    /* renamed from: c */
    private static int m33316c(byte[] bArr) {
        return m33317d(bArr, f27743a);
    }

    /* renamed from: d */
    private static int m33317d(byte[] bArr, byte[] bArr2) {
        int i10 = 0;
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            i10 += m33315b(bArr2[i11], bArr) << ((bArr2.length - i11) - 1);
        }
        return i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x001a. Please report as an issue. */
    /* renamed from: e */
    private static String m33318e(byte[] bArr, int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        int i12 = i10;
        int i13 = -1;
        int i14 = 0;
        int i15 = 0;
        while (i12 < i10 + i11) {
            char charAt = f27748f[i14].charAt(bArr[i12]);
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i15 = i14;
                    i14 = charAt - 65520;
                    i13 = 1;
                    break;
                case 65525:
                    i13 = 2;
                    i15 = i14;
                    i14 = 0;
                    break;
                case 65526:
                    i13 = 3;
                    i15 = i14;
                    i14 = 0;
                    break;
                case 65527:
                    i13 = -1;
                    i14 = 0;
                    break;
                case 65528:
                    i13 = -1;
                    i14 = 1;
                    break;
                case 65529:
                    i13 = -1;
                    break;
                case 65530:
                default:
                    sb2.append(charAt);
                    break;
                case 65531:
                    int i16 = i12 + 1;
                    int i17 = bArr[i16] << 24;
                    int i18 = i16 + 1;
                    int i19 = i17 + (bArr[i18] << 18);
                    int i20 = i18 + 1;
                    int i21 = i19 + (bArr[i20] << 12);
                    int i22 = i20 + 1;
                    int i23 = i21 + (bArr[i22] << 6);
                    i12 = i22 + 1;
                    sb2.append(new DecimalFormat("000000000").format(i23 + bArr[i12]));
                    break;
            }
            int i24 = i13 - 1;
            if (i13 == 0) {
                i14 = i15;
            }
            i12++;
            i13 = i24;
        }
        while (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == 65532) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2.toString();
    }

    /* renamed from: f */
    private static int m33319f(byte[] bArr) {
        return m33317d(bArr, f27746d);
    }

    /* renamed from: g */
    private static int m33320g(byte[] bArr) {
        return m33317d(bArr, f27745c);
    }

    /* renamed from: h */
    private static String m33321h(byte[] bArr) {
        byte[][] bArr2 = f27747e;
        StringBuilder sb2 = new StringBuilder(bArr2.length);
        for (byte[] bArr3 : bArr2) {
            sb2.append(f27748f[0].charAt(m33317d(bArr, bArr3)));
        }
        return sb2.toString();
    }

    /* renamed from: i */
    private static int m33322i(byte[] bArr) {
        return m33317d(bArr, f27744b);
    }
}
