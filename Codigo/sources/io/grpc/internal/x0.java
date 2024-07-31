package io.grpc.internal;

import io.grpc.internal.j1;
import io.grpc.internal.k;
import io.grpc.internal.r;
import io.grpc.internal.t;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import vi.f;
import vi.k1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class x0 implements vi.h0<Object>, m2 {

    /* renamed from: a, reason: collision with root package name */
    private final vi.i0 f19196a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19197b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19198c;

    /* renamed from: d, reason: collision with root package name */
    private final k.a f19199d;

    /* renamed from: e, reason: collision with root package name */
    private final j f19200e;

    /* renamed from: f, reason: collision with root package name */
    private final t f19201f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f19202g;

    /* renamed from: h, reason: collision with root package name */
    private final vi.c0 f19203h;

    /* renamed from: i, reason: collision with root package name */
    private final io.grpc.internal.m f19204i;

    /* renamed from: j, reason: collision with root package name */
    private final o f19205j;

    /* renamed from: k, reason: collision with root package name */
    private final vi.f f19206k;

    /* renamed from: l, reason: collision with root package name */
    private final vi.k1 f19207l;

    /* renamed from: m, reason: collision with root package name */
    private final k f19208m;

    /* renamed from: n, reason: collision with root package name */
    private volatile List<vi.x> f19209n;

    /* renamed from: o, reason: collision with root package name */
    private io.grpc.internal.k f19210o;

    /* renamed from: p, reason: collision with root package name */
    private final eb.t f19211p;

    /* renamed from: q, reason: collision with root package name */
    private k1.d f19212q;

    /* renamed from: r, reason: collision with root package name */
    private k1.d f19213r;

    /* renamed from: s, reason: collision with root package name */
    private j1 f19214s;

    /* renamed from: v, reason: collision with root package name */
    private v f19217v;

    /* renamed from: w, reason: collision with root package name */
    private volatile j1 f19218w;

    /* renamed from: y, reason: collision with root package name */
    private vi.g1 f19220y;

    /* renamed from: t, reason: collision with root package name */
    private final Collection<v> f19215t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    private final v0<v> f19216u = new a();

    /* renamed from: x, reason: collision with root package name */
    private volatile vi.q f19219x = vi.q.a(vi.p.IDLE);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends v0<v> {
        a() {
        }

        @Override // io.grpc.internal.v0
        protected void b() {
            x0.this.f19200e.a(x0.this);
        }

        @Override // io.grpc.internal.v0
        protected void c() {
            x0.this.f19200e.b(x0.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.f19212q = null;
            x0.this.f19206k.a(f.a.INFO, "CONNECTING after backoff");
            x0.this.M(vi.p.CONNECTING);
            x0.this.S();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (x0.this.f19219x.c() == vi.p.IDLE) {
                x0.this.f19206k.a(f.a.INFO, "CONNECTING as requested");
                x0.this.M(vi.p.CONNECTING);
                x0.this.S();
            }
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f19224a;

        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j1 j1Var = x0.this.f19214s;
                x0.this.f19213r = null;
                x0.this.f19214s = null;
                j1Var.d(vi.g1.f29115u.r("InternalSubchannel closed transport due to address change"));
            }
        }

        d(List list) {
            this.f19224a = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0094  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r7 = this;
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.x0$k r0 = io.grpc.internal.x0.I(r0)
                java.net.SocketAddress r0 = r0.a()
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0$k r1 = io.grpc.internal.x0.I(r1)
                java.util.List r2 = r7.f19224a
                r1.h(r2)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                java.util.List r2 = r7.f19224a
                io.grpc.internal.x0.J(r1, r2)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                vi.q r1 = io.grpc.internal.x0.i(r1)
                vi.p r1 = r1.c()
                vi.p r2 = vi.p.READY
                r3 = 0
                if (r1 == r2) goto L39
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                vi.q r1 = io.grpc.internal.x0.i(r1)
                vi.p r1 = r1.c()
                vi.p r4 = vi.p.CONNECTING
                if (r1 != r4) goto L91
            L39:
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0$k r1 = io.grpc.internal.x0.I(r1)
                boolean r0 = r1.g(r0)
                if (r0 != 0) goto L91
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                vi.q r0 = io.grpc.internal.x0.i(r0)
                vi.p r0 = r0.c()
                if (r0 != r2) goto L6d
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.j1 r0 = io.grpc.internal.x0.j(r0)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0.k(r1, r3)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0$k r1 = io.grpc.internal.x0.I(r1)
                r1.f()
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                vi.p r2 = vi.p.IDLE
                io.grpc.internal.x0.E(r1, r2)
                goto L92
            L6d:
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.v r0 = io.grpc.internal.x0.l(r0)
                vi.g1 r1 = vi.g1.f29115u
                java.lang.String r2 = "InternalSubchannel closed pending transport due to address change"
                vi.g1 r1 = r1.r(r2)
                r0.d(r1)
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.x0.m(r0, r3)
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.x0$k r0 = io.grpc.internal.x0.I(r0)
                r0.f()
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.x0.F(r0)
            L91:
                r0 = r3
            L92:
                if (r0 == 0) goto Le1
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                vi.k1$d r1 = io.grpc.internal.x0.n(r1)
                if (r1 == 0) goto Lc0
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.j1 r1 = io.grpc.internal.x0.p(r1)
                vi.g1 r2 = vi.g1.f29115u
                java.lang.String r4 = "InternalSubchannel closed transport early due to address change"
                vi.g1 r2 = r2.r(r4)
                r1.d(r2)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                vi.k1$d r1 = io.grpc.internal.x0.n(r1)
                r1.a()
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0.o(r1, r3)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0.q(r1, r3)
            Lc0:
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0.q(r1, r0)
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                vi.k1 r1 = io.grpc.internal.x0.s(r0)
                io.grpc.internal.x0$d$a r2 = new io.grpc.internal.x0$d$a
                r2.<init>()
                r3 = 5
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                io.grpc.internal.x0 r6 = io.grpc.internal.x0.this
                java.util.concurrent.ScheduledExecutorService r6 = io.grpc.internal.x0.r(r6)
                vi.k1$d r1 = r1.c(r2, r3, r5, r6)
                io.grpc.internal.x0.o(r0, r1)
            Le1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.x0.d.run():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ vi.g1 f19227a;

        e(vi.g1 g1Var) {
            this.f19227a = g1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            vi.p c10 = x0.this.f19219x.c();
            vi.p pVar = vi.p.SHUTDOWN;
            if (c10 == pVar) {
                return;
            }
            x0.this.f19220y = this.f19227a;
            j1 j1Var = x0.this.f19218w;
            v vVar = x0.this.f19217v;
            x0.this.f19218w = null;
            x0.this.f19217v = null;
            x0.this.M(pVar);
            x0.this.f19208m.f();
            if (x0.this.f19215t.isEmpty()) {
                x0.this.O();
            }
            x0.this.K();
            if (x0.this.f19213r != null) {
                x0.this.f19213r.a();
                x0.this.f19214s.d(this.f19227a);
                x0.this.f19213r = null;
                x0.this.f19214s = null;
            }
            if (j1Var != null) {
                j1Var.d(this.f19227a);
            }
            if (vVar != null) {
                vVar.d(this.f19227a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.f19206k.a(f.a.INFO, "Terminated");
            x0.this.f19200e.d(x0.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v f19230a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f19231b;

        g(v vVar, boolean z10) {
            this.f19230a = vVar;
            this.f19231b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.f19216u.e(this.f19230a, this.f19231b);
        }
    }

    /* loaded from: classes3.dex */
    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ vi.g1 f19233a;

        h(vi.g1 g1Var) {
            this.f19233a = g1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(x0.this.f19215t).iterator();
            while (it.hasNext()) {
                ((j1) it.next()).b(this.f19233a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class i extends j0 {

        /* renamed from: a, reason: collision with root package name */
        private final v f19235a;

        /* renamed from: b, reason: collision with root package name */
        private final io.grpc.internal.m f19236b;

        /* loaded from: classes3.dex */
        class a extends h0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f19237a;

            /* renamed from: io.grpc.internal.x0$i$a$a, reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            class C0301a extends i0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ r f19239a;

                C0301a(r rVar) {
                    this.f19239a = rVar;
                }

                @Override // io.grpc.internal.i0, io.grpc.internal.r
                public void d(vi.g1 g1Var, r.a aVar, vi.w0 w0Var) {
                    i.this.f19236b.a(g1Var.p());
                    super.d(g1Var, aVar, w0Var);
                }

                @Override // io.grpc.internal.i0
                protected r e() {
                    return this.f19239a;
                }
            }

            a(q qVar) {
                this.f19237a = qVar;
            }

            @Override // io.grpc.internal.h0, io.grpc.internal.q
            public void o(r rVar) {
                i.this.f19236b.b();
                super.o(new C0301a(rVar));
            }

            @Override // io.grpc.internal.h0
            protected q p() {
                return this.f19237a;
            }
        }

        private i(v vVar, io.grpc.internal.m mVar) {
            this.f19235a = vVar;
            this.f19236b = mVar;
        }

        /* synthetic */ i(v vVar, io.grpc.internal.m mVar, a aVar) {
            this(vVar, mVar);
        }

        @Override // io.grpc.internal.j0
        protected v a() {
            return this.f19235a;
        }

        @Override // io.grpc.internal.j0, io.grpc.internal.s
        public q c(vi.x0<?, ?> x0Var, vi.w0 w0Var, vi.c cVar, vi.k[] kVarArr) {
            return new a(super.c(x0Var, w0Var, cVar, kVarArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static abstract class j {
        abstract void a(x0 x0Var);

        abstract void b(x0 x0Var);

        abstract void c(x0 x0Var, vi.q qVar);

        abstract void d(x0 x0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class k {

        /* renamed from: a, reason: collision with root package name */
        private List<vi.x> f19241a;

        /* renamed from: b, reason: collision with root package name */
        private int f19242b;

        /* renamed from: c, reason: collision with root package name */
        private int f19243c;

        public k(List<vi.x> list) {
            this.f19241a = list;
        }

        public SocketAddress a() {
            return this.f19241a.get(this.f19242b).a().get(this.f19243c);
        }

        public vi.a b() {
            return this.f19241a.get(this.f19242b).b();
        }

        public void c() {
            vi.x xVar = this.f19241a.get(this.f19242b);
            int i10 = this.f19243c + 1;
            this.f19243c = i10;
            if (i10 >= xVar.a().size()) {
                this.f19242b++;
                this.f19243c = 0;
            }
        }

        public boolean d() {
            return this.f19242b == 0 && this.f19243c == 0;
        }

        public boolean e() {
            return this.f19242b < this.f19241a.size();
        }

        public void f() {
            this.f19242b = 0;
            this.f19243c = 0;
        }

        public boolean g(SocketAddress socketAddress) {
            for (int i10 = 0; i10 < this.f19241a.size(); i10++) {
                int indexOf = this.f19241a.get(i10).a().indexOf(socketAddress);
                if (indexOf != -1) {
                    this.f19242b = i10;
                    this.f19243c = indexOf;
                    return true;
                }
            }
            return false;
        }

        public void h(List<vi.x> list) {
            this.f19241a = list;
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class l implements j1.a {

        /* renamed from: a, reason: collision with root package name */
        final v f19244a;

        /* renamed from: b, reason: collision with root package name */
        final SocketAddress f19245b;

        /* renamed from: c, reason: collision with root package name */
        boolean f19246c = false;

        /* loaded from: classes3.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                x0.this.f19210o = null;
                if (x0.this.f19220y != null) {
                    eb.o.v(x0.this.f19218w == null, "Unexpected non-null activeTransport");
                    l lVar = l.this;
                    lVar.f19244a.d(x0.this.f19220y);
                    return;
                }
                v vVar = x0.this.f19217v;
                l lVar2 = l.this;
                v vVar2 = lVar2.f19244a;
                if (vVar == vVar2) {
                    x0.this.f19218w = vVar2;
                    x0.this.f19217v = null;
                    x0.this.M(vi.p.READY);
                }
            }
        }

        /* loaded from: classes3.dex */
        class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ vi.g1 f19249a;

            b(vi.g1 g1Var) {
                this.f19249a = g1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (x0.this.f19219x.c() == vi.p.SHUTDOWN) {
                    return;
                }
                j1 j1Var = x0.this.f19218w;
                l lVar = l.this;
                if (j1Var == lVar.f19244a) {
                    x0.this.f19218w = null;
                    x0.this.f19208m.f();
                    x0.this.M(vi.p.IDLE);
                    return;
                }
                v vVar = x0.this.f19217v;
                l lVar2 = l.this;
                if (vVar == lVar2.f19244a) {
                    eb.o.y(x0.this.f19219x.c() == vi.p.CONNECTING, "Expected state is CONNECTING, actual state is %s", x0.this.f19219x.c());
                    x0.this.f19208m.c();
                    if (x0.this.f19208m.e()) {
                        x0.this.S();
                        return;
                    }
                    x0.this.f19217v = null;
                    x0.this.f19208m.f();
                    x0.this.R(this.f19249a);
                }
            }
        }

        /* loaded from: classes3.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                x0.this.f19215t.remove(l.this.f19244a);
                if (x0.this.f19219x.c() == vi.p.SHUTDOWN && x0.this.f19215t.isEmpty()) {
                    x0.this.O();
                }
            }
        }

        l(v vVar, SocketAddress socketAddress) {
            this.f19244a = vVar;
            this.f19245b = socketAddress;
        }

        @Override // io.grpc.internal.j1.a
        public void a() {
            x0.this.f19206k.a(f.a.INFO, "READY");
            x0.this.f19207l.execute(new a());
        }

        @Override // io.grpc.internal.j1.a
        public void b(boolean z10) {
            x0.this.P(this.f19244a, z10);
        }

        @Override // io.grpc.internal.j1.a
        public void c() {
            eb.o.v(this.f19246c, "transportShutdown() must be called before transportTerminated().");
            x0.this.f19206k.b(f.a.INFO, "{0} Terminated", this.f19244a.e());
            x0.this.f19203h.i(this.f19244a);
            x0.this.P(this.f19244a, false);
            x0.this.f19207l.execute(new c());
        }

        @Override // io.grpc.internal.j1.a
        public void d(vi.g1 g1Var) {
            x0.this.f19206k.b(f.a.INFO, "{0} SHUTDOWN with {1}", this.f19244a.e(), x0.this.Q(g1Var));
            this.f19246c = true;
            x0.this.f19207l.execute(new b(g1Var));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class m extends vi.f {

        /* renamed from: a, reason: collision with root package name */
        vi.i0 f19252a;

        m() {
        }

        @Override // vi.f
        public void a(f.a aVar, String str) {
            n.d(this.f19252a, aVar, str);
        }

        @Override // vi.f
        public void b(f.a aVar, String str, Object... objArr) {
            n.e(this.f19252a, aVar, str, objArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0(List<vi.x> list, String str, String str2, k.a aVar, t tVar, ScheduledExecutorService scheduledExecutorService, eb.v<eb.t> vVar, vi.k1 k1Var, j jVar, vi.c0 c0Var, io.grpc.internal.m mVar, o oVar, vi.i0 i0Var, vi.f fVar) {
        eb.o.p(list, "addressGroups");
        eb.o.e(!list.isEmpty(), "addressGroups is empty");
        L(list, "addressGroups contains null entry");
        List<vi.x> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f19209n = unmodifiableList;
        this.f19208m = new k(unmodifiableList);
        this.f19197b = str;
        this.f19198c = str2;
        this.f19199d = aVar;
        this.f19201f = tVar;
        this.f19202g = scheduledExecutorService;
        this.f19211p = vVar.get();
        this.f19207l = k1Var;
        this.f19200e = jVar;
        this.f19203h = c0Var;
        this.f19204i = mVar;
        this.f19205j = (o) eb.o.p(oVar, "channelTracer");
        this.f19196a = (vi.i0) eb.o.p(i0Var, "logId");
        this.f19206k = (vi.f) eb.o.p(fVar, "channelLogger");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        this.f19207l.e();
        k1.d dVar = this.f19212q;
        if (dVar != null) {
            dVar.a();
            this.f19212q = null;
            this.f19210o = null;
        }
    }

    private static void L(List<?> list, String str) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            eb.o.p(it.next(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(vi.p pVar) {
        this.f19207l.e();
        N(vi.q.a(pVar));
    }

    private void N(vi.q qVar) {
        this.f19207l.e();
        if (this.f19219x.c() != qVar.c()) {
            eb.o.v(this.f19219x.c() != vi.p.SHUTDOWN, "Cannot transition out of SHUTDOWN to " + qVar);
            this.f19219x = qVar;
            this.f19200e.c(this, qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        this.f19207l.execute(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(v vVar, boolean z10) {
        this.f19207l.execute(new g(vVar, z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String Q(vi.g1 g1Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g1Var.n());
        if (g1Var.o() != null) {
            sb2.append("(");
            sb2.append(g1Var.o());
            sb2.append(")");
        }
        if (g1Var.m() != null) {
            sb2.append("[");
            sb2.append(g1Var.m());
            sb2.append("]");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(vi.g1 g1Var) {
        this.f19207l.e();
        N(vi.q.b(g1Var));
        if (this.f19210o == null) {
            this.f19210o = this.f19199d.get();
        }
        long a10 = this.f19210o.a();
        eb.t tVar = this.f19211p;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long d10 = a10 - tVar.d(timeUnit);
        this.f19206k.b(f.a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", Q(g1Var), Long.valueOf(d10));
        eb.o.v(this.f19212q == null, "previous reconnectTask is not done");
        this.f19212q = this.f19207l.c(new b(), d10, timeUnit, this.f19202g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        SocketAddress socketAddress;
        vi.b0 b0Var;
        this.f19207l.e();
        eb.o.v(this.f19212q == null, "Should have no reconnectTask scheduled");
        if (this.f19208m.d()) {
            this.f19211p.f().g();
        }
        SocketAddress a10 = this.f19208m.a();
        a aVar = null;
        if (a10 instanceof vi.b0) {
            b0Var = (vi.b0) a10;
            socketAddress = b0Var.c();
        } else {
            socketAddress = a10;
            b0Var = null;
        }
        vi.a b10 = this.f19208m.b();
        String str = (String) b10.b(vi.x.f29239d);
        t.a aVar2 = new t.a();
        if (str == null) {
            str = this.f19197b;
        }
        t.a g10 = aVar2.e(str).f(b10).h(this.f19198c).g(b0Var);
        m mVar = new m();
        mVar.f19252a = e();
        i iVar = new i(this.f19201f.h1(socketAddress, g10, mVar), this.f19204i, aVar);
        mVar.f19252a = iVar.e();
        this.f19203h.c(iVar);
        this.f19217v = iVar;
        this.f19215t.add(iVar);
        Runnable g11 = iVar.g(new l(iVar, socketAddress));
        if (g11 != null) {
            this.f19207l.b(g11);
        }
        this.f19206k.b(f.a.INFO, "Started transport {0}", mVar.f19252a);
    }

    public void T(List<vi.x> list) {
        eb.o.p(list, "newAddressGroups");
        L(list, "newAddressGroups contains null entry");
        eb.o.e(!list.isEmpty(), "newAddressGroups is empty");
        this.f19207l.execute(new d(Collections.unmodifiableList(new ArrayList(list))));
    }

    @Override // io.grpc.internal.m2
    public s a() {
        j1 j1Var = this.f19218w;
        if (j1Var != null) {
            return j1Var;
        }
        this.f19207l.execute(new c());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(vi.g1 g1Var) {
        d(g1Var);
        this.f19207l.execute(new h(g1Var));
    }

    public void d(vi.g1 g1Var) {
        this.f19207l.execute(new e(g1Var));
    }

    @Override // vi.n0
    public vi.i0 e() {
        return this.f19196a;
    }

    public String toString() {
        return eb.i.c(this).c("logId", this.f19196a.d()).d("addressGroups", this.f19209n).toString();
    }
}
