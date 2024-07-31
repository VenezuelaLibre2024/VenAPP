package io.grpc.internal;

import java.net.URI;
import vi.y0;

/* loaded from: classes3.dex */
public final class d0 extends vi.z0 {
    @Override // vi.y0.d
    public String a() {
        return "dns";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vi.z0
    public boolean d() {
        return true;
    }

    @Override // vi.z0
    public int e() {
        return 5;
    }

    @Override // vi.y0.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public c0 b(URI uri, y0.b bVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) eb.o.p(uri.getPath(), "targetPath");
        eb.o.l(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new c0(uri.getAuthority(), str.substring(1), bVar, q0.f19101u, eb.t.c(), vi.l0.a(d0.class.getClassLoader()));
    }
}
