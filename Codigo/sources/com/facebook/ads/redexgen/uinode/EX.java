package com.facebook.ads.redexgen.uinode;

import com.facebook.ads.MediaViewVideoRenderer;

/* loaded from: assets/audience_network.dex */
public class EX extends O7 {
    public final /* synthetic */ C06835h A00;

    public EX(C06835h c06835h) {
        this.A00 = c06835h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC07618s
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(O8 o82) {
        MediaViewVideoRenderer mediaViewVideoRenderer;
        if (this.A00.A08 != null) {
            V2.A0L(this.A00.A08.getInternalNativeAd()).A1c(true, true);
        }
        mediaViewVideoRenderer = this.A00.A00;
        mediaViewVideoRenderer.onPlayed();
    }
}
