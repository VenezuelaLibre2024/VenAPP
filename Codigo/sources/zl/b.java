package zl;

import am.k;
import am.l;
import am.m;
import am.n;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import dk.r;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.n;
import ql.z;

/* loaded from: classes3.dex */
public final class b extends j {

    /* renamed from: f */
    public static final a f32957f = new a(null);

    /* renamed from: g */
    private static final boolean f32958g;

    /* renamed from: d */
    private final List<m> f32959d;

    /* renamed from: e */
    private final am.j f32960e;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final j a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f32958g;
        }
    }

    /* renamed from: zl.b$b */
    /* loaded from: classes3.dex */
    public static final class C0548b implements cm.e {

        /* renamed from: a */
        private final X509TrustManager f32961a;

        /* renamed from: b */
        private final Method f32962b;

        public C0548b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            n.e(trustManager, "trustManager");
            n.e(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f32961a = trustManager;
            this.f32962b = findByIssuerAndSignatureMethod;
        }

        @Override // cm.e
        public X509Certificate a(X509Certificate cert) {
            n.e(cert, "cert");
            try {
                Object invoke = this.f32962b.invoke(this.f32961a, cert);
                if (invoke != null) {
                    return ((TrustAnchor) invoke).getTrustedCert();
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            } catch (IllegalAccessException e10) {
                throw new AssertionError("unable to get issues and signature", e10);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0548b)) {
                return false;
            }
            C0548b c0548b = (C0548b) obj;
            return n.a(this.f32961a, c0548b.f32961a) && n.a(this.f32962b, c0548b.f32962b);
        }

        public int hashCode() {
            return (this.f32961a.hashCode() * 31) + this.f32962b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f32961a + ", findByIssuerAndSignatureMethod=" + this.f32962b + ')';
        }
    }

    static {
        boolean z10 = false;
        if (j.f32984a.h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f32958g = z10;
    }

    public b() {
        List m10;
        m10 = r.m(n.a.b(am.n.f520j, null, 1, null), new l(am.h.f502f.d()), new l(k.f516a.a()), new l(am.i.f510a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m10) {
            if (((m) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f32959d = arrayList;
        this.f32960e = am.j.f512d.a();
    }

    @Override // zl.j
    public cm.c c(X509TrustManager trustManager) {
        kotlin.jvm.internal.n.e(trustManager, "trustManager");
        am.d a10 = am.d.f495d.a(trustManager);
        return a10 == null ? super.c(trustManager) : a10;
    }

    @Override // zl.j
    public cm.e d(X509TrustManager trustManager) {
        kotlin.jvm.internal.n.e(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            kotlin.jvm.internal.n.d(method, "method");
            return new C0548b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // zl.j
    public void e(SSLSocket sslSocket, String str, List<z> protocols) {
        Object obj;
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        kotlin.jvm.internal.n.e(protocols, "protocols");
        Iterator<T> it = this.f32959d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((m) obj).b(sslSocket)) {
                    break;
                }
            }
        }
        m mVar = (m) obj;
        if (mVar == null) {
            return;
        }
        mVar.d(sslSocket, str, protocols);
    }

    @Override // zl.j
    public void f(Socket socket, InetSocketAddress address, int i10) {
        kotlin.jvm.internal.n.e(socket, "socket");
        kotlin.jvm.internal.n.e(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // zl.j
    public String g(SSLSocket sslSocket) {
        Object obj;
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        Iterator<T> it = this.f32959d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((m) obj).b(sslSocket)) {
                break;
            }
        }
        m mVar = (m) obj;
        if (mVar == null) {
            return null;
        }
        return mVar.c(sslSocket);
    }

    @Override // zl.j
    public Object h(String closer) {
        kotlin.jvm.internal.n.e(closer, "closer");
        return this.f32960e.a(closer);
    }

    @Override // zl.j
    public boolean i(String hostname) {
        kotlin.jvm.internal.n.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // zl.j
    public void l(String message, Object obj) {
        kotlin.jvm.internal.n.e(message, "message");
        if (this.f32960e.b(obj)) {
            return;
        }
        j.k(this, message, 5, null, 4, null);
    }
}
