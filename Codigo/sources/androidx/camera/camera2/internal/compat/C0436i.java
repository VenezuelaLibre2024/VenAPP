package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.C0436i;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.compat.i */
/* loaded from: classes.dex */
public final class C0436i {

    /* renamed from: a */
    private final a f2169a;

    /* renamed from: androidx.camera.camera2.internal.compat.i$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        CameraCaptureSession mo2202a();

        /* renamed from: b */
        int mo2203b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        /* renamed from: c */
        int mo2204c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.compat.i$b */
    /* loaded from: classes.dex */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        final CameraCaptureSession.CaptureCallback f2170a;

        /* renamed from: b */
        private final Executor f2171b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f2171b = executor;
            this.f2170a = captureCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m2248h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            C0424c.m2210a(this.f2170a, cameraCaptureSession, captureRequest, surface, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m2249i(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f2170a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m2250j(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f2170a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m2251k(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f2170a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m2252l(CameraCaptureSession cameraCaptureSession, int i10) {
            this.f2170a.onCaptureSequenceAborted(cameraCaptureSession, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m2253m(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            this.f2170a.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m2254n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            this.f2170a.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final Surface surface, final long j10) {
            this.f2171b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.k
                @Override // java.lang.Runnable
                public final void run() {
                    C0436i.b.this.m2248h(cameraCaptureSession, captureRequest, surface, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f2171b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.n
                @Override // java.lang.Runnable
                public final void run() {
                    C0436i.b.this.m2249i(cameraCaptureSession, captureRequest, totalCaptureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureFailure captureFailure) {
            this.f2171b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.p
                @Override // java.lang.Runnable
                public final void run() {
                    C0436i.b.this.m2250j(cameraCaptureSession, captureRequest, captureFailure);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final CaptureResult captureResult) {
            this.f2171b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.m
                @Override // java.lang.Runnable
                public final void run() {
                    C0436i.b.this.m2251k(cameraCaptureSession, captureRequest, captureResult);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(final CameraCaptureSession cameraCaptureSession, final int i10) {
            this.f2171b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.j
                @Override // java.lang.Runnable
                public final void run() {
                    C0436i.b.this.m2252l(cameraCaptureSession, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(final CameraCaptureSession cameraCaptureSession, final int i10, final long j10) {
            this.f2171b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.l
                @Override // java.lang.Runnable
                public final void run() {
                    C0436i.b.this.m2253m(cameraCaptureSession, i10, j10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(final CameraCaptureSession cameraCaptureSession, final CaptureRequest captureRequest, final long j10, final long j11) {
            this.f2171b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.o
                @Override // java.lang.Runnable
                public final void run() {
                    C0436i.b.this.m2254n(cameraCaptureSession, captureRequest, j10, j11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.compat.i$c */
    /* loaded from: classes.dex */
    public static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        final CameraCaptureSession.StateCallback f2172a;

        /* renamed from: b */
        private final Executor f2173b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f2173b = executor;
            this.f2172a = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m2262h(CameraCaptureSession cameraCaptureSession) {
            this.f2172a.onActive(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m2263i(CameraCaptureSession cameraCaptureSession) {
            C0428e.m2218b(this.f2172a, cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ void m2264j(CameraCaptureSession cameraCaptureSession) {
            this.f2172a.onClosed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public /* synthetic */ void m2265k(CameraCaptureSession cameraCaptureSession) {
            this.f2172a.onConfigureFailed(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ void m2266l(CameraCaptureSession cameraCaptureSession) {
            this.f2172a.onConfigured(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ void m2267m(CameraCaptureSession cameraCaptureSession) {
            this.f2172a.onReady(cameraCaptureSession);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ void m2268n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            C0421b.m2206a(this.f2172a, cameraCaptureSession, surface);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(final CameraCaptureSession cameraCaptureSession) {
            this.f2173b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.t
                @Override // java.lang.Runnable
                public final void run() {
                    C0436i.c.this.m2262h(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(final CameraCaptureSession cameraCaptureSession) {
            this.f2173b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.s
                @Override // java.lang.Runnable
                public final void run() {
                    C0436i.c.this.m2263i(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(final CameraCaptureSession cameraCaptureSession) {
            this.f2173b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.r
                @Override // java.lang.Runnable
                public final void run() {
                    C0436i.c.this.m2264j(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(final CameraCaptureSession cameraCaptureSession) {
            this.f2173b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.u
                @Override // java.lang.Runnable
                public final void run() {
                    C0436i.c.this.m2265k(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(final CameraCaptureSession cameraCaptureSession) {
            this.f2173b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.q
                @Override // java.lang.Runnable
                public final void run() {
                    C0436i.c.this.m2266l(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(final CameraCaptureSession cameraCaptureSession) {
            this.f2173b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.v
                @Override // java.lang.Runnable
                public final void run() {
                    C0436i.c.this.m2267m(cameraCaptureSession);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(final CameraCaptureSession cameraCaptureSession, final Surface surface) {
            this.f2173b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.w
                @Override // java.lang.Runnable
                public final void run() {
                    C0436i.c.this.m2268n(cameraCaptureSession, surface);
                }
            });
        }
    }

    private C0436i(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2169a = new C0470z(cameraCaptureSession);
        } else {
            this.f2169a = C0419a0.m2201d(cameraCaptureSession, handler);
        }
    }

    /* renamed from: d */
    public static C0436i m2237d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new C0436i(cameraCaptureSession, handler);
    }

    /* renamed from: a */
    public int m2238a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f2169a.mo2203b(list, executor, captureCallback);
    }

    /* renamed from: b */
    public int m2239b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f2169a.mo2204c(captureRequest, executor, captureCallback);
    }

    /* renamed from: c */
    public CameraCaptureSession m2240c() {
        return this.f2169a.mo2202a();
    }
}
