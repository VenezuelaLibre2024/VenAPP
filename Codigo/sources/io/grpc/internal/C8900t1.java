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
import p082eb.C7159o;
import p082eb.InterfaceC7166v;
import vi.AbstractC11903c1;
import vi.C11899b0;
import vi.InterfaceC11906d1;

/* renamed from: io.grpc.internal.t1 */
/* loaded from: classes3.dex */
class C8900t1 implements InterfaceC11906d1 {

    /* renamed from: d */
    private static final Logger f20897d = Logger.getLogger(C8900t1.class.getName());

    /* renamed from: e */
    private static final c f20898e = new a();

    /* renamed from: f */
    private static final InterfaceC7166v<ProxySelector> f20899f = new b();

    /* renamed from: a */
    private final InterfaceC7166v<ProxySelector> f20900a;

    /* renamed from: b */
    private final c f20901b;

    /* renamed from: c */
    private final InetSocketAddress f20902c;

    /* renamed from: io.grpc.internal.t1$a */
    /* loaded from: classes3.dex */
    class a implements c {
        a() {
        }

        @Override // io.grpc.internal.C8900t1.c
        /* renamed from: a */
        public PasswordAuthentication mo25841a(String str, InetAddress inetAddress, int i10, String str2, String str3, String str4) {
            URL url;
            try {
                url = new URL(str2, str, i10, "");
            } catch (MalformedURLException unused) {
                C8900t1.f20897d.log(Level.WARNING, "failed to create URL for Authenticator: {0} {1}", new Object[]{str2, str});
                url = null;
            }
            return Authenticator.requestPasswordAuthentication(str, inetAddress, i10, str2, str3, str4, url, Authenticator.RequestorType.PROXY);
        }
    }

    /* renamed from: io.grpc.internal.t1$b */
    /* loaded from: classes3.dex */
    class b implements InterfaceC7166v<ProxySelector> {
        b() {
        }

        @Override // p082eb.InterfaceC7166v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ProxySelector get() {
            return ProxySelector.getDefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.internal.t1$c */
    /* loaded from: classes3.dex */
    public interface c {
        /* renamed from: a */
        PasswordAuthentication mo25841a(String str, InetAddress inetAddress, int i10, String str2, String str3, String str4);
    }

    public C8900t1() {
        this(f20899f, f20898e, System.getenv("GRPC_PROXY_EXP"));
    }

    C8900t1(InterfaceC7166v<ProxySelector> interfaceC7166v, c cVar, String str) {
        this.f20900a = (InterfaceC7166v) C7159o.m21312o(interfaceC7166v);
        this.f20901b = (c) C7159o.m21312o(cVar);
        this.f20902c = str != null ? m25840d(str) : null;
    }

    /* renamed from: c */
    private AbstractC11903c1 m25839c(InetSocketAddress inetSocketAddress) {
        try {
            try {
                URI uri = new URI("https", null, C8890q0.m25751h(inetSocketAddress), inetSocketAddress.getPort(), null, null, null);
                ProxySelector proxySelector = this.f20900a.get();
                if (proxySelector == null) {
                    f20897d.log(Level.FINE, "proxy selector is null, so continuing without proxy lookup");
                    return null;
                }
                List<Proxy> select = proxySelector.select(uri);
                if (select.size() > 1) {
                    f20897d.warning("More than 1 proxy detected, gRPC will select the first one");
                }
                Proxy proxy = select.get(0);
                if (proxy.type() == Proxy.Type.DIRECT) {
                    return null;
                }
                InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
                PasswordAuthentication mo25841a = this.f20901b.mo25841a(C8890q0.m25751h(inetSocketAddress2), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), "https", "", null);
                if (inetSocketAddress2.isUnresolved()) {
                    inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
                }
                C11899b0.b m38074c = C11899b0.m38067e().m38075d(inetSocketAddress).m38074c(inetSocketAddress2);
                if (mo25841a == null) {
                    return m38074c.m38072a();
                }
                return m38074c.m38076e(mo25841a.getUserName()).m38073b(mo25841a.getPassword() != null ? new String(mo25841a.getPassword()) : null).m38072a();
            } catch (URISyntaxException e10) {
                f20897d.log(Level.WARNING, "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e10);
                return null;
            }
        } catch (Throwable th2) {
            f20897d.log(Level.WARNING, "Failed to get host for proxy lookup, proceeding without proxy", th2);
            return null;
        }
    }

    /* renamed from: d */
    private static InetSocketAddress m25840d(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":", 2);
        int parseInt = split.length > 1 ? Integer.parseInt(split[1]) : 80;
        f20897d.warning("Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM.");
        return new InetSocketAddress(split[0], parseInt);
    }

    @Override // vi.InterfaceC11906d1
    /* renamed from: a */
    public AbstractC11903c1 mo25759a(SocketAddress socketAddress) {
        if (socketAddress instanceof InetSocketAddress) {
            return this.f20902c != null ? C11899b0.m38067e().m38074c(this.f20902c).m38075d((InetSocketAddress) socketAddress).m38072a() : m25839c((InetSocketAddress) socketAddress);
        }
        return null;
    }
}
