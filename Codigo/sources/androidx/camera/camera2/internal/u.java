package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.camera2.internal.u;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.y;
import androidx.camera.core.impl.y1;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import q.a;
import v.j;
import w.j;

/* loaded from: classes.dex */
public class u implements androidx.camera.core.impl.y {

    /* renamed from: b */
    final b f2252b;

    /* renamed from: c */
    final Executor f2253c;

    /* renamed from: d */
    private final Object f2254d = new Object();

    /* renamed from: e */
    private final androidx.camera.camera2.internal.compat.d0 f2255e;

    /* renamed from: f */
    private final y.c f2256f;

    /* renamed from: g */
    private final y1.b f2257g;

    /* renamed from: h */
    private final h2 f2258h;

    /* renamed from: i */
    private final u3 f2259i;

    /* renamed from: j */
    private final p3 f2260j;

    /* renamed from: k */
    private final e2 f2261k;

    /* renamed from: l */
    w3 f2262l;

    /* renamed from: m */
    private final v.g f2263m;

    /* renamed from: n */
    private final s0 f2264n;

    /* renamed from: o */
    private int f2265o;

    /* renamed from: p */
    private volatile boolean f2266p;

    /* renamed from: q */
    private volatile int f2267q;

    /* renamed from: r */
    private final t.a f2268r;

    /* renamed from: s */
    private final t.b f2269s;

    /* renamed from: t */
    private final AtomicLong f2270t;

    /* renamed from: u */
    private volatile com.google.common.util.concurrent.f<Void> f2271u;

    /* renamed from: v */
    private int f2272v;

    /* renamed from: w */
    private long f2273w;

    /* renamed from: x */
    private final a f2274x;

    /* loaded from: classes.dex */
    public static final class a extends androidx.camera.core.impl.k {

        /* renamed from: a */
        Set<androidx.camera.core.impl.k> f2275a = new HashSet();

        /* renamed from: b */
        Map<androidx.camera.core.impl.k, Executor> f2276b = new ArrayMap();

        a() {
        }

        @Override // androidx.camera.core.impl.k
        public void a() {
            for (androidx.camera.core.impl.k kVar : this.f2275a) {
                try {
                    this.f2276b.get(kVar).execute(new Runnable() { // from class: androidx.camera.camera2.internal.s
                        public /* synthetic */ s() {
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.impl.k.this.a();
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    w.o0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        @Override // androidx.camera.core.impl.k
        public void b(androidx.camera.core.impl.s sVar) {
            for (androidx.camera.core.impl.k kVar : this.f2275a) {
                try {
                    this.f2276b.get(kVar).execute(new Runnable() { // from class: androidx.camera.camera2.internal.t

                        /* renamed from: b */
                        public final /* synthetic */ androidx.camera.core.impl.s f2222b;

                        public /* synthetic */ t(androidx.camera.core.impl.s sVar2) {
                            r2 = sVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.impl.k.this.b(r2);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    w.o0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        @Override // androidx.camera.core.impl.k
        public void c(androidx.camera.core.impl.m mVar) {
            for (androidx.camera.core.impl.k kVar : this.f2275a) {
                try {
                    this.f2276b.get(kVar).execute(new Runnable() { // from class: androidx.camera.camera2.internal.r

                        /* renamed from: b */
                        public final /* synthetic */ androidx.camera.core.impl.m f2170b;

                        public /* synthetic */ r(androidx.camera.core.impl.m mVar2) {
                            r2 = mVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.camera.core.impl.k.this.c(r2);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    w.o0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }

        void g(Executor executor, androidx.camera.core.impl.k kVar) {
            this.f2275a.add(kVar);
            this.f2276b.put(kVar, executor);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        final Set<c> f2277a = new HashSet();

        /* renamed from: b */
        private final Executor f2278b;

        b(Executor executor) {
            this.f2278b = executor;
        }

        public /* synthetic */ void c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (c cVar : this.f2277a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.f2277a.removeAll(hashSet);
        }

        void b(c cVar) {
            this.f2277a.add(cVar);
        }

        void d(c cVar) {
            this.f2277a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f2278b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.v

                /* renamed from: b */
                public final /* synthetic */ TotalCaptureResult f2293b;

                public /* synthetic */ v(TotalCaptureResult totalCaptureResult2) {
                    r2 = totalCaptureResult2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    u.b.this.c(r2);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public u(androidx.camera.camera2.internal.compat.d0 d0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, y.c cVar, androidx.camera.core.impl.t1 t1Var) {
        y1.b bVar = new y1.b();
        this.f2257g = bVar;
        this.f2265o = 0;
        this.f2266p = false;
        this.f2267q = 2;
        this.f2270t = new AtomicLong(0L);
        this.f2271u = a0.f.h(null);
        this.f2272v = 1;
        this.f2273w = 0L;
        a aVar = new a();
        this.f2274x = aVar;
        this.f2255e = d0Var;
        this.f2256f = cVar;
        this.f2253c = executor;
        b bVar2 = new b(executor);
        this.f2252b = bVar2;
        bVar.t(this.f2272v);
        bVar.j(s1.d(bVar2));
        bVar.j(aVar);
        this.f2261k = new e2(this, d0Var, executor);
        this.f2258h = new h2(this, scheduledExecutorService, executor, t1Var);
        this.f2259i = new u3(this, d0Var, executor);
        this.f2260j = new p3(this, d0Var, executor);
        this.f2262l = new a4(d0Var);
        this.f2268r = new t.a(t1Var);
        this.f2269s = new t.b(t1Var);
        this.f2263m = new v.g(this, executor);
        this.f2264n = new s0(this, d0Var, t1Var, executor);
        executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.m
            public /* synthetic */ m() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                u.this.Q();
            }
        });
    }

    private int D(int i10) {
        int[] iArr = (int[]) this.f2255e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return K(i10, iArr) ? i10 : K(1, iArr) ? 1 : 0;
    }

    private boolean J() {
        return F() > 0;
    }

    private boolean K(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean L(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof androidx.camera.core.impl.f2) && (l10 = (Long) ((androidx.camera.core.impl.f2) tag).d("CameraControlSessionUpdateId")) != null && l10.longValue() >= j10;
    }

    public static /* synthetic */ void N() {
    }

    public /* synthetic */ void O(Executor executor, androidx.camera.core.impl.k kVar) {
        this.f2274x.g(executor, kVar);
    }

    public static /* synthetic */ void P() {
    }

    public /* synthetic */ void Q() {
        t(this.f2263m.l());
    }

    public /* synthetic */ com.google.common.util.concurrent.f R(List list, int i10, int i11, int i12, Void r52) {
        return this.f2264n.e(list, i10, i11, i12);
    }

    public /* synthetic */ void S(c.a aVar) {
        a0.f.k(g0(f0()), aVar);
    }

    public /* synthetic */ Object T(c.a aVar) {
        this.f2253c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.o

            /* renamed from: b */
            public final /* synthetic */ c.a f2141b;

            public /* synthetic */ o(c.a aVar2) {
                r2 = aVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                u.this.S(r2);
            }
        });
        return "updateSessionConfigAsync";
    }

    public static /* synthetic */ boolean U(long j10, c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!L(totalCaptureResult, j10)) {
            return false;
        }
        aVar.c(null);
        return true;
    }

    public /* synthetic */ Object V(long j10, c.a aVar) {
        t(new c() { // from class: androidx.camera.camera2.internal.h

            /* renamed from: a */
            public final /* synthetic */ long f1999a;

            /* renamed from: b */
            public final /* synthetic */ c.a f2000b;

            public /* synthetic */ h(long j102, c.a aVar2) {
                r1 = j102;
                r3 = aVar2;
            }

            @Override // androidx.camera.camera2.internal.u.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                boolean U;
                U = u.U(r1, r3, totalCaptureResult);
                return U;
            }
        });
        return "waitForSessionUpdateId:" + j102;
    }

    private com.google.common.util.concurrent.f<Void> g0(long j10) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: androidx.camera.camera2.internal.q

            /* renamed from: b */
            public final /* synthetic */ long f2164b;

            public /* synthetic */ q(long j102) {
                r2 = j102;
            }

            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object V;
                V = u.this.V(r2, aVar);
                return V;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0070 A[LOOP:0: B:6:0x006a->B:8:0x0070, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.camera.core.impl.n0 A() {
        /*
            r7 = this;
            q.a$a r0 = new q.a$a
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.e(r1, r3)
            androidx.camera.camera2.internal.h2 r1 = r7.f2258h
            r1.b(r0)
            t.a r1 = r7.f2268r
            r1.a(r0)
            androidx.camera.camera2.internal.u3 r1 = r7.f2259i
            r1.e(r0)
            boolean r1 = r7.f2266p
            r3 = 2
            if (r1 == 0) goto L2d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.e(r1, r3)
            goto L33
        L2d:
            int r1 = r7.f2267q
            if (r1 == 0) goto L37
            if (r1 == r2) goto L35
        L33:
            r1 = r2
            goto L3d
        L35:
            r1 = 3
            goto L3d
        L37:
            t.b r1 = r7.f2269s
            int r1 = r1.a(r3)
        L3d:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r1 = r7.B(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.e(r3, r1)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            int r2 = r7.D(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.e(r1, r2)
            androidx.camera.camera2.internal.e2 r1 = r7.f2261k
            r1.c(r0)
            v.g r1 = r7.f2263m
            q.a r1 = r1.k()
            java.util.Set r2 = r1.e()
            java.util.Iterator r2 = r2.iterator()
        L6a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.n0$a r3 = (androidx.camera.core.impl.n0.a) r3
            androidx.camera.core.impl.l1 r4 = r0.a()
            androidx.camera.core.impl.n0$c r5 = androidx.camera.core.impl.n0.c.ALWAYS_OVERRIDE
            java.lang.Object r6 = r1.a(r3)
            r4.p(r3, r5, r6)
            goto L6a
        L84:
            q.a r0 = r0.c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.u.A():androidx.camera.core.impl.n0");
    }

    public int B(int i10) {
        int[] iArr = (int[]) this.f2255e.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return K(i10, iArr) ? i10 : K(1, iArr) ? 1 : 0;
    }

    public int C(int i10) {
        int[] iArr = (int[]) this.f2255e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (K(i10, iArr)) {
            return i10;
        }
        if (K(4, iArr)) {
            return 4;
        }
        return K(1, iArr) ? 1 : 0;
    }

    public p3 E() {
        return this.f2260j;
    }

    int F() {
        int i10;
        synchronized (this.f2254d) {
            i10 = this.f2265o;
        }
        return i10;
    }

    public u3 G() {
        return this.f2259i;
    }

    public w3 H() {
        return this.f2262l;
    }

    public void I() {
        synchronized (this.f2254d) {
            this.f2265o++;
        }
    }

    public boolean M() {
        return this.f2266p;
    }

    public void W(c cVar) {
        this.f2252b.d(cVar);
    }

    public void X() {
        a0(1);
    }

    public void Y(boolean z10) {
        this.f2258h.m(z10);
        this.f2259i.o(z10);
        this.f2260j.j(z10);
        this.f2261k.b(z10);
        this.f2263m.s(z10);
    }

    public void Z(Rational rational) {
        this.f2258h.n(rational);
    }

    @Override // androidx.camera.core.impl.y
    public void a(y1.b bVar) {
        this.f2262l.a(bVar);
    }

    public void a0(int i10) {
        this.f2272v = i10;
        this.f2258h.o(i10);
        this.f2264n.d(this.f2272v);
    }

    @Override // w.j
    public com.google.common.util.concurrent.f<Void> b(float f10) {
        return !J() ? a0.f.f(new j.a("Camera is not active.")) : a0.f.j(this.f2259i.p(f10));
    }

    public void b0(boolean z10) {
        this.f2262l.d(z10);
    }

    @Override // androidx.camera.core.impl.y
    public com.google.common.util.concurrent.f<List<Void>> c(List<androidx.camera.core.impl.l0> list, int i10, int i11) {
        if (J()) {
            return a0.d.a(a0.f.j(this.f2271u)).e(new a0.a() { // from class: androidx.camera.camera2.internal.l

                /* renamed from: b */
                public final /* synthetic */ List f2101b;

                /* renamed from: c */
                public final /* synthetic */ int f2102c;

                /* renamed from: d */
                public final /* synthetic */ int f2103d;

                /* renamed from: e */
                public final /* synthetic */ int f2104e;

                public /* synthetic */ l(List list2, int i102, int i12, int i112) {
                    r2 = list2;
                    r3 = i102;
                    r4 = i12;
                    r5 = i112;
                }

                @Override // a0.a
                public final com.google.common.util.concurrent.f apply(Object obj) {
                    com.google.common.util.concurrent.f R;
                    R = u.this.R(r2, r3, r4, r5, (Void) obj);
                    return R;
                }
            }, this.f2253c);
        }
        w.o0.k("Camera2CameraControlImp", "Camera is not active.");
        return a0.f.f(new j.a("Camera is not active."));
    }

    public void c0(List<androidx.camera.core.impl.l0> list) {
        this.f2256f.b(list);
    }

    @Override // w.j
    public com.google.common.util.concurrent.f<Void> d(float f10) {
        return !J() ? a0.f.f(new j.a("Camera is not active.")) : a0.f.j(this.f2259i.q(f10));
    }

    public void d0() {
        this.f2253c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.p
            public /* synthetic */ p() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                u.this.f0();
            }
        });
    }

    @Override // androidx.camera.core.impl.y
    public Rect e() {
        return (Rect) androidx.core.util.h.k((Rect) this.f2255e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    com.google.common.util.concurrent.f<Void> e0() {
        return a0.f.j(androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: androidx.camera.camera2.internal.i
            public /* synthetic */ i() {
            }

            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object T;
                T = u.this.T(aVar);
                return T;
            }
        }));
    }

    @Override // androidx.camera.core.impl.y
    public void f(int i10) {
        if (!J()) {
            w.o0.k("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f2267q = i10;
        w3 w3Var = this.f2262l;
        boolean z10 = true;
        if (this.f2267q != 1 && this.f2267q != 0) {
            z10 = false;
        }
        w3Var.c(z10);
        this.f2271u = e0();
    }

    public long f0() {
        this.f2273w = this.f2270t.getAndIncrement();
        this.f2256f.a();
        return this.f2273w;
    }

    @Override // w.j
    public com.google.common.util.concurrent.f<Void> g(boolean z10) {
        return !J() ? a0.f.f(new j.a("Camera is not active.")) : a0.f.j(this.f2260j.d(z10));
    }

    @Override // androidx.camera.core.impl.y
    public androidx.camera.core.impl.n0 h() {
        return this.f2263m.k();
    }

    @Override // androidx.camera.core.impl.y
    public void i(androidx.camera.core.impl.n0 n0Var) {
        this.f2263m.g(j.a.e(n0Var).d()).addListener(new Runnable() { // from class: androidx.camera.camera2.internal.n
            @Override // java.lang.Runnable
            public final void run() {
                u.N();
            }
        }, z.a.a());
    }

    @Override // androidx.camera.core.impl.y
    public void j() {
        this.f2263m.i().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.j
            @Override // java.lang.Runnable
            public final void run() {
                u.P();
            }
        }, z.a.a());
    }

    public void t(c cVar) {
        this.f2252b.b(cVar);
    }

    public void u(Executor executor, androidx.camera.core.impl.k kVar) {
        this.f2253c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.k

            /* renamed from: b */
            public final /* synthetic */ Executor f2094b;

            /* renamed from: c */
            public final /* synthetic */ androidx.camera.core.impl.k f2095c;

            public /* synthetic */ k(Executor executor2, androidx.camera.core.impl.k kVar2) {
                r2 = executor2;
                r3 = kVar2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                u.this.O(r2, r3);
            }
        });
    }

    public void v() {
        synchronized (this.f2254d) {
            int i10 = this.f2265o;
            if (i10 == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            this.f2265o = i10 - 1;
        }
    }

    public void w(boolean z10) {
        this.f2266p = z10;
        if (!z10) {
            l0.a aVar = new l0.a();
            aVar.r(this.f2272v);
            aVar.s(true);
            a.C0388a c0388a = new a.C0388a();
            c0388a.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(B(1)));
            c0388a.e(CaptureRequest.FLASH_MODE, 0);
            aVar.e(c0388a.c());
            c0(Collections.singletonList(aVar.h()));
        }
        f0();
    }

    public int x() {
        return this.f2267q;
    }

    public h2 y() {
        return this.f2258h;
    }

    public androidx.camera.core.impl.y1 z() {
        this.f2257g.t(this.f2272v);
        this.f2257g.r(A());
        Object Z = this.f2263m.k().Z(null);
        if (Z != null && (Z instanceof Integer)) {
            this.f2257g.n("Camera2CameraControl", Z);
        }
        this.f2257g.n("CameraControlSessionUpdateId", Long.valueOf(this.f2273w));
        return this.f2257g.o();
    }
}
