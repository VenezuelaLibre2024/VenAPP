package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.b7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1504b7 implements InterfaceC1111Nh {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1503b6 A01;
    public final /* synthetic */ V2 A02;

    public C1504b7(AbstractC1503b6 abstractC1503b6, int i10, V2 v22) {
        this.A01 = abstractC1503b6;
        this.A00 = i10;
        this.A02 = v22;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1111Nh
    public final void ABh(boolean z10) {
        RD rd2;
        if (this.A00 == 0) {
            V2 v22 = this.A02;
            rd2 = this.A01.A04;
            v22.A1Z(rd2);
        }
        this.A02.A1c(z10, true);
    }
}
