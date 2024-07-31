package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.r0;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a */
    private final b f1915a;

    /* renamed from: b */
    private final Map<String, d0> f1916b = new ArrayMap(4);

    /* loaded from: classes.dex */
    public static final class a extends CameraManager.AvailabilityCallback {

        /* renamed from: a */
        private final Executor f1917a;

        /* renamed from: b */
        final CameraManager.AvailabilityCallback f1918b;

        /* renamed from: c */
        private final Object f1919c = new Object();

        /* renamed from: d */
        private boolean f1920d = false;

        public a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f1917a = executor;
            this.f1918b = availabilityCallback;
        }

        public /* synthetic */ void d() {
            g.a(this.f1918b);
        }

        public /* synthetic */ void e(String str) {
            this.f1918b.onCameraAvailable(str);
        }

        public /* synthetic */ void f(String str) {
            this.f1918b.onCameraUnavailable(str);
        }

        public void g() {
            synchronized (this.f1919c) {
                this.f1920d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f1919c) {
                if (!this.f1920d) {
                    this.f1917a.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.o0
                        public /* synthetic */ o0() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            r0.a.this.d();
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            synchronized (this.f1919c) {
                if (!this.f1920d) {
                    this.f1917a.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.q0

                        /* renamed from: b */
                        public final /* synthetic */ String f1912b;

                        public /* synthetic */ q0(String str2) {
                            r2 = str2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            r0.a.this.e(r2);
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            synchronized (this.f1919c) {
                if (!this.f1920d) {
                    this.f1917a.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.p0

                        /* renamed from: b */
                        public final /* synthetic */ String f1908b;

                        public /* synthetic */ p0(String str2) {
                            r2 = str2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            r0.a.this.f(r2);
                        }
                    });
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        static b g(Context context, Handler handler) {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 30 ? new x0(context) : i10 >= 29 ? new v0(context) : i10 >= 28 ? u0.i(context) : y0.h(context, handler);
        }

        void a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics b(String str);

        Set<Set<String>> c();

        void d(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        String[] e();

        void f(CameraManager.AvailabilityCallback availabilityCallback);
    }

    private r0(b bVar) {
        this.f1915a = bVar;
    }

    public static r0 a(Context context) {
        return b(context, androidx.camera.core.impl.utils.n.a());
    }

    public static r0 b(Context context, Handler handler) {
        return new r0(b.g(context, handler));
    }

    public d0 c(String str) {
        d0 d0Var;
        synchronized (this.f1916b) {
            d0Var = this.f1916b.get(str);
            if (d0Var == null) {
                try {
                    d0Var = d0.d(this.f1915a.b(str), str);
                    this.f1916b.put(str, d0Var);
                } catch (AssertionError e10) {
                    throw new h(10002, e10.getMessage(), e10);
                }
            }
        }
        return d0Var;
    }

    public String[] d() {
        return this.f1915a.e();
    }

    public Set<Set<String>> e() {
        return this.f1915a.c();
    }

    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f1915a.d(str, executor, stateCallback);
    }

    public void g(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f1915a.a(executor, availabilityCallback);
    }

    public void h(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f1915a.f(availabilityCallback);
    }
}
