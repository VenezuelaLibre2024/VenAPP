package wl;

import java.net.Proxy;
import kotlin.jvm.internal.n;
import ql.a0;
import ql.u;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f30218a = new i();

    private i() {
    }

    private final boolean b(a0 a0Var, Proxy.Type type) {
        return !a0Var.f() && type == Proxy.Type.HTTP;
    }

    public final String a(a0 request, Proxy.Type proxyType) {
        n.e(request, "request");
        n.e(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.g());
        sb2.append(' ');
        i iVar = f30218a;
        boolean b10 = iVar.b(request, proxyType);
        u i10 = request.i();
        if (b10) {
            sb2.append(i10);
        } else {
            sb2.append(iVar.c(i10));
        }
        sb2.append(" HTTP/1.1");
        String sb3 = sb2.toString();
        n.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public final String c(u url) {
        n.e(url, "url");
        String d10 = url.d();
        String f10 = url.f();
        if (f10 == null) {
            return d10;
        }
        return d10 + '?' + ((Object) f10);
    }
}
