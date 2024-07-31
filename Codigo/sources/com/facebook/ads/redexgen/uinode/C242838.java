package com.facebook.ads.redexgen.uinode;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.38 */
/* loaded from: assets/audience_network.dex */
public final class C242838 extends C24723r {
    public C2924BQ A00;
    public List<C3785Pp> A01;

    public C242838(C4337Yn c4337Yn) {
        super(c4337Yn);
        this.A00 = new C2924BQ(this, 1, null, null, null);
    }

    public final void A1y(C3872RE c3872re) {
        C2924BQ c2924bq = this.A00;
        if (c2924bq != null) {
            c2924bq.A0c(c3872re);
        }
    }

    public C2924BQ getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(arrayList);
    }
}
