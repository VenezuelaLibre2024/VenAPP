package p319ql;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p187jk.C9082c;
import p450xk.C12524p;

/* renamed from: ql.w */
/* loaded from: classes3.dex */
public final class C10548w {

    /* renamed from: e */
    public static final a f26476e = new a(null);

    /* renamed from: f */
    private static final Pattern f26477f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: g */
    private static final Pattern f26478g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f26479a;

    /* renamed from: b */
    private final String f26480b;

    /* renamed from: c */
    private final String f26481c;

    /* renamed from: d */
    private final String[] f26482d;

    /* renamed from: ql.w$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C10548w m31948a(String str) {
            boolean m41031E;
            boolean m41036q;
            C9322n.m27781e(str, "<this>");
            Matcher matcher = C10548w.f26477f.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String group = matcher.group(1);
            C9322n.m27780d(group, "typeSubtype.group(1)");
            Locale US = Locale.US;
            C9322n.m27780d(US, "US");
            String lowerCase = group.toLowerCase(US);
            C9322n.m27780d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            C9322n.m27780d(group2, "typeSubtype.group(2)");
            C9322n.m27780d(US, "US");
            String lowerCase2 = group2.toLowerCase(US);
            C9322n.m27780d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = C10548w.f26478g.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    C9322n.m27780d(substring, "this as java.lang.String).substring(startIndex)");
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
                        m41031E = C12524p.m41031E(group4, "'", false, 2, null);
                        if (m41031E) {
                            m41036q = C12524p.m41036q(group4, "'", false, 2, null);
                            if (m41036q && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                C9322n.m27780d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                        }
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new C10548w(str, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        /* renamed from: b */
        public final C10548w m31949b(String str) {
            C9322n.m27781e(str, "<this>");
            try {
                return m31948a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private C10548w(String str, String str2, String str3, String[] strArr) {
        this.f26479a = str;
        this.f26480b = str2;
        this.f26481c = str3;
        this.f26482d = strArr;
    }

    public /* synthetic */ C10548w(String str, String str2, String str3, String[] strArr, C9315g c9315g) {
        this(str, str2, str3, strArr);
    }

    /* renamed from: d */
    public static /* synthetic */ Charset m31943d(C10548w c10548w, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return c10548w.m31945c(charset);
    }

    /* renamed from: f */
    public static final C10548w m31944f(String str) {
        return f26476e.m31949b(str);
    }

    /* renamed from: c */
    public final Charset m31945c(Charset charset) {
        String m31946e = m31946e("charset");
        if (m31946e == null) {
            return charset;
        }
        try {
            return Charset.forName(m31946e);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    /* renamed from: e */
    public final String m31946e(String name) {
        boolean m41037r;
        C9322n.m27781e(name, "name");
        int i10 = 0;
        int m26687c = C9082c.m26687c(0, this.f26482d.length - 1, 2);
        if (m26687c < 0) {
            return null;
        }
        while (true) {
            int i11 = i10 + 2;
            m41037r = C12524p.m41037r(this.f26482d[i10], name, true);
            if (m41037r) {
                return this.f26482d[i10 + 1];
            }
            if (i10 == m26687c) {
                return null;
            }
            i10 = i11;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10548w) && C9322n.m27777a(((C10548w) obj).f26479a, this.f26479a);
    }

    /* renamed from: g */
    public final String m31947g() {
        return this.f26480b;
    }

    public int hashCode() {
        return this.f26479a.hashCode();
    }

    public String toString() {
        return this.f26479a;
    }
}
