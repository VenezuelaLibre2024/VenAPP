package ql;

import dk.k0;
import java.util.LinkedHashMap;
import java.util.Map;
import ql.t;

/* loaded from: classes3.dex */
public final class a0 {

    /* renamed from: a */
    private final u f24141a;

    /* renamed from: b */
    private final String f24142b;

    /* renamed from: c */
    private final t f24143c;

    /* renamed from: d */
    private final b0 f24144d;

    /* renamed from: e */
    private final Map<Class<?>, Object> f24145e;

    /* renamed from: f */
    private d f24146f;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private u f24147a;

        /* renamed from: b */
        private String f24148b;

        /* renamed from: c */
        private t.a f24149c;

        /* renamed from: d */
        private b0 f24150d;

        /* renamed from: e */
        private Map<Class<?>, Object> f24151e;

        public a() {
            this.f24151e = new LinkedHashMap();
            this.f24148b = "GET";
            this.f24149c = new t.a();
        }

        public a(a0 request) {
            kotlin.jvm.internal.n.e(request, "request");
            this.f24151e = new LinkedHashMap();
            this.f24147a = request.i();
            this.f24148b = request.g();
            this.f24150d = request.a();
            this.f24151e = request.c().isEmpty() ? new LinkedHashMap<>() : k0.u(request.c());
            this.f24149c = request.e().k();
        }

        public a a(String name, String value) {
            kotlin.jvm.internal.n.e(name, "name");
            kotlin.jvm.internal.n.e(value, "value");
            c().a(name, value);
            return this;
        }

        public a0 b() {
            u uVar = this.f24147a;
            if (uVar != null) {
                return new a0(uVar, this.f24148b, this.f24149c.e(), this.f24150d, rl.d.T(this.f24151e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public final t.a c() {
            return this.f24149c;
        }

        public a d(String name, String value) {
            kotlin.jvm.internal.n.e(name, "name");
            kotlin.jvm.internal.n.e(value, "value");
            c().h(name, value);
            return this;
        }

        public a e(t headers) {
            kotlin.jvm.internal.n.e(headers, "headers");
            l(headers.k());
            return this;
        }

        public a f(String method, b0 b0Var) {
            kotlin.jvm.internal.n.e(method, "method");
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (b0Var == null) {
                if (!(true ^ wl.f.d(method))) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!wl.f.a(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            m(method);
            k(b0Var);
            return this;
        }

        public a g(b0 body) {
            kotlin.jvm.internal.n.e(body, "body");
            return f("PATCH", body);
        }

        public a h(b0 body) {
            kotlin.jvm.internal.n.e(body, "body");
            return f("POST", body);
        }

        public a i(b0 body) {
            kotlin.jvm.internal.n.e(body, "body");
            return f("PUT", body);
        }

        public a j(String name) {
            kotlin.jvm.internal.n.e(name, "name");
            c().g(name);
            return this;
        }

        public final void k(b0 b0Var) {
            this.f24150d = b0Var;
        }

        public final void l(t.a aVar) {
            kotlin.jvm.internal.n.e(aVar, "<set-?>");
            this.f24149c = aVar;
        }

        public final void m(String str) {
            kotlin.jvm.internal.n.e(str, "<set-?>");
            this.f24148b = str;
        }

        public final void n(u uVar) {
            this.f24147a = uVar;
        }

        public a o(String url) {
            boolean C;
            boolean C2;
            String substring;
            String str;
            kotlin.jvm.internal.n.e(url, "url");
            C = xk.p.C(url, "ws:", true);
            if (!C) {
                C2 = xk.p.C(url, "wss:", true);
                if (C2) {
                    substring = url.substring(4);
                    kotlin.jvm.internal.n.d(substring, "this as java.lang.String).substring(startIndex)");
                    str = "https:";
                }
                return p(u.f24361k.d(url));
            }
            substring = url.substring(3);
            kotlin.jvm.internal.n.d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:";
            url = kotlin.jvm.internal.n.k(str, substring);
            return p(u.f24361k.d(url));
        }

        public a p(u url) {
            kotlin.jvm.internal.n.e(url, "url");
            n(url);
            return this;
        }
    }

    public a0(u url, String method, t headers, b0 b0Var, Map<Class<?>, ? extends Object> tags) {
        kotlin.jvm.internal.n.e(url, "url");
        kotlin.jvm.internal.n.e(method, "method");
        kotlin.jvm.internal.n.e(headers, "headers");
        kotlin.jvm.internal.n.e(tags, "tags");
        this.f24141a = url;
        this.f24142b = method;
        this.f24143c = headers;
        this.f24144d = b0Var;
        this.f24145e = tags;
    }

    public final b0 a() {
        return this.f24144d;
    }

    public final d b() {
        d dVar = this.f24146f;
        if (dVar != null) {
            return dVar;
        }
        d b10 = d.f24190n.b(this.f24143c);
        this.f24146f = b10;
        return b10;
    }

    public final Map<Class<?>, Object> c() {
        return this.f24145e;
    }

    public final String d(String name) {
        kotlin.jvm.internal.n.e(name, "name");
        return this.f24143c.c(name);
    }

    public final t e() {
        return this.f24143c;
    }

    public final boolean f() {
        return this.f24141a.i();
    }

    public final String g() {
        return this.f24142b;
    }

    public final a h() {
        return new a(this);
    }

    public final u i() {
        return this.f24141a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(g());
        sb2.append(", url=");
        sb2.append(i());
        if (e().size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (ck.m<? extends String, ? extends String> mVar : e()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    dk.r.q();
                }
                ck.m<? extends String, ? extends String> mVar2 = mVar;
                String a10 = mVar2.a();
                String b10 = mVar2.b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(a10);
                sb2.append(':');
                sb2.append(b10);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!c().isEmpty()) {
            sb2.append(", tags=");
            sb2.append(c());
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        kotlin.jvm.internal.n.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
