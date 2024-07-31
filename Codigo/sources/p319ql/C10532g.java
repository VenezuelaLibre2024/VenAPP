package p319ql;

import cm.AbstractC2057c;
import dk.C7031r;
import dk.C7033s;
import dk.C7042z;
import dm.C7061e;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9310b0;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9987a;
import p450xk.C12524p;
import p450xk.C12525q;

/* renamed from: ql.g */
/* loaded from: classes3.dex */
public final class C10532g {

    /* renamed from: c */
    public static final b f26263c = new b(null);

    /* renamed from: d */
    public static final C10532g f26264d = new a().m31728a();

    /* renamed from: a */
    private final Set<c> f26265a;

    /* renamed from: b */
    private final AbstractC2057c f26266b;

    /* renamed from: ql.g$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        private final List<c> f26267a = new ArrayList();

        /* renamed from: a */
        public final C10532g m31728a() {
            Set m20634j0;
            m20634j0 = C7042z.m20634j0(this.f26267a);
            return new C10532g(m20634j0, null, 2, 0 == true ? 1 : 0);
        }
    }

    /* renamed from: ql.g$b */
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final String m31729a(Certificate certificate) {
            C9322n.m27781e(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return C9322n.m27787k("sha256/", m31731c((X509Certificate) certificate).mo20762b());
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        /* renamed from: b */
        public final C7061e m31730b(X509Certificate x509Certificate) {
            C9322n.m27781e(x509Certificate, "<this>");
            C7061e.a aVar = C7061e.f15649d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            C9322n.m27780d(encoded, "publicKey.encoded");
            return C7061e.a.m20778f(aVar, encoded, 0, 0, 3, null).m20777z();
        }

        /* renamed from: c */
        public final C7061e m31731c(X509Certificate x509Certificate) {
            C9322n.m27781e(x509Certificate, "<this>");
            C7061e.a aVar = C7061e.f15649d;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            C9322n.m27780d(encoded, "publicKey.encoded");
            return C7061e.a.m20778f(aVar, encoded, 0, 0, 3, null).m20755A();
        }
    }

    /* renamed from: ql.g$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        private final String f26268a;

        /* renamed from: b */
        private final String f26269b;

        /* renamed from: c */
        private final C7061e f26270c;

        /* renamed from: a */
        public final C7061e m31732a() {
            return this.f26270c;
        }

        /* renamed from: b */
        public final String m31733b() {
            return this.f26269b;
        }

        /* renamed from: c */
        public final boolean m31734c(String hostname) {
            boolean m41031E;
            boolean m41031E2;
            boolean m41041v;
            int m41076Y;
            boolean m41041v2;
            C9322n.m27781e(hostname, "hostname");
            m41031E = C12524p.m41031E(this.f26268a, "**.", false, 2, null);
            if (m41031E) {
                int length = this.f26268a.length() - 3;
                int length2 = hostname.length() - length;
                m41041v2 = C12524p.m41041v(hostname, hostname.length() - length, this.f26268a, 3, length, false, 16, null);
                if (!m41041v2) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                m41031E2 = C12524p.m41031E(this.f26268a, "*.", false, 2, null);
                if (!m41031E2) {
                    return C9322n.m27777a(hostname, this.f26268a);
                }
                int length3 = this.f26268a.length() - 1;
                int length4 = hostname.length() - length3;
                m41041v = C12524p.m41041v(hostname, hostname.length() - length3, this.f26268a, 1, length3, false, 16, null);
                if (!m41041v) {
                    return false;
                }
                m41076Y = C12525q.m41076Y(hostname, '.', length4 - 1, false, 4, null);
                if (m41076Y != -1) {
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
            return C9322n.m27777a(this.f26268a, cVar.f26268a) && C9322n.m27777a(this.f26269b, cVar.f26269b) && C9322n.m27777a(this.f26270c, cVar.f26270c);
        }

        public int hashCode() {
            return (((this.f26268a.hashCode() * 31) + this.f26269b.hashCode()) * 31) + this.f26270c.hashCode();
        }

        public String toString() {
            return this.f26269b + '/' + this.f26270c.mo20762b();
        }
    }

    /* renamed from: ql.g$d */
    /* loaded from: classes3.dex */
    static final class d extends AbstractC9323o implements InterfaceC9987a<List<? extends X509Certificate>> {

        /* renamed from: b */
        final /* synthetic */ List<Certificate> f26272b;

        /* renamed from: c */
        final /* synthetic */ String f26273c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(List<? extends Certificate> list, String str) {
            super(0);
            this.f26272b = list;
            this.f26273c = str;
        }

        @Override // p280ok.InterfaceC9987a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> invoke() {
            int m20590r;
            AbstractC2057c m31726d = C10532g.this.m31726d();
            List<Certificate> mo639a = m31726d == null ? null : m31726d.mo639a(this.f26272b, this.f26273c);
            if (mo639a == null) {
                mo639a = this.f26272b;
            }
            List<Certificate> list = mo639a;
            m20590r = C7033s.m20590r(list, 10);
            ArrayList arrayList = new ArrayList(m20590r);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public C10532g(Set<c> pins, AbstractC2057c abstractC2057c) {
        C9322n.m27781e(pins, "pins");
        this.f26265a = pins;
        this.f26266b = abstractC2057c;
    }

    public /* synthetic */ C10532g(Set set, AbstractC2057c abstractC2057c, int i10, C9315g c9315g) {
        this(set, (i10 & 2) != 0 ? null : abstractC2057c);
    }

    /* renamed from: a */
    public final void m31723a(String hostname, List<? extends Certificate> peerCertificates) {
        C9322n.m27781e(hostname, "hostname");
        C9322n.m27781e(peerCertificates, "peerCertificates");
        m31724b(hostname, new d(peerCertificates, hostname));
    }

    /* renamed from: b */
    public final void m31724b(String hostname, InterfaceC9987a<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        C9322n.m27781e(hostname, "hostname");
        C9322n.m27781e(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<c> m31725c = m31725c(hostname);
        if (m31725c.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : invoke) {
            C7061e c7061e = null;
            C7061e c7061e2 = null;
            for (c cVar : m31725c) {
                String m31733b = cVar.m31733b();
                if (C9322n.m27777a(m31733b, "sha256")) {
                    if (c7061e == null) {
                        c7061e = f26263c.m31731c(x509Certificate);
                    }
                    if (C9322n.m27777a(cVar.m31732a(), c7061e)) {
                        return;
                    }
                } else {
                    if (!C9322n.m27777a(m31733b, "sha1")) {
                        throw new AssertionError(C9322n.m27787k("unsupported hashAlgorithm: ", cVar.m31733b()));
                    }
                    if (c7061e2 == null) {
                        c7061e2 = f26263c.m31730b(x509Certificate);
                    }
                    if (C9322n.m27777a(cVar.m31732a(), c7061e2)) {
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
            sb2.append(f26263c.m31729a(x509Certificate2));
            sb2.append(": ");
            sb2.append(x509Certificate2.getSubjectDN().getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(hostname);
        sb2.append(":");
        for (c cVar2 : m31725c) {
            sb2.append("\n    ");
            sb2.append(cVar2);
        }
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb3);
    }

    /* renamed from: c */
    public final List<c> m31725c(String hostname) {
        List<c> m20582j;
        C9322n.m27781e(hostname, "hostname");
        Set<c> set = this.f26265a;
        m20582j = C7031r.m20582j();
        for (Object obj : set) {
            if (((c) obj).m31734c(hostname)) {
                if (m20582j.isEmpty()) {
                    m20582j = new ArrayList<>();
                }
                C9310b0.m27757a(m20582j).add(obj);
            }
        }
        return m20582j;
    }

    /* renamed from: d */
    public final AbstractC2057c m31726d() {
        return this.f26266b;
    }

    /* renamed from: e */
    public final C10532g m31727e(AbstractC2057c certificateChainCleaner) {
        C9322n.m27781e(certificateChainCleaner, "certificateChainCleaner");
        return C9322n.m27777a(this.f26266b, certificateChainCleaner) ? this : new C10532g(this.f26265a, certificateChainCleaner);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10532g) {
            C10532g c10532g = (C10532g) obj;
            if (C9322n.m27777a(c10532g.f26265a, this.f26265a) && C9322n.m27777a(c10532g.f26266b, this.f26266b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (1517 + this.f26265a.hashCode()) * 41;
        AbstractC2057c abstractC2057c = this.f26266b;
        return hashCode + (abstractC2057c != null ? abstractC2057c.hashCode() : 0);
    }
}
