package p495zl;

import am.C0139c;
import am.C0140d;
import am.C0144h;
import am.C0145i;
import am.C0147k;
import am.C0148l;
import am.InterfaceC0149m;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import cm.AbstractC2057c;
import dk.C7031r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.EnumC10551z;

/* renamed from: zl.a */
/* loaded from: classes3.dex */
public final class C13139a extends C13148j {

    /* renamed from: e */
    public static final a f35505e = new a(null);

    /* renamed from: f */
    private static final boolean f35506f;

    /* renamed from: d */
    private final List<InterfaceC0149m> f35507d;

    /* renamed from: zl.a$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C9315g c9315g) {
            this();
        }

        /* renamed from: a */
        public final C13148j m43342a() {
            if (m43343b()) {
                return new C13139a();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean m43343b() {
            return C13139a.f35506f;
        }
    }

    static {
        f35506f = C13148j.f35535a.m43386h() && Build.VERSION.SDK_INT >= 29;
    }

    public C13139a() {
        List m20585m;
        m20585m = C7031r.m20585m(C0139c.f559a.m637a(), new C0148l(C0144h.f567f.m651d()), new C0148l(C0147k.f581a.m660a()), new C0148l(C0145i.f575a.m655a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m20585m) {
            if (((InterfaceC0149m) obj).mo633a()) {
                arrayList.add(obj);
            }
        }
        this.f35507d = arrayList;
    }

    @Override // p495zl.C13148j
    /* renamed from: c */
    public AbstractC2057c mo43338c(X509TrustManager trustManager) {
        C9322n.m27781e(trustManager, "trustManager");
        C0140d m640a = C0140d.f560d.m640a(trustManager);
        return m640a == null ? super.mo43338c(trustManager) : m640a;
    }

    @Override // p495zl.C13148j
    /* renamed from: e */
    public void mo43339e(SSLSocket sslSocket, String str, List<? extends EnumC10551z> protocols) {
        Object obj;
        C9322n.m27781e(sslSocket, "sslSocket");
        C9322n.m27781e(protocols, "protocols");
        Iterator<T> it = this.f35507d.iterator();
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
    /* renamed from: g */
    public String mo43340g(SSLSocket sslSocket) {
        Object obj;
        C9322n.m27781e(sslSocket, "sslSocket");
        Iterator<T> it = this.f35507d.iterator();
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
    /* renamed from: i */
    public boolean mo43341i(String hostname) {
        C9322n.m27781e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
