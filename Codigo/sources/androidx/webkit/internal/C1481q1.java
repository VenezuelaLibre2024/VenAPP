package androidx.webkit.internal;

import android.webkit.WebViewRenderProcess;
import androidx.webkit.internal.AbstractC1431a;
import hm.C7757a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import p073e2.AbstractC7117u;

/* renamed from: androidx.webkit.internal.q1 */
/* loaded from: classes.dex */
public class C1481q1 extends AbstractC7117u {

    /* renamed from: c */
    private static final WeakHashMap<WebViewRenderProcess, C1481q1> f6473c = new WeakHashMap<>();

    /* renamed from: a */
    private WebViewRendererBoundaryInterface f6474a;

    /* renamed from: b */
    private WeakReference<WebViewRenderProcess> f6475b;

    /* renamed from: androidx.webkit.internal.q1$a */
    /* loaded from: classes.dex */
    class a implements Callable<Object> {

        /* renamed from: a */
        final /* synthetic */ WebViewRendererBoundaryInterface f6476a;

        a(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
            this.f6476a = webViewRendererBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new C1481q1(this.f6476a);
        }
    }

    public C1481q1(WebViewRenderProcess webViewRenderProcess) {
        this.f6475b = new WeakReference<>(webViewRenderProcess);
    }

    public C1481q1(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f6474a = webViewRendererBoundaryInterface;
    }

    /* renamed from: b */
    public static C1481q1 m8411b(WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap<WebViewRenderProcess, C1481q1> weakHashMap = f6473c;
        C1481q1 c1481q1 = weakHashMap.get(webViewRenderProcess);
        if (c1481q1 != null) {
            return c1481q1;
        }
        C1481q1 c1481q12 = new C1481q1(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, c1481q12);
        return c1481q12;
    }

    /* renamed from: c */
    public static C1481q1 m8412c(InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) C7757a.m23674a(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (C1481q1) webViewRendererBoundaryInterface.getOrCreatePeer(new a(webViewRendererBoundaryInterface));
    }

    @Override // p073e2.AbstractC7117u
    /* renamed from: a */
    public boolean mo8413a() {
        AbstractC1431a.h hVar = C1460j1.f6408K;
        if (hVar.mo8259c()) {
            WebViewRenderProcess webViewRenderProcess = this.f6475b.get();
            return webViewRenderProcess != null && C1462k0.m8373g(webViewRenderProcess);
        }
        if (hVar.mo8260d()) {
            return this.f6474a.terminate();
        }
        throw C1460j1.m8361a();
    }
}
