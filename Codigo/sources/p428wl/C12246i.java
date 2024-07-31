package p428wl;

import java.net.Proxy;
import kotlin.jvm.internal.C9322n;
import p319ql.C10521a0;
import p319ql.C10546u;

/* renamed from: wl.i */
/* loaded from: classes3.dex */
public final class C12246i {

    /* renamed from: a */
    public static final C12246i f32730a = new C12246i();

    private C12246i() {
    }

    /* renamed from: b */
    private final boolean m39424b(C10521a0 c10521a0, Proxy.Type type) {
        return !c10521a0.m31605f() && type == Proxy.Type.HTTP;
    }

    /* renamed from: a */
    public final String m39425a(C10521a0 request, Proxy.Type proxyType) {
        C9322n.m27781e(request, "request");
        C9322n.m27781e(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.m31606g());
        sb2.append(' ');
        C12246i c12246i = f32730a;
        boolean m39424b = c12246i.m39424b(request, proxyType);
        C10546u m31608i = request.m31608i();
        if (m39424b) {
            sb2.append(m31608i);
        } else {
            sb2.append(c12246i.m39426c(m31608i));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        C9322n.m27780d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: c */
    public final String m39426c(C10546u url) {
        C9322n.m27781e(url, "url");
        String m31870d = url.m31870d();
        String m31872f = url.m31872f();
        if (m31872f == null) {
            return m31870d;
        }
        return m31870d + '?' + ((Object) m31872f);
    }
}
