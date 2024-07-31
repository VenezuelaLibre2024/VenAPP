package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.impl.b0;
import androidx.camera.core.impl.b2;
import androidx.camera.core.impl.c0;
import androidx.camera.core.impl.e1;
import androidx.camera.core.impl.f1;
import androidx.camera.core.impl.k2;
import androidx.camera.core.impl.l1;
import androidx.camera.core.impl.l2;
import androidx.camera.core.impl.m1;
import androidx.camera.core.impl.p1;
import androidx.camera.core.impl.r0;
import androidx.camera.core.impl.r1;
import androidx.camera.core.impl.y1;
import androidx.camera.core.s;
import g0.n0;
import g0.v0;
import h0.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import w.i1;

/* loaded from: classes.dex */
public final class s extends w {

    /* renamed from: u, reason: collision with root package name */
    public static final b f2738u = new b();

    /* renamed from: v, reason: collision with root package name */
    private static final Executor f2739v = z.a.d();

    /* renamed from: n, reason: collision with root package name */
    private c f2740n;

    /* renamed from: o, reason: collision with root package name */
    private Executor f2741o;

    /* renamed from: p, reason: collision with root package name */
    y1.b f2742p;

    /* renamed from: q, reason: collision with root package name */
    private r0 f2743q;

    /* renamed from: r, reason: collision with root package name */
    private n0 f2744r;

    /* renamed from: s, reason: collision with root package name */
    i1 f2745s;

    /* renamed from: t, reason: collision with root package name */
    private v0 f2746t;

    /* loaded from: classes.dex */
    public static final class a implements k2.a<s, r1, a> {

        /* renamed from: a, reason: collision with root package name */
        private final m1 f2747a;

        public a() {
            this(m1.a0());
        }

        private a(m1 m1Var) {
            this.f2747a = m1Var;
            Class cls = (Class) m1Var.g(b0.j.D, null);
            if (cls == null || cls.equals(s.class)) {
                j(s.class);
                m1Var.r(f1.f2465k, 2);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }

        static a d(androidx.camera.core.impl.n0 n0Var) {
            return new a(m1.b0(n0Var));
        }

        @Override // w.z
        public l1 a() {
            return this.f2747a;
        }

        public s c() {
            r1 b10 = b();
            f1.w(b10);
            return new s(b10);
        }

        @Override // androidx.camera.core.impl.k2.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public r1 b() {
            return new r1(p1.Y(this.f2747a));
        }

        public a f(l2.b bVar) {
            a().r(k2.A, bVar);
            return this;
        }

        public a g(h0.c cVar) {
            a().r(f1.f2470p, cVar);
            return this;
        }

        public a h(int i10) {
            a().r(k2.f2530v, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        public a i(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().r(f1.f2462h, Integer.valueOf(i10));
            return this;
        }

        public a j(Class<s> cls) {
            a().r(b0.j.D, cls);
            if (a().g(b0.j.C, null) == null) {
                k(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a k(String str) {
            a().r(b0.j.C, str);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static final h0.c f2748a;

        /* renamed from: b, reason: collision with root package name */
        private static final r1 f2749b;

        static {
            h0.c a10 = new c.a().d(h0.a.f16346c).e(h0.d.f16356c).a();
            f2748a = a10;
            f2749b = new a().h(2).i(0).g(a10).f(l2.b.PREVIEW).b();
        }

        public r1 a() {
            return f2749b;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(i1 i1Var);
    }

    s(r1 r1Var) {
        super(r1Var);
        this.f2741o = f2739v;
    }

    private void Y(y1.b bVar, final String str, final r1 r1Var, final b2 b2Var) {
        if (this.f2740n != null) {
            bVar.m(this.f2743q, b2Var.b());
        }
        bVar.f(new y1.c() { // from class: w.t0
            @Override // androidx.camera.core.impl.y1.c
            public final void a(y1 y1Var, y1.f fVar) {
                androidx.camera.core.s.this.d0(str, r1Var, b2Var, y1Var, fVar);
            }
        });
    }

    private void Z() {
        r0 r0Var = this.f2743q;
        if (r0Var != null) {
            r0Var.d();
            this.f2743q = null;
        }
        v0 v0Var = this.f2746t;
        if (v0Var != null) {
            v0Var.i();
            this.f2746t = null;
        }
        n0 n0Var = this.f2744r;
        if (n0Var != null) {
            n0Var.i();
            this.f2744r = null;
        }
        this.f2745s = null;
    }

    private y1.b a0(String str, r1 r1Var, b2 b2Var) {
        r0 j10;
        androidx.camera.core.impl.utils.q.a();
        c0 f10 = f();
        Objects.requireNonNull(f10);
        final c0 c0Var = f10;
        Z();
        androidx.core.util.h.m(this.f2744r == null);
        Matrix r10 = r();
        boolean m10 = c0Var.m();
        Rect b02 = b0(b2Var.e());
        Objects.requireNonNull(b02);
        this.f2744r = new n0(1, 34, b2Var, r10, m10, b02, p(c0Var, z(c0Var)), c(), l0(c0Var));
        w.k k10 = k();
        if (k10 != null) {
            this.f2746t = new v0(c0Var, k10.a());
            this.f2744r.f(new Runnable() { // from class: androidx.camera.core.r
                @Override // java.lang.Runnable
                public final void run() {
                    s.this.D();
                }
            });
            v0.d i10 = v0.d.i(this.f2744r);
            final n0 n0Var = this.f2746t.m(v0.b.c(this.f2744r, Collections.singletonList(i10))).get(i10);
            Objects.requireNonNull(n0Var);
            n0Var.f(new Runnable() { // from class: w.r0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.s.this.e0(n0Var, c0Var);
                }
            });
            this.f2745s = n0Var.k(c0Var);
            j10 = this.f2744r.o();
        } else {
            this.f2744r.f(new Runnable() { // from class: androidx.camera.core.r
                @Override // java.lang.Runnable
                public final void run() {
                    s.this.D();
                }
            });
            i1 k11 = this.f2744r.k(c0Var);
            this.f2745s = k11;
            j10 = k11.j();
        }
        this.f2743q = j10;
        if (this.f2740n != null) {
            h0();
        }
        y1.b p10 = y1.b.p(r1Var, b2Var.e());
        p10.q(b2Var.c());
        if (b2Var.d() != null) {
            p10.g(b2Var.d());
        }
        Y(p10, str, r1Var, b2Var);
        return p10;
    }

    private Rect b0(Size size) {
        if (w() != null) {
            return w();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(String str, r1 r1Var, b2 b2Var, y1 y1Var, y1.f fVar) {
        if (x(str)) {
            S(a0(str, r1Var, b2Var).o());
            D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void e0(n0 n0Var, c0 c0Var) {
        androidx.camera.core.impl.utils.q.a();
        if (c0Var == f()) {
            this.f2745s = n0Var.k(c0Var);
            h0();
        }
    }

    private void h0() {
        i0();
        final c cVar = (c) androidx.core.util.h.k(this.f2740n);
        final i1 i1Var = (i1) androidx.core.util.h.k(this.f2745s);
        this.f2741o.execute(new Runnable() { // from class: w.s0
            @Override // java.lang.Runnable
            public final void run() {
                s.c.this.a(i1Var);
            }
        });
    }

    private void i0() {
        c0 f10 = f();
        n0 n0Var = this.f2744r;
        if (f10 == null || n0Var == null) {
            return;
        }
        n0Var.D(p(f10, z(f10)), c());
    }

    private boolean l0(c0 c0Var) {
        return c0Var.m() && z(c0Var);
    }

    private void m0(String str, r1 r1Var, b2 b2Var) {
        y1.b a02 = a0(str, r1Var, b2Var);
        this.f2742p = a02;
        S(a02.o());
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.w
    protected k2<?> H(b0 b0Var, k2.a<?, ?, ?> aVar) {
        aVar.a().r(e1.f2456f, 34);
        return aVar.b();
    }

    @Override // androidx.camera.core.w
    protected b2 K(androidx.camera.core.impl.n0 n0Var) {
        this.f2742p.g(n0Var);
        S(this.f2742p.o());
        return d().f().d(n0Var).a();
    }

    @Override // androidx.camera.core.w
    protected b2 L(b2 b2Var) {
        m0(h(), (r1) i(), b2Var);
        return b2Var;
    }

    @Override // androidx.camera.core.w
    public void M() {
        Z();
    }

    @Override // androidx.camera.core.w
    public void Q(Rect rect) {
        super.Q(rect);
        i0();
    }

    public int c0() {
        return u();
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [androidx.camera.core.impl.k2, androidx.camera.core.impl.k2<?>] */
    @Override // androidx.camera.core.w
    public k2<?> j(boolean z10, l2 l2Var) {
        b bVar = f2738u;
        androidx.camera.core.impl.n0 a10 = l2Var.a(bVar.a().N(), 1);
        if (z10) {
            a10 = androidx.camera.core.impl.n0.O(a10, bVar.a());
        }
        if (a10 == null) {
            return null;
        }
        return v(a10).b();
    }

    public void j0(c cVar) {
        k0(f2739v, cVar);
    }

    public void k0(Executor executor, c cVar) {
        androidx.camera.core.impl.utils.q.a();
        if (cVar == null) {
            this.f2740n = null;
            C();
            return;
        }
        this.f2740n = cVar;
        this.f2741o = executor;
        if (e() != null) {
            m0(h(), (r1) i(), d());
            D();
        }
        B();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.camera.core.w
    public int p(c0 c0Var, boolean z10) {
        if (c0Var.m()) {
            return super.p(c0Var, z10);
        }
        return 0;
    }

    @Override // androidx.camera.core.w
    public Set<Integer> t() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    public String toString() {
        return "Preview:" + n();
    }

    @Override // androidx.camera.core.w
    public k2.a<?, ?, ?> v(androidx.camera.core.impl.n0 n0Var) {
        return a.d(n0Var);
    }
}
