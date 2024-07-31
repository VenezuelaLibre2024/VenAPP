package u6;

import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.common.collect.y;
import java.io.IOException;
import java.util.List;
import t6.d4;
import t6.i4;
import t6.j3;
import t8.r;
import u6.b;
import v7.a0;

/* loaded from: classes.dex */
public class n1 implements u6.a {

    /* renamed from: a, reason: collision with root package name */
    private final t8.d f27242a;

    /* renamed from: b, reason: collision with root package name */
    private final d4.b f27243b;

    /* renamed from: c, reason: collision with root package name */
    private final d4.d f27244c;

    /* renamed from: d, reason: collision with root package name */
    private final a f27245d;

    /* renamed from: e, reason: collision with root package name */
    private final SparseArray<b.a> f27246e;

    /* renamed from: f, reason: collision with root package name */
    private t8.r<b> f27247f;

    /* renamed from: r, reason: collision with root package name */
    private t6.j3 f27248r;

    /* renamed from: s, reason: collision with root package name */
    private t8.o f27249s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f27250t;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final d4.b f27251a;

        /* renamed from: b, reason: collision with root package name */
        private com.google.common.collect.w<a0.b> f27252b = com.google.common.collect.w.v();

        /* renamed from: c, reason: collision with root package name */
        private com.google.common.collect.y<a0.b, d4> f27253c = com.google.common.collect.y.k();

        /* renamed from: d, reason: collision with root package name */
        private a0.b f27254d;

        /* renamed from: e, reason: collision with root package name */
        private a0.b f27255e;

        /* renamed from: f, reason: collision with root package name */
        private a0.b f27256f;

        public a(d4.b bVar) {
            this.f27251a = bVar;
        }

        private void b(y.a<a0.b, d4> aVar, a0.b bVar, d4 d4Var) {
            if (bVar == null) {
                return;
            }
            if (d4Var.g(bVar.f28543a) == -1 && (d4Var = this.f27253c.get(bVar)) == null) {
                return;
            }
            aVar.f(bVar, d4Var);
        }

        private static a0.b c(t6.j3 j3Var, com.google.common.collect.w<a0.b> wVar, a0.b bVar, d4.b bVar2) {
            d4 r10 = j3Var.r();
            int w10 = j3Var.w();
            Object r11 = r10.v() ? null : r10.r(w10);
            int h10 = (j3Var.g() || r10.v()) ? -1 : r10.k(w10, bVar2).h(t8.r0.C0(j3Var.e()) - bVar2.r());
            for (int i10 = 0; i10 < wVar.size(); i10++) {
                a0.b bVar3 = wVar.get(i10);
                if (i(bVar3, r11, j3Var.g(), j3Var.o(), j3Var.y(), h10)) {
                    return bVar3;
                }
            }
            if (wVar.isEmpty() && bVar != null) {
                if (i(bVar, r11, j3Var.g(), j3Var.o(), j3Var.y(), h10)) {
                    return bVar;
                }
            }
            return null;
        }

        private static boolean i(a0.b bVar, Object obj, boolean z10, int i10, int i11, int i12) {
            if (bVar.f28543a.equals(obj)) {
                return (z10 && bVar.f28544b == i10 && bVar.f28545c == i11) || (!z10 && bVar.f28544b == -1 && bVar.f28547e == i12);
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0056, code lost:
        
            b(r0, r3.f27254d, r4);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        
            if (r3.f27252b.contains(r3.f27254d) == false) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        
            if (eb.k.a(r3.f27254d, r3.f27256f) == false) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private void m(t6.d4 r4) {
            /*
                r3 = this;
                com.google.common.collect.y$a r0 = com.google.common.collect.y.a()
                com.google.common.collect.w<v7.a0$b> r1 = r3.f27252b
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L35
                v7.a0$b r1 = r3.f27255e
                r3.b(r0, r1, r4)
                v7.a0$b r1 = r3.f27256f
                v7.a0$b r2 = r3.f27255e
                boolean r1 = eb.k.a(r1, r2)
                if (r1 != 0) goto L20
                v7.a0$b r1 = r3.f27256f
                r3.b(r0, r1, r4)
            L20:
                v7.a0$b r1 = r3.f27254d
                v7.a0$b r2 = r3.f27255e
                boolean r1 = eb.k.a(r1, r2)
                if (r1 != 0) goto L5b
                v7.a0$b r1 = r3.f27254d
                v7.a0$b r2 = r3.f27256f
                boolean r1 = eb.k.a(r1, r2)
                if (r1 != 0) goto L5b
                goto L56
            L35:
                r1 = 0
            L36:
                com.google.common.collect.w<v7.a0$b> r2 = r3.f27252b
                int r2 = r2.size()
                if (r1 >= r2) goto L4c
                com.google.common.collect.w<v7.a0$b> r2 = r3.f27252b
                java.lang.Object r2 = r2.get(r1)
                v7.a0$b r2 = (v7.a0.b) r2
                r3.b(r0, r2, r4)
                int r1 = r1 + 1
                goto L36
            L4c:
                com.google.common.collect.w<v7.a0$b> r1 = r3.f27252b
                v7.a0$b r2 = r3.f27254d
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L5b
            L56:
                v7.a0$b r1 = r3.f27254d
                r3.b(r0, r1, r4)
            L5b:
                com.google.common.collect.y r4 = r0.c()
                r3.f27253c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u6.n1.a.m(t6.d4):void");
        }

        public a0.b d() {
            return this.f27254d;
        }

        public a0.b e() {
            if (this.f27252b.isEmpty()) {
                return null;
            }
            return (a0.b) com.google.common.collect.e0.d(this.f27252b);
        }

        public d4 f(a0.b bVar) {
            return this.f27253c.get(bVar);
        }

        public a0.b g() {
            return this.f27255e;
        }

        public a0.b h() {
            return this.f27256f;
        }

        public void j(t6.j3 j3Var) {
            this.f27254d = c(j3Var, this.f27252b, this.f27255e, this.f27251a);
        }

        public void k(List<a0.b> list, a0.b bVar, t6.j3 j3Var) {
            this.f27252b = com.google.common.collect.w.r(list);
            if (!list.isEmpty()) {
                this.f27255e = list.get(0);
                this.f27256f = (a0.b) t8.a.e(bVar);
            }
            if (this.f27254d == null) {
                this.f27254d = c(j3Var, this.f27252b, this.f27255e, this.f27251a);
            }
            m(j3Var.r());
        }

        public void l(t6.j3 j3Var) {
            this.f27254d = c(j3Var, this.f27252b, this.f27255e, this.f27251a);
            m(j3Var.r());
        }
    }

    public n1(t8.d dVar) {
        this.f27242a = (t8.d) t8.a.e(dVar);
        this.f27247f = new t8.r<>(t8.r0.Q(), dVar, new r.b() { // from class: u6.k0
            @Override // t8.r.b
            public final void a(Object obj, t8.l lVar) {
                n1.d1((b) obj, lVar);
            }
        });
        d4.b bVar = new d4.b();
        this.f27243b = bVar;
        this.f27244c = new d4.d();
        this.f27245d = new a(bVar);
        this.f27246e = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void D1(b.a aVar, boolean z10, b bVar) {
        bVar.d(aVar, z10);
        bVar.E(aVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void T1(b.a aVar, int i10, j3.e eVar, j3.e eVar2, b bVar) {
        bVar.S(aVar, i10);
        bVar.H(aVar, eVar, eVar2, i10);
    }

    private b.a X0(a0.b bVar) {
        t8.a.e(this.f27248r);
        d4 f10 = bVar == null ? null : this.f27245d.f(bVar);
        if (bVar != null && f10 != null) {
            return W0(f10, f10.m(bVar.f28543a, this.f27243b).f26057c, bVar);
        }
        int G = this.f27248r.G();
        d4 r10 = this.f27248r.r();
        if (!(G < r10.u())) {
            r10 = d4.f26044a;
        }
        return W0(r10, G, null);
    }

    private b.a Y0() {
        return X0(this.f27245d.e());
    }

    private b.a Z0(int i10, a0.b bVar) {
        t8.a.e(this.f27248r);
        if (bVar != null) {
            return this.f27245d.f(bVar) != null ? X0(bVar) : W0(d4.f26044a, i10, bVar);
        }
        d4 r10 = this.f27248r.r();
        if (!(i10 < r10.u())) {
            r10 = d4.f26044a;
        }
        return W0(r10, i10, null);
    }

    private b.a a1() {
        return X0(this.f27245d.g());
    }

    private b.a b1() {
        return X0(this.f27245d.h());
    }

    private b.a c1(t6.f3 f3Var) {
        v7.z zVar;
        return (!(f3Var instanceof t6.x) || (zVar = ((t6.x) f3Var).f26584y) == null) ? V0() : X0(new a0.b(zVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d1(b bVar, t8.l lVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d2(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.o(aVar, str, j10);
        bVar.D(aVar, str, j11, j10);
        bVar.M(aVar, 2, str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f2(b.a aVar, w6.e eVar, b bVar) {
        bVar.q(aVar, eVar);
        bVar.N(aVar, 2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g2(b.a aVar, w6.e eVar, b bVar) {
        bVar.y0(aVar, eVar);
        bVar.x(aVar, 2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h1(b.a aVar, String str, long j10, long j11, b bVar) {
        bVar.g(aVar, str, j10);
        bVar.V(aVar, str, j11, j10);
        bVar.M(aVar, 1, str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i2(b.a aVar, t6.u1 u1Var, w6.i iVar, b bVar) {
        bVar.l(aVar, u1Var);
        bVar.e0(aVar, u1Var, iVar);
        bVar.a0(aVar, 2, u1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j1(b.a aVar, w6.e eVar, b bVar) {
        bVar.o0(aVar, eVar);
        bVar.N(aVar, 1, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j2(b.a aVar, u8.a0 a0Var, b bVar) {
        bVar.r0(aVar, a0Var);
        bVar.R(aVar, a0Var.f27346a, a0Var.f27347b, a0Var.f27348c, a0Var.f27349d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void k1(b.a aVar, w6.e eVar, b bVar) {
        bVar.q0(aVar, eVar);
        bVar.x(aVar, 1, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l1(b.a aVar, t6.u1 u1Var, w6.i iVar, b bVar) {
        bVar.r(aVar, u1Var);
        bVar.Z(aVar, u1Var, iVar);
        bVar.a0(aVar, 1, u1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m2(t6.j3 j3Var, b bVar, t8.l lVar) {
        bVar.k0(j3Var, new b.C0446b(lVar, this.f27246e));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n2() {
        final b.a V0 = V0();
        o2(V0, 1028, new r.a() { // from class: u6.d1
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).n0(b.a.this);
            }
        });
        this.f27247f.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void z1(b.a aVar, int i10, b bVar) {
        bVar.X(aVar);
        bVar.u(aVar, i10);
    }

    @Override // x6.u
    public final void B(int i10, a0.b bVar) {
        final b.a Z0 = Z0(i10, bVar);
        o2(Z0, 1026, new r.a() { // from class: u6.e1
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).c0(b.a.this);
            }
        });
    }

    @Override // x6.u
    public final void C(int i10, a0.b bVar) {
        final b.a Z0 = Z0(i10, bVar);
        o2(Z0, 1025, new r.a() { // from class: u6.g1
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).I(b.a.this);
            }
        });
    }

    @Override // v7.h0
    public final void D(int i10, a0.b bVar, final v7.u uVar, final v7.x xVar) {
        final b.a Z0 = Z0(i10, bVar);
        o2(Z0, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new r.a() { // from class: u6.k
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).G(b.a.this, uVar, xVar);
            }
        });
    }

    @Override // u6.a
    public void E(b bVar) {
        t8.a.e(bVar);
        this.f27247f.c(bVar);
    }

    @Override // v7.h0
    public final void F(int i10, a0.b bVar, final v7.u uVar, final v7.x xVar, final IOException iOException, final boolean z10) {
        final b.a Z0 = Z0(i10, bVar);
        o2(Z0, 1003, new r.a() { // from class: u6.i0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).v(b.a.this, uVar, xVar, iOException, z10);
            }
        });
    }

    @Override // v7.h0
    public final void G(int i10, a0.b bVar, final v7.u uVar, final v7.x xVar) {
        final b.a Z0 = Z0(i10, bVar);
        o2(Z0, AdError.NETWORK_ERROR_CODE, new r.a() { // from class: u6.r0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).b(b.a.this, uVar, xVar);
            }
        });
    }

    @Override // u6.a
    public final void H(List<a0.b> list, a0.b bVar) {
        this.f27245d.k(list, bVar, (t6.j3) t8.a.e(this.f27248r));
    }

    @Override // x6.u
    public final void I(int i10, a0.b bVar, final Exception exc) {
        final b.a Z0 = Z0(i10, bVar);
        o2(Z0, RecognitionOptions.UPC_E, new r.a() { // from class: u6.s0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).m(b.a.this, exc);
            }
        });
    }

    @Override // x6.u
    public final void J(int i10, a0.b bVar, final int i11) {
        final b.a Z0 = Z0(i10, bVar);
        o2(Z0, 1022, new r.a() { // from class: u6.o0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                n1.z1(b.a.this, i11, (b) obj);
            }
        });
    }

    protected final b.a V0() {
        return X0(this.f27245d.d());
    }

    protected final b.a W0(d4 d4Var, int i10, a0.b bVar) {
        long B;
        a0.b bVar2 = d4Var.v() ? null : bVar;
        long b10 = this.f27242a.b();
        boolean z10 = d4Var.equals(this.f27248r.r()) && i10 == this.f27248r.G();
        long j10 = 0;
        if (bVar2 != null && bVar2.b()) {
            if (z10 && this.f27248r.o() == bVar2.f28544b && this.f27248r.y() == bVar2.f28545c) {
                j10 = this.f27248r.e();
            }
        } else {
            if (z10) {
                B = this.f27248r.B();
                return new b.a(b10, d4Var, i10, bVar2, B, this.f27248r.r(), this.f27248r.G(), this.f27245d.d(), this.f27248r.e(), this.f27248r.h());
            }
            if (!d4Var.v()) {
                j10 = d4Var.s(i10, this.f27244c).e();
            }
        }
        B = j10;
        return new b.a(b10, d4Var, i10, bVar2, B, this.f27248r.r(), this.f27248r.G(), this.f27245d.d(), this.f27248r.e(), this.f27248r.h());
    }

    @Override // u6.a
    public final void a(final Exception exc) {
        final b.a b12 = b1();
        o2(b12, 1014, new r.a() { // from class: u6.t
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).f0(b.a.this, exc);
            }
        });
    }

    @Override // u6.a
    public final void b(final String str) {
        final b.a b12 = b1();
        o2(b12, 1019, new r.a() { // from class: u6.e
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).j(b.a.this, str);
            }
        });
    }

    @Override // u6.a
    public final void c(final w6.e eVar) {
        final b.a a12 = a1();
        o2(a12, 1020, new r.a() { // from class: u6.z
            @Override // t8.r.a
            public final void invoke(Object obj) {
                n1.f2(b.a.this, eVar, (b) obj);
            }
        });
    }

    @Override // u6.a
    public final void d(final String str, final long j10, final long j11) {
        final b.a b12 = b1();
        o2(b12, 1016, new r.a() { // from class: u6.m1
            @Override // t8.r.a
            public final void invoke(Object obj) {
                n1.d2(b.a.this, str, j11, j10, (b) obj);
            }
        });
    }

    @Override // u6.a
    public final void e(final w6.e eVar) {
        final b.a b12 = b1();
        o2(b12, 1015, new r.a() { // from class: u6.g
            @Override // t8.r.a
            public final void invoke(Object obj) {
                n1.g2(b.a.this, eVar, (b) obj);
            }
        });
    }

    @Override // u6.a
    public final void f(final t6.u1 u1Var, final w6.i iVar) {
        final b.a b12 = b1();
        o2(b12, 1009, new r.a() { // from class: u6.a0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                n1.l1(b.a.this, u1Var, iVar, (b) obj);
            }
        });
    }

    @Override // u6.a
    public final void g(final t6.u1 u1Var, final w6.i iVar) {
        final b.a b12 = b1();
        o2(b12, 1017, new r.a() { // from class: u6.n0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                n1.i2(b.a.this, u1Var, iVar, (b) obj);
            }
        });
    }

    @Override // u6.a
    public final void h(final w6.e eVar) {
        final b.a a12 = a1();
        o2(a12, 1013, new r.a() { // from class: u6.m0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                n1.j1(b.a.this, eVar, (b) obj);
            }
        });
    }

    @Override // u6.a
    public final void i(final String str) {
        final b.a b12 = b1();
        o2(b12, 1012, new r.a() { // from class: u6.m
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).s(b.a.this, str);
            }
        });
    }

    @Override // u6.a
    public final void j(final String str, final long j10, final long j11) {
        final b.a b12 = b1();
        o2(b12, 1008, new r.a() { // from class: u6.j
            @Override // t8.r.a
            public final void invoke(Object obj) {
                n1.h1(b.a.this, str, j11, j10, (b) obj);
            }
        });
    }

    @Override // u6.a
    public final void k(final long j10) {
        final b.a b12 = b1();
        o2(b12, 1010, new r.a() { // from class: u6.o
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).i(b.a.this, j10);
            }
        });
    }

    @Override // u6.a
    public final void l(final Exception exc) {
        final b.a b12 = b1();
        o2(b12, 1030, new r.a() { // from class: u6.j1
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).s0(b.a.this, exc);
            }
        });
    }

    @Override // u6.a
    public final void m(final w6.e eVar) {
        final b.a b12 = b1();
        o2(b12, 1007, new r.a() { // from class: u6.c0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                n1.k1(b.a.this, eVar, (b) obj);
            }
        });
    }

    @Override // u6.a
    public final void n(final int i10, final long j10) {
        final b.a a12 = a1();
        o2(a12, 1018, new r.a() { // from class: u6.x
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).d0(b.a.this, i10, j10);
            }
        });
    }

    @Override // u6.a
    public final void o(final Object obj, final long j10) {
        final b.a b12 = b1();
        o2(b12, 26, new r.a() { // from class: u6.a1
            @Override // t8.r.a
            public final void invoke(Object obj2) {
                ((b) obj2).t0(b.a.this, obj, j10);
            }
        });
    }

    protected final void o2(b.a aVar, int i10, r.a<b> aVar2) {
        this.f27246e.put(i10, aVar);
        this.f27247f.l(i10, aVar2);
    }

    @Override // t6.j3.d
    public final void onAudioAttributesChanged(final v6.e eVar) {
        final b.a b12 = b1();
        o2(b12, 20, new r.a() { // from class: u6.s
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).k(b.a.this, eVar);
            }
        });
    }

    @Override // t6.j3.d
    public void onAvailableCommandsChanged(final j3.b bVar) {
        final b.a V0 = V0();
        o2(V0, 13, new r.a() { // from class: u6.e0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).v0(b.a.this, bVar);
            }
        });
    }

    @Override // t6.j3.d
    public void onCues(final g8.f fVar) {
        final b.a V0 = V0();
        o2(V0, 27, new r.a() { // from class: u6.h0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).u0(b.a.this, fVar);
            }
        });
    }

    @Override // t6.j3.d
    public void onCues(final List<g8.b> list) {
        final b.a V0 = V0();
        o2(V0, 27, new r.a() { // from class: u6.w0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).h0(b.a.this, list);
            }
        });
    }

    @Override // t6.j3.d
    public void onDeviceInfoChanged(final t6.v vVar) {
        final b.a V0 = V0();
        o2(V0, 29, new r.a() { // from class: u6.n
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).F(b.a.this, vVar);
            }
        });
    }

    @Override // t6.j3.d
    public void onDeviceVolumeChanged(final int i10, final boolean z10) {
        final b.a V0 = V0();
        o2(V0, 30, new r.a() { // from class: u6.f
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).U(b.a.this, i10, z10);
            }
        });
    }

    @Override // t6.j3.d
    public void onEvents(t6.j3 j3Var, j3.c cVar) {
    }

    @Override // t6.j3.d
    public final void onIsLoadingChanged(final boolean z10) {
        final b.a V0 = V0();
        o2(V0, 3, new r.a() { // from class: u6.p0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                n1.D1(b.a.this, z10, (b) obj);
            }
        });
    }

    @Override // t6.j3.d
    public void onIsPlayingChanged(final boolean z10) {
        final b.a V0 = V0();
        o2(V0, 7, new r.a() { // from class: u6.r
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).y(b.a.this, z10);
            }
        });
    }

    @Override // t6.j3.d
    public void onLoadingChanged(boolean z10) {
    }

    @Override // t6.j3.d
    public final void onMediaItemTransition(final t6.c2 c2Var, final int i10) {
        final b.a V0 = V0();
        o2(V0, 1, new r.a() { // from class: u6.y
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).m0(b.a.this, c2Var, i10);
            }
        });
    }

    @Override // t6.j3.d
    public void onMediaMetadataChanged(final t6.h2 h2Var) {
        final b.a V0 = V0();
        o2(V0, 14, new r.a() { // from class: u6.f1
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).a(b.a.this, h2Var);
            }
        });
    }

    @Override // t6.j3.d
    public final void onMetadata(final l7.a aVar) {
        final b.a V0 = V0();
        o2(V0, 28, new r.a() { // from class: u6.c
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).i0(b.a.this, aVar);
            }
        });
    }

    @Override // t6.j3.d
    public final void onPlayWhenReadyChanged(final boolean z10, final int i10) {
        final b.a V0 = V0();
        o2(V0, 5, new r.a() { // from class: u6.g0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).p(b.a.this, z10, i10);
            }
        });
    }

    @Override // t6.j3.d
    public final void onPlaybackParametersChanged(final t6.i3 i3Var) {
        final b.a V0 = V0();
        o2(V0, 12, new r.a() { // from class: u6.q0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).T(b.a.this, i3Var);
            }
        });
    }

    @Override // t6.j3.d
    public final void onPlaybackStateChanged(final int i10) {
        final b.a V0 = V0();
        o2(V0, 4, new r.a() { // from class: u6.u0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).l0(b.a.this, i10);
            }
        });
    }

    @Override // t6.j3.d
    public final void onPlaybackSuppressionReasonChanged(final int i10) {
        final b.a V0 = V0();
        o2(V0, 6, new r.a() { // from class: u6.v
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).h(b.a.this, i10);
            }
        });
    }

    @Override // t6.j3.d
    public final void onPlayerError(final t6.f3 f3Var) {
        final b.a c12 = c1(f3Var);
        o2(c12, 10, new r.a() { // from class: u6.i
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).c(b.a.this, f3Var);
            }
        });
    }

    @Override // t6.j3.d
    public void onPlayerErrorChanged(final t6.f3 f3Var) {
        final b.a c12 = c1(f3Var);
        o2(c12, 10, new r.a() { // from class: u6.d
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).O(b.a.this, f3Var);
            }
        });
    }

    @Override // t6.j3.d
    public final void onPlayerStateChanged(final boolean z10, final int i10) {
        final b.a V0 = V0();
        o2(V0, -1, new r.a() { // from class: u6.w
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).n(b.a.this, z10, i10);
            }
        });
    }

    @Override // t6.j3.d
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // t6.j3.d
    public final void onPositionDiscontinuity(final j3.e eVar, final j3.e eVar2, final int i10) {
        if (i10 == 1) {
            this.f27250t = false;
        }
        this.f27245d.j((t6.j3) t8.a.e(this.f27248r));
        final b.a V0 = V0();
        o2(V0, 11, new r.a() { // from class: u6.x0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                n1.T1(b.a.this, i10, eVar, eVar2, (b) obj);
            }
        });
    }

    @Override // t6.j3.d
    public void onRenderedFirstFrame() {
    }

    @Override // t6.j3.d
    public final void onRepeatModeChanged(final int i10) {
        final b.a V0 = V0();
        o2(V0, 8, new r.a() { // from class: u6.d0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).W(b.a.this, i10);
            }
        });
    }

    @Override // t6.j3.d
    public final void onSeekProcessed() {
        final b.a V0 = V0();
        o2(V0, -1, new r.a() { // from class: u6.v0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).J(b.a.this);
            }
        });
    }

    @Override // t6.j3.d
    public final void onSkipSilenceEnabledChanged(final boolean z10) {
        final b.a b12 = b1();
        o2(b12, 23, new r.a() { // from class: u6.h1
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).g0(b.a.this, z10);
            }
        });
    }

    @Override // t6.j3.d
    public final void onSurfaceSizeChanged(final int i10, final int i11) {
        final b.a b12 = b1();
        o2(b12, 24, new r.a() { // from class: u6.f0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).A(b.a.this, i10, i11);
            }
        });
    }

    @Override // t6.j3.d
    public final void onTimelineChanged(d4 d4Var, final int i10) {
        this.f27245d.l((t6.j3) t8.a.e(this.f27248r));
        final b.a V0 = V0();
        o2(V0, 0, new r.a() { // from class: u6.t0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).x0(b.a.this, i10);
            }
        });
    }

    @Override // t6.j3.d
    public void onTracksChanged(final i4 i4Var) {
        final b.a V0 = V0();
        o2(V0, 2, new r.a() { // from class: u6.q
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).w0(b.a.this, i4Var);
            }
        });
    }

    @Override // t6.j3.d
    public final void onVideoSizeChanged(final u8.a0 a0Var) {
        final b.a b12 = b1();
        o2(b12, 25, new r.a() { // from class: u6.c1
            @Override // t8.r.a
            public final void invoke(Object obj) {
                n1.j2(b.a.this, a0Var, (b) obj);
            }
        });
    }

    @Override // t6.j3.d
    public final void onVolumeChanged(final float f10) {
        final b.a b12 = b1();
        o2(b12, 22, new r.a() { // from class: u6.j0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).L(b.a.this, f10);
            }
        });
    }

    @Override // u6.a
    public final void p(final Exception exc) {
        final b.a b12 = b1();
        o2(b12, 1029, new r.a() { // from class: u6.l0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).w(b.a.this, exc);
            }
        });
    }

    @Override // u6.a
    public final void q(final int i10, final long j10, final long j11) {
        final b.a b12 = b1();
        o2(b12, 1011, new r.a() { // from class: u6.z0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).Q(b.a.this, i10, j10, j11);
            }
        });
    }

    @Override // u6.a
    public final void r(final long j10, final int i10) {
        final b.a a12 = a1();
        o2(a12, 1021, new r.a() { // from class: u6.k1
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).f(b.a.this, j10, i10);
            }
        });
    }

    @Override // u6.a
    public void release() {
        ((t8.o) t8.a.i(this.f27249s)).h(new Runnable() { // from class: u6.h
            @Override // java.lang.Runnable
            public final void run() {
                n1.this.n2();
            }
        });
    }

    @Override // s8.e.a
    public final void s(final int i10, final long j10, final long j11) {
        final b.a Y0 = Y0();
        o2(Y0, 1006, new r.a() { // from class: u6.i1
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).P(b.a.this, i10, j10, j11);
            }
        });
    }

    @Override // u6.a
    public final void t() {
        if (this.f27250t) {
            return;
        }
        final b.a V0 = V0();
        this.f27250t = true;
        o2(V0, -1, new r.a() { // from class: u6.l1
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).p0(b.a.this);
            }
        });
    }

    @Override // x6.u
    public final void u(int i10, a0.b bVar) {
        final b.a Z0 = Z0(i10, bVar);
        o2(Z0, 1023, new r.a() { // from class: u6.b1
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).z(b.a.this);
            }
        });
    }

    @Override // v7.h0
    public final void v(int i10, a0.b bVar, final v7.x xVar) {
        final b.a Z0 = Z0(i10, bVar);
        o2(Z0, 1004, new r.a() { // from class: u6.u
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).K(b.a.this, xVar);
            }
        });
    }

    @Override // v7.h0
    public final void w(int i10, a0.b bVar, final v7.x xVar) {
        final b.a Z0 = Z0(i10, bVar);
        o2(Z0, 1005, new r.a() { // from class: u6.b0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).t(b.a.this, xVar);
            }
        });
    }

    @Override // v7.h0
    public final void x(int i10, a0.b bVar, final v7.u uVar, final v7.x xVar) {
        final b.a Z0 = Z0(i10, bVar);
        o2(Z0, AdError.NO_FILL_ERROR_CODE, new r.a() { // from class: u6.y0
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).B(b.a.this, uVar, xVar);
            }
        });
    }

    @Override // x6.u
    public final void y(int i10, a0.b bVar) {
        final b.a Z0 = Z0(i10, bVar);
        o2(Z0, 1027, new r.a() { // from class: u6.p
            @Override // t8.r.a
            public final void invoke(Object obj) {
                ((b) obj).e(b.a.this);
            }
        });
    }

    @Override // u6.a
    public void z(final t6.j3 j3Var, Looper looper) {
        t8.a.g(this.f27248r == null || this.f27245d.f27252b.isEmpty());
        this.f27248r = (t6.j3) t8.a.e(j3Var);
        this.f27249s = this.f27242a.c(looper, null);
        this.f27247f = this.f27247f.e(looper, new r.b() { // from class: u6.l
            @Override // t8.r.b
            public final void a(Object obj, t8.l lVar) {
                n1.this.m2(j3Var, (b) obj, lVar);
            }
        });
    }
}
