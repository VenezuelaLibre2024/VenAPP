package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.al, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1482al extends KT {
    public final /* synthetic */ C1519bM A00;
    public final /* synthetic */ C05951v A01;
    public final /* synthetic */ FQ A02;

    public C1482al(FQ fq, C05951v c05951v, C1519bM c1519bM) {
        this.A02 = fq;
        this.A01 = c05951v;
        this.A00 = c1519bM;
    }

    @Override // com.facebook.ads.redexgen.uinode.KT
    public final void A06() {
        this.A02.A0Q(this.A01);
        this.A02.A0N(this.A00);
        this.A02.A00 = null;
        C1005Jb A00 = C1005Jb.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0E().A4t(A00.A03().getErrorCode(), A00.A04());
        this.A02.A06.A0G(A00);
    }
}
