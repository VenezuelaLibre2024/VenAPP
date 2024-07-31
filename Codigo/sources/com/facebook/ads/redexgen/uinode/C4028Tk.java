package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Tk */
/* loaded from: assets/audience_network.dex */
public class C4028Tk extends AbstractRunnableC3455KT {
    public final /* synthetic */ AbstractC3667Nv A00;

    public C4028Tk(AbstractC3667Nv abstractC3667Nv) {
        this.A00 = abstractC3667Nv;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        Runnable runnable;
        int i10;
        if (this.A00.isPressed()) {
            AbstractC3667Nv abstractC3667Nv = this.A00;
            i10 = abstractC3667Nv.A07;
            abstractC3667Nv.postDelayed(this, i10);
        } else {
            this.A00.setPressed(true);
            AbstractC3667Nv abstractC3667Nv2 = this.A00;
            runnable = abstractC3667Nv2.A09;
            abstractC3667Nv2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
