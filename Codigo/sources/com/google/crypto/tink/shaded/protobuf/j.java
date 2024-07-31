package com.google.crypto.tink.shaded.protobuf;

import com.google.android.gms.common.api.a;
import com.google.crypto.tink.shaded.protobuf.k0;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class j implements f1 {

    /* renamed from: a, reason: collision with root package name */
    private final i f11421a;

    /* renamed from: b, reason: collision with root package name */
    private int f11422b;

    /* renamed from: c, reason: collision with root package name */
    private int f11423c;

    /* renamed from: d, reason: collision with root package name */
    private int f11424d = 0;

    private j(i iVar) {
        i iVar2 = (i) a0.b(iVar, "input");
        this.f11421a = iVar2;
        iVar2.f11395d = this;
    }

    public static j Q(i iVar) {
        j jVar = iVar.f11395d;
        return jVar != null ? jVar : new j(iVar);
    }

    private <T> void R(T t10, g1<T> g1Var, p pVar) {
        int i10 = this.f11423c;
        this.f11423c = t1.c(t1.a(this.f11422b), 4);
        try {
            g1Var.i(t10, this, pVar);
            if (this.f11422b == this.f11423c) {
            } else {
                throw b0.h();
            }
        } finally {
            this.f11423c = i10;
        }
    }

    private <T> void S(T t10, g1<T> g1Var, p pVar) {
        int C = this.f11421a.C();
        i iVar = this.f11421a;
        if (iVar.f11392a >= iVar.f11393b) {
            throw b0.i();
        }
        int l10 = iVar.l(C);
        this.f11421a.f11392a++;
        g1Var.i(t10, this, pVar);
        this.f11421a.a(0);
        r5.f11392a--;
        this.f11421a.k(l10);
    }

    private <T> T T(g1<T> g1Var, p pVar) {
        T e10 = g1Var.e();
        R(e10, g1Var, pVar);
        g1Var.b(e10);
        return e10;
    }

    private <T> T U(g1<T> g1Var, p pVar) {
        T e10 = g1Var.e();
        S(e10, g1Var, pVar);
        g1Var.b(e10);
        return e10;
    }

    private void W(int i10) {
        if (this.f11421a.d() != i10) {
            throw b0.m();
        }
    }

    private void X(int i10) {
        if (t1.b(this.f11422b) != i10) {
            throw b0.e();
        }
    }

    private void Y(int i10) {
        if ((i10 & 3) != 0) {
            throw b0.h();
        }
    }

    private void Z(int i10) {
        if ((i10 & 7) != 0) {
            throw b0.h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int A() {
        int i10 = this.f11424d;
        if (i10 != 0) {
            this.f11422b = i10;
            this.f11424d = 0;
        } else {
            this.f11422b = this.f11421a.B();
        }
        int i11 = this.f11422b;
        return (i11 == 0 || i11 == this.f11423c) ? a.e.API_PRIORITY_OTHER : t1.a(i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void B(List<String> list) {
        V(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void C(List<Float> list) {
        int B;
        int B2;
        if (!(list instanceof w)) {
            int b10 = t1.b(this.f11422b);
            if (b10 == 2) {
                int C = this.f11421a.C();
                Y(C);
                int d10 = this.f11421a.d() + C;
                do {
                    list.add(Float.valueOf(this.f11421a.s()));
                } while (this.f11421a.d() < d10);
                return;
            }
            if (b10 != 5) {
                throw b0.e();
            }
            do {
                list.add(Float.valueOf(this.f11421a.s()));
                if (this.f11421a.e()) {
                    return;
                } else {
                    B = this.f11421a.B();
                }
            } while (B == this.f11422b);
            this.f11424d = B;
            return;
        }
        w wVar = (w) list;
        int b11 = t1.b(this.f11422b);
        if (b11 == 2) {
            int C2 = this.f11421a.C();
            Y(C2);
            int d11 = this.f11421a.d() + C2;
            do {
                wVar.h(this.f11421a.s());
            } while (this.f11421a.d() < d11);
            return;
        }
        if (b11 != 5) {
            throw b0.e();
        }
        do {
            wVar.h(this.f11421a.s());
            if (this.f11421a.e()) {
                return;
            } else {
                B2 = this.f11421a.B();
            }
        } while (B2 == this.f11422b);
        this.f11424d = B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public boolean D() {
        int i10;
        if (this.f11421a.e() || (i10 = this.f11422b) == this.f11423c) {
            return false;
        }
        return this.f11421a.E(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int E() {
        X(5);
        return this.f11421a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void F(List<h> list) {
        int B;
        if (t1.b(this.f11422b) != 2) {
            throw b0.e();
        }
        do {
            list.add(o());
            if (this.f11421a.e()) {
                return;
            } else {
                B = this.f11421a.B();
            }
        } while (B == this.f11422b);
        this.f11424d = B;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void G(List<Double> list) {
        int B;
        int B2;
        if (!(list instanceof m)) {
            int b10 = t1.b(this.f11422b);
            if (b10 != 1) {
                if (b10 != 2) {
                    throw b0.e();
                }
                int C = this.f11421a.C();
                Z(C);
                int d10 = this.f11421a.d() + C;
                do {
                    list.add(Double.valueOf(this.f11421a.o()));
                } while (this.f11421a.d() < d10);
                return;
            }
            do {
                list.add(Double.valueOf(this.f11421a.o()));
                if (this.f11421a.e()) {
                    return;
                } else {
                    B = this.f11421a.B();
                }
            } while (B == this.f11422b);
            this.f11424d = B;
            return;
        }
        m mVar = (m) list;
        int b11 = t1.b(this.f11422b);
        if (b11 != 1) {
            if (b11 != 2) {
                throw b0.e();
            }
            int C2 = this.f11421a.C();
            Z(C2);
            int d11 = this.f11421a.d() + C2;
            do {
                mVar.h(this.f11421a.o());
            } while (this.f11421a.d() < d11);
            return;
        }
        do {
            mVar.h(this.f11421a.o());
            if (this.f11421a.e()) {
                return;
            } else {
                B2 = this.f11421a.B();
            }
        } while (B2 == this.f11422b);
        this.f11424d = B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long H() {
        X(0);
        return this.f11421a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public String I() {
        X(2);
        return this.f11421a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> void J(T t10, g1<T> g1Var, p pVar) {
        X(3);
        R(t10, g1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    @Deprecated
    public <T> T K(Class<T> cls, p pVar) {
        X(3);
        return (T) T(c1.a().c(cls), pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <K, V> void L(Map<K, V> map, k0.a<K, V> aVar, p pVar) {
        X(2);
        this.f11421a.l(this.f11421a.C());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> void M(T t10, g1<T> g1Var, p pVar) {
        X(2);
        S(t10, g1Var, pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> void N(List<T> list, g1<T> g1Var, p pVar) {
        int B;
        if (t1.b(this.f11422b) != 2) {
            throw b0.e();
        }
        int i10 = this.f11422b;
        do {
            list.add(U(g1Var, pVar));
            if (this.f11421a.e() || this.f11424d != 0) {
                return;
            } else {
                B = this.f11421a.B();
            }
        } while (B == i10);
        this.f11424d = B;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public <T> T O(Class<T> cls, p pVar) {
        X(2);
        return (T) U(c1.a().c(cls), pVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.f1
    @Deprecated
    public <T> void P(List<T> list, g1<T> g1Var, p pVar) {
        int B;
        if (t1.b(this.f11422b) != 3) {
            throw b0.e();
        }
        int i10 = this.f11422b;
        do {
            list.add(T(g1Var, pVar));
            if (this.f11421a.e() || this.f11424d != 0) {
                return;
            } else {
                B = this.f11421a.B();
            }
        } while (B == i10);
        this.f11424d = B;
    }

    public void V(List<String> list, boolean z10) {
        int B;
        int B2;
        if (t1.b(this.f11422b) != 2) {
            throw b0.e();
        }
        if (!(list instanceof g0) || z10) {
            do {
                list.add(z10 ? I() : z());
                if (this.f11421a.e()) {
                    return;
                } else {
                    B = this.f11421a.B();
                }
            } while (B == this.f11422b);
            this.f11424d = B;
            return;
        }
        g0 g0Var = (g0) list;
        do {
            g0Var.j1(o());
            if (this.f11421a.e()) {
                return;
            } else {
                B2 = this.f11421a.B();
            }
        } while (B2 == this.f11422b);
        this.f11424d = B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int a() {
        return this.f11422b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long b() {
        X(1);
        return this.f11421a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void c(List<Integer> list) {
        int B;
        int B2;
        if (!(list instanceof z)) {
            int b10 = t1.b(this.f11422b);
            if (b10 == 2) {
                int C = this.f11421a.C();
                Y(C);
                int d10 = this.f11421a.d() + C;
                do {
                    list.add(Integer.valueOf(this.f11421a.v()));
                } while (this.f11421a.d() < d10);
                return;
            }
            if (b10 != 5) {
                throw b0.e();
            }
            do {
                list.add(Integer.valueOf(this.f11421a.v()));
                if (this.f11421a.e()) {
                    return;
                } else {
                    B = this.f11421a.B();
                }
            } while (B == this.f11422b);
            this.f11424d = B;
            return;
        }
        z zVar = (z) list;
        int b11 = t1.b(this.f11422b);
        if (b11 == 2) {
            int C2 = this.f11421a.C();
            Y(C2);
            int d11 = this.f11421a.d() + C2;
            do {
                zVar.F0(this.f11421a.v());
            } while (this.f11421a.d() < d11);
            return;
        }
        if (b11 != 5) {
            throw b0.e();
        }
        do {
            zVar.F0(this.f11421a.v());
            if (this.f11421a.e()) {
                return;
            } else {
                B2 = this.f11421a.B();
            }
        } while (B2 == this.f11422b);
        this.f11424d = B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void d(List<Long> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof i0)) {
            int b10 = t1.b(this.f11422b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f11421a.d() + this.f11421a.C();
                do {
                    list.add(Long.valueOf(this.f11421a.y()));
                } while (this.f11421a.d() < d10);
            }
            do {
                list.add(Long.valueOf(this.f11421a.y()));
                if (this.f11421a.e()) {
                    return;
                } else {
                    B = this.f11421a.B();
                }
            } while (B == this.f11422b);
            this.f11424d = B;
            return;
        }
        i0 i0Var = (i0) list;
        int b11 = t1.b(this.f11422b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f11421a.d() + this.f11421a.C();
            do {
                i0Var.k(this.f11421a.y());
            } while (this.f11421a.d() < d10);
        }
        do {
            i0Var.k(this.f11421a.y());
            if (this.f11421a.e()) {
                return;
            } else {
                B2 = this.f11421a.B();
            }
        } while (B2 == this.f11422b);
        this.f11424d = B2;
        return;
        W(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public boolean e() {
        X(0);
        return this.f11421a.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long f() {
        X(1);
        return this.f11421a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void g(List<Long> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof i0)) {
            int b10 = t1.b(this.f11422b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f11421a.d() + this.f11421a.C();
                do {
                    list.add(Long.valueOf(this.f11421a.D()));
                } while (this.f11421a.d() < d10);
            }
            do {
                list.add(Long.valueOf(this.f11421a.D()));
                if (this.f11421a.e()) {
                    return;
                } else {
                    B = this.f11421a.B();
                }
            } while (B == this.f11422b);
            this.f11424d = B;
            return;
        }
        i0 i0Var = (i0) list;
        int b11 = t1.b(this.f11422b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f11421a.d() + this.f11421a.C();
            do {
                i0Var.k(this.f11421a.D());
            } while (this.f11421a.d() < d10);
        }
        do {
            i0Var.k(this.f11421a.D());
            if (this.f11421a.e()) {
                return;
            } else {
                B2 = this.f11421a.B();
            }
        } while (B2 == this.f11422b);
        this.f11424d = B2;
        return;
        W(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int h() {
        X(0);
        return this.f11421a.C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void i(List<Long> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof i0)) {
            int b10 = t1.b(this.f11422b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f11421a.d() + this.f11421a.C();
                do {
                    list.add(Long.valueOf(this.f11421a.u()));
                } while (this.f11421a.d() < d10);
            }
            do {
                list.add(Long.valueOf(this.f11421a.u()));
                if (this.f11421a.e()) {
                    return;
                } else {
                    B = this.f11421a.B();
                }
            } while (B == this.f11422b);
            this.f11424d = B;
            return;
        }
        i0 i0Var = (i0) list;
        int b11 = t1.b(this.f11422b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f11421a.d() + this.f11421a.C();
            do {
                i0Var.k(this.f11421a.u());
            } while (this.f11421a.d() < d10);
        }
        do {
            i0Var.k(this.f11421a.u());
            if (this.f11421a.e()) {
                return;
            } else {
                B2 = this.f11421a.B();
            }
        } while (B2 == this.f11422b);
        this.f11424d = B2;
        return;
        W(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void j(List<Integer> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof z)) {
            int b10 = t1.b(this.f11422b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f11421a.d() + this.f11421a.C();
                do {
                    list.add(Integer.valueOf(this.f11421a.p()));
                } while (this.f11421a.d() < d10);
            }
            do {
                list.add(Integer.valueOf(this.f11421a.p()));
                if (this.f11421a.e()) {
                    return;
                } else {
                    B = this.f11421a.B();
                }
            } while (B == this.f11422b);
            this.f11424d = B;
            return;
        }
        z zVar = (z) list;
        int b11 = t1.b(this.f11422b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f11421a.d() + this.f11421a.C();
            do {
                zVar.F0(this.f11421a.p());
            } while (this.f11421a.d() < d10);
        }
        do {
            zVar.F0(this.f11421a.p());
            if (this.f11421a.e()) {
                return;
            } else {
                B2 = this.f11421a.B();
            }
        } while (B2 == this.f11422b);
        this.f11424d = B2;
        return;
        W(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int k() {
        X(0);
        return this.f11421a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int l() {
        X(0);
        return this.f11421a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void m(List<Boolean> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof f)) {
            int b10 = t1.b(this.f11422b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f11421a.d() + this.f11421a.C();
                do {
                    list.add(Boolean.valueOf(this.f11421a.m()));
                } while (this.f11421a.d() < d10);
            }
            do {
                list.add(Boolean.valueOf(this.f11421a.m()));
                if (this.f11421a.e()) {
                    return;
                } else {
                    B = this.f11421a.B();
                }
            } while (B == this.f11422b);
            this.f11424d = B;
            return;
        }
        f fVar = (f) list;
        int b11 = t1.b(this.f11422b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f11421a.d() + this.f11421a.C();
            do {
                fVar.k(this.f11421a.m());
            } while (this.f11421a.d() < d10);
        }
        do {
            fVar.k(this.f11421a.m());
            if (this.f11421a.e()) {
                return;
            } else {
                B2 = this.f11421a.B();
            }
        } while (B2 == this.f11422b);
        this.f11424d = B2;
        return;
        W(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void n(List<String> list) {
        V(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public h o() {
        X(2);
        return this.f11421a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int p() {
        X(0);
        return this.f11421a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void q(List<Long> list) {
        int B;
        int B2;
        if (!(list instanceof i0)) {
            int b10 = t1.b(this.f11422b);
            if (b10 != 1) {
                if (b10 != 2) {
                    throw b0.e();
                }
                int C = this.f11421a.C();
                Z(C);
                int d10 = this.f11421a.d() + C;
                do {
                    list.add(Long.valueOf(this.f11421a.r()));
                } while (this.f11421a.d() < d10);
                return;
            }
            do {
                list.add(Long.valueOf(this.f11421a.r()));
                if (this.f11421a.e()) {
                    return;
                } else {
                    B = this.f11421a.B();
                }
            } while (B == this.f11422b);
            this.f11424d = B;
            return;
        }
        i0 i0Var = (i0) list;
        int b11 = t1.b(this.f11422b);
        if (b11 != 1) {
            if (b11 != 2) {
                throw b0.e();
            }
            int C2 = this.f11421a.C();
            Z(C2);
            int d11 = this.f11421a.d() + C2;
            do {
                i0Var.k(this.f11421a.r());
            } while (this.f11421a.d() < d11);
            return;
        }
        do {
            i0Var.k(this.f11421a.r());
            if (this.f11421a.e()) {
                return;
            } else {
                B2 = this.f11421a.B();
            }
        } while (B2 == this.f11422b);
        this.f11424d = B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void r(List<Integer> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof z)) {
            int b10 = t1.b(this.f11422b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f11421a.d() + this.f11421a.C();
                do {
                    list.add(Integer.valueOf(this.f11421a.x()));
                } while (this.f11421a.d() < d10);
            }
            do {
                list.add(Integer.valueOf(this.f11421a.x()));
                if (this.f11421a.e()) {
                    return;
                } else {
                    B = this.f11421a.B();
                }
            } while (B == this.f11422b);
            this.f11424d = B;
            return;
        }
        z zVar = (z) list;
        int b11 = t1.b(this.f11422b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f11421a.d() + this.f11421a.C();
            do {
                zVar.F0(this.f11421a.x());
            } while (this.f11421a.d() < d10);
        }
        do {
            zVar.F0(this.f11421a.x());
            if (this.f11421a.e()) {
                return;
            } else {
                B2 = this.f11421a.B();
            }
        } while (B2 == this.f11422b);
        this.f11424d = B2;
        return;
        W(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public double readDouble() {
        X(1);
        return this.f11421a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public float readFloat() {
        X(5);
        return this.f11421a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long s() {
        X(0);
        return this.f11421a.D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void t(List<Integer> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof z)) {
            int b10 = t1.b(this.f11422b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f11421a.d() + this.f11421a.C();
                do {
                    list.add(Integer.valueOf(this.f11421a.C()));
                } while (this.f11421a.d() < d10);
            }
            do {
                list.add(Integer.valueOf(this.f11421a.C()));
                if (this.f11421a.e()) {
                    return;
                } else {
                    B = this.f11421a.B();
                }
            } while (B == this.f11422b);
            this.f11424d = B;
            return;
        }
        z zVar = (z) list;
        int b11 = t1.b(this.f11422b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f11421a.d() + this.f11421a.C();
            do {
                zVar.F0(this.f11421a.C());
            } while (this.f11421a.d() < d10);
        }
        do {
            zVar.F0(this.f11421a.C());
            if (this.f11421a.e()) {
                return;
            } else {
                B2 = this.f11421a.B();
            }
        } while (B2 == this.f11422b);
        this.f11424d = B2;
        return;
        W(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public int u() {
        X(5);
        return this.f11421a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void v(List<Long> list) {
        int B;
        int B2;
        if (!(list instanceof i0)) {
            int b10 = t1.b(this.f11422b);
            if (b10 != 1) {
                if (b10 != 2) {
                    throw b0.e();
                }
                int C = this.f11421a.C();
                Z(C);
                int d10 = this.f11421a.d() + C;
                do {
                    list.add(Long.valueOf(this.f11421a.w()));
                } while (this.f11421a.d() < d10);
                return;
            }
            do {
                list.add(Long.valueOf(this.f11421a.w()));
                if (this.f11421a.e()) {
                    return;
                } else {
                    B = this.f11421a.B();
                }
            } while (B == this.f11422b);
            this.f11424d = B;
            return;
        }
        i0 i0Var = (i0) list;
        int b11 = t1.b(this.f11422b);
        if (b11 != 1) {
            if (b11 != 2) {
                throw b0.e();
            }
            int C2 = this.f11421a.C();
            Z(C2);
            int d11 = this.f11421a.d() + C2;
            do {
                i0Var.k(this.f11421a.w());
            } while (this.f11421a.d() < d11);
            return;
        }
        do {
            i0Var.k(this.f11421a.w());
            if (this.f11421a.e()) {
                return;
            } else {
                B2 = this.f11421a.B();
            }
        } while (B2 == this.f11422b);
        this.f11424d = B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void w(List<Integer> list) {
        int B;
        int d10;
        int B2;
        if (!(list instanceof z)) {
            int b10 = t1.b(this.f11422b);
            if (b10 != 0) {
                if (b10 != 2) {
                    throw b0.e();
                }
                d10 = this.f11421a.d() + this.f11421a.C();
                do {
                    list.add(Integer.valueOf(this.f11421a.t()));
                } while (this.f11421a.d() < d10);
            }
            do {
                list.add(Integer.valueOf(this.f11421a.t()));
                if (this.f11421a.e()) {
                    return;
                } else {
                    B = this.f11421a.B();
                }
            } while (B == this.f11422b);
            this.f11424d = B;
            return;
        }
        z zVar = (z) list;
        int b11 = t1.b(this.f11422b);
        if (b11 != 0) {
            if (b11 != 2) {
                throw b0.e();
            }
            d10 = this.f11421a.d() + this.f11421a.C();
            do {
                zVar.F0(this.f11421a.t());
            } while (this.f11421a.d() < d10);
        }
        do {
            zVar.F0(this.f11421a.t());
            if (this.f11421a.e()) {
                return;
            } else {
                B2 = this.f11421a.B();
            }
        } while (B2 == this.f11422b);
        this.f11424d = B2;
        return;
        W(d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public void x(List<Integer> list) {
        int B;
        int B2;
        if (!(list instanceof z)) {
            int b10 = t1.b(this.f11422b);
            if (b10 == 2) {
                int C = this.f11421a.C();
                Y(C);
                int d10 = this.f11421a.d() + C;
                do {
                    list.add(Integer.valueOf(this.f11421a.q()));
                } while (this.f11421a.d() < d10);
                return;
            }
            if (b10 != 5) {
                throw b0.e();
            }
            do {
                list.add(Integer.valueOf(this.f11421a.q()));
                if (this.f11421a.e()) {
                    return;
                } else {
                    B = this.f11421a.B();
                }
            } while (B == this.f11422b);
            this.f11424d = B;
            return;
        }
        z zVar = (z) list;
        int b11 = t1.b(this.f11422b);
        if (b11 == 2) {
            int C2 = this.f11421a.C();
            Y(C2);
            int d11 = this.f11421a.d() + C2;
            do {
                zVar.F0(this.f11421a.q());
            } while (this.f11421a.d() < d11);
            return;
        }
        if (b11 != 5) {
            throw b0.e();
        }
        do {
            zVar.F0(this.f11421a.q());
            if (this.f11421a.e()) {
                return;
            } else {
                B2 = this.f11421a.B();
            }
        } while (B2 == this.f11422b);
        this.f11424d = B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public long y() {
        X(0);
        return this.f11421a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f1
    public String z() {
        X(2);
        return this.f11421a.z();
    }
}
