package com.facebook.ads.redexgen.uinode;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.SM */
/* loaded from: assets/audience_network.dex */
public final class C3942SM extends AbstractC25184c<C3940SK> {
    public final int A00;
    public final C4337Yn A01;
    public final ViewOnClickListenerC4029Tl A02;
    public final List<String> A03;

    public C3942SM(C4337Yn c4337Yn, List<String> screenshotUrls, int i10, ViewOnClickListenerC4029Tl viewOnClickListenerC4029Tl) {
        this.A03 = screenshotUrls;
        this.A00 = i10;
        this.A01 = c4337Yn;
        this.A02 = viewOnClickListenerC4029Tl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC25184c
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C3940SK A0C(ViewGroup viewGroup, int i10) {
        C3941SL c3941sl = new C3941SL(this.A01);
        if (C3348Ih.A12(this.A01)) {
            c3941sl.setOnClickListener(new ViewOnClickListenerC3802Q6(this));
        }
        return new C3940SK(c3941sl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.uinode.AbstractC25184c
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A0D(C3940SK c3940sk, int i10) {
        String str = this.A03.get(i10);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int leftMargin = this.A00;
        int i11 = leftMargin * 4;
        if (i10 == 0) {
            leftMargin = i11;
        }
        marginLayoutParams.setMargins(leftMargin, 0, i10 >= A0E() + (-1) ? this.A00 * 4 : this.A00, 0);
        c3940sk.A0j().setLayoutParams(marginLayoutParams);
        c3940sk.A0j().A00(str);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25184c
    public final int A0E() {
        return this.A03.size();
    }
}
