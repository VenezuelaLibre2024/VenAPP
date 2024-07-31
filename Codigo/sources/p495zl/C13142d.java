package p495zl;

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
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import org.conscrypt.Conscrypt;
import org.conscrypt.ConscryptHostnameVerifier;
import p319ql.EnumC10551z;

/* renamed from: zl.d */
/* loaded from: classes3.dex */
public final class C13142d extends C13148j {

    /* renamed from: e */
    public static final a f35517e;

    /* renamed from: f */
    private static final boolean f35518f;

    /* renamed from: d */
    private final Provider f35519d;

    /* renamed from: zl.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final boolean m43358a(int i10, int i11, int i12) {
            Conscrypt.Version version = Conscrypt.version();
            return version.major() != i10 ? version.major() > i10 : version.minor() != i11 ? version.minor() > i11 : version.patch() >= i12;
        }

        /* renamed from: b */
        public final C13142d m43359b() {
            C9315g c9315g = null;
            if (m43360c()) {
                return new C13142d(c9315g);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m43360c() {
            return C13142d.f35518f;
        }
    }

    /* renamed from: zl.d$b */
    /* loaded from: classes3.dex */
    public static final class b implements ConscryptHostnameVerifier {

        /* renamed from: a */
        public static final b f35520a = new b();

        private b() {
        }
    }

    static {
        a aVar = new a(null);
        f35517e = aVar;
        boolean z10 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, aVar.getClass().getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (aVar.m43358a(2, 1, 0)) {
                    z10 = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f35518f = z10;
    }

    private C13142d() {
        Provider newProvider = Conscrypt.newProvider();
        C9322n.m27780d(newProvider, "newProvider()");
        this.f35519d = newProvider;
    }

    public /* synthetic */ C13142d(C9315g c9315g) {
        this();
    }

    @Override // p495zl.C13148j
    /* renamed from: e */
    public void mo43339e(SSLSocket sslSocket, String str, List<EnumC10551z> protocols) {
        C9322n.m27781e(sslSocket, "sslSocket");
        C9322n.m27781e(protocols, "protocols");
        if (!Conscrypt.isConscrypt(sslSocket)) {
            super.mo43339e(sslSocket, str, protocols);
            return;
        }
        Conscrypt.setUseSessionTickets(sslSocket, true);
        Object[] array = C13148j.f35535a.m43383b(protocols).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        Conscrypt.setApplicationProtocols(sslSocket, (String[]) array);
    }

    @Override // p495zl.C13148j
    /* renamed from: g */
    public String mo43340g(SSLSocket sslSocket) {
        C9322n.m27781e(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket) ? Conscrypt.getApplicationProtocol(sslSocket) : super.mo43340g(sslSocket);
    }

    @Override // p495zl.C13148j
    /* renamed from: m */
    public SSLContext mo43352m() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f35519d);
        C9322n.m27780d(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // p495zl.C13148j
    /* renamed from: n */
    public SSLSocketFactory mo43357n(X509TrustManager trustManager) {
        C9322n.m27781e(trustManager, "trustManager");
        SSLContext mo43352m = mo43352m();
        mo43352m.init(null, new TrustManager[]{trustManager}, null);
        SSLSocketFactory socketFactory = mo43352m.getSocketFactory();
        C9322n.m27780d(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // p495zl.C13148j
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
        if (trustManager == null) {
            throw new NullPointerException("null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        }
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, b.f35520a);
        return x509TrustManager;
    }
}
