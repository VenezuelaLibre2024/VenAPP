package am;

import android.net.http.X509TrustManagerExtensions;
import cm.AbstractC2057c;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: am.d */
/* loaded from: classes3.dex */
public final class C0140d extends AbstractC2057c {

    /* renamed from: d */
    public static final a f560d = new a(null);

    /* renamed from: b */
    private final X509TrustManager f561b;

    /* renamed from: c */
    private final X509TrustManagerExtensions f562c;

    /* renamed from: am.d$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C0140d m640a(X509TrustManager trustManager) {
            X509TrustManagerExtensions x509TrustManagerExtensions;
            C9322n.m27781e(trustManager, "trustManager");
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(trustManager);
            } catch (IllegalArgumentException unused) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                return new C0140d(trustManager, x509TrustManagerExtensions);
            }
            return null;
        }
    }

    public C0140d(X509TrustManager trustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        C9322n.m27781e(trustManager, "trustManager");
        C9322n.m27781e(x509TrustManagerExtensions, "x509TrustManagerExtensions");
        this.f561b = trustManager;
        this.f562c = x509TrustManagerExtensions;
    }

    @Override // cm.AbstractC2057c
    /* renamed from: a */
    public List<Certificate> mo639a(List<? extends Certificate> chain, String hostname) {
        C9322n.m27781e(chain, "chain");
        C9322n.m27781e(hostname, "hostname");
        Object[] array = chain.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        try {
            List<X509Certificate> checkServerTrusted = this.f562c.checkServerTrusted((X509Certificate[]) array, "RSA", hostname);
            C9322n.m27780d(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e10) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e10.getMessage());
            sSLPeerUnverifiedException.initCause(e10);
            throw sSLPeerUnverifiedException;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0140d) && ((C0140d) obj).f561b == this.f561b;
    }

    public int hashCode() {
        return System.identityHashCode(this.f561b);
    }
}
