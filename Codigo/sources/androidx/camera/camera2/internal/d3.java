package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.j3;
import androidx.camera.camera2.internal.x2;
import androidx.camera.core.impl.r0;
import androidx.concurrent.futures.c;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public class d3 extends x2.a implements x2, j3.b {

    /* renamed from: b */
    final a2 f1955b;

    /* renamed from: c */
    final Handler f1956c;

    /* renamed from: d */
    final Executor f1957d;

    /* renamed from: e */
    private final ScheduledExecutorService f1958e;

    /* renamed from: f */
    x2.a f1959f;

    /* renamed from: g */
    androidx.camera.camera2.internal.compat.i f1960g;

    /* renamed from: h */
    com.google.common.util.concurrent.f<Void> f1961h;

    /* renamed from: i */
    c.a<Void> f1962i;

    /* renamed from: j */
    private com.google.common.util.concurrent.f<List<Surface>> f1963j;

    /* renamed from: a */
    final Object f1954a = new Object();

    /* renamed from: k */
    private List<androidx.camera.core.impl.r0> f1964k = null;

    /* renamed from: l */
    private boolean f1965l = false;

    /* renamed from: m */
    private boolean f1966m = false;

    /* renamed from: n */
    private boolean f1967n = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a0.c<Void> {
        a() {
        }

        @Override // a0.c
        public void a(Throwable th2) {
            d3.this.e();
            d3 d3Var = d3.this;
            d3Var.f1955b.j(d3Var);
        }

        @Override // a0.c
        /* renamed from: b */
        public void onSuccess(Void r12) {
        }
    }

    /* loaded from: classes.dex */
    class b extends CameraCaptureSession.StateCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            d3.this.A(cameraCaptureSession);
            d3 d3Var = d3.this;
            d3Var.a(d3Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            d3.this.A(cameraCaptureSession);
            d3 d3Var = d3.this;
            d3Var.o(d3Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            d3.this.A(cameraCaptureSession);
            d3 d3Var = d3.this;
            d3Var.p(d3Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            c.a<Void> aVar;
            try {
                d3.this.A(cameraCaptureSession);
                d3 d3Var = d3.this;
                d3Var.q(d3Var);
                synchronized (d3.this.f1954a) {
                    androidx.core.util.h.l(d3.this.f1962i, "OpenCaptureSession completer should not null");
                    d3 d3Var2 = d3.this;
                    aVar = d3Var2.f1962i;
                    d3Var2.f1962i = null;
                }
                aVar.f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th2) {
                synchronized (d3.this.f1954a) {
                    androidx.core.util.h.l(d3.this.f1962i, "OpenCaptureSession completer should not null");
                    d3 d3Var3 = d3.this;
                    c.a<Void> aVar2 = d3Var3.f1962i;
                    d3Var3.f1962i = null;
                    aVar2.f(new IllegalStateException("onConfigureFailed"));
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            c.a<Void> aVar;
            try {
                d3.this.A(cameraCaptureSession);
                d3 d3Var = d3.this;
                d3Var.r(d3Var);
                synchronized (d3.this.f1954a) {
                    androidx.core.util.h.l(d3.this.f1962i, "OpenCaptureSession completer should not null");
                    d3 d3Var2 = d3.this;
                    aVar = d3Var2.f1962i;
                    d3Var2.f1962i = null;
                }
                aVar.c(null);
            } catch (Throwable th2) {
                synchronized (d3.this.f1954a) {
                    androidx.core.util.h.l(d3.this.f1962i, "OpenCaptureSession completer should not null");
                    d3 d3Var3 = d3.this;
                    c.a<Void> aVar2 = d3Var3.f1962i;
                    d3Var3.f1962i = null;
                    aVar2.c(null);
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            d3.this.A(cameraCaptureSession);
            d3 d3Var = d3.this;
            d3Var.s(d3Var);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            d3.this.A(cameraCaptureSession);
            d3 d3Var = d3.this;
            d3Var.u(d3Var, surface);
        }
    }

    public d3(a2 a2Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f1955b = a2Var;
        this.f1956c = handler;
        this.f1957d = executor;
        this.f1958e = scheduledExecutorService;
    }

    public /* synthetic */ void D() {
        t(this);
    }

    public /* synthetic */ void E(x2 x2Var) {
        this.f1955b.h(this);
        t(x2Var);
        Objects.requireNonNull(this.f1959f);
        this.f1959f.p(x2Var);
    }

    public /* synthetic */ void F(x2 x2Var) {
        Objects.requireNonNull(this.f1959f);
        this.f1959f.t(x2Var);
    }

    public /* synthetic */ Object G(List list, androidx.camera.camera2.internal.compat.e0 e0Var, r.w wVar, c.a aVar) {
        String str;
        synchronized (this.f1954a) {
            B(list);
            androidx.core.util.h.n(this.f1962i == null, "The openCaptureSessionCompleter can only set once!");
            this.f1962i = aVar;
            e0Var.a(wVar);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    public /* synthetic */ com.google.common.util.concurrent.f H(List list, List list2) {
        w.o0.a("SyncCaptureSessionBase", "[" + this + "] getSurface...done");
        return list2.contains(null) ? a0.f.f(new r0.a("Surface closed", (androidx.camera.core.impl.r0) list.get(list2.indexOf(null)))) : list2.isEmpty() ? a0.f.f(new IllegalArgumentException("Unable to open capture session without surfaces")) : a0.f.h(list2);
    }

    void A(CameraCaptureSession cameraCaptureSession) {
        if (this.f1960g == null) {
            this.f1960g = androidx.camera.camera2.internal.compat.i.d(cameraCaptureSession, this.f1956c);
        }
    }

    void B(List<androidx.camera.core.impl.r0> list) {
        synchronized (this.f1954a) {
            I();
            androidx.camera.core.impl.w0.f(list);
            this.f1964k = list;
        }
    }

    public boolean C() {
        boolean z10;
        synchronized (this.f1954a) {
            z10 = this.f1961h != null;
        }
        return z10;
    }

    void I() {
        synchronized (this.f1954a) {
            List<androidx.camera.core.impl.r0> list = this.f1964k;
            if (list != null) {
                androidx.camera.core.impl.w0.e(list);
                this.f1964k = null;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.x2.a
    public void a(x2 x2Var) {
        Objects.requireNonNull(this.f1959f);
        this.f1959f.a(x2Var);
    }

    @Override // androidx.camera.camera2.internal.j3.b
    public Executor b() {
        return this.f1957d;
    }

    @Override // androidx.camera.camera2.internal.x2
    public x2.a c() {
        return this;
    }

    @Override // androidx.camera.camera2.internal.x2
    public void close() {
        androidx.core.util.h.l(this.f1960g, "Need to call openCaptureSession before using this API.");
        this.f1955b.i(this);
        this.f1960g.c().close();
        b().execute(new Runnable() { // from class: androidx.camera.camera2.internal.b3
            public /* synthetic */ b3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                d3.this.D();
            }
        });
    }

    @Override // androidx.camera.camera2.internal.x2
    public void d() {
        androidx.core.util.h.l(this.f1960g, "Need to call openCaptureSession before using this API.");
        this.f1960g.c().stopRepeating();
    }

    @Override // androidx.camera.camera2.internal.x2
    public void e() {
        I();
    }

    @Override // androidx.camera.camera2.internal.x2
    public void f() {
        androidx.core.util.h.l(this.f1960g, "Need to call openCaptureSession before using this API.");
        this.f1960g.c().abortCaptures();
    }

    @Override // androidx.camera.camera2.internal.x2
    public CameraDevice g() {
        androidx.core.util.h.k(this.f1960g);
        return this.f1960g.c().getDevice();
    }

    @Override // androidx.camera.camera2.internal.x2
    public int h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        androidx.core.util.h.l(this.f1960g, "Need to call openCaptureSession before using this API.");
        return this.f1960g.b(captureRequest, b(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.j3.b
    public r.w i(int i10, List<r.f> list, x2.a aVar) {
        this.f1959f = aVar;
        return new r.w(i10, list, b(), new b());
    }

    @Override // androidx.camera.camera2.internal.j3.b
    public com.google.common.util.concurrent.f<List<Surface>> j(List<androidx.camera.core.impl.r0> list, long j10) {
        synchronized (this.f1954a) {
            if (this.f1966m) {
                return a0.f.f(new CancellationException("Opener is disabled"));
            }
            a0.d e10 = a0.d.a(androidx.camera.core.impl.w0.k(list, false, j10, b(), this.f1958e)).e(new a0.a() { // from class: androidx.camera.camera2.internal.y2

                /* renamed from: b */
                public final /* synthetic */ List f2367b;

                public /* synthetic */ y2(List list2) {
                    r2 = list2;
                }

                @Override // a0.a
                public final com.google.common.util.concurrent.f apply(Object obj) {
                    com.google.common.util.concurrent.f H;
                    H = d3.this.H(r2, (List) obj);
                    return H;
                }
            }, b());
            this.f1963j = e10;
            return a0.f.j(e10);
        }
    }

    @Override // androidx.camera.camera2.internal.x2
    public int k(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        androidx.core.util.h.l(this.f1960g, "Need to call openCaptureSession before using this API.");
        return this.f1960g.a(list, b(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.x2
    public androidx.camera.camera2.internal.compat.i l() {
        androidx.core.util.h.k(this.f1960g);
        return this.f1960g;
    }

    @Override // androidx.camera.camera2.internal.x2
    public com.google.common.util.concurrent.f<Void> m() {
        return a0.f.h(null);
    }

    @Override // androidx.camera.camera2.internal.j3.b
    public com.google.common.util.concurrent.f<Void> n(CameraDevice cameraDevice, r.w wVar, List<androidx.camera.core.impl.r0> list) {
        synchronized (this.f1954a) {
            if (this.f1966m) {
                return a0.f.f(new CancellationException("Opener is disabled"));
            }
            this.f1955b.l(this);
            com.google.common.util.concurrent.f<Void> a10 = androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: androidx.camera.camera2.internal.z2

                /* renamed from: b */
                public final /* synthetic */ List f2372b;

                /* renamed from: c */
                public final /* synthetic */ androidx.camera.camera2.internal.compat.e0 f2373c;

                /* renamed from: d */
                public final /* synthetic */ r.w f2374d;

                public /* synthetic */ z2(List list2, androidx.camera.camera2.internal.compat.e0 e0Var, r.w wVar2) {
                    r2 = list2;
                    r3 = e0Var;
                    r4 = wVar2;
                }

                @Override // androidx.concurrent.futures.c.InterfaceC0032c
                public final Object a(c.a aVar) {
                    Object G;
                    G = d3.this.G(r2, r3, r4, aVar);
                    return G;
                }
            });
            this.f1961h = a10;
            a0.f.b(a10, new a(), z.a.a());
            return a0.f.j(this.f1961h);
        }
    }

    @Override // androidx.camera.camera2.internal.x2.a
    public void o(x2 x2Var) {
        Objects.requireNonNull(this.f1959f);
        this.f1959f.o(x2Var);
    }

    @Override // androidx.camera.camera2.internal.x2.a
    public void p(x2 x2Var) {
        com.google.common.util.concurrent.f<Void> fVar;
        synchronized (this.f1954a) {
            if (this.f1965l) {
                fVar = null;
            } else {
                this.f1965l = true;
                androidx.core.util.h.l(this.f1961h, "Need to call openCaptureSession before using this API.");
                fVar = this.f1961h;
            }
        }
        e();
        if (fVar != null) {
            fVar.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.a3

                /* renamed from: b */
                public final /* synthetic */ x2 f1806b;

                public /* synthetic */ a3(x2 x2Var2) {
                    r2 = x2Var2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    d3.this.E(r2);
                }
            }, z.a.a());
        }
    }

    @Override // androidx.camera.camera2.internal.x2.a
    public void q(x2 x2Var) {
        Objects.requireNonNull(this.f1959f);
        e();
        this.f1955b.j(this);
        this.f1959f.q(x2Var);
    }

    @Override // androidx.camera.camera2.internal.x2.a
    public void r(x2 x2Var) {
        Objects.requireNonNull(this.f1959f);
        this.f1955b.k(this);
        this.f1959f.r(x2Var);
    }

    @Override // androidx.camera.camera2.internal.x2.a
    public void s(x2 x2Var) {
        Objects.requireNonNull(this.f1959f);
        this.f1959f.s(x2Var);
    }

    @Override // androidx.camera.camera2.internal.j3.b
    public boolean stop() {
        boolean z10;
        try {
            synchronized (this.f1954a) {
                if (!this.f1966m) {
                    com.google.common.util.concurrent.f<List<Surface>> fVar = this.f1963j;
                    r1 = fVar != null ? fVar : null;
                    this.f1966m = true;
                }
                z10 = !C();
            }
            return z10;
        } finally {
            if (r1 != null) {
                r1.cancel(true);
            }
        }
    }

    @Override // androidx.camera.camera2.internal.x2.a
    public void t(x2 x2Var) {
        com.google.common.util.concurrent.f<Void> fVar;
        synchronized (this.f1954a) {
            if (this.f1967n) {
                fVar = null;
            } else {
                this.f1967n = true;
                androidx.core.util.h.l(this.f1961h, "Need to call openCaptureSession before using this API.");
                fVar = this.f1961h;
            }
        }
        if (fVar != null) {
            fVar.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.c3

                /* renamed from: b */
                public final /* synthetic */ x2 f1843b;

                public /* synthetic */ c3(x2 x2Var2) {
                    r2 = x2Var2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    d3.this.F(r2);
                }
            }, z.a.a());
        }
    }

    @Override // androidx.camera.camera2.internal.x2.a
    public void u(x2 x2Var, Surface surface) {
        Objects.requireNonNull(this.f1959f);
        this.f1959f.u(x2Var, surface);
    }
}
