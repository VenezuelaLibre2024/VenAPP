package p470yi;

import dm.C7056b;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;

/* renamed from: yi.a */
/* loaded from: classes3.dex */
public final class C12725a {

    /* renamed from: e */
    private static final char[] f34516e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private final String f34517a;

    /* renamed from: b */
    private final String f34518b;

    /* renamed from: c */
    private final int f34519c;

    /* renamed from: d */
    private final String f34520d;

    /* renamed from: yi.a$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        String f34521a;

        /* renamed from: b */
        String f34522b;

        /* renamed from: c */
        int f34523c = -1;

        /* renamed from: b */
        private static String m41961b(String str, int i10, int i11) {
            String m41957d = C12725a.m41957d(str, i10, i11, false);
            if (!m41957d.startsWith("[") || !m41957d.endsWith("]")) {
                return m41965f(m41957d);
            }
            InetAddress m41964e = m41964e(m41957d, 1, m41957d.length() - 1);
            if (m41964e == null) {
                return null;
            }
            byte[] address = m41964e.getAddress();
            if (address.length == 16) {
                return m41966i(address);
            }
            throw new AssertionError();
        }

        /* renamed from: c */
        private static boolean m41962c(String str) {
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        private static boolean m41963d(String str, int i10, int i11, byte[] bArr, int i12) {
            int i13 = i12;
            while (i10 < i11) {
                if (i13 == bArr.length) {
                    return false;
                }
                if (i13 != i12) {
                    if (str.charAt(i10) != '.') {
                        return false;
                    }
                    i10++;
                }
                int i14 = i10;
                int i15 = 0;
                while (i14 < i11) {
                    char charAt = str.charAt(i14);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    }
                    if ((i15 == 0 && i10 != i14) || (i15 = ((i15 * 10) + charAt) - 48) > 255) {
                        return false;
                    }
                    i14++;
                }
                if (i14 - i10 == 0) {
                    return false;
                }
                bArr[i13] = (byte) i15;
                i13++;
                i10 = i14;
            }
            return i13 == i12 + 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
        
            return null;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /* renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.net.InetAddress m41964e(java.lang.String r11, int r12, int r13) {
            /*
                r0 = 16
                byte[] r1 = new byte[r0]
                r2 = 0
                r3 = -1
                r4 = r2
                r5 = r3
                r6 = r5
            L9:
                r7 = 0
                if (r12 >= r13) goto L7a
                if (r4 != r0) goto Lf
                return r7
            Lf:
                int r8 = r12 + 2
                if (r8 > r13) goto L27
                java.lang.String r9 = "::"
                r10 = 2
                boolean r9 = r11.regionMatches(r12, r9, r2, r10)
                if (r9 == 0) goto L27
                if (r5 == r3) goto L1f
                return r7
            L1f:
                int r4 = r4 + 2
                r5 = r4
                if (r8 != r13) goto L25
                goto L7a
            L25:
                r6 = r8
                goto L4b
            L27:
                if (r4 == 0) goto L4a
                java.lang.String r8 = ":"
                r9 = 1
                boolean r8 = r11.regionMatches(r12, r8, r2, r9)
                if (r8 == 0) goto L35
                int r12 = r12 + 1
                goto L4a
            L35:
                java.lang.String r8 = "."
                boolean r12 = r11.regionMatches(r12, r8, r2, r9)
                if (r12 == 0) goto L49
                int r12 = r4 + (-2)
                boolean r11 = m41963d(r11, r6, r13, r1, r12)
                if (r11 != 0) goto L46
                return r7
            L46:
                int r4 = r4 + 2
                goto L7a
            L49:
                return r7
            L4a:
                r6 = r12
            L4b:
                r8 = r2
                r12 = r6
            L4d:
                if (r12 >= r13) goto L60
                char r9 = r11.charAt(r12)
                int r9 = p470yi.C12725a.m41955a(r9)
                if (r9 != r3) goto L5a
                goto L60
            L5a:
                int r8 = r8 << 4
                int r8 = r8 + r9
                int r12 = r12 + 1
                goto L4d
            L60:
                int r9 = r12 - r6
                if (r9 == 0) goto L79
                r10 = 4
                if (r9 <= r10) goto L68
                goto L79
            L68:
                int r7 = r4 + 1
                int r9 = r8 >>> 8
                r9 = r9 & 255(0xff, float:3.57E-43)
                byte r9 = (byte) r9
                r1[r4] = r9
                int r4 = r7 + 1
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r1[r7] = r8
                goto L9
            L79:
                return r7
            L7a:
                if (r4 == r0) goto L8b
                if (r5 != r3) goto L7f
                return r7
            L7f:
                int r11 = r4 - r5
                int r12 = 16 - r11
                java.lang.System.arraycopy(r1, r5, r1, r12, r11)
                int r0 = r0 - r4
                int r0 = r0 + r5
                java.util.Arrays.fill(r1, r5, r0, r2)
            L8b:
                java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L90
                return r11
            L90:
                java.lang.AssertionError r11 = new java.lang.AssertionError
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p470yi.C12725a.b.m41964e(java.lang.String, int, int):java.net.InetAddress");
        }

        /* renamed from: f */
        private static String m41965f(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (m41962c(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: i */
        private static String m41966i(byte[] bArr) {
            int i10 = -1;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i12 < bArr.length) {
                int i14 = i12;
                while (i14 < 16 && bArr[i14] == 0 && bArr[i14 + 1] == 0) {
                    i14 += 2;
                }
                int i15 = i14 - i12;
                if (i15 > i13) {
                    i10 = i12;
                    i13 = i15;
                }
                i12 = i14 + 2;
            }
            C7056b c7056b = new C7056b();
            while (i11 < bArr.length) {
                if (i11 == i10) {
                    c7056b.writeByte(58);
                    i11 += i13;
                    if (i11 == 16) {
                        c7056b.writeByte(58);
                    }
                } else {
                    if (i11 > 0) {
                        c7056b.writeByte(58);
                    }
                    c7056b.mo20711Z0(((bArr[i11] & 255) << 8) | (bArr[i11 + 1] & 255));
                    i11 += 2;
                }
            }
            return c7056b.m20723h0();
        }

        /* renamed from: a */
        public C12725a m41967a() {
            if (this.f34521a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.f34522b != null) {
                return new C12725a(this);
            }
            throw new IllegalStateException("host == null");
        }

        /* renamed from: g */
        int m41968g() {
            int i10 = this.f34523c;
            return i10 != -1 ? i10 : C12725a.m41956b(this.f34521a);
        }

        /* renamed from: h */
        public b m41969h(String str) {
            if (str == null) {
                throw new IllegalArgumentException("host == null");
            }
            String m41961b = m41961b(str, 0, str.length());
            if (m41961b != null) {
                this.f34522b = m41961b;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + str);
        }

        /* renamed from: j */
        public b m41970j(int i10) {
            if (i10 > 0 && i10 <= 65535) {
                this.f34523c = i10;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i10);
        }

        /* renamed from: k */
        public b m41971k(String str) {
            if (str == null) {
                throw new IllegalArgumentException("scheme == null");
            }
            String str2 = "http";
            if (!str.equalsIgnoreCase("http")) {
                str2 = "https";
                if (!str.equalsIgnoreCase("https")) {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
            }
            this.f34521a = str2;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f34521a);
            sb2.append("://");
            if (this.f34522b.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.f34522b);
                sb2.append(']');
            } else {
                sb2.append(this.f34522b);
            }
            int m41968g = m41968g();
            if (m41968g != C12725a.m41956b(this.f34521a)) {
                sb2.append(':');
                sb2.append(m41968g);
            }
            return sb2.toString();
        }
    }

    private C12725a(b bVar) {
        this.f34517a = bVar.f34521a;
        this.f34518b = bVar.f34522b;
        this.f34519c = bVar.m41968g();
        this.f34520d = bVar.toString();
    }

    /* renamed from: a */
    static int m41955a(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        char c11 = 'a';
        if (c10 < 'a' || c10 > 'f') {
            c11 = 'A';
            if (c10 < 'A' || c10 > 'F') {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    /* renamed from: b */
    public static int m41956b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    /* renamed from: d */
    static String m41957d(String str, int i10, int i11, boolean z10) {
        for (int i12 = i10; i12 < i11; i12++) {
            char charAt = str.charAt(i12);
            if (charAt == '%' || (charAt == '+' && z10)) {
                C7056b c7056b = new C7056b();
                c7056b.m20728j1(str, i10, i12);
                m41958e(c7056b, str, i12, i11, z10);
                return c7056b.m20723h0();
            }
        }
        return str.substring(i10, i11);
    }

    /* renamed from: e */
    static void m41958e(C7056b c7056b, String str, int i10, int i11, boolean z10) {
        int i12;
        while (i10 < i11) {
            int codePointAt = str.codePointAt(i10);
            if (codePointAt != 37 || (i12 = i10 + 2) >= i11) {
                if (codePointAt == 43 && z10) {
                    c7056b.writeByte(32);
                }
                c7056b.m20734q1(codePointAt);
            } else {
                int m41955a = m41955a(str.charAt(i10 + 1));
                int m41955a2 = m41955a(str.charAt(i12));
                if (m41955a != -1 && m41955a2 != -1) {
                    c7056b.writeByte((m41955a << 4) + m41955a2);
                    i10 = i12;
                }
                c7056b.m20734q1(codePointAt);
            }
            i10 += Character.charCount(codePointAt);
        }
    }

    /* renamed from: c */
    public String m41959c() {
        return this.f34518b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C12725a) && ((C12725a) obj).f34520d.equals(this.f34520d);
    }

    /* renamed from: f */
    public int m41960f() {
        return this.f34519c;
    }

    public int hashCode() {
        return this.f34520d.hashCode();
    }

    public String toString() {
        return this.f34520d;
    }
}
