package zl;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.n;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import ql.z;

/* loaded from: classes3.dex */
public final class c extends j {

    /* renamed from: e, reason: collision with root package name */
    public static final a f32963e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f32964f;

    /* renamed from: d, reason: collision with root package name */
    private final Provider f32965d;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final c a() {
            kotlin.jvm.internal.g gVar = null;
            if (b()) {
                return new c(gVar);
            }
            return null;
        }

        public final boolean b() {
            return c.f32964f;
        }
    }

    static {
        a aVar = new a(null);
        f32963e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f32964f = z10;
    }

    private c() {
        this.f32965d = new BouncyCastleJsseProvider();
    }

    public /* synthetic */ c(kotlin.jvm.internal.g gVar) {
        this();
    }

    @Override // zl.j
    public void e(SSLSocket sslSocket, String str, List<z> protocols) {
        n.e(sslSocket, "sslSocket");
        n.e(protocols, "protocols");
        if (!(sslSocket instanceof BCSSLSocket)) {
            super.e(sslSocket, str, protocols);
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
        BCSSLParameters parameters = bCSSLSocket.getParameters();
        Object[] array = j.f32984a.b(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        parameters.setApplicationProtocols((String[]) array);
        bCSSLSocket.setParameters(parameters);
    }

    @Override // zl.j
    public String g(SSLSocket sslSocket) {
        n.e(sslSocket, "sslSocket");
        if (!(sslSocket instanceof BCSSLSocket)) {
            return super.g(sslSocket);
        }
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : n.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // zl.j
    public SSLContext m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f32965d);
        n.d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // zl.j
    public X509TrustManager o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
}
