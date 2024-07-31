package cm;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import kotlin.jvm.internal.C9322n;

/* renamed from: cm.b */
/* loaded from: classes3.dex */
public final class C2056b implements InterfaceC2059e {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f8149a;

    public C2056b(X509Certificate... caCerts) {
        C9322n.m27781e(caCerts, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = caCerts.length;
        int i10 = 0;
        while (i10 < length) {
            X509Certificate x509Certificate = caCerts[i10];
            i10++;
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            C9322n.m27780d(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f8149a = linkedHashMap;
    }

    @Override // cm.InterfaceC2059e
    /* renamed from: a */
    public X509Certificate mo10391a(X509Certificate cert) {
        boolean z10;
        C9322n.m27781e(cert, "cert");
        Set<X509Certificate> set = this.f8149a.get(cert.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator<T> it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                cert.verify(((X509Certificate) next).getPublicKey());
                z10 = true;
            } catch (Exception unused) {
                z10 = false;
            }
            if (z10) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof C2056b) && C9322n.m27777a(((C2056b) obj).f8149a, this.f8149a));
    }

    public int hashCode() {
        return this.f8149a.hashCode();
    }
}
