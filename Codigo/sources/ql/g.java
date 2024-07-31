package ql;

import dm.e;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final b f24221c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final g f24222d = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final Set<c> f24223a;

    /* renamed from: b, reason: collision with root package name */
    private final cm.c f24224b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<c> f24225a = new ArrayList();

        public final g a() {
            Set j02;
            j02 = dk.z.j0(this.f24225a);
            return new g(j02, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final String a(Certificate certificate) {
            kotlin.jvm.internal.n.e(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return kotlin.jvm.internal.n.k("sha256/", c((X509Certificate) certificate).b());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final dm.e b(X509Certificate x509Certificate) {
            kotlin.jvm.internal.n.e(x509Certificate, "<this>");
            e.a aVar = dm.e.f14291d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.n.d(encoded, "publicKey.encoded");
            return e.a.f(aVar, encoded, 0, 0, 3, null).z();
        }

        public final dm.e c(X509Certificate x509Certificate) {
            kotlin.jvm.internal.n.e(x509Certificate, "<this>");
            e.a aVar = dm.e.f14291d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            kotlin.jvm.internal.n.d(encoded, "publicKey.encoded");
            return e.a.f(aVar, encoded, 0, 0, 3, null).A();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f24226a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24227b;

        /* renamed from: c, reason: collision with root package name */
        private final dm.e f24228c;

        public final dm.e a() {
            return this.f24228c;
        }

        public final String b() {
            return this.f24227b;
        }

        public final boolean c(String hostname) {
            boolean E;
            boolean E2;
            boolean v10;
            int Y;
            boolean v11;
            kotlin.jvm.internal.n.e(hostname, "hostname");
            E = xk.p.E(this.f24226a, "**.", false, 2, null);
            if (E) {
                int length = this.f24226a.length() - 3;
                int length2 = hostname.length() - length;
                v11 = xk.p.v(hostname, hostname.length() - length, this.f24226a, 3, length, false, 16, null);
                if (!v11) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                E2 = xk.p.E(this.f24226a, "*.", false, 2, null);
                if (!E2) {
                    return kotlin.jvm.internal.n.a(hostname, this.f24226a);
                }
                int length3 = this.f24226a.length() - 1;
                int length4 = hostname.length() - length3;
                v10 = xk.p.v(hostname, hostname.length() - length3, this.f24226a, 1, length3, false, 16, null);
                if (!v10) {
                    return false;
                }
                Y = xk.q.Y(hostname, '.', length4 - 1, false, 4, null);
                if (Y != -1) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.n.a(this.f24226a, cVar.f24226a) && kotlin.jvm.internal.n.a(this.f24227b, cVar.f24227b) && kotlin.jvm.internal.n.a(this.f24228c, cVar.f24228c);
        }

        public int hashCode() {
            return (((this.f24226a.hashCode() * 31) + this.f24227b.hashCode()) * 31) + this.f24228c.hashCode();
        }

        public String toString() {
            return this.f24227b + '/' + this.f24228c.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.o implements ok.a<List<? extends X509Certificate>> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Certificate> f24230b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f24231c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends Certificate> list, String str) {
            super(0);
            this.f24230b = list;
            this.f24231c = str;
        }

        @Override // ok.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> invoke() {
            int r10;
            cm.c d10 = g.this.d();
            List<Certificate> a10 = d10 == null ? null : d10.a(this.f24230b, this.f24231c);
            if (a10 == null) {
                a10 = this.f24230b;
            }
            List<Certificate> list = a10;
            r10 = dk.s.r(list, 10);
            ArrayList arrayList = new ArrayList(r10);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public g(Set<c> pins, cm.c cVar) {
        kotlin.jvm.internal.n.e(pins, "pins");
        this.f24223a = pins;
        this.f24224b = cVar;
    }

    public /* synthetic */ g(Set set, cm.c cVar, int i10, kotlin.jvm.internal.g gVar) {
        this(set, (i10 & 2) != 0 ? null : cVar);
    }

    public final void a(String hostname, List<? extends Certificate> peerCertificates) {
        kotlin.jvm.internal.n.e(hostname, "hostname");
        kotlin.jvm.internal.n.e(peerCertificates, "peerCertificates");
        b(hostname, new d(peerCertificates, hostname));
    }

    public final void b(String hostname, ok.a<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        kotlin.jvm.internal.n.e(hostname, "hostname");
        kotlin.jvm.internal.n.e(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<c> c10 = c(hostname);
        if (c10.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : invoke) {
            dm.e eVar = null;
            dm.e eVar2 = null;
            for (c cVar : c10) {
                String b10 = cVar.b();
                if (kotlin.jvm.internal.n.a(b10, "sha256")) {
                    if (eVar == null) {
                        eVar = f24221c.c(x509Certificate);
                    }
                    if (kotlin.jvm.internal.n.a(cVar.a(), eVar)) {
                        return;
                    }
                } else {
                    if (!kotlin.jvm.internal.n.a(b10, "sha1")) {
                        throw new AssertionError(kotlin.jvm.internal.n.k("unsupported hashAlgorithm: ", cVar.b()));
                    }
                    if (eVar2 == null) {
                        eVar2 = f24221c.b(x509Certificate);
                    }
                    if (kotlin.jvm.internal.n.a(cVar.a(), eVar2)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            sb2.append("\n    ");
            sb2.append(f24221c.a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(":");
        for (c cVar2 : c10) {
            sb2.append("\n    ");
            sb2.append(cVar2);
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.n.d(sb3, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb3);
    }

    public final List<c> c(String hostname) {
        List<c> j10;
        kotlin.jvm.internal.n.e(hostname, "hostname");
        Set<c> set = this.f24223a;
        j10 = dk.r.j();
        for (Object obj : set) {
            if (((c) obj).c(hostname)) {
                if (j10.isEmpty()) {
                    j10 = new ArrayList<>();
                }
                kotlin.jvm.internal.b0.a(j10).add(obj);
            }
        }
        return j10;
    }

    public final cm.c d() {
        return this.f24224b;
    }

    public final g e(cm.c certificateChainCleaner) {
        kotlin.jvm.internal.n.e(certificateChainCleaner, "certificateChainCleaner");
        return kotlin.jvm.internal.n.a(this.f24224b, certificateChainCleaner) ? this : new g(this.f24223a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (kotlin.jvm.internal.n.a(gVar.f24223a, this.f24223a) && kotlin.jvm.internal.n.a(gVar.f24224b, this.f24224b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (1517 + this.f24223a.hashCode()) * 41;
        cm.c cVar = this.f24224b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
