package p319ql;

import ck.C2025j;
import ck.InterfaceC2023h;
import dk.C7031r;
import dk.C7033s;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.AbstractC9323o;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p280ok.InterfaceC9987a;
import p341rl.C10727d;

/* renamed from: ql.s */
/* loaded from: classes3.dex */
public final class C10544s {

    /* renamed from: e */
    public static final a f26445e = new a(null);

    /* renamed from: a */
    private final EnumC10531f0 f26446a;

    /* renamed from: b */
    private final C10534i f26447b;

    /* renamed from: c */
    private final List<Certificate> f26448c;

    /* renamed from: d */
    private final InterfaceC2023h f26449d;

    /* renamed from: ql.s$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: ql.s$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C13239a extends AbstractC9323o implements InterfaceC9987a<List<? extends Certificate>> {

            /* renamed from: a */
            final /* synthetic */ List<Certificate> f26450a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C13239a(List<? extends Certificate> list) {
                super(0);
                this.f26450a = list;
            }

            @Override // p280ok.InterfaceC9987a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List<Certificate> invoke() {
                return this.f26450a;
            }
        }

        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: b */
        private final List<Certificate> m31841b(Certificate[] certificateArr) {
            List<Certificate> m20582j;
            if (certificateArr != null) {
                return C10727d.m32663w(Arrays.copyOf(certificateArr, certificateArr.length));
            }
            m20582j = C7031r.m20582j();
            return m20582j;
        }

        /* renamed from: a */
        public final C10544s m31842a(SSLSession sSLSession) {
            List<Certificate> m20582j;
            C9322n.m27781e(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (C9322n.m27777a(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : C9322n.m27777a(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(C9322n.m27787k("cipherSuite == ", cipherSuite));
            }
            C10534i m31746b = C10534i.f26330b.m31746b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (C9322n.m27777a("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            EnumC10531f0 m31722a = EnumC10531f0.Companion.m31722a(protocol);
            try {
                m20582j = m31841b(sSLSession.getPeerCertificates());
            } catch (SSLPeerUnverifiedException unused) {
                m20582j = C7031r.m20582j();
            }
            return new C10544s(m31722a, m31746b, m31841b(sSLSession.getLocalCertificates()), new C13239a(m20582j));
        }
    }

    /* renamed from: ql.s$b */
    /* loaded from: classes3.dex */
    static final class b extends AbstractC9323o implements InterfaceC9987a<List<? extends Certificate>> {

        /* renamed from: a */
        final /* synthetic */ InterfaceC9987a<List<Certificate>> f26451a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC9987a<? extends List<? extends Certificate>> interfaceC9987a) {
            super(0);
            this.f26451a = interfaceC9987a;
        }

        @Override // p280ok.InterfaceC9987a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> invoke() {
            List<Certificate> m20582j;
            try {
                return this.f26451a.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                m20582j = C7031r.m20582j();
                return m20582j;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C10544s(EnumC10531f0 tlsVersion, C10534i cipherSuite, List<? extends Certificate> localCertificates, InterfaceC9987a<? extends List<? extends Certificate>> peerCertificatesFn) {
        InterfaceC2023h m10334a;
        C9322n.m27781e(tlsVersion, "tlsVersion");
        C9322n.m27781e(cipherSuite, "cipherSuite");
        C9322n.m27781e(localCertificates, "localCertificates");
        C9322n.m27781e(peerCertificatesFn, "peerCertificatesFn");
        this.f26446a = tlsVersion;
        this.f26447b = cipherSuite;
        this.f26448c = localCertificates;
        m10334a = C2025j.m10334a(new b(peerCertificatesFn));
        this.f26449d = m10334a;
    }

    /* renamed from: b */
    private final String m31836b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        C9322n.m27780d(type, "type");
        return type;
    }

    /* renamed from: a */
    public final C10534i m31837a() {
        return this.f26447b;
    }

    /* renamed from: c */
    public final List<Certificate> m31838c() {
        return this.f26448c;
    }

    /* renamed from: d */
    public final List<Certificate> m31839d() {
        return (List) this.f26449d.getValue();
    }

    /* renamed from: e */
    public final EnumC10531f0 m31840e() {
        return this.f26446a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10544s) {
            C10544s c10544s = (C10544s) obj;
            if (c10544s.f26446a == this.f26446a && C9322n.m27777a(c10544s.f26447b, this.f26447b) && C9322n.m27777a(c10544s.m31839d(), m31839d()) && C9322n.m27777a(c10544s.f26448c, this.f26448c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.f26446a.hashCode()) * 31) + this.f26447b.hashCode()) * 31) + m31839d().hashCode()) * 31) + this.f26448c.hashCode();
    }

    public String toString() {
        int m20590r;
        int m20590r2;
        List<Certificate> m31839d = m31839d();
        m20590r = C7033s.m20590r(m31839d, 10);
        ArrayList arrayList = new ArrayList(m20590r);
        Iterator<T> it = m31839d.iterator();
        while (it.hasNext()) {
            arrayList.add(m31836b((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Handshake{tlsVersion=");
        sb2.append(this.f26446a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f26447b);
        sb2.append(" peerCertificates=");
        sb2.append(obj);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f26448c;
        m20590r2 = C7033s.m20590r(list, 10);
        ArrayList arrayList2 = new ArrayList(m20590r2);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(m31836b((Certificate) it2.next()));
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
