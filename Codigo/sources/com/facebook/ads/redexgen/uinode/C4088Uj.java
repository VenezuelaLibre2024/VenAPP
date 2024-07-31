package com.facebook.ads.redexgen.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Uj */
/* loaded from: assets/audience_network.dex */
public class C4088Uj extends AbstractRunnableC3455KT {
    public final /* synthetic */ C3495L9 A00;

    public C4088Uj(C3495L9 c3495l9) {
        this.A00 = c3495l9;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        Handler handler;
        long j10;
        if (this.A00.A05()) {
            this.A00.A02();
            handler = this.A00.A05;
            j10 = this.A00.A02;
            handler.postDelayed(this, j10);
        }
    }
}
