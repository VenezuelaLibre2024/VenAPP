package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.at, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1490at implements AnonymousClass61 {
    public final /* synthetic */ C05821i A00;

    public C1490at(C05821i c05821i) {
        this.A00 = c05821i;
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAl() {
        InterfaceC05811h interfaceC05811h;
        interfaceC05811h = this.A00.A04;
        interfaceC05811h.AAf();
    }

    @Override // com.facebook.ads.redexgen.uinode.AnonymousClass61
    public final void AAm() {
        InterfaceC05811h interfaceC05811h;
        interfaceC05811h = this.A00.A04;
        interfaceC05811h.AAe(AdError.CACHE_ERROR);
    }
}
