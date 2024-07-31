package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.af */
/* loaded from: assets/audience_network.dex */
public class C4450af extends AbstractRunnableC3455KT {
    public final /* synthetic */ C3157FY A00;
    public final /* synthetic */ C23541v A01;
    public final /* synthetic */ C3141FG A02;

    public C4450af(C3141FG c3141fg, C23541v c23541v, C3157FY c3157fy) {
        this.A02 = c3141fg;
        this.A01 = c23541v;
        this.A00 = c3157fy;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        this.A02.A0Q(this.A01);
        this.A02.A0N(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0E().A4t(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A06.A0G(new C3403Jb(adErrorType, ""));
    }
}
