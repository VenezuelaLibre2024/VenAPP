package androidx.webkit.internal;

import android.webkit.WebResourceError;
import androidx.webkit.internal.AbstractC1431a;
import hm.C7757a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebResourceErrorBoundaryInterface;
import p073e2.AbstractC7111o;

/* renamed from: androidx.webkit.internal.g1 */
/* loaded from: classes.dex */
public class C1451g1 extends AbstractC7111o {

    /* renamed from: a */
    private WebResourceError f6394a;

    /* renamed from: b */
    private WebResourceErrorBoundaryInterface f6395b;

    public C1451g1(WebResourceError webResourceError) {
        this.f6394a = webResourceError;
    }

    public C1451g1(InvocationHandler invocationHandler) {
        this.f6395b = (WebResourceErrorBoundaryInterface) C7757a.m23674a(WebResourceErrorBoundaryInterface.class, invocationHandler);
    }

    /* renamed from: c */
    private WebResourceErrorBoundaryInterface m8329c() {
        if (this.f6395b == null) {
            this.f6395b = (WebResourceErrorBoundaryInterface) C7757a.m23674a(WebResourceErrorBoundaryInterface.class, C1463k1.m8376c().m8427j(this.f6394a));
        }
        return this.f6395b;
    }

    /* renamed from: d */
    private WebResourceError m8330d() {
        if (this.f6394a == null) {
            this.f6394a = C1463k1.m8376c().m8426i(Proxy.getInvocationHandler(this.f6395b));
        }
        return this.f6394a;
    }

    @Override // p073e2.AbstractC7111o
    /* renamed from: a */
    public CharSequence mo8331a() {
        AbstractC1431a.b bVar = C1460j1.f6447v;
        if (bVar.mo8259c()) {
            return C1437c.m8277e(m8330d());
        }
        if (bVar.mo8260d()) {
            return m8329c().getDescription();
        }
        throw C1460j1.m8361a();
    }

    @Override // p073e2.AbstractC7111o
    /* renamed from: b */
    public int mo8332b() {
        AbstractC1431a.b bVar = C1460j1.f6448w;
        if (bVar.mo8259c()) {
            return C1437c.m8278f(m8330d());
        }
        if (bVar.mo8260d()) {
            return m8329c().getErrorCode();
        }
        throw C1460j1.m8361a();
    }
}
