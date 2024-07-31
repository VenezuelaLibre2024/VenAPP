package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Xj */
/* loaded from: assets/audience_network.dex */
public final class C4271Xj implements InterfaceC2959C1 {
    public final long A00;
    public final C2958C0 A01;

    public C4271Xj(long j10) {
        this(j10, 0L);
    }

    public C4271Xj(long j10, long j11) {
        this.A00 = j10;
        this.A01 = new C2958C0(j11 == 0 ? C2960C2.A03 : new C2960C2(0L, j11));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2959C1
    public final long A6r() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2959C1
    public final C2958C0 A7t(long j10) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2959C1
    public final boolean A9I() {
        return false;
    }
}
