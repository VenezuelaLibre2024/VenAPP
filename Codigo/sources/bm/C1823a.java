package bm;

import dk.C7029q;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* renamed from: bm.a */
/* loaded from: classes3.dex */
public final class C1823a extends ProxySelector {

    /* renamed from: a */
    public static final C1823a f7722a = new C1823a();

    private C1823a() {
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        List<Proxy> m20572e;
        if (uri == null) {
            throw new IllegalArgumentException("uri must not be null".toString());
        }
        m20572e = C7029q.m20572e(Proxy.NO_PROXY);
        return m20572e;
    }
}
