package com.google.protobuf;

import com.google.protobuf.d0;
import com.google.protobuf.t;
import com.google.protobuf.t1;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class v0<T> implements g1<T> {

    /* renamed from: a */
    private final r0 f13378a;

    /* renamed from: b */
    private final n1<?, ?> f13379b;

    /* renamed from: c */
    private final boolean f13380c;

    /* renamed from: d */
    private final p<?> f13381d;

    private v0(n1<?, ?> n1Var, p<?> pVar, r0 r0Var) {
        this.f13379b = n1Var;
        this.f13380c = pVar.e(r0Var);
        this.f13381d = pVar;
        this.f13378a = r0Var;
    }

    private <UT, UB> int j(n1<UT, UB> n1Var, T t10) {
        return n1Var.i(n1Var.g(t10));
    }

    private <UT, UB, ET extends t.b<ET>> void k(n1<UT, UB> n1Var, p<ET> pVar, T t10, f1 f1Var, o oVar) {
        UB f10 = n1Var.f(t10);
        t<ET> d10 = pVar.d(t10);
        do {
            try {
                if (f1Var.A() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                n1Var.o(t10, f10);
            }
        } while (m(f1Var, oVar, pVar, d10, n1Var, f10));
    }

    public static <T> v0<T> l(n1<?, ?> n1Var, p<?> pVar, r0 r0Var) {
        return new v0<>(n1Var, pVar, r0Var);
    }

    private <UT, UB, ET extends t.b<ET>> boolean m(f1 f1Var, o oVar, p<ET> pVar, t<ET> tVar, n1<UT, UB> n1Var, UB ub2) {
        int a10 = f1Var.a();
        if (a10 != t1.f13349a) {
            if (t1.b(a10) != 2) {
                return f1Var.D();
            }
            Object b10 = pVar.b(oVar, this.f13378a, t1.a(a10));
            if (b10 == null) {
                return n1Var.m(ub2, f1Var);
            }
            pVar.h(f1Var, b10, oVar, tVar);
            return true;
        }
        Object obj = null;
        int i10 = 0;
        g gVar = null;
        while (f1Var.A() != Integer.MAX_VALUE) {
            int a11 = f1Var.a();
            if (a11 == t1.f13351c) {
                i10 = f1Var.h();
                obj = pVar.b(oVar, this.f13378a, i10);
            } else if (a11 == t1.f13352d) {
                if (obj != null) {
                    pVar.h(f1Var, obj, oVar, tVar);
                } else {
                    gVar = f1Var.o();
                }
            } else if (!f1Var.D()) {
                break;
            }
        }
        if (f1Var.a() != t1.f13350b) {
            throw b0.b();
        }
        if (gVar != null) {
            if (obj != null) {
                pVar.i(gVar, obj, oVar, tVar);
            } else {
                n1Var.d(ub2, i10, gVar);
            }
        }
        return true;
    }

    private <UT, UB> void n(n1<UT, UB> n1Var, T t10, u1 u1Var) {
        n1Var.s(n1Var.g(t10), u1Var);
    }

    @Override // com.google.protobuf.g1
    public void a(T t10, T t11) {
        i1.G(this.f13379b, t10, t11);
        if (this.f13380c) {
            i1.E(this.f13381d, t10, t11);
        }
    }

    @Override // com.google.protobuf.g1
    public void b(T t10) {
        this.f13379b.j(t10);
        this.f13381d.f(t10);
    }

    @Override // com.google.protobuf.g1
    public final boolean c(T t10) {
        return this.f13381d.c(t10).p();
    }

    @Override // com.google.protobuf.g1
    public int d(T t10) {
        int j10 = j(this.f13379b, t10) + 0;
        return this.f13380c ? j10 + this.f13381d.c(t10).j() : j10;
    }

    @Override // com.google.protobuf.g1
    public T e() {
        r0 r0Var = this.f13378a;
        return r0Var instanceof x ? (T) ((x) r0Var).U() : (T) r0Var.d().f();
    }

    @Override // com.google.protobuf.g1
    public int f(T t10) {
        int hashCode = this.f13379b.g(t10).hashCode();
        return this.f13380c ? (hashCode * 53) + this.f13381d.c(t10).hashCode() : hashCode;
    }

    @Override // com.google.protobuf.g1
    public boolean g(T t10, T t11) {
        if (!this.f13379b.g(t10).equals(this.f13379b.g(t11))) {
            return false;
        }
        if (this.f13380c) {
            return this.f13381d.c(t10).equals(this.f13381d.c(t11));
        }
        return true;
    }

    @Override // com.google.protobuf.g1
    public void h(T t10, u1 u1Var) {
        Iterator<Map.Entry<?, Object>> t11 = this.f13381d.c(t10).t();
        while (t11.hasNext()) {
            Map.Entry<?, Object> next = t11.next();
            t.b bVar = (t.b) next.getKey();
            if (bVar.e() != t1.c.MESSAGE || bVar.c() || bVar.f()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            u1Var.b(bVar.a(), next instanceof d0.b ? ((d0.b) next).a().e() : next.getValue());
        }
        n(this.f13379b, t10, u1Var);
    }

    @Override // com.google.protobuf.g1
    public void i(T t10, f1 f1Var, o oVar) {
        k(this.f13379b, this.f13381d, t10, f1Var, oVar);
    }
}
