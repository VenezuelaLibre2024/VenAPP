package p260o0;

import java.util.ArrayList;
import java.util.Iterator;
import p243n0.C9618a;
import p243n0.C9621d;
import p243n0.C9622e;
import p243n0.C9623f;
import p243n0.C9624g;
import p260o0.C9754b;

/* renamed from: o0.h */
/* loaded from: classes.dex */
public class C9760h {

    /* renamed from: a */
    private static C9754b.a f24028a = new C9754b.a();

    /* renamed from: b */
    private static int f24029b = 0;

    /* renamed from: c */
    private static int f24030c = 0;

    /* renamed from: a */
    private static boolean m29264a(int i10, C9622e c9622e) {
        C9622e.b bVar;
        C9622e.b bVar2;
        C9622e.b m28769y = c9622e.m28769y();
        C9622e.b m28702R = c9622e.m28702R();
        C9623f c9623f = c9622e.m28686I() != null ? (C9623f) c9622e.m28686I() : null;
        if (c9623f != null) {
            c9623f.m28769y();
            C9622e.b bVar3 = C9622e.b.FIXED;
        }
        if (c9623f != null) {
            c9623f.m28702R();
            C9622e.b bVar4 = C9622e.b.FIXED;
        }
        C9622e.b bVar5 = C9622e.b.FIXED;
        boolean z10 = m28769y == bVar5 || c9622e.mo28627l0() || m28769y == C9622e.b.WRAP_CONTENT || (m28769y == (bVar2 = C9622e.b.MATCH_CONSTRAINT) && c9622e.f23533w == 0 && c9622e.f23496d0 == 0.0f && c9622e.m28716Y(0)) || (m28769y == bVar2 && c9622e.f23533w == 1 && c9622e.m28722b0(0, c9622e.m28708U()));
        boolean z11 = m28702R == bVar5 || c9622e.mo28628m0() || m28702R == C9622e.b.WRAP_CONTENT || (m28702R == (bVar = C9622e.b.MATCH_CONSTRAINT) && c9622e.f23535x == 0 && c9622e.f23496d0 == 0.0f && c9622e.m28716Y(1)) || (m28702R == bVar && c9622e.f23535x == 1 && c9622e.m28722b0(1, c9622e.m28765v()));
        if (c9622e.f23496d0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    /* renamed from: b */
    private static void m29265b(int i10, C9622e c9622e, C9754b.b bVar, boolean z10) {
        C9621d c9621d;
        C9621d c9621d2;
        C9621d c9621d3;
        C9621d c9621d4;
        if (c9622e.m28728e0()) {
            return;
        }
        boolean z11 = true;
        f24029b++;
        if (!(c9622e instanceof C9623f) && c9622e.m28743k0()) {
            int i11 = i10 + 1;
            if (m29264a(i11, c9622e)) {
                C9623f.m28773O1(i11, c9622e, bVar, new C9754b.a(), C9754b.a.f23991k);
            }
        }
        C9621d mo28747m = c9622e.mo28747m(C9621d.b.LEFT);
        C9621d mo28747m2 = c9622e.mo28747m(C9621d.b.RIGHT);
        int m28646d = mo28747m.m28646d();
        int m28646d2 = mo28747m2.m28646d();
        if (mo28747m.m28645c() != null && mo28747m.m28655m()) {
            Iterator<C9621d> it = mo28747m.m28645c().iterator();
            while (it.hasNext()) {
                C9621d next = it.next();
                C9622e c9622e2 = next.f23445d;
                int i12 = i10 + 1;
                boolean m29264a = m29264a(i12, c9622e2);
                if (c9622e2.m28743k0() && m29264a) {
                    C9623f.m28773O1(i12, c9622e2, bVar, new C9754b.a(), C9754b.a.f23991k);
                }
                boolean z12 = ((next == c9622e2.f23477O && (c9621d4 = c9622e2.f23479Q.f23447f) != null && c9621d4.m28655m()) || (next == c9622e2.f23479Q && (c9621d3 = c9622e2.f23477O.f23447f) != null && c9621d3.m28655m())) ? z11 : false;
                C9622e.b m28769y = c9622e2.m28769y();
                C9622e.b bVar2 = C9622e.b.MATCH_CONSTRAINT;
                if (m28769y != bVar2 || m29264a) {
                    if (!c9622e2.m28743k0()) {
                        C9621d c9621d5 = c9622e2.f23477O;
                        if (next == c9621d5 && c9622e2.f23479Q.f23447f == null) {
                            int m28647e = c9621d5.m28647e() + m28646d;
                            c9622e2.m28675C0(m28647e, c9622e2.m28708U() + m28647e);
                        } else {
                            C9621d c9621d6 = c9622e2.f23479Q;
                            if (next == c9621d6 && c9621d5.f23447f == null) {
                                int m28647e2 = m28646d - c9621d6.m28647e();
                                c9622e2.m28675C0(m28647e2 - c9622e2.m28708U(), m28647e2);
                            } else if (z12 && !c9622e2.m28733g0()) {
                                m29267d(i12, bVar, c9622e2, z10);
                            }
                        }
                        m29265b(i12, c9622e2, bVar, z10);
                    }
                } else if (c9622e2.m28769y() == bVar2 && c9622e2.f23453A >= 0 && c9622e2.f23539z >= 0 && ((c9622e2.m28706T() == 8 || (c9622e2.f23533w == 0 && c9622e2.m28762t() == 0.0f)) && !c9622e2.m28733g0() && !c9622e2.m28740j0() && z12 && !c9622e2.m28733g0())) {
                    m29268e(i12, c9622e, bVar, c9622e2, z10);
                }
                z11 = true;
            }
        }
        if (c9622e instanceof C9624g) {
            return;
        }
        if (mo28747m2.m28645c() != null && mo28747m2.m28655m()) {
            Iterator<C9621d> it2 = mo28747m2.m28645c().iterator();
            while (it2.hasNext()) {
                C9621d next2 = it2.next();
                C9622e c9622e3 = next2.f23445d;
                int i13 = i10 + 1;
                boolean m29264a2 = m29264a(i13, c9622e3);
                if (c9622e3.m28743k0() && m29264a2) {
                    C9623f.m28773O1(i13, c9622e3, bVar, new C9754b.a(), C9754b.a.f23991k);
                }
                boolean z13 = (next2 == c9622e3.f23477O && (c9621d2 = c9622e3.f23479Q.f23447f) != null && c9621d2.m28655m()) || (next2 == c9622e3.f23479Q && (c9621d = c9622e3.f23477O.f23447f) != null && c9621d.m28655m());
                C9622e.b m28769y2 = c9622e3.m28769y();
                C9622e.b bVar3 = C9622e.b.MATCH_CONSTRAINT;
                if (m28769y2 != bVar3 || m29264a2) {
                    if (!c9622e3.m28743k0()) {
                        C9621d c9621d7 = c9622e3.f23477O;
                        if (next2 == c9621d7 && c9622e3.f23479Q.f23447f == null) {
                            int m28647e3 = c9621d7.m28647e() + m28646d2;
                            c9622e3.m28675C0(m28647e3, c9622e3.m28708U() + m28647e3);
                        } else {
                            C9621d c9621d8 = c9622e3.f23479Q;
                            if (next2 == c9621d8 && c9621d7.f23447f == null) {
                                int m28647e4 = m28646d2 - c9621d8.m28647e();
                                c9622e3.m28675C0(m28647e4 - c9622e3.m28708U(), m28647e4);
                            } else if (z13 && !c9622e3.m28733g0()) {
                                m29267d(i13, bVar, c9622e3, z10);
                            }
                        }
                        m29265b(i13, c9622e3, bVar, z10);
                    }
                } else if (c9622e3.m28769y() == bVar3 && c9622e3.f23453A >= 0 && c9622e3.f23539z >= 0 && (c9622e3.m28706T() == 8 || (c9622e3.f23533w == 0 && c9622e3.m28762t() == 0.0f))) {
                    if (!c9622e3.m28733g0() && !c9622e3.m28740j0() && z13 && !c9622e3.m28733g0()) {
                        m29268e(i13, c9622e, bVar, c9622e3, z10);
                    }
                }
            }
        }
        c9622e.m28753o0();
    }

    /* renamed from: c */
    private static void m29266c(int i10, C9618a c9618a, C9754b.b bVar, int i11, boolean z10) {
        if (c9618a.m28629q1()) {
            int i12 = i10 + 1;
            if (i11 == 0) {
                m29265b(i12, c9618a, bVar, z10);
            } else {
                m29272i(i12, c9618a, bVar);
            }
        }
    }

    /* renamed from: d */
    private static void m29267d(int i10, C9754b.b bVar, C9622e c9622e, boolean z10) {
        float m28766w = c9622e.m28766w();
        int m28646d = c9622e.f23477O.f23447f.m28646d();
        int m28646d2 = c9622e.f23479Q.f23447f.m28646d();
        int m28647e = c9622e.f23477O.m28647e() + m28646d;
        int m28647e2 = m28646d2 - c9622e.f23479Q.m28647e();
        if (m28646d == m28646d2) {
            m28766w = 0.5f;
        } else {
            m28646d = m28647e;
            m28646d2 = m28647e2;
        }
        int m28708U = c9622e.m28708U();
        int i11 = (m28646d2 - m28646d) - m28708U;
        if (m28646d > m28646d2) {
            i11 = (m28646d - m28646d2) - m28708U;
        }
        int i12 = ((int) (i11 > 0 ? (m28766w * i11) + 0.5f : m28766w * i11)) + m28646d;
        int i13 = i12 + m28708U;
        if (m28646d > m28646d2) {
            i13 = i12 - m28708U;
        }
        c9622e.m28675C0(i12, i13);
        m29265b(i10 + 1, c9622e, bVar, z10);
    }

    /* renamed from: e */
    private static void m29268e(int i10, C9622e c9622e, C9754b.b bVar, C9622e c9622e2, boolean z10) {
        float m28766w = c9622e2.m28766w();
        int m28646d = c9622e2.f23477O.f23447f.m28646d() + c9622e2.f23477O.m28647e();
        int m28646d2 = c9622e2.f23479Q.f23447f.m28646d() - c9622e2.f23479Q.m28647e();
        if (m28646d2 >= m28646d) {
            int m28708U = c9622e2.m28708U();
            if (c9622e2.m28706T() != 8) {
                int i11 = c9622e2.f23533w;
                if (i11 == 2) {
                    if (!(c9622e instanceof C9623f)) {
                        c9622e = c9622e.m28686I();
                    }
                    m28708U = (int) (c9622e2.m28766w() * 0.5f * c9622e.m28708U());
                } else if (i11 == 0) {
                    m28708U = m28646d2 - m28646d;
                }
                m28708U = Math.max(c9622e2.f23539z, m28708U);
                int i12 = c9622e2.f23453A;
                if (i12 > 0) {
                    m28708U = Math.min(i12, m28708U);
                }
            }
            int i13 = m28646d + ((int) ((m28766w * ((m28646d2 - m28646d) - m28708U)) + 0.5f));
            c9622e2.m28675C0(i13, m28708U + i13);
            m29265b(i10 + 1, c9622e2, bVar, z10);
        }
    }

    /* renamed from: f */
    private static void m29269f(int i10, C9754b.b bVar, C9622e c9622e) {
        float m28698P = c9622e.m28698P();
        int m28646d = c9622e.f23478P.f23447f.m28646d();
        int m28646d2 = c9622e.f23480R.f23447f.m28646d();
        int m28647e = c9622e.f23478P.m28647e() + m28646d;
        int m28647e2 = m28646d2 - c9622e.f23480R.m28647e();
        if (m28646d == m28646d2) {
            m28698P = 0.5f;
        } else {
            m28646d = m28647e;
            m28646d2 = m28647e2;
        }
        int m28765v = c9622e.m28765v();
        int i11 = (m28646d2 - m28646d) - m28765v;
        if (m28646d > m28646d2) {
            i11 = (m28646d - m28646d2) - m28765v;
        }
        int i12 = (int) (i11 > 0 ? (m28698P * i11) + 0.5f : m28698P * i11);
        int i13 = m28646d + i12;
        int i14 = i13 + m28765v;
        if (m28646d > m28646d2) {
            i13 = m28646d - i12;
            i14 = i13 - m28765v;
        }
        c9622e.m28681F0(i13, i14);
        m29272i(i10 + 1, c9622e, bVar);
    }

    /* renamed from: g */
    private static void m29270g(int i10, C9622e c9622e, C9754b.b bVar, C9622e c9622e2) {
        float m28698P = c9622e2.m28698P();
        int m28646d = c9622e2.f23478P.f23447f.m28646d() + c9622e2.f23478P.m28647e();
        int m28646d2 = c9622e2.f23480R.f23447f.m28646d() - c9622e2.f23480R.m28647e();
        if (m28646d2 >= m28646d) {
            int m28765v = c9622e2.m28765v();
            if (c9622e2.m28706T() != 8) {
                int i11 = c9622e2.f23535x;
                if (i11 == 2) {
                    if (!(c9622e instanceof C9623f)) {
                        c9622e = c9622e.m28686I();
                    }
                    m28765v = (int) (m28698P * 0.5f * c9622e.m28765v());
                } else if (i11 == 0) {
                    m28765v = m28646d2 - m28646d;
                }
                m28765v = Math.max(c9622e2.f23457C, m28765v);
                int i12 = c9622e2.f23459D;
                if (i12 > 0) {
                    m28765v = Math.min(i12, m28765v);
                }
            }
            int i13 = m28646d + ((int) ((m28698P * ((m28646d2 - m28646d) - m28765v)) + 0.5f));
            c9622e2.m28681F0(i13, m28765v + i13);
            m29272i(i10 + 1, c9622e2, bVar);
        }
    }

    /* renamed from: h */
    public static void m29271h(C9623f c9623f, C9754b.b bVar) {
        int m28809s1;
        int m28809s12;
        C9622e.b m28769y = c9623f.m28769y();
        C9622e.b m28702R = c9623f.m28702R();
        f24029b = 0;
        f24030c = 0;
        c9623f.m28761s0();
        ArrayList<C9622e> m28826o1 = c9623f.m28826o1();
        int size = m28826o1.size();
        for (int i10 = 0; i10 < size; i10++) {
            m28826o1.get(i10).m28761s0();
        }
        boolean m28790L1 = c9623f.m28790L1();
        if (m28769y == C9622e.b.FIXED) {
            c9623f.m28675C0(0, c9623f.m28708U());
        } else {
            c9623f.m28677D0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            C9622e c9622e = m28826o1.get(i11);
            if (c9622e instanceof C9624g) {
                C9624g c9624g = (C9624g) c9622e;
                if (c9624g.m28806p1() == 1) {
                    if (c9624g.m28807q1() != -1) {
                        m28809s12 = c9624g.m28807q1();
                    } else if (c9624g.m28808r1() == -1 || !c9623f.mo28627l0()) {
                        if (c9623f.mo28627l0()) {
                            m28809s12 = (int) ((c9624g.m28809s1() * c9623f.m28708U()) + 0.5f);
                        }
                        z10 = true;
                    } else {
                        m28809s12 = c9623f.m28708U() - c9624g.m28808r1();
                    }
                    c9624g.m28810t1(m28809s12);
                    z10 = true;
                }
            } else if ((c9622e instanceof C9618a) && ((C9618a) c9622e).m28633u1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                C9622e c9622e2 = m28826o1.get(i12);
                if (c9622e2 instanceof C9624g) {
                    C9624g c9624g2 = (C9624g) c9622e2;
                    if (c9624g2.m28806p1() == 1) {
                        m29265b(0, c9624g2, bVar, m28790L1);
                    }
                }
            }
        }
        m29265b(0, c9623f, bVar, m28790L1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                C9622e c9622e3 = m28826o1.get(i13);
                if (c9622e3 instanceof C9618a) {
                    C9618a c9618a = (C9618a) c9622e3;
                    if (c9618a.m28633u1() == 0) {
                        m29266c(0, c9618a, bVar, 0, m28790L1);
                    }
                }
            }
        }
        if (m28702R == C9622e.b.FIXED) {
            c9623f.m28681F0(0, c9623f.m28765v());
        } else {
            c9623f.m28679E0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            C9622e c9622e4 = m28826o1.get(i14);
            if (c9622e4 instanceof C9624g) {
                C9624g c9624g3 = (C9624g) c9622e4;
                if (c9624g3.m28806p1() == 0) {
                    if (c9624g3.m28807q1() != -1) {
                        m28809s1 = c9624g3.m28807q1();
                    } else if (c9624g3.m28808r1() == -1 || !c9623f.mo28628m0()) {
                        if (c9623f.mo28628m0()) {
                            m28809s1 = (int) ((c9624g3.m28809s1() * c9623f.m28765v()) + 0.5f);
                        }
                        z12 = true;
                    } else {
                        m28809s1 = c9623f.m28765v() - c9624g3.m28808r1();
                    }
                    c9624g3.m28810t1(m28809s1);
                    z12 = true;
                }
            } else if ((c9622e4 instanceof C9618a) && ((C9618a) c9622e4).m28633u1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                C9622e c9622e5 = m28826o1.get(i15);
                if (c9622e5 instanceof C9624g) {
                    C9624g c9624g4 = (C9624g) c9622e5;
                    if (c9624g4.m28806p1() == 0) {
                        m29272i(1, c9624g4, bVar);
                    }
                }
            }
        }
        m29272i(0, c9623f, bVar);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                C9622e c9622e6 = m28826o1.get(i16);
                if (c9622e6 instanceof C9618a) {
                    C9618a c9618a2 = (C9618a) c9622e6;
                    if (c9618a2.m28633u1() == 1) {
                        m29266c(0, c9618a2, bVar, 1, m28790L1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            C9622e c9622e7 = m28826o1.get(i17);
            if (c9622e7.m28743k0() && m29264a(0, c9622e7)) {
                C9623f.m28773O1(0, c9622e7, bVar, f24028a, C9754b.a.f23991k);
                if (!(c9622e7 instanceof C9624g)) {
                    m29265b(0, c9622e7, bVar, m28790L1);
                } else if (((C9624g) c9622e7).m28806p1() != 0) {
                    m29265b(0, c9622e7, bVar, m28790L1);
                }
                m29272i(0, c9622e7, bVar);
            }
        }
    }

    /* renamed from: i */
    private static void m29272i(int i10, C9622e c9622e, C9754b.b bVar) {
        C9621d c9621d;
        C9621d c9621d2;
        C9621d c9621d3;
        C9621d c9621d4;
        if (c9622e.m28750n0()) {
            return;
        }
        f24030c++;
        if (!(c9622e instanceof C9623f) && c9622e.m28743k0()) {
            int i11 = i10 + 1;
            if (m29264a(i11, c9622e)) {
                C9623f.m28773O1(i11, c9622e, bVar, new C9754b.a(), C9754b.a.f23991k);
            }
        }
        C9621d mo28747m = c9622e.mo28747m(C9621d.b.TOP);
        C9621d mo28747m2 = c9622e.mo28747m(C9621d.b.BOTTOM);
        int m28646d = mo28747m.m28646d();
        int m28646d2 = mo28747m2.m28646d();
        if (mo28747m.m28645c() != null && mo28747m.m28655m()) {
            Iterator<C9621d> it = mo28747m.m28645c().iterator();
            while (it.hasNext()) {
                C9621d next = it.next();
                C9622e c9622e2 = next.f23445d;
                int i12 = i10 + 1;
                boolean m29264a = m29264a(i12, c9622e2);
                if (c9622e2.m28743k0() && m29264a) {
                    C9623f.m28773O1(i12, c9622e2, bVar, new C9754b.a(), C9754b.a.f23991k);
                }
                boolean z10 = (next == c9622e2.f23478P && (c9621d4 = c9622e2.f23480R.f23447f) != null && c9621d4.m28655m()) || (next == c9622e2.f23480R && (c9621d3 = c9622e2.f23478P.f23447f) != null && c9621d3.m28655m());
                C9622e.b m28702R = c9622e2.m28702R();
                C9622e.b bVar2 = C9622e.b.MATCH_CONSTRAINT;
                if (m28702R != bVar2 || m29264a) {
                    if (!c9622e2.m28743k0()) {
                        C9621d c9621d5 = c9622e2.f23478P;
                        if (next == c9621d5 && c9622e2.f23480R.f23447f == null) {
                            int m28647e = c9621d5.m28647e() + m28646d;
                            c9622e2.m28681F0(m28647e, c9622e2.m28765v() + m28647e);
                        } else {
                            C9621d c9621d6 = c9622e2.f23480R;
                            if (next == c9621d6 && c9621d5.f23447f == null) {
                                int m28647e2 = m28646d - c9621d6.m28647e();
                                c9622e2.m28681F0(m28647e2 - c9622e2.m28765v(), m28647e2);
                            } else if (z10 && !c9622e2.m28737i0()) {
                                m29269f(i12, bVar, c9622e2);
                            }
                        }
                        m29272i(i12, c9622e2, bVar);
                    }
                } else if (c9622e2.m28702R() == bVar2 && c9622e2.f23459D >= 0 && c9622e2.f23457C >= 0 && (c9622e2.m28706T() == 8 || (c9622e2.f23535x == 0 && c9622e2.m28762t() == 0.0f))) {
                    if (!c9622e2.m28737i0() && !c9622e2.m28740j0() && z10 && !c9622e2.m28737i0()) {
                        m29270g(i12, c9622e, bVar, c9622e2);
                    }
                }
            }
        }
        if (c9622e instanceof C9624g) {
            return;
        }
        if (mo28747m2.m28645c() != null && mo28747m2.m28655m()) {
            Iterator<C9621d> it2 = mo28747m2.m28645c().iterator();
            while (it2.hasNext()) {
                C9621d next2 = it2.next();
                C9622e c9622e3 = next2.f23445d;
                int i13 = i10 + 1;
                boolean m29264a2 = m29264a(i13, c9622e3);
                if (c9622e3.m28743k0() && m29264a2) {
                    C9623f.m28773O1(i13, c9622e3, bVar, new C9754b.a(), C9754b.a.f23991k);
                }
                boolean z11 = (next2 == c9622e3.f23478P && (c9621d2 = c9622e3.f23480R.f23447f) != null && c9621d2.m28655m()) || (next2 == c9622e3.f23480R && (c9621d = c9622e3.f23478P.f23447f) != null && c9621d.m28655m());
                C9622e.b m28702R2 = c9622e3.m28702R();
                C9622e.b bVar3 = C9622e.b.MATCH_CONSTRAINT;
                if (m28702R2 != bVar3 || m29264a2) {
                    if (!c9622e3.m28743k0()) {
                        C9621d c9621d7 = c9622e3.f23478P;
                        if (next2 == c9621d7 && c9622e3.f23480R.f23447f == null) {
                            int m28647e3 = c9621d7.m28647e() + m28646d2;
                            c9622e3.m28681F0(m28647e3, c9622e3.m28765v() + m28647e3);
                        } else {
                            C9621d c9621d8 = c9622e3.f23480R;
                            if (next2 == c9621d8 && c9621d7.f23447f == null) {
                                int m28647e4 = m28646d2 - c9621d8.m28647e();
                                c9622e3.m28681F0(m28647e4 - c9622e3.m28765v(), m28647e4);
                            } else if (z11 && !c9622e3.m28737i0()) {
                                m29269f(i13, bVar, c9622e3);
                            }
                        }
                        m29272i(i13, c9622e3, bVar);
                    }
                } else if (c9622e3.m28702R() == bVar3 && c9622e3.f23459D >= 0 && c9622e3.f23457C >= 0 && (c9622e3.m28706T() == 8 || (c9622e3.f23535x == 0 && c9622e3.m28762t() == 0.0f))) {
                    if (!c9622e3.m28737i0() && !c9622e3.m28740j0() && z11 && !c9622e3.m28737i0()) {
                        m29270g(i13, c9622e, bVar, c9622e3);
                    }
                }
            }
        }
        C9621d mo28747m3 = c9622e.mo28747m(C9621d.b.BASELINE);
        if (mo28747m3.m28645c() != null && mo28747m3.m28655m()) {
            int m28646d3 = mo28747m3.m28646d();
            Iterator<C9621d> it3 = mo28747m3.m28645c().iterator();
            while (it3.hasNext()) {
                C9621d next3 = it3.next();
                C9622e c9622e4 = next3.f23445d;
                int i14 = i10 + 1;
                boolean m29264a3 = m29264a(i14, c9622e4);
                if (c9622e4.m28743k0() && m29264a3) {
                    C9623f.m28773O1(i14, c9622e4, bVar, new C9754b.a(), C9754b.a.f23991k);
                }
                if (c9622e4.m28702R() != C9622e.b.MATCH_CONSTRAINT || m29264a3) {
                    if (!c9622e4.m28743k0() && next3 == c9622e4.f23481S) {
                        c9622e4.m28673B0(next3.m28647e() + m28646d3);
                        m29272i(i14, c9622e4, bVar);
                    }
                }
            }
        }
        c9622e.m28755p0();
    }
}
