package com.facebook.ads.redexgen.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.SE */
/* loaded from: assets/audience_network.dex */
public class C3934SE extends AbstractRunnableC3455KT {
    public final /* synthetic */ C3930SA A00;

    public C3934SE(C3930SA c3930sa) {
        this.A00 = c3930sa;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        boolean z10;
        C27668r c27668r;
        Handler handler;
        int i10;
        z10 = this.A00.A03;
        if (!z10) {
            c27668r = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c27668r.A02(new AbstractC3791Pv(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.93
            });
            handler = this.A00.A07;
            i10 = this.A00.A00;
            handler.postDelayed(this, i10);
        }
    }
}
