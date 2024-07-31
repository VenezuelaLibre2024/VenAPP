package androidx.webkit.internal;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import p073e2.AbstractC7118v;

/* renamed from: androidx.webkit.internal.p1 */
/* loaded from: classes.dex */
public class C1478p1 extends WebViewRenderProcessClient {

    /* renamed from: a */
    private AbstractC7118v f6471a;

    public C1478p1(AbstractC7118v abstractC7118v) {
        this.f6471a = abstractC7118v;
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f6471a.onRenderProcessResponsive(webView, C1481q1.m8411b(webViewRenderProcess));
    }

    @Override // android.webkit.WebViewRenderProcessClient
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        this.f6471a.onRenderProcessUnresponsive(webView, C1481q1.m8411b(webViewRenderProcess));
    }
}
