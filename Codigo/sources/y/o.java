package y;

import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.y3;
import androidx.camera.core.e;
import androidx.camera.core.impl.g1;
import androidx.camera.core.impl.h1;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private final Set<Integer> f31537a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    f0 f31538b = null;

    /* renamed from: c, reason: collision with root package name */
    androidx.camera.core.t f31539c;

    /* renamed from: d, reason: collision with root package name */
    private c f31540d;

    /* renamed from: e, reason: collision with root package name */
    private b f31541e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a0.c<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0 f31542a;

        a(f0 f0Var) {
            this.f31542a = f0Var;
        }

        @Override // a0.c
        public void a(Throwable th2) {
            androidx.camera.core.impl.utils.q.a();
            f0 f0Var = this.f31542a;
            o oVar = o.this;
            if (f0Var == oVar.f31538b) {
                oVar.f31538b = null;
            }
        }

        @Override // a0.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        private androidx.camera.core.impl.k f31544a = new a();

        /* renamed from: b, reason: collision with root package name */
        private androidx.camera.core.impl.r0 f31545b;

        /* loaded from: classes.dex */
        class a extends androidx.camera.core.impl.k {
            a() {
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static b j(Size size, int i10, int i11, boolean z10, w.l0 l0Var) {
            return new y.b(size, i10, i11, z10, l0Var, new g0.v(), new g0.v());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public androidx.camera.core.impl.k a() {
            return this.f31544a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract g0.v<w.g0> b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract w.l0 c();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int d();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int e();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract g0.v<f0> f();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract Size g();

        /* JADX INFO: Access modifiers changed from: package-private */
        public androidx.camera.core.impl.r0 h() {
            androidx.camera.core.impl.r0 r0Var = this.f31545b;
            Objects.requireNonNull(r0Var);
            return r0Var;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract boolean i();

        void k(androidx.camera.core.impl.k kVar) {
            this.f31544a = kVar;
        }

        void l(Surface surface) {
            androidx.core.util.h.n(this.f31545b == null, "The surface is already set.");
            this.f31545b = new h1(surface, g(), d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class c {
        static c e(int i10, int i11) {
            return new y.c(new g0.v(), new g0.v(), i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract g0.v<androidx.camera.core.o> a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int c();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract g0.v<f0> d();
    }

    private static g1 c(w.l0 l0Var, int i10, int i11, int i12) {
        return l0Var != null ? l0Var.a(i10, i11, i12, 4, 0L) : androidx.camera.core.p.a(i10, i11, i12, 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(x xVar, f0 f0Var) {
        i(f0Var);
        xVar.h(f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(g1 g1Var) {
        try {
            androidx.camera.core.o b10 = g1Var.b();
            if (b10 != null) {
                h(b10);
            } else {
                l(new w.g0(2, "Failed to acquire latest image", null));
            }
        } catch (IllegalStateException e10) {
            l(new w.g0(2, "Failed to acquire latest image", e10));
        }
    }

    private void g(androidx.camera.core.o oVar) {
        Object d10 = oVar.e1().b().d(this.f31538b.h());
        Objects.requireNonNull(d10);
        int intValue = ((Integer) d10).intValue();
        androidx.core.util.h.n(this.f31537a.contains(Integer.valueOf(intValue)), "Received an unexpected stage id" + intValue);
        this.f31537a.remove(Integer.valueOf(intValue));
        c cVar = this.f31540d;
        Objects.requireNonNull(cVar);
        cVar.a().accept(oVar);
        if (this.f31537a.isEmpty()) {
            f0 f0Var = this.f31538b;
            this.f31538b = null;
            f0Var.n();
        }
    }

    private void k(b bVar, androidx.camera.core.t tVar) {
        bVar.h().d();
        com.google.common.util.concurrent.f<Void> k10 = bVar.h().k();
        Objects.requireNonNull(tVar);
        k10.addListener(new y3(tVar), z.a.d());
    }

    public int d() {
        androidx.camera.core.impl.utils.q.a();
        androidx.core.util.h.n(this.f31539c != null, "The ImageReader is not initialized.");
        return this.f31539c.i();
    }

    void h(androidx.camera.core.o oVar) {
        androidx.camera.core.impl.utils.q.a();
        if (this.f31538b != null) {
            g(oVar);
            return;
        }
        w.o0.a("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + oVar);
        oVar.close();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(f0 f0Var) {
        androidx.camera.core.impl.utils.q.a();
        boolean z10 = true;
        androidx.core.util.h.n(d() > 0, "Too many acquire images. Close image to be able to process next.");
        if (this.f31538b != null && !this.f31537a.isEmpty()) {
            z10 = false;
        }
        androidx.core.util.h.n(z10, "The previous request is not complete");
        this.f31538b = f0Var;
        this.f31537a.addAll(f0Var.g());
        c cVar = this.f31540d;
        Objects.requireNonNull(cVar);
        cVar.d().accept(f0Var);
        a0.f.b(f0Var.a(), new a(f0Var), z.a.a());
    }

    public void j() {
        androidx.camera.core.impl.utils.q.a();
        b bVar = this.f31541e;
        Objects.requireNonNull(bVar);
        androidx.camera.core.t tVar = this.f31539c;
        Objects.requireNonNull(tVar);
        k(bVar, tVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(w.g0 g0Var) {
        androidx.camera.core.impl.utils.q.a();
        f0 f0Var = this.f31538b;
        if (f0Var != null) {
            f0Var.k(g0Var);
        }
    }

    public void m(e.a aVar) {
        androidx.camera.core.impl.utils.q.a();
        androidx.core.util.h.n(this.f31539c != null, "The ImageReader is not initialized.");
        this.f31539c.m(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c n(b bVar) {
        androidx.core.util.a<f0> aVar;
        x xVar;
        androidx.core.util.h.n(this.f31541e == null && this.f31539c == null, "CaptureNode does not support recreation yet.");
        this.f31541e = bVar;
        Size g10 = bVar.g();
        int d10 = bVar.d();
        if ((true ^ bVar.i()) && bVar.c() == null) {
            androidx.camera.core.q qVar = new androidx.camera.core.q(g10.getWidth(), g10.getHeight(), d10, 4);
            bVar.k(qVar.m());
            aVar = new androidx.core.util.a() { // from class: y.k
                @Override // androidx.core.util.a
                public final void accept(Object obj) {
                    o.this.i((f0) obj);
                }
            };
            xVar = qVar;
        } else {
            final x xVar2 = new x(c(bVar.c(), g10.getWidth(), g10.getHeight(), d10));
            aVar = new androidx.core.util.a() { // from class: y.l
                @Override // androidx.core.util.a
                public final void accept(Object obj) {
                    o.this.e(xVar2, (f0) obj);
                }
            };
            xVar = xVar2;
        }
        Surface surface = xVar.getSurface();
        Objects.requireNonNull(surface);
        bVar.l(surface);
        this.f31539c = new androidx.camera.core.t(xVar);
        xVar.f(new g1.a() { // from class: y.m
            @Override // androidx.camera.core.impl.g1.a
            public final void a(g1 g1Var) {
                o.this.f(g1Var);
            }
        }, z.a.d());
        bVar.f().a(aVar);
        bVar.b().a(new androidx.core.util.a() { // from class: y.n
            @Override // androidx.core.util.a
            public final void accept(Object obj) {
                o.this.l((w.g0) obj);
            }
        });
        c e10 = c.e(bVar.d(), bVar.e());
        this.f31540d = e10;
        return e10;
    }
}
