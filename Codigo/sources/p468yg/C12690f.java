package p468yg;

import java.util.Formatter;

/* renamed from: yg.f */
/* loaded from: classes2.dex */
final class C12690f {

    /* renamed from: a */
    private final C12685a f34401a;

    /* renamed from: b */
    private final C12691g[] f34402b;

    /* renamed from: c */
    private C12687c f34403c;

    /* renamed from: d */
    private final int f34404d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12690f(C12685a c12685a, C12687c c12687c) {
        this.f34401a = c12685a;
        int m41743a = c12685a.m41743a();
        this.f34404d = m41743a;
        this.f34403c = c12687c;
        this.f34402b = new C12691g[m41743a + 2];
    }

    /* renamed from: a */
    private void m41777a(C12691g c12691g) {
        if (c12691g != null) {
            ((C12692h) c12691g).m41803g(this.f34401a);
        }
    }

    /* renamed from: b */
    private static boolean m41778b(C12688d c12688d, C12688d c12688d2) {
        if (c12688d2 == null || !c12688d2.m41766g() || c12688d2.m41760a() != c12688d.m41760a()) {
            return false;
        }
        c12688d.m41768i(c12688d2.m41762c());
        return true;
    }

    /* renamed from: c */
    private static int m41779c(int i10, int i11, C12688d c12688d) {
        if (c12688d == null || c12688d.m41766g()) {
            return i11;
        }
        if (!c12688d.m41767h(i10)) {
            return i11 + 1;
        }
        c12688d.m41768i(i10);
        return 0;
    }

    /* renamed from: d */
    private int m41780d() {
        int m41782f = m41782f();
        if (m41782f == 0) {
            return 0;
        }
        for (int i10 = 1; i10 < this.f34404d + 1; i10++) {
            C12688d[] m41797d = this.f34402b[i10].m41797d();
            for (int i11 = 0; i11 < m41797d.length; i11++) {
                C12688d c12688d = m41797d[i11];
                if (c12688d != null && !c12688d.m41766g()) {
                    m41781e(i10, i11, m41797d);
                }
            }
        }
        return m41782f;
    }

    /* renamed from: e */
    private void m41781e(int i10, int i11, C12688d[] c12688dArr) {
        C12688d c12688d = c12688dArr[i11];
        C12688d[] m41797d = this.f34402b[i10 - 1].m41797d();
        C12691g c12691g = this.f34402b[i10 + 1];
        C12688d[] m41797d2 = c12691g != null ? c12691g.m41797d() : m41797d;
        C12688d[] c12688dArr2 = new C12688d[14];
        c12688dArr2[2] = m41797d[i11];
        c12688dArr2[3] = m41797d2[i11];
        if (i11 > 0) {
            int i12 = i11 - 1;
            c12688dArr2[0] = c12688dArr[i12];
            c12688dArr2[4] = m41797d[i12];
            c12688dArr2[5] = m41797d2[i12];
        }
        if (i11 > 1) {
            int i13 = i11 - 2;
            c12688dArr2[8] = c12688dArr[i13];
            c12688dArr2[10] = m41797d[i13];
            c12688dArr2[11] = m41797d2[i13];
        }
        if (i11 < c12688dArr.length - 1) {
            int i14 = i11 + 1;
            c12688dArr2[1] = c12688dArr[i14];
            c12688dArr2[6] = m41797d[i14];
            c12688dArr2[7] = m41797d2[i14];
        }
        if (i11 < c12688dArr.length - 2) {
            int i15 = i11 + 2;
            c12688dArr2[9] = c12688dArr[i15];
            c12688dArr2[12] = m41797d[i15];
            c12688dArr2[13] = m41797d2[i15];
        }
        for (int i16 = 0; i16 < 14 && !m41778b(c12688d, c12688dArr2[i16]); i16++) {
        }
    }

    /* renamed from: f */
    private int m41782f() {
        m41783g();
        return m41784h() + m41785i();
    }

    /* renamed from: g */
    private void m41783g() {
        C12691g[] c12691gArr = this.f34402b;
        C12691g c12691g = c12691gArr[0];
        if (c12691g == null || c12691gArr[this.f34404d + 1] == null) {
            return;
        }
        C12688d[] m41797d = c12691g.m41797d();
        C12688d[] m41797d2 = this.f34402b[this.f34404d + 1].m41797d();
        for (int i10 = 0; i10 < m41797d.length; i10++) {
            C12688d c12688d = m41797d[i10];
            if (c12688d != null && m41797d2[i10] != null && c12688d.m41762c() == m41797d2[i10].m41762c()) {
                for (int i11 = 1; i11 <= this.f34404d; i11++) {
                    C12688d c12688d2 = this.f34402b[i11].m41797d()[i10];
                    if (c12688d2 != null) {
                        c12688d2.m41768i(m41797d[i10].m41762c());
                        if (!c12688d2.m41766g()) {
                            this.f34402b[i11].m41797d()[i10] = null;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: h */
    private int m41784h() {
        C12691g c12691g = this.f34402b[0];
        if (c12691g == null) {
            return 0;
        }
        C12688d[] m41797d = c12691g.m41797d();
        int i10 = 0;
        for (int i11 = 0; i11 < m41797d.length; i11++) {
            C12688d c12688d = m41797d[i11];
            if (c12688d != null) {
                int m41762c = c12688d.m41762c();
                int i12 = 0;
                for (int i13 = 1; i13 < this.f34404d + 1 && i12 < 2; i13++) {
                    C12688d c12688d2 = this.f34402b[i13].m41797d()[i11];
                    if (c12688d2 != null) {
                        i12 = m41779c(m41762c, i12, c12688d2);
                        if (!c12688d2.m41766g()) {
                            i10++;
                        }
                    }
                }
            }
        }
        return i10;
    }

    /* renamed from: i */
    private int m41785i() {
        C12691g[] c12691gArr = this.f34402b;
        int i10 = this.f34404d;
        if (c12691gArr[i10 + 1] == null) {
            return 0;
        }
        C12688d[] m41797d = c12691gArr[i10 + 1].m41797d();
        int i11 = 0;
        for (int i12 = 0; i12 < m41797d.length; i12++) {
            C12688d c12688d = m41797d[i12];
            if (c12688d != null) {
                int m41762c = c12688d.m41762c();
                int i13 = 0;
                for (int i14 = this.f34404d + 1; i14 > 0 && i13 < 2; i14--) {
                    C12688d c12688d2 = this.f34402b[i14].m41797d()[i12];
                    if (c12688d2 != null) {
                        i13 = m41779c(m41762c, i13, c12688d2);
                        if (!c12688d2.m41766g()) {
                            i11++;
                        }
                    }
                }
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m41786j() {
        return this.f34404d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public int m41787k() {
        return this.f34401a.m41744b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public int m41788l() {
        return this.f34401a.m41745c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public C12687c m41789m() {
        return this.f34403c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public C12691g m41790n(int i10) {
        return this.f34402b[i10];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public C12691g[] m41791o() {
        m41777a(this.f34402b[0]);
        m41777a(this.f34402b[this.f34404d + 1]);
        int i10 = 928;
        while (true) {
            int m41780d = m41780d();
            if (m41780d <= 0 || m41780d >= i10) {
                break;
            }
            i10 = m41780d;
        }
        return this.f34402b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m41792p(C12687c c12687c) {
        this.f34403c = c12687c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m41793q(int i10, C12691g c12691g) {
        this.f34402b[i10] = c12691g;
    }

    public String toString() {
        C12691g[] c12691gArr = this.f34402b;
        C12691g c12691g = c12691gArr[0];
        if (c12691g == null) {
            c12691g = c12691gArr[this.f34404d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i10 = 0; i10 < c12691g.m41797d().length; i10++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i10));
                for (int i11 = 0; i11 < this.f34404d + 2; i11++) {
                    C12691g c12691g2 = this.f34402b[i11];
                    if (c12691g2 == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        C12688d c12688d = c12691g2.m41797d()[i10];
                        if (c12688d == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(c12688d.m41762c()), Integer.valueOf(c12688d.m41764e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        formatter.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
