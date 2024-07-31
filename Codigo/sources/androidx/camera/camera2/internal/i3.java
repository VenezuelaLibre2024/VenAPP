package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import t.h;
import t.y;

/* loaded from: classes.dex */
public class i3 extends d3 {

    /* renamed from: o */
    private final Object f2041o;

    /* renamed from: p */
    private List<androidx.camera.core.impl.r0> f2042p;

    /* renamed from: q */
    com.google.common.util.concurrent.f<Void> f2043q;

    /* renamed from: r */
    private final t.i f2044r;

    /* renamed from: s */
    private final t.y f2045s;

    /* renamed from: t */
    private final t.h f2046t;

    public i3(androidx.camera.core.impl.t1 t1Var, androidx.camera.core.impl.t1 t1Var2, a2 a2Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(a2Var, executor, scheduledExecutorService, handler);
        this.f2041o = new Object();
        this.f2044r = new t.i(t1Var, t1Var2);
        this.f2045s = new t.y(t1Var);
        this.f2046t = new t.h(t1Var2);
    }

    public /* synthetic */ void O() {
        N("Session call super.close()");
        super.close();
    }

    public /* synthetic */ void P(x2 x2Var) {
        super.r(x2Var);
    }

    public /* synthetic */ com.google.common.util.concurrent.f Q(CameraDevice cameraDevice, r.w wVar, List list) {
        return super.n(cameraDevice, wVar, list);
    }

    public /* synthetic */ int R(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.h(captureRequest, captureCallback);
    }

    void N(String str) {
        w.o0.a("SyncCaptureSessionImpl", "[" + this + "] " + str);
    }

    @Override // androidx.camera.camera2.internal.d3, androidx.camera.camera2.internal.x2
    public void close() {
        N("Session call close()");
        this.f2045s.f();
        this.f2045s.c().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.f3
            public /* synthetic */ f3() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                i3.this.O();
            }
        }, b());
    }

    @Override // androidx.camera.camera2.internal.d3, androidx.camera.camera2.internal.x2
    public int h(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f2045s.h(captureRequest, captureCallback, new y.c() { // from class: androidx.camera.camera2.internal.e3
            public /* synthetic */ e3() {
            }

            @Override // t.y.c
            public final int a(CaptureRequest captureRequest2, CameraCaptureSession.CaptureCallback captureCallback2) {
                int R;
                R = i3.this.R(captureRequest2, captureCallback2);
                return R;
            }
        });
    }

    @Override // androidx.camera.camera2.internal.d3, androidx.camera.camera2.internal.j3.b
    public com.google.common.util.concurrent.f<List<Surface>> j(List<androidx.camera.core.impl.r0> list, long j10) {
        com.google.common.util.concurrent.f<List<Surface>> j11;
        synchronized (this.f2041o) {
            this.f2042p = list;
            j11 = super.j(list, j10);
        }
        return j11;
    }

    @Override // androidx.camera.camera2.internal.d3, androidx.camera.camera2.internal.x2
    public com.google.common.util.concurrent.f<Void> m() {
        return this.f2045s.c();
    }

    @Override // androidx.camera.camera2.internal.d3, androidx.camera.camera2.internal.j3.b
    public com.google.common.util.concurrent.f<Void> n(CameraDevice cameraDevice, r.w wVar, List<androidx.camera.core.impl.r0> list) {
        com.google.common.util.concurrent.f<Void> j10;
        synchronized (this.f2041o) {
            com.google.common.util.concurrent.f<Void> g10 = this.f2045s.g(cameraDevice, wVar, list, this.f1955b.e(), new y.b() { // from class: androidx.camera.camera2.internal.g3
                public /* synthetic */ g3() {
                }

                @Override // t.y.b
                public final com.google.common.util.concurrent.f a(CameraDevice cameraDevice2, r.w wVar2, List list2) {
                    com.google.common.util.concurrent.f Q;
                    Q = i3.this.Q(cameraDevice2, wVar2, list2);
                    return Q;
                }
            });
            this.f2043q = g10;
            j10 = a0.f.j(g10);
        }
        return j10;
    }

    @Override // androidx.camera.camera2.internal.d3, androidx.camera.camera2.internal.x2.a
    public void p(x2 x2Var) {
        synchronized (this.f2041o) {
            this.f2044r.a(this.f2042p);
        }
        N("onClosed()");
        super.p(x2Var);
    }

    @Override // androidx.camera.camera2.internal.d3, androidx.camera.camera2.internal.x2.a
    public void r(x2 x2Var) {
        N("Session onConfigured()");
        this.f2046t.c(x2Var, this.f1955b.f(), this.f1955b.d(), new h.a() { // from class: androidx.camera.camera2.internal.h3
            public /* synthetic */ h3() {
            }

            @Override // t.h.a
            public final void a(x2 x2Var2) {
                i3.this.P(x2Var2);
            }
        });
    }

    @Override // androidx.camera.camera2.internal.d3, androidx.camera.camera2.internal.j3.b
    public boolean stop() {
        boolean stop;
        synchronized (this.f2041o) {
            if (C()) {
                this.f2044r.a(this.f2042p);
            } else {
                com.google.common.util.concurrent.f<Void> fVar = this.f2043q;
                if (fVar != null) {
                    fVar.cancel(true);
                }
            }
            stop = super.stop();
        }
        return stop;
    }
}
