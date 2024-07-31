package ql;

import com.google.android.libraries.barhopper.RecognitionOptions;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: k */
    public static final b f24361k = new b(null);

    /* renamed from: l */
    private static final char[] f24362l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private final String f24363a;

    /* renamed from: b */
    private final String f24364b;

    /* renamed from: c */
    private final String f24365c;

    /* renamed from: d */
    private final String f24366d;

    /* renamed from: e */
    private final int f24367e;

    /* renamed from: f */
    private final List<String> f24368f;

    /* renamed from: g */
    private final List<String> f24369g;

    /* renamed from: h */
    private final String f24370h;

    /* renamed from: i */
    private final String f24371i;

    /* renamed from: j */
    private final boolean f24372j;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: i */
        public static final C0405a f24373i = new C0405a(null);

        /* renamed from: a */
        private String f24374a;

        /* renamed from: d */
        private String f24377d;

        /* renamed from: f */
        private final List<String> f24379f;

        /* renamed from: g */
        private List<String> f24380g;

        /* renamed from: h */
        private String f24381h;

        /* renamed from: b */
        private String f24375b = "";

        /* renamed from: c */
        private String f24376c = "";

        /* renamed from: e */
        private int f24378e = -1;

        /* renamed from: ql.u$a$a */
        /* loaded from: classes3.dex */
        public static final class C0405a {
            private C0405a() {
            }

            public /* synthetic */ C0405a(kotlin.jvm.internal.g gVar) {
                this();
            }

            public final int e(String str, int i10, int i11) {
                try {
                    int parseInt = Integer.parseInt(b.b(u.f24361k, str, i10, i11, "", false, false, false, false, null, 248, null));
                    boolean z10 = false;
                    if (1 <= parseInt && parseInt < 65536) {
                        z10 = true;
                    }
                    if (z10) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public final int f(String str, int i10, int i11) {
                while (i10 < i11) {
                    char charAt = str.charAt(i10);
                    if (charAt != '[') {
                        if (charAt == ':') {
                            return i10;
                        }
                        i10++;
                    }
                    do {
                        i10++;
                        if (i10 < i11) {
                        }
                        i10++;
                    } while (str.charAt(i10) != ']');
                    i10++;
                }
                return i11;
            }

            public final int g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i10);
                if ((kotlin.jvm.internal.n.f(charAt, 97) < 0 || kotlin.jvm.internal.n.f(charAt, 122) > 0) && (kotlin.jvm.internal.n.f(charAt, 65) < 0 || kotlin.jvm.internal.n.f(charAt, 90) > 0)) {
                    return -1;
                }
                int i12 = i10 + 1;
                while (i12 < i11) {
                    int i13 = i12 + 1;
                    char charAt2 = str.charAt(i12);
                    if (!(((((('a' <= charAt2 && charAt2 < '{') || ('A' <= charAt2 && charAt2 < '[')) || ('0' <= charAt2 && charAt2 < ':')) || charAt2 == '+') || charAt2 == '-') || charAt2 == '.')) {
                        if (charAt2 == ':') {
                            return i12;
                        }
                        return -1;
                    }
                    i12 = i13;
                }
                return -1;
            }

            public final int h(String str, int i10, int i11) {
                int i12 = 0;
                while (i10 < i11) {
                    int i13 = i10 + 1;
                    char charAt = str.charAt(i10);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i12++;
                    i10 = i13;
                }
                return i12;
            }
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f24379f = arrayList;
            arrayList.add("");
        }

        private final int b() {
            int i10 = this.f24378e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = u.f24361k;
            String str = this.f24374a;
            kotlin.jvm.internal.n.b(str);
            return bVar.c(str);
        }

        private final boolean n(String str) {
            boolean r10;
            if (kotlin.jvm.internal.n.a(str, ".")) {
                return true;
            }
            r10 = xk.p.r(str, "%2e", true);
            return r10;
        }

        private final boolean o(String str) {
            boolean r10;
            boolean r11;
            boolean r12;
            if (kotlin.jvm.internal.n.a(str, "..")) {
                return true;
            }
            r10 = xk.p.r(str, "%2e.", true);
            if (r10) {
                return true;
            }
            r11 = xk.p.r(str, ".%2e", true);
            if (r11) {
                return true;
            }
            r12 = xk.p.r(str, "%2e%2e", true);
            return r12;
        }

        private final void r() {
            List<String> list = this.f24379f;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.f24379f.isEmpty())) {
                this.f24379f.add("");
            } else {
                List<String> list2 = this.f24379f;
                list2.set(list2.size() - 1, "");
            }
        }

        private final void t(String str, int i10, int i11, boolean z10, boolean z11) {
            String b10 = b.b(u.f24361k, str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, null, 240, null);
            if (n(b10)) {
                return;
            }
            if (o(b10)) {
                r();
                return;
            }
            List<String> list = this.f24379f;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.f24379f;
                list2.set(list2.size() - 1, b10);
            } else {
                this.f24379f.add(b10);
            }
            if (z10) {
                this.f24379f.add("");
            }
        }

        private final void w(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char charAt = str.charAt(i10);
            if (charAt == '/' || charAt == '\\') {
                this.f24379f.clear();
                this.f24379f.add("");
                i10++;
            } else {
                List<String> list = this.f24379f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i12 = i10;
                while (i12 < i11) {
                    i10 = rl.d.q(str, "/\\", i12, i11);
                    boolean z10 = i10 < i11;
                    t(str, i12, i10, z10, true);
                    if (z10) {
                        i12 = i10 + 1;
                    }
                }
                return;
            }
        }

        public final void A(List<String> list) {
            this.f24380g = list;
        }

        public final void B(String str) {
            kotlin.jvm.internal.n.e(str, "<set-?>");
            this.f24375b = str;
        }

        public final void C(String str) {
            this.f24377d = str;
        }

        public final void D(int i10) {
            this.f24378e = i10;
        }

        public final void E(String str) {
            this.f24374a = str;
        }

        public final a F(String username) {
            kotlin.jvm.internal.n.e(username, "username");
            B(b.b(u.f24361k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final u a() {
            int r10;
            ArrayList arrayList;
            int r11;
            String str = this.f24374a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = u.f24361k;
            String h10 = b.h(bVar, this.f24375b, 0, 0, false, 7, null);
            String h11 = b.h(bVar, this.f24376c, 0, 0, false, 7, null);
            String str2 = this.f24377d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int b10 = b();
            List<String> list = this.f24379f;
            r10 = dk.s.r(list, 10);
            ArrayList arrayList2 = new ArrayList(r10);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.h(u.f24361k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f24380g;
            if (list2 == null) {
                arrayList = null;
            } else {
                List<String> list3 = list2;
                r11 = dk.s.r(list3, 10);
                arrayList = new ArrayList(r11);
                for (String str3 : list3) {
                    arrayList.add(str3 == null ? null : b.h(u.f24361k, str3, 0, 0, true, 3, null));
                }
            }
            String str4 = this.f24381h;
            return new u(str, h10, h11, str2, b10, arrayList2, arrayList, str4 == null ? null : b.h(u.f24361k, str4, 0, 0, false, 7, null), toString());
        }

        public final a c(String str) {
            List<String> list = null;
            if (str != null) {
                b bVar = u.f24361k;
                String b10 = b.b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (b10 != null) {
                    list = bVar.j(b10);
                }
            }
            A(list);
            return this;
        }

        public final a d(String str) {
            y(str == null ? null : b.b(u.f24361k, str, 0, 0, "", false, false, false, true, null, 187, null));
            return this;
        }

        public final String e() {
            return this.f24381h;
        }

        public final String f() {
            return this.f24376c;
        }

        public final List<String> g() {
            return this.f24379f;
        }

        public final List<String> h() {
            return this.f24380g;
        }

        public final String i() {
            return this.f24375b;
        }

        public final String j() {
            return this.f24377d;
        }

        public final int k() {
            return this.f24378e;
        }

        public final String l() {
            return this.f24374a;
        }

        public final a m(String host) {
            kotlin.jvm.internal.n.e(host, "host");
            String e10 = rl.a.e(b.h(u.f24361k, host, 0, 0, false, 7, null));
            if (e10 == null) {
                throw new IllegalArgumentException(kotlin.jvm.internal.n.k("unexpected host: ", host));
            }
            C(e10);
            return this;
        }

        public final a p(u uVar, String str) {
            String N0;
            int q10;
            int i10;
            int i11;
            String str2;
            boolean z10;
            int i12;
            String str3;
            int i13;
            boolean z11;
            boolean B;
            boolean B2;
            String input = str;
            kotlin.jvm.internal.n.e(input, "input");
            int A = rl.d.A(input, 0, 0, 3, null);
            int C = rl.d.C(input, A, 0, 2, null);
            C0405a c0405a = f24373i;
            int g10 = c0405a.g(input, A, C);
            String str4 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z12 = true;
            char c10 = 65535;
            if (g10 != -1) {
                B = xk.p.B(input, "https:", A, true);
                if (B) {
                    this.f24374a = "https";
                    A += 6;
                } else {
                    B2 = xk.p.B(input, "http:", A, true);
                    if (!B2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, g10);
                        kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(substring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f24374a = "http";
                    A += 5;
                }
            } else {
                if (uVar == null) {
                    if (str.length() > 6) {
                        N0 = xk.s.N0(input, 6);
                        input = kotlin.jvm.internal.n.k(N0, "...");
                    }
                    throw new IllegalArgumentException(kotlin.jvm.internal.n.k("Expected URL scheme 'http' or 'https' but no scheme was found for ", input));
                }
                this.f24374a = uVar.q();
            }
            int h10 = c0405a.h(input, A, C);
            char c11 = '?';
            char c12 = '#';
            if (h10 >= 2 || uVar == null || !kotlin.jvm.internal.n.a(uVar.q(), this.f24374a)) {
                int i14 = A + h10;
                boolean z13 = false;
                boolean z14 = false;
                while (true) {
                    q10 = rl.d.q(input, "@/\\?#", i14, C);
                    char charAt = q10 != C ? input.charAt(q10) : c10;
                    if (charAt == c10 || charAt == c12 || charAt == '/' || charAt == '\\' || charAt == c11) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z13) {
                            z10 = z12;
                            i12 = C;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f24376c);
                            sb3.append("%40");
                            str3 = str4;
                            i13 = q10;
                            sb3.append(b.b(u.f24361k, str, i14, q10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f24376c = sb3.toString();
                        } else {
                            int p10 = rl.d.p(input, ':', i14, q10);
                            b bVar = u.f24361k;
                            z10 = z12;
                            i12 = C;
                            String str5 = str4;
                            String b10 = b.b(bVar, str, i14, p10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z14) {
                                b10 = this.f24375b + "%40" + b10;
                            }
                            this.f24375b = b10;
                            if (p10 != q10) {
                                this.f24376c = b.b(bVar, str, p10 + 1, q10, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = z10;
                            } else {
                                z11 = z13;
                            }
                            z13 = z11;
                            str3 = str5;
                            z14 = z10;
                            i13 = q10;
                        }
                        i14 = i13 + 1;
                        str4 = str3;
                        z12 = z10;
                        C = i12;
                        c12 = '#';
                        c11 = '?';
                        c10 = 65535;
                    }
                }
                boolean z15 = z12;
                String str6 = str4;
                i10 = C;
                C0405a c0405a2 = f24373i;
                int f10 = c0405a2.f(input, i14, q10);
                int i15 = f10 + 1;
                if (i15 < q10) {
                    i11 = i14;
                    this.f24377d = rl.a.e(b.h(u.f24361k, str, i14, f10, false, 4, null));
                    int e10 = c0405a2.e(input, i15, q10);
                    this.f24378e = e10;
                    if (!(e10 != -1 ? z15 : false)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = input.substring(i15, q10);
                        kotlin.jvm.internal.n.d(substring2, str6);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    str2 = str6;
                } else {
                    i11 = i14;
                    str2 = str6;
                    b bVar2 = u.f24361k;
                    this.f24377d = rl.a.e(b.h(bVar2, str, i11, f10, false, 4, null));
                    String str7 = this.f24374a;
                    kotlin.jvm.internal.n.b(str7);
                    this.f24378e = bVar2.c(str7);
                }
                if (!(this.f24377d != null ? z15 : false)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = input.substring(i11, f10);
                    kotlin.jvm.internal.n.d(substring3, str2);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                A = q10;
            } else {
                this.f24375b = uVar.g();
                this.f24376c = uVar.c();
                this.f24377d = uVar.h();
                this.f24378e = uVar.m();
                this.f24379f.clear();
                this.f24379f.addAll(uVar.e());
                if (A == C || input.charAt(A) == '#') {
                    c(uVar.f());
                }
                i10 = C;
            }
            int i16 = i10;
            int q11 = rl.d.q(input, "?#", A, i16);
            w(input, A, q11);
            if (q11 < i16 && input.charAt(q11) == '?') {
                int p11 = rl.d.p(input, '#', q11, i16);
                b bVar3 = u.f24361k;
                this.f24380g = bVar3.j(b.b(bVar3, str, q11 + 1, p11, " \"'<>#", true, false, true, false, null, 208, null));
                q11 = p11;
            }
            if (q11 < i16 && input.charAt(q11) == '#') {
                this.f24381h = b.b(u.f24361k, str, q11 + 1, i16, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        public final a q(String password) {
            kotlin.jvm.internal.n.e(password, "password");
            z(b.b(u.f24361k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        public final a s(int i10) {
            boolean z10 = false;
            if (1 <= i10 && i10 < 65536) {
                z10 = true;
            }
            if (!z10) {
                throw new IllegalArgumentException(kotlin.jvm.internal.n.k("unexpected port: ", Integer.valueOf(i10)).toString());
            }
            D(i10);
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        
            if ((f().length() > 0) != false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
        
            if (r1 != r2.c(r3)) goto L85;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.l()
                if (r1 == 0) goto L15
                java.lang.String r1 = r6.l()
                r0.append(r1)
                java.lang.String r1 = "://"
                goto L17
            L15:
                java.lang.String r1 = "//"
            L17:
                r0.append(r1)
                java.lang.String r1 = r6.i()
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L28
                r1 = r2
                goto L29
            L28:
                r1 = r3
            L29:
                r4 = 58
                if (r1 != 0) goto L3c
                java.lang.String r1 = r6.f()
                int r1 = r1.length()
                if (r1 <= 0) goto L39
                r1 = r2
                goto L3a
            L39:
                r1 = r3
            L3a:
                if (r1 == 0) goto L60
            L3c:
                java.lang.String r1 = r6.i()
                r0.append(r1)
                java.lang.String r1 = r6.f()
                int r1 = r1.length()
                if (r1 <= 0) goto L4e
                goto L4f
            L4e:
                r2 = r3
            L4f:
                if (r2 == 0) goto L5b
                r0.append(r4)
                java.lang.String r1 = r6.f()
                r0.append(r1)
            L5b:
                r1 = 64
                r0.append(r1)
            L60:
                java.lang.String r1 = r6.j()
                if (r1 == 0) goto L8e
                java.lang.String r1 = r6.j()
                kotlin.jvm.internal.n.b(r1)
                r2 = 2
                r5 = 0
                boolean r1 = xk.g.I(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L87
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.j()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L8e
            L87:
                java.lang.String r1 = r6.j()
                r0.append(r1)
            L8e:
                int r1 = r6.k()
                r2 = -1
                if (r1 != r2) goto L9b
                java.lang.String r1 = r6.l()
                if (r1 == 0) goto Lba
            L9b:
                int r1 = r6.b()
                java.lang.String r2 = r6.l()
                if (r2 == 0) goto Lb4
                ql.u$b r2 = ql.u.f24361k
                java.lang.String r3 = r6.l()
                kotlin.jvm.internal.n.b(r3)
                int r2 = r2.c(r3)
                if (r1 == r2) goto Lba
            Lb4:
                r0.append(r4)
                r0.append(r1)
            Lba:
                ql.u$b r1 = ql.u.f24361k
                java.util.List r2 = r6.g()
                r1.i(r2, r0)
                java.util.List r2 = r6.h()
                if (r2 == 0) goto Ld8
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.h()
                kotlin.jvm.internal.n.b(r2)
                r1.k(r2, r0)
            Ld8:
                java.lang.String r1 = r6.e()
                if (r1 == 0) goto Lea
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.e()
                r0.append(r1)
            Lea:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.n.d(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ql.u.a.toString():java.lang.String");
        }

        public final a u(String str) {
            List<String> list = null;
            if (str != null) {
                b bVar = u.f24361k;
                String b10 = b.b(bVar, str, 0, 0, " \"'<>#", false, false, true, false, null, 219, null);
                if (b10 != null) {
                    list = bVar.j(b10);
                }
            }
            A(list);
            return this;
        }

        public final a v() {
            String j10 = j();
            C(j10 == null ? null : new xk.f("[\"<>^`{|}]").b(j10, ""));
            int size = g().size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                g().set(i11, b.b(u.f24361k, g().get(i11), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> h10 = h();
            if (h10 != null) {
                int size2 = h10.size();
                while (i10 < size2) {
                    int i12 = i10 + 1;
                    String str = h10.get(i10);
                    h10.set(i10, str == null ? null : b.b(u.f24361k, str, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null));
                    i10 = i12;
                }
            }
            String e10 = e();
            y(e10 != null ? b.b(u.f24361k, e10, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null);
            return this;
        }

        public final a x(String scheme) {
            boolean r10;
            boolean r11;
            kotlin.jvm.internal.n.e(scheme, "scheme");
            String str = "http";
            r10 = xk.p.r(scheme, "http", true);
            if (!r10) {
                str = "https";
                r11 = xk.p.r(scheme, "https", true);
                if (!r11) {
                    throw new IllegalArgumentException(kotlin.jvm.internal.n.k("unexpected scheme: ", scheme));
                }
            }
            E(str);
            return this;
        }

        public final void y(String str) {
            this.f24381h = str;
        }

        public final void z(String str) {
            kotlin.jvm.internal.n.e(str, "<set-?>");
            this.f24376c = str;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public static /* synthetic */ String b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            return bVar.a(str, (i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? str.length() : i11, str2, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & RecognitionOptions.ITF) != 0 ? null : charset);
        }

        private final boolean e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && rl.d.H(str.charAt(i10 + 1)) != -1 && rl.d.H(str.charAt(i12)) != -1;
        }

        public static /* synthetic */ String h(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.g(str, i10, i11, z10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
        
            if (e(r16, r5, r18) == false) goto L101;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void l(dm.b r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            Lb:
                if (r5 >= r2) goto Lb9
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L28
                r8 = 9
                if (r7 == r8) goto L23
                r8 = 10
                if (r7 == r8) goto L23
                r8 = 12
                if (r7 == r8) goto L23
                r8 = 13
                if (r7 != r8) goto L28
            L23:
                r8 = r14
                r12 = r19
                goto Lb2
            L28:
                r8 = 43
                if (r7 != r8) goto L39
                if (r22 == 0) goto L39
                if (r20 == 0) goto L33
                java.lang.String r8 = "+"
                goto L35
            L33:
                java.lang.String r8 = "%2B"
            L35:
                r15.T(r8)
                goto L23
            L39:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L69
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L69
                r8 = 128(0x80, float:1.8E-43)
                if (r7 < r8) goto L49
                if (r23 == 0) goto L69
            L49:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = xk.g.I(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L67
                if (r7 != r9) goto L62
                if (r20 == 0) goto L67
                if (r21 == 0) goto L62
                r8 = r14
                boolean r10 = r14.e(r1, r5, r2)
                if (r10 != 0) goto L63
                goto L6c
            L62:
                r8 = r14
            L63:
                r15.q1(r7)
                goto Lb2
            L67:
                r8 = r14
                goto L6c
            L69:
                r8 = r14
                r12 = r19
            L6c:
                if (r6 != 0) goto L73
                dm.b r6 = new dm.b
                r6.<init>()
            L73:
                if (r3 == 0) goto L87
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = kotlin.jvm.internal.n.a(r3, r10)
                if (r10 == 0) goto L7e
                goto L87
            L7e:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.a1(r1, r5, r10, r3)
                goto L8a
            L87:
                r6.q1(r7)
            L8a:
                boolean r10 = r6.G0()
                if (r10 != 0) goto Lb2
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = ql.u.a()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = ql.u.a()
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L8a
            Lb2:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto Lb
            Lb9:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ql.u.b.l(dm.b, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        private final void m(dm.b bVar, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int codePointAt = str.codePointAt(i10);
                if (codePointAt != 37 || (i12 = i10 + 2) >= i11) {
                    if (codePointAt == 43 && z10) {
                        bVar.writeByte(32);
                        i10++;
                    }
                    bVar.q1(codePointAt);
                    i10 += Character.charCount(codePointAt);
                } else {
                    int H = rl.d.H(str.charAt(i10 + 1));
                    int H2 = rl.d.H(str.charAt(i12));
                    if (H != -1 && H2 != -1) {
                        bVar.writeByte((H << 4) + H2);
                        i10 = Character.charCount(codePointAt) + i12;
                    }
                    bVar.q1(codePointAt);
                    i10 += Character.charCount(codePointAt);
                }
            }
        }

        public final String a(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            boolean I;
            kotlin.jvm.internal.n.e(str, "<this>");
            kotlin.jvm.internal.n.e(encodeSet, "encodeSet");
            int i12 = i10;
            while (i12 < i11) {
                int codePointAt = str.codePointAt(i12);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z13)) {
                    I = xk.q.I(encodeSet, (char) codePointAt, false, 2, null);
                    if (!I) {
                        if (codePointAt == 37) {
                            if (z10) {
                                if (z11) {
                                    if (!e(str, i12, i11)) {
                                        dm.b bVar = new dm.b();
                                        bVar.j1(str, i10, i12);
                                        l(bVar, str, i12, i11, encodeSet, z10, z11, z12, z13, charset);
                                        return bVar.h0();
                                    }
                                    if (codePointAt != 43 && z12) {
                                        dm.b bVar2 = new dm.b();
                                        bVar2.j1(str, i10, i12);
                                        l(bVar2, str, i12, i11, encodeSet, z10, z11, z12, z13, charset);
                                        return bVar2.h0();
                                    }
                                    i12 += Character.charCount(codePointAt);
                                }
                            }
                        }
                        if (codePointAt != 43) {
                        }
                        i12 += Character.charCount(codePointAt);
                    }
                }
                dm.b bVar22 = new dm.b();
                bVar22.j1(str, i10, i12);
                l(bVar22, str, i12, i11, encodeSet, z10, z11, z12, z13, charset);
                return bVar22.h0();
            }
            String substring = str.substring(i10, i11);
            kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final int c(String scheme) {
            kotlin.jvm.internal.n.e(scheme, "scheme");
            if (kotlin.jvm.internal.n.a(scheme, "http")) {
                return 80;
            }
            return kotlin.jvm.internal.n.a(scheme, "https") ? 443 : -1;
        }

        public final u d(String str) {
            kotlin.jvm.internal.n.e(str, "<this>");
            return new a().p(null, str).a();
        }

        public final u f(String str) {
            kotlin.jvm.internal.n.e(str, "<this>");
            try {
                return d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public final String g(String str, int i10, int i11, boolean z10) {
            kotlin.jvm.internal.n.e(str, "<this>");
            int i12 = i10;
            while (i12 < i11) {
                int i13 = i12 + 1;
                char charAt = str.charAt(i12);
                if (charAt == '%' || (charAt == '+' && z10)) {
                    dm.b bVar = new dm.b();
                    bVar.j1(str, i10, i12);
                    m(bVar, str, i12, i11, z10);
                    return bVar.h0();
                }
                i12 = i13;
            }
            String substring = str.substring(i10, i11);
            kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        public final void i(List<String> list, StringBuilder out) {
            kotlin.jvm.internal.n.e(list, "<this>");
            kotlin.jvm.internal.n.e(out, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append('/');
                out.append(list.get(i10));
            }
        }

        public final List<String> j(String str) {
            int T;
            int T2;
            String str2;
            kotlin.jvm.internal.n.e(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                T = xk.q.T(str, '&', i10, false, 4, null);
                if (T == -1) {
                    T = str.length();
                }
                int i11 = T;
                T2 = xk.q.T(str, '=', i10, false, 4, null);
                if (T2 == -1 || T2 > i11) {
                    String substring = str.substring(i10, i11);
                    kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    str2 = null;
                } else {
                    String substring2 = str.substring(i10, T2);
                    kotlin.jvm.internal.n.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    str2 = str.substring(T2 + 1, i11);
                    kotlin.jvm.internal.n.d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(str2);
                i10 = i11 + 1;
            }
            return arrayList;
        }

        public final void k(List<String> list, StringBuilder out) {
            uk.f k10;
            uk.d j10;
            kotlin.jvm.internal.n.e(list, "<this>");
            kotlin.jvm.internal.n.e(out, "out");
            k10 = uk.l.k(0, list.size());
            j10 = uk.l.j(k10, 2);
            int c10 = j10.c();
            int d10 = j10.d();
            int f10 = j10.f();
            if ((f10 <= 0 || c10 > d10) && (f10 >= 0 || d10 > c10)) {
                return;
            }
            while (true) {
                int i10 = c10 + f10;
                String str = list.get(c10);
                String str2 = list.get(c10 + 1);
                if (c10 > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (c10 == d10) {
                    return;
                } else {
                    c10 = i10;
                }
            }
        }
    }

    public u(String scheme, String username, String password, String host, int i10, List<String> pathSegments, List<String> list, String str, String url) {
        kotlin.jvm.internal.n.e(scheme, "scheme");
        kotlin.jvm.internal.n.e(username, "username");
        kotlin.jvm.internal.n.e(password, "password");
        kotlin.jvm.internal.n.e(host, "host");
        kotlin.jvm.internal.n.e(pathSegments, "pathSegments");
        kotlin.jvm.internal.n.e(url, "url");
        this.f24363a = scheme;
        this.f24364b = username;
        this.f24365c = password;
        this.f24366d = host;
        this.f24367e = i10;
        this.f24368f = pathSegments;
        this.f24369g = list;
        this.f24370h = str;
        this.f24371i = url;
        this.f24372j = kotlin.jvm.internal.n.a(scheme, "https");
    }

    public static final u l(String str) {
        return f24361k.f(str);
    }

    public final String b() {
        int T;
        if (this.f24370h == null) {
            return null;
        }
        T = xk.q.T(this.f24371i, '#', 0, false, 6, null);
        String substring = this.f24371i.substring(T + 1);
        kotlin.jvm.internal.n.d(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public final String c() {
        int T;
        int T2;
        if (this.f24365c.length() == 0) {
            return "";
        }
        T = xk.q.T(this.f24371i, ':', this.f24363a.length() + 3, false, 4, null);
        T2 = xk.q.T(this.f24371i, '@', 0, false, 6, null);
        String substring = this.f24371i.substring(T + 1, T2);
        kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String d() {
        int T;
        T = xk.q.T(this.f24371i, '/', this.f24363a.length() + 3, false, 4, null);
        String str = this.f24371i;
        String substring = this.f24371i.substring(T, rl.d.q(str, "?#", T, str.length()));
        kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final List<String> e() {
        int T;
        T = xk.q.T(this.f24371i, '/', this.f24363a.length() + 3, false, 4, null);
        String str = this.f24371i;
        int q10 = rl.d.q(str, "?#", T, str.length());
        ArrayList arrayList = new ArrayList();
        while (T < q10) {
            int i10 = T + 1;
            int p10 = rl.d.p(this.f24371i, '/', i10, q10);
            String substring = this.f24371i.substring(i10, p10);
            kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            T = p10;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && kotlin.jvm.internal.n.a(((u) obj).f24371i, this.f24371i);
    }

    public final String f() {
        int T;
        if (this.f24369g == null) {
            return null;
        }
        T = xk.q.T(this.f24371i, '?', 0, false, 6, null);
        int i10 = T + 1;
        String str = this.f24371i;
        String substring = this.f24371i.substring(i10, rl.d.p(str, '#', i10, str.length()));
        kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String g() {
        if (this.f24364b.length() == 0) {
            return "";
        }
        int length = this.f24363a.length() + 3;
        String str = this.f24371i;
        String substring = this.f24371i.substring(length, rl.d.q(str, ":@", length, str.length()));
        kotlin.jvm.internal.n.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public final String h() {
        return this.f24366d;
    }

    public int hashCode() {
        return this.f24371i.hashCode();
    }

    public final boolean i() {
        return this.f24372j;
    }

    public final a j() {
        a aVar = new a();
        aVar.E(this.f24363a);
        aVar.B(g());
        aVar.z(c());
        aVar.C(this.f24366d);
        aVar.D(this.f24367e != f24361k.c(this.f24363a) ? this.f24367e : -1);
        aVar.g().clear();
        aVar.g().addAll(e());
        aVar.c(f());
        aVar.y(b());
        return aVar;
    }

    public final a k(String link) {
        kotlin.jvm.internal.n.e(link, "link");
        try {
            return new a().p(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int m() {
        return this.f24367e;
    }

    public final String n() {
        if (this.f24369g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f24361k.k(this.f24369g, sb2);
        return sb2.toString();
    }

    public final String o() {
        a k10 = k("/...");
        kotlin.jvm.internal.n.b(k10);
        return k10.F("").q("").a().toString();
    }

    public final u p(String link) {
        kotlin.jvm.internal.n.e(link, "link");
        a k10 = k(link);
        if (k10 == null) {
            return null;
        }
        return k10.a();
    }

    public final String q() {
        return this.f24363a;
    }

    public final URI r() {
        String aVar = j().v().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                URI create = URI.create(new xk.f("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(aVar, ""));
                kotlin.jvm.internal.n.d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final URL s() {
        try {
            return new URL(this.f24371i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f24371i;
    }
}
