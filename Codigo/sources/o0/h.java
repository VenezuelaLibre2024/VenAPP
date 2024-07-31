package o0;

import java.util.ArrayList;
import java.util.Iterator;
import n0.d;
import n0.e;
import o0.b;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static b.a f22095a = new b.a();

    /* renamed from: b, reason: collision with root package name */
    private static int f22096b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f22097c = 0;

    private static boolean a(int i10, n0.e eVar) {
        e.b bVar;
        e.b bVar2;
        e.b y10 = eVar.y();
        e.b R = eVar.R();
        n0.f fVar = eVar.I() != null ? (n0.f) eVar.I() : null;
        if (fVar != null) {
            fVar.y();
            e.b bVar3 = e.b.FIXED;
        }
        if (fVar != null) {
            fVar.R();
            e.b bVar4 = e.b.FIXED;
        }
        e.b bVar5 = e.b.FIXED;
        boolean z10 = y10 == bVar5 || eVar.l0() || y10 == e.b.WRAP_CONTENT || (y10 == (bVar2 = e.b.MATCH_CONSTRAINT) && eVar.f21638w == 0 && eVar.f21601d0 == 0.0f && eVar.Y(0)) || (y10 == bVar2 && eVar.f21638w == 1 && eVar.b0(0, eVar.U()));
        boolean z11 = R == bVar5 || eVar.m0() || R == e.b.WRAP_CONTENT || (R == (bVar = e.b.MATCH_CONSTRAINT) && eVar.f21640x == 0 && eVar.f21601d0 == 0.0f && eVar.Y(1)) || (R == bVar && eVar.f21640x == 1 && eVar.b0(1, eVar.v()));
        if (eVar.f21601d0 <= 0.0f || !(z10 || z11)) {
            return z10 && z11;
        }
        return true;
    }

    private static void b(int i10, n0.e eVar, b.InterfaceC0362b interfaceC0362b, boolean z10) {
        n0.d dVar;
        n0.d dVar2;
        n0.d dVar3;
        n0.d dVar4;
        if (eVar.e0()) {
            return;
        }
        boolean z11 = true;
        f22096b++;
        if (!(eVar instanceof n0.f) && eVar.k0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                n0.f.O1(i11, eVar, interfaceC0362b, new b.a(), b.a.f22058k);
            }
        }
        n0.d m10 = eVar.m(d.b.LEFT);
        n0.d m11 = eVar.m(d.b.RIGHT);
        int d10 = m10.d();
        int d11 = m11.d();
        if (m10.c() != null && m10.m()) {
            Iterator<n0.d> it = m10.c().iterator();
            while (it.hasNext()) {
                n0.d next = it.next();
                n0.e eVar2 = next.f21587d;
                int i12 = i10 + 1;
                boolean a10 = a(i12, eVar2);
                if (eVar2.k0() && a10) {
                    n0.f.O1(i12, eVar2, interfaceC0362b, new b.a(), b.a.f22058k);
                }
                boolean z12 = ((next == eVar2.O && (dVar4 = eVar2.Q.f21589f) != null && dVar4.m()) || (next == eVar2.Q && (dVar3 = eVar2.O.f21589f) != null && dVar3.m())) ? z11 : false;
                e.b y10 = eVar2.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (y10 != bVar || a10) {
                    if (!eVar2.k0()) {
                        n0.d dVar5 = eVar2.O;
                        if (next == dVar5 && eVar2.Q.f21589f == null) {
                            int e10 = dVar5.e() + d10;
                            eVar2.C0(e10, eVar2.U() + e10);
                        } else {
                            n0.d dVar6 = eVar2.Q;
                            if (next == dVar6 && dVar5.f21589f == null) {
                                int e11 = d10 - dVar6.e();
                                eVar2.C0(e11 - eVar2.U(), e11);
                            } else if (z12 && !eVar2.g0()) {
                                d(i12, interfaceC0362b, eVar2, z10);
                            }
                        }
                        b(i12, eVar2, interfaceC0362b, z10);
                    }
                } else if (eVar2.y() == bVar && eVar2.A >= 0 && eVar2.f21644z >= 0 && ((eVar2.T() == 8 || (eVar2.f21638w == 0 && eVar2.t() == 0.0f)) && !eVar2.g0() && !eVar2.j0() && z12 && !eVar2.g0())) {
                    e(i12, eVar, interfaceC0362b, eVar2, z10);
                }
                z11 = true;
            }
        }
        if (eVar instanceof n0.g) {
            return;
        }
        if (m11.c() != null && m11.m()) {
            Iterator<n0.d> it2 = m11.c().iterator();
            while (it2.hasNext()) {
                n0.d next2 = it2.next();
                n0.e eVar3 = next2.f21587d;
                int i13 = i10 + 1;
                boolean a11 = a(i13, eVar3);
                if (eVar3.k0() && a11) {
                    n0.f.O1(i13, eVar3, interfaceC0362b, new b.a(), b.a.f22058k);
                }
                boolean z13 = (next2 == eVar3.O && (dVar2 = eVar3.Q.f21589f) != null && dVar2.m()) || (next2 == eVar3.Q && (dVar = eVar3.O.f21589f) != null && dVar.m());
                e.b y11 = eVar3.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (y11 != bVar2 || a11) {
                    if (!eVar3.k0()) {
                        n0.d dVar7 = eVar3.O;
                        if (next2 == dVar7 && eVar3.Q.f21589f == null) {
                            int e12 = dVar7.e() + d11;
                            eVar3.C0(e12, eVar3.U() + e12);
                        } else {
                            n0.d dVar8 = eVar3.Q;
                            if (next2 == dVar8 && dVar7.f21589f == null) {
                                int e13 = d11 - dVar8.e();
                                eVar3.C0(e13 - eVar3.U(), e13);
                            } else if (z13 && !eVar3.g0()) {
                                d(i13, interfaceC0362b, eVar3, z10);
                            }
                        }
                        b(i13, eVar3, interfaceC0362b, z10);
                    }
                } else if (eVar3.y() == bVar2 && eVar3.A >= 0 && eVar3.f21644z >= 0 && (eVar3.T() == 8 || (eVar3.f21638w == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.g0() && !eVar3.j0() && z13 && !eVar3.g0()) {
                        e(i13, eVar, interfaceC0362b, eVar3, z10);
                    }
                }
            }
        }
        eVar.o0();
    }

    private static void c(int i10, n0.a aVar, b.InterfaceC0362b interfaceC0362b, int i11, boolean z10) {
        if (aVar.q1()) {
            int i12 = i10 + 1;
            if (i11 == 0) {
                b(i12, aVar, interfaceC0362b, z10);
            } else {
                i(i12, aVar, interfaceC0362b);
            }
        }
    }

    private static void d(int i10, b.InterfaceC0362b interfaceC0362b, n0.e eVar, boolean z10) {
        float w10 = eVar.w();
        int d10 = eVar.O.f21589f.d();
        int d11 = eVar.Q.f21589f.d();
        int e10 = eVar.O.e() + d10;
        int e11 = d11 - eVar.Q.e();
        if (d10 == d11) {
            w10 = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int U = eVar.U();
        int i11 = (d11 - d10) - U;
        if (d10 > d11) {
            i11 = (d10 - d11) - U;
        }
        int i12 = ((int) (i11 > 0 ? (w10 * i11) + 0.5f : w10 * i11)) + d10;
        int i13 = i12 + U;
        if (d10 > d11) {
            i13 = i12 - U;
        }
        eVar.C0(i12, i13);
        b(i10 + 1, eVar, interfaceC0362b, z10);
    }

    private static void e(int i10, n0.e eVar, b.InterfaceC0362b interfaceC0362b, n0.e eVar2, boolean z10) {
        float w10 = eVar2.w();
        int d10 = eVar2.O.f21589f.d() + eVar2.O.e();
        int d11 = eVar2.Q.f21589f.d() - eVar2.Q.e();
        if (d11 >= d10) {
            int U = eVar2.U();
            if (eVar2.T() != 8) {
                int i11 = eVar2.f21638w;
                if (i11 == 2) {
                    if (!(eVar instanceof n0.f)) {
                        eVar = eVar.I();
                    }
                    U = (int) (eVar2.w() * 0.5f * eVar.U());
                } else if (i11 == 0) {
                    U = d11 - d10;
                }
                U = Math.max(eVar2.f21644z, U);
                int i12 = eVar2.A;
                if (i12 > 0) {
                    U = Math.min(i12, U);
                }
            }
            int i13 = d10 + ((int) ((w10 * ((d11 - d10) - U)) + 0.5f));
            eVar2.C0(i13, U + i13);
            b(i10 + 1, eVar2, interfaceC0362b, z10);
        }
    }

    private static void f(int i10, b.InterfaceC0362b interfaceC0362b, n0.e eVar) {
        float P = eVar.P();
        int d10 = eVar.P.f21589f.d();
        int d11 = eVar.R.f21589f.d();
        int e10 = eVar.P.e() + d10;
        int e11 = d11 - eVar.R.e();
        if (d10 == d11) {
            P = 0.5f;
        } else {
            d10 = e10;
            d11 = e11;
        }
        int v10 = eVar.v();
        int i11 = (d11 - d10) - v10;
        if (d10 > d11) {
            i11 = (d10 - d11) - v10;
        }
        int i12 = (int) (i11 > 0 ? (P * i11) + 0.5f : P * i11);
        int i13 = d10 + i12;
        int i14 = i13 + v10;
        if (d10 > d11) {
            i13 = d10 - i12;
            i14 = i13 - v10;
        }
        eVar.F0(i13, i14);
        i(i10 + 1, eVar, interfaceC0362b);
    }

    private static void g(int i10, n0.e eVar, b.InterfaceC0362b interfaceC0362b, n0.e eVar2) {
        float P = eVar2.P();
        int d10 = eVar2.P.f21589f.d() + eVar2.P.e();
        int d11 = eVar2.R.f21589f.d() - eVar2.R.e();
        if (d11 >= d10) {
            int v10 = eVar2.v();
            if (eVar2.T() != 8) {
                int i11 = eVar2.f21640x;
                if (i11 == 2) {
                    if (!(eVar instanceof n0.f)) {
                        eVar = eVar.I();
                    }
                    v10 = (int) (P * 0.5f * eVar.v());
                } else if (i11 == 0) {
                    v10 = d11 - d10;
                }
                v10 = Math.max(eVar2.C, v10);
                int i12 = eVar2.D;
                if (i12 > 0) {
                    v10 = Math.min(i12, v10);
                }
            }
            int i13 = d10 + ((int) ((P * ((d11 - d10) - v10)) + 0.5f));
            eVar2.F0(i13, v10 + i13);
            i(i10 + 1, eVar2, interfaceC0362b);
        }
    }

    public static void h(n0.f fVar, b.InterfaceC0362b interfaceC0362b) {
        int s12;
        int s13;
        e.b y10 = fVar.y();
        e.b R = fVar.R();
        f22096b = 0;
        f22097c = 0;
        fVar.s0();
        ArrayList<n0.e> o12 = fVar.o1();
        int size = o12.size();
        for (int i10 = 0; i10 < size; i10++) {
            o12.get(i10).s0();
        }
        boolean L1 = fVar.L1();
        if (y10 == e.b.FIXED) {
            fVar.C0(0, fVar.U());
        } else {
            fVar.D0(0);
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            n0.e eVar = o12.get(i11);
            if (eVar instanceof n0.g) {
                n0.g gVar = (n0.g) eVar;
                if (gVar.p1() == 1) {
                    if (gVar.q1() != -1) {
                        s13 = gVar.q1();
                    } else if (gVar.r1() == -1 || !fVar.l0()) {
                        if (fVar.l0()) {
                            s13 = (int) ((gVar.s1() * fVar.U()) + 0.5f);
                        }
                        z10 = true;
                    } else {
                        s13 = fVar.U() - gVar.r1();
                    }
                    gVar.t1(s13);
                    z10 = true;
                }
            } else if ((eVar instanceof n0.a) && ((n0.a) eVar).u1() == 0) {
                z11 = true;
            }
        }
        if (z10) {
            for (int i12 = 0; i12 < size; i12++) {
                n0.e eVar2 = o12.get(i12);
                if (eVar2 instanceof n0.g) {
                    n0.g gVar2 = (n0.g) eVar2;
                    if (gVar2.p1() == 1) {
                        b(0, gVar2, interfaceC0362b, L1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0362b, L1);
        if (z11) {
            for (int i13 = 0; i13 < size; i13++) {
                n0.e eVar3 = o12.get(i13);
                if (eVar3 instanceof n0.a) {
                    n0.a aVar = (n0.a) eVar3;
                    if (aVar.u1() == 0) {
                        c(0, aVar, interfaceC0362b, 0, L1);
                    }
                }
            }
        }
        if (R == e.b.FIXED) {
            fVar.F0(0, fVar.v());
        } else {
            fVar.E0(0);
        }
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < size; i14++) {
            n0.e eVar4 = o12.get(i14);
            if (eVar4 instanceof n0.g) {
                n0.g gVar3 = (n0.g) eVar4;
                if (gVar3.p1() == 0) {
                    if (gVar3.q1() != -1) {
                        s12 = gVar3.q1();
                    } else if (gVar3.r1() == -1 || !fVar.m0()) {
                        if (fVar.m0()) {
                            s12 = (int) ((gVar3.s1() * fVar.v()) + 0.5f);
                        }
                        z12 = true;
                    } else {
                        s12 = fVar.v() - gVar3.r1();
                    }
                    gVar3.t1(s12);
                    z12 = true;
                }
            } else if ((eVar4 instanceof n0.a) && ((n0.a) eVar4).u1() == 1) {
                z13 = true;
            }
        }
        if (z12) {
            for (int i15 = 0; i15 < size; i15++) {
                n0.e eVar5 = o12.get(i15);
                if (eVar5 instanceof n0.g) {
                    n0.g gVar4 = (n0.g) eVar5;
                    if (gVar4.p1() == 0) {
                        i(1, gVar4, interfaceC0362b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0362b);
        if (z13) {
            for (int i16 = 0; i16 < size; i16++) {
                n0.e eVar6 = o12.get(i16);
                if (eVar6 instanceof n0.a) {
                    n0.a aVar2 = (n0.a) eVar6;
                    if (aVar2.u1() == 1) {
                        c(0, aVar2, interfaceC0362b, 1, L1);
                    }
                }
            }
        }
        for (int i17 = 0; i17 < size; i17++) {
            n0.e eVar7 = o12.get(i17);
            if (eVar7.k0() && a(0, eVar7)) {
                n0.f.O1(0, eVar7, interfaceC0362b, f22095a, b.a.f22058k);
                if (!(eVar7 instanceof n0.g)) {
                    b(0, eVar7, interfaceC0362b, L1);
                } else if (((n0.g) eVar7).p1() != 0) {
                    b(0, eVar7, interfaceC0362b, L1);
                }
                i(0, eVar7, interfaceC0362b);
            }
        }
    }

    private static void i(int i10, n0.e eVar, b.InterfaceC0362b interfaceC0362b) {
        n0.d dVar;
        n0.d dVar2;
        n0.d dVar3;
        n0.d dVar4;
        if (eVar.n0()) {
            return;
        }
        f22097c++;
        if (!(eVar instanceof n0.f) && eVar.k0()) {
            int i11 = i10 + 1;
            if (a(i11, eVar)) {
                n0.f.O1(i11, eVar, interfaceC0362b, new b.a(), b.a.f22058k);
            }
        }
        n0.d m10 = eVar.m(d.b.TOP);
        n0.d m11 = eVar.m(d.b.BOTTOM);
        int d10 = m10.d();
        int d11 = m11.d();
        if (m10.c() != null && m10.m()) {
            Iterator<n0.d> it = m10.c().iterator();
            while (it.hasNext()) {
                n0.d next = it.next();
                n0.e eVar2 = next.f21587d;
                int i12 = i10 + 1;
                boolean a10 = a(i12, eVar2);
                if (eVar2.k0() && a10) {
                    n0.f.O1(i12, eVar2, interfaceC0362b, new b.a(), b.a.f22058k);
                }
                boolean z10 = (next == eVar2.P && (dVar4 = eVar2.R.f21589f) != null && dVar4.m()) || (next == eVar2.R && (dVar3 = eVar2.P.f21589f) != null && dVar3.m());
                e.b R = eVar2.R();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (R != bVar || a10) {
                    if (!eVar2.k0()) {
                        n0.d dVar5 = eVar2.P;
                        if (next == dVar5 && eVar2.R.f21589f == null) {
                            int e10 = dVar5.e() + d10;
                            eVar2.F0(e10, eVar2.v() + e10);
                        } else {
                            n0.d dVar6 = eVar2.R;
                            if (next == dVar6 && dVar5.f21589f == null) {
                                int e11 = d10 - dVar6.e();
                                eVar2.F0(e11 - eVar2.v(), e11);
                            } else if (z10 && !eVar2.i0()) {
                                f(i12, interfaceC0362b, eVar2);
                            }
                        }
                        i(i12, eVar2, interfaceC0362b);
                    }
                } else if (eVar2.R() == bVar && eVar2.D >= 0 && eVar2.C >= 0 && (eVar2.T() == 8 || (eVar2.f21640x == 0 && eVar2.t() == 0.0f))) {
                    if (!eVar2.i0() && !eVar2.j0() && z10 && !eVar2.i0()) {
                        g(i12, eVar, interfaceC0362b, eVar2);
                    }
                }
            }
        }
        if (eVar instanceof n0.g) {
            return;
        }
        if (m11.c() != null && m11.m()) {
            Iterator<n0.d> it2 = m11.c().iterator();
            while (it2.hasNext()) {
                n0.d next2 = it2.next();
                n0.e eVar3 = next2.f21587d;
                int i13 = i10 + 1;
                boolean a11 = a(i13, eVar3);
                if (eVar3.k0() && a11) {
                    n0.f.O1(i13, eVar3, interfaceC0362b, new b.a(), b.a.f22058k);
                }
                boolean z11 = (next2 == eVar3.P && (dVar2 = eVar3.R.f21589f) != null && dVar2.m()) || (next2 == eVar3.R && (dVar = eVar3.P.f21589f) != null && dVar.m());
                e.b R2 = eVar3.R();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                if (R2 != bVar2 || a11) {
                    if (!eVar3.k0()) {
                        n0.d dVar7 = eVar3.P;
                        if (next2 == dVar7 && eVar3.R.f21589f == null) {
                            int e12 = dVar7.e() + d11;
                            eVar3.F0(e12, eVar3.v() + e12);
                        } else {
                            n0.d dVar8 = eVar3.R;
                            if (next2 == dVar8 && dVar7.f21589f == null) {
                                int e13 = d11 - dVar8.e();
                                eVar3.F0(e13 - eVar3.v(), e13);
                            } else if (z11 && !eVar3.i0()) {
                                f(i13, interfaceC0362b, eVar3);
                            }
                        }
                        i(i13, eVar3, interfaceC0362b);
                    }
                } else if (eVar3.R() == bVar2 && eVar3.D >= 0 && eVar3.C >= 0 && (eVar3.T() == 8 || (eVar3.f21640x == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.i0() && !eVar3.j0() && z11 && !eVar3.i0()) {
                        g(i13, eVar, interfaceC0362b, eVar3);
                    }
                }
            }
        }
        n0.d m12 = eVar.m(d.b.BASELINE);
        if (m12.c() != null && m12.m()) {
            int d12 = m12.d();
            Iterator<n0.d> it3 = m12.c().iterator();
            while (it3.hasNext()) {
                n0.d next3 = it3.next();
                n0.e eVar4 = next3.f21587d;
                int i14 = i10 + 1;
                boolean a12 = a(i14, eVar4);
                if (eVar4.k0() && a12) {
                    n0.f.O1(i14, eVar4, interfaceC0362b, new b.a(), b.a.f22058k);
                }
                if (eVar4.R() != e.b.MATCH_CONSTRAINT || a12) {
                    if (!eVar4.k0() && next3 == eVar4.S) {
                        eVar4.B0(next3.e() + d12);
                        i(i14, eVar4, interfaceC0362b);
                    }
                }
            }
        }
        eVar.p0();
    }
}
