package io.grpc.internal;

import io.flutter.plugins.firebase.crashlytics.Constants;
import io.grpc.internal.j2;
import io.grpc.internal.r;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
class b0 implements q {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f18563a;

    /* renamed from: b, reason: collision with root package name */
    private r f18564b;

    /* renamed from: c, reason: collision with root package name */
    private q f18565c;

    /* renamed from: d, reason: collision with root package name */
    private vi.g1 f18566d;

    /* renamed from: f, reason: collision with root package name */
    private o f18568f;

    /* renamed from: g, reason: collision with root package name */
    private long f18569g;

    /* renamed from: h, reason: collision with root package name */
    private long f18570h;

    /* renamed from: e, reason: collision with root package name */
    private List<Runnable> f18567e = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private List<Runnable> f18571i = new ArrayList();

    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18572a;

        a(int i10) {
            this.f18572a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f18565c.b(this.f18572a);
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f18565c.i();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ vi.n f18575a;

        c(vi.n nVar) {
            this.f18575a = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f18565c.a(this.f18575a);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f18577a;

        d(boolean z10) {
            this.f18577a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f18565c.j(this.f18577a);
        }
    }

    /* loaded from: classes3.dex */
    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ vi.v f18579a;

        e(vi.v vVar) {
            this.f18579a = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f18565c.k(this.f18579a);
        }
    }

    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18581a;

        f(int i10) {
            this.f18581a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f18565c.e(this.f18581a);
        }
    }

    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f18583a;

        g(int i10) {
            this.f18583a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f18565c.f(this.f18583a);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ vi.t f18585a;

        h(vi.t tVar) {
            this.f18585a = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f18565c.g(this.f18585a);
        }
    }

    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.s();
        }
    }

    /* loaded from: classes3.dex */
    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18588a;

        j(String str) {
            this.f18588a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f18565c.l(this.f18588a);
        }
    }

    /* loaded from: classes3.dex */
    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f18590a;

        k(InputStream inputStream) {
            this.f18590a = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f18565c.h(this.f18590a);
        }
    }

    /* loaded from: classes3.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f18565c.flush();
        }
    }

    /* loaded from: classes3.dex */
    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ vi.g1 f18593a;

        m(vi.g1 g1Var) {
            this.f18593a = g1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f18565c.c(this.f18593a);
        }
    }

    /* loaded from: classes3.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f18565c.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class o implements r {

        /* renamed from: a, reason: collision with root package name */
        private final r f18596a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f18597b;

        /* renamed from: c, reason: collision with root package name */
        private List<Runnable> f18598c = new ArrayList();

        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j2.a f18599a;

            a(j2.a aVar) {
                this.f18599a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f18596a.a(this.f18599a);
            }
        }

        /* loaded from: classes3.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f18596a.c();
            }
        }

        /* loaded from: classes3.dex */
        class c implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ vi.w0 f18602a;

            c(vi.w0 w0Var) {
                this.f18602a = w0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f18596a.b(this.f18602a);
            }
        }

        /* loaded from: classes3.dex */
        class d implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ vi.g1 f18604a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ r.a f18605b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ vi.w0 f18606c;

            d(vi.g1 g1Var, r.a aVar, vi.w0 w0Var) {
                this.f18604a = g1Var;
                this.f18605b = aVar;
                this.f18606c = w0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f18596a.d(this.f18604a, this.f18605b, this.f18606c);
            }
        }

        public o(r rVar) {
            this.f18596a = rVar;
        }

        private void f(Runnable runnable) {
            synchronized (this) {
                if (this.f18597b) {
                    runnable.run();
                } else {
                    this.f18598c.add(runnable);
                }
            }
        }

        @Override // io.grpc.internal.j2
        public void a(j2.a aVar) {
            if (this.f18597b) {
                this.f18596a.a(aVar);
            } else {
                f(new a(aVar));
            }
        }

        @Override // io.grpc.internal.r
        public void b(vi.w0 w0Var) {
            f(new c(w0Var));
        }

        @Override // io.grpc.internal.j2
        public void c() {
            if (this.f18597b) {
                this.f18596a.c();
            } else {
                f(new b());
            }
        }

        @Override // io.grpc.internal.r
        public void d(vi.g1 g1Var, r.a aVar, vi.w0 w0Var) {
            f(new d(g1Var, aVar, w0Var));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    if (this.f18598c.isEmpty()) {
                        this.f18598c = null;
                        this.f18597b = true;
                        return;
                    } else {
                        list = this.f18598c;
                        this.f18598c = arrayList;
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

    private void r(Runnable runnable) {
        eb.o.v(this.f18564b != null, "May only be called after start");
        synchronized (this) {
            if (this.f18563a) {
                runnable.run();
            } else {
                this.f18567e.add(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void s() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f18567e     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L1d
            r0 = 0
            r3.f18567e = r0     // Catch: java.lang.Throwable -> L3b
            r0 = 1
            r3.f18563a = r0     // Catch: java.lang.Throwable -> L3b
            io.grpc.internal.b0$o r0 = r3.f18568f     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L1c
            r0.g()
        L1c:
            return
        L1d:
            java.util.List<java.lang.Runnable> r1 = r3.f18567e     // Catch: java.lang.Throwable -> L3b
            r3.f18567e = r0     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r0 = r1.iterator()
        L26:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L26
        L36:
            r1.clear()
            r0 = r1
            goto L5
        L3b:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.b0.s():void");
    }

    private void t(r rVar) {
        Iterator<Runnable> it = this.f18571i.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f18571i = null;
        this.f18565c.o(rVar);
    }

    private void v(q qVar) {
        q qVar2 = this.f18565c;
        eb.o.y(qVar2 == null, "realStream already set to %s", qVar2);
        this.f18565c = qVar;
        this.f18570h = System.nanoTime();
    }

    @Override // io.grpc.internal.i2
    public void a(vi.n nVar) {
        eb.o.v(this.f18564b == null, "May only be called before start");
        eb.o.p(nVar, "compressor");
        this.f18571i.add(new c(nVar));
    }

    @Override // io.grpc.internal.i2
    public void b(int i10) {
        eb.o.v(this.f18564b != null, "May only be called after start");
        if (this.f18563a) {
            this.f18565c.b(i10);
        } else {
            r(new a(i10));
        }
    }

    @Override // io.grpc.internal.q
    public void c(vi.g1 g1Var) {
        boolean z10 = true;
        eb.o.v(this.f18564b != null, "May only be called after start");
        eb.o.p(g1Var, Constants.REASON);
        synchronized (this) {
            if (this.f18565c == null) {
                v(n1.f19003a);
                this.f18566d = g1Var;
                z10 = false;
            }
        }
        if (z10) {
            r(new m(g1Var));
            return;
        }
        s();
        u(g1Var);
        this.f18564b.d(g1Var, r.a.PROCESSED, new vi.w0());
    }

    @Override // io.grpc.internal.i2
    public boolean d() {
        if (this.f18563a) {
            return this.f18565c.d();
        }
        return false;
    }

    @Override // io.grpc.internal.q
    public void e(int i10) {
        eb.o.v(this.f18564b == null, "May only be called before start");
        this.f18571i.add(new f(i10));
    }

    @Override // io.grpc.internal.q
    public void f(int i10) {
        eb.o.v(this.f18564b == null, "May only be called before start");
        this.f18571i.add(new g(i10));
    }

    @Override // io.grpc.internal.i2
    public void flush() {
        eb.o.v(this.f18564b != null, "May only be called after start");
        if (this.f18563a) {
            this.f18565c.flush();
        } else {
            r(new l());
        }
    }

    @Override // io.grpc.internal.q
    public void g(vi.t tVar) {
        eb.o.v(this.f18564b == null, "May only be called before start");
        this.f18571i.add(new h(tVar));
    }

    @Override // io.grpc.internal.i2
    public void h(InputStream inputStream) {
        eb.o.v(this.f18564b != null, "May only be called after start");
        eb.o.p(inputStream, Constants.MESSAGE);
        if (this.f18563a) {
            this.f18565c.h(inputStream);
        } else {
            r(new k(inputStream));
        }
    }

    @Override // io.grpc.internal.i2
    public void i() {
        eb.o.v(this.f18564b == null, "May only be called before start");
        this.f18571i.add(new b());
    }

    @Override // io.grpc.internal.q
    public void j(boolean z10) {
        eb.o.v(this.f18564b == null, "May only be called before start");
        this.f18571i.add(new d(z10));
    }

    @Override // io.grpc.internal.q
    public void k(vi.v vVar) {
        eb.o.v(this.f18564b == null, "May only be called before start");
        eb.o.p(vVar, "decompressorRegistry");
        this.f18571i.add(new e(vVar));
    }

    @Override // io.grpc.internal.q
    public void l(String str) {
        eb.o.v(this.f18564b == null, "May only be called before start");
        eb.o.p(str, "authority");
        this.f18571i.add(new j(str));
    }

    @Override // io.grpc.internal.q
    public void m(w0 w0Var) {
        synchronized (this) {
            if (this.f18564b == null) {
                return;
            }
            if (this.f18565c != null) {
                w0Var.b("buffered_nanos", Long.valueOf(this.f18570h - this.f18569g));
                this.f18565c.m(w0Var);
            } else {
                w0Var.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.f18569g));
                w0Var.a("waiting_for_connection");
            }
        }
    }

    @Override // io.grpc.internal.q
    public void n() {
        eb.o.v(this.f18564b != null, "May only be called after start");
        r(new n());
    }

    @Override // io.grpc.internal.q
    public void o(r rVar) {
        vi.g1 g1Var;
        boolean z10;
        eb.o.p(rVar, "listener");
        eb.o.v(this.f18564b == null, "already started");
        synchronized (this) {
            g1Var = this.f18566d;
            z10 = this.f18563a;
            if (!z10) {
                o oVar = new o(rVar);
                this.f18568f = oVar;
                rVar = oVar;
            }
            this.f18564b = rVar;
            this.f18569g = System.nanoTime();
        }
        if (g1Var != null) {
            rVar.d(g1Var, r.a.PROCESSED, new vi.w0());
        } else if (z10) {
            t(rVar);
        }
    }

    protected void u(vi.g1 g1Var) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Runnable w(q qVar) {
        synchronized (this) {
            if (this.f18565c != null) {
                return null;
            }
            v((q) eb.o.p(qVar, "stream"));
            r rVar = this.f18564b;
            if (rVar == null) {
                this.f18567e = null;
                this.f18563a = true;
            }
            if (rVar == null) {
                return null;
            }
            t(rVar);
            return new i();
        }
    }
}
