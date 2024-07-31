package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Va, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1311Va implements InterfaceC1585cd<C0993Io, C0998It> {
    public VX A00;

    public C1311Va(VX vx) {
        this.A00 = vx;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC1585cd
    public final void A5c(C1582ca<C0993Io, C0998It> c1582ca, InterfaceC1572cP interfaceC1572cP) {
        switch (Im.A00[interfaceC1572cP.A8J(c1582ca).ordinal()]) {
            case 1:
            case 2:
                this.A00.A02(c1582ca, interfaceC1572cP);
                return;
            default:
                return;
        }
    }
}
