package vl;

import dk.q;
import dk.w;
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
import kotlin.jvm.internal.n;
import ql.e0;
import ql.r;
import ql.u;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: i, reason: collision with root package name */
    public static final a f29396i = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final ql.a f29397a;

    /* renamed from: b, reason: collision with root package name */
    private final h f29398b;

    /* renamed from: c, reason: collision with root package name */
    private final ql.e f29399c;

    /* renamed from: d, reason: collision with root package name */
    private final r f29400d;

    /* renamed from: e, reason: collision with root package name */
    private List<? extends Proxy> f29401e;

    /* renamed from: f, reason: collision with root package name */
    private int f29402f;

    /* renamed from: g, reason: collision with root package name */
    private List<? extends InetSocketAddress> f29403g;

    /* renamed from: h, reason: collision with root package name */
    private final List<e0> f29404h;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            String hostAddress;
            String str;
            n.e(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                hostAddress = inetSocketAddress.getHostName();
                str = "hostName";
            } else {
                hostAddress = address.getHostAddress();
                str = "address.hostAddress";
            }
            n.d(hostAddress, str);
            return hostAddress;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<e0> f29405a;

        /* renamed from: b, reason: collision with root package name */
        private int f29406b;

        public b(List<e0> routes) {
            n.e(routes, "routes");
            this.f29405a = routes;
        }

        public final List<e0> a() {
            return this.f29405a;
        }

        public final boolean b() {
            return this.f29406b < this.f29405a.size();
        }

        public final e0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List<e0> list = this.f29405a;
            int i10 = this.f29406b;
            this.f29406b = i10 + 1;
            return list.get(i10);
        }
    }

    public j(ql.a address, h routeDatabase, ql.e call, r eventListener) {
        List<? extends Proxy> j10;
        List<? extends InetSocketAddress> j11;
        n.e(address, "address");
        n.e(routeDatabase, "routeDatabase");
        n.e(call, "call");
        n.e(eventListener, "eventListener");
        this.f29397a = address;
        this.f29398b = routeDatabase;
        this.f29399c = call;
        this.f29400d = eventListener;
        j10 = dk.r.j();
        this.f29401e = j10;
        j11 = dk.r.j();
        this.f29403g = j11;
        this.f29404h = new ArrayList();
        f(address.l(), address.g());
    }

    private final boolean b() {
        return this.f29402f < this.f29401e.size();
    }

    private final Proxy d() {
        if (b()) {
            List<? extends Proxy> list = this.f29401e;
            int i10 = this.f29402f;
            this.f29402f = i10 + 1;
            Proxy proxy = list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f29397a.l().h() + "; exhausted proxy configurations: " + this.f29401e);
    }

    private final void e(Proxy proxy) {
        String h10;
        int m10;
        List<InetAddress> a10;
        ArrayList arrayList = new ArrayList();
        this.f29403g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            h10 = this.f29397a.l().h();
            m10 = this.f29397a.l().m();
        } else {
            SocketAddress proxyAddress = proxy.address();
            if (!(proxyAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(n.k("Proxy.address() is not an InetSocketAddress: ", proxyAddress.getClass()).toString());
            }
            a aVar = f29396i;
            n.d(proxyAddress, "proxyAddress");
            InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
            h10 = aVar.a(inetSocketAddress);
            m10 = inetSocketAddress.getPort();
        }
        boolean z10 = false;
        if (1 <= m10 && m10 < 65536) {
            z10 = true;
        }
        if (!z10) {
            throw new SocketException("No route to " + h10 + ':' + m10 + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(h10, m10));
            return;
        }
        if (rl.d.i(h10)) {
            a10 = q.e(InetAddress.getByName(h10));
        } else {
            this.f29400d.m(this.f29399c, h10);
            a10 = this.f29397a.c().a(h10);
            if (a10.isEmpty()) {
                throw new UnknownHostException(this.f29397a.c() + " returned no addresses for " + h10);
            }
            this.f29400d.l(this.f29399c, h10, a10);
        }
        Iterator<InetAddress> it = a10.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), m10));
        }
    }

    private final void f(u uVar, Proxy proxy) {
        this.f29400d.o(this.f29399c, uVar);
        List<Proxy> g10 = g(proxy, uVar, this);
        this.f29401e = g10;
        this.f29402f = 0;
        this.f29400d.n(this.f29399c, uVar, g10);
    }

    private static final List<Proxy> g(Proxy proxy, u uVar, j jVar) {
        List<Proxy> e10;
        if (proxy != null) {
            e10 = q.e(proxy);
            return e10;
        }
        URI r10 = uVar.r();
        if (r10.getHost() == null) {
            return rl.d.w(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = jVar.f29397a.i().select(r10);
        List<Proxy> list = proxiesOrNull;
        if (list == null || list.isEmpty()) {
            return rl.d.w(Proxy.NO_PROXY);
        }
        n.d(proxiesOrNull, "proxiesOrNull");
        return rl.d.S(proxiesOrNull);
    }

    public final boolean a() {
        return b() || (this.f29404h.isEmpty() ^ true);
    }

    public final b c() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy d10 = d();
            Iterator<? extends InetSocketAddress> it = this.f29403g.iterator();
            while (it.hasNext()) {
                e0 e0Var = new e0(this.f29397a, d10, it.next());
                if (this.f29398b.c(e0Var)) {
                    this.f29404h.add(e0Var);
                } else {
                    arrayList.add(e0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            w.u(arrayList, this.f29404h);
            this.f29404h.clear();
        }
        return new b(arrayList);
    }
}
