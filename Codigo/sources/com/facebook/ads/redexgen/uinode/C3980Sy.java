package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Sy */
/* loaded from: assets/audience_network.dex */
public class C3980Sy extends AbstractRunnableC3455KT {
    public final /* synthetic */ C3979Sx A00;

    public C3980Sy(C3979Sx c3979Sx) {
        this.A00 = c3979Sx;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        C3722Oo c3722Oo;
        c3722Oo = this.A00.A0H;
        AbstractC3536Lo.A0F(AdError.NETWORK_ERROR_CODE, c3722Oo);
        this.A00.postDelayed(this, 2000L);
    }
}
