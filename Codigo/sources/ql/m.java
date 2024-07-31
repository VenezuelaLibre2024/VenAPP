package ql;

import com.facebook.ads.AdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: j, reason: collision with root package name */
    public static final a f24321j = new a(null);

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f24322k = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f24323l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f24324m = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: n, reason: collision with root package name */
    private static final Pattern f24325n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    private final String f24326a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24327b;

    /* renamed from: c, reason: collision with root package name */
    private final long f24328c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24329d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24330e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f24331f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f24332g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f24333h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f24334i;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x003f, code lost:
        
            if (r1 != ':') goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final int a(java.lang.String r6, int r7, int r8, boolean r9) {
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
            throw new UnsupportedOperationException("Method not decompiled: ql.m.a.a(java.lang.String, int, int, boolean):int");
        }

        private final boolean b(String str, String str2) {
            boolean q10;
            if (kotlin.jvm.internal.n.a(str, str2)) {
                return true;
            }
            q10 = xk.p.q(str, str2, false, 2, null);
            return q10 && str.charAt((str.length() - str2.length()) - 1) == '.' && !rl.d.i(str);
        }

        private final String f(String str) {
            boolean q10;
            String n02;
            q10 = xk.p.q(str, ".", false, 2, null);
            if (!(!q10)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            n02 = xk.q.n0(str, ".");
            String e10 = rl.a.e(n02);
            if (e10 != null) {
                return e10;
            }
            throw new IllegalArgumentException();
        }

        private final long g(String str, int i10, int i11) {
            int U;
            int a10 = a(str, i10, i11, false);
            Matcher matcher = m.f24325n.matcher(str);
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            while (a10 < i11) {
                int a11 = a(str, a10 + 1, i11, true);
                matcher.region(a10, a11);
                if (i13 == -1 && matcher.usePattern(m.f24325n).matches()) {
                    String group = matcher.group(1);
                    kotlin.jvm.internal.n.d(group, "matcher.group(1)");
                    i13 = Integer.parseInt(group);
                    String group2 = matcher.group(2);
                    kotlin.jvm.internal.n.d(group2, "matcher.group(2)");
                    i16 = Integer.parseInt(group2);
                    String group3 = matcher.group(3);
                    kotlin.jvm.internal.n.d(group3, "matcher.group(3)");
                    i17 = Integer.parseInt(group3);
                } else if (i14 == -1 && matcher.usePattern(m.f24324m).matches()) {
                    String group4 = matcher.group(1);
                    kotlin.jvm.internal.n.d(group4, "matcher.group(1)");
                    i14 = Integer.parseInt(group4);
                } else if (i15 == -1 && matcher.usePattern(m.f24323l).matches()) {
                    String group5 = matcher.group(1);
                    kotlin.jvm.internal.n.d(group5, "matcher.group(1)");
                    Locale US = Locale.US;
                    kotlin.jvm.internal.n.d(US, "US");
                    String lowerCase = group5.toLowerCase(US);
                    kotlin.jvm.internal.n.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    String pattern = m.f24323l.pattern();
                    kotlin.jvm.internal.n.d(pattern, "MONTH_PATTERN.pattern()");
                    U = xk.q.U(pattern, lowerCase, 0, false, 6, null);
                    i15 = U / 4;
                } else if (i12 == -1 && matcher.usePattern(m.f24322k).matches()) {
                    String group6 = matcher.group(1);
                    kotlin.jvm.internal.n.d(group6, "matcher.group(1)");
                    i12 = Integer.parseInt(group6);
                }
                a10 = a(str, a11 + 1, i11, false);
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
            GregorianCalendar gregorianCalendar = new GregorianCalendar(rl.d.f25044f);
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

        private final long h(String str) {
            boolean E;
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong <= 0) {
                    return Long.MIN_VALUE;
                }
                return parseLong;
            } catch (NumberFormatException e10) {
                if (!new xk.f("-?\\d+").a(str)) {
                    throw e10;
                }
                E = xk.p.E(str, "-", false, 2, null);
                return E ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
        }

        public final m c(u url, String setCookie) {
            kotlin.jvm.internal.n.e(url, "url");
            kotlin.jvm.internal.n.e(setCookie, "setCookie");
            return d(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Code restructure failed: missing block: B:85:0x0102, code lost:
        
            if (r1 > 253402300799999L) goto L59;
         */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final ql.m d(long r26, ql.u r28, java.lang.String r29) {
            /*
                Method dump skipped, instructions count: 368
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ql.m.a.d(long, ql.u, java.lang.String):ql.m");
        }

        public final List<m> e(u url, t headers) {
            List<m> j10;
            kotlin.jvm.internal.n.e(url, "url");
            kotlin.jvm.internal.n.e(headers, "headers");
            List<String> m10 = headers.m("Set-Cookie");
            int size = m10.size();
            ArrayList arrayList = null;
            int i10 = 0;
            while (i10 < size) {
                int i11 = i10 + 1;
                m c10 = c(url, m10.get(i10));
                if (c10 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c10);
                }
                i10 = i11;
            }
            if (arrayList == null) {
                j10 = dk.r.j();
                return j10;
            }
            List<m> unmodifiableList = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.n.d(unmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
            return unmodifiableList;
        }
    }

    private m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f24326a = str;
        this.f24327b = str2;
        this.f24328c = j10;
        this.f24329d = str3;
        this.f24330e = str4;
        this.f24331f = z10;
        this.f24332g = z11;
        this.f24333h = z12;
        this.f24334i = z13;
    }

    public /* synthetic */ m(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, kotlin.jvm.internal.g gVar) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    public final String e() {
        return this.f24329d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (kotlin.jvm.internal.n.a(mVar.f24326a, this.f24326a) && kotlin.jvm.internal.n.a(mVar.f24327b, this.f24327b) && mVar.f24328c == this.f24328c && kotlin.jvm.internal.n.a(mVar.f24329d, this.f24329d) && kotlin.jvm.internal.n.a(mVar.f24330e, this.f24330e) && mVar.f24331f == this.f24331f && mVar.f24332g == this.f24332g && mVar.f24333h == this.f24333h && mVar.f24334i == this.f24334i) {
                return true;
            }
        }
        return false;
    }

    public final long f() {
        return this.f24328c;
    }

    public final boolean g() {
        return this.f24334i;
    }

    public final boolean h() {
        return this.f24332g;
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f24326a.hashCode()) * 31) + this.f24327b.hashCode()) * 31) + Long.hashCode(this.f24328c)) * 31) + this.f24329d.hashCode()) * 31) + this.f24330e.hashCode()) * 31) + Boolean.hashCode(this.f24331f)) * 31) + Boolean.hashCode(this.f24332g)) * 31) + Boolean.hashCode(this.f24333h)) * 31) + Boolean.hashCode(this.f24334i);
    }

    public final String i() {
        return this.f24326a;
    }

    public final String j() {
        return this.f24330e;
    }

    public final boolean k() {
        return this.f24333h;
    }

    public final boolean l() {
        return this.f24331f;
    }

    public final String m(boolean z10) {
        String b10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i());
        sb2.append('=');
        sb2.append(n());
        if (k()) {
            if (f() == Long.MIN_VALUE) {
                b10 = "; max-age=0";
            } else {
                sb2.append("; expires=");
                b10 = wl.c.b(new Date(f()));
            }
            sb2.append(b10);
        }
        if (!g()) {
            sb2.append("; domain=");
            if (z10) {
                sb2.append(".");
            }
            sb2.append(e());
        }
        sb2.append("; path=");
        sb2.append(j());
        if (l()) {
            sb2.append("; secure");
        }
        if (h()) {
            sb2.append("; httponly");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.n.d(sb3, "toString()");
        return sb3;
    }

    public final String n() {
        return this.f24327b;
    }

    public String toString() {
        return m(false);
    }
}
