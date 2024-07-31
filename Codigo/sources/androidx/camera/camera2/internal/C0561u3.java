package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.camera.camera2.internal.C0557u;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.concurrent.futures.C0742c;
import androidx.lifecycle.C1320r;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.concurrent.Executor;
import p002a0.C0009f;
import p018b0.AbstractC1598f;
import p298q.C10214a;
import p407w.C12029o0;
import p407w.InterfaceC12016j;
import p407w.InterfaceC12021k1;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.u3 */
/* loaded from: classes.dex */
public final class C0561u3 {

    /* renamed from: a */
    private final C0557u f2605a;

    /* renamed from: b */
    private final Executor f2606b;

    /* renamed from: c */
    private final C0566v3 f2607c;

    /* renamed from: d */
    private final C1320r<InterfaceC12021k1> f2608d;

    /* renamed from: e */
    final b f2609e;

    /* renamed from: f */
    private boolean f2610f = false;

    /* renamed from: g */
    private C0557u.c f2611g = new a();

    /* renamed from: androidx.camera.camera2.internal.u3$a */
    /* loaded from: classes.dex */
    class a implements C0557u.c {
        a() {
        }

        @Override // androidx.camera.camera2.internal.C0557u.c
        /* renamed from: a */
        public boolean mo2390a(TotalCaptureResult totalCaptureResult) {
            C0561u3.this.f2609e.mo2186a(totalCaptureResult);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.u3$b */
    /* loaded from: classes.dex */
    public interface b {
        /* renamed from: a */
        void mo2186a(TotalCaptureResult totalCaptureResult);

        /* renamed from: b */
        void mo2187b(float f10, C0742c.a<Void> aVar);

        /* renamed from: c */
        void mo2188c(C10214a.a aVar);

        /* renamed from: d */
        float mo2189d();

        /* renamed from: e */
        void mo2190e();

        /* renamed from: f */
        float mo2191f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0561u3(C0557u c0557u, C0427d0 c0427d0, Executor executor) {
        this.f2605a = c0557u;
        this.f2606b = executor;
        b m2773f = m2773f(c0427d0);
        this.f2609e = m2773f;
        C0566v3 c0566v3 = new C0566v3(m2773f.mo2191f(), m2773f.mo2189d());
        this.f2607c = c0566v3;
        c0566v3.m2796h(1.0f);
        this.f2608d = new C1320r<>(AbstractC1598f.m8899f(c0566v3));
        c0557u.m2736t(this.f2611g);
    }

    /* renamed from: f */
    private static b m2773f(C0427d0 c0427d0) {
        return m2776j(c0427d0) ? new C0413c(c0427d0) : new C0410b2(c0427d0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static InterfaceC12021k1 m2774g(C0427d0 c0427d0) {
        b m2773f = m2773f(c0427d0);
        C0566v3 c0566v3 = new C0566v3(m2773f.mo2191f(), m2773f.mo2189d());
        c0566v3.m2796h(1.0f);
        return AbstractC1598f.m8899f(c0566v3);
    }

    /* renamed from: h */
    private static Range<Float> m2775h(C0427d0 c0427d0) {
        CameraCharacteristics.Key key;
        try {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            return (Range) c0427d0.m2215a(key);
        } catch (AssertionError e10) {
            C12029o0.m38649l("ZoomControl", "AssertionError, fail to get camera characteristic.", e10);
            return null;
        }
    }

    /* renamed from: j */
    static boolean m2776j(C0427d0 c0427d0) {
        return Build.VERSION.SDK_INT >= 30 && m2775h(c0427d0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ Object m2778l(final InterfaceC12021k1 interfaceC12021k1, final C0742c.a aVar) {
        this.f2606b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.s3
            @Override // java.lang.Runnable
            public final void run() {
                C0561u3.this.m2777k(aVar, interfaceC12021k1);
            }
        });
        return "setLinearZoom";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n */
    public /* synthetic */ Object m2780n(final InterfaceC12021k1 interfaceC12021k1, final C0742c.a aVar) {
        this.f2606b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.t3
            @Override // java.lang.Runnable
            public final void run() {
                C0561u3.this.m2779m(aVar, interfaceC12021k1);
            }
        });
        return "setZoomRatio";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m2779m(C0742c.a<Void> aVar, InterfaceC12021k1 interfaceC12021k1) {
        InterfaceC12021k1 m8899f;
        if (this.f2610f) {
            m2782s(interfaceC12021k1);
            this.f2609e.mo2187b(interfaceC12021k1.mo2794d(), aVar);
            this.f2605a.m2731f0();
        } else {
            synchronized (this.f2607c) {
                this.f2607c.m2796h(1.0f);
                m8899f = AbstractC1598f.m8899f(this.f2607c);
            }
            m2782s(m8899f);
            aVar.m3758f(new InterfaceC12016j.a("Camera is not active."));
        }
    }

    /* renamed from: s */
    private void m2782s(InterfaceC12021k1 interfaceC12021k1) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f2608d.setValue(interfaceC12021k1);
        } else {
            this.f2608d.postValue(interfaceC12021k1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m2783e(C10214a.a aVar) {
        this.f2609e.mo2188c(aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public LiveData<InterfaceC12021k1> m2784i() {
        return this.f2608d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m2785o(boolean z10) {
        InterfaceC12021k1 m8899f;
        if (this.f2610f == z10) {
            return;
        }
        this.f2610f = z10;
        if (z10) {
            return;
        }
        synchronized (this.f2607c) {
            this.f2607c.m2796h(1.0f);
            m8899f = AbstractC1598f.m8899f(this.f2607c);
        }
        m2782s(m8899f);
        this.f2609e.mo2190e();
        this.f2605a.m2731f0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public InterfaceFutureC5920f<Void> m2786p(float f10) {
        final InterfaceC12021k1 m8899f;
        synchronized (this.f2607c) {
            try {
                this.f2607c.m2795g(f10);
                m8899f = AbstractC1598f.m8899f(this.f2607c);
            } catch (IllegalArgumentException e10) {
                return C0009f.m20f(e10);
            }
        }
        m2782s(m8899f);
        return C0742c.m3752a(new C0742c.c() { // from class: androidx.camera.camera2.internal.r3
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m2778l;
                m2778l = C0561u3.this.m2778l(m8899f, aVar);
                return m2778l;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public InterfaceFutureC5920f<Void> m2787q(float f10) {
        final InterfaceC12021k1 m8899f;
        synchronized (this.f2607c) {
            try {
                this.f2607c.m2796h(f10);
                m8899f = AbstractC1598f.m8899f(this.f2607c);
            } catch (IllegalArgumentException e10) {
                return C0009f.m20f(e10);
            }
        }
        m2782s(m8899f);
        return C0742c.m3752a(new C0742c.c() { // from class: androidx.camera.camera2.internal.q3
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m2780n;
                m2780n = C0561u3.this.m2780n(m8899f, aVar);
                return m2780n;
            }
        });
    }
}
