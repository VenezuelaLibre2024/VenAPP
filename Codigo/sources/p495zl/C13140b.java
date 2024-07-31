package p495zl;

import am.C0140d;
import am.C0144h;
import am.C0145i;
import am.C0146j;
import am.C0147k;
import am.C0148l;
import am.C0150n;
import am.InterfaceC0149m;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import cm.AbstractC2057c;
import cm.InterfaceC2059e;
import dk.C7031r;
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
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.EnumC10551z;

/* renamed from: zl.b */
/* loaded from: classes3.dex */
public final class C13140b extends C13148j {

    /* renamed from: f */
    public static final a f35508f = new a(null);

    /* renamed from: g */
    private static final boolean f35509g;

    /* renamed from: d */
    private final List<InterfaceC0149m> f35510d;

    /* renamed from: e */
    private final C0146j f35511e;

    /* renamed from: zl.b$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C13148j m43349a() {
            if (m43350b()) {
                return new C13140b();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m43350b() {
            return C13140b.f35509g;
        }
    }

    /* renamed from: zl.b$b */
    /* loaded from: classes3.dex */
    public static final class b implements InterfaceC2059e {

        /* renamed from: a */
        private final X509TrustManager f35512a;

        /* renamed from: b */
        private final Method f35513b;

        public b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            C9322n.m27781e(trustManager, "trustManager");
            C9322n.m27781e(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f35512a = trustManager;
            this.f35513b = findByIssuerAndSignatureMethod;
        }

        @Override // cm.InterfaceC2059e
        /* renamed from: a */
        public X509Certificate mo10391a(X509Certificate cert) {
            C9322n.m27781e(cert, "cert");
            try {
                Object invoke = this.f35513b.invoke(this.f35512a, cert);
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
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C9322n.m27777a(this.f35512a, bVar.f35512a) && C9322n.m27777a(this.f35513b, bVar.f35513b);
        }

        public int hashCode() {
            return (this.f35512a.hashCode() * 31) + this.f35513b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f35512a + ", findByIssuerAndSignatureMethod=" + this.f35513b + ')';
        }
    }

    static {
        boolean z10 = false;
        if (C13148j.f35535a.m43386h() && Build.VERSION.SDK_INT < 30) {
            z10 = true;
        }
        f35509g = z10;
    }

    public C13140b() {
        List m20585m;
        m20585m = C7031r.m20585m(C0150n.a.m662b(C0150n.f585j, null, 1, null), new C0148l(C0144h.f567f.m651d()), new C0148l(C0147k.f581a.m660a()), new C0148l(C0145i.f575a.m655a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m20585m) {
            if (((InterfaceC0149m) obj).mo633a()) {
                arrayList.add(obj);
            }
        }
        this.f35510d = arrayList;
        this.f35511e = C0146j.f577d.m658a();
    }

    @Override // p495zl.C13148j
    /* renamed from: c */
    public AbstractC2057c mo43338c(X509TrustManager trustManager) {
        C9322n.m27781e(trustManager, "trustManager");
        C0140d m640a = C0140d.f560d.m640a(trustManager);
        return m640a == null ? super.mo43338c(trustManager) : m640a;
    }

    @Override // p495zl.C13148j
    /* renamed from: d */
    public InterfaceC2059e mo43345d(X509TrustManager trustManager) {
        C9322n.m27781e(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            C9322n.m27780d(method, "method");
            return new b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.mo43345d(trustManager);
        }
    }

    @Override // p495zl.C13148j
    /* renamed from: e */
    public void mo43339e(SSLSocket sslSocket, String str, List<EnumC10551z> protocols) {
        Object obj;
        C9322n.m27781e(sslSocket, "sslSocket");
        C9322n.m27781e(protocols, "protocols");
        Iterator<T> it = this.f35510d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((InterfaceC0149m) obj).mo634b(sslSocket)) {
                    break;
                }
            }
        }
        InterfaceC0149m interfaceC0149m = (InterfaceC0149m) obj;
        if (interfaceC0149m == null) {
            return;
        }
        interfaceC0149m.mo636d(sslSocket, str, protocols);
    }

    @Override // p495zl.C13148j
    /* renamed from: f */
    public void mo43346f(Socket socket, InetSocketAddress address, int i10) {
        C9322n.m27781e(socket, "socket");
        C9322n.m27781e(address, "address");
        try {
            socket.connect(address, i10);
        } catch (ClassCastException e10) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e10;
            }
            throw new IOException("Exception in connect", e10);
        }
    }

    @Override // p495zl.C13148j
    /* renamed from: g */
    public String mo43340g(SSLSocket sslSocket) {
        Object obj;
        C9322n.m27781e(sslSocket, "sslSocket");
        Iterator<T> it = this.f35510d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InterfaceC0149m) obj).mo634b(sslSocket)) {
                break;
            }
        }
        InterfaceC0149m interfaceC0149m = (InterfaceC0149m) obj;
        if (interfaceC0149m == null) {
            return null;
        }
        return interfaceC0149m.mo635c(sslSocket);
    }

    @Override // p495zl.C13148j
    /* renamed from: h */
    public Object mo43347h(String closer) {
        C9322n.m27781e(closer, "closer");
        return this.f35511e.m656a(closer);
    }

    @Override // p495zl.C13148j
    /* renamed from: i */
    public boolean mo43341i(String hostname) {
        C9322n.m27781e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // p495zl.C13148j
    /* renamed from: l */
    public void mo43348l(String message, Object obj) {
        C9322n.m27781e(message, "message");
        if (this.f35511e.m657b(obj)) {
            return;
        }
        C13148j.m43374k(this, message, 5, null, 4, null);
    }
}
