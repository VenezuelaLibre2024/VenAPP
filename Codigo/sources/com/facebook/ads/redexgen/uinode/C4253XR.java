package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.XR */
/* loaded from: assets/audience_network.dex */
public final class C4253XR implements InterfaceC2979CL {
    public final int A00;
    public final int A01;
    public final C3306Hz A02;

    public C4253XR(C4254XS c4254xs) {
        C3306Hz c3306Hz = c4254xs.A00;
        this.A02 = c3306Hz;
        c3306Hz.A0Y(12);
        this.A00 = c3306Hz.A0H();
        this.A01 = c3306Hz.A0H();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2979CL
    public final int A7o() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2979CL
    public final boolean A93() {
        return this.A00 != 0;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2979CL
    public final int AEN() {
        int i10 = this.A00;
        return i10 == 0 ? this.A02.A0H() : i10;
    }
}
