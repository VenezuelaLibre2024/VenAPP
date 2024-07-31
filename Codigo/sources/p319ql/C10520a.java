package p319ql;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.C9322n;
import p319ql.C10546u;
import p341rl.C10727d;

/* renamed from: ql.a */
/* loaded from: classes3.dex */
public final class C10520a {

    /* renamed from: a */
    private final InterfaceC10542q f26172a;

    /* renamed from: b */
    private final SocketFactory f26173b;

    /* renamed from: c */
    private final SSLSocketFactory f26174c;

    /* renamed from: d */
    private final HostnameVerifier f26175d;

    /* renamed from: e */
    private final C10532g f26176e;

    /* renamed from: f */
    private final InterfaceC10522b f26177f;

    /* renamed from: g */
    private final Proxy f26178g;

    /* renamed from: h */
    private final ProxySelector f26179h;

    /* renamed from: i */
    private final C10546u f26180i;

    /* renamed from: j */
    private final List<EnumC10551z> f26181j;

    /* renamed from: k */
    private final List<C10537l> f26182k;

    public C10520a(String uriHost, int i10, InterfaceC10542q dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C10532g c10532g, InterfaceC10522b proxyAuthenticator, Proxy proxy, List<? extends EnumC10551z> protocols, List<C10537l> connectionSpecs, ProxySelector proxySelector) {
        C9322n.m27781e(uriHost, "uriHost");
        C9322n.m27781e(dns, "dns");
        C9322n.m27781e(socketFactory, "socketFactory");
        C9322n.m27781e(proxyAuthenticator, "proxyAuthenticator");
        C9322n.m27781e(protocols, "protocols");
        C9322n.m27781e(connectionSpecs, "connectionSpecs");
        C9322n.m27781e(proxySelector, "proxySelector");
        this.f26172a = dns;
        this.f26173b = socketFactory;
        this.f26174c = sSLSocketFactory;
        this.f26175d = hostnameVerifier;
        this.f26176e = c10532g;
        this.f26177f = proxyAuthenticator;
        this.f26178g = proxy;
        this.f26179h = proxySelector;
        this.f26180i = new C10546u.a().m31914x(sSLSocketFactory != null ? "https" : "http").m31908m(uriHost).m31911s(i10).m31897a();
        this.f26181j = C10727d.m32633S(protocols);
        this.f26182k = C10727d.m32633S(connectionSpecs);
    }

    /* renamed from: a */
    public final C10532g m31588a() {
        return this.f26176e;
    }

    /* renamed from: b */
    public final List<C10537l> m31589b() {
        return this.f26182k;
    }

    /* renamed from: c */
    public final InterfaceC10542q m31590c() {
        return this.f26172a;
    }

    /* renamed from: d */
    public final boolean m31591d(C10520a that) {
        C9322n.m27781e(that, "that");
        return C9322n.m27777a(this.f26172a, that.f26172a) && C9322n.m27777a(this.f26177f, that.f26177f) && C9322n.m27777a(this.f26181j, that.f26181j) && C9322n.m27777a(this.f26182k, that.f26182k) && C9322n.m27777a(this.f26179h, that.f26179h) && C9322n.m27777a(this.f26178g, that.f26178g) && C9322n.m27777a(this.f26174c, that.f26174c) && C9322n.m27777a(this.f26175d, that.f26175d) && C9322n.m27777a(this.f26176e, that.f26176e) && this.f26180i.m31878m() == that.f26180i.m31878m();
    }

    /* renamed from: e */
    public final HostnameVerifier m31592e() {
        return this.f26175d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10520a) {
            C10520a c10520a = (C10520a) obj;
            if (C9322n.m27777a(this.f26180i, c10520a.f26180i) && m31591d(c10520a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final List<EnumC10551z> m31593f() {
        return this.f26181j;
    }

    /* renamed from: g */
    public final Proxy m31594g() {
        return this.f26178g;
    }

    /* renamed from: h */
    public final InterfaceC10522b m31595h() {
        return this.f26177f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f26180i.hashCode()) * 31) + this.f26172a.hashCode()) * 31) + this.f26177f.hashCode()) * 31) + this.f26181j.hashCode()) * 31) + this.f26182k.hashCode()) * 31) + this.f26179h.hashCode()) * 31) + Objects.hashCode(this.f26178g)) * 31) + Objects.hashCode(this.f26174c)) * 31) + Objects.hashCode(this.f26175d)) * 31) + Objects.hashCode(this.f26176e);
    }

    /* renamed from: i */
    public final ProxySelector m31596i() {
        return this.f26179h;
    }

    /* renamed from: j */
    public final SocketFactory m31597j() {
        return this.f26173b;
    }

    /* renamed from: k */
    public final SSLSocketFactory m31598k() {
        return this.f26174c;
    }

    /* renamed from: l */
    public final C10546u m31599l() {
        return this.f26180i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f26180i.m31874h());
        sb2.append(':');
        sb2.append(this.f26180i.m31878m());
        sb2.append(", ");
        Proxy proxy = this.f26178g;
        sb2.append(proxy != null ? C9322n.m27787k("proxy=", proxy) : C9322n.m27787k("proxySelector=", this.f26179h));
        sb2.append('}');
        return sb2.toString();
    }
}
