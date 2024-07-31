package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.AbstractC0661r0;
import androidx.camera.core.impl.C0668t1;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p002a0.C0009f;
import p320r.C10574w;
import p354t.C10943h;
import p354t.C10944i;
import p354t.C10960y;
import p407w.C12029o0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.i3 */
/* loaded from: classes.dex */
public class C0501i3 extends C0476d3 {

    /* renamed from: o */
    private final Object f2344o;

    /* renamed from: p */
    private List<AbstractC0661r0> f2345p;

    /* renamed from: q */
    InterfaceFutureC5920f<Void> f2346q;

    /* renamed from: r */
    private final C10944i f2347r;

    /* renamed from: s */
    private final C10960y f2348s;

    /* renamed from: t */
    private final C10943h f2349t;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0501i3(C0668t1 c0668t1, C0668t1 c0668t12, C0404a2 c0404a2, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(c0404a2, executor, scheduledExecutorService, handler);
        this.f2344o = new Object();
        this.f2347r = new C10944i(c0668t1, c0668t12);
        this.f2348s = new C10960y(c0668t1);
        this.f2349t = new C10943h(c0668t12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m2431O() {
        m2435N("Session call super.close()");
        super.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ void m2432P(InterfaceC0575x2 interfaceC0575x2) {
        super.mo2357r(interfaceC0575x2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ InterfaceFutureC5920f m2433Q(CameraDevice cameraDevice, C10574w c10574w, List list) {
        return super.mo2353n(cameraDevice, c10574w, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ int m2434R(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.mo2347h(captureRequest, captureCallback);
    }

    /* renamed from: N */
    void m2435N(String str) {
        C12029o0.m38638a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // androidx.camera.camera2.internal.C0476d3, androidx.camera.camera2.internal.InterfaceC0575x2
    public void close() {
        m2435N("Session call close()");
        this.f2348s.m33445f();
        this.f2348s.m33444c().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.f3
            @Override // java.lang.Runnable
            public final void run() {
                C0501i3.this.m2431O();
            }
        }, mo2341b());
    }

    @Override // androidx.camera.camera2.internal.C0476d3, androidx.camera.camera2.internal.InterfaceC0575x2
    /* renamed from: h */
    public int mo2347h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f2348s.m33447h(captureRequest, captureCallback, new C10960y.c() { // from class: androidx.camera.camera2.internal.e3
            @Override // p354t.C10960y.c
            /* renamed from: a */
            public final int mo2367a(CaptureRequest captureRequest2, CameraCaptureSession.CaptureCallback captureCallback2) {
                int m2434R;
                m2434R = C0501i3.this.m2434R(captureRequest2, captureCallback2);
                return m2434R;
            }
        });
    }

    @Override // androidx.camera.camera2.internal.C0476d3, androidx.camera.camera2.internal.C0506j3.b
    /* renamed from: j */
    public InterfaceFutureC5920f<List<Surface>> mo2349j(List<AbstractC0661r0> list, long j10) {
        InterfaceFutureC5920f<List<Surface>> mo2349j;
        synchronized (this.f2344o) {
            this.f2345p = list;
            mo2349j = super.mo2349j(list, j10);
        }
        return mo2349j;
    }

    @Override // androidx.camera.camera2.internal.C0476d3, androidx.camera.camera2.internal.InterfaceC0575x2
    /* renamed from: m */
    public InterfaceFutureC5920f<Void> mo2352m() {
        return this.f2348s.m33444c();
    }

    @Override // androidx.camera.camera2.internal.C0476d3, androidx.camera.camera2.internal.C0506j3.b
    /* renamed from: n */
    public InterfaceFutureC5920f<Void> mo2353n(CameraDevice cameraDevice, C10574w c10574w, List<AbstractC0661r0> list) {
        InterfaceFutureC5920f<Void> m24j;
        synchronized (this.f2344o) {
            InterfaceFutureC5920f<Void> m33446g = this.f2348s.m33446g(cameraDevice, c10574w, list, this.f2258b.m2156e(), new C10960y.b() { // from class: androidx.camera.camera2.internal.g3
                @Override // p354t.C10960y.b
                /* renamed from: a */
                public final InterfaceFutureC5920f mo2391a(CameraDevice cameraDevice2, C10574w c10574w2, List list2) {
                    InterfaceFutureC5920f m2433Q;
                    m2433Q = C0501i3.this.m2433Q(cameraDevice2, c10574w2, list2);
                    return m2433Q;
                }
            });
            this.f2346q = m33446g;
            m24j = C0009f.m24j(m33446g);
        }
        return m24j;
    }

    @Override // androidx.camera.camera2.internal.C0476d3, androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: p */
    public void mo2355p(InterfaceC0575x2 interfaceC0575x2) {
        synchronized (this.f2344o) {
            this.f2347r.m33420a(this.f2345p);
        }
        m2435N("onClosed()");
        super.mo2355p(interfaceC0575x2);
    }

    @Override // androidx.camera.camera2.internal.C0476d3, androidx.camera.camera2.internal.InterfaceC0575x2.a
    /* renamed from: r */
    public void mo2357r(InterfaceC0575x2 interfaceC0575x2) {
        m2435N("Session onConfigured()");
        this.f2349t.m33418c(interfaceC0575x2, this.f2258b.m2157f(), this.f2258b.m2155d(), new C10943h.a() { // from class: androidx.camera.camera2.internal.h3
            @Override // p354t.C10943h.a
            /* renamed from: a */
            public final void mo2413a(InterfaceC0575x2 interfaceC0575x22) {
                C0501i3.this.m2432P(interfaceC0575x22);
            }
        });
    }

    @Override // androidx.camera.camera2.internal.C0476d3, androidx.camera.camera2.internal.C0506j3.b
    public boolean stop() {
        boolean stop;
        synchronized (this.f2344o) {
            if (m2338C()) {
                this.f2347r.m33420a(this.f2345p);
            } else {
                InterfaceFutureC5920f<Void> interfaceFutureC5920f = this.f2346q;
                if (interfaceFutureC5920f != null) {
                    interfaceFutureC5920f.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }
}
