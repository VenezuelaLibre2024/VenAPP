package vi;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* loaded from: classes3.dex */
public final class b0 extends c1 {
    private static final long serialVersionUID = 0;

    /* renamed from: a, reason: collision with root package name */
    private final SocketAddress f29039a;

    /* renamed from: b, reason: collision with root package name */
    private final InetSocketAddress f29040b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29041c;

    /* renamed from: d, reason: collision with root package name */
    private final String f29042d;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private SocketAddress f29043a;

        /* renamed from: b, reason: collision with root package name */
        private InetSocketAddress f29044b;

        /* renamed from: c, reason: collision with root package name */
        private String f29045c;

        /* renamed from: d, reason: collision with root package name */
        private String f29046d;

        private b() {
        }

        public b0 a() {
            return new b0(this.f29043a, this.f29044b, this.f29045c, this.f29046d);
        }

        public b b(String str) {
            this.f29046d = str;
            return this;
        }

        public b c(SocketAddress socketAddress) {
            this.f29043a = (SocketAddress) eb.o.p(socketAddress, "proxyAddress");
            return this;
        }

        public b d(InetSocketAddress inetSocketAddress) {
            this.f29044b = (InetSocketAddress) eb.o.p(inetSocketAddress, "targetAddress");
            return this;
        }

        public b e(String str) {
            this.f29045c = str;
            return this;
        }
    }

    private b0(SocketAddress socketAddress, InetSocketAddress inetSocketAddress, String str, String str2) {
        eb.o.p(socketAddress, "proxyAddress");
        eb.o.p(inetSocketAddress, "targetAddress");
        if (socketAddress instanceof InetSocketAddress) {
            eb.o.y(!((InetSocketAddress) socketAddress).isUnresolved(), "The proxy address %s is not resolved", socketAddress);
        }
        this.f29039a = socketAddress;
        this.f29040b = inetSocketAddress;
        this.f29041c = str;
        this.f29042d = str2;
    }

    public static b e() {
        return new b();
    }

    public String a() {
        return this.f29042d;
    }

    public SocketAddress b() {
        return this.f29039a;
    }

    public InetSocketAddress c() {
        return this.f29040b;
    }

    public String d() {
        return this.f29041c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return eb.k.a(this.f29039a, b0Var.f29039a) && eb.k.a(this.f29040b, b0Var.f29040b) && eb.k.a(this.f29041c, b0Var.f29041c) && eb.k.a(this.f29042d, b0Var.f29042d);
    }

    public int hashCode() {
        return eb.k.b(this.f29039a, this.f29040b, this.f29041c, this.f29042d);
    }

    public String toString() {
        return eb.i.c(this).d("proxyAddr", this.f29039a).d("targetAddr", this.f29040b).d(URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME, this.f29041c).e("hasPassword", this.f29042d != null).toString();
    }
}
