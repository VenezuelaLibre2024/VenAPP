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
import p082eb.C7153i;
import p082eb.C7159o;
import vi.AbstractC11913g;
import vi.C11915g1;
import vi.C11942r;
import vi.C11946t;
import vi.C11953w0;

/* renamed from: io.grpc.internal.z */
/* loaded from: classes3.dex */
public class C8916z<ReqT, RespT> extends AbstractC11913g<ReqT, RespT> {

    /* renamed from: j */
    private static final Logger f21121j = Logger.getLogger(C8916z.class.getName());

    /* renamed from: k */
    private static final AbstractC11913g<Object, Object> f21122k = new i();

    /* renamed from: a */
    private final ScheduledFuture<?> f21123a;

    /* renamed from: b */
    private final Executor f21124b;

    /* renamed from: c */
    private final C11942r f21125c;

    /* renamed from: d */
    private volatile boolean f21126d;

    /* renamed from: e */
    private AbstractC11913g.a<RespT> f21127e;

    /* renamed from: f */
    private AbstractC11913g<ReqT, RespT> f21128f;

    /* renamed from: g */
    private C11915g1 f21129g;

    /* renamed from: h */
    private List<Runnable> f21130h = new ArrayList();

    /* renamed from: i */
    private k<RespT> f21131i;

    /* renamed from: io.grpc.internal.z$a */
    /* loaded from: classes3.dex */
    class a extends AbstractRunnableC8910x {
        a(C11942r c11942r) {
            super(c11942r);
        }

        @Override // io.grpc.internal.AbstractRunnableC8910x
        /* renamed from: a */
        public void mo25535a() {
            C8916z.this.m26021m();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.z$b */
    /* loaded from: classes3.dex */
    public class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ StringBuilder f21133a;

        b(StringBuilder sb2) {
            this.f21133a = sb2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8916z.this.m26019k(C11915g1.f31538j.m38147r(this.f21133a.toString()), true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.z$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractRunnableC8910x {

        /* renamed from: b */
        final /* synthetic */ k f21135b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k kVar) {
            super(C8916z.this.f21125c);
            this.f21135b = kVar;
        }

        @Override // io.grpc.internal.AbstractRunnableC8910x
        /* renamed from: a */
        public void mo25535a() {
            this.f21135b.m26029g();
        }
    }

    /* renamed from: io.grpc.internal.z$d */
    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC11913g.a f21137a;

        /* renamed from: b */
        final /* synthetic */ C11953w0 f21138b;

        d(AbstractC11913g.a aVar, C11953w0 c11953w0) {
            this.f21137a = aVar;
            this.f21138b = c11953w0;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8916z.this.f21128f.mo603e(this.f21137a, this.f21138b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.z$e */
    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11915g1 f21140a;

        e(C11915g1 c11915g1) {
            this.f21140a = c11915g1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8916z.this.f21128f.mo25522a(this.f21140a.m38144o(), this.f21140a.m38142m());
        }
    }

    /* renamed from: io.grpc.internal.z$f */
    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Object f21142a;

        f(Object obj) {
            this.f21142a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            C8916z.this.f21128f.mo25525d(this.f21142a);
        }
    }

    /* renamed from: io.grpc.internal.z$g */
    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f21144a;

        g(int i10) {
            this.f21144a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8916z.this.f21128f.mo25524c(this.f21144a);
        }
    }

    /* renamed from: io.grpc.internal.z$h */
    /* loaded from: classes3.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8916z.this.f21128f.mo25523b();
        }
    }

    /* renamed from: io.grpc.internal.z$i */
    /* loaded from: classes3.dex */
    class i extends AbstractC11913g<Object, Object> {
        i() {
        }

        @Override // vi.AbstractC11913g
        /* renamed from: a */
        public void mo25522a(String str, Throwable th2) {
        }

        @Override // vi.AbstractC11913g
        /* renamed from: b */
        public void mo25523b() {
        }

        @Override // vi.AbstractC11913g
        /* renamed from: c */
        public void mo25524c(int i10) {
        }

        @Override // vi.AbstractC11913g
        /* renamed from: d */
        public void mo25525d(Object obj) {
        }

        @Override // vi.AbstractC11913g
        /* renamed from: e */
        public void mo603e(AbstractC11913g.a<Object> aVar, C11953w0 c11953w0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.z$j */
    /* loaded from: classes3.dex */
    public final class j extends AbstractRunnableC8910x {

        /* renamed from: b */
        final AbstractC11913g.a<RespT> f21147b;

        /* renamed from: c */
        final C11915g1 f21148c;

        j(AbstractC11913g.a<RespT> aVar, C11915g1 c11915g1) {
            super(C8916z.this.f21125c);
            this.f21147b = aVar;
            this.f21148c = c11915g1;
        }

        @Override // io.grpc.internal.AbstractRunnableC8910x
        /* renamed from: a */
        public void mo25535a() {
            this.f21147b.mo597a(this.f21148c, new C11953w0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.z$k */
    /* loaded from: classes3.dex */
    public static final class k<RespT> extends AbstractC11913g.a<RespT> {

        /* renamed from: a */
        private final AbstractC11913g.a<RespT> f21150a;

        /* renamed from: b */
        private volatile boolean f21151b;

        /* renamed from: c */
        private List<Runnable> f21152c = new ArrayList();

        /* renamed from: io.grpc.internal.z$k$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11953w0 f21153a;

            a(C11953w0 c11953w0) {
                this.f21153a = c11953w0;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f21150a.mo598b(this.f21153a);
            }
        }

        /* renamed from: io.grpc.internal.z$k$b */
        /* loaded from: classes3.dex */
        class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Object f21155a;

            b(Object obj) {
                this.f21155a = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f21150a.mo599c(this.f21155a);
            }
        }

        /* renamed from: io.grpc.internal.z$k$c */
        /* loaded from: classes3.dex */
        class c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11915g1 f21157a;

            /* renamed from: b */
            final /* synthetic */ C11953w0 f21158b;

            c(C11915g1 c11915g1, C11953w0 c11953w0) {
                this.f21157a = c11915g1;
                this.f21158b = c11953w0;
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f21150a.mo597a(this.f21157a, this.f21158b);
            }
        }

        /* renamed from: io.grpc.internal.z$k$d */
        /* loaded from: classes3.dex */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f21150a.mo26028d();
            }
        }

        public k(AbstractC11913g.a<RespT> aVar) {
            this.f21150a = aVar;
        }

        /* renamed from: f */
        private void m26027f(Runnable runnable) {
            synchronized (this) {
                if (this.f21151b) {
                    runnable.run();
                } else {
                    this.f21152c.add(runnable);
                }
            }
        }

        @Override // vi.AbstractC11913g.a
        /* renamed from: a */
        public void mo597a(C11915g1 c11915g1, C11953w0 c11953w0) {
            m26027f(new c(c11915g1, c11953w0));
        }

        @Override // vi.AbstractC11913g.a
        /* renamed from: b */
        public void mo598b(C11953w0 c11953w0) {
            if (this.f21151b) {
                this.f21150a.mo598b(c11953w0);
            } else {
                m26027f(new a(c11953w0));
            }
        }

        @Override // vi.AbstractC11913g.a
        /* renamed from: c */
        public void mo599c(RespT respt) {
            if (this.f21151b) {
                this.f21150a.mo599c(respt);
            } else {
                m26027f(new b(respt));
            }
        }

        @Override // vi.AbstractC11913g.a
        /* renamed from: d */
        public void mo26028d() {
            if (this.f21151b) {
                this.f21150a.mo26028d();
            } else {
                m26027f(new d());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        void m26029g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    if (this.f21152c.isEmpty()) {
                        this.f21152c = null;
                        this.f21151b = true;
                        return;
                    } else {
                        list = this.f21152c;
                        this.f21152c = arrayList;
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
    public C8916z(Executor executor, ScheduledExecutorService scheduledExecutorService, C11946t c11946t) {
        this.f21124b = (Executor) C7159o.m21313p(executor, "callExecutor");
        C7159o.m21313p(scheduledExecutorService, "scheduler");
        this.f21125c = C11942r.m38242e();
        this.f21123a = m26023o(scheduledExecutorService, c11946t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: k */
    public void m26019k(C11915g1 c11915g1, boolean z10) {
        boolean z11;
        AbstractC11913g.a<RespT> aVar;
        synchronized (this) {
            if (this.f21128f == null) {
                m26024q(f21122k);
                aVar = this.f21127e;
                this.f21129g = c11915g1;
                z11 = false;
            } else {
                if (z10) {
                    return;
                }
                z11 = true;
                aVar = null;
            }
            if (z11) {
                m26020l(new e(c11915g1));
            } else {
                if (aVar != null) {
                    this.f21124b.execute(new j(aVar, c11915g1));
                }
                m26021m();
            }
            mo25557j();
        }
    }

    /* renamed from: l */
    private void m26020l(Runnable runnable) {
        synchronized (this) {
            if (this.f21126d) {
                runnable.run();
            } else {
                this.f21130h.add(runnable);
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
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m26021m() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f21130h     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.f21130h = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.f21126d = r0     // Catch: java.lang.Throwable -> L42
            io.grpc.internal.z$k<RespT> r0 = r3.f21131i     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f21124b
            io.grpc.internal.z$c r2 = new io.grpc.internal.z$c
            r2.<init>(r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List<java.lang.Runnable> r1 = r3.f21130h     // Catch: java.lang.Throwable -> L42
            r3.f21130h = r0     // Catch: java.lang.Throwable -> L42
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
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.C8916z.m26021m():void");
    }

    /* renamed from: n */
    private boolean m26022n(C11946t c11946t, C11946t c11946t2) {
        if (c11946t2 == null) {
            return true;
        }
        if (c11946t == null) {
            return false;
        }
        return c11946t.m38267n(c11946t2);
    }

    /* renamed from: o */
    private ScheduledFuture<?> m26023o(ScheduledExecutorService scheduledExecutorService, C11946t c11946t) {
        String str;
        C11946t m38249g = this.f21125c.m38249g();
        if (c11946t == null && m38249g == null) {
            return null;
        }
        long m38270q = c11946t != null ? c11946t.m38270q(TimeUnit.NANOSECONDS) : Long.MAX_VALUE;
        if (m38249g != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (m38249g.m38270q(timeUnit) < m38270q) {
                m38270q = m38249g.m38270q(timeUnit);
                Logger logger = f21121j;
                if (logger.isLoggable(Level.FINE)) {
                    Locale locale = Locale.US;
                    StringBuilder sb2 = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(m38270q)));
                    sb2.append(c11946t == null ? " Explicit call timeout was not set." : String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(c11946t.m38270q(timeUnit))));
                    logger.fine(sb2.toString());
                }
            }
        }
        long abs = Math.abs(m38270q);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = abs / timeUnit2.toNanos(1L);
        long abs2 = Math.abs(m38270q) % timeUnit2.toNanos(1L);
        StringBuilder sb3 = new StringBuilder();
        String str2 = m26022n(m38249g, c11946t) ? "Context" : "CallOptions";
        if (m38270q < 0) {
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
        return scheduledExecutorService.schedule(new b(sb3), m38270q, TimeUnit.NANOSECONDS);
    }

    /* renamed from: q */
    private void m26024q(AbstractC11913g<ReqT, RespT> abstractC11913g) {
        AbstractC11913g<ReqT, RespT> abstractC11913g2 = this.f21128f;
        C7159o.m21322y(abstractC11913g2 == null, "realCall already set to %s", abstractC11913g2);
        ScheduledFuture<?> scheduledFuture = this.f21123a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f21128f = abstractC11913g;
    }

    @Override // vi.AbstractC11913g
    /* renamed from: a */
    public final void mo25522a(String str, Throwable th2) {
        C11915g1 c11915g1 = C11915g1.f31535g;
        if (str == null) {
            str = "Call cancelled without message";
        }
        C11915g1 m38147r = c11915g1.m38147r(str);
        if (th2 != null) {
            m38147r = m38147r.m38146q(th2);
        }
        m26019k(m38147r, false);
    }

    @Override // vi.AbstractC11913g
    /* renamed from: b */
    public final void mo25523b() {
        m26020l(new h());
    }

    @Override // vi.AbstractC11913g
    /* renamed from: c */
    public final void mo25524c(int i10) {
        if (this.f21126d) {
            this.f21128f.mo25524c(i10);
        } else {
            m26020l(new g(i10));
        }
    }

    @Override // vi.AbstractC11913g
    /* renamed from: d */
    public final void mo25525d(ReqT reqt) {
        if (this.f21126d) {
            this.f21128f.mo25525d(reqt);
        } else {
            m26020l(new f(reqt));
        }
    }

    @Override // vi.AbstractC11913g
    /* renamed from: e */
    public final void mo603e(AbstractC11913g.a<RespT> aVar, C11953w0 c11953w0) {
        C11915g1 c11915g1;
        boolean z10;
        C7159o.m21319v(this.f21127e == null, "already started");
        synchronized (this) {
            this.f21127e = (AbstractC11913g.a) C7159o.m21313p(aVar, "listener");
            c11915g1 = this.f21129g;
            z10 = this.f21126d;
            if (!z10) {
                k<RespT> kVar = new k<>(aVar);
                this.f21131i = kVar;
                aVar = kVar;
            }
        }
        if (c11915g1 != null) {
            this.f21124b.execute(new j(aVar, c11915g1));
        } else if (z10) {
            this.f21128f.mo603e(aVar, c11953w0);
        } else {
            m26020l(new d(aVar, c11953w0));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: j */
    public void mo25557j() {
    }

    /* renamed from: p */
    public final Runnable m26025p(AbstractC11913g<ReqT, RespT> abstractC11913g) {
        synchronized (this) {
            if (this.f21128f != null) {
                return null;
            }
            m26024q((AbstractC11913g) C7159o.m21313p(abstractC11913g, "call"));
            return new a(this.f21125c);
        }
    }

    public String toString() {
        return C7153i.m21274c(this).m21284d("realCall", this.f21128f).toString();
    }
}
