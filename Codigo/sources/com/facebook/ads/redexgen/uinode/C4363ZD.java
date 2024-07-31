package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.ZD */
/* loaded from: assets/audience_network.dex */
public class C4363ZD extends AbstractRunnableC3442KG {
    public final /* synthetic */ C4360ZA A00;
    public final /* synthetic */ C3403Jb A01;

    public C4363ZD(C4360ZA c4360za, C3403Jb c3403Jb) {
        this.A00 = c4360za;
        this.A01 = c3403Jb;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3442KG
    public final void A01() {
        C25905m c25905m;
        C25905m c25905m2;
        c25905m = this.A00.A00;
        if (c25905m.A00() != null) {
            c25905m2 = this.A00.A00;
            c25905m2.A00().onAdError(AbstractC3487L1.A00(this.A01));
        }
    }
}
