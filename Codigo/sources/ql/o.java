package ql;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f24338a = new o();

    private o() {
    }

    public static final String a(String username, String password, Charset charset) {
        kotlin.jvm.internal.n.e(username, "username");
        kotlin.jvm.internal.n.e(password, "password");
        kotlin.jvm.internal.n.e(charset, "charset");
        return kotlin.jvm.internal.n.k("Basic ", dm.e.f14291d.b(username + ':' + password, charset).b());
    }
}
