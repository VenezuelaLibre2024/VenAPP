package zl;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.n;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import ql.z;

/* loaded from: classes3.dex */
public final class d extends j {

    /* renamed from: e, reason: collision with root package name */
    public static final a f32966e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f32967f;

    /* renamed from: d, reason: collision with root package name */
    private final Provider f32968d;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final boolean a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i10 ? version.major() > i10 : version.minor() != i11 ? version.minor() > i11 : version.patch() >= i12;
        }

        public final d b() {
            kotlin.jvm.internal.g gVar = null;
            if (c()) {
                return new d(gVar);
            }
            return null;
        }

        public final boolean c() {
            return d.f32967f;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a, reason: collision with root package name */
        public static final b f32969a = new b();

        private b() {
        }
    }

    static {
        a aVar = new a(null);
        f32966e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.a(2, 1, 0)) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f32967f = z10;
    }

    private d() {
        Provider newProvider = Conscrypt.newProvider();
        n.d(newProvider, "newProvider()");
        this.f32968d = newProvider;
    }

    public /* synthetic */ d(kotlin.jvm.internal.g gVar) {
        this();
    }

    @Override // zl.j
    public void e(SSLSocket sslSocket, String str, List<z> protocols) {
        n.e(sslSocket, "sslSocket");
        n.e(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.e(sslSocket, str, protocols);
            return;
        }
        Conscrypt.setUseSessionTickets(sslSocket, true);
        Object[] array = j.f32984a.b(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
    }

    @Override // zl.j
    public String g(SSLSocket sslSocket) {
        n.e(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.g(sslSocket);
    }

    @Override // zl.j
    public SSLContext m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f32968d);
        n.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // zl.j
    public SSLSocketFactory n(X509TrustManager trustManager) {
        n.e(trustManager, "trustManager");
        SSLContext m10 = m();
        m10.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = m10.getSocketFactory();
        n.d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // zl.j
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
        if (trustManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, b.f32969a);
        return x509TrustManager;
    }
}
