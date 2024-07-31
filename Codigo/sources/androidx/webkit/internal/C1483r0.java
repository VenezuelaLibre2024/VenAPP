package androidx.webkit.internal;

import hm.C7757a;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import p073e2.AbstractC7098b;

/* renamed from: androidx.webkit.internal.r0 */
/* loaded from: classes.dex */
public class C1483r0 extends AbstractC7098b {

    /* renamed from: a */
    private JsReplyProxyBoundaryInterface f6477a;

    /* renamed from: androidx.webkit.internal.r0$a */
    /* loaded from: classes.dex */
    class a implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ JsReplyProxyBoundaryInterface f6478a;

        a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f6478a = jsReplyProxyBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new C1483r0(this.f6478a);
        }
    }

    public C1483r0(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f6477a = jsReplyProxyBoundaryInterface;
    }

    /* renamed from: c */
    public static C1483r0 m8415c(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) C7757a.m23674a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (C1483r0) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }

    @Override // p073e2.AbstractC7098b
    /* renamed from: a */
    public void mo8416a(String str) {
        if (!C1460j1.f6419V.mo8260d()) {
            throw C1460j1.m8361a();
        }
        this.f6477a.postMessage(str);
    }

    @Override // p073e2.AbstractC7098b
    /* renamed from: b */
    public void mo8417b(byte[] bArr) {
        Objects.requireNonNull(bArr, "ArrayBuffer must be non-null");
        if (!C1460j1.f6400C.mo8260d()) {
            throw C1460j1.m8361a();
        }
        this.f6477a.postMessageWithPayload(C7757a.m23676c(new C1445e1(bArr)));
    }
}
