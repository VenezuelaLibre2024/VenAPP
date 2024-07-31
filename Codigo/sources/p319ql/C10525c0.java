package p319ql;

import dk.C7031r;
import java.io.Closeable;
import java.util.List;
import kotlin.jvm.internal.C9322n;
import p319ql.C10545t;
import p406vl.C11976c;
import p428wl.C12242e;

/* renamed from: ql.c0 */
/* loaded from: classes3.dex */
public final class C10525c0 implements Closeable {

    /* renamed from: a */
    private final C10521a0 f26205a;

    /* renamed from: b */
    private final EnumC10551z f26206b;

    /* renamed from: c */
    private final String f26207c;

    /* renamed from: d */
    private final int f26208d;

    /* renamed from: e */
    private final C10544s f26209e;

    /* renamed from: f */
    private final C10545t f26210f;

    /* renamed from: r */
    private final AbstractC10527d0 f26211r;

    /* renamed from: s */
    private final C10525c0 f26212s;

    /* renamed from: t */
    private final C10525c0 f26213t;

    /* renamed from: u */
    private final C10525c0 f26214u;

    /* renamed from: v */
    private final long f26215v;

    /* renamed from: w */
    private final long f26216w;

    /* renamed from: x */
    private final C11976c f26217x;

    /* renamed from: y */
    private C10526d f26218y;

    /* renamed from: ql.c0$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private C10521a0 f26219a;

        /* renamed from: b */
        private EnumC10551z f26220b;

        /* renamed from: c */
        private int f26221c;

        /* renamed from: d */
        private String f26222d;

        /* renamed from: e */
        private C10544s f26223e;

        /* renamed from: f */
        private C10545t.a f26224f;

        /* renamed from: g */
        private AbstractC10527d0 f26225g;

        /* renamed from: h */
        private C10525c0 f26226h;

        /* renamed from: i */
        private C10525c0 f26227i;

        /* renamed from: j */
        private C10525c0 f26228j;

        /* renamed from: k */
        private long f26229k;

        /* renamed from: l */
        private long f26230l;

        /* renamed from: m */
        private C11976c f26231m;

        public a() {
            this.f26221c = -1;
            this.f26224f = new C10545t.a();
        }

        public a(C10525c0 response) {
            C9322n.m27781e(response, "response");
            this.f26221c = -1;
            this.f26219a = response.m31639O();
            this.f26220b = response.m31637H();
            this.f26221c = response.m31645g();
            this.f26222d = response.m31651r();
            this.f26223e = response.m31647j();
            this.f26224f = response.m31649o().m31848k();
            this.f26225g = response.m31641a();
            this.f26226h = response.m31652y();
            this.f26227i = response.m31643e();
            this.f26228j = response.m31636E();
            this.f26229k = response.m31640Q();
            this.f26230l = response.m31638I();
            this.f26231m = response.m31646i();
        }

        /* renamed from: e */
        private final void m31653e(C10525c0 c10525c0) {
            if (c10525c0 == null) {
                return;
            }
            if (!(c10525c0.m31641a() == null)) {
                throw new IllegalArgumentException("priorResponse.body != null".toString());
            }
        }

        /* renamed from: f */
        private final void m31654f(String str, C10525c0 c10525c0) {
            if (c10525c0 == null) {
                return;
            }
            if (!(c10525c0.m31641a() == null)) {
                throw new IllegalArgumentException(C9322n.m27787k(str, ".body != null").toString());
            }
            if (!(c10525c0.m31652y() == null)) {
                throw new IllegalArgumentException(C9322n.m27787k(str, ".networkResponse != null").toString());
            }
            if (!(c10525c0.m31643e() == null)) {
                throw new IllegalArgumentException(C9322n.m27787k(str, ".cacheResponse != null").toString());
            }
            if (!(c10525c0.m31636E() == null)) {
                throw new IllegalArgumentException(C9322n.m27787k(str, ".priorResponse != null").toString());
            }
        }

        /* renamed from: A */
        public final void m31655A(C10525c0 c10525c0) {
            this.f26226h = c10525c0;
        }

        /* renamed from: B */
        public final void m31656B(C10525c0 c10525c0) {
            this.f26228j = c10525c0;
        }

        /* renamed from: C */
        public final void m31657C(EnumC10551z enumC10551z) {
            this.f26220b = enumC10551z;
        }

        /* renamed from: D */
        public final void m31658D(long j10) {
            this.f26230l = j10;
        }

        /* renamed from: E */
        public final void m31659E(C10521a0 c10521a0) {
            this.f26219a = c10521a0;
        }

        /* renamed from: F */
        public final void m31660F(long j10) {
            this.f26229k = j10;
        }

        /* renamed from: a */
        public a m31661a(String name, String value) {
            C9322n.m27781e(name, "name");
            C9322n.m27781e(value, "value");
            m31667i().m31851a(name, value);
            return this;
        }

        /* renamed from: b */
        public a m31662b(AbstractC10527d0 abstractC10527d0) {
            m31679u(abstractC10527d0);
            return this;
        }

        /* renamed from: c */
        public C10525c0 m31663c() {
            int i10 = this.f26221c;
            if (!(i10 >= 0)) {
                throw new IllegalStateException(C9322n.m27787k("code < 0: ", Integer.valueOf(m31666h())).toString());
            }
            C10521a0 c10521a0 = this.f26219a;
            if (c10521a0 == null) {
                throw new IllegalStateException("request == null".toString());
            }
            EnumC10551z enumC10551z = this.f26220b;
            if (enumC10551z == null) {
                throw new IllegalStateException("protocol == null".toString());
            }
            String str = this.f26222d;
            if (str != null) {
                return new C10525c0(c10521a0, enumC10551z, str, i10, this.f26223e, this.f26224f.m31855e(), this.f26225g, this.f26226h, this.f26227i, this.f26228j, this.f26229k, this.f26230l, this.f26231m);
            }
            throw new IllegalStateException("message == null".toString());
        }

        /* renamed from: d */
        public a m31664d(C10525c0 c10525c0) {
            m31654f("cacheResponse", c10525c0);
            m31680v(c10525c0);
            return this;
        }

        /* renamed from: g */
        public a m31665g(int i10) {
            m31681w(i10);
            return this;
        }

        /* renamed from: h */
        public final int m31666h() {
            return this.f26221c;
        }

        /* renamed from: i */
        public final C10545t.a m31667i() {
            return this.f26224f;
        }

        /* renamed from: j */
        public a m31668j(C10544s c10544s) {
            m31682x(c10544s);
            return this;
        }

        /* renamed from: k */
        public a m31669k(String name, String value) {
            C9322n.m27781e(name, "name");
            C9322n.m27781e(value, "value");
            m31667i().m31858h(name, value);
            return this;
        }

        /* renamed from: l */
        public a m31670l(C10545t headers) {
            C9322n.m27781e(headers, "headers");
            m31683y(headers.m31848k());
            return this;
        }

        /* renamed from: m */
        public final void m31671m(C11976c deferredTrailers) {
            C9322n.m27781e(deferredTrailers, "deferredTrailers");
            this.f26231m = deferredTrailers;
        }

        /* renamed from: n */
        public a m31672n(String message) {
            C9322n.m27781e(message, "message");
            m31684z(message);
            return this;
        }

        /* renamed from: o */
        public a m31673o(C10525c0 c10525c0) {
            m31654f("networkResponse", c10525c0);
            m31655A(c10525c0);
            return this;
        }

        /* renamed from: p */
        public a m31674p(C10525c0 c10525c0) {
            m31653e(c10525c0);
            m31656B(c10525c0);
            return this;
        }

        /* renamed from: q */
        public a m31675q(EnumC10551z protocol) {
            C9322n.m27781e(protocol, "protocol");
            m31657C(protocol);
            return this;
        }

        /* renamed from: r */
        public a m31676r(long j10) {
            m31658D(j10);
            return this;
        }

        /* renamed from: s */
        public a m31677s(C10521a0 request) {
            C9322n.m27781e(request, "request");
            m31659E(request);
            return this;
        }

        /* renamed from: t */
        public a m31678t(long j10) {
            m31660F(j10);
            return this;
        }

        /* renamed from: u */
        public final void m31679u(AbstractC10527d0 abstractC10527d0) {
            this.f26225g = abstractC10527d0;
        }

        /* renamed from: v */
        public final void m31680v(C10525c0 c10525c0) {
            this.f26227i = c10525c0;
        }

        /* renamed from: w */
        public final void m31681w(int i10) {
            this.f26221c = i10;
        }

        /* renamed from: x */
        public final void m31682x(C10544s c10544s) {
            this.f26223e = c10544s;
        }

        /* renamed from: y */
        public final void m31683y(C10545t.a aVar) {
            C9322n.m27781e(aVar, "<set-?>");
            this.f26224f = aVar;
        }

        /* renamed from: z */
        public final void m31684z(String str) {
            this.f26222d = str;
        }
    }

    public C10525c0(C10521a0 request, EnumC10551z protocol, String message, int i10, C10544s c10544s, C10545t headers, AbstractC10527d0 abstractC10527d0, C10525c0 c10525c0, C10525c0 c10525c02, C10525c0 c10525c03, long j10, long j11, C11976c c11976c) {
        C9322n.m27781e(request, "request");
        C9322n.m27781e(protocol, "protocol");
        C9322n.m27781e(message, "message");
        C9322n.m27781e(headers, "headers");
        this.f26205a = request;
        this.f26206b = protocol;
        this.f26207c = message;
        this.f26208d = i10;
        this.f26209e = c10544s;
        this.f26210f = headers;
        this.f26211r = abstractC10527d0;
        this.f26212s = c10525c0;
        this.f26213t = c10525c02;
        this.f26214u = c10525c03;
        this.f26215v = j10;
        this.f26216w = j11;
        this.f26217x = c11976c;
    }

    /* renamed from: n */
    public static /* synthetic */ String m31634n(C10525c0 c10525c0, String str, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c10525c0.m31648l(str, str2);
    }

    /* renamed from: B */
    public final a m31635B() {
        return new a(this);
    }

    /* renamed from: E */
    public final C10525c0 m31636E() {
        return this.f26214u;
    }

    /* renamed from: H */
    public final EnumC10551z m31637H() {
        return this.f26206b;
    }

    /* renamed from: I */
    public final long m31638I() {
        return this.f26216w;
    }

    /* renamed from: O */
    public final C10521a0 m31639O() {
        return this.f26205a;
    }

    /* renamed from: Q */
    public final long m31640Q() {
        return this.f26215v;
    }

    /* renamed from: a */
    public final AbstractC10527d0 m31641a() {
        return this.f26211r;
    }

    /* renamed from: b */
    public final C10526d m31642b() {
        C10526d c10526d = this.f26218y;
        if (c10526d != null) {
            return c10526d;
        }
        C10526d m31703b = C10526d.f26232n.m31703b(this.f26210f);
        this.f26218y = m31703b;
        return m31703b;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        AbstractC10527d0 abstractC10527d0 = this.f26211r;
        if (abstractC10527d0 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
        }
        abstractC10527d0.close();
    }

    /* renamed from: e */
    public final C10525c0 m31643e() {
        return this.f26213t;
    }

    /* renamed from: f */
    public final List<C10533h> m31644f() {
        String str;
        List<C10533h> m20582j;
        C10545t c10545t = this.f26210f;
        int i10 = this.f26208d;
        if (i10 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i10 != 407) {
                m20582j = C7031r.m20582j();
                return m20582j;
            }
            str = "Proxy-Authenticate";
        }
        return C12242e.m39403a(c10545t, str);
    }

    /* renamed from: g */
    public final int m31645g() {
        return this.f26208d;
    }

    /* renamed from: i */
    public final C11976c m31646i() {
        return this.f26217x;
    }

    /* renamed from: j */
    public final C10544s m31647j() {
        return this.f26209e;
    }

    /* renamed from: l */
    public final String m31648l(String name, String str) {
        C9322n.m27781e(name, "name");
        String m31845c = this.f26210f.m31845c(name);
        return m31845c == null ? str : m31845c;
    }

    /* renamed from: o */
    public final C10545t m31649o() {
        return this.f26210f;
    }

    /* renamed from: q */
    public final boolean m31650q() {
        int i10 = this.f26208d;
        return 200 <= i10 && i10 < 300;
    }

    /* renamed from: r */
    public final String m31651r() {
        return this.f26207c;
    }

    public String toString() {
        return "Response{protocol=" + this.f26206b + ", code=" + this.f26208d + ", message=" + this.f26207c + ", url=" + this.f26205a.m31608i() + '}';
    }

    /* renamed from: y */
    public final C10525c0 m31652y() {
        return this.f26212s;
    }
}
