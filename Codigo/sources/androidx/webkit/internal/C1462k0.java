package androidx.webkit.internal;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;
import p073e2.AbstractC7118v;

/* renamed from: androidx.webkit.internal.k0 */
/* loaded from: classes.dex */
public class C1462k0 {
    @Deprecated
    /* renamed from: a */
    public static int m8367a(WebSettings webSettings) {
        int forceDark;
        forceDark = webSettings.getForceDark();
        return forceDark;
    }

    /* renamed from: b */
    public static WebViewRenderProcess m8368b(WebView webView) {
        WebViewRenderProcess webViewRenderProcess;
        webViewRenderProcess = webView.getWebViewRenderProcess();
        return webViewRenderProcess;
    }

    /* renamed from: c */
    public static WebViewRenderProcessClient m8369c(WebView webView) {
        WebViewRenderProcessClient webViewRenderProcessClient;
        webViewRenderProcessClient = webView.getWebViewRenderProcessClient();
        return webViewRenderProcessClient;
    }

    @Deprecated
    /* renamed from: d */
    public static void m8370d(WebSettings webSettings, int i10) {
        webSettings.setForceDark(i10);
    }

    /* renamed from: e */
    public static void m8371e(WebView webView, AbstractC7118v abstractC7118v) {
        webView.setWebViewRenderProcessClient(abstractC7118v != null ? new C1478p1(abstractC7118v) : null);
    }

    /* renamed from: f */
    public static void m8372f(WebView webView, Executor executor, AbstractC7118v abstractC7118v) {
        webView.setWebViewRenderProcessClient(executor, abstractC7118v != null ? new C1478p1(abstractC7118v) : null);
    }

    /* renamed from: g */
    public static boolean m8373g(WebViewRenderProcess webViewRenderProcess) {
        boolean terminate;
        terminate = webViewRenderProcess.terminate();
        return terminate;
    }
}
