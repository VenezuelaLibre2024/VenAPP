package p319ql;

import com.facebook.ads.AdError;
import dk.C7031r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p341rl.C10724a;
import p341rl.C10727d;
import p428wl.C12240c;
import p450xk.C12514f;
import p450xk.C12524p;
import p450xk.C12525q;

/* renamed from: ql.m */
/* loaded from: classes3.dex */
public final class C10538m {

    /* renamed from: j */
    public static final a f26415j = new a(null);

    /* renamed from: k */
    private static final Pattern f26416k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l */
    private static final Pattern f26417l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m */
    private static final Pattern f26418m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n */
    private static final Pattern f26419n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a */
    private final String f26420a;

    /* renamed from: b */
    private final String f26421b;

    /* renamed from: c */
    private final long f26422c;

    /* renamed from: d */
    private final String f26423d;

    /* renamed from: e */
    private final String f26424e;

    /* renamed from: f */
    private final boolean f26425f;

    /* renamed from: g */
    private final boolean f26426g;

    /* renamed from: h */
    private final boolean f26427h;

    /* renamed from: i */
    private final boolean f26428i;

    /* renamed from: ql.m$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x003f, code lost:
        
            if (r1 != ':') goto L33;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final int m31782a(java.lang.String r6, int r7, int r8, boolean r9) {
            /*
                r5 = this;
            L0:
                if (r7 >= r8) goto L49
                int r0 = r7 + 1
                char r1 = r6.charAt(r7)
                r2 = 32
                r3 = 1
                if (r1 >= r2) goto L11
                r2 = 9
                if (r1 != r2) goto L41
            L11:
                r2 = 127(0x7f, float:1.78E-43)
                if (r1 >= r2) goto L41
                r2 = 57
                r4 = 0
                if (r1 > r2) goto L20
                r2 = 48
                if (r2 > r1) goto L20
                r2 = r3
                goto L21
            L20:
                r2 = r4
            L21:
                if (r2 != 0) goto L41
                r2 = 122(0x7a, float:1.71E-43)
                if (r1 > r2) goto L2d
                r2 = 97
                if (r2 > r1) goto L2d
                r2 = r3
                goto L2e
            L2d:
                r2 = r4
            L2e:
                if (r2 != 0) goto L41
                r2 = 90
                if (r1 > r2) goto L3a
                r2 = 65
                if (r2 > r1) goto L3a
                r2 = r3
                goto L3b
            L3a:
                r2 = r4
            L3b:
                if (r2 != 0) goto L41
                r2 = 58
                if (r1 != r2) goto L42
            L41:
                r4 = r3
            L42:
                r1 = r9 ^ 1
                if (r4 != r1) goto L47
                return r7
            L47:
                r7 = r0
                goto L0
            L49:
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: p319ql.C10538m.a.m31782a(java.lang.String, int, int, boolean):int");
        }

        /* renamed from: b */
        private final boolean m31783b(String str, String str2) {
            boolean m41036q;
            if (C9322n.m27777a(str, str2)) {
                return true;
            }
            m41036q = C12524p.m41036q(str, str2, false, 2, null);
            return m41036q && str.charAt((str.length() - str2.length()) - 1) == '.' && !C10727d.m32649i(str);
        }

        /* renamed from: f */
        private final String m31784f(String str) {
            boolean m41036q;
            String m41091n0;
            m41036q = C12524p.m41036q(str, ".", false, 2, null);
            if (!(!m41036q)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            m41091n0 = C12525q.m41091n0(str, ".");
            String m32614e = C10724a.m32614e(m41091n0);
            if (m32614e != null) {
                return m32614e;
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: g */
        private final long m31785g(String str, int i10, int i11) {
            int m41072U;
            int m31782a = m31782a(str, i10, i11, false);
            Matcher matcher = C10538m.f26419n.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            while (m31782a < i11) {
                int m31782a2 = m31782a(str, m31782a + 1, i11, true);
                matcher.region(m31782a, m31782a2);
                if (i13 == -1 && matcher.usePattern(C10538m.f26419n).matches()) {
                    String group = matcher.group(1);
                    C9322n.m27780d(group, "matcher.group(1)");
                    i13 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    C9322n.m27780d(group2, "matcher.group(2)");
                    i16 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    C9322n.m27780d(group3, "matcher.group(3)");
                    i17 = Integer.parseInt(group3);
                } else if (i14 == -1 && matcher.usePattern(C10538m.f26418m).matches()) {
                    String group4 = matcher.group(1);
                    C9322n.m27780d(group4, "matcher.group(1)");
                    i14 = Integer.parseInt(group4);
                } else if (i15 == -1 && matcher.usePattern(C10538m.f26417l).matches()) {
                    String group5 = matcher.group(1);
                    C9322n.m27780d(group5, "matcher.group(1)");
                    Locale US = Locale.US;
                    C9322n.m27780d(US, "US");
                    String lowerCase = group5.toLowerCase(US);
                    C9322n.m27780d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = C10538m.f26417l.pattern();
                    C9322n.m27780d(pattern, "MONTH_PATTERN.pattern()");
                    m41072U = C12525q.m41072U(pattern, lowerCase, 0, false, 6, null);
                    i15 = m41072U / 4;
                } else if (i12 == -1 && matcher.usePattern(C10538m.f26416k).matches()) {
                    String group6 = matcher.group(1);
                    C9322n.m27780d(group6, "matcher.group(1)");
                    i12 = Integer.parseInt(group6);
                }
                m31782a = m31782a(str, m31782a2 + 1, i11, false);
            }
            if (70 <= i12 && i12 < 100) {
                i12 += 1900;
            }
            if (i12 >= 0 && i12 < 70) {
                i12 += AdError.SERVER_ERROR_CODE;
            }
            if (!(i12 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i15 != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i14 && i14 < 32)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i13 >= 0 && i13 < 24)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i16 >= 0 && i16 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i17 >= 0 && i17 < 60)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(C10727d.f27163f);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i12);
            gregorianCalendar.set(2, i15 - 1);
            gregorianCalendar.set(5, i14);
            gregorianCalendar.set(11, i13);
            gregorianCalendar.set(12, i16);
            gregorianCalendar.set(13, i17);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        /* renamed from: h */
        private final long m31786h(String str) {
            boolean m41031E;
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e10) {
                if (!new C12514f("-?\\d+").m40969a(str)) {
                    throw e10;
                }
                m41031E = C12524p.m41031E(str, "-", false, 2, null);
                return m41031E ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }

        /* renamed from: c */
        public final C10538m m31787c(C10546u url, String setCookie) {
            C9322n.m27781e(url, "url");
            C9322n.m27781e(setCookie, "setCookie");
            return m31788d(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Code restructure failed: missing block: B:85:0x0102, code lost:
        
            if (r1 > 253402300799999L) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
        /* renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final p319ql.C10538m m31788d(long r26, p319ql.C10546u r28, java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 368
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p319ql.C10538m.a.m31788d(long, ql.u, java.lang.String):ql.m");
        }

        /* renamed from: e */
        public final List<C10538m> m31789e(C10546u url, C10545t headers) {
            List<C10538m> m20582j;
            C9322n.m27781e(url, "url");
            C9322n.m27781e(headers, "headers");
            List<String> m31850m = headers.m31850m("Set-Cookie");
            int size = m31850m.size();
            ArrayList arrayList = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                C10538m m31787c = m31787c(url, m31850m.get(i10));
                if (m31787c != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(m31787c);
                }
                i10 = i11;
            }
            if (arrayList == null) {
                m20582j = C7031r.m20582j();
                return m20582j;
            }
            List<C10538m> unmodifiableList = Collections.unmodifiableList(arrayList);
            C9322n.m27780d(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return unmodifiableList;
        }
    }

    private C10538m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f26420a = str;
        this.f26421b = str2;
        this.f26422c = j10;
        this.f26423d = str3;
        this.f26424e = str4;
        this.f26425f = z10;
        this.f26426g = z11;
        this.f26427h = z12;
        this.f26428i = z13;
    }

    public /* synthetic */ C10538m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, C9315g c9315g) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    /* renamed from: e */
    public final String m31772e() {
        return this.f26423d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10538m) {
            C10538m c10538m = (C10538m) obj;
            if (C9322n.m27777a(c10538m.f26420a, this.f26420a) && C9322n.m27777a(c10538m.f26421b, this.f26421b) && c10538m.f26422c == this.f26422c && C9322n.m27777a(c10538m.f26423d, this.f26423d) && C9322n.m27777a(c10538m.f26424e, this.f26424e) && c10538m.f26425f == this.f26425f && c10538m.f26426g == this.f26426g && c10538m.f26427h == this.f26427h && c10538m.f26428i == this.f26428i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final long m31773f() {
        return this.f26422c;
    }

    /* renamed from: g */
    public final boolean m31774g() {
        return this.f26428i;
    }

    /* renamed from: h */
    public final boolean m31775h() {
        return this.f26426g;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f26420a.hashCode()) * 31) + this.f26421b.hashCode()) * 31) + Long.hashCode(this.f26422c)) * 31) + this.f26423d.hashCode()) * 31) + this.f26424e.hashCode()) * 31) + Boolean.hashCode(this.f26425f)) * 31) + Boolean.hashCode(this.f26426g)) * 31) + Boolean.hashCode(this.f26427h)) * 31) + Boolean.hashCode(this.f26428i);
    }

    /* renamed from: i */
    public final String m31776i() {
        return this.f26420a;
    }

    /* renamed from: j */
    public final String m31777j() {
        return this.f26424e;
    }

    /* renamed from: k */
    public final boolean m31778k() {
        return this.f26427h;
    }

    /* renamed from: l */
    public final boolean m31779l() {
        return this.f26425f;
    }

    /* renamed from: m */
    public final String m31780m(boolean z10) {
        String m39393b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m31776i());
        sb2.append('=');
        sb2.append(m31781n());
        if (m31778k()) {
            if (m31773f() == Long.MIN_VALUE) {
                m39393b = "; max-age=0";
            } else {
                sb2.append("; expires=");
                m39393b = C12240c.m39393b(new Date(m31773f()));
            }
            sb2.append(m39393b);
        }
        if (!m31774g()) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(m31772e());
        }
        sb2.append("; path=");
        sb2.append(m31777j());
        if (m31779l()) {
            sb2.append("; secure");
        }
        if (m31775h()) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "toString()");
        return sb3;
    }

    /* renamed from: n */
    public final String m31781n() {
        return this.f26421b;
    }

    public String toString() {
        return m31780m(false);
    }
}
