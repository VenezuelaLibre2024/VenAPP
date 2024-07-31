package com.facebook.ads.redexgen.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Va */
/* loaded from: assets/audience_network.dex */
public final class C4141Va implements InterfaceC4561cd<C3355Io, C3360It> {
    public C4138VX A00;

    public C4141Va(C4138VX c4138vx) {
        this.A00 = c4138vx;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ca != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    @Override // com.facebook.ads.redexgen.uinode.InterfaceC4561cd
    public final void A5c(C4558ca<C3355Io, C3360It> c4558ca, InterfaceC4547cP interfaceC4547cP) {
        switch (C3353Im.A00[interfaceC4547cP.A8J(c4558ca).ordinal()]) {
            case 1:
            case 2:
                this.A00.A02(c4558ca, interfaceC4547cP);
                return;
            default:
                return;
        }
    }
}
