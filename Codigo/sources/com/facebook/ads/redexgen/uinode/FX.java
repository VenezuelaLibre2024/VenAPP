package com.facebook.ads.redexgen.uinode;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class FX extends AbstractC1503b6 {
    public final C1399Yn A00;
    public final JR A01;

    public FX(C1399Yn c1399Yn, C3C c3c, List<V2> list, JR jr) {
        super(c3c, list, c1399Yn);
        this.A00 = c1399Yn;
        this.A01 = jr == null ? new JR() : jr;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC06534c
    /* renamed from: A01 */
    public final UR A0C(ViewGroup viewGroup, int i10) {
        return new UR(new MI(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC06534c
    /* renamed from: A0H */
    public final void A0D(UR ur, int i10) {
        super.A0D(ur, i10);
        MI mi2 = (MI) ur.A0j();
        A0F(mi2.getImageCardView(), i10);
        if (((AbstractC1503b6) this).A01.get(i10) != null) {
            mi2.setTitle(((AbstractC1503b6) this).A01.get(i10).getAdHeadline());
            mi2.setSubtitle(((AbstractC1503b6) this).A01.get(i10).getAdLinkDescription());
            mi2.setButtonText(((AbstractC1503b6) this).A01.get(i10).getAdCallToAction());
        }
        V2 v22 = ((AbstractC1503b6) this).A01.get(i10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(mi2);
        v22.A1O(mi2, mi2, arrayList);
    }
}
