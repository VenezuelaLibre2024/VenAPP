package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.T5 */
/* loaded from: assets/audience_network.dex */
public class C3987T5 implements InterfaceC3494L8 {
    public final /* synthetic */ C3986T4 A00;

    public C3987T5(C3986T4 c3986t4) {
        this.A00 = c3986t4;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3494L8
    public final void ABA() {
        InterfaceC3773Pd interfaceC3773Pd;
        int i10;
        InterfaceC3773Pd interfaceC3773Pd2;
        interfaceC3773Pd = this.A00.A0F;
        i10 = this.A00.A0A;
        interfaceC3773Pd.ABH(i10);
        interfaceC3773Pd2 = this.A00.A0F;
        interfaceC3773Pd2.AAu();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3494L8
    public final void ACm(float f10) {
        int i10;
        boolean z10;
        C3930SA c3930sa;
        int duration;
        boolean z11;
        int i11;
        InterfaceC3773Pd interfaceC3773Pd;
        i10 = this.A00.A0A;
        float f11 = i10 - f10;
        z10 = this.A00.A0V;
        if (z10) {
            duration = 0;
        } else {
            c3930sa = this.A00.A0I;
            duration = c3930sa.getDuration();
        }
        float totalForce = f11 + duration;
        z11 = this.A00.A0V;
        if (z11) {
            i11 = this.A00.A0A;
        } else {
            i11 = this.A00.A09;
        }
        float seenTime = i11;
        float totalForce2 = totalForce / seenTime;
        interfaceC3773Pd = this.A00.A0F;
        interfaceC3773Pd.AGr(totalForce2);
    }
}
