package cm;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class a extends c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0125a f7195c = new C0125a(null);

    /* renamed from: b, reason: collision with root package name */
    private final e f7196b;

    /* renamed from: cm.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0125a {
        private C0125a() {
        }

        public /* synthetic */ C0125a(g gVar) {
            this();
        }
    }

    public a(e trustRootIndex) {
        n.e(trustRootIndex, "trustRootIndex");
        this.f7196b = trustRootIndex;
    }

    private final boolean b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!n.a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // cm.c
    public List<Certificate> a(List<? extends Certificate> chain, String hostname) {
        n.e(chain, "chain");
        n.e(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        n.d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i10 = 0;
        boolean z10 = false;
        while (i10 < 9) {
            i10++;
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate a10 = this.f7196b.a(x509Certificate);
            if (a10 == null) {
                Iterator it = arrayDeque.iterator();
                n.d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z10) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException(n.k("Failed to find a trusted cert that signed ", x509Certificate));
            }
            if (arrayList.size() > 1 || !n.a(x509Certificate, a10)) {
                arrayList.add(a10);
            }
            if (b(a10, a10)) {
                return arrayList;
            }
            z10 = true;
        }
        throw new SSLPeerUnverifiedException(n.k("Certificate chain too long: ", arrayList));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && n.a(((a) obj).f7196b, this.f7196b);
    }

    public int hashCode() {
        return this.f7196b.hashCode();
    }
}
