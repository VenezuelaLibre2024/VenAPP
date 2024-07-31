package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.camera.camera2.internal.C0557u;
import androidx.camera.core.impl.AbstractC0637k;
import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.C0645m;
import androidx.camera.core.impl.C0668t1;
import androidx.camera.core.impl.InterfaceC0663s;
import androidx.camera.core.impl.InterfaceC0699y;
import androidx.concurrent.futures.C0742c;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import p298q.C10214a;
import p354t.C10948m;
import p407w.InterfaceC12016j;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.h2 */
/* loaded from: classes.dex */
public class C0495h2 {

    /* renamed from: v */
    private static final MeteringRectangle[] f2310v = new MeteringRectangle[0];

    /* renamed from: a */
    private final C0557u f2311a;

    /* renamed from: b */
    final Executor f2312b;

    /* renamed from: c */
    private final ScheduledExecutorService f2313c;

    /* renamed from: f */
    private final C10948m f2316f;

    /* renamed from: i */
    private ScheduledFuture<?> f2319i;

    /* renamed from: j */
    private ScheduledFuture<?> f2320j;

    /* renamed from: q */
    private MeteringRectangle[] f2327q;

    /* renamed from: r */
    private MeteringRectangle[] f2328r;

    /* renamed from: s */
    private MeteringRectangle[] f2329s;

    /* renamed from: t */
    C0742c.a<Object> f2330t;

    /* renamed from: u */
    C0742c.a<Void> f2331u;

    /* renamed from: d */
    private volatile boolean f2314d = false;

    /* renamed from: e */
    private volatile Rational f2315e = null;

    /* renamed from: g */
    private boolean f2317g = false;

    /* renamed from: h */
    Integer f2318h = 0;

    /* renamed from: k */
    long f2321k = 0;

    /* renamed from: l */
    boolean f2322l = false;

    /* renamed from: m */
    boolean f2323m = false;

    /* renamed from: n */
    private int f2324n = 1;

    /* renamed from: o */
    private C0557u.c f2325o = null;

    /* renamed from: p */
    private C0557u.c f2326p = null;

    /* renamed from: androidx.camera.camera2.internal.h2$a */
    /* loaded from: classes.dex */
    class a extends AbstractC0637k {

        /* renamed from: a */
        final /* synthetic */ C0742c.a f2332a;

        a(C0742c.a aVar) {
            this.f2332a = aVar;
        }

        @Override // androidx.camera.core.impl.AbstractC0637k
        /* renamed from: a */
        public void mo2410a() {
            C0742c.a aVar = this.f2332a;
            if (aVar != null) {
                aVar.m3758f(new InterfaceC12016j.a("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.AbstractC0637k
        /* renamed from: b */
        public void mo2411b(InterfaceC0663s interfaceC0663s) {
            C0742c.a aVar = this.f2332a;
            if (aVar != null) {
                aVar.m3756c(interfaceC0663s);
            }
        }

        @Override // androidx.camera.core.impl.AbstractC0637k
        /* renamed from: c */
        public void mo2412c(C0645m c0645m) {
            C0742c.a aVar = this.f2332a;
            if (aVar != null) {
                aVar.m3758f(new InterfaceC0699y.b(c0645m));
            }
        }
    }

    /* renamed from: androidx.camera.camera2.internal.h2$b */
    /* loaded from: classes.dex */
    class b extends AbstractC0637k {

        /* renamed from: a */
        final /* synthetic */ C0742c.a f2334a;

        b(C0742c.a aVar) {
            this.f2334a = aVar;
        }

        @Override // androidx.camera.core.impl.AbstractC0637k
        /* renamed from: a */
        public void mo2410a() {
            C0742c.a aVar = this.f2334a;
            if (aVar != null) {
                aVar.m3758f(new InterfaceC12016j.a("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.AbstractC0637k
        /* renamed from: b */
        public void mo2411b(InterfaceC0663s interfaceC0663s) {
            C0742c.a aVar = this.f2334a;
            if (aVar != null) {
                aVar.m3756c(null);
            }
        }

        @Override // androidx.camera.core.impl.AbstractC0637k
        /* renamed from: c */
        public void mo2412c(C0645m c0645m) {
            C0742c.a aVar = this.f2334a;
            if (aVar != null) {
                aVar.m3758f(new InterfaceC0699y.b(c0645m));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0495h2(C0557u c0557u, ScheduledExecutorService scheduledExecutorService, Executor executor, C0668t1 c0668t1) {
        MeteringRectangle[] meteringRectangleArr = f2310v;
        this.f2327q = meteringRectangleArr;
        this.f2328r = meteringRectangleArr;
        this.f2329s = meteringRectangleArr;
        this.f2330t = null;
        this.f2331u = null;
        this.f2311a = c0557u;
        this.f2312b = executor;
        this.f2313c = scheduledExecutorService;
        this.f2316f = new C10948m(c0668t1);
    }

    /* renamed from: f */
    private void m2393f() {
        ScheduledFuture<?> scheduledFuture = this.f2320j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f2320j = null;
        }
    }

    /* renamed from: g */
    private void m2394g() {
        C0742c.a<Void> aVar = this.f2331u;
        if (aVar != null) {
            aVar.m3756c(null);
            this.f2331u = null;
        }
    }

    /* renamed from: h */
    private void m2395h() {
        ScheduledFuture<?> scheduledFuture = this.f2319i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f2319i = null;
        }
    }

    /* renamed from: i */
    private void m2396i(String str) {
        this.f2311a.m2716W(this.f2325o);
        C0742c.a<Object> aVar = this.f2330t;
        if (aVar != null) {
            aVar.m3758f(new InterfaceC12016j.a(str));
            this.f2330t = null;
        }
    }

    /* renamed from: j */
    private void m2397j(String str) {
        this.f2311a.m2716W(this.f2326p);
        C0742c.a<Void> aVar = this.f2331u;
        if (aVar != null) {
            aVar.m3758f(new InterfaceC12016j.a(str));
            this.f2331u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ boolean m2398l(int i10, long j10, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i10 || !C0557u.m2687L(totalCaptureResult, j10)) {
            return false;
        }
        m2394g();
        return true;
    }

    /* renamed from: p */
    private boolean m2399p() {
        return this.f2327q.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m2400b(C10214a.a aVar) {
        aVar.m30571e(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f2311a.m2709C(this.f2317g ? 1 : m2404k())));
        MeteringRectangle[] meteringRectangleArr = this.f2327q;
        if (meteringRectangleArr.length != 0) {
            aVar.m30571e(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f2328r;
        if (meteringRectangleArr2.length != 0) {
            aVar.m30571e(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f2329s;
        if (meteringRectangleArr3.length != 0) {
            aVar.m30571e(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m2401c(boolean z10, boolean z11) {
        if (this.f2314d) {
            C0642l0.a aVar = new C0642l0.a();
            aVar.m3176s(true);
            aVar.m3175r(this.f2324n);
            C10214a.a aVar2 = new C10214a.a();
            if (z10) {
                aVar2.m30571e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z11) {
                aVar2.m30571e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.m3164e(aVar2.m30569c());
            this.f2311a.m2725c0(Collections.singletonList(aVar.m3167h()));
        }
    }

    /* renamed from: d */
    void m2402d(C0742c.a<Void> aVar) {
        m2397j("Cancelled by another cancelFocusAndMetering()");
        m2396i("Cancelled by cancelFocusAndMetering()");
        this.f2331u = aVar;
        m2395h();
        m2393f();
        if (m2399p()) {
            m2401c(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f2310v;
        this.f2327q = meteringRectangleArr;
        this.f2328r = meteringRectangleArr;
        this.f2329s = meteringRectangleArr;
        this.f2317g = false;
        final long m2731f0 = this.f2311a.m2731f0();
        if (this.f2331u != null) {
            final int m2709C = this.f2311a.m2709C(m2404k());
            C0557u.c cVar = new C0557u.c() { // from class: androidx.camera.camera2.internal.g2
                @Override // androidx.camera.camera2.internal.C0557u.c
                /* renamed from: a */
                public final boolean mo2390a(TotalCaptureResult totalCaptureResult) {
                    boolean m2398l;
                    m2398l = C0495h2.this.m2398l(m2709C, m2731f0, totalCaptureResult);
                    return m2398l;
                }
            };
            this.f2326p = cVar;
            this.f2311a.m2736t(cVar);
        }
    }

    /* renamed from: e */
    void m2403e() {
        m2402d(null);
    }

    /* renamed from: k */
    int m2404k() {
        return this.f2324n != 3 ? 4 : 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m2405m(boolean z10) {
        if (z10 == this.f2314d) {
            return;
        }
        this.f2314d = z10;
        if (this.f2314d) {
            return;
        }
        m2403e();
    }

    /* renamed from: n */
    public void m2406n(Rational rational) {
        this.f2315e = rational;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m2407o(int i10) {
        this.f2324n = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m2408q(C0742c.a<Void> aVar) {
        if (!this.f2314d) {
            if (aVar != null) {
                aVar.m3758f(new InterfaceC12016j.a("Camera is not active."));
                return;
            }
            return;
        }
        C0642l0.a aVar2 = new C0642l0.a();
        aVar2.m3175r(this.f2324n);
        aVar2.m3176s(true);
        C10214a.a aVar3 = new C10214a.a();
        aVar3.m30571e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.m3164e(aVar3.m30569c());
        aVar2.m3162c(new b(aVar));
        this.f2311a.m2725c0(Collections.singletonList(aVar2.m3167h()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public void m2409r(C0742c.a<InterfaceC0663s> aVar, boolean z10) {
        if (!this.f2314d) {
            if (aVar != null) {
                aVar.m3758f(new InterfaceC12016j.a("Camera is not active."));
                return;
            }
            return;
        }
        C0642l0.a aVar2 = new C0642l0.a();
        aVar2.m3175r(this.f2324n);
        aVar2.m3176s(true);
        C10214a.a aVar3 = new C10214a.a();
        aVar3.m30571e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z10) {
            aVar3.m30571e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f2311a.m2708B(1)));
        }
        aVar2.m3164e(aVar3.m30569c());
        aVar2.m3162c(new a(aVar));
        this.f2311a.m2725c0(Collections.singletonList(aVar2.m3167h()));
    }
}
