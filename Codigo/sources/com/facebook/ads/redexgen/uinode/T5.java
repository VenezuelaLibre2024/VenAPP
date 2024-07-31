package com.facebook.ads.redexgen.uinode;

/* loaded from: assets/audience_network.dex */
public class T5 implements L8 {
    public final /* synthetic */ T4 A00;

    public T5(T4 t42) {
        this.A00 = t42;
    }

    @Override // com.facebook.ads.redexgen.uinode.L8
    public final void ABA() {
        InterfaceC1159Pd interfaceC1159Pd;
        int i10;
        InterfaceC1159Pd interfaceC1159Pd2;
        interfaceC1159Pd = this.A00.A0F;
        i10 = this.A00.A0A;
        interfaceC1159Pd.ABH(i10);
        interfaceC1159Pd2 = this.A00.A0F;
        interfaceC1159Pd2.AAu();
    }

    @Override // com.facebook.ads.redexgen.uinode.L8
    public final void ACm(float f10) {
        int i10;
        boolean z10;
        SA sa2;
        int duration;
        boolean z11;
        int i11;
        InterfaceC1159Pd interfaceC1159Pd;
        i10 = this.A00.A0A;
        float f11 = i10 - f10;
        z10 = this.A00.A0V;
        if (z10) {
            duration = 0;
        } else {
            sa2 = this.A00.A0I;
            duration = sa2.getDuration();
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
        interfaceC1159Pd = this.A00.A0F;
        interfaceC1159Pd.AGr(totalForce2);
    }
}
