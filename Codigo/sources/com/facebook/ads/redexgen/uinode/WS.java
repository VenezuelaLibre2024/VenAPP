package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class WS implements FB {
    public final int A00;
    public final /* synthetic */ CD A01;

    public WS(CD cd2, int i10) {
        this.A01 = cd2;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.FB
    public final boolean A9C() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.FB
    public final void AAM() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.facebook.ads.redexgen.uinode.FB
    public final int AEK(C07829p c07829p, C1377Xr c1377Xr, boolean z10) {
        return this.A01.A0P(this.A00, c07829p, c1377Xr, z10);
    }

    @Override // com.facebook.ads.redexgen.uinode.FB
    public final int AGO(long j10) {
        return this.A01.A0O(this.A00, j10);
    }
}
