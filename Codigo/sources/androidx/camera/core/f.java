package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.f;
import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.b2;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.h1;
import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.n0;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.r0;
import androidx.camera.core.impl.y1;
import h0.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import w.u0;
import w.y;

/* loaded from: classes.dex */
public final class f extends w {

    /* renamed from: s */
    public static final d f2391s = new d();

    /* renamed from: t */
    private static final Boolean f2392t = null;

    /* renamed from: n */
    final i f2393n;

    /* renamed from: o */
    private final Object f2394o;

    /* renamed from: p */
    private a f2395p;

    /* renamed from: q */
    y1.b f2396q;

    /* renamed from: r */
    private r0 f2397r;

    /* loaded from: classes.dex */
    public interface a {
        default Size a() {
            return null;
        }

        void b(o oVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* loaded from: classes.dex */
    public static final class c implements k2.a<f, c1, c> {

        /* renamed from: a */
        private final m1 f2398a;

        public c() {
            this(m1.a0());
        }

        private c(m1 m1Var) {
            this.f2398a = m1Var;
            Class cls = (Class) m1Var.g(b0.j.D, null);
            if (cls == null || cls.equals(f.class)) {
                m(f.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        static c d(n0 n0Var) {
            return new c(m1.b0(n0Var));
        }

        @Override // w.z
        public l1 a() {
            return this.f2398a;
        }

        public f c() {
            c1 b10 = b();
            f1.w(b10);
            return new f(b10);
        }

        @Override // androidx.camera.core.impl.k2.a
        /* renamed from: e */
        public c1 b() {
            return new c1(p1.Y(this.f2398a));
        }

        public c f(int i10) {
            a().r(c1.H, Integer.valueOf(i10));
            return this;
        }

        public c g(l2.b bVar) {
            a().r(k2.A, bVar);
            return this;
        }

        public c h(Size size) {
            a().r(f1.f2467m, size);
            return this;
        }

        public c i(y yVar) {
            if (!Objects.equals(y.f29577d, yVar)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            a().r(e1.f2457g, yVar);
            return this;
        }

        public c j(h0.c cVar) {
            a().r(f1.f2470p, cVar);
            return this;
        }

        public c k(int i10) {
            a().r(k2.f2530v, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        public c l(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().r(f1.f2462h, Integer.valueOf(i10));
            return this;
        }

        public c m(Class<f> cls) {
            a().r(b0.j.D, cls);
            if (a().g(b0.j.C, null) == null) {
                n(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c n(String str) {
            a().r(b0.j.C, str);
            return this;
        }

        @Deprecated
        public c o(Size size) {
            a().r(f1.f2466l, size);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        private static final Size f2399a;

        /* renamed from: b */
        private static final y f2400b;

        /* renamed from: c */
        private static final h0.c f2401c;

        /* renamed from: d */
        private static final c1 f2402d;

        static {
            Size size = new Size(640, 480);
            f2399a = size;
            y yVar = y.f29577d;
            f2400b = yVar;
            h0.c a10 = new c.a().d(h0.a.f16346c).e(new h0.d(f0.d.f14850c, 1)).a();
            f2401c = a10;
            f2402d = new c().h(size).k(1).l(0).j(a10).g(l2.b.IMAGE_ANALYSIS).i(yVar).b();
        }

        public c1 a() {
            return f2402d;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface e {
    }

    f(c1 c1Var) {
        super(c1Var);
        this.f2394o = new Object();
        if (((c1) i()).W(0) == 1) {
            this.f2393n = new j();
        } else {
            this.f2393n = new k(c1Var.R(z.a.b()));
        }
        this.f2393n.t(d0());
        this.f2393n.u(g0());
    }

    private boolean f0(c0 c0Var) {
        return g0() && o(c0Var) % 180 != 0;
    }

    public static /* synthetic */ void h0(t tVar, t tVar2) {
        tVar.l();
        if (tVar2 != null) {
            tVar2.l();
        }
    }

    public /* synthetic */ void i0(String str, c1 c1Var, b2 b2Var, y1 y1Var, y1.f fVar) {
        Y();
        this.f2393n.g();
        if (x(str)) {
            S(Z(str, c1Var, b2Var).o());
            D();
        }
    }

    private void l0() {
        c0 f10 = f();
        if (f10 != null) {
            this.f2393n.w(o(f10));
        }
    }

    @Override // androidx.camera.core.w
    public void F() {
        this.f2393n.f();
    }

    /* JADX WARN: Type inference failed for: r6v14, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.camera.core.impl.u1, androidx.camera.core.impl.k2] */
    /* JADX WARN: Type inference failed for: r6v9, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.w
    protected k2<?> H(b0 b0Var, k2.a<?, ?, ?> aVar) {
        Size a10;
        Boolean c02 = c0();
        boolean a11 = b0Var.e().a(d0.g.class);
        i iVar = this.f2393n;
        if (c02 != null) {
            a11 = c02.booleanValue();
        }
        iVar.s(a11);
        synchronized (this.f2394o) {
            a aVar2 = this.f2395p;
            a10 = aVar2 != null ? aVar2.a() : null;
        }
        if (a10 == null) {
            return aVar.b();
        }
        if (b0Var.i(((Integer) aVar.a().g(f1.f2463i, 0)).intValue()) % 180 == 90) {
            a10 = new Size(a10.getHeight(), a10.getWidth());
        }
        ?? b10 = aVar.b();
        n0.a<Size> aVar3 = f1.f2466l;
        if (!b10.b(aVar3)) {
            aVar.a().r(aVar3, a10);
        }
        l1 a12 = aVar.a();
        n0.a<h0.c> aVar4 = f1.f2470p;
        h0.c cVar = (h0.c) a12.g(aVar4, null);
        if (cVar != null && cVar.d() == null) {
            c.a b11 = c.a.b(cVar);
            b11.e(new h0.d(a10, 1));
            aVar.a().r(aVar4, b11.a());
        }
        return aVar.b();
    }

    @Override // androidx.camera.core.w
    protected b2 K(n0 n0Var) {
        this.f2396q.g(n0Var);
        S(this.f2396q.o());
        return d().f().d(n0Var).a();
    }

    @Override // androidx.camera.core.w
    protected b2 L(b2 b2Var) {
        y1.b Z = Z(h(), (c1) i(), b2Var);
        this.f2396q = Z;
        S(Z.o());
        return b2Var;
    }

    @Override // androidx.camera.core.w
    public void M() {
        Y();
        this.f2393n.j();
    }

    @Override // androidx.camera.core.w
    public void P(Matrix matrix) {
        super.P(matrix);
        this.f2393n.x(matrix);
    }

    @Override // androidx.camera.core.w
    public void Q(Rect rect) {
        super.Q(rect);
        this.f2393n.y(rect);
    }

    void Y() {
        androidx.camera.core.impl.utils.q.a();
        r0 r0Var = this.f2397r;
        if (r0Var != null) {
            r0Var.d();
            this.f2397r = null;
        }
    }

    y1.b Z(String str, c1 c1Var, b2 b2Var) {
        androidx.camera.core.impl.utils.q.a();
        Size e10 = b2Var.e();
        Executor executor = (Executor) androidx.core.util.h.k(c1Var.R(z.a.b()));
        boolean z10 = true;
        int b02 = a0() == 1 ? b0() : 4;
        t tVar = c1Var.Y() != null ? new t(c1Var.Y().a(e10.getWidth(), e10.getHeight(), l(), b02, 0L)) : new t(p.a(e10.getWidth(), e10.getHeight(), l(), b02));
        boolean f02 = f() != null ? f0(f()) : false;
        int height = f02 ? e10.getHeight() : e10.getWidth();
        int width = f02 ? e10.getWidth() : e10.getHeight();
        int i10 = d0() == 2 ? 1 : 35;
        boolean z11 = l() == 35 && d0() == 2;
        if (l() != 35 || ((f() == null || o(f()) == 0) && !Boolean.TRUE.equals(c0()))) {
            z10 = false;
        }
        t tVar2 = (z11 || z10) ? new t(p.a(height, width, i10, tVar.e())) : null;
        if (tVar2 != null) {
            this.f2393n.v(tVar2);
        }
        l0();
        tVar.f(this.f2393n, executor);
        y1.b p10 = y1.b.p(c1Var, b2Var.e());
        if (b2Var.d() != null) {
            p10.g(b2Var.d());
        }
        r0 r0Var = this.f2397r;
        if (r0Var != null) {
            r0Var.d();
        }
        h1 h1Var = new h1(tVar.getSurface(), e10, l());
        this.f2397r = h1Var;
        h1Var.k().addListener(new Runnable() { // from class: w.a0

            /* renamed from: b */
            public final /* synthetic */ androidx.camera.core.t f29432b;

            public /* synthetic */ a0(androidx.camera.core.t tVar22) {
                r2 = tVar22;
            }

            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.f.h0(androidx.camera.core.t.this, r2);
            }
        }, z.a.d());
        p10.q(b2Var.c());
        p10.m(this.f2397r, b2Var.b());
        p10.f(new y1.c() { // from class: w.b0

            /* renamed from: b */
            public final /* synthetic */ String f29438b;

            /* renamed from: c */
            public final /* synthetic */ androidx.camera.core.impl.c1 f29439c;

            /* renamed from: d */
            public final /* synthetic */ b2 f29440d;

            public /* synthetic */ b0(String str2, androidx.camera.core.impl.c1 c1Var2, b2 b2Var2) {
                r2 = str2;
                r3 = c1Var2;
                r4 = b2Var2;
            }

            @Override // androidx.camera.core.impl.y1.c
            public final void a(y1 y1Var, y1.f fVar) {
                androidx.camera.core.f.this.i0(r2, r3, r4, y1Var, fVar);
            }
        });
        return p10;
    }

    public int a0() {
        return ((c1) i()).W(0);
    }

    public int b0() {
        return ((c1) i()).X(6);
    }

    public Boolean c0() {
        return ((c1) i()).Z(f2392t);
    }

    public int d0() {
        return ((c1) i()).a0(1);
    }

    public u0 e0() {
        return q();
    }

    public boolean g0() {
        return ((c1) i()).b0(Boolean.FALSE).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.w
    public k2<?> j(boolean z10, l2 l2Var) {
        d dVar = f2391s;
        n0 a10 = l2Var.a(dVar.a().N(), 1);
        if (z10) {
            a10 = n0.O(a10, dVar.a());
        }
        if (a10 == null) {
            return null;
        }
        return v(a10).b();
    }

    public void k0(Executor executor, a aVar) {
        synchronized (this.f2394o) {
            this.f2393n.r(executor, new a() { // from class: w.c0
                public /* synthetic */ c0() {
                }

                @Override // androidx.camera.core.f.a
                public final void b(androidx.camera.core.o oVar) {
                    f.a.this.b(oVar);
                }
            });
            if (this.f2395p == null) {
                B();
            }
            this.f2395p = aVar;
        }
    }

    public String toString() {
        return "ImageAnalysis:" + n();
    }

    @Override // androidx.camera.core.w
    public k2.a<?, ?, ?> v(n0 n0Var) {
        return c.d(n0Var);
    }
}
