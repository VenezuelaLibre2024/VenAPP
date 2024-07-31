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

/* loaded from: classes3.dex */
public final class c0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f29070f = Logger.getLogger(c0.class.getName());

    /* renamed from: g, reason: collision with root package name */
    private static final c0 f29071g = new c0();

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentNavigableMap<Long, h0<Object>> f29072a = new ConcurrentSkipListMap();

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentNavigableMap<Long, h0<Object>> f29073b = new ConcurrentSkipListMap();

    /* renamed from: c, reason: collision with root package name */
    private final ConcurrentMap<Long, h0<Object>> f29074c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private final ConcurrentMap<Long, h0<Object>> f29075d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentMap<Long, Object> f29076e = new ConcurrentHashMap();

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final c f29077a;

        public b(c cVar) {
            this.f29077a = (c) eb.o.o(cVar);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f29078a;

        /* renamed from: b, reason: collision with root package name */
        public final Certificate f29079b;

        /* renamed from: c, reason: collision with root package name */
        public final Certificate f29080c;

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
                c0.f29070f.log(Level.FINE, String.format("Peer cert not available for peerHost=%s", sSLSession.getPeerHost()), (Throwable) e10);
            }
            this.f29078a = cipherSuite;
            this.f29079b = certificate2;
            this.f29080c = certificate;
        }
    }

    private static <T extends h0<?>> void b(Map<Long, T> map, T t10) {
        map.put(Long.valueOf(t10.e().d()), t10);
    }

    public static long f(n0 n0Var) {
        return n0Var.e().d();
    }

    public static c0 g() {
        return f29071g;
    }

    private static <T extends h0<?>> void h(Map<Long, T> map, T t10) {
        map.remove(Long.valueOf(f(t10)));
    }

    public void c(h0<Object> h0Var) {
        b(this.f29075d, h0Var);
    }

    public void d(h0<Object> h0Var) {
        b(this.f29073b, h0Var);
    }

    public void e(h0<Object> h0Var) {
        b(this.f29074c, h0Var);
    }

    public void i(h0<Object> h0Var) {
        h(this.f29075d, h0Var);
    }

    public void j(h0<Object> h0Var) {
        h(this.f29073b, h0Var);
    }

    public void k(h0<Object> h0Var) {
        h(this.f29074c, h0Var);
    }
}
