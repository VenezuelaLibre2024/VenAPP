package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.XK */
/* loaded from: assets/audience_network.dex */
public class C4246XK implements InterfaceC2959C1 {
    public final /* synthetic */ C4245XJ A00;

    public C4246XK(C4245XJ c4245xj) {
        this.A00 = c4245xj;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2959C1
    public final long A6r() {
        AbstractC3004Co abstractC3004Co;
        long j10;
        abstractC3004Co = this.A00.A0B;
        j10 = this.A00.A07;
        return abstractC3004Co.A03(j10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2959C1
    public final C2958C0 A7t(long granule) {
        AbstractC3004Co abstractC3004Co;
        long j10;
        long A00;
        long j11;
        if (granule == 0) {
            j11 = this.A00.A09;
            return new C2958C0(new C2960C2(0L, j11));
        }
        abstractC3004Co = this.A00.A0B;
        long A04 = abstractC3004Co.A04(granule);
        C4245XJ c4245xj = this.A00;
        j10 = c4245xj.A09;
        A00 = c4245xj.A00(j10, A04, 30000L);
        return new C2958C0(new C2960C2(granule, A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC2959C1
    public final boolean A9I() {
        return true;
    }
}
