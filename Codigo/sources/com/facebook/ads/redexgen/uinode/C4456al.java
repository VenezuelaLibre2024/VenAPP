package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.al */
/* loaded from: assets/audience_network.dex */
public class C4456al extends AbstractRunnableC3455KT {
    public final /* synthetic */ C4493bM A00;
    public final /* synthetic */ C23541v A01;
    public final /* synthetic */ C3149FQ A02;

    public C4456al(C3149FQ c3149fq, C23541v c23541v, C4493bM c4493bM) {
        this.A02 = c3149fq;
        this.A01 = c23541v;
        this.A00 = c4493bM;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        this.A02.A0Q(this.A01);
        this.A02.A0N(this.A00);
        this.A02.A00 = null;
        C3403Jb A00 = C3403Jb.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0E().A4t(A00.A03().getErrorCode(), A00.A04());
        this.A02.A06.A0G(A00);
    }
}
