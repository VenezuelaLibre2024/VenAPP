package com.facebook.ads.redexgen.uinode;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.as */
/* loaded from: assets/audience_network.dex */
public class C4463as implements InterfaceC26336U {
    public final C23351c A00;
    public final InterfaceC23491q A01;
    public final C26416c A02;
    public final C4337Yn A03;
    public final boolean A04;

    public C4463as(C4337Yn c4337Yn, InterfaceC23491q interfaceC23491q, C26416c c26416c, C23351c c23351c, boolean z10) {
        this.A03 = c4337Yn;
        this.A01 = interfaceC23491q;
        this.A02 = c26416c;
        this.A00 = c23351c;
        this.A04 = z10;
    }

    private final void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C23501r(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0E());
    }

    private void A01(boolean z10) {
        if (this.A00.A09() == EnumC23361d.A05) {
            A00();
            return;
        }
        String A0E = this.A00.A0E();
        if (z10) {
            C26416c c26416c = this.A02;
            String markupUrlResult = this.A00.A0E();
            A0E = c26416c.A0R(markupUrlResult);
        }
        this.A00.A0H(A0E);
        this.A01.ACa();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26336U
    public final void AB2() {
        if (this.A04) {
            this.A01.ACZ(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC26336U
    public final void ABB() {
        A01(true);
    }
}
