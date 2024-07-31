package p406vl;

import dk.C7029q;
import dk.C7031r;
import dk.C7039w;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.AbstractC10543r;
import p319ql.C10520a;
import p319ql.C10529e0;
import p319ql.C10546u;
import p319ql.InterfaceC10528e;
import p341rl.C10727d;

/* renamed from: vl.j */
/* loaded from: classes3.dex */
public final class C11983j {

    /* renamed from: i */
    public static final a f31834i = new a(null);

    /* renamed from: a */
    private final C10520a f31835a;

    /* renamed from: b */
    private final C11981h f31836b;

    /* renamed from: c */
    private final InterfaceC10528e f31837c;

    /* renamed from: d */
    private final AbstractC10543r f31838d;

    /* renamed from: e */
    private List<? extends Proxy> f31839e;

    /* renamed from: f */
    private int f31840f;

    /* renamed from: g */
    private List<? extends InetSocketAddress> f31841g;

    /* renamed from: h */
    private final List<C10529e0> f31842h;

    /* renamed from: vl.j$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final String m38514a(InetSocketAddress inetSocketAddress) {
            String hostAddress;
            String str;
            C9322n.m27781e(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                hostAddress = inetSocketAddress.getHostName();
                str = "hostName";
            } else {
                hostAddress = address.getHostAddress();
                str = "address.hostAddress";
            }
            C9322n.m27780d(hostAddress, str);
            return hostAddress;
        }
    }

    /* renamed from: vl.j$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final List<C10529e0> f31843a;

        /* renamed from: b */
        private int f31844b;

        public b(List<C10529e0> routes) {
            C9322n.m27781e(routes, "routes");
            this.f31843a = routes;
        }

        /* renamed from: a */
        public final List<C10529e0> m38515a() {
            return this.f31843a;
        }

        /* renamed from: b */
        public final boolean m38516b() {
            return this.f31844b < this.f31843a.size();
        }

        /* renamed from: c */
        public final C10529e0 m38517c() {
            if (!m38516b()) {
                throw new NoSuchElementException();
            }
            List<C10529e0> list = this.f31843a;
            int i10 = this.f31844b;
            this.f31844b = i10 + 1;
            return list.get(i10);
        }
    }

    public C11983j(C10520a address, C11981h routeDatabase, InterfaceC10528e call, AbstractC10543r eventListener) {
        List<? extends Proxy> m20582j;
        List<? extends InetSocketAddress> m20582j2;
        C9322n.m27781e(address, "address");
        C9322n.m27781e(routeDatabase, "routeDatabase");
        C9322n.m27781e(call, "call");
        C9322n.m27781e(eventListener, "eventListener");
        this.f31835a = address;
        this.f31836b = routeDatabase;
        this.f31837c = call;
        this.f31838d = eventListener;
        m20582j = C7031r.m20582j();
        this.f31839e = m20582j;
        m20582j2 = C7031r.m20582j();
        this.f31841g = m20582j2;
        this.f31842h = new ArrayList();
        m38510f(address.m31599l(), address.m31594g());
    }

    /* renamed from: b */
    private final boolean m38507b() {
        return this.f31840f < this.f31839e.size();
    }

    /* renamed from: d */
    private final Proxy m38508d() {
        if (m38507b()) {
            List<? extends Proxy> list = this.f31839e;
            int i10 = this.f31840f;
            this.f31840f = i10 + 1;
            Proxy proxy = list.get(i10);
            m38509e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f31835a.m31599l().m31874h() + "; exhausted proxy configurations: " + this.f31839e);
    }

    /* renamed from: e */
    private final void m38509e(Proxy proxy) {
        String m31874h;
        int m31878m;
        List<InetAddress> mo31806a;
        ArrayList arrayList = new ArrayList();
        this.f31841g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            m31874h = this.f31835a.m31599l().m31874h();
            m31878m = this.f31835a.m31599l().m31878m();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(C9322n.m27787k("Proxy.address() is not an InetSocketAddress: ", proxyAddress.getClass()).toString());
            }
            a aVar = f31834i;
            C9322n.m27780d(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            m31874h = aVar.m38514a(inetSocketAddress);
            m31878m = inetSocketAddress.getPort();
        }
        boolean z10 = false;
        if (1 <= m31878m && m31878m < 65536) {
            z10 = true;
        }
        if (!z10) {
            throw new SocketException("No route to " + m31874h + ':' + m31878m + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(m31874h, m31878m));
            return;
        }
        if (C10727d.m32649i(m31874h)) {
            mo31806a = C7029q.m20572e(InetAddress.getByName(m31874h));
        } else {
            this.f31838d.m31821m(this.f31837c, m31874h);
            mo31806a = this.f31835a.m31590c().mo31806a(m31874h);
            if (mo31806a.isEmpty()) {
                throw new UnknownHostException(this.f31835a.m31590c() + " returned no addresses for " + m31874h);
            }
            this.f31838d.m31820l(this.f31837c, m31874h, mo31806a);
        }
        Iterator<InetAddress> it = mo31806a.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), m31878m));
        }
    }

    /* renamed from: f */
    private final void m38510f(C10546u c10546u, Proxy proxy) {
        this.f31838d.m31823o(this.f31837c, c10546u);
        List<Proxy> m38511g = m38511g(proxy, c10546u, this);
        this.f31839e = m38511g;
        this.f31840f = 0;
        this.f31838d.m31822n(this.f31837c, c10546u, m38511g);
    }

    /* renamed from: g */
    private static final List<Proxy> m38511g(Proxy proxy, C10546u c10546u, C11983j c11983j) {
        List<Proxy> m20572e;
        if (proxy != null) {
            m20572e = C7029q.m20572e(proxy);
            return m20572e;
        }
        URI m31883r = c10546u.m31883r();
        if (m31883r.getHost() == null) {
            return C10727d.m32663w(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = c11983j.f31835a.m31596i().select(m31883r);
        List<Proxy> list = proxiesOrNull;
        if (list == null || list.isEmpty()) {
            return C10727d.m32663w(Proxy.NO_PROXY);
        }
        C9322n.m27780d(proxiesOrNull, "proxiesOrNull");
        return C10727d.m32633S(proxiesOrNull);
    }

    /* renamed from: a */
    public final boolean m38512a() {
        return m38507b() || (this.f31842h.isEmpty() ^ true);
    }

    /* renamed from: c */
    public final b m38513c() {
        if (!m38512a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m38507b()) {
            Proxy m38508d = m38508d();
            Iterator<? extends InetSocketAddress> it = this.f31841g.iterator();
            while (it.hasNext()) {
                C10529e0 c10529e0 = new C10529e0(this.f31835a, m38508d, it.next());
                if (this.f31836b.m38503c(c10529e0)) {
                    this.f31842h.add(c10529e0);
                } else {
                    arrayList.add(c10529e0);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            C7039w.m20597u(arrayList, this.f31842h);
            this.f31842h.clear();
        }
        return new b(arrayList);
    }
}
