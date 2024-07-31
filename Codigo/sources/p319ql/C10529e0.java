package p319ql;

import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.C9322n;

/* renamed from: ql.e0 */
/* loaded from: classes3.dex */
public final class C10529e0 {

    /* renamed from: a */
    private final C10520a f26260a;

    /* renamed from: b */
    private final Proxy f26261b;

    /* renamed from: c */
    private final InetSocketAddress f26262c;

    public C10529e0(C10520a address, Proxy proxy, InetSocketAddress socketAddress) {
        C9322n.m27781e(address, "address");
        C9322n.m27781e(proxy, "proxy");
        C9322n.m27781e(socketAddress, "socketAddress");
        this.f26260a = address;
        this.f26261b = proxy;
        this.f26262c = socketAddress;
    }

    /* renamed from: a */
    public final C10520a m31716a() {
        return this.f26260a;
    }

    /* renamed from: b */
    public final Proxy m31717b() {
        return this.f26261b;
    }

    /* renamed from: c */
    public final boolean m31718c() {
        return this.f26260a.m31598k() != null && this.f26261b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public final InetSocketAddress m31719d() {
        return this.f26262c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10529e0) {
            C10529e0 c10529e0 = (C10529e0) obj;
            if (C9322n.m27777a(c10529e0.f26260a, this.f26260a) && C9322n.m27777a(c10529e0.f26261b, this.f26261b) && C9322n.m27777a(c10529e0.f26262c, this.f26262c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f26260a.hashCode()) * 31) + this.f26261b.hashCode()) * 31) + this.f26262c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f26262c + '}';
    }
}
