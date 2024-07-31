package ql;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final a f24218a;

    /* renamed from: b, reason: collision with root package name */
    private final Proxy f24219b;

    /* renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f24220c;

    public e0(a address, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.n.e(address, "address");
        kotlin.jvm.internal.n.e(proxy, "proxy");
        kotlin.jvm.internal.n.e(socketAddress, "socketAddress");
        this.f24218a = address;
        this.f24219b = proxy;
        this.f24220c = socketAddress;
    }

    public final a a() {
        return this.f24218a;
    }

    public final Proxy b() {
        return this.f24219b;
    }

    public final boolean c() {
        return this.f24218a.k() != null && this.f24219b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f24220c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e0) {
            e0 e0Var = (e0) obj;
            if (kotlin.jvm.internal.n.a(e0Var.f24218a, this.f24218a) && kotlin.jvm.internal.n.a(e0Var.f24219b, this.f24219b) && kotlin.jvm.internal.n.a(e0Var.f24220c, this.f24220c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.f24218a.hashCode()) * 31) + this.f24219b.hashCode()) * 31) + this.f24220c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f24220c + '}';
    }
}
