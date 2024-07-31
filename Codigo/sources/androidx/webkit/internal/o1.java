package androidx.webkit.internal;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* loaded from: classes.dex */
public class o1 implements WebViewRendererClientBoundaryInterface {

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f5608c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* renamed from: a, reason: collision with root package name */
    private final Executor f5609a;

    /* renamed from: b, reason: collision with root package name */
    private final e2.v f5610b;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e2.v f5611a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f5612b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e2.u f5613c;

        a(e2.v vVar, WebView webView, e2.u uVar) {
            this.f5611a = vVar;
            this.f5612b = webView;
            this.f5613c = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5611a.onRenderProcessUnresponsive(this.f5612b, this.f5613c);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ e2.v f5615a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WebView f5616b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ e2.u f5617c;

        b(e2.v vVar, WebView webView, e2.u uVar) {
            this.f5615a = vVar;
            this.f5616b = webView;
            this.f5617c = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5615a.onRenderProcessResponsive(this.f5616b, this.f5617c);
        }
    }

    public o1(Executor executor, e2.v vVar) {
        this.f5609a = executor;
        this.f5610b = vVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f5608c;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        q1 c10 = q1.c(invocationHandler);
        e2.v vVar = this.f5610b;
        Executor executor = this.f5609a;
        if (executor == null) {
            vVar.onRenderProcessResponsive(webView, c10);
        } else {
            executor.execute(new b(vVar, webView, c10));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        q1 c10 = q1.c(invocationHandler);
        e2.v vVar = this.f5610b;
        Executor executor = this.f5609a;
        if (executor == null) {
            vVar.onRenderProcessUnresponsive(webView, c10);
        } else {
            executor.execute(new a(vVar, webView, c10));
        }
    }
}
