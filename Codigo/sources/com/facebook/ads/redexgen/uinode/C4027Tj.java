package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Tj */
/* loaded from: assets/audience_network.dex */
public class C4027Tj extends AbstractRunnableC3455KT {
    public final /* synthetic */ AbstractC3667Nv A00;

    public C4027Tj(AbstractC3667Nv abstractC3667Nv) {
        this.A00 = abstractC3667Nv;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        Runnable runnable;
        int i10;
        this.A00.setPressed(false);
        AbstractC3667Nv abstractC3667Nv = this.A00;
        runnable = abstractC3667Nv.A08;
        i10 = this.A00.A07;
        abstractC3667Nv.postOnAnimationDelayed(runnable, i10);
    }
}
