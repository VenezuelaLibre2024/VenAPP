package io.grpc.internal;

import com.google.common.util.concurrent.C5921g;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.grpc.internal.C8859i1;
import io.grpc.internal.InterfaceC8864j2;
import io.grpc.internal.InterfaceC8892r;
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
import p044cj.C2013b;
import p044cj.C2014c;
import p044cj.C2015d;
import p082eb.C7153i;
import p082eb.C7159o;
import vi.AbstractC11908e0;
import vi.AbstractC11913g;
import vi.C11901c;
import vi.C11911f0;
import vi.C11915g1;
import vi.C11936o;
import vi.C11942r;
import vi.C11944s;
import vi.C11946t;
import vi.C11950v;
import vi.C11953w0;
import vi.C11955x0;
import vi.InterfaceC11928l;
import vi.InterfaceC11934n;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.grpc.internal.p */
/* loaded from: classes3.dex */
public final class C8885p<ReqT, RespT> extends AbstractC11913g<ReqT, RespT> {

    /* renamed from: t */
    private static final Logger f20773t = Logger.getLogger(C8885p.class.getName());

    /* renamed from: u */
    private static final byte[] f20774u = "gzip".getBytes(Charset.forName("US-ASCII"));

    /* renamed from: v */
    private static final double f20775v = TimeUnit.SECONDS.toNanos(1) * 1.0d;

    /* renamed from: a */
    private final C11955x0<ReqT, RespT> f20776a;

    /* renamed from: b */
    private final C2015d f20777b;

    /* renamed from: c */
    private final Executor f20778c;

    /* renamed from: d */
    private final boolean f20779d;

    /* renamed from: e */
    private final C8873m f20780e;

    /* renamed from: f */
    private final C11942r f20781f;

    /* renamed from: g */
    private volatile ScheduledFuture<?> f20782g;

    /* renamed from: h */
    private final boolean f20783h;

    /* renamed from: i */
    private C11901c f20784i;

    /* renamed from: j */
    private InterfaceC8889q f20785j;

    /* renamed from: k */
    private volatile boolean f20786k;

    /* renamed from: l */
    private boolean f20787l;

    /* renamed from: m */
    private boolean f20788m;

    /* renamed from: n */
    private final e f20789n;

    /* renamed from: p */
    private final ScheduledExecutorService f20791p;

    /* renamed from: q */
    private boolean f20792q;

    /* renamed from: o */
    private final C8885p<ReqT, RespT>.f f20790o = new f();

    /* renamed from: r */
    private C11950v f20793r = C11950v.m38278c();

    /* renamed from: s */
    private C11936o f20794s = C11936o.m38206a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.p$b */
    /* loaded from: classes3.dex */
    public class b extends AbstractRunnableC8910x {

        /* renamed from: b */
        final /* synthetic */ AbstractC11913g.a f20795b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC11913g.a aVar) {
            super(C8885p.this.f20781f);
            this.f20795b = aVar;
        }

        @Override // io.grpc.internal.AbstractRunnableC8910x
        /* renamed from: a */
        public void mo25535a() {
            C8885p c8885p = C8885p.this;
            c8885p.m25721r(this.f20795b, C11944s.m38261a(c8885p.f20781f), new C11953w0());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.p$c */
    /* loaded from: classes3.dex */
    public class c extends AbstractRunnableC8910x {

        /* renamed from: b */
        final /* synthetic */ AbstractC11913g.a f20797b;

        /* renamed from: c */
        final /* synthetic */ String f20798c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC11913g.a aVar, String str) {
            super(C8885p.this.f20781f);
            this.f20797b = aVar;
            this.f20798c = str;
        }

        @Override // io.grpc.internal.AbstractRunnableC8910x
        /* renamed from: a */
        public void mo25535a() {
            C8885p.this.m25721r(this.f20797b, C11915g1.f31548t.m38147r(String.format("Unable to find compressor by name %s", this.f20798c)), new C11953w0());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.p$d */
    /* loaded from: classes3.dex */
    public class d implements InterfaceC8892r {

        /* renamed from: a */
        private final AbstractC11913g.a<RespT> f20800a;

        /* renamed from: b */
        private C11915g1 f20801b;

        /* renamed from: io.grpc.internal.p$d$a */
        /* loaded from: classes3.dex */
        final class a extends AbstractRunnableC8910x {

            /* renamed from: b */
            final /* synthetic */ C2013b f20803b;

            /* renamed from: c */
            final /* synthetic */ C11953w0 f20804c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C2013b c2013b, C11953w0 c11953w0) {
                super(C8885p.this.f20781f);
                this.f20803b = c2013b;
                this.f20804c = c11953w0;
            }

            /* renamed from: b */
            private void m25738b() {
                if (d.this.f20801b != null) {
                    return;
                }
                try {
                    d.this.f20800a.mo598b(this.f20804c);
                } catch (Throwable th2) {
                    d.this.m25737i(C11915g1.f31535g.m38146q(th2).m38147r("Failed to read headers"));
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC8910x
            /* renamed from: a */
            public void mo25535a() {
                C2014c.m10323g("ClientCall$Listener.headersRead", C8885p.this.f20777b);
                C2014c.m10320d(this.f20803b);
                try {
                    m25738b();
                } finally {
                    C2014c.m10325i("ClientCall$Listener.headersRead", C8885p.this.f20777b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$d$b */
        /* loaded from: classes3.dex */
        final class b extends AbstractRunnableC8910x {

            /* renamed from: b */
            final /* synthetic */ C2013b f20806b;

            /* renamed from: c */
            final /* synthetic */ InterfaceC8864j2.a f20807c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(C2013b c2013b, InterfaceC8864j2.a aVar) {
                super(C8885p.this.f20781f);
                this.f20806b = c2013b;
                this.f20807c = aVar;
            }

            /* renamed from: b */
            private void m25739b() {
                if (d.this.f20801b != null) {
                    C8890q0.m25747d(this.f20807c);
                    return;
                }
                while (true) {
                    try {
                        InputStream next = this.f20807c.next();
                        if (next == null) {
                            return;
                        }
                        try {
                            d.this.f20800a.mo599c(C8885p.this.f20776a.m38345i(next));
                            next.close();
                        } catch (Throwable th2) {
                            C8890q0.m25748e(next);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        C8890q0.m25747d(this.f20807c);
                        d.this.m25737i(C11915g1.f31535g.m38146q(th3).m38147r("Failed to read message."));
                        return;
                    }
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC8910x
            /* renamed from: a */
            public void mo25535a() {
                C2014c.m10323g("ClientCall$Listener.messagesAvailable", C8885p.this.f20777b);
                C2014c.m10320d(this.f20806b);
                try {
                    m25739b();
                } finally {
                    C2014c.m10325i("ClientCall$Listener.messagesAvailable", C8885p.this.f20777b);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: io.grpc.internal.p$d$c */
        /* loaded from: classes3.dex */
        public final class c extends AbstractRunnableC8910x {

            /* renamed from: b */
            final /* synthetic */ C2013b f20809b;

            /* renamed from: c */
            final /* synthetic */ C11915g1 f20810c;

            /* renamed from: d */
            final /* synthetic */ C11953w0 f20811d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(C2013b c2013b, C11915g1 c11915g1, C11953w0 c11953w0) {
                super(C8885p.this.f20781f);
                this.f20809b = c2013b;
                this.f20810c = c11915g1;
                this.f20811d = c11953w0;
            }

            /* renamed from: b */
            private void m25740b() {
                C11915g1 c11915g1 = this.f20810c;
                C11953w0 c11953w0 = this.f20811d;
                if (d.this.f20801b != null) {
                    c11915g1 = d.this.f20801b;
                    c11953w0 = new C11953w0();
                }
                C8885p.this.f20786k = true;
                try {
                    d dVar = d.this;
                    C8885p.this.m25721r(dVar.f20800a, c11915g1, c11953w0);
                } finally {
                    C8885p.this.m25728y();
                    C8885p.this.f20780e.m25669a(c11915g1.m38145p());
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC8910x
            /* renamed from: a */
            public void mo25535a() {
                C2014c.m10323g("ClientCall$Listener.onClose", C8885p.this.f20777b);
                C2014c.m10320d(this.f20809b);
                try {
                    m25740b();
                } finally {
                    C2014c.m10325i("ClientCall$Listener.onClose", C8885p.this.f20777b);
                }
            }
        }

        /* renamed from: io.grpc.internal.p$d$d, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        final class C13216d extends AbstractRunnableC8910x {

            /* renamed from: b */
            final /* synthetic */ C2013b f20813b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C13216d(C2013b c2013b) {
                super(C8885p.this.f20781f);
                this.f20813b = c2013b;
            }

            /* renamed from: b */
            private void m25741b() {
                if (d.this.f20801b != null) {
                    return;
                }
                try {
                    d.this.f20800a.mo26028d();
                } catch (Throwable th2) {
                    d.this.m25737i(C11915g1.f31535g.m38146q(th2).m38147r("Failed to call onReady."));
                }
            }

            @Override // io.grpc.internal.AbstractRunnableC8910x
            /* renamed from: a */
            public void mo25535a() {
                C2014c.m10323g("ClientCall$Listener.onReady", C8885p.this.f20777b);
                C2014c.m10320d(this.f20813b);
                try {
                    m25741b();
                } finally {
                    C2014c.m10325i("ClientCall$Listener.onReady", C8885p.this.f20777b);
                }
            }
        }

        public d(AbstractC11913g.a<RespT> aVar) {
            this.f20800a = (AbstractC11913g.a) C7159o.m21313p(aVar, "observer");
        }

        /* renamed from: h */
        private void m25736h(C11915g1 c11915g1, InterfaceC8892r.a aVar, C11953w0 c11953w0) {
            C11946t m25722s = C8885p.this.m25722s();
            if (c11915g1.m38143n() == C11915g1.b.CANCELLED && m25722s != null && m25722s.m38268o()) {
                C8908w0 c8908w0 = new C8908w0();
                C8885p.this.f20785j.mo25201m(c8908w0);
                c11915g1 = C11915g1.f31538j.m38141f("ClientCall was cancelled at or after deadline. " + c8908w0);
                c11953w0 = new C11953w0();
            }
            C8885p.this.f20778c.execute(new c(C2014c.m10321e(), c11915g1, c11953w0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public void m25737i(C11915g1 c11915g1) {
            this.f20801b = c11915g1;
            C8885p.this.f20785j.mo25194c(c11915g1);
        }

        @Override // io.grpc.internal.InterfaceC8864j2
        /* renamed from: a */
        public void mo25290a(InterfaceC8864j2.a aVar) {
            C2014c.m10323g("ClientStreamListener.messagesAvailable", C8885p.this.f20777b);
            try {
                C8885p.this.f20778c.execute(new b(C2014c.m10321e(), aVar));
            } finally {
                C2014c.m10325i("ClientStreamListener.messagesAvailable", C8885p.this.f20777b);
            }
        }

        @Override // io.grpc.internal.InterfaceC8892r
        /* renamed from: b */
        public void mo25291b(C11953w0 c11953w0) {
            C2014c.m10323g("ClientStreamListener.headersRead", C8885p.this.f20777b);
            try {
                C8885p.this.f20778c.execute(new a(C2014c.m10321e(), c11953w0));
            } finally {
                C2014c.m10325i("ClientStreamListener.headersRead", C8885p.this.f20777b);
            }
        }

        @Override // io.grpc.internal.InterfaceC8864j2
        /* renamed from: c */
        public void mo25292c() {
            if (C8885p.this.f20776a.m38343e().m38355b()) {
                return;
            }
            C2014c.m10323g("ClientStreamListener.onReady", C8885p.this.f20777b);
            try {
                C8885p.this.f20778c.execute(new C13216d(C2014c.m10321e()));
            } finally {
                C2014c.m10325i("ClientStreamListener.onReady", C8885p.this.f20777b);
            }
        }

        @Override // io.grpc.internal.InterfaceC8892r
        /* renamed from: d */
        public void mo25293d(C11915g1 c11915g1, InterfaceC8892r.a aVar, C11953w0 c11953w0) {
            C2014c.m10323g("ClientStreamListener.closed", C8885p.this.f20777b);
            try {
                m25736h(c11915g1, aVar, c11953w0);
            } finally {
                C2014c.m10325i("ClientStreamListener.closed", C8885p.this.f20777b);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.p$e */
    /* loaded from: classes3.dex */
    public interface e {
        /* renamed from: a */
        InterfaceC8889q mo25528a(C11955x0<?, ?> c11955x0, C11901c c11901c, C11953w0 c11953w0, C11942r c11942r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.p$f */
    /* loaded from: classes3.dex */
    public final class f implements C11942r.a {
        private f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.grpc.internal.p$g */
    /* loaded from: classes3.dex */
    public class g implements Runnable {

        /* renamed from: a */
        private final long f20816a;

        g(long j10) {
            this.f20816a = j10;
        }

        @Override // java.lang.Runnable
        public void run() {
            C8908w0 c8908w0 = new C8908w0();
            C8885p.this.f20785j.mo25201m(c8908w0);
            long abs = Math.abs(this.f20816a);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long nanos = abs / timeUnit.toNanos(1L);
            long abs2 = Math.abs(this.f20816a) % timeUnit.toNanos(1L);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("deadline exceeded after ");
            if (this.f20816a < 0) {
                sb2.append('-');
            }
            sb2.append(nanos);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb2.append("s. ");
            sb2.append(c8908w0);
            C8885p.this.f20785j.mo25194c(C11915g1.f31538j.m38141f(sb2.toString()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C8885p(C11955x0<ReqT, RespT> c11955x0, Executor executor, C11901c c11901c, e eVar, ScheduledExecutorService scheduledExecutorService, C8873m c8873m, AbstractC11908e0 abstractC11908e0) {
        this.f20776a = c11955x0;
        C2015d m10318b = C2014c.m10318b(c11955x0.m38341c(), System.identityHashCode(this));
        this.f20777b = m10318b;
        boolean z10 = true;
        if (executor == C5921g.m15178a()) {
            this.f20778c = new ExecutorC8832b2();
            this.f20779d = true;
        } else {
            this.f20778c = new ExecutorC8836c2(executor);
            this.f20779d = false;
        }
        this.f20780e = c8873m;
        this.f20781f = C11942r.m38242e();
        if (c11955x0.m38343e() != C11955x0.d.UNARY && c11955x0.m38343e() != C11955x0.d.SERVER_STREAMING) {
            z10 = false;
        }
        this.f20783h = z10;
        this.f20784i = c11901c;
        this.f20789n = eVar;
        this.f20791p = scheduledExecutorService;
        C2014c.m10319c("ClientCall.<init>", m10318b);
    }

    /* renamed from: D */
    private ScheduledFuture<?> m25707D(C11946t c11946t) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long m38270q = c11946t.m38270q(timeUnit);
        return this.f20791p.schedule(new RunnableC8835c1(new g(m38270q)), m38270q, timeUnit);
    }

    /* renamed from: E */
    private void m25708E(AbstractC11913g.a<RespT> aVar, C11953w0 c11953w0) {
        InterfaceC11934n interfaceC11934n;
        C7159o.m21319v(this.f20785j == null, "Already started");
        C7159o.m21319v(!this.f20787l, "call was cancelled");
        C7159o.m21313p(aVar, "observer");
        C7159o.m21313p(c11953w0, "headers");
        if (this.f20781f.m38250h()) {
            this.f20785j = C8879n1.f20750a;
            this.f20778c.execute(new b(aVar));
            return;
        }
        m25719p();
        String m38079b = this.f20784i.m38079b();
        if (m38079b != null) {
            interfaceC11934n = this.f20794s.m38207b(m38079b);
            if (interfaceC11934n == null) {
                this.f20785j = C8879n1.f20750a;
                this.f20778c.execute(new c(aVar, m38079b));
                return;
            }
        } else {
            interfaceC11934n = InterfaceC11928l.b.f31595a;
        }
        m25727x(c11953w0, this.f20793r, interfaceC11934n, this.f20792q);
        C11946t m25722s = m25722s();
        if (m25722s != null && m25722s.m38268o()) {
            this.f20785j = new C8846f0(C11915g1.f31538j.m38147r(String.format("ClientCall started after %s deadline was exceeded .9%f seconds ago", m25724u(this.f20784i.m38081d(), this.f20781f.m38249g()) ? "CallOptions" : "Context", Double.valueOf(m25722s.m38270q(TimeUnit.NANOSECONDS) / f20775v))), C8890q0.m25749f(this.f20784i, c11953w0, 0, false));
        } else {
            m25725v(m25722s, this.f20781f.m38249g(), this.f20784i.m38081d());
            this.f20785j = this.f20789n.mo25528a(this.f20776a, this.f20784i, c11953w0, this.f20781f);
        }
        if (this.f20779d) {
            this.f20785j.mo25285i();
        }
        if (this.f20784i.m38078a() != null) {
            this.f20785j.mo25286l(this.f20784i.m38078a());
        }
        if (this.f20784i.m38083f() != null) {
            this.f20785j.mo25196e(this.f20784i.m38083f().intValue());
        }
        if (this.f20784i.m38084g() != null) {
            this.f20785j.mo25197f(this.f20784i.m38084g().intValue());
        }
        if (m25722s != null) {
            this.f20785j.mo25198g(m25722s);
        }
        this.f20785j.mo25282a(interfaceC11934n);
        boolean z10 = this.f20792q;
        if (z10) {
            this.f20785j.mo25199j(z10);
        }
        this.f20785j.mo25200k(this.f20793r);
        this.f20780e.m25670b();
        this.f20785j.mo25203o(new d(aVar));
        this.f20781f.m38245a(this.f20790o, C5921g.m15178a());
        if (m25722s != null && !m25722s.equals(this.f20781f.m38249g()) && this.f20791p != null) {
            this.f20782g = m25707D(m25722s);
        }
        if (this.f20786k) {
            m25728y();
        }
    }

    /* renamed from: p */
    private void m25719p() {
        C8859i1.b bVar = (C8859i1.b) this.f20784i.m38085h(C8859i1.b.f20651g);
        if (bVar == null) {
            return;
        }
        Long l10 = bVar.f20652a;
        if (l10 != null) {
            C11946t m38262b = C11946t.m38262b(l10.longValue(), TimeUnit.NANOSECONDS);
            C11946t m38081d = this.f20784i.m38081d();
            if (m38081d == null || m38262b.compareTo(m38081d) < 0) {
                this.f20784i = this.f20784i.m38088l(m38262b);
            }
        }
        Boolean bool = bVar.f20653b;
        if (bool != null) {
            this.f20784i = bool.booleanValue() ? this.f20784i.m38095s() : this.f20784i.m38096t();
        }
        if (bVar.f20654c != null) {
            Integer m38083f = this.f20784i.m38083f();
            this.f20784i = m38083f != null ? this.f20784i.m38091o(Math.min(m38083f.intValue(), bVar.f20654c.intValue())) : this.f20784i.m38091o(bVar.f20654c.intValue());
        }
        if (bVar.f20655d != null) {
            Integer m38084g = this.f20784i.m38084g();
            this.f20784i = m38084g != null ? this.f20784i.m38092p(Math.min(m38084g.intValue(), bVar.f20655d.intValue())) : this.f20784i.m38092p(bVar.f20655d.intValue());
        }
    }

    /* renamed from: q */
    private void m25720q(String str, Throwable th2) {
        if (str == null && th2 == null) {
            th2 = new CancellationException("Cancelled without a message or cause");
            f20773t.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th2);
        }
        if (this.f20787l) {
            return;
        }
        this.f20787l = true;
        try {
            if (this.f20785j != null) {
                C11915g1 c11915g1 = C11915g1.f31535g;
                if (str == null) {
                    str = "Call cancelled without message";
                }
                C11915g1 m38147r = c11915g1.m38147r(str);
                if (th2 != null) {
                    m38147r = m38147r.m38146q(th2);
                }
                this.f20785j.mo25194c(m38147r);
            }
        } finally {
            m25728y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public void m25721r(AbstractC11913g.a<RespT> aVar, C11915g1 c11915g1, C11953w0 c11953w0) {
        aVar.mo597a(c11915g1, c11953w0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public C11946t m25722s() {
        return m25726w(this.f20784i.m38081d(), this.f20781f.m38249g());
    }

    /* renamed from: t */
    private void m25723t() {
        C7159o.m21319v(this.f20785j != null, "Not started");
        C7159o.m21319v(!this.f20787l, "call was cancelled");
        C7159o.m21319v(!this.f20788m, "call already half-closed");
        this.f20788m = true;
        this.f20785j.mo25202n();
    }

    /* renamed from: u */
    private static boolean m25724u(C11946t c11946t, C11946t c11946t2) {
        if (c11946t == null) {
            return false;
        }
        if (c11946t2 == null) {
            return true;
        }
        return c11946t.m38267n(c11946t2);
    }

    /* renamed from: v */
    private static void m25725v(C11946t c11946t, C11946t c11946t2, C11946t c11946t3) {
        Logger logger = f20773t;
        if (logger.isLoggable(Level.FINE) && c11946t != null && c11946t.equals(c11946t2)) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long max = Math.max(0L, c11946t.m38270q(timeUnit));
            Locale locale = Locale.US;
            StringBuilder sb2 = new StringBuilder(String.format(locale, "Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(max)));
            sb2.append(c11946t3 == null ? " Explicit call timeout was not set." : String.format(locale, " Explicit call timeout was '%d' ns.", Long.valueOf(c11946t3.m38270q(timeUnit))));
            logger.fine(sb2.toString());
        }
    }

    /* renamed from: w */
    private static C11946t m25726w(C11946t c11946t, C11946t c11946t2) {
        return c11946t == null ? c11946t2 : c11946t2 == null ? c11946t : c11946t.m38269p(c11946t2);
    }

    /* renamed from: x */
    static void m25727x(C11953w0 c11953w0, C11950v c11950v, InterfaceC11934n interfaceC11934n, boolean z10) {
        c11953w0.m38309e(C8890q0.f20836i);
        C11953w0.g<String> gVar = C8890q0.f20832e;
        c11953w0.m38309e(gVar);
        if (interfaceC11934n != InterfaceC11928l.b.f31595a) {
            c11953w0.m38313o(gVar, interfaceC11934n.mo38199a());
        }
        C11953w0.g<byte[]> gVar2 = C8890q0.f20833f;
        c11953w0.m38309e(gVar2);
        byte[] m38123a = C11911f0.m38123a(c11950v);
        if (m38123a.length != 0) {
            c11953w0.m38313o(gVar2, m38123a);
        }
        c11953w0.m38309e(C8890q0.f20834g);
        C11953w0.g<byte[]> gVar3 = C8890q0.f20835h;
        c11953w0.m38309e(gVar3);
        if (z10) {
            c11953w0.m38313o(gVar3, f20774u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public void m25728y() {
        this.f20781f.m38251i(this.f20790o);
        ScheduledFuture<?> scheduledFuture = this.f20782g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* renamed from: z */
    private void m25729z(ReqT reqt) {
        C7159o.m21319v(this.f20785j != null, "Not started");
        C7159o.m21319v(!this.f20787l, "call was cancelled");
        C7159o.m21319v(!this.f20788m, "call was half-closed");
        try {
            InterfaceC8889q interfaceC8889q = this.f20785j;
            if (interfaceC8889q instanceof AbstractC8915y1) {
                ((AbstractC8915y1) interfaceC8889q).m25993n0(reqt);
            } else {
                interfaceC8889q.mo25284h(this.f20776a.m38346j(reqt));
            }
            if (this.f20783h) {
                return;
            }
            this.f20785j.flush();
        } catch (Error e10) {
            this.f20785j.mo25194c(C11915g1.f31535g.m38147r("Client sendMessage() failed with Error"));
            throw e10;
        } catch (RuntimeException e11) {
            this.f20785j.mo25194c(C11915g1.f31535g.m38146q(e11).m38147r("Failed to stream message"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: A */
    public C8885p<ReqT, RespT> m25730A(C11936o c11936o) {
        this.f20794s = c11936o;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: B */
    public C8885p<ReqT, RespT> m25731B(C11950v c11950v) {
        this.f20793r = c11950v;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: C */
    public C8885p<ReqT, RespT> m25732C(boolean z10) {
        this.f20792q = z10;
        return this;
    }

    @Override // vi.AbstractC11913g
    /* renamed from: a */
    public void mo25522a(String str, Throwable th2) {
        C2014c.m10323g("ClientCall.cancel", this.f20777b);
        try {
            m25720q(str, th2);
        } finally {
            C2014c.m10325i("ClientCall.cancel", this.f20777b);
        }
    }

    @Override // vi.AbstractC11913g
    /* renamed from: b */
    public void mo25523b() {
        C2014c.m10323g("ClientCall.halfClose", this.f20777b);
        try {
            m25723t();
        } finally {
            C2014c.m10325i("ClientCall.halfClose", this.f20777b);
        }
    }

    @Override // vi.AbstractC11913g
    /* renamed from: c */
    public void mo25524c(int i10) {
        C2014c.m10323g("ClientCall.request", this.f20777b);
        try {
            boolean z10 = true;
            C7159o.m21319v(this.f20785j != null, "Not started");
            if (i10 < 0) {
                z10 = false;
            }
            C7159o.m21302e(z10, "Number requested must be non-negative");
            this.f20785j.mo25283b(i10);
        } finally {
            C2014c.m10325i("ClientCall.request", this.f20777b);
        }
    }

    @Override // vi.AbstractC11913g
    /* renamed from: d */
    public void mo25525d(ReqT reqt) {
        C2014c.m10323g("ClientCall.sendMessage", this.f20777b);
        try {
            m25729z(reqt);
        } finally {
            C2014c.m10325i("ClientCall.sendMessage", this.f20777b);
        }
    }

    @Override // vi.AbstractC11913g
    /* renamed from: e */
    public void mo603e(AbstractC11913g.a<RespT> aVar, C11953w0 c11953w0) {
        C2014c.m10323g("ClientCall.start", this.f20777b);
        try {
            m25708E(aVar, c11953w0);
        } finally {
            C2014c.m10325i("ClientCall.start", this.f20777b);
        }
    }

    public String toString() {
        return C7153i.m21274c(this).m21284d(Constants.METHOD, this.f20776a).toString();
    }
}
