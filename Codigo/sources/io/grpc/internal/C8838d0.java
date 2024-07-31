package io.grpc.internal;

import java.net.URI;
import p082eb.C7159o;
import p082eb.C7164t;
import vi.AbstractC11957y0;
import vi.AbstractC11959z0;
import vi.C11929l0;

/* renamed from: io.grpc.internal.d0 */
/* loaded from: classes3.dex */
public final class C8838d0 extends AbstractC11959z0 {
    @Override // vi.AbstractC11957y0.d
    /* renamed from: a */
    public String mo25385a() {
        return "dns";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // vi.AbstractC11959z0
    /* renamed from: d */
    public boolean mo25387d() {
        return true;
    }

    @Override // vi.AbstractC11959z0
    /* renamed from: e */
    public int mo25388e() {
        return 5;
    }

    @Override // vi.AbstractC11957y0.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public C8834c0 mo25386b(URI uri, AbstractC11957y0.b bVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) C7159o.m21313p(uri.getPath(), "targetPath");
        C7159o.m21309l(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new C8834c0(uri.getAuthority(), str.substring(1), bVar, C8890q0.f20848u, C7164t.m21343c(), C11929l0.m38202a(C8838d0.class.getClassLoader()));
    }
}
