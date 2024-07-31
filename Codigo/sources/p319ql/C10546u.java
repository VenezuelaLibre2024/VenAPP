package p319ql;

import com.google.android.libraries.barhopper.RecognitionOptions;
import dk.C7033s;
import dm.C7056b;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p341rl.C10724a;
import p341rl.C10727d;
import p450xk.C12514f;
import p450xk.C12524p;
import p450xk.C12525q;
import p450xk.C12527s;
import uk.C11577d;
import uk.C11579f;
import uk.C11585l;

/* renamed from: ql.u */
/* loaded from: classes3.dex */
public final class C10546u {

    /* renamed from: k */
    public static final b f26455k = new b(null);

    /* renamed from: l */
    private static final char[] f26456l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    private final String f26457a;

    /* renamed from: b */
    private final String f26458b;

    /* renamed from: c */
    private final String f26459c;

    /* renamed from: d */
    private final String f26460d;

    /* renamed from: e */
    private final int f26461e;

    /* renamed from: f */
    private final List<String> f26462f;

    /* renamed from: g */
    private final List<String> f26463g;

    /* renamed from: h */
    private final String f26464h;

    /* renamed from: i */
    private final String f26465i;

    /* renamed from: j */
    private final boolean f26466j;

    /* renamed from: ql.u$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: i */
        public static final C13240a f26467i = new C13240a(null);

        /* renamed from: a */
        private String f26468a;

        /* renamed from: d */
        private String f26471d;

        /* renamed from: f */
        private final List<String> f26473f;

        /* renamed from: g */
        private List<String> f26474g;

        /* renamed from: h */
        private String f26475h;

        /* renamed from: b */
        private String f26469b = "";

        /* renamed from: c */
        private String f26470c = "";

        /* renamed from: e */
        private int f26472e = -1;

        /* renamed from: ql.u$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C13240a {
            private C13240a() {
            }

            public /* synthetic */ C13240a(C9315g c9315g) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public final int m31921e(String str, int i10, int i11) {
                try {
                    int parseInt = Integer.parseInt(b.m31925b(C10546u.f26455k, str, i10, i11, "", false, false, false, false, null, 248, null));
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

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: f */
            public final int m31922f(String str, int i10, int i11) {
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

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: g */
            public final int m31923g(String str, int i10, int i11) {
                if (i11 - i10 < 2) {
                    return -1;
                }
                char charAt = str.charAt(i10);
                if ((C9322n.m27782f(charAt, 97) < 0 || C9322n.m27782f(charAt, 122) > 0) && (C9322n.m27782f(charAt, 65) < 0 || C9322n.m27782f(charAt, 90) > 0)) {
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

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: h */
            public final int m31924h(String str, int i10, int i11) {
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
            this.f26473f = arrayList;
            arrayList.add("");
        }

        /* renamed from: b */
        private final int m31885b() {
            int i10 = this.f26472e;
            if (i10 != -1) {
                return i10;
            }
            b bVar = C10546u.f26455k;
            String str = this.f26468a;
            C9322n.m27778b(str);
            return bVar.m31931c(str);
        }

        /* renamed from: n */
        private final boolean m31886n(String str) {
            boolean m41037r;
            if (C9322n.m27777a(str, ".")) {
                return true;
            }
            m41037r = C12524p.m41037r(str, "%2e", true);
            return m41037r;
        }

        /* renamed from: o */
        private final boolean m31887o(String str) {
            boolean m41037r;
            boolean m41037r2;
            boolean m41037r3;
            if (C9322n.m27777a(str, "..")) {
                return true;
            }
            m41037r = C12524p.m41037r(str, "%2e.", true);
            if (m41037r) {
                return true;
            }
            m41037r2 = C12524p.m41037r(str, ".%2e", true);
            if (m41037r2) {
                return true;
            }
            m41037r3 = C12524p.m41037r(str, "%2e%2e", true);
            return m41037r3;
        }

        /* renamed from: r */
        private final void m31888r() {
            List<String> list = this.f26473f;
            if (!(list.remove(list.size() - 1).length() == 0) || !(!this.f26473f.isEmpty())) {
                this.f26473f.add("");
            } else {
                List<String> list2 = this.f26473f;
                list2.set(list2.size() - 1, "");
            }
        }

        /* renamed from: t */
        private final void m31889t(String str, int i10, int i11, boolean z10, boolean z11) {
            String m31925b = b.m31925b(C10546u.f26455k, str, i10, i11, " \"<>^`{}|/\\?#", z11, false, false, false, null, 240, null);
            if (m31886n(m31925b)) {
                return;
            }
            if (m31887o(m31925b)) {
                m31888r();
                return;
            }
            List<String> list = this.f26473f;
            if (list.get(list.size() - 1).length() == 0) {
                List<String> list2 = this.f26473f;
                list2.set(list2.size() - 1, m31925b);
            } else {
                this.f26473f.add(m31925b);
            }
            if (z10) {
                this.f26473f.add("");
            }
        }

        /* renamed from: w */
        private final void m31890w(String str, int i10, int i11) {
            if (i10 == i11) {
                return;
            }
            char charAt = str.charAt(i10);
            if (charAt == '/' || charAt == '\\') {
                this.f26473f.clear();
                this.f26473f.add("");
                i10++;
            } else {
                List<String> list = this.f26473f;
                list.set(list.size() - 1, "");
            }
            while (true) {
                int i12 = i10;
                while (i12 < i11) {
                    i10 = C10727d.m32657q(str, "/\\", i12, i11);
                    boolean z10 = i10 < i11;
                    m31889t(str, i12, i10, z10, true);
                    if (z10) {
                        i12 = i10 + 1;
                    }
                }
                return;
            }
        }

        /* renamed from: A */
        public final void m31891A(List<String> list) {
            this.f26474g = list;
        }

        /* renamed from: B */
        public final void m31892B(String str) {
            C9322n.m27781e(str, "<set-?>");
            this.f26469b = str;
        }

        /* renamed from: C */
        public final void m31893C(String str) {
            this.f26471d = str;
        }

        /* renamed from: D */
        public final void m31894D(int i10) {
            this.f26472e = i10;
        }

        /* renamed from: E */
        public final void m31895E(String str) {
            this.f26468a = str;
        }

        /* renamed from: F */
        public final a m31896F(String username) {
            C9322n.m27781e(username, "username");
            m31892B(b.m31925b(C10546u.f26455k, username, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        /* renamed from: a */
        public final C10546u m31897a() {
            int m20590r;
            ArrayList arrayList;
            int m20590r2;
            String str = this.f26468a;
            if (str == null) {
                throw new IllegalStateException("scheme == null");
            }
            b bVar = C10546u.f26455k;
            String m31927h = b.m31927h(bVar, this.f26469b, 0, 0, false, 7, null);
            String m31927h2 = b.m31927h(bVar, this.f26470c, 0, 0, false, 7, null);
            String str2 = this.f26471d;
            if (str2 == null) {
                throw new IllegalStateException("host == null");
            }
            int m31885b = m31885b();
            List<String> list = this.f26473f;
            m20590r = C7033s.m20590r(list, 10);
            ArrayList arrayList2 = new ArrayList(m20590r);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(b.m31927h(C10546u.f26455k, (String) it.next(), 0, 0, false, 7, null));
            }
            List<String> list2 = this.f26474g;
            if (list2 == null) {
                arrayList = null;
            } else {
                List<String> list3 = list2;
                m20590r2 = C7033s.m20590r(list3, 10);
                arrayList = new ArrayList(m20590r2);
                for (String str3 : list3) {
                    arrayList.add(str3 == null ? null : b.m31927h(C10546u.f26455k, str3, 0, 0, true, 3, null));
                }
            }
            String str4 = this.f26475h;
            return new C10546u(str, m31927h, m31927h2, str2, m31885b, arrayList2, arrayList, str4 == null ? null : b.m31927h(C10546u.f26455k, str4, 0, 0, false, 7, null), toString());
        }

        /* renamed from: c */
        public final a m31898c(String str) {
            List<String> list = null;
            if (str != null) {
                b bVar = C10546u.f26455k;
                String m31925b = b.m31925b(bVar, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (m31925b != null) {
                    list = bVar.m31936j(m31925b);
                }
            }
            m31891A(list);
            return this;
        }

        /* renamed from: d */
        public final a m31899d(String str) {
            m31915y(str == null ? null : b.m31925b(C10546u.f26455k, str, 0, 0, "", false, false, false, true, null, 187, null));
            return this;
        }

        /* renamed from: e */
        public final String m31900e() {
            return this.f26475h;
        }

        /* renamed from: f */
        public final String m31901f() {
            return this.f26470c;
        }

        /* renamed from: g */
        public final List<String> m31902g() {
            return this.f26473f;
        }

        /* renamed from: h */
        public final List<String> m31903h() {
            return this.f26474g;
        }

        /* renamed from: i */
        public final String m31904i() {
            return this.f26469b;
        }

        /* renamed from: j */
        public final String m31905j() {
            return this.f26471d;
        }

        /* renamed from: k */
        public final int m31906k() {
            return this.f26472e;
        }

        /* renamed from: l */
        public final String m31907l() {
            return this.f26468a;
        }

        /* renamed from: m */
        public final a m31908m(String host) {
            C9322n.m27781e(host, "host");
            String m32614e = C10724a.m32614e(b.m31927h(C10546u.f26455k, host, 0, 0, false, 7, null));
            if (m32614e == null) {
                throw new IllegalArgumentException(C9322n.m27787k("unexpected host: ", host));
            }
            m31893C(m32614e);
            return this;
        }

        /* renamed from: p */
        public final a m31909p(C10546u c10546u, String str) {
            String m41109N0;
            int m32657q;
            int i10;
            int i11;
            String str2;
            boolean z10;
            int i12;
            String str3;
            int i13;
            boolean z11;
            boolean m41028B;
            boolean m41028B2;
            String input = str;
            C9322n.m27781e(input, "input");
            int m32615A = C10727d.m32615A(input, 0, 0, 3, null);
            int m32617C = C10727d.m32617C(input, m32615A, 0, 2, null);
            C13240a c13240a = f26467i;
            int m31923g = c13240a.m31923g(input, m32615A, m32617C);
            String str4 = "this as java.lang.String…ing(startIndex, endIndex)";
            boolean z12 = true;
            char c10 = 65535;
            if (m31923g != -1) {
                m41028B = C12524p.m41028B(input, "https:", m32615A, true);
                if (m41028B) {
                    this.f26468a = "https";
                    m32615A += 6;
                } else {
                    m41028B2 = C12524p.m41028B(input, "http:", m32615A, true);
                    if (!m41028B2) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected URL scheme 'http' or 'https' but was '");
                        String substring = input.substring(0, m31923g);
                        C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        sb2.append(substring);
                        sb2.append('\'');
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    this.f26468a = "http";
                    m32615A += 5;
                }
            } else {
                if (c10546u == null) {
                    if (str.length() > 6) {
                        m41109N0 = C12527s.m41109N0(input, 6);
                        input = C9322n.m27787k(m41109N0, "...");
                    }
                    throw new IllegalArgumentException(C9322n.m27787k("Expected URL scheme 'http' or 'https' but no scheme was found for ", input));
                }
                this.f26468a = c10546u.m31882q();
            }
            int m31924h = c13240a.m31924h(input, m32615A, m32617C);
            char c11 = '?';
            char c12 = '#';
            if (m31924h >= 2 || c10546u == null || !C9322n.m27777a(c10546u.m31882q(), this.f26468a)) {
                int i14 = m32615A + m31924h;
                boolean z13 = false;
                boolean z14 = false;
                while (true) {
                    m32657q = C10727d.m32657q(input, "@/\\?#", i14, m32617C);
                    char charAt = m32657q != m32617C ? input.charAt(m32657q) : c10;
                    if (charAt == c10 || charAt == c12 || charAt == '/' || charAt == '\\' || charAt == c11) {
                        break;
                    }
                    if (charAt == '@') {
                        if (z13) {
                            z10 = z12;
                            i12 = m32617C;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(this.f26470c);
                            sb3.append("%40");
                            str3 = str4;
                            i13 = m32657q;
                            sb3.append(b.m31925b(C10546u.f26455k, str, i14, m32657q, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                            this.f26470c = sb3.toString();
                        } else {
                            int m32656p = C10727d.m32656p(input, ':', i14, m32657q);
                            b bVar = C10546u.f26455k;
                            z10 = z12;
                            i12 = m32617C;
                            String str5 = str4;
                            String m31925b = b.m31925b(bVar, str, i14, m32656p, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            if (z14) {
                                m31925b = this.f26469b + "%40" + m31925b;
                            }
                            this.f26469b = m31925b;
                            if (m32656p != m32657q) {
                                this.f26470c = b.m31925b(bVar, str, m32656p + 1, m32657q, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                z11 = z10;
                            } else {
                                z11 = z13;
                            }
                            z13 = z11;
                            str3 = str5;
                            z14 = z10;
                            i13 = m32657q;
                        }
                        i14 = i13 + 1;
                        str4 = str3;
                        z12 = z10;
                        m32617C = i12;
                        c12 = '#';
                        c11 = '?';
                        c10 = 65535;
                    }
                }
                boolean z15 = z12;
                String str6 = str4;
                i10 = m32617C;
                C13240a c13240a2 = f26467i;
                int m31922f = c13240a2.m31922f(input, i14, m32657q);
                int i15 = m31922f + 1;
                if (i15 < m32657q) {
                    i11 = i14;
                    this.f26471d = C10724a.m32614e(b.m31927h(C10546u.f26455k, str, i14, m31922f, false, 4, null));
                    int m31921e = c13240a2.m31921e(input, i15, m32657q);
                    this.f26472e = m31921e;
                    if (!(m31921e != -1 ? z15 : false)) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        String substring2 = input.substring(i15, m32657q);
                        C9322n.m27780d(substring2, str6);
                        sb4.append(substring2);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                    str2 = str6;
                } else {
                    i11 = i14;
                    str2 = str6;
                    b bVar2 = C10546u.f26455k;
                    this.f26471d = C10724a.m32614e(b.m31927h(bVar2, str, i11, m31922f, false, 4, null));
                    String str7 = this.f26468a;
                    C9322n.m27778b(str7);
                    this.f26472e = bVar2.m31931c(str7);
                }
                if (!(this.f26471d != null ? z15 : false)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    String substring3 = input.substring(i11, m31922f);
                    C9322n.m27780d(substring3, str2);
                    sb5.append(substring3);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                m32615A = m32657q;
            } else {
                this.f26469b = c10546u.m31873g();
                this.f26470c = c10546u.m31869c();
                this.f26471d = c10546u.m31874h();
                this.f26472e = c10546u.m31878m();
                this.f26473f.clear();
                this.f26473f.addAll(c10546u.m31871e());
                if (m32615A == m32617C || input.charAt(m32615A) == '#') {
                    m31898c(c10546u.m31872f());
                }
                i10 = m32617C;
            }
            int i16 = i10;
            int m32657q2 = C10727d.m32657q(input, "?#", m32615A, i16);
            m31890w(input, m32615A, m32657q2);
            if (m32657q2 < i16 && input.charAt(m32657q2) == '?') {
                int m32656p2 = C10727d.m32656p(input, '#', m32657q2, i16);
                b bVar3 = C10546u.f26455k;
                this.f26474g = bVar3.m31936j(b.m31925b(bVar3, str, m32657q2 + 1, m32656p2, " \"'<>#", true, false, true, false, null, 208, null));
                m32657q2 = m32656p2;
            }
            if (m32657q2 < i16 && input.charAt(m32657q2) == '#') {
                this.f26475h = b.m31925b(C10546u.f26455k, str, m32657q2 + 1, i16, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        /* renamed from: q */
        public final a m31910q(String password) {
            C9322n.m27781e(password, "password");
            m31916z(b.m31925b(C10546u.f26455k, password, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null));
            return this;
        }

        /* renamed from: s */
        public final a m31911s(int i10) {
            boolean z10 = false;
            if (1 <= i10 && i10 < 65536) {
                z10 = true;
            }
            if (!z10) {
                throw new IllegalArgumentException(C9322n.m27787k("unexpected port: ", Integer.valueOf(i10)).toString());
            }
            m31894D(i10);
            return this;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        
            if ((m31901f().length() > 0) != false) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
        
            if (r1 != r2.m31931c(r3)) goto L38;
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
                java.lang.String r1 = r6.m31907l()
                if (r1 == 0) goto L15
                java.lang.String r1 = r6.m31907l()
                r0.append(r1)
                java.lang.String r1 = "://"
                goto L17
            L15:
                java.lang.String r1 = "//"
            L17:
                r0.append(r1)
                java.lang.String r1 = r6.m31904i()
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
                java.lang.String r1 = r6.m31901f()
                int r1 = r1.length()
                if (r1 <= 0) goto L39
                r1 = r2
                goto L3a
            L39:
                r1 = r3
            L3a:
                if (r1 == 0) goto L60
            L3c:
                java.lang.String r1 = r6.m31904i()
                r0.append(r1)
                java.lang.String r1 = r6.m31901f()
                int r1 = r1.length()
                if (r1 <= 0) goto L4e
                goto L4f
            L4e:
                r2 = r3
            L4f:
                if (r2 == 0) goto L5b
                r0.append(r4)
                java.lang.String r1 = r6.m31901f()
                r0.append(r1)
            L5b:
                r1 = 64
                r0.append(r1)
            L60:
                java.lang.String r1 = r6.m31905j()
                if (r1 == 0) goto L8e
                java.lang.String r1 = r6.m31905j()
                kotlin.jvm.internal.C9322n.m27778b(r1)
                r2 = 2
                r5 = 0
                boolean r1 = p450xk.C12515g.m40981I(r1, r4, r3, r2, r5)
                if (r1 == 0) goto L87
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.m31905j()
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L8e
            L87:
                java.lang.String r1 = r6.m31905j()
                r0.append(r1)
            L8e:
                int r1 = r6.m31906k()
                r2 = -1
                if (r1 != r2) goto L9b
                java.lang.String r1 = r6.m31907l()
                if (r1 == 0) goto Lba
            L9b:
                int r1 = r6.m31885b()
                java.lang.String r2 = r6.m31907l()
                if (r2 == 0) goto Lb4
                ql.u$b r2 = p319ql.C10546u.f26455k
                java.lang.String r3 = r6.m31907l()
                kotlin.jvm.internal.C9322n.m27778b(r3)
                int r2 = r2.m31931c(r3)
                if (r1 == r2) goto Lba
            Lb4:
                r0.append(r4)
                r0.append(r1)
            Lba:
                ql.u$b r1 = p319ql.C10546u.f26455k
                java.util.List r2 = r6.m31902g()
                r1.m31935i(r2, r0)
                java.util.List r2 = r6.m31903h()
                if (r2 == 0) goto Ld8
                r2 = 63
                r0.append(r2)
                java.util.List r2 = r6.m31903h()
                kotlin.jvm.internal.C9322n.m27778b(r2)
                r1.m31937k(r2, r0)
            Ld8:
                java.lang.String r1 = r6.m31900e()
                if (r1 == 0) goto Lea
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.m31900e()
                r0.append(r1)
            Lea:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                kotlin.jvm.internal.C9322n.m27780d(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p319ql.C10546u.a.toString():java.lang.String");
        }

        /* renamed from: u */
        public final a m31912u(String str) {
            List<String> list = null;
            if (str != null) {
                b bVar = C10546u.f26455k;
                String m31925b = b.m31925b(bVar, str, 0, 0, " \"'<>#", false, false, true, false, null, 219, null);
                if (m31925b != null) {
                    list = bVar.m31936j(m31925b);
                }
            }
            m31891A(list);
            return this;
        }

        /* renamed from: v */
        public final a m31913v() {
            String m31905j = m31905j();
            m31893C(m31905j == null ? null : new C12514f("[\"<>^`{|}]").m40970b(m31905j, ""));
            int size = m31902g().size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                m31902g().set(i11, b.m31925b(C10546u.f26455k, m31902g().get(i11), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> m31903h = m31903h();
            if (m31903h != null) {
                int size2 = m31903h.size();
                while (i10 < size2) {
                    int i12 = i10 + 1;
                    String str = m31903h.get(i10);
                    m31903h.set(i10, str == null ? null : b.m31925b(C10546u.f26455k, str, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null));
                    i10 = i12;
                }
            }
            String m31900e = m31900e();
            m31915y(m31900e != null ? b.m31925b(C10546u.f26455k, m31900e, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null) : null);
            return this;
        }

        /* renamed from: x */
        public final a m31914x(String scheme) {
            boolean m41037r;
            boolean m41037r2;
            C9322n.m27781e(scheme, "scheme");
            String str = "http";
            m41037r = C12524p.m41037r(scheme, "http", true);
            if (!m41037r) {
                str = "https";
                m41037r2 = C12524p.m41037r(scheme, "https", true);
                if (!m41037r2) {
                    throw new IllegalArgumentException(C9322n.m27787k("unexpected scheme: ", scheme));
                }
            }
            m31895E(str);
            return this;
        }

        /* renamed from: y */
        public final void m31915y(String str) {
            this.f26475h = str;
        }

        /* renamed from: z */
        public final void m31916z(String str) {
            C9322n.m27781e(str, "<set-?>");
            this.f26470c = str;
        }
    }

    /* renamed from: ql.u$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ String m31925b(b bVar, String str, int i10, int i11, String str2, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset, int i12, Object obj) {
            return bVar.m31930a(str, (i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? str.length() : i11, str2, (i12 & 8) != 0 ? false : z10, (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? false : z12, (i12 & 64) != 0 ? false : z13, (i12 & RecognitionOptions.ITF) != 0 ? null : charset);
        }

        /* renamed from: e */
        private final boolean m31926e(String str, int i10, int i11) {
            int i12 = i10 + 2;
            return i12 < i11 && str.charAt(i10) == '%' && C10727d.m32622H(str.charAt(i10 + 1)) != -1 && C10727d.m32622H(str.charAt(i12)) != -1;
        }

        /* renamed from: h */
        public static /* synthetic */ String m31927h(b bVar, String str, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = str.length();
            }
            if ((i12 & 4) != 0) {
                z10 = false;
            }
            return bVar.m31934g(str, i10, i11, z10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x005f, code lost:
        
            if (m31926e(r16, r5, r18) == false) goto L41;
         */
        /* renamed from: l */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void m31928l(dm.C7056b r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
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
                r15.mo20705T(r8)
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
                boolean r8 = p450xk.C12515g.m40981I(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L67
                if (r7 != r9) goto L62
                if (r20 == 0) goto L67
                if (r21 == 0) goto L62
                r8 = r14
                boolean r10 = r14.m31926e(r1, r5, r2)
                if (r10 != 0) goto L63
                goto L6c
            L62:
                r8 = r14
            L63:
                r15.m20734q1(r7)
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
                boolean r10 = kotlin.jvm.internal.C9322n.m27777a(r3, r10)
                if (r10 == 0) goto L7e
                goto L87
            L7e:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.m20713a1(r1, r5, r10, r3)
                goto L8a
            L87:
                r6.m20734q1(r7)
            L8a:
                boolean r10 = r6.mo20695G0()
                if (r10 != 0) goto Lb2
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = p319ql.C10546u.m31866a()
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = p319ql.C10546u.m31866a()
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
            throw new UnsupportedOperationException("Method not decompiled: p319ql.C10546u.b.m31928l(dm.b, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        /* renamed from: m */
        private final void m31929m(C7056b c7056b, String str, int i10, int i11, boolean z10) {
            int i12;
            while (i10 < i11) {
                int codePointAt = str.codePointAt(i10);
                if (codePointAt != 37 || (i12 = i10 + 2) >= i11) {
                    if (codePointAt == 43 && z10) {
                        c7056b.writeByte(32);
                        i10++;
                    }
                    c7056b.m20734q1(codePointAt);
                    i10 += Character.charCount(codePointAt);
                } else {
                    int m32622H = C10727d.m32622H(str.charAt(i10 + 1));
                    int m32622H2 = C10727d.m32622H(str.charAt(i12));
                    if (m32622H != -1 && m32622H2 != -1) {
                        c7056b.writeByte((m32622H << 4) + m32622H2);
                        i10 = Character.charCount(codePointAt) + i12;
                    }
                    c7056b.m20734q1(codePointAt);
                    i10 += Character.charCount(codePointAt);
                }
            }
        }

        /* renamed from: a */
        public final String m31930a(String str, int i10, int i11, String encodeSet, boolean z10, boolean z11, boolean z12, boolean z13, Charset charset) {
            boolean m41057I;
            C9322n.m27781e(str, "<this>");
            C9322n.m27781e(encodeSet, "encodeSet");
            int i12 = i10;
            while (i12 < i11) {
                int codePointAt = str.codePointAt(i12);
                if (codePointAt >= 32 && codePointAt != 127 && (codePointAt < 128 || z13)) {
                    m41057I = C12525q.m41057I(encodeSet, (char) codePointAt, false, 2, null);
                    if (!m41057I) {
                        if (codePointAt == 37) {
                            if (z10) {
                                if (z11) {
                                    if (!m31926e(str, i12, i11)) {
                                        C7056b c7056b = new C7056b();
                                        c7056b.m20728j1(str, i10, i12);
                                        m31928l(c7056b, str, i12, i11, encodeSet, z10, z11, z12, z13, charset);
                                        return c7056b.m20723h0();
                                    }
                                    if (codePointAt != 43 && z12) {
                                        C7056b c7056b2 = new C7056b();
                                        c7056b2.m20728j1(str, i10, i12);
                                        m31928l(c7056b2, str, i12, i11, encodeSet, z10, z11, z12, z13, charset);
                                        return c7056b2.m20723h0();
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
                C7056b c7056b22 = new C7056b();
                c7056b22.m20728j1(str, i10, i12);
                m31928l(c7056b22, str, i12, i11, encodeSet, z10, z11, z12, z13, charset);
                return c7056b22.m20723h0();
            }
            String substring = str.substring(i10, i11);
            C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: c */
        public final int m31931c(String scheme) {
            C9322n.m27781e(scheme, "scheme");
            if (C9322n.m27777a(scheme, "http")) {
                return 80;
            }
            return C9322n.m27777a(scheme, "https") ? 443 : -1;
        }

        /* renamed from: d */
        public final C10546u m31932d(String str) {
            C9322n.m27781e(str, "<this>");
            return new a().m31909p(null, str).m31897a();
        }

        /* renamed from: f */
        public final C10546u m31933f(String str) {
            C9322n.m27781e(str, "<this>");
            try {
                return m31932d(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: g */
        public final String m31934g(String str, int i10, int i11, boolean z10) {
            C9322n.m27781e(str, "<this>");
            int i12 = i10;
            while (i12 < i11) {
                int i13 = i12 + 1;
                char charAt = str.charAt(i12);
                if (charAt == '%' || (charAt == '+' && z10)) {
                    C7056b c7056b = new C7056b();
                    c7056b.m20728j1(str, i10, i12);
                    m31929m(c7056b, str, i12, i11, z10);
                    return c7056b.m20723h0();
                }
                i12 = i13;
            }
            String substring = str.substring(i10, i11);
            C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: i */
        public final void m31935i(List<String> list, StringBuilder out) {
            C9322n.m27781e(list, "<this>");
            C9322n.m27781e(out, "out");
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                out.append('/');
                out.append(list.get(i10));
            }
        }

        /* renamed from: j */
        public final List<String> m31936j(String str) {
            int m41071T;
            int m41071T2;
            String str2;
            C9322n.m27781e(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 <= str.length()) {
                m41071T = C12525q.m41071T(str, '&', i10, false, 4, null);
                if (m41071T == -1) {
                    m41071T = str.length();
                }
                int i11 = m41071T;
                m41071T2 = C12525q.m41071T(str, '=', i10, false, 4, null);
                if (m41071T2 == -1 || m41071T2 > i11) {
                    String substring = str.substring(i10, i11);
                    C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring);
                    str2 = null;
                } else {
                    String substring2 = str.substring(i10, m41071T2);
                    C9322n.m27780d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    arrayList.add(substring2);
                    str2 = str.substring(m41071T2 + 1, i11);
                    C9322n.m27780d(str2, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                arrayList.add(str2);
                i10 = i11 + 1;
            }
            return arrayList;
        }

        /* renamed from: k */
        public final void m31937k(List<String> list, StringBuilder out) {
            C11579f m36302k;
            C11577d m36301j;
            C9322n.m27781e(list, "<this>");
            C9322n.m27781e(out, "out");
            m36302k = C11585l.m36302k(0, list.size());
            m36301j = C11585l.m36301j(m36302k, 2);
            int m36268c = m36301j.m36268c();
            int m36269d = m36301j.m36269d();
            int m36270f = m36301j.m36270f();
            if ((m36270f <= 0 || m36268c > m36269d) && (m36270f >= 0 || m36269d > m36268c)) {
                return;
            }
            while (true) {
                int i10 = m36268c + m36270f;
                String str = list.get(m36268c);
                String str2 = list.get(m36268c + 1);
                if (m36268c > 0) {
                    out.append('&');
                }
                out.append(str);
                if (str2 != null) {
                    out.append('=');
                    out.append(str2);
                }
                if (m36268c == m36269d) {
                    return;
                } else {
                    m36268c = i10;
                }
            }
        }
    }

    public C10546u(String scheme, String username, String password, String host, int i10, List<String> pathSegments, List<String> list, String str, String url) {
        C9322n.m27781e(scheme, "scheme");
        C9322n.m27781e(username, "username");
        C9322n.m27781e(password, "password");
        C9322n.m27781e(host, "host");
        C9322n.m27781e(pathSegments, "pathSegments");
        C9322n.m27781e(url, "url");
        this.f26457a = scheme;
        this.f26458b = username;
        this.f26459c = password;
        this.f26460d = host;
        this.f26461e = i10;
        this.f26462f = pathSegments;
        this.f26463g = list;
        this.f26464h = str;
        this.f26465i = url;
        this.f26466j = C9322n.m27777a(scheme, "https");
    }

    /* renamed from: l */
    public static final C10546u m31867l(String str) {
        return f26455k.m31933f(str);
    }

    /* renamed from: b */
    public final String m31868b() {
        int m41071T;
        if (this.f26464h == null) {
            return null;
        }
        m41071T = C12525q.m41071T(this.f26465i, '#', 0, false, 6, null);
        String substring = this.f26465i.substring(m41071T + 1);
        C9322n.m27780d(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: c */
    public final String m31869c() {
        int m41071T;
        int m41071T2;
        if (this.f26459c.length() == 0) {
            return "";
        }
        m41071T = C12525q.m41071T(this.f26465i, ':', this.f26457a.length() + 3, false, 4, null);
        m41071T2 = C12525q.m41071T(this.f26465i, '@', 0, false, 6, null);
        String substring = this.f26465i.substring(m41071T + 1, m41071T2);
        C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: d */
    public final String m31870d() {
        int m41071T;
        m41071T = C12525q.m41071T(this.f26465i, '/', this.f26457a.length() + 3, false, 4, null);
        String str = this.f26465i;
        String substring = this.f26465i.substring(m41071T, C10727d.m32657q(str, "?#", m41071T, str.length()));
        C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e */
    public final List<String> m31871e() {
        int m41071T;
        m41071T = C12525q.m41071T(this.f26465i, '/', this.f26457a.length() + 3, false, 4, null);
        String str = this.f26465i;
        int m32657q = C10727d.m32657q(str, "?#", m41071T, str.length());
        ArrayList arrayList = new ArrayList();
        while (m41071T < m32657q) {
            int i10 = m41071T + 1;
            int m32656p = C10727d.m32656p(this.f26465i, '/', i10, m32657q);
            String substring = this.f26465i.substring(i10, m32656p);
            C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
            m41071T = m32656p;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10546u) && C9322n.m27777a(((C10546u) obj).f26465i, this.f26465i);
    }

    /* renamed from: f */
    public final String m31872f() {
        int m41071T;
        if (this.f26463g == null) {
            return null;
        }
        m41071T = C12525q.m41071T(this.f26465i, '?', 0, false, 6, null);
        int i10 = m41071T + 1;
        String str = this.f26465i;
        String substring = this.f26465i.substring(i10, C10727d.m32656p(str, '#', i10, str.length()));
        C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: g */
    public final String m31873g() {
        if (this.f26458b.length() == 0) {
            return "";
        }
        int length = this.f26457a.length() + 3;
        String str = this.f26465i;
        String substring = this.f26465i.substring(length, C10727d.m32657q(str, ":@", length, str.length()));
        C9322n.m27780d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: h */
    public final String m31874h() {
        return this.f26460d;
    }

    public int hashCode() {
        return this.f26465i.hashCode();
    }

    /* renamed from: i */
    public final boolean m31875i() {
        return this.f26466j;
    }

    /* renamed from: j */
    public final a m31876j() {
        a aVar = new a();
        aVar.m31895E(this.f26457a);
        aVar.m31892B(m31873g());
        aVar.m31916z(m31869c());
        aVar.m31893C(this.f26460d);
        aVar.m31894D(this.f26461e != f26455k.m31931c(this.f26457a) ? this.f26461e : -1);
        aVar.m31902g().clear();
        aVar.m31902g().addAll(m31871e());
        aVar.m31898c(m31872f());
        aVar.m31915y(m31868b());
        return aVar;
    }

    /* renamed from: k */
    public final a m31877k(String link) {
        C9322n.m27781e(link, "link");
        try {
            return new a().m31909p(this, link);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public final int m31878m() {
        return this.f26461e;
    }

    /* renamed from: n */
    public final String m31879n() {
        if (this.f26463g == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        f26455k.m31937k(this.f26463g, sb2);
        return sb2.toString();
    }

    /* renamed from: o */
    public final String m31880o() {
        a m31877k = m31877k("/...");
        C9322n.m27778b(m31877k);
        return m31877k.m31896F("").m31910q("").m31897a().toString();
    }

    /* renamed from: p */
    public final C10546u m31881p(String link) {
        C9322n.m27781e(link, "link");
        a m31877k = m31877k(link);
        if (m31877k == null) {
            return null;
        }
        return m31877k.m31897a();
    }

    /* renamed from: q */
    public final String m31882q() {
        return this.f26457a;
    }

    /* renamed from: r */
    public final URI m31883r() {
        String aVar = m31876j().m31913v().toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e10) {
            try {
                URI create = URI.create(new C12514f("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").m40970b(aVar, ""));
                C9322n.m27780d(create, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* renamed from: s */
    public final URL m31884s() {
        try {
            return new URL(this.f26465i);
        } catch (MalformedURLException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return this.f26465i;
    }
}
