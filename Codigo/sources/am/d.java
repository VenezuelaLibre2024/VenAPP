package am;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes3.dex */
public final class d extends cm.c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f495d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final X509TrustManager f496b;

    /* renamed from: c, reason: collision with root package name */
    private final X509TrustManagerExtensions f497c;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final d a(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            kotlin.jvm.internal.n.e(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new d(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public d(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        kotlin.jvm.internal.n.e(trustManager, "trustManager");
        kotlin.jvm.internal.n.e(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f496b = trustManager;
        this.f497c = x509TrustManagerExtensions;
    }

    @Override // cm.c
    public List<Certificate> a(List<? extends Certificate> chain, String hostname) {
        kotlin.jvm.internal.n.e(chain, "chain");
        kotlin.jvm.internal.n.e(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        try {
            List<X509Certificate> checkServerTrusted = this.f497c.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
            kotlin.jvm.internal.n.d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f496b == this.f496b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f496b);
    }
}
