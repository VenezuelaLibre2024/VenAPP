package com.facebook.ads.redexgen.uinode;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.b6 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4477b6 extends AbstractC25184c<C4070UR> {
    public static final int A05 = (int) (AbstractC3499LD.A02 * 4.0f);
    public InterfaceC23081B A00;
    public final List<C4107V2> A01;
    public final int A02;
    public final C4337Yn A03;
    public final AbstractC3871RD A04 = new C4479b8(this);

    public AbstractC4477b6(C24323C c24323c, List<C4107V2> list, C4337Yn c4337Yn) {
        this.A03 = c4337Yn;
        this.A02 = c24323c.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i11 = this.A02;
        if (i10 == 0) {
            i11 *= 2;
        }
        marginLayoutParams.setMargins(i11, 0, i10 >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25184c
    public final int A0E() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i10) {
        C4107V2 c4107v2 = this.A01.get(i10);
        C3392JP adCoverImage = c4107v2.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC4034Tq A04 = new AsyncTaskC4034Tq(imageView, this.A03).A04();
            A04.A06(new C4478b7(this, i10, c4107v2));
            A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(InterfaceC23081B interfaceC23081B) {
        this.A00 = interfaceC23081B;
    }

    public void A0H(C4070UR c4070ur, int i10) {
        c4070ur.A0j().setLayoutParams(A02(i10));
    }
}
