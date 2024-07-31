package com.facebook.ads.redexgen.uinode;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.QU */
/* loaded from: assets/audience_network.dex */
public class C3826QU extends AbstractC23842P {
    public final /* synthetic */ C3824QS A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3826QU(C3824QS c3824qs, double d10, double d11, double d12, boolean z10) {
        super(d10, d11, d12, z10);
        this.A00 = c3824qs;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC23842P
    public final void A00(boolean z10, boolean z11, C23862R c23862r) {
        String str;
        Map A0I;
        if (z11) {
            C3824QS c3824qs = this.A00;
            str = c3824qs.A0C;
            A0I = this.A00.A0I(EnumC3812QG.A03);
            c3824qs.A0Q(str, A0I);
        }
    }
}
