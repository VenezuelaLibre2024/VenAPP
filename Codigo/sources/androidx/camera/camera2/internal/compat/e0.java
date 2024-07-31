package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.e0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a */
    private final a f1853a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a(r.w wVar);
    }

    /* loaded from: classes.dex */
    public static final class b extends CameraDevice.StateCallback {

        /* renamed from: a */
        final CameraDevice.StateCallback f1854a;

        /* renamed from: b */
        private final Executor f1855b;

        public b(Executor executor, CameraDevice.StateCallback stateCallback) {
            this.f1855b = executor;
            this.f1854a = stateCallback;
        }

        public /* synthetic */ void e(CameraDevice cameraDevice) {
            this.f1854a.onClosed(cameraDevice);
        }

        public /* synthetic */ void f(CameraDevice cameraDevice) {
            this.f1854a.onDisconnected(cameraDevice);
        }

        public /* synthetic */ void g(CameraDevice cameraDevice, int i10) {
            this.f1854a.onError(cameraDevice, i10);
        }

        public /* synthetic */ void h(CameraDevice cameraDevice) {
            this.f1854a.onOpened(cameraDevice);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            this.f1855b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.f0

                /* renamed from: b */
                public final /* synthetic */ CameraDevice f1857b;

                public /* synthetic */ f0(CameraDevice cameraDevice2) {
                    r2 = cameraDevice2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    e0.b.this.e(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            this.f1855b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.g0

                /* renamed from: b */
                public final /* synthetic */ CameraDevice f1859b;

                public /* synthetic */ g0(CameraDevice cameraDevice2) {
                    r2 = cameraDevice2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    e0.b.this.f(r2);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            this.f1855b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.i0

                /* renamed from: b */
                public final /* synthetic */ CameraDevice f1872b;

                /* renamed from: c */
                public final /* synthetic */ int f1873c;

                public /* synthetic */ i0(CameraDevice cameraDevice2, int i102) {
                    r2 = cameraDevice2;
                    r3 = i102;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    e0.b.this.g(r2, r3);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            this.f1855b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.h0

                /* renamed from: b */
                public final /* synthetic */ CameraDevice f1865b;

                public /* synthetic */ h0(CameraDevice cameraDevice2) {
                    r2 = cameraDevice2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    e0.b.this.h(r2);
                }
            });
        }
    }

    private e0(CameraDevice cameraDevice, Handler handler) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f1853a = new m0(cameraDevice);
        } else {
            this.f1853a = k0.e(cameraDevice, handler);
        }
    }

    public static e0 b(CameraDevice cameraDevice, Handler handler) {
        return new e0(cameraDevice, handler);
    }

    public void a(r.w wVar) {
        this.f1853a.a(wVar);
    }
}
