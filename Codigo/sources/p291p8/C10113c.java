package p291p8;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p082eb.C7147c;
import p363t8.C11137a;
import p363t8.C11146e0;
import p363t8.C11147f;
import p363t8.C11172r0;
import p363t8.C11173s;

/* renamed from: p8.c */
/* loaded from: classes.dex */
final class C10113c {

    /* renamed from: c */
    private static final Pattern f24805c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d */
    private static final Pattern f24806d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a */
    private final C11146e0 f24807a = new C11146e0();

    /* renamed from: b */
    private final StringBuilder f24808b = new StringBuilder();

    /* renamed from: a */
    private void m30154a(C10114d c10114d, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f24805c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                c10114d.m30195z((String) C11137a.m34603e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] m34891R0 = C11172r0.m34891R0(str, "\\.");
        String str2 = m34891R0[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            c10114d.m30194y(str2.substring(0, indexOf2));
            c10114d.m30193x(str2.substring(indexOf2 + 1));
        } else {
            c10114d.m30194y(str2);
        }
        if (m34891R0.length > 1) {
            c10114d.m30192w((String[]) C11172r0.m34873I0(m34891R0, 1, m34891R0.length));
        }
    }

    /* renamed from: b */
    private static boolean m30155b(C11146e0 c11146e0) {
        int m34683f = c11146e0.m34683f();
        int m34684g = c11146e0.m34684g();
        byte[] m34682e = c11146e0.m34682e();
        if (m34683f + 2 > m34684g) {
            return false;
        }
        int i10 = m34683f + 1;
        if (m34682e[m34683f] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (m34682e[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= m34684g) {
                c11146e0.m34678V(m34684g - c11146e0.m34683f());
                return true;
            }
            if (((char) m34682e[i11]) == '*' && ((char) m34682e[i12]) == '/') {
                i11 = i12 + 1;
                m34684g = i11;
            } else {
                i11 = i12;
            }
        }
    }

    /* renamed from: c */
    private static boolean m30156c(C11146e0 c11146e0) {
        char m30163k = m30163k(c11146e0, c11146e0.m34683f());
        if (m30163k != '\t' && m30163k != '\n' && m30163k != '\f' && m30163k != '\r' && m30163k != ' ') {
            return false;
        }
        c11146e0.m34678V(1);
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0064. Please report as an issue. */
    /* renamed from: e */
    private static void m30157e(String str, C10114d c10114d) {
        Matcher matcher = f24806d.matcher(C7147c.m21253e(str));
        if (!matcher.matches()) {
            C11173s.m34970i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        int i10 = 2;
        String str2 = (String) C11137a.m34603e(matcher.group(2));
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                i10 = 3;
            case 1:
                c10114d.m30189t(i10);
                c10114d.m30188s(Float.parseFloat((String) C11137a.m34603e(matcher.group(1))));
                return;
            case 2:
                c10114d.m30189t(1);
                c10114d.m30188s(Float.parseFloat((String) C11137a.m34603e(matcher.group(1))));
                return;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: f */
    private static String m30158f(C11146e0 c11146e0, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int m34683f = c11146e0.m34683f();
        int m34684g = c11146e0.m34684g();
        while (m34683f < m34684g && !z10) {
            char c10 = (char) c11146e0.m34682e()[m34683f];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                m34683f++;
                sb2.append(c10);
            }
        }
        c11146e0.m34678V(m34683f - c11146e0.m34683f());
        return sb2.toString();
    }

    /* renamed from: g */
    static String m30159g(C11146e0 c11146e0, StringBuilder sb2) {
        m30166n(c11146e0);
        if (c11146e0.m34679a() == 0) {
            return null;
        }
        String m30158f = m30158f(c11146e0, sb2);
        if (!"".equals(m30158f)) {
            return m30158f;
        }
        return "" + ((char) c11146e0.m34664H());
    }

    /* renamed from: h */
    private static String m30160h(C11146e0 c11146e0, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int m34683f = c11146e0.m34683f();
            String m30159g = m30159g(c11146e0, sb2);
            if (m30159g == null) {
                return null;
            }
            if ("}".equals(m30159g) || ";".equals(m30159g)) {
                c11146e0.m34677U(m34683f);
                z10 = true;
            } else {
                sb3.append(m30159g);
            }
        }
        return sb3.toString();
    }

    /* renamed from: i */
    private static String m30161i(C11146e0 c11146e0, StringBuilder sb2) {
        m30166n(c11146e0);
        if (c11146e0.m34679a() < 5 || !"::cue".equals(c11146e0.m34661E(5))) {
            return null;
        }
        int m34683f = c11146e0.m34683f();
        String m30159g = m30159g(c11146e0, sb2);
        if (m30159g == null) {
            return null;
        }
        if ("{".equals(m30159g)) {
            c11146e0.m34677U(m34683f);
            return "";
        }
        String m30164l = "(".equals(m30159g) ? m30164l(c11146e0) : null;
        if (")".equals(m30159g(c11146e0, sb2))) {
            return m30164l;
        }
        return null;
    }

    /* renamed from: j */
    private static void m30162j(C11146e0 c11146e0, C10114d c10114d, StringBuilder sb2) {
        m30166n(c11146e0);
        String m30158f = m30158f(c11146e0, sb2);
        if (!"".equals(m30158f) && ":".equals(m30159g(c11146e0, sb2))) {
            m30166n(c11146e0);
            String m30160h = m30160h(c11146e0, sb2);
            if (m30160h == null || "".equals(m30160h)) {
                return;
            }
            int m34683f = c11146e0.m34683f();
            String m30159g = m30159g(c11146e0, sb2);
            if (!";".equals(m30159g)) {
                if (!"}".equals(m30159g)) {
                    return;
                } else {
                    c11146e0.m34677U(m34683f);
                }
            }
            if ("color".equals(m30158f)) {
                c10114d.m30186q(C11147f.m34703b(m30160h));
                return;
            }
            if ("background-color".equals(m30158f)) {
                c10114d.m30183n(C11147f.m34703b(m30160h));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(m30158f)) {
                if ("over".equals(m30160h)) {
                    c10114d.m30191v(1);
                    return;
                } else {
                    if ("under".equals(m30160h)) {
                        c10114d.m30191v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(m30158f)) {
                if (!"all".equals(m30160h) && !m30160h.startsWith("digits")) {
                    z10 = false;
                }
                c10114d.m30185p(z10);
                return;
            }
            if ("text-decoration".equals(m30158f)) {
                if ("underline".equals(m30160h)) {
                    c10114d.m30169A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(m30158f)) {
                c10114d.m30187r(m30160h);
                return;
            }
            if ("font-weight".equals(m30158f)) {
                if ("bold".equals(m30160h)) {
                    c10114d.m30184o(true);
                }
            } else if ("font-style".equals(m30158f)) {
                if ("italic".equals(m30160h)) {
                    c10114d.m30190u(true);
                }
            } else if ("font-size".equals(m30158f)) {
                m30157e(m30160h, c10114d);
            }
        }
    }

    /* renamed from: k */
    private static char m30163k(C11146e0 c11146e0, int i10) {
        return (char) c11146e0.m34682e()[i10];
    }

    /* renamed from: l */
    private static String m30164l(C11146e0 c11146e0) {
        int m34683f = c11146e0.m34683f();
        int m34684g = c11146e0.m34684g();
        boolean z10 = false;
        while (m34683f < m34684g && !z10) {
            int i10 = m34683f + 1;
            z10 = ((char) c11146e0.m34682e()[m34683f]) == ')';
            m34683f = i10;
        }
        return c11146e0.m34661E((m34683f - 1) - c11146e0.m34683f()).trim();
    }

    /* renamed from: m */
    static void m30165m(C11146e0 c11146e0) {
        do {
        } while (!TextUtils.isEmpty(c11146e0.m34694s()));
    }

    /* renamed from: n */
    static void m30166n(C11146e0 c11146e0) {
        while (true) {
            for (boolean z10 = true; c11146e0.m34679a() > 0 && z10; z10 = false) {
                if (!m30156c(c11146e0) && !m30155b(c11146e0)) {
                }
            }
            return;
        }
    }

    /* renamed from: d */
    public List<C10114d> m30167d(C11146e0 c11146e0) {
        this.f24808b.setLength(0);
        int m34683f = c11146e0.m34683f();
        m30165m(c11146e0);
        this.f24807a.m34675S(c11146e0.m34682e(), c11146e0.m34683f());
        this.f24807a.m34677U(m34683f);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String m30161i = m30161i(this.f24807a, this.f24808b);
            if (m30161i == null || !"{".equals(m30159g(this.f24807a, this.f24808b))) {
                return arrayList;
            }
            C10114d c10114d = new C10114d();
            m30154a(c10114d, m30161i);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int m34683f2 = this.f24807a.m34683f();
                String m30159g = m30159g(this.f24807a, this.f24808b);
                boolean z11 = m30159g == null || "}".equals(m30159g);
                if (!z11) {
                    this.f24807a.m34677U(m34683f2);
                    m30162j(this.f24807a, c10114d, this.f24808b);
                }
                str = m30159g;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(c10114d);
            }
        }
    }
}
