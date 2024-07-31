package p428wl;

import kotlin.jvm.internal.C9322n;

/* renamed from: wl.f */
/* loaded from: classes3.dex */
public final class C12243f {

    /* renamed from: a */
    public static final C12243f f32717a = new C12243f();

    private C12243f() {
    }

    /* renamed from: a */
    public static final boolean m39411a(String method) {
        C9322n.m27781e(method, "method");
        return (C9322n.m27777a(method, "GET") || C9322n.m27777a(method, "HEAD")) ? false : true;
    }

    /* renamed from: d */
    public static final boolean m39412d(String method) {
        C9322n.m27781e(method, "method");
        return C9322n.m27777a(method, "POST") || C9322n.m27777a(method, "PUT") || C9322n.m27777a(method, "PATCH") || C9322n.m27777a(method, "PROPPATCH") || C9322n.m27777a(method, "REPORT");
    }

    /* renamed from: b */
    public final boolean m39413b(String method) {
        C9322n.m27781e(method, "method");
        return !C9322n.m27777a(method, "PROPFIND");
    }

    /* renamed from: c */
    public final boolean m39414c(String method) {
        C9322n.m27781e(method, "method");
        return C9322n.m27777a(method, "PROPFIND");
    }
}
