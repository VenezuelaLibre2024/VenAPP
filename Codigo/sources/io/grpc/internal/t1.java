package io.grpc.internal;

import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import vi.b0;

/* loaded from: classes3.dex */
class t1 implements vi.d1 {

    /* renamed from: d, reason: collision with root package name */
    private static final Logger f19150d = Logger.getLogger(t1.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private static final c f19151e = new a();

    /* renamed from: f, reason: collision with root package name */
    private static final eb.v<ProxySelector> f19152f = new b();

    /* renamed from: a, reason: collision with root package name */
    private final eb.v<ProxySelector> f19153a;

    /* renamed from: b, reason: collision with root package name */
    private final c f19154b;

    /* renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f19155c;

    /* loaded from: classes3.dex */
    class a implements c {
        a() {
        }

        @Override // io.grpc.internal.t1.c
        public PasswordAuthentication a(String str, InetAddress inetAddress, int i10, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i10, "");
            } catch (MalformedURLException unused) {
                t1.f19150d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{str2, str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i10, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* loaded from: classes3.dex */
    class b implements eb.v<ProxySelector> {
        b() {
        }

        @Override // eb.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface c {
        PasswordAuthentication a(String str, InetAddress inetAddress, int i10, String str2, String str3, String str4);
    }

    public t1() {
        this(f19152f, f19151e, System.getenv("GRPC_PROXY_EXP"));
    }

    t1(eb.v<ProxySelector> vVar, c cVar, String str) {
        this.f19153a = (eb.v) eb.o.o(vVar);
        this.f19154b = (c) eb.o.o(cVar);
        this.f19155c = str != null ? d(str) : null;
    }

    private vi.c1 c(InetSocketAddress inetSocketAddress) {
        try {
            try {
                URI uri = new URI("https", null, q0.h(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = this.f19153a.get();
                if (proxySelector == null) {
                    f19150d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    f19150d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication a10 = this.f19154b.a(q0.h(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                b0.b c10 = vi.b0.e().d(inetSocketAddress).c(inetSocketAddress2);
                if (a10 == null) {
                    return c10.a();
                }
                return c10.e(a10.getUserName()).b(a10.getPassword() != null ? new String(a10.getPassword()) : null).a();
            } catch (URISyntaxException e10) {
                f19150d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e10);
                return null;
            }
        } catch (Throwable th2) {
            f19150d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th2);
            return null;
        }
    }

    private static InetSocketAddress d(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":", 2);
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
        f19150d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(split[0], parseInt);
    }

    @Override // vi.d1
    public vi.c1 a(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return this.f19155c != null ? vi.b0.e().c(this.f19155c).d((InetSocketAddress) socketAddress).a() : c((InetSocketAddress) socketAddress);
        }
        return null;
    }
}
