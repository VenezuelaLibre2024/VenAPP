package sl;

import dk.z;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import ql.a0;
import ql.b;
import ql.c0;
import ql.e0;
import ql.h;
import ql.o;
import ql.q;
import ql.u;
import xk.p;

/* loaded from: classes3.dex */
public final class a implements b {

    /* renamed from: d, reason: collision with root package name */
    private final q f25687d;

    /* renamed from: sl.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public /* synthetic */ class C0432a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25688a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            f25688a = iArr;
        }
    }

    public a(q defaultDns) {
        n.e(defaultDns, "defaultDns");
        this.f25687d = defaultDns;
    }

    public /* synthetic */ a(q qVar, int i10, g gVar) {
        this((i10 & 1) != 0 ? q.f24347b : qVar);
    }

    private final InetAddress b(Proxy proxy, u uVar, q qVar) {
        Object G;
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0432a.f25688a[type.ordinal()]) == 1) {
            G = z.G(qVar.a(uVar.h()));
            return (InetAddress) G;
        }
        SocketAddress address = proxy.address();
        if (address == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        n.d(address2, "address() as InetSocketAddress).address");
        return address2;
    }

    @Override // ql.b
    public a0 a(e0 e0Var, c0 response) {
        boolean r10;
        ql.a a10;
        PasswordAuthentication requestPasswordAuthentication;
        n.e(response, "response");
        List<h> f10 = response.f();
        a0 O = response.O();
        u i10 = O.i();
        boolean z10 = response.g() == 407;
        Proxy proxy = e0Var == null ? null : e0Var.b();
        if (proxy == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h hVar : f10) {
            r10 = p.r("Basic", hVar.c(), true);
            if (r10) {
                q c10 = (e0Var == null || (a10 = e0Var.a()) == null) ? null : a10.c();
                if (c10 == null) {
                    c10 = this.f25687d;
                }
                if (z10) {
                    SocketAddress address = proxy.address();
                    if (address == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    n.d(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxy, i10, c10), inetSocketAddress.getPort(), i10.q(), hVar.b(), hVar.c(), i10.s(), Authenticator.RequestorType.PROXY);
                } else {
                    String h10 = i10.h();
                    n.d(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(h10, b(proxy, i10, c10), i10.m(), i10.q(), hVar.b(), hVar.c(), i10.s(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = requestPasswordAuthentication.getUserName();
                    n.d(userName, "auth.userName");
                    char[] password = requestPasswordAuthentication.getPassword();
                    n.d(password, "auth.password");
                    return O.h().d(str, o.a(userName, new String(password), hVar.a())).b();
                }
            }
        }
        return null;
    }
}
