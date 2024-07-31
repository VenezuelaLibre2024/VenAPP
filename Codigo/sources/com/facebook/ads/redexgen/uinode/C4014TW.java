package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.TW */
/* loaded from: assets/audience_network.dex */
public class C4014TW extends AbstractRunnableC3455KT {
    public final /* synthetic */ C4011TT A00;

    public C4014TW(C4011TT c4011tt) {
        this.A00 = c4011tt;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        boolean z10;
        C3722Oo c3722Oo;
        z10 = this.A00.A0Z;
        if (!z10) {
            c3722Oo = this.A00.A0M;
            AbstractC3536Lo.A0F(AdError.NETWORK_ERROR_CODE, c3722Oo);
        }
        this.A00.postDelayed(this, 2000L);
    }
}
