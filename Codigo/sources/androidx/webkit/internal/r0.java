package androidx.webkit.internal;

import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes.dex */
public class r0 extends e2.b {

    /* renamed from: a, reason: collision with root package name */
    private JsReplyProxyBoundaryInterface f5626a;

    /* loaded from: classes.dex */
    class a implements Callable<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ JsReplyProxyBoundaryInterface f5627a;

        a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.f5627a = jsReplyProxyBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new r0(this.f5627a);
        }
    }

    public r0(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.f5626a = jsReplyProxyBoundaryInterface;
    }

    public static r0 c(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) hm.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (r0) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }

    @Override // e2.b
    public void a(String str) {
        if (!j1.V.d()) {
            throw j1.a();
        }
        this.f5626a.postMessage(str);
    }

    @Override // e2.b
    public void b(byte[] bArr) {
        Objects.requireNonNull(bArr, "ArrayBuffer must be non-null");
        if (!j1.C.d()) {
            throw j1.a();
        }
        this.f5626a.postMessageWithPayload(hm.a.c(new e1(bArr)));
    }
}
