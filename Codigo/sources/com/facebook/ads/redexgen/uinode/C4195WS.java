package com.facebook.ads.redexgen.uinode;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.WS */
/* loaded from: assets/audience_network.dex */
public final class C4195WS implements InterfaceC3136FB {
    public final int A00;
    public final /* synthetic */ C2971CD A01;

    public C4195WS(C2971CD c2971cd, int i10) {
        this.A01 = c2971cd;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3136FB
    public final boolean A9C() {
        return this.A01.A0S(this.A00);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3136FB
    public final void AAM() throws IOException {
        this.A01.A0Q();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3136FB
    public final int AEK(C28259p c28259p, C4279Xr c4279Xr, boolean z10) {
        return this.A01.A0P(this.A00, c28259p, c4279Xr, z10);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC3136FB
    public final int AGO(long j10) {
        return this.A01.A0O(this.A00, j10);
    }
}
