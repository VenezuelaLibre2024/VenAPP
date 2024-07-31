package com.facebook.ads.redexgen.uinode;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.FW */
/* loaded from: assets/audience_network.dex */
public final class C3155FW extends AbstractC4477b6 {
    public final C4337Yn A00;

    public C3155FW(C24323C c24323c, List<C4107V2> list, C4337Yn c4337Yn) {
        super(c24323c, list, c4337Yn);
        this.A00 = c4337Yn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC25184c
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C4070UR A0C(ViewGroup viewGroup, int i10) {
        return new C4070UR(new C3571MN(this.A00));
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25184c
    /* renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public final void A0D(C4070UR c4070ur, int i10) {
        super.A0D(c4070ur, i10);
        C3571MN c3571mn = (C3571MN) c4070ur.A0j();
        C3583MZ imageView = (C3583MZ) c3571mn.getImageCardView();
        imageView.setImageDrawable(null);
        A0F(imageView, i10);
        C4107V2 childAd = ((AbstractC4477b6) this).A01.get(i10);
        childAd.A11().A0K(this.A00);
        childAd.A1N(c3571mn, c3571mn);
    }
}
