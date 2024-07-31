package vl;

import dm.l;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.o;
import ql.a0;
import ql.c0;
import ql.e0;
import ql.r;
import ql.s;
import ql.u;
import ql.y;
import ql.z;
import xk.p;
import yl.f;
import yl.m;

/* loaded from: classes3.dex */
public final class f extends f.c implements ql.j {

    /* renamed from: t */
    public static final a f29363t = new a(null);

    /* renamed from: c */
    private final g f29364c;

    /* renamed from: d */
    private final e0 f29365d;

    /* renamed from: e */
    private Socket f29366e;

    /* renamed from: f */
    private Socket f29367f;

    /* renamed from: g */
    private s f29368g;

    /* renamed from: h */
    private z f29369h;

    /* renamed from: i */
    private yl.f f29370i;

    /* renamed from: j */
    private dm.d f29371j;

    /* renamed from: k */
    private dm.c f29372k;

    /* renamed from: l */
    private boolean f29373l;

    /* renamed from: m */
    private boolean f29374m;

    /* renamed from: n */
    private int f29375n;

    /* renamed from: o */
    private int f29376o;

    /* renamed from: p */
    private int f29377p;

    /* renamed from: q */
    private int f29378q;

    /* renamed from: r */
    private final List<Reference<e>> f29379r;

    /* renamed from: s */
    private long f29380s;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29381a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f29381a = iArr;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends o implements ok.a<List<? extends Certificate>> {

        /* renamed from: a */
        final /* synthetic */ ql.g f29382a;

        /* renamed from: b */
        final /* synthetic */ s f29383b;

        /* renamed from: c */
        final /* synthetic */ ql.a f29384c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ql.g gVar, s sVar, ql.a aVar) {
            super(0);
            this.f29382a = gVar;
            this.f29383b = sVar;
            this.f29384c = aVar;
        }

        @Override // ok.a
        /* renamed from: a */
        public final List<Certificate> invoke() {
            cm.c d10 = this.f29382a.d();
            n.b(d10);
            return d10.a(this.f29383b.d(), this.f29384c.l().h());
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends o implements ok.a<List<? extends X509Certificate>> {
        d() {
            super(0);
        }

        @Override // ok.a
        /* renamed from: a */
        public final List<X509Certificate> invoke() {
            int r10;
            s sVar = f.this.f29368g;
            n.b(sVar);
            List<Certificate> d10 = sVar.d();
            r10 = dk.s.r(d10, 10);
            ArrayList arrayList = new ArrayList(r10);
            Iterator<T> it = d10.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public f(g connectionPool, e0 route) {
        n.e(connectionPool, "connectionPool");
        n.e(route, "route");
        this.f29364c = connectionPool;
        this.f29365d = route;
        this.f29378q = 1;
        this.f29379r = new ArrayList();
        this.f29380s = Long.MAX_VALUE;
    }

    private final boolean A(List<e0> list) {
        List<e0> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (e0 e0Var : list2) {
            if (e0Var.b().type() == Proxy.Type.DIRECT && this.f29365d.b().type() == Proxy.Type.DIRECT && n.a(this.f29365d.d(), e0Var.d())) {
                return true;
            }
        }
        return false;
    }

    private final void E(int i10) {
        Socket socket = this.f29367f;
        n.b(socket);
        dm.d dVar = this.f29371j;
        n.b(dVar);
        dm.c cVar = this.f29372k;
        n.b(cVar);
        socket.setSoTimeout(0);
        yl.f a10 = new f.a(true, ul.e.f27821i).s(socket, this.f29365d.a().l().h(), dVar, cVar).k(this).l(i10).a();
        this.f29370i = a10;
        this.f29378q = yl.f.N.a().d();
        yl.f.w1(a10, false, null, 3, null);
    }

    private final boolean F(u uVar) {
        s sVar;
        if (rl.d.f25046h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        u l10 = this.f29365d.a().l();
        if (uVar.m() != l10.m()) {
            return false;
        }
        if (n.a(uVar.h(), l10.h())) {
            return true;
        }
        if (this.f29374m || (sVar = this.f29368g) == null) {
            return false;
        }
        n.b(sVar);
        return e(uVar, sVar);
    }

    private final boolean e(u uVar, s sVar) {
        List<Certificate> d10 = sVar.d();
        return (d10.isEmpty() ^ true) && cm.d.f7199a.e(uVar.h(), (X509Certificate) d10.get(0));
    }

    private final void h(int i10, int i11, ql.e eVar, r rVar) {
        Socket createSocket;
        Proxy b10 = this.f29365d.b();
        ql.a a10 = this.f29365d.a();
        Proxy.Type type = b10.type();
        int i12 = type == null ? -1 : b.f29381a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            createSocket = a10.j().createSocket();
            n.b(createSocket);
        } else {
            createSocket = new Socket(b10);
        }
        this.f29366e = createSocket;
        rVar.i(eVar, this.f29365d.d(), b10);
        createSocket.setSoTimeout(i11);
        try {
            zl.j.f32984a.g().f(createSocket, this.f29365d.d(), i10);
            try {
                this.f29371j = l.b(l.h(createSocket));
                this.f29372k = l.a(l.e(createSocket));
            } catch (NullPointerException e10) {
                if (n.a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException(n.k("Failed to connect to ", this.f29365d.d()));
            connectException.initCause(e11);
            throw connectException;
        }
    }

    private final void i(vl.b bVar) {
        String h10;
        ql.a a10 = this.f29365d.a();
        SSLSocketFactory k10 = a10.k();
        SSLSocket sSLSocket = null;
        try {
            n.b(k10);
            Socket createSocket = k10.createSocket(this.f29366e, a10.l().h(), a10.l().m(), true);
            if (createSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                ql.l a11 = bVar.a(sSLSocket2);
                if (a11.h()) {
                    zl.j.f32984a.g().e(sSLSocket2, a10.l().h(), a10.f());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                s.a aVar = s.f24351e;
                n.d(sslSocketSession, "sslSocketSession");
                s a12 = aVar.a(sslSocketSession);
                HostnameVerifier e10 = a10.e();
                n.b(e10);
                if (e10.verify(a10.l().h(), sslSocketSession)) {
                    ql.g a13 = a10.a();
                    n.b(a13);
                    this.f29368g = new s(a12.e(), a12.a(), a12.c(), new c(a13, a12, a10));
                    a13.b(a10.l().h(), new d());
                    String g10 = a11.h() ? zl.j.f32984a.g().g(sSLSocket2) : null;
                    this.f29367f = sSLSocket2;
                    this.f29371j = l.b(l.h(sSLSocket2));
                    this.f29372k = l.a(l.e(sSLSocket2));
                    this.f29369h = g10 != null ? z.Companion.a(g10) : z.HTTP_1_1;
                    zl.j.f32984a.g().b(sSLSocket2);
                    return;
                }
                List<Certificate> d10 = a12.d();
                if (!(!d10.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + a10.l().h() + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) d10.get(0);
                h10 = xk.i.h("\n              |Hostname " + a10.l().h() + " not verified:\n              |    certificate: " + ql.g.f24221c.a(x509Certificate) + "\n              |    DN: " + ((Object) x509Certificate.getSubjectDN().getName()) + "\n              |    subjectAltNames: " + cm.d.f7199a.a(x509Certificate) + "\n              ", null, 1, null);
                throw new SSLPeerUnverifiedException(h10);
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    zl.j.f32984a.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    rl.d.n(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private final void j(int i10, int i11, int i12, ql.e eVar, r rVar) {
        a0 l10 = l();
        u i13 = l10.i();
        int i14 = 0;
        while (i14 < 21) {
            i14++;
            h(i10, i11, eVar, rVar);
            l10 = k(i11, i12, l10, i13);
            if (l10 == null) {
                return;
            }
            Socket socket = this.f29366e;
            if (socket != null) {
                rl.d.n(socket);
            }
            this.f29366e = null;
            this.f29372k = null;
            this.f29371j = null;
            rVar.g(eVar, this.f29365d.d(), this.f29365d.b(), null);
        }
    }

    private final a0 k(int i10, int i11, a0 a0Var, u uVar) {
        boolean r10;
        String str = "CONNECT " + rl.d.Q(uVar, true) + " HTTP/1.1";
        while (true) {
            dm.d dVar = this.f29371j;
            n.b(dVar);
            dm.c cVar = this.f29372k;
            n.b(cVar);
            xl.b bVar = new xl.b(null, this, dVar, cVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            dVar.m().g(i10, timeUnit);
            cVar.m().g(i11, timeUnit);
            bVar.A(a0Var.e(), str);
            bVar.a();
            c0.a e10 = bVar.e(false);
            n.b(e10);
            c0 c10 = e10.s(a0Var).c();
            bVar.z(c10);
            int g10 = c10.g();
            if (g10 == 200) {
                if (dVar.c().G0() && cVar.c().G0()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (g10 != 407) {
                throw new IOException(n.k("Unexpected response code for CONNECT: ", Integer.valueOf(c10.g())));
            }
            a0 a10 = this.f29365d.a().h().a(this.f29365d, c10);
            if (a10 == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            r10 = p.r("close", c0.n(c10, "Connection", null, 2, null), true);
            if (r10) {
                return a10;
            }
            a0Var = a10;
        }
    }

    private final a0 l() {
        a0 b10 = new a0.a().p(this.f29365d.a().l()).f("CONNECT", null).d("Host", rl.d.Q(this.f29365d.a().l(), true)).d("Proxy-Connection", "Keep-Alive").d("User-Agent", "okhttp/4.11.0").b();
        a0 a10 = this.f29365d.a().h().a(this.f29365d, new c0.a().s(b10).q(z.HTTP_1_1).g(407).n("Preemptive Authenticate").b(rl.d.f25041c).t(-1L).r(-1L).k("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return a10 == null ? b10 : a10;
    }

    private final void m(vl.b bVar, int i10, ql.e eVar, r rVar) {
        if (this.f29365d.a().k() != null) {
            rVar.B(eVar);
            i(bVar);
            rVar.A(eVar, this.f29368g);
            if (this.f29369h == z.HTTP_2) {
                E(i10);
                return;
            }
            return;
        }
        List<z> f10 = this.f29365d.a().f();
        z zVar = z.H2_PRIOR_KNOWLEDGE;
        if (!f10.contains(zVar)) {
            this.f29367f = this.f29366e;
            this.f29369h = z.HTTP_1_1;
        } else {
            this.f29367f = this.f29366e;
            this.f29369h = zVar;
            E(i10);
        }
    }

    public final void B(long j10) {
        this.f29380s = j10;
    }

    public final void C(boolean z10) {
        this.f29373l = z10;
    }

    public Socket D() {
        Socket socket = this.f29367f;
        n.b(socket);
        return socket;
    }

    public final synchronized void G(e call, IOException iOException) {
        int i10;
        n.e(call, "call");
        if (iOException instanceof yl.n) {
            if (((yl.n) iOException).f32209a == yl.b.REFUSED_STREAM) {
                int i11 = this.f29377p + 1;
                this.f29377p = i11;
                if (i11 > 1) {
                    this.f29373l = true;
                    i10 = this.f29375n;
                    this.f29375n = i10 + 1;
                }
            } else if (((yl.n) iOException).f32209a != yl.b.CANCEL || !call.R0()) {
                this.f29373l = true;
                i10 = this.f29375n;
                this.f29375n = i10 + 1;
            }
        } else if (!v() || (iOException instanceof yl.a)) {
            this.f29373l = true;
            if (this.f29376o == 0) {
                if (iOException != null) {
                    g(call.k(), this.f29365d, iOException);
                }
                i10 = this.f29375n;
                this.f29375n = i10 + 1;
            }
        }
    }

    @Override // yl.f.c
    public synchronized void a(yl.f connection, m settings) {
        n.e(connection, "connection");
        n.e(settings, "settings");
        this.f29378q = settings.d();
    }

    @Override // yl.f.c
    public void b(yl.i stream) {
        n.e(stream, "stream");
        stream.d(yl.b.REFUSED_STREAM, null);
    }

    public final void d() {
        Socket socket = this.f29366e;
        if (socket == null) {
            return;
        }
        rl.d.n(socket);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r17, int r18, int r19, int r20, boolean r21, ql.e r22, ql.r r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vl.f.f(int, int, int, int, boolean, ql.e, ql.r):void");
    }

    public final void g(y client, e0 failedRoute, IOException failure) {
        n.e(client, "client");
        n.e(failedRoute, "failedRoute");
        n.e(failure, "failure");
        if (failedRoute.b().type() != Proxy.Type.DIRECT) {
            ql.a a10 = failedRoute.a();
            a10.i().connectFailed(a10.l().r(), failedRoute.b().address(), failure);
        }
        client.s().b(failedRoute);
    }

    public final List<Reference<e>> n() {
        return this.f29379r;
    }

    public final long o() {
        return this.f29380s;
    }

    public final boolean p() {
        return this.f29373l;
    }

    public final int q() {
        return this.f29375n;
    }

    public s r() {
        return this.f29368g;
    }

    public final synchronized void s() {
        this.f29376o++;
    }

    public final boolean t(ql.a address, List<e0> list) {
        n.e(address, "address");
        if (rl.d.f25046h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (this.f29379r.size() >= this.f29378q || this.f29373l || !this.f29365d.a().d(address)) {
            return false;
        }
        if (n.a(address.l().h(), z().a().l().h())) {
            return true;
        }
        if (this.f29370i == null || list == null || !A(list) || address.e() != cm.d.f7199a || !F(address.l())) {
            return false;
        }
        try {
            ql.g a10 = address.a();
            n.b(a10);
            String h10 = address.l().h();
            s r10 = r();
            n.b(r10);
            a10.a(h10, r10.d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        ql.i a10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f29365d.a().l().h());
        sb2.append(':');
        sb2.append(this.f29365d.a().l().m());
        sb2.append(", proxy=");
        sb2.append(this.f29365d.b());
        sb2.append(" hostAddress=");
        sb2.append(this.f29365d.d());
        sb2.append(" cipherSuite=");
        s sVar = this.f29368g;
        Object obj = "none";
        if (sVar != null && (a10 = sVar.a()) != null) {
            obj = a10;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f29369h);
        sb2.append('}');
        return sb2.toString();
    }

    public final boolean u(boolean z10) {
        long o10;
        if (rl.d.f25046h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.f29366e;
        n.b(socket);
        Socket socket2 = this.f29367f;
        n.b(socket2);
        dm.d dVar = this.f29371j;
        n.b(dVar);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        yl.f fVar = this.f29370i;
        if (fVar != null) {
            return fVar.H0(nanoTime);
        }
        synchronized (this) {
            o10 = nanoTime - o();
        }
        if (o10 < 10000000000L || !z10) {
            return true;
        }
        return rl.d.F(socket2, dVar);
    }

    public final boolean v() {
        return this.f29370i != null;
    }

    public final wl.d w(y client, wl.g chain) {
        n.e(client, "client");
        n.e(chain, "chain");
        Socket socket = this.f29367f;
        n.b(socket);
        dm.d dVar = this.f29371j;
        n.b(dVar);
        dm.c cVar = this.f29372k;
        n.b(cVar);
        yl.f fVar = this.f29370i;
        if (fVar != null) {
            return new yl.g(client, this, chain, fVar);
        }
        socket.setSoTimeout(chain.j());
        dm.y m10 = dVar.m();
        long g10 = chain.g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        m10.g(g10, timeUnit);
        cVar.m().g(chain.i(), timeUnit);
        return new xl.b(client, this, dVar, cVar);
    }

    public final synchronized void x() {
        this.f29374m = true;
    }

    public final synchronized void y() {
        this.f29373l = true;
    }

    public e0 z() {
        return this.f29365d;
    }
}
