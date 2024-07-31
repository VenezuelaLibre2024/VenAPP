package io.grpc.internal;

import io.flutter.plugins.firebase.crashlytics.Constants;
import io.grpc.internal.i1;
import io.grpc.internal.j2;
import io.grpc.internal.r;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import vi.g;
import vi.g1;
import vi.l;
import vi.r;
import vi.w0;
import vi.x0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class p<ReqT, RespT> extends vi.g<ReqT, RespT> {

    /* renamed from: t, reason: collision with root package name */
    private static final Logger f19026t = Logger.getLogger(p.class.getName());

    /* renamed from: u, reason: collision with root package name */
    private static final byte[] f19027u = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* renamed from: v, reason: collision with root package name */
    private static final double f19028v = TimeUnit.SECONDS.toNanos(1) * 1.0d;

    /* renamed from: a, reason: collision with root package name */
    private final vi.x0<ReqT, RespT> f19029a;

    /* renamed from: b, reason: collision with root package name */
    private final cj.d f19030b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f19031c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f19032d;

    /* renamed from: e, reason: collision with root package name */
    private final m f19033e;

    /* renamed from: f, reason: collision with root package name */
    private final vi.r f19034f;

    /* renamed from: g, reason: collision with root package name */
    private volatile ScheduledFuture<?> f19035g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f19036h;

    /* renamed from: i, reason: collision with root package name */
    private vi.c f19037i;

    /* renamed from: j, reason: collision with root package name */
    private q f19038j;

    /* renamed from: k, reason: collision with root package name */
    private volatile boolean f19039k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f19040l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f19041m;

    /* renamed from: n, reason: collision with root package name */
    private final e f19042n;

    /* renamed from: p, reason: collision with root package name */
    private final ScheduledExecutorService f19044p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19045q;

    /* renamed from: o, reason: collision with root package name */
    private final p<ReqT, RespT>.f f19043o = new f();

    /* renamed from: r, reason: collision with root package name */
    private vi.v f19046r = vi.v.c();

    /* renamed from: s, reason: collision with root package name */
    private vi.o f19047s = vi.o.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends x {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.a f19048b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g.a aVar) {
            super(p.this.f19034f);
            this.f19048b = aVar;
        }

        @Override // io.grpc.internal.x
        public void a() {
            p pVar = p.this;
            pVar.r(this.f19048b, vi.s.a(pVar.f19034f), new vi.w0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends x {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g.a f19050b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f19051c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(g.a aVar, String str) {
            super(p.this.f19034f);
            this.f19050b = aVar;
            this.f19051c = str;
        }

        @Override // io.grpc.internal.x
        public void a() {
            p.this.r(this.f19050b, vi.g1.f29114t.r(String.format("Unable to find compressor by name %s", this.f19051c)), new vi.w0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class d implements r {

        /* renamed from: a, reason: collision with root package name */
        private final g.a<RespT> f19053a;

        /* renamed from: b, reason: collision with root package name */
        private vi.g1 f19054b;

        /* loaded from: classes3.dex */
        final class a extends x {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ cj.b f19056b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ vi.w0 f19057c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(cj.b bVar, vi.w0 w0Var) {
                super(p.this.f19034f);
                this.f19056b = bVar;
                this.f19057c = w0Var;
            }

            private void b() {
                if (d.this.f19054b != null) {
                    return;
                }
                try {
                    d.this.f19053a.b(this.f19057c);
                } catch (Throwable th2) {
                    d.this.i(vi.g1.f29101g.q(th2).r("Failed to read headers"));
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                cj.c.g("ClientCall$Listener.headersRead", p.this.f19030b);
                cj.c.d(this.f19056b);
                try {
                    b();
                } finally {
                    cj.c.i("ClientCall$Listener.headersRead", p.this.f19030b);
                }
            }
        }

        /* loaded from: classes3.dex */
        final class b extends x {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ cj.b f19059b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ j2.a f19060c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(cj.b bVar, j2.a aVar) {
                super(p.this.f19034f);
                this.f19059b = bVar;
                this.f19060c = aVar;
            }

            private void b() {
                if (d.this.f19054b != null) {
                    q0.d(this.f19060c);
                    return;
                }
                while (true) {
                    try {
                        InputStream next = this.f19060c.next();
                        if (next == null) {
                            return;
                        }
                        try {
                            d.this.f19053a.c(p.this.f19029a.i(next));
                            next.close();
                        } catch (Throwable th2) {
                            q0.e(next);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        q0.d(this.f19060c);
                        d.this.i(vi.g1.f29101g.q(th3).r("Failed to read message."));
                        return;
                    }
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                cj.c.g("ClientCall$Listener.messagesAvailable", p.this.f19030b);
                cj.c.d(this.f19059b);
                try {
                    b();
                } finally {
                    cj.c.i("ClientCall$Listener.messagesAvailable", p.this.f19030b);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public final class c extends x {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ cj.b f19062b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ vi.g1 f19063c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ vi.w0 f19064d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(cj.b bVar, vi.g1 g1Var, vi.w0 w0Var) {
                super(p.this.f19034f);
                this.f19062b = bVar;
                this.f19063c = g1Var;
                this.f19064d = w0Var;
            }

            private void b() {
                vi.g1 g1Var = this.f19063c;
                vi.w0 w0Var = this.f19064d;
                if (d.this.f19054b != null) {
                    g1Var = d.this.f19054b;
                    w0Var = new vi.w0();
                }
                p.this.f19039k = true;
                try {
                    d dVar = d.this;
                    p.this.r(dVar.f19053a, g1Var, w0Var);
                } finally {
                    p.this.y();
                    p.this.f19033e.a(g1Var.p());
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                cj.c.g("ClientCall$Listener.onClose", p.this.f19030b);
                cj.c.d(this.f19062b);
                try {
                    b();
                } finally {
                    cj.c.i("ClientCall$Listener.onClose", p.this.f19030b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$d$d, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C0300d extends x {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ cj.b f19066b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0300d(cj.b bVar) {
                super(p.this.f19034f);
                this.f19066b = bVar;
            }

            private void b() {
                if (d.this.f19054b != null) {
                    return;
                }
                try {
                    d.this.f19053a.d();
                } catch (Throwable th2) {
                    d.this.i(vi.g1.f29101g.q(th2).r("Failed to call onReady."));
                }
            }

            @Override // io.grpc.internal.x
            public void a() {
                cj.c.g("ClientCall$Listener.onReady", p.this.f19030b);
                cj.c.d(this.f19066b);
                try {
                    b();
                } finally {
                    cj.c.i("ClientCall$Listener.onReady", p.this.f19030b);
                }
            }
        }

        public d(g.a<RespT> aVar) {
            this.f19053a = (g.a) eb.o.p(aVar, "observer");
        }

        private void h(vi.g1 g1Var, r.a aVar, vi.w0 w0Var) {
            vi.t s10 = p.this.s();
            if (g1Var.n() == g1.b.CANCELLED && s10 != null && s10.o()) {
                w0 w0Var2 = new w0();
                p.this.f19038j.m(w0Var2);
                g1Var = vi.g1.f29104j.f("ClientCall was cancelled at or after deadline. " + w0Var2);
                w0Var = new vi.w0();
            }
            p.this.f19031c.execute(new c(cj.c.e(), g1Var, w0Var));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i(vi.g1 g1Var) {
            this.f19054b = g1Var;
            p.this.f19038j.c(g1Var);
        }

        @Override // io.grpc.internal.j2
        public void a(j2.a aVar) {
            cj.c.g("ClientStreamListener.messagesAvailable", p.this.f19030b);
            try {
                p.this.f19031c.execute(new b(cj.c.e(), aVar));
            } finally {
                cj.c.i("ClientStreamListener.messagesAvailable", p.this.f19030b);
            }
        }

        @Override // io.grpc.internal.r
        public void b(vi.w0 w0Var) {
            cj.c.g("ClientStreamListener.headersRead", p.this.f19030b);
            try {
                p.this.f19031c.execute(new a(cj.c.e(), w0Var));
            } finally {
                cj.c.i("ClientStreamListener.headersRead", p.this.f19030b);
            }
        }

        @Override // io.grpc.internal.j2
        public void c() {
            if (p.this.f19029a.e().b()) {
                return;
            }
            cj.c.g("ClientStreamListener.onReady", p.this.f19030b);
            try {
                p.this.f19031c.execute(new C0300d(cj.c.e()));
            } finally {
                cj.c.i("ClientStreamListener.onReady", p.this.f19030b);
            }
        }

        @Override // io.grpc.internal.r
        public void d(vi.g1 g1Var, r.a aVar, vi.w0 w0Var) {
            cj.c.g("ClientStreamListener.closed", p.this.f19030b);
            try {
                h(g1Var, aVar, w0Var);
            } finally {
                cj.c.i("ClientStreamListener.closed", p.this.f19030b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface e {
        q a(vi.x0<?, ?> x0Var, vi.c cVar, vi.w0 w0Var, vi.r rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class f implements r.a {
        private f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final long f19069a;

        g(long j10) {
            this.f19069a = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            w0 w0Var = new w0();
            p.this.f19038j.m(w0Var);
            long abs = Math.abs(this.f19069a);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = abs / timeUnit.toNanos(1L);
            long abs2 = Math.abs(this.f19069a) % timeUnit.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deadline exceeded after ");
            if (this.f19069a < 0) {
                sb2.append('-');
            }
            sb2.append(nanos);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb2.append("s. ");
            sb2.append(w0Var);
            p.this.f19038j.c(vi.g1.f29104j.f(sb2.toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(vi.x0<ReqT, RespT> x0Var, Executor executor, vi.c cVar, e eVar, ScheduledExecutorService scheduledExecutorService, m mVar, vi.e0 e0Var) {
        this.f19029a = x0Var;
        cj.d b10 = cj.c.b(x0Var.c(), System.identityHashCode(this));
        this.f19030b = b10;
        boolean z10 = true;
        if (executor == com.google.common.util.concurrent.g.a()) {
            this.f19031c = new b2();
            this.f19032d = true;
        } else {
            this.f19031c = new c2(executor);
            this.f19032d = false;
        }
        this.f19033e = mVar;
        this.f19034f = vi.r.e();
        if (x0Var.e() != x0.d.UNARY && x0Var.e() != x0.d.SERVER_STREAMING) {
            z10 = false;
        }
        this.f19036h = z10;
        this.f19037i = cVar;
        this.f19042n = eVar;
        this.f19044p = scheduledExecutorService;
        cj.c.c("ClientCall.<init>", b10);
    }

    private ScheduledFuture<?> D(vi.t tVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long q10 = tVar.q(timeUnit);
        return this.f19044p.schedule(new c1(new g(q10)), q10, timeUnit);
    }

    private void E(g.a<RespT> aVar, vi.w0 w0Var) {
        vi.n nVar;
        eb.o.v(this.f19038j == null, "Already started");
        eb.o.v(!this.f19040l, "call was cancelled");
        eb.o.p(aVar, "observer");
        eb.o.p(w0Var, "headers");
        if (this.f19034f.h()) {
            this.f19038j = n1.f19003a;
            this.f19031c.execute(new b(aVar));
            return;
        }
        p();
        String b10 = this.f19037i.b();
        if (b10 != null) {
            nVar = this.f19047s.b(b10);
            if (nVar == null) {
                this.f19038j = n1.f19003a;
                this.f19031c.execute(new c(aVar, b10));
                return;
            }
        } else {
            nVar = l.b.f29160a;
        }
        x(w0Var, this.f19046r, nVar, this.f19045q);
        vi.t s10 = s();
        if (s10 != null && s10.o()) {
            this.f19038j = new f0(vi.g1.f29104j.r(String.format("ClientCall started after %s deadline was exceeded .9%f seconds ago", u(this.f19037i.d(), this.f19034f.g()) ? "CallOptions" : "Context", Double.valueOf(s10.q(TimeUnit.NANOSECONDS) / f19028v))), q0.f(this.f19037i, w0Var, 0, false));
        } else {
            v(s10, this.f19034f.g(), this.f19037i.d());
            this.f19038j = this.f19042n.a(this.f19029a, this.f19037i, w0Var, this.f19034f);
        }
        if (this.f19032d) {
            this.f19038j.i();
        }
        if (this.f19037i.a() != null) {
            this.f19038j.l(this.f19037i.a());
        }
        if (this.f19037i.f() != null) {
            this.f19038j.e(this.f19037i.f().intValue());
        }
        if (this.f19037i.g() != null) {
            this.f19038j.f(this.f19037i.g().intValue());
        }
        if (s10 != null) {
            this.f19038j.g(s10);
        }
        this.f19038j.a(nVar);
        boolean z10 = this.f19045q;
        if (z10) {
            this.f19038j.j(z10);
        }
        this.f19038j.k(this.f19046r);
        this.f19033e.b();
        this.f19038j.o(new d(aVar));
        this.f19034f.a(this.f19043o, com.google.common.util.concurrent.g.a());
        if (s10 != null && !s10.equals(this.f19034f.g()) && this.f19044p != null) {
            this.f19035g = D(s10);
        }
        if (this.f19039k) {
            y();
        }
    }

    private void p() {
        i1.b bVar = (i1.b) this.f19037i.h(i1.b.f18908g);
        if (bVar == null) {
            return;
        }
        Long l10 = bVar.f18909a;
        if (l10 != null) {
            vi.t b10 = vi.t.b(l10.longValue(), TimeUnit.NANOSECONDS);
            vi.t d10 = this.f19037i.d();
            if (d10 == null || b10.compareTo(d10) < 0) {
                this.f19037i = this.f19037i.l(b10);
            }
        }
        Boolean bool = bVar.f18910b;
        if (bool != null) {
            this.f19037i = bool.booleanValue() ? this.f19037i.s() : this.f19037i.t();
        }
        if (bVar.f18911c != null) {
            Integer f10 = this.f19037i.f();
            this.f19037i = f10 != null ? this.f19037i.o(Math.min(f10.intValue(), bVar.f18911c.intValue())) : this.f19037i.o(bVar.f18911c.intValue());
        }
        if (bVar.f18912d != null) {
            Integer g10 = this.f19037i.g();
            this.f19037i = g10 != null ? this.f19037i.p(Math.min(g10.intValue(), bVar.f18912d.intValue())) : this.f19037i.p(bVar.f18912d.intValue());
        }
    }

    private void q(String str, Throwable th2) {
        if (str == null && th2 == null) {
            th2 = new CancellationException("Cancelled without a message or cause");
            f19026t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th2);
        }
        if (this.f19040l) {
            return;
        }
        this.f19040l = true;
        try {
            if (this.f19038j != null) {
                vi.g1 g1Var = vi.g1.f29101g;
                if (str == null) {
                    str = "Call cancelled without message";
                }
                vi.g1 r10 = g1Var.r(str);
                if (th2 != null) {
                    r10 = r10.q(th2);
                }
                this.f19038j.c(r10);
            }
        } finally {
            y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(g.a<RespT> aVar, vi.g1 g1Var, vi.w0 w0Var) {
        aVar.a(g1Var, w0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public vi.t s() {
        return w(this.f19037i.d(), this.f19034f.g());
    }

    private void t() {
        eb.o.v(this.f19038j != null, "Not started");
        eb.o.v(!this.f19040l, "call was cancelled");
        eb.o.v(!this.f19041m, "call already half-closed");
        this.f19041m = true;
        this.f19038j.n();
    }

    private static boolean u(vi.t tVar, vi.t tVar2) {
        if (tVar == null) {
            return false;
        }
        if (tVar2 == null) {
            return true;
        }
        return tVar.n(tVar2);
    }

    private static void v(vi.t tVar, vi.t tVar2, vi.t tVar3) {
        Logger logger = f19026t;
        if (logger.isLoggable(Level.FINE) && tVar != null && tVar.equals(tVar2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long max = Math.max(0L, tVar.q(timeUnit));
            Locale locale = Locale.US;
            StringBuilder sb2 = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(max)));
            sb2.append(tVar3 == null ? " Explicit call timeout was not set." : String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(tVar3.q(timeUnit))));
            logger.fine(sb2.toString());
        }
    }

    private static vi.t w(vi.t tVar, vi.t tVar2) {
        return tVar == null ? tVar2 : tVar2 == null ? tVar : tVar.p(tVar2);
    }

    static void x(vi.w0 w0Var, vi.v vVar, vi.n nVar, boolean z10) {
        w0Var.e(q0.f19089i);
        w0.g<String> gVar = q0.f19085e;
        w0Var.e(gVar);
        if (nVar != l.b.f29160a) {
            w0Var.o(gVar, nVar.a());
        }
        w0.g<byte[]> gVar2 = q0.f19086f;
        w0Var.e(gVar2);
        byte[] a10 = vi.f0.a(vVar);
        if (a10.length != 0) {
            w0Var.o(gVar2, a10);
        }
        w0Var.e(q0.f19087g);
        w0.g<byte[]> gVar3 = q0.f19088h;
        w0Var.e(gVar3);
        if (z10) {
            w0Var.o(gVar3, f19027u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        this.f19034f.i(this.f19043o);
        ScheduledFuture<?> scheduledFuture = this.f19035g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    private void z(ReqT reqt) {
        eb.o.v(this.f19038j != null, "Not started");
        eb.o.v(!this.f19040l, "call was cancelled");
        eb.o.v(!this.f19041m, "call was half-closed");
        try {
            q qVar = this.f19038j;
            if (qVar instanceof y1) {
                ((y1) qVar).n0(reqt);
            } else {
                qVar.h(this.f19029a.j(reqt));
            }
            if (this.f19036h) {
                return;
            }
            this.f19038j.flush();
        } catch (Error e10) {
            this.f19038j.c(vi.g1.f29101g.r("Client sendMessage() failed with Error"));
            throw e10;
        } catch (RuntimeException e11) {
            this.f19038j.c(vi.g1.f29101g.q(e11).r("Failed to stream message"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p<ReqT, RespT> A(vi.o oVar) {
        this.f19047s = oVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p<ReqT, RespT> B(vi.v vVar) {
        this.f19046r = vVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p<ReqT, RespT> C(boolean z10) {
        this.f19045q = z10;
        return this;
    }

    @Override // vi.g
    public void a(String str, Throwable th2) {
        cj.c.g("ClientCall.cancel", this.f19030b);
        try {
            q(str, th2);
        } finally {
            cj.c.i("ClientCall.cancel", this.f19030b);
        }
    }

    @Override // vi.g
    public void b() {
        cj.c.g("ClientCall.halfClose", this.f19030b);
        try {
            t();
        } finally {
            cj.c.i("ClientCall.halfClose", this.f19030b);
        }
    }

    @Override // vi.g
    public void c(int i10) {
        cj.c.g("ClientCall.request", this.f19030b);
        try {
            boolean z10 = true;
            eb.o.v(this.f19038j != null, "Not started");
            if (i10 < 0) {
                z10 = false;
            }
            eb.o.e(z10, "Number requested must be non-negative");
            this.f19038j.b(i10);
        } finally {
            cj.c.i("ClientCall.request", this.f19030b);
        }
    }

    @Override // vi.g
    public void d(ReqT reqt) {
        cj.c.g("ClientCall.sendMessage", this.f19030b);
        try {
            z(reqt);
        } finally {
            cj.c.i("ClientCall.sendMessage", this.f19030b);
        }
    }

    @Override // vi.g
    public void e(g.a<RespT> aVar, vi.w0 w0Var) {
        cj.c.g("ClientCall.start", this.f19030b);
        try {
            E(aVar, w0Var);
        } finally {
            cj.c.i("ClientCall.start", this.f19030b);
        }
    }

    public String toString() {
        return eb.i.c(this).d(Constants.METHOD, this.f19029a).toString();
    }
}
