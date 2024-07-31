package wl;

import kotlin.jvm.internal.n;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f30205a = new f();

    private f() {
    }

    public static final boolean a(String method) {
        n.e(method, "method");
        return (n.a(method, "GET") || n.a(method, "HEAD")) ? false : true;
    }

    public static final boolean d(String method) {
        n.e(method, "method");
        return n.a(method, "POST") || n.a(method, "PUT") || n.a(method, "PATCH") || n.a(method, "PROPPATCH") || n.a(method, "REPORT");
    }

    public final boolean b(String method) {
        n.e(method, "method");
        return !n.a(method, "PROPFIND");
    }

    public final boolean c(String method) {
        n.e(method, "method");
        return n.a(method, "PROPFIND");
    }
}
