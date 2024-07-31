package vi;

import java.security.cert.Certificate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import p082eb.C7159o;

/* renamed from: vi.c0 */
/* loaded from: classes3.dex */
public final class C11902c0 {

    /* renamed from: f */
    private static final Logger f31504f = Logger.getLogger(C11902c0.class.getName());

    /* renamed from: g */
    private static final C11902c0 f31505g = new C11902c0();

    /* renamed from: a */
    private final ConcurrentNavigableMap<Long, InterfaceC11917h0<Object>> f31506a = new ConcurrentSkipListMap();

    /* renamed from: b */
    private final ConcurrentNavigableMap<Long, InterfaceC11917h0<Object>> f31507b = new ConcurrentSkipListMap();

    /* renamed from: c */
    private final ConcurrentMap<Long, InterfaceC11917h0<Object>> f31508c = new ConcurrentHashMap();

    /* renamed from: d */
    private final ConcurrentMap<Long, InterfaceC11917h0<Object>> f31509d = new ConcurrentHashMap();

    /* renamed from: e */
    private final ConcurrentMap<Long, Object> f31510e = new ConcurrentHashMap();

    /* renamed from: vi.c0$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public final c f31511a;

        public b(c cVar) {
            this.f31511a = (c) C7159o.m21312o(cVar);
        }
    }

    /* renamed from: vi.c0$c */
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a */
        public final String f31512a;

        /* renamed from: b */
        public final Certificate f31513b;

        /* renamed from: c */
        public final Certificate f31514c;

        public c(SSLSession sSLSession) {
            String cipherSuite = sSLSession.getCipherSuite();
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            Certificate certificate = null;
            Certificate certificate2 = localCertificates != null ? localCertificates[0] : null;
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    certificate = peerCertificates[0];
                }
            } catch (SSLPeerUnverifiedException e10) {
                C11902c0.f31504f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e10);
            }
            this.f31512a = cipherSuite;
            this.f31513b = certificate2;
            this.f31514c = certificate;
        }
    }

    /* renamed from: b */
    private static <T extends InterfaceC11917h0<?>> void m38102b(Map<Long, T> map, T t10) {
        map.put(Long.valueOf(t10.mo25247e().m38165d()), t10);
    }

    /* renamed from: f */
    public static long m38103f(InterfaceC11935n0 interfaceC11935n0) {
        return interfaceC11935n0.mo25247e().m38165d();
    }

    /* renamed from: g */
    public static C11902c0 m38104g() {
        return f31505g;
    }

    /* renamed from: h */
    private static <T extends InterfaceC11917h0<?>> void m38105h(Map<Long, T> map, T t10) {
        map.remove(Long.valueOf(m38103f(t10)));
    }

    /* renamed from: c */
    public void m38106c(InterfaceC11917h0<Object> interfaceC11917h0) {
        m38102b(this.f31509d, interfaceC11917h0);
    }

    /* renamed from: d */
    public void m38107d(InterfaceC11917h0<Object> interfaceC11917h0) {
        m38102b(this.f31507b, interfaceC11917h0);
    }

    /* renamed from: e */
    public void m38108e(InterfaceC11917h0<Object> interfaceC11917h0) {
        m38102b(this.f31508c, interfaceC11917h0);
    }

    /* renamed from: i */
    public void m38109i(InterfaceC11917h0<Object> interfaceC11917h0) {
        m38105h(this.f31509d, interfaceC11917h0);
    }

    /* renamed from: j */
    public void m38110j(InterfaceC11917h0<Object> interfaceC11917h0) {
        m38105h(this.f31507b, interfaceC11917h0);
    }

    /* renamed from: k */
    public void m38111k(InterfaceC11917h0<Object> interfaceC11917h0) {
        m38105h(this.f31508c, interfaceC11917h0);
    }
}
