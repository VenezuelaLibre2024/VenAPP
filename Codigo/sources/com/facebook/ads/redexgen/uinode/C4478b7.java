package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.b7 */
/* loaded from: assets/audience_network.dex */
public class C4478b7 implements InterfaceC3653Nh {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC4477b6 A01;
    public final /* synthetic */ C4107V2 A02;

    public C4478b7(AbstractC4477b6 abstractC4477b6, int i10, C4107V2 c4107v2) {
        this.A01 = abstractC4477b6;
        this.A00 = i10;
        this.A02 = c4107v2;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3653Nh
    public final void ABh(boolean z10) {
        AbstractC3871RD abstractC3871RD;
        if (this.A00 == 0) {
            C4107V2 c4107v2 = this.A02;
            abstractC3871RD = this.A01.A04;
            c4107v2.A1Z(abstractC3871RD);
        }
        this.A02.A1c(z10, true);
    }
}
