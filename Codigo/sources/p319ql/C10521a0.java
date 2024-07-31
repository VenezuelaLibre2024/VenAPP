package p319ql;

import ck.C2028m;
import dk.C7018k0;
import dk.C7031r;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C9322n;
import p319ql.C10545t;
import p341rl.C10727d;
import p428wl.C12243f;
import p450xk.C12524p;

/* renamed from: ql.a0 */
/* loaded from: classes3.dex */
public final class C10521a0 {

    /* renamed from: a */
    private final C10546u f26183a;

    /* renamed from: b */
    private final String f26184b;

    /* renamed from: c */
    private final C10545t f26185c;

    /* renamed from: d */
    private final AbstractC10523b0 f26186d;

    /* renamed from: e */
    private final Map<Class<?>, Object> f26187e;

    /* renamed from: f */
    private C10526d f26188f;

    /* renamed from: ql.a0$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private C10546u f26189a;

        /* renamed from: b */
        private String f26190b;

        /* renamed from: c */
        private C10545t.a f26191c;

        /* renamed from: d */
        private AbstractC10523b0 f26192d;

        /* renamed from: e */
        private Map<Class<?>, Object> f26193e;

        public a() {
            this.f26193e = new LinkedHashMap();
            this.f26190b = "GET";
            this.f26191c = new C10545t.a();
        }

        public a(C10521a0 request) {
            C9322n.m27781e(request, "request");
            this.f26193e = new LinkedHashMap();
            this.f26189a = request.m31608i();
            this.f26190b = request.m31606g();
            this.f26192d = request.m31600a();
            this.f26193e = request.m31602c().isEmpty() ? new LinkedHashMap<>() : C7018k0.m20434u(request.m31602c());
            this.f26191c = request.m31604e().m31848k();
        }

        /* renamed from: a */
        public a m31609a(String name, String value) {
            C9322n.m27781e(name, "name");
            C9322n.m27781e(value, "value");
            m31611c().m31851a(name, value);
            return this;
        }

        /* renamed from: b */
        public C10521a0 m31610b() {
            C10546u c10546u = this.f26189a;
            if (c10546u != null) {
                return new C10521a0(c10546u, this.f26190b, this.f26191c.m31855e(), this.f26192d, C10727d.m32634T(this.f26193e));
            }
            throw new IllegalStateException("url == null".toString());
        }

        /* renamed from: c */
        public final C10545t.a m31611c() {
            return this.f26191c;
        }

        /* renamed from: d */
        public a m31612d(String name, String value) {
            C9322n.m27781e(name, "name");
            C9322n.m27781e(value, "value");
            m31611c().m31858h(name, value);
            return this;
        }

        /* renamed from: e */
        public a m31613e(C10545t headers) {
            C9322n.m27781e(headers, "headers");
            m31620l(headers.m31848k());
            return this;
        }

        /* renamed from: f */
        public a m31614f(String method, AbstractC10523b0 abstractC10523b0) {
            C9322n.m27781e(method, "method");
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (abstractC10523b0 == null) {
                if (!(true ^ C12243f.m39412d(method))) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!C12243f.m39411a(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            m31621m(method);
            m31619k(abstractC10523b0);
            return this;
        }

        /* renamed from: g */
        public a m31615g(AbstractC10523b0 body) {
            C9322n.m27781e(body, "body");
            return m31614f("PATCH", body);
        }

        /* renamed from: h */
        public a m31616h(AbstractC10523b0 body) {
            C9322n.m27781e(body, "body");
            return m31614f("POST", body);
        }

        /* renamed from: i */
        public a m31617i(AbstractC10523b0 body) {
            C9322n.m27781e(body, "body");
            return m31614f("PUT", body);
        }

        /* renamed from: j */
        public a m31618j(String name) {
            C9322n.m27781e(name, "name");
            m31611c().m31857g(name);
            return this;
        }

        /* renamed from: k */
        public final void m31619k(AbstractC10523b0 abstractC10523b0) {
            this.f26192d = abstractC10523b0;
        }

        /* renamed from: l */
        public final void m31620l(C10545t.a aVar) {
            C9322n.m27781e(aVar, "<set-?>");
            this.f26191c = aVar;
        }

        /* renamed from: m */
        public final void m31621m(String str) {
            C9322n.m27781e(str, "<set-?>");
            this.f26190b = str;
        }

        /* renamed from: n */
        public final void m31622n(C10546u c10546u) {
            this.f26189a = c10546u;
        }

        /* renamed from: o */
        public a m31623o(String url) {
            boolean m41029C;
            boolean m41029C2;
            String substring;
            String str;
            C9322n.m27781e(url, "url");
            m41029C = C12524p.m41029C(url, "ws:", true);
            if (!m41029C) {
                m41029C2 = C12524p.m41029C(url, "wss:", true);
                if (m41029C2) {
                    substring = url.substring(4);
                    C9322n.m27780d(substring, "this as java.lang.String).substring(startIndex)");
                    str = "https:";
                }
                return m31624p(C10546u.f26455k.m31932d(url));
            }
            substring = url.substring(3);
            C9322n.m27780d(substring, "this as java.lang.String).substring(startIndex)");
            str = "http:";
            url = C9322n.m27787k(str, substring);
            return m31624p(C10546u.f26455k.m31932d(url));
        }

        /* renamed from: p */
        public a m31624p(C10546u url) {
            C9322n.m27781e(url, "url");
            m31622n(url);
            return this;
        }
    }

    public C10521a0(C10546u url, String method, C10545t headers, AbstractC10523b0 abstractC10523b0, Map<Class<?>, ? extends Object> tags) {
        C9322n.m27781e(url, "url");
        C9322n.m27781e(method, "method");
        C9322n.m27781e(headers, "headers");
        C9322n.m27781e(tags, "tags");
        this.f26183a = url;
        this.f26184b = method;
        this.f26185c = headers;
        this.f26186d = abstractC10523b0;
        this.f26187e = tags;
    }

    /* renamed from: a */
    public final AbstractC10523b0 m31600a() {
        return this.f26186d;
    }

    /* renamed from: b */
    public final C10526d m31601b() {
        C10526d c10526d = this.f26188f;
        if (c10526d != null) {
            return c10526d;
        }
        C10526d m31703b = C10526d.f26232n.m31703b(this.f26185c);
        this.f26188f = m31703b;
        return m31703b;
    }

    /* renamed from: c */
    public final Map<Class<?>, Object> m31602c() {
        return this.f26187e;
    }

    /* renamed from: d */
    public final String m31603d(String name) {
        C9322n.m27781e(name, "name");
        return this.f26185c.m31845c(name);
    }

    /* renamed from: e */
    public final C10545t m31604e() {
        return this.f26185c;
    }

    /* renamed from: f */
    public final boolean m31605f() {
        return this.f26183a.m31875i();
    }

    /* renamed from: g */
    public final String m31606g() {
        return this.f26184b;
    }

    /* renamed from: h */
    public final a m31607h() {
        return new a(this);
    }

    /* renamed from: i */
    public final C10546u m31608i() {
        return this.f26183a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(m31606g());
        sb2.append(", url=");
        sb2.append(m31608i());
        if (m31604e().size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (C2028m<? extends String, ? extends String> c2028m : m31604e()) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C7031r.m20589q();
                }
                C2028m<? extends String, ? extends String> c2028m2 = c2028m;
                String m10335a = c2028m2.m10335a();
                String m10336b = c2028m2.m10336b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(m10335a);
                sb2.append(':');
                sb2.append(m10336b);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!m31602c().isEmpty()) {
            sb2.append(", tags=");
            sb2.append(m31602c());
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
