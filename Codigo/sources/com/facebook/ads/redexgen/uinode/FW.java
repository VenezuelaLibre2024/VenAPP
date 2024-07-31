package com.facebook.ads.redexgen.uinode;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class FW extends AbstractC1503b6 {
    public final C1399Yn A00;

    public FW(C3C c3c, List<V2> list, C1399Yn c1399Yn) {
        super(c3c, list, c1399Yn);
        this.A00 = c1399Yn;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC06534c
    /* renamed from: A01 */
    public final UR A0C(ViewGroup viewGroup, int i10) {
        return new UR(new MN(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC06534c
    /* renamed from: A0H */
    public final void A0D(UR ur, int i10) {
        super.A0D(ur, i10);
        MN mn = (MN) ur.A0j();
        MZ imageView = (MZ) mn.getImageCardView();
        imageView.setImageDrawable(null);
        A0F(imageView, i10);
        V2 childAd = ((AbstractC1503b6) this).A01.get(i10);
        childAd.A11().A0K(this.A00);
        childAd.A1N(mn, mn);
    }
}
