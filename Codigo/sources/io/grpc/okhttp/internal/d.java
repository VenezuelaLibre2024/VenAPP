package io.grpc.okhttp.internal;

import javax.security.auth.x500.X500Principal;

/* loaded from: classes3.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f19430a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19431b;

    /* renamed from: c, reason: collision with root package name */
    private int f19432c;

    /* renamed from: d, reason: collision with root package name */
    private int f19433d;

    /* renamed from: e, reason: collision with root package name */
    private int f19434e;

    /* renamed from: f, reason: collision with root package name */
    private int f19435f;

    /* renamed from: g, reason: collision with root package name */
    private char[] f19436g;

    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f19430a = name;
        this.f19431b = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x004d, code lost:
    
        r2 = r8.f19433d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0057, code lost:
    
        return new java.lang.String(r1, r2, r8.f19434e - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a() {
        /*
            r8 = this;
            int r0 = r8.f19432c
            r8.f19433d = r0
            r8.f19434e = r0
        L6:
            int r0 = r8.f19432c
            int r1 = r8.f19431b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f19436g
            int r2 = r8.f19433d
            int r3 = r8.f19434e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f19436g
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
            int r3 = r8.f19434e
            int r4 = r3 + 1
            r8.f19434e = r4
            r1[r3] = r2
            goto L48
        L3a:
            int r0 = r8.f19434e
            int r2 = r0 + 1
            r8.f19434e = r2
            char r2 = r8.d()
            r1[r0] = r2
            int r0 = r8.f19432c
        L48:
            int r0 = r0 + 1
            r8.f19432c = r0
            goto L6
        L4d:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f19433d
            int r3 = r8.f19434e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L58:
            int r2 = r8.f19434e
            r8.f19435f = r2
            int r0 = r0 + 1
            r8.f19432c = r0
            int r0 = r2 + 1
            r8.f19434e = r0
            r1[r2] = r6
        L66:
            int r0 = r8.f19432c
            int r1 = r8.f19431b
            if (r0 >= r1) goto L7f
            char[] r2 = r8.f19436g
            char r7 = r2[r0]
            if (r7 != r6) goto L7f
            int r1 = r8.f19434e
            int r7 = r1 + 1
            r8.f19434e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f19432c = r0
            goto L66
        L7f:
            if (r0 == r1) goto L8b
            char[] r1 = r8.f19436g
            char r0 = r1[r0]
            if (r0 == r3) goto L8b
            if (r0 == r4) goto L8b
            if (r0 != r5) goto L6
        L8b:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f19436g
            int r2 = r8.f19433d
            int r3 = r8.f19435f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.okhttp.internal.d.a():java.lang.String");
    }

    private int c(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        if (i13 >= this.f19431b) {
            throw new IllegalStateException("Malformed DN: " + this.f19430a);
        }
        char[] cArr = this.f19436g;
        char c10 = cArr[i10];
        if (c10 >= '0' && c10 <= '9') {
            i11 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i11 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f19430a);
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
                throw new IllegalStateException("Malformed DN: " + this.f19430a);
            }
            i12 = c11 - '7';
        }
        return (i11 << 4) + i12;
    }

    private char d() {
        int i10 = this.f19432c + 1;
        this.f19432c = i10;
        if (i10 == this.f19431b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f19430a);
        }
        char c10 = this.f19436g[i10];
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
                        return e();
                }
        }
    }

    private char e() {
        int i10;
        int i11;
        int c10 = c(this.f19432c);
        this.f19432c++;
        if (c10 < 128) {
            return (char) c10;
        }
        if (c10 < 192 || c10 > 247) {
            return '?';
        }
        if (c10 <= 223) {
            i10 = c10 & 31;
            i11 = 1;
        } else if (c10 <= 239) {
            i10 = c10 & 15;
            i11 = 2;
        } else {
            i10 = c10 & 7;
            i11 = 3;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f19432c + 1;
            this.f19432c = i13;
            if (i13 == this.f19431b || this.f19436g[i13] != '\\') {
                return '?';
            }
            int i14 = i13 + 1;
            this.f19432c = i14;
            int c11 = c(i14);
            this.f19432c++;
            if ((c11 & 192) != 128) {
                return '?';
            }
            i10 = (i10 << 6) + (c11 & 63);
        }
        return (char) i10;
    }

    private String f() {
        char[] cArr;
        char c10;
        int i10 = this.f19432c;
        if (i10 + 4 >= this.f19431b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f19430a);
        }
        this.f19433d = i10;
        while (true) {
            this.f19432c = i10 + 1;
            i10 = this.f19432c;
            if (i10 == this.f19431b || (c10 = (cArr = this.f19436g)[i10]) == '+' || c10 == ',' || c10 == ';') {
                break;
            }
            if (c10 == ' ') {
                this.f19434e = i10;
                do {
                    this.f19432c = i10 + 1;
                    i10 = this.f19432c;
                    if (i10 >= this.f19431b) {
                        break;
                    }
                } while (this.f19436g[i10] == ' ');
            } else if (c10 >= 'A' && c10 <= 'F') {
                cArr[i10] = (char) (c10 + ' ');
            }
        }
        this.f19434e = i10;
        int i11 = this.f19434e;
        int i12 = this.f19433d;
        int i13 = i11 - i12;
        if (i13 < 5 || (i13 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f19430a);
        }
        int i14 = i13 / 2;
        byte[] bArr = new byte[i14];
        int i15 = i12 + 1;
        for (int i16 = 0; i16 < i14; i16++) {
            bArr[i16] = (byte) c(i15);
            i15 += 2;
        }
        return new String(this.f19436g, this.f19433d, i13);
    }

    private String g() {
        int i10;
        int i11;
        int i12;
        char c10;
        int i13;
        int i14;
        char c11;
        char c12;
        while (true) {
            i10 = this.f19432c;
            i11 = this.f19431b;
            if (i10 >= i11 || this.f19436g[i10] != ' ') {
                break;
            }
            this.f19432c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.f19433d = i10;
        do {
            this.f19432c = i10 + 1;
            i10 = this.f19432c;
            i12 = this.f19431b;
            if (i10 >= i12 || (c12 = this.f19436g[i10]) == '=') {
                break;
            }
        } while (c12 != ' ');
        if (i10 >= i12) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f19430a);
        }
        this.f19434e = i10;
        if (this.f19436g[i10] == ' ') {
            while (true) {
                i13 = this.f19432c;
                i14 = this.f19431b;
                if (i13 >= i14 || (c11 = this.f19436g[i13]) == '=' || c11 != ' ') {
                    break;
                }
                this.f19432c = i13 + 1;
            }
            if (this.f19436g[i13] != '=' || i13 == i14) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f19430a);
            }
        }
        int i15 = this.f19432c;
        do {
            this.f19432c = i15 + 1;
            i15 = this.f19432c;
            if (i15 >= this.f19431b) {
                break;
            }
        } while (this.f19436g[i15] == ' ');
        int i16 = this.f19434e;
        int i17 = this.f19433d;
        if (i16 - i17 > 4) {
            char[] cArr = this.f19436g;
            if (cArr[i17 + 3] == '.' && (((c10 = cArr[i17]) == 'O' || c10 == 'o') && ((cArr[i17 + 1] == 'I' || cArr[i17 + 1] == 'i') && (cArr[i17 + 2] == 'D' || cArr[i17 + 2] == 'd')))) {
                this.f19433d = i17 + 4;
            }
        }
        char[] cArr2 = this.f19436g;
        int i18 = this.f19433d;
        return new String(cArr2, i18, i16 - i18);
    }

    private String h() {
        int i10 = this.f19432c + 1;
        this.f19432c = i10;
        this.f19433d = i10;
        while (true) {
            this.f19434e = i10;
            int i11 = this.f19432c;
            if (i11 == this.f19431b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f19430a);
            }
            char[] cArr = this.f19436g;
            char c10 = cArr[i11];
            if (c10 == '\"') {
                do {
                    this.f19432c = i11 + 1;
                    i11 = this.f19432c;
                    if (i11 >= this.f19431b) {
                        break;
                    }
                } while (this.f19436g[i11] == ' ');
                char[] cArr2 = this.f19436g;
                int i12 = this.f19433d;
                return new String(cArr2, i12, this.f19434e - i12);
            }
            if (c10 == '\\') {
                cArr[this.f19434e] = d();
            } else {
                cArr[this.f19434e] = c10;
            }
            this.f19432c++;
            i10 = this.f19434e + 1;
        }
    }

    public String b(String str) {
        this.f19432c = 0;
        this.f19433d = 0;
        this.f19434e = 0;
        this.f19435f = 0;
        this.f19436g = this.f19430a.toCharArray();
        String g10 = g();
        if (g10 == null) {
            return null;
        }
        do {
            int i10 = this.f19432c;
            if (i10 == this.f19431b) {
                return null;
            }
            char c10 = this.f19436g[i10];
            String a10 = c10 != '\"' ? c10 != '#' ? (c10 == '+' || c10 == ',' || c10 == ';') ? "" : a() : f() : h();
            if (str.equalsIgnoreCase(g10)) {
                return a10;
            }
            int i11 = this.f19432c;
            if (i11 >= this.f19431b) {
                return null;
            }
            char c11 = this.f19436g[i11];
            if (c11 != ',' && c11 != ';' && c11 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f19430a);
            }
            this.f19432c = i11 + 1;
            g10 = g();
        } while (g10 != null);
        throw new IllegalStateException("Malformed DN: " + this.f19430a);
    }
}
