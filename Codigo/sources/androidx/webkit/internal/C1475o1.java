package androidx.webkit.internal;

import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;
import p073e2.AbstractC7117u;
import p073e2.AbstractC7118v;

/* renamed from: androidx.webkit.internal.o1 */
/* loaded from: classes.dex */
public class C1475o1 implements WebViewRendererClientBoundaryInterface {

    /* renamed from: c */
    private static final String[] f6459c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* renamed from: a */
    private final Executor f6460a;

    /* renamed from: b */
    private final AbstractC7118v f6461b;

    /* renamed from: androidx.webkit.internal.o1$a */
    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC7118v f6462a;

        /* renamed from: b */
        final /* synthetic */ WebView f6463b;

        /* renamed from: c */
        final /* synthetic */ AbstractC7117u f6464c;

        a(AbstractC7118v abstractC7118v, WebView webView, AbstractC7117u abstractC7117u) {
            this.f6462a = abstractC7118v;
            this.f6463b = webView;
            this.f6464c = abstractC7117u;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6462a.onRenderProcessUnresponsive(this.f6463b, this.f6464c);
        }
    }

    /* renamed from: androidx.webkit.internal.o1$b */
    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC7118v f6466a;

        /* renamed from: b */
        final /* synthetic */ WebView f6467b;

        /* renamed from: c */
        final /* synthetic */ AbstractC7117u f6468c;

        b(AbstractC7118v abstractC7118v, WebView webView, AbstractC7117u abstractC7117u) {
            this.f6466a = abstractC7118v;
            this.f6467b = webView;
            this.f6468c = abstractC7117u;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6466a.onRenderProcessResponsive(this.f6467b, this.f6468c);
        }
    }

    public C1475o1(Executor executor, AbstractC7118v abstractC7118v) {
        this.f6460a = executor;
        this.f6461b = abstractC7118v;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f6459c;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        C1481q1 m8412c = C1481q1.m8412c(invocationHandler);
        AbstractC7118v abstractC7118v = this.f6461b;
        Executor executor = this.f6460a;
        if (executor == null) {
            abstractC7118v.onRenderProcessResponsive(webView, m8412c);
        } else {
            executor.execute(new b(abstractC7118v, webView, m8412c));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        C1481q1 m8412c = C1481q1.m8412c(invocationHandler);
        AbstractC7118v abstractC7118v = this.f6461b;
        Executor executor = this.f6460a;
        if (executor == null) {
            abstractC7118v.onRenderProcessUnresponsive(webView, m8412c);
        } else {
            executor.execute(new a(abstractC7118v, webView, m8412c));
        }
    }
}
