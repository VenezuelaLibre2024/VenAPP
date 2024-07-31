package p406vl;

import cm.AbstractC2057c;
import cm.C2058d;
import dk.C7033s;
import dm.C7068l;
import dm.C7081y;
import dm.InterfaceC7058c;
import dm.InterfaceC7060d;
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
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9987a;
import p319ql.AbstractC10543r;
import p319ql.C10520a;
import p319ql.C10521a0;
import p319ql.C10525c0;
import p319ql.C10529e0;
import p319ql.C10532g;
import p319ql.C10534i;
import p319ql.C10537l;
import p319ql.C10544s;
import p319ql.C10546u;
import p319ql.C10550y;
import p319ql.EnumC10551z;
import p319ql.InterfaceC10528e;
import p319ql.InterfaceC10535j;
import p341rl.C10727d;
import p388ul.C11590e;
import p428wl.C12244g;
import p428wl.InterfaceC12241d;
import p450xk.C12517i;
import p450xk.C12524p;
import p451xl.C12529b;
import p473yl.C12733a;
import p473yl.C12738f;
import p473yl.C12739g;
import p473yl.C12741i;
import p473yl.C12745m;
import p473yl.C12746n;
import p473yl.EnumC12734b;
import p495zl.C13148j;

/* renamed from: vl.f */
/* loaded from: classes3.dex */
public final class C11979f extends C12738f.c implements InterfaceC10535j {

    /* renamed from: t */
    public static final a f31801t = new a(null);

    /* renamed from: c */
    private final C11980g f31802c;

    /* renamed from: d */
    private final C10529e0 f31803d;

    /* renamed from: e */
    private Socket f31804e;

    /* renamed from: f */
    private Socket f31805f;

    /* renamed from: g */
    private C10544s f31806g;

    /* renamed from: h */
    private EnumC10551z f31807h;

    /* renamed from: i */
    private C12738f f31808i;

    /* renamed from: j */
    private InterfaceC7060d f31809j;

    /* renamed from: k */
    private InterfaceC7058c f31810k;

    /* renamed from: l */
    private boolean f31811l;

    /* renamed from: m */
    private boolean f31812m;

    /* renamed from: n */
    private int f31813n;

    /* renamed from: o */
    private int f31814o;

    /* renamed from: p */
    private int f31815p;

    /* renamed from: q */
    private int f31816q;

    /* renamed from: r */
    private final List<Reference<C11978e>> f31817r;

    /* renamed from: s */
    private long f31818s;

    /* renamed from: vl.f$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    /* renamed from: vl.f$b */
    /* loaded from: classes3.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31819a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            iArr[Proxy.Type.HTTP.ordinal()] = 2;
            f31819a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vl.f$c */
    /* loaded from: classes3.dex */
    public static final class c extends AbstractC9323o implements InterfaceC9987a<List<? extends Certificate>> {

        /* renamed from: a */
        final /* synthetic */ C10532g f31820a;

        /* renamed from: b */
        final /* synthetic */ C10544s f31821b;

        /* renamed from: c */
        final /* synthetic */ C10520a f31822c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(C10532g c10532g, C10544s c10544s, C10520a c10520a) {
            super(0);
            this.f31820a = c10532g;
            this.f31821b = c10544s;
            this.f31822c = c10520a;
        }

        @Override // p280ok.InterfaceC9987a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> invoke() {
            AbstractC2057c m31726d = this.f31820a.m31726d();
            C9322n.m27778b(m31726d);
            return m31726d.mo639a(this.f31821b.m31839d(), this.f31822c.m31599l().m31874h());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: vl.f$d */
    /* loaded from: classes3.dex */
    public static final class d extends AbstractC9323o implements InterfaceC9987a<List<? extends X509Certificate>> {
        d() {
            super(0);
        }

        @Override // p280ok.InterfaceC9987a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> invoke() {
            int m20590r;
            C10544s c10544s = C11979f.this.f31806g;
            C9322n.m27778b(c10544s);
            List<Certificate> m31839d = c10544s.m31839d();
            m20590r = C7033s.m20590r(m31839d, 10);
            ArrayList arrayList = new ArrayList(m20590r);
            Iterator<T> it = m31839d.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public C11979f(C11980g connectionPool, C10529e0 route) {
        C9322n.m27781e(connectionPool, "connectionPool");
        C9322n.m27781e(route, "route");
        this.f31802c = connectionPool;
        this.f31803d = route;
        this.f31816q = 1;
        this.f31817r = new ArrayList();
        this.f31818s = Long.MAX_VALUE;
    }

    /* renamed from: A */
    private final boolean m38461A(List<C10529e0> list) {
        List<C10529e0> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (C10529e0 c10529e0 : list2) {
            if (c10529e0.m31717b().type() == Proxy.Type.DIRECT && this.f31803d.m31717b().type() == Proxy.Type.DIRECT && C9322n.m27777a(this.f31803d.m31719d(), c10529e0.m31719d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E */
    private final void m38462E(int i10) {
        Socket socket = this.f31805f;
        C9322n.m27778b(socket);
        InterfaceC7060d interfaceC7060d = this.f31809j;
        C9322n.m27778b(interfaceC7060d);
        InterfaceC7058c interfaceC7058c = this.f31810k;
        C9322n.m27778b(interfaceC7058c);
        socket.setSoTimeout(0);
        C12738f m42140a = new C12738f.a(true, C11590e.f30144i).m42158s(socket, this.f31803d.m31716a().m31599l().m31874h(), interfaceC7060d, interfaceC7058c).m42150k(this).m42151l(i10).m42140a();
        this.f31808i = m42140a;
        this.f31816q = C12738f.f34590N.m42159a().m42274d();
        C12738f.m42103w1(m42140a, false, null, 3, null);
    }

    /* renamed from: F */
    private final boolean m38463F(C10546u c10546u) {
        C10544s c10544s;
        if (C10727d.f27165h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        C10546u m31599l = this.f31803d.m31716a().m31599l();
        if (c10546u.m31878m() != m31599l.m31878m()) {
            return false;
        }
        if (C9322n.m27777a(c10546u.m31874h(), m31599l.m31874h())) {
            return true;
        }
        if (this.f31812m || (c10544s = this.f31806g) == null) {
            return false;
        }
        C9322n.m27778b(c10544s);
        return m38465e(c10546u, c10544s);
    }

    /* renamed from: e */
    private final boolean m38465e(C10546u c10546u, C10544s c10544s) {
        List<Certificate> m31839d = c10544s.m31839d();
        return (m31839d.isEmpty() ^ true) && C2058d.f8151a.m10400e(c10546u.m31874h(), (X509Certificate) m31839d.get(0));
    }

    /* renamed from: h */
    private final void m38466h(int i10, int i11, InterfaceC10528e interfaceC10528e, AbstractC10543r abstractC10543r) {
        Socket createSocket;
        Proxy m31717b = this.f31803d.m31717b();
        C10520a m31716a = this.f31803d.m31716a();
        Proxy.Type type = m31717b.type();
        int i12 = type == null ? -1 : b.f31819a[type.ordinal()];
        if (i12 == 1 || i12 == 2) {
            createSocket = m31716a.m31597j().createSocket();
            C9322n.m27778b(createSocket);
        } else {
            createSocket = new Socket(m31717b);
        }
        this.f31804e = createSocket;
        abstractC10543r.m31817i(interfaceC10528e, this.f31803d.m31719d(), m31717b);
        createSocket.setSoTimeout(i11);
        try {
            C13148j.f35535a.m43385g().mo43346f(createSocket, this.f31803d.m31719d(), i10);
            try {
                this.f31809j = C7068l.m20803b(C7068l.m20809h(createSocket));
                this.f31810k = C7068l.m20802a(C7068l.m20806e(createSocket));
            } catch (NullPointerException e10) {
                if (C9322n.m27777a(e10.getMessage(), "throw with null exception")) {
                    throw new IOException(e10);
                }
            }
        } catch (ConnectException e11) {
            ConnectException connectException = new ConnectException(C9322n.m27787k("Failed to connect to ", this.f31803d.m31719d()));
            connectException.initCause(e11);
            throw connectException;
        }
    }

    /* renamed from: i */
    private final void m38467i(C11975b c11975b) {
        String m41020h;
        C10520a m31716a = this.f31803d.m31716a();
        SSLSocketFactory m31598k = m31716a.m31598k();
        SSLSocket sSLSocket = null;
        try {
            C9322n.m27778b(m31598k);
            Socket createSocket = m31598k.createSocket(this.f31804e, m31716a.m31599l().m31874h(), m31716a.m31599l().m31878m(), true);
            if (createSocket == null) {
                throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.SSLSocket");
            }
            SSLSocket sSLSocket2 = (SSLSocket) createSocket;
            try {
                C10537l m38396a = c11975b.m38396a(sSLSocket2);
                if (m38396a.m31756h()) {
                    C13148j.f35535a.m43385g().mo43339e(sSLSocket2, m31716a.m31599l().m31874h(), m31716a.m31593f());
                }
                sSLSocket2.startHandshake();
                SSLSession sslSocketSession = sSLSocket2.getSession();
                C10544s.a aVar = C10544s.f26445e;
                C9322n.m27780d(sslSocketSession, "sslSocketSession");
                C10544s m31842a = aVar.m31842a(sslSocketSession);
                HostnameVerifier m31592e = m31716a.m31592e();
                C9322n.m27778b(m31592e);
                if (m31592e.verify(m31716a.m31599l().m31874h(), sslSocketSession)) {
                    C10532g m31588a = m31716a.m31588a();
                    C9322n.m27778b(m31588a);
                    this.f31806g = new C10544s(m31842a.m31840e(), m31842a.m31837a(), m31842a.m31838c(), new c(m31588a, m31842a, m31716a));
                    m31588a.m31724b(m31716a.m31599l().m31874h(), new d());
                    String mo43340g = m38396a.m31756h() ? C13148j.f35535a.m43385g().mo43340g(sSLSocket2) : null;
                    this.f31805f = sSLSocket2;
                    this.f31809j = C7068l.m20803b(C7068l.m20809h(sSLSocket2));
                    this.f31810k = C7068l.m20802a(C7068l.m20806e(sSLSocket2));
                    this.f31807h = mo43340g != null ? EnumC10551z.Companion.m32035a(mo43340g) : EnumC10551z.HTTP_1_1;
                    C13148j.f35535a.m43385g().mo43361b(sSLSocket2);
                    return;
                }
                List<Certificate> m31839d = m31842a.m31839d();
                if (!(!m31839d.isEmpty())) {
                    throw new SSLPeerUnverifiedException("Hostname " + m31716a.m31599l().m31874h() + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) m31839d.get(0);
                m41020h = C12517i.m41020h("\n              |Hostname " + m31716a.m31599l().m31874h() + " not verified:\n              |    certificate: " + C10532g.f26263c.m31729a(x509Certificate) + "\n              |    DN: " + ((Object) x509Certificate.getSubjectDN().getName()) + "\n              |    subjectAltNames: " + C2058d.f8151a.m10399a(x509Certificate) + "\n              ", null, 1, null);
                throw new SSLPeerUnverifiedException(m41020h);
            } catch (Throwable th2) {
                th = th2;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    C13148j.f35535a.m43385g().mo43361b(sSLSocket);
                }
                if (sSLSocket != null) {
                    C10727d.m32654n(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: j */
    private final void m38468j(int i10, int i11, int i12, InterfaceC10528e interfaceC10528e, AbstractC10543r abstractC10543r) {
        C10521a0 m38470l = m38470l();
        C10546u m31608i = m38470l.m31608i();
        int i13 = 0;
        while (i13 < 21) {
            i13++;
            m38466h(i10, i11, interfaceC10528e, abstractC10543r);
            m38470l = m38469k(i11, i12, m38470l, m31608i);
            if (m38470l == null) {
                return;
            }
            Socket socket = this.f31804e;
            if (socket != null) {
                C10727d.m32654n(socket);
            }
            this.f31804e = null;
            this.f31810k = null;
            this.f31809j = null;
            abstractC10543r.m31815g(interfaceC10528e, this.f31803d.m31719d(), this.f31803d.m31717b(), null);
        }
    }

    /* renamed from: k */
    private final C10521a0 m38469k(int i10, int i11, C10521a0 c10521a0, C10546u c10546u) {
        boolean m41037r;
        String str = "CONNECT " + C10727d.m32631Q(c10546u, true) + " HTTP/1.1";
        while (true) {
            InterfaceC7060d interfaceC7060d = this.f31809j;
            C9322n.m27778b(interfaceC7060d);
            InterfaceC7058c interfaceC7058c = this.f31810k;
            C9322n.m27778b(interfaceC7058c);
            C12529b c12529b = new C12529b(null, this, interfaceC7060d, interfaceC7058c);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            interfaceC7060d.mo20685m().mo20792g(i10, timeUnit);
            interfaceC7058c.mo20683m().mo20792g(i11, timeUnit);
            c12529b.m41129A(c10521a0.m31604e(), str);
            c12529b.mo39395a();
            C10525c0.a mo39399e = c12529b.mo39399e(false);
            C9322n.m27778b(mo39399e);
            C10525c0 m31663c = mo39399e.m31677s(c10521a0).m31663c();
            c12529b.m41130z(m31663c);
            int m31645g = m31663c.m31645g();
            if (m31645g == 200) {
                if (interfaceC7060d.mo20717c().mo20695G0() && interfaceC7058c.mo20717c().mo20695G0()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (m31645g != 407) {
                throw new IOException(C9322n.m27787k("Unexpected response code for CONNECT: ", Integer.valueOf(m31663c.m31645g())));
            }
            C10521a0 mo31625a = this.f31803d.m31716a().m31595h().mo31625a(this.f31803d, m31663c);
            if (mo31625a == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            m41037r = C12524p.m41037r("close", C10525c0.m31634n(m31663c, "Connection", null, 2, null), true);
            if (m41037r) {
                return mo31625a;
            }
            c10521a0 = mo31625a;
        }
    }

    /* renamed from: l */
    private final C10521a0 m38470l() {
        C10521a0 m31610b = new C10521a0.a().m31624p(this.f31803d.m31716a().m31599l()).m31614f("CONNECT", null).m31612d("Host", C10727d.m32631Q(this.f31803d.m31716a().m31599l(), true)).m31612d("Proxy-Connection", "Keep-Alive").m31612d("User-Agent", "okhttp/4.11.0").m31610b();
        C10521a0 mo31625a = this.f31803d.m31716a().m31595h().mo31625a(this.f31803d, new C10525c0.a().m31677s(m31610b).m31675q(EnumC10551z.HTTP_1_1).m31665g(407).m31672n("Preemptive Authenticate").m31662b(C10727d.f27160c).m31678t(-1L).m31676r(-1L).m31669k("Proxy-Authenticate", "OkHttp-Preemptive").m31663c());
        return mo31625a == null ? m31610b : mo31625a;
    }

    /* renamed from: m */
    private final void m38471m(C11975b c11975b, int i10, InterfaceC10528e interfaceC10528e, AbstractC10543r abstractC10543r) {
        if (this.f31803d.m31716a().m31598k() != null) {
            abstractC10543r.m31808B(interfaceC10528e);
            m38467i(c11975b);
            abstractC10543r.m31807A(interfaceC10528e, this.f31806g);
            if (this.f31807h == EnumC10551z.HTTP_2) {
                m38462E(i10);
                return;
            }
            return;
        }
        List<EnumC10551z> m31593f = this.f31803d.m31716a().m31593f();
        EnumC10551z enumC10551z = EnumC10551z.H2_PRIOR_KNOWLEDGE;
        if (!m31593f.contains(enumC10551z)) {
            this.f31805f = this.f31804e;
            this.f31807h = EnumC10551z.HTTP_1_1;
        } else {
            this.f31805f = this.f31804e;
            this.f31807h = enumC10551z;
            m38462E(i10);
        }
    }

    /* renamed from: B */
    public final void m38472B(long j10) {
        this.f31818s = j10;
    }

    /* renamed from: C */
    public final void m38473C(boolean z10) {
        this.f31811l = z10;
    }

    /* renamed from: D */
    public Socket m38474D() {
        Socket socket = this.f31805f;
        C9322n.m27778b(socket);
        return socket;
    }

    /* renamed from: G */
    public final synchronized void m38475G(C11978e call, IOException iOException) {
        int i10;
        C9322n.m27781e(call, "call");
        if (iOException instanceof C12746n) {
            if (((C12746n) iOException).f34760a == EnumC12734b.REFUSED_STREAM) {
                int i11 = this.f31815p + 1;
                this.f31815p = i11;
                if (i11 > 1) {
                    this.f31811l = true;
                    i10 = this.f31813n;
                    this.f31813n = i10 + 1;
                }
            } else if (((C12746n) iOException).f34760a != EnumC12734b.CANCEL || !call.mo31713R0()) {
                this.f31811l = true;
                i10 = this.f31813n;
                this.f31813n = i10 + 1;
            }
        } else if (!m38489v() || (iOException instanceof C12733a)) {
            this.f31811l = true;
            if (this.f31814o == 0) {
                if (iOException != null) {
                    m38480g(call.m38442k(), this.f31803d, iOException);
                }
                i10 = this.f31813n;
                this.f31813n = i10 + 1;
            }
        }
    }

    @Override // p473yl.C12738f.c
    /* renamed from: a */
    public synchronized void mo38476a(C12738f connection, C12745m settings) {
        C9322n.m27781e(connection, "connection");
        C9322n.m27781e(settings, "settings");
        this.f31816q = settings.m42274d();
    }

    @Override // p473yl.C12738f.c
    /* renamed from: b */
    public void mo38477b(C12741i stream) {
        C9322n.m27781e(stream, "stream");
        stream.m42210d(EnumC12734b.REFUSED_STREAM, null);
    }

    /* renamed from: d */
    public final void m38478d() {
        Socket socket = this.f31804e;
        if (socket == null) {
            return;
        }
        C10727d.m32654n(socket);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m38479f(int r17, int r18, int r19, int r20, boolean r21, p319ql.InterfaceC10528e r22, p319ql.AbstractC10543r r23) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p406vl.C11979f.m38479f(int, int, int, int, boolean, ql.e, ql.r):void");
    }

    /* renamed from: g */
    public final void m38480g(C10550y client, C10529e0 failedRoute, IOException failure) {
        C9322n.m27781e(client, "client");
        C9322n.m27781e(failedRoute, "failedRoute");
        C9322n.m27781e(failure, "failure");
        if (failedRoute.m31717b().type() != Proxy.Type.DIRECT) {
            C10520a m31716a = failedRoute.m31716a();
            m31716a.m31596i().connectFailed(m31716a.m31599l().m31883r(), failedRoute.m31717b().address(), failure);
        }
        client.m31987s().m38502b(failedRoute);
    }

    /* renamed from: n */
    public final List<Reference<C11978e>> m38481n() {
        return this.f31817r;
    }

    /* renamed from: o */
    public final long m38482o() {
        return this.f31818s;
    }

    /* renamed from: p */
    public final boolean m38483p() {
        return this.f31811l;
    }

    /* renamed from: q */
    public final int m38484q() {
        return this.f31813n;
    }

    /* renamed from: r */
    public C10544s m38485r() {
        return this.f31806g;
    }

    /* renamed from: s */
    public final synchronized void m38486s() {
        this.f31814o++;
    }

    /* renamed from: t */
    public final boolean m38487t(C10520a address, List<C10529e0> list) {
        C9322n.m27781e(address, "address");
        if (C10727d.f27165h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + this);
        }
        if (this.f31817r.size() >= this.f31816q || this.f31811l || !this.f31803d.m31716a().m31591d(address)) {
            return false;
        }
        if (C9322n.m27777a(address.m31599l().m31874h(), m38493z().m31716a().m31599l().m31874h())) {
            return true;
        }
        if (this.f31808i == null || list == null || !m38461A(list) || address.m31592e() != C2058d.f8151a || !m38463F(address.m31599l())) {
            return false;
        }
        try {
            C10532g m31588a = address.m31588a();
            C9322n.m27778b(m31588a);
            String m31874h = address.m31599l().m31874h();
            C10544s m38485r = m38485r();
            C9322n.m27778b(m38485r);
            m31588a.m31723a(m31874h, m38485r.m31839d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public String toString() {
        C10534i m31837a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Connection{");
        sb2.append(this.f31803d.m31716a().m31599l().m31874h());
        sb2.append(':');
        sb2.append(this.f31803d.m31716a().m31599l().m31878m());
        sb2.append(", proxy=");
        sb2.append(this.f31803d.m31717b());
        sb2.append(" hostAddress=");
        sb2.append(this.f31803d.m31719d());
        sb2.append(" cipherSuite=");
        C10544s c10544s = this.f31806g;
        Object obj = "none";
        if (c10544s != null && (m31837a = c10544s.m31837a()) != null) {
            obj = m31837a;
        }
        sb2.append(obj);
        sb2.append(" protocol=");
        sb2.append(this.f31807h);
        sb2.append('}');
        return sb2.toString();
    }

    /* renamed from: u */
    public final boolean m38488u(boolean z10) {
        long m38482o;
        if (C10727d.f27165h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        long nanoTime = System.nanoTime();
        Socket socket = this.f31804e;
        C9322n.m27778b(socket);
        Socket socket2 = this.f31805f;
        C9322n.m27778b(socket2);
        InterfaceC7060d interfaceC7060d = this.f31809j;
        C9322n.m27778b(interfaceC7060d);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        C12738f c12738f = this.f31808i;
        if (c12738f != null) {
            return c12738f.m42112H0(nanoTime);
        }
        synchronized (this) {
            m38482o = nanoTime - m38482o();
        }
        if (m38482o < 10000000000L || !z10) {
            return true;
        }
        return C10727d.m32620F(socket2, interfaceC7060d);
    }

    /* renamed from: v */
    public final boolean m38489v() {
        return this.f31808i != null;
    }

    /* renamed from: w */
    public final InterfaceC12241d m38490w(C10550y client, C12244g chain) {
        C9322n.m27781e(client, "client");
        C9322n.m27781e(chain, "chain");
        Socket socket = this.f31805f;
        C9322n.m27778b(socket);
        InterfaceC7060d interfaceC7060d = this.f31809j;
        C9322n.m27778b(interfaceC7060d);
        InterfaceC7058c interfaceC7058c = this.f31810k;
        C9322n.m27778b(interfaceC7058c);
        C12738f c12738f = this.f31808i;
        if (c12738f != null) {
            return new C12739g(client, this, chain, c12738f);
        }
        socket.setSoTimeout(chain.m39423j());
        C7081y mo20685m = interfaceC7060d.mo20685m();
        long m39420g = chain.m39420g();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        mo20685m.mo20792g(m39420g, timeUnit);
        interfaceC7058c.mo20683m().mo20792g(chain.m39422i(), timeUnit);
        return new C12529b(client, this, interfaceC7060d, interfaceC7058c);
    }

    /* renamed from: x */
    public final synchronized void m38491x() {
        this.f31812m = true;
    }

    /* renamed from: y */
    public final synchronized void m38492y() {
        this.f31811l = true;
    }

    /* renamed from: z */
    public C10529e0 m38493z() {
        return this.f31803d;
    }
}
