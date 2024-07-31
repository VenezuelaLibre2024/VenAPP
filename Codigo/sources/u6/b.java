package u6;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import t6.d4;
import t6.i4;
import t6.j3;
import v7.a0;

/* loaded from: classes.dex */
public interface b {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f27114a;

        /* renamed from: b, reason: collision with root package name */
        public final d4 f27115b;

        /* renamed from: c, reason: collision with root package name */
        public final int f27116c;

        /* renamed from: d, reason: collision with root package name */
        public final a0.b f27117d;

        /* renamed from: e, reason: collision with root package name */
        public final long f27118e;

        /* renamed from: f, reason: collision with root package name */
        public final d4 f27119f;

        /* renamed from: g, reason: collision with root package name */
        public final int f27120g;

        /* renamed from: h, reason: collision with root package name */
        public final a0.b f27121h;

        /* renamed from: i, reason: collision with root package name */
        public final long f27122i;

        /* renamed from: j, reason: collision with root package name */
        public final long f27123j;

        public a(long j10, d4 d4Var, int i10, a0.b bVar, long j11, d4 d4Var2, int i11, a0.b bVar2, long j12, long j13) {
            this.f27114a = j10;
            this.f27115b = d4Var;
            this.f27116c = i10;
            this.f27117d = bVar;
            this.f27118e = j11;
            this.f27119f = d4Var2;
            this.f27120g = i11;
            this.f27121h = bVar2;
            this.f27122i = j12;
            this.f27123j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f27114a == aVar.f27114a && this.f27116c == aVar.f27116c && this.f27118e == aVar.f27118e && this.f27120g == aVar.f27120g && this.f27122i == aVar.f27122i && this.f27123j == aVar.f27123j && eb.k.a(this.f27115b, aVar.f27115b) && eb.k.a(this.f27117d, aVar.f27117d) && eb.k.a(this.f27119f, aVar.f27119f) && eb.k.a(this.f27121h, aVar.f27121h);
        }

        public int hashCode() {
            return eb.k.b(Long.valueOf(this.f27114a), this.f27115b, Integer.valueOf(this.f27116c), this.f27117d, Long.valueOf(this.f27118e), this.f27119f, Integer.valueOf(this.f27120g), this.f27121h, Long.valueOf(this.f27122i), Long.valueOf(this.f27123j));
        }
    }

    /* renamed from: u6.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0446b {

        /* renamed from: a, reason: collision with root package name */
        private final t8.l f27124a;

        /* renamed from: b, reason: collision with root package name */
        private final SparseArray<a> f27125b;

        public C0446b(t8.l lVar, SparseArray<a> sparseArray) {
            this.f27124a = lVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(lVar.c());
            for (int i10 = 0; i10 < lVar.c(); i10++) {
                int b10 = lVar.b(i10);
                sparseArray2.append(b10, (a) t8.a.e(sparseArray.get(b10)));
            }
            this.f27125b = sparseArray2;
        }

        public boolean a(int i10) {
            return this.f27124a.a(i10);
        }

        public int b(int i10) {
            return this.f27124a.b(i10);
        }

        public a c(int i10) {
            return (a) t8.a.e(this.f27125b.get(i10));
        }

        public int d() {
            return this.f27124a.c();
        }
    }

    default void A(a aVar, int i10, int i11) {
    }

    default void B(a aVar, v7.u uVar, v7.x xVar) {
    }

    default void D(a aVar, String str, long j10, long j11) {
    }

    default void E(a aVar, boolean z10) {
    }

    default void F(a aVar, t6.v vVar) {
    }

    default void G(a aVar, v7.u uVar, v7.x xVar) {
    }

    default void H(a aVar, j3.e eVar, j3.e eVar2, int i10) {
    }

    default void I(a aVar) {
    }

    @Deprecated
    default void J(a aVar) {
    }

    default void K(a aVar, v7.x xVar) {
    }

    default void L(a aVar, float f10) {
    }

    @Deprecated
    default void M(a aVar, int i10, String str, long j10) {
    }

    @Deprecated
    default void N(a aVar, int i10, w6.e eVar) {
    }

    default void O(a aVar, t6.f3 f3Var) {
    }

    default void P(a aVar, int i10, long j10, long j11) {
    }

    default void Q(a aVar, int i10, long j10, long j11) {
    }

    @Deprecated
    default void R(a aVar, int i10, int i11, int i12, float f10) {
    }

    @Deprecated
    default void S(a aVar, int i10) {
    }

    default void T(a aVar, t6.i3 i3Var) {
    }

    default void U(a aVar, int i10, boolean z10) {
    }

    default void V(a aVar, String str, long j10, long j11) {
    }

    default void W(a aVar, int i10) {
    }

    @Deprecated
    default void X(a aVar) {
    }

    default void Z(a aVar, t6.u1 u1Var, w6.i iVar) {
    }

    default void a(a aVar, t6.h2 h2Var) {
    }

    @Deprecated
    default void a0(a aVar, int i10, t6.u1 u1Var) {
    }

    default void b(a aVar, v7.u uVar, v7.x xVar) {
    }

    default void c(a aVar, t6.f3 f3Var) {
    }

    default void c0(a aVar) {
    }

    @Deprecated
    default void d(a aVar, boolean z10) {
    }

    default void d0(a aVar, int i10, long j10) {
    }

    default void e(a aVar) {
    }

    default void e0(a aVar, t6.u1 u1Var, w6.i iVar) {
    }

    default void f(a aVar, long j10, int i10) {
    }

    default void f0(a aVar, Exception exc) {
    }

    @Deprecated
    default void g(a aVar, String str, long j10) {
    }

    default void g0(a aVar, boolean z10) {
    }

    default void h(a aVar, int i10) {
    }

    @Deprecated
    default void h0(a aVar, List<g8.b> list) {
    }

    default void i(a aVar, long j10) {
    }

    default void i0(a aVar, l7.a aVar2) {
    }

    default void j(a aVar, String str) {
    }

    default void k(a aVar, v6.e eVar) {
    }

    default void k0(t6.j3 j3Var, C0446b c0446b) {
    }

    @Deprecated
    default void l(a aVar, t6.u1 u1Var) {
    }

    default void l0(a aVar, int i10) {
    }

    default void m(a aVar, Exception exc) {
    }

    default void m0(a aVar, t6.c2 c2Var, int i10) {
    }

    @Deprecated
    default void n(a aVar, boolean z10, int i10) {
    }

    default void n0(a aVar) {
    }

    @Deprecated
    default void o(a aVar, String str, long j10) {
    }

    default void o0(a aVar, w6.e eVar) {
    }

    default void p(a aVar, boolean z10, int i10) {
    }

    @Deprecated
    default void p0(a aVar) {
    }

    default void q(a aVar, w6.e eVar) {
    }

    default void q0(a aVar, w6.e eVar) {
    }

    @Deprecated
    default void r(a aVar, t6.u1 u1Var) {
    }

    default void r0(a aVar, u8.a0 a0Var) {
    }

    default void s(a aVar, String str) {
    }

    default void s0(a aVar, Exception exc) {
    }

    default void t(a aVar, v7.x xVar) {
    }

    default void t0(a aVar, Object obj, long j10) {
    }

    default void u(a aVar, int i10) {
    }

    default void u0(a aVar, g8.f fVar) {
    }

    default void v(a aVar, v7.u uVar, v7.x xVar, IOException iOException, boolean z10) {
    }

    default void v0(a aVar, j3.b bVar) {
    }

    default void w(a aVar, Exception exc) {
    }

    default void w0(a aVar, i4 i4Var) {
    }

    @Deprecated
    default void x(a aVar, int i10, w6.e eVar) {
    }

    default void x0(a aVar, int i10) {
    }

    default void y(a aVar, boolean z10) {
    }

    default void y0(a aVar, w6.e eVar) {
    }

    default void z(a aVar) {
    }
}
