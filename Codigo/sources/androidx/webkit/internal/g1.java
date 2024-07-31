package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.webkit.internal.a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;

/* loaded from: classes.dex */
public class g1 extends e2.o {

    /* renamed from: a, reason: collision with root package name */
    private WebResourceError f5569a;

    /* renamed from: b, reason: collision with root package name */
    private WebResourceErrorBoundaryInterface f5570b;

    public g1(WebResourceError webResourceError) {
        this.f5569a = webResourceError;
    }

    public g1(InvocationHandler invocationHandler) {
        this.f5570b = (WebResourceErrorBoundaryInterface) hm.a.a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    private WebResourceErrorBoundaryInterface c() {
        if (this.f5570b == null) {
            this.f5570b = (WebResourceErrorBoundaryInterface) hm.a.a(WebResourceErrorBoundaryInterface.class, k1.c().j(this.f5569a));
        }
        return this.f5570b;
    }

    private WebResourceError d() {
        if (this.f5569a == null) {
            this.f5569a = k1.c().i(Proxy.getInvocationHandler(this.f5570b));
        }
        return this.f5569a;
    }

    @Override // e2.o
    public CharSequence a() {
        a.b bVar = j1.f5596v;
        if (bVar.c()) {
            return c.e(d());
        }
        if (bVar.d()) {
            return c().getDescription();
        }
        throw j1.a();
    }

    @Override // e2.o
    public int b() {
        a.b bVar = j1.f5597w;
        if (bVar.c()) {
            return c.f(d());
        }
        if (bVar.d()) {
            return c().getErrorCode();
        }
        throw j1.a();
    }
}
