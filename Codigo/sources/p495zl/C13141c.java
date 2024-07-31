package p495zl;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import p319ql.EnumC10551z;

/* renamed from: zl.c */
/* loaded from: classes3.dex */
public final class C13141c extends C13148j {

    /* renamed from: e */
    public static final a f35514e;

    /* renamed from: f */
    private static final boolean f35515f;

    /* renamed from: d */
    private final Provider f35516d;

    /* renamed from: zl.c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C13141c m43354a() {
            C9315g c9315g = null;
            if (m43355b()) {
                return new C13141c(c9315g);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m43355b() {
            return C13141c.f35515f;
        }
    }

    static {
        a aVar = new a(null);
        f35514e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f35515f = z10;
    }

    private C13141c() {
        this.f35516d = new BouncyCastleJsseProvider();
    }

    public /* synthetic */ C13141c(C9315g c9315g) {
        this();
    }

    @Override // p495zl.C13148j
    /* renamed from: e */
    public void mo43339e(SSLSocket sslSocket, String str, List<EnumC10551z> protocols) {
        C9322n.m27781e(sslSocket, "sslSocket");
        C9322n.m27781e(protocols, "protocols");
        if (!(sslSocket instanceof BCSSLSocket)) {
            super.mo43339e(sslSocket, str, protocols);
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
        BCSSLParameters parameters = bCSSLSocket.getParameters();
        Object[] array = C13148j.f35535a.m43383b(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        parameters.setApplicationProtocols((String[]) array);
        bCSSLSocket.setParameters(parameters);
    }

    @Override // p495zl.C13148j
    /* renamed from: g */
    public String mo43340g(SSLSocket sslSocket) {
        C9322n.m27781e(sslSocket, "sslSocket");
        if (!(sslSocket instanceof BCSSLSocket)) {
            return super.mo43340g(sslSocket);
        }
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : C9322n.m27777a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p495zl.C13148j
    /* renamed from: m */
    public SSLContext mo43352m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f35516d);
        C9322n.m27780d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p495zl.C13148j
    /* renamed from: o */
    public X509TrustManager mo43353o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
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
}
