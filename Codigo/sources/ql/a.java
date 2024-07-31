package ql;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import ql.u;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a */
    private final q f24130a;

    /* renamed from: b */
    private final SocketFactory f24131b;

    /* renamed from: c */
    private final SSLSocketFactory f24132c;

    /* renamed from: d */
    private final HostnameVerifier f24133d;

    /* renamed from: e */
    private final g f24134e;

    /* renamed from: f */
    private final b f24135f;

    /* renamed from: g */
    private final Proxy f24136g;

    /* renamed from: h */
    private final ProxySelector f24137h;

    /* renamed from: i */
    private final u f24138i;

    /* renamed from: j */
    private final List<z> f24139j;

    /* renamed from: k */
    private final List<l> f24140k;

    public a(String uriHost, int i10, q dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, g gVar, b proxyAuthenticator, Proxy proxy, List<? extends z> protocols, List<l> connectionSpecs, ProxySelector proxySelector) {
        kotlin.jvm.internal.n.e(uriHost, "uriHost");
        kotlin.jvm.internal.n.e(dns, "dns");
        kotlin.jvm.internal.n.e(socketFactory, "socketFactory");
        kotlin.jvm.internal.n.e(proxyAuthenticator, "proxyAuthenticator");
        kotlin.jvm.internal.n.e(protocols, "protocols");
        kotlin.jvm.internal.n.e(connectionSpecs, "connectionSpecs");
        kotlin.jvm.internal.n.e(proxySelector, "proxySelector");
        this.f24130a = dns;
        this.f24131b = socketFactory;
        this.f24132c = sSLSocketFactory;
        this.f24133d = hostnameVerifier;
        this.f24134e = gVar;
        this.f24135f = proxyAuthenticator;
        this.f24136g = proxy;
        this.f24137h = proxySelector;
        this.f24138i = new u.a().x(sSLSocketFactory != null ? "https" : "http").m(uriHost).s(i10).a();
        this.f24139j = rl.d.S(protocols);
        this.f24140k = rl.d.S(connectionSpecs);
    }

    public final g a() {
        return this.f24134e;
    }

    public final List<l> b() {
        return this.f24140k;
    }

    public final q c() {
        return this.f24130a;
    }

    public final boolean d(a that) {
        kotlin.jvm.internal.n.e(that, "that");
        return kotlin.jvm.internal.n.a(this.f24130a, that.f24130a) && kotlin.jvm.internal.n.a(this.f24135f, that.f24135f) && kotlin.jvm.internal.n.a(this.f24139j, that.f24139j) && kotlin.jvm.internal.n.a(this.f24140k, that.f24140k) && kotlin.jvm.internal.n.a(this.f24137h, that.f24137h) && kotlin.jvm.internal.n.a(this.f24136g, that.f24136g) && kotlin.jvm.internal.n.a(this.f24132c, that.f24132c) && kotlin.jvm.internal.n.a(this.f24133d, that.f24133d) && kotlin.jvm.internal.n.a(this.f24134e, that.f24134e) && this.f24138i.m() == that.f24138i.m();
    }

    public final HostnameVerifier e() {
        return this.f24133d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (kotlin.jvm.internal.n.a(this.f24138i, aVar.f24138i) && d(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final List<z> f() {
        return this.f24139j;
    }

    public final Proxy g() {
        return this.f24136g;
    }

    public final b h() {
        return this.f24135f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f24138i.hashCode()) * 31) + this.f24130a.hashCode()) * 31) + this.f24135f.hashCode()) * 31) + this.f24139j.hashCode()) * 31) + this.f24140k.hashCode()) * 31) + this.f24137h.hashCode()) * 31) + Objects.hashCode(this.f24136g)) * 31) + Objects.hashCode(this.f24132c)) * 31) + Objects.hashCode(this.f24133d)) * 31) + Objects.hashCode(this.f24134e);
    }

    public final ProxySelector i() {
        return this.f24137h;
    }

    public final SocketFactory j() {
        return this.f24131b;
    }

    public final SSLSocketFactory k() {
        return this.f24132c;
    }

    public final u l() {
        return this.f24138i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.f24138i.h());
        sb2.append(':');
        sb2.append(this.f24138i.m());
        sb2.append(", ");
        Proxy proxy = this.f24136g;
        sb2.append(proxy != null ? kotlin.jvm.internal.n.k("proxy=", proxy) : kotlin.jvm.internal.n.k("proxySelector=", this.f24137h));
        sb2.append('}');
        return sb2.toString();
    }
}
