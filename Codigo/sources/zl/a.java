package zl;

import am.k;
import am.l;
import am.m;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import dk.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.n;
import ql.z;

/* loaded from: classes3.dex */
public final class a extends j {

    /* renamed from: e, reason: collision with root package name */
    public static final C0547a f32954e = new C0547a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f32955f;

    /* renamed from: d, reason: collision with root package name */
    private final List<m> f32956d;

    /* renamed from: zl.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0547a {
        private C0547a() {
        }

        public /* synthetic */ C0547a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final j a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f32955f;
        }
    }

    static {
        f32955f = j.f32984a.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List m10;
        m10 = r.m(am.c.f494a.a(), new l(am.h.f502f.d()), new l(k.f516a.a()), new l(am.i.f510a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : m10) {
            if (((m) obj).a()) {
                arrayList.add(obj);
            }
        }
        this.f32956d = arrayList;
    }

    @Override // zl.j
    public cm.c c(X509TrustManager trustManager) {
        n.e(trustManager, "trustManager");
        am.d a10 = am.d.f495d.a(trustManager);
        return a10 == null ? super.c(trustManager) : a10;
    }

    @Override // zl.j
    public void e(SSLSocket sslSocket, String str, List<? extends z> protocols) {
        Object obj;
        n.e(sslSocket, "sslSocket");
        n.e(protocols, "protocols");
        Iterator<T> it = this.f32956d.iterator();
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
    public String g(SSLSocket sslSocket) {
        Object obj;
        n.e(sslSocket, "sslSocket");
        Iterator<T> it = this.f32956d.iterator();
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
    public boolean i(String hostname) {
        n.e(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
