package bh;

import com.google.android.libraries.barhopper.RecognitionOptions;
import dg.v;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import kg.i;
import kg.n;

/* loaded from: classes2.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f6515a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f6516b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f6517c;

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f6518d;

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f6519e;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6520a;

        static {
            int[] iArr = new int[c.values().length];
            f6520a = iArr;
            try {
                iArr[c.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6520a[c.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6520a[c.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes2.dex */
    private static final class b implements i {

        /* renamed from: a, reason: collision with root package name */
        String f6521a;

        private b(String str) {
            this.f6521a = str;
        }

        /* synthetic */ b(String str, a aVar) {
            this(str);
        }

        @Override // kg.i
        public boolean a(int i10) {
            return false;
        }

        @Override // kg.i
        public int b(int i10) {
            return -1;
        }

        @Override // kg.i
        public char charAt(int i10) {
            return this.f6521a.charAt(i10);
        }

        @Override // kg.i
        public int length() {
            return this.f6521a.length();
        }

        @Override // kg.i
        public CharSequence subSequence(int i10, int i11) {
            return this.f6521a.subSequence(i10, i11);
        }

        public String toString() {
            return this.f6521a;
        }
    }

    static {
        byte[] bArr = new byte[RecognitionOptions.ITF];
        f6517c = bArr;
        f6518d = new byte[RecognitionOptions.ITF];
        f6519e = StandardCharsets.ISO_8859_1;
        Arrays.fill(bArr, (byte) -1);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f6515a;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                f6517c[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f6518d, (byte) -1);
        while (true) {
            byte[] bArr3 = f6516b;
            if (i10 >= bArr3.length) {
                return;
            }
            byte b11 = bArr3[i10];
            if (b11 > 0) {
                f6518d[b11] = (byte) i10;
            }
            i10++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x002e, code lost:
    
        return r1 - r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(kg.i r6, int r7, java.nio.charset.Charset r8) {
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
            boolean r5 = r6.a(r3)
            if (r5 != 0) goto L2b
            char r3 = r6.charAt(r3)
            boolean r3 = l(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: bh.g.a(kg.i, int, java.nio.charset.Charset):int");
    }

    private static int b(i iVar, int i10) {
        int length = iVar.length();
        int i11 = 0;
        if (i10 < length) {
            while (i10 < length && !iVar.a(i10) && l(iVar.charAt(i10))) {
                i11++;
                i10++;
            }
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0027, code lost:
    
        return (r1 - r6) - r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int c(kg.i r5, int r6) {
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
            boolean r4 = r5.a(r1)
            if (r4 != 0) goto L23
            char r4 = r5.charAt(r1)
            boolean r4 = l(r4)
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
            boolean r2 = r5.a(r1)
            if (r2 != 0) goto L3f
            char r2 = r5.charAt(r1)
            boolean r2 = o(r2)
            if (r2 != 0) goto L3c
            goto L3f
        L3c:
            int r1 = r1 + 1
            goto L5
        L3f:
            int r1 = r1 - r6
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.g.c(kg.i, int):int");
    }

    private static void d(byte[] bArr, int i10, int i11, int i12, StringBuilder sb2) {
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
    public static String e(String str, c cVar, Charset charset, boolean z10) {
        i bVar;
        kg.d b10;
        if (charset == null && !z10) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                if (str.charAt(i10) > 255) {
                    throw new v("Non-encodable character detected: " + str.charAt(i10) + " (Unicode: " + ((int) str.charAt(i10)) + "). Consider specifying EncodeHintType.PDF417_AUTO_ECI and/or EncodeTypeHint.CHARACTER_SET.");
                }
            }
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        a aVar = null;
        if (z10) {
            bVar = new n(str, charset, -1);
        } else {
            bVar = new b(str, aVar);
            if (charset == null) {
                charset = f6519e;
            } else if (!f6519e.equals(charset) && (b10 = kg.d.b(charset)) != null) {
                i(b10.m(), sb2);
            }
        }
        int length = bVar.length();
        int i11 = a.f6520a[cVar.ordinal()];
        if (i11 == 1) {
            h(bVar, 0, length, sb2, 0);
        } else if (i11 != 2) {
            if (i11 != 3) {
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (i12 < length) {
                    while (i12 < length && bVar.a(i12)) {
                        i(bVar.b(i12), sb2);
                        i12++;
                    }
                    if (i12 >= length) {
                        break;
                    }
                    int b11 = b(bVar, i12);
                    if (b11 >= 13) {
                        sb2.append((char) 902);
                        g(bVar, i12, b11, sb2);
                        i12 += b11;
                        i13 = 0;
                        i14 = 2;
                    } else {
                        int c10 = c(bVar, i12);
                        if (c10 >= 5 || b11 == length) {
                            if (i14 != 0) {
                                sb2.append((char) 900);
                                i13 = 0;
                                i14 = 0;
                            }
                            i13 = h(bVar, i12, c10, sb2, i13);
                            i12 += c10;
                        } else {
                            int a10 = a(bVar, i12, z10 ? null : charset);
                            if (a10 == 0) {
                                a10 = 1;
                            }
                            byte[] bytes = z10 ? null : bVar.subSequence(i12, i12 + a10).toString().getBytes(charset);
                            if ((!(bytes == null && a10 == 1) && (bytes == null || bytes.length != 1)) || i14 != 0) {
                                if (z10) {
                                    f(bVar, i12, i12 + a10, i14, sb2);
                                } else {
                                    d(bytes, 0, bytes.length, i14, sb2);
                                }
                                i13 = 0;
                                i14 = 1;
                            } else if (z10) {
                                f(bVar, i12, 1, 0, sb2);
                            } else {
                                d(bytes, 0, 1, 0, sb2);
                            }
                            i12 += a10;
                        }
                    }
                }
            } else {
                sb2.append((char) 902);
                g(bVar, 0, length, sb2);
            }
        } else if (z10) {
            f(bVar, 0, bVar.length(), 0, sb2);
        } else {
            byte[] bytes2 = bVar.toString().getBytes(charset);
            d(bytes2, 0, bytes2.length, 1, sb2);
        }
        return sb2.toString();
    }

    private static void f(i iVar, int i10, int i11, int i12, StringBuilder sb2) {
        int min = Math.min(i11 + i10, iVar.length());
        int i13 = i10;
        while (true) {
            if (i13 >= min || !iVar.a(i13)) {
                int i14 = i13;
                while (i14 < min && !iVar.a(i14)) {
                    i14++;
                }
                int i15 = i14 - i13;
                if (i15 <= 0) {
                    return;
                }
                d(p(iVar, i13, i14), 0, i15, i13 == i10 ? i12 : 1, sb2);
                i13 = i14;
            } else {
                i(iVar.b(i13), sb2);
                i13++;
            }
        }
    }

    private static void g(i iVar, int i10, int i11, StringBuilder sb2) {
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
            sb4.append((Object) iVar.subSequence(i13, i13 + min));
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int h(kg.i r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.g.h(kg.i, int, int, java.lang.StringBuilder, int):int");
    }

    private static void i(int i10, StringBuilder sb2) {
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
                    throw new v("ECI number not in valid range from 0..811799, but was " + i10);
                }
            }
            sb2.append((char) 926);
            sb2.append((char) ((i10 / 900) - 1));
            i10 %= 900;
        }
        c10 = (char) i10;
        sb2.append(c10);
    }

    private static boolean j(char c10) {
        return c10 == ' ' || (c10 >= 'a' && c10 <= 'z');
    }

    private static boolean k(char c10) {
        return c10 == ' ' || (c10 >= 'A' && c10 <= 'Z');
    }

    private static boolean l(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    private static boolean m(char c10) {
        return f6517c[c10] != -1;
    }

    private static boolean n(char c10) {
        return f6518d[c10] != -1;
    }

    private static boolean o(char c10) {
        return c10 == '\t' || c10 == '\n' || c10 == '\r' || (c10 >= ' ' && c10 <= '~');
    }

    static byte[] p(i iVar, int i10, int i11) {
        byte[] bArr = new byte[i11 - i10];
        for (int i12 = i10; i12 < i11; i12++) {
            bArr[i12 - i10] = (byte) (iVar.charAt(i12) & 255);
        }
        return bArr;
    }
}
