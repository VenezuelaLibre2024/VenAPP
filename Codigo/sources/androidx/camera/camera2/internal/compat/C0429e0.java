package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.C0429e0;
import java.util.concurrent.Executor;
import p320r.C10574w;

/* renamed from: androidx.camera.camera2.internal.compat.e0 */
/* loaded from: classes.dex */
public final class C0429e0 {

    /* renamed from: a */
    private final a f2156a;

    /* renamed from: androidx.camera.camera2.internal.compat.e0$a */
    /* loaded from: classes.dex */
    interface a {
        /* renamed from: a */
        void mo2221a(C10574w c10574w);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.compat.e0$b */
    /* loaded from: classes.dex */
    public static final class b extends CameraDevice.StateCallback {

        /* renamed from: a */
        final CameraDevice.StateCallback f2157a;

        /* renamed from: b */
        private final Executor f2158b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f2158b = executor;
            this.f2157a = stateCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m2226e(CameraDevice cameraDevice) {
            this.f2157a.onClosed(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m2227f(CameraDevice cameraDevice) {
            this.f2157a.onDisconnected(cameraDevice);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m2228g(CameraDevice cameraDevice, int i10) {
            this.f2157a.onError(cameraDevice, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m2229h(CameraDevice cameraDevice) {
            this.f2157a.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(final CameraDevice cameraDevice) {
            this.f2158b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.f0
                @Override // java.lang.Runnable
                public final void run() {
                    C0429e0.b.this.m2226e(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(final CameraDevice cameraDevice) {
            this.f2158b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.g0
                @Override // java.lang.Runnable
                public final void run() {
                    C0429e0.b.this.m2227f(cameraDevice);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(final CameraDevice cameraDevice, final int i10) {
            this.f2158b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.i0
                @Override // java.lang.Runnable
                public final void run() {
                    C0429e0.b.this.m2228g(cameraDevice, i10);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            this.f2158b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.h0
                @Override // java.lang.Runnable
                public final void run() {
                    C0429e0.b.this.m2229h(cameraDevice);
                }
            });
        }
    }

    private C0429e0(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2156a = new C0445m0(cameraDevice);
        } else {
            this.f2156a = C0441k0.m2269e(cameraDevice, handler);
        }
    }

    /* renamed from: b */
    public static C0429e0 m2219b(CameraDevice cameraDevice, Handler handler) {
        return new C0429e0(cameraDevice, handler);
    }

    /* renamed from: a */
    public void m2220a(C10574w c10574w) {
        this.f2156a.mo2221a(c10574w);
    }
}
