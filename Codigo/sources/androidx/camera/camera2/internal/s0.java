package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.s0;
import androidx.camera.camera2.internal.u;
import androidx.camera.core.impl.l0;
import androidx.concurrent.futures.c;
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
import q.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s0 {

    /* renamed from: h, reason: collision with root package name */
    private static final Set<androidx.camera.core.impl.p> f2176h = Collections.unmodifiableSet(EnumSet.of(androidx.camera.core.impl.p.PASSIVE_FOCUSED, androidx.camera.core.impl.p.PASSIVE_NOT_FOCUSED, androidx.camera.core.impl.p.LOCKED_FOCUSED, androidx.camera.core.impl.p.LOCKED_NOT_FOCUSED));

    /* renamed from: i, reason: collision with root package name */
    private static final Set<androidx.camera.core.impl.q> f2177i = Collections.unmodifiableSet(EnumSet.of(androidx.camera.core.impl.q.CONVERGED, androidx.camera.core.impl.q.UNKNOWN));

    /* renamed from: j, reason: collision with root package name */
    private static final Set<androidx.camera.core.impl.n> f2178j;

    /* renamed from: k, reason: collision with root package name */
    private static final Set<androidx.camera.core.impl.n> f2179k;

    /* renamed from: a, reason: collision with root package name */
    private final u f2180a;

    /* renamed from: b, reason: collision with root package name */
    private final t.v f2181b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f2182c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.camera.core.impl.t1 f2183d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f2184e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2185f;

    /* renamed from: g, reason: collision with root package name */
    private int f2186g = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final u f2187a;

        /* renamed from: b, reason: collision with root package name */
        private final t.o f2188b;

        /* renamed from: c, reason: collision with root package name */
        private final int f2189c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2190d = false;

        a(u uVar, int i10, t.o oVar) {
            this.f2187a = uVar;
            this.f2189c = i10;
            this.f2188b = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object f(c.a aVar) {
            this.f2187a.y().q(aVar);
            this.f2188b.b();
            return "AePreCapture";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean g(Void r02) {
            return Boolean.TRUE;
        }

        @Override // androidx.camera.camera2.internal.s0.d
        public com.google.common.util.concurrent.f<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (!s0.b(this.f2189c, totalCaptureResult)) {
                return a0.f.h(Boolean.FALSE);
            }
            w.o0.a("Camera2CapturePipeline", "Trigger AE");
            this.f2190d = true;
            return a0.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: androidx.camera.camera2.internal.q0
                @Override // androidx.concurrent.futures.c.InterfaceC0032c
                public final Object a(c.a aVar) {
                    Object f10;
                    f10 = s0.a.this.f(aVar);
                    return f10;
                }
            })).d(new m.a() { // from class: androidx.camera.camera2.internal.r0
                @Override // m.a
                public final Object apply(Object obj) {
                    Boolean g10;
                    g10 = s0.a.g((Void) obj);
                    return g10;
                }
            }, z.a.a());
        }

        @Override // androidx.camera.camera2.internal.s0.d
        public boolean b() {
            return this.f2189c == 0;
        }

        @Override // androidx.camera.camera2.internal.s0.d
        public void c() {
            if (this.f2190d) {
                w.o0.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f2187a.y().c(false, true);
                this.f2188b.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private final u f2191a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f2192b = false;

        b(u uVar) {
            this.f2191a = uVar;
        }

        @Override // androidx.camera.camera2.internal.s0.d
        public com.google.common.util.concurrent.f<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            com.google.common.util.concurrent.f<Boolean> h10 = a0.f.h(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return h10;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                w.o0.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    w.o0.a("Camera2CapturePipeline", "Trigger AF");
                    this.f2192b = true;
                    this.f2191a.y().r(null, false);
                }
            }
            return h10;
        }

        @Override // androidx.camera.camera2.internal.s0.d
        public boolean b() {
            return true;
        }

        @Override // androidx.camera.camera2.internal.s0.d
        public void c() {
            if (this.f2192b) {
                w.o0.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f2191a.y().c(true, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: i, reason: collision with root package name */
        private static final long f2193i;

        /* renamed from: j, reason: collision with root package name */
        private static final long f2194j;

        /* renamed from: a, reason: collision with root package name */
        private final int f2195a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f2196b;

        /* renamed from: c, reason: collision with root package name */
        private final u f2197c;

        /* renamed from: d, reason: collision with root package name */
        private final t.o f2198d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f2199e;

        /* renamed from: f, reason: collision with root package name */
        private long f2200f = f2193i;

        /* renamed from: g, reason: collision with root package name */
        final List<d> f2201g = new ArrayList();

        /* renamed from: h, reason: collision with root package name */
        private final d f2202h = new a();

        /* loaded from: classes.dex */
        class a implements d {
            a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ Boolean e(List list) {
                return Boolean.valueOf(list.contains(Boolean.TRUE));
            }

            @Override // androidx.camera.camera2.internal.s0.d
            public com.google.common.util.concurrent.f<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<d> it = c.this.f2201g.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a(totalCaptureResult));
                }
                return a0.f.o(a0.f.c(arrayList), new m.a() { // from class: androidx.camera.camera2.internal.z0
                    @Override // m.a
                    public final Object apply(Object obj) {
                        Boolean e10;
                        e10 = s0.c.a.e((List) obj);
                        return e10;
                    }
                }, z.a.a());
            }

            @Override // androidx.camera.camera2.internal.s0.d
            public boolean b() {
                Iterator<d> it = c.this.f2201g.iterator();
                while (it.hasNext()) {
                    if (it.next().b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // androidx.camera.camera2.internal.s0.d
            public void c() {
                Iterator<d> it = c.this.f2201g.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b extends androidx.camera.core.impl.k {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ c.a f2204a;

            b(c.a aVar) {
                this.f2204a = aVar;
            }

            @Override // androidx.camera.core.impl.k
            public void a() {
                this.f2204a.f(new w.g0(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // androidx.camera.core.impl.k
            public void b(androidx.camera.core.impl.s sVar) {
                this.f2204a.c(null);
            }

            @Override // androidx.camera.core.impl.k
            public void c(androidx.camera.core.impl.m mVar) {
                this.f2204a.f(new w.g0(2, "Capture request failed with reason " + mVar.a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f2193i = timeUnit.toNanos(1L);
            f2194j = timeUnit.toNanos(5L);
        }

        c(int i10, Executor executor, u uVar, boolean z10, t.o oVar) {
            this.f2195a = i10;
            this.f2196b = executor;
            this.f2197c = uVar;
            this.f2199e = z10;
            this.f2198d = oVar;
        }

        private void g(l0.a aVar) {
            a.C0388a c0388a = new a.C0388a();
            c0388a.e(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(c0388a.c());
        }

        private void h(l0.a aVar, androidx.camera.core.impl.l0 l0Var) {
            int i10 = (this.f2195a != 3 || this.f2199e) ? (l0Var.h() == -1 || l0Var.h() == 5) ? 2 : -1 : 4;
            if (i10 != -1) {
                aVar.r(i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ com.google.common.util.concurrent.f j(int i10, TotalCaptureResult totalCaptureResult) {
            if (s0.b(i10, totalCaptureResult)) {
                o(f2194j);
            }
            return this.f2202h.a(totalCaptureResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ com.google.common.util.concurrent.f l(Boolean bool) {
            return Boolean.TRUE.equals(bool) ? s0.f(this.f2200f, this.f2197c, new e.a() { // from class: androidx.camera.camera2.internal.y0
                @Override // androidx.camera.camera2.internal.s0.e.a
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    boolean a10;
                    a10 = s0.a(totalCaptureResult, false);
                    return a10;
                }
            }) : a0.f.h(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ com.google.common.util.concurrent.f m(List list, int i10, TotalCaptureResult totalCaptureResult) {
            return p(list, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object n(l0.a aVar, c.a aVar2) {
            aVar.c(new b(aVar2));
            return "submitStillCapture";
        }

        private void o(long j10) {
            this.f2200f = j10;
        }

        void f(d dVar) {
            this.f2201g.add(dVar);
        }

        com.google.common.util.concurrent.f<List<Void>> i(final List<androidx.camera.core.impl.l0> list, final int i10) {
            com.google.common.util.concurrent.f h10 = a0.f.h(null);
            if (!this.f2201g.isEmpty()) {
                h10 = a0.d.a(this.f2202h.b() ? s0.f(0L, this.f2197c, null) : a0.f.h(null)).e(new a0.a() { // from class: androidx.camera.camera2.internal.t0
                    @Override // a0.a
                    public final com.google.common.util.concurrent.f apply(Object obj) {
                        com.google.common.util.concurrent.f j10;
                        j10 = s0.c.this.j(i10, (TotalCaptureResult) obj);
                        return j10;
                    }
                }, this.f2196b).e(new a0.a() { // from class: androidx.camera.camera2.internal.u0
                    @Override // a0.a
                    public final com.google.common.util.concurrent.f apply(Object obj) {
                        com.google.common.util.concurrent.f l10;
                        l10 = s0.c.this.l((Boolean) obj);
                        return l10;
                    }
                }, this.f2196b);
            }
            a0.d e10 = a0.d.a(h10).e(new a0.a() { // from class: androidx.camera.camera2.internal.v0
                @Override // a0.a
                public final com.google.common.util.concurrent.f apply(Object obj) {
                    com.google.common.util.concurrent.f m10;
                    m10 = s0.c.this.m(list, i10, (TotalCaptureResult) obj);
                    return m10;
                }
            }, this.f2196b);
            final d dVar = this.f2202h;
            Objects.requireNonNull(dVar);
            e10.addListener(new Runnable() { // from class: androidx.camera.camera2.internal.w0
                @Override // java.lang.Runnable
                public final void run() {
                    s0.d.this.c();
                }
            }, this.f2196b);
            return e10;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        com.google.common.util.concurrent.f<java.util.List<java.lang.Void>> p(java.util.List<androidx.camera.core.impl.l0> r7, int r8) {
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
                androidx.camera.core.impl.l0 r2 = (androidx.camera.core.impl.l0) r2
                androidx.camera.core.impl.l0$a r3 = androidx.camera.core.impl.l0.a.k(r2)
                int r4 = r2.h()
                r5 = 5
                if (r4 != r5) goto L63
                androidx.camera.camera2.internal.u r4 = r6.f2197c
                androidx.camera.camera2.internal.w3 r4 = r4.H()
                boolean r4 = r4.g()
                if (r4 != 0) goto L63
                androidx.camera.camera2.internal.u r4 = r6.f2197c
                androidx.camera.camera2.internal.w3 r4 = r4.H()
                boolean r4 = r4.b()
                if (r4 != 0) goto L63
                androidx.camera.camera2.internal.u r4 = r6.f2197c
                androidx.camera.camera2.internal.w3 r4 = r4.H()
                androidx.camera.core.o r4 = r4.e()
                if (r4 == 0) goto L57
                androidx.camera.camera2.internal.u r5 = r6.f2197c
                androidx.camera.camera2.internal.w3 r5 = r5.H()
                boolean r5 = r5.f(r4)
                if (r5 == 0) goto L57
                r5 = 1
                goto L58
            L57:
                r5 = 0
            L58:
                if (r5 == 0) goto L63
                w.h0 r4 = r4.e1()
                androidx.camera.core.impl.s r4 = androidx.camera.core.impl.t.a(r4)
                goto L64
            L63:
                r4 = 0
            L64:
                if (r4 == 0) goto L6a
                r3.o(r4)
                goto L6d
            L6a:
                r6.h(r3, r2)
            L6d:
                t.o r2 = r6.f2198d
                boolean r2 = r2.c(r8)
                if (r2 == 0) goto L78
                r6.g(r3)
            L78:
                androidx.camera.camera2.internal.x0 r2 = new androidx.camera.camera2.internal.x0
                r2.<init>()
                com.google.common.util.concurrent.f r2 = androidx.concurrent.futures.c.a(r2)
                r0.add(r2)
                androidx.camera.core.impl.l0 r2 = r3.h()
                r1.add(r2)
                goto Le
            L8c:
                androidx.camera.camera2.internal.u r7 = r6.f2197c
                r7.c0(r1)
                com.google.common.util.concurrent.f r7 = a0.f.c(r0)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.s0.c.p(java.util.List, int):com.google.common.util.concurrent.f");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d {
        com.google.common.util.concurrent.f<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e implements u.c {

        /* renamed from: a, reason: collision with root package name */
        private c.a<TotalCaptureResult> f2206a;

        /* renamed from: c, reason: collision with root package name */
        private final long f2208c;

        /* renamed from: d, reason: collision with root package name */
        private final a f2209d;

        /* renamed from: b, reason: collision with root package name */
        private final com.google.common.util.concurrent.f<TotalCaptureResult> f2207b = androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: androidx.camera.camera2.internal.a1
            @Override // androidx.concurrent.futures.c.InterfaceC0032c
            public final Object a(c.a aVar) {
                Object d10;
                d10 = s0.e.this.d(aVar);
                return d10;
            }
        });

        /* renamed from: e, reason: collision with root package name */
        private volatile Long f2210e = null;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        e(long j10, a aVar) {
            this.f2208c = j10;
            this.f2209d = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object d(c.a aVar) {
            this.f2206a = aVar;
            return "waitFor3AResult";
        }

        @Override // androidx.camera.camera2.internal.u.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l10 != null && this.f2210e == null) {
                this.f2210e = l10;
            }
            Long l11 = this.f2210e;
            if (0 == this.f2208c || l11 == null || l10 == null || l10.longValue() - l11.longValue() <= this.f2208c) {
                a aVar = this.f2209d;
                if (aVar != null && !aVar.a(totalCaptureResult)) {
                    return false;
                }
                this.f2206a.c(totalCaptureResult);
                return true;
            }
            this.f2206a.c(null);
            w.o0.a("Camera2CapturePipeline", "Wait for capture result timeout, current:" + l10 + " first: " + l11);
            return true;
        }

        public com.google.common.util.concurrent.f<TotalCaptureResult> c() {
            return this.f2207b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f implements d {

        /* renamed from: e, reason: collision with root package name */
        private static final long f2211e = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: a, reason: collision with root package name */
        private final u f2212a;

        /* renamed from: b, reason: collision with root package name */
        private final int f2213b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2214c = false;

        /* renamed from: d, reason: collision with root package name */
        private final Executor f2215d;

        f(u uVar, int i10, Executor executor) {
            this.f2212a = uVar;
            this.f2213b = i10;
            this.f2215d = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Object h(c.a aVar) {
            this.f2212a.E().g(aVar, true);
            return "TorchOn";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ com.google.common.util.concurrent.f j(Void r42) {
            return s0.f(f2211e, this.f2212a, new e.a() { // from class: androidx.camera.camera2.internal.b1
                @Override // androidx.camera.camera2.internal.s0.e.a
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    boolean a10;
                    a10 = s0.a(totalCaptureResult, true);
                    return a10;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Boolean k(TotalCaptureResult totalCaptureResult) {
            return Boolean.FALSE;
        }

        @Override // androidx.camera.camera2.internal.s0.d
        public com.google.common.util.concurrent.f<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (s0.b(this.f2213b, totalCaptureResult)) {
                if (!this.f2212a.M()) {
                    w.o0.a("Camera2CapturePipeline", "Turn on torch");
                    this.f2214c = true;
                    return a0.d.a(androidx.concurrent.futures.c.a(new c.InterfaceC0032c() { // from class: androidx.camera.camera2.internal.c1
                        @Override // androidx.concurrent.futures.c.InterfaceC0032c
                        public final Object a(c.a aVar) {
                            Object h10;
                            h10 = s0.f.this.h(aVar);
                            return h10;
                        }
                    })).e(new a0.a() { // from class: androidx.camera.camera2.internal.d1
                        @Override // a0.a
                        public final com.google.common.util.concurrent.f apply(Object obj) {
                            com.google.common.util.concurrent.f j10;
                            j10 = s0.f.this.j((Void) obj);
                            return j10;
                        }
                    }, this.f2215d).d(new m.a() { // from class: androidx.camera.camera2.internal.e1
                        @Override // m.a
                        public final Object apply(Object obj) {
                            Boolean k10;
                            k10 = s0.f.k((TotalCaptureResult) obj);
                            return k10;
                        }
                    }, z.a.a());
                }
                w.o0.a("Camera2CapturePipeline", "Torch already on, not turn on");
            }
            return a0.f.h(Boolean.FALSE);
        }

        @Override // androidx.camera.camera2.internal.s0.d
        public boolean b() {
            return this.f2213b == 0;
        }

        @Override // androidx.camera.camera2.internal.s0.d
        public void c() {
            if (this.f2214c) {
                this.f2212a.E().g(null, false);
                w.o0.a("Camera2CapturePipeline", "Turn off torch");
            }
        }
    }

    static {
        androidx.camera.core.impl.n nVar = androidx.camera.core.impl.n.CONVERGED;
        androidx.camera.core.impl.n nVar2 = androidx.camera.core.impl.n.FLASH_REQUIRED;
        androidx.camera.core.impl.n nVar3 = androidx.camera.core.impl.n.UNKNOWN;
        Set<androidx.camera.core.impl.n> unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(nVar, nVar2, nVar3));
        f2178j = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(nVar2);
        copyOf.remove(nVar3);
        f2179k = Collections.unmodifiableSet(copyOf);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(u uVar, androidx.camera.camera2.internal.compat.d0 d0Var, androidx.camera.core.impl.t1 t1Var, Executor executor) {
        this.f2180a = uVar;
        Integer num = (Integer) d0Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f2185f = num != null && num.intValue() == 2;
        this.f2184e = executor;
        this.f2183d = t1Var;
        this.f2181b = new t.v(t1Var);
        this.f2182c = t.g.a(new l0(d0Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(TotalCaptureResult totalCaptureResult, boolean z10) {
        if (totalCaptureResult == null) {
            return false;
        }
        g gVar = new g(totalCaptureResult);
        boolean z11 = gVar.i() == androidx.camera.core.impl.o.OFF || gVar.i() == androidx.camera.core.impl.o.UNKNOWN || f2176h.contains(gVar.f());
        boolean z12 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 0;
        boolean z13 = !z10 ? !(z12 || f2178j.contains(gVar.h())) : !(z12 || f2179k.contains(gVar.h()));
        boolean z14 = (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue() == 0) || f2177i.contains(gVar.g());
        w.o0.a("Camera2CapturePipeline", "checkCaptureResult, AE=" + gVar.h() + " AF =" + gVar.f() + " AWB=" + gVar.g());
        return z11 && z13 && z14;
    }

    static boolean b(int i10, TotalCaptureResult totalCaptureResult) {
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

    private boolean c(int i10) {
        return this.f2181b.a() || this.f2186g == 3 || i10 == 1;
    }

    static com.google.common.util.concurrent.f<TotalCaptureResult> f(long j10, u uVar, e.a aVar) {
        e eVar = new e(j10, aVar);
        uVar.t(eVar);
        return eVar.c();
    }

    public void d(int i10) {
        this.f2186g = i10;
    }

    public com.google.common.util.concurrent.f<List<Void>> e(List<androidx.camera.core.impl.l0> list, int i10, int i11, int i12) {
        t.o oVar = new t.o(this.f2183d);
        c cVar = new c(this.f2186g, this.f2184e, this.f2180a, this.f2185f, oVar);
        if (i10 == 0) {
            cVar.f(new b(this.f2180a));
        }
        if (this.f2182c) {
            cVar.f(c(i12) ? new f(this.f2180a, i11, this.f2184e) : new a(this.f2180a, i11, oVar));
        }
        return a0.f.j(cVar.i(list, i11));
    }
}
