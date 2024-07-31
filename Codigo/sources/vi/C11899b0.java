package vi;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import p082eb.C7153i;
import p082eb.C7155k;
import p082eb.C7159o;

/* renamed from: vi.b0 */
/* loaded from: classes3.dex */
public final class C11899b0 extends AbstractC11903c1 {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    private final SocketAddress f31473a;

    /* renamed from: b */
    private final InetSocketAddress f31474b;

    /* renamed from: c */
    private final String f31475c;

    /* renamed from: d */
    private final String f31476d;

    /* renamed from: vi.b0$b */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private SocketAddress f31477a;

        /* renamed from: b */
        private InetSocketAddress f31478b;

        /* renamed from: c */
        private String f31479c;

        /* renamed from: d */
        private String f31480d;

        private b() {
        }

        /* renamed from: a */
        public C11899b0 m38072a() {
            return new C11899b0(this.f31477a, this.f31478b, this.f31479c, this.f31480d);
        }

        /* renamed from: b */
        public b m38073b(String str) {
            this.f31480d = str;
            return this;
        }

        /* renamed from: c */
        public b m38074c(SocketAddress socketAddress) {
            this.f31477a = (SocketAddress) C7159o.m21313p(socketAddress, "proxyAddress");
            return this;
        }

        /* renamed from: d */
        public b m38075d(InetSocketAddress inetSocketAddress) {
            this.f31478b = (InetSocketAddress) C7159o.m21313p(inetSocketAddress, "targetAddress");
            return this;
        }

        /* renamed from: e */
        public b m38076e(String str) {
            this.f31479c = str;
            return this;
        }
    }

    private C11899b0(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        C7159o.m21313p(socketAddress, "proxyAddress");
        C7159o.m21313p(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            C7159o.m21322y(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f31473a = socketAddress;
        this.f31474b = inetSocketAddress;
        this.f31475c = str;
        this.f31476d = str2;
    }

    /* renamed from: e */
    public static b m38067e() {
        return new b();
    }

    /* renamed from: a */
    public String m38068a() {
        return this.f31476d;
    }

    /* renamed from: b */
    public SocketAddress m38069b() {
        return this.f31473a;
    }

    /* renamed from: c */
    public InetSocketAddress m38070c() {
        return this.f31474b;
    }

    /* renamed from: d */
    public String m38071d() {
        return this.f31475c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C11899b0)) {
            return false;
        }
        C11899b0 c11899b0 = (C11899b0) obj;
        return C7155k.m21289a(this.f31473a, c11899b0.f31473a) && C7155k.m21289a(this.f31474b, c11899b0.f31474b) && C7155k.m21289a(this.f31475c, c11899b0.f31475c) && C7155k.m21289a(this.f31476d, c11899b0.f31476d);
    }

    public int hashCode() {
        return C7155k.m21290b(this.f31473a, this.f31474b, this.f31475c, this.f31476d);
    }

    public String toString() {
        return C7153i.m21274c(this).m21284d("proxyAddr", this.f31473a).m21284d("targetAddr", this.f31474b).m21284d(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, this.f31475c).m21285e("hasPassword", this.f31476d != null).toString();
    }
}
