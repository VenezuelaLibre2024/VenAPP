package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Tk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1270Tk extends KT {
    public final /* synthetic */ AbstractC1125Nv A00;

    public C1270Tk(AbstractC1125Nv abstractC1125Nv) {
        this.A00 = abstractC1125Nv;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        Runnable runnable;
        int i10;
        if (this.A00.isPressed()) {
            AbstractC1125Nv abstractC1125Nv = this.A00;
            i10 = abstractC1125Nv.A07;
            abstractC1125Nv.postDelayed(this, i10);
        } else {
            this.A00.setPressed(true);
            AbstractC1125Nv abstractC1125Nv2 = this.A00;
            runnable = abstractC1125Nv2.A09;
            abstractC1125Nv2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
