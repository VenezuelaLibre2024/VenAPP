package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Ut */
/* loaded from: assets/audience_network.dex */
public class C4098Ut extends AbstractRunnableC3455KT {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C3428K1 A01;
    public final /* synthetic */ C3431K4 A02;
    public final /* synthetic */ String A03;

    public C4098Ut(C3431K4 c3431k4, String str, long j10, C3428K1 c3428k1) {
        this.A02 = c3431k4;
        this.A03 = str;
        this.A00 = j10;
        this.A01 = c3428k1;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        this.A02.A0M(this.A03, this.A00, this.A01);
    }
}
