package y;

import android.graphics.Bitmap;
import androidx.camera.core.n;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import y.e0;
import y.h;
import y.p;
import y.t;

/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    final Executor f31476a;

    /* renamed from: b, reason: collision with root package name */
    final g0.z f31477b;

    /* renamed from: c, reason: collision with root package name */
    private a f31478c;

    /* renamed from: d, reason: collision with root package name */
    private g0.b0<b, g0.c0<androidx.camera.core.o>> f31479d;

    /* renamed from: e, reason: collision with root package name */
    private g0.b0<p.a, g0.c0<byte[]>> f31480e;

    /* renamed from: f, reason: collision with root package name */
    private g0.b0<h.a, g0.c0<byte[]>> f31481f;

    /* renamed from: g, reason: collision with root package name */
    private g0.b0<t.a, n.h> f31482g;

    /* renamed from: h, reason: collision with root package name */
    private g0.b0<g0.c0<byte[]>, g0.c0<Bitmap>> f31483h;

    /* renamed from: i, reason: collision with root package name */
    private g0.b0<g0.c0<androidx.camera.core.o>, androidx.camera.core.o> f31484i;

    /* renamed from: j, reason: collision with root package name */
    private g0.b0<g0.c0<byte[]>, g0.c0<androidx.camera.core.o>> f31485j;

    /* renamed from: k, reason: collision with root package name */
    private g0.b0<g0.c0<Bitmap>, g0.c0<Bitmap>> f31486k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static a d(int i10, int i11) {
            return new f(new g0.v(), i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract g0.v<b> a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int b();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract int c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static b c(f0 f0Var, androidx.camera.core.o oVar) {
            return new g(f0Var, oVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract androidx.camera.core.o a();

        /* JADX INFO: Access modifiers changed from: package-private */
        public abstract f0 b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(Executor executor, g0.z zVar) {
        this.f31476a = d0.b.a(d0.f.class) != null ? z.a.f(executor) : executor;
        this.f31477b = zVar;
    }

    private g0.c0<byte[]> f(g0.c0<byte[]> c0Var, int i10) {
        androidx.core.util.h.m(c0Var.e() == 256);
        g0.c0<Bitmap> apply = this.f31483h.apply(c0Var);
        g0.b0<g0.c0<Bitmap>, g0.c0<Bitmap>> b0Var = this.f31486k;
        if (b0Var != null) {
            apply = b0Var.apply(apply);
        }
        return this.f31481f.apply(h.a.c(apply, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(final b bVar) {
        if (bVar.b().i()) {
            return;
        }
        this.f31476a.execute(new Runnable() { // from class: y.a0
            @Override // java.lang.Runnable
            public final void run() {
                e0.this.j(bVar);
            }
        });
    }

    private static void p(final f0 f0Var, final w.g0 g0Var) {
        z.a.d().execute(new Runnable() { // from class: y.d0
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.o(g0Var);
            }
        });
    }

    androidx.camera.core.o l(b bVar) {
        f0 b10 = bVar.b();
        g0.c0<androidx.camera.core.o> apply = this.f31479d.apply(bVar);
        if ((apply.e() == 35 || this.f31486k != null) && this.f31478c.c() == 256) {
            g0.c0<byte[]> apply2 = this.f31480e.apply(p.a.c(apply, b10.c()));
            if (this.f31486k != null) {
                apply2 = f(apply2, b10.c());
            }
            apply = this.f31485j.apply(apply2);
        }
        return this.f31484i.apply(apply);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void j(b bVar) {
        w.g0 g0Var;
        ScheduledExecutorService d10;
        Runnable runnable;
        final f0 b10 = bVar.b();
        try {
            if (bVar.b().j()) {
                final androidx.camera.core.o l10 = l(bVar);
                d10 = z.a.d();
                runnable = new Runnable() { // from class: y.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f0.this.m(l10);
                    }
                };
            } else {
                final n.h n10 = n(bVar);
                d10 = z.a.d();
                runnable = new Runnable() { // from class: y.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f0.this.l(n10);
                    }
                };
            }
            d10.execute(runnable);
        } catch (OutOfMemoryError e10) {
            g0Var = new w.g0(0, "Processing failed due to low memory.", e10);
            p(b10, g0Var);
        } catch (RuntimeException e11) {
            g0Var = new w.g0(0, "Processing failed.", e11);
            p(b10, g0Var);
        } catch (w.g0 e12) {
            p(b10, e12);
        }
    }

    n.h n(b bVar) {
        androidx.core.util.h.b(this.f31478c.c() == 256, String.format("On-disk capture only support JPEG output format. Output format: %s", Integer.valueOf(this.f31478c.c())));
        f0 b10 = bVar.b();
        g0.c0<byte[]> apply = this.f31480e.apply(p.a.c(this.f31479d.apply(bVar), b10.c()));
        if (apply.i() || this.f31486k != null) {
            apply = f(apply, b10.c());
        }
        g0.b0<t.a, n.h> b0Var = this.f31482g;
        n.g d10 = b10.d();
        Objects.requireNonNull(d10);
        return b0Var.apply(t.a.c(apply, d10));
    }

    public void o() {
    }

    public Void q(a aVar) {
        this.f31478c = aVar;
        aVar.a().a(new androidx.core.util.a() { // from class: y.z
            @Override // androidx.core.util.a
            public final void accept(Object obj) {
                e0.this.k((e0.b) obj);
            }
        });
        this.f31479d = new y();
        this.f31480e = new p();
        this.f31483h = new s();
        this.f31481f = new h();
        this.f31482g = new t();
        this.f31484i = new v();
        if (aVar.b() == 35 || this.f31477b != null) {
            this.f31485j = new u();
        }
        g0.z zVar = this.f31477b;
        if (zVar == null) {
            return null;
        }
        this.f31486k = new i(zVar);
        return null;
    }
}
