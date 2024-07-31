package com.facebook.ads.redexgen.uinode;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.1r */
/* loaded from: assets/audience_network.dex */
public class C23501r extends WebViewClient {
    public boolean A00 = false;
    public final C23351c A01;
    public final InterfaceC23491q A02;
    public final boolean A03;

    public C23501r(C23351c c23351c, InterfaceC23491q interfaceC23491q, boolean z10) {
        this.A01 = c23351c;
        this.A02 = interfaceC23491q;
        this.A03 = z10;
    }

    private void A00() {
        if (this.A03) {
            this.A02.ACZ(AdError.CACHE_ERROR);
        } else {
            A01();
        }
    }

    private void A01() {
        InterfaceC23491q interfaceC23491q = this.A02;
        if (interfaceC23491q != null) {
            interfaceC23491q.ACa();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        A00();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A00 = true;
        A01();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        new Handler().postDelayed(new C4462ar(this), this.A01.A08());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A00 = true;
        A02();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AbstractC3644NY.A02(AbstractC27248A.A2e);
        A00();
        return true;
    }
}
