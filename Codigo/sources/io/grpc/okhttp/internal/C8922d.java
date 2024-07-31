package io.grpc.okhttp.internal;

import javax.security.auth.x500.X500Principal;

/* renamed from: io.grpc.okhttp.internal.d */
/* loaded from: classes3.dex */
final class C8922d {

    /* renamed from: a */
    private final String f21181a;

    /* renamed from: b */
    private final int f21182b;

    /* renamed from: c */
    private int f21183c;

    /* renamed from: d */
    private int f21184d;

    /* renamed from: e */
    private int f21185e;

    /* renamed from: f */
    private int f21186f;

    /* renamed from: g */
    private char[] f21187g;

    public C8922d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f21181a = name;
        this.f21182b = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x004d, code lost:
    
        r2 = r8.f21184d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0057, code lost:
    
        return new java.lang.String(r1, r2, r8.f21185e - r2);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m26054a() {
        /*
            r8 = this;
            int r0 = r8.f21183c
            r8.f21184d = r0
            r8.f21185e = r0
        L6:
            int r0 = r8.f21183c
            int r1 = r8.f21182b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f21187g
            int r2 = r8.f21184d
            int r3 = r8.f21185e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f21187g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L58
            if (r2 == r5) goto L4d
            r5 = 92
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L4d
            if (r2 == r3) goto L4d
            int r3 = r8.f21185e
            int r4 = r3 + 1
            r8.f21185e = r4
            r1[r3] = r2
            goto L48
        L3a:
            int r0 = r8.f21185e
            int r2 = r0 + 1
            r8.f21185e = r2
            char r2 = r8.m26056d()
            r1[r0] = r2
            int r0 = r8.f21183c
        L48:
            int r0 = r0 + 1
            r8.f21183c = r0
            goto L6
        L4d:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f21184d
            int r3 = r8.f21185e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L58:
            int r2 = r8.f21185e
            r8.f21186f = r2
            int r0 = r0 + 1
            r8.f21183c = r0
            int r0 = r2 + 1
            r8.f21185e = r0
            r1[r2] = r6
        L66:
            int r0 = r8.f21183c
            int r1 = r8.f21182b
            if (r0 >= r1) goto L7f
            char[] r2 = r8.f21187g
            char r7 = r2[r0]
            if (r7 != r6) goto L7f
            int r1 = r8.f21185e
            int r7 = r1 + 1
            r8.f21185e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f21183c = r0
            goto L66
        L7f:
            if (r0 == r1) goto L8b
            char[] r1 = r8.f21187g
            char r0 = r1[r0]
            if (r0 == r3) goto L8b
            if (r0 == r4) goto L8b
            if (r0 != r5) goto L6
        L8b:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f21187g
            int r2 = r8.f21184d
            int r3 = r8.f21186f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.okhttp.internal.C8922d.m26054a():java.lang.String");
    }

    /* renamed from: c */
    private int m26055c(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        if (i13 >= this.f21182b) {
            throw new IllegalStateException("Malformed DN: " + this.f21181a);
        }
        char[] cArr = this.f21187g;
        char c10 = cArr[i10];
        if (c10 >= '0' && c10 <= '9') {
            i11 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i11 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f21181a);
            }
            i11 = c10 - '7';
        }
        char c11 = cArr[i13];
        if (c11 >= '0' && c11 <= '9') {
            i12 = c11 - '0';
        } else if (c11 >= 'a' && c11 <= 'f') {
            i12 = c11 - 'W';
        } else {
            if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f21181a);
            }
            i12 = c11 - '7';
        }
        return (i11 << 4) + i12;
    }

    /* renamed from: d */
    private char m26056d() {
        int i10 = this.f21183c + 1;
        this.f21183c = i10;
        if (i10 == this.f21182b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f21181a);
        }
        char c10 = this.f21187g[i10];
        if (c10 == ' ' || c10 == '%' || c10 == '\\' || c10 == '_' || c10 == '\"' || c10 == '#') {
            return c10;
        }
        switch (c10) {
            case '*':
            case '+':
            case ',':
                return c10;
            default:
                switch (c10) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c10;
                    default:
                        return m26057e();
                }
        }
    }

    /* renamed from: e */
    private char m26057e() {
        int i10;
        int i11;
        int m26055c = m26055c(this.f21183c);
        this.f21183c++;
        if (m26055c < 128) {
            return (char) m26055c;
        }
        if (m26055c < 192 || m26055c > 247) {
            return '?';
        }
        if (m26055c <= 223) {
            i10 = m26055c & 31;
            i11 = 1;
        } else if (m26055c <= 239) {
            i10 = m26055c & 15;
            i11 = 2;
        } else {
            i10 = m26055c & 7;
            i11 = 3;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f21183c + 1;
            this.f21183c = i13;
            if (i13 == this.f21182b || this.f21187g[i13] != '\\') {
                return '?';
            }
            int i14 = i13 + 1;
            this.f21183c = i14;
            int m26055c2 = m26055c(i14);
            this.f21183c++;
            if ((m26055c2 & 192) != 128) {
                return '?';
            }
            i10 = (i10 << 6) + (m26055c2 & 63);
        }
        return (char) i10;
    }

    /* renamed from: f */
    private String m26058f() {
        char[] cArr;
        char c10;
        int i10 = this.f21183c;
        if (i10 + 4 >= this.f21182b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f21181a);
        }
        this.f21184d = i10;
        while (true) {
            this.f21183c = i10 + 1;
            i10 = this.f21183c;
            if (i10 == this.f21182b || (c10 = (cArr = this.f21187g)[i10]) == '+' || c10 == ',' || c10 == ';') {
                break;
            }
            if (c10 == ' ') {
                this.f21185e = i10;
                do {
                    this.f21183c = i10 + 1;
                    i10 = this.f21183c;
                    if (i10 >= this.f21182b) {
                        break;
                    }
                } while (this.f21187g[i10] == ' ');
            } else if (c10 >= 'A' && c10 <= 'F') {
                cArr[i10] = (char) (c10 + ' ');
            }
        }
        this.f21185e = i10;
        int i11 = this.f21185e;
        int i12 = this.f21184d;
        int i13 = i11 - i12;
        if (i13 < 5 || (i13 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f21181a);
        }
        int i14 = i13 / 2;
        byte[] bArr = new byte[i14];
        int i15 = i12 + 1;
        for (int i16 = 0; i16 < i14; i16++) {
            bArr[i16] = (byte) m26055c(i15);
            i15 += 2;
        }
        return new String(this.f21187g, this.f21184d, i13);
    }

    /* renamed from: g */
    private String m26059g() {
        int i10;
        int i11;
        int i12;
        char c10;
        int i13;
        int i14;
        char c11;
        char c12;
        while (true) {
            i10 = this.f21183c;
            i11 = this.f21182b;
            if (i10 >= i11 || this.f21187g[i10] != ' ') {
                break;
            }
            this.f21183c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.f21184d = i10;
        do {
            this.f21183c = i10 + 1;
            i10 = this.f21183c;
            i12 = this.f21182b;
            if (i10 >= i12 || (c12 = this.f21187g[i10]) == '=') {
                break;
            }
        } while (c12 != ' ');
        if (i10 >= i12) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f21181a);
        }
        this.f21185e = i10;
        if (this.f21187g[i10] == ' ') {
            while (true) {
                i13 = this.f21183c;
                i14 = this.f21182b;
                if (i13 >= i14 || (c11 = this.f21187g[i13]) == '=' || c11 != ' ') {
                    break;
                }
                this.f21183c = i13 + 1;
            }
            if (this.f21187g[i13] != '=' || i13 == i14) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f21181a);
            }
        }
        int i15 = this.f21183c;
        do {
            this.f21183c = i15 + 1;
            i15 = this.f21183c;
            if (i15 >= this.f21182b) {
                break;
            }
        } while (this.f21187g[i15] == ' ');
        int i16 = this.f21185e;
        int i17 = this.f21184d;
        if (i16 - i17 > 4) {
            char[] cArr = this.f21187g;
            if (cArr[i17 + 3] == '.' && (((c10 = cArr[i17]) == 'O' || c10 == 'o') && ((cArr[i17 + 1] == 'I' || cArr[i17 + 1] == 'i') && (cArr[i17 + 2] == 'D' || cArr[i17 + 2] == 'd')))) {
                this.f21184d = i17 + 4;
            }
        }
        char[] cArr2 = this.f21187g;
        int i18 = this.f21184d;
        return new String(cArr2, i18, i16 - i18);
    }

    /* renamed from: h */
    private String m26060h() {
        int i10 = this.f21183c + 1;
        this.f21183c = i10;
        this.f21184d = i10;
        while (true) {
            this.f21185e = i10;
            int i11 = this.f21183c;
            if (i11 == this.f21182b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f21181a);
            }
            char[] cArr = this.f21187g;
            char c10 = cArr[i11];
            if (c10 == '\"') {
                do {
                    this.f21183c = i11 + 1;
                    i11 = this.f21183c;
                    if (i11 >= this.f21182b) {
                        break;
                    }
                } while (this.f21187g[i11] == ' ');
                char[] cArr2 = this.f21187g;
                int i12 = this.f21184d;
                return new String(cArr2, i12, this.f21185e - i12);
            }
            if (c10 == '\\') {
                cArr[this.f21185e] = m26056d();
            } else {
                cArr[this.f21185e] = c10;
            }
            this.f21183c++;
            i10 = this.f21185e + 1;
        }
    }

    /* renamed from: b */
    public String m26061b(String str) {
        this.f21183c = 0;
        this.f21184d = 0;
        this.f21185e = 0;
        this.f21186f = 0;
        this.f21187g = this.f21181a.toCharArray();
        String m26059g = m26059g();
        if (m26059g == null) {
            return null;
        }
        do {
            int i10 = this.f21183c;
            if (i10 == this.f21182b) {
                return null;
            }
            char c10 = this.f21187g[i10];
            String m26054a = c10 != '\"' ? c10 != '#' ? (c10 == '+' || c10 == ',' || c10 == ';') ? "" : m26054a() : m26058f() : m26060h();
            if (str.equalsIgnoreCase(m26059g)) {
                return m26054a;
            }
            int i11 = this.f21183c;
            if (i11 >= this.f21182b) {
                return null;
            }
            char c11 = this.f21187g[i11];
            if (c11 != ',' && c11 != ';' && c11 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f21181a);
            }
            this.f21183c = i11 + 1;
            m26059g = m26059g();
        } while (m26059g != null);
        throw new IllegalStateException("Malformed DN: " + this.f21181a);
    }
}
