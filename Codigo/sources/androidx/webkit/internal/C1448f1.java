package androidx.webkit.internal;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import androidx.webkit.internal.AbstractC1431a;
import hm.C7757a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebMessagePortBoundaryInterface;
import p073e2.AbstractC7110n;
import p073e2.C7109m;

/* renamed from: androidx.webkit.internal.f1 */
/* loaded from: classes.dex */
public class C1448f1 extends AbstractC7110n {

    /* renamed from: a */
    private WebMessagePort f6392a;

    /* renamed from: b */
    private WebMessagePortBoundaryInterface f6393b;

    public C1448f1(WebMessagePort webMessagePort) {
        this.f6392a = webMessagePort;
    }

    public C1448f1(InvocationHandler invocationHandler) {
        this.f6393b = (WebMessagePortBoundaryInterface) C7757a.m23674a(WebMessagePortBoundaryInterface.class, invocationHandler);
    }

    /* renamed from: f */
    public static WebMessage m8316f(C7109m c7109m) {
        return C1437c.m8274b(c7109m);
    }

    /* renamed from: g */
    public static WebMessagePort[] m8317g(AbstractC7110n[] abstractC7110nArr) {
        if (abstractC7110nArr == null) {
            return null;
        }
        int length = abstractC7110nArr.length;
        WebMessagePort[] webMessagePortArr = new WebMessagePort[length];
        for (int i10 = 0; i10 < length; i10++) {
            webMessagePortArr[i10] = abstractC7110nArr[i10].mo8323b();
        }
        return webMessagePortArr;
    }

    /* renamed from: h */
    public static C7109m m8318h(WebMessage webMessage) {
        return C1437c.m8276d(webMessage);
    }

    /* renamed from: i */
    private WebMessagePortBoundaryInterface m8319i() {
        if (this.f6393b == null) {
            this.f6393b = (WebMessagePortBoundaryInterface) C7757a.m23674a(WebMessagePortBoundaryInterface.class, C1463k1.m8376c().m8425h(this.f6392a));
        }
        return this.f6393b;
    }

    /* renamed from: j */
    private WebMessagePort m8320j() {
        if (this.f6392a == null) {
            this.f6392a = C1463k1.m8376c().m8424g(Proxy.getInvocationHandler(this.f6393b));
        }
        return this.f6392a;
    }

    /* renamed from: k */
    public static AbstractC7110n[] m8321k(WebMessagePort[] webMessagePortArr) {
        if (webMessagePortArr == null) {
            return null;
        }
        AbstractC7110n[] abstractC7110nArr = new AbstractC7110n[webMessagePortArr.length];
        for (int i10 = 0; i10 < webMessagePortArr.length; i10++) {
            abstractC7110nArr[i10] = new C1448f1(webMessagePortArr[i10]);
        }
        return abstractC7110nArr;
    }

    @Override // p073e2.AbstractC7110n
    /* renamed from: a */
    public void mo8322a() {
        AbstractC1431a.b bVar = C1460j1.f6399B;
        if (bVar.mo8259c()) {
            C1437c.m8273a(m8320j());
        } else {
            if (!bVar.mo8260d()) {
                throw C1460j1.m8361a();
            }
            m8319i().close();
        }
    }

    @Override // p073e2.AbstractC7110n
    /* renamed from: b */
    public WebMessagePort mo8323b() {
        return m8320j();
    }

    @Override // p073e2.AbstractC7110n
    /* renamed from: c */
    public InvocationHandler mo8324c() {
        return Proxy.getInvocationHandler(m8319i());
    }

    @Override // p073e2.AbstractC7110n
    /* renamed from: d */
    public void mo8325d(C7109m c7109m) {
        AbstractC1431a.b bVar = C1460j1.f6398A;
        if (bVar.mo8259c() && c7109m.m20958e() == 0) {
            C1437c.m8280h(m8320j(), m8316f(c7109m));
        } else {
            if (!bVar.mo8260d() || !C1436b1.m8270a(c7109m.m20958e())) {
                throw C1460j1.m8361a();
            }
            m8319i().postMessage(C7757a.m23676c(new C1436b1(c7109m)));
        }
    }

    @Override // p073e2.AbstractC7110n
    /* renamed from: e */
    public void mo8326e(AbstractC7110n.a aVar) {
        AbstractC1431a.b bVar = C1460j1.f6401D;
        if (bVar.mo8260d()) {
            m8319i().setWebMessageCallback(C7757a.m23676c(new C1439c1(aVar)));
        } else {
            if (!bVar.mo8259c()) {
                throw C1460j1.m8361a();
            }
            C1437c.m8284l(m8320j(), aVar);
        }
    }
}
