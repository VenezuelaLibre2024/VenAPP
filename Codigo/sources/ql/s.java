package ql;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* loaded from: classes3.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final a f24351e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final f0 f24352a;

    /* renamed from: b, reason: collision with root package name */
    private final i f24353b;

    /* renamed from: c, reason: collision with root package name */
    private final List<Certificate> f24354c;

    /* renamed from: d, reason: collision with root package name */
    private final ck.h f24355d;

    /* loaded from: classes3.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ql.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0404a extends kotlin.jvm.internal.o implements ok.a<List<? extends Certificate>> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<Certificate> f24356a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0404a(List<? extends Certificate> list) {
                super(0);
                this.f24356a = list;
            }

            @Override // ok.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Certificate> invoke() {
                return this.f24356a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private final List<Certificate> b(Certificate[] certificateArr) {
            List<Certificate> j10;
            if (certificateArr != null) {
                return rl.d.w(Arrays.copyOf(certificateArr, certificateArr.length));
            }
            j10 = dk.r.j();
            return j10;
        }

        public final s a(SSLSession sSLSession) {
            List<Certificate> j10;
            kotlin.jvm.internal.n.e(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (kotlin.jvm.internal.n.a(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : kotlin.jvm.internal.n.a(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(kotlin.jvm.internal.n.k("cipherSuite == ", cipherSuite));
            }
            i b10 = i.f24236b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (kotlin.jvm.internal.n.a("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            f0 a10 = f0.Companion.a(protocol);
            try {
                j10 = b(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                j10 = dk.r.j();
            }
            return new s(a10, b10, b(sSLSession.getLocalCertificates()), new C0404a(j10));
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.o implements ok.a<List<? extends Certificate>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ok.a<List<Certificate>> f24357a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(ok.a<? extends List<? extends Certificate>> aVar) {
            super(0);
            this.f24357a = aVar;
        }

        @Override // ok.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> invoke() {
            List<Certificate> j10;
            try {
                return this.f24357a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                j10 = dk.r.j();
                return j10;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s(f0 tlsVersion, i cipherSuite, List<? extends Certificate> localCertificates, ok.a<? extends List<? extends Certificate>> peerCertificatesFn) {
        ck.h a10;
        kotlin.jvm.internal.n.e(tlsVersion, "tlsVersion");
        kotlin.jvm.internal.n.e(cipherSuite, "cipherSuite");
        kotlin.jvm.internal.n.e(localCertificates, "localCertificates");
        kotlin.jvm.internal.n.e(peerCertificatesFn, "peerCertificatesFn");
        this.f24352a = tlsVersion;
        this.f24353b = cipherSuite;
        this.f24354c = localCertificates;
        a10 = ck.j.a(new b(peerCertificatesFn));
        this.f24355d = a10;
    }

    private final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        kotlin.jvm.internal.n.d(type, "type");
        return type;
    }

    public final i a() {
        return this.f24353b;
    }

    public final List<Certificate> c() {
        return this.f24354c;
    }

    public final List<Certificate> d() {
        return (List) this.f24355d.getValue();
    }

    public final f0 e() {
        return this.f24352a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (sVar.f24352a == this.f24352a && kotlin.jvm.internal.n.a(sVar.f24353b, this.f24353b) && kotlin.jvm.internal.n.a(sVar.d(), d()) && kotlin.jvm.internal.n.a(sVar.f24354c, this.f24354c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f24352a.hashCode()) * 31) + this.f24353b.hashCode()) * 31) + d().hashCode()) * 31) + this.f24354c.hashCode();
    }

    public String toString() {
        int r10;
        int r11;
        List<Certificate> d10 = d();
        r10 = dk.s.r(d10, 10);
        ArrayList arrayList = new ArrayList(r10);
        Iterator<T> it = d10.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f24352a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f24353b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f24354c;
        r11 = dk.s.r(list, 10);
        ArrayList arrayList2 = new ArrayList(r11);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
