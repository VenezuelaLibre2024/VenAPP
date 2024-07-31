package zl;

import dk.s;
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
import kotlin.jvm.internal.n;
import ql.y;
import ql.z;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a */
    public static final a f32984a;

    /* renamed from: b */
    private static volatile j f32985b;

    /* renamed from: c */
    private static final Logger f32986c;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final j d() {
            am.e.f498a.b();
            j a10 = zl.a.f32954e.a();
            if (a10 != null) {
                return a10;
            }
            j a11 = b.f32957f.a();
            n.b(a11);
            return a11;
        }

        private final j e() {
            i a10;
            c a11;
            d b10;
            if (j() && (b10 = d.f32966e.b()) != null) {
                return b10;
            }
            if (i() && (a11 = c.f32963e.a()) != null) {
                return a11;
            }
            if (k() && (a10 = i.f32981e.a()) != null) {
                return a10;
            }
            h a12 = h.f32979d.a();
            if (a12 != null) {
                return a12;
            }
            j a13 = e.f32970i.a();
            return a13 != null ? a13 : new j();
        }

        public final j f() {
            return h() ? d() : e();
        }

        private final boolean i() {
            return n.a("BC", Security.getProviders()[0].getName());
        }

        private final boolean j() {
            return n.a("Conscrypt", Security.getProviders()[0].getName());
        }

        private final boolean k() {
            return n.a("OpenJSSE", Security.getProviders()[0].getName());
        }

        public final List<String> b(List<? extends z> protocols) {
            int r10;
            n.e(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((z) obj) != z.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            r10 = s.r(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(r10);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((z) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List<? extends z> protocols) {
            n.e(protocols, "protocols");
            dm.b bVar = new dm.b();
            for (String str : b(protocols)) {
                bVar.writeByte(str.length());
                bVar.T(str);
            }
            return bVar.H();
        }

        public final j g() {
            return j.f32985b;
        }

        public final boolean h() {
            return n.a("Dalvik", System.getProperty("java.vm.name"));
        }
    }

    static {
        a aVar = new a(null);
        f32984a = aVar;
        f32985b = aVar.f();
        f32986c = Logger.getLogger(y.class.getName());
    }

    public static /* synthetic */ void k(j jVar, String str, int i10, Throwable th2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i11 & 2) != 0) {
            i10 = 4;
        }
        if ((i11 & 4) != 0) {
            th2 = null;
        }
        jVar.j(str, i10, th2);
    }

    public void b(SSLSocket sslSocket) {
        n.e(sslSocket, "sslSocket");
    }

    public cm.c c(X509TrustManager trustManager) {
        n.e(trustManager, "trustManager");
        return new cm.a(d(trustManager));
    }

    public cm.e d(X509TrustManager trustManager) {
        n.e(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        n.d(acceptedIssuers, "trustManager.acceptedIssuers");
        return new cm.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sslSocket, String str, List<z> protocols) {
        n.e(sslSocket, "sslSocket");
        n.e(protocols, "protocols");
    }

    public void f(Socket socket, InetSocketAddress address, int i10) {
        n.e(socket, "socket");
        n.e(address, "address");
        socket.connect(address, i10);
    }

    public String g(SSLSocket sslSocket) {
        n.e(sslSocket, "sslSocket");
        return null;
    }

    public Object h(String closer) {
        n.e(closer, "closer");
        if (f32986c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean i(String hostname) {
        n.e(hostname, "hostname");
        return true;
    }

    public void j(String message, int i10, Throwable th2) {
        n.e(message, "message");
        f32986c.log(i10 == 5 ? Level.WARNING : Level.INFO, message, th2);
    }

    public void l(String message, Object obj) {
        n.e(message, "message");
        if (obj == null) {
            message = n.k(message, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        j(message, 5, (Throwable) obj);
    }

    public SSLContext m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        n.d(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory n(X509TrustManager trustManager) {
        n.e(trustManager, "trustManager");
        try {
            SSLContext m10 = m();
            m10.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = m10.getSocketFactory();
            n.d(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e10) {
            throw new AssertionError(n.k("No System TLS: ", e10), e10);
        }
    }

    public X509TrustManager o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        n.b(trustManagers);
        if (!(trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager))) {
            String arrays = Arrays.toString(trustManagers);
            n.d(arrays, "toString(this)");
            throw new IllegalStateException(n.k("Unexpected default trust managers: ", arrays).toString());
        }
        TrustManager trustManager = trustManagers[0];
        if (trustManager != null) {
            return (X509TrustManager) trustManager;
        }
        throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
    }

    public String toString() {
        String simpleName = getClass().getSimpleName();
        n.d(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
