package p468yg;

import p066dg.C6958s;

/* renamed from: yg.h */
/* loaded from: classes2.dex */
final class C12692h extends C12691g {

    /* renamed from: c */
    private final boolean f34407c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12692h(C12687c c12687c, boolean z10) {
        super(c12687c);
        this.f34407c = z10;
    }

    /* renamed from: h */
    private void m41800h(C12685a c12685a) {
        C12687c m41794a = m41794a();
        C6958s m41758h = this.f34407c ? m41794a.m41758h() : m41794a.m41759i();
        C6958s m41752b = this.f34407c ? m41794a.m41752b() : m41794a.m41753c();
        int m41798e = m41798e((int) m41752b.m20120d());
        C12688d[] m41797d = m41797d();
        int i10 = -1;
        int i11 = 0;
        int i12 = 1;
        for (int m41798e2 = m41798e((int) m41758h.m20120d()); m41798e2 < m41798e; m41798e2++) {
            C12688d c12688d = m41797d[m41798e2];
            if (c12688d != null) {
                c12688d.m41769j();
                int m41762c = c12688d.m41762c() - i10;
                if (m41762c == 0) {
                    i11++;
                } else {
                    if (m41762c == 1) {
                        i12 = Math.max(i12, i11);
                    } else if (c12688d.m41762c() >= c12685a.m41745c()) {
                        m41797d[m41798e2] = null;
                    }
                    i10 = c12688d.m41762c();
                    i11 = 1;
                }
            }
        }
    }

    /* renamed from: l */
    private void m41801l(C12688d[] c12688dArr, C12685a c12685a) {
        for (int i10 = 0; i10 < c12688dArr.length; i10++) {
            C12688d c12688d = c12688dArr[i10];
            if (c12688d != null) {
                int m41764e = c12688d.m41764e() % 30;
                int m41762c = c12688d.m41762c();
                if (m41762c > c12685a.m41745c()) {
                    c12688dArr[i10] = null;
                } else {
                    if (!this.f34407c) {
                        m41762c += 2;
                    }
                    int i11 = m41762c % 3;
                    if (i11 != 0) {
                        if (i11 != 1) {
                            if (i11 == 2 && m41764e + 1 != c12685a.m41743a()) {
                                c12688dArr[i10] = null;
                            }
                        } else if (m41764e / 3 != c12685a.m41744b() || m41764e % 3 != c12685a.m41746d()) {
                            c12688dArr[i10] = null;
                        }
                    } else if ((m41764e * 3) + 1 != c12685a.m41747e()) {
                        c12688dArr[i10] = null;
                    }
                }
            }
        }
    }

    /* renamed from: m */
    private void m41802m() {
        for (C12688d c12688d : m41797d()) {
            if (c12688d != null) {
                c12688d.m41769j();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public void m41803g(C12685a c12685a) {
        C12688d[] m41797d = m41797d();
        m41802m();
        m41801l(m41797d, c12685a);
        C12687c m41794a = m41794a();
        C6958s m41758h = this.f34407c ? m41794a.m41758h() : m41794a.m41759i();
        C6958s m41752b = this.f34407c ? m41794a.m41752b() : m41794a.m41753c();
        int m41798e = m41798e((int) m41758h.m20120d());
        int m41798e2 = m41798e((int) m41752b.m20120d());
        int i10 = -1;
        int i11 = 0;
        int i12 = 1;
        while (m41798e < m41798e2) {
            C12688d c12688d = m41797d[m41798e];
            if (c12688d != null) {
                int m41762c = c12688d.m41762c() - i10;
                if (m41762c == 0) {
                    i11++;
                } else {
                    if (m41762c == 1) {
                        i12 = Math.max(i12, i11);
                    } else if (m41762c < 0 || c12688d.m41762c() >= c12685a.m41745c() || m41762c > m41798e) {
                        m41797d[m41798e] = null;
                    } else {
                        if (i12 > 2) {
                            m41762c *= i12 - 2;
                        }
                        boolean z10 = m41762c >= m41798e;
                        for (int i13 = 1; i13 <= m41762c && !z10; i13++) {
                            z10 = m41797d[m41798e - i13] != null;
                        }
                        if (z10) {
                            m41797d[m41798e] = null;
                        }
                    }
                    i10 = c12688d.m41762c();
                    i11 = 1;
                }
            }
            m41798e++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C12685a m41804i() {
        C12688d[] m41797d = m41797d();
        C12686b c12686b = new C12686b();
        C12686b c12686b2 = new C12686b();
        C12686b c12686b3 = new C12686b();
        C12686b c12686b4 = new C12686b();
        for (C12688d c12688d : m41797d) {
            if (c12688d != null) {
                c12688d.m41769j();
                int m41764e = c12688d.m41764e() % 30;
                int m41762c = c12688d.m41762c();
                if (!this.f34407c) {
                    m41762c += 2;
                }
                int i10 = m41762c % 3;
                if (i10 == 0) {
                    c12686b2.m41749b((m41764e * 3) + 1);
                } else if (i10 == 1) {
                    c12686b4.m41749b(m41764e / 3);
                    c12686b3.m41749b(m41764e % 3);
                } else if (i10 == 2) {
                    c12686b.m41749b(m41764e + 1);
                }
            }
        }
        if (c12686b.m41748a().length == 0 || c12686b2.m41748a().length == 0 || c12686b3.m41748a().length == 0 || c12686b4.m41748a().length == 0 || c12686b.m41748a()[0] < 1 || c12686b2.m41748a()[0] + c12686b3.m41748a()[0] < 3 || c12686b2.m41748a()[0] + c12686b3.m41748a()[0] > 90) {
            return null;
        }
        C12685a c12685a = new C12685a(c12686b.m41748a()[0], c12686b2.m41748a()[0], c12686b3.m41748a()[0], c12686b4.m41748a()[0]);
        m41801l(m41797d, c12685a);
        return c12685a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int[] m41805j() {
        int m41762c;
        C12685a m41804i = m41804i();
        if (m41804i == null) {
            return null;
        }
        m41800h(m41804i);
        int m41745c = m41804i.m41745c();
        int[] iArr = new int[m41745c];
        for (C12688d c12688d : m41797d()) {
            if (c12688d != null && (m41762c = c12688d.m41762c()) < m41745c) {
                iArr[m41762c] = iArr[m41762c] + 1;
            }
        }
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean m41806k() {
        return this.f34407c;
    }

    @Override // p468yg.C12691g
    public String toString() {
        return "IsLeft: " + this.f34407c + '\n' + super.toString();
    }
}
