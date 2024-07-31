package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.C0548s0;
import androidx.camera.camera2.internal.C0557u;
import androidx.camera.camera2.internal.compat.C0427d0;
import androidx.camera.core.impl.AbstractC0637k;
import androidx.camera.core.impl.C0642l0;
import androidx.camera.core.impl.C0645m;
import androidx.camera.core.impl.C0668t1;
import androidx.camera.core.impl.EnumC0648n;
import androidx.camera.core.impl.EnumC0651o;
import androidx.camera.core.impl.EnumC0654p;
import androidx.camera.core.impl.EnumC0657q;
import androidx.camera.core.impl.InterfaceC0663s;
import androidx.concurrent.futures.C0742c;
import com.google.common.util.concurrent.InterfaceFutureC5920f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import p002a0.C0007d;
import p002a0.C0009f;
import p002a0.InterfaceC0004a;
import p227m.InterfaceC9531a;
import p298q.C10214a;
import p354t.C10942g;
import p354t.C10950o;
import p354t.C10957v;
import p407w.C12008g0;
import p407w.C12029o0;
import p474z.C12747a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.camera2.internal.s0 */
/* loaded from: classes.dex */
public class C0548s0 {

    /* renamed from: h */
    private static final Set<EnumC0654p> f2497h = Collections.unmodifiableSet(EnumSet.of(EnumC0654p.PASSIVE_FOCUSED, EnumC0654p.PASSIVE_NOT_FOCUSED, EnumC0654p.LOCKED_FOCUSED, EnumC0654p.LOCKED_NOT_FOCUSED));

    /* renamed from: i */
    private static final Set<EnumC0657q> f2498i = Collections.unmodifiableSet(EnumSet.of(EnumC0657q.CONVERGED, EnumC0657q.UNKNOWN));

    /* renamed from: j */
    private static final Set<EnumC0648n> f2499j;

    /* renamed from: k */
    private static final Set<EnumC0648n> f2500k;

    /* renamed from: a */
    private final C0557u f2501a;

    /* renamed from: b */
    private final C10957v f2502b;

    /* renamed from: c */
    private final boolean f2503c;

    /* renamed from: d */
    private final C0668t1 f2504d;

    /* renamed from: e */
    private final Executor f2505e;

    /* renamed from: f */
    private final boolean f2506f;

    /* renamed from: g */
    private int f2507g = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.s0$a */
    /* loaded from: classes.dex */
    public static class a implements d {

        /* renamed from: a */
        private final C0557u f2508a;

        /* renamed from: b */
        private final C10950o f2509b;

        /* renamed from: c */
        private final int f2510c;

        /* renamed from: d */
        private boolean f2511d = false;

        a(C0557u c0557u, int i10, C10950o c10950o) {
            this.f2508a = c0557u;
            this.f2510c = i10;
            this.f2509b = c10950o;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ Object m2619f(C0742c.a aVar) {
            this.f2508a.m2741y().m2408q(aVar);
            this.f2509b.m33429b();
            return "AePreCapture";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: g */
        public static /* synthetic */ Boolean m2620g(Void r02) {
            return Boolean.TRUE;
        }

        @Override // androidx.camera.camera2.internal.C0548s0.d
        /* renamed from: a */
        public InterfaceFutureC5920f<Boolean> mo2621a(TotalCaptureResult totalCaptureResult) {
            if (!C0548s0.m2612b(this.f2510c, totalCaptureResult)) {
                return C0009f.m22h(Boolean.FALSE);
            }
            C12029o0.m38638a("Camera2CapturePipeline", "Trigger AE");
            this.f2511d = true;
            return C0007d.m9a(C0742c.m3752a(new C0742c.c() { // from class: androidx.camera.camera2.internal.q0
                @Override // androidx.concurrent.futures.C0742c.c
                /* renamed from: a */
                public final Object mo14a(C0742c.a aVar) {
                    Object m2619f;
                    m2619f = C0548s0.a.this.m2619f(aVar);
                    return m2619f;
                }
            })).m12d(new InterfaceC9531a() { // from class: androidx.camera.camera2.internal.r0
                @Override // p227m.InterfaceC9531a
                public final Object apply(Object obj) {
                    Boolean m2620g;
                    m2620g = C0548s0.a.m2620g((Void) obj);
                    return m2620g;
                }
            }, C12747a.m42280a());
        }

        @Override // androidx.camera.camera2.internal.C0548s0.d
        /* renamed from: b */
        public boolean mo2622b() {
            return this.f2510c == 0;
        }

        @Override // androidx.camera.camera2.internal.C0548s0.d
        /* renamed from: c */
        public void mo2623c() {
            if (this.f2511d) {
                C12029o0.m38638a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f2508a.m2741y().m2401c(false, true);
                this.f2509b.m33428a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.s0$b */
    /* loaded from: classes.dex */
    public static class b implements d {

        /* renamed from: a */
        private final C0557u f2512a;

        /* renamed from: b */
        private boolean f2513b = false;

        b(C0557u c0557u) {
            this.f2512a = c0557u;
        }

        @Override // androidx.camera.camera2.internal.C0548s0.d
        /* renamed from: a */
        public InterfaceFutureC5920f<Boolean> mo2621a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            InterfaceFutureC5920f<Boolean> m22h = C0009f.m22h(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return m22h;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                C12029o0.m38638a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C12029o0.m38638a("Camera2CapturePipeline", "Trigger AF");
                    this.f2513b = true;
                    this.f2512a.m2741y().m2409r(null, false);
                }
            }
            return m22h;
        }

        @Override // androidx.camera.camera2.internal.C0548s0.d
        /* renamed from: b */
        public boolean mo2622b() {
            return true;
        }

        @Override // androidx.camera.camera2.internal.C0548s0.d
        /* renamed from: c */
        public void mo2623c() {
            if (this.f2513b) {
                C12029o0.m38638a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f2512a.m2741y().m2401c(true, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.s0$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: i */
        private static final long f2514i;

        /* renamed from: j */
        private static final long f2515j;

        /* renamed from: a */
        private final int f2516a;

        /* renamed from: b */
        private final Executor f2517b;

        /* renamed from: c */
        private final C0557u f2518c;

        /* renamed from: d */
        private final C10950o f2519d;

        /* renamed from: e */
        private final boolean f2520e;

        /* renamed from: f */
        private long f2521f = f2514i;

        /* renamed from: g */
        final List<d> f2522g = new ArrayList();

        /* renamed from: h */
        private final d f2523h = new a();

        /* renamed from: androidx.camera.camera2.internal.s0$c$a */
        /* loaded from: classes.dex */
        class a implements d {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: e */
            public static /* synthetic */ Boolean m2641e(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override // androidx.camera.camera2.internal.C0548s0.d
            /* renamed from: a */
            public InterfaceFutureC5920f<Boolean> mo2621a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<d> it = c.this.f2522g.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mo2621a(totalCaptureResult));
                }
                return C0009f.m29o(C0009f.m17c(arrayList), new InterfaceC9531a() { // from class: androidx.camera.camera2.internal.z0
                    @Override // p227m.InterfaceC9531a
                    public final Object apply(Object obj) {
                        Boolean m2641e;
                        m2641e = C0548s0.c.a.m2641e((List) obj);
                        return m2641e;
                    }
                }, C12747a.m42280a());
            }

            @Override // androidx.camera.camera2.internal.C0548s0.d
            /* renamed from: b */
            public boolean mo2622b() {
                Iterator<d> it = c.this.f2522g.iterator();
                while (it.hasNext()) {
                    if (it.next().mo2622b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.camera.camera2.internal.C0548s0.d
            /* renamed from: c */
            public void mo2623c() {
                Iterator<d> it = c.this.f2522g.iterator();
                while (it.hasNext()) {
                    it.next().mo2623c();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.camera2.internal.s0$c$b */
        /* loaded from: classes.dex */
        public class b extends AbstractC0637k {

            /* renamed from: a */
            final /* synthetic */ C0742c.a f2525a;

            b(C0742c.a aVar) {
                this.f2525a = aVar;
            }

            @Override // androidx.camera.core.impl.AbstractC0637k
            /* renamed from: a */
            public void mo2410a() {
                this.f2525a.m3758f(new C12008g0(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // androidx.camera.core.impl.AbstractC0637k
            /* renamed from: b */
            public void mo2411b(InterfaceC0663s interfaceC0663s) {
                this.f2525a.m3756c(null);
            }

            @Override // androidx.camera.core.impl.AbstractC0637k
            /* renamed from: c */
            public void mo2412c(C0645m c0645m) {
                this.f2525a.m3758f(new C12008g0(2, "Capture request failed with reason " + c0645m.m3181a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f2514i = timeUnit.toNanos(1L);
            f2515j = timeUnit.toNanos(5L);
        }

        c(int i10, Executor executor, C0557u c0557u, boolean z10, C10950o c10950o) {
            this.f2516a = i10;
            this.f2517b = executor;
            this.f2518c = c0557u;
            this.f2520e = z10;
            this.f2519d = c10950o;
        }

        /* renamed from: g */
        private void m2629g(C0642l0.a aVar) {
            C10214a.a aVar2 = new C10214a.a();
            aVar2.m30571e(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.m3164e(aVar2.m30569c());
        }

        /* renamed from: h */
        private void m2630h(C0642l0.a aVar, C0642l0 c0642l0) {
            int i10 = (this.f2516a != 3 || this.f2520e) ? (c0642l0.m3156h() == -1 || c0642l0.m3156h() == 5) ? 2 : -1 : 4;
            if (i10 != -1) {
                aVar.m3175r(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ InterfaceFutureC5920f m2631j(int i10, TotalCaptureResult totalCaptureResult) {
            if (C0548s0.m2612b(i10, totalCaptureResult)) {
                m2636o(f2515j);
            }
            return this.f2523h.mo2621a(totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public /* synthetic */ InterfaceFutureC5920f m2633l(Boolean bool) {
            return Boolean.TRUE.equals(bool) ? C0548s0.m2614f(this.f2521f, this.f2518c, new e.a() { // from class: androidx.camera.camera2.internal.y0
                @Override // androidx.camera.camera2.internal.C0548s0.e.a
                /* renamed from: a */
                public final boolean mo2183a(TotalCaptureResult totalCaptureResult) {
                    boolean m2611a;
                    m2611a = C0548s0.m2611a(totalCaptureResult, false);
                    return m2611a;
                }
            }) : C0009f.m22h(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public /* synthetic */ InterfaceFutureC5920f m2634m(List list, int i10, TotalCaptureResult totalCaptureResult) {
            return m2639p(list, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ Object m2635n(C0642l0.a aVar, C0742c.a aVar2) {
            aVar.m3162c(new b(aVar2));
            return "submitStillCapture";
        }

        /* renamed from: o */
        private void m2636o(long j10) {
            this.f2521f = j10;
        }

        /* renamed from: f */
        void m2637f(d dVar) {
            this.f2522g.add(dVar);
        }

        /* renamed from: i */
        InterfaceFutureC5920f<List<Void>> m2638i(final List<C0642l0> list, final int i10) {
            InterfaceFutureC5920f m22h = C0009f.m22h(null);
            if (!this.f2522g.isEmpty()) {
                m22h = C0007d.m9a(this.f2523h.mo2622b() ? C0548s0.m2614f(0L, this.f2518c, null) : C0009f.m22h(null)).m13e(new InterfaceC0004a() { // from class: androidx.camera.camera2.internal.t0
                    @Override // p002a0.InterfaceC0004a
                    public final InterfaceFutureC5920f apply(Object obj) {
                        InterfaceFutureC5920f m2631j;
                        m2631j = C0548s0.c.this.m2631j(i10, (TotalCaptureResult) obj);
                        return m2631j;
                    }
                }, this.f2517b).m13e(new InterfaceC0004a() { // from class: androidx.camera.camera2.internal.u0
                    @Override // p002a0.InterfaceC0004a
                    public final InterfaceFutureC5920f apply(Object obj) {
                        InterfaceFutureC5920f m2633l;
                        m2633l = C0548s0.c.this.m2633l((Boolean) obj);
                        return m2633l;
                    }
                }, this.f2517b);
            }
            C0007d m13e = C0007d.m9a(m22h).m13e(new InterfaceC0004a() { // from class: androidx.camera.camera2.internal.v0
                @Override // p002a0.InterfaceC0004a
                public final InterfaceFutureC5920f apply(Object obj) {
                    InterfaceFutureC5920f m2634m;
                    m2634m = C0548s0.c.this.m2634m(list, i10, (TotalCaptureResult) obj);
                    return m2634m;
                }
            }, this.f2517b);
            final d dVar = this.f2523h;
            Objects.requireNonNull(dVar);
            m13e.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.w0
                @Override // java.lang.Runnable
                public final void run() {
                    C0548s0.d.this.mo2623c();
                }
            }, this.f2517b);
            return m13e;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
        /* renamed from: p */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        com.google.common.util.concurrent.InterfaceFutureC5920f<java.util.List<java.lang.Void>> m2639p(java.util.List<androidx.camera.core.impl.C0642l0> r7, int r8) {
            /*
                r6 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r7 = r7.iterator()
            Le:
                boolean r2 = r7.hasNext()
                if (r2 == 0) goto L8c
                java.lang.Object r2 = r7.next()
                androidx.camera.core.impl.l0 r2 = (androidx.camera.core.impl.C0642l0) r2
                androidx.camera.core.impl.l0$a r3 = androidx.camera.core.impl.C0642l0.a.m3159k(r2)
                int r4 = r2.m3156h()
                r5 = 5
                if (r4 != r5) goto L63
                androidx.camera.camera2.internal.u r4 = r6.f2518c
                androidx.camera.camera2.internal.w3 r4 = r4.m2713H()
                boolean r4 = r4.mo2181g()
                if (r4 != 0) goto L63
                androidx.camera.camera2.internal.u r4 = r6.f2518c
                androidx.camera.camera2.internal.w3 r4 = r4.m2713H()
                boolean r4 = r4.mo2176b()
                if (r4 != 0) goto L63
                androidx.camera.camera2.internal.u r4 = r6.f2518c
                androidx.camera.camera2.internal.w3 r4 = r4.m2713H()
                androidx.camera.core.o r4 = r4.mo2179e()
                if (r4 == 0) goto L57
                androidx.camera.camera2.internal.u r5 = r6.f2518c
                androidx.camera.camera2.internal.w3 r5 = r5.m2713H()
                boolean r5 = r5.mo2180f(r4)
                if (r5 == 0) goto L57
                r5 = 1
                goto L58
            L57:
                r5 = 0
            L58:
                if (r5 == 0) goto L63
                w.h0 r4 = r4.mo2883e1()
                androidx.camera.core.impl.s r4 = androidx.camera.core.impl.C0666t.m3236a(r4)
                goto L64
            L63:
                r4 = 0
            L64:
                if (r4 == 0) goto L6a
                r3.m3172o(r4)
                goto L6d
            L6a:
                r6.m2630h(r3, r2)
            L6d:
                t.o r2 = r6.f2519d
                boolean r2 = r2.m33430c(r8)
                if (r2 == 0) goto L78
                r6.m2629g(r3)
            L78:
                androidx.camera.camera2.internal.x0 r2 = new androidx.camera.camera2.internal.x0
                r2.<init>()
                com.google.common.util.concurrent.f r2 = androidx.concurrent.futures.C0742c.m3752a(r2)
                r0.add(r2)
                androidx.camera.core.impl.l0 r2 = r3.m3167h()
                r1.add(r2)
                goto Le
            L8c:
                androidx.camera.camera2.internal.u r7 = r6.f2518c
                r7.m2725c0(r1)
                com.google.common.util.concurrent.f r7 = p002a0.C0009f.m17c(r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.C0548s0.c.m2639p(java.util.List, int):com.google.common.util.concurrent.f");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.s0$d */
    /* loaded from: classes.dex */
    public interface d {
        /* renamed from: a */
        InterfaceFutureC5920f<Boolean> mo2621a(TotalCaptureResult totalCaptureResult);

        /* renamed from: b */
        boolean mo2622b();

        /* renamed from: c */
        void mo2623c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.s0$e */
    /* loaded from: classes.dex */
    public static class e implements C0557u.c {

        /* renamed from: a */
        private C0742c.a<TotalCaptureResult> f2527a;

        /* renamed from: c */
        private final long f2529c;

        /* renamed from: d */
        private final a f2530d;

        /* renamed from: b */
        private final InterfaceFutureC5920f<TotalCaptureResult> f2528b = C0742c.m3752a(new C0742c.c() { // from class: androidx.camera.camera2.internal.a1
            @Override // androidx.concurrent.futures.C0742c.c
            /* renamed from: a */
            public final Object mo14a(C0742c.a aVar) {
                Object m2643d;
                m2643d = C0548s0.e.this.m2643d(aVar);
                return m2643d;
            }
        });

        /* renamed from: e */
        private volatile Long f2531e = null;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.camera.camera2.internal.s0$e$a */
        /* loaded from: classes.dex */
        public interface a {
            /* renamed from: a */
            boolean mo2183a(TotalCaptureResult totalCaptureResult);
        }

        e(long j10, a aVar) {
            this.f2529c = j10;
            this.f2530d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ Object m2643d(C0742c.a aVar) {
            this.f2527a = aVar;
            return "waitFor3AResult";
        }

        @Override // androidx.camera.camera2.internal.C0557u.c
        /* renamed from: a */
        public boolean mo2390a(TotalCaptureResult totalCaptureResult) {
            Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l10 != null && this.f2531e == null) {
                this.f2531e = l10;
            }
            Long l11 = this.f2531e;
            if (0 == this.f2529c || l11 == null || l10 == null || l10.longValue() - l11.longValue() <= this.f2529c) {
                a aVar = this.f2530d;
                if (aVar != null && !aVar.mo2183a(totalCaptureResult)) {
                    return false;
                }
                this.f2527a.m3756c(totalCaptureResult);
                return true;
            }
            this.f2527a.m3756c(null);
            C12029o0.m38638a("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l10 + " first: " + l11);
            return true;
        }

        /* renamed from: c */
        public InterfaceFutureC5920f<TotalCaptureResult> m2644c() {
            return this.f2528b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.camera.camera2.internal.s0$f */
    /* loaded from: classes.dex */
    public static class f implements d {

        /* renamed from: e */
        private static final long f2532e = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a */
        private final C0557u f2533a;

        /* renamed from: b */
        private final int f2534b;

        /* renamed from: c */
        private boolean f2535c = false;

        /* renamed from: d */
        private final Executor f2536d;

        f(C0557u c0557u, int i10, Executor executor) {
            this.f2533a = c0557u;
            this.f2534b = i10;
            this.f2536d = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ Object m2649h(C0742c.a aVar) {
            this.f2533a.m2710E().m2602g(aVar, true);
            return "TorchOn";
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public /* synthetic */ InterfaceFutureC5920f m2651j(Void r42) {
            return C0548s0.m2614f(f2532e, this.f2533a, new e.a() { // from class: androidx.camera.camera2.internal.b1
                @Override // androidx.camera.camera2.internal.C0548s0.e.a
                /* renamed from: a */
                public final boolean mo2183a(TotalCaptureResult totalCaptureResult) {
                    boolean m2611a;
                    m2611a = C0548s0.m2611a(totalCaptureResult, true);
                    return m2611a;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public static /* synthetic */ Boolean m2652k(TotalCaptureResult totalCaptureResult) {
            return Boolean.FALSE;
        }

        @Override // androidx.camera.camera2.internal.C0548s0.d
        /* renamed from: a */
        public InterfaceFutureC5920f<Boolean> mo2621a(TotalCaptureResult totalCaptureResult) {
            if (C0548s0.m2612b(this.f2534b, totalCaptureResult)) {
                if (!this.f2533a.m2715M()) {
                    C12029o0.m38638a("Camera2CapturePipeline", "Turn on torch");
                    this.f2535c = true;
                    return C0007d.m9a(C0742c.m3752a(new C0742c.c() { // from class: androidx.camera.camera2.internal.c1
                        @Override // androidx.concurrent.futures.C0742c.c
                        /* renamed from: a */
                        public final Object mo14a(C0742c.a aVar) {
                            Object m2649h;
                            m2649h = C0548s0.f.this.m2649h(aVar);
                            return m2649h;
                        }
                    })).m13e(new InterfaceC0004a() { // from class: androidx.camera.camera2.internal.d1
                        @Override // p002a0.InterfaceC0004a
                        public final InterfaceFutureC5920f apply(Object obj) {
                            InterfaceFutureC5920f m2651j;
                            m2651j = C0548s0.f.this.m2651j((Void) obj);
                            return m2651j;
                        }
                    }, this.f2536d).m12d(new InterfaceC9531a() { // from class: androidx.camera.camera2.internal.e1
                        @Override // p227m.InterfaceC9531a
                        public final Object apply(Object obj) {
                            Boolean m2652k;
                            m2652k = C0548s0.f.m2652k((TotalCaptureResult) obj);
                            return m2652k;
                        }
                    }, C12747a.m42280a());
                }
                C12029o0.m38638a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return C0009f.m22h(Boolean.FALSE);
        }

        @Override // androidx.camera.camera2.internal.C0548s0.d
        /* renamed from: b */
        public boolean mo2622b() {
            return this.f2534b == 0;
        }

        @Override // androidx.camera.camera2.internal.C0548s0.d
        /* renamed from: c */
        public void mo2623c() {
            if (this.f2535c) {
                this.f2533a.m2710E().m2602g(null, false);
                C12029o0.m38638a("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    static {
        EnumC0648n enumC0648n = EnumC0648n.CONVERGED;
        EnumC0648n enumC0648n2 = EnumC0648n.FLASH_REQUIRED;
        EnumC0648n enumC0648n3 = EnumC0648n.UNKNOWN;
        Set<EnumC0648n> unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(enumC0648n, enumC0648n2, enumC0648n3));
        f2499j = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(enumC0648n2);
        copyOf.remove(enumC0648n3);
        f2500k = Collections.unmodifiableSet(copyOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0548s0(C0557u c0557u, C0427d0 c0427d0, C0668t1 c0668t1, Executor executor) {
        this.f2501a = c0557u;
        Integer num = (Integer) c0427d0.m2215a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f2506f = num != null && num.intValue() == 2;
        this.f2505e = executor;
        this.f2504d = c0668t1;
        this.f2502b = new C10957v(c0668t1);
        this.f2503c = C10942g.m33414a(new C0513l0(c0427d0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m2611a(TotalCaptureResult totalCaptureResult, boolean z10) {
        if (totalCaptureResult == null) {
            return false;
        }
        C0487g c0487g = new C0487g(totalCaptureResult);
        boolean z11 = c0487g.m2386i() == EnumC0651o.OFF || c0487g.m2386i() == EnumC0651o.UNKNOWN || f2497h.contains(c0487g.mo2383f());
        boolean z12 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 0;
        boolean z13 = !z10 ? !(z12 || f2499j.contains(c0487g.mo2385h())) : !(z12 || f2500k.contains(c0487g.mo2385h()));
        boolean z14 = (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue() == 0) || f2498i.contains(c0487g.mo2384g());
        C12029o0.m38638a("Camera2CapturePipeline", "checkCaptureResult, AE=" + c0487g.mo2385h() + " AF =" + c0487g.mo2383f() + " AWB=" + c0487g.mo2384g());
        return z11 && z13 && z14;
    }

    /* renamed from: b */
    static boolean m2612b(int i10, TotalCaptureResult totalCaptureResult) {
        if (i10 == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            return num != null && num.intValue() == 4;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new AssertionError(i10);
    }

    /* renamed from: c */
    private boolean m2613c(int i10) {
        return this.f2502b.m33439a() || this.f2507g == 3 || i10 == 1;
    }

    /* renamed from: f */
    static InterfaceFutureC5920f<TotalCaptureResult> m2614f(long j10, C0557u c0557u, e.a aVar) {
        e eVar = new e(j10, aVar);
        c0557u.m2736t(eVar);
        return eVar.m2644c();
    }

    /* renamed from: d */
    public void m2615d(int i10) {
        this.f2507g = i10;
    }

    /* renamed from: e */
    public InterfaceFutureC5920f<List<Void>> m2616e(List<C0642l0> list, int i10, int i11, int i12) {
        C10950o c10950o = new C10950o(this.f2504d);
        c cVar = new c(this.f2507g, this.f2505e, this.f2501a, this.f2506f, c10950o);
        if (i10 == 0) {
            cVar.m2637f(new b(this.f2501a));
        }
        if (this.f2503c) {
            cVar.m2637f(m2613c(i12) ? new f(this.f2501a, i11, this.f2505e) : new a(this.f2501a, i11, c10950o));
        }
        return C0009f.m24j(cVar.m2638i(list, i11));
    }
}
