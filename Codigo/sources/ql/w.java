package ql;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: e, reason: collision with root package name */
    public static final a f24382e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Pattern f24383f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f24384g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a, reason: collision with root package name */
    private final String f24385a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24386b;

    /* renamed from: c, reason: collision with root package name */
    private final String f24387c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f24388d;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final w a(String str) {
            boolean E;
            boolean q10;
            kotlin.jvm.internal.n.e(str, "<this>");
            Matcher matcher = w.f24383f.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String group = matcher.group(1);
            kotlin.jvm.internal.n.d(group, "typeSubtype.group(1)");
            Locale US = Locale.US;
            kotlin.jvm.internal.n.d(US, "US");
            String lowerCase = group.toLowerCase(US);
            kotlin.jvm.internal.n.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            kotlin.jvm.internal.n.d(group2, "typeSubtype.group(2)");
            kotlin.jvm.internal.n.d(US, "US");
            String lowerCase2 = group2.toLowerCase(US);
            kotlin.jvm.internal.n.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = w.f24384g.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    kotlin.jvm.internal.n.d(substring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(substring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String group3 = matcher2.group(1);
                if (group3 != null) {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else {
                        E = xk.p.E(group4, "'", false, 2, null);
                        if (E) {
                            q10 = xk.p.q(group4, "'", false, 2, null);
                            if (q10 && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                kotlin.jvm.internal.n.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                        }
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new w(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final w b(String str) {
            kotlin.jvm.internal.n.e(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private w(String str, String str2, String str3, String[] strArr) {
        this.f24385a = str;
        this.f24386b = str2;
        this.f24387c = str3;
        this.f24388d = strArr;
    }

    public /* synthetic */ w(String str, String str2, String str3, String[] strArr, kotlin.jvm.internal.g gVar) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset d(w wVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return wVar.c(charset);
    }

    public static final w f(String str) {
        return f24382e.b(str);
    }

    public final Charset c(Charset charset) {
        String e10 = e("charset");
        if (e10 == null) {
            return charset;
        }
        try {
            return Charset.forName(e10);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String e(String name) {
        boolean r10;
        kotlin.jvm.internal.n.e(name, "name");
        int i10 = 0;
        int c10 = jk.c.c(0, this.f24388d.length - 1, 2);
        if (c10 < 0) {
            return null;
        }
        while (true) {
            int i11 = i10 + 2;
            r10 = xk.p.r(this.f24388d[i10], name, true);
            if (r10) {
                return this.f24388d[i10 + 1];
            }
            if (i10 == c10) {
                return null;
            }
            i10 = i11;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof w) && kotlin.jvm.internal.n.a(((w) obj).f24385a, this.f24385a);
    }

    public final String g() {
        return this.f24386b;
    }

    public int hashCode() {
        return this.f24385a.hashCode();
    }

    public String toString() {
        return this.f24385a;
    }
}
