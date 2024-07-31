package sl;

import dk.C7042z;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.jvm.internal.C9315g;
import kotlin.jvm.internal.C9322n;
import p319ql.C10520a;
import p319ql.C10521a0;
import p319ql.C10525c0;
import p319ql.C10529e0;
import p319ql.C10533h;
import p319ql.C10540o;
import p319ql.C10546u;
import p319ql.InterfaceC10522b;
import p319ql.InterfaceC10542q;
import p450xk.C12524p;

/* renamed from: sl.a */
/* loaded from: classes3.dex */
public final class C10935a implements InterfaceC10522b {

    /* renamed from: d */
    private final InterfaceC10542q f27831d;

    /* renamed from: sl.a$a */
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27832a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            f27832a = iArr;
        }
    }

    public C10935a(InterfaceC10542q defaultDns) {
        C9322n.m27781e(defaultDns, "defaultDns");
        this.f27831d = defaultDns;
    }

    public /* synthetic */ C10935a(InterfaceC10542q interfaceC10542q, int i10, C9315g c9315g) {
        this((i10 & 1) != 0 ? InterfaceC10542q.f26441b : interfaceC10542q);
    }

    /* renamed from: b */
    private final InetAddress m33408b(Proxy proxy, C10546u c10546u, InterfaceC10542q interfaceC10542q) {
        Object m20605G;
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : a.f27832a[type.ordinal()]) == 1) {
            m20605G = C7042z.m20605G(interfaceC10542q.mo31806a(c10546u.m31874h()));
            return (InetAddress) m20605G;
        }
        SocketAddress address = proxy.address();
        if (address == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address2 = ((InetSocketAddress) address).getAddress();
        C9322n.m27780d(address2, "address() as InetSocketAddress).address");
        return address2;
    }

    @Override // p319ql.InterfaceC10522b
    /* renamed from: a */
    public C10521a0 mo31625a(C10529e0 c10529e0, C10525c0 response) {
        boolean m41037r;
        C10520a m31716a;
        PasswordAuthentication requestPasswordAuthentication;
        C9322n.m27781e(response, "response");
        List<C10533h> m31644f = response.m31644f();
        C10521a0 m31639O = response.m31639O();
        C10546u m31608i = m31639O.m31608i();
        boolean z10 = response.m31645g() == 407;
        Proxy proxy = c10529e0 == null ? null : c10529e0.m31717b();
        if (proxy == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (C10533h c10533h : m31644f) {
            m41037r = C12524p.m41037r("Basic", c10533h.m31738c(), true);
            if (m41037r) {
                InterfaceC10542q m31590c = (c10529e0 == null || (m31716a = c10529e0.m31716a()) == null) ? null : m31716a.m31590c();
                if (m31590c == null) {
                    m31590c = this.f27831d;
                }
                if (z10) {
                    SocketAddress address = proxy.address();
                    if (address == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                    String hostName = inetSocketAddress.getHostName();
                    C9322n.m27780d(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, m33408b(proxy, m31608i, m31590c), inetSocketAddress.getPort(), m31608i.m31882q(), c10533h.m31737b(), c10533h.m31738c(), m31608i.m31884s(), Authenticator.RequestorType.PROXY);
                } else {
                    String m31874h = m31608i.m31874h();
                    C9322n.m27780d(proxy, "proxy");
                    requestPasswordAuthentication = Authenticator.requestPasswordAuthentication(m31874h, m33408b(proxy, m31608i, m31590c), m31608i.m31878m(), m31608i.m31882q(), c10533h.m31737b(), c10533h.m31738c(), m31608i.m31884s(), Authenticator.RequestorType.SERVER);
                }
                if (requestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = requestPasswordAuthentication.getUserName();
                    C9322n.m27780d(userName, "auth.userName");
                    char[] password = requestPasswordAuthentication.getPassword();
                    C9322n.m27780d(password, "auth.password");
                    return m31639O.m31607h().m31612d(str, C10540o.m31792a(userName, new String(password), c10533h.m31736a())).m31610b();
                }
            }
        }
        return null;
    }
}
