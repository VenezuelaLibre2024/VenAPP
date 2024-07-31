package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.au */
/* loaded from: assets/audience_network.dex */
public class C4465au implements InterfaceC23491q {
    public final /* synthetic */ C23411i A00;

    public C4465au(C23411i c23411i) {
        this.A00 = c23411i;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23491q
    public final void ACZ(AdError adError) {
        InterfaceC23401h interfaceC23401h;
        interfaceC23401h = this.A00.A04;
        interfaceC23401h.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC23491q
    public final void ACa() {
        InterfaceC23401h interfaceC23401h;
        interfaceC23401h = this.A00.A04;
        interfaceC23401h.AAf();
    }
}
