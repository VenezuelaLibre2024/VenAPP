package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Td */
/* loaded from: assets/audience_network.dex */
public class C4021Td implements InterfaceC3494L8 {
    public final /* synthetic */ C2916BI A00;

    public C4021Td(C2916BI c2916bi) {
        this.A00 = c2916bi;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3494L8
    public final void ABA() {
        AbstractC3559MB abstractC3559MB;
        AbstractC3559MB abstractC3559MB2;
        this.A00.A07 = false;
        abstractC3559MB = this.A00.A04;
        if (abstractC3559MB != null) {
            abstractC3559MB2 = this.A00.A04;
            abstractC3559MB2.setToolbarActionMode(this.A00.getCloseButtonStyle());
        }
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3494L8
    public final void ACm(float f10) {
        AbstractC3559MB abstractC3559MB;
        AbstractC3559MB abstractC3559MB2;
        abstractC3559MB = this.A00.A04;
        if (abstractC3559MB != null) {
            float A00 = 1.0f - (f10 / ((float) this.A00.getAdInfo().A0G().A00()));
            abstractC3559MB2 = this.A00.A04;
            abstractC3559MB2.setProgressImmediate(100.0f * A00);
        }
    }
}
