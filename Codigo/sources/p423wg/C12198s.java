package p423wg;

import kg.C9263a;
import p066dg.C6947h;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wg.s */
/* loaded from: classes2.dex */
public final class C12198s {

    /* renamed from: a */
    private final C9263a f32475a;

    /* renamed from: b */
    private final C12192m f32476b = new C12192m();

    /* renamed from: c */
    private final StringBuilder f32477c = new StringBuilder();

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12198s(C9263a c9263a) {
        this.f32475a = c9263a;
    }

    /* renamed from: b */
    private C12193n m39134b(int i10) {
        char c10;
        int m39150f = m39150f(i10, 5);
        if (m39150f == 15) {
            return new C12193n(i10 + 5, '$');
        }
        if (m39150f >= 5 && m39150f < 15) {
            return new C12193n(i10 + 5, (char) ((m39150f + 48) - 5));
        }
        int m39150f2 = m39150f(i10, 6);
        if (m39150f2 >= 32 && m39150f2 < 58) {
            return new C12193n(i10 + 6, (char) (m39150f2 + 33));
        }
        switch (m39150f2) {
            case 58:
                c10 = '*';
                break;
            case 59:
                c10 = ',';
                break;
            case 60:
                c10 = '-';
                break;
            case 61:
                c10 = '.';
                break;
            case 62:
                c10 = '/';
                break;
            default:
                throw new IllegalStateException("Decoding invalid alphanumeric value: " + m39150f2);
        }
        return new C12193n(i10 + 6, c10);
    }

    /* renamed from: d */
    private C12193n m39135d(int i10) {
        char c10;
        int m39150f = m39150f(i10, 5);
        if (m39150f == 15) {
            return new C12193n(i10 + 5, '$');
        }
        if (m39150f >= 5 && m39150f < 15) {
            return new C12193n(i10 + 5, (char) ((m39150f + 48) - 5));
        }
        int m39150f2 = m39150f(i10, 7);
        if (m39150f2 >= 64 && m39150f2 < 90) {
            return new C12193n(i10 + 7, (char) (m39150f2 + 1));
        }
        if (m39150f2 >= 90 && m39150f2 < 116) {
            return new C12193n(i10 + 7, (char) (m39150f2 + 7));
        }
        switch (m39150f(i10, 8)) {
            case 232:
                c10 = '!';
                break;
            case 233:
                c10 = '\"';
                break;
            case 234:
                c10 = '%';
                break;
            case 235:
                c10 = '&';
                break;
            case 236:
                c10 = '\'';
                break;
            case 237:
                c10 = '(';
                break;
            case 238:
                c10 = ')';
                break;
            case 239:
                c10 = '*';
                break;
            case 240:
                c10 = '+';
                break;
            case 241:
                c10 = ',';
                break;
            case 242:
                c10 = '-';
                break;
            case 243:
                c10 = '.';
                break;
            case 244:
                c10 = '/';
                break;
            case 245:
                c10 = ':';
                break;
            case 246:
                c10 = ';';
                break;
            case 247:
                c10 = '<';
                break;
            case 248:
                c10 = '=';
                break;
            case 249:
                c10 = '>';
                break;
            case 250:
                c10 = '?';
                break;
            case 251:
                c10 = '_';
                break;
            case 252:
                c10 = ' ';
                break;
            default:
                throw C6947h.m20094a();
        }
        return new C12193n(i10 + 8, c10);
    }

    /* renamed from: e */
    private C12195p m39136e(int i10) {
        int i11 = i10 + 7;
        if (i11 > this.f32475a.m27590l()) {
            int m39150f = m39150f(i10, 4);
            return m39150f == 0 ? new C12195p(this.f32475a.m27590l(), 10, 10) : new C12195p(this.f32475a.m27590l(), m39150f - 1, 10);
        }
        int m39150f2 = m39150f(i10, 7) - 8;
        return new C12195p(i11, m39150f2 / 11, m39150f2 % 11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static int m39137g(C9263a c9263a, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (c9263a.m27586h(i10 + i13)) {
                i12 |= 1 << ((i11 - i13) - 1);
            }
        }
        return i12;
    }

    /* renamed from: h */
    private boolean m39138h(int i10) {
        int i11 = i10 + 3;
        if (i11 > this.f32475a.m27590l()) {
            return false;
        }
        while (i10 < i11) {
            if (this.f32475a.m27586h(i10)) {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* renamed from: i */
    private boolean m39139i(int i10) {
        int i11;
        if (i10 + 1 > this.f32475a.m27590l()) {
            return false;
        }
        for (int i12 = 0; i12 < 5 && (i11 = i12 + i10) < this.f32475a.m27590l(); i12++) {
            if (i12 == 2) {
                if (!this.f32475a.m27586h(i10 + 2)) {
                    return false;
                }
            } else if (this.f32475a.m27586h(i11)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    private boolean m39140j(int i10) {
        int i11;
        if (i10 + 1 > this.f32475a.m27590l()) {
            return false;
        }
        for (int i12 = 0; i12 < 4 && (i11 = i12 + i10) < this.f32475a.m27590l(); i12++) {
            if (this.f32475a.m27586h(i11)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    private boolean m39141k(int i10) {
        int m39150f;
        if (i10 + 5 > this.f32475a.m27590l()) {
            return false;
        }
        int m39150f2 = m39150f(i10, 5);
        if (m39150f2 < 5 || m39150f2 >= 16) {
            return i10 + 6 <= this.f32475a.m27590l() && (m39150f = m39150f(i10, 6)) >= 16 && m39150f < 63;
        }
        return true;
    }

    /* renamed from: l */
    private boolean m39142l(int i10) {
        int m39150f;
        if (i10 + 5 > this.f32475a.m27590l()) {
            return false;
        }
        int m39150f2 = m39150f(i10, 5);
        if (m39150f2 >= 5 && m39150f2 < 16) {
            return true;
        }
        if (i10 + 7 > this.f32475a.m27590l()) {
            return false;
        }
        int m39150f3 = m39150f(i10, 7);
        if (m39150f3 < 64 || m39150f3 >= 116) {
            return i10 + 8 <= this.f32475a.m27590l() && (m39150f = m39150f(i10, 8)) >= 232 && m39150f < 253;
        }
        return true;
    }

    /* renamed from: m */
    private boolean m39143m(int i10) {
        if (i10 + 7 > this.f32475a.m27590l()) {
            return i10 + 4 <= this.f32475a.m27590l();
        }
        int i11 = i10;
        while (true) {
            int i12 = i10 + 3;
            if (i11 >= i12) {
                return this.f32475a.m27586h(i12);
            }
            if (this.f32475a.m27586h(i11)) {
                return true;
            }
            i11++;
        }
    }

    /* renamed from: n */
    private C12191l m39144n() {
        while (m39141k(this.f32476b.m39111a())) {
            C12193n m39134b = m39134b(this.f32476b.m39111a());
            this.f32476b.m39118h(m39134b.m39128a());
            if (m39134b.m39120c()) {
                return new C12191l(new C12194o(this.f32476b.m39111a(), this.f32477c.toString()), true);
            }
            this.f32477c.append(m39134b.m39119b());
        }
        if (m39138h(this.f32476b.m39111a())) {
            this.f32476b.m39112b(3);
            this.f32476b.m39117g();
        } else if (m39139i(this.f32476b.m39111a())) {
            if (this.f32476b.m39111a() + 5 < this.f32475a.m27590l()) {
                this.f32476b.m39112b(5);
            } else {
                this.f32476b.m39118h(this.f32475a.m27590l());
            }
            this.f32476b.m39116f();
        }
        return new C12191l();
    }

    /* renamed from: o */
    private C12194o m39145o() {
        C12191l m39144n;
        boolean m39110b;
        do {
            int m39111a = this.f32476b.m39111a();
            m39144n = this.f32476b.m39113c() ? m39144n() : this.f32476b.m39114d() ? m39146p() : m39147q();
            m39110b = m39144n.m39110b();
            if (!(m39111a != this.f32476b.m39111a()) && !m39110b) {
                break;
            }
        } while (!m39110b);
        return m39144n.m39109a();
    }

    /* renamed from: p */
    private C12191l m39146p() {
        while (m39142l(this.f32476b.m39111a())) {
            C12193n m39135d = m39135d(this.f32476b.m39111a());
            this.f32476b.m39118h(m39135d.m39128a());
            if (m39135d.m39120c()) {
                return new C12191l(new C12194o(this.f32476b.m39111a(), this.f32477c.toString()), true);
            }
            this.f32477c.append(m39135d.m39119b());
        }
        if (m39138h(this.f32476b.m39111a())) {
            this.f32476b.m39112b(3);
            this.f32476b.m39117g();
        } else if (m39139i(this.f32476b.m39111a())) {
            if (this.f32476b.m39111a() + 5 < this.f32475a.m27590l()) {
                this.f32476b.m39112b(5);
            } else {
                this.f32476b.m39118h(this.f32475a.m27590l());
            }
            this.f32476b.m39115e();
        }
        return new C12191l();
    }

    /* renamed from: q */
    private C12191l m39147q() {
        while (m39143m(this.f32476b.m39111a())) {
            C12195p m39136e = m39136e(this.f32476b.m39111a());
            this.f32476b.m39118h(m39136e.m39128a());
            if (m39136e.m39126d()) {
                return new C12191l(m39136e.m39127e() ? new C12194o(this.f32476b.m39111a(), this.f32477c.toString()) : new C12194o(this.f32476b.m39111a(), this.f32477c.toString(), m39136e.m39125c()), true);
            }
            this.f32477c.append(m39136e.m39124b());
            if (m39136e.m39127e()) {
                return new C12191l(new C12194o(this.f32476b.m39111a(), this.f32477c.toString()), true);
            }
            this.f32477c.append(m39136e.m39125c());
        }
        if (m39140j(this.f32476b.m39111a())) {
            this.f32476b.m39115e();
            this.f32476b.m39112b(4);
        }
        return new C12191l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m39148a(StringBuilder sb2, int i10) {
        String str = null;
        while (true) {
            C12194o m39149c = m39149c(i10, str);
            String m39129a = C12197r.m39129a(m39149c.m39121b());
            if (m39129a != null) {
                sb2.append(m39129a);
            }
            String valueOf = m39149c.m39123d() ? String.valueOf(m39149c.m39122c()) : null;
            if (i10 == m39149c.m39128a()) {
                return sb2.toString();
            }
            i10 = m39149c.m39128a();
            str = valueOf;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C12194o m39149c(int i10, String str) {
        this.f32477c.setLength(0);
        if (str != null) {
            this.f32477c.append(str);
        }
        this.f32476b.m39118h(i10);
        C12194o m39145o = m39145o();
        return (m39145o == null || !m39145o.m39123d()) ? new C12194o(this.f32476b.m39111a(), this.f32477c.toString()) : new C12194o(this.f32476b.m39111a(), this.f32477c.toString(), m39145o.m39122c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m39150f(int i10, int i11) {
        return m39137g(this.f32475a, i10, i11);
    }
}
