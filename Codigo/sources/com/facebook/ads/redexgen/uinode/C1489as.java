package com.facebook.ads.redexgen.uinode;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.as, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1489as implements C6U {
    public final C05761c A00;
    public final InterfaceC05901q A01;
    public final C07046c A02;
    public final C1399Yn A03;
    public final boolean A04;

    public C1489as(C1399Yn c1399Yn, InterfaceC05901q interfaceC05901q, C07046c c07046c, C05761c c05761c, boolean z10) {
        this.A03 = c1399Yn;
        this.A01 = interfaceC05901q;
        this.A02 = c07046c;
        this.A00 = c05761c;
        this.A04 = z10;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C05911r(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z10) {
        if (this.A00.A09() == EnumC05771d.A05) {
            A00();
            return;
        }
        String A0E = this.A00.A0E();
        if (z10) {
            C07046c c07046c = this.A02;
            String markupUrlResult = this.A00.A0E();
            A0E = c07046c.A0R(markupUrlResult);
        }
        this.A00.A0H(A0E);
        this.A01.ACa();
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void AB2() {
        if (this.A04) {
            this.A01.ACZ(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.C6U
    public final void ABB() {
        A01(true);
    }
}
