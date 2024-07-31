package com.facebook.ads.redexgen.uinode;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Tr */
/* loaded from: assets/audience_network.dex */
public class C4035Tr extends AbstractRunnableC3455KT {
    public final /* synthetic */ C3652Ng A00;

    public C4035Tr(C3652Ng c3652Ng) {
        this.A00 = c3652Ng;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        boolean z10;
        Handler handler;
        Runnable runnable;
        this.A00.A03();
        z10 = this.A00.A08;
        if (z10) {
            handler = this.A00.A0D;
            runnable = this.A00.A0F;
            handler.postDelayed(runnable, 250L);
        }
    }
}
