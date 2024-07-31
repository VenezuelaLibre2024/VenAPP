package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.webkit.internal.a;
import e2.n;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;

/* loaded from: classes.dex */
public class f1 extends e2.n {

    /* renamed from: a */
    private WebMessagePort f5567a;

    /* renamed from: b */
    private WebMessagePortBoundaryInterface f5568b;

    public f1(WebMessagePort webMessagePort) {
        this.f5567a = webMessagePort;
    }

    public f1(InvocationHandler invocationHandler) {
        this.f5568b = (WebMessagePortBoundaryInterface) hm.a.a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    public static WebMessage f(e2.m mVar) {
        return c.b(mVar);
    }

    public static WebMessagePort[] g(e2.n[] nVarArr) {
        if (nVarArr == null) {
            return null;
        }
        int length = nVarArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i10 = 0; i10 < length; i10++) {
            webMessagePortArr[i10] = nVarArr[i10].b();
        }
        return webMessagePortArr;
    }

    public static e2.m h(WebMessage webMessage) {
        return c.d(webMessage);
    }

    private WebMessagePortBoundaryInterface i() {
        if (this.f5568b == null) {
            this.f5568b = (WebMessagePortBoundaryInterface) hm.a.a(WebMessagePortBoundaryInterface.class, k1.c().h(this.f5567a));
        }
        return this.f5568b;
    }

    private WebMessagePort j() {
        if (this.f5567a == null) {
            this.f5567a = k1.c().g(Proxy.getInvocationHandler(this.f5568b));
        }
        return this.f5567a;
    }

    public static e2.n[] k(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        e2.n[] nVarArr = new e2.n[webMessagePortArr.length];
        for (int i10 = 0; i10 < webMessagePortArr.length; i10++) {
            nVarArr[i10] = new f1(webMessagePortArr[i10]);
        }
        return nVarArr;
    }

    @Override // e2.n
    public void a() {
        a.b bVar = j1.B;
        if (bVar.c()) {
            c.a(j());
        } else {
            if (!bVar.d()) {
                throw j1.a();
            }
            i().close();
        }
    }

    @Override // e2.n
    public WebMessagePort b() {
        return j();
    }

    @Override // e2.n
    public InvocationHandler c() {
        return Proxy.getInvocationHandler(i());
    }

    @Override // e2.n
    public void d(e2.m mVar) {
        a.b bVar = j1.A;
        if (bVar.c() && mVar.e() == 0) {
            c.h(j(), f(mVar));
        } else {
            if (!bVar.d() || !b1.a(mVar.e())) {
                throw j1.a();
            }
            i().postMessage(hm.a.c(new b1(mVar)));
        }
    }

    @Override // e2.n
    public void e(n.a aVar) {
        a.b bVar = j1.D;
        if (bVar.d()) {
            i().setWebMessageCallback(hm.a.c(new c1(aVar)));
        } else {
            if (!bVar.c()) {
                throw j1.a();
            }
            c.l(j(), aVar);
        }
    }
}
