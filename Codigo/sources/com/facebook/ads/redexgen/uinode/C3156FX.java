package com.facebook.ads.redexgen.uinode;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.FX */
/* loaded from: assets/audience_network.dex */
public final class C3156FX extends AbstractC4477b6 {
    public final C4337Yn A00;
    public final C3394JR A01;

    public C3156FX(C4337Yn c4337Yn, C24323C c24323c, List<C4107V2> list, C3394JR c3394jr) {
        super(c24323c, list, c4337Yn);
        this.A00 = c4337Yn;
        this.A01 = c3394jr == null ? new C3394JR() : c3394jr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC25184c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C4070UR A0C(ViewGroup viewGroup, int i10) {
        return new C4070UR(new C3566MI(this.A00, this.A01));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25184c
    /* renamed from: A0H */
    public final void A0D(C4070UR c4070ur, int i10) {
        super.A0D(c4070ur, i10);
        C3566MI c3566mi = (C3566MI) c4070ur.A0j();
        A0F(c3566mi.getImageCardView(), i10);
        if (((AbstractC4477b6) this).A01.get(i10) != null) {
            c3566mi.setTitle(((AbstractC4477b6) this).A01.get(i10).getAdHeadline());
            c3566mi.setSubtitle(((AbstractC4477b6) this).A01.get(i10).getAdLinkDescription());
            c3566mi.setButtonText(((AbstractC4477b6) this).A01.get(i10).getAdCallToAction());
        }
        C4107V2 c4107v2 = ((AbstractC4477b6) this).A01.get(i10);
        ArrayList arrayList = new ArrayList();
        arrayList.add(c3566mi);
        c4107v2.A1O(c3566mi, c3566mi, arrayList);
    }
}
