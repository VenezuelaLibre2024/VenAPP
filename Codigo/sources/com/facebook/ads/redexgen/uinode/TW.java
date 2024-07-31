package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public class TW extends KT {
    public final /* synthetic */ TT A00;

    public TW(TT tt) {
        this.A00 = tt;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        boolean z10;
        C1144Oo c1144Oo;
        z10 = this.A00.A0Z;
        if (!z10) {
            c1144Oo = this.A00.A0M;
            AbstractC1066Lo.A0F(AdError.NETWORK_ERROR_CODE, c1144Oo);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
