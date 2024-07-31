package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;

/* loaded from: classes.dex */
public class p1 extends WebViewRenderProcessClient {

    /* renamed from: a, reason: collision with root package name */
    private e2.v f5620a;

    public p1(e2.v vVar) {
        this.f5620a = vVar;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f5620a.onRenderProcessResponsive(webView, q1.b(webViewRenderProcess));
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f5620a.onRenderProcessUnresponsive(webView, q1.b(webViewRenderProcess));
    }
}
