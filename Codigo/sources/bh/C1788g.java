package bh;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kg.C9276n;
import kg.EnumC9266d;
import kg.InterfaceC9271i;
import p066dg.C6961v;

/* renamed from: bh.g */
/* loaded from: classes2.dex */
final class C1788g {

    /* renamed from: a */
    private static final byte[] f7437a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b */
    private static final byte[] f7438b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c */
    private static final byte[] f7439c;

    /* renamed from: d */
    private static final byte[] f7440d;

    /* renamed from: e */
    private static final Charset f7441e;

    /* renamed from: bh.g$a */
    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7442a;

        static {
            int[] iArr = new int[EnumC1784c.values().length];
            f7442a = iArr;
            try {
                iArr[EnumC1784c.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7442a[EnumC1784c.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7442a[EnumC1784c.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: bh.g$b */
    /* loaded from: classes2.dex */
    private static final class b implements InterfaceC9271i {

        /* renamed from: a */
        String f7443a;

        private b(String str) {
            this.f7443a = str;
        }

        /* synthetic */ b(String str, a aVar) {
            this(str);
        }

        @Override // kg.InterfaceC9271i
        /* renamed from: a */
        public boolean mo9545a(int i10) {
            return false;
        }

        @Override // kg.InterfaceC9271i
        /* renamed from: b */
        public int mo9546b(int i10) {
            return -1;
        }

        @Override // kg.InterfaceC9271i
        public char charAt(int i10) {
            return this.f7443a.charAt(i10);
        }

        @Override // kg.InterfaceC9271i
        public int length() {
            return this.f7443a.length();
        }

        @Override // kg.InterfaceC9271i
        public CharSequence subSequence(int i10, int i11) {
            return this.f7443a.subSequence(i10, i11);
        }

        public String toString() {
            return this.f7443a;
        }
    }

    static {
        byte[] bArr = new byte[RecognitionOptions.ITF];
        f7439c = bArr;
        f7440d = new byte[RecognitionOptions.ITF];
        f7441e = StandardCharsets.ISO_8859_1;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f7437a;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                f7439c[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f7440d, (byte) -1);
        while (true) {
            byte[] bArr3 = f7438b;
            if (i10 >= bArr3.length) {
                return;
            }
            byte b11 = bArr3[i10];
            if (b11 > 0) {
                f7440d[b11] = (byte) i10;
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x002e, code lost:
    
        return r1 - r7;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m9529a(kg.InterfaceC9271i r6, int r7, java.nio.charset.Charset r8) {
        /*
            if (r8 != 0) goto L4
            r8 = 0
            goto L8
        L4:
            java.nio.charset.CharsetEncoder r8 = r8.newEncoder()
        L8:
            int r0 = r6.length()
            r1 = r7
        Ld:
            if (r1 >= r0) goto L67
            r2 = 0
            r3 = r1
        L11:
            r4 = 13
            if (r2 >= r4) goto L2b
            boolean r5 = r6.mo9545a(r3)
            if (r5 != 0) goto L2b
            char r3 = r6.charAt(r3)
            boolean r3 = m9540l(r3)
            if (r3 == 0) goto L2b
            int r2 = r2 + 1
            int r3 = r1 + r2
            if (r3 < r0) goto L11
        L2b:
            if (r2 < r4) goto L2f
            int r1 = r1 - r7
            return r1
        L2f:
            if (r8 == 0) goto L64
            char r2 = r6.charAt(r1)
            boolean r2 = r8.canEncode(r2)
            if (r2 == 0) goto L3c
            goto L64
        L3c:
            char r6 = r6.charAt(r1)
            dg.v r7 = new dg.v
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Non-encodable character detected: "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r0 = " (Unicode: "
            r8.append(r0)
            r8.append(r6)
            r6 = 41
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L64:
            int r1 = r1 + 1
            goto Ld
        L67:
            int r1 = r1 - r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.C1788g.m9529a(kg.i, int, java.nio.charset.Charset):int");
    }

    /* renamed from: b */
    private static int m9530b(InterfaceC9271i interfaceC9271i, int i10) {
        int length = interfaceC9271i.length();
        int i11 = 0;
        if (i10 < length) {
            while (i10 < length && !interfaceC9271i.mo9545a(i10) && m9540l(interfaceC9271i.charAt(i10))) {
                i11++;
                i10++;
            }
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0027, code lost:
    
        return (r1 - r6) - r2;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m9531c(kg.InterfaceC9271i r5, int r6) {
        /*
            int r0 = r5.length()
            r1 = r6
        L5:
            if (r1 >= r0) goto L3f
            r2 = 0
        L8:
            r3 = 13
            if (r2 >= r3) goto L23
            if (r1 >= r0) goto L23
            boolean r4 = r5.mo9545a(r1)
            if (r4 != 0) goto L23
            char r4 = r5.charAt(r1)
            boolean r4 = m9540l(r4)
            if (r4 == 0) goto L23
            int r2 = r2 + 1
            int r1 = r1 + 1
            goto L8
        L23:
            if (r2 < r3) goto L28
            int r1 = r1 - r6
            int r1 = r1 - r2
            return r1
        L28:
            if (r2 <= 0) goto L2b
            goto L5
        L2b:
            boolean r2 = r5.mo9545a(r1)
            if (r2 != 0) goto L3f
            char r2 = r5.charAt(r1)
            boolean r2 = m9543o(r2)
            if (r2 != 0) goto L3c
            goto L3f
        L3c:
            int r1 = r1 + 1
            goto L5
        L3f:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.C1788g.m9531c(kg.i, int):int");
    }

    /* renamed from: d */
    private static void m9532d(byte[] bArr, int i10, int i11, int i12, StringBuilder sb2) {
        int i13;
        sb2.append((i11 == 1 && i12 == 0) ? (char) 913 : i11 % 6 == 0 ? (char) 924 : (char) 901);
        if (i11 >= 6) {
            char[] cArr = new char[5];
            i13 = i10;
            while ((i10 + i11) - i13 >= 6) {
                long j10 = 0;
                for (int i14 = 0; i14 < 6; i14++) {
                    j10 = (j10 << 8) + (bArr[i13 + i14] & 255);
                }
                for (int i15 = 0; i15 < 5; i15++) {
                    cArr[i15] = (char) (j10 % 900);
                    j10 /= 900;
                }
                for (int i16 = 4; i16 >= 0; i16--) {
                    sb2.append(cArr[i16]);
                }
                i13 += 6;
            }
        } else {
            i13 = i10;
        }
        while (i13 < i10 + i11) {
            sb2.append((char) (bArr[i13] & 255));
            i13++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static String m9533e(String str, EnumC1784c enumC1784c, Charset charset, boolean z10) {
        InterfaceC9271i bVar;
        EnumC9266d m27620b;
        if (charset == null && !z10) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                if (str.charAt(i10) > 255) {
                    throw new C6961v("Non-encodable character detected: " + str.charAt(i10) + " (Unicode: " + ((int) str.charAt(i10)) + "). Consider specifying EncodeHintType.PDF417_AUTO_ECI and/or EncodeTypeHint.CHARACTER_SET.");
                }
            }
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        a aVar = null;
        if (z10) {
            bVar = new C9276n(str, charset, -1);
        } else {
            bVar = new b(str, aVar);
            if (charset == null) {
                charset = f7441e;
            } else if (!f7441e.equals(charset) && (m27620b = EnumC9266d.m27620b(charset)) != null) {
                m9537i(m27620b.m27624m(), sb2);
            }
        }
        int length = bVar.length();
        int i11 = a.f7442a[enumC1784c.ordinal()];
        if (i11 == 1) {
            m9536h(bVar, 0, length, sb2, 0);
        } else if (i11 != 2) {
            if (i11 != 3) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (i12 < length) {
                    while (i12 < length && bVar.mo9545a(i12)) {
                        m9537i(bVar.mo9546b(i12), sb2);
                        i12++;
                    }
                    if (i12 >= length) {
                        break;
                    }
                    int m9530b = m9530b(bVar, i12);
                    if (m9530b >= 13) {
                        sb2.append((char) 902);
                        m9535g(bVar, i12, m9530b, sb2);
                        i12 += m9530b;
                        i13 = 0;
                        i14 = 2;
                    } else {
                        int m9531c = m9531c(bVar, i12);
                        if (m9531c >= 5 || m9530b == length) {
                            if (i14 != 0) {
                                sb2.append((char) 900);
                                i13 = 0;
                                i14 = 0;
                            }
                            i13 = m9536h(bVar, i12, m9531c, sb2, i13);
                            i12 += m9531c;
                        } else {
                            int m9529a = m9529a(bVar, i12, z10 ? null : charset);
                            if (m9529a == 0) {
                                m9529a = 1;
                            }
                            byte[] bytes = z10 ? null : bVar.subSequence(i12, i12 + m9529a).toString().getBytes(charset);
                            if ((!(bytes == null && m9529a == 1) && (bytes == null || bytes.length != 1)) || i14 != 0) {
                                if (z10) {
                                    m9534f(bVar, i12, i12 + m9529a, i14, sb2);
                                } else {
                                    m9532d(bytes, 0, bytes.length, i14, sb2);
                                }
                                i13 = 0;
                                i14 = 1;
                            } else if (z10) {
                                m9534f(bVar, i12, 1, 0, sb2);
                            } else {
                                m9532d(bytes, 0, 1, 0, sb2);
                            }
                            i12 += m9529a;
                        }
                    }
                }
            } else {
                sb2.append((char) 902);
                m9535g(bVar, 0, length, sb2);
            }
        } else if (z10) {
            m9534f(bVar, 0, bVar.length(), 0, sb2);
        } else {
            byte[] bytes2 = bVar.toString().getBytes(charset);
            m9532d(bytes2, 0, bytes2.length, 1, sb2);
        }
        return sb2.toString();
    }

    /* renamed from: f */
    private static void m9534f(InterfaceC9271i interfaceC9271i, int i10, int i11, int i12, StringBuilder sb2) {
        int min = Math.min(i11 + i10, interfaceC9271i.length());
        int i13 = i10;
        while (true) {
            if (i13 >= min || !interfaceC9271i.mo9545a(i13)) {
                int i14 = i13;
                while (i14 < min && !interfaceC9271i.mo9545a(i14)) {
                    i14++;
                }
                int i15 = i14 - i13;
                if (i15 <= 0) {
                    return;
                }
                m9532d(m9544p(interfaceC9271i, i13, i14), 0, i15, i13 == i10 ? i12 : 1, sb2);
                i13 = i14;
            } else {
                m9537i(interfaceC9271i.mo9546b(i13), sb2);
                i13++;
            }
        }
    }

    /* renamed from: g */
    private static void m9535g(InterfaceC9271i interfaceC9271i, int i10, int i11, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i11 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i12 = 0;
        while (i12 < i11) {
            sb3.setLength(0);
            int min = Math.min(44, i11 - i12);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("1");
            int i13 = i10 + i12;
            sb4.append((Object) interfaceC9271i.subSequence(i13, i13 + min));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i12 += min;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00b6, code lost:
    
        if (r8 == ' ') goto L49;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int m9536h(kg.InterfaceC9271i r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.C1788g.m9536h(kg.i, int, int, java.lang.StringBuilder, int):int");
    }

    /* renamed from: i */
    private static void m9537i(int i10, StringBuilder sb2) {
        char c10;
        if (i10 >= 0 && i10 < 900) {
            sb2.append((char) 927);
        } else {
            if (i10 >= 810900) {
                if (i10 < 811800) {
                    sb2.append((char) 925);
                    c10 = (char) (810900 - i10);
                    sb2.append(c10);
                } else {
                    throw new C6961v("ECI number not in valid range from 0..811799, but was " + i10);
                }
            }
            sb2.append((char) 926);
            sb2.append((char) ((i10 / 900) - 1));
            i10 %= 900;
        }
        c10 = (char) i10;
        sb2.append(c10);
    }

    /* renamed from: j */
    private static boolean m9538j(char c10) {
        return c10 == ' ' || (c10 >= 'a' && c10 <= 'z');
    }

    /* renamed from: k */
    private static boolean m9539k(char c10) {
        return c10 == ' ' || (c10 >= 'A' && c10 <= 'Z');
    }

    /* renamed from: l */
    private static boolean m9540l(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    /* renamed from: m */
    private static boolean m9541m(char c10) {
        return f7439c[c10] != -1;
    }

    /* renamed from: n */
    private static boolean m9542n(char c10) {
        return f7440d[c10] != -1;
    }

    /* renamed from: o */
    private static boolean m9543o(char c10) {
        return c10 == '\t' || c10 == '\n' || c10 == '\r' || (c10 >= ' ' && c10 <= '~');
    }

    /* renamed from: p */
    static byte[] m9544p(InterfaceC9271i interfaceC9271i, int i10, int i11) {
        byte[] bArr = new byte[i11 - i10];
        for (int i12 = i10; i12 < i11; i12++) {
            bArr[i12 - i10] = (byte) (interfaceC9271i.charAt(i12) & 255);
        }
        return bArr;
    }
}
