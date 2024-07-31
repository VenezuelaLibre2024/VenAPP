package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.au, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1491au implements InterfaceC05901q {
    public final /* synthetic */ C05821i A00;

    public C1491au(C05821i c05821i) {
        this.A00 = c05821i;
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05901q
    public final void ACZ(AdError adError) {
        InterfaceC05811h interfaceC05811h;
        interfaceC05811h = this.A00.A04;
        interfaceC05811h.AAe(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.uinode.InterfaceC05901q
    public final void ACa() {
        InterfaceC05811h interfaceC05811h;
        interfaceC05811h = this.A00.A04;
        interfaceC05811h.AAf();
    }
}
