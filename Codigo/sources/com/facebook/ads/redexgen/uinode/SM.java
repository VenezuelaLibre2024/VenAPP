package com.facebook.ads.redexgen.uinode;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SM extends AbstractC06534c<SK> {
    public final int A00;
    public final C1399Yn A01;
    public final ViewOnClickListenerC1271Tl A02;
    public final List<String> A03;

    public SM(C1399Yn c1399Yn, List<String> screenshotUrls, int i10, ViewOnClickListenerC1271Tl viewOnClickListenerC1271Tl) {
        this.A03 = screenshotUrls;
        this.A00 = i10;
        this.A01 = c1399Yn;
        this.A02 = viewOnClickListenerC1271Tl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC06534c
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final SK A0C(ViewGroup viewGroup, int i10) {
        SL sl2 = new SL(this.A01);
        if (C0988Ih.A12(this.A01)) {
            sl2.setOnClickListener(new Q6(this));
        }
        return new SK(sl2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC06534c
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A0D(SK sk2, int i10) {
        String str = this.A03.get(i10);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int leftMargin = this.A00;
        int i11 = leftMargin * 4;
        if (i10 == 0) {
            leftMargin = i11;
        }
        marginLayoutParams.setMargins(leftMargin, 0, i10 >= A0E() + (-1) ? this.A00 * 4 : this.A00, 0);
        sk2.A0j().setLayoutParams(marginLayoutParams);
        sk2.A0j().A00(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC06534c
    public final int A0E() {
        return this.A03.size();
    }
}
