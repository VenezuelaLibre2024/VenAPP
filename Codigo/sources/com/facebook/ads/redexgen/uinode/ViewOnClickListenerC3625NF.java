package com.facebook.ads.redexgen.uinode;

import android.view.View;
import android.webkit.WebView;

/* renamed from: com.facebook.ads.redexgen.X.NF */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC3625NF implements View.OnClickListener {
    public final /* synthetic */ C3629NJ A00;

    public ViewOnClickListenerC3625NF(C3629NJ c3629nj) {
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
            if (!webView.canGoBack()) {
                return;
            }
            webView2 = this.A00.A0A;
            webView2.goBack();
        } catch (Throwable th2) {
            AbstractC3447KL.A00(th2, this);
        }
    }
}
