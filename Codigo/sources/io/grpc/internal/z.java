package io.grpc.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import vi.g;

/* loaded from: classes3.dex */
public class z<ReqT, RespT> extends vi.g<ReqT, RespT> {

    /* renamed from: j, reason: collision with root package name */
    private static final Logger f19370j = Logger.getLogger(z.class.getName());

    /* renamed from: k, reason: collision with root package name */
    private static final vi.g<Object, Object> f19371k = new i();

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledFuture<?> f19372a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f19373b;

    /* renamed from: c, reason: collision with root package name */
    private final vi.r f19374c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f19375d;

    /* renamed from: e, reason: collision with root package name */
    private g.a<RespT> f19376e;

    /* renamed from: f, reason: collision with root package name */
    private vi.g<ReqT, RespT> f19377f;

    /* renamed from: g, reason: collision with root package name */
    private vi.g1 f19378g;

    /* renamed from: h, reason: collision with root package name */
    private List<Runnable> f19379h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private k<RespT> f19380i;

    /* loaded from: classes3.dex */
    class a extends x {
        a(vi.r rVar) {
            super(rVar);
        }

        @Override // io.grpc.internal.x
        public void a() {
            z.this.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ StringBuilder f19382a;

        b(StringBuilder sb2) {
            this.f19382a = sb2;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.k(vi.g1.f29104j.r(this.f19382a.toString()), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends x {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f19384b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k kVar) {
            super(z.this.f19374c);
            this.f19384b = kVar;
        }

        @Override // io.grpc.internal.x
        public void a() {
            this.f19384b.g();
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.a f19386a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ vi.w0 f19387b;

        d(g.a aVar, vi.w0 w0Var) {
            this.f19386a = aVar;
            this.f19387b = w0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f19377f.e(this.f19386a, this.f19387b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ vi.g1 f19389a;

        e(vi.g1 g1Var) {
            this.f19389a = g1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f19377f.a(this.f19389a.o(), this.f19389a.m());
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f19391a;

        f(Object obj) {
            this.f19391a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            z.this.f19377f.d(this.f19391a);
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f19393a;

        g(int i10) {
            this.f19393a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f19377f.c(this.f19393a);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f19377f.b();
        }
    }

    /* loaded from: classes3.dex */
    class i extends vi.g<Object, Object> {
        i() {
        }

        @Override // vi.g
        public void a(String str, Throwable th2) {
        }

        @Override // vi.g
        public void b() {
        }

        @Override // vi.g
        public void c(int i10) {
        }

        @Override // vi.g
        public void d(Object obj) {
        }

        @Override // vi.g
        public void e(g.a<Object> aVar, vi.w0 w0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class j extends x {

        /* renamed from: b, reason: collision with root package name */
        final g.a<RespT> f19396b;

        /* renamed from: c, reason: collision with root package name */
        final vi.g1 f19397c;

        j(g.a<RespT> aVar, vi.g1 g1Var) {
            super(z.this.f19374c);
            this.f19396b = aVar;
            this.f19397c = g1Var;
        }

        @Override // io.grpc.internal.x
        public void a() {
            this.f19396b.a(this.f19397c, new vi.w0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class k<RespT> extends g.a<RespT> {

        /* renamed from: a, reason: collision with root package name */
        private final g.a<RespT> f19399a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f19400b;

        /* renamed from: c, reason: collision with root package name */
        private List<Runnable> f19401c = new ArrayList();

        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ vi.w0 f19402a;

            a(vi.w0 w0Var) {
                this.f19402a = w0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f19399a.b(this.f19402a);
            }
        }

        /* loaded from: classes3.dex */
        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Object f19404a;

            b(Object obj) {
                this.f19404a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f19399a.c(this.f19404a);
            }
        }

        /* loaded from: classes3.dex */
        class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ vi.g1 f19406a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ vi.w0 f19407b;

            c(vi.g1 g1Var, vi.w0 w0Var) {
                this.f19406a = g1Var;
                this.f19407b = w0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f19399a.a(this.f19406a, this.f19407b);
            }
        }

        /* loaded from: classes3.dex */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f19399a.d();
            }
        }

        public k(g.a<RespT> aVar) {
            this.f19399a = aVar;
        }

        private void f(Runnable runnable) {
            synchronized (this) {
                if (this.f19400b) {
                    runnable.run();
                } else {
                    this.f19401c.add(runnable);
                }
            }
        }

        @Override // vi.g.a
        public void a(vi.g1 g1Var, vi.w0 w0Var) {
            f(new c(g1Var, w0Var));
        }

        @Override // vi.g.a
        public void b(vi.w0 w0Var) {
            if (this.f19400b) {
                this.f19399a.b(w0Var);
            } else {
                f(new a(w0Var));
            }
        }

        @Override // vi.g.a
        public void c(RespT respt) {
            if (this.f19400b) {
                this.f19399a.c(respt);
            } else {
                f(new b(respt));
            }
        }

        @Override // vi.g.a
        public void d() {
            if (this.f19400b) {
                this.f19399a.d();
            } else {
                f(new d());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    if (this.f19401c.isEmpty()) {
                        this.f19401c = null;
                        this.f19400b = true;
                        return;
                    } else {
                        list = this.f19401c;
                        this.f19401c = arrayList;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public z(Executor executor, ScheduledExecutorService scheduledExecutorService, vi.t tVar) {
        this.f19373b = (Executor) eb.o.p(executor, "callExecutor");
        eb.o.p(scheduledExecutorService, "scheduler");
        this.f19374c = vi.r.e();
        this.f19372a = o(scheduledExecutorService, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void k(vi.g1 g1Var, boolean z10) {
        boolean z11;
        g.a<RespT> aVar;
        synchronized (this) {
            if (this.f19377f == null) {
                q(f19371k);
                aVar = this.f19376e;
                this.f19378g = g1Var;
                z11 = false;
            } else {
                if (z10) {
                    return;
                }
                z11 = true;
                aVar = null;
            }
            if (z11) {
                l(new e(g1Var));
            } else {
                if (aVar != null) {
                    this.f19373b.execute(new j(aVar, g1Var));
                }
                m();
            }
            j();
        }
    }

    private void l(Runnable runnable) {
        synchronized (this) {
            if (this.f19375d) {
                runnable.run();
            } else {
                this.f19379h.add(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f19379h     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.f19379h = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.f19375d = r0     // Catch: java.lang.Throwable -> L42
            io.grpc.internal.z$k<RespT> r0 = r3.f19380i     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f19373b
            io.grpc.internal.z$c r2 = new io.grpc.internal.z$c
            r2.<init>(r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List<java.lang.Runnable> r1 = r3.f19379h     // Catch: java.lang.Throwable -> L42
            r3.f19379h = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z.m():void");
    }

    private boolean n(vi.t tVar, vi.t tVar2) {
        if (tVar2 == null) {
            return true;
        }
        if (tVar == null) {
            return false;
        }
        return tVar.n(tVar2);
    }

    private ScheduledFuture<?> o(ScheduledExecutorService scheduledExecutorService, vi.t tVar) {
        String str;
        vi.t g10 = this.f19374c.g();
        if (tVar == null && g10 == null) {
            return null;
        }
        long q10 = tVar != null ? tVar.q(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
        if (g10 != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (g10.q(timeUnit) < q10) {
                q10 = g10.q(timeUnit);
                Logger logger = f19370j;
                if (logger.isLoggable(Level.FINE)) {
                    Locale locale = Locale.US;
                    StringBuilder sb2 = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(q10)));
                    sb2.append(tVar == null ? " Explicit call timeout was not set." : String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(tVar.q(timeUnit))));
                    logger.fine(sb2.toString());
                }
            }
        }
        long abs = Math.abs(q10);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = abs / timeUnit2.toNanos(1L);
        long abs2 = Math.abs(q10) % timeUnit2.toNanos(1L);
        StringBuilder sb3 = new StringBuilder();
        String str2 = n(g10, tVar) ? "Context" : "CallOptions";
        if (q10 < 0) {
            sb3.append("ClientCall started after ");
            sb3.append(str2);
            str = " deadline was exceeded. Deadline has been exceeded for ";
        } else {
            sb3.append("Deadline ");
            sb3.append(str2);
            str = " will be exceeded in ";
        }
        sb3.append(str);
        sb3.append(nanos);
        sb3.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        sb3.append("s. ");
        return scheduledExecutorService.schedule(new b(sb3), q10, TimeUnit.NANOSECONDS);
    }

    private void q(vi.g<ReqT, RespT> gVar) {
        vi.g<ReqT, RespT> gVar2 = this.f19377f;
        eb.o.y(gVar2 == null, "realCall already set to %s", gVar2);
        ScheduledFuture<?> scheduledFuture = this.f19372a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f19377f = gVar;
    }

    @Override // vi.g
    public final void a(String str, Throwable th2) {
        vi.g1 g1Var = vi.g1.f29101g;
        if (str == null) {
            str = "Call cancelled without message";
        }
        vi.g1 r10 = g1Var.r(str);
        if (th2 != null) {
            r10 = r10.q(th2);
        }
        k(r10, false);
    }

    @Override // vi.g
    public final void b() {
        l(new h());
    }

    @Override // vi.g
    public final void c(int i10) {
        if (this.f19375d) {
            this.f19377f.c(i10);
        } else {
            l(new g(i10));
        }
    }

    @Override // vi.g
    public final void d(ReqT reqt) {
        if (this.f19375d) {
            this.f19377f.d(reqt);
        } else {
            l(new f(reqt));
        }
    }

    @Override // vi.g
    public final void e(g.a<RespT> aVar, vi.w0 w0Var) {
        vi.g1 g1Var;
        boolean z10;
        eb.o.v(this.f19376e == null, "already started");
        synchronized (this) {
            this.f19376e = (g.a) eb.o.p(aVar, "listener");
            g1Var = this.f19378g;
            z10 = this.f19375d;
            if (!z10) {
                k<RespT> kVar = new k<>(aVar);
                this.f19380i = kVar;
                aVar = kVar;
            }
        }
        if (g1Var != null) {
            this.f19373b.execute(new j(aVar, g1Var));
        } else if (z10) {
            this.f19377f.e(aVar, w0Var);
        } else {
            l(new d(aVar, w0Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j() {
    }

    public final Runnable p(vi.g<ReqT, RespT> gVar) {
        synchronized (this) {
            if (this.f19377f != null) {
                return null;
            }
            q((vi.g) eb.o.p(gVar, "call"));
            return new a(this.f19374c);
        }
    }

    public String toString() {
        return eb.i.c(this).d("realCall", this.f19377f).toString();
    }
}
