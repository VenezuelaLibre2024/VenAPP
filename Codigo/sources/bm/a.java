package bm;

import dk.q;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;

/* loaded from: classes3.dex */
public final class a extends ProxySelector {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6773a = new a();

    private a() {
    }

    @Override // java.net.ProxySelector
    public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public List<Proxy> select(URI uri) {
        List<Proxy> e10;
        if (uri == null) {
            throw new IllegalArgumentException("uri must not be null".toString());
        }
        e10 = q.e(Proxy.NO_PROXY);
        return e10;
    }
}
