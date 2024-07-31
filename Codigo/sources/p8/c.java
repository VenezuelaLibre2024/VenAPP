package p8;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import t8.e0;
import t8.r0;
import t8.s;

/* loaded from: classes.dex */
final class c {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f22872c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f22873d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final e0 f22874a = new e0();

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f22875b = new StringBuilder();

    private void a(d dVar, String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            Matcher matcher = f22872c.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                dVar.z((String) t8.a.e(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        String[] R0 = r0.R0(str, "\\.");
        String str2 = R0[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            dVar.y(str2.substring(0, indexOf2));
            dVar.x(str2.substring(indexOf2 + 1));
        } else {
            dVar.y(str2);
        }
        if (R0.length > 1) {
            dVar.w((String[]) r0.I0(R0, 1, R0.length));
        }
    }

    private static boolean b(e0 e0Var) {
        int f10 = e0Var.f();
        int g10 = e0Var.g();
        byte[] e10 = e0Var.e();
        if (f10 + 2 > g10) {
            return false;
        }
        int i10 = f10 + 1;
        if (e10[f10] != 47) {
            return false;
        }
        int i11 = i10 + 1;
        if (e10[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= g10) {
                e0Var.V(g10 - e0Var.f());
                return true;
            }
            if (((char) e10[i11]) == '*' && ((char) e10[i12]) == '/') {
                i11 = i12 + 1;
                g10 = i11;
            } else {
                i11 = i12;
            }
        }
    }

    private static boolean c(e0 e0Var) {
        char k10 = k(e0Var, e0Var.f());
        if (k10 != '\t' && k10 != '\n' && k10 != '\f' && k10 != '\r' && k10 != ' ') {
            return false;
        }
        e0Var.V(1);
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0064. Please report as an issue. */
    private static void e(String str, d dVar) {
        Matcher matcher = f22873d.matcher(eb.c.e(str));
        if (!matcher.matches()) {
            s.i("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        int i10 = 2;
        String str2 = (String) t8.a.e(matcher.group(2));
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
                dVar.t(i10);
                dVar.s(Float.parseFloat((String) t8.a.e(matcher.group(1))));
                return;
            case 2:
                dVar.t(1);
                dVar.s(Float.parseFloat((String) t8.a.e(matcher.group(1))));
                return;
            default:
                throw new IllegalStateException();
        }
    }

    private static String f(e0 e0Var, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int f10 = e0Var.f();
        int g10 = e0Var.g();
        while (f10 < g10 && !z10) {
            char c10 = (char) e0Var.e()[f10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                f10++;
                sb2.append(c10);
            }
        }
        e0Var.V(f10 - e0Var.f());
        return sb2.toString();
    }

    static String g(e0 e0Var, StringBuilder sb2) {
        n(e0Var);
        if (e0Var.a() == 0) {
            return null;
        }
        String f10 = f(e0Var, sb2);
        if (!"".equals(f10)) {
            return f10;
        }
        return "" + ((char) e0Var.H());
    }

    private static String h(e0 e0Var, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int f10 = e0Var.f();
            String g10 = g(e0Var, sb2);
            if (g10 == null) {
                return null;
            }
            if ("}".equals(g10) || ";".equals(g10)) {
                e0Var.U(f10);
                z10 = true;
            } else {
                sb3.append(g10);
            }
        }
        return sb3.toString();
    }

    private static String i(e0 e0Var, StringBuilder sb2) {
        n(e0Var);
        if (e0Var.a() < 5 || !"::cue".equals(e0Var.E(5))) {
            return null;
        }
        int f10 = e0Var.f();
        String g10 = g(e0Var, sb2);
        if (g10 == null) {
            return null;
        }
        if ("{".equals(g10)) {
            e0Var.U(f10);
            return "";
        }
        String l10 = "(".equals(g10) ? l(e0Var) : null;
        if (")".equals(g(e0Var, sb2))) {
            return l10;
        }
        return null;
    }

    private static void j(e0 e0Var, d dVar, StringBuilder sb2) {
        n(e0Var);
        String f10 = f(e0Var, sb2);
        if (!"".equals(f10) && ":".equals(g(e0Var, sb2))) {
            n(e0Var);
            String h10 = h(e0Var, sb2);
            if (h10 == null || "".equals(h10)) {
                return;
            }
            int f11 = e0Var.f();
            String g10 = g(e0Var, sb2);
            if (!";".equals(g10)) {
                if (!"}".equals(g10)) {
                    return;
                } else {
                    e0Var.U(f11);
                }
            }
            if ("color".equals(f10)) {
                dVar.q(t8.f.b(h10));
                return;
            }
            if ("background-color".equals(f10)) {
                dVar.n(t8.f.b(h10));
                return;
            }
            boolean z10 = true;
            if ("ruby-position".equals(f10)) {
                if ("over".equals(h10)) {
                    dVar.v(1);
                    return;
                } else {
                    if ("under".equals(h10)) {
                        dVar.v(2);
                        return;
                    }
                    return;
                }
            }
            if ("text-combine-upright".equals(f10)) {
                if (!"all".equals(h10) && !h10.startsWith("digits")) {
                    z10 = false;
                }
                dVar.p(z10);
                return;
            }
            if ("text-decoration".equals(f10)) {
                if ("underline".equals(h10)) {
                    dVar.A(true);
                    return;
                }
                return;
            }
            if ("font-family".equals(f10)) {
                dVar.r(h10);
                return;
            }
            if ("font-weight".equals(f10)) {
                if ("bold".equals(h10)) {
                    dVar.o(true);
                }
            } else if ("font-style".equals(f10)) {
                if ("italic".equals(h10)) {
                    dVar.u(true);
                }
            } else if ("font-size".equals(f10)) {
                e(h10, dVar);
            }
        }
    }

    private static char k(e0 e0Var, int i10) {
        return (char) e0Var.e()[i10];
    }

    private static String l(e0 e0Var) {
        int f10 = e0Var.f();
        int g10 = e0Var.g();
        boolean z10 = false;
        while (f10 < g10 && !z10) {
            int i10 = f10 + 1;
            z10 = ((char) e0Var.e()[f10]) == ')';
            f10 = i10;
        }
        return e0Var.E((f10 - 1) - e0Var.f()).trim();
    }

    static void m(e0 e0Var) {
        do {
        } while (!TextUtils.isEmpty(e0Var.s()));
    }

    static void n(e0 e0Var) {
        while (true) {
            for (boolean z10 = true; e0Var.a() > 0 && z10; z10 = false) {
                if (!c(e0Var) && !b(e0Var)) {
                }
            }
            return;
        }
    }

    public List<d> d(e0 e0Var) {
        this.f22875b.setLength(0);
        int f10 = e0Var.f();
        m(e0Var);
        this.f22874a.S(e0Var.e(), e0Var.f());
        this.f22874a.U(f10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i10 = i(this.f22874a, this.f22875b);
            if (i10 == null || !"{".equals(g(this.f22874a, this.f22875b))) {
                return arrayList;
            }
            d dVar = new d();
            a(dVar, i10);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int f11 = this.f22874a.f();
                String g10 = g(this.f22874a, this.f22875b);
                boolean z11 = g10 == null || "}".equals(g10);
                if (!z11) {
                    this.f22874a.U(f11);
                    j(this.f22874a, dVar, this.f22875b);
                }
                str = g10;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(dVar);
            }
        }
    }
}
