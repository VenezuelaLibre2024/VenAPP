package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.webkit.WebView;

/* renamed from: com.facebook.ads.redexgen.X.NG */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3626NG implements View.OnClickListener {
    public final /* synthetic */ C3629NJ A00;

    public ViewOnClickListenerC3626NG(C3629NJ c3629nj) {
        this.A00 = c3629nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WebView webView;
        WebView webView2;
        if (AbstractC3447KL.A02(this)) {
            return;
        }
        try {
            webView = this.A00.A0A;
            if (!webView.canGoForward()) {
                return;
            }
            webView2 = this.A00.A0A;
            webView2.goForward();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
