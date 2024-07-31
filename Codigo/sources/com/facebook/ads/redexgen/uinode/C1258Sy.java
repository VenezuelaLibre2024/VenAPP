package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.Sy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1258Sy extends KT {
    public final /* synthetic */ C1257Sx A00;

    public C1258Sy(C1257Sx c1257Sx) {
        this.A00 = c1257Sx;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        C1144Oo c1144Oo;
        c1144Oo = this.A00.A0H;
        AbstractC1066Lo.A0F(AdError.NETWORK_ERROR_CODE, c1144Oo);
        this.A00.postDelayed(this, 2000L);
    }
}
