package cm;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;

/* renamed from: cm.a */
/* loaded from: classes3.dex */
public final class C2055a extends AbstractC2057c {

    /* renamed from: c */
    public static final a f8147c = new a(null);

    /* renamed from: b */
    private final InterfaceC2059e f8148b;

    /* renamed from: cm.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }
    }

    public C2055a(InterfaceC2059e trustRootIndex) {
        C9322n.m27781e(trustRootIndex, "trustRootIndex");
        this.f8148b = trustRootIndex;
    }

    /* renamed from: b */
    private final boolean m10390b(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!C9322n.m27777a(x509Certificate.getIssuerDN(), x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // cm.AbstractC2057c
    /* renamed from: a */
    public List<Certificate> mo639a(List<? extends Certificate> chain, String hostname) {
        C9322n.m27781e(chain, "chain");
        C9322n.m27781e(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object removeFirst = arrayDeque.removeFirst();
        C9322n.m27780d(removeFirst, "queue.removeFirst()");
        arrayList.add(removeFirst);
        int i10 = 0;
        boolean z10 = false;
        while (i10 < 9) {
            i10++;
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate mo10391a = this.f8148b.mo10391a(x509Certificate);
            if (mo10391a == null) {
                Iterator it = arrayDeque.iterator();
                C9322n.m27780d(it, "queue.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    X509Certificate x509Certificate2 = (X509Certificate) next;
                    if (m10390b(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z10) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException(C9322n.m27787k("Failed to find a trusted cert that signed ", x509Certificate));
            }
            if (arrayList.size() > 1 || !C9322n.m27777a(x509Certificate, mo10391a)) {
                arrayList.add(mo10391a);
            }
            if (m10390b(mo10391a, mo10391a)) {
                return arrayList;
            }
            z10 = true;
        }
        throw new SSLPeerUnverifiedException(C9322n.m27787k("Certificate chain too long: ", arrayList));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C2055a) && C9322n.m27777a(((C2055a) obj).f8148b, this.f8148b);
    }

    public int hashCode() {
        return this.f8148b.hashCode();
    }
}
