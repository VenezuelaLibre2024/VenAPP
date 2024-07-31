package p495zl;

import am.C0141e;
import cm.AbstractC2057c;
import cm.C2055a;
import cm.C2056b;
import cm.InterfaceC2059e;
import dk.C7033s;
import dm.C7056b;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.C10550y;
import p319ql.EnumC10551z;

/* renamed from: zl.j */
/* loaded from: classes3.dex */
public class C13148j {

    /* renamed from: a */
    public static final a f35535a;

    /* renamed from: b */
    private static volatile C13148j f35536b;

    /* renamed from: c */
    private static final Logger f35537c;

    /* renamed from: zl.j$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: d */
        private final C13148j m43377d() {
            C0141e.f563a.m644b();
            C13148j m43342a = C13139a.f35505e.m43342a();
            if (m43342a != null) {
                return m43342a;
            }
            C13148j m43349a = C13140b.f35508f.m43349a();
            C9322n.m27778b(m43349a);
            return m43349a;
        }

        /* renamed from: e */
        private final C13148j m43378e() {
            C13147i m43371a;
            C13141c m43354a;
            C13142d m43359b;
            if (m43381j() && (m43359b = C13142d.f35517e.m43359b()) != null) {
                return m43359b;
            }
            if (m43380i() && (m43354a = C13141c.f35514e.m43354a()) != null) {
                return m43354a;
            }
            if (m43382k() && (m43371a = C13147i.f35532e.m43371a()) != null) {
                return m43371a;
            }
            C13146h m43368a = C13146h.f35530d.m43368a();
            if (m43368a != null) {
                return m43368a;
            }
            C13148j m43364a = C13143e.f35521i.m43364a();
            return m43364a != null ? m43364a : new C13148j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public final C13148j m43379f() {
            return m43386h() ? m43377d() : m43378e();
        }

        /* renamed from: i */
        private final boolean m43380i() {
            return C9322n.m27777a("BC", Security.getProviders()[0].getName());
        }

        /* renamed from: j */
        private final boolean m43381j() {
            return C9322n.m27777a("Conscrypt", Security.getProviders()[0].getName());
        }

        /* renamed from: k */
        private final boolean m43382k() {
            return C9322n.m27777a("OpenJSSE", Security.getProviders()[0].getName());
        }

        /* renamed from: b */
        public final List<String> m43383b(List<? extends EnumC10551z> protocols) {
            int m20590r;
            C9322n.m27781e(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((EnumC10551z) obj) != EnumC10551z.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            m20590r = C7033s.m20590r(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(m20590r);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((EnumC10551z) it.next()).toString());
            }
            return arrayList2;
        }

        /* renamed from: c */
        public final byte[] m43384c(List<? extends EnumC10551z> protocols) {
            C9322n.m27781e(protocols, "protocols");
            C7056b c7056b = new C7056b();
            for (String str : m43383b(protocols)) {
                c7056b.writeByte(str.length());
                c7056b.mo20705T(str);
            }
            return c7056b.m20696H();
        }

        /* renamed from: g */
        public final C13148j m43385g() {
            return C13148j.f35536b;
        }

        /* renamed from: h */
        public final boolean m43386h() {
            return C9322n.m27777a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    static {
        a aVar = new a(null);
        f35535a = aVar;
        f35536b = aVar.m43379f();
        f35537c = Logger.getLogger(C10550y.class.getName());
    }

    /* renamed from: k */
    public static /* synthetic */ void m43374k(C13148j c13148j, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        c13148j.m43375j(str, i10, th2);
    }

    /* renamed from: b */
    public void mo43361b(SSLSocket sslSocket) {
        C9322n.m27781e(sslSocket, "sslSocket");
    }

    /* renamed from: c */
    public AbstractC2057c mo43338c(X509TrustManager trustManager) {
        C9322n.m27781e(trustManager, "trustManager");
        return new C2055a(mo43345d(trustManager));
    }

    /* renamed from: d */
    public InterfaceC2059e mo43345d(X509TrustManager trustManager) {
        C9322n.m27781e(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        C9322n.m27780d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new C2056b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    /* renamed from: e */
    public void mo43339e(SSLSocket sslSocket, String str, List<EnumC10551z> protocols) {
        C9322n.m27781e(sslSocket, "sslSocket");
        C9322n.m27781e(protocols, "protocols");
    }

    /* renamed from: f */
    public void mo43346f(Socket socket, InetSocketAddress address, int i10) {
        C9322n.m27781e(socket, "socket");
        C9322n.m27781e(address, "address");
        socket.connect(address, i10);
    }

    /* renamed from: g */
    public String mo43340g(SSLSocket sslSocket) {
        C9322n.m27781e(sslSocket, "sslSocket");
        return null;
    }

    /* renamed from: h */
    public Object mo43347h(String closer) {
        C9322n.m27781e(closer, "closer");
        if (f35537c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    /* renamed from: i */
    public boolean mo43341i(String hostname) {
        C9322n.m27781e(hostname, "hostname");
        return true;
    }

    /* renamed from: j */
    public void m43375j(String message, int i10, Throwable th2) {
        C9322n.m27781e(message, "message");
        f35537c.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    /* renamed from: l */
    public void mo43348l(String message, Object obj) {
        C9322n.m27781e(message, "message");
        if (obj == null) {
            message = C9322n.m27787k(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m43375j(message, 5, (Throwable) obj);
    }

    /* renamed from: m */
    public SSLContext mo43352m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        C9322n.m27780d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    /* renamed from: n */
    public SSLSocketFactory mo43357n(X509TrustManager trustManager) {
        C9322n.m27781e(trustManager, "trustManager");
        try {
            SSLContext mo43352m = mo43352m();
            mo43352m.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = mo43352m.getSocketFactory();
            C9322n.m27780d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError(C9322n.m27787k("No System TLS: ", e10), e10);
        }
    }

    /* renamed from: o */
    public X509TrustManager mo43353o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        C9322n.m27778b(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            String arrays = Arrays.toString(trustManagers);
            C9322n.m27780d(arrays, "toString(this)");
            throw new IllegalStateException(C9322n.m27787k("Unexpected default trust managers: ", arrays).toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager != null) {
            return (X509TrustManager) trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        C9322n.m27780d(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
