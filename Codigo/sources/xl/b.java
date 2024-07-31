package xl;

import com.google.android.gms.common.api.a;
import dm.h;
import dm.v;
import dm.x;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.n;
import ql.a0;
import ql.c0;
import ql.t;
import ql.u;
import ql.y;
import wl.i;
import wl.k;
import xk.p;

/* loaded from: classes3.dex */
public final class b implements wl.d {

    /* renamed from: h, reason: collision with root package name */
    public static final d f31426h = new d(null);

    /* renamed from: a, reason: collision with root package name */
    private final y f31427a;

    /* renamed from: b, reason: collision with root package name */
    private final vl.f f31428b;

    /* renamed from: c, reason: collision with root package name */
    private final dm.d f31429c;

    /* renamed from: d, reason: collision with root package name */
    private final dm.c f31430d;

    /* renamed from: e, reason: collision with root package name */
    private int f31431e;

    /* renamed from: f, reason: collision with root package name */
    private final xl.a f31432f;

    /* renamed from: g, reason: collision with root package name */
    private t f31433g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public abstract class a implements x {

        /* renamed from: a, reason: collision with root package name */
        private final h f31434a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f31435b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f31436c;

        public a(b this$0) {
            n.e(this$0, "this$0");
            this.f31436c = this$0;
            this.f31434a = new h(this$0.f31429c.m());
        }

        protected final boolean a() {
            return this.f31435b;
        }

        public final void b() {
            if (this.f31436c.f31431e == 6) {
                return;
            }
            if (this.f31436c.f31431e != 5) {
                throw new IllegalStateException(n.k("state: ", Integer.valueOf(this.f31436c.f31431e)));
            }
            this.f31436c.r(this.f31434a);
            this.f31436c.f31431e = 6;
        }

        protected final void e(boolean z10) {
            this.f31435b = z10;
        }

        @Override // dm.x
        public dm.y m() {
            return this.f31434a;
        }

        @Override // dm.x
        public long s1(dm.b sink, long j10) {
            n.e(sink, "sink");
            try {
                return this.f31436c.f31429c.s1(sink, j10);
            } catch (IOException e10) {
                this.f31436c.b().y();
                b();
                throw e10;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xl.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public final class C0528b implements v {

        /* renamed from: a, reason: collision with root package name */
        private final h f31437a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f31438b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f31439c;

        public C0528b(b this$0) {
            n.e(this$0, "this$0");
            this.f31439c = this$0;
            this.f31437a = new h(this$0.f31430d.m());
        }

        @Override // dm.v
        public void K0(dm.b source, long j10) {
            n.e(source, "source");
            if (!(!this.f31438b)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j10 == 0) {
                return;
            }
            this.f31439c.f31430d.Z0(j10);
            this.f31439c.f31430d.T("\r\n");
            this.f31439c.f31430d.K0(source, j10);
            this.f31439c.f31430d.T("\r\n");
        }

        @Override // dm.v, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f31438b) {
                return;
            }
            this.f31438b = true;
            this.f31439c.f31430d.T("0\r\n\r\n");
            this.f31439c.r(this.f31437a);
            this.f31439c.f31431e = 3;
        }

        @Override // dm.v, java.io.Flushable
        public synchronized void flush() {
            if (this.f31438b) {
                return;
            }
            this.f31439c.f31430d.flush();
        }

        @Override // dm.v
        public dm.y m() {
            return this.f31437a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class c extends a {

        /* renamed from: d, reason: collision with root package name */
        private final u f31440d;

        /* renamed from: e, reason: collision with root package name */
        private long f31441e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f31442f;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ b f31443r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b this$0, u url) {
            super(this$0);
            n.e(this$0, "this$0");
            n.e(url, "url");
            this.f31443r = this$0;
            this.f31440d = url;
            this.f31441e = -1L;
            this.f31442f = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
        
            if (r1 != false) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final void f() {
            /*
                r7 = this;
                long r0 = r7.f31441e
                r2 = -1
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L11
                xl.b r0 = r7.f31443r
                dm.d r0 = xl.b.m(r0)
                r0.d0()
            L11:
                xl.b r0 = r7.f31443r     // Catch: java.lang.NumberFormatException -> La2
                dm.d r0 = xl.b.m(r0)     // Catch: java.lang.NumberFormatException -> La2
                long r0 = r0.t1()     // Catch: java.lang.NumberFormatException -> La2
                r7.f31441e = r0     // Catch: java.lang.NumberFormatException -> La2
                xl.b r0 = r7.f31443r     // Catch: java.lang.NumberFormatException -> La2
                dm.d r0 = xl.b.m(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r0.d0()     // Catch: java.lang.NumberFormatException -> La2
                java.lang.CharSequence r0 = xk.g.K0(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> La2
                long r1 = r7.f31441e     // Catch: java.lang.NumberFormatException -> La2
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 < 0) goto L81
                int r1 = r0.length()     // Catch: java.lang.NumberFormatException -> La2
                r2 = 0
                if (r1 <= 0) goto L40
                r1 = 1
                goto L41
            L40:
                r1 = r2
            L41:
                if (r1 == 0) goto L4d
                java.lang.String r1 = ";"
                r5 = 2
                r6 = 0
                boolean r1 = xk.g.E(r0, r1, r2, r5, r6)     // Catch: java.lang.NumberFormatException -> La2
                if (r1 == 0) goto L81
            L4d:
                long r0 = r7.f31441e
                int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r0 != 0) goto L80
                r7.f31442f = r2
                xl.b r0 = r7.f31443r
                xl.a r1 = xl.b.k(r0)
                ql.t r1 = r1.a()
                xl.b.q(r0, r1)
                xl.b r0 = r7.f31443r
                ql.y r0 = xl.b.j(r0)
                kotlin.jvm.internal.n.b(r0)
                ql.n r0 = r0.k()
                ql.u r1 = r7.f31440d
                xl.b r2 = r7.f31443r
                ql.t r2 = xl.b.o(r2)
                kotlin.jvm.internal.n.b(r2)
                wl.e.f(r0, r1, r2)
                r7.b()
            L80:
                return
            L81:
                java.net.ProtocolException r1 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> La2
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> La2
                r2.<init>()     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r3 = "expected chunk size and optional extensions but was \""
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> La2
                long r3 = r7.f31441e     // Catch: java.lang.NumberFormatException -> La2
                r2.append(r3)     // Catch: java.lang.NumberFormatException -> La2
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> La2
                r0 = 34
                r2.append(r0)     // Catch: java.lang.NumberFormatException -> La2
                java.lang.String r0 = r2.toString()     // Catch: java.lang.NumberFormatException -> La2
                r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> La2
                throw r1     // Catch: java.lang.NumberFormatException -> La2
            La2:
                r0 = move-exception
                java.net.ProtocolException r1 = new java.net.ProtocolException
                java.lang.String r0 = r0.getMessage()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: xl.b.c.f():void");
        }

        @Override // dm.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f31442f && !rl.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f31443r.b().y();
                b();
            }
            e(true);
        }

        @Override // xl.b.a, dm.x
        public long s1(dm.b sink, long j10) {
            n.e(sink, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(n.k("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!(!a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (!this.f31442f) {
                return -1L;
            }
            long j11 = this.f31441e;
            if (j11 == 0 || j11 == -1) {
                f();
                if (!this.f31442f) {
                    return -1L;
                }
            }
            long s12 = super.s1(sink, Math.min(j10, this.f31441e));
            if (s12 != -1) {
                this.f31441e -= s12;
                return s12;
            }
            this.f31443r.b().y();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            b();
            throw protocolException;
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class e extends a {

        /* renamed from: d, reason: collision with root package name */
        private long f31444d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f31445e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b this$0, long j10) {
            super(this$0);
            n.e(this$0, "this$0");
            this.f31445e = this$0;
            this.f31444d = j10;
            if (j10 == 0) {
                b();
            }
        }

        @Override // dm.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (this.f31444d != 0 && !rl.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f31445e.b().y();
                b();
            }
            e(true);
        }

        @Override // xl.b.a, dm.x
        public long s1(dm.b sink, long j10) {
            n.e(sink, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(n.k("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!(!a())) {
                throw new IllegalStateException("closed".toString());
            }
            long j11 = this.f31444d;
            if (j11 == 0) {
                return -1L;
            }
            long s12 = super.s1(sink, Math.min(j11, j10));
            if (s12 == -1) {
                this.f31445e.b().y();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                b();
                throw protocolException;
            }
            long j12 = this.f31444d - s12;
            this.f31444d = j12;
            if (j12 == 0) {
                b();
            }
            return s12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class f implements v {

        /* renamed from: a, reason: collision with root package name */
        private final h f31446a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f31447b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f31448c;

        public f(b this$0) {
            n.e(this$0, "this$0");
            this.f31448c = this$0;
            this.f31446a = new h(this$0.f31430d.m());
        }

        @Override // dm.v
        public void K0(dm.b source, long j10) {
            n.e(source, "source");
            if (!(!this.f31447b)) {
                throw new IllegalStateException("closed".toString());
            }
            rl.d.l(source.size(), 0L, j10);
            this.f31448c.f31430d.K0(source, j10);
        }

        @Override // dm.v, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f31447b) {
                return;
            }
            this.f31447b = true;
            this.f31448c.r(this.f31446a);
            this.f31448c.f31431e = 3;
        }

        @Override // dm.v, java.io.Flushable
        public void flush() {
            if (this.f31447b) {
                return;
            }
            this.f31448c.f31430d.flush();
        }

        @Override // dm.v
        public dm.y m() {
            return this.f31446a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class g extends a {

        /* renamed from: d, reason: collision with root package name */
        private boolean f31449d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f31450e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(b this$0) {
            super(this$0);
            n.e(this$0, "this$0");
            this.f31450e = this$0;
        }

        @Override // dm.x, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (a()) {
                return;
            }
            if (!this.f31449d) {
                b();
            }
            e(true);
        }

        @Override // xl.b.a, dm.x
        public long s1(dm.b sink, long j10) {
            n.e(sink, "sink");
            if (!(j10 >= 0)) {
                throw new IllegalArgumentException(n.k("byteCount < 0: ", Long.valueOf(j10)).toString());
            }
            if (!(!a())) {
                throw new IllegalStateException("closed".toString());
            }
            if (this.f31449d) {
                return -1L;
            }
            long s12 = super.s1(sink, j10);
            if (s12 != -1) {
                return s12;
            }
            this.f31449d = true;
            b();
            return -1L;
        }
    }

    public b(y yVar, vl.f connection, dm.d source, dm.c sink) {
        n.e(connection, "connection");
        n.e(source, "source");
        n.e(sink, "sink");
        this.f31427a = yVar;
        this.f31428b = connection;
        this.f31429c = source;
        this.f31430d = sink;
        this.f31432f = new xl.a(source);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(h hVar) {
        dm.y i10 = hVar.i();
        hVar.j(dm.y.f14339e);
        i10.a();
        i10.b();
    }

    private final boolean s(a0 a0Var) {
        boolean r10;
        r10 = p.r("chunked", a0Var.d("Transfer-Encoding"), true);
        return r10;
    }

    private final boolean t(c0 c0Var) {
        boolean r10;
        r10 = p.r("chunked", c0.n(c0Var, "Transfer-Encoding", null, 2, null), true);
        return r10;
    }

    private final v u() {
        int i10 = this.f31431e;
        if (!(i10 == 1)) {
            throw new IllegalStateException(n.k("state: ", Integer.valueOf(i10)).toString());
        }
        this.f31431e = 2;
        return new C0528b(this);
    }

    private final x v(u uVar) {
        int i10 = this.f31431e;
        if (!(i10 == 4)) {
            throw new IllegalStateException(n.k("state: ", Integer.valueOf(i10)).toString());
        }
        this.f31431e = 5;
        return new c(this, uVar);
    }

    private final x w(long j10) {
        int i10 = this.f31431e;
        if (!(i10 == 4)) {
            throw new IllegalStateException(n.k("state: ", Integer.valueOf(i10)).toString());
        }
        this.f31431e = 5;
        return new e(this, j10);
    }

    private final v x() {
        int i10 = this.f31431e;
        if (!(i10 == 1)) {
            throw new IllegalStateException(n.k("state: ", Integer.valueOf(i10)).toString());
        }
        this.f31431e = 2;
        return new f(this);
    }

    private final x y() {
        int i10 = this.f31431e;
        if (!(i10 == 4)) {
            throw new IllegalStateException(n.k("state: ", Integer.valueOf(i10)).toString());
        }
        this.f31431e = 5;
        b().y();
        return new g(this);
    }

    public final void A(t headers, String requestLine) {
        n.e(headers, "headers");
        n.e(requestLine, "requestLine");
        int i10 = this.f31431e;
        if (!(i10 == 0)) {
            throw new IllegalStateException(n.k("state: ", Integer.valueOf(i10)).toString());
        }
        this.f31430d.T(requestLine).T("\r\n");
        int size = headers.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f31430d.T(headers.d(i11)).T(": ").T(headers.l(i11)).T("\r\n");
        }
        this.f31430d.T("\r\n");
        this.f31431e = 1;
    }

    @Override // wl.d
    public void a() {
        this.f31430d.flush();
    }

    @Override // wl.d
    public vl.f b() {
        return this.f31428b;
    }

    @Override // wl.d
    public long c(c0 response) {
        n.e(response, "response");
        if (!wl.e.b(response)) {
            return 0L;
        }
        if (t(response)) {
            return -1L;
        }
        return rl.d.v(response);
    }

    @Override // wl.d
    public void cancel() {
        b().d();
    }

    @Override // wl.d
    public v d(a0 request, long j10) {
        n.e(request, "request");
        if (request.a() != null && request.a().d()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(request)) {
            return u();
        }
        if (j10 != -1) {
            return x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // wl.d
    public c0.a e(boolean z10) {
        int i10 = this.f31431e;
        boolean z11 = false;
        if (!(i10 == 1 || i10 == 2 || i10 == 3)) {
            throw new IllegalStateException(n.k("state: ", Integer.valueOf(i10)).toString());
        }
        try {
            k a10 = k.f30221d.a(this.f31432f.b());
            c0.a l10 = new c0.a().q(a10.f30222a).g(a10.f30223b).n(a10.f30224c).l(this.f31432f.a());
            if (z10 && a10.f30223b == 100) {
                return null;
            }
            int i11 = a10.f30223b;
            if (i11 != 100) {
                if (102 <= i11 && i11 < 200) {
                    z11 = true;
                }
                if (!z11) {
                    this.f31431e = 4;
                    return l10;
                }
            }
            this.f31431e = 3;
            return l10;
        } catch (EOFException e10) {
            throw new IOException(n.k("unexpected end of stream on ", b().z().a().l().o()), e10);
        }
    }

    @Override // wl.d
    public void f() {
        this.f31430d.flush();
    }

    @Override // wl.d
    public void g(a0 request) {
        n.e(request, "request");
        i iVar = i.f30218a;
        Proxy.Type type = b().z().b().type();
        n.d(type, "connection.route().proxy.type()");
        A(request.e(), iVar.a(request, type));
    }

    @Override // wl.d
    public x h(c0 response) {
        long v10;
        n.e(response, "response");
        if (!wl.e.b(response)) {
            v10 = 0;
        } else {
            if (t(response)) {
                return v(response.O().i());
            }
            v10 = rl.d.v(response);
            if (v10 == -1) {
                return y();
            }
        }
        return w(v10);
    }

    public final void z(c0 response) {
        n.e(response, "response");
        long v10 = rl.d.v(response);
        if (v10 == -1) {
            return;
        }
        x w10 = w(v10);
        rl.d.L(w10, a.e.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
        w10.close();
    }
}
