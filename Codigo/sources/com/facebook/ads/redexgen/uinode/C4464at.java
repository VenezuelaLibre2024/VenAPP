package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.at */
/* loaded from: assets/audience_network.dex */
public class C4464at implements InterfaceC260561 {
    public final /* synthetic */ C23411i A00;

    public C4464at(C23411i c23411i) {
        this.A00 = c23411i;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC260561
    public final void AAl() {
        InterfaceC23401h interfaceC23401h;
        interfaceC23401h = this.A00.A04;
        interfaceC23401h.AAf();
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC260561
    public final void AAm() {
        InterfaceC23401h interfaceC23401h;
        interfaceC23401h = this.A00.A04;
        interfaceC23401h.AAe(AdError.CACHE_ERROR);
    }
}
