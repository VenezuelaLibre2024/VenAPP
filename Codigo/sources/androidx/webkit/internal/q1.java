package androidx.webkit.internal;

import android.webkit.WebViewRenderProcess;
import androidx.webkit.internal.a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* loaded from: classes.dex */
public class q1 extends e2.u {

    /* renamed from: c, reason: collision with root package name */
    private static final WeakHashMap<WebViewRenderProcess, q1> f5622c = new WeakHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private WebViewRendererBoundaryInterface f5623a;

    /* renamed from: b, reason: collision with root package name */
    private WeakReference<WebViewRenderProcess> f5624b;

    /* loaded from: classes.dex */
    class a implements Callable<Object> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebViewRendererBoundaryInterface f5625a;

        a(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
            this.f5625a = webViewRendererBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new q1(this.f5625a);
        }
    }

    public q1(WebViewRenderProcess webViewRenderProcess) {
        this.f5624b = new WeakReference<>(webViewRenderProcess);
    }

    public q1(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.f5623a = webViewRendererBoundaryInterface;
    }

    public static q1 b(WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap<WebViewRenderProcess, q1> weakHashMap = f5622c;
        q1 q1Var = weakHashMap.get(webViewRenderProcess);
        if (q1Var != null) {
            return q1Var;
        }
        q1 q1Var2 = new q1(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, q1Var2);
        return q1Var2;
    }

    public static q1 c(InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) hm.a.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (q1) webViewRendererBoundaryInterface.getOrCreatePeer(new a(webViewRendererBoundaryInterface));
    }

    @Override // e2.u
    public boolean a() {
        a.h hVar = j1.K;
        if (hVar.c()) {
            WebViewRenderProcess webViewRenderProcess = this.f5624b.get();
            return webViewRenderProcess != null && k0.g(webViewRenderProcess);
        }
        if (hVar.d()) {
            return this.f5623a.terminate();
        }
        throw j1.a();
    }
}
