package com.facebook.ads.redexgen.uinode;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zm */
/* loaded from: assets/audience_network.dex */
public class C4397Zm extends AbstractC25144Y {
    public C4397Zm(AbstractC25304o abstractC25304o) {
        super(abstractC25304o, null);
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A06() {
        return this.A02.A0h();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A07() {
        return this.A02.A0h() - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A08() {
        return this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A09() {
        return this.A02.A0i();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0A() {
        return this.A02.A0e();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0B() {
        return (this.A02.A0h() - this.A02.A0e()) - this.A02.A0f();
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0C(View view) {
        return this.A02.A0n(view) + ((C25314p) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0D(View view) {
        C25314p c25314p = (C25314p) view.getLayoutParams();
        return this.A02.A0m(view) + c25314p.leftMargin + c25314p.rightMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0E(View view) {
        C25314p c25314p = (C25314p) view.getLayoutParams();
        return this.A02.A0l(view) + c25314p.topMargin + c25314p.bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0F(View view) {
        return this.A02.A0k(view) - ((C25314p) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0G(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.right;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final int A0H(View view) {
        this.A02.A1E(view, true, this.A01);
        return this.A01.left;
    }

    @Override // com.facebook.ads.redexgen.uinode.AbstractC25144Y
    public final void A0J(int i10) {
        this.A02.A0z(i10);
    }
}
