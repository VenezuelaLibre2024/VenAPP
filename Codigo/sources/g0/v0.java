package g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import w.i1;

/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a, reason: collision with root package name */
    final r0 f15677a;

    /* renamed from: b, reason: collision with root package name */
    final androidx.camera.core.impl.c0 f15678b;

    /* renamed from: c, reason: collision with root package name */
    private c f15679c;

    /* renamed from: d, reason: collision with root package name */
    private b f15680d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a0.c<w.x0> {
        a() {
        }

        @Override // a0.c
        public void a(Throwable th2) {
            w.o0.l("SurfaceProcessorNode", "Downstream node failed to provide Surface.", th2);
        }

        @Override // a0.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(w.x0 x0Var) {
            androidx.core.util.h.k(x0Var);
            v0.this.f15677a.a(x0Var);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public static b c(n0 n0Var, List<d> list) {
            return new g0.d(n0Var, list);
        }

        public abstract List<d> a();

        public abstract n0 b();
    }

    /* loaded from: classes.dex */
    public static class c extends HashMap<d, n0> {
    }

    /* loaded from: classes.dex */
    public static abstract class d {
        public static d h(int i10, int i11, Rect rect, Size size, int i12, boolean z10) {
            return new e(UUID.randomUUID(), i10, i11, rect, size, i12, z10);
        }

        public static d i(n0 n0Var) {
            return h(n0Var.u(), n0Var.p(), n0Var.n(), androidx.camera.core.impl.utils.r.d(n0Var.n(), n0Var.r()), n0Var.r(), n0Var.q());
        }

        public abstract Rect a();

        public abstract int b();

        public abstract boolean c();

        public abstract int d();

        public abstract Size e();

        public abstract int f();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract UUID g();
    }

    public v0(androidx.camera.core.impl.c0 c0Var, r0 r0Var) {
        this.f15678b = c0Var;
        this.f15677a = r0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void g(n0 n0Var, Map.Entry<d, n0> entry) {
        a0.f.b(entry.getValue().j(n0Var.t().e(), entry.getKey().b(), entry.getKey().a(), entry.getKey().d(), entry.getKey().c(), n0Var.v() ? this.f15678b : null), new a(), z.a.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        c cVar = this.f15679c;
        if (cVar != null) {
            Iterator<n0> it = cVar.values().iterator();
            while (it.hasNext()) {
                it.next().i();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(Map map, i1.h hVar) {
        for (Map.Entry entry : map.entrySet()) {
            int c10 = hVar.c() - ((d) entry.getKey()).d();
            if (((d) entry.getKey()).c()) {
                c10 = -c10;
            }
            ((n0) entry.getValue()).D(androidx.camera.core.impl.utils.r.q(c10), -1);
        }
    }

    private void j(final n0 n0Var, Map<d, n0> map) {
        for (final Map.Entry<d, n0> entry : map.entrySet()) {
            g(n0Var, entry);
            entry.getValue().f(new Runnable() { // from class: g0.t0
                @Override // java.lang.Runnable
                public final void run() {
                    v0.this.g(n0Var, entry);
                }
            });
        }
    }

    private void k(n0 n0Var, Map<d, n0> map) {
        i1 k10 = n0Var.k(this.f15678b);
        l(k10, map);
        this.f15677a.b(k10);
    }

    private n0 n(n0 n0Var, d dVar) {
        Rect a10 = dVar.a();
        int d10 = dVar.d();
        boolean c10 = dVar.c();
        Matrix matrix = new Matrix(n0Var.s());
        matrix.postConcat(androidx.camera.core.impl.utils.r.c(new RectF(a10), androidx.camera.core.impl.utils.r.n(dVar.e()), d10, c10));
        androidx.core.util.h.a(androidx.camera.core.impl.utils.r.g(androidx.camera.core.impl.utils.r.d(a10, d10), dVar.e()));
        return new n0(dVar.f(), dVar.b(), n0Var.t().f().e(dVar.e()).a(), matrix, false, androidx.camera.core.impl.utils.r.l(dVar.e()), n0Var.r() - d10, -1, n0Var.q() != c10);
    }

    public r0 e() {
        return this.f15677a;
    }

    public void i() {
        this.f15677a.release();
        z.a.d().execute(new Runnable() { // from class: g0.u0
            @Override // java.lang.Runnable
            public final void run() {
                v0.this.f();
            }
        });
    }

    void l(i1 i1Var, final Map<d, n0> map) {
        i1Var.w(z.a.d(), new i1.i() { // from class: g0.s0
            @Override // w.i1.i
            public final void a(i1.h hVar) {
                v0.h(map, hVar);
            }
        });
    }

    public c m(b bVar) {
        androidx.camera.core.impl.utils.q.a();
        this.f15680d = bVar;
        this.f15679c = new c();
        n0 b10 = bVar.b();
        for (d dVar : bVar.a()) {
            this.f15679c.put(dVar, n(b10, dVar));
        }
        k(b10, this.f15679c);
        j(b10, this.f15679c);
        return this.f15679c;
    }
}
