package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Tj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1269Tj extends KT {
    public final /* synthetic */ AbstractC1125Nv A00;

    public C1269Tj(AbstractC1125Nv abstractC1125Nv) {
        this.A00 = abstractC1125Nv;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        Runnable runnable;
        int i10;
        this.A00.setPressed(false);
        AbstractC1125Nv abstractC1125Nv = this.A00;
        runnable = abstractC1125Nv.A08;
        i10 = this.A00.A07;
        abstractC1125Nv.postOnAnimationDelayed(runnable, i10);
    }
}
