package io.grpc.internal;

import io.flutter.plugins.firebase.crashlytics.Constants;
import io.grpc.internal.InterfaceC8864j2;
import io.grpc.internal.InterfaceC8892r;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p082eb.C7159o;
import vi.C11915g1;
import vi.C11946t;
import vi.C11950v;
import vi.C11953w0;
import vi.InterfaceC11934n;

/* renamed from: io.grpc.internal.b0 */
/* loaded from: classes3.dex */
class C8830b0 implements InterfaceC8889q {

    /* renamed from: a */
    private volatile boolean f20257a;

    /* renamed from: b */
    private InterfaceC8892r f20258b;

    /* renamed from: c */
    private InterfaceC8889q f20259c;

    /* renamed from: d */
    private C11915g1 f20260d;

    /* renamed from: f */
    private o f20262f;

    /* renamed from: g */
    private long f20263g;

    /* renamed from: h */
    private long f20264h;

    /* renamed from: e */
    private List<Runnable> f20261e = new ArrayList();

    /* renamed from: i */
    private List<Runnable> f20265i = new ArrayList();

    /* renamed from: io.grpc.internal.b0$a */
    /* loaded from: classes3.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f20266a;

        a(int i10) {
            this.f20266a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8830b0.this.f20259c.mo25283b(this.f20266a);
        }
    }

    /* renamed from: io.grpc.internal.b0$b */
    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8830b0.this.f20259c.mo25285i();
        }
    }

    /* renamed from: io.grpc.internal.b0$c */
    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11934n f20269a;

        c(InterfaceC11934n interfaceC11934n) {
            this.f20269a = interfaceC11934n;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8830b0.this.f20259c.mo25282a(this.f20269a);
        }
    }

    /* renamed from: io.grpc.internal.b0$d */
    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f20271a;

        d(boolean z10) {
            this.f20271a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8830b0.this.f20259c.mo25199j(this.f20271a);
        }
    }

    /* renamed from: io.grpc.internal.b0$e */
    /* loaded from: classes3.dex */
    class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11950v f20273a;

        e(C11950v c11950v) {
            this.f20273a = c11950v;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8830b0.this.f20259c.mo25200k(this.f20273a);
        }
    }

    /* renamed from: io.grpc.internal.b0$f */
    /* loaded from: classes3.dex */
    class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f20275a;

        f(int i10) {
            this.f20275a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8830b0.this.f20259c.mo25196e(this.f20275a);
        }
    }

    /* renamed from: io.grpc.internal.b0$g */
    /* loaded from: classes3.dex */
    class g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f20277a;

        g(int i10) {
            this.f20277a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8830b0.this.f20259c.mo25197f(this.f20277a);
        }
    }

    /* renamed from: io.grpc.internal.b0$h */
    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11946t f20279a;

        h(C11946t c11946t) {
            this.f20279a = c11946t;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8830b0.this.f20259c.mo25198g(this.f20279a);
        }
    }

    /* renamed from: io.grpc.internal.b0$i */
    /* loaded from: classes3.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8830b0.this.m25279s();
        }
    }

    /* renamed from: io.grpc.internal.b0$j */
    /* loaded from: classes3.dex */
    class j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f20282a;

        j(String str) {
            this.f20282a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8830b0.this.f20259c.mo25286l(this.f20282a);
        }
    }

    /* renamed from: io.grpc.internal.b0$k */
    /* loaded from: classes3.dex */
    class k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ InputStream f20284a;

        k(InputStream inputStream) {
            this.f20284a = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8830b0.this.f20259c.mo25284h(this.f20284a);
        }
    }

    /* renamed from: io.grpc.internal.b0$l */
    /* loaded from: classes3.dex */
    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8830b0.this.f20259c.flush();
        }
    }

    /* renamed from: io.grpc.internal.b0$m */
    /* loaded from: classes3.dex */
    class m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11915g1 f20287a;

        m(C11915g1 c11915g1) {
            this.f20287a = c11915g1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8830b0.this.f20259c.mo25194c(this.f20287a);
        }
    }

    /* renamed from: io.grpc.internal.b0$n */
    /* loaded from: classes3.dex */
    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C8830b0.this.f20259c.mo25202n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.b0$o */
    /* loaded from: classes3.dex */
    public static class o implements InterfaceC8892r {

        /* renamed from: a */
        private final InterfaceC8892r f20290a;

        /* renamed from: b */
        private volatile boolean f20291b;

        /* renamed from: c */
        private List<Runnable> f20292c = new ArrayList();

        /* renamed from: io.grpc.internal.b0$o$a */
        /* loaded from: classes3.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ InterfaceC8864j2.a f20293a;

            a(InterfaceC8864j2.a aVar) {
                this.f20293a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f20290a.mo25290a(this.f20293a);
            }
        }

        /* renamed from: io.grpc.internal.b0$o$b */
        /* loaded from: classes3.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f20290a.mo25292c();
            }
        }

        /* renamed from: io.grpc.internal.b0$o$c */
        /* loaded from: classes3.dex */
        class c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11953w0 f20296a;

            c(C11953w0 c11953w0) {
                this.f20296a = c11953w0;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f20290a.mo25291b(this.f20296a);
            }
        }

        /* renamed from: io.grpc.internal.b0$o$d */
        /* loaded from: classes3.dex */
        class d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C11915g1 f20298a;

            /* renamed from: b */
            final /* synthetic */ InterfaceC8892r.a f20299b;

            /* renamed from: c */
            final /* synthetic */ C11953w0 f20300c;

            d(C11915g1 c11915g1, InterfaceC8892r.a aVar, C11953w0 c11953w0) {
                this.f20298a = c11915g1;
                this.f20299b = aVar;
                this.f20300c = c11953w0;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f20290a.mo25293d(this.f20298a, this.f20299b, this.f20300c);
            }
        }

        public o(InterfaceC8892r interfaceC8892r) {
            this.f20290a = interfaceC8892r;
        }

        /* renamed from: f */
        private void m25289f(Runnable runnable) {
            synchronized (this) {
                if (this.f20291b) {
                    runnable.run();
                } else {
                    this.f20292c.add(runnable);
                }
            }
        }

        @Override // io.grpc.internal.InterfaceC8864j2
        /* renamed from: a */
        public void mo25290a(InterfaceC8864j2.a aVar) {
            if (this.f20291b) {
                this.f20290a.mo25290a(aVar);
            } else {
                m25289f(new a(aVar));
            }
        }

        @Override // io.grpc.internal.InterfaceC8892r
        /* renamed from: b */
        public void mo25291b(C11953w0 c11953w0) {
            m25289f(new c(c11953w0));
        }

        @Override // io.grpc.internal.InterfaceC8864j2
        /* renamed from: c */
        public void mo25292c() {
            if (this.f20291b) {
                this.f20290a.mo25292c();
            } else {
                m25289f(new b());
            }
        }

        @Override // io.grpc.internal.InterfaceC8892r
        /* renamed from: d */
        public void mo25293d(C11915g1 c11915g1, InterfaceC8892r.a aVar, C11953w0 c11953w0) {
            m25289f(new d(c11915g1, aVar, c11953w0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: g */
        public void m25294g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    if (this.f20292c.isEmpty()) {
                        this.f20292c = null;
                        this.f20291b = true;
                        return;
                    } else {
                        list = this.f20292c;
                        this.f20292c = arrayList;
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

    /* renamed from: r */
    private void m25278r(Runnable runnable) {
        C7159o.m21319v(this.f20258b != null, "May only be called after start");
        synchronized (this) {
            if (this.f20257a) {
                runnable.run();
            } else {
                this.f20261e.add(runnable);
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
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m25279s() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f20261e     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L1d
            r0 = 0
            r3.f20261e = r0     // Catch: java.lang.Throwable -> L3b
            r0 = 1
            r3.f20257a = r0     // Catch: java.lang.Throwable -> L3b
            io.grpc.internal.b0$o r0 = r3.f20262f     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L1c
            r0.m25294g()
        L1c:
            return
        L1d:
            java.util.List<java.lang.Runnable> r1 = r3.f20261e     // Catch: java.lang.Throwable -> L3b
            r3.f20261e = r0     // Catch: java.lang.Throwable -> L3b
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
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.C8830b0.m25279s():void");
    }

    /* renamed from: t */
    private void m25280t(InterfaceC8892r interfaceC8892r) {
        Iterator<Runnable> it = this.f20265i.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f20265i = null;
        this.f20259c.mo25203o(interfaceC8892r);
    }

    /* renamed from: v */
    private void m25281v(InterfaceC8889q interfaceC8889q) {
        InterfaceC8889q interfaceC8889q2 = this.f20259c;
        C7159o.m21322y(interfaceC8889q2 == null, "realStream already set to %s", interfaceC8889q2);
        this.f20259c = interfaceC8889q;
        this.f20264h = System.nanoTime();
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: a */
    public void mo25282a(InterfaceC11934n interfaceC11934n) {
        C7159o.m21319v(this.f20258b == null, "May only be called before start");
        C7159o.m21313p(interfaceC11934n, "compressor");
        this.f20265i.add(new c(interfaceC11934n));
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: b */
    public void mo25283b(int i10) {
        C7159o.m21319v(this.f20258b != null, "May only be called after start");
        if (this.f20257a) {
            this.f20259c.mo25283b(i10);
        } else {
            m25278r(new a(i10));
        }
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: c */
    public void mo25194c(C11915g1 c11915g1) {
        boolean z10 = true;
        C7159o.m21319v(this.f20258b != null, "May only be called after start");
        C7159o.m21313p(c11915g1, Constants.REASON);
        synchronized (this) {
            if (this.f20259c == null) {
                m25281v(C8879n1.f20750a);
                this.f20260d = c11915g1;
                z10 = false;
            }
        }
        if (z10) {
            m25278r(new m(c11915g1));
            return;
        }
        m25279s();
        mo25256u(c11915g1);
        this.f20258b.mo25293d(c11915g1, InterfaceC8892r.a.PROCESSED, new C11953w0());
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: d */
    public boolean mo25195d() {
        if (this.f20257a) {
            return this.f20259c.mo25195d();
        }
        return false;
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: e */
    public void mo25196e(int i10) {
        C7159o.m21319v(this.f20258b == null, "May only be called before start");
        this.f20265i.add(new f(i10));
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: f */
    public void mo25197f(int i10) {
        C7159o.m21319v(this.f20258b == null, "May only be called before start");
        this.f20265i.add(new g(i10));
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    public void flush() {
        C7159o.m21319v(this.f20258b != null, "May only be called after start");
        if (this.f20257a) {
            this.f20259c.flush();
        } else {
            m25278r(new l());
        }
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: g */
    public void mo25198g(C11946t c11946t) {
        C7159o.m21319v(this.f20258b == null, "May only be called before start");
        this.f20265i.add(new h(c11946t));
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: h */
    public void mo25284h(InputStream inputStream) {
        C7159o.m21319v(this.f20258b != null, "May only be called after start");
        C7159o.m21313p(inputStream, Constants.MESSAGE);
        if (this.f20257a) {
            this.f20259c.mo25284h(inputStream);
        } else {
            m25278r(new k(inputStream));
        }
    }

    @Override // io.grpc.internal.InterfaceC8860i2
    /* renamed from: i */
    public void mo25285i() {
        C7159o.m21319v(this.f20258b == null, "May only be called before start");
        this.f20265i.add(new b());
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: j */
    public void mo25199j(boolean z10) {
        C7159o.m21319v(this.f20258b == null, "May only be called before start");
        this.f20265i.add(new d(z10));
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: k */
    public void mo25200k(C11950v c11950v) {
        C7159o.m21319v(this.f20258b == null, "May only be called before start");
        C7159o.m21313p(c11950v, "decompressorRegistry");
        this.f20265i.add(new e(c11950v));
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: l */
    public void mo25286l(String str) {
        C7159o.m21319v(this.f20258b == null, "May only be called before start");
        C7159o.m21313p(str, "authority");
        this.f20265i.add(new j(str));
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: m */
    public void mo25201m(C8908w0 c8908w0) {
        synchronized (this) {
            if (this.f20258b == null) {
                return;
            }
            if (this.f20259c != null) {
                c8908w0.m25876b("buffered_nanos", Long.valueOf(this.f20264h - this.f20263g));
                this.f20259c.mo25201m(c8908w0);
            } else {
                c8908w0.m25876b("buffered_nanos", Long.valueOf(System.nanoTime() - this.f20263g));
                c8908w0.m25875a("waiting_for_connection");
            }
        }
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: n */
    public void mo25202n() {
        C7159o.m21319v(this.f20258b != null, "May only be called after start");
        m25278r(new n());
    }

    @Override // io.grpc.internal.InterfaceC8889q
    /* renamed from: o */
    public void mo25203o(InterfaceC8892r interfaceC8892r) {
        C11915g1 c11915g1;
        boolean z10;
        C7159o.m21313p(interfaceC8892r, "listener");
        C7159o.m21319v(this.f20258b == null, "already started");
        synchronized (this) {
            c11915g1 = this.f20260d;
            z10 = this.f20257a;
            if (!z10) {
                o oVar = new o(interfaceC8892r);
                this.f20262f = oVar;
                interfaceC8892r = oVar;
            }
            this.f20258b = interfaceC8892r;
            this.f20263g = System.nanoTime();
        }
        if (c11915g1 != null) {
            interfaceC8892r.mo25293d(c11915g1, InterfaceC8892r.a.PROCESSED, new C11953w0());
        } else if (z10) {
            m25280t(interfaceC8892r);
        }
    }

    /* renamed from: u */
    protected void mo25256u(C11915g1 c11915g1) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w */
    public final Runnable m25287w(InterfaceC8889q interfaceC8889q) {
        synchronized (this) {
            if (this.f20259c != null) {
                return null;
            }
            m25281v((InterfaceC8889q) C7159o.m21313p(interfaceC8889q, "stream"));
            InterfaceC8892r interfaceC8892r = this.f20258b;
            if (interfaceC8892r == null) {
                this.f20261e = null;
                this.f20257a = true;
            }
            if (interfaceC8892r == null) {
                return null;
            }
            m25280t(interfaceC8892r);
            return new i();
        }
    }
}
