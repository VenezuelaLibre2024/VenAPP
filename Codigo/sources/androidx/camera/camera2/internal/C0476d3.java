package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.C0506j3;
import androidx.camera.camera2.internal.InterfaceC0575x2;
import androidx.camera.camera2.internal.compat.C0429e0;
import androidx.camera.camera2.internal.compat.C0436i;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0694w0;
import androidx.concurrent.futures.C0742c;
import androidx.core.util.C0984h;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p002a0.C0007d;
import p002a0.C0009f;
import p002a0.InterfaceC0004a;
import p002a0.InterfaceC0006c;
import p320r.C10557f;
import p320r.C10574w;
import p407w.C12029o0;
import p474z.C12747a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.d3 */
/* loaded from: classes.dex */
public class C0476d3 extends InterfaceC0575x2.a implements InterfaceC0575x2, C0506j3.b {

    /* renamed from: b */
    final C0404a2 f2258b;

    /* renamed from: c */
    final Handler f2259c;

    /* renamed from: d */
    final Executor f2260d;

    /* renamed from: e */
    private final ScheduledExecutorService f2261e;

    /* renamed from: f */
    InterfaceC0575x2.a f2262f;

    /* renamed from: g */
    C0436i f2263g;

    /* renamed from: h */
    InterfaceFutureC5920f<Void> f2264h;

    /* renamed from: i */
    C0742c.a<Void> f2265i;

    /* renamed from: j */
    private InterfaceFutureC5920f<List<Surface>> f2266j;

    /* renamed from: a */
    final Object f2257a = new Object();

    /* renamed from: k */
    private List<AbstractC0661r0> f2267k = null;

    /* renamed from: l */
    private boolean f2268l = false;

    /* renamed from: m */
    private boolean f2269m = false;

    /* renamed from: n */
    private boolean f2270n = false;

    /* renamed from: androidx.camera.camera2.internal.d3$a */
    /* loaded from: classes.dex */
    class a implements InterfaceC0006c<Void> {
        a() {
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: a */
        public void mo8a(Throwable th2) {
            C0476d3.this.mo2344e();
            C0476d3 c0476d3 = C0476d3.this;
            c0476d3.f2258b.m2161j(c0476d3);
        }

        @Override // p002a0.InterfaceC0006c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r12) {
        }
    }

    /* renamed from: androidx.camera.camera2.internal.d3$b */
    /* loaded from: classes.dex */
    class b extends CameraCaptureSession.StateCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            C0476d3.this.m2336A(cameraCaptureSession);
            C0476d3 c0476d3 = C0476d3.this;
            c0476d3.mo2340a(c0476d3);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            C0476d3.this.m2336A(cameraCaptureSession);
            C0476d3 c0476d3 = C0476d3.this;
            c0476d3.mo2354o(c0476d3);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            C0476d3.this.m2336A(cameraCaptureSession);
            C0476d3 c0476d3 = C0476d3.this;
            c0476d3.mo2355p(c0476d3);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C0742c.a<Void> aVar;
            try {
                C0476d3.this.m2336A(cameraCaptureSession);
                C0476d3 c0476d3 = C0476d3.this;
                c0476d3.mo2356q(c0476d3);
                synchronized (C0476d3.this.f2257a) {
                    C0984h.m4834l(C0476d3.this.f2265i, "OpenCaptureSession completer should not null");
                    C0476d3 c0476d32 = C0476d3.this;
                    aVar = c0476d32.f2265i;
                    c0476d32.f2265i = null;
                }
                aVar.m3758f(new IllegalStateException("onConfigureFailed"));
            } catch (Throwable th2) {
                synchronized (C0476d3.this.f2257a) {
                    C0984h.m4834l(C0476d3.this.f2265i, "OpenCaptureSession completer should not null");
                    C0476d3 c0476d33 = C0476d3.this;
                    C0742c.a<Void> aVar2 = c0476d33.f2265i;
                    c0476d33.f2265i = null;
                    aVar2.m3758f(new IllegalStateException("onConfigureFailed"));
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C0742c.a<Void> aVar;
            try {
                C0476d3.this.m2336A(cameraCaptureSession);
                C0476d3 c0476d3 = C0476d3.this;
                c0476d3.mo2357r(c0476d3);
                synchronized (C0476d3.this.f2257a) {
                    C0984h.m4834l(C0476d3.this.f2265i, "OpenCaptureSession completer should not null");
                    C0476d3 c0476d32 = C0476d3.this;
                    aVar = c0476d32.f2265i;
                    c0476d32.f2265i = null;
                }
                aVar.m3756c(null);
            } catch (Throwable th2) {
                synchronized (C0476d3.this.f2257a) {
                    C0984h.m4834l(C0476d3.this.f2265i, "OpenCaptureSession completer should not null");
                    C0476d3 c0476d33 = C0476d3.this;
                    C0742c.a<Void> aVar2 = c0476d33.f2265i;
                    c0476d33.f2265i = null;
                    aVar2.m3756c(null);
                    throw th2;
                }
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            C0476d3.this.m2336A(cameraCaptureSession);
            C0476d3 c0476d3 = C0476d3.this;
            c0476d3.mo2358s(c0476d3);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C0476d3.this.m2336A(cameraCaptureSession);
            C0476d3 c0476d3 = C0476d3.this;
            c0476d3.mo2360u(c0476d3, surface);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0476d3(C0404a2 c0404a2, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f2258b = c0404a2;
        this.f2259c = handler;
        this.f2260d = executor;
        this.f2261e = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m2326D() {
        mo2359t(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m2327E(InterfaceC0575x2 interfaceC0575x2) {
        this.f2258b.m2159h(this);
        mo2359t(interfaceC0575x2);
        Objects.requireNonNull(this.f2262f);
        this.f2262f.mo2355p(interfaceC0575x2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m2328F(InterfaceC0575x2 interfaceC0575x2) {
        Objects.requireNonNull(this.f2262f);
        this.f2262f.mo2359t(interfaceC0575x2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ Object m2329G(List list, C0429e0 c0429e0, C10574w c10574w, C0742c.a aVar) {
        String str;
        synchronized (this.f2257a) {
            m2337B(list);
            C0984h.m4836n(this.f2265i == null, "The openCaptureSessionCompleter can only set once!");
            this.f2265i = aVar;
            c0429e0.m2220a(c10574w);
            str = "openCaptureSession[session=" + this + "]";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ InterfaceFutureC5920f m2330H(List list, List list2) {
        C12029o0.m38638a("SyncCaptureSessionBase", "[" + this + "] getSurface...done");
        return list2.contains(null) ? C0009f.m20f(new AbstractC0661r0.a("Surface closed", (AbstractC0661r0) list.get(list2.indexOf(null)))) : list2.isEmpty() ? C0009f.m20f(new IllegalArgumentException("Unable to open capture session without surfaces")) : C0009f.m22h(list2);
    }

    /* renamed from: A */
    void m2336A(CameraCaptureSession cameraCaptureSession) {
        if (this.f2263g == null) {
            this.f2263g = C0436i.m2237d(cameraCaptureSession, this.f2259c);
        }
    }

    /* renamed from: B */
    void m2337B(List<AbstractC0661r0> list) {
        synchronized (this.f2257a) {
            m2339I();
            C0694w0.m3368f(list);
            this.f2267k = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public boolean m2338C() {
        boolean z10;
        synchronized (this.f2257a) {
            z10 = this.f2264h != null;
        }
        return z10;
    }

    /* renamed from: I */
    void m2339I() {
        synchronized (this.f2257a) {
            List<AbstractC0661r0> list = this.f2267k;
            if (list != null) {
                C0694w0.m3367e(list);
                this.f2267k = null;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: a */
    public void mo2340a(InterfaceC0575x2 interfaceC0575x2) {
        Objects.requireNonNull(this.f2262f);
        this.f2262f.mo2340a(interfaceC0575x2);
    }

    @Override // androidx.camera.camera2.internal.C0506j3.b
    /* renamed from: b */
    public Executor mo2341b() {
        return this.f2260d;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2
    /* renamed from: c */
    public InterfaceC0575x2.a mo2342c() {
        return this;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2
    public void close() {
        C0984h.m4834l(this.f2263g, "Need to call openCaptureSession before using this API.");
        this.f2258b.m2160i(this);
        this.f2263g.m2240c().close();
        mo2341b().execute(new Runnable() { // from class: androidx.camera.camera2.internal.b3
            @Override // java.lang.Runnable
            public final void run() {
                C0476d3.this.m2326D();
            }
        });
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2
    /* renamed from: d */
    public void mo2343d() {
        C0984h.m4834l(this.f2263g, "Need to call openCaptureSession before using this API.");
        this.f2263g.m2240c().stopRepeating();
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2
    /* renamed from: e */
    public void mo2344e() {
        m2339I();
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2
    /* renamed from: f */
    public void mo2345f() {
        C0984h.m4834l(this.f2263g, "Need to call openCaptureSession before using this API.");
        this.f2263g.m2240c().abortCaptures();
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2
    /* renamed from: g */
    public CameraDevice mo2346g() {
        C0984h.m4833k(this.f2263g);
        return this.f2263g.m2240c().getDevice();
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2
    /* renamed from: h */
    public int mo2347h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        C0984h.m4834l(this.f2263g, "Need to call openCaptureSession before using this API.");
        return this.f2263g.m2239b(captureRequest, mo2341b(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.C0506j3.b
    /* renamed from: i */
    public C10574w mo2348i(int i10, List<C10557f> list, InterfaceC0575x2.a aVar) {
        this.f2262f = aVar;
        return new C10574w(i10, list, mo2341b(), new b());
    }

    @Override // androidx.camera.camera2.internal.C0506j3.b
    /* renamed from: j */
    public InterfaceFutureC5920f<List<Surface>> mo2349j(final List<AbstractC0661r0> list, long j10) {
        synchronized (this.f2257a) {
            if (this.f2269m) {
                return C0009f.m20f(new CancellationException("Opener is disabled"));
            }
            C0007d m13e = C0007d.m9a(C0694w0.m3373k(list, false, j10, mo2341b(), this.f2261e)).m13e(new InterfaceC0004a() { // from class: androidx.camera.camera2.internal.y2
                @Override // p002a0.InterfaceC0004a
                public final InterfaceFutureC5920f apply(Object obj) {
                    InterfaceFutureC5920f m2330H;
                    m2330H = C0476d3.this.m2330H(list, (List) obj);
                    return m2330H;
                }
            }, mo2341b());
            this.f2266j = m13e;
            return C0009f.m24j(m13e);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2
    /* renamed from: k */
    public int mo2350k(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        C0984h.m4834l(this.f2263g, "Need to call openCaptureSession before using this API.");
        return this.f2263g.m2238a(list, mo2341b(), captureCallback);
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2
    /* renamed from: l */
    public C0436i mo2351l() {
        C0984h.m4833k(this.f2263g);
        return this.f2263g;
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2
    /* renamed from: m */
    public InterfaceFutureC5920f<Void> mo2352m() {
        return C0009f.m22h(null);
    }

    @Override // androidx.camera.camera2.internal.C0506j3.b
    /* renamed from: n */
    public InterfaceFutureC5920f<Void> mo2353n(CameraDevice cameraDevice, final C10574w c10574w, final List<AbstractC0661r0> list) {
        synchronized (this.f2257a) {
            if (this.f2269m) {
                return C0009f.m20f(new CancellationException("Opener is disabled"));
            }
            this.f2258b.m2163l(this);
            final C0429e0 m2219b = C0429e0.m2219b(cameraDevice, this.f2259c);
            InterfaceFutureC5920f<Void> m3752a = C0742c.m3752a(new C0742c.c() { // from class: androidx.camera.camera2.internal.z2
                @Override // androidx.concurrent.futures.C0742c.c
                /* renamed from: a */
                public final Object mo14a(C0742c.a aVar) {
                    Object m2329G;
                    m2329G = C0476d3.this.m2329G(list, m2219b, c10574w, aVar);
                    return m2329G;
                }
            });
            this.f2264h = m3752a;
            C0009f.m16b(m3752a, new a(), C12747a.m42280a());
            return C0009f.m24j(this.f2264h);
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: o */
    public void mo2354o(InterfaceC0575x2 interfaceC0575x2) {
        Objects.requireNonNull(this.f2262f);
        this.f2262f.mo2354o(interfaceC0575x2);
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: p */
    public void mo2355p(final InterfaceC0575x2 interfaceC0575x2) {
        InterfaceFutureC5920f<Void> interfaceFutureC5920f;
        synchronized (this.f2257a) {
            if (this.f2268l) {
                interfaceFutureC5920f = null;
            } else {
                this.f2268l = true;
                C0984h.m4834l(this.f2264h, "Need to call openCaptureSession before using this API.");
                interfaceFutureC5920f = this.f2264h;
            }
        }
        mo2344e();
        if (interfaceFutureC5920f != null) {
            interfaceFutureC5920f.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.a3
                @Override // java.lang.Runnable
                public final void run() {
                    C0476d3.this.m2327E(interfaceC0575x2);
                }
            }, C12747a.m42280a());
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: q */
    public void mo2356q(InterfaceC0575x2 interfaceC0575x2) {
        Objects.requireNonNull(this.f2262f);
        mo2344e();
        this.f2258b.m2161j(this);
        this.f2262f.mo2356q(interfaceC0575x2);
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: r */
    public void mo2357r(InterfaceC0575x2 interfaceC0575x2) {
        Objects.requireNonNull(this.f2262f);
        this.f2258b.m2162k(this);
        this.f2262f.mo2357r(interfaceC0575x2);
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: s */
    public void mo2358s(InterfaceC0575x2 interfaceC0575x2) {
        Objects.requireNonNull(this.f2262f);
        this.f2262f.mo2358s(interfaceC0575x2);
    }

    @Override // androidx.camera.camera2.internal.C0506j3.b
    public boolean stop() {
        boolean z10;
        try {
            synchronized (this.f2257a) {
                if (!this.f2269m) {
                    InterfaceFutureC5920f<List<Surface>> interfaceFutureC5920f = this.f2266j;
                    r1 = interfaceFutureC5920f != null ? interfaceFutureC5920f : null;
                    this.f2269m = true;
                }
                z10 = !m2338C();
            }
            return z10;
        } finally {
            if (r1 != null) {
                r1.cancel(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: t */
    public void mo2359t(final InterfaceC0575x2 interfaceC0575x2) {
        InterfaceFutureC5920f<Void> interfaceFutureC5920f;
        synchronized (this.f2257a) {
            if (this.f2270n) {
                interfaceFutureC5920f = null;
            } else {
                this.f2270n = true;
                C0984h.m4834l(this.f2264h, "Need to call openCaptureSession before using this API.");
                interfaceFutureC5920f = this.f2264h;
            }
        }
        if (interfaceFutureC5920f != null) {
            interfaceFutureC5920f.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.c3
                @Override // java.lang.Runnable
                public final void run() {
                    C0476d3.this.m2328F(interfaceC0575x2);
                }
            }, C12747a.m42280a());
        }
    }

    @Override // androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: u */
    public void mo2360u(InterfaceC0575x2 interfaceC0575x2, Surface surface) {
        Objects.requireNonNull(this.f2262f);
        this.f2262f.mo2360u(interfaceC0575x2, surface);
    }
}
