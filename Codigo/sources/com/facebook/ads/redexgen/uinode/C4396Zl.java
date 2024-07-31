package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zl */
/* loaded from: assets/audience_network.dex */
public class C4396Zl extends AbstractC25144Y {
    public C4396Zl(AbstractC25304o abstractC25304o) {
        super(abstractC25304o, null);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A06() {
        return this.A02.A0X();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A07() {
        return this.A02.A0X() - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A08() {
        return this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A09() {
        return this.A02.A0Y();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0A() {
        return this.A02.A0g();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0B() {
        return (this.A02.A0X() - this.A02.A0g()) - this.A02.A0d();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0C(View view) {
        return this.A02.A0j(view) + ((C25314p) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0D(View view) {
        C25314p c25314p = (C25314p) view.getLayoutParams();
        return this.A02.A0l(view) + c25314p.topMargin + c25314p.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0E(View view) {
        C25314p c25314p = (C25314p) view.getLayoutParams();
        return this.A02.A0m(view) + c25314p.leftMargin + c25314p.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0F(View view) {
        return this.A02.A0o(view) - ((C25314p) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.bottom;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.top;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final void A0J(int i10) {
        this.A02.A10(i10);
    }
}
