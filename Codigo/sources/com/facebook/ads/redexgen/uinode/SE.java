package com.facebook.ads.redexgen.uinode;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class SE extends KT {
    public final /* synthetic */ SA A00;

    public SE(SA sa2) {
        this.A00 = sa2;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        boolean z10;
        C07608r c07608r;
        Handler handler;
        int i10;
        z10 = this.A00.A03;
        if (!z10) {
            c07608r = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c07608r.A02(new AbstractC1177Pv(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.93
            });
            handler = this.A00.A07;
            i10 = this.A00.A00;
            handler.postDelayed(this, i10);
        }
    }
}
