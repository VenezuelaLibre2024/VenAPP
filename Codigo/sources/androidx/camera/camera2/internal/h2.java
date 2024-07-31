package androidx.camera.camera2.internal;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.camera.camera2.internal.u;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.y;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import q.a;
import w.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h2 {

    /* renamed from: v, reason: collision with root package name */
    private static final MeteringRectangle[] f2007v = new MeteringRectangle[0];

    /* renamed from: a, reason: collision with root package name */
    private final u f2008a;

    /* renamed from: b, reason: collision with root package name */
    final Executor f2009b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f2010c;

    /* renamed from: f, reason: collision with root package name */
    private final t.m f2013f;

    /* renamed from: i, reason: collision with root package name */
    private ScheduledFuture<?> f2016i;

    /* renamed from: j, reason: collision with root package name */
    private ScheduledFuture<?> f2017j;

    /* renamed from: q, reason: collision with root package name */
    private MeteringRectangle[] f2024q;

    /* renamed from: r, reason: collision with root package name */
    private MeteringRectangle[] f2025r;

    /* renamed from: s, reason: collision with root package name */
    private MeteringRectangle[] f2026s;

    /* renamed from: t, reason: collision with root package name */
    c.a<Object> f2027t;

    /* renamed from: u, reason: collision with root package name */
    c.a<Void> f2028u;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f2011d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile Rational f2012e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2014g = false;

    /* renamed from: h, reason: collision with root package name */
    Integer f2015h = 0;

    /* renamed from: k, reason: collision with root package name */
    long f2018k = 0;

    /* renamed from: l, reason: collision with root package name */
    boolean f2019l = false;

    /* renamed from: m, reason: collision with root package name */
    boolean f2020m = false;

    /* renamed from: n, reason: collision with root package name */
    private int f2021n = 1;

    /* renamed from: o, reason: collision with root package name */
    private u.c f2022o = null;

    /* renamed from: p, reason: collision with root package name */
    private u.c f2023p = null;

    /* loaded from: classes.dex */
    class a extends androidx.camera.core.impl.k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f2029a;

        a(c.a aVar) {
            this.f2029a = aVar;
        }

        @Override // androidx.camera.core.impl.k
        public void a() {
            c.a aVar = this.f2029a;
            if (aVar != null) {
                aVar.f(new j.a("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.k
        public void b(androidx.camera.core.impl.s sVar) {
            c.a aVar = this.f2029a;
            if (aVar != null) {
                aVar.c(sVar);
            }
        }

        @Override // androidx.camera.core.impl.k
        public void c(androidx.camera.core.impl.m mVar) {
            c.a aVar = this.f2029a;
            if (aVar != null) {
                aVar.f(new y.b(mVar));
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends androidx.camera.core.impl.k {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c.a f2031a;

        b(c.a aVar) {
            this.f2031a = aVar;
        }

        @Override // androidx.camera.core.impl.k
        public void a() {
            c.a aVar = this.f2031a;
            if (aVar != null) {
                aVar.f(new j.a("Camera is closed"));
            }
        }

        @Override // androidx.camera.core.impl.k
        public void b(androidx.camera.core.impl.s sVar) {
            c.a aVar = this.f2031a;
            if (aVar != null) {
                aVar.c(null);
            }
        }

        @Override // androidx.camera.core.impl.k
        public void c(androidx.camera.core.impl.m mVar) {
            c.a aVar = this.f2031a;
            if (aVar != null) {
                aVar.f(new y.b(mVar));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h2(u uVar, ScheduledExecutorService scheduledExecutorService, Executor executor, androidx.camera.core.impl.t1 t1Var) {
        MeteringRectangle[] meteringRectangleArr = f2007v;
        this.f2024q = meteringRectangleArr;
        this.f2025r = meteringRectangleArr;
        this.f2026s = meteringRectangleArr;
        this.f2027t = null;
        this.f2028u = null;
        this.f2008a = uVar;
        this.f2009b = executor;
        this.f2010c = scheduledExecutorService;
        this.f2013f = new t.m(t1Var);
    }

    private void f() {
        ScheduledFuture<?> scheduledFuture = this.f2017j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f2017j = null;
        }
    }

    private void g() {
        c.a<Void> aVar = this.f2028u;
        if (aVar != null) {
            aVar.c(null);
            this.f2028u = null;
        }
    }

    private void h() {
        ScheduledFuture<?> scheduledFuture = this.f2016i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f2016i = null;
        }
    }

    private void i(String str) {
        this.f2008a.W(this.f2022o);
        c.a<Object> aVar = this.f2027t;
        if (aVar != null) {
            aVar.f(new j.a(str));
            this.f2027t = null;
        }
    }

    private void j(String str) {
        this.f2008a.W(this.f2023p);
        c.a<Void> aVar = this.f2028u;
        if (aVar != null) {
            aVar.f(new j.a(str));
            this.f2028u = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean l(int i10, long j10, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i10 || !u.L(totalCaptureResult, j10)) {
            return false;
        }
        g();
        return true;
    }

    private boolean p() {
        return this.f2024q.length > 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(a.C0388a c0388a) {
        c0388a.e(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f2008a.C(this.f2014g ? 1 : k())));
        MeteringRectangle[] meteringRectangleArr = this.f2024q;
        if (meteringRectangleArr.length != 0) {
            c0388a.e(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f2025r;
        if (meteringRectangleArr2.length != 0) {
            c0388a.e(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f2026s;
        if (meteringRectangleArr3.length != 0) {
            c0388a.e(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(boolean z10, boolean z11) {
        if (this.f2011d) {
            l0.a aVar = new l0.a();
            aVar.s(true);
            aVar.r(this.f2021n);
            a.C0388a c0388a = new a.C0388a();
            if (z10) {
                c0388a.e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z11) {
                c0388a.e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(c0388a.c());
            this.f2008a.c0(Collections.singletonList(aVar.h()));
        }
    }

    void d(c.a<Void> aVar) {
        j("Cancelled by another cancelFocusAndMetering()");
        i("Cancelled by cancelFocusAndMetering()");
        this.f2028u = aVar;
        h();
        f();
        if (p()) {
            c(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f2007v;
        this.f2024q = meteringRectangleArr;
        this.f2025r = meteringRectangleArr;
        this.f2026s = meteringRectangleArr;
        this.f2014g = false;
        final long f02 = this.f2008a.f0();
        if (this.f2028u != null) {
            final int C = this.f2008a.C(k());
            u.c cVar = new u.c() { // from class: androidx.camera.camera2.internal.g2
                @Override // androidx.camera.camera2.internal.u.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    boolean l10;
                    l10 = h2.this.l(C, f02, totalCaptureResult);
                    return l10;
                }
            };
            this.f2023p = cVar;
            this.f2008a.t(cVar);
        }
    }

    void e() {
        d(null);
    }

    int k() {
        return this.f2021n != 3 ? 4 : 3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m(boolean z10) {
        if (z10 == this.f2011d) {
            return;
        }
        this.f2011d = z10;
        if (this.f2011d) {
            return;
        }
        e();
    }

    public void n(Rational rational) {
        this.f2012e = rational;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(int i10) {
        this.f2021n = i10;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(c.a<Void> aVar) {
        if (!this.f2011d) {
            if (aVar != null) {
                aVar.f(new j.a("Camera is not active."));
                return;
            }
            return;
        }
        l0.a aVar2 = new l0.a();
        aVar2.r(this.f2021n);
        aVar2.s(true);
        a.C0388a c0388a = new a.C0388a();
        c0388a.e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(c0388a.c());
        aVar2.c(new b(aVar));
        this.f2008a.c0(Collections.singletonList(aVar2.h()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(c.a<androidx.camera.core.impl.s> aVar, boolean z10) {
        if (!this.f2011d) {
            if (aVar != null) {
                aVar.f(new j.a("Camera is not active."));
                return;
            }
            return;
        }
        l0.a aVar2 = new l0.a();
        aVar2.r(this.f2021n);
        aVar2.s(true);
        a.C0388a c0388a = new a.C0388a();
        c0388a.e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z10) {
            c0388a.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f2008a.B(1)));
        }
        aVar2.e(c0388a.c());
        aVar2.c(new a(aVar));
        this.f2008a.c0(Collections.singletonList(aVar2.h()));
    }
}
