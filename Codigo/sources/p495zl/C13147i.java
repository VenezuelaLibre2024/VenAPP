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
import org.openjsse.javax.net.ssl.SSLParameters;
import org.openjsse.net.ssl.OpenJSSE;
import p319ql.EnumC10551z;

/* renamed from: zl.i */
/* loaded from: classes3.dex */
public final class C13147i extends C13148j {

    /* renamed from: e */
    public static final a f35532e;

    /* renamed from: f */
    private static final boolean f35533f;

    /* renamed from: d */
    private final Provider f35534d;

    /* renamed from: zl.i$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C13147i m43371a() {
            C9315g c9315g = null;
            if (m43372b()) {
                return new C13147i(c9315g);
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m43372b() {
            return C13147i.f35533f;
        }
    }

    static {
        a aVar = new a(null);
        f35532e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.openjsse.net.ssl.OpenJSSE", false, aVar.getClass().getClassLoader());
            z10 = true;
        } catch (ClassNotFoundException unused) {
        }
        f35533f = z10;
    }

    private C13147i() {
        this.f35534d = new OpenJSSE();
    }

    public /* synthetic */ C13147i(C9315g c9315g) {
        this();
    }

    @Override // p495zl.C13148j
    /* renamed from: e */
    public void mo43339e(SSLSocket sslSocket, String str, List<EnumC10551z> protocols) {
        C9322n.m27781e(sslSocket, "sslSocket");
        C9322n.m27781e(protocols, "protocols");
        if (!(sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            super.mo43339e(sslSocket, str, protocols);
            return;
        }
        org.openjsse.javax.net.ssl.SSLSocket sSLSocket = (org.openjsse.javax.net.ssl.SSLSocket) sslSocket;
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (sSLParameters instanceof SSLParameters) {
            SSLParameters sSLParameters2 = sSLParameters;
            Object[] array = C13148j.f35535a.m43383b(protocols).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            sSLParameters2.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        }
    }

    @Override // p495zl.C13148j
    /* renamed from: g */
    public String mo43340g(SSLSocket sslSocket) {
        C9322n.m27781e(sslSocket, "sslSocket");
        if (!(sslSocket instanceof org.openjsse.javax.net.ssl.SSLSocket)) {
            return super.mo43340g(sslSocket);
        }
        String applicationProtocol = ((org.openjsse.javax.net.ssl.SSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : C9322n.m27777a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // p495zl.C13148j
    /* renamed from: m */
    public SSLContext mo43352m() {
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.3", this.f35534d);
        C9322n.m27780d(sSLContext, "getInstance(\"TLSv1.3\", provider)");
        return sSLContext;
    }

    @Override // p495zl.C13148j
    /* renamed from: o */
    public X509TrustManager mo43353o() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm(), this.f35534d);
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
