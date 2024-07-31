package androidx.camera.camera2.internal.compat;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import androidx.camera.camera2.internal.compat.C0455r0;
import androidx.camera.core.impl.utils.C0685n;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.camera2.internal.compat.r0 */
/* loaded from: classes.dex */
public final class C0455r0 {

    /* renamed from: a */
    private final b f2218a;

    /* renamed from: b */
    private final Map<String, C0427d0> f2219b = new ArrayMap(4);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.compat.r0$a */
    /* loaded from: classes.dex */
    public static final class a extends CameraManager.AvailabilityCallback {

        /* renamed from: a */
        private final Executor f2220a;

        /* renamed from: b */
        final CameraManager.AvailabilityCallback f2221b;

        /* renamed from: c */
        private final Object f2222c = new Object();

        /* renamed from: d */
        private boolean f2223d = false;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
            this.f2220a = executor;
            this.f2221b = availabilityCallback;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m2285d() {
            C0432g.m2231a(this.f2221b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public /* synthetic */ void m2286e(String str) {
            this.f2221b.onCameraAvailable(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m2287f(String str) {
            this.f2221b.onCameraUnavailable(str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g */
        public void m2288g() {
            synchronized (this.f2222c) {
                this.f2223d = true;
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAccessPrioritiesChanged() {
            synchronized (this.f2222c) {
                if (!this.f2223d) {
                    this.f2220a.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.o0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0455r0.a.this.m2285d();
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(final String str) {
            synchronized (this.f2222c) {
                if (!this.f2223d) {
                    this.f2220a.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.q0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0455r0.a.this.m2286e(str);
                        }
                    });
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(final String str) {
            synchronized (this.f2222c) {
                if (!this.f2223d) {
                    this.f2220a.execute(new Runnable() { // from class: androidx.camera.camera2.internal.compat.p0
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0455r0.a.this.m2287f(str);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.compat.r0$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: g */
        static b m2289g(Context context, Handler handler) {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 30 ? new C0467x0(context) : i10 >= 29 ? new C0463v0(context) : i10 >= 28 ? C0461u0.m2298i(context) : C0469y0.m2305h(context, handler);
        }

        /* renamed from: a */
        void mo2290a(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        /* renamed from: b */
        CameraCharacteristics mo2291b(String str);

        /* renamed from: c */
        Set<Set<String>> mo2292c();

        /* renamed from: d */
        void mo2293d(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        /* renamed from: e */
        String[] mo2294e();

        /* renamed from: f */
        void mo2295f(CameraManager.AvailabilityCallback availabilityCallback);
    }

    private C0455r0(b bVar) {
        this.f2218a = bVar;
    }

    /* renamed from: a */
    public static C0455r0 m2274a(Context context) {
        return m2275b(context, C0685n.m3333a());
    }

    /* renamed from: b */
    public static C0455r0 m2275b(Context context, Handler handler) {
        return new C0455r0(b.m2289g(context, handler));
    }

    /* renamed from: c */
    public C0427d0 m2276c(String str) {
        C0427d0 c0427d0;
        synchronized (this.f2219b) {
            c0427d0 = this.f2219b.get(str);
            if (c0427d0 == null) {
                try {
                    c0427d0 = C0427d0.m2214d(this.f2218a.mo2291b(str), str);
                    this.f2219b.put(str, c0427d0);
                } catch (AssertionError e10) {
                    throw new C0434h(10002, e10.getMessage(), e10);
                }
            }
        }
        return c0427d0;
    }

    /* renamed from: d */
    public String[] m2277d() {
        return this.f2218a.mo2294e();
    }

    /* renamed from: e */
    public Set<Set<String>> m2278e() {
        return this.f2218a.mo2292c();
    }

    /* renamed from: f */
    public void m2279f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f2218a.mo2293d(str, executor, stateCallback);
    }

    /* renamed from: g */
    public void m2280g(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f2218a.mo2290a(executor, availabilityCallback);
    }

    /* renamed from: h */
    public void m2281h(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f2218a.mo2295f(availabilityCallback);
    }
}
