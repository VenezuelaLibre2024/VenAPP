package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Sv */
/* loaded from: assets/audience_network.dex */
public class C3977Sv implements InterfaceC3494L8 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC3455KT A01;
    public final /* synthetic */ AbstractC3974Ss A02;

    public C3977Sv(AbstractC3974Ss abstractC3974Ss, int i10, AbstractRunnableC3455KT abstractRunnableC3455KT) {
        this.A02 = abstractC3974Ss;
        this.A00 = i10;
        this.A01 = abstractRunnableC3455KT;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3494L8
    public final void ABA() {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3494L8
    public final void ACm(float f10) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f10 / this.A00)));
    }
}
