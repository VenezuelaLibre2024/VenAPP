package am;

import java.util.List;
import javax.net.ssl.SSLSocket;
import ql.z;

/* loaded from: classes3.dex */
public final class l implements m {

    /* renamed from: a, reason: collision with root package name */
    private final a f518a;

    /* renamed from: b, reason: collision with root package name */
    private m f519b;

    /* loaded from: classes3.dex */
    public interface a {
        boolean b(SSLSocket sSLSocket);

        m c(SSLSocket sSLSocket);
    }

    public l(a socketAdapterFactory) {
        kotlin.jvm.internal.n.e(socketAdapterFactory, "socketAdapterFactory");
        this.f518a = socketAdapterFactory;
    }

    private final synchronized m e(SSLSocket sSLSocket) {
        if (this.f519b == null && this.f518a.b(sSLSocket)) {
            this.f519b = this.f518a.c(sSLSocket);
        }
        return this.f519b;
    }

    @Override // am.m
    public boolean a() {
        return true;
    }

    @Override // am.m
    public boolean b(SSLSocket sslSocket) {
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        return this.f518a.b(sslSocket);
    }

    @Override // am.m
    public String c(SSLSocket sslSocket) {
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        m e10 = e(sslSocket);
        if (e10 == null) {
            return null;
        }
        return e10.c(sslSocket);
    }

    @Override // am.m
    public void d(SSLSocket sslSocket, String str, List<? extends z> protocols) {
        kotlin.jvm.internal.n.e(sslSocket, "sslSocket");
        kotlin.jvm.internal.n.e(protocols, "protocols");
        m e10 = e(sslSocket);
        if (e10 == null) {
            return;
        }
        e10.d(sslSocket, str, protocols);
    }
}
