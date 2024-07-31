package ql;

import java.io.Closeable;
import java.util.List;
import ql.t;

/* loaded from: classes3.dex */
public final class c0 implements Closeable {

    /* renamed from: a */
    private final a0 f24163a;

    /* renamed from: b */
    private final z f24164b;

    /* renamed from: c */
    private final String f24165c;

    /* renamed from: d */
    private final int f24166d;

    /* renamed from: e */
    private final s f24167e;

    /* renamed from: f */
    private final t f24168f;

    /* renamed from: r */
    private final d0 f24169r;

    /* renamed from: s */
    private final c0 f24170s;

    /* renamed from: t */
    private final c0 f24171t;

    /* renamed from: u */
    private final c0 f24172u;

    /* renamed from: v */
    private final long f24173v;

    /* renamed from: w */
    private final long f24174w;

    /* renamed from: x */
    private final vl.c f24175x;

    /* renamed from: y */
    private d f24176y;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private a0 f24177a;

        /* renamed from: b */
        private z f24178b;

        /* renamed from: c */
        private int f24179c;

        /* renamed from: d */
        private String f24180d;

        /* renamed from: e */
        private s f24181e;

        /* renamed from: f */
        private t.a f24182f;

        /* renamed from: g */
        private d0 f24183g;

        /* renamed from: h */
        private c0 f24184h;

        /* renamed from: i */
        private c0 f24185i;

        /* renamed from: j */
        private c0 f24186j;

        /* renamed from: k */
        private long f24187k;

        /* renamed from: l */
        private long f24188l;

        /* renamed from: m */
        private vl.c f24189m;

        public a() {
            this.f24179c = -1;
            this.f24182f = new t.a();
        }

        public a(c0 response) {
            kotlin.jvm.internal.n.e(response, "response");
            this.f24179c = -1;
            this.f24177a = response.O();
            this.f24178b = response.H();
            this.f24179c = response.g();
            this.f24180d = response.r();
            this.f24181e = response.j();
            this.f24182f = response.o().k();
            this.f24183g = response.a();
            this.f24184h = response.y();
            this.f24185i = response.e();
            this.f24186j = response.E();
            this.f24187k = response.Q();
            this.f24188l = response.I();
            this.f24189m = response.i();
        }

        private final void e(c0 c0Var) {
            if (c0Var == null) {
                return;
            }
            if (!(c0Var.a() == null)) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
        }

        private final void f(String str, c0 c0Var) {
            if (c0Var == null) {
                return;
            }
            if (!(c0Var.a() == null)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.n.k(str, ".body != null").toString());
            }
            if (!(c0Var.y() == null)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.n.k(str, ".networkResponse != null").toString());
            }
            if (!(c0Var.e() == null)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.n.k(str, ".cacheResponse != null").toString());
            }
            if (!(c0Var.E() == null)) {
                throw new IllegalArgumentException(kotlin.jvm.internal.n.k(str, ".priorResponse != null").toString());
            }
        }

        public final void A(c0 c0Var) {
            this.f24184h = c0Var;
        }

        public final void B(c0 c0Var) {
            this.f24186j = c0Var;
        }

        public final void C(z zVar) {
            this.f24178b = zVar;
        }

        public final void D(long j10) {
            this.f24188l = j10;
        }

        public final void E(a0 a0Var) {
            this.f24177a = a0Var;
        }

        public final void F(long j10) {
            this.f24187k = j10;
        }

        public a a(String name, String value) {
            kotlin.jvm.internal.n.e(name, "name");
            kotlin.jvm.internal.n.e(value, "value");
            i().a(name, value);
            return this;
        }

        public a b(d0 d0Var) {
            u(d0Var);
            return this;
        }

        public c0 c() {
            int i10 = this.f24179c;
            if (!(i10 >= 0)) {
                throw new IllegalStateException(kotlin.jvm.internal.n.k("code < 0: ", Integer.valueOf(h())).toString());
            }
            a0 a0Var = this.f24177a;
            if (a0Var == null) {
                throw new IllegalStateException("request == null".toString());
            }
            z zVar = this.f24178b;
            if (zVar == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f24180d;
            if (str != null) {
                return new c0(a0Var, zVar, str, i10, this.f24181e, this.f24182f.e(), this.f24183g, this.f24184h, this.f24185i, this.f24186j, this.f24187k, this.f24188l, this.f24189m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        public a d(c0 c0Var) {
            f("cacheResponse", c0Var);
            v(c0Var);
            return this;
        }

        public a g(int i10) {
            w(i10);
            return this;
        }

        public final int h() {
            return this.f24179c;
        }

        public final t.a i() {
            return this.f24182f;
        }

        public a j(s sVar) {
            x(sVar);
            return this;
        }

        public a k(String name, String value) {
            kotlin.jvm.internal.n.e(name, "name");
            kotlin.jvm.internal.n.e(value, "value");
            i().h(name, value);
            return this;
        }

        public a l(t headers) {
            kotlin.jvm.internal.n.e(headers, "headers");
            y(headers.k());
            return this;
        }

        public final void m(vl.c deferredTrailers) {
            kotlin.jvm.internal.n.e(deferredTrailers, "deferredTrailers");
            this.f24189m = deferredTrailers;
        }

        public a n(String message) {
            kotlin.jvm.internal.n.e(message, "message");
            z(message);
            return this;
        }

        public a o(c0 c0Var) {
            f("networkResponse", c0Var);
            A(c0Var);
            return this;
        }

        public a p(c0 c0Var) {
            e(c0Var);
            B(c0Var);
            return this;
        }

        public a q(z protocol) {
            kotlin.jvm.internal.n.e(protocol, "protocol");
            C(protocol);
            return this;
        }

        public a r(long j10) {
            D(j10);
            return this;
        }

        public a s(a0 request) {
            kotlin.jvm.internal.n.e(request, "request");
            E(request);
            return this;
        }

        public a t(long j10) {
            F(j10);
            return this;
        }

        public final void u(d0 d0Var) {
            this.f24183g = d0Var;
        }

        public final void v(c0 c0Var) {
            this.f24185i = c0Var;
        }

        public final void w(int i10) {
            this.f24179c = i10;
        }

        public final void x(s sVar) {
            this.f24181e = sVar;
        }

        public final void y(t.a aVar) {
            kotlin.jvm.internal.n.e(aVar, "<set-?>");
            this.f24182f = aVar;
        }

        public final void z(String str) {
            this.f24180d = str;
        }
    }

    public c0(a0 request, z protocol, String message, int i10, s sVar, t headers, d0 d0Var, c0 c0Var, c0 c0Var2, c0 c0Var3, long j10, long j11, vl.c cVar) {
        kotlin.jvm.internal.n.e(request, "request");
        kotlin.jvm.internal.n.e(protocol, "protocol");
        kotlin.jvm.internal.n.e(message, "message");
        kotlin.jvm.internal.n.e(headers, "headers");
        this.f24163a = request;
        this.f24164b = protocol;
        this.f24165c = message;
        this.f24166d = i10;
        this.f24167e = sVar;
        this.f24168f = headers;
        this.f24169r = d0Var;
        this.f24170s = c0Var;
        this.f24171t = c0Var2;
        this.f24172u = c0Var3;
        this.f24173v = j10;
        this.f24174w = j11;
        this.f24175x = cVar;
    }

    public static /* synthetic */ String n(c0 c0Var, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c0Var.l(str, str2);
    }

    public final a B() {
        return new a(this);
    }

    public final c0 E() {
        return this.f24172u;
    }

    public final z H() {
        return this.f24164b;
    }

    public final long I() {
        return this.f24174w;
    }

    public final a0 O() {
        return this.f24163a;
    }

    public final long Q() {
        return this.f24173v;
    }

    public final d0 a() {
        return this.f24169r;
    }

    public final d b() {
        d dVar = this.f24176y;
        if (dVar != null) {
            return dVar;
        }
        d b10 = d.f24190n.b(this.f24168f);
        this.f24176y = b10;
        return b10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d0 d0Var = this.f24169r;
        if (d0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        d0Var.close();
    }

    public final c0 e() {
        return this.f24171t;
    }

    public final List<h> f() {
        String str;
        List<h> j10;
        t tVar = this.f24168f;
        int i10 = this.f24166d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                j10 = dk.r.j();
                return j10;
            }
            str = "Proxy-Authenticate";
        }
        return wl.e.a(tVar, str);
    }

    public final int g() {
        return this.f24166d;
    }

    public final vl.c i() {
        return this.f24175x;
    }

    public final s j() {
        return this.f24167e;
    }

    public final String l(String name, String str) {
        kotlin.jvm.internal.n.e(name, "name");
        String c10 = this.f24168f.c(name);
        return c10 == null ? str : c10;
    }

    public final t o() {
        return this.f24168f;
    }

    public final boolean q() {
        int i10 = this.f24166d;
        return 200 <= i10 && i10 < 300;
    }

    public final String r() {
        return this.f24165c;
    }

    public String toString() {
        return "Response{protocol=" + this.f24164b + ", code=" + this.f24166d + ", message=" + this.f24165c + ", url=" + this.f24163a.i() + '}';
    }

    public final c0 y() {
        return this.f24170s;
    }
}
