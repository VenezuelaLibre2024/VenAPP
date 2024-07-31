package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.camera2.internal.C0557u;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.camera.core.impl.AbstractC0637k;
import androidx.camera.core.impl.C0620f2;
import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.C0645m;
import androidx.camera.core.impl.C0668t1;
import androidx.camera.core.impl.C0701y1;
import androidx.camera.core.impl.InterfaceC0649n0;
import androidx.camera.core.impl.InterfaceC0663s;
import androidx.camera.core.impl.InterfaceC0699y;
import androidx.concurrent.futures.C0742c;
import androidx.core.util.C0984h;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import p002a0.C0007d;
import p002a0.C0009f;
import p002a0.InterfaceC0004a;
import p298q.C10214a;
import p354t.C10936a;
import p354t.C10937b;
import p389v.C11597g;
import p389v.C11600j;
import p407w.C12029o0;
import p407w.InterfaceC12016j;
import p474z.C12747a;

/* renamed from: androidx.camera.camera2.internal.u */
/* loaded from: classes.dex */
public class C0557u implements InterfaceC0699y {

    /* renamed from: b */
    final b f2573b;

    /* renamed from: c */
    final Executor f2574c;

    /* renamed from: d */
    private final Object f2575d = new Object();

    /* renamed from: e */
    private final C0427d0 f2576e;

    /* renamed from: f */
    private final InterfaceC0699y.c f2577f;

    /* renamed from: g */
    private final C0701y1.b f2578g;

    /* renamed from: h */
    private final C0495h2 f2579h;

    /* renamed from: i */
    private final C0561u3 f2580i;

    /* renamed from: j */
    private final C0536p3 f2581j;

    /* renamed from: k */
    private final C0480e2 f2582k;

    /* renamed from: l */
    InterfaceC0571w3 f2583l;

    /* renamed from: m */
    private final C11597g f2584m;

    /* renamed from: n */
    private final C0548s0 f2585n;

    /* renamed from: o */
    private int f2586o;

    /* renamed from: p */
    private volatile boolean f2587p;

    /* renamed from: q */
    private volatile int f2588q;

    /* renamed from: r */
    private final C10936a f2589r;

    /* renamed from: s */
    private final C10937b f2590s;

    /* renamed from: t */
    private final AtomicLong f2591t;

    /* renamed from: u */
    private volatile InterfaceFutureC5920f<Void> f2592u;

    /* renamed from: v */
    private int f2593v;

    /* renamed from: w */
    private long f2594w;

    /* renamed from: x */
    private final a f2595x;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.u$a */
    /* loaded from: classes.dex */
    public static final class a extends AbstractC0637k {

        /* renamed from: a */
        Set<AbstractC0637k> f2596a = new HashSet();

        /* renamed from: b */
        Map<AbstractC0637k, Executor> f2597b = new ArrayMap();

        a() {
        }

        @Override // androidx.camera.core.impl.AbstractC0637k
        /* renamed from: a */
        public void mo2410a() {
            for (final AbstractC0637k abstractC0637k : this.f2596a) {
                try {
                    this.f2597b.get(abstractC0637k).execute(new Runnable() { // from class: androidx.camera.camera2.internal.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC0637k.this.mo2410a();
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C12029o0.m38641d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        @Override // androidx.camera.core.impl.AbstractC0637k
        /* renamed from: b */
        public void mo2411b(final InterfaceC0663s interfaceC0663s) {
            for (final AbstractC0637k abstractC0637k : this.f2596a) {
                try {
                    this.f2597b.get(abstractC0637k).execute(new Runnable() { // from class: androidx.camera.camera2.internal.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC0637k.this.mo2411b(interfaceC0663s);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C12029o0.m38641d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        @Override // androidx.camera.core.impl.AbstractC0637k
        /* renamed from: c */
        public void mo2412c(final C0645m c0645m) {
            for (final AbstractC0637k abstractC0637k : this.f2596a) {
                try {
                    this.f2597b.get(abstractC0637k).execute(new Runnable() { // from class: androidx.camera.camera2.internal.r
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC0637k.this.mo2412c(c0645m);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C12029o0.m38641d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }

        /* renamed from: g */
        void m2749g(Executor executor, AbstractC0637k abstractC0637k) {
            this.f2596a.add(abstractC0637k);
            this.f2597b.put(abstractC0637k, executor);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.u$b */
    /* loaded from: classes.dex */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        final Set<c> f2598a = new HashSet();

        /* renamed from: b */
        private final Executor f2599b;

        b(Executor executor) {
            this.f2599b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m2751c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (c cVar : this.f2598a) {
                if (cVar.mo2390a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.f2598a.removeAll(hashSet);
        }

        /* renamed from: b */
        void m2752b(c cVar) {
            this.f2598a.add(cVar);
        }

        /* renamed from: d */
        void m2753d(c cVar) {
            this.f2598a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f2599b.execute(new Runnable() { // from class: androidx.camera.camera2.internal.v
                @Override // java.lang.Runnable
                public final void run() {
                    C0557u.b.this.m2751c(totalCaptureResult);
                }
            });
        }
    }

    /* renamed from: androidx.camera.camera2.internal.u$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        boolean mo2390a(TotalCaptureResult totalCaptureResult);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0557u(C0427d0 c0427d0, ScheduledExecutorService scheduledExecutorService, Executor executor, InterfaceC0699y.c cVar, C0668t1 c0668t1) {
        C0701y1.b bVar = new C0701y1.b();
        this.f2578g = bVar;
        this.f2586o = 0;
        this.f2587p = false;
        this.f2588q = 2;
        this.f2591t = new AtomicLong(0L);
        this.f2592u = C0009f.m22h(null);
        this.f2593v = 1;
        this.f2594w = 0L;
        a aVar = new a();
        this.f2595x = aVar;
        this.f2576e = c0427d0;
        this.f2577f = cVar;
        this.f2574c = executor;
        b bVar2 = new b(executor);
        this.f2573b = bVar2;
        bVar.m3410t(this.f2593v);
        bVar.m3401j(C0549s1.m2653d(bVar2));
        bVar.m3401j(aVar);
        this.f2582k = new C0480e2(this, c0427d0, executor);
        this.f2579h = new C0495h2(this, scheduledExecutorService, executor, c0668t1);
        this.f2580i = new C0561u3(this, c0427d0, executor);
        this.f2581j = new C0536p3(this, c0427d0, executor);
        this.f2583l = new C0406a4(c0427d0);
        this.f2589r = new C10936a(c0668t1);
        this.f2590s = new C10937b(c0668t1);
        this.f2584m = new C11597g(this, executor);
        this.f2585n = new C0548s0(this, c0427d0, c0668t1, executor);
        executor.execute(new Runnable() { // from class: androidx.camera.camera2.internal.m
            @Override // java.lang.Runnable
            public final void run() {
                C0557u.this.m2691Q();
            }
        });
    }

    /* renamed from: D */
    private int m2684D(int i10) {
        int[] iArr = (int[]) this.f2576e.m2215a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m2686K(i10, iArr) ? i10 : m2686K(1, iArr) ? 1 : 0;
    }

    /* renamed from: J */
    private boolean m2685J() {
        return m2711F() > 0;
    }

    /* renamed from: K */
    private boolean m2686K(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static boolean m2687L(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof C0620f2) && (l10 = (Long) ((C0620f2) tag).m3071d("CameraControlSessionUpdateId")) != null && l10.longValue() >= j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: N */
    public static /* synthetic */ void m2688N() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ void m2689O(Executor executor, AbstractC0637k abstractC0637k) {
        this.f2595x.m2749g(executor, abstractC0637k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static /* synthetic */ void m2690P() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ void m2691Q() {
        m2736t(this.f2584m.m36362l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public /* synthetic */ InterfaceFutureC5920f m2692R(List list, int i10, int i11, int i12, Void r52) {
        return this.f2585n.m2616e(list, i10, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ void m2693S(C0742c.a aVar) {
        C0009f.m25k(m2697g0(m2731f0()), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ Object m2694T(final C0742c.a aVar) {
        this.f2574c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.o
            @Override // java.lang.Runnable
            public final void run() {
                C0557u.this.m2693S(aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public static /* synthetic */ boolean m2695U(long j10, C0742c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!m2687L(totalCaptureResult, j10)) {
            return false;
        }
        aVar.m3756c(null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public /* synthetic */ Object m2696V(final long j10, final C0742c.a aVar) {
        m2736t(new c() { // from class: androidx.camera.camera2.internal.h
            @Override // androidx.camera.camera2.internal.C0557u.c
            /* renamed from: a */
            public final boolean mo2390a(TotalCaptureResult totalCaptureResult) {
                boolean m2695U;
                m2695U = C0557u.m2695U(j10, aVar, totalCaptureResult);
                return m2695U;
            }
        });
        return "waitForSessionUpdateId:" + j10;
    }

    /* renamed from: g0 */
    private InterfaceFutureC5920f<Void> m2697g0(final long j10) {
        return C0742c.m3752a(new C0742c.c() { // from class: androidx.camera.camera2.internal.q
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m2696V;
                m2696V = C0557u.this.m2696V(j10, aVar);
                return m2696V;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0070 A[LOOP:0: B:6:0x006a->B:8:0x0070, LOOP_END] */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    androidx.camera.core.impl.InterfaceC0649n0 m2707A() {
        /*
            r7 = this;
            q.a$a r0 = new q.a$a
            r0.<init>()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.m30571e(r1, r3)
            androidx.camera.camera2.internal.h2 r1 = r7.f2579h
            r1.m2400b(r0)
            t.a r1 = r7.f2589r
            r1.m33409a(r0)
            androidx.camera.camera2.internal.u3 r1 = r7.f2580i
            r1.m2783e(r0)
            boolean r1 = r7.f2587p
            r3 = 2
            if (r1 == 0) goto L2d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.m30571e(r1, r3)
            goto L33
        L2d:
            int r1 = r7.f2588q
            if (r1 == 0) goto L37
            if (r1 == r2) goto L35
        L33:
            r1 = r2
            goto L3d
        L35:
            r1 = 3
            goto L3d
        L37:
            t.b r1 = r7.f2590s
            int r1 = r1.m33410a(r3)
        L3d:
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r1 = r7.m2708B(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.m30571e(r3, r1)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            int r2 = r7.m2684D(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.m30571e(r1, r2)
            androidx.camera.camera2.internal.e2 r1 = r7.f2582k
            r1.m2366c(r0)
            v.g r1 = r7.f2584m
            q.a r1 = r1.m36361k()
            java.util.Set r2 = r1.mo3195e()
            java.util.Iterator r2 = r2.iterator()
        L6a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L84
            java.lang.Object r3 = r2.next()
            androidx.camera.core.impl.n0$a r3 = (androidx.camera.core.impl.InterfaceC0649n0.a) r3
            androidx.camera.core.impl.l1 r4 = r0.mo2932a()
            androidx.camera.core.impl.n0$c r5 = androidx.camera.core.impl.InterfaceC0649n0.c.ALWAYS_OVERRIDE
            java.lang.Object r6 = r1.mo3191a(r3)
            r4.mo3177p(r3, r5, r6)
            goto L6a
        L84:
            q.a r0 = r0.m30569c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C0557u.m2707A():androidx.camera.core.impl.n0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public int m2708B(int i10) {
        int[] iArr = (int[]) this.f2576e.m2215a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return m2686K(i10, iArr) ? i10 : m2686K(1, iArr) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public int m2709C(int i10) {
        int[] iArr = (int[]) this.f2576e.m2215a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m2686K(i10, iArr)) {
            return i10;
        }
        if (m2686K(4, iArr)) {
            return 4;
        }
        return m2686K(1, iArr) ? 1 : 0;
    }

    /* renamed from: E */
    public C0536p3 m2710E() {
        return this.f2581j;
    }

    /* renamed from: F */
    int m2711F() {
        int i10;
        synchronized (this.f2575d) {
            i10 = this.f2586o;
        }
        return i10;
    }

    /* renamed from: G */
    public C0561u3 m2712G() {
        return this.f2580i;
    }

    /* renamed from: H */
    public InterfaceC0571w3 m2713H() {
        return this.f2583l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: I */
    public void m2714I() {
        synchronized (this.f2575d) {
            this.f2586o++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: M */
    public boolean m2715M() {
        return this.f2587p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: W */
    public void m2716W(c cVar) {
        this.f2573b.m2753d(cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: X */
    public void m2717X() {
        m2721a0(1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: Y */
    public void m2718Y(boolean z10) {
        this.f2579h.m2405m(z10);
        this.f2580i.m2785o(z10);
        this.f2581j.m2609j(z10);
        this.f2582k.m2365b(z10);
        this.f2584m.m36363s(z10);
    }

    /* renamed from: Z */
    public void m2719Z(Rational rational) {
        this.f2579h.m2406n(rational);
    }

    @Override // androidx.camera.core.impl.InterfaceC0699y
    /* renamed from: a */
    public void mo2720a(C0701y1.b bVar) {
        this.f2583l.mo2175a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void m2721a0(int i10) {
        this.f2593v = i10;
        this.f2579h.m2407o(i10);
        this.f2585n.m2615d(this.f2593v);
    }

    @Override // p407w.InterfaceC12016j
    /* renamed from: b */
    public InterfaceFutureC5920f<Void> mo2722b(float f10) {
        return !m2685J() ? C0009f.m20f(new InterfaceC12016j.a("Camera is not active.")) : C0009f.m24j(this.f2580i.m2786p(f10));
    }

    /* renamed from: b0 */
    public void m2723b0(boolean z10) {
        this.f2583l.mo2178d(z10);
    }

    @Override // androidx.camera.core.impl.InterfaceC0699y
    /* renamed from: c */
    public InterfaceFutureC5920f<List<Void>> mo2724c(final List<C0642l0> list, final int i10, final int i11) {
        if (m2685J()) {
            final int m2740x = m2740x();
            return C0007d.m9a(C0009f.m24j(this.f2592u)).m13e(new InterfaceC0004a() { // from class: androidx.camera.camera2.internal.l
                @Override // p002a0.InterfaceC0004a
                public final InterfaceFutureC5920f apply(Object obj) {
                    InterfaceFutureC5920f m2692R;
                    m2692R = C0557u.this.m2692R(list, i10, m2740x, i11, (Void) obj);
                    return m2692R;
                }
            }, this.f2574c);
        }
        C12029o0.m38648k("Camera2CameraControlImp", "Camera is not active.");
        return C0009f.m20f(new InterfaceC12016j.a("Camera is not active."));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void m2725c0(List<C0642l0> list) {
        this.f2577f.mo2516b(list);
    }

    @Override // p407w.InterfaceC12016j
    /* renamed from: d */
    public InterfaceFutureC5920f<Void> mo2726d(float f10) {
        return !m2685J() ? C0009f.m20f(new InterfaceC12016j.a("Camera is not active.")) : C0009f.m24j(this.f2580i.m2787q(f10));
    }

    /* renamed from: d0 */
    public void m2727d0() {
        this.f2574c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.p
            @Override // java.lang.Runnable
            public final void run() {
                C0557u.this.m2731f0();
            }
        });
    }

    @Override // androidx.camera.core.impl.InterfaceC0699y
    /* renamed from: e */
    public Rect mo2728e() {
        return (Rect) C0984h.m4833k((Rect) this.f2576e.m2215a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    /* renamed from: e0 */
    InterfaceFutureC5920f<Void> m2729e0() {
        return C0009f.m24j(C0742c.m3752a(new C0742c.c() { // from class: androidx.camera.camera2.internal.i
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m2694T;
                m2694T = C0557u.this.m2694T(aVar);
                return m2694T;
            }
        }));
    }

    @Override // androidx.camera.core.impl.InterfaceC0699y
    /* renamed from: f */
    public void mo2730f(int i10) {
        if (!m2685J()) {
            C12029o0.m38648k("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f2588q = i10;
        InterfaceC0571w3 interfaceC0571w3 = this.f2583l;
        boolean z10 = true;
        if (this.f2588q != 1 && this.f2588q != 0) {
            z10 = false;
        }
        interfaceC0571w3.mo2177c(z10);
        this.f2592u = m2729e0();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f0 */
    public long m2731f0() {
        this.f2594w = this.f2591t.getAndIncrement();
        this.f2577f.mo2515a();
        return this.f2594w;
    }

    @Override // p407w.InterfaceC12016j
    /* renamed from: g */
    public InterfaceFutureC5920f<Void> mo2732g(boolean z10) {
        return !m2685J() ? C0009f.m20f(new InterfaceC12016j.a("Camera is not active.")) : C0009f.m24j(this.f2581j.m2606d(z10));
    }

    @Override // androidx.camera.core.impl.InterfaceC0699y
    /* renamed from: h */
    public InterfaceC0649n0 mo2733h() {
        return this.f2584m.m36361k();
    }

    @Override // androidx.camera.core.impl.InterfaceC0699y
    /* renamed from: i */
    public void mo2734i(InterfaceC0649n0 interfaceC0649n0) {
        this.f2584m.m36359g(C11600j.a.m36367e(interfaceC0649n0).m36369d()).addListener(new Runnable() { // from class: androidx.camera.camera2.internal.n
            @Override // java.lang.Runnable
            public final void run() {
                C0557u.m2688N();
            }
        }, C12747a.m42280a());
    }

    @Override // androidx.camera.core.impl.InterfaceC0699y
    /* renamed from: j */
    public void mo2735j() {
        this.f2584m.m36360i().addListener(new Runnable() { // from class: androidx.camera.camera2.internal.j
            @Override // java.lang.Runnable
            public final void run() {
                C0557u.m2690P();
            }
        }, C12747a.m42280a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public void m2736t(c cVar) {
        this.f2573b.m2752b(cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: u */
    public void m2737u(final Executor executor, final AbstractC0637k abstractC0637k) {
        this.f2574c.execute(new Runnable() { // from class: androidx.camera.camera2.internal.k
            @Override // java.lang.Runnable
            public final void run() {
                C0557u.this.m2689O(executor, abstractC0637k);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: v */
    public void m2738v() {
        synchronized (this.f2575d) {
            int i10 = this.f2586o;
            if (i10 == 0) {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
            this.f2586o = i10 - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public void m2739w(boolean z10) {
        this.f2587p = z10;
        if (!z10) {
            C0642l0.a aVar = new C0642l0.a();
            aVar.m3175r(this.f2593v);
            aVar.m3176s(true);
            C10214a.a aVar2 = new C10214a.a();
            aVar2.m30571e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m2708B(1)));
            aVar2.m30571e(CaptureRequest.FLASH_MODE, 0);
            aVar.m3164e(aVar2.m30569c());
            m2725c0(Collections.singletonList(aVar.m3167h()));
        }
        m2731f0();
    }

    /* renamed from: x */
    public int m2740x() {
        return this.f2588q;
    }

    /* renamed from: y */
    public C0495h2 m2741y() {
        return this.f2579h;
    }

    /* renamed from: z */
    public C0701y1 m2742z() {
        this.f2578g.m3410t(this.f2593v);
        this.f2578g.m3408r(m2707A());
        Object m30562Z = this.f2584m.m36361k().m30562Z(null);
        if (m30562Z != null && (m30562Z instanceof Integer)) {
            this.f2578g.m3405n("Camera2CameraControl", m30562Z);
        }
        this.f2578g.m3405n("CameraControlSessionUpdateId", Long.valueOf(this.f2594w));
        return this.f2578g.m3406o();
    }
}
