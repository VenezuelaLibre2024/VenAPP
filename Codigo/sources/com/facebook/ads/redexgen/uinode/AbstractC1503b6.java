package com.facebook.ads.redexgen.uinode;

import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.b6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1503b6 extends AbstractC06534c<UR> {
    public static final int A05 = (int) (LD.A02 * 4.0f);
    public C1B A00;
    public final List<V2> A01;
    public final int A02;
    public final C1399Yn A03;
    public final RD A04 = new C1505b8(this);

    public AbstractC1503b6(C3C c3c, List<V2> list, C1399Yn c1399Yn) {
        this.A03 = c1399Yn;
        this.A02 = c3c.getChildSpacing();
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

    @Override // com.facebook.ads.redexgen.uinode.AbstractC06534c
    public final int A0E() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i10) {
        V2 v22 = this.A01.get(i10);
        JP adCoverImage = v22.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC1276Tq A04 = new AsyncTaskC1276Tq(imageView, this.A03).A04();
            A04.A06(new C1504b7(this, i10, v22));
            A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(C1B c1b) {
        this.A00 = c1b;
    }

    public void A0H(UR ur, int i10) {
        ur.A0j().setLayoutParams(A02(i10));
    }
}
