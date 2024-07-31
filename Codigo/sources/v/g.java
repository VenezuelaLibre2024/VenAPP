package v;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.u;
import androidx.camera.core.impl.n0;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import q.a;
import w.j;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    private final u f27843c;

    /* renamed from: d, reason: collision with root package name */
    final Executor f27844d;

    /* renamed from: g, reason: collision with root package name */
    c.a<Void> f27847g;

    /* renamed from: a, reason: collision with root package name */
    private boolean f27841a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f27842b = false;

    /* renamed from: e, reason: collision with root package name */
    final Object f27845e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private a.C0388a f27846f = new a.C0388a();

    /* renamed from: h, reason: collision with root package name */
    private final u.c f27848h = new u.c() { // from class: v.d
        @Override // androidx.camera.camera2.internal.u.c
        public final boolean a(TotalCaptureResult totalCaptureResult) {
            boolean q10;
            q10 = g.this.q(totalCaptureResult);
            return q10;
        }
    };

    public g(u uVar, Executor executor) {
        this.f27843c = uVar;
        this.f27844d = executor;
    }

    private void h(j jVar) {
        synchronized (this.f27845e) {
            for (n0.a<?> aVar : jVar.e()) {
                this.f27846f.a().r(aVar, jVar.a(aVar));
            }
        }
    }

    private void j() {
        synchronized (this.f27845e) {
            this.f27846f = new a.C0388a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(final c.a aVar) {
        this.f27844d.execute(new Runnable() { // from class: v.e
            @Override // java.lang.Runnable
            public final void run() {
                g.this.m(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object p(final c.a aVar) {
        this.f27844d.execute(new Runnable() { // from class: v.f
            @Override // java.lang.Runnable
            public final void run() {
                g.this.o(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ boolean q(android.hardware.camera2.TotalCaptureResult r3) {
        /*
            r2 = this;
            androidx.concurrent.futures.c$a<java.lang.Void> r0 = r2.f27847g
            r1 = 0
            if (r0 == 0) goto L32
            android.hardware.camera2.CaptureRequest r3 = r3.getRequest()
            java.lang.Object r3 = r3.getTag()
            boolean r0 = r3 instanceof androidx.camera.core.impl.f2
            if (r0 == 0) goto L32
            androidx.camera.core.impl.f2 r3 = (androidx.camera.core.impl.f2) r3
            java.lang.String r0 = "Camera2CameraControl"
            java.lang.Object r3 = r3.d(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L32
            androidx.concurrent.futures.c$a<java.lang.Void> r0 = r2.f27847g
            int r0 = r0.hashCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L32
            androidx.concurrent.futures.c$a<java.lang.Void> r3 = r2.f27847g
            r2.f27847g = r1
            goto L33
        L32:
            r3 = r1
        L33:
            if (r3 == 0) goto L38
            r3.c(r1)
        L38:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: v.g.q(android.hardware.camera2.TotalCaptureResult):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void r(boolean z10) {
        if (this.f27841a == z10) {
            return;
        }
        this.f27841a = z10;
        if (z10) {
            if (this.f27842b) {
                v();
            }
        } else {
            c.a<Void> aVar = this.f27847g;
            if (aVar != null) {
                aVar.f(new j.a("The camera control has became inactive."));
                this.f27847g = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void o(c.a<Void> aVar) {
        this.f27842b = true;
        c.a<Void> aVar2 = this.f27847g;
        if (aVar2 == null) {
            aVar2 = null;
        }
        this.f27847g = aVar;
        if (this.f27841a) {
            v();
        }
        if (aVar2 != null) {
            aVar2.f(new j.a("Camera2CameraControl was updated with new options."));
        }
    }

    private void v() {
        this.f27843c.d0();
        this.f27842b = false;
    }

    public com.google.common.util.concurrent.f<Void> g(j jVar) {
        h(jVar);
        return a0.f.j(androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: v.c
            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object n10;
                n10 = g.this.n(aVar);
                return n10;
            }
        }));
    }

    public com.google.common.util.concurrent.f<Void> i() {
        j();
        return a0.f.j(androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: v.b
            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object p10;
                p10 = g.this.p(aVar);
                return p10;
            }
        }));
    }

    public q.a k() {
        q.a c10;
        synchronized (this.f27845e) {
            if (this.f27847g != null) {
                this.f27846f.a().r(q.a.N, Integer.valueOf(this.f27847g.hashCode()));
            }
            c10 = this.f27846f.c();
        }
        return c10;
    }

    public u.c l() {
        return this.f27848h;
    }

    public void s(final boolean z10) {
        this.f27844d.execute(new Runnable() { // from class: v.a
            @Override // java.lang.Runnable
            public final void run() {
                g.this.r(z10);
            }
        });
    }
}
