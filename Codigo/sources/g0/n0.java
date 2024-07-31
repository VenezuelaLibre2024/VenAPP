package g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.b2;
import androidx.camera.core.impl.r0;
import androidx.concurrent.futures.c;
import g0.n0;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import w.i1;

/* loaded from: classes.dex */
public class n0 {

    /* renamed from: a */
    private final int f15610a;

    /* renamed from: b */
    private final Matrix f15611b;

    /* renamed from: c */
    private final boolean f15612c;

    /* renamed from: d */
    private final Rect f15613d;

    /* renamed from: e */
    private final boolean f15614e;

    /* renamed from: f */
    private final int f15615f;

    /* renamed from: g */
    private final b2 f15616g;

    /* renamed from: h */
    private int f15617h;

    /* renamed from: i */
    private int f15618i;

    /* renamed from: j */
    private q0 f15619j;

    /* renamed from: l */
    private i1 f15621l;

    /* renamed from: m */
    private a f15622m;

    /* renamed from: k */
    private boolean f15620k = false;

    /* renamed from: n */
    private final Set<Runnable> f15623n = new HashSet();

    /* renamed from: o */
    private boolean f15624o = false;

    /* loaded from: classes.dex */
    public static class a extends androidx.camera.core.impl.r0 {

        /* renamed from: o */
        final com.google.common.util.concurrent.f<Surface> f15625o;

        /* renamed from: p */
        c.a<Surface> f15626p;

        /* renamed from: q */
        private androidx.camera.core.impl.r0 f15627q;

        a(Size size, int i10) {
            super(size, i10);
            this.f15625o = androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: g0.l0
                public /* synthetic */ l0() {
                }

                @Override // androidx.concurrent.futures.c.InterfaceC0032c
                public final Object a(c.a aVar) {
                    Object n10;
                    n10 = n0.a.this.n(aVar);
                    return n10;
                }
            });
        }

        public /* synthetic */ Object n(c.a aVar) {
            this.f15626p = aVar;
            return "SettableFuture hashCode: " + hashCode();
        }

        @Override // androidx.camera.core.impl.r0
        protected com.google.common.util.concurrent.f<Surface> r() {
            return this.f15625o;
        }

        boolean u() {
            androidx.camera.core.impl.utils.q.a();
            return this.f15627q == null && !m();
        }

        public boolean v(androidx.camera.core.impl.r0 r0Var, Runnable runnable) {
            androidx.camera.core.impl.utils.q.a();
            androidx.core.util.h.k(r0Var);
            androidx.camera.core.impl.r0 r0Var2 = this.f15627q;
            if (r0Var2 == r0Var) {
                return false;
            }
            androidx.core.util.h.n(r0Var2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            androidx.core.util.h.b(h().equals(r0Var.h()), "The provider's size must match the parent");
            androidx.core.util.h.b(i() == r0Var.i(), "The provider's format must match the parent");
            androidx.core.util.h.n(!m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f15627q = r0Var;
            a0.f.k(r0Var.j(), this.f15626p);
            r0Var.l();
            k().addListener(new Runnable() { // from class: g0.m0
                public /* synthetic */ m0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.impl.r0.this.e();
                }
            }, z.a.a());
            r0Var.f().addListener(runnable, z.a.d());
            return true;
        }
    }

    public n0(int i10, int i11, b2 b2Var, Matrix matrix, boolean z10, Rect rect, int i12, int i13, boolean z11) {
        this.f15615f = i10;
        this.f15610a = i11;
        this.f15616g = b2Var;
        this.f15611b = matrix;
        this.f15612c = z10;
        this.f15613d = rect;
        this.f15618i = i12;
        this.f15617h = i13;
        this.f15614e = z11;
        this.f15622m = new a(b2Var.e(), i11);
    }

    public /* synthetic */ void A(int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (this.f15618i != i10) {
            this.f15618i = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f15617h != i11) {
            this.f15617h = i11;
        } else {
            z11 = z10;
        }
        if (z11) {
            B();
        }
    }

    private void B() {
        androidx.camera.core.impl.utils.q.a();
        i1 i1Var = this.f15621l;
        if (i1Var != null) {
            i1Var.x(i1.h.g(this.f15613d, this.f15618i, this.f15617h, v(), this.f15611b, this.f15614e));
        }
    }

    private void g() {
        androidx.core.util.h.n(!this.f15620k, "Consumer can only be linked once.");
        this.f15620k = true;
    }

    private void h() {
        androidx.core.util.h.n(!this.f15624o, "Edge is already closed.");
    }

    public void m() {
        androidx.camera.core.impl.utils.q.a();
        this.f15622m.d();
        q0 q0Var = this.f15619j;
        if (q0Var != null) {
            q0Var.l();
            this.f15619j = null;
        }
    }

    public /* synthetic */ com.google.common.util.concurrent.f x(a aVar, int i10, Size size, Rect rect, int i11, boolean z10, androidx.camera.core.impl.c0 c0Var, Surface surface) {
        androidx.core.util.h.k(surface);
        try {
            aVar.l();
            q0 q0Var = new q0(surface, u(), i10, this.f15616g.e(), size, rect, i11, z10, c0Var, this.f15611b);
            q0Var.g().addListener(new Runnable() { // from class: g0.k0
                public /* synthetic */ k0() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    n0.a.this.e();
                }
            }, z.a.a());
            this.f15619j = q0Var;
            return a0.f.h(q0Var);
        } catch (r0.a e10) {
            return a0.f.f(e10);
        }
    }

    public /* synthetic */ void y() {
        if (this.f15624o) {
            return;
        }
        w();
    }

    public /* synthetic */ void z() {
        z.a.d().execute(new Runnable() { // from class: g0.i0
            public /* synthetic */ i0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                n0.this.y();
            }
        });
    }

    public void C(androidx.camera.core.impl.r0 r0Var) {
        androidx.camera.core.impl.utils.q.a();
        h();
        this.f15622m.v(r0Var, new g0(this));
    }

    public void D(int i10, int i11) {
        androidx.camera.core.impl.utils.q.d(new Runnable() { // from class: g0.e0

            /* renamed from: b */
            public final /* synthetic */ int f15578b;

            /* renamed from: c */
            public final /* synthetic */ int f15579c;

            public /* synthetic */ e0(int i102, int i112) {
                r2 = i102;
                r3 = i112;
            }

            @Override // java.lang.Runnable
            public final void run() {
                n0.this.A(r2, r3);
            }
        });
    }

    public void f(Runnable runnable) {
        androidx.camera.core.impl.utils.q.a();
        h();
        this.f15623n.add(runnable);
    }

    public final void i() {
        androidx.camera.core.impl.utils.q.a();
        m();
        this.f15624o = true;
    }

    public com.google.common.util.concurrent.f<w.x0> j(Size size, int i10, Rect rect, int i11, boolean z10, androidx.camera.core.impl.c0 c0Var) {
        androidx.camera.core.impl.utils.q.a();
        h();
        g();
        a aVar = this.f15622m;
        return a0.f.p(aVar.j(), new a0.a() { // from class: g0.j0

            /* renamed from: b */
            public final /* synthetic */ n0.a f15595b;

            /* renamed from: c */
            public final /* synthetic */ int f15596c;

            /* renamed from: d */
            public final /* synthetic */ Size f15597d;

            /* renamed from: e */
            public final /* synthetic */ Rect f15598e;

            /* renamed from: f */
            public final /* synthetic */ int f15599f;

            /* renamed from: g */
            public final /* synthetic */ boolean f15600g;

            /* renamed from: h */
            public final /* synthetic */ androidx.camera.core.impl.c0 f15601h;

            public /* synthetic */ j0(n0.a aVar2, int i102, Size size2, Rect rect2, int i112, boolean z102, androidx.camera.core.impl.c0 c0Var2) {
                r2 = aVar2;
                r3 = i102;
                r4 = size2;
                r5 = rect2;
                r6 = i112;
                r7 = z102;
                r8 = c0Var2;
            }

            @Override // a0.a
            public final com.google.common.util.concurrent.f apply(Object obj) {
                com.google.common.util.concurrent.f x10;
                x10 = n0.this.x(r2, r3, r4, r5, r6, r7, r8, (Surface) obj);
                return x10;
            }
        }, z.a.d());
    }

    public i1 k(androidx.camera.core.impl.c0 c0Var) {
        androidx.camera.core.impl.utils.q.a();
        h();
        i1 i1Var = new i1(this.f15616g.e(), c0Var, this.f15616g.b(), this.f15616g.c(), new Runnable() { // from class: g0.f0
            public /* synthetic */ f0() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                n0.this.z();
            }
        });
        try {
            androidx.camera.core.impl.r0 j10 = i1Var.j();
            if (this.f15622m.v(j10, new g0(this))) {
                com.google.common.util.concurrent.f<Void> k10 = this.f15622m.k();
                Objects.requireNonNull(j10);
                k10.addListener(new Runnable() { // from class: g0.h0
                    public /* synthetic */ h0() {
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.impl.r0.this.d();
                    }
                }, z.a.a());
            }
            this.f15621l = i1Var;
            B();
            return i1Var;
        } catch (r0.a e10) {
            throw new AssertionError("Surface is somehow already closed", e10);
        } catch (RuntimeException e11) {
            i1Var.y();
            throw e11;
        }
    }

    public final void l() {
        androidx.camera.core.impl.utils.q.a();
        h();
        m();
    }

    public Rect n() {
        return this.f15613d;
    }

    public androidx.camera.core.impl.r0 o() {
        androidx.camera.core.impl.utils.q.a();
        h();
        g();
        return this.f15622m;
    }

    public int p() {
        return this.f15610a;
    }

    public boolean q() {
        return this.f15614e;
    }

    public int r() {
        return this.f15618i;
    }

    public Matrix s() {
        return this.f15611b;
    }

    public b2 t() {
        return this.f15616g;
    }

    public int u() {
        return this.f15615f;
    }

    public boolean v() {
        return this.f15612c;
    }

    public void w() {
        androidx.camera.core.impl.utils.q.a();
        h();
        if (this.f15622m.u()) {
            return;
        }
        m();
        this.f15620k = false;
        this.f15622m = new a(this.f15616g.e(), this.f15610a);
        Iterator<Runnable> it = this.f15623n.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }
}
