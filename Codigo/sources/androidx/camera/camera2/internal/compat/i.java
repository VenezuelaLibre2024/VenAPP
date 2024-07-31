package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.i;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private final a f1866a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        CameraCaptureSession a();

        int b(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);

        int c(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback);
    }

    /* loaded from: classes.dex */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        final CameraCaptureSession.CaptureCallback f1867a;

        /* renamed from: b */
        private final Executor f1868b;

        public b(Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
            this.f1868b = executor;
            this.f1867a = captureCallback;
        }

        public /* synthetic */ void h(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            androidx.camera.camera2.internal.compat.c.a(this.f1867a, cameraCaptureSession, captureRequest, surface, j10);
        }

        public /* synthetic */ void i(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f1867a.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public /* synthetic */ void j(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f1867a.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
        }

        public /* synthetic */ void k(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f1867a.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        public /* synthetic */ void l(CameraCaptureSession cameraCaptureSession, int i10) {
            this.f1867a.onCaptureSequenceAborted(cameraCaptureSession, i10);
        }

        public /* synthetic */ void m(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            this.f1867a.onCaptureSequenceCompleted(cameraCaptureSession, i10, j10);
        }

        public /* synthetic */ void n(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            this.f1867a.onCaptureStarted(cameraCaptureSession, captureRequest, j10, j11);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j10) {
            this.f1868b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.k

                /* renamed from: b */
                public final /* synthetic */ CameraCaptureSession f1878b;

                /* renamed from: c */
                public final /* synthetic */ CaptureRequest f1879c;

                /* renamed from: d */
                public final /* synthetic */ Surface f1880d;

                /* renamed from: e */
                public final /* synthetic */ long f1881e;

                public /* synthetic */ k(CameraCaptureSession cameraCaptureSession2, CaptureRequest captureRequest2, Surface surface2, long j102) {
                    r2 = cameraCaptureSession2;
                    r3 = captureRequest2;
                    r4 = surface2;
                    r5 = j102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.b.this.h(r2, r3, r4, r5);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f1868b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.n

                /* renamed from: b */
                public final /* synthetic */ CameraCaptureSession f1891b;

                /* renamed from: c */
                public final /* synthetic */ CaptureRequest f1892c;

                /* renamed from: d */
                public final /* synthetic */ TotalCaptureResult f1893d;

                public /* synthetic */ n(CameraCaptureSession cameraCaptureSession2, CaptureRequest captureRequest2, TotalCaptureResult totalCaptureResult2) {
                    r2 = cameraCaptureSession2;
                    r3 = captureRequest2;
                    r4 = totalCaptureResult2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.b.this.i(r2, r3, r4);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            this.f1868b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.p

                /* renamed from: b */
                public final /* synthetic */ CameraCaptureSession f1904b;

                /* renamed from: c */
                public final /* synthetic */ CaptureRequest f1905c;

                /* renamed from: d */
                public final /* synthetic */ CaptureFailure f1906d;

                public /* synthetic */ p(CameraCaptureSession cameraCaptureSession2, CaptureRequest captureRequest2, CaptureFailure captureFailure2) {
                    r2 = cameraCaptureSession2;
                    r3 = captureRequest2;
                    r4 = captureFailure2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.b.this.j(r2, r3, r4);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            this.f1868b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.m

                /* renamed from: b */
                public final /* synthetic */ CameraCaptureSession f1887b;

                /* renamed from: c */
                public final /* synthetic */ CaptureRequest f1888c;

                /* renamed from: d */
                public final /* synthetic */ CaptureResult f1889d;

                public /* synthetic */ m(CameraCaptureSession cameraCaptureSession2, CaptureRequest captureRequest2, CaptureResult captureResult2) {
                    r2 = cameraCaptureSession2;
                    r3 = captureRequest2;
                    r4 = captureResult2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.b.this.k(r2, r3, r4);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            this.f1868b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.j

                /* renamed from: b */
                public final /* synthetic */ CameraCaptureSession f1875b;

                /* renamed from: c */
                public final /* synthetic */ int f1876c;

                public /* synthetic */ j(CameraCaptureSession cameraCaptureSession2, int i102) {
                    r2 = cameraCaptureSession2;
                    r3 = i102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.b.this.l(r2, r3);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            this.f1868b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.l

                /* renamed from: b */
                public final /* synthetic */ CameraCaptureSession f1883b;

                /* renamed from: c */
                public final /* synthetic */ int f1884c;

                /* renamed from: d */
                public final /* synthetic */ long f1885d;

                public /* synthetic */ l(CameraCaptureSession cameraCaptureSession2, int i102, long j102) {
                    r2 = cameraCaptureSession2;
                    r3 = i102;
                    r4 = j102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.b.this.m(r2, r3, r4);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            this.f1868b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.o

                /* renamed from: b */
                public final /* synthetic */ CameraCaptureSession f1898b;

                /* renamed from: c */
                public final /* synthetic */ CaptureRequest f1899c;

                /* renamed from: d */
                public final /* synthetic */ long f1900d;

                /* renamed from: e */
                public final /* synthetic */ long f1901e;

                public /* synthetic */ o(CameraCaptureSession cameraCaptureSession2, CaptureRequest captureRequest2, long j102, long j112) {
                    r2 = cameraCaptureSession2;
                    r3 = captureRequest2;
                    r4 = j102;
                    r6 = j112;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.b.this.n(r2, r3, r4, r6);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends CameraCaptureSession.StateCallback {

        /* renamed from: a */
        final CameraCaptureSession.StateCallback f1869a;

        /* renamed from: b */
        private final Executor f1870b;

        public c(Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f1870b = executor;
            this.f1869a = stateCallback;
        }

        public /* synthetic */ void h(CameraCaptureSession cameraCaptureSession) {
            this.f1869a.onActive(cameraCaptureSession);
        }

        public /* synthetic */ void i(CameraCaptureSession cameraCaptureSession) {
            e.b(this.f1869a, cameraCaptureSession);
        }

        public /* synthetic */ void j(CameraCaptureSession cameraCaptureSession) {
            this.f1869a.onClosed(cameraCaptureSession);
        }

        public /* synthetic */ void k(CameraCaptureSession cameraCaptureSession) {
            this.f1869a.onConfigureFailed(cameraCaptureSession);
        }

        public /* synthetic */ void l(CameraCaptureSession cameraCaptureSession) {
            this.f1869a.onConfigured(cameraCaptureSession);
        }

        public /* synthetic */ void m(CameraCaptureSession cameraCaptureSession) {
            this.f1869a.onReady(cameraCaptureSession);
        }

        public /* synthetic */ void n(CameraCaptureSession cameraCaptureSession, Surface surface) {
            androidx.camera.camera2.internal.compat.b.a(this.f1869a, cameraCaptureSession, surface);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onActive(CameraCaptureSession cameraCaptureSession) {
            this.f1870b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.t

                /* renamed from: b */
                public final /* synthetic */ CameraCaptureSession f1924b;

                public /* synthetic */ t(CameraCaptureSession cameraCaptureSession2) {
                    r2 = cameraCaptureSession2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.c.this.h(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
            this.f1870b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.s

                /* renamed from: b */
                public final /* synthetic */ CameraCaptureSession f1922b;

                public /* synthetic */ s(CameraCaptureSession cameraCaptureSession2) {
                    r2 = cameraCaptureSession2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.c.this.i(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            this.f1870b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.r

                /* renamed from: b */
                public final /* synthetic */ CameraCaptureSession f1914b;

                public /* synthetic */ r(CameraCaptureSession cameraCaptureSession2) {
                    r2 = cameraCaptureSession2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.c.this.j(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            this.f1870b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.u

                /* renamed from: b */
                public final /* synthetic */ CameraCaptureSession f1926b;

                public /* synthetic */ u(CameraCaptureSession cameraCaptureSession2) {
                    r2 = cameraCaptureSession2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.c.this.k(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            this.f1870b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.q

                /* renamed from: b */
                public final /* synthetic */ CameraCaptureSession f1910b;

                public /* synthetic */ q(CameraCaptureSession cameraCaptureSession2) {
                    r2 = cameraCaptureSession2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.c.this.l(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onReady(CameraCaptureSession cameraCaptureSession) {
            this.f1870b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.v

                /* renamed from: b */
                public final /* synthetic */ CameraCaptureSession f1928b;

                public /* synthetic */ v(CameraCaptureSession cameraCaptureSession2) {
                    r2 = cameraCaptureSession2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.c.this.m(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
            this.f1870b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.w

                /* renamed from: b */
                public final /* synthetic */ CameraCaptureSession f1930b;

                /* renamed from: c */
                public final /* synthetic */ Surface f1931c;

                public /* synthetic */ w(CameraCaptureSession cameraCaptureSession2, Surface surface2) {
                    r2 = cameraCaptureSession2;
                    r3 = surface2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    i.c.this.n(r2, r3);
                }
            });
        }
    }

    private i(CameraCaptureSession cameraCaptureSession, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1866a = new z(cameraCaptureSession);
        } else {
            this.f1866a = a0.d(cameraCaptureSession, handler);
        }
    }

    public static i d(CameraCaptureSession cameraCaptureSession, Handler handler) {
        return new i(cameraCaptureSession, handler);
    }

    public int a(List<CaptureRequest> list, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1866a.b(list, executor, captureCallback);
    }

    public int b(CaptureRequest captureRequest, Executor executor, CameraCaptureSession.CaptureCallback captureCallback) {
        return this.f1866a.c(captureRequest, executor, captureCallback);
    }

    public CameraCaptureSession c() {
        return this.f1866a.a();
    }
}
