package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.camera.camera2.internal.u;
import androidx.concurrent.futures.c;
import androidx.lifecycle.LiveData;
import java.util.concurrent.Executor;
import q.a;
import w.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    private final u f2284a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f2285b;

    /* renamed from: c, reason: collision with root package name */
    private final v3 f2286c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.lifecycle.r<w.k1> f2287d;

    /* renamed from: e, reason: collision with root package name */
    final b f2288e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2289f = false;

    /* renamed from: g, reason: collision with root package name */
    private u.c f2290g = new a();

    /* loaded from: classes.dex */
    class a implements u.c {
        a() {
        }

        @Override // androidx.camera.camera2.internal.u.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            u3.this.f2288e.a(totalCaptureResult);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        void b(float f10, c.a<Void> aVar);

        void c(a.C0388a c0388a);

        float d();

        void e();

        float f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u3(u uVar, androidx.camera.camera2.internal.compat.d0 d0Var, Executor executor) {
        this.f2284a = uVar;
        this.f2285b = executor;
        b f10 = f(d0Var);
        this.f2288e = f10;
        v3 v3Var = new v3(f10.f(), f10.d());
        this.f2286c = v3Var;
        v3Var.h(1.0f);
        this.f2287d = new androidx.lifecycle.r<>(b0.f.f(v3Var));
        uVar.t(this.f2290g);
    }

    private static b f(androidx.camera.camera2.internal.compat.d0 d0Var) {
        return j(d0Var) ? new c(d0Var) : new b2(d0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static w.k1 g(androidx.camera.camera2.internal.compat.d0 d0Var) {
        b f10 = f(d0Var);
        v3 v3Var = new v3(f10.f(), f10.d());
        v3Var.h(1.0f);
        return b0.f.f(v3Var);
    }

    private static Range<Float> h(androidx.camera.camera2.internal.compat.d0 d0Var) {
        CameraCharacteristics.Key key;
        try {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            return (Range) d0Var.a(key);
        } catch (AssertionError e10) {
            w.o0.l("ZoomControl", "AssertionError, fail to get camera characteristic.", e10);
            return null;
        }
    }

    static boolean j(androidx.camera.camera2.internal.compat.d0 d0Var) {
        return Build.VERSION.SDK_INT >= 30 && h(d0Var) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object l(final w.k1 k1Var, final c.a aVar) {
        this.f2285b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.s3
            @Override // java.lang.Runnable
            public final void run() {
                u3.this.k(aVar, k1Var);
            }
        });
        return "setLinearZoom";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object n(final w.k1 k1Var, final c.a aVar) {
        this.f2285b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.t3
            @Override // java.lang.Runnable
            public final void run() {
                u3.this.m(aVar, k1Var);
            }
        });
        return "setZoomRatio";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m(c.a<Void> aVar, w.k1 k1Var) {
        w.k1 f10;
        if (this.f2289f) {
            s(k1Var);
            this.f2288e.b(k1Var.d(), aVar);
            this.f2284a.f0();
        } else {
            synchronized (this.f2286c) {
                this.f2286c.h(1.0f);
                f10 = b0.f.f(this.f2286c);
            }
            s(f10);
            aVar.f(new j.a("Camera is not active."));
        }
    }

    private void s(w.k1 k1Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f2287d.setValue(k1Var);
        } else {
            this.f2287d.postValue(k1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(a.C0388a c0388a) {
        this.f2288e.c(c0388a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LiveData<w.k1> i() {
        return this.f2287d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(boolean z10) {
        w.k1 f10;
        if (this.f2289f == z10) {
            return;
        }
        this.f2289f = z10;
        if (z10) {
            return;
        }
        synchronized (this.f2286c) {
            this.f2286c.h(1.0f);
            f10 = b0.f.f(this.f2286c);
        }
        s(f10);
        this.f2288e.e();
        this.f2284a.f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.f<Void> p(float f10) {
        final w.k1 f11;
        synchronized (this.f2286c) {
            try {
                this.f2286c.g(f10);
                f11 = b0.f.f(this.f2286c);
            } catch (IllegalArgumentException e10) {
                return a0.f.f(e10);
            }
        }
        s(f11);
        return androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: androidx.camera.camera2.internal.r3
            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object l10;
                l10 = u3.this.l(f11, aVar);
                return l10;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.common.util.concurrent.f<Void> q(float f10) {
        final w.k1 f11;
        synchronized (this.f2286c) {
            try {
                this.f2286c.h(f10);
                f11 = b0.f.f(this.f2286c);
            } catch (IllegalArgumentException e10) {
                return a0.f.f(e10);
            }
        }
        s(f11);
        return androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: androidx.camera.camera2.internal.q3
            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object n10;
                n10 = u3.this.n(f11, aVar);
                return n10;
            }
        });
    }
}
