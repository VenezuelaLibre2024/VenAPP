package p376u6;

import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import p082eb.C7155k;
import p120g8.C7484b;
import p120g8.C7488f;
import p216l7.C9400a;
import p361t6.AbstractC11018d4;
import p361t6.C11010c2;
import p361t6.C11029f3;
import p361t6.C11040h2;
import p361t6.C11047i3;
import p361t6.C11048i4;
import p361t6.C11108u1;
import p361t6.C11111v;
import p361t6.InterfaceC11053j3;
import p363t8.C11137a;
import p363t8.C11159l;
import p378u8.C11448a0;
import p396v6.C11639e;
import p397v7.C11731u;
import p397v7.C11737x;
import p397v7.InterfaceC11684a0;
import p414w6.C12080e;
import p414w6.C12084i;

/* renamed from: u6.b */
/* loaded from: classes.dex */
public interface InterfaceC11332b {

    /* renamed from: u6.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        public final long f29416a;

        /* renamed from: b */
        public final AbstractC11018d4 f29417b;

        /* renamed from: c */
        public final int f29418c;

        /* renamed from: d */
        public final InterfaceC11684a0.b f29419d;

        /* renamed from: e */
        public final long f29420e;

        /* renamed from: f */
        public final AbstractC11018d4 f29421f;

        /* renamed from: g */
        public final int f29422g;

        /* renamed from: h */
        public final InterfaceC11684a0.b f29423h;

        /* renamed from: i */
        public final long f29424i;

        /* renamed from: j */
        public final long f29425j;

        public a(long j10, AbstractC11018d4 abstractC11018d4, int i10, InterfaceC11684a0.b bVar, long j11, AbstractC11018d4 abstractC11018d42, int i11, InterfaceC11684a0.b bVar2, long j12, long j13) {
            this.f29416a = j10;
            this.f29417b = abstractC11018d4;
            this.f29418c = i10;
            this.f29419d = bVar;
            this.f29420e = j11;
            this.f29421f = abstractC11018d42;
            this.f29422g = i11;
            this.f29423h = bVar2;
            this.f29424i = j12;
            this.f29425j = j13;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29416a == aVar.f29416a && this.f29418c == aVar.f29418c && this.f29420e == aVar.f29420e && this.f29422g == aVar.f29422g && this.f29424i == aVar.f29424i && this.f29425j == aVar.f29425j && C7155k.m21289a(this.f29417b, aVar.f29417b) && C7155k.m21289a(this.f29419d, aVar.f29419d) && C7155k.m21289a(this.f29421f, aVar.f29421f) && C7155k.m21289a(this.f29423h, aVar.f29423h);
        }

        public int hashCode() {
            return C7155k.m21290b(Long.valueOf(this.f29416a), this.f29417b, Integer.valueOf(this.f29418c), this.f29419d, Long.valueOf(this.f29420e), this.f29421f, Integer.valueOf(this.f29422g), this.f29423h, Long.valueOf(this.f29424i), Long.valueOf(this.f29425j));
        }
    }

    /* renamed from: u6.b$b */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final C11159l f29426a;

        /* renamed from: b */
        private final SparseArray<a> f29427b;

        public b(C11159l c11159l, SparseArray<a> sparseArray) {
            this.f29426a = c11159l;
            SparseArray<a> sparseArray2 = new SparseArray<>(c11159l.m34762c());
            for (int i10 = 0; i10 < c11159l.m34762c(); i10++) {
                int m34761b = c11159l.m34761b(i10);
                sparseArray2.append(m34761b, (a) C11137a.m34603e(sparseArray.get(m34761b)));
            }
            this.f29427b = sparseArray2;
        }

        /* renamed from: a */
        public boolean m35513a(int i10) {
            return this.f29426a.m34760a(i10);
        }

        /* renamed from: b */
        public int m35514b(int i10) {
            return this.f29426a.m34761b(i10);
        }

        /* renamed from: c */
        public a m35515c(int i10) {
            return (a) C11137a.m34603e(this.f29427b.get(i10));
        }

        /* renamed from: d */
        public int m35516d() {
            return this.f29426a.m34762c();
        }
    }

    /* renamed from: A */
    default void m35440A(a aVar, int i10, int i11) {
    }

    /* renamed from: B */
    default void m35441B(a aVar, C11731u c11731u, C11737x c11737x) {
    }

    /* renamed from: D */
    default void m35442D(a aVar, String str, long j10, long j11) {
    }

    /* renamed from: E */
    default void m35443E(a aVar, boolean z10) {
    }

    /* renamed from: F */
    default void m35444F(a aVar, C11111v c11111v) {
    }

    /* renamed from: G */
    default void m35445G(a aVar, C11731u c11731u, C11737x c11737x) {
    }

    /* renamed from: H */
    default void mo35446H(a aVar, InterfaceC11053j3.e eVar, InterfaceC11053j3.e eVar2, int i10) {
    }

    /* renamed from: I */
    default void m35447I(a aVar) {
    }

    @Deprecated
    /* renamed from: J */
    default void m35448J(a aVar) {
    }

    /* renamed from: K */
    default void mo35449K(a aVar, C11737x c11737x) {
    }

    /* renamed from: L */
    default void m35450L(a aVar, float f10) {
    }

    @Deprecated
    /* renamed from: M */
    default void m35451M(a aVar, int i10, String str, long j10) {
    }

    @Deprecated
    /* renamed from: N */
    default void m35452N(a aVar, int i10, C12080e c12080e) {
    }

    /* renamed from: O */
    default void m35453O(a aVar, C11029f3 c11029f3) {
    }

    /* renamed from: P */
    default void mo35454P(a aVar, int i10, long j10, long j11) {
    }

    /* renamed from: Q */
    default void m35455Q(a aVar, int i10, long j10, long j11) {
    }

    @Deprecated
    /* renamed from: R */
    default void m35456R(a aVar, int i10, int i11, int i12, float f10) {
    }

    @Deprecated
    /* renamed from: S */
    default void m35457S(a aVar, int i10) {
    }

    /* renamed from: T */
    default void m35458T(a aVar, C11047i3 c11047i3) {
    }

    /* renamed from: U */
    default void m35459U(a aVar, int i10, boolean z10) {
    }

    /* renamed from: V */
    default void m35460V(a aVar, String str, long j10, long j11) {
    }

    /* renamed from: W */
    default void m35461W(a aVar, int i10) {
    }

    @Deprecated
    /* renamed from: X */
    default void m35462X(a aVar) {
    }

    /* renamed from: Z */
    default void m35463Z(a aVar, C11108u1 c11108u1, C12084i c12084i) {
    }

    /* renamed from: a */
    default void m35464a(a aVar, C11040h2 c11040h2) {
    }

    @Deprecated
    /* renamed from: a0 */
    default void m35465a0(a aVar, int i10, C11108u1 c11108u1) {
    }

    /* renamed from: b */
    default void m35466b(a aVar, C11731u c11731u, C11737x c11737x) {
    }

    /* renamed from: c */
    default void mo35467c(a aVar, C11029f3 c11029f3) {
    }

    /* renamed from: c0 */
    default void m35468c0(a aVar) {
    }

    @Deprecated
    /* renamed from: d */
    default void m35469d(a aVar, boolean z10) {
    }

    /* renamed from: d0 */
    default void m35470d0(a aVar, int i10, long j10) {
    }

    /* renamed from: e */
    default void m35471e(a aVar) {
    }

    /* renamed from: e0 */
    default void m35472e0(a aVar, C11108u1 c11108u1, C12084i c12084i) {
    }

    /* renamed from: f */
    default void m35473f(a aVar, long j10, int i10) {
    }

    /* renamed from: f0 */
    default void m35474f0(a aVar, Exception exc) {
    }

    @Deprecated
    /* renamed from: g */
    default void m35475g(a aVar, String str, long j10) {
    }

    /* renamed from: g0 */
    default void m35476g0(a aVar, boolean z10) {
    }

    /* renamed from: h */
    default void m35477h(a aVar, int i10) {
    }

    @Deprecated
    /* renamed from: h0 */
    default void m35478h0(a aVar, List<C7484b> list) {
    }

    /* renamed from: i */
    default void m35479i(a aVar, long j10) {
    }

    /* renamed from: i0 */
    default void m35480i0(a aVar, C9400a c9400a) {
    }

    /* renamed from: j */
    default void m35481j(a aVar, String str) {
    }

    /* renamed from: k */
    default void m35482k(a aVar, C11639e c11639e) {
    }

    /* renamed from: k0 */
    default void mo35483k0(InterfaceC11053j3 interfaceC11053j3, b bVar) {
    }

    @Deprecated
    /* renamed from: l */
    default void m35484l(a aVar, C11108u1 c11108u1) {
    }

    /* renamed from: l0 */
    default void m35485l0(a aVar, int i10) {
    }

    /* renamed from: m */
    default void m35486m(a aVar, Exception exc) {
    }

    /* renamed from: m0 */
    default void m35487m0(a aVar, C11010c2 c11010c2, int i10) {
    }

    @Deprecated
    /* renamed from: n */
    default void m35488n(a aVar, boolean z10, int i10) {
    }

    /* renamed from: n0 */
    default void m35489n0(a aVar) {
    }

    @Deprecated
    /* renamed from: o */
    default void m35490o(a aVar, String str, long j10) {
    }

    /* renamed from: o0 */
    default void m35491o0(a aVar, C12080e c12080e) {
    }

    /* renamed from: p */
    default void m35492p(a aVar, boolean z10, int i10) {
    }

    @Deprecated
    /* renamed from: p0 */
    default void m35493p0(a aVar) {
    }

    /* renamed from: q */
    default void mo35494q(a aVar, C12080e c12080e) {
    }

    /* renamed from: q0 */
    default void m35495q0(a aVar, C12080e c12080e) {
    }

    @Deprecated
    /* renamed from: r */
    default void m35496r(a aVar, C11108u1 c11108u1) {
    }

    /* renamed from: r0 */
    default void mo35497r0(a aVar, C11448a0 c11448a0) {
    }

    /* renamed from: s */
    default void m35498s(a aVar, String str) {
    }

    /* renamed from: s0 */
    default void m35499s0(a aVar, Exception exc) {
    }

    /* renamed from: t */
    default void m35500t(a aVar, C11737x c11737x) {
    }

    /* renamed from: t0 */
    default void m35501t0(a aVar, Object obj, long j10) {
    }

    /* renamed from: u */
    default void m35502u(a aVar, int i10) {
    }

    /* renamed from: u0 */
    default void m35503u0(a aVar, C7488f c7488f) {
    }

    /* renamed from: v */
    default void mo35504v(a aVar, C11731u c11731u, C11737x c11737x, IOException iOException, boolean z10) {
    }

    /* renamed from: v0 */
    default void m35505v0(a aVar, InterfaceC11053j3.b bVar) {
    }

    /* renamed from: w */
    default void m35506w(a aVar, Exception exc) {
    }

    /* renamed from: w0 */
    default void m35507w0(a aVar, C11048i4 c11048i4) {
    }

    @Deprecated
    /* renamed from: x */
    default void m35508x(a aVar, int i10, C12080e c12080e) {
    }

    /* renamed from: x0 */
    default void m35509x0(a aVar, int i10) {
    }

    /* renamed from: y */
    default void m35510y(a aVar, boolean z10) {
    }

    /* renamed from: y0 */
    default void m35511y0(a aVar, C12080e c12080e) {
    }

    /* renamed from: z */
    default void m35512z(a aVar) {
    }
}
