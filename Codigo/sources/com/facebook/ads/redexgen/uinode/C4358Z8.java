package com.facebook.ads.redexgen.uinode;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.Z8 */
/* loaded from: assets/audience_network.dex */
public class C4358Z8 extends AbstractRunnableC3455KT {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C25945q A01;
    public final /* synthetic */ C4107V2 A02;

    public C4358Z8(C25945q c25945q, C4107V2 c4107v2, Drawable drawable) {
        this.A01 = c25945q;
        this.A02 = c4107v2;
        this.A00 = drawable;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractRunnableC3455KT
    public final void A06() {
        this.A02.A1J(this.A00);
    }
}
